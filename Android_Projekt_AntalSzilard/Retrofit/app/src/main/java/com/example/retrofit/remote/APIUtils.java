package com.example.retrofit.remote;

public class APIUtils {
    private APIUtils() {
    }

    public static final String API_URL = "http://192.168.100.39:8080/";
    public static WorkService getWorkService(){
        return RetrofitClient.getClient(API_URL).create(WorkService.class);
    }
}
