package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_list.*
import android.widget.Toast
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener



class ListActivity : AppCompatActivity() {

    var arralist:ArrayList<model> = ArrayList<model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

    var model1 = model()
        model1.number="se"
        model1.name = "asd"

        arralist.add(model1)

        var model2 = model()
        model2.number="se"
        model2.name = "asd"

        arralist.add(model2)

        var model3 = model()
        model3.number="fffse"
        model3.name = "asfefed"

        arralist.add(model3)

        var model4 = model()
        model4.number="se"
        model4.name = "asvvsdsvsd"

        arralist.add(model4)


        //var adapter = ListAdapter(this,arralist)
        //lv_item_listactivity.adapter = adapter

        registerForContextMenu(lv_item_listactivity);


        /*lv_item_listactivity.setOnItemClickListener(object : OnItemClickListener {
            override fun  onItemClick(arg0: AdapterView<*>, arg1: View, position: Int, arg3: Long) {
                Toast.makeText(this@ListActivity, "hello "+adapter.dataa.get(position).name+ " u did good job in "+adapter.dataa.get(position).number, Toast.LENGTH_SHORT).show()
            }
        })*/
    }
    override fun onCreateContextMenu(menu: ContextMenu, v: View,
                                     menuInfo: ContextMenu.ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu.add("View Selected Text");

//        val inflater: MenuInflater = menuInflater
  //      inflater.inflate(R.menu.optionmenu, menu)
    }

}
