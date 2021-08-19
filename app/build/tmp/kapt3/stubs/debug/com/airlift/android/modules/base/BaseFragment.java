package com.airlift.android.modules.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u0019\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH$J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\b\u0010,\u001a\u00020\u001dH\u0016R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Lcom/airlift/android/modules/base/BaseFragment;", "Binding", "Landroidx/viewbinding/ViewBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "useSharedViewModel", "", "getUseSharedViewModel", "()Z", "setUseSharedViewModel", "(Z)V", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "setViewModel", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/lifecycle/ViewModel;", "getViewBinding", "getViewModelClass", "Ljava/lang/Class;", "init", "", "observeData", "observeView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUpViews", "setupClickListeners", "app_debug"})
public abstract class BaseFragment<Binding extends androidx.viewbinding.ViewBinding, VM extends androidx.lifecycle.ViewModel> extends androidx.fragment.app.Fragment {
    private boolean useSharedViewModel = false;
    protected VM viewModel;
    protected Binding binding;
    
    public BaseFragment() {
        super();
    }
    
    public boolean getUseSharedViewModel() {
        return false;
    }
    
    public void setUseSharedViewModel(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final Binding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    Binding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<VM> getViewModelClass();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract Binding getViewBinding();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void setUpViews() {
    }
    
    public void observeView() {
    }
    
    public void setupClickListeners() {
    }
    
    public void observeData() {
    }
    
    private final void init() {
    }
}