package com.example.tasker_android.ui.collection

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.tasker_android.base.BaseFragment
import com.example.tasker_android.databinding.FragmentCollectionBinding

class CollectionFragment : BaseFragment<FragmentCollectionBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentCollectionBinding {
        return FragmentCollectionBinding.inflate(inflater, container, false)
    }
}