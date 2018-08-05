package com.chruchapp.jalas.chruchapp.screens;

import android.content.Intent;
import android.os.Handler;
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
import android.view.MenuItem;

import com.chruchapp.jalas.chruchapp.R;
import com.chruchapp.jalas.chruchapp.adapter.MyPagerAdapter;

import butterknife.ButterKnife;

public class LandingScreen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    static Toolbar toolbar;
    private TabLayout tab_bottom;
    public ViewPager viewPager;
    MyPagerAdapter pagerAdapterToolbarSearch;
    DrawerLayout drawer;
    static boolean  islogin = false;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landingscreen_navigation);
        ButterKnife.bind(this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

      //  toolbar.setTitleTextColor(R.color.white80);
       // tabs =  findViewById(R.id.tabs);
        tab_bottom = findViewById(R.id.tool);
      //  tab_bottom.setTabTextColors(R.color.black, R.color.white);
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_home_highlighted).setText("Home"));
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_event).setText("Events"));
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.ic_donate).setText("Donate"));
        tab_bottom.addTab(tab_bottom.newTab().setIcon(R.drawable.user).setText("Update"));

        tab_bottom.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab_bottom.getSelectedTabPosition() == 0)
                {
                    tab.setIcon(R.drawable.ic_home_highlighted);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_event);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_donate);
                    tab_bottom.getTabAt(3).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(0);

                }
                else if(tab_bottom.getSelectedTabPosition() == 1)
                {
                    //tab.setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(0).setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_event_highlighted);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_donate);
                    tab_bottom.getTabAt(3).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(4);
                   /* Intent intent = new Intent(LandingScreen.this,MainActivity.class);
                    tab.setIcon(R.drawable.ic_account_highlighted);
                    startActivity(intent);*/
                }
                else if(tab_bottom.getSelectedTabPosition() == 2)
                {
                    //tab.setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(0).setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_event);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_donate_higlight);
                    tab_bottom.getTabAt(3).setIcon(R.drawable.ic_account);
                    viewPager.setCurrentItem(7);
                    /*Intent intent = new Intent(LandingScreen.this,SignUpActivity.class);
                    startActivity(intent);*/
                }
                else if(tab_bottom.getSelectedTabPosition() == 3)
                {
                    //tab.setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(0).setIcon(R.drawable.ic_home);
                    tab_bottom.getTabAt(1).setIcon(R.drawable.ic_event);
                    tab_bottom.getTabAt(2).setIcon(R.drawable.ic_donate);
                    tab_bottom.getTabAt(3).setIcon(R.drawable.ic_account_highlighted);
                    viewPager.setCurrentItem(8);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });

        //tabs.setTabTextColors(Color.parseColor("#CCffffff"), Color.parseColor("#E12026"));
        viewPager =  findViewById(R.id.pager);
        pagerAdapterToolbarSearch = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterToolbarSearch);
        viewPager.setOffscreenPageLimit(9);


        //tabs.setupWithViewPager(viewPager);
         drawer =  findViewById(R.id.drawer_layout);
           ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
        // drawer.removeDrawerListener(toggle);
            toggle.syncState();
            navigationView = findViewById(R.id.nav_view);
           /* navigationView.getMenu().clear();
            navigationView.inflateMenu(R.menu.activity_main_drawer_login);*/


        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_home)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(0);
        }
        else if (id == R.id.nav_members)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(1);

        } else if (id == R.id.nav_groups)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(2);
        }
        else if (id == R.id.nav_ministry)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(3);
        }
        else if (id == R.id.nav_events)
        {
            tab_bottom.getTabAt(1).select();
            viewPager.setCurrentItem(4);
        }
        else if (id == R.id.nav_announcements)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(5);
        }
        else if (id == R.id.nav_sermons)
        {
            tab_bottom.getTabAt(0).select();
            viewPager.setCurrentItem(6);
        }
        else if (id == R.id.nav_payments){
            tab_bottom.getTabAt(2).select();
            viewPager.setCurrentItem(7);
        }
        else if (id == R.id.nav_logout)
        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(LandingScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            },200);
           /* viewPager.setCurrentItem(0);
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

}
