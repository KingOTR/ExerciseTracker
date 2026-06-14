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
public final class StravaPbDao_Impl implements StravaPbDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<StravaPbEntity> __insertionAdapterOfStravaPbEntity;
    private final SharedSQLiteStatement __preparedStmtOfClear;

    public StravaPbDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfStravaPbEntity = new EntityInsertionAdapter<StravaPbEntity>(__db) { // from class: com.example.rungps.data.StravaPbDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `strava_pbs` (`activityKind`,`distanceKey`,`targetDistanceM`,`bestMovingTimeSec`,`activityId`,`activityName`,`startDate`,`syncedAtMs`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final StravaPbEntity entity) {
                statement.bindString(1, entity.getActivityKind());
                statement.bindString(2, entity.getDistanceKey());
                statement.bindDouble(3, entity.getTargetDistanceM());
                statement.bindLong(4, entity.getBestMovingTimeSec());
                statement.bindLong(5, entity.getActivityId());
                if (entity.getActivityName() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getActivityName());
                }
                if (entity.getStartDate() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getStartDate());
                }
                statement.bindLong(8, entity.getSyncedAtMs());
            }
        };
        this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.StravaPbDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM strava_pbs";
            }
        };
    }

    @Override // com.example.rungps.data.StravaPbDao
    public Object upsertAll(final List<StravaPbEntity> rows, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.StravaPbDao_Impl.3
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StravaPbDao_Impl.this.__db.beginTransaction();
                try {
                    StravaPbDao_Impl.this.__insertionAdapterOfStravaPbEntity.insert((Iterable) rows);
                    StravaPbDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    StravaPbDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.StravaPbDao
    public Object clear(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.StravaPbDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = StravaPbDao_Impl.this.__preparedStmtOfClear.acquire();
                try {
                    StravaPbDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        StravaPbDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        StravaPbDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    StravaPbDao_Impl.this.__preparedStmtOfClear.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.StravaPbDao
    public Flow<List<StravaPbEntity>> pbsFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM strava_pbs ORDER BY targetDistanceM ASC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"strava_pbs"}, new Callable<List<StravaPbEntity>>() { // from class: com.example.rungps.data.StravaPbDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<StravaPbEntity> call() throws Exception {
                Cursor query = DBUtil.query(StravaPbDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "activityKind");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "distanceKey");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "targetDistanceM");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "bestMovingTimeSec");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "activityId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "activityName");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startDate");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "syncedAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new StravaPbEntity(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getDouble(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.getLong(columnIndexOrThrow8)));
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

    @Override // com.example.rungps.data.StravaPbDao
    public Object allOnce(final Continuation<? super List<StravaPbEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM strava_pbs ORDER BY targetDistanceM ASC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<StravaPbEntity>>() { // from class: com.example.rungps.data.StravaPbDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<StravaPbEntity> call() throws Exception {
                Cursor query = DBUtil.query(StravaPbDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "activityKind");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "distanceKey");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "targetDistanceM");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "bestMovingTimeSec");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "activityId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "activityName");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startDate");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "syncedAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new StravaPbEntity(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getDouble(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.getLong(columnIndexOrThrow8)));
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
