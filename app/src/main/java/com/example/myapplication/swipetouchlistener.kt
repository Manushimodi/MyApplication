package com.example.myapplication

import android.content.Context
import android.gesture.GestureLibraries
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View



public class swipetouchlistener(context: Context):View.OnTouchListener, GestureDetector.SimpleOnGestureListener() {

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        return false

    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        return super.onDoubleTap(e)
    }


    fun onSwipeRight() {}

    fun onSwipeLeft() {}

    fun onSwipeTop() {}

    fun onSwipeBottom() {}

}

