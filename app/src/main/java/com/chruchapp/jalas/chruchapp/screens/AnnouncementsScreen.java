package com.chruchapp.jalas.chruchapp.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

public class AnnouncementsScreen extends AppCompatActivity {

    private APIService mAPIService;

    private AnnouncementsAdapter announcementsAdapter;
    private List<AnnouncementsModel> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements_screen);
        mAPIService = ApiCall.getAPIService();
        recyclerView = findViewById(R.id.recycler_view);
        announcementsAdapter = new AnnouncementsAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(announcementsAdapter);
        createApiAnnouncements();
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
