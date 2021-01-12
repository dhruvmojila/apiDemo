package com.example.apidemo;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {
    private static Retrofit retroFit;
    private static final String BaseUrl = "https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetroFit() {
        if (retroFit == null){
            retroFit = new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retroFit;
    }
}
