package com.airlift.android.modules.curatedList.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0011R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/airlift/android/modules/curatedList/viewmodel/CuratedPhotosListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/airlift/android/network/AirliftRepository;", "cacheMapper", "Lcom/airlift/android/db/CacheMapper;", "curatedPhotoMapper", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotoMapper;", "(Lcom/airlift/android/network/AirliftRepository;Lcom/airlift/android/db/CacheMapper;Lcom/airlift/android/modules/curatedList/model/CuratedPhotoMapper;)V", "apiData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/airlift/android/modules/curatedList/model/Photo;", "getApiData", "()Lkotlinx/coroutines/flow/Flow;", "listViewType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/airlift/android/modules/curatedList/viewmodel/CuratedPhotosListViewModel$ListViewType;", "kotlin.jvm.PlatformType", "getListViewType", "()Landroidx/lifecycle/MutableLiveData;", "setListViewType", "(Landroidx/lifecycle/MutableLiveData;)V", "savePhotoOffline", "", "photo", "(Lcom/airlift/android/modules/curatedList/model/Photo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateListViewType", "listviewType", "ListViewType", "app_debug"})
public final class CuratedPhotosListViewModel extends androidx.lifecycle.ViewModel {
    private final com.airlift.android.network.AirliftRepository repository = null;
    private final com.airlift.android.db.CacheMapper cacheMapper = null;
    private final com.airlift.android.modules.curatedList.model.CuratedPhotoMapper curatedPhotoMapper = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel.ListViewType> listViewType;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.airlift.android.modules.curatedList.model.Photo>> apiData = null;
    
    @javax.inject.Inject()
    public CuratedPhotosListViewModel(@org.jetbrains.annotations.NotNull()
    com.airlift.android.network.AirliftRepository repository, @org.jetbrains.annotations.NotNull()
    com.airlift.android.db.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.model.CuratedPhotoMapper curatedPhotoMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel.ListViewType> getListViewType() {
        return null;
    }
    
    public final void setListViewType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel.ListViewType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.airlift.android.modules.curatedList.model.Photo>> getApiData() {
        return null;
    }
    
    public final void updateListViewType(@org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel.ListViewType listviewType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object savePhotoOffline(@org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.curatedList.model.Photo photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/airlift/android/modules/curatedList/viewmodel/CuratedPhotosListViewModel$ListViewType;", "", "(Ljava/lang/String;I)V", "LIST", "GRID", "app_debug"})
    public static enum ListViewType {
        /*public static final*/ LIST /* = new LIST() */,
        /*public static final*/ GRID /* = new GRID() */;
        
        ListViewType() {
        }
    }
}