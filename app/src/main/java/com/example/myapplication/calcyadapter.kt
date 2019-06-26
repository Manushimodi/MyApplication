package com.example.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class calcyadapter (context:Context,calcylist:ArrayList<calcymodel>):RecyclerView.Adapter<calcyviewholder>(){
     var context :Context
     var calcylist: ArrayList<calcymodel>

    init {
            this.context=context
            this.calcylist = calcylist

    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): calcyviewholder {
        var layoutInflater:LayoutInflater= LayoutInflater.from(context)
        var view = layoutInflater.inflate(R.layout.calcyrecycle, p0,false)
        return calcyviewholder(view)
    }

    override fun getItemCount(): Int {
      return calcylist.size
    }

    override fun onBindViewHolder(p0: calcyviewholder, p1: Int) {
        p0.bind(calcylist.get(p1))
    }
}