package com.airlift.android.modules.detail.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoDetailNetworkResponse(
    @Json(name = "avg_color")
    val avgColor: String?,
    @Json(name = "height")
    val height: Int?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "liked")
    val liked: Boolean?,
    @Json(name = "photographer")
    val photographer: String?,
    @Json(name = "photographer_id")
    val photographerId: Int?,
    @Json(name = "photographer_url")
    val photographerUrl: String?,
    @Json(name = "src")
    val src: Src?,
    @Json(name = "url")
    val url: String?,
    @Json(name = "width")
    val width: Int?
) {
    @JsonClass(generateAdapter = true)
    data class Src(
        @Json(name = "landscape")
        val landscape: String?,
        @Json(name = "large")
        val large: String?,
        @Json(name = "large2x")
        val large2x: String?,
        @Json(name = "medium")
        val medium: String?,
        @Json(name = "original")
        val original: String?,
        @Json(name = "portrait")
        val portrait: String?,
        @Json(name = "small")
        val small: String?,
        @Json(name = "tiny")
        val tiny: String?
    )
}