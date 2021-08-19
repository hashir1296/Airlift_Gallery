package com.airlift.android.util

object Constants {

    object Endpoints {

        const val BASE_URL = "https://api.pexels.com/v1/"
        const val AUTHORIZATION_KEY = "563492ad6f91700001000001615e690eac4a488cba581846b293cfec"
        const val CURATED = "curated"
        const val PHOTO = "photos/{id}"
    }

    object Pagination {
        const val PAGE_SIZE = 20
        const val LOADING_CODE = 9000
    }
}