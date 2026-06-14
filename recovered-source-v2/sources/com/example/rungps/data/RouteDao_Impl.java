package com.example.rungps.data;

import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.rungps.data.RouteDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class RouteDao_Impl implements RouteDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<RouteEntity> __insertionAdapterOfRouteEntity;
    private final EntityInsertionAdapter<RoutePointEntity> __insertionAdapterOfRoutePointEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteRoute;
    private final EntityDeletionOrUpdateAdapter<RouteEntity> __updateAdapterOfRouteEntity;

    public RouteDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRouteEntity = new EntityInsertionAdapter<RouteEntity>(__db) { // from class: com.example.rungps.data.RouteDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `routes` (`id`,`name`,`createdAtMs`,`distanceM`,`remoteId`,`dedupeKey`) VALUES (nullif(?, 0),?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RouteEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getName());
                statement.bindLong(3, entity.getCreatedAtMs());
                statement.bindDouble(4, entity.getDistanceM());
                if (entity.getRemoteId() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getRemoteId());
                }
                if (entity.getDedupeKey() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getDedupeKey());
                }
            }
        };
        this.__insertionAdapterOfRoutePointEntity = new EntityInsertionAdapter<RoutePointEntity>(__db) { // from class: com.example.rungps.data.RouteDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `route_points` (`id`,`routeId`,`idx`,`lat`,`lon`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RoutePointEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getRouteId());
                statement.bindLong(3, entity.getIdx());
                statement.bindDouble(4, entity.getLat());
                statement.bindDouble(5, entity.getLon());
            }
        };
        this.__updateAdapterOfRouteEntity = new EntityDeletionOrUpdateAdapter<RouteEntity>(__db) { // from class: com.example.rungps.data.RouteDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `routes` SET `id` = ?,`name` = ?,`createdAtMs` = ?,`distanceM` = ?,`remoteId` = ?,`dedupeKey` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final RouteEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getName());
                statement.bindLong(3, entity.getCreatedAtMs());
                statement.bindDouble(4, entity.getDistanceM());
                if (entity.getRemoteId() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getRemoteId());
                }
                if (entity.getDedupeKey() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getDedupeKey());
                }
                statement.bindLong(7, entity.getId());
            }
        };
        this.__preparedStmtOfDeleteRoute = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RouteDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM routes WHERE id = ?";
            }
        };
    }

    @Override // com.example.rungps.data.RouteDao
    public Object insertRoute(final RouteEntity route, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RouteDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RouteDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RouteDao_Impl.this.__insertionAdapterOfRouteEntity.insertAndReturnId(route));
                    RouteDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RouteDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object insertRoutePoints(final List<RoutePointEntity> points, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RouteDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                RouteDao_Impl.this.__db.beginTransaction();
                try {
                    RouteDao_Impl.this.__insertionAdapterOfRoutePointEntity.insert((Iterable) points);
                    RouteDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    RouteDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object updateRoute(final RouteEntity route, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RouteDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                RouteDao_Impl.this.__db.beginTransaction();
                try {
                    RouteDao_Impl.this.__updateAdapterOfRouteEntity.handle(route);
                    RouteDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    RouteDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveRoute$0(String str, long j, double d, List list, String str2, String str3, Continuation continuation) {
        return RouteDao.DefaultImpls.saveRoute(this, str, j, d, list, str2, str3, continuation);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object saveRoute(final String name, final long createdAtMs, final double distanceM, final List<Pair<Double, Double>> latLon, final String remoteId, final String dedupeKey, final Continuation<? super Long> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.RouteDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$saveRoute$0;
                lambda$saveRoute$0 = RouteDao_Impl.this.lambda$saveRoute$0(name, createdAtMs, distanceM, latLon, remoteId, dedupeKey, (Continuation) obj);
                return lambda$saveRoute$0;
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object deleteRoute(final long routeId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RouteDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RouteDao_Impl.this.__preparedStmtOfDeleteRoute.acquire();
                acquire.bindLong(1, routeId);
                try {
                    RouteDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RouteDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RouteDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RouteDao_Impl.this.__preparedStmtOfDeleteRoute.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Flow<List<RouteEntity>> routesFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes ORDER BY createdAtMs DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"routes"}, new Callable<List<RouteEntity>>() { // from class: com.example.rungps.data.RouteDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<RouteEntity> call() throws Exception {
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
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

    @Override // com.example.rungps.data.RouteDao
    public Object allRoutes(final Continuation<? super List<RouteEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes ORDER BY createdAtMs DESC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RouteEntity>>() { // from class: com.example.rungps.data.RouteDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<RouteEntity> call() throws Exception {
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object routeById(final long id, final Continuation<? super RouteEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RouteEntity>() { // from class: com.example.rungps.data.RouteDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RouteEntity call() throws Exception {
                RouteEntity routeEntity = null;
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    if (query.moveToFirst()) {
                        routeEntity = new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                    }
                    return routeEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object routeByName(final String name, final Continuation<? super RouteEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes WHERE name = ? LIMIT 1", 1);
        acquire.bindString(1, name);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RouteEntity>() { // from class: com.example.rungps.data.RouteDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RouteEntity call() throws Exception {
                RouteEntity routeEntity = null;
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    if (query.moveToFirst()) {
                        routeEntity = new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                    }
                    return routeEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object routesByName(final String name, final Continuation<? super List<RouteEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes WHERE name = ?", 1);
        acquire.bindString(1, name);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RouteEntity>>() { // from class: com.example.rungps.data.RouteDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<RouteEntity> call() throws Exception {
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object routeByRemoteId(final String remoteId, final Continuation<? super RouteEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes WHERE remoteId = ? LIMIT 1", 1);
        acquire.bindString(1, remoteId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RouteEntity>() { // from class: com.example.rungps.data.RouteDao_Impl.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RouteEntity call() throws Exception {
                RouteEntity routeEntity = null;
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    if (query.moveToFirst()) {
                        routeEntity = new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                    }
                    return routeEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object routeByDedupeKey(final String dedupeKey, final Continuation<? super RouteEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM routes WHERE dedupeKey = ? LIMIT 1", 1);
        acquire.bindString(1, dedupeKey);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RouteEntity>() { // from class: com.example.rungps.data.RouteDao_Impl.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RouteEntity call() throws Exception {
                RouteEntity routeEntity = null;
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "distanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "dedupeKey");
                    if (query.moveToFirst()) {
                        routeEntity = new RouteEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                    }
                    return routeEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object pointsForRoute(final long routeId, final Continuation<? super List<RoutePointEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM route_points WHERE routeId = ? ORDER BY idx ASC", 1);
        acquire.bindLong(1, routeId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RoutePointEntity>>() { // from class: com.example.rungps.data.RouteDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<RoutePointEntity> call() throws Exception {
                Cursor query = DBUtil.query(RouteDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "routeId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "idx");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "lat");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "lon");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new RoutePointEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RouteDao
    public Object deleteRoutes(final List<Long> ids, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RouteDao_Impl.17
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                StringBuilder newStringBuilder = StringUtil.newStringBuilder();
                newStringBuilder.append("DELETE FROM routes WHERE id IN (");
                StringUtil.appendPlaceholders(newStringBuilder, ids.size());
                newStringBuilder.append(")");
                SupportSQLiteStatement compileStatement = RouteDao_Impl.this.__db.compileStatement(newStringBuilder.toString());
                Iterator it = ids.iterator();
                int i = 1;
                while (it.hasNext()) {
                    compileStatement.bindLong(i, ((Long) it.next()).longValue());
                    i++;
                }
                RouteDao_Impl.this.__db.beginTransaction();
                try {
                    compileStatement.executeUpdateDelete();
                    RouteDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    RouteDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
