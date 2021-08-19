package com.airlift.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007\u00a8\u0006\u0010"}, d2 = {"loadHexCode", "", "imageView", "Landroid/widget/ImageView;", "hexCode", "", "loadImage", "url", "setImageViewTint", "Landroidx/appcompat/widget/AppCompatImageView;", "isActive", "", "setStrikeThroughTextView", "materialTextView", "Lcom/google/android/material/textview/MaterialTextView;", "isVisible", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"android:setStrikeThroughTextView"})
    public static final void setStrikeThroughTextView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textview.MaterialTextView materialTextView, boolean isVisible) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:setImageViewTint"})
    public static final void setImageViewTint(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView imageView, boolean isActive) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:loadHexCode"})
    public static final void loadHexCode(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String hexCode) {
    }
}