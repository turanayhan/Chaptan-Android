package com.hrdijital.chaptan.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.databinding.ItemRulesBinding
import com.hrdijital.chaptan.models.DriverRules
import com.hrdijital.chaptan.models.DriverUser


class CountryAdapter(val countryList: ArrayList<DriverRules>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(var view:ItemRulesBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        //val view = inflater.inflate(R.layout.item_country,parent,false)
        val view = DataBindingUtil.inflate<ItemRulesBinding>(inflater, R.layout.item_rules,parent,false)
        return CountryViewHolder(view)

    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        holder.view.driverUser = countryList[position]


    }


    fun updateCountryList(newCountryList: ArrayList<DriverRules>) {
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }


}