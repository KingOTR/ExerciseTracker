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
public final class ArchivedTrainingWeekDao_Impl implements ArchivedTrainingWeekDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ArchivedTrainingWeekEntity> __insertionAdapterOfArchivedTrainingWeekEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOlderThan;

    public ArchivedTrainingWeekDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfArchivedTrainingWeekEntity = new EntityInsertionAdapter<ArchivedTrainingWeekEntity>(__db) { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `archived_training_weeks` (`id`,`weekStartEpochDay`,`weekEndEpochDay`,`archivedAtMs`,`totalRunKm`,`totalGymKg`,`sleepNights`,`snapshotJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final ArchivedTrainingWeekEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getWeekStartEpochDay());
                statement.bindLong(3, entity.getWeekEndEpochDay());
                statement.bindLong(4, entity.getArchivedAtMs());
                statement.bindDouble(5, entity.getTotalRunKm());
                statement.bindDouble(6, entity.getTotalGymKg());
                statement.bindLong(7, entity.getSleepNights());
                statement.bindString(8, entity.getSnapshotJson());
            }
        };
        this.__preparedStmtOfDeleteOlderThan = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM archived_training_weeks WHERE weekStartEpochDay < ?";
            }
        };
    }

    @Override // com.example.rungps.data.ArchivedTrainingWeekDao
    public Object insert(final ArchivedTrainingWeekEntity entity, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ArchivedTrainingWeekDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ArchivedTrainingWeekDao_Impl.this.__insertionAdapterOfArchivedTrainingWeekEntity.insertAndReturnId(entity));
                    ArchivedTrainingWeekDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ArchivedTrainingWeekDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ArchivedTrainingWeekDao
    public Object deleteOlderThan(final long beforeEpochDay, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = ArchivedTrainingWeekDao_Impl.this.__preparedStmtOfDeleteOlderThan.acquire();
                acquire.bindLong(1, beforeEpochDay);
                try {
                    ArchivedTrainingWeekDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        ArchivedTrainingWeekDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        ArchivedTrainingWeekDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    ArchivedTrainingWeekDao_Impl.this.__preparedStmtOfDeleteOlderThan.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ArchivedTrainingWeekDao
    public Flow<List<ArchivedTrainingWeekEntity>> allFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM archived_training_weeks ORDER BY weekStartEpochDay DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"archived_training_weeks"}, new Callable<List<ArchivedTrainingWeekEntity>>() { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<ArchivedTrainingWeekEntity> call() throws Exception {
                Cursor query = DBUtil.query(ArchivedTrainingWeekDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "weekStartEpochDay");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "weekEndEpochDay");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "archivedAtMs");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalRunKm");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalGymKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepNights");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "snapshotJson");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ArchivedTrainingWeekEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7), query.getString(columnIndexOrThrow8)));
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

    @Override // com.example.rungps.data.ArchivedTrainingWeekDao
    public Object recent(final int limit, final Continuation<? super List<ArchivedTrainingWeekEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM archived_training_weeks ORDER BY weekStartEpochDay DESC LIMIT ?", 1);
        acquire.bindLong(1, limit);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ArchivedTrainingWeekEntity>>() { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<ArchivedTrainingWeekEntity> call() throws Exception {
                Cursor query = DBUtil.query(ArchivedTrainingWeekDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "weekStartEpochDay");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "weekEndEpochDay");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "archivedAtMs");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalRunKm");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalGymKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepNights");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "snapshotJson");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ArchivedTrainingWeekEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getDouble(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7), query.getString(columnIndexOrThrow8)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ArchivedTrainingWeekDao
    public Object exists(final long weekStartEpochDay, final Continuation<? super Integer> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM archived_training_weeks WHERE weekStartEpochDay = ?", 1);
        acquire.bindLong(1, weekStartEpochDay);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Integer>() { // from class: com.example.rungps.data.ArchivedTrainingWeekDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(ArchivedTrainingWeekDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        i = Integer.valueOf(query.getInt(0));
                    } else {
                        i = 0;
                    }
                    return i;
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
