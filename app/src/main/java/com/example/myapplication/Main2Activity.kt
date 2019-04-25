package com.example.myapplication

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import android.app.ProgressDialog



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn_display_main2activity.setOnClickListener {
            var number =Integer.parseInt(et_number_main2activity.text.toString())
            var time = Integer.parseInt(et_timer_main2activity.text.toString())
            asynctask().execute()


        }
    }

    inner class asynctask: AsyncTask<Int, Int,String>() {

        var progressDialog: ProgressDialog? = null


        override fun onPreExecute() {
            super.onPreExecute()
            progressDialog= ProgressDialog.show(this@Main2Activity,"Sum","starting")

        }

        override fun doInBackground(vararg params: Int?): String {
            var counter =0
            if(params.size>0) {
                var number = params[0]
                if (params.size > 1) {

                    var time: Int = params[1]!!

                    for (i in 0..number!!) {

                        counter = counter + i
                        publishProgress(counter);
                        try {
                            Thread.sleep(time.toLong())
                        } catch (ex: InterruptedException) {
                            Thread.currentThread().interrupt()
                        }
                    }
                }
            }

            return "Your sum is "+counter

        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
           // progressDialog!!.setTitle()
            progressDialog!!.setMessage("sum of "+values.get(0))
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            tv_totalsum_main2activity.text=result
            progressDialog!!.dismiss()
        }

    }
}
