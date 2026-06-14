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
public final class RunHrSampleDao_Impl implements RunHrSampleDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RunHrSampleEntity> __insertionAdapterOfRunHrSampleEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForRun;

    public RunHrSampleDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRunHrSampleEntity = new EntityInsertionAdapter<RunHrSampleEntity>(__db) { // from class: com.example.rungps.data.RunHrSampleDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `run_hr_samples` (`id`,`runId`,`timeMs`,`bpm`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RunHrSampleEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getRunId());
                statement.bindLong(3, entity.getTimeMs());
                statement.bindLong(4, entity.getBpm());
            }
        };
        this.__preparedStmtOfDeleteForRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunHrSampleDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM run_hr_samples WHERE runId = ?";
            }
        };
    }

    @Override // com.example.rungps.data.RunHrSampleDao
    public Object insert(final RunHrSampleEntity sample, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RunHrSampleDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RunHrSampleDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RunHrSampleDao_Impl.this.__insertionAdapterOfRunHrSampleEntity.insertAndReturnId(sample));
                    RunHrSampleDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RunHrSampleDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunHrSampleDao
    public Object deleteForRun(final long runId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunHrSampleDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunHrSampleDao_Impl.this.__preparedStmtOfDeleteForRun.acquire();
                acquire.bindLong(1, runId);
                try {
                    RunHrSampleDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunHrSampleDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunHrSampleDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunHrSampleDao_Impl.this.__preparedStmtOfDeleteForRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunHrSampleDao
    public Object samplesForRun(final long runId, final Continuation<? super List<RunHrSampleEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM run_hr_samples WHERE runId = ? ORDER BY timeMs ASC", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RunHrSampleEntity>>() { // from class: com.example.rungps.data.RunHrSampleDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<RunHrSampleEntity> call() throws Exception {
                Cursor query = DBUtil.query(RunHrSampleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "bpm");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RunHrSampleEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
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
