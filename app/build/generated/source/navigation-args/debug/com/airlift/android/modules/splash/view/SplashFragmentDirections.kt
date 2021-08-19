package com.airlift.android.modules.splash.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.airlift.android.R

class SplashFragmentDirections private constructor() {
    companion object {
        fun actionSplashFragmentToHomeFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment)
    }
}
