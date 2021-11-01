package com.hashir.android.network


import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class ErrorModel(
    @Json(name = "message")
    val message: String?,
    @Json(name = "status")
    val status: Int?,
    @Json(name = "success")
    val success: Boolean?
)