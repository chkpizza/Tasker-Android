package com.antique.login.presentation.view.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.antique.login.R
import com.antique.login.databinding.ListItemOnboardingBinding

class OnBoardingListAdapter : RecyclerView.Adapter<OnBoardingListAdapter.OnBoardingListViewHolder>() {
    private val items = mutableListOf<Int>().apply {
        add(R.drawable.onboarding1)
        add(R.drawable.onboarding1)
        add(R.drawable.onboarding1)
    }
    inner class OnBoardingListViewHolder(private val binding: ListItemOnboardingBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Int) {
            binding.image = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingListViewHolder {
        val binding = DataBindingUtil.inflate<ListItemOnboardingBinding>(LayoutInflater.from(parent.context), R.layout.list_item_onboarding, parent, false)
        return OnBoardingListViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: OnBoardingListViewHolder, position: Int) {
        holder.bind(items[position])
    }

}