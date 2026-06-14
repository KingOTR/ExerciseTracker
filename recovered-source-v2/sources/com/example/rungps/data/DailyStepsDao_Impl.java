package com.example.rungps.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.maplibre.android.style.layers.Property;

/* loaded from: classes3.dex */
public final class DailyStepsDao_Impl implements DailyStepsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<DailyStepsEntity> __insertionAdapterOfDailyStepsEntity;

    public DailyStepsDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfDailyStepsEntity = new EntityInsertionAdapter<DailyStepsEntity>(__db) { // from class: com.example.rungps.data.DailyStepsDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `daily_steps` (`id`,`epochDay`,`steps`,`source`,`syncedAtMs`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final DailyStepsEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getEpochDay());
                statement.bindLong(3, entity.getSteps());
                statement.bindString(4, entity.getSource());
                statement.bindLong(5, entity.getSyncedAtMs());
            }
        };
    }

    @Override // com.example.rungps.data.DailyStepsDao
    public Object upsert(final DailyStepsEntity entity, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.DailyStepsDao_Impl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                DailyStepsDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(DailyStepsDao_Impl.this.__insertionAdapterOfDailyStepsEntity.insertAndReturnId(entity));
                    DailyStepsDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    DailyStepsDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.DailyStepsDao
    public Flow<DailyStepsEntity> dayFlow(final long epochDay) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM daily_steps WHERE epochDay = ? LIMIT 1", 1);
        acquire.bindLong(1, epochDay);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"daily_steps"}, new Callable<DailyStepsEntity>() { // from class: com.example.rungps.data.DailyStepsDao_Impl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DailyStepsEntity call() throws Exception {
                Cursor query = DBUtil.query(DailyStepsDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new DailyStepsEntity(query.getLong(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "epochDay")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "steps")), query.getString(CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE)), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "syncedAtMs"))) : null;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.example.rungps.data.DailyStepsDao
    public Object day(final long epochDay, final Continuation<? super DailyStepsEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM daily_steps WHERE epochDay = ? LIMIT 1", 1);
        acquire.bindLong(1, epochDay);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<DailyStepsEntity>() { // from class: com.example.rungps.data.DailyStepsDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DailyStepsEntity call() throws Exception {
                Cursor query = DBUtil.query(DailyStepsDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new DailyStepsEntity(query.getLong(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "epochDay")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "steps")), query.getString(CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE)), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "syncedAtMs"))) : null;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.DailyStepsDao
    public Object since(final long sinceEpoch, final Continuation<? super List<DailyStepsEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM daily_steps WHERE epochDay >= ? ORDER BY epochDay DESC", 1);
        acquire.bindLong(1, sinceEpoch);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<DailyStepsEntity>>() { // from class: com.example.rungps.data.DailyStepsDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<DailyStepsEntity> call() throws Exception {
                Cursor query = DBUtil.query(DailyStepsDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "epochDay");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "steps");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE);
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "syncedAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new DailyStepsEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5)));
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
