package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.MembersModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.MyViewHolder>{

    List<MembersModel> list;

    public MembersAdapter(List<MembersModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        /*@BindView(R.id.namerec) TextView name;
        @BindView(R.id.knownasrec) TextView knownas;
        @BindView(R.id.emailrec) TextView email;
        @BindView(R.id.mobilenumberrec) TextView mobilenumber;
        @BindView(R.id.addressrec) TextView address;
        @BindView(R.id.professionrec) TextView profession;*/

        @BindView(R.id.name) TextView name;
        @BindView(R.id.date) TextView date;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_members,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MembersModel membersModel = list.get(position);
        String name = "Name : "+membersModel.getName();
        String date = "Date : "+membersModel.getDtCreated();
        holder.name.setText(name);
        holder.date.setText(date);
       /* holder.name.setText(membersModel.getName());
        holder.knownas.setText(membersModel.getKnownAs());
        holder.email.setText(membersModel.getEmailAddress());
        holder.mobilenumber.setText(membersModel.getMobileNumber());
        holder.address.setText(membersModel.getAddress());
        holder.profession.setText(membersModel.getPassword());*/
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
