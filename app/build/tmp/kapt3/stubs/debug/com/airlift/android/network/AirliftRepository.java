package com.airlift.android.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u001e\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/airlift/android/network/AirliftRepository;", "", "airliftApi", "Lcom/airlift/android/network/AirliftApi;", "cacheMapper", "Lcom/airlift/android/db/CacheMapper;", "curatedPhotoMapper", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotoMapper;", "photoDao", "Lcom/airlift/android/db/PhotoDao;", "(Lcom/airlift/android/network/AirliftApi;Lcom/airlift/android/db/CacheMapper;Lcom/airlift/android/modules/curatedList/model/CuratedPhotoMapper;Lcom/airlift/android/db/PhotoDao;)V", "myCollection", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/airlift/android/db/PhotoEntity;", "getMyCollection", "()Lkotlinx/coroutines/flow/Flow;", "deleteFromMyCollection", "", "photo", "(Lcom/airlift/android/db/PhotoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCuratedListOfPhotos", "Lcom/airlift/android/network/NetworkResult;", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse;", "page", "", "per_page", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotoDetail", "Lcom/airlift/android/modules/detail/model/PhotoDetailNetworkResponse;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToCollection", "Lcom/airlift/android/modules/curatedList/model/Photo;", "(Lcom/airlift/android/modules/curatedList/model/Photo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AirliftRepository {
    private final com.airlift.android.network.AirliftApi airliftApi = null;
    private final com.airlift.android.db.CacheMapper cacheMapper = null;
    private final com.airlift.android.modules.curatedList.model.CuratedPhotoMapper curatedPhotoMapper = null;
    private final com.airlift.android.db.PhotoDao photoDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.airlift.android.db.PhotoEntity>> myCollection = null;
    
    public AirliftRepository(@org.jetbrains.annotations.NotNull()
    com.airlift.android.network.AirliftApi airliftApi, @org.jetbrains.annotations.NotNull()
    com.airlift.android.db.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.model.CuratedPhotoMapper curatedPhotoMapper, @org.jetbrains.annotations.NotNull()
    com.airlift.android.db.PhotoDao photoDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCuratedListOfPhotos(@org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer per_page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.airlift.android.network.NetworkResult<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveToCollection(@org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.model.Photo photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.airlift.android.db.PhotoEntity>> getMyCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFromMyCollection(@org.jetbrains.annotations.NotNull()
    com.airlift.android.db.PhotoEntity photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPhotoDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.airlift.android.network.NetworkResult<com.airlift.android.modules.detail.model.PhotoDetailNetworkResponse>> p1) {
        return null;
    }
}