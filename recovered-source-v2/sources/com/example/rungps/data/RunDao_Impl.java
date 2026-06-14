package com.example.rungps.data;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.rungps.data.RunDao;
import com.example.rungps.tracking.TrackingService;
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
public final class RunDao_Impl implements RunDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<PointEntity> __insertionAdapterOfPointEntity;
    private final EntityInsertionAdapter<RunEntity> __insertionAdapterOfRunEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllPoints;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllRunsOnly;
    private final SharedSQLiteStatement __preparedStmtOfDeleteHrSamplesOutside;
    private final SharedSQLiteStatement __preparedStmtOfDeletePointsAfter;
    private final SharedSQLiteStatement __preparedStmtOfDeletePointsBefore;
    private final SharedSQLiteStatement __preparedStmtOfDeletePointsForRun;
    private final SharedSQLiteStatement __preparedStmtOfDeleteRunOnly;
    private final SharedSQLiteStatement __preparedStmtOfFinishRun;
    private final SharedSQLiteStatement __preparedStmtOfSetGearId;
    private final SharedSQLiteStatement __preparedStmtOfSetPointDistanceZero;
    private final SharedSQLiteStatement __preparedStmtOfSetStravaImportId;
    private final SharedSQLiteStatement __preparedStmtOfSetWatchImportId;
    private final SharedSQLiteStatement __preparedStmtOfUpdateRunAfterTrim;
    private final SharedSQLiteStatement __preparedStmtOfUpdateRunMetadata;

    public RunDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRunEntity = new EntityInsertionAdapter<RunEntity>(__db) { // from class: com.example.rungps.data.RunDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `runs` (`id`,`startedAtMs`,`endedAtMs`,`totalDistanceM`,`totalDurationMs`,`totalSteps`,`planType`,`timeSession`,`activityType`,`watchImportId`,`stravaImportId`,`title`,`description`,`privateNotes`,`gearId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final RunEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getStartedAtMs());
                if (entity.getEndedAtMs() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindLong(3, entity.getEndedAtMs().longValue());
                }
                statement.bindDouble(4, entity.getTotalDistanceM());
                statement.bindLong(5, entity.getTotalDurationMs());
                statement.bindLong(6, entity.getTotalSteps());
                if (entity.getPlanType() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getPlanType());
                }
                if (entity.getTimeSession() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getTimeSession());
                }
                statement.bindString(9, entity.getActivityType());
                if (entity.getWatchImportId() == null) {
                    statement.bindNull(10);
                } else {
                    statement.bindLong(10, entity.getWatchImportId().longValue());
                }
                if (entity.getStravaImportId() == null) {
                    statement.bindNull(11);
                } else {
                    statement.bindLong(11, entity.getStravaImportId().longValue());
                }
                if (entity.getTitle() == null) {
                    statement.bindNull(12);
                } else {
                    statement.bindString(12, entity.getTitle());
                }
                if (entity.getDescription() == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindString(13, entity.getDescription());
                }
                if (entity.getPrivateNotes() == null) {
                    statement.bindNull(14);
                } else {
                    statement.bindString(14, entity.getPrivateNotes());
                }
                if (entity.getGearId() == null) {
                    statement.bindNull(15);
                } else {
                    statement.bindLong(15, entity.getGearId().longValue());
                }
            }
        };
        this.__insertionAdapterOfPointEntity = new EntityInsertionAdapter<PointEntity>(__db) { // from class: com.example.rungps.data.RunDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `points` (`id`,`runId`,`timeMs`,`lat`,`lon`,`accuracyM`,`eleM`,`distanceFromPrevM`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final PointEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getRunId());
                statement.bindLong(3, entity.getTimeMs());
                statement.bindDouble(4, entity.getLat());
                statement.bindDouble(5, entity.getLon());
                statement.bindDouble(6, entity.getAccuracyM());
                if (entity.getEleM() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindDouble(7, entity.getEleM().doubleValue());
                }
                statement.bindDouble(8, entity.getDistanceFromPrevM());
            }
        };
        this.__preparedStmtOfFinishRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE runs SET endedAtMs = ?, totalDistanceM = ?, totalDurationMs = ?, totalSteps = ?, planType = ?, timeSession = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfSetWatchImportId = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE runs SET watchImportId = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfSetStravaImportId = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE runs SET stravaImportId = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateRunMetadata = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "\n        UPDATE runs SET\n            title = ?,\n            description = ?,\n            privateNotes = ?,\n            gearId = ?\n        WHERE id = ?\n        ";
            }
        };
        this.__preparedStmtOfSetGearId = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE runs SET gearId = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeletePointsBefore = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM points WHERE runId = ? AND timeMs < ?";
            }
        };
        this.__preparedStmtOfDeletePointsAfter = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM points WHERE runId = ? AND timeMs > ?";
            }
        };
        this.__preparedStmtOfSetPointDistanceZero = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE points SET distanceFromPrevM = 0.0 WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateRunAfterTrim = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.11
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE runs SET startedAtMs = ?, endedAtMs = ?, totalDistanceM = ?, totalDurationMs = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteHrSamplesOutside = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.12
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM run_hr_samples WHERE runId = ? AND (timeMs < ? OR timeMs > ?)";
            }
        };
        this.__preparedStmtOfDeletePointsForRun = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.13
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM points WHERE runId = ?";
            }
        };
        this.__preparedStmtOfDeleteAllPoints = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.14
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM points";
            }
        };
        this.__preparedStmtOfDeleteRunOnly = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.15
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM runs WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteAllRunsOnly = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.RunDao_Impl.16
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM runs";
            }
        };
    }

    @Override // com.example.rungps.data.RunDao
    public Object insertRun(final RunEntity run, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RunDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RunDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RunDao_Impl.this.__insertionAdapterOfRunEntity.insertAndReturnId(run));
                    RunDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RunDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object insertPoint(final PointEntity point, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.RunDao_Impl.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                RunDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(RunDao_Impl.this.__insertionAdapterOfPointEntity.insertAndReturnId(point));
                    RunDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    RunDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$trimRun$0(long j, long j2, long j3, Continuation continuation) {
        return RunDao.DefaultImpls.trimRun(this, j, j2, j3, continuation);
    }

    @Override // com.example.rungps.data.RunDao
    public Object trimRun(final long runId, final long startTimeMs, final long endTimeMs, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.RunDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$trimRun$0;
                lambda$trimRun$0 = RunDao_Impl.this.lambda$trimRun$0(runId, startTimeMs, endTimeMs, (Continuation) obj);
                return lambda$trimRun$0;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$deleteRun$1(long j, Continuation continuation) {
        return RunDao.DefaultImpls.deleteRun(this, j, continuation);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteRun(final long runId, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.RunDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$deleteRun$1;
                lambda$deleteRun$1 = RunDao_Impl.this.lambda$deleteRun$1(runId, (Continuation) obj);
                return lambda$deleteRun$1;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$deleteAllRuns$2(Continuation continuation) {
        return RunDao.DefaultImpls.deleteAllRuns(this, continuation);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteAllRuns(final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.RunDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$deleteAllRuns$2;
                lambda$deleteAllRuns$2 = RunDao_Impl.this.lambda$deleteAllRuns$2((Continuation) obj);
                return lambda$deleteAllRuns$2;
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object finishRun(final long runId, final long endedAtMs, final double totalDistanceM, final long totalDurationMs, final long totalSteps, final String planType, final String timeSession, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.19
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfFinishRun.acquire();
                acquire.bindLong(1, endedAtMs);
                acquire.bindDouble(2, totalDistanceM);
                acquire.bindLong(3, totalDurationMs);
                acquire.bindLong(4, totalSteps);
                String str = planType;
                if (str == null) {
                    acquire.bindNull(5);
                } else {
                    acquire.bindString(5, str);
                }
                String str2 = timeSession;
                if (str2 == null) {
                    acquire.bindNull(6);
                } else {
                    acquire.bindString(6, str2);
                }
                acquire.bindLong(7, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfFinishRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object setWatchImportId(final long runId, final long watchImportId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.20
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfSetWatchImportId.acquire();
                acquire.bindLong(1, watchImportId);
                acquire.bindLong(2, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfSetWatchImportId.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object setStravaImportId(final long runId, final long stravaImportId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.21
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfSetStravaImportId.acquire();
                acquire.bindLong(1, stravaImportId);
                acquire.bindLong(2, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfSetStravaImportId.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object updateRunMetadata(final long runId, final String title, final String description, final String privateNotes, final Long gearId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.22
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfUpdateRunMetadata.acquire();
                String str = title;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                String str2 = description;
                if (str2 == null) {
                    acquire.bindNull(2);
                } else {
                    acquire.bindString(2, str2);
                }
                String str3 = privateNotes;
                if (str3 == null) {
                    acquire.bindNull(3);
                } else {
                    acquire.bindString(3, str3);
                }
                Long l = gearId;
                if (l == null) {
                    acquire.bindNull(4);
                } else {
                    acquire.bindLong(4, l.longValue());
                }
                acquire.bindLong(5, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfUpdateRunMetadata.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object setGearId(final long runId, final Long gearId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.23
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfSetGearId.acquire();
                Long l = gearId;
                if (l == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindLong(1, l.longValue());
                }
                acquire.bindLong(2, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfSetGearId.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deletePointsBefore(final long runId, final long startTimeMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.24
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeletePointsBefore.acquire();
                acquire.bindLong(1, runId);
                acquire.bindLong(2, startTimeMs);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeletePointsBefore.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deletePointsAfter(final long runId, final long endTimeMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.25
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeletePointsAfter.acquire();
                acquire.bindLong(1, runId);
                acquire.bindLong(2, endTimeMs);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeletePointsAfter.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object setPointDistanceZero(final long pointId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.26
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfSetPointDistanceZero.acquire();
                acquire.bindLong(1, pointId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfSetPointDistanceZero.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object updateRunAfterTrim(final long runId, final long startedAtMs, final long endedAtMs, final double totalDistanceM, final long totalDurationMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.27
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfUpdateRunAfterTrim.acquire();
                acquire.bindLong(1, startedAtMs);
                acquire.bindLong(2, endedAtMs);
                acquire.bindDouble(3, totalDistanceM);
                acquire.bindLong(4, totalDurationMs);
                acquire.bindLong(5, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfUpdateRunAfterTrim.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteHrSamplesOutside(final long runId, final long startTimeMs, final long endTimeMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.28
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeleteHrSamplesOutside.acquire();
                acquire.bindLong(1, runId);
                acquire.bindLong(2, startTimeMs);
                acquire.bindLong(3, endTimeMs);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeleteHrSamplesOutside.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deletePointsForRun(final long runId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.29
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeletePointsForRun.acquire();
                acquire.bindLong(1, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeletePointsForRun.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteAllPoints(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.30
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeleteAllPoints.acquire();
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeleteAllPoints.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteRunOnly(final long runId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.31
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeleteRunOnly.acquire();
                acquire.bindLong(1, runId);
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeleteRunOnly.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object deleteAllRunsOnly(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.RunDao_Impl.32
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = RunDao_Impl.this.__preparedStmtOfDeleteAllRunsOnly.acquire();
                try {
                    RunDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        RunDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        RunDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    RunDao_Impl.this.__preparedStmtOfDeleteAllRunsOnly.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Flow<List<RunEntity>> runsFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runs ORDER BY startedAtMs DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"runs"}, new Callable<List<RunEntity>>() { // from class: com.example.rungps.data.RunDao_Impl.33
            @Override // java.util.concurrent.Callable
            public List<RunEntity> call() throws Exception {
                String string;
                int i;
                Long valueOf;
                int i2;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalDistanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalDurationMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalSteps");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_PLAN_TYPE);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_TIME_SESSION);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_ACTIVITY_TYPE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "watchImportId");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "stravaImportId");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "privateNotes");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "gearId");
                    int i3 = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        long j2 = query.getLong(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        double d = query.getDouble(columnIndexOrThrow4);
                        long j3 = query.getLong(columnIndexOrThrow5);
                        long j4 = query.getLong(columnIndexOrThrow6);
                        String string2 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                        String string3 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                        String string4 = query.getString(columnIndexOrThrow9);
                        Long valueOf3 = query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10));
                        Long valueOf4 = query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11));
                        String string5 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = i3;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow13);
                            i = i3;
                        }
                        String string6 = query.isNull(i) ? null : query.getString(i);
                        int i4 = columnIndexOrThrow15;
                        int i5 = columnIndexOrThrow;
                        if (query.isNull(i4)) {
                            i2 = i4;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(query.getLong(i4));
                            i2 = i4;
                        }
                        arrayList.add(new RunEntity(j, j2, valueOf2, d, j3, j4, string2, string3, string4, valueOf3, valueOf4, string5, string, string6, valueOf));
                        columnIndexOrThrow = i5;
                        columnIndexOrThrow15 = i2;
                        i3 = i;
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

    @Override // com.example.rungps.data.RunDao
    public PagingSource<Integer, RunEntity> runsPagingSource() {
        return new LimitOffsetPagingSource<RunEntity>(RoomSQLiteQuery.acquire("SELECT * FROM runs ORDER BY startedAtMs DESC", 0), this.__db, "runs") { // from class: com.example.rungps.data.RunDao_Impl.34
            @Override // androidx.room.paging.LimitOffsetPagingSource
            protected List<RunEntity> convertRows(final Cursor cursor) {
                String string;
                int i;
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor2, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor2, "startedAtMs");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor2, "endedAtMs");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor2, "totalDistanceM");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor2, "totalDurationMs");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor2, "totalSteps");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor2, TrackingService.EXTRA_PLAN_TYPE);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor2, TrackingService.EXTRA_TIME_SESSION);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor2, TrackingService.EXTRA_ACTIVITY_TYPE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor2, "watchImportId");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor2, "stravaImportId");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursor2, "title");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursor2, "description");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursor2, "privateNotes");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursor2, "gearId");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    long j = cursor2.getLong(columnIndexOrThrow);
                    long j2 = cursor2.getLong(columnIndexOrThrow2);
                    Long valueOf = cursor2.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow3));
                    double d = cursor2.getDouble(columnIndexOrThrow4);
                    long j3 = cursor2.getLong(columnIndexOrThrow5);
                    long j4 = cursor2.getLong(columnIndexOrThrow6);
                    String string2 = cursor2.isNull(columnIndexOrThrow7) ? null : cursor2.getString(columnIndexOrThrow7);
                    String string3 = cursor2.isNull(columnIndexOrThrow8) ? null : cursor2.getString(columnIndexOrThrow8);
                    String string4 = cursor2.getString(columnIndexOrThrow9);
                    Long valueOf2 = cursor2.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow10));
                    Long valueOf3 = cursor2.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow11));
                    String string5 = cursor2.isNull(columnIndexOrThrow12) ? null : cursor2.getString(columnIndexOrThrow12);
                    if (cursor2.isNull(columnIndexOrThrow13)) {
                        i = i2;
                        string = null;
                    } else {
                        string = cursor2.getString(columnIndexOrThrow13);
                        i = i2;
                    }
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow15;
                    arrayList.add(new RunEntity(j, j2, valueOf, d, j3, j4, string2, string3, string4, valueOf2, valueOf3, string5, string, cursor2.isNull(i) ? null : cursor2.getString(i), cursor2.isNull(i4) ? null : Long.valueOf(cursor2.getLong(i4))));
                    cursor2 = cursor;
                    i2 = i;
                    columnIndexOrThrow = i3;
                    columnIndexOrThrow15 = i4;
                }
                return arrayList;
            }
        };
    }

    @Override // com.example.rungps.data.RunDao
    public Object allRuns(final Continuation<? super List<RunEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runs ORDER BY startedAtMs DESC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<RunEntity>>() { // from class: com.example.rungps.data.RunDao_Impl.35
            @Override // java.util.concurrent.Callable
            public List<RunEntity> call() throws Exception {
                AnonymousClass35 anonymousClass35;
                String string;
                int i;
                Long valueOf;
                int i2;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalDistanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalDurationMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalSteps");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_PLAN_TYPE);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_TIME_SESSION);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_ACTIVITY_TYPE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "watchImportId");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "stravaImportId");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "privateNotes");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "gearId");
                        int i3 = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            long j2 = query.getLong(columnIndexOrThrow2);
                            Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                            double d = query.getDouble(columnIndexOrThrow4);
                            long j3 = query.getLong(columnIndexOrThrow5);
                            long j4 = query.getLong(columnIndexOrThrow6);
                            String string2 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                            String string3 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            String string4 = query.getString(columnIndexOrThrow9);
                            Long valueOf3 = query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10));
                            Long valueOf4 = query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11));
                            String string5 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = i3;
                                string = null;
                            } else {
                                string = query.getString(columnIndexOrThrow13);
                                i = i3;
                            }
                            String string6 = query.isNull(i) ? null : query.getString(i);
                            int i4 = columnIndexOrThrow15;
                            int i5 = columnIndexOrThrow;
                            if (query.isNull(i4)) {
                                i2 = i4;
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf(query.getLong(i4));
                                i2 = i4;
                            }
                            arrayList.add(new RunEntity(j, j2, valueOf2, d, j3, j4, string2, string3, string4, valueOf3, valueOf4, string5, string, string6, valueOf));
                            columnIndexOrThrow = i5;
                            columnIndexOrThrow15 = i2;
                            i3 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass35 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass35 = this;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object runById(final long runId, final Continuation<? super RunEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runs WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RunEntity>() { // from class: com.example.rungps.data.RunDao_Impl.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RunEntity call() throws Exception {
                RunEntity runEntity;
                AnonymousClass36 anonymousClass36 = this;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalDistanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalDurationMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalSteps");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_PLAN_TYPE);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_TIME_SESSION);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_ACTIVITY_TYPE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "watchImportId");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "stravaImportId");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "privateNotes");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "gearId");
                        if (query.moveToFirst()) {
                            runEntity = new RunEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.getDouble(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : query.getString(columnIndexOrThrow13), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14), query.isNull(columnIndexOrThrow15) ? null : Long.valueOf(query.getLong(columnIndexOrThrow15)));
                        } else {
                            runEntity = null;
                        }
                        query.close();
                        acquire.release();
                        return runEntity;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass36 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object runByWatchImportId(final long watchImportId, final Continuation<? super RunEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runs WHERE watchImportId = ? LIMIT 1", 1);
        acquire.bindLong(1, watchImportId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RunEntity>() { // from class: com.example.rungps.data.RunDao_Impl.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RunEntity call() throws Exception {
                RunEntity runEntity;
                AnonymousClass37 anonymousClass37 = this;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalDistanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalDurationMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalSteps");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_PLAN_TYPE);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_TIME_SESSION);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_ACTIVITY_TYPE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "watchImportId");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "stravaImportId");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "privateNotes");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "gearId");
                        if (query.moveToFirst()) {
                            runEntity = new RunEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.getDouble(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : query.getString(columnIndexOrThrow13), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14), query.isNull(columnIndexOrThrow15) ? null : Long.valueOf(query.getLong(columnIndexOrThrow15)));
                        } else {
                            runEntity = null;
                        }
                        query.close();
                        acquire.release();
                        return runEntity;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass37 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object runByStravaImportId(final long stravaImportId, final Continuation<? super RunEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM runs WHERE stravaImportId = ? LIMIT 1", 1);
        acquire.bindLong(1, stravaImportId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<RunEntity>() { // from class: com.example.rungps.data.RunDao_Impl.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RunEntity call() throws Exception {
                RunEntity runEntity;
                AnonymousClass38 anonymousClass38 = this;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalDistanceM");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "totalDurationMs");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "totalSteps");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_PLAN_TYPE);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_TIME_SESSION);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, TrackingService.EXTRA_ACTIVITY_TYPE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "watchImportId");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "stravaImportId");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "description");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "privateNotes");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "gearId");
                        if (query.moveToFirst()) {
                            runEntity = new RunEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.getDouble(columnIndexOrThrow4), query.getLong(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getString(columnIndexOrThrow9), query.isNull(columnIndexOrThrow10) ? null : Long.valueOf(query.getLong(columnIndexOrThrow10)), query.isNull(columnIndexOrThrow11) ? null : Long.valueOf(query.getLong(columnIndexOrThrow11)), query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : query.getString(columnIndexOrThrow13), query.isNull(columnIndexOrThrow14) ? null : query.getString(columnIndexOrThrow14), query.isNull(columnIndexOrThrow15) ? null : Long.valueOf(query.getLong(columnIndexOrThrow15)));
                        } else {
                            runEntity = null;
                        }
                        query.close();
                        acquire.release();
                        return runEntity;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass38 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object pointsForRun(final long runId, final Continuation<? super List<PointEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM points WHERE runId = ? ORDER BY timeMs ASC", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<PointEntity>>() { // from class: com.example.rungps.data.RunDao_Impl.39
            @Override // java.util.concurrent.Callable
            public List<PointEntity> call() throws Exception {
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "lat");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "lon");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "accuracyM");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "eleM");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "distanceFromPrevM");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new PointEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow7)), query.getDouble(columnIndexOrThrow8)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object runExists(final long runId, final Continuation<? super Boolean> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT 1 FROM runs WHERE id = ?)", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Boolean>() { // from class: com.example.rungps.data.RunDao_Impl.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean z;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.RunDao
    public Object existingIds(final List<Long> ids, final Continuation<? super List<Long>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id FROM runs WHERE id IN (");
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
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<Long>>() { // from class: com.example.rungps.data.RunDao_Impl.41
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.RunDao
    public Object lastPoint(final long runId, final Continuation<? super PointEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM points WHERE runId = ? ORDER BY timeMs DESC LIMIT 1", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<PointEntity>() { // from class: com.example.rungps.data.RunDao_Impl.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PointEntity call() throws Exception {
                PointEntity pointEntity = null;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "runId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "timeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "lat");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "lon");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "accuracyM");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "eleM");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "distanceFromPrevM");
                    if (query.moveToFirst()) {
                        pointEntity = new PointEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getDouble(columnIndexOrThrow4), query.getDouble(columnIndexOrThrow5), query.getFloat(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow7)), query.getDouble(columnIndexOrThrow8));
                    }
                    return pointEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.RunDao
    public Object sumDistanceM(final long runId, final Continuation<? super Double> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT SUM(distanceFromPrevM) FROM points WHERE runId = ?", 1);
        acquire.bindLong(1, runId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Double>() { // from class: com.example.rungps.data.RunDao_Impl.43
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Double call() throws Exception {
                Double d = null;
                Cursor query = DBUtil.query(RunDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        d = Double.valueOf(query.getDouble(0));
                    }
                    return d;
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
