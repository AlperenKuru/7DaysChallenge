package com.example.challenge16mar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.challenge16mar.adapter.CustomViewPager;
import com.example.challenge16mar.fragments.CallFragment;
import com.example.challenge16mar.fragments.JsonFragment;
import com.example.challenge16mar.fragments.ListFragment;
import com.example.challenge16mar.fragments.LocationFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager mviewpager;
    private TabLayout mTablayout;
    private CustomViewPager mAdapter;


    private void init(){
        mviewpager = findViewById(R.id.main_activity_viewPager);
        mTablayout = findViewById(R.id.main_activity_tablayout);

        mAdapter = new CustomViewPager(getSupportFragmentManager());
        mAdapter.addfragment(new JsonFragment(), "Json");
        mAdapter.addfragment(new ListFragment(),"List");
        mAdapter.addfragment(new LocationFragment(),"Location");
        mAdapter.addfragment(new CallFragment(),"Call");


        mviewpager.setAdapter(mAdapter);
        mTablayout.setupWithViewPager(mviewpager);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

}







