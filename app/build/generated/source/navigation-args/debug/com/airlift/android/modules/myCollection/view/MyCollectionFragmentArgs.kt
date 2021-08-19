package com.airlift.android.modules.myCollection.view

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class MyCollectionFragmentArgs(val brandName: String, val url: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("brandName", this.brandName)
        result.putString("url", this.url)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): MyCollectionFragmentArgs {
            bundle.setClassLoader(MyCollectionFragmentArgs::class.java.classLoader)
            val __brandName : String?
            if (bundle.containsKey("brandName")) {
                __brandName = bundle.getString("brandName")
                if (__brandName == null) {
                    throw IllegalArgumentException("Argument \"brandName\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"brandName\" is missing and does not have an android:defaultValue")
            }
            val __url : String?
            if (bundle.containsKey("url")) {
                __url = bundle.getString("url")
                if (__url == null) {
                    throw IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue")
            }
            return MyCollectionFragmentArgs(__brandName, __url)
        }
    }
}
