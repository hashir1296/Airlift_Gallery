package com.airlift.android.network

import com.airlift.android.util.Constants
import okhttp3.Interceptor


fun headersInterceptor() = Interceptor { chain ->

    chain.proceed(
        chain.request().newBuilder().apply {
            addHeader(
                "Authorization",
                Constants.Endpoints.AUTHORIZATION_KEY
            )
            addHeader(
                "X-Ratelimit-Limit",
                "50"
            )
            addHeader(
                "X-Ratelimit-Remaining",
                "100"
            )
            addHeader(
                "X-Ratelimit-Reset",
                "90"
            )
            addHeader(
                "Accept",
                "application/json"
            )
        }.build()

    )
}
