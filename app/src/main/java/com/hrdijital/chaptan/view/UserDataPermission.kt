package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App


class UserDataPermission : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //status bar






    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.user_data_permission, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //toolbar düzenleme
        toolbar_desing()
    }



    fun toolbar_desing(){
        App.toolbar_desing(R.drawable.arrow_back,
            Color.parseColor("#0072EF"),
            "Yolcu",
            Color.parseColor("#FFFFFF"),
            Color.parseColor("#0072EF"),
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE,
            requireActivity(),View.VISIBLE)

    }



}