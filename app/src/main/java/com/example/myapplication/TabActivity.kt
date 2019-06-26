package com.example.myapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_tab.*

class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        setUpViewPager(vp_viewpager)
        tl_TabActiovity.setupWithViewPager(vp_viewpager)
        tl_TabActiovity.setSelectedTabIndicatorColor(Color.parseColor("#256eff"));

    }

    fun setUpViewPager(viewPager: ViewPager){
        var demo=pageradapter(supportFragmentManager)
        demo.addFragment(Tab1Fragment(),"nisaarrrrrrrrrrrrrrrrrrgr1" )
        demo.addFragment(Tab2Fragment(),"nisargggggggggggggg2")
        viewPager.adapter=demo
    }
}
