package com.example.projectacara10.network;

import com.example.projectacara10.model.Data;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiService {
    @GET("3271")
    Call<List<Data>> getAllUsers();
}
