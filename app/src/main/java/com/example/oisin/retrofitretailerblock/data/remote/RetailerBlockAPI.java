package com.example.oisin.retrofitretailerblock.data.remote;

import com.example.oisin.retrofitretailerblock.data.model.RetailerBlock;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public interface RetailerBlockAPI {


    String BASE_URL = "http://192.168.0.151:8080/";

    @GET("RetailerBlock/1/5")
    Call<RetailerBlock> getRetailerBlock();

    class Factory {
        private static RetailerBlockAPI service;

        public static RetailerBlockAPI getInstance() {

            if(service == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL).build();
                service = retrofit.create(RetailerBlockAPI.class);
                return service;
            } else {
                return service;
            }
        }
    }
}
