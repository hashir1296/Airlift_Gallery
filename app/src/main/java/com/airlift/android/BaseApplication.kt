package com.airlift.android

import android.app.Application
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)

        //Use timber for logging only in debug version
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    companion object {
        private var instance: BaseApplication? = null
        fun getInstance(): BaseApplication {
            synchronized(BaseApplication::class.java) {
                if (instance == null)
                    instance =
                        BaseApplication()
            }
            return instance!!
        }
    }
}