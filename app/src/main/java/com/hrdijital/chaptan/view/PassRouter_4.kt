package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.Utils.PreferencesManager
import com.hrdijital.chaptan.databinding.FragmentPassRouter4Binding
import com.hrdijital.chaptan.models.DriverUser
import kotlinx.android.synthetic.main.fragment_pass_router_4.*
import kotlinx.android.synthetic.main.pass_router_3.*


class PassRouter_4 : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var dataBinding:FragmentPassRouter4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.manager = PreferencesManager(requireActivity())


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_pass_router_4,container,false)
        return dataBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.driverUser= DriverUser(App.manager?.getName()+" "+App.manager?.getSurname(),App.manager?.getCity(),App.manager?.getMail())

      //toolbar düzenleme
        toolbar_desing()

        btn_later.setOnClickListener {


            var action=PassRouter_4Directions.actionPassRouter4ToRules()
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