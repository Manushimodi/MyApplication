package com.example.myapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class pageradapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    var farrayList:ArrayList<Fragment> = ArrayList()
    var sarraylist:ArrayList<String>   = ArrayList()


    override fun getItem(p0: Int): Fragment {
       return farrayList.get(p0)
    }

    override fun getCount(): Int {
        return farrayList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return sarraylist.get(position)
    }

    fun addFragment(fragment: Fragment, title:String){
        farrayList.add(fragment)
        sarraylist.add(title)
    }
}