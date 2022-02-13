package com.hrdijital.chaptan

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.hrdijital.chaptan.Utils.App
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var navigationController : NavController




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.toolbar=ToolbarApp
        App.toolbar_text=tolbar_text
        setSupportActionBar(App.toolbar)


        navigationController = Navigation.findNavController(this,R.id.fragmentContainerView)
        NavigationUI.setupActionBarWithNavController(this,navigationController)




    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(navigationController,null)
    }



}