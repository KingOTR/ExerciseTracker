package com.example.rungps.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class SoccerDao_Impl implements SoccerDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SoccerSessionEntity> __insertionAdapterOfSoccerSessionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDelete;

    public SoccerDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSoccerSessionEntity = new EntityInsertionAdapter<SoccerSessionEntity>(__db) { // from class: com.example.rungps.data.SoccerDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `soccer_sessions` (`id`,`kind`,`startTimeMs`,`warmupMin`,`playMin`,`intensity`,`notes`,`watchSessionId`,`hrAvgBpm`,`hrMaxBpm`,`steps`,`distanceM`,`calories`,`hrZonesJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final SoccerSessionEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getKind());
                statement.bindLong(3, entity.getStartTimeMs());
                statement.bindLong(4, entity.getWarmupMin());
                statement.bindLong(5, entity.getPlayMin());
                statement.bindLong(6, entity.getIntensity());
                if (entity.getNotes() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getNotes());
                }
                if (entity.getWatchSessionId() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindLong(8, entity.getWatchSessionId().longValue());
                }
                if (entity.getHrAvgBpm() == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindLong(9, entity.getHrAvgBpm().intValue());
                }
                if (entity.getHrMaxBpm() == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindLong(10, entity.getHrMaxBpm().intValue());
                }
                if (entity.getSteps() == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindLong(11, entity.getSteps().intValue());
                }
                if (entity.getDistanceM() == null) {
                    statement.bindNull(12);
                } else {
                    statement.bindLong(12, entity.getDistanceM().intValue());
                }
                if (entity.getCalories() == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindLong(13, entity.getCalories().intValue());
                }
                if (entity.getHrZonesJson() == null) {
                    statement.bindNull(14);
                } else {
                    statement.bindString(14, entity.getHrZonesJson());
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SoccerDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM soccer_sessions WHERE id = ?";
            }
        };
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object insert(final SoccerSessionEntity session, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.SoccerDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SoccerDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SoccerDao_Impl.this.__insertionAdapterOfSoccerSessionEntity.insertAndReturnId(session));
                    SoccerDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SoccerDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object delete(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SoccerDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SoccerDao_Impl.this.__preparedStmtOfDelete.acquire();
                acquire.bindLong(1, id);
                try {
                    SoccerDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SoccerDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SoccerDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SoccerDao_Impl.this.__preparedStmtOfDelete.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Flow<List<SoccerSessionEntity>> sessionsFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM soccer_sessions ORDER BY startTimeMs DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"soccer_sessions"}, new Callable<List<SoccerSessionEntity>>() { // from class: com.example.rungps.data.SoccerDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<SoccerSessionEntity> call() throws Exception {
                Integer valueOf;
                int i;
                String string;
                int i2;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "warmupMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "playMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "watchSessionId");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "hrAvgBpm");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hrMaxBpm");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "calories");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "hrZonesJson");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string2 = query.getString(columnIndexOrThrow2);
                        long j2 = query.getLong(columnIndexOrThrow3);
                        int i3 = query.getInt(columnIndexOrThrow4);
                        int i4 = query.getInt(columnIndexOrThrow5);
                        int i5 = query.getInt(columnIndexOrThrow6);
                        String string3 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                        Long valueOf2 = query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8));
                        Integer valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow9));
                        Integer valueOf4 = query.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow10));
                        Integer valueOf5 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                        Integer valueOf6 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = columnIndexOrThrow14;
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow13));
                            i = columnIndexOrThrow14;
                        }
                        if (query.isNull(i)) {
                            i2 = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(i);
                            i2 = columnIndexOrThrow;
                        }
                        arrayList.add(new SoccerSessionEntity(j, string2, j2, i3, i4, i5, string3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf, string));
                        columnIndexOrThrow = i2;
                        columnIndexOrThrow14 = i;
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

    @Override // com.example.rungps.data.SoccerDao
    public Object allSessions(final Continuation<? super List<SoccerSessionEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM soccer_sessions ORDER BY startTimeMs DESC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SoccerSessionEntity>>() { // from class: com.example.rungps.data.SoccerDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<SoccerSessionEntity> call() throws Exception {
                AnonymousClass6 anonymousClass6;
                Integer valueOf;
                int i;
                String string;
                int i2;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "warmupMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "playMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "watchSessionId");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "hrAvgBpm");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hrMaxBpm");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "calories");
                    try {
                        int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "hrZonesJson");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            String string2 = query.getString(columnIndexOrThrow2);
                            long j2 = query.getLong(columnIndexOrThrow3);
                            int i3 = query.getInt(columnIndexOrThrow4);
                            int i4 = query.getInt(columnIndexOrThrow5);
                            int i5 = query.getInt(columnIndexOrThrow6);
                            String string3 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                            Long valueOf2 = query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8));
                            Integer valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow9));
                            Integer valueOf4 = query.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow10));
                            Integer valueOf5 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                            Integer valueOf6 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = columnIndexOrThrow14;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow13));
                                i = columnIndexOrThrow14;
                            }
                            if (query.isNull(i)) {
                                i2 = columnIndexOrThrow;
                                string = null;
                            } else {
                                string = query.getString(i);
                                i2 = columnIndexOrThrow;
                            }
                            arrayList.add(new SoccerSessionEntity(j, string2, j2, i3, i4, i5, string3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf, string));
                            columnIndexOrThrow = i2;
                            columnIndexOrThrow14 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass6 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass6 = this;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object sessionById(final long id, final Continuation<? super SoccerSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM soccer_sessions WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<SoccerSessionEntity>() { // from class: com.example.rungps.data.SoccerDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SoccerSessionEntity call() throws Exception {
                SoccerSessionEntity soccerSessionEntity;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "warmupMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "playMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "watchSessionId");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "hrAvgBpm");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hrMaxBpm");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "calories");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "hrZonesJson");
                    if (query.moveToFirst()) {
                        soccerSessionEntity = new SoccerSessionEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow9)), query.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12)), query.isNull(columnIndexOrThrow13) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow13)), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14));
                    } else {
                        soccerSessionEntity = null;
                    }
                    return soccerSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object sessionByWatchId(final long watchSessionId, final Continuation<? super SoccerSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM soccer_sessions WHERE watchSessionId = ? LIMIT 1", 1);
        acquire.bindLong(1, watchSessionId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<SoccerSessionEntity>() { // from class: com.example.rungps.data.SoccerDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SoccerSessionEntity call() throws Exception {
                SoccerSessionEntity soccerSessionEntity;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "warmupMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "playMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "watchSessionId");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "hrAvgBpm");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hrMaxBpm");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "calories");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "hrZonesJson");
                    if (query.moveToFirst()) {
                        soccerSessionEntity = new SoccerSessionEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow9)), query.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12)), query.isNull(columnIndexOrThrow13) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow13)), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14));
                    } else {
                        soccerSessionEntity = null;
                    }
                    return soccerSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object sessionNearStart(final long startMs, final long windowMs, final Continuation<? super SoccerSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM soccer_sessions WHERE ABS(startTimeMs - ?) < ? LIMIT 1", 2);
        acquire.bindLong(1, startMs);
        acquire.bindLong(2, windowMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<SoccerSessionEntity>() { // from class: com.example.rungps.data.SoccerDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SoccerSessionEntity call() throws Exception {
                SoccerSessionEntity soccerSessionEntity;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "kind");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "warmupMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "playMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "intensity");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "watchSessionId");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "hrAvgBpm");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "hrMaxBpm");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "calories");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "hrZonesJson");
                    if (query.moveToFirst()) {
                        soccerSessionEntity = new SoccerSessionEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : Long.valueOf(query.getLong(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow9)), query.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12)), query.isNull(columnIndexOrThrow13) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow13)), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14));
                    } else {
                        soccerSessionEntity = null;
                    }
                    return soccerSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SoccerDao
    public Object sessionExists(final long id, final Continuation<? super Boolean> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT 1 FROM soccer_sessions WHERE id = ?)", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Boolean>() { // from class: com.example.rungps.data.SoccerDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean z;
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.SoccerDao
    public Object existingIds(final List<Long> ids, final Continuation<? super List<Long>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id FROM soccer_sessions WHERE id IN (");
        int size = ids.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<Long> it = ids.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindLong(i, it.next().longValue());
            i++;
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<Long>>() { // from class: com.example.rungps.data.SoccerDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                Cursor query = DBUtil.query(SoccerDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(Long.valueOf(query.getLong(0)));
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
