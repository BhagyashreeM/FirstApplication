package com.example.tapti.firstapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Tapti on 02/09/16.
 */
public interface APIInterface {

@Headers("API_KEY:xsdfg5dgsfsafsafaf9fsdf25safafsuyrvvx")
    @GET("/api/v1/patients/symptoms")

    Call<List<Symptom>> getSymptoms();
}

