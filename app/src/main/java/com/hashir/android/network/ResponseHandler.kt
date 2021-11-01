package com.hashir.android.network

import android.content.Context
import com.hashir.android.R
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException


open class ResponseHandler(private val context: Context) {
    fun <T : Any> handleSuccess(data: T?, responseCode: Int): Resource<T> {
        return Resource.success(data, responseCode)
    }

    fun <T : Any> handleException(e: Exception): Resource<T> {
        return when (e) {
            is HttpException -> Resource.error(e.localizedMessage ?: "", null, -5)
            is ConnectivityInterceptor.NoNetworkException -> Resource.noInternetConnection(
                context.getString(R.string.no_internet_connection),
                null,
                -1
            )
            is UnknownHostException -> Resource.noInternetConnection(
                "Unknown host",
                null,
                -2
            )
            is ConnectException -> Resource.noInternetConnection(
                "No internet connection",
                null,
                -3
            )
            is SocketTimeoutException -> Resource.error(
                "Socket timeout",
                null,
                -4
            )
            else -> Resource.error("Something went wrong", null, -1)
        }
    }

    fun <T : Any> handleException(message: String): Resource<T> {
        return Resource.error(message, null, -1)
    }

    fun <T : Any> handleException(statusCode: Int): Resource<T> {
        return Resource.error("Exception occurred", null, statusCode)
    }
}
