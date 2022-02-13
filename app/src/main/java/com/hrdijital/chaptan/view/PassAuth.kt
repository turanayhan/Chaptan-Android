package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.Utils.PhoneNumberTextWatcher
import kotlinx.android.synthetic.main.pass_auth.*


class PassAuth : Fragment() {

    //geçiş objesi
    var action: NavDirections?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pass_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        //toolbar düzenleme yapıyor
       toolbar_desing()



        //buton ve text field control işlmelerini yapıyor
         ViewControl()


    }



    fun ViewControl(){
         //telefona mask işelemleri
        input_phone.addTextChangedListener(PhoneNumberTextWatcher(input_phone,helper_text_field))

        btn_traveller_phone.setOnClickListener {

            if (input_phone.length()==12){
                progressBar.visibility=View.VISIBLE
                action= PassAuthDirections.actionPassAuthToPasOtp(input_phone.text.toString())
                Navigation.findNavController(it).navigate(action!!)
                var phoneNumber = input_phone.text.toString()

            }
        }

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