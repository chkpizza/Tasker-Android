package com.example.tasker_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.tasker_android.R
import com.example.tasker_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        val navController = navHostFragment.navController
        navController.addOnDestinationChangedListener { _, destination, _->
            when(destination.id) {
                com.antique.home.R.id.homeFragment -> { binding.bnvMain.isVisible = true }
                com.antique.collection.R.id.collectionFragment -> { binding.bnvMain.isVisible = true }
                com.antique.taskbook.R.id.taskBookFragment -> { binding.bnvMain.isVisible = true }
                com.antique.mypage.R.id.myPageFragment -> { binding.bnvMain.isVisible = true }
                else -> binding.bnvMain.isVisible = false
            }
        }

        binding.bnvMain.setupWithNavController(navController)
    }
}