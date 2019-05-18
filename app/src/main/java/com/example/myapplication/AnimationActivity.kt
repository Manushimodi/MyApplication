package com.example.myapplication

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.KeyEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_animation.*
import java.io.File

class AnimationActivity : AppCompatActivity(), View.OnKeyListener {

    override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
        if(v!!.id==R.id.et_animation){
            if(keyCode==29 ){
                Toast.makeText(this@AnimationActivity,"A"+keyCode,Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@AnimationActivity,"Not A"+keyCode,Toast.LENGTH_SHORT).show()
            }

        }
        return false
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        btndemo.setOnClickListener(){
            Toast.makeText(this@AnimationActivity,"yo",Toast.LENGTH_SHORT).show()
        }




        var animationvariable=AnimationUtils.loadAnimation(applicationContext,R.anim.fghjk)


        et_animation.setOnKeyListener(this)

        /*animationobject.setOnClickListener(){



       /////x     iv1.setImageDrawable(resources.getDrawable(R.drawable.ss))


            *//*tv1.setText(R.string.string2)
             tv1.setTextColor(resources.getColor(R.color.color3))

            val filename = "myfile"
            val fileContents = "NisaRg U arE VeRy BaKVas!"


           *//**//*var a= openFileOutput(filename, MODE_PRIVATE).use {
                it.write(fileContents.toByteArray())
            }
           *//**//*

            val directory = filesDir
            val file = File(directory, filename)

            Toast.makeText(this,"hi"+file.path, Toast.LENGTH_SHORT).show()
*//*




            *//*  animationobject.startAnimation(animationvariable)
              Toast.makeText(this,"hi",Toast.LENGTH_SHORT).show()*//*
        }
*/

    }
}
