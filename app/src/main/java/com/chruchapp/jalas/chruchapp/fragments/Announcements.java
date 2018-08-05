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
import com.chruchapp.jalas.chruchapp.adapter.AnnouncementsAdapter;
import com.chruchapp.jalas.chruchapp.data.AnnouncementsModel;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Announcements extends Fragment {
    private Context context;
    private View v;

    private APIService mAPIService;
    private AnnouncementsAdapter announcementsAdapter;
    private List<AnnouncementsModel> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_announcements_screen, container, false);
        context = getActivity();

        mAPIService = ApiCall.getAPIService();
        recyclerView = v.findViewById(R.id.recycler_view);
        announcementsAdapter = new AnnouncementsAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(announcementsAdapter);

        createApiAnnouncements();

        return v;
    }

    private void createApiAnnouncements() {

        mAPIService.doGetListAnnouncements().enqueue(new Callback<List<AnnouncementsModel>>() {
            @Override
            public void onResponse(Call<List<AnnouncementsModel>> call, Response<List<AnnouncementsModel>> response) {
                list.addAll(response.body());
                announcementsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<AnnouncementsModel>> call, Throwable t) {

            }
        });
    }
}