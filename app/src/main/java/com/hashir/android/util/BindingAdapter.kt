package com.hashir.android.util

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.hashir.android.R
import com.google.android.material.textview.MaterialTextView

@BindingAdapter("android:setStrikeThroughTextView")
fun setStrikeThroughTextView(materialTextView: MaterialTextView, isVisible: Boolean) {
    when (isVisible) {
        true -> {
            materialTextView.visibility = View.VISIBLE
        }
        false -> {
            materialTextView.visibility = View.GONE
        }
    }

    materialTextView.paintFlags = materialTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
}

@BindingAdapter("android:setImageViewTint")
fun setImageViewTint(imageView: AppCompatImageView, isActive: Boolean) {
    val context = imageView.context
    when (isActive) {
        true -> {
            imageView.imageTintList =
                ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorPrimary))
        }
        false -> {
            imageView.imageTintList =
                ColorStateList.valueOf(ContextCompat.getColor(context, R.color.gray))
        }
    }

}

@BindingAdapter("android:loadImage")
fun loadImage(imageView: ImageView, url: String?) {
    imageView.loadImageUsingUrl(url = url)
}


@BindingAdapter("android:loadHexCode")
fun loadHexCode(imageView: ImageView, hexCode: String?) {
    hexCode?.let {
        imageView.backgroundTintList = ColorStateList.valueOf(Color.parseColor(hexCode))
    }
}

