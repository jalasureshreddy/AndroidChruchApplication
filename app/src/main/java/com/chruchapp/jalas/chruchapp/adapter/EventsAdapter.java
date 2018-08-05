package com.chruchapp.jalas.chruchapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.data.EventsModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.MyViewHolder> {

    List<EventsModel> list;

    public EventsAdapter(List<EventsModel> list) {
        this.list = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.eventtext) TextView eventName;
        @BindView(R.id.desidtext) TextView desid;
        @BindView(R.id.venuetext) TextView venue;
        @BindView(R.id.Regmounttext) TextView regmount;
        @BindView(R.id.eventspeaker) TextView eventsspeaker;
        @BindView(R.id.target) TextView target;
        @BindView(R.id.hosting) TextView hosting;
        @BindView(R.id.keynotespeaker) TextView keynotespeaker;
        @BindView(R.id.dateofevent) TextView dateofevent;
        @BindView(R.id.lastdatereg) TextView lastdatereg;
        @BindView(R.id.published) TextView published;


        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_events,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        EventsModel eventsModel = list.get(position);
        holder.desid.setText(eventsModel.getDescription());
        holder.eventName.setText(eventsModel.getEventName());
        holder.venue.setText(eventsModel.getVenue());
        holder.regmount.setText(String.valueOf(eventsModel.getRegistrationAmount()));
        holder.eventsspeaker.setText(eventsModel.getEventSpeakers());
        holder.target.setText(eventsModel.getTargetAudience());
        holder.hosting.setText(eventsModel.getHostingDepartment());
        holder.keynotespeaker.setText(eventsModel.getKeyNoteSpeaker());
        holder.dateofevent.setText(eventsModel.getEventDate());
        holder.lastdatereg.setText(eventsModel.getLastDateForRegistration());
        holder.published.setText(String.valueOf(eventsModel.isPublished()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
