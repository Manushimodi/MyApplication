package com.example.myapplication

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_async_task.*
import kotlinx.android.synthetic.main.activity_okhttp.*
import android.R.string
import android.widget.Toast
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException


class OkhttpActivity : AppCompatActivity() {
    var arraylist:ArrayList<jsonmodel> = ArrayList<jsonmodel>()
    lateinit var jsoninterface1:jsoninterface;
    var client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okhttp)
        //   var request = OkHttpRequest(client)

        btn_networkbtn_okhttpactivity.setOnClickListener() {
            var h=okhttpwhatever("http://dummy.restapiexample.com/api/v1/employees",this)
            h.get(object :jsoninterface{
                override fun onSuccess(data: String) {
                    var jsonarray= JSONArray(data)

                    for(i in 0..jsonarray.length()-1){
                        Log.d("dataata","=="+jsonarray.get(i))
                        var jsonobject:JSONObject= JSONObject(""+jsonarray.get(i))
                        Log.d("dataata","=="+jsonobject.getString("employee_salary"))
                        var jsonmodel= jsonmodel()
                        jsonmodel.id=jsonobject.getInt("id")
                        jsonmodel.name=jsonobject.getString("employee_name")
                        jsonmodel.salary=jsonobject.getString("employee_salary")
                        jsonmodel.age=jsonobject.getInt("employee_age");
                        arraylist.add(jsonmodel)
                    }
                    Log.d("dataataaaaa","=="+arraylist.size)

                }
                override fun onFailure() {
                }

            })
        }
    }
    fun get(jsoninterface: jsoninterface ){
         jsoninterface1= jsoninterface
      //  asynctask().execute("ddxe")
    }


/*
    inner class asynctask:AsyncTask<String, Int, String>(){
        override fun onPreExecute() {
            super.onPreExecute()

        }
        @SuppressLint("WrongThread")
        override fun doInBackground(vararg params: String?): String? {
            //  onProgressUpdate(count++)
            var request = Request.Builder().url("http://dummy.restapiexample.com/api/v1/employees").build()
            client.newCall(request).enqueue(object:Callback{
                override fun onFailure(call: Call, e: IOException) {
                    Toast.makeText(this@OkhttpActivity, "api fail", Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call, response: Response) {
                    //response.body()
                    Log.d("ede", "your response msg" + response.message() + response.code()+"\n" + response.protocol()+"\n"+response.body()!!.string()+"\n")
                    var result="";

                }

            })

            return  null
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            jsoninterface1.onSuccess(result!!)

        }
    }*/

}

