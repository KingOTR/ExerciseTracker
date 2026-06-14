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
public final class RunSplitDao_Impl implements RunSplitDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RunSplitEntity> __insertionAdapterOfRunSplitEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSplitsForRun;

    public RunSplitDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRunSplitEntity = new EntityInsertionAdapter<RunSplitEntity>(__db) { // from class: com.example.rungps.data.RunSplitDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `run_splits` (`id`,`runId`,`kind`,`idx`,`elapsedEndMs`,`durationMs`,`distanceM`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RunSplitEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getRunId());
                statement.bindString(3, entity.getKind());
                statement.bindLong(4, entity.getIdx());
                statement.bindLong(5, entity.getElapsedEndMs());
                statement.bindLong(6, entity.getDurationMs());
                statement.bindDouble(7, entity.getDistanceM());
            }
        };
        this.__preparedStmtOfDeleteSplitsForRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunSplitDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM run_splits WHERE runId = ?";
            }
        };
    }

    @Override // com.example.rungps.data.RunSplitDao
    public Object insertSplit(final RunSplitEntity split, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RunSplitDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RunSplitDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RunSplitDao_Impl.this.__insertionAdapterOfRunSplitEntity.insertAndReturnId(split));
                    RunSplitDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RunSplitDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunSplitDao
    public Object deleteSplitsForRun(final long runId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunSplitDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunSplitDao_Impl.this.__preparedStmtOfDeleteSplitsForRun.acquire();
                acquire.bindLong(1, runId);
                try {
                    RunSplitDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunSplitDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunSplitDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunSplitDao_Impl.this.__preparedStmtOfDeleteSplitsForRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunSplitDao
    public Object splitsForRun(final long runId, final Continuation<? super List<RunSplitEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM run_splits WHERE runId = ? ORDER BY kind ASC, idx ASC", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RunSplitEntity>>() { // from class: com.example.rungps.data.RunSplitDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<RunSplitEntity> call() throws Exception {
                Cursor query = DBUtil.query(RunSplitDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "idx");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "elapsedEndMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "durationMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RunSplitEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getDouble(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunSplitDao
    public Object allKmSplits(final Continuation<? super List<RunSplitEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM run_splits WHERE kind = 'KM' ORDER BY runId ASC, idx ASC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RunSplitEntity>>() { // from class: com.example.rungps.data.RunSplitDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<RunSplitEntity> call() throws Exception {
                Cursor query = DBUtil.query(RunSplitDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "idx");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "elapsedEndMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "durationMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RunSplitEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getDouble(columnIndexOrThrow7)));
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
