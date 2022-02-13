package com.hrdijital.chaptan.View

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.navigation.Navigation
import com.hrdijital.chaptan.R
import com.hrdijital.chaptan.Utils.App
import com.hrdijital.chaptan.Utils.PreferencesManager
import kotlinx.android.synthetic.main.pass_router_3.*

class PassRouter_3 : Fragment() {


    val items = listOf("Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan",
        "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa",
        "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
        "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük",
        "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "Kırıkkale", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya",
        "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun",
        "Şanlıurfa", "Siirt", "Sinop", "Sivas", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat",
        "Zonguldak")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        App.manager = PreferencesManager(requireActivity())

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pass_router_3, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArrayAdapter(requireContext(), R.layout.list_city_item, items)
        (select_city.editText as? AutoCompleteTextView)?.setAdapter(adapter)


        //toolbar düzenleme
        toolbar_desing()

        btn_router_next3.setOnClickListener {


            App.manager!!.setCity(select_city.editText?.text.toString())
            var action=PassRouter_3Directions.actionPassRouter3ToPassRouter4()
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