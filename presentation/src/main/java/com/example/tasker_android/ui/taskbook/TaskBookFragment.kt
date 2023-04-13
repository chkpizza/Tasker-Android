package com.example.tasker_android.ui.taskbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasker_android.R
import com.example.tasker_android.base.BaseFragment
import com.example.tasker_android.databinding.FragmentTaskBookBinding

class TaskBookFragment : BaseFragment<FragmentTaskBookBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentTaskBookBinding {
        return FragmentTaskBookBinding.inflate(inflater, container, false)
    }

}