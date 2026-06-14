package com.example.rungps.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
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
public final class SpotifyTimelineDao_Impl implements SpotifyTimelineDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SpotifyTimelineEntity> __insertionAdapterOfSpotifyTimelineEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForGymSession;
    private final SharedSQLiteStatement __preparedStmtOfDeleteForRun;
    private final EntityDeletionOrUpdateAdapter<SpotifyTimelineEntity> __updateAdapterOfSpotifyTimelineEntity;

    public SpotifyTimelineDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSpotifyTimelineEntity = new EntityInsertionAdapter<SpotifyTimelineEntity>(__db) { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `spotify_timeline` (`id`,`timeMs`,`runId`,`gymSessionId`,`isPlaying`,`itemType`,`itemId`,`title`,`subtitle`,`progressMs`,`artUrl`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SpotifyTimelineEntity spotifyTimelineEntity) {
                supportSQLiteStatement.bindLong(1, spotifyTimelineEntity.getId());
                supportSQLiteStatement.bindLong(2, spotifyTimelineEntity.getTimeMs());
                if (spotifyTimelineEntity.getRunId() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, spotifyTimelineEntity.getRunId().longValue());
                }
                if (spotifyTimelineEntity.getGymSessionId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, spotifyTimelineEntity.getGymSessionId().longValue());
                }
                supportSQLiteStatement.bindLong(5, spotifyTimelineEntity.isPlaying() ? 1L : 0L);
                if (spotifyTimelineEntity.getItemType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, spotifyTimelineEntity.getItemType());
                }
                if (spotifyTimelineEntity.getItemId() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, spotifyTimelineEntity.getItemId());
                }
                if (spotifyTimelineEntity.getTitle() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, spotifyTimelineEntity.getTitle());
                }
                if (spotifyTimelineEntity.getSubtitle() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, spotifyTimelineEntity.getSubtitle());
                }
                if (spotifyTimelineEntity.getProgressMs() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindLong(10, spotifyTimelineEntity.getProgressMs().longValue());
                }
                if (spotifyTimelineEntity.getArtUrl() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, spotifyTimelineEntity.getArtUrl());
                }
            }
        };
        this.__updateAdapterOfSpotifyTimelineEntity = new EntityDeletionOrUpdateAdapter<SpotifyTimelineEntity>(__db) { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `spotify_timeline` SET `id` = ?,`timeMs` = ?,`runId` = ?,`gymSessionId` = ?,`isPlaying` = ?,`itemType` = ?,`itemId` = ?,`title` = ?,`subtitle` = ?,`progressMs` = ?,`artUrl` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SpotifyTimelineEntity spotifyTimelineEntity) {
                supportSQLiteStatement.bindLong(1, spotifyTimelineEntity.getId());
                supportSQLiteStatement.bindLong(2, spotifyTimelineEntity.getTimeMs());
                if (spotifyTimelineEntity.getRunId() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, spotifyTimelineEntity.getRunId().longValue());
                }
                if (spotifyTimelineEntity.getGymSessionId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, spotifyTimelineEntity.getGymSessionId().longValue());
                }
                supportSQLiteStatement.bindLong(5, spotifyTimelineEntity.isPlaying() ? 1L : 0L);
                if (spotifyTimelineEntity.getItemType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, spotifyTimelineEntity.getItemType());
                }
                if (spotifyTimelineEntity.getItemId() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, spotifyTimelineEntity.getItemId());
                }
                if (spotifyTimelineEntity.getTitle() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, spotifyTimelineEntity.getTitle());
                }
                if (spotifyTimelineEntity.getSubtitle() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, spotifyTimelineEntity.getSubtitle());
                }
                if (spotifyTimelineEntity.getProgressMs() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindLong(10, spotifyTimelineEntity.getProgressMs().longValue());
                }
                if (spotifyTimelineEntity.getArtUrl() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, spotifyTimelineEntity.getArtUrl());
                }
                supportSQLiteStatement.bindLong(12, spotifyTimelineEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteForRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM spotify_timeline WHERE runId = ?";
            }
        };
        this.__preparedStmtOfDeleteForGymSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM spotify_timeline WHERE gymSessionId = ?";
            }
        };
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object insert(final SpotifyTimelineEntity e, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SpotifyTimelineDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SpotifyTimelineDao_Impl.this.__insertionAdapterOfSpotifyTimelineEntity.insertAndReturnId(e));
                    SpotifyTimelineDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SpotifyTimelineDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object update(final SpotifyTimelineEntity e, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SpotifyTimelineDao_Impl.this.__db.beginTransaction();
                try {
                    SpotifyTimelineDao_Impl.this.__updateAdapterOfSpotifyTimelineEntity.handle(e);
                    SpotifyTimelineDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SpotifyTimelineDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object deleteForRun(final long runId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SpotifyTimelineDao_Impl.this.__preparedStmtOfDeleteForRun.acquire();
                acquire.bindLong(1, runId);
                try {
                    SpotifyTimelineDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SpotifyTimelineDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SpotifyTimelineDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SpotifyTimelineDao_Impl.this.__preparedStmtOfDeleteForRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object deleteForGymSession(final long sessionId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SpotifyTimelineDao_Impl.this.__preparedStmtOfDeleteForGymSession.acquire();
                acquire.bindLong(1, sessionId);
                try {
                    SpotifyTimelineDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SpotifyTimelineDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SpotifyTimelineDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SpotifyTimelineDao_Impl.this.__preparedStmtOfDeleteForGymSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object forRun(final long runId, final Continuation<? super List<SpotifyTimelineEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM spotify_timeline WHERE runId = ? ORDER BY timeMs ASC", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SpotifyTimelineEntity>>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<SpotifyTimelineEntity> call() throws Exception {
                Cursor query = DBUtil.query(SpotifyTimelineDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "gymSessionId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "isPlaying");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "itemType");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "subtitle");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "progressMs");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "artUrl");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new SpotifyTimelineEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object forGymSession(final long sessionId, final Continuation<? super List<SpotifyTimelineEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM spotify_timeline WHERE gymSessionId = ? ORDER BY timeMs ASC", 1);
        acquire.bindLong(1, sessionId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SpotifyTimelineEntity>>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<SpotifyTimelineEntity> call() throws Exception {
                Cursor query = DBUtil.query(SpotifyTimelineDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "gymSessionId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "isPlaying");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "itemType");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "subtitle");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "progressMs");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "artUrl");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new SpotifyTimelineEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Flow<List<SpotifyTimelineEntity>> forGymSessionFlow(final long sessionId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM spotify_timeline WHERE gymSessionId = ? ORDER BY timeMs ASC", 1);
        acquire.bindLong(1, sessionId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"spotify_timeline"}, new Callable<List<SpotifyTimelineEntity>>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<SpotifyTimelineEntity> call() throws Exception {
                Cursor query = DBUtil.query(SpotifyTimelineDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "gymSessionId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "isPlaying");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "itemType");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "subtitle");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "progressMs");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "artUrl");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new SpotifyTimelineEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11)));
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

    @Override // com.example.rungps.data.SpotifyTimelineDao
    public Object countForGymSession(final long sessionId, final Continuation<? super Integer> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM spotify_timeline WHERE gymSessionId = ?", 1);
        acquire.bindLong(1, sessionId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Integer>() { // from class: com.example.rungps.data.SpotifyTimelineDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int i;
                Cursor query = DBUtil.query(SpotifyTimelineDao_Impl.this.__db, acquire, false, null);
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
