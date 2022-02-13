package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.launch_screen.*


class LaunchScreen : Fragment() {
    var action: NavDirections?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.launch_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //launch ekranında toolbar gizleme
        toolbar_desing()

        //buton işlemleri
        buton_control()




    }
    fun toolbar_desing(){
        App.toolbar_desing(R.drawable.arrow_back_black,
            Color.parseColor("#FFFFFF"),
            "Yolcu",
            Color.parseColor("#000000"),
            Color.TRANSPARENT,
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN,
            requireActivity(),View.GONE)

    }


    fun buton_control(){

        btn_traveller.setOnClickListener {

            action= ActionOnlyNavDirections(R.id.action_launchScreen_to_passAuth)
            Navigation.findNavController(it).navigate(action!!)
        }

        btn_driver.setOnClickListener {

            action=LaunchScreenDirections.actionLaunchScreenToPassRouter12()
            Navigation.findNavController(it).navigate(action!!)
        }

    }



}