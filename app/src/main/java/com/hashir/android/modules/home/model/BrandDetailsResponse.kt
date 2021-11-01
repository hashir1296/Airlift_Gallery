package com.hashir.android.modules.home.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandDetailsResponse(
    @Json(name = "brands")
    val brands: List<Brand?>?
) {
    @JsonClass(generateAdapter = true)
    data class Brand(
        @Json(name = "image")
        val image: String?,
        @Json(name = "name")
        val name: String?,
        @Json(name = "url")
        val url: String?
    )
}