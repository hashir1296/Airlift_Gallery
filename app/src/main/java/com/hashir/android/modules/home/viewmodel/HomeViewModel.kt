package com.hashir.android.modules.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hashir.android.modules.home.model.BrandDetailsResponse
import com.hashir.android.network.UserRepository
import com.hashir.android.network.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: UserRepository,
) : ViewModel() {
    val dataState: MutableLiveData<NetworkResult<BrandDetailsResponse>> =
        MutableLiveData(NetworkResult.Loading())


    init {
        getBrandsList()
    }

    private fun getBrandsList() {
        /*viewModelScope.launch {
            val apiResult = repository.getBrandDetails()
            withContext(Dispatchers.Main) {
                dataState.value = NetworkResult.Loading()
                when (apiResult) {
                    is NetworkResult.Success -> {
                        dataState.value = NetworkResult.Success(data = apiResult.data)
                    }
                    is NetworkResult.Error -> {
                        dataState.value =
                            NetworkResult.Error(message = apiResult.message, code = apiResult.code)
                    }
                    is NetworkResult.Loading -> {
                        dataState.value = NetworkResult.Loading()
                    }
                }
            }
        }*/
    }


}