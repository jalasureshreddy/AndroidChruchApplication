package com.chruchapp.jalas.chruchapp.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.EventsAdapter;
import com.chruchapp.jalas.chruchapp.data.EventsModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventsScreen extends AppCompatActivity {

    private APIService mAPIService;
    private RecyclerView recyclerView;
    private EventsAdapter eventsAdapter;
    List<EventsModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_screen);

        mAPIService = ApiCall.getAPIService();
        recyclerView = findViewById(R.id.recycler_view);
        eventsAdapter = new EventsAdapter(list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(eventsAdapter);
        createApiRequest();


    }

    private void createApiRequest() {

        mAPIService.doGetListEvents().enqueue(new Callback<List<EventsModel>>() {
            @Override
            public void onResponse(Call<List<EventsModel>> call, Response<List<EventsModel>> response) {
                list.addAll(response.body());
                eventsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<EventsModel>> call, Throwable t) {

            }
        });

    }
}
