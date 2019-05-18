package com.example.myapplication
import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class recycleadapter(activity: Activity, data1:ArrayList<recyalemodel>) :RecyclerView.Adapter<recyclewholder>(){
    var activity = activity
    var data = data1

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): recyclewholder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(activity)
        val view: View = layoutInflater.inflate(R.layout.recyalelayout, p0, false)
        return recyclewholder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(p0: recyclewholder, p1: Int) {
        p0.bind(data.get(p1))
    }
}