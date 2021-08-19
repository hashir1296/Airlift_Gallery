package com.airlift.android.util

import android.app.Activity
import android.graphics.BitmapFactory
import android.graphics.Color
import android.util.Base64
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import coil.load
import com.airlift.android.R

@Suppress("DEPRECATION")
fun Activity.setTransparentStatusBar() {
    window.apply {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        //Only uncomment below if you want gray status bar icons
        decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN /*or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR*/
        statusBarColor = Color.TRANSPARENT
    }
}


@Suppress("DEPRECATION")
fun Activity.setWhiteStatusBar() {
    window.apply {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        statusBarColor = Color.TRANSPARENT
    }
}

fun ImageView.loadImageUsingUrl(url: String?) {

    val circularProgressDrawable = CircularProgressDrawable(context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.setColorSchemeColors(R.color.white)

    circularProgressDrawable.start()

    url?.let { imageUrl ->
        load(imageUrl) {
            placeholder(circularProgressDrawable)
        }
    }
}

fun ImageView.loadImageUsingBase64(base64: String?) {

    val circularProgressDrawable = CircularProgressDrawable(context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.setTint(ContextCompat.getColor(context, R.color.black))
    circularProgressDrawable.centerRadius = 50f
    circularProgressDrawable.start()

    base64?.let { imageBase64 ->
        val imageBytes = Base64.decode(imageBase64, Base64.DEFAULT)
        val bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)

        load(bitmap) {
            placeholder(circularProgressDrawable)
        }
    }
}

fun ImageView.isImageLiked(isLiked: Boolean) {
    when (isLiked) {
        true -> {
            setImageDrawable(ContextCompat.getDrawable(context,
                R.drawable.ic_heart_icon_filled))
        }
        false -> {
            setImageDrawable(ContextCompat.getDrawable(context,
                R.drawable.ic_heart_icon_unfilled))
        }
    }
}