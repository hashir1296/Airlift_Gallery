package com.airlift.android.modules.myCollection.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.airlift.android.db.PhotoEntity
import com.airlift.android.network.AirliftRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyCollectionListViewModel @Inject constructor(
    private val repository: AirliftRepository,
) :
    ViewModel() {

    val photos: LiveData<List<PhotoEntity>> = repository.myCollection.asLiveData()

    suspend fun deletePhotoFromCollection(photo : PhotoEntity){
        repository.deleteFromMyCollection(photo)
    }

}