package com.example.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.prefs.PreferencesFactory

class sqlite(context:Context, name:String?, factory:SQLiteDatabase.CursorFactory?, version:Int):
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION){
    override fun onCreate(db: SQLiteDatabase?) {


        val createtable = ("CREATE TABLE IF NOT EXISTS " + TABLE_PRODUCTS +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_PRODUCTNAME + " TEXT," + COLUMN_QUANTITY + " INTEGER" + ")")

        db!!.execSQL(createtable)
    }


    fun addProduct(id:Int, name:String, qua:Int) {
        val values = ContentValues()
        values.put(COLUMN_PRODUCTNAME, name)
        values.put(COLUMN_ID, id)
        values.put(COLUMN_QUANTITY, qua)
        val db = this.writableDatabase
        db.insert(TABLE_PRODUCTS, null, values)
        db.close()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTS)
        onCreate(db)
    }

    companion object {

        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "productDB.db"
        val TABLE_PRODUCTS = "products"

        val COLUMN_ID = "_id"
        val COLUMN_PRODUCTNAME = "productname"
        val COLUMN_QUANTITY = "quantity"
    }

}