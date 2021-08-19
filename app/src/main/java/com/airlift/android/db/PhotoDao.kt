package com.airlift.android.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface PhotoDao {

    @Query("SELECT * FROM photos")
    fun getAll(): Flow<List<PhotoEntity>>

    @Insert
    suspend fun insertAll(vararg photoEntity: PhotoEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPhoto(photoEntity: PhotoEntity)

    @Delete
    suspend fun delete(photoEntity: PhotoEntity)
}