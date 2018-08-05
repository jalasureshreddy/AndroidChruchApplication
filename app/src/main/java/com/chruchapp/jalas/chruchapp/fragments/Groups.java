package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.CellGroupAdapter;
import com.chruchapp.jalas.chruchapp.data.CellGroupModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.screens.LandingScreen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Groups extends Fragment {
    private Context context;
    private View v;

    private APIService mAPIService;
    private CellGroupAdapter cellGroupAdapter;
    private List<CellGroupModel> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_groups_screen, container, false);
        context = getActivity();

       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Groups");
      //  Toolbar toolbar =  v.findViewById(R.id.toolbar);
       // AppCompatActivity activity = (AppCompatActivity) getActivity();
        //activity.setSupportActionBar(toolbar);

        mAPIService = ApiCall.getAPIService();
        recyclerView = v.findViewById(R.id.recycler_view);
        cellGroupAdapter = new CellGroupAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(cellGroupAdapter);
        recyclerView.setNestedScrollingEnabled(false);

        createApiCellGroups();
        return v;
    }

    private void createApiCellGroups()
    {
        mAPIService.doGetListCellGroup().enqueue(new Callback<List<CellGroupModel>>() {
            @Override
            public void onResponse(Call<List<CellGroupModel>> call, Response<List<CellGroupModel>> response) {

                list.addAll(response.body());
                cellGroupAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<CellGroupModel>> call, Throwable t) {

            }
        });

    }
}