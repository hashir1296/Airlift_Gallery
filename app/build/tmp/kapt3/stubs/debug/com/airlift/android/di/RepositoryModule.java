package com.airlift.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/airlift/android/di/RepositoryModule;", "", "()V", "provideElasRepository", "Lcom/airlift/android/network/AirliftRepository;", "airliftApi", "Lcom/airlift/android/network/AirliftApi;", "cacheMapper", "Lcom/airlift/android/db/CacheMapper;", "curatedPhotoMapper", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotoMapper;", "photoDao", "Lcom/airlift/android/db/PhotoDao;", "provideResponseHandler", "Lcom/airlift/android/network/ResponseHandler;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.airlift.android.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.airlift.android.network.ResponseHandler provideResponseHandler(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.airlift.android.network.AirliftRepository provideElasRepository(@org.jetbrains.annotations.NotNull()
    com.airlift.android.network.AirliftApi airliftApi, @org.jetbrains.annotations.NotNull()
    com.airlift.android.db.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.model.CuratedPhotoMapper curatedPhotoMapper, @org.jetbrains.annotations.NotNull()
    com.airlift.android.db.PhotoDao photoDao) {
        return null;
    }
}