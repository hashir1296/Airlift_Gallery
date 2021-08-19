package com.airlift.android.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001f*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J@\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/airlift/android/network/Resource;", "T", "", "status", "Lcom/airlift/android/util/Status;", "data", "message", "", "responseCode", "", "(Lcom/airlift/android/util/Status;Ljava/lang/Object;Ljava/lang/String;I)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getResponseCode", "()I", "getStatus", "()Lcom/airlift/android/util/Status;", "component1", "component2", "component3", "component4", "copy", "(Lcom/airlift/android/util/Status;Ljava/lang/Object;Ljava/lang/String;I)Lcom/airlift/android/network/Resource;", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.airlift.android.util.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    private final int responseCode = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.airlift.android.network.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.airlift.android.network.Resource<T> copy(@org.jetbrains.annotations.NotNull()
    com.airlift.android.util.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int responseCode) {
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
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.airlift.android.util.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int responseCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airlift.android.util.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airlift.android.util.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getResponseCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/airlift/android/network/Resource$Companion;", "", "()V", "error", "Lcom/airlift/android/network/Resource;", "T", "msg", "", "data", "responseCode", "", "(Ljava/lang/String;Ljava/lang/Object;I)Lcom/airlift/android/network/Resource;", "loading", "(Ljava/lang/Object;I)Lcom/airlift/android/network/Resource;", "noInternetConnection", "success", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data, int responseCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data, int responseCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> noInternetConnection(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data, int responseCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data, int responseCode) {
            return null;
        }
    }
}