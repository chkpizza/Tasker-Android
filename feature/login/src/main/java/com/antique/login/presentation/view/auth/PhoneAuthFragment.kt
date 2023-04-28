package com.antique.login.presentation.view.auth

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.antique.common.ViewInsetsCallback
import com.antique.login.R
import com.antique.login.databinding.FragmentPhoneAuthBinding

class PhoneAuthFragment : Fragment() {
    private var _binding: FragmentPhoneAuthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_phone_auth, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        updateInsets()
        setupViewListener()
    }

    private fun updateInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.root, ViewInsetsCallback(insetTypes = WindowInsetsCompat.Type.systemBars(), insetTypes2 = WindowInsetsCompat.Type.ime()))
    }

    private fun setupViewListener() {
        binding.etPhoneNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable?) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.let {
                    if(it.length >= 11) {
                        binding.btnCodeRequest.background = AppCompatResources.getDrawable(requireActivity(), com.antique.common.R.drawable.shape_rectangle_radius_10_solid_black)
                        binding.btnCodeRequest.isEnabled = true
                        binding.tvLengthAlert.isVisible = false
                    } else {
                        binding.btnCodeRequest.background = AppCompatResources.getDrawable(requireActivity(), com.antique.common.R.drawable.shape_rectangle_radius_10_solid_gray100)
                        binding.btnCodeRequest.isEnabled = false
                        binding.tvLengthAlert.isVisible = true
                    }
                }
            }
        })

        binding.btnCodeRequest.setOnClickListener {
            //TODO 1. 버튼 Background & Text 변경
            binding.btnCodeRequest.background = AppCompatResources.getDrawable(requireActivity(), com.antique.common.R.drawable.shape_rectangle_radius_10_stroke_gray300)
            binding.btnCodeRequest.text = "인증번호 다시 받기(2회 남음)"
            binding.btnCodeRequest.setTextColor(resources.getColor(com.antique.common.R.color.gray_300, null))

            //TODO 2. Group Visibility 수정
            binding.groupAuth.isVisible = true

            //TODO 3. 인증 요정
            //TODO 4. 타이머 시작

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}