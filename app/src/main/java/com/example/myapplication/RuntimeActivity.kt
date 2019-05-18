package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.Manifest.permission.CAMERA
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_runtime.*
import android.support.v4.app.ActivityCompat
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.os.Build
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.net.Uri
import java.io.File

class RuntimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime)

        btn_btn2_rumtimeactivity.setOnClickListener() {
            //view = v;

            if (!checkPermission()) {
                var fcd:File = File("////")
                    fcd.length()
                requestPermission();

            } else {

                Snackbar.make(btn_btn2_rumtimeactivity, "Permission already granted.", Snackbar.LENGTH_LONG).show();
            }
        }

    }

    private fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(applicationContext, ACCESS_FINE_LOCATION)
        val result1 = ContextCompat.checkSelfPermission(applicationContext, CAMERA)
        val result3 = ContextCompat.checkSelfPermission(applicationContext, READ_EXTERNAL_STORAGE)
        val result4 = ContextCompat.checkSelfPermission(applicationContext, WRITE_EXTERNAL_STORAGE)

        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED || result3 == PackageManager.PERMISSION_GRANTED
                && result4 == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermission() {

        ActivityCompat.requestPermissions(this, arrayOf(ACCESS_FINE_LOCATION, CAMERA, WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE), 200)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {

            200 -> if (grantResults.size > 0) {

                val locationAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED
                val cameraAccepted = grantResults[1] == PackageManager.PERMISSION_GRANTED
                val writeaccepted = grantResults[2] == PackageManager.PERMISSION_GRANTED
                val readaccepted = grantResults[3] == PackageManager.PERMISSION_GRANTED

                if (locationAccepted && cameraAccepted || writeaccepted && readaccepted)
                    Snackbar.make(btn_btn2_rumtimeactivity, "Permission Granted, Now you can access location data and camera.", Snackbar.LENGTH_LONG).show()
                else {
                    Snackbar.make(btn_btn2_rumtimeactivity, "Permission Denied, You cannot access location data and camera.", Snackbar.LENGTH_LONG).show()

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (shouldShowRequestPermissionRationale(ACCESS_FINE_LOCATION)) {

                            showMessageOKCancel("You need to allow access to both the permissions", DialogInterface.OnClickListener { dialog, which ->

                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                    requestPermissions(arrayOf(ACCESS_FINE_LOCATION, CAMERA, WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE), 200)
                                    }
                                })
                            return
                        }
                    }
                }
            }
        }
    }


    private fun showMessageOKCancel(message: String, okListener: DialogInterface.OnClickListener) {
        AlertDialog.Builder(this@RuntimeActivity)
            .setMessage(message)
            .setPositiveButton("OK", okListener)
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }


}
