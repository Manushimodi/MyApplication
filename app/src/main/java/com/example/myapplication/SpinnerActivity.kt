package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {
    var array1 :ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        setSupportActionBar(findViewById(R.id.toolbar))

        array1.add("qwertyuio")
        array1.add("acghjk")
        array1.add("zxcvbnm")
        array1.add("1234yu")

        var adapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item ,array1)
        sp_sp1_spinneravtivity.adapter = adapter

        btn_toast_spinneractivity.setOnClickListener {

            val inflater = layoutInflater
            val layout: View = inflater.inflate(R.layout.recyalelayout, null)
            val text: TextView = layout.findViewById(R.id.tv_demo_recycleactivity)
            text.text = "This is a custom toast"
            with (Toast(applicationContext)) {
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
     //menuInflater.inflate()

        return super.onCreateOptionsMenu(menu)

    }
}