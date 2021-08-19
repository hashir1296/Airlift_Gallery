package com.airlift.android.modules.curatedList.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BG\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003JP\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse;", "", "nextPage", "", "prevPage", "page", "", "perPage", "photos", "", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getNextPage", "()Ljava/lang/String;", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPerPage", "getPhotos", "()Ljava/util/List;", "getPrevPage", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse;", "equals", "", "other", "hashCode", "toString", "Photo", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class CuratedPhotosNetworkResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nextPage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String prevPage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer perPage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo> photos = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "next_page")
    java.lang.String nextPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "prev_page")
    java.lang.String prevPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "photos")
    java.util.List<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo> photos) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CuratedPhotosNetworkResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "next_page")
    java.lang.String nextPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "prev_page")
    java.lang.String prevPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "per_page")
    java.lang.Integer perPage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "photos")
    java.util.List<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo> photos) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNextPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrevPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPerPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo> getPhotos() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B}\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0001\u0010+\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0014\u00a8\u00062"}, d2 = {"Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo;", "", "avgColor", "", "height", "", "id", "liked", "", "photographer", "photographerId", "photographerUrl", "src", "Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo$Src;", "url", "width", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo$Src;Ljava/lang/String;Ljava/lang/Integer;)V", "getAvgColor", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getLiked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhotographer", "getPhotographerId", "getPhotographerUrl", "getSrc", "()Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo$Src;", "getUrl", "getWidth", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo$Src;Ljava/lang/String;Ljava/lang/Integer;)Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo;", "equals", "other", "hashCode", "toString", "Src", "app_debug"})
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    public static final class Photo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String avgColor = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer height = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean liked = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String photographer = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer photographerId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String photographerUrl = null;
        @org.jetbrains.annotations.Nullable()
        private final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src src = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer width = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo copy(@org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "avg_color")
        java.lang.String avgColor, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "height")
        java.lang.Integer height, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "id")
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "liked")
        java.lang.Boolean liked, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer")
        java.lang.String photographer, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer_id")
        java.lang.Integer photographerId, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer_url")
        java.lang.String photographerUrl, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "src")
        com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src src, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "url")
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "width")
        java.lang.Integer width) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Photo(@org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "avg_color")
        java.lang.String avgColor, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "height")
        java.lang.Integer height, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "id")
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "liked")
        java.lang.Boolean liked, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer")
        java.lang.String photographer, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer_id")
        java.lang.Integer photographerId, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "photographer_url")
        java.lang.String photographerUrl, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "src")
        com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src src, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "url")
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        @com.squareup.moshi.Json(name = "width")
        java.lang.Integer width) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvgColor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getLiked() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhotographer() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPhotographerId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhotographerUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src getSrc() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWidth() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/airlift/android/modules/curatedList/model/CuratedPhotosNetworkResponse$Photo$Src;", "", "landscape", "", "large", "large2x", "medium", "original", "portrait", "small", "tiny", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLandscape", "()Ljava/lang/String;", "getLarge", "getLarge2x", "getMedium", "getOriginal", "getPortrait", "getSmall", "getTiny", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
        @com.squareup.moshi.JsonClass(generateAdapter = true)
        public static final class Src {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String landscape = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String large = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String large2x = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String medium = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String original = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String portrait = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String small = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String tiny = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.airlift.android.modules.curatedList.model.CuratedPhotosNetworkResponse.Photo.Src copy(@org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "landscape")
            java.lang.String landscape, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "large")
            java.lang.String large, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "large2x")
            java.lang.String large2x, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "medium")
            java.lang.String medium, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "original")
            java.lang.String original, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "portrait")
            java.lang.String portrait, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "small")
            java.lang.String small, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "tiny")
            java.lang.String tiny) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Src(@org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "landscape")
            java.lang.String landscape, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "large")
            java.lang.String large, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "large2x")
            java.lang.String large2x, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "medium")
            java.lang.String medium, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "original")
            java.lang.String original, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "portrait")
            java.lang.String portrait, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "small")
            java.lang.String small, @org.jetbrains.annotations.Nullable()
            @com.squareup.moshi.Json(name = "tiny")
            java.lang.String tiny) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLandscape() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLarge() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLarge2x() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMedium() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOriginal() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPortrait() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSmall() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTiny() {
                return null;
            }
        }
    }
}