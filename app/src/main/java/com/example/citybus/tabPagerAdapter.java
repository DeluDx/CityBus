package com.example.citybus;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class tabPagerAdapter extends FragmentStatePagerAdapter {


    String[] tabarray = new String[]{"Bus","Hotel"};
    Integer TabNo = 2;

    public tabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                Bus bus = new Bus();
                return bus;
            case 1:
                Hotel hotel = new Hotel();
                return hotel;

        }

        return null;
    }

    @Override
    public int getCount() {
        return TabNo;
    }
}
