package com.airlift.android.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PhotoEntity> __insertionAdapterOfPhotoEntity;

  private final EntityInsertionAdapter<PhotoEntity> __insertionAdapterOfPhotoEntity_1;

  private final EntityDeletionOrUpdateAdapter<PhotoEntity> __deletionAdapterOfPhotoEntity;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhotoEntity = new EntityInsertionAdapter<PhotoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `photos` (`id`,`url`,`large`,`medium`,`original`,`small`,`photographerName`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getLarge() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLarge());
        }
        if (value.getMedium() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMedium());
        }
        if (value.getOriginal() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginal());
        }
        if (value.getSmall() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSmall());
        }
        if (value.getPhotographerName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhotographerName());
        }
      }
    };
    this.__insertionAdapterOfPhotoEntity_1 = new EntityInsertionAdapter<PhotoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photos` (`id`,`url`,`large`,`medium`,`original`,`small`,`photographerName`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getLarge() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLarge());
        }
        if (value.getMedium() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMedium());
        }
        if (value.getOriginal() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginal());
        }
        if (value.getSmall() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSmall());
        }
        if (value.getPhotographerName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPhotographerName());
        }
      }
    };
    this.__deletionAdapterOfPhotoEntity = new EntityDeletionOrUpdateAdapter<PhotoEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `photos` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PhotoEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertAll(final PhotoEntity[] photoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPhotoEntity.insert(photoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertPhoto(final PhotoEntity photoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPhotoEntity_1.insert(photoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final PhotoEntity photoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPhotoEntity.handle(photoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<PhotoEntity>> getAll() {
    final String _sql = "SELECT * FROM photos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"photos"}, new Callable<List<PhotoEntity>>() {
      @Override
      public List<PhotoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfLarge = CursorUtil.getColumnIndexOrThrow(_cursor, "large");
          final int _cursorIndexOfMedium = CursorUtil.getColumnIndexOrThrow(_cursor, "medium");
          final int _cursorIndexOfOriginal = CursorUtil.getColumnIndexOrThrow(_cursor, "original");
          final int _cursorIndexOfSmall = CursorUtil.getColumnIndexOrThrow(_cursor, "small");
          final int _cursorIndexOfPhotographerName = CursorUtil.getColumnIndexOrThrow(_cursor, "photographerName");
          final List<PhotoEntity> _result = new ArrayList<PhotoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PhotoEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            final String _tmpLarge;
            if (_cursor.isNull(_cursorIndexOfLarge)) {
              _tmpLarge = null;
            } else {
              _tmpLarge = _cursor.getString(_cursorIndexOfLarge);
            }
            final String _tmpMedium;
            if (_cursor.isNull(_cursorIndexOfMedium)) {
              _tmpMedium = null;
            } else {
              _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
            }
            final String _tmpOriginal;
            if (_cursor.isNull(_cursorIndexOfOriginal)) {
              _tmpOriginal = null;
            } else {
              _tmpOriginal = _cursor.getString(_cursorIndexOfOriginal);
            }
            final String _tmpSmall;
            if (_cursor.isNull(_cursorIndexOfSmall)) {
              _tmpSmall = null;
            } else {
              _tmpSmall = _cursor.getString(_cursorIndexOfSmall);
            }
            final String _tmpPhotographerName;
            if (_cursor.isNull(_cursorIndexOfPhotographerName)) {
              _tmpPhotographerName = null;
            } else {
              _tmpPhotographerName = _cursor.getString(_cursorIndexOfPhotographerName);
            }
            _item = new PhotoEntity(_tmpId,_tmpUrl,_tmpLarge,_tmpMedium,_tmpOriginal,_tmpSmall,_tmpPhotographerName);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
