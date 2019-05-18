package com.example.myapplication
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast

import android.R.attr.button
import kotlinx.android.synthetic.main.activity_gester.*

class gesterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_gester)

        button.setOnTouchListener(object : OnSwipeTouchListener(this) {
            override fun onSwipeTop() {
                Toast.makeText(getApplicationContext(), "Swiped top", Toast.LENGTH_SHORT).show();
            }

            override fun onSwipeRight() {
                super.onSwipeRight()
                Toast.makeText(getApplicationContext(), "Swiped right", Toast.LENGTH_SHORT).show();

            }

            override fun onSwipeBottom() {
                super.onSwipeBottom()
                Toast.makeText(getApplicationContext(), "Swiped bott", Toast.LENGTH_SHORT).show();

            }

            override fun onTouch(v: View, event: MotionEvent): Boolean {
                return super.onTouch(v, event)
            }
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(getApplicationContext(), "Swiped left", Toast.LENGTH_SHORT).show();
            }
        })

    }

    internal open inner class OnSwipeTouchListener(ctx: Context) : View.OnTouchListener {

        private val gestureDetector: GestureDetector


        init {
            gestureDetector = GestureDetector(ctx, GestureListener())
        }

        override fun onTouch(v: View, event: MotionEvent): Boolean {
            return gestureDetector.onTouchEvent(event)
        }

        private inner class GestureListener : GestureDetector.SimpleOnGestureListener() {

            private val SWIPE_THRESHOLD = 300
            private val SWIPE_VELOCITY_THRESHOLD = 300

            override fun onDown(e: MotionEvent): Boolean {
                return true
            }

            override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
                Log.i("TAG", "onSingleTapConfirmed:")
                Toast.makeText(applicationContext, "Single Tap Detected", Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onLongPress(e: MotionEvent) {
                Log.i("TAG", "onLongPress:")
                Toast.makeText(applicationContext, "Long Press Detected", Toast.LENGTH_SHORT).show()
            }

            override fun onDoubleTap(e: MotionEvent): Boolean {
                Toast.makeText(applicationContext, "Double Tap Detected", Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
                var result = false
                try {
                    if(e1.y>e2.y){
                        onSwipeBottom()
                    }
                    if(e1.y<e2.y){
                        onSwipeTop()
                    }
                    if(e1.x>e2.x){
                        onSwipeRight()
                    }
                    if(e1.x<e2.x){
                        onSwipeLeft()
                    }

                    /*
                    val diffY = e2.y - e1.y
                    val diffX = e2.x - e1.x
                    if (Math.abs(diffX) > Math.abs(diffY)) {
                        if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                            if (diffX > 0) {
                                onSwipeRight()
                            } else {
                                onSwipeLeft()
                            }
                            result = true
                        }*/
 /*                   } else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffY > 0) {
                            onSwipeBottom()
                        } else {
                            onSwipeTop()
                        }
                        result = true
                    }*/
                } catch (exception: Exception) {
                    exception.printStackTrace()
                }

                return result
            }
/*
            companion object {

                private val SWIPE_THRESHOLD = 300
                private val SWIPE_VELOCITY_THRESHOLD = 300
            }*/
        }

        open fun onSwipeRight() {

        }

        open fun onSwipeLeft() {}

        open fun onSwipeTop() {}

        open fun onSwipeBottom() {}
    }
}

