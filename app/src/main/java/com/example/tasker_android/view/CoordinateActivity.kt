package com.example.tasker_android.view

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import com.example.tasker_android.R
import com.example.tasker_android.databinding.ActivityCoordinateBinding

class CoordinateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoordinateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coordinate)

        initialize()
    }

    private fun initialize() {
        makeEdgeScreen()
    }

    private fun makeEdgeScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
        } else {
            binding.root.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        }
    }
}