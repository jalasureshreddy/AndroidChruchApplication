package com.chruchapp.jalas.chruchapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chruchapp.jalas.chruchapp.fragments.Home;
import com.chruchapp.jalas.chruchapp.fragments.Login;
import com.chruchapp.jalas.chruchapp.fragments.Register;

public class MyPagerAdapterLogin extends FragmentPagerAdapter {
    public MyPagerAdapterLogin(FragmentManager fm) {
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
                f = new Login();
                break;
            case 2:
                f = new Register();
                break;
           /* case 1:
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
                break;*/
        }
        return f;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
