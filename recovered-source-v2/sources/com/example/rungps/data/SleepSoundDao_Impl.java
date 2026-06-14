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

/* loaded from: classes3.dex */
public final class SleepSoundDao_Impl implements SleepSoundDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SleepSoundEventEntity> __insertionAdapterOfSleepSoundEventEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteById;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForNight;

    public SleepSoundDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepSoundEventEntity = new EntityInsertionAdapter<SleepSoundEventEntity>(__db) { // from class: com.example.rungps.data.SleepSoundDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `sleep_sound_events` (`id`,`nightStartTimeMs`,`eventTimeMs`,`kind`,`intensity`,`durationMs`,`encryptedFileName`,`createdAtMs`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final SleepSoundEventEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getNightStartTimeMs());
                statement.bindLong(3, entity.getEventTimeMs());
                statement.bindString(4, entity.getKind());
                statement.bindDouble(5, entity.getIntensity());
                statement.bindLong(6, entity.getDurationMs());
                statement.bindString(7, entity.getEncryptedFileName());
                statement.bindLong(8, entity.getCreatedAtMs());
            }
        };
        this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SleepSoundDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sleep_sound_events WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteForNight = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SleepSoundDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sleep_sound_events WHERE nightStartTimeMs = ?";
            }
        };
    }

    @Override // com.example.rungps.data.SleepSoundDao
    public Object insert(final SleepSoundEventEntity event, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.SleepSoundDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SleepSoundDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SleepSoundDao_Impl.this.__insertionAdapterOfSleepSoundEventEntity.insertAndReturnId(event));
                    SleepSoundDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SleepSoundDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepSoundDao
    public Object deleteById(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SleepSoundDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SleepSoundDao_Impl.this.__preparedStmtOfDeleteById.acquire();
                acquire.bindLong(1, id);
                try {
                    SleepSoundDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SleepSoundDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SleepSoundDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SleepSoundDao_Impl.this.__preparedStmtOfDeleteById.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepSoundDao
    public Object deleteForNight(final long nightStartMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SleepSoundDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SleepSoundDao_Impl.this.__preparedStmtOfDeleteForNight.acquire();
                acquire.bindLong(1, nightStartMs);
                try {
                    SleepSoundDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SleepSoundDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SleepSoundDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SleepSoundDao_Impl.this.__preparedStmtOfDeleteForNight.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepSoundDao
    public Object forNight(final long nightStartMs, final Continuation<? super List<SleepSoundEventEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sleep_sound_events WHERE nightStartTimeMs = ? ORDER BY eventTimeMs ASC", 1);
        acquire.bindLong(1, nightStartMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SleepSoundEventEntity>>() { // from class: com.example.rungps.data.SleepSoundDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<SleepSoundEventEntity> call() throws Exception {
                Cursor query = DBUtil.query(SleepSoundDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "nightStartTimeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "eventTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "durationMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "encryptedFileName");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new SleepSoundEventEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getFloat(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.getString(columnIndexOrThrow7), query.getLong(columnIndexOrThrow8)));
                    }
                    return arrayList;
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
