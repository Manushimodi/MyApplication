package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class calcyviewholder(itemview:View):RecyclerView.ViewHolder(itemview){
    var storeviewe:View
    var txview1:TextView
    var txview2:TextView
    var txview3:TextView
    init {
        this.storeviewe=itemview
         txview1=storeviewe.findViewById<TextView>(R.id.input1)
        txview2=storeviewe.findViewById<TextView>(R.id.input2)
        txview3=storeviewe.findViewById<TextView>(R.id.ans2)
    }
    fun bind(calcymodel: calcymodel){
        txview1.text = calcymodel.nisarg1.toString()
        txview2.text = calcymodel.nisarg2.toString()
        txview3.text = calcymodel.answer.toString()
    }

}