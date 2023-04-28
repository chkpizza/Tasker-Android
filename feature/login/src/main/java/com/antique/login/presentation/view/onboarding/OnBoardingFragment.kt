package com.antique.login.presentation.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.antique.login.R
import com.antique.login.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {
    private var _binding: FragmentOnBoardingBinding? = null
    private val binding get() = _binding!!

    private lateinit var onBoardingListAdapter: OnBoardingListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_on_boarding, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        setupViewPager()
        setupViewListener()
    }

    private fun setupViewPager() {
        onBoardingListAdapter = OnBoardingListAdapter()
        binding.vpOnboarding.adapter = onBoardingListAdapter
        binding.vpOnboarding.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                when(position) {
                    0 -> {
                        binding.ivFirstIndicator.setImageResource(R.drawable.shape_circle_black)
                        binding.ivSecondIndicator.setImageResource(R.drawable.shape_circle_gray150)
                        binding.ivThirdIndicator.setImageResource(R.drawable.shape_circle_gray150)
                    }
                    1 -> {
                        binding.ivFirstIndicator.setImageResource(R.drawable.shape_circle_gray150)
                        binding.ivSecondIndicator.setImageResource(R.drawable.shape_circle_black)
                        binding.ivThirdIndicator.setImageResource(R.drawable.shape_circle_gray150)
                    }
                    2 -> {
                        binding.ivFirstIndicator.setImageResource(R.drawable.shape_circle_gray150)
                        binding.ivSecondIndicator.setImageResource(R.drawable.shape_circle_gray150)
                        binding.ivThirdIndicator.setImageResource(R.drawable.shape_circle_black)
                    }
                }
            }
        })
    }

    private fun setupViewListener() {
        binding.btnAuthStart.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_phoneAuthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}