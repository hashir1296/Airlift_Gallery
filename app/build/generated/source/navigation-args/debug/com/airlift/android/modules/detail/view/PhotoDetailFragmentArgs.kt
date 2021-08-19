package com.airlift.android.modules.detail.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

data class PhotoDetailFragmentArgs(val id: Int) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): PhotoDetailFragmentArgs {
            bundle.setClassLoader(PhotoDetailFragmentArgs::class.java.classLoader)
            val __id : Int
            if (bundle.containsKey("id")) {
                __id = bundle.getInt("id")
            } else {
                throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
            }
            return PhotoDetailFragmentArgs(__id)
        }
    }
}
