package com.airlift.android.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/airlift/android/network/ConnectivityInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isConnected", "", "()Z", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "NoNetworkException", "app_debug"})
public class ConnectivityInterceptor implements okhttp3.Interceptor {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.airlift.android.network.ConnectivityInterceptor.Companion Companion = null;
    
    public ConnectivityInterceptor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final boolean isConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/airlift/android/network/ConnectivityInterceptor$NoNetworkException;", "Ljava/io/IOException;", "()V", "app_debug"})
    public static final class NoNetworkException extends java.io.IOException {
        
        public NoNetworkException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/airlift/android/network/ConnectivityInterceptor$Companion;", "", "()V", "isInternetAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
    }
}