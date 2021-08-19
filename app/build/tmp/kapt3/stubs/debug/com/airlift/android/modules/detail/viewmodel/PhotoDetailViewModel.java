package com.airlift.android.modules.detail.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "id", "", "repository", "Lcom/airlift/android/network/AirliftRepository;", "(ILcom/airlift/android/network/AirliftRepository;)V", "avgColor", "Landroidx/lifecycle/MutableLiveData;", "", "getAvgColor", "()Landroidx/lifecycle/MutableLiveData;", "setAvgColor", "(Landroidx/lifecycle/MutableLiveData;)V", "imageDimens", "getImageDimens", "setImageDimens", "imageUrl", "getImageUrl", "setImageUrl", "photographer", "getPhotographer", "setPhotographer", "getPhotoDetail", "", "Factory", "PhotoDetailDetailViewModelAssistedFactory", "app_debug"})
public final class PhotoDetailViewModel extends androidx.lifecycle.ViewModel {
    private final int id = 0;
    private final com.airlift.android.network.AirliftRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> imageUrl;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> imageDimens;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> photographer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> avgColor;
    
    @dagger.assisted.AssistedInject()
    public PhotoDetailViewModel(@dagger.assisted.Assisted(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    com.airlift.android.network.AirliftRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getImageDimens() {
        return null;
    }
    
    public final void setImageDimens(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhotographer() {
        return null;
    }
    
    public final void setPhotographer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAvgColor() {
        return null;
    }
    
    public final void setAvgColor(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    private final void getPhotoDetail() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "assistedFactory", "Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel$PhotoDetailDetailViewModelAssistedFactory;", "id", "", "(Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel$PhotoDetailDetailViewModelAssistedFactory;I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory assistedFactory = null;
        private final int id = 0;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel.PhotoDetailDetailViewModelAssistedFactory assistedFactory, int id) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel$PhotoDetailDetailViewModelAssistedFactory;", "", "create", "Lcom/airlift/android/modules/detail/viewmodel/PhotoDetailViewModel;", "id", "", "app_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface PhotoDetailDetailViewModelAssistedFactory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel create(@dagger.assisted.Assisted(value = "id")
        int id);
    }
}