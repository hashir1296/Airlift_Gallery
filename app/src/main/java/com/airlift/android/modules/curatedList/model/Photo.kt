package com.airlift.android.modules.curatedList.model

data class Photo(
    val id: Int?,
    val photographerName : String?,
    var liked: Boolean?,
    val url: String?,
    val large: String?,
    val medium: String?,
    val original: String?,
    val small: String?,
)
