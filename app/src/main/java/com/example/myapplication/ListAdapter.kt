package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(internal var context:Context, internal var dataa:ArrayList<model>)
    :ArrayAdapter<model>(context,R.layout.layout, dataa)
{
    override fun getCount(): Int {
        return dataa.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var inflater = LayoutInflater.from(context)
        var view = inflater!!.inflate(R.layout.layout, null as ViewGroup?)

        val txnam = view.findViewById<View>(R.id.tv_t1_listactivity) as TextView
        val txnumbe = view.findViewById<View>(R.id.tv_t2_listactivity) as TextView
        var image = view.findViewById<View>(R.id.iv_image_listactivity) as ImageView
        txnam.text  = dataa.get(position).name
        txnumbe.text = dataa.get(position).number

        return view
    }

}