package com.example.user.register;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView Search_Result;

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private int[] icons = {
            R.drawable.ic_home_black_24dp,
            R.drawable.ic_apps_black_24dp,
            R.drawable.ic_explore_black_24dp,
            R.drawable.ic_account_circle_black_24dp
    };

    private ProgressBar progressBar;
    private boolean onSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        changeStatusBarColor();
        setupViewPager(viewPager);
        setupTabIcon();
        onSearchView = false;
        setupRvKategoriList();
    }

    private void setupRvKategoriList() {
        progressBar = findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }


    private void setupTabIcon() {
        // Setup tab Home
        TextView titleHome = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tabs, null);
        titleHome.setText("Home");
        titleHome.setCompoundDrawablesWithIntrinsicBounds(0, icons[0], 0, 0);
        tabLayout.getTabAt(0).setCustomView(titleHome);

        // Setup tab Apps
        TextView titleApps = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tabs, null);
        titleApps.setText("Apps");
        titleApps.setCompoundDrawablesWithIntrinsicBounds(0, icons[1], 0, 0);
        tabLayout.getTabAt(1).setCustomView(titleApps);

        // Setup tab Feed
        TextView titleFeed = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tabs, null);
        titleFeed.setText("Feed");
        titleFeed.setCompoundDrawablesWithIntrinsicBounds(0, icons[2], 0, 0);
        tabLayout.getTabAt(2).setCustomView(titleFeed);

        // Setup tab Account
        TextView titleAccount = (TextView) LayoutInflater.from(this).inflate(R.layout.layout_custom_tabs, null);
        titleAccount.setText("Account");
        titleAccount.setCompoundDrawablesWithIntrinsicBounds(0, icons[3], 0, 0);
        tabLayout.getTabAt(3).setCustomView(titleAccount);
    }

    private void setupViewPager(ViewPager viewPager) {
        HomeAdapter vpHomeAdapter = new HomeAdapter(getSupportFragmentManager());
        vpHomeAdapter.addFrag(new HomeFragment());
        vpHomeAdapter.addFrag(new AppsFragment());
        vpHomeAdapter.addFrag(new FeedFragment());
        vpHomeAdapter.addFrag(new AccountFragment());
        viewPager.setAdapter(vpHomeAdapter);
    }

    private void initView() {
        //id buat query pencarian
        Search_Result = findViewById(R.id.tv_search_result);
        viewPager = findViewById(R.id.vp_home);
        tabLayout = findViewById(R.id.tabs);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Apps");
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
