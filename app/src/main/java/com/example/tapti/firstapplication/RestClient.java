package com.example.tapti.firstapplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tapti on 02/09/16.
 */
public class RestClient {
    public static final String API_BASE_URL = "http://acceptance.rovnost.in";
    public static  APIInterface api;

    public static APIInterface getApi() {
        return api;
    }

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//   static Gson gson = new GsonBuilder()
//            .setLenient()
//            .create();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());
    static {
        Retrofit retrofit = builder.client(httpClient.build()).build();
         api =retrofit.create(APIInterface.class);
    }
    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}
