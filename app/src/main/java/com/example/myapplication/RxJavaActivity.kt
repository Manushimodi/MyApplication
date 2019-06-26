package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_rx_java.*
import java.util.*

class RxJavaActivity : AppCompatActivity() {

   /* override fun onError(e: Throwable) {
        ///pass
    }

    override fun onNext(t: String) {

        //next page
    }


    override fun onSubscribe(d: Disposable) {
    }

    override fun onComplete() {

    }
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_rx_java)

        // var animalobserver:Observer<String> = this

        abcc.setOnClickListener(){
         var email:String="nisargdoshi9999@gmail.com"
            var passord:String="Nisarg@8511"
            OkhttpActivity().getValidate(email,passord, object :Observer<String>{
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(t: String) {
                }

                override fun onError(e: Throwable) {
                }

            })


        }


    }



}
