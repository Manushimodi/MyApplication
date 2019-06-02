package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recentscreen.*

class recentscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recentscreen)


        btn_recentbtn_recentscreenactivity.setOnClickListener(){
            var intent = Intent(this, recentscreen2Activity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT or android.content.Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS)
            startActivity(intent)
        }


    }
}
