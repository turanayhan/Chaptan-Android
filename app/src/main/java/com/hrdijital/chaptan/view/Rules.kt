package com.hrdijital.chaptan.view

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.adapter.CountryAdapter
import com.hrdijital.chaptan.databinding.FragmentPassRouter4Binding
import com.hrdijital.chaptan.databinding.RulesBinding
import com.hrdijital.chaptan.models.DriverRules
import com.hrdijital.chaptan.models.DriverUser
import kotlinx.android.synthetic.main.rules.*

class Rules : Fragment() {

    private lateinit var dataBinding:RulesBinding
    private val countryAdapter = CountryAdapter(arrayListOf())
    private lateinit var list:ArrayList<DriverRules>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        dataBinding= DataBindingUtil.inflate(inflater,R.layout.rules,container,false)
        return dataBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //toolbar desing
        toolbar_desing()

        dataBinding.welcomeText="Hoşgeldin,${App.manager?.getName()}"
        listRules()
        val string = resources.getString(R.string.you_are_ready_to_start)
    }

    fun toolbar_desing(){
        App.toolbar_desing(R.drawable.arrow_back,
            Color.parseColor("#000000"),
            "Chaptan",
            Color.parseColor("#FFFFFF"),
            Color.parseColor("#000000"),
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE,
            requireActivity(),View.VISIBLE)

    }



    fun listRules(){

        list= ArrayList()
        var a=DriverRules("Araç Bilgileri",true)
        var b=DriverRules("sürücü resmi",false)
        var c=DriverRules("Ruhsat belgesi",false)
        var d=DriverRules("Destek alın",false)
        list.add(a)
        list.add(b)
        list.add(c)
        list.add(d)





        countryAdapter.updateCountryList(list!!)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = countryAdapter

    }

}