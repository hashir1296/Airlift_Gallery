package com.airlift.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/airlift/android/util/Constants;", "", "()V", "Endpoints", "Pagination", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.airlift.android.util.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/airlift/android/util/Constants$Endpoints;", "", "()V", "AUTHORIZATION_KEY", "", "BASE_URL", "CURATED", "PHOTO", "app_debug"})
    public static final class Endpoints {
        @org.jetbrains.annotations.NotNull()
        public static final com.airlift.android.util.Constants.Endpoints INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.pexels.com/v1/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AUTHORIZATION_KEY = "563492ad6f91700001000001615e690eac4a488cba581846b293cfec";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CURATED = "curated";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PHOTO = "photos/{id}";
        
        private Endpoints() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/airlift/android/util/Constants$Pagination;", "", "()V", "LOADING_CODE", "", "PAGE_SIZE", "app_debug"})
    public static final class Pagination {
        @org.jetbrains.annotations.NotNull()
        public static final com.airlift.android.util.Constants.Pagination INSTANCE = null;
        public static final int PAGE_SIZE = 20;
        public static final int LOADING_CODE = 9000;
        
        private Pagination() {
            super();
        }
    }
}