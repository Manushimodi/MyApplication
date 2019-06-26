package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ActionProvider
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    var state=0;
    var num1 :String = ""
    var num2 : String=""
    lateinit var adapter:calcyadapter
    var arrayList:ArrayList<calcymodel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        setSupportActionBar(findViewById(R.id.toolbar))

        adapter= calcyadapter(this, arrayList)
        var layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        rv_calcyreccleview.adapter = adapter
        rv_calcyreccleview.layoutManager = layoutManager
        adapter.notifyDataSetChanged()

    }

    fun cancel(view: View){
        tv_num1.text=""
        tv_num2.setText("")
        tv_ans1.setText("")
        num1 = ""
        num2 = ""
        state=0
    }

    fun modulo(view: View){
        state = 5
        tv_num2.setText("%  ")

    }
    fun multiplication(view: View){
        state=3
        tv_num2.setText("*  ")
        // var ans=num1+num2
        //tv_ans1.setText(""+ans)
        //state=0
    }
    fun division(view: View){
        state=4
        tv_num2.setText("/  ")
        // var ans=num1+num2
        //tv_ans1.setText(""+ans)
        //state=0
    }

    fun add(view: View){
        state=1
        tv_num2.setText("+  ")
       // var ans=num1+num2
        //tv_ans1.setText(""+ans)
        //state=0
    }
    fun sub(view: View){
        state=2
        tv_num2.setText("- ")
        // var ans=num1+num2
        //tv_ans1.setText(""+ans)
        //state=0
    }
    fun one(view:View){
        if(state==0){
            num1=num1+1
            //state=1
            tv_num1.setText(num1)

        }
        else if(state==6){

            var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()

            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+1
            tv_num1.setText(num1)
        }
        else{
            num2=num2+1
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }
        }
    }
    fun two(view:View){
        if(state==0){
            num1=num1+2

            tv_num1.setText(num1)
        }

        else if(state==6){
            var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+2
            tv_num1.setText(num1)
        }
        else{
            num2=num2+2
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }

    fun three(view:View){
        if(state==0){
            num1=num1+3

            tv_num1.setText(num1)
        }
        else if(state==6){
            var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+3
            tv_num1.setText(num1)
        }
        else{
            num2=num2+3
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }
    fun four(view:View){
        if(state==0){
            num1=num1+4
            tv_num1.setText(num1)
        }
        else if(state==6){
            var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+4
            tv_num1.setText(num1)
        }
        else{
            num2=num2+4
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }
        }
    }
    fun five(view:View){
        if(state==0){
            num1=num1+5

            tv_num1.setText(num1)
        }
        else if(state==6){var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+5
            tv_num1.setText(num1)
        }
        else{
            num2=num2+5
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }
    fun six(view:View){
        if(state==0){
            num1=num1+6

            tv_num1.setText(num1)
        }
        else if(state==6){
            var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+6
            tv_num1.setText(num1)
        }
        else{
            num2=num2+6
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }
    fun seven(view:View){
        if(state==0){
            num1=num1+7

            tv_num1.setText(num1)
        }
        else if(state==6){var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+7
            tv_num1.setText(num1)
        }
        else{
            num2=num2+7
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }
    fun eight(view:View){
        if(state==0){
            num1=num1+8

            tv_num1.setText(num1)
        }
        else if(state==6){var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+8
            tv_num1.setText(num1)
        }
        else{

            num2=num2+8
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }        }

    }
    fun zero(view:View){
        if(state==0){
            num1=num1+0

            tv_num1.setText(num1)
        }
        else if(state==6){var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+0
            tv_num1.setText(num1)
        }
        else{
            num2=num2+0
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }
        }

    }
    fun nine(view:View){
        if(state==0){
            num1=num1+9

            tv_num1.setText(num1)
        }

        else if(state==6){var model=calcymodel()
            model.nisarg1 = tv_num1.text.toString()
            model.nisarg2 = tv_num2.text.toString()
            model.answer=tv_ans1.text.toString()
            adapter.calcylist.add(model)
            adapter.notifyDataSetChanged()
            state=0
            num1=""
            num2=""

            tv_num1.text=""
            tv_num2.text=""
            tv_ans1.text=""

            num1=num1+9
            tv_num1.setText(num1)
        }
        else{
            num2=num2+9
            if(state==1){
                tv_num2.setText("+"+ num2)
            }
            else if(state==2){
                tv_num2.setText("-" +num2)
            }
            else if(state==3){
                tv_num2.setText("*" +num2)
            }
            else if (state==4){
                tv_num2.setText("*" +num2)
            }
            else{
                tv_num2.setText("%" +num2)
            }
        }

    }

    fun settextontv2(string:String){

    }
    fun num1_click(view: View){
        state = 0


    }
    fun num2_click(view: View){
        state = 1
    }
    fun ans1_click(view: View){
        state = 6
    }


    fun backspace(view: View){
        Log.d("stack_value","===="+state)
        if(state == 0){
            if(tv_num1.text.length>0)
            tv_num1.setText(tv_num1.text.substring(0, tv_num1.text.length - 1));


        }
        else if(state >=1 && state<=5){
            if(tv_num2.text.length>0)
                tv_num2.setText(tv_num2.text.substring(0, tv_num2.text.length - 1));

        }
        else{
            tv_ans1.setText(tv_ans1.text.substring(0,tv_ans1.text.length-1))
        }

    }


    fun equal(view:View){
        var num1 = Integer.parseInt(num1)
        var num2 = Integer.parseInt(num2)
        var ans=0

        if(state==1){
            ans=num1+num2
        }
        if(state==2){
            ans=num1-num2
        }
        if(state==3){
            ans=num1*num2
        }
        if(state==4){
            ans=num1/num2
        }
        if(state==5){
            ans=num1%num2
        }
        state = 6
        tv_ans1.setText("= "+ans)
    }
}
