package com.example.myapplication

import android.content.Context
import android.os.Handler
import android.util.Log
import okhttp3.*
import java.io.IOException
import android.os.Looper.getMainLooper



class okhttpwhatever(url:String,context: Context){
    var client = OkHttpClient()
    lateinit    var jsoninterface11:jsoninterface


    var context:Context=context;


    val request = Request.Builder()
        .url(url)
        .build()
    fun get(jsoninterface: jsoninterface){
        jsoninterface11=jsoninterface;

        client.newCall(request).enqueue(object :Callback{
            var mainHandler = Handler(context.getMainLooper())

            override fun onResponse(call: Call, response: Response) {
                var sdsd=response.body()!!.string()

                mainHandler.post(){
                    jsoninterface11.onSuccess(""+sdsd)
                }
            }
            override fun onFailure(call: Call, e: IOException) {
            }

        })
    }
}