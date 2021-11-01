package com.hashir.android.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PhotoEntity::class], version = 1)
abstract class PhotoDatabase : RoomDatabase(){
    abstract fun photoDao() : PhotoDao

    companion object{
        const val DATABASE_NAME: String = "photo_db"
    }
}