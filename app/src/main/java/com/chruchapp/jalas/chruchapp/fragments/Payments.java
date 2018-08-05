package com.chruchapp.jalas.chruchapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chruchapp.jalas.chruchapp.R;

public class Payments extends Fragment
{
    private Context context;
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_donation, container, false);
        context = getActivity();
        return v;
    }
}
