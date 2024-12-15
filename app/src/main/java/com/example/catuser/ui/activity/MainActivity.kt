package com.example.catuser.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.catuser.R
import com.example.catuser.databinding.ActivityMainBinding
import com.example.catuser.ui.fragments.BottomSheetDialog
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


   private lateinit var binding: ActivityMainBinding
    private lateinit var navController : NavController

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment

        navController = navHostFragment.navController
        val btnNavView = findViewById<BottomNavigationView>(R.id.btn_nav2)
        val controller = findNavController(R.id.nav_host_fragment_activity_main)
        btnNavView.setupWithNavController(controller)

        binding.btnNav2.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.entrance_Fragment -> {
                    navController.navigate(R.id.entrance_Fragment)
                    true
                }
                R.id.registration_Fragment -> {
                    navController.navigate(R.id.registration_Fragment)
                    true
                }
                R.id.nav_bottom -> {
                    val bottomSheetDialog = BottomSheetDialog()
                    bottomSheetDialog.show(supportFragmentManager, "BottomSheetDialog")
                    true
                }
                else -> false
            }
        }

    }

}