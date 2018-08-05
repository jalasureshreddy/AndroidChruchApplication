package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.SermonsModel;
import com.chruchapp.jalas.chruchapp.utils.CommonUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SermonsAdapter extends RecyclerView.Adapter<SermonsAdapter.MyViewHolder>
{
    List<SermonsModel> list;

    public SermonsAdapter(List<SermonsModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.sermoname) TextView sermon;
        @BindView(R.id.description) TextView des;
        @BindView(R.id.videofile) TextView video;
        @BindView(R.id.speaker) TextView speaker;
        @BindView(R.id.dateofevent) TextView dateofevent;
        @BindView(R.id.datecreated) TextView datecreated;
        @BindView(R.id.published) TextView published;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_sermons,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        SermonsModel sermonsModel = list.get(position);

        holder.sermon.setText(sermonsModel.getSermonname());
        holder.des.setText(sermonsModel.getDescription());
        holder.video.setText(sermonsModel.getVideoFile());
        holder.speaker.setText(sermonsModel.getSpeaker());
        holder.dateofevent.setText(sermonsModel.getDateOfEvent());
        holder.datecreated.setText(sermonsModel.getDtCreated());
        holder.published.setText(String.valueOf(sermonsModel.isPublished()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
