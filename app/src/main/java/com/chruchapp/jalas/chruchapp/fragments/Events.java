package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

public class Events extends Fragment {

    private Context context;
    private View v;
    private APIService mAPIService;
    private RecyclerView recyclerView;
    private EventsAdapter eventsAdapter;
    List<EventsModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.activity_events_screen, container, false);
        context = getActivity();
        mAPIService = ApiCall.getAPIService();
        mAPIService = ApiCall.getAPIService();
        recyclerView = v.findViewById(R.id.recycler_view);
        eventsAdapter = new EventsAdapter(list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(eventsAdapter);
        createApiRequest();

        return v;
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
