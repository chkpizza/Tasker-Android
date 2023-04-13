package com.example.tasker_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.example.tasker_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfig: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView = binding.bnvMain

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcv_main)
        val navController = navHostFragment?.findNavController() ?: throw NullPointerException()

        appBarConfig = AppBarConfiguration(
            setOf(
                R.id.nav_main_home,
                R.id.nav_main_collection,
                R.id.nav_main_taskbook,
                R.id.nav_main_mypage
            )
        )

        bottomNavView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.nav_main_home -> {

                }
                R.id.nav_main_collection -> {

                }
                R.id.nav_main_taskbook -> {

                }
                R.id.nav_main_mypage -> {

                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fcv_main)
        return navController.navigateUp(appBarConfig) || super.onSupportNavigateUp()
    }
}