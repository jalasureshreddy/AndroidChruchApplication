package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.BranchesModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BranchesAdapter extends RecyclerView.Adapter<BranchesAdapter.MyViewHolder>
{

    List<BranchesModel> list;

    public BranchesAdapter(List<BranchesModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id) TextView id;
        @BindView(R.id.chruchid) TextView chruchid;
        @BindView(R.id.branchname) TextView branchname;
        @BindView(R.id.address) TextView address;
        @BindView(R.id.city) TextView city;
        @BindView(R.id.contactnumber) TextView contactnumber;
        @BindView(R.id.emailAddress) TextView emailaddress;
        @BindView(R.id.website) TextView website;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_branches,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            BranchesModel branchesModel = list.get(position);
            holder.id.setText(String.valueOf(branchesModel.getId()));
            holder.chruchid.setText(String.valueOf(branchesModel.getChurchId()));
            holder.branchname.setText(branchesModel.getBranchName());
            holder.address.setText(branchesModel.getAddress());
            holder.city.setText(branchesModel.getCity());
            holder.contactnumber.setText(branchesModel.getContactNumber());
            holder.emailaddress.setText(branchesModel.getEmailAddress());
            holder.website.setText(branchesModel.getWebsite());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
