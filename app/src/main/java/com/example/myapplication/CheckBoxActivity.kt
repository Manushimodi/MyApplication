package com.example.myapplication

import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.*
import android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
import android.widget.*
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity(), Replcefragmentlistener {

    override fun demo() {
        Log.d("kmmmkmkmk","njjnj")
     }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        cb_cb1_checkboxactivity.isChecked = true

        //registerForContextMenu(cb_cb1_checkboxactivity)

        /*cb_cb1_checkboxactivity.setOnClickListener {

            if (cb_cb1_checkboxactivity.isChecked) {
               // onPrepareOptionsMenu(menu)
              *//*  var builder = AlertDialog.Builder(this)
               // builder.setMessage("qwertyu")
                var a: BooleanArray=BooleanArray(3)
                a.set(0,true)
                a.set(2, true)
                builder.setTitle("zzzzzzz")
                builder.setMultiChoiceItems(R.array.spinner!!,a!!,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->  })
                builder.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, which ->
                    finish()
                })
                builder.setNegativeButton("cancel", DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this, "unchecked", Toast.LENGTH_SHORT).show()
                })

               var d= builder.create()

                val window = d.getWindow()
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
*//*

               *//* val showDialoge = Dialog(this, R.style.AppTheme);
                showDialoge.setTitle("dede")
                val window = showDialoge.getWindow()
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                showDialoge.setContentView(R.layout.layout)
                showDialoge.show()*//*


//                d.requestWindowFeature(Window.FEATURE_NO_TITLE)

               // d!!.show()


            } else {
                Toast.makeText(this, "unchecked", Toast.LENGTH_SHORT).show()
            }



        }
*/

        val toggle: Switch = findViewById(R.id.switch1)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "on", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "off", Toast.LENGTH_SHORT).show()
            }


        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflate : MenuInflater = MenuInflater(this)
        inflate.inflate(R.menu.optionmenu, menu)
        return true
    }
/*
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        invalidateOptionsMenu();
        var inflate : MenuInflater = MenuInflater(this)
        inflate.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.menuitem_i1_optionmenu -> {
                Toast.makeText(this, "1 item"+item.title, Toast.LENGTH_SHORT).show()
                return true

            }
            R.id.menuitem_i2_optionmenu -> {
                Toast.makeText(this, "2 item"+item.title, Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.menuitem_i3_optionmenu -> {
                Toast.makeText(this, "3 item"+item.title, Toast.LENGTH_SHORT).show()

                return true
            }
            R.id.menuitem_i4_optionmenu -> {
                Toast.makeText(this, "4 item"+item.title, Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return true
    }*/


    fun showPopup(v: View) {
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.optionmenu, popup.menu)
        popup.show()
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View,
                                     menuInfo: ContextMenu.ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu.setHeaderTitle("Context Menu");
        menu.add(0, v.getId(), 0, "Upload");
        menu.add(0, v.getId(), 0, "Search");
        menu.add(0, v.getId(), 0, "Share");
        menu.add(0, v.getId(), 0, "Bookmark");
    }

}