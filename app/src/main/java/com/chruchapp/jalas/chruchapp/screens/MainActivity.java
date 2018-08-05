package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.MyPagerAdapterLogin;
import com.chruchapp.jalas.chruchapp.data.DataModelLogin;
import com.chruchapp.jalas.chruchapp.network.APIService;
import com.chruchapp.jalas.chruchapp.network.ApiCall;
import com.chruchapp.jalas.chruchapp.utils.Constant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

   /* @BindView(R.id.user)
    EditText user;
    @BindView(R.id.pass)
    EditText pass;
    @BindView(R.id.login)
    TextView login;*/
   /* @BindView(R.id.signup)
    TextView signup;*/

    /*String userName;
    String password;

    private APIService mAPIService;*/
    Toolbar toolbar;
    private TabLayout tab_bottom;
    public ViewPager viewPager;
    MyPagerAdapterLogin pagerAdapterToolbarSearch;
    DrawerLayout drawer;
    static boolean  islogin = false;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tab_bottom = findViewById(R.id.tool);
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_home_highlighted).setText("Home"));
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_account).setText("SignIn"));
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_account).setText("Register"));

        tab_bottom.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab_bottom.getSelectedTabPosition() == 0)
                {
                    tab.setIcon(R.drawable.ic_home_highlighted);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_account);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(0);
                }
                else if(tab_bottom.getSelectedTabPosition() == 1)
                {
                    tab_bottom.getTabAt(0).setIcon(R.drawable.ic_home);
                    tab.setIcon(R.drawable.ic_account_highlighted);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(1);
                }
                else if(tab_bottom.getSelectedTabPosition() == 2)
                {
                    tab_bottom.getTabAt(0).setIcon(R.drawable.ic_home);
                    tab.setIcon(R.drawable.ic_account_highlighted);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(2);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager =  findViewById(R.id.pager);
        pagerAdapterToolbarSearch = new MyPagerAdapterLogin(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterToolbarSearch);
        viewPager.setOffscreenPageLimit(4);

        drawer =  findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        // drawer.removeDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
       /* Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
        user.setTypeface(custom_font);
        pass.setTypeface(custom_font);
        mAPIService = ApiCall.getAPIService();
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");
        login.setTypeface(custom_font1);*/
      //  signup.setTypeface(custom_font);


    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_home)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(0);
        }
        else if( id == R.id.nav_register)
        {
            tab_bottom.getTabAt(2).select();
            viewPager.setCurrentItem(2);
        }
        else if(id == R.id.nav_signin)
        {
            tab_bottom.getTabAt(1).select();
            viewPager.setCurrentItem(1);
        }
        else if (id == R.id.nav_logout)
        {
            /*viewPager.setCurrentItem(0);
            islogin = false;
            navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_main_drawer);*/
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@OnClick(R.id.signup)
    public void signUp()
    {
        Intent it = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(it);
    }*/
   /* @OnClick(R.id.login)
    public void login()
    {
        userName = user.getText().toString();
        password = pass.getText().toString();
        createApiCall(userName,password);
        //createApiCallTest(userName,password);

    }*/

   /* private void createApiCall(String userName, String password) {

        mAPIService.login(userName,password).enqueue(new retrofit2.Callback<DataModelLogin>() {
            @Override
            public void onResponse(retrofit2.Call<DataModelLogin> call, retrofit2.Response<DataModelLogin> response) {

                if(response.isSuccessful()) {
                    System.out.println("response ===== "+response.message());
                    if(response.message().equalsIgnoreCase("OK")) {
                       *//* Intent intent = new Intent(MainActivity.this, EditProfile.class);
                        intent.putExtra("DataModelLogin", response.body());
                        startActivity(intent);*//*
                        Intent intent = new Intent(MainActivity.this, LandingScreen.class);
                       // intent.putExtra("DataModelLogin", response.body());
                        LandingScreen.islogin = true;
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Wrong Credentials...",Toast.LENGTH_LONG).show();
                    }

                }
            }

            @Override
            public void onFailure(retrofit2.Call<DataModelLogin> call, Throwable t) {
                Log.e("Suresh", "Unable to submit post to API.");
            }
        });
    }*/
    }
