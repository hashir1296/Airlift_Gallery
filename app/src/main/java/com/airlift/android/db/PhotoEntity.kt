package com.airlift.android.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "url") val url: String?,
    @ColumnInfo(name = "large") val large: String?,
    @ColumnInfo(name = "medium") val medium: String?,
    @ColumnInfo(name = "original") val original: String?,
    @ColumnInfo(name = "small") val small: String?,
    @ColumnInfo(name = "photographerName") val photographerName: String?,
)