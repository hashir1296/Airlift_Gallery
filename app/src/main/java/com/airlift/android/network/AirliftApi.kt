package com.airlift.android.network

import com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse
import com.airlift.android.modules.detail.model.PhotoDetailNetworkResponse
import com.airlift.android.util.Constants
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AirliftApi {


    @GET(Constants.Endpoints.CURATED)
    fun getCuratedListOfPhotosAsync(
        @Query("page") page: Int?,
        @Query("per_page") per_page: Int?,
    ): Deferred<Response<CuratedPhotosNetworkResponse>>


    @GET(Constants.Endpoints.PHOTO)
    fun getPhotoDetailAsync(
        @Path("id") id: Int,
    ): Deferred<Response<PhotoDetailNetworkResponse>>

}