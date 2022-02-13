package com.hrdijital.chaptan.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.Utils.PreferencesManager
import com.hrdijital.chaptan.databinding.FragmentPassRouter4Binding
import com.hrdijital.chaptan.models.DriverUser


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



    }
}