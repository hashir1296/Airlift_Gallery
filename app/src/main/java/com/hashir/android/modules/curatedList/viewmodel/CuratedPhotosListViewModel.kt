package com.hashir.android.modules.curatedList.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.hashir.android.db.CacheMapper
import com.hashir.android.modules.curatedList.adapter.CuratedPhotoDataSource
import com.hashir.android.modules.curatedList.model.CuratedPhotoMapper
import com.hashir.android.modules.curatedList.model.Photo
import com.hashir.android.network.UserRepository
import com.hashir.android.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CuratedPhotosListViewModel @Inject constructor(
    private val repository: UserRepository,
    private val cacheMapper: CacheMapper,
    private val curatedPhotoMapper: CuratedPhotoMapper,
) :
    ViewModel() {

    var listViewType = MutableLiveData(ListViewType.LIST)

    val apiData =
        Pager(PagingConfig(pageSize = Constants.Pagination.PAGE_SIZE,
            enablePlaceholders = false,
            prefetchDistance = 10,
            initialLoadSize = 20)) {
            CuratedPhotoDataSource(repository = repository,
                cacheMapper = cacheMapper,
                curatedPhotoMapper = curatedPhotoMapper)
        }.flow.cachedIn(viewModelScope)


    enum class ListViewType {
        LIST, GRID
    }

    fun updateListViewType(listviewType: ListViewType) {
        this.listViewType.value = listviewType
    }

    suspend fun savePhotoOffline(photo: Photo) {
        withContext(Dispatchers.IO) {
            repository.saveToCollection(photo = photo)
        }
    }

}