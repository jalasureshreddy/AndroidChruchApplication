package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.AnnouncementsModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AnnouncementsAdapter extends RecyclerView.Adapter<AnnouncementsAdapter.MyViewHolder> {

    List<AnnouncementsModel> list;

    public AnnouncementsAdapter(List<AnnouncementsModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.namerec) TextView name;
        @BindView(R.id.description) TextView description;
        @BindView(R.id.published) TextView published;
        @BindView(R.id.datecreatedrec) TextView datecreated;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_announcements,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        AnnouncementsModel announcementsModel = list.get(position);
        holder.name.setText(announcementsModel.getName());
        holder.description.setText(announcementsModel.getDescription());
        holder.published.setText(String.valueOf(announcementsModel.isPublished()));
        holder.datecreated.setText(announcementsModel.getDtCreaated());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
