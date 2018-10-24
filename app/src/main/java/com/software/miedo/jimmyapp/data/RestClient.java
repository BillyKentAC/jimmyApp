package com.software.miedo.jimmyapp.data;

import com.software.miedo.jimmyapp.model.Mensaje;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestClient {
    @GET("documents")
    Call<Mensaje> getMensaje();

}