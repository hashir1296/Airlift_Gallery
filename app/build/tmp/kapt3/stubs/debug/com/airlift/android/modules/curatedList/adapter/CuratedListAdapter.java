package com.airlift.android.modules.curatedList.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/airlift/android/modules/curatedList/model/Photo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "itemClick", "Lkotlin/Function1;", "", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "setItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setLayoutManager", "saveClick", "getSaveClick", "setSaveClick", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GridViewHolder", "ListViewHolder", "ViewType", "app_debug"})
public final class CuratedListAdapter extends androidx.paging.PagingDataAdapter<com.airlift.android.modules.curatedList.model.Photo, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.GridLayoutManager layoutManager;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> saveClick;
    
    public CuratedListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.GridLayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> getSaveClick() {
        return null;
    }
    
    public final void setSaveClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "LIST", "GRID", "app_debug"})
    public static enum ViewType {
        /*public static final*/ LIST /* = new LIST() */,
        /*public static final*/ GRID /* = new GRID() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;", "(Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter;Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;)V", "getBinding", "()Lcom/airlift/android/databinding/HolderCuratedPhotoItemBinding;", "itemClick", "Lkotlin/Function1;", "Lcom/airlift/android/modules/curatedList/model/Photo;", "", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "setItemClick", "(Lkotlin/jvm/functions/Function1;)V", "saveClick", "getSaveClick", "setSaveClick", "bindView", "photo", "app_debug"})
    public final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.airlift.android.databinding.HolderCuratedPhotoItemBinding binding = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> itemClick;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> saveClick;
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        com.airlift.android.databinding.HolderCuratedPhotoItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.airlift.android.databinding.HolderCuratedPhotoItemBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> getItemClick() {
            return null;
        }
        
        public final void setItemClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> getSaveClick() {
            return null;
        }
        
        public final void setSaveClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> p0) {
        }
        
        public final void bindView(@org.jetbrains.annotations.Nullable()
        com.airlift.android.modules.curatedList.model.Photo photo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter$GridViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/airlift/android/databinding/HolderClothingItemGridViewBinding;", "(Lcom/airlift/android/modules/curatedList/adapter/CuratedListAdapter;Lcom/airlift/android/databinding/HolderClothingItemGridViewBinding;)V", "getBinding", "()Lcom/airlift/android/databinding/HolderClothingItemGridViewBinding;", "itemClick", "Lkotlin/Function1;", "Lcom/airlift/android/modules/curatedList/model/Photo;", "", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "setItemClick", "(Lkotlin/jvm/functions/Function1;)V", "bindView", "clothingItem", "app_debug"})
    public final class GridViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.airlift.android.databinding.HolderClothingItemGridViewBinding binding = null;
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> itemClick;
        
        public GridViewHolder(@org.jetbrains.annotations.NotNull()
        com.airlift.android.databinding.HolderClothingItemGridViewBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.airlift.android.databinding.HolderClothingItemGridViewBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> getItemClick() {
            return null;
        }
        
        public final void setItemClick(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.airlift.android.modules.curatedList.model.Photo, kotlin.Unit> p0) {
        }
        
        public final void bindView(@org.jetbrains.annotations.Nullable()
        com.airlift.android.modules.curatedList.model.Photo clothingItem) {
        }
    }
}