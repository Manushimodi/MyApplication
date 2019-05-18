package com.example.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class okhttpAdapter(arrayList: ArrayList<jsonmodel>,context: Context ):RecyclerView.Adapter<okhttpviewholder>(){
   var data = arrayList
    var context = context

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): okhttpviewholder {
        var layoutInflater : LayoutInflater = LayoutInflater.from(context)
        var layoutview = layoutInflater.inflate(R.layout.okhttplayout, p0, false)
        return okhttpviewholder(layoutview)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    override fun onBindViewHolder(p0: okhttpviewholder, p1: Int) {
        p0.bind(data.get(p1))
    }
}