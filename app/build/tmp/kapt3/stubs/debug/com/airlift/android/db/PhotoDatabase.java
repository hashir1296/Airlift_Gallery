package com.airlift.android.db;

import java.lang.System;

@androidx.room.Database(entities = {com.airlift.android.db.PhotoEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/airlift/android/db/PhotoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "photoDao", "Lcom/airlift/android/db/PhotoDao;", "Companion", "app_debug"})
public abstract class PhotoDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.airlift.android.db.PhotoDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "photo_db";
    
    public PhotoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.airlift.android.db.PhotoDao photoDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/airlift/android/db/PhotoDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}