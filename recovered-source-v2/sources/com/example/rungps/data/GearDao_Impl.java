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
import com.example.rungps.data.GearDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class GearDao_Impl implements GearDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<GearEntity> __insertionAdapterOfGearEntity;
    private final SharedSQLiteStatement __preparedStmtOfClearDefaultRide;
    private final SharedSQLiteStatement __preparedStmtOfClearDefaultRun;
    private final SharedSQLiteStatement __preparedStmtOfRetire;
    private final SharedSQLiteStatement __preparedStmtOfSetDefaultRide;
    private final SharedSQLiteStatement __preparedStmtOfSetDefaultRun;
    private final EntityDeletionOrUpdateAdapter<GearEntity> __updateAdapterOfGearEntity;

    public GearDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfGearEntity = new EntityInsertionAdapter<GearEntity>(__db) { // from class: com.example.rungps.data.GearDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gear_items` (`id`,`gearType`,`name`,`brand`,`model`,`purchaseDateMs`,`startingOdometerKm`,`notes`,`isRetired`,`isDefaultForRun`,`isDefaultForRide`,`photoUri`,`parentGearId`,`createdAtMs`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GearEntity gearEntity) {
                supportSQLiteStatement.bindLong(1, gearEntity.getId());
                supportSQLiteStatement.bindString(2, gearEntity.getGearType());
                supportSQLiteStatement.bindString(3, gearEntity.getName());
                if (gearEntity.getBrand() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, gearEntity.getBrand());
                }
                if (gearEntity.getModel() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, gearEntity.getModel());
                }
                if (gearEntity.getPurchaseDateMs() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, gearEntity.getPurchaseDateMs().longValue());
                }
                supportSQLiteStatement.bindDouble(7, gearEntity.getStartingOdometerKm());
                if (gearEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, gearEntity.getNotes());
                }
                supportSQLiteStatement.bindLong(9, gearEntity.isRetired() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, gearEntity.isDefaultForRun() ? 1L : 0L);
                supportSQLiteStatement.bindLong(11, gearEntity.isDefaultForRide() ? 1L : 0L);
                if (gearEntity.getPhotoUri() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, gearEntity.getPhotoUri());
                }
                if (gearEntity.getParentGearId() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindLong(13, gearEntity.getParentGearId().longValue());
                }
                supportSQLiteStatement.bindLong(14, gearEntity.getCreatedAtMs());
            }
        };
        this.__updateAdapterOfGearEntity = new EntityDeletionOrUpdateAdapter<GearEntity>(__db) { // from class: com.example.rungps.data.GearDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `gear_items` SET `id` = ?,`gearType` = ?,`name` = ?,`brand` = ?,`model` = ?,`purchaseDateMs` = ?,`startingOdometerKm` = ?,`notes` = ?,`isRetired` = ?,`isDefaultForRun` = ?,`isDefaultForRide` = ?,`photoUri` = ?,`parentGearId` = ?,`createdAtMs` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GearEntity gearEntity) {
                supportSQLiteStatement.bindLong(1, gearEntity.getId());
                supportSQLiteStatement.bindString(2, gearEntity.getGearType());
                supportSQLiteStatement.bindString(3, gearEntity.getName());
                if (gearEntity.getBrand() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, gearEntity.getBrand());
                }
                if (gearEntity.getModel() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, gearEntity.getModel());
                }
                if (gearEntity.getPurchaseDateMs() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, gearEntity.getPurchaseDateMs().longValue());
                }
                supportSQLiteStatement.bindDouble(7, gearEntity.getStartingOdometerKm());
                if (gearEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, gearEntity.getNotes());
                }
                supportSQLiteStatement.bindLong(9, gearEntity.isRetired() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, gearEntity.isDefaultForRun() ? 1L : 0L);
                supportSQLiteStatement.bindLong(11, gearEntity.isDefaultForRide() ? 1L : 0L);
                if (gearEntity.getPhotoUri() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, gearEntity.getPhotoUri());
                }
                if (gearEntity.getParentGearId() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindLong(13, gearEntity.getParentGearId().longValue());
                }
                supportSQLiteStatement.bindLong(14, gearEntity.getCreatedAtMs());
                supportSQLiteStatement.bindLong(15, gearEntity.getId());
            }
        };
        this.__preparedStmtOfRetire = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GearDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gear_items SET isRetired = 1 WHERE id = ?";
            }
        };
        this.__preparedStmtOfClearDefaultRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GearDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gear_items SET isDefaultForRun = 0";
            }
        };
        this.__preparedStmtOfClearDefaultRide = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GearDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gear_items SET isDefaultForRide = 0";
            }
        };
        this.__preparedStmtOfSetDefaultRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GearDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gear_items SET isDefaultForRun = 1 WHERE id = ?";
            }
        };
        this.__preparedStmtOfSetDefaultRide = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GearDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gear_items SET isDefaultForRide = 1 WHERE id = ?";
            }
        };
    }

    @Override // com.example.rungps.data.GearDao
    public Object insert(final GearEntity gear, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GearDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GearDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GearDao_Impl.this.__insertionAdapterOfGearEntity.insertAndReturnId(gear));
                    GearDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GearDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object update(final GearEntity gear, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                GearDao_Impl.this.__db.beginTransaction();
                try {
                    GearDao_Impl.this.__updateAdapterOfGearEntity.handle(gear);
                    GearDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    GearDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setAsDefaultForRun$0(long j, Continuation continuation) {
        return GearDao.DefaultImpls.setAsDefaultForRun(this, j, continuation);
    }

    @Override // com.example.rungps.data.GearDao
    public Object setAsDefaultForRun(final long id, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GearDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$setAsDefaultForRun$0;
                lambda$setAsDefaultForRun$0 = GearDao_Impl.this.lambda$setAsDefaultForRun$0(id, (Continuation) obj);
                return lambda$setAsDefaultForRun$0;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setAsDefaultForRide$1(long j, Continuation continuation) {
        return GearDao.DefaultImpls.setAsDefaultForRide(this, j, continuation);
    }

    @Override // com.example.rungps.data.GearDao
    public Object setAsDefaultForRide(final long id, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GearDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$setAsDefaultForRide$1;
                lambda$setAsDefaultForRide$1 = GearDao_Impl.this.lambda$setAsDefaultForRide$1(id, (Continuation) obj);
                return lambda$setAsDefaultForRide$1;
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object retire(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GearDao_Impl.this.__preparedStmtOfRetire.acquire();
                acquire.bindLong(1, id);
                try {
                    GearDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GearDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GearDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GearDao_Impl.this.__preparedStmtOfRetire.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object clearDefaultRun(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.11
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GearDao_Impl.this.__preparedStmtOfClearDefaultRun.acquire();
                try {
                    GearDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GearDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GearDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GearDao_Impl.this.__preparedStmtOfClearDefaultRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object clearDefaultRide(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.12
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GearDao_Impl.this.__preparedStmtOfClearDefaultRide.acquire();
                try {
                    GearDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GearDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GearDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GearDao_Impl.this.__preparedStmtOfClearDefaultRide.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object setDefaultRun(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.13
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GearDao_Impl.this.__preparedStmtOfSetDefaultRun.acquire();
                acquire.bindLong(1, id);
                try {
                    GearDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GearDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GearDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GearDao_Impl.this.__preparedStmtOfSetDefaultRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object setDefaultRide(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GearDao_Impl.14
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GearDao_Impl.this.__preparedStmtOfSetDefaultRide.acquire();
                acquire.bindLong(1, id);
                try {
                    GearDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GearDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GearDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GearDao_Impl.this.__preparedStmtOfSetDefaultRide.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Flow<List<GearEntity>> allFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items ORDER BY isRetired ASC, name ASC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gear_items"}, new Callable<List<GearEntity>>() { // from class: com.example.rungps.data.GearDao_Impl.15
            @Override // java.util.concurrent.Callable
            public List<GearEntity> call() throws Exception {
                Long valueOf;
                int i;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string = query.getString(columnIndexOrThrow2);
                        String string2 = query.getString(columnIndexOrThrow3);
                        String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string4 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        Long valueOf2 = query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6));
                        double d = query.getDouble(columnIndexOrThrow7);
                        String string5 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                        boolean z = query.getInt(columnIndexOrThrow9) != 0;
                        boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                        boolean z3 = query.getInt(columnIndexOrThrow11) != 0;
                        String string6 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = columnIndexOrThrow14;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow13));
                            i = columnIndexOrThrow14;
                        }
                        int i2 = columnIndexOrThrow;
                        arrayList.add(new GearEntity(j, string, string2, string3, string4, valueOf2, d, string5, z, z2, z3, string6, valueOf, query.getLong(i)));
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

    @Override // com.example.rungps.data.GearDao
    public Flow<List<GearEntity>> activeFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items WHERE isRetired = 0 ORDER BY name ASC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gear_items"}, new Callable<List<GearEntity>>() { // from class: com.example.rungps.data.GearDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<GearEntity> call() throws Exception {
                Long valueOf;
                int i;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        String string = query.getString(columnIndexOrThrow2);
                        String string2 = query.getString(columnIndexOrThrow3);
                        String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        String string4 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        Long valueOf2 = query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6));
                        double d = query.getDouble(columnIndexOrThrow7);
                        String string5 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                        boolean z = query.getInt(columnIndexOrThrow9) != 0;
                        boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                        boolean z3 = query.getInt(columnIndexOrThrow11) != 0;
                        String string6 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = columnIndexOrThrow14;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow13));
                            i = columnIndexOrThrow14;
                        }
                        int i2 = columnIndexOrThrow;
                        arrayList.add(new GearEntity(j, string, string2, string3, string4, valueOf2, d, string5, z, z2, z3, string6, valueOf, query.getLong(i)));
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

    @Override // com.example.rungps.data.GearDao
    public Object byId(final long id, final Continuation<? super GearEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GearEntity>() { // from class: com.example.rungps.data.GearDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GearEntity call() throws Exception {
                GearEntity gearEntity;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    if (query.moveToFirst()) {
                        gearEntity = new GearEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getDouble(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getInt(columnIndexOrThrow10) != 0, query.getInt(columnIndexOrThrow11) != 0, query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : Long.valueOf(query.getLong(columnIndexOrThrow13)), query.getLong(columnIndexOrThrow14));
                    } else {
                        gearEntity = null;
                    }
                    return gearEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object activeByTypes(final List<String> types, final Continuation<? super List<GearEntity>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM gear_items WHERE isRetired = 0 AND gearType IN (");
        int size = types.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(") ORDER BY name ASC");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = types.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GearEntity>>() { // from class: com.example.rungps.data.GearDao_Impl.18
            @Override // java.util.concurrent.Callable
            public List<GearEntity> call() throws Exception {
                AnonymousClass18 anonymousClass18;
                Long valueOf;
                int i2;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    try {
                        int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            String string = query.getString(columnIndexOrThrow2);
                            String string2 = query.getString(columnIndexOrThrow3);
                            String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                            String string4 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                            Long valueOf2 = query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6));
                            double d = query.getDouble(columnIndexOrThrow7);
                            String string5 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            boolean z = query.getInt(columnIndexOrThrow9) != 0;
                            boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                            boolean z3 = query.getInt(columnIndexOrThrow11) != 0;
                            String string6 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i2 = columnIndexOrThrow14;
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(query.getLong(columnIndexOrThrow13));
                                i2 = columnIndexOrThrow14;
                            }
                            int i3 = columnIndexOrThrow;
                            arrayList.add(new GearEntity(j, string, string2, string3, string4, valueOf2, d, string5, z, z2, z3, string6, valueOf, query.getLong(i2)));
                            columnIndexOrThrow = i3;
                            columnIndexOrThrow14 = i2;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass18 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass18 = this;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object defaultForRun(final Continuation<? super GearEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items WHERE isRetired = 0 AND isDefaultForRun = 1 LIMIT 1", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GearEntity>() { // from class: com.example.rungps.data.GearDao_Impl.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GearEntity call() throws Exception {
                GearEntity gearEntity;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    if (query.moveToFirst()) {
                        gearEntity = new GearEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getDouble(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getInt(columnIndexOrThrow10) != 0, query.getInt(columnIndexOrThrow11) != 0, query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : Long.valueOf(query.getLong(columnIndexOrThrow13)), query.getLong(columnIndexOrThrow14));
                    } else {
                        gearEntity = null;
                    }
                    return gearEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object defaultForRide(final Continuation<? super GearEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items WHERE isRetired = 0 AND isDefaultForRide = 1 LIMIT 1", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GearEntity>() { // from class: com.example.rungps.data.GearDao_Impl.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GearEntity call() throws Exception {
                GearEntity gearEntity;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    if (query.moveToFirst()) {
                        gearEntity = new GearEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6)), query.getDouble(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9) != 0, query.getInt(columnIndexOrThrow10) != 0, query.getInt(columnIndexOrThrow11) != 0, query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : Long.valueOf(query.getLong(columnIndexOrThrow13)), query.getLong(columnIndexOrThrow14));
                    } else {
                        gearEntity = null;
                    }
                    return gearEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object componentsForBike(final long bikeId, final Continuation<? super List<GearEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gear_items WHERE parentGearId = ? AND isRetired = 0 ORDER BY gearType ASC", 1);
        acquire.bindLong(1, bikeId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GearEntity>>() { // from class: com.example.rungps.data.GearDao_Impl.21
            @Override // java.util.concurrent.Callable
            public List<GearEntity> call() throws Exception {
                AnonymousClass21 anonymousClass21;
                Long valueOf;
                int i;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "gearType");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "brand");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "model");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "purchaseDateMs");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "startingOdometerKm");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isRetired");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRun");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isDefaultForRide");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "photoUri");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "parentGearId");
                    try {
                        int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            String string = query.getString(columnIndexOrThrow2);
                            String string2 = query.getString(columnIndexOrThrow3);
                            String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                            String string4 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                            Long valueOf2 = query.isNull(columnIndexOrThrow6) ? null : Long.valueOf(query.getLong(columnIndexOrThrow6));
                            double d = query.getDouble(columnIndexOrThrow7);
                            String string5 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            boolean z = query.getInt(columnIndexOrThrow9) != 0;
                            boolean z2 = query.getInt(columnIndexOrThrow10) != 0;
                            boolean z3 = query.getInt(columnIndexOrThrow11) != 0;
                            String string6 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = columnIndexOrThrow14;
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(query.getLong(columnIndexOrThrow13));
                                i = columnIndexOrThrow14;
                            }
                            int i2 = columnIndexOrThrow;
                            arrayList.add(new GearEntity(j, string, string2, string3, string4, valueOf2, d, string5, z, z2, z3, string6, valueOf, query.getLong(i)));
                            columnIndexOrThrow = i2;
                            columnIndexOrThrow14 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass21 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass21 = this;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object activityKmForGear(final long gearId, final Continuation<? super Double> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT COALESCE(SUM(totalDistanceM), 0) / 1000.0\n        FROM runs\n        WHERE gearId = ? AND endedAtMs IS NOT NULL\n        ", 1);
        acquire.bindLong(1, gearId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Double>() { // from class: com.example.rungps.data.GearDao_Impl.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Double call() throws Exception {
                Double valueOf;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        valueOf = Double.valueOf(query.getDouble(0));
                    } else {
                        valueOf = Double.valueOf(0.0d);
                    }
                    return valueOf;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GearDao
    public Object activityKmForBike(final long bikeId, final Continuation<? super Double> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT COALESCE(SUM(totalDistanceM), 0) / 1000.0\n        FROM runs\n        WHERE gearId = ? AND endedAtMs IS NOT NULL\n        ", 1);
        acquire.bindLong(1, bikeId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Double>() { // from class: com.example.rungps.data.GearDao_Impl.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Double call() throws Exception {
                Double valueOf;
                Cursor query = DBUtil.query(GearDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        valueOf = Double.valueOf(query.getDouble(0));
                    } else {
                        valueOf = Double.valueOf(0.0d);
                    }
                    return valueOf;
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
