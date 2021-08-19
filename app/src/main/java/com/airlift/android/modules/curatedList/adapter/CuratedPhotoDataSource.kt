package com.airlift.android.modules.curatedList.adapter

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.bumptech.glide.load.HttpException
import com.airlift.android.db.CacheMapper
import com.airlift.android.modules.curatedList.model.CuratedPhotoMapper
import com.airlift.android.modules.curatedList.model.Photo
import com.airlift.android.network.AirliftRepository
import com.airlift.android.network.NetworkResult
import com.airlift.android.util.Constants
import javax.inject.Inject

class CuratedPhotoDataSource @Inject constructor(
    private val repository: AirliftRepository,
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

