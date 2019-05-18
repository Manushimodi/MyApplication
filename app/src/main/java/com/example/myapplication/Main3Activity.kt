package com.example.myapplication

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn1.setOnClickListener {
            asynctask().execute(et1.text.toString(),et2.text.toString())
        }


    }

    inner class asynctask:AsyncTask<String, Void, String>(){


        override fun doInBackground(vararg params: String?): String {
           var a = Integer.parseInt(params[0]) + Integer.parseInt(params[1])

            return  "sum of "+params[0] + " and " + params[1] + " is " +a
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            et1.setText(result);
        }

    }
}
