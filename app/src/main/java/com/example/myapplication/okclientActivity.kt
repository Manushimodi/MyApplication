package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_okclient.*
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

class okclientActivity : AppCompatActivity() {

    var arrayList:ArrayList<jsonmodel> = ArrayList()
    var context=this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okclient)

        var lmanager : LinearLayoutManager = LinearLayoutManager(context)
        rv_okhttprecycleview.layoutManager = lmanager

        var client = OkHttpClient()
        var request = Request.Builder().url("http://dummy.restapiexample.com/api/v1/employees").build()

        client.newCall(request).enqueue(object :Callback{
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                var result = response.body()!!.string()

                var handler = Handler(context.mainLooper)
                handler.post(){
                    jsonconvert(result)
                }

            }

        })

    }
        fun jsonconvert(data:String){
            var jsonarray = JSONArray(data)
            for(i in 0 until jsonarray.length()-1){
                var jsonobj = JSONObject(""+jsonarray.get(i))
                jsonobj.getString("id")
                var model = jsonmodel()
                model.name = jsonobj.getString("employee_name")
                model.salary = jsonobj.getString("employee_salary")
                model.id = jsonobj.getInt("id")
                model.age = jsonobj.getInt("employee_age")
                arrayList.add(model)
            }
            var adapter = okhttpAdapter(arrayList, context)
            rv_okhttprecycleview.adapter = adapter
            adapter.notifyDataSetChanged()

                Log.d("arraysize", "="+arrayList.size)
    }
}
