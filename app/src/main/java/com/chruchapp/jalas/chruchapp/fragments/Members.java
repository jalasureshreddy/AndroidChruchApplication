package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.MembersAdapter;
import com.chruchapp.jalas.chruchapp.data.MembersModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.screens.LandingScreen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Members extends Fragment
{
    private Context context;
    private View v;
    private APIService mAPIService;
    private MembersAdapter membersAdapter;
    private List<MembersModel> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_members_screen, container, false);
        context = getActivity();
      //  Toolbar toolbar1 =  getActivity().findViewById(R.id.toolbar);
       // toolbar1.setTitle("Members");
        // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Members");
        mAPIService = ApiCall.getAPIService();
        recyclerView = v.findViewById(R.id.recycler_view);
        membersAdapter = new MembersAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(membersAdapter);
        createApiMembers();
        return v;
    }


    private void createApiMembers() {

        mAPIService.doGetListAccount().enqueue(new Callback<List<MembersModel>>() {
            @Override
            public void onResponse(Call<List<MembersModel>> call, Response<List<MembersModel>> response) {

                list.addAll(response.body());
                membersAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<MembersModel>> call, Throwable t) {

            }
        });
    }
}
