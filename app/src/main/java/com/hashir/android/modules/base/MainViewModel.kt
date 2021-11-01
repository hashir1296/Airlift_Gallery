package com.hashir.android.modules.base


import androidx.lifecycle.ViewModel
import com.hashir.android.network.UserRepository

class MainViewModel
constructor(
    private val elasRepository: UserRepository,
) : ViewModel() {

}




