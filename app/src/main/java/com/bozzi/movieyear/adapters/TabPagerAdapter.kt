package com.bozzi.movieyear.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
        when (p0) {
            0 -> return TabMovieListFragment()
            1 -> return TabFavoritesFragment()
        }
    }

    override fun getCount(): Int {
        return tabCount
}