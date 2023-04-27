package com.example.tasker_android.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.tasker_android.base.BaseFragment
import com.example.tasker_android.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

}