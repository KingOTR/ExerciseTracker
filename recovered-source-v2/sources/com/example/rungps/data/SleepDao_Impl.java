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
import org.maplibre.android.style.layers.Property;

/* loaded from: classes3.dex */
public final class SleepDao_Impl implements SleepDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SleepEntryEntity> __insertionAdapterOfSleepEntryEntity;
    private final EntityInsertionAdapter<SleepEntryEntity> __insertionAdapterOfSleepEntryEntity_1;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final EntityDeletionOrUpdateAdapter<SleepEntryEntity> __updateAdapterOfSleepEntryEntity;

    public SleepDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepEntryEntity = new EntityInsertionAdapter<SleepEntryEntity>(__db) { // from class: com.example.rungps.data.SleepDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `sleep_entries` (`id`,`startTimeMs`,`endTimeMs`,`totalSleepMin`,`deepSleepMin`,`lightSleepMin`,`sleepEfficiency`,`sleepQuality`,`source`,`notes`,`wakeMood`,`snoreEvents`,`awakeSleepMin`,`restlessnessIndex`,`remSleepMin`,`smartAlarmUsed`,`timeToFallAsleepMin`,`scoreRoutine`,`scoreQualityPillar`,`scoreDuration`,`hypnogramCompact`,`eventMarkersCompact`,`stageConfidenceMean`,`micCoverageRatio`,`fusionSource`,`breathRateMean`,`osaRiskHint`,`sleepDebtHours`,`consistencyScore`,`sleepAnalyticsJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SleepEntryEntity sleepEntryEntity) {
                supportSQLiteStatement.bindLong(1, sleepEntryEntity.getId());
                supportSQLiteStatement.bindLong(2, sleepEntryEntity.getStartTimeMs());
                supportSQLiteStatement.bindLong(3, sleepEntryEntity.getEndTimeMs());
                supportSQLiteStatement.bindLong(4, sleepEntryEntity.getTotalSleepMin());
                if (sleepEntryEntity.getDeepSleepMin() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, sleepEntryEntity.getDeepSleepMin().intValue());
                }
                if (sleepEntryEntity.getLightSleepMin() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, sleepEntryEntity.getLightSleepMin().intValue());
                }
                if (sleepEntryEntity.getSleepEfficiency() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, sleepEntryEntity.getSleepEfficiency().intValue());
                }
                if (sleepEntryEntity.getSleepQuality() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindLong(8, sleepEntryEntity.getSleepQuality().intValue());
                }
                supportSQLiteStatement.bindString(9, sleepEntryEntity.getSource());
                if (sleepEntryEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, sleepEntryEntity.getNotes());
                }
                if (sleepEntryEntity.getWakeMood() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindLong(11, sleepEntryEntity.getWakeMood().intValue());
                }
                if (sleepEntryEntity.getSnoreEvents() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindLong(12, sleepEntryEntity.getSnoreEvents().intValue());
                }
                if (sleepEntryEntity.getAwakeSleepMin() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindLong(13, sleepEntryEntity.getAwakeSleepMin().intValue());
                }
                if (sleepEntryEntity.getRestlessnessIndex() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindLong(14, sleepEntryEntity.getRestlessnessIndex().intValue());
                }
                if (sleepEntryEntity.getRemSleepMin() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindLong(15, sleepEntryEntity.getRemSleepMin().intValue());
                }
                supportSQLiteStatement.bindLong(16, sleepEntryEntity.getSmartAlarmUsed() ? 1L : 0L);
                if (sleepEntryEntity.getTimeToFallAsleepMin() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindLong(17, sleepEntryEntity.getTimeToFallAsleepMin().intValue());
                }
                if (sleepEntryEntity.getScoreRoutine() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindLong(18, sleepEntryEntity.getScoreRoutine().intValue());
                }
                if (sleepEntryEntity.getScoreQualityPillar() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindLong(19, sleepEntryEntity.getScoreQualityPillar().intValue());
                }
                if (sleepEntryEntity.getScoreDuration() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindLong(20, sleepEntryEntity.getScoreDuration().intValue());
                }
                if (sleepEntryEntity.getHypnogramCompact() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, sleepEntryEntity.getHypnogramCompact());
                }
                if (sleepEntryEntity.getEventMarkersCompact() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, sleepEntryEntity.getEventMarkersCompact());
                }
                if (sleepEntryEntity.getStageConfidenceMean() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindDouble(23, sleepEntryEntity.getStageConfidenceMean().floatValue());
                }
                if (sleepEntryEntity.getMicCoverageRatio() == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindDouble(24, sleepEntryEntity.getMicCoverageRatio().floatValue());
                }
                if (sleepEntryEntity.getFusionSource() == null) {
                    supportSQLiteStatement.bindNull(25);
                } else {
                    supportSQLiteStatement.bindString(25, sleepEntryEntity.getFusionSource());
                }
                if (sleepEntryEntity.getBreathRateMean() == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindDouble(26, sleepEntryEntity.getBreathRateMean().floatValue());
                }
                if (sleepEntryEntity.getOsaRiskHint() == null) {
                    supportSQLiteStatement.bindNull(27);
                } else {
                    supportSQLiteStatement.bindString(27, sleepEntryEntity.getOsaRiskHint());
                }
                if (sleepEntryEntity.getSleepDebtHours() == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindDouble(28, sleepEntryEntity.getSleepDebtHours().floatValue());
                }
                if (sleepEntryEntity.getConsistencyScore() == null) {
                    supportSQLiteStatement.bindNull(29);
                } else {
                    supportSQLiteStatement.bindLong(29, sleepEntryEntity.getConsistencyScore().intValue());
                }
                if (sleepEntryEntity.getSleepAnalyticsJson() == null) {
                    supportSQLiteStatement.bindNull(30);
                } else {
                    supportSQLiteStatement.bindString(30, sleepEntryEntity.getSleepAnalyticsJson());
                }
            }
        };
        this.__insertionAdapterOfSleepEntryEntity_1 = new EntityInsertionAdapter<SleepEntryEntity>(__db) { // from class: com.example.rungps.data.SleepDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `sleep_entries` (`id`,`startTimeMs`,`endTimeMs`,`totalSleepMin`,`deepSleepMin`,`lightSleepMin`,`sleepEfficiency`,`sleepQuality`,`source`,`notes`,`wakeMood`,`snoreEvents`,`awakeSleepMin`,`restlessnessIndex`,`remSleepMin`,`smartAlarmUsed`,`timeToFallAsleepMin`,`scoreRoutine`,`scoreQualityPillar`,`scoreDuration`,`hypnogramCompact`,`eventMarkersCompact`,`stageConfidenceMean`,`micCoverageRatio`,`fusionSource`,`breathRateMean`,`osaRiskHint`,`sleepDebtHours`,`consistencyScore`,`sleepAnalyticsJson`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SleepEntryEntity sleepEntryEntity) {
                supportSQLiteStatement.bindLong(1, sleepEntryEntity.getId());
                supportSQLiteStatement.bindLong(2, sleepEntryEntity.getStartTimeMs());
                supportSQLiteStatement.bindLong(3, sleepEntryEntity.getEndTimeMs());
                supportSQLiteStatement.bindLong(4, sleepEntryEntity.getTotalSleepMin());
                if (sleepEntryEntity.getDeepSleepMin() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, sleepEntryEntity.getDeepSleepMin().intValue());
                }
                if (sleepEntryEntity.getLightSleepMin() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, sleepEntryEntity.getLightSleepMin().intValue());
                }
                if (sleepEntryEntity.getSleepEfficiency() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, sleepEntryEntity.getSleepEfficiency().intValue());
                }
                if (sleepEntryEntity.getSleepQuality() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindLong(8, sleepEntryEntity.getSleepQuality().intValue());
                }
                supportSQLiteStatement.bindString(9, sleepEntryEntity.getSource());
                if (sleepEntryEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, sleepEntryEntity.getNotes());
                }
                if (sleepEntryEntity.getWakeMood() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindLong(11, sleepEntryEntity.getWakeMood().intValue());
                }
                if (sleepEntryEntity.getSnoreEvents() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindLong(12, sleepEntryEntity.getSnoreEvents().intValue());
                }
                if (sleepEntryEntity.getAwakeSleepMin() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindLong(13, sleepEntryEntity.getAwakeSleepMin().intValue());
                }
                if (sleepEntryEntity.getRestlessnessIndex() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindLong(14, sleepEntryEntity.getRestlessnessIndex().intValue());
                }
                if (sleepEntryEntity.getRemSleepMin() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindLong(15, sleepEntryEntity.getRemSleepMin().intValue());
                }
                supportSQLiteStatement.bindLong(16, sleepEntryEntity.getSmartAlarmUsed() ? 1L : 0L);
                if (sleepEntryEntity.getTimeToFallAsleepMin() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindLong(17, sleepEntryEntity.getTimeToFallAsleepMin().intValue());
                }
                if (sleepEntryEntity.getScoreRoutine() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindLong(18, sleepEntryEntity.getScoreRoutine().intValue());
                }
                if (sleepEntryEntity.getScoreQualityPillar() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindLong(19, sleepEntryEntity.getScoreQualityPillar().intValue());
                }
                if (sleepEntryEntity.getScoreDuration() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindLong(20, sleepEntryEntity.getScoreDuration().intValue());
                }
                if (sleepEntryEntity.getHypnogramCompact() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, sleepEntryEntity.getHypnogramCompact());
                }
                if (sleepEntryEntity.getEventMarkersCompact() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, sleepEntryEntity.getEventMarkersCompact());
                }
                if (sleepEntryEntity.getStageConfidenceMean() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindDouble(23, sleepEntryEntity.getStageConfidenceMean().floatValue());
                }
                if (sleepEntryEntity.getMicCoverageRatio() == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindDouble(24, sleepEntryEntity.getMicCoverageRatio().floatValue());
                }
                if (sleepEntryEntity.getFusionSource() == null) {
                    supportSQLiteStatement.bindNull(25);
                } else {
                    supportSQLiteStatement.bindString(25, sleepEntryEntity.getFusionSource());
                }
                if (sleepEntryEntity.getBreathRateMean() == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindDouble(26, sleepEntryEntity.getBreathRateMean().floatValue());
                }
                if (sleepEntryEntity.getOsaRiskHint() == null) {
                    supportSQLiteStatement.bindNull(27);
                } else {
                    supportSQLiteStatement.bindString(27, sleepEntryEntity.getOsaRiskHint());
                }
                if (sleepEntryEntity.getSleepDebtHours() == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindDouble(28, sleepEntryEntity.getSleepDebtHours().floatValue());
                }
                if (sleepEntryEntity.getConsistencyScore() == null) {
                    supportSQLiteStatement.bindNull(29);
                } else {
                    supportSQLiteStatement.bindLong(29, sleepEntryEntity.getConsistencyScore().intValue());
                }
                if (sleepEntryEntity.getSleepAnalyticsJson() == null) {
                    supportSQLiteStatement.bindNull(30);
                } else {
                    supportSQLiteStatement.bindString(30, sleepEntryEntity.getSleepAnalyticsJson());
                }
            }
        };
        this.__updateAdapterOfSleepEntryEntity = new EntityDeletionOrUpdateAdapter<SleepEntryEntity>(__db) { // from class: com.example.rungps.data.SleepDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR ABORT `sleep_entries` SET `id` = ?,`startTimeMs` = ?,`endTimeMs` = ?,`totalSleepMin` = ?,`deepSleepMin` = ?,`lightSleepMin` = ?,`sleepEfficiency` = ?,`sleepQuality` = ?,`source` = ?,`notes` = ?,`wakeMood` = ?,`snoreEvents` = ?,`awakeSleepMin` = ?,`restlessnessIndex` = ?,`remSleepMin` = ?,`smartAlarmUsed` = ?,`timeToFallAsleepMin` = ?,`scoreRoutine` = ?,`scoreQualityPillar` = ?,`scoreDuration` = ?,`hypnogramCompact` = ?,`eventMarkersCompact` = ?,`stageConfidenceMean` = ?,`micCoverageRatio` = ?,`fusionSource` = ?,`breathRateMean` = ?,`osaRiskHint` = ?,`sleepDebtHours` = ?,`consistencyScore` = ?,`sleepAnalyticsJson` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, SleepEntryEntity sleepEntryEntity) {
                supportSQLiteStatement.bindLong(1, sleepEntryEntity.getId());
                supportSQLiteStatement.bindLong(2, sleepEntryEntity.getStartTimeMs());
                supportSQLiteStatement.bindLong(3, sleepEntryEntity.getEndTimeMs());
                supportSQLiteStatement.bindLong(4, sleepEntryEntity.getTotalSleepMin());
                if (sleepEntryEntity.getDeepSleepMin() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, sleepEntryEntity.getDeepSleepMin().intValue());
                }
                if (sleepEntryEntity.getLightSleepMin() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, sleepEntryEntity.getLightSleepMin().intValue());
                }
                if (sleepEntryEntity.getSleepEfficiency() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, sleepEntryEntity.getSleepEfficiency().intValue());
                }
                if (sleepEntryEntity.getSleepQuality() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindLong(8, sleepEntryEntity.getSleepQuality().intValue());
                }
                supportSQLiteStatement.bindString(9, sleepEntryEntity.getSource());
                if (sleepEntryEntity.getNotes() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, sleepEntryEntity.getNotes());
                }
                if (sleepEntryEntity.getWakeMood() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindLong(11, sleepEntryEntity.getWakeMood().intValue());
                }
                if (sleepEntryEntity.getSnoreEvents() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindLong(12, sleepEntryEntity.getSnoreEvents().intValue());
                }
                if (sleepEntryEntity.getAwakeSleepMin() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindLong(13, sleepEntryEntity.getAwakeSleepMin().intValue());
                }
                if (sleepEntryEntity.getRestlessnessIndex() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindLong(14, sleepEntryEntity.getRestlessnessIndex().intValue());
                }
                if (sleepEntryEntity.getRemSleepMin() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindLong(15, sleepEntryEntity.getRemSleepMin().intValue());
                }
                supportSQLiteStatement.bindLong(16, sleepEntryEntity.getSmartAlarmUsed() ? 1L : 0L);
                if (sleepEntryEntity.getTimeToFallAsleepMin() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindLong(17, sleepEntryEntity.getTimeToFallAsleepMin().intValue());
                }
                if (sleepEntryEntity.getScoreRoutine() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindLong(18, sleepEntryEntity.getScoreRoutine().intValue());
                }
                if (sleepEntryEntity.getScoreQualityPillar() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindLong(19, sleepEntryEntity.getScoreQualityPillar().intValue());
                }
                if (sleepEntryEntity.getScoreDuration() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindLong(20, sleepEntryEntity.getScoreDuration().intValue());
                }
                if (sleepEntryEntity.getHypnogramCompact() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, sleepEntryEntity.getHypnogramCompact());
                }
                if (sleepEntryEntity.getEventMarkersCompact() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, sleepEntryEntity.getEventMarkersCompact());
                }
                if (sleepEntryEntity.getStageConfidenceMean() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindDouble(23, sleepEntryEntity.getStageConfidenceMean().floatValue());
                }
                if (sleepEntryEntity.getMicCoverageRatio() == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindDouble(24, sleepEntryEntity.getMicCoverageRatio().floatValue());
                }
                if (sleepEntryEntity.getFusionSource() == null) {
                    supportSQLiteStatement.bindNull(25);
                } else {
                    supportSQLiteStatement.bindString(25, sleepEntryEntity.getFusionSource());
                }
                if (sleepEntryEntity.getBreathRateMean() == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindDouble(26, sleepEntryEntity.getBreathRateMean().floatValue());
                }
                if (sleepEntryEntity.getOsaRiskHint() == null) {
                    supportSQLiteStatement.bindNull(27);
                } else {
                    supportSQLiteStatement.bindString(27, sleepEntryEntity.getOsaRiskHint());
                }
                if (sleepEntryEntity.getSleepDebtHours() == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindDouble(28, sleepEntryEntity.getSleepDebtHours().floatValue());
                }
                if (sleepEntryEntity.getConsistencyScore() == null) {
                    supportSQLiteStatement.bindNull(29);
                } else {
                    supportSQLiteStatement.bindLong(29, sleepEntryEntity.getConsistencyScore().intValue());
                }
                if (sleepEntryEntity.getSleepAnalyticsJson() == null) {
                    supportSQLiteStatement.bindNull(30);
                } else {
                    supportSQLiteStatement.bindString(30, sleepEntryEntity.getSleepAnalyticsJson());
                }
                supportSQLiteStatement.bindLong(31, sleepEntryEntity.getId());
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.example.rungps.data.SleepDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sleep_entries WHERE id = ?";
            }
        };
    }

    @Override // com.example.rungps.data.SleepDao
    public Object insert(final SleepEntryEntity entry, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.SleepDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SleepDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SleepDao_Impl.this.__insertionAdapterOfSleepEntryEntity.insertAndReturnId(entry));
                    SleepDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SleepDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepDao
    public Object upsert(final SleepEntryEntity entry, final Continuation<? super Long> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Long>() { // from class: com.example.rungps.data.SleepDao_Impl.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SleepDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SleepDao_Impl.this.__insertionAdapterOfSleepEntryEntity_1.insertAndReturnId(entry));
                    SleepDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SleepDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepDao
    public Object update(final SleepEntryEntity entry, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SleepDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SleepDao_Impl.this.__db.beginTransaction();
                try {
                    SleepDao_Impl.this.__updateAdapterOfSleepEntryEntity.handle(entry);
                    SleepDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SleepDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepDao
    public Object delete(final long id, final Continuation<? super Unit> $completion) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.example.rungps.data.SleepDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement acquire = SleepDao_Impl.this.__preparedStmtOfDelete.acquire();
                acquire.bindLong(1, id);
                try {
                    SleepDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        SleepDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.INSTANCE;
                    } finally {
                        SleepDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    SleepDao_Impl.this.__preparedStmtOfDelete.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepDao
    public Flow<List<SleepEntryEntity>> recentFlow(final int limit) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sleep_entries ORDER BY startTimeMs DESC LIMIT ?", 1);
        acquire.bindLong(1, limit);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"sleep_entries"}, new Callable<List<SleepEntryEntity>>() { // from class: com.example.rungps.data.SleepDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<SleepEntryEntity> call() throws Exception {
                Integer valueOf;
                int i;
                String string;
                int i2;
                Cursor query = DBUtil.query(SleepDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalSleepMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "deepSleepMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "lightSleepMin");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepEfficiency");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "sleepQuality");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wakeMood");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "snoreEvents");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "awakeSleepMin");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "restlessnessIndex");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "remSleepMin");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "smartAlarmUsed");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "timeToFallAsleepMin");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "scoreRoutine");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "scoreQualityPillar");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "scoreDuration");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "hypnogramCompact");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "eventMarkersCompact");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "stageConfidenceMean");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "micCoverageRatio");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "fusionSource");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "breathRateMean");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "osaRiskHint");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "sleepDebtHours");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "consistencyScore");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "sleepAnalyticsJson");
                    int i3 = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j = query.getLong(columnIndexOrThrow);
                        long j2 = query.getLong(columnIndexOrThrow2);
                        long j3 = query.getLong(columnIndexOrThrow3);
                        int i4 = query.getInt(columnIndexOrThrow4);
                        Integer valueOf2 = query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5));
                        Integer valueOf3 = query.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow6));
                        Integer valueOf4 = query.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow7));
                        Integer valueOf5 = query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8));
                        String string2 = query.getString(columnIndexOrThrow9);
                        String string3 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                        Integer valueOf6 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                        Integer valueOf7 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = i3;
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow13));
                            i = i3;
                        }
                        Integer valueOf8 = query.isNull(i) ? null : Integer.valueOf(query.getInt(i));
                        int i5 = columnIndexOrThrow15;
                        int i6 = columnIndexOrThrow;
                        Integer valueOf9 = query.isNull(i5) ? null : Integer.valueOf(query.getInt(i5));
                        int i7 = columnIndexOrThrow16;
                        boolean z = query.getInt(i7) != 0;
                        int i8 = columnIndexOrThrow17;
                        Integer valueOf10 = query.isNull(i8) ? null : Integer.valueOf(query.getInt(i8));
                        int i9 = columnIndexOrThrow18;
                        Integer valueOf11 = query.isNull(i9) ? null : Integer.valueOf(query.getInt(i9));
                        int i10 = columnIndexOrThrow19;
                        Integer valueOf12 = query.isNull(i10) ? null : Integer.valueOf(query.getInt(i10));
                        int i11 = columnIndexOrThrow20;
                        Integer valueOf13 = query.isNull(i11) ? null : Integer.valueOf(query.getInt(i11));
                        int i12 = columnIndexOrThrow21;
                        String string4 = query.isNull(i12) ? null : query.getString(i12);
                        int i13 = columnIndexOrThrow22;
                        String string5 = query.isNull(i13) ? null : query.getString(i13);
                        int i14 = columnIndexOrThrow23;
                        Float valueOf14 = query.isNull(i14) ? null : Float.valueOf(query.getFloat(i14));
                        int i15 = columnIndexOrThrow24;
                        Float valueOf15 = query.isNull(i15) ? null : Float.valueOf(query.getFloat(i15));
                        int i16 = columnIndexOrThrow25;
                        String string6 = query.isNull(i16) ? null : query.getString(i16);
                        int i17 = columnIndexOrThrow26;
                        Float valueOf16 = query.isNull(i17) ? null : Float.valueOf(query.getFloat(i17));
                        int i18 = columnIndexOrThrow27;
                        String string7 = query.isNull(i18) ? null : query.getString(i18);
                        int i19 = columnIndexOrThrow28;
                        Float valueOf17 = query.isNull(i19) ? null : Float.valueOf(query.getFloat(i19));
                        int i20 = columnIndexOrThrow29;
                        Integer valueOf18 = query.isNull(i20) ? null : Integer.valueOf(query.getInt(i20));
                        int i21 = columnIndexOrThrow30;
                        if (query.isNull(i21)) {
                            i2 = i21;
                            string = null;
                        } else {
                            string = query.getString(i21);
                            i2 = i21;
                        }
                        arrayList.add(new SleepEntryEntity(j, j2, j3, i4, valueOf2, valueOf3, valueOf4, valueOf5, string2, string3, valueOf6, valueOf7, valueOf, valueOf8, valueOf9, z, valueOf10, valueOf11, valueOf12, valueOf13, string4, string5, valueOf14, valueOf15, string6, valueOf16, string7, valueOf17, valueOf18, string));
                        columnIndexOrThrow = i6;
                        columnIndexOrThrow15 = i5;
                        columnIndexOrThrow16 = i7;
                        columnIndexOrThrow17 = i8;
                        columnIndexOrThrow18 = i9;
                        columnIndexOrThrow19 = i10;
                        columnIndexOrThrow20 = i11;
                        columnIndexOrThrow21 = i12;
                        columnIndexOrThrow22 = i13;
                        columnIndexOrThrow23 = i14;
                        columnIndexOrThrow24 = i15;
                        columnIndexOrThrow25 = i16;
                        columnIndexOrThrow26 = i17;
                        columnIndexOrThrow27 = i18;
                        columnIndexOrThrow28 = i19;
                        columnIndexOrThrow29 = i20;
                        columnIndexOrThrow30 = i2;
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

    @Override // com.example.rungps.data.SleepDao
    public Object byStartTime(final long startMs, final Continuation<? super SleepEntryEntity> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sleep_entries WHERE startTimeMs = ? LIMIT 1", 1);
        acquire.bindLong(1, startMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<SleepEntryEntity>() { // from class: com.example.rungps.data.SleepDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SleepEntryEntity call() throws Exception {
                SleepEntryEntity sleepEntryEntity;
                Integer valueOf;
                int i;
                Integer valueOf2;
                int i2;
                int i3;
                boolean z;
                Integer valueOf3;
                int i4;
                Integer valueOf4;
                int i5;
                Integer valueOf5;
                int i6;
                Integer valueOf6;
                int i7;
                String string;
                int i8;
                String string2;
                int i9;
                Float valueOf7;
                int i10;
                Float valueOf8;
                int i11;
                String string3;
                int i12;
                Float valueOf9;
                int i13;
                String string4;
                int i14;
                Float valueOf10;
                int i15;
                AnonymousClass10 anonymousClass10 = this;
                Cursor query = DBUtil.query(SleepDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalSleepMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "deepSleepMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "lightSleepMin");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepEfficiency");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "sleepQuality");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wakeMood");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "snoreEvents");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "awakeSleepMin");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "restlessnessIndex");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "remSleepMin");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "smartAlarmUsed");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "timeToFallAsleepMin");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "scoreRoutine");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "scoreQualityPillar");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "scoreDuration");
                        int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "hypnogramCompact");
                        int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "eventMarkersCompact");
                        int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "stageConfidenceMean");
                        int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "micCoverageRatio");
                        int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "fusionSource");
                        int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "breathRateMean");
                        int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "osaRiskHint");
                        int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "sleepDebtHours");
                        int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "consistencyScore");
                        int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "sleepAnalyticsJson");
                        if (query.moveToFirst()) {
                            long j = query.getLong(columnIndexOrThrow);
                            long j2 = query.getLong(columnIndexOrThrow2);
                            long j3 = query.getLong(columnIndexOrThrow3);
                            int i16 = query.getInt(columnIndexOrThrow4);
                            Integer valueOf11 = query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5));
                            Integer valueOf12 = query.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow6));
                            Integer valueOf13 = query.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow7));
                            Integer valueOf14 = query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8));
                            String string5 = query.getString(columnIndexOrThrow9);
                            String string6 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            Integer valueOf15 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                            Integer valueOf16 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                            Integer valueOf17 = query.isNull(columnIndexOrThrow13) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow13));
                            if (query.isNull(columnIndexOrThrow14)) {
                                i = columnIndexOrThrow15;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow14));
                                i = columnIndexOrThrow15;
                            }
                            if (query.isNull(i)) {
                                i2 = columnIndexOrThrow16;
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(query.getInt(i));
                                i2 = columnIndexOrThrow16;
                            }
                            if (query.getInt(i2) != 0) {
                                z = true;
                                i3 = columnIndexOrThrow17;
                            } else {
                                i3 = columnIndexOrThrow17;
                                z = false;
                            }
                            if (query.isNull(i3)) {
                                i4 = columnIndexOrThrow18;
                                valueOf3 = null;
                            } else {
                                valueOf3 = Integer.valueOf(query.getInt(i3));
                                i4 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i4)) {
                                i5 = columnIndexOrThrow19;
                                valueOf4 = null;
                            } else {
                                valueOf4 = Integer.valueOf(query.getInt(i4));
                                i5 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i5)) {
                                i6 = columnIndexOrThrow20;
                                valueOf5 = null;
                            } else {
                                valueOf5 = Integer.valueOf(query.getInt(i5));
                                i6 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i6)) {
                                i7 = columnIndexOrThrow21;
                                valueOf6 = null;
                            } else {
                                valueOf6 = Integer.valueOf(query.getInt(i6));
                                i7 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i7)) {
                                i8 = columnIndexOrThrow22;
                                string = null;
                            } else {
                                string = query.getString(i7);
                                i8 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i8)) {
                                i9 = columnIndexOrThrow23;
                                string2 = null;
                            } else {
                                string2 = query.getString(i8);
                                i9 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i9)) {
                                i10 = columnIndexOrThrow24;
                                valueOf7 = null;
                            } else {
                                valueOf7 = Float.valueOf(query.getFloat(i9));
                                i10 = columnIndexOrThrow24;
                            }
                            if (query.isNull(i10)) {
                                i11 = columnIndexOrThrow25;
                                valueOf8 = null;
                            } else {
                                valueOf8 = Float.valueOf(query.getFloat(i10));
                                i11 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i11)) {
                                i12 = columnIndexOrThrow26;
                                string3 = null;
                            } else {
                                string3 = query.getString(i11);
                                i12 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i12)) {
                                i13 = columnIndexOrThrow27;
                                valueOf9 = null;
                            } else {
                                valueOf9 = Float.valueOf(query.getFloat(i12));
                                i13 = columnIndexOrThrow27;
                            }
                            if (query.isNull(i13)) {
                                i14 = columnIndexOrThrow28;
                                string4 = null;
                            } else {
                                string4 = query.getString(i13);
                                i14 = columnIndexOrThrow28;
                            }
                            if (query.isNull(i14)) {
                                i15 = columnIndexOrThrow29;
                                valueOf10 = null;
                            } else {
                                valueOf10 = Float.valueOf(query.getFloat(i14));
                                i15 = columnIndexOrThrow29;
                            }
                            sleepEntryEntity = new SleepEntryEntity(j, j2, j3, i16, valueOf11, valueOf12, valueOf13, valueOf14, string5, string6, valueOf15, valueOf16, valueOf17, valueOf, valueOf2, z, valueOf3, valueOf4, valueOf5, valueOf6, string, string2, valueOf7, valueOf8, string3, valueOf9, string4, valueOf10, query.isNull(i15) ? null : Integer.valueOf(query.getInt(i15)), query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30));
                        } else {
                            sleepEntryEntity = null;
                        }
                        query.close();
                        acquire.release();
                        return sleepEntryEntity;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass10 = this;
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

    @Override // com.example.rungps.data.SleepDao
    public Object since(final long sinceMs, final Continuation<? super List<SleepEntryEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sleep_entries WHERE startTimeMs >= ? ORDER BY startTimeMs DESC", 1);
        acquire.bindLong(1, sinceMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SleepEntryEntity>>() { // from class: com.example.rungps.data.SleepDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<SleepEntryEntity> call() throws Exception {
                AnonymousClass11 anonymousClass11;
                Integer valueOf;
                int i;
                String string;
                int i2;
                Cursor query = DBUtil.query(SleepDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalSleepMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "deepSleepMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "lightSleepMin");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepEfficiency");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "sleepQuality");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wakeMood");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "snoreEvents");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "awakeSleepMin");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "restlessnessIndex");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "remSleepMin");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "smartAlarmUsed");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "timeToFallAsleepMin");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "scoreRoutine");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "scoreQualityPillar");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "scoreDuration");
                        int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "hypnogramCompact");
                        int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "eventMarkersCompact");
                        int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "stageConfidenceMean");
                        int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "micCoverageRatio");
                        int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "fusionSource");
                        int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "breathRateMean");
                        int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "osaRiskHint");
                        int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "sleepDebtHours");
                        int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "consistencyScore");
                        int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "sleepAnalyticsJson");
                        int i3 = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            long j2 = query.getLong(columnIndexOrThrow2);
                            long j3 = query.getLong(columnIndexOrThrow3);
                            int i4 = query.getInt(columnIndexOrThrow4);
                            Integer valueOf2 = query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5));
                            Integer valueOf3 = query.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow6));
                            Integer valueOf4 = query.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow7));
                            Integer valueOf5 = query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8));
                            String string2 = query.getString(columnIndexOrThrow9);
                            String string3 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            Integer valueOf6 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                            Integer valueOf7 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = i3;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow13));
                                i = i3;
                            }
                            Integer valueOf8 = query.isNull(i) ? null : Integer.valueOf(query.getInt(i));
                            int i5 = columnIndexOrThrow15;
                            int i6 = columnIndexOrThrow;
                            Integer valueOf9 = query.isNull(i5) ? null : Integer.valueOf(query.getInt(i5));
                            int i7 = columnIndexOrThrow16;
                            boolean z = query.getInt(i7) != 0;
                            int i8 = columnIndexOrThrow17;
                            Integer valueOf10 = query.isNull(i8) ? null : Integer.valueOf(query.getInt(i8));
                            int i9 = columnIndexOrThrow18;
                            Integer valueOf11 = query.isNull(i9) ? null : Integer.valueOf(query.getInt(i9));
                            int i10 = columnIndexOrThrow19;
                            Integer valueOf12 = query.isNull(i10) ? null : Integer.valueOf(query.getInt(i10));
                            int i11 = columnIndexOrThrow20;
                            Integer valueOf13 = query.isNull(i11) ? null : Integer.valueOf(query.getInt(i11));
                            int i12 = columnIndexOrThrow21;
                            String string4 = query.isNull(i12) ? null : query.getString(i12);
                            int i13 = columnIndexOrThrow22;
                            String string5 = query.isNull(i13) ? null : query.getString(i13);
                            int i14 = columnIndexOrThrow23;
                            Float valueOf14 = query.isNull(i14) ? null : Float.valueOf(query.getFloat(i14));
                            int i15 = columnIndexOrThrow24;
                            Float valueOf15 = query.isNull(i15) ? null : Float.valueOf(query.getFloat(i15));
                            int i16 = columnIndexOrThrow25;
                            String string6 = query.isNull(i16) ? null : query.getString(i16);
                            int i17 = columnIndexOrThrow26;
                            Float valueOf16 = query.isNull(i17) ? null : Float.valueOf(query.getFloat(i17));
                            int i18 = columnIndexOrThrow27;
                            String string7 = query.isNull(i18) ? null : query.getString(i18);
                            int i19 = columnIndexOrThrow28;
                            Float valueOf17 = query.isNull(i19) ? null : Float.valueOf(query.getFloat(i19));
                            int i20 = columnIndexOrThrow29;
                            Integer valueOf18 = query.isNull(i20) ? null : Integer.valueOf(query.getInt(i20));
                            int i21 = columnIndexOrThrow30;
                            if (query.isNull(i21)) {
                                i2 = i21;
                                string = null;
                            } else {
                                string = query.getString(i21);
                                i2 = i21;
                            }
                            arrayList.add(new SleepEntryEntity(j, j2, j3, i4, valueOf2, valueOf3, valueOf4, valueOf5, string2, string3, valueOf6, valueOf7, valueOf, valueOf8, valueOf9, z, valueOf10, valueOf11, valueOf12, valueOf13, string4, string5, valueOf14, valueOf15, string6, valueOf16, string7, valueOf17, valueOf18, string));
                            columnIndexOrThrow = i6;
                            columnIndexOrThrow15 = i5;
                            columnIndexOrThrow16 = i7;
                            columnIndexOrThrow17 = i8;
                            columnIndexOrThrow18 = i9;
                            columnIndexOrThrow19 = i10;
                            columnIndexOrThrow20 = i11;
                            columnIndexOrThrow21 = i12;
                            columnIndexOrThrow22 = i13;
                            columnIndexOrThrow23 = i14;
                            columnIndexOrThrow24 = i15;
                            columnIndexOrThrow25 = i16;
                            columnIndexOrThrow26 = i17;
                            columnIndexOrThrow27 = i18;
                            columnIndexOrThrow28 = i19;
                            columnIndexOrThrow29 = i20;
                            columnIndexOrThrow30 = i2;
                            i3 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass11 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass11 = this;
                }
            }
        }, $completion);
    }

    @Override // com.example.rungps.data.SleepDao
    public Object overlappingSessions(final long startMs, final long endMs, final Continuation<? super List<SleepEntryEntity>> $completion) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM sleep_entries WHERE startTimeMs < ? AND endTimeMs > ? ORDER BY startTimeMs DESC", 2);
        acquire.bindLong(1, endMs);
        acquire.bindLong(2, startMs);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SleepEntryEntity>>() { // from class: com.example.rungps.data.SleepDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<SleepEntryEntity> call() throws Exception {
                AnonymousClass12 anonymousClass12;
                Integer valueOf;
                int i;
                String string;
                int i2;
                Cursor query = DBUtil.query(SleepDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "startTimeMs");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "endTimeMs");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "totalSleepMin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "deepSleepMin");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "lightSleepMin");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "sleepEfficiency");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "sleepQuality");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, Property.SYMBOL_Z_ORDER_SOURCE);
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "notes");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "wakeMood");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "snoreEvents");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "awakeSleepMin");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "restlessnessIndex");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "remSleepMin");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "smartAlarmUsed");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "timeToFallAsleepMin");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "scoreRoutine");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "scoreQualityPillar");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "scoreDuration");
                        int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "hypnogramCompact");
                        int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "eventMarkersCompact");
                        int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "stageConfidenceMean");
                        int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "micCoverageRatio");
                        int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "fusionSource");
                        int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "breathRateMean");
                        int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "osaRiskHint");
                        int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "sleepDebtHours");
                        int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "consistencyScore");
                        int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "sleepAnalyticsJson");
                        int i3 = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            long j = query.getLong(columnIndexOrThrow);
                            long j2 = query.getLong(columnIndexOrThrow2);
                            long j3 = query.getLong(columnIndexOrThrow3);
                            int i4 = query.getInt(columnIndexOrThrow4);
                            Integer valueOf2 = query.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow5));
                            Integer valueOf3 = query.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow6));
                            Integer valueOf4 = query.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow7));
                            Integer valueOf5 = query.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow8));
                            String string2 = query.getString(columnIndexOrThrow9);
                            String string3 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            Integer valueOf6 = query.isNull(columnIndexOrThrow11) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow11));
                            Integer valueOf7 = query.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(query.getInt(columnIndexOrThrow12));
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = i3;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(columnIndexOrThrow13));
                                i = i3;
                            }
                            Integer valueOf8 = query.isNull(i) ? null : Integer.valueOf(query.getInt(i));
                            int i5 = columnIndexOrThrow15;
                            int i6 = columnIndexOrThrow;
                            Integer valueOf9 = query.isNull(i5) ? null : Integer.valueOf(query.getInt(i5));
                            int i7 = columnIndexOrThrow16;
                            boolean z = query.getInt(i7) != 0;
                            int i8 = columnIndexOrThrow17;
                            Integer valueOf10 = query.isNull(i8) ? null : Integer.valueOf(query.getInt(i8));
                            int i9 = columnIndexOrThrow18;
                            Integer valueOf11 = query.isNull(i9) ? null : Integer.valueOf(query.getInt(i9));
                            int i10 = columnIndexOrThrow19;
                            Integer valueOf12 = query.isNull(i10) ? null : Integer.valueOf(query.getInt(i10));
                            int i11 = columnIndexOrThrow20;
                            Integer valueOf13 = query.isNull(i11) ? null : Integer.valueOf(query.getInt(i11));
                            int i12 = columnIndexOrThrow21;
                            String string4 = query.isNull(i12) ? null : query.getString(i12);
                            int i13 = columnIndexOrThrow22;
                            String string5 = query.isNull(i13) ? null : query.getString(i13);
                            int i14 = columnIndexOrThrow23;
                            Float valueOf14 = query.isNull(i14) ? null : Float.valueOf(query.getFloat(i14));
                            int i15 = columnIndexOrThrow24;
                            Float valueOf15 = query.isNull(i15) ? null : Float.valueOf(query.getFloat(i15));
                            int i16 = columnIndexOrThrow25;
                            String string6 = query.isNull(i16) ? null : query.getString(i16);
                            int i17 = columnIndexOrThrow26;
                            Float valueOf16 = query.isNull(i17) ? null : Float.valueOf(query.getFloat(i17));
                            int i18 = columnIndexOrThrow27;
                            String string7 = query.isNull(i18) ? null : query.getString(i18);
                            int i19 = columnIndexOrThrow28;
                            Float valueOf17 = query.isNull(i19) ? null : Float.valueOf(query.getFloat(i19));
                            int i20 = columnIndexOrThrow29;
                            Integer valueOf18 = query.isNull(i20) ? null : Integer.valueOf(query.getInt(i20));
                            int i21 = columnIndexOrThrow30;
                            if (query.isNull(i21)) {
                                i2 = i21;
                                string = null;
                            } else {
                                string = query.getString(i21);
                                i2 = i21;
                            }
                            arrayList.add(new SleepEntryEntity(j, j2, j3, i4, valueOf2, valueOf3, valueOf4, valueOf5, string2, string3, valueOf6, valueOf7, valueOf, valueOf8, valueOf9, z, valueOf10, valueOf11, valueOf12, valueOf13, string4, string5, valueOf14, valueOf15, string6, valueOf16, string7, valueOf17, valueOf18, string));
                            columnIndexOrThrow = i6;
                            columnIndexOrThrow15 = i5;
                            columnIndexOrThrow16 = i7;
                            columnIndexOrThrow17 = i8;
                            columnIndexOrThrow18 = i9;
                            columnIndexOrThrow19 = i10;
                            columnIndexOrThrow20 = i11;
                            columnIndexOrThrow21 = i12;
                            columnIndexOrThrow22 = i13;
                            columnIndexOrThrow23 = i14;
                            columnIndexOrThrow24 = i15;
                            columnIndexOrThrow25 = i16;
                            columnIndexOrThrow26 = i17;
                            columnIndexOrThrow27 = i18;
                            columnIndexOrThrow28 = i19;
                            columnIndexOrThrow29 = i20;
                            columnIndexOrThrow30 = i2;
                            i3 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass12 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass12 = this;
                }
            }
        }, $completion);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
