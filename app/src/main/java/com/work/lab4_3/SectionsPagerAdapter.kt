package com.work.lab4_3

import android.content.Context
import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    private val imgs = listOf(R.drawable.ic_elephant, R.drawable.ic_monkey, R.drawable.ic_parrot)
    private val colors = listOf("#431845","#438102","#fd9584")

    override fun getItem(position: Int): Fragment {
        return TabFragment.newInstance(imgs[position], Color.parseColor(colors[position]))
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Fragment $position"
    }

    override fun getCount() = 3
}