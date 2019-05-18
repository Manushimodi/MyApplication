package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class recyclewholder(view: View):RecyclerView.ViewHolder(view){
    var name = view.findViewById<TextView>(R.id.tv_demo_recycleactivity) as TextView

    fun bind(recyalemodel: recyalemodel){
        name.text = recyalemodel.name

    }

}