package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_file.*
import android.os.Environment.MEDIA_MOUNTED
import android.util.Log
import java.io.*


class FileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_file)
        if (!isExternalStorageAvailable() || isExternalStorageReadOnly()) {
            btn_filechoose_fileactivity.isEnabled=false
        }
    }

    fun isExternalStorageReadOnly():Boolean{
        val extStorageState = Environment.getExternalStorageState()
        return if (Environment.MEDIA_MOUNTED_READ_ONLY == extStorageState) {
            true
        }
        else false
    }

    fun isExternalStorageAvailable():Boolean{
        val extStorageState = Environment.getExternalStorageState()
        return if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            true
        } else false
    }




        fun saveFile(view: View){
        var fname = et_filename_fileactivity.text.toString()
        var fcontent = et_filecontent_fileactivity.text.toString()

        if(fname.length>=10){
            Toast.makeText(this, "file name should not be greater than 10", Toast.LENGTH_LONG).show()
        }

        else if(fcontent.length>=100){
            Toast.makeText(this, "file content should not be greater than 100", Toast.LENGTH_LONG).show()
        }

        else{
            val filepath = "MyFileStorage"
            val myExternalFile: File = File(getExternalFilesDir(filepath), "abc.txt")


            try {
                val fis = FileInputStream(myExternalFile)
                val iin = DataInputStream(fis)
                val br = BufferedReader(InputStreamReader(iin))
                Log.d("stringline", "====="+br.readLine()+br.read())

                var strLine: String="asghjk"
                while (br.readLine()!= null) {
                    strLine = strLine +br.readLine()
                   // Log.d("stringline", "====="+br.readLine()+myExternalFile.exists())
                }
             //   Log.d("stringline", "====="+strLine)
                iin.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }


            /*try {
                var fos : FileOutputStream = FileOutputStream(myExternalFile);
                fos.write(et_filecontent_fileactivity.getText().toString().toByteArray());
                Toast.makeText(this, "ffile save", Toast.LENGTH_LONG).show()

            } catch (e: IOException) {
                Toast.makeText(this, "ffile save"+e.message, Toast.LENGTH_LONG).show()
                e.printStackTrace();
            }
            Toast.makeText(this, "ffile save1", Toast.LENGTH_LONG).show()
            */
           }


    }

}
