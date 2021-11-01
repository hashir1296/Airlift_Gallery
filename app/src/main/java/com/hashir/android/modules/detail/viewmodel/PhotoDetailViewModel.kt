package com.hashir.android.modules.detail.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.hashir.android.network.UserRepository
import com.hashir.android.network.NetworkResult
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PhotoDetailViewModel @AssistedInject constructor(
    @Assisted("id") private val id: Int,
    private val repository: UserRepository,
) :
    ViewModel() {


    var imageUrl = MutableLiveData<String>()
    var imageDimens = MutableLiveData<String>()
    var photographer = MutableLiveData<String>()
    var avgColor = MutableLiveData<String>()


    init {
        getPhotoDetail()
    }

    private fun getPhotoDetail() {
        viewModelScope.launch {
            val apiResult = repository.getPhotoDetail(id = id)
            withContext(Dispatchers.Main) {
                when (apiResult) {
                    is NetworkResult.Success -> {
                        imageUrl.value = apiResult.data?.src?.large ?: ""
                        apiResult.data?.height?.let {
                            imageDimens.value = it.toString() + apiResult.data.width.toString()
                        }
                        avgColor.value = apiResult.data?.avgColor ?: ""
                        photographer.value = apiResult.data?.photographer ?: ""

                    }
                    is NetworkResult.Error -> {

                    }
                    is NetworkResult.Loading -> {

                    }
                }
            }
        }

    }

    class Factory(
        private val assistedFactory: PhotoDetailDetailViewModelAssistedFactory,
        private val id: Int,

        ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return assistedFactory.create(id = id) as T
        }
    }

    @AssistedFactory
    interface PhotoDetailDetailViewModelAssistedFactory {
        fun create(
            @Assisted("id") id: Int,
        ): PhotoDetailViewModel
    }
}