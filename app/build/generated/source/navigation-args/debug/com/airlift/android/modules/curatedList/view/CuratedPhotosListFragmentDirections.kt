package com.airlift.android.modules.curatedList.view

import android.os.Bundle
import androidx.navigation.NavDirections
import com.airlift.android.R
import kotlin.Int
import kotlin.String

class CuratedPhotosListFragmentDirections private constructor() {
    private data class ActionClothingListFragmentToClothingDetailFragment(val brandName: String, val
            url: String) : NavDirections {
        override fun getActionId(): Int = R.id.action_clothingListFragment_to_clothingDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("brandName", this.brandName)
            result.putString("url", this.url)
            return result
        }
    }

    companion object {
        fun actionClothingListFragmentToClothingDetailFragment(brandName: String, url: String):
                NavDirections = ActionClothingListFragmentToClothingDetailFragment(brandName, url)
    }
}
