package com.java.example;

import com.example.model.OpcoDetail;
import com.example.model.OpcoList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
@author Milan Biswakarma
implements two method to make the HTTP call
* */
public class HttpMethod {

    private static HttpURLConnection connection;
    private static final String GET_URL = "https://jsonplaceholder.typicode.com/posts";
    
    /**Method 1:
     * Http Call using java.net.HttpURLConnection
     * Converts the json into java -> GSON
     */
    public void javaNetHttpUrlConection(){
        System.out.println("Method 1: java.net.HttpURLConnection");

        //to read the input stream response from the http
        BufferedReader reader;
        String line;
        //to store the string input from the buffer http
        StringBuffer responseContent = new StringBuffer();

        try{
            URL url = new URL(GET_URL);
            connection=(HttpURLConnection)url.openConnection();

            //request setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(50000);

            int status = connection.getResponseCode();
            System.out.println(status);

            if(status == HttpURLConnection.HTTP_OK){
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
            else{
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
            //System.out.println("Http Respone (string): \n" + responseContent.toString());
            System.out.println();

            /*
            Method A: Convert json to java - using java object
                     - uses jsonPlaceHolder Get Response
             */
//            List<Response> responses = Arrays.asList(JsonParse.ParseGson(responseContent.toString()));
//            for(Response response : responses) {
//                System.out.println(response);
//            }

            /*Method B: com.google.Gson
             Using opcolist data
             */
            OpcoList opcoList = JsonParse.ParsoGsonMemberArray(responseContent.toString());

        }
        catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }

    }

    /**
     * implementing HTTP call using java.net.httpClient
     * only available in Java 11
     * operates Asynchrously without impacting the main thread
     *
     * Converts json into java -> jsonArray & jsonObject
     */
    public void javaNetHttpClient(){
        System.out.println("Method 2: java.net.HttpClient");

        //Create a http client
        HttpClient client = HttpClient.newHttpClient();
        //build http request from the URL
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(GET_URL)).build();

        //send the request asynchoronus with the client, async method returns completableFuture dataType
        //theApply - means once the asyn is done we want to apply the method to previous result
        //join - simply returns the result in the screen
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                //.thenAccept(System.out::println)
                .thenApply(com.java.example.JsonParse::ParseGson)
                .join();
    }

}

