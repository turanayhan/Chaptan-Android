package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.Utils.PreferencesManager
import kotlinx.android.synthetic.main.pass_router_1.*


class PassRouter_1 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        App.manager = PreferencesManager(requireActivity())

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pass_router_1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         //toolbar düzenleme
        toolbar_desing()

        btn_router_next1.setOnClickListener {

            outlinedTextField_name.addOnEditTextAttachedListener {

            }
            App.manager!!.setName(outlinedTextField_name.editText?.text.toString())
            App.manager!!.setSurname(outlinedTextField_surname.editText?.text.toString())


            var action=PassRouter_1Directions.actionPassRouter1ToPassRouter2()
            Navigation.findNavController(it).navigate(action)


        }


    }



        fun toolbar_desing(){
            App.toolbar_desing(R.drawable.arrow_back_black,
                Color.parseColor("#FFFFFF"),
                "Sürücü",
                Color.parseColor("#000000"),
                Color.parseColor("#FFFFFF"),
                View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR,
                requireActivity(),View.VISIBLE)

        }


}