package com.chruchapp.jalas.chruchapp.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.SermonsAdapter;
import com.chruchapp.jalas.chruchapp.data.SermonsModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SermonsScreen extends AppCompatActivity {

    private APIService mAPIService;
    private RecyclerView recyclerView;
    private SermonsAdapter sermonsAdapter;
    List<SermonsModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sermons_screen);
        recyclerView = findViewById(R.id.recycler_view);
        sermonsAdapter = new SermonsAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sermonsAdapter);

        mAPIService = ApiCall.getAPIService();
        createApiSermons();
    }

    private void createApiSermons() {
        mAPIService.doGetListSermons().enqueue(new Callback<List<SermonsModel>>() {
            @Override
            public void onResponse(Call<List<SermonsModel>> call, Response<List<SermonsModel>> response) {

                list.addAll(response.body());
                sermonsAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<SermonsModel>> call, Throwable t) {

            }
        });


    }
}
