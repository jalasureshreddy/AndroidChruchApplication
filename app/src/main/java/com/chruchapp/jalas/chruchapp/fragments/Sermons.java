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
import com.chruchapp.jalas.chruchapp.adapter.SermonsAdapter;
import com.chruchapp.jalas.chruchapp.data.SermonsModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sermons extends Fragment {
    private Context context;
    private View v;
    private APIService mAPIService;
    private RecyclerView recyclerView;
    private SermonsAdapter sermonsAdapter;
    List<SermonsModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_sermons_screen, container, false);
        context = getActivity();
        recyclerView = v.findViewById(R.id.recycler_view);
        sermonsAdapter = new SermonsAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sermonsAdapter);
        mAPIService = ApiCall.getAPIService();
        createApiSermons();
        return v;
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
