package com.chruchapp.jalas.chruchapp.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.BranchesAdapter;
import com.chruchapp.jalas.chruchapp.data.BranchesModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BranchesScreen extends AppCompatActivity {

    private APIService mAPIService;

    private RecyclerView recyclerView;
    private BranchesAdapter branchesAdapter;
    List<BranchesModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches_screen);
        recyclerView  = findViewById(R.id.recycler_view);
        branchesAdapter  = new BranchesAdapter(list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(branchesAdapter);

        mAPIService = ApiCall.getAPIService();
        createApiRequestBranches();
    }

    private void createApiRequestBranches() {

        mAPIService.doGetListBranches().enqueue(new Callback<List<BranchesModel>>() {
            @Override
            public void onResponse(Call<List<BranchesModel>> call, Response<List<BranchesModel>> response) {
                list.addAll(response.body());
                branchesAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<BranchesModel>> call, Throwable t) {

            }
        });

    }

}
