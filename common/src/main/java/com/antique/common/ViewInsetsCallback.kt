package com.antique.common

import android.view.View
import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsCompat

class ViewInsetsCallback(
    private val insetTypes: Int,
    private val insetTypes2: Int
) : OnApplyWindowInsetsListener {
    override fun onApplyWindowInsets(v: View, windowInsets: WindowInsetsCompat): WindowInsetsCompat {
        val types = insetTypes or insetTypes2
        val typeInsets = windowInsets.getInsets(types)
        v.setPadding(typeInsets.left, typeInsets.top, typeInsets.right, typeInsets.bottom)

        return WindowInsetsCompat.CONSUMED
    }
}