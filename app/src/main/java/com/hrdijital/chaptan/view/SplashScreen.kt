package com.hrdijital.chaptan.View

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R


class SplashScreen : Fragment() {

    var action: NavDirections?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)







    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.splash_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //splash ekranını 3 saniye  bekletme.
        object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }
            override fun onFinish() {
                //sayfa geçişlerinde kullanıyoruz.
                action= SplashScreenDirections.actionSplashScreenToLaunchScreen()
                Navigation.findNavController(view).navigate(action!!)
            }
        }.start()
    }
}