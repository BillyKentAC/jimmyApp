package com.software.miedo.jimmyapp;

import android.arch.lifecycle.ViewModel;
import android.util.Log;
import android.widget.Adapter;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.software.miedo.jimmyapp.data.RestClient;
import com.software.miedo.jimmyapp.model.Item;
import com.software.miedo.jimmyapp.model.Mensaje;
import com.software.miedo.jimmyapp.model.Noticia;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsViewModel extends ViewModel {

    public static final String TAG = NewsViewModel.class.getSimpleName();

    final static String URL_BASE = "http://192.168.1.5:8080/site/api/";

    private List<Noticia> mData;


    public NewsViewModel() {
        mData= new ArrayList<>();
        // datos fake
        //loadJSON();
    }

    public List<Noticia> getmData() {
        return mData;
    }

    /*private void loadJSON() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestClient restClient = retrofit.create(RestClient.class);
        Call<Mensaje> call = restClient.getMensaje();
        call.enqueue(new Callback<Mensaje>() {
            @Override
            public void onResponse(Call<Mensaje> call, Response<Mensaje> response) {
                System.out.println(response.toString());
                System.out.println(response.body().getItems().get(1).getName());
                for (Item item : response.body().getItems()) {
                    items.add(item);
                }

                Log.i(TAG, "Respuesta : "+response.code());
            }

            @Override
            public void onFailure(Call<Mensaje> call, Throwable t) {
                t.printStackTrace();
                Log.e(TAG, t.getMessage());
                Log.i(TAG, "Error en la recepcion del mensaje");
            }
        });
    }*/


}
