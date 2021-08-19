package com.airlift.android.modules.home.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/airlift/android/modules/home/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/airlift/android/network/AirliftRepository;", "(Lcom/airlift/android/network/AirliftRepository;)V", "dataState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/airlift/android/network/NetworkResult;", "Lcom/airlift/android/modules/home/model/BrandDetailsResponse;", "getDataState", "()Landroidx/lifecycle/MutableLiveData;", "getBrandsList", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.airlift.android.network.AirliftRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.airlift.android.network.NetworkResult<com.airlift.android.modules.home.model.BrandDetailsResponse>> dataState = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.airlift.android.network.AirliftRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.airlift.android.network.NetworkResult<com.airlift.android.modules.home.model.BrandDetailsResponse>> getDataState() {
        return null;
    }
    
    private final void getBrandsList() {
    }
}