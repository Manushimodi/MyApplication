package com.example.myapplication

import java.io.Serializable

class jsonmodel() :Serializable{


    var id:Int = 0
        get() = field
        set(value) {
            field = value
        }
    var name:String = "asdfghjk"
        get() = field
        set(value) {
            field = value
        }
    var salary:String = "1234"
        get() = field
        set(value) {
            field = value
        }
    var age:Int = 20
        get() = field
        set(value) {
            field = value
        }
    var profileimage:String = "www.google.com"
        get() = field
        set(value) {
            field = value
        }


}