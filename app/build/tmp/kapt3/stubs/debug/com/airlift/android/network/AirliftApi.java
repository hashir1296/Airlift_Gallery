package com.airlift.android.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H\'\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u0007H\'\u00a8\u0006\r"}, d2 = {"Lcom/airlift/android/network/AirliftApi;", "", "getCuratedListOfPhotosAsync", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse;", "page", "", "per_page", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/coroutines/Deferred;", "getPhotoDetailAsync", "Lcom/airlift/android/modules/detail/model/PhotoDetailNetworkResponse;", "id", "app_debug"})
public abstract interface AirliftApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "curated")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse>> getCuratedListOfPhotosAsync(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "per_page")
    java.lang.Integer per_page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "photos/{id}")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.airlift.android.modules.detail.model.PhotoDetailNetworkResponse>> getPhotoDetailAsync(@retrofit2.http.Path(value = "id")
    int id);
}