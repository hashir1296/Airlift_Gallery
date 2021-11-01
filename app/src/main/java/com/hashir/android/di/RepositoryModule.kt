package com.hashir.android.di

import android.content.Context
import com.hashir.android.db.CacheMapper
import com.hashir.android.db.PhotoDao
import com.hashir.android.modules.curatedList.model.CuratedPhotoMapper
import com.hashir.android.network.ApiInterface
import com.hashir.android.network.UserRepository
import com.hashir.android.network.ResponseHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideResponseHandler(@ApplicationContext context: Context): ResponseHandler {
        return ResponseHandler(context = context)
    }

    @Singleton
    @Provides
    fun provideAirliftRepository(
        apiInterface: ApiInterface,
        cacheMapper: CacheMapper,
        curatedPhotoMapper: CuratedPhotoMapper,
        photoDao: PhotoDao
    ): UserRepository {
        return UserRepository(apiInterface = apiInterface, photoDao = photoDao, curatedPhotoMapper = curatedPhotoMapper, cacheMapper = cacheMapper)
    }
}
