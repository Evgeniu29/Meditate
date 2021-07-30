package com.genius.meditation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.genius.meditation.beforesleep.BeforeSleepFragment
import com.genius.meditation.daytime.DaytimeFragment
import com.genius.meditation.morning.MorningFragment

private const val NUM_TABS = 3

public class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return MorningFragment()
            1 -> return DaytimeFragment()
            2-> return BeforeSleepFragment()
        }
        return MorningFragment()
    }
}