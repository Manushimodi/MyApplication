package com.example.myapplication

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_async_task.*

class AsyncTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

        btn.setOnClickListener {
            asynctask().execute("daattggeerfvfrv");
        }

    }













    inner class asynctask:AsyncTask<String, Int, Void>(){
        var count=0;
         override fun onPreExecute() {
             super.onPreExecute()
             progressBar.visibility=View.VISIBLE
             tv_result.text="start"

         }
         @SuppressLint("WrongThread")
         override fun doInBackground(vararg params: String?): Void? {
           //  onProgressUpdate(count++)

             for(i in 0..10){
                 publishProgress(i);
                 try {
                     Thread.sleep(1000)
                 } catch (ex: InterruptedException) {
                     Thread.currentThread().interrupt()
                 }
             }
//                 tv_result.setText(i)
              return  null
         }

         override fun onProgressUpdate(vararg values: Int?) {
             super.onProgressUpdate(*values)
             tv_result.setText(values.get(0).toString())
         }

         override fun onPostExecute(result: Void?) {
             super.onPostExecute(result)
             progressBar.visibility=View.GONE
             tv_result.text="end"
         }
     }
}
