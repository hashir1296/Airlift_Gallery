package com.airlift.android.di

import android.content.Context
import com.airlift.android.db.CacheMapper
import com.airlift.android.db.PhotoDao
import com.airlift.android.modules.curatedList.model.CuratedPhotoMapper
import com.airlift.android.network.AirliftApi
import com.airlift.android.network.AirliftRepository
import com.airlift.android.network.ResponseHandler
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
    fun provideElasRepository(
        airliftApi: AirliftApi,
        cacheMapper: CacheMapper,
        curatedPhotoMapper: CuratedPhotoMapper,
        photoDao: PhotoDao
    ): AirliftRepository {
        return AirliftRepository(airliftApi = airliftApi, photoDao = photoDao, curatedPhotoMapper = curatedPhotoMapper, cacheMapper = cacheMapper)
    }
}
