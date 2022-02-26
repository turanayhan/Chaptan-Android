package com.hrdijital.chaptan.models

import android.graphics.Color
import android.view.View
import com.hrdijital.chaptan.R

data class DriverRules(val title:String?,val status:Boolean?){

    fun textControl():String{
        status.let {
            if (it!!){
                return "yüklendi"
            }
            else{
                return "Başlamaya hazırsınız"
            }
        }
    }

    fun colorControl():Int {
        status.let {
            if (it!!) {
                return Color.parseColor("#FFB100")
            }
            else{

                return Color.parseColor("#000000")
            }
        }
    }

    fun statusControl():Int {
        status.let {
            if (it!!) {
                return View.VISIBLE
            }
            else{
                return View.GONE
            }
        }
    }





}