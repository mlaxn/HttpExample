package com.java.example;

import com.example.model.OpcoList;
import com.example.model.Response;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParse {


    /**
     * Convert jsonArray into java class using com.google.gson
     * @param responseBody
     * @return Response[] as the array of Response object
     */
    public static Response[] ParseGson(String responseBody){

        Gson gson = new Gson();
        Response[] responseList = gson.fromJson(responseBody, Response[].class);

//        for(Response response : responseList) {
//            System.out.println(response);
//        }

        return responseList;
    }

    public static OpcoList ParsoGsonMemberArray(String responseBody){
        Gson gson = new Gson();
        OpcoList opcoList = gson.fromJson(responseBody,OpcoList.class);
        System.out.println("OpcoList:"+opcoList);

        return opcoList;

    }
}
