package com.airlift.android.di

import android.content.Context
import com.airlift.android.BuildConfig
import com.airlift.android.network.ConnectivityInterceptor
import com.airlift.android.network.AirliftApi
import com.airlift.android.network.headersInterceptor
import com.airlift.android.util.Constants
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient(@ApplicationContext context: Context): OkHttpClient {
        val okBuilder = OkHttpClient.Builder()
        okBuilder.connectTimeout(30, TimeUnit.SECONDS)
        okBuilder.readTimeout(30, TimeUnit.SECONDS)
        okBuilder.addInterceptor(headersInterceptor())
        okBuilder.addInterceptor(ConnectivityInterceptor(context))

        //Only log apis when in debug mode
        if (BuildConfig.BUILD_TYPE == "debug") {
            okBuilder.addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            okBuilder.addNetworkInterceptor(StethoInterceptor())
        }
        return okBuilder.build()
    }

    @Singleton
    @Provides
    fun provideMoshiBuilder(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(moshi: Moshi, httpClient: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(Constants.Endpoints.BASE_URL)
            .client(httpClient)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
    }

    @Singleton
    @Provides
    fun provideAirliftService(retrofit: Retrofit.Builder): AirliftApi {
        return retrofit
            .build()
            .create(AirliftApi::class.java)
    }
}
