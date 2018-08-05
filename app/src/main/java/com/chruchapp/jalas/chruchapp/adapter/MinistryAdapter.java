package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.MinistryModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MinistryAdapter extends RecyclerView.Adapter<MinistryAdapter.MyViewHolder>
{

    List<MinistryModel> list;
    public MinistryAdapter(List<MinistryModel> list)
    {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.genderrec) TextView gender;
        @BindView(R.id.namerec) TextView name;
        @BindView(R.id.leaderrec) TextView leader;
        @BindView(R.id.maxmembersrec) TextView maxmember;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_ministry,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MinistryModel ministryModel = list.get(position);
        holder.name.setText(ministryModel.getMinistryName());
        holder.gender.setText(ministryModel.getGender());
        holder.leader.setText(ministryModel.getLeader());
        holder.maxmember.setText(String.valueOf(ministryModel.getMaxMembers()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
