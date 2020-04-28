package com.java.example;

public class HttpApplication {
    public static void main(String[] args){
        System.out.println("Http Example Application Started");

        //Create an instance of the class or @Autowire
        HttpMethod http = new HttpMethod();
        http.javaNetHttpUrlConection();

        //http.javaNetHttpClient();

    }
}
//TODO

/**
 * Implement the parsing using gson
 * use the response class to store the result
 * push it into the personal repo git
 * also add rest template to call an endpoint.
 *
 */