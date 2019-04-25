package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.ArrayList

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class MyAdapter(internal var context: Context, internal var data: ArrayList<model>)
    : ArrayAdapter<model>(context, R.layout.contacts_list_item, data) {

    override fun getCount(): Int {
        return this.data.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(this.context)
        val view = inflater.inflate(R.layout.contacts_list_item, null as ViewGroup?)
        val txname = view.findViewById<View>(R.id.name) as TextView
        val txnumber = view.findViewById<View>(R.id.number) as TextView
        txname.text==data.get(position).name;
        txnumber.text=data.get(position).number
        return view
    }
}
