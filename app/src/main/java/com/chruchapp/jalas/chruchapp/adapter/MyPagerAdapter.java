package com.chruchapp.jalas.chruchapp.adapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chruchapp.jalas.chruchapp.fragments.Announcements;
import com.chruchapp.jalas.chruchapp.fragments.EditProfileFragment;
import com.chruchapp.jalas.chruchapp.fragments.Events;
import com.chruchapp.jalas.chruchapp.fragments.Groups;
import com.chruchapp.jalas.chruchapp.fragments.Home;
import com.chruchapp.jalas.chruchapp.fragments.Members;
import com.chruchapp.jalas.chruchapp.fragments.Ministry;
import com.chruchapp.jalas.chruchapp.fragments.Payments;
import com.chruchapp.jalas.chruchapp.fragments.Sermons;

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private Fragment f = null;

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                f = new Home();
                break;
            case 1:
                f = new Members();
                break;
            case 2:
                f = new Groups();
                break;
            case 3:
                f = new Ministry();
                break;
            case 4:
                f = new Events();
                break;
            case 5:
                f = new Announcements();
                break;
            case 6:
                f = new Sermons();
                break;
            case 7:
                f = new Payments();
                break;
            case 8:
                f = new EditProfileFragment();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return 9;
    }




   /* @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Home";
        }
        if (position == 1) {
            return "Members";
        }
        if (position == 2) {
            return "Groups";
        }
        if (position == 3) {
            return "Ministry";
        }
        if (position == 4) {
            return "Events";
        }
        if (position == 5) {
            return "Announcements";
        }
        if (position == 6) {
            return "Sermons";
        }
        if (position == 7) {
            return "Payments";
        }
        return super.getPageTitle(position);
    }*/
}
