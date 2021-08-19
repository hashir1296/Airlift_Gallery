package com.airlift.android.modules.myCollection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0014\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/airlift/android/modules/myCollection/MyCollectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/airlift/android/db/PhotoEntity;", "Lcom/airlift/android/modules/myCollection/MyCollectionAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "deleteClick", "Lkotlin/Function1;", "", "getDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "itemClick", "getItemClick", "setItemClick", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyCollectionDiffUtil", "ViewHolder", "app_debug"})
public final class MyCollectionAdapter extends androidx.recyclerview.widget.ListAdapter<com.airlift.android.db.PhotoEntity, com.airlift.android.modules.myCollection.MyCollectionAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> deleteClick;
    
    public MyCollectionAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.airlift.android.db.PhotoEntity, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.airlift.android.db.PhotoEntity, kotlin.Unit> getDeleteClick() {
        return null;
    }
    
    public final void setDeleteClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.airlift.android.modules.myCollection.MyCollectionAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.airlift.android.modules.myCollection.MyCollectionAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/airlift/android/modules/myCollection/MyCollectionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;", "(Lcom/airlift/android/modules/myCollection/MyCollectionAdapter;Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;)V", "getBinding", "()Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;", "deleteClick", "Lkotlin/Function1;", "Lcom/airlift/android/db/PhotoEntity;", "", "getDeleteClick", "()Lkotlin/jvm/functions/Function1;", "setDeleteClick", "(Lkotlin/jvm/functions/Function1;)V", "itemClick", "getItemClick", "setItemClick", "bindView", "photo", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.airlift.android.databinding.HolderCuratedPhotoItemBinding binding = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> itemClick;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> deleteClick;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.airlift.android.databinding.HolderCuratedPhotoItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.airlift.android.databinding.HolderCuratedPhotoItemBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.airlift.android.db.PhotoEntity, kotlin.Unit> getItemClick() {
            return null;
        }
        
        public final void setItemClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.airlift.android.db.PhotoEntity, kotlin.Unit> getDeleteClick() {
            return null;
        }
        
        public final void setDeleteClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.airlift.android.db.PhotoEntity, kotlin.Unit> p0) {
        }
        
        public final void bindView(@org.jetbrains.annotations.Nullable()
        com.airlift.android.db.PhotoEntity photo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/airlift/android/modules/myCollection/MyCollectionAdapter$MyCollectionDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/airlift/android/db/PhotoEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MyCollectionDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.airlift.android.db.PhotoEntity> {
        
        public MyCollectionDiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.airlift.android.db.PhotoEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.airlift.android.db.PhotoEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.airlift.android.db.PhotoEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.airlift.android.db.PhotoEntity newItem) {
            return false;
        }
    }
}