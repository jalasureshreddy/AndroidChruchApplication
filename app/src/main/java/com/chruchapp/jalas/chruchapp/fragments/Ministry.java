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
import com.chruchapp.jalas.chruchapp.adapter.MinistryAdapter;
import com.chruchapp.jalas.chruchapp.data.MinistryModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Ministry extends Fragment {
    private Context context;
    private View v;
    private APIService mAPIService;
    private RecyclerView recyclerView;
    private MinistryAdapter adapter;
    private List<MinistryModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_ministry_screen, container, false);
        context = getActivity();
        mAPIService = ApiCall.getAPIService();
        recyclerView = v.findViewById(R.id.recycler_view);
        adapter = new MinistryAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        createApiCallRequest();
        return v;
    }

    private void createApiCallRequest() {

        mAPIService.doGetListMinistry().enqueue(new Callback<List<MinistryModel>>() {
            @Override
            public void onResponse(Call<List<MinistryModel>> call, Response<List<MinistryModel>> response) {
                list.addAll(response.body());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<MinistryModel>> call, Throwable t) {

            }
        });

    }
}
