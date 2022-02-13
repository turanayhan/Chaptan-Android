package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import kotlinx.android.synthetic.main.pas_otp.*


class PasOtp : Fragment() {

   private lateinit var  gsm_no:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        return inflater.inflate(R.layout.pas_otp, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //toolbar düzenleme yapıyor
        toolbar_desing()



        arguments?.let {
           gsm_no=PasOtpArgs.fromBundle(it).gsmNo
            gsm_no_code.setText("${gsm_no} telefonu numaranızı gönderilen 6 haneli kodu doğrulayın")
        }

       //sayfa açıldığında sayaç başlatıyor
        CounterControl(view)

       send_again.setOnClickListener {
           count_text.visibility=View.VISIBLE
           CounterControl(it)

       }





    }



    fun CounterControl(view: View){
        object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var count= (millisUntilFinished.toInt()/1000).toString()
                count_text.text="Kalan süre: $count"
            }
            override fun onFinish() {
                count_text.visibility=View.GONE
                send_again.isEnabled=true
                send_again.setBackgroundColor(Color.parseColor("#0072EF"))
                send_again.setTextColor(Color.WHITE)

                var action=PasOtpDirections.actionPasOtpToNotificationPermission()
                Navigation.findNavController(view).navigate(action)

            }
        }.start()

    }


    fun toolbar_desing(){
        App.toolbar_desing(R.drawable.arrow_back_black,
            Color.parseColor("#FFFFFF"),
            "Yolcu",
            Color.parseColor("#000000"),
            Color.parseColor("#FFFFFF"),
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR,
            requireActivity(),View.VISIBLE)

    }




}