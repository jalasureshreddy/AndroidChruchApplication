package com.chruchapp.jalas.chruchapp.screens;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.MinistryAdapter;
import com.chruchapp.jalas.chruchapp.data.MinistryModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MinistryScreen extends AppCompatActivity {

    private APIService mAPIService;
    private RecyclerView recyclerView;
    private MinistryAdapter adapter;
    private List<MinistryModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministry_screen);
        mAPIService = ApiCall.getAPIService();

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MinistryAdapter(list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        createApiCallRequest();
    }

    private void createApiCallRequest() {

        mAPIService.doGetListMinistry().enqueue(new Callback<List<MinistryModel>>() {
            @Override
            public void onResponse(Call<List<MinistryModel>> call,  Response<List<MinistryModel>> response) {
                    list.addAll(response.body());
                    adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<MinistryModel>> call, Throwable t) {

            }
        });

    }
}
