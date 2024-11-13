package com.example.projectacara10.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static ApiService getInstance(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor).build();
        Retrofit builder = new Retrofit.Builder()
                .baseUrl("https://inarisk2.bnpb.go.id/api/siagamasyarakat/get-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(mOkHttpClient)
                .build();
        return builder.create(ApiService.class);
    }
}