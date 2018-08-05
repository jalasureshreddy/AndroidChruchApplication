package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.CellGroupModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CellGroupAdapter extends RecyclerView.Adapter<CellGroupAdapter.MyViewHolder> {

    List<CellGroupModel> list;

    public CellGroupAdapter(List<CellGroupModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        /*@BindView(R.id.groupnamerec)TextView groupName;
        @BindView(R.id.addressrec)TextView address;
        @BindView(R.id.leaderrec)TextView leader;
        @BindView(R.id.memberslimitrec)TextView memberslimit;
        @BindView(R.id.isactiverec)TextView isactive;
        @BindView(R.id.createdonrec)TextView createdon;
        @BindView(R.id.updatedonrec)TextView updatedon;
        @BindView(R.id.churchuserrec)TextView churchusers;*/

        @BindView(R.id.groupname)TextView groupName;
        @BindView(R.id.date)TextView createdon;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_cellgroups,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        CellGroupModel cellGroupModel = list.get(position);

       /* holder.groupName.setText(cellGroupModel.getGroupname());
        holder.address.setText(cellGroupModel.getAddress());
        holder.leader.setText(cellGroupModel.getLeader());
        holder.memberslimit.setText(String.valueOf(cellGroupModel.getMembersLimit()));
        holder.isactive.setText(String.valueOf(cellGroupModel.isIsActive()));
        holder.createdon.setText(cellGroupModel.getCreatedOn());
        holder.updatedon.setText(cellGroupModel.getUpdatedOn());
        holder.churchusers.setText(String.valueOf(cellGroupModel.getChurchUsers()));*/

        String groupname = "GroupName : "+cellGroupModel.getGroupname();
        String groupcreated = "CreatedOn : "+cellGroupModel.getCreatedOn();

        holder.groupName.setText(groupname);
        holder.createdon.setText(groupcreated);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
