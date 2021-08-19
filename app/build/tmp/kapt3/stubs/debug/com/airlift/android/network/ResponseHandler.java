package com.airlift.android.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\n\u0010\b\u001a\u00060\tj\u0002`\nJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u0001H\u00072\u0006\u0010\u0011\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/airlift/android/network/ResponseHandler;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "handleException", "Lcom/airlift/android/network/Resource;", "T", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "message", "", "handleSuccess", "data", "responseCode", "(Ljava/lang/Object;I)Lcom/airlift/android/network/Resource;", "app_debug"})
public class ResponseHandler {
    private final android.content.Context context = null;
    
    public ResponseHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> handleSuccess(@org.jetbrains.annotations.Nullable()
    T data, int responseCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> handleException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> handleException(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.airlift.android.network.Resource<T> handleException(int statusCode) {
        return null;
    }
}