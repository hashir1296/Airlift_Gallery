package com.airlift.android.modules.curatedList.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u0002H\u0014J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/airlift/android/modules/curatedList/view/CuratedPhotosListFragment;", "Lcom/airlift/android/modules/base/BaseFragment;", "Lcom/airlift/android/databinding/FragmentCuratedPhotosListBinding;", "Lcom/airlift/android/modules/curatedList/viewmodel/CuratedPhotosListViewModel;", "()V", "adapter", "Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter;", "dialog", "Landroid/app/Dialog;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "zoomedImageView", "Lcom/alexvasilkov/gestures/views/GestureImageView;", "getViewBinding", "getViewModelClass", "Ljava/lang/Class;", "observeData", "", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpViews", "setupClickListeners", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CuratedPhotosListFragment extends com.airlift.android.modules.base.BaseFragment<com.airlift.android.databinding.FragmentCuratedPhotosListBinding, com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel> {
    private com.airlift.android.modules.curatedList.adapter.CuratedListAdapter adapter;
    private androidx.recyclerview.widget.GridLayoutManager layoutManager;
    private android.app.Dialog dialog;
    private com.alexvasilkov.gestures.views.GestureImageView zoomedImageView;
    
    public CuratedPhotosListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Class<com.airlift.android.modules.curatedList.viewmodel.CuratedPhotosListViewModel> getViewModelClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.airlift.android.databinding.FragmentCuratedPhotosListBinding getViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setUpViews() {
    }
    
    @java.lang.Override()
    public void setupClickListeners() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
}