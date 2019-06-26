package com.example.myapplication

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.widget.EditText
import android.widget.TextView
import android.R
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.ANTI_ALIAS_FLAG
import android.graphics.Rect
import android.support.annotation.Nullable

class MyCustomView:EditText{

    var mPaint: Paint? = null
    var mRect: Rect? = null
    var mSquareColor: Int = 0
    lateinit var attrs:AttributeSet;

    constructor(context: Context):super(context)
    {
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor (context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context,attrs,defStyleAttr,defStyleRes) {
        this.attrs=attrs
        init(attrs)
    }

    constructor (context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context,attrs,defStyleAttr) {
        this.attrs=attrs
        init(attrs)


    }
    constructor (context: Context, attrs: AttributeSet) : super(context,attrs) {
        this.attrs=attrs
        init(attrs)
    }
    private fun init(attrs: AttributeSet?) {
        //setTextColor(resources.getColor(R.color.color3))
    }
    }