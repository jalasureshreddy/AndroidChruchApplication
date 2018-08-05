package com.chruchapp.jalas.chruchapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.net.ConnectivityManager.TYPE_WIFI;

public class CommonUtils {


    public static boolean isDeviceConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if (activeNetwork.getType() == TYPE_WIFI)
                return true;

            if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return true;
        }
        return false;
    }

    public static  String dateTimeToSring(String dateTime)
    {
        DateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date dtIn = new Date();
        try {
            dtIn = inFormat.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dtIn.toString();
    }
}
