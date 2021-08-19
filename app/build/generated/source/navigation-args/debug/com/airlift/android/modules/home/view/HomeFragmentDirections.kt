package com.airlift.android.modules.home.view

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.airlift.android.R
import kotlin.Int

class HomeFragmentDirections private constructor() {
    private data class ActionHomeFragmentToPhotoDetailFragment(val id: Int) : NavDirections {
        override fun getActionId(): Int = R.id.action_homeFragment_to_photoDetailFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putInt("id", this.id)
            return result
        }
    }

    companion object {
        fun actionHomeFragmentToClothingListFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_homeFragment_to_clothingListFragment)

        fun actionHomeFragmentToPhotoDetailFragment(id: Int): NavDirections =
                ActionHomeFragmentToPhotoDetailFragment(id)
    }
}
