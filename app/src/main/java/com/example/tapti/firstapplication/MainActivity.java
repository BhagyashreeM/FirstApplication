package com.example.tapti.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }
    void loadJSON(){

        Call<List<Symptom>> call = RestClient.getApi().getSymptoms();
        call.enqueue(new Callback<List<Symptom>>() {
            @Override
            public void onResponse(Call<List<Symptom>> call1, Response<List<Symptom>> response) {
              Log.d("response.body()",response.body().toString());
                DataAdapter dataAdapter = new DataAdapter(response.body(),MainActivity.this);
                recyclerView.setAdapter(dataAdapter);
            }

            @Override
            public void onFailure(Call<List<Symptom>> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
}
}
