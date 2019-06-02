package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_okhttppost.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import java.io.Serializable

class okhttppostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_okhttppost)

        var context = this
        //glide imge

        var imageUrls = "https://media1.giphy.com/media/xULW8OofuT5CAhTVWU/source.gif"


        btn_okkpost_okhttppostactivity.setOnClickListener(){
            var client = OkHttpClient()
            Glide.with(this)
                .load(imageUrls)
                .into(iv_glide_okhttppostactivity);


            //var intent = Intent(this, recentscreenActivity::class.java)
            //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT or android.content.Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS)
          //  startActivity(intent)

            //parceble and serializable
            /*var intent = Intent(this, OkhttpActivity::class.java)
            var jsonmodel=jsonmodel()
            intent.putExtra("data",jsonmodel as Serializable)
            intent.putExtra("data1",jsonmodel as Parcelable)
            startActivity(intent)
*/

            ///post api call
/*
            val JSON = MediaType.parse("application/json; charset=utf-8")

            var jsonobject = JSONObject()
            jsonobject.put("name",et_postetname_okhttppostactivity.text)
            jsonobject.put("salary", et_postetsalary_okhttppostactivity.text)
            jsonobject.put("age", et_postetage_okhttppostactivity.text)

            var json=jsonobject.toString()

            var body =RequestBody.create(JSON,json)

            var request = Request.Builder().post(body).url("http://dummy.restapiexample.com/api/v1/create").build()
            client.newCall(request).enqueue(object :Callback{
                override fun onFailure(call: Call, e: IOException) {
                    Log.d("postfail", "="+e)
                }

                override fun onResponse(call: Call, response: Response) {
                    Log.d("post success", "=="+response.body()!!.string())
                }

            })*/
        }
    }
}
