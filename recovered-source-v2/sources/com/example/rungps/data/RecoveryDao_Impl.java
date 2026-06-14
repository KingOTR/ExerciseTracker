package com.example.rungps.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class RecoveryDao_Impl implements RecoveryDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RecoveryEventEntity> __insertionAdapterOfRecoveryEventEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteById;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForKind;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForSource;

    public RecoveryDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRecoveryEventEntity = new EntityInsertionAdapter<RecoveryEventEntity>(__db) { // from class: com.example.rungps.data.RecoveryDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `recovery_events` (`id`,`kind`,`sourceId`,`startedAtMs`,`endsAtMs`,`loadScore`,`notes`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RecoveryEventEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getKind());
                statement.bindLong(3, entity.getSourceId());
                statement.bindLong(4, entity.getStartedAtMs());
                statement.bindLong(5, entity.getEndsAtMs());
                statement.bindDouble(6, entity.getLoadScore());
                if (entity.getNotes() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getNotes());
                }
            }
        };
        this.__preparedStmtOfDeleteForSource = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RecoveryDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM recovery_events WHERE sourceId = ? AND kind = ?";
            }
        };
        this.__preparedStmtOfDeleteForKind = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RecoveryDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM recovery_events WHERE kind = ?";
            }
        };
        this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RecoveryDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM recovery_events WHERE id = ?";
            }
        };
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object insert(final RecoveryEventEntity event, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RecoveryDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RecoveryDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RecoveryDao_Impl.this.__insertionAdapterOfRecoveryEventEntity.insertAndReturnId(event));
                    RecoveryDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RecoveryDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object deleteForSource(final String kind, final long sourceId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RecoveryDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RecoveryDao_Impl.this.__preparedStmtOfDeleteForSource.acquire();
                acquire.bindLong(1, sourceId);
                acquire.bindString(2, kind);
                try {
                    RecoveryDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RecoveryDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RecoveryDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RecoveryDao_Impl.this.__preparedStmtOfDeleteForSource.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object deleteForKind(final String kind, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RecoveryDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RecoveryDao_Impl.this.__preparedStmtOfDeleteForKind.acquire();
                acquire.bindString(1, kind);
                try {
                    RecoveryDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RecoveryDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RecoveryDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RecoveryDao_Impl.this.__preparedStmtOfDeleteForKind.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object deleteById(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RecoveryDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RecoveryDao_Impl.this.__preparedStmtOfDeleteById.acquire();
                acquire.bindLong(1, id);
                try {
                    RecoveryDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RecoveryDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RecoveryDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RecoveryDao_Impl.this.__preparedStmtOfDeleteById.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Flow<List<RecoveryEventEntity>> recentFlow(final int limit) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM recovery_events ORDER BY startedAtMs DESC LIMIT ?", 1);
        acquire.bindLong(1, limit);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"recovery_events"}, new Callable<List<RecoveryEventEntity>>() { // from class: com.example.rungps.data.RecoveryDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<RecoveryEventEntity> call() throws Exception {
                Cursor query = DBUtil.query(RecoveryDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "sourceId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "endsAtMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "loadScore");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RecoveryEventEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object active(final long nowMs, final Continuation<? super List<RecoveryEventEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM recovery_events WHERE endsAtMs > ? ORDER BY endsAtMs ASC", 1);
        acquire.bindLong(1, nowMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RecoveryEventEntity>>() { // from class: com.example.rungps.data.RecoveryDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<RecoveryEventEntity> call() throws Exception {
                Cursor query = DBUtil.query(RecoveryDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "sourceId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "endsAtMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "loadScore");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RecoveryEventEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object since(final long sinceMs, final Continuation<? super List<RecoveryEventEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM recovery_events WHERE startedAtMs >= ? ORDER BY startedAtMs DESC", 1);
        acquire.bindLong(1, sinceMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RecoveryEventEntity>>() { // from class: com.example.rungps.data.RecoveryDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<RecoveryEventEntity> call() throws Exception {
                Cursor query = DBUtil.query(RecoveryDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "sourceId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "endsAtMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "loadScore");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RecoveryEventEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object existsForSource(final String kind, final long sourceId, final Continuation<? super Boolean> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT 1 FROM recovery_events WHERE kind = ? AND sourceId = ?)", 2);
        acquire.bindString(1, kind);
        acquire.bindLong(2, sourceId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Boolean>() { // from class: com.example.rungps.data.RecoveryDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean z;
                Cursor query = DBUtil.query(RecoveryDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        z = Boolean.valueOf(query.getInt(0) != 0);
                    } else {
                        z = false;
                    }
                    return z;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RecoveryDao
    public Object existsActiveForSource(final String kind, final long sourceId, final long nowMs, final Continuation<? super Boolean> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT 1 FROM recovery_events WHERE kind = ? AND sourceId = ? AND endsAtMs > ?)", 3);
        acquire.bindString(1, kind);
        acquire.bindLong(2, sourceId);
        acquire.bindLong(3, nowMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Boolean>() { // from class: com.example.rungps.data.RecoveryDao_Impl.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean z;
                Cursor query = DBUtil.query(RecoveryDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        z = Boolean.valueOf(query.getInt(0) != 0);
                    } else {
                        z = false;
                    }
                    return z;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
