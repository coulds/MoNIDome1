package com.example.monidome1.Adaputer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends FragmentPagerAdapter {
//    private String[] mTitles;
    private ArrayList<String> mTitles;
    private ArrayList<Fragment> mFragments;
//    public HomeAdapter(FragmentManager fm, String[] titles, ArrayList<Fragment> fragments) {
//        super(fm);
//        this.mTitles = titles;
//        this.mFragments = fragments;
//    }
    public HomeAdapter(FragmentManager fm, List<String> mTitles, List<Fragment> fragments) {
        super(fm);
        this.mTitles = (ArrayList<String>) mTitles;
        this.mFragments = (ArrayList<Fragment>) fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return mTitles[position];
//    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
