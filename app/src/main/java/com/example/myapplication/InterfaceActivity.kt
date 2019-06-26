package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interface.*

class InterfaceActivity : AppCompatActivity(),interfacecalcy {
    var answer =0
    override fun addition(num1: Int, num2: Int) {
        answer = num1 + num2
    }

    override fun subtraction(num1: Int, num2: Int) {
        answer = num1 - num2

    }

    override fun multiplication(num1: Int, num2: Int) {
        answer = num1 * num2

    }

    override fun division(num1: Int, num2: Int) {
        answer = num1 / num2

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface)

        getanswer(Integer.parseInt(et_input1.getText().toString()),Integer.parseInt(et_input2.getText().toString()),Integer.parseInt(et_input3.getText().toString()),this)
    }

    fun getanswer(input1:Int, input2:Int, choice:Int,datainterface:interfacecalcy){
            when(choice){
            1-> datainterface.addition(input1, input2)
        }
    }
}
