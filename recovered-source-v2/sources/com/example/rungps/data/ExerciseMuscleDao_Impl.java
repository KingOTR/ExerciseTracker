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
public final class ExerciseMuscleDao_Impl implements ExerciseMuscleDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ExerciseMuscleTagEntity> __insertionAdapterOfExerciseMuscleTagEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByNameLower;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSetupNoteByLower;

    public ExerciseMuscleDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfExerciseMuscleTagEntity = new EntityInsertionAdapter<ExerciseMuscleTagEntity>(__db) { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `exercise_muscle_tags` (`id`,`exerciseNameLower`,`displayName`,`muscleGroup`,`secondaryMuscleGroup`,`tertiaryMuscleGroup`,`isUnilateral`,`setupNote`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ExerciseMuscleTagEntity exerciseMuscleTagEntity) {
                supportSQLiteStatement.bindLong(1, exerciseMuscleTagEntity.getId());
                supportSQLiteStatement.bindString(2, exerciseMuscleTagEntity.getExerciseNameLower());
                supportSQLiteStatement.bindString(3, exerciseMuscleTagEntity.getDisplayName());
                supportSQLiteStatement.bindString(4, exerciseMuscleTagEntity.getMuscleGroup());
                if (exerciseMuscleTagEntity.getSecondaryMuscleGroup() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, exerciseMuscleTagEntity.getSecondaryMuscleGroup());
                }
                if (exerciseMuscleTagEntity.getTertiaryMuscleGroup() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, exerciseMuscleTagEntity.getTertiaryMuscleGroup());
                }
                supportSQLiteStatement.bindLong(7, exerciseMuscleTagEntity.isUnilateral() ? 1L : 0L);
                if (exerciseMuscleTagEntity.getSetupNote() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, exerciseMuscleTagEntity.getSetupNote());
                }
            }
        };
        this.__preparedStmtOfDeleteByNameLower = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM exercise_muscle_tags WHERE exerciseNameLower = ?";
            }
        };
        this.__preparedStmtOfUpdateSetupNoteByLower = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "\n        UPDATE exercise_muscle_tags SET setupNote = ?\n        WHERE exerciseNameLower = ?\n        ";
            }
        };
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object upsert(final ExerciseMuscleTagEntity tag, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                ExerciseMuscleDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(ExerciseMuscleDao_Impl.this.__insertionAdapterOfExerciseMuscleTagEntity.insertAndReturnId(tag));
                    ExerciseMuscleDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    ExerciseMuscleDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object deleteByNameLower(final String nameLower, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = ExerciseMuscleDao_Impl.this.__preparedStmtOfDeleteByNameLower.acquire();
                acquire.bindString(1, nameLower);
                try {
                    ExerciseMuscleDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        ExerciseMuscleDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        ExerciseMuscleDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    ExerciseMuscleDao_Impl.this.__preparedStmtOfDeleteByNameLower.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object updateSetupNoteByLower(final String nameLower, final String note, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = ExerciseMuscleDao_Impl.this.__preparedStmtOfUpdateSetupNoteByLower.acquire();
                String str = note;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                acquire.bindString(2, nameLower);
                try {
                    ExerciseMuscleDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        ExerciseMuscleDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        ExerciseMuscleDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    ExerciseMuscleDao_Impl.this.__preparedStmtOfUpdateSetupNoteByLower.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Flow<List<ExerciseMuscleTagEntity>> allFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM exercise_muscle_tags ORDER BY muscleGroup ASC, displayName ASC", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"exercise_muscle_tags"}, new Callable<List<ExerciseMuscleTagEntity>>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<ExerciseMuscleTagEntity> call() throws Exception {
                Cursor query = DBUtil.query(ExerciseMuscleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "exerciseNameLower");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "displayName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "muscleGroup");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "secondaryMuscleGroup");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "tertiaryMuscleGroup");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isUnilateral");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "setupNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExerciseMuscleTagEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7) != 0, query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8)));
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

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object tagForExercise(final String nameLower, final Continuation<? super ExerciseMuscleTagEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM exercise_muscle_tags WHERE exerciseNameLower = ? LIMIT 1", 1);
        acquire.bindString(1, nameLower);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<ExerciseMuscleTagEntity>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ExerciseMuscleTagEntity call() throws Exception {
                ExerciseMuscleTagEntity exerciseMuscleTagEntity = null;
                Cursor query = DBUtil.query(ExerciseMuscleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "exerciseNameLower");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "displayName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "muscleGroup");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "secondaryMuscleGroup");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "tertiaryMuscleGroup");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isUnilateral");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "setupNote");
                    if (query.moveToFirst()) {
                        exerciseMuscleTagEntity = new ExerciseMuscleTagEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7) != 0, query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8));
                    }
                    return exerciseMuscleTagEntity;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object allTaggedLower(final Continuation<? super List<String>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT exerciseNameLower FROM exercise_muscle_tags", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<String>>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                Cursor query = DBUtil.query(ExerciseMuscleDao_Impl.this.__db, acquire, false, null);
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

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object allTagsOnce(final Continuation<? super List<ExerciseMuscleTagEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM exercise_muscle_tags", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ExerciseMuscleTagEntity>>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<ExerciseMuscleTagEntity> call() throws Exception {
                Cursor query = DBUtil.query(ExerciseMuscleDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "exerciseNameLower");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "displayName");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "muscleGroup");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "secondaryMuscleGroup");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "tertiaryMuscleGroup");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isUnilateral");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "setupNote");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new ExerciseMuscleTagEntity(query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7) != 0, query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.ExerciseMuscleDao
    public Object setupNoteForExercise(final String nameLower, final String displayName, final Continuation<? super String> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("\n        SELECT setupNote FROM exercise_muscle_tags\n        WHERE exerciseNameLower = ? OR displayName = ?\n        LIMIT 1\n        ", 2);
        acquire.bindString(1, nameLower);
        acquire.bindString(2, displayName);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<String>() { // from class: com.example.rungps.data.ExerciseMuscleDao_Impl.11
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                String str = null;
                Cursor query = DBUtil.query(ExerciseMuscleDao_Impl.this.__db, acquire, false, null);
                try {
                    if (query.moveToFirst() && !query.isNull(0)) {
                        str = query.getString(0);
                    }
                    return str;
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
