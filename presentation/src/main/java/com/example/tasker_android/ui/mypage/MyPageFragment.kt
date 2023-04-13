package com.example.tasker_android.ui.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasker_android.R
import com.example.tasker_android.base.BaseFragment
import com.example.tasker_android.databinding.FragmentMyPageBinding

class MyPageFragment : BaseFragment<FragmentMyPageBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentMyPageBinding {
        return FragmentMyPageBinding.inflate(inflater, container, false)
    }


}