package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class okhttpviewholder(viewobject: View) : RecyclerView.ViewHolder(viewobject) {
    var storeview = viewobject

    var name :TextView = storeview.findViewById(R.id.tv_okhttptv1) as TextView
    var id :TextView = storeview.findViewById(R.id.tv_okhttptv2) as TextView
    var salary :TextView = storeview.findViewById(R.id.tv_okhttptv3) as TextView
    var age :TextView = storeview.findViewById(R.id.tv_okhttptv4) as TextView


    fun bind(jsonmodel: jsonmodel) {
        name.text = jsonmodel.name
        id.text = ""+jsonmodel.id
        salary.text = " " + jsonmodel.salary
        age.text = ""+jsonmodel.age

    }
}
