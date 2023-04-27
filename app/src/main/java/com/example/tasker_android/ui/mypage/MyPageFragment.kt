package com.example.tasker_android.ui.mypage

import android.view.LayoutInflater
import android.view.ViewGroup
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