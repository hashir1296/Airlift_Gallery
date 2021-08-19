package com.airlift.android.modules.curatedList.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandItemDetailResponse(
    @Json(name = "Success")
    val success: Success?
) {
    @JsonClass(generateAdapter = true)
    data class Success(
        @Json(name = "color")
        val color: String?,
        @Json(name = "details")
        val details: List<String?>?,
        @Json(name = "images")
        val images: List<String?>?,
        @Json(name = "original_price")
        val originalPrice: String?,
        @Json(name = "path")
        val path: List<String?>?,
        @Json(name = "sale_price")
        val salePrice: String?,
        @Json(name = "sku")
        val sku: String?,
        @Json(name = "title")
        val title: String?,
        @Json(name = "url")
        val url: String?
    )
}