package com.example.challenge16mar.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class CustomViewPager extends FragmentPagerAdapter {
    private ArrayList<Fragment> mfragmentlist;
    private ArrayList<String> mNameList;

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentlist.size();
    }

    public CustomViewPager(@NonNull FragmentManager fm) {
        super(fm);
        mfragmentlist = new ArrayList<>();
        mNameList = new ArrayList<>();
    }
    public void addfragment(Fragment fragment, String name){
        mfragmentlist.add(fragment);
        mNameList.add(name);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mNameList.get(position);
    }
}
