package com.hashir.android.modules.curatedList.adapter

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.bumptech.glide.load.HttpException
import com.hashir.android.db.CacheMapper
import com.hashir.android.modules.curatedList.model.CuratedPhotoMapper
import com.hashir.android.modules.curatedList.model.Photo
import com.hashir.android.network.UserRepository
import com.hashir.android.network.NetworkResult
import com.hashir.android.util.Constants
import javax.inject.Inject

class CuratedPhotoDataSource @Inject constructor(
    private val repository: UserRepository,
    private val cacheMapper: CacheMapper,
    private val curatedPhotoMapper: CuratedPhotoMapper,
) :
    PagingSource<Int, Photo>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Photo> {
        return try {
            val pageNumber = params.key ?: 0


            val api = repository.getCuratedListOfPhotos(
                page = pageNumber,
                per_page = Constants.Pagination.PAGE_SIZE)
            when (api) {
                is NetworkResult.Success -> {
                    val apiData = api.data
                    val listing: List<Photo> =
                        curatedPhotoMapper.mapFromEntityList(apiData?.photos!!)

                    LoadResult.Page(
                        data = listing,
                        nextKey = if (api.data.nextPage == null) null else pageNumber + 1,
                        prevKey = if (pageNumber > 0) pageNumber - 1 else null

                    )
                }

                is NetworkResult.Error -> {
                    LoadResult.Error(HttpException(api.code!!))
                }

                is NetworkResult.Loading -> {
                    LoadResult.Error(HttpException(Constants.Pagination.LOADING_CODE))
                }
            }

        } catch (ex: Exception) {
            return LoadResult.Error(ex)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Photo>): Int? {
        return null
    }

    override val keyReuseSupported: Boolean
        get() = true
}

