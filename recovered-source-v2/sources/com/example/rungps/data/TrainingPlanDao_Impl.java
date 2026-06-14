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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class TrainingPlanDao_Impl implements TrainingPlanDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TrainingPlanProgressEntity> __insertionAdapterOfTrainingPlanProgressEntity;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;

    public TrainingPlanDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfTrainingPlanProgressEntity = new EntityInsertionAdapter<TrainingPlanProgressEntity>(__db) { // from class: com.example.rungps.data.TrainingPlanDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `training_plan_progress` (`id`,`planSlug`,`title`,`startEpochDay`,`nextWorkoutIndex`,`updatedAtMs`) VALUES (?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final TrainingPlanProgressEntity entity) {
                statement.bindLong(1, entity.getId());
                statement.bindString(2, entity.getPlanSlug());
                statement.bindString(3, entity.getTitle());
                statement.bindLong(4, entity.getStartEpochDay());
                statement.bindLong(5, entity.getNextWorkoutIndex());
                statement.bindLong(6, entity.getUpdatedAtMs());
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.TrainingPlanDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM training_plan_progress";
            }
        };
    }

    @Override // com.example.rungps.data.TrainingPlanDao
    public Object upsert(final TrainingPlanProgressEntity entity, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.TrainingPlanDao_Impl.3
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                TrainingPlanDao_Impl.this.__db.beginTransaction();
                try {
                    TrainingPlanDao_Impl.this.__insertionAdapterOfTrainingPlanProgressEntity.insert((EntityInsertionAdapter) entity);
                    TrainingPlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    TrainingPlanDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.TrainingPlanDao
    public Object clearAll(final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.TrainingPlanDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = TrainingPlanDao_Impl.this.__preparedStmtOfClearAll.acquire();
                try {
                    TrainingPlanDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        TrainingPlanDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        TrainingPlanDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    TrainingPlanDao_Impl.this.__preparedStmtOfClearAll.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.TrainingPlanDao
    public Flow<TrainingPlanProgressEntity> progressFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM training_plan_progress WHERE id = 1 LIMIT 1", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"training_plan_progress"}, new Callable<TrainingPlanProgressEntity>() { // from class: com.example.rungps.data.TrainingPlanDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TrainingPlanProgressEntity call() throws Exception {
                Cursor query = DBUtil.query(TrainingPlanDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new TrainingPlanProgressEntity(query.getInt(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "planSlug")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "title")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "startEpochDay")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "nextWorkoutIndex")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "updatedAtMs"))) : null;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.example.rungps.data.TrainingPlanDao
    public Object progressOnce(final Continuation<? super TrainingPlanProgressEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM training_plan_progress WHERE id = 1 LIMIT 1", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<TrainingPlanProgressEntity>() { // from class: com.example.rungps.data.TrainingPlanDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TrainingPlanProgressEntity call() throws Exception {
                Cursor query = DBUtil.query(TrainingPlanDao_Impl.this.__db, acquire, false, null);
                try {
                    return query.moveToFirst() ? new TrainingPlanProgressEntity(query.getInt(CursorUtil.getColumnIndexOrThrow(query, "id")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "planSlug")), query.getString(CursorUtil.getColumnIndexOrThrow(query, "title")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "startEpochDay")), query.getInt(CursorUtil.getColumnIndexOrThrow(query, "nextWorkoutIndex")), query.getLong(CursorUtil.getColumnIndexOrThrow(query, "updatedAtMs"))) : null;
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
