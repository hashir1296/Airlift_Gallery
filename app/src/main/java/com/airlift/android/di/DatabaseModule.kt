package com.airlift.android.di

import android.content.Context
import androidx.room.Room
import com.airlift.android.db.PhotoDao
import com.airlift.android.db.PhotoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun providePhotoDb(@ApplicationContext context: Context): PhotoDatabase {
        return Room.databaseBuilder(
            context, PhotoDatabase::class.java,
            PhotoDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providePhotoDAO(photoDatabase: PhotoDatabase): PhotoDao {
        return photoDatabase.photoDao()
    }
}