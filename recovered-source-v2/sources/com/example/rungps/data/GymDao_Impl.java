package com.example.rungps.data;

import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.data.GymDao;
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
public final class GymDao_Impl implements GymDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ExerciseTemplateEntity> __insertionAdapterOfExerciseTemplateEntity;
    private final EntityInsertionAdapter<GymCarryoverEntity> __insertionAdapterOfGymCarryoverEntity;
    private final EntityInsertionAdapter<GymDayTemplateEntity> __insertionAdapterOfGymDayTemplateEntity;
    private final EntityInsertionAdapter<GymSessionEntity> __insertionAdapterOfGymSessionEntity;
    private final EntityInsertionAdapter<GymSetEntity> __insertionAdapterOfGymSetEntity;
    private final EntityInsertionAdapter<GymSplitEntity> __insertionAdapterOfGymSplitEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllCarryover;
    private final SharedSQLiteStatement __preparedStmtOfDeleteCarryover;
    private final SharedSQLiteStatement __preparedStmtOfDeleteCarryoverForExercise;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSession;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSet;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSetsForSession;
    private final SharedSQLiteStatement __preparedStmtOfDeleteSplit;
    private final SharedSQLiteStatement __preparedStmtOfFinishSession;
    private final SharedSQLiteStatement __preparedStmtOfRenameExerciseInSession;
    private final SharedSQLiteStatement __preparedStmtOfReopenSession;
    private final SharedSQLiteStatement __preparedStmtOfUpdateAmbientTag;
    private final SharedSQLiteStatement __preparedStmtOfUpdateExerciseTemplate;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSessionRemoteId;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSessionTimes;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSet;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSetLoggedAt;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSetRpeRom;

    public GymDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfGymSplitEntity = new EntityInsertionAdapter<GymSplitEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_splits` (`id`,`name`,`createdAtMs`) VALUES (nullif(?, 0),?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final GymSplitEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getName());
                statement.bindLong(3, entity.getCreatedAtMs());
            }
        };
        this.__insertionAdapterOfGymDayTemplateEntity = new EntityInsertionAdapter<GymDayTemplateEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_day_templates` (`id`,`splitId`,`dayName`,`orderIdx`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final GymDayTemplateEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getSplitId());
                statement.bindString(3, entity.getDayName());
                statement.bindLong(4, entity.getOrderIdx());
            }
        };
        this.__insertionAdapterOfExerciseTemplateEntity = new EntityInsertionAdapter<ExerciseTemplateEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_exercise_templates` (`id`,`dayTemplateId`,`name`,`orderIdx`,`defaultSets`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final ExerciseTemplateEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getDayTemplateId());
                statement.bindString(3, entity.getName());
                statement.bindLong(4, entity.getOrderIdx());
                statement.bindLong(5, entity.getDefaultSets());
            }
        };
        this.__insertionAdapterOfGymSessionEntity = new EntityInsertionAdapter<GymSessionEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_sessions` (`id`,`startedAtMs`,`endedAtMs`,`templateDayId`,`freeDay`,`notes`,`ambientTag`,`ambientTagCustom`,`remoteId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GymSessionEntity gymSessionEntity) {
                supportSQLiteStatement.bindLong(1, gymSessionEntity.getId());
                supportSQLiteStatement.bindLong(2, gymSessionEntity.getStartedAtMs());
                if (gymSessionEntity.getEndedAtMs() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, gymSessionEntity.getEndedAtMs().longValue());
                }
                if (gymSessionEntity.getTemplateDayId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, gymSessionEntity.getTemplateDayId().longValue());
                }
                supportSQLiteStatement.bindLong(5, gymSessionEntity.getFreeDay() ? 1L : 0L);
                if (gymSessionEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, gymSessionEntity.getNotes());
                }
                if (gymSessionEntity.getAmbientTag() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, gymSessionEntity.getAmbientTag());
                }
                if (gymSessionEntity.getAmbientTagCustom() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, gymSessionEntity.getAmbientTagCustom());
                }
                if (gymSessionEntity.getRemoteId() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, gymSessionEntity.getRemoteId());
                }
            }
        };
        this.__insertionAdapterOfGymSetEntity = new EntityInsertionAdapter<GymSetEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_sets` (`id`,`sessionId`,`exerciseName`,`setIndex`,`reps`,`weightKg`,`loggedAtMs`,`rpeBorg`,`romNote`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final GymSetEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getSessionId());
                statement.bindString(3, entity.getExerciseName());
                statement.bindLong(4, entity.getSetIndex());
                if (entity.getReps() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindLong(5, entity.getReps().intValue());
                }
                statement.bindDouble(6, entity.getWeightKg());
                if (entity.getLoggedAtMs() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindLong(7, entity.getLoggedAtMs().longValue());
                }
                if (entity.getRpeBorg() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindLong(8, entity.getRpeBorg().intValue());
                }
                if (entity.getRomNote() == null) {
                    statement.bindNull(9);
                } else {
                    statement.bindString(9, entity.getRomNote());
                }
            }
        };
        this.__insertionAdapterOfGymCarryoverEntity = new EntityInsertionAdapter<GymCarryoverEntity>(__db) { // from class: com.example.rungps.data.GymDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `gym_carryover` (`id`,`splitId`,`templateDayId`,`exerciseName`,`owedSetIndices`,`fromSessionId`,`createdAtMs`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final GymCarryoverEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindLong(2, entity.getSplitId());
                statement.bindLong(3, entity.getTemplateDayId());
                statement.bindString(4, entity.getExerciseName());
                statement.bindString(5, entity.getOwedSetIndices());
                statement.bindLong(6, entity.getFromSessionId());
                statement.bindLong(7, entity.getCreatedAtMs());
            }
        };
        this.__preparedStmtOfUpdateExerciseTemplate = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_exercise_templates SET name = ?, defaultSets = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteSplit = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_splits WHERE id = ?";
            }
        };
        this.__preparedStmtOfReopenSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sessions SET endedAtMs = NULL WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateSessionRemoteId = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sessions SET remoteId = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfFinishSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.11
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sessions SET endedAtMs = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateSessionTimes = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.12
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sessions SET startedAtMs = ?, endedAtMs = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateAmbientTag = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.13
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sessions SET ambientTag = ?, ambientTagCustom = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.14
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_sessions WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateSet = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.15
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sets SET reps = ?, weightKg = ?, loggedAtMs = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateSetLoggedAt = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.16
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sets SET loggedAtMs = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateSetRpeRom = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.17
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE gym_sets SET rpeBorg = ?, romNote = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfRenameExerciseInSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.18
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "\n        UPDATE gym_sets SET exerciseName = ?\n        WHERE sessionId = ? AND LOWER(exerciseName) = LOWER(?)\n        ";
            }
        };
        this.__preparedStmtOfDeleteSet = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.19
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_sets WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteSetsForSession = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.20
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_sets WHERE sessionId = ?";
            }
        };
        this.__preparedStmtOfDeleteCarryover = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.21
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_carryover WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteCarryoverForExercise = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.22
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_carryover WHERE splitId = ? AND templateDayId = ? AND exerciseName = ?";
            }
        };
        this.__preparedStmtOfDeleteAllCarryover = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.GymDao_Impl.23
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM gym_carryover";
            }
        };
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertSplit(final GymSplitEntity split, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfGymSplitEntity.insertAndReturnId(split));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertDayTemplate(final GymDayTemplateEntity day, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfGymDayTemplateEntity.insertAndReturnId(day));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertExerciseTemplate(final ExerciseTemplateEntity ex, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfExerciseTemplateEntity.insertAndReturnId(ex));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertSession(final GymSessionEntity session, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfGymSessionEntity.insertAndReturnId(session));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertSet(final GymSetEntity set, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfGymSetEntity.insertAndReturnId(set));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertCarryover(final GymCarryoverEntity row, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.GymDao_Impl.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                GymDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(GymDao_Impl.this.__insertionAdapterOfGymCarryoverEntity.insertAndReturnId(row));
                    GymDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    GymDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$replaceSetsForSession$0(long j, List list, Continuation continuation) {
        return GymDao.DefaultImpls.replaceSetsForSession(this, j, list, continuation);
    }

    @Override // com.example.rungps.data.GymDao
    public Object replaceSetsForSession(final long sessionId, final List<GymSetEntity> sets, final Continuation<? super Unit> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GymDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$replaceSetsForSession$0;
                lambda$replaceSetsForSession$0 = GymDao_Impl.this.lambda$replaceSetsForSession$0(sessionId, sets, (Continuation) obj);
                return lambda$replaceSetsForSession$0;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertRemoteFinishedSession$1(String str, long j, long j2, Long l, boolean z, String str2, List list, String str3, String str4, Continuation continuation) {
        return GymDao.DefaultImpls.insertRemoteFinishedSession(this, str, j, j2, l, z, str2, list, str3, str4, continuation);
    }

    @Override // com.example.rungps.data.GymDao
    public Object insertRemoteFinishedSession(final String remoteId, final long startedAtMs, final long endedAtMs, final Long templateDayId, final boolean freeDay, final String notes, final List<RemoteGymSetRow> sets, final String ambientTag, final String ambientTagCustom, final Continuation<? super Long> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GymDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$insertRemoteFinishedSession$1;
                lambda$insertRemoteFinishedSession$1 = GymDao_Impl.this.lambda$insertRemoteFinishedSession$1(remoteId, startedAtMs, endedAtMs, templateDayId, freeDay, notes, sets, ambientTag, ambientTagCustom, (Continuation) obj);
                return lambda$insertRemoteFinishedSession$1;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createSplitWithDays$2(String str, List list, Continuation continuation) {
        return GymDao.DefaultImpls.createSplitWithDays(this, str, list, continuation);
    }

    @Override // com.example.rungps.data.GymDao
    public Object createSplitWithDays(final String name, final List<String> dayNames, final Continuation<? super Long> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GymDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$createSplitWithDays$2;
                lambda$createSplitWithDays$2 = GymDao_Impl.this.lambda$createSplitWithDays$2(name, dayNames, (Continuation) obj);
                return lambda$createSplitWithDays$2;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createSplitWithDaysAndExercises$3(String str, List list, List list2, int i, Continuation continuation) {
        return GymDao.DefaultImpls.createSplitWithDaysAndExercises(this, str, list, list2, i, continuation);
    }

    @Override // com.example.rungps.data.GymDao
    public Object createSplitWithDaysAndExercises(final String name, final List<String> dayNames, final List<String> exerciseNames, final int defaultSets, final Continuation<? super Long> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GymDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$createSplitWithDaysAndExercises$3;
                lambda$createSplitWithDaysAndExercises$3 = GymDao_Impl.this.lambda$createSplitWithDaysAndExercises$3(name, dayNames, exerciseNames, defaultSets, (Continuation) obj);
                return lambda$createSplitWithDaysAndExercises$3;
            }
        }, $completion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$createSplitWithPerDayExercises$4(String str, List list, int i, Continuation continuation) {
        return GymDao.DefaultImpls.createSplitWithPerDayExercises(this, str, list, i, continuation);
    }

    @Override // com.example.rungps.data.GymDao
    public Object createSplitWithPerDayExercises(final String name, final List<GymDayExerciseSpec> days, final int defaultSets, final Continuation<? super Long> $completion) {
        return RoomDatabaseKt.withTransaction(this.__db, new Function1() { // from class: com.example.rungps.data.GymDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object lambda$createSplitWithPerDayExercises$4;
                lambda$createSplitWithPerDayExercises$4 = GymDao_Impl.this.lambda$createSplitWithPerDayExercises$4(name, days, defaultSets, (Continuation) obj);
                return lambda$createSplitWithPerDayExercises$4;
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateExerciseTemplate(final long id, final String name, final int defaultSets, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.30
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateExerciseTemplate.acquire();
                acquire.bindString(1, name);
                acquire.bindLong(2, defaultSets);
                acquire.bindLong(3, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateExerciseTemplate.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteSplit(final long splitId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.31
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteSplit.acquire();
                acquire.bindLong(1, splitId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteSplit.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object reopenSession(final long sessionId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.32
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfReopenSession.acquire();
                acquire.bindLong(1, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfReopenSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateSessionRemoteId(final long sessionId, final String remoteId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.33
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateSessionRemoteId.acquire();
                acquire.bindString(1, remoteId);
                acquire.bindLong(2, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateSessionRemoteId.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object finishSession(final long sessionId, final long endedAtMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.34
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfFinishSession.acquire();
                acquire.bindLong(1, endedAtMs);
                acquire.bindLong(2, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfFinishSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateSessionTimes(final long sessionId, final long startedAtMs, final long endedAtMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.35
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateSessionTimes.acquire();
                acquire.bindLong(1, startedAtMs);
                acquire.bindLong(2, endedAtMs);
                acquire.bindLong(3, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateSessionTimes.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateAmbientTag(final long sessionId, final String tag, final String custom, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.36
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateAmbientTag.acquire();
                String str = tag;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                String str2 = custom;
                if (str2 == null) {
                    acquire.bindNull(2);
                } else {
                    acquire.bindString(2, str2);
                }
                acquire.bindLong(3, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateAmbientTag.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteSession(final long sessionId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.37
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteSession.acquire();
                acquire.bindLong(1, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateSet(final long id, final Integer reps, final double weightKg, final Long loggedAtMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.38
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateSet.acquire();
                if (reps == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindLong(1, r1.intValue());
                }
                acquire.bindDouble(2, weightKg);
                Long l = loggedAtMs;
                if (l == null) {
                    acquire.bindNull(3);
                } else {
                    acquire.bindLong(3, l.longValue());
                }
                acquire.bindLong(4, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateSet.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateSetLoggedAt(final long id, final long loggedAtMs, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.39
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateSetLoggedAt.acquire();
                acquire.bindLong(1, loggedAtMs);
                acquire.bindLong(2, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateSetLoggedAt.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object updateSetRpeRom(final long id, final Integer rpeBorg, final String romNote, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.40
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfUpdateSetRpeRom.acquire();
                if (rpeBorg == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindLong(1, r1.intValue());
                }
                String str = romNote;
                if (str == null) {
                    acquire.bindNull(2);
                } else {
                    acquire.bindString(2, str);
                }
                acquire.bindLong(3, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfUpdateSetRpeRom.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object renameExerciseInSession(final long sessionId, final String oldName, final String newName, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.41
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfRenameExerciseInSession.acquire();
                acquire.bindString(1, newName);
                acquire.bindLong(2, sessionId);
                acquire.bindString(3, oldName);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfRenameExerciseInSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteSet(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.42
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteSet.acquire();
                acquire.bindLong(1, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteSet.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteSetsForSession(final long sessionId, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.43
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteSetsForSession.acquire();
                acquire.bindLong(1, sessionId);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteSetsForSession.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteCarryover(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.44
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteCarryover.acquire();
                acquire.bindLong(1, id);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteCarryover.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteCarryoverForExercise(final long splitId, final long templateDayId, final String exerciseName, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.45
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteCarryoverForExercise.acquire();
                acquire.bindLong(1, splitId);
                acquire.bindLong(2, templateDayId);
                acquire.bindString(3, exerciseName);
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteCarryoverForExercise.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object deleteAllCarryover(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.GymDao_Impl.46
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = GymDao_Impl.this.__preparedStmtOfDeleteAllCarryover.acquire();
                try {
                    GymDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        GymDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        GymDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    GymDao_Impl.this.__preparedStmtOfDeleteAllCarryover.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Flow<List<GymSplitEntity>> splitsFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_splits ORDER BY createdAtMs DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gym_splits"}, new Callable<List<GymSplitEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.47
            @Override // java.util.concurrent.Callable
            public List<GymSplitEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSplitEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3)));
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

    @Override // com.example.rungps.data.GymDao
    public Object allSplits(final Continuation<? super List<GymSplitEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_splits ORDER BY createdAtMs DESC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSplitEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.48
            @Override // java.util.concurrent.Callable
            public List<GymSplitEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSplitEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object dayTemplatesForSplit(final long splitId, final Continuation<? super List<GymDayTemplateEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_day_templates WHERE splitId = ? ORDER BY orderIdx ASC", 1);
        acquire.bindLong(1, splitId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymDayTemplateEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.49
            @Override // java.util.concurrent.Callable
            public List<GymDayTemplateEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "splitId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "dayName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "orderIdx");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymDayTemplateEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object dayTemplateById(final long id, final Continuation<? super GymDayTemplateEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_day_templates WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymDayTemplateEntity>() { // from class: com.example.rungps.data.GymDao_Impl.50
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymDayTemplateEntity call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new GymDayTemplateEntity(query.getLong(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "splitId")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "dayName")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "orderIdx"))) : null;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object lastSplitProgressDayTemplate(final long splitId, final Continuation<? super GymDayTemplateEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT d.* FROM gym_day_templates d\n        INNER JOIN gym_sessions s ON s.templateDayId = d.id\n        WHERE d.splitId = ?\n          AND s.freeDay = 0\n          AND s.templateDayId IS NOT NULL\n          AND s.endedAtMs IS NOT NULL\n        ORDER BY s.endedAtMs DESC\n        LIMIT 1\n        ", 1);
        acquire.bindLong(1, splitId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymDayTemplateEntity>() { // from class: com.example.rungps.data.GymDao_Impl.51
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymDayTemplateEntity call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new GymDayTemplateEntity(query.getLong(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "splitId")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "dayName")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "orderIdx"))) : null;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object exercisesForDay(final long dayTemplateId, final Continuation<? super List<ExerciseTemplateEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_exercise_templates WHERE dayTemplateId = ? ORDER BY orderIdx ASC", 1);
        acquire.bindLong(1, dayTemplateId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ExerciseTemplateEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.52
            @Override // java.util.concurrent.Callable
            public List<ExerciseTemplateEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "dayTemplateId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "orderIdx");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "defaultSets");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExerciseTemplateEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object distinctTemplateExerciseNames(final Continuation<? super List<String>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT name FROM gym_exercise_templates ORDER BY name COLLATE NOCASE", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<String>>() { // from class: com.example.rungps.data.GymDao_Impl.53
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Flow<List<GymSessionEntity>> sessionsFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sessions ORDER BY startedAtMs DESC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gym_sessions"}, new Callable<List<GymSessionEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.54
            @Override // java.util.concurrent.Callable
            public List<GymSessionEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "freeDay");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "ambientTag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "ambientTagCustom");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSessionEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
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

    @Override // com.example.rungps.data.GymDao
    public Object finishedSessions(final Continuation<? super List<GymSessionEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sessions WHERE endedAtMs IS NOT NULL ORDER BY startedAtMs DESC", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSessionEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.55
            @Override // java.util.concurrent.Callable
            public List<GymSessionEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "freeDay");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "ambientTag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "ambientTagCustom");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSessionEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object openSession(final Continuation<? super GymSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sessions WHERE endedAtMs IS NULL ORDER BY startedAtMs DESC LIMIT 1", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSessionEntity>() { // from class: com.example.rungps.data.GymDao_Impl.56
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSessionEntity call() throws Exception {
                GymSessionEntity gymSessionEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "freeDay");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "ambientTag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "ambientTagCustom");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    if (query.moveToFirst()) {
                        gymSessionEntity = new GymSessionEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object sessionById(final long id, final Continuation<? super GymSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sessions WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSessionEntity>() { // from class: com.example.rungps.data.GymDao_Impl.57
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSessionEntity call() throws Exception {
                GymSessionEntity gymSessionEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "freeDay");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "ambientTag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "ambientTagCustom");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    if (query.moveToFirst()) {
                        gymSessionEntity = new GymSessionEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object sessionByRemoteId(final String remoteId, final Continuation<? super GymSessionEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sessions WHERE remoteId = ? LIMIT 1", 1);
        acquire.bindString(1, remoteId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSessionEntity>() { // from class: com.example.rungps.data.GymDao_Impl.58
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSessionEntity call() throws Exception {
                GymSessionEntity gymSessionEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startedAtMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endedAtMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "freeDay");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "ambientTag");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "ambientTagCustom");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "remoteId");
                    if (query.moveToFirst()) {
                        gymSessionEntity = new GymSessionEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3)), query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4)), query.getInt(columnIndexOrThrow5) != 0, query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSessionEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object sessionExists(final long id, final Continuation<? super Boolean> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT 1 FROM gym_sessions WHERE id = ?)", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Boolean>() { // from class: com.example.rungps.data.GymDao_Impl.59
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                boolean z;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.GymDao
    public Object existingSessionIds(final List<Long> ids, final Continuation<? super List<Long>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id FROM gym_sessions WHERE id IN (");
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
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<Long>>() { // from class: com.example.rungps.data.GymDao_Impl.60
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.GymDao
    public Flow<GymLoadStats> gymLoadFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT\n          s.startedAtMs AS lastSessionAtMs,\n          (SELECT SUM(gs.weightKg * COALESCE(gs.reps, 1)) FROM gym_sets gs WHERE gs.sessionId = s.id) AS lastTonnage,\n          (SELECT MAX(gs.weightKg) FROM gym_sets gs WHERE gs.sessionId = s.id) AS lastMaxWeight,\n          (SELECT AVG(x.ton) FROM (\n            SELECT SUM(gs2.weightKg * COALESCE(gs2.reps, 1)) AS ton\n            FROM gym_sessions s2\n            LEFT JOIN gym_sets gs2 ON gs2.sessionId = s2.id\n            GROUP BY s2.id\n            ORDER BY s2.startedAtMs DESC\n            LIMIT 10\n          ) x) AS avgTonnage10,\n          (SELECT AVG(x.mx) FROM (\n            SELECT MAX(gs2.weightKg) AS mx\n            FROM gym_sessions s2\n            LEFT JOIN gym_sets gs2 ON gs2.sessionId = s2.id\n            GROUP BY s2.id\n            ORDER BY s2.startedAtMs DESC\n            LIMIT 10\n          ) x) AS avgMaxWeight10\n        FROM gym_sessions s\n        ORDER BY s.startedAtMs DESC\n        LIMIT 1\n        ", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gym_sets", "gym_sessions"}, new Callable<GymLoadStats>() { // from class: com.example.rungps.data.GymDao_Impl.61
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymLoadStats call() throws Exception {
                GymLoadStats gymLoadStats = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        gymLoadStats = new GymLoadStats(query.isNull(0) ? null : Long.valueOf(query.getLong(0)), query.isNull(1) ? null : Double.valueOf(query.getDouble(1)), query.isNull(2) ? null : Double.valueOf(query.getDouble(2)), query.isNull(3) ? null : Double.valueOf(query.getDouble(3)), query.isNull(4) ? null : Double.valueOf(query.getDouble(4)));
                    }
                    return gymLoadStats;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.example.rungps.data.GymDao
    public Object setsForSession(final long sessionId, final Continuation<? super List<GymSetEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sets WHERE sessionId = ? ORDER BY exerciseName ASC, setIndex ASC", 1);
        acquire.bindLong(1, sessionId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSetEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.62
            @Override // java.util.concurrent.Callable
            public List<GymSetEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object setsForSessions(final List<Long> sessionIds, final Continuation<? super List<GymSetEntity>> $completion) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("\n");
        newStringBuilder.append("        SELECT * FROM gym_sets");
        newStringBuilder.append("\n");
        newStringBuilder.append("        WHERE sessionId IN (");
        int size = sessionIds.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        newStringBuilder.append("\n");
        newStringBuilder.append("        ORDER BY sessionId ASC, exerciseName ASC, setIndex ASC");
        newStringBuilder.append("\n");
        newStringBuilder.append("        ");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<Long> it = sessionIds.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindLong(i, it.next().longValue());
            i++;
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSetEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.63
            @Override // java.util.concurrent.Callable
            public List<GymSetEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object setById(final long id, final Continuation<? super GymSetEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sets WHERE id = ? LIMIT 1", 1);
        acquire.bindLong(1, id);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSetEntity>() { // from class: com.example.rungps.data.GymDao_Impl.64
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSetEntity call() throws Exception {
                GymSetEntity gymSetEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    if (query.moveToFirst()) {
                        gymSetEntity = new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSetEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object prForExercise(final String exerciseName, final Continuation<? super ExercisePr> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT\n          exerciseName AS exerciseName,\n          weightKg AS weightKg,\n          reps AS reps,\n          (weightKg * (1.0 + (COALESCE(reps, 1) / 30.0))) AS e1rm\n        FROM gym_sets\n        WHERE LOWER(exerciseName) = LOWER(?)\n          AND weightKg > 0\n        ORDER BY weightKg DESC, COALESCE(reps, 0) DESC, id DESC\n        LIMIT 1\n        ", 1);
        acquire.bindString(1, exerciseName);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<ExercisePr>() { // from class: com.example.rungps.data.GymDao_Impl.65
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExercisePr call() throws Exception {
                ExercisePr exercisePr = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        exercisePr = new ExercisePr(query.getString(0), query.getDouble(1), query.isNull(2) ? null : Integer.valueOf(query.getInt(2)), query.getDouble(3), null);
                    }
                    return exercisePr;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object lastBestSetForExercise(final String exerciseName, final Continuation<? super GymSetEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT gs.* FROM gym_sets gs\n        INNER JOIN gym_sessions s ON s.id = gs.sessionId\n        WHERE lower(gs.exerciseName) = lower(?)\n        ORDER BY gs.weightKg DESC, COALESCE(gs.reps, 0) DESC, s.startedAtMs DESC\n        LIMIT 1\n        ", 1);
        acquire.bindString(1, exerciseName);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSetEntity>() { // from class: com.example.rungps.data.GymDao_Impl.66
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSetEntity call() throws Exception {
                GymSetEntity gymSetEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    if (query.moveToFirst()) {
                        gymSetEntity = new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSetEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object lastLoggedSetForExercise(final String exerciseName, final Continuation<? super GymSetEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT gs.* FROM gym_sets gs\n        INNER JOIN gym_sessions s ON s.id = gs.sessionId\n        WHERE lower(trim(gs.exerciseName)) = lower(trim(?))\n          AND gs.weightKg > 0\n          AND COALESCE(gs.reps, 0) > 0\n        ORDER BY COALESCE(gs.loggedAtMs, s.startedAtMs) DESC, gs.id DESC\n        LIMIT 1\n        ", 1);
        acquire.bindString(1, exerciseName);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSetEntity>() { // from class: com.example.rungps.data.GymDao_Impl.67
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSetEntity call() throws Exception {
                GymSetEntity gymSetEntity = null;
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    if (query.moveToFirst()) {
                        gymSetEntity = new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                    }
                    return gymSetEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object topPrsHeaviestPerExercise(final int limit, final Continuation<? super List<ExercisePr>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT\n          gs.exerciseName AS exerciseName,\n          gs.weightKg AS weightKg,\n          gs.reps AS reps,\n          (gs.weightKg * (1.0 + (COALESCE(gs.reps, 1) / 30.0))) AS e1rm,\n          (\n            SELECT MAX(s.endedAtMs)\n            FROM gym_sets gs3\n            INNER JOIN gym_sessions s ON s.id = gs3.sessionId\n            WHERE gs3.weightKg > 0\n              AND s.endedAtMs IS NOT NULL\n              AND LOWER(gs3.exerciseName) = LOWER(gs.exerciseName)\n          ) AS lastCompletedAtMs\n        FROM gym_sets gs\n        WHERE gs.weightKg > 0\n          AND gs.id = (\n            SELECT gs2.id\n            FROM gym_sets gs2\n            WHERE gs2.weightKg > 0\n              AND LOWER(gs2.exerciseName) = LOWER(gs.exerciseName)\n            ORDER BY gs2.weightKg DESC, COALESCE(gs2.reps, 1) DESC, gs2.id DESC\n            LIMIT 1\n          )\n        ORDER BY e1rm DESC\n        LIMIT ?\n        ", 1);
        acquire.bindLong(1, limit);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ExercisePr>>() { // from class: com.example.rungps.data.GymDao_Impl.68
            @Override // java.util.concurrent.Callable
            public List<ExercisePr> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExercisePr(query.getString(0), query.getDouble(1), query.isNull(2) ? null : Integer.valueOf(query.getInt(2)), query.getDouble(3), query.isNull(4) ? null : Long.valueOf(query.getLong(4))));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object topPrs(final int limit, final Continuation<? super List<ExercisePr>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT\n          exerciseName AS exerciseName,\n          weightKg AS weightKg,\n          reps AS reps,\n          (weightKg * (1.0 + (COALESCE(reps, 1) / 30.0))) AS e1rm,\n          NULL AS lastCompletedAtMs\n        FROM gym_sets\n        ORDER BY e1rm DESC\n        LIMIT ?\n        ", 1);
        acquire.bindLong(1, limit);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ExercisePr>>() { // from class: com.example.rungps.data.GymDao_Impl.69
            @Override // java.util.concurrent.Callable
            public List<ExercisePr> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExercisePr(query.getString(0), query.getDouble(1), query.isNull(2) ? null : Integer.valueOf(query.getInt(2)), query.getDouble(3), query.isNull(4) ? null : Long.valueOf(query.getLong(4))));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object distinctExerciseNames(final Continuation<? super List<String>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT exerciseName FROM gym_sets ORDER BY exerciseName COLLATE NOCASE", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<String>>() { // from class: com.example.rungps.data.GymDao_Impl.70
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object historyForExercise(final String exerciseName, final Continuation<? super List<ExerciseHistoryPoint>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT\n          s.startedAtMs AS sessionStartedAtMs,\n          best.weightKg AS weightKg,\n          best.reps AS reps,\n          best.reps AS bestReps,\n          (\n            SELECT COUNT(*)\n            FROM gym_sets gs2\n            WHERE gs2.sessionId = s.id\n              AND LOWER(gs2.exerciseName) = LOWER(?)\n              AND gs2.weightKg > 0\n              AND COALESCE(gs2.reps, 0) > 0\n          ) AS setsDone,\n          0.0 AS e1rm\n        FROM gym_sessions s\n        INNER JOIN (\n          SELECT\n            gs.sessionId AS sessionId,\n            gs.weightKg AS weightKg,\n            gs.reps AS reps\n          FROM gym_sets gs\n          WHERE LOWER(gs.exerciseName) = LOWER(?)\n            AND gs.weightKg > 0\n            AND COALESCE(gs.reps, 0) > 0\n            AND gs.id = (\n              SELECT gs3.id\n              FROM gym_sets gs3\n              WHERE gs3.sessionId = gs.sessionId\n                AND LOWER(gs3.exerciseName) = LOWER(?)\n                AND gs3.weightKg > 0\n                AND COALESCE(gs3.reps, 0) > 0\n              ORDER BY gs3.weightKg DESC, COALESCE(gs3.reps, 0) DESC, gs3.id DESC\n              LIMIT 1\n            )\n        ) best ON best.sessionId = s.id\n        ORDER BY s.startedAtMs ASC\n        ", 3);
        acquire.bindString(1, exerciseName);
        acquire.bindString(2, exerciseName);
        acquire.bindString(3, exerciseName);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ExerciseHistoryPoint>>() { // from class: com.example.rungps.data.GymDao_Impl.71
            @Override // java.util.concurrent.Callable
            public List<ExerciseHistoryPoint> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExerciseHistoryPoint(query.getLong(0), query.getDouble(1), query.isNull(2) ? null : Integer.valueOf(query.getInt(2)), query.getInt(3), query.getInt(4), query.getDouble(5)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Flow<List<GymSetEntity>> setsForSessionFlow(final long sessionId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_sets WHERE sessionId = ? ORDER BY exerciseName ASC, setIndex ASC", 1);
        acquire.bindLong(1, sessionId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gym_sets"}, new Callable<List<GymSetEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.72
            @Override // java.util.concurrent.Callable
            public List<GymSetEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
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

    @Override // com.example.rungps.data.GymDao
    public Object weightedSetsSince(final long sinceMs, final Continuation<? super List<GymSetEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT gs.* FROM gym_sets gs\n        INNER JOIN gym_sessions s ON s.id = gs.sessionId\n        WHERE s.startedAtMs >= ? AND gs.weightKg > 0\n        ", 1);
        acquire.bindLong(1, sinceMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSetEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.73
            @Override // java.util.concurrent.Callable
            public List<GymSetEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "sessionId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "setIndex");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "reps");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "weightKg");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "loggedAtMs");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "rpeBorg");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "romNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSetEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5)), query.getDouble(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)), query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8)), query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object splitByName(final String name, final Continuation<? super GymSplitEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_splits WHERE LOWER(name) = LOWER(?) LIMIT 1", 1);
        acquire.bindString(1, name);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<GymSplitEntity>() { // from class: com.example.rungps.data.GymDao_Impl.74
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public GymSplitEntity call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new GymSplitEntity(query.getLong(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getString(CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME)), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "createdAtMs"))) : null;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object splitsWithName(final String name, final Continuation<? super List<GymSplitEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT * FROM gym_splits\n        WHERE LOWER(TRIM(name)) = LOWER(TRIM(?))\n        ORDER BY createdAtMs DESC\n        ", 1);
        acquire.bindString(1, name);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymSplitEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.75
            @Override // java.util.concurrent.Callable
            public List<GymSplitEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, HintConstants.AUTOFILL_HINT_NAME);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymSplitEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Flow<List<GymCarryoverEntity>> carryoverFlow(final long splitId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_carryover WHERE splitId = ? ORDER BY exerciseName COLLATE NOCASE", 1);
        acquire.bindLong(1, splitId);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"gym_carryover"}, new Callable<List<GymCarryoverEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.76
            @Override // java.util.concurrent.Callable
            public List<GymCarryoverEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "splitId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "owedSetIndices");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "fromSessionId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymCarryoverEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7)));
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

    @Override // com.example.rungps.data.GymDao
    public Object carryoverForDay(final long splitId, final long templateDayId, final Continuation<? super List<GymCarryoverEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM gym_carryover WHERE splitId = ? AND templateDayId = ?", 2);
        acquire.bindLong(1, splitId);
        acquire.bindLong(2, templateDayId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymCarryoverEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.77
            @Override // java.util.concurrent.Callable
            public List<GymCarryoverEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "splitId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "owedSetIndices");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "fromSessionId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymCarryoverEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.GymDao
    public Object carryoverForSplit(final long splitId, final Continuation<? super List<GymCarryoverEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT * FROM gym_carryover\n        WHERE splitId = ?\n        ORDER BY createdAtMs DESC, exerciseName COLLATE NOCASE\n        ", 1);
        acquire.bindLong(1, splitId);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<GymCarryoverEntity>>() { // from class: com.example.rungps.data.GymDao_Impl.78
            @Override // java.util.concurrent.Callable
            public List<GymCarryoverEntity> call() throws Exception {
                Cursor query = DBUtil.query(GymDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "splitId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "templateDayId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "exerciseName");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "owedSetIndices");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "fromSessionId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "createdAtMs");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new GymCarryoverEntity(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7)));
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
