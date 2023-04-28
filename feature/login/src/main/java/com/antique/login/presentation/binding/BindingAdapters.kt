package com.antique.login.presentation.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapters {
    @JvmStatic
    @BindingAdapter("image_resource")
    fun bindImageResource(imageView: ImageView, res: Int) {
        Glide.with(imageView.context)
            .load(res)
            .into(imageView)
    }

}