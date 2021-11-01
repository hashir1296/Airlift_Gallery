package com.hashir.android.network

import com.hashir.android.db.CacheMapper
import com.hashir.android.db.PhotoDao
import com.hashir.android.db.PhotoEntity
import com.hashir.android.modules.curatedList.model.CuratedPhotoMapper
import com.hashir.android.modules.curatedList.model.CuratedPhotosNetworkResponse
import com.hashir.android.modules.curatedList.model.Photo
import com.hashir.android.modules.detail.model.PhotoDetailNetworkResponse
import kotlinx.coroutines.flow.Flow
import timber.log.Timber

class UserRepository
constructor(
    private val apiInterface: ApiInterface,
    private val cacheMapper: CacheMapper,
    private val curatedPhotoMapper: CuratedPhotoMapper,
    private val photoDao: PhotoDao,
) {

    suspend fun getCuratedListOfPhotos(
        page: Int?,
        per_page: Int?,
    ): NetworkResult<CuratedPhotosNetworkResponse> {
        return try {
            val api = apiInterface.getCuratedListOfPhotosAsync(
                page = page,
                per_page = per_page
            ).await()

            if (api.isSuccessful) {
                NetworkResult.Success(data = api.body())
            } else {
                NetworkResult.Error(message = api.message(), code = api.code())
            }
        } catch (ex: java.lang.Exception) {
            NetworkResult.Error(message = ex.message)
        }
    }

    suspend fun saveToCollection(photo: Photo) {
        photoDao.insertPhoto(cacheMapper.mapToEntity(photo))
    }

    val myCollection: Flow<List<PhotoEntity>> = photoDao.getAll()

    suspend fun deleteFromMyCollection(photo: PhotoEntity) {
        photoDao.delete(photo)
    }

    suspend fun getPhotoDetail(
        id: Int,
    ): NetworkResult<PhotoDetailNetworkResponse> {
        return try {
            val api = apiInterface.getPhotoDetailAsync(
                id = id
            ).await()

            if (api.isSuccessful) {
                NetworkResult.Success(data = api.body())
            } else {
                NetworkResult.Error(message = api.message(), code = api.code())
            }
        } catch (ex: java.lang.Exception) {
            Timber.d("Detail exception: ${ex.localizedMessage}")
            NetworkResult.Error(message = ex.message)
        }
    }
}