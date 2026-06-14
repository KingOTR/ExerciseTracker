package com.example.rungps.data;

import android.content.Context;
import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.rungps.AppBranding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDb.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&¨\u0006%"}, d2 = {"Lcom/example/rungps/data/AppDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "runDao", "Lcom/example/rungps/data/RunDao;", "gearDao", "Lcom/example/rungps/data/GearDao;", "runHrSampleDao", "Lcom/example/rungps/data/RunHrSampleDao;", "spotifyTimelineDao", "Lcom/example/rungps/data/SpotifyTimelineDao;", "routeDao", "Lcom/example/rungps/data/RouteDao;", "gymDao", "Lcom/example/rungps/data/GymDao;", "dailyStepsDao", "Lcom/example/rungps/data/DailyStepsDao;", "runSplitDao", "Lcom/example/rungps/data/RunSplitDao;", "stravaPbDao", "Lcom/example/rungps/data/StravaPbDao;", "recoveryDao", "Lcom/example/rungps/data/RecoveryDao;", "sleepDao", "Lcom/example/rungps/data/SleepDao;", "sleepSoundDao", "Lcom/example/rungps/data/SleepSoundDao;", "exerciseMuscleDao", "Lcom/example/rungps/data/ExerciseMuscleDao;", "soccerDao", "Lcom/example/rungps/data/SoccerDao;", "trainingPlanDao", "Lcom/example/rungps/data/TrainingPlanDao;", "archivedTrainingWeekDao", "Lcom/example/rungps/data/ArchivedTrainingWeekDao;", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AppDb extends RoomDatabase {
    public static final int $stable = 0;
    private static volatile AppDb instance;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AppDb$Companion$MIGRATION_4_5$1 MIGRATION_4_5 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_4_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE gym_exercise_templates ADD COLUMN defaultSets INTEGER NOT NULL DEFAULT 3");
        }
    };
    private static final AppDb$Companion$MIGRATION_5_6$1 MIGRATION_5_6 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_5_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS daily_steps (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    epochDay INTEGER NOT NULL,\n    steps INTEGER NOT NULL,\n    source TEXT NOT NULL,\n    syncedAtMs INTEGER NOT NULL\n)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_daily_steps_epochDay ON daily_steps(epochDay)");
        }
    };
    private static final AppDb$Companion$MIGRATION_6_7$1 MIGRATION_6_7 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_6_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS run_splits (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    runId INTEGER NOT NULL,\n    kind TEXT NOT NULL,\n    idx INTEGER NOT NULL,\n    elapsedEndMs INTEGER NOT NULL,\n    durationMs INTEGER NOT NULL,\n    distanceM REAL NOT NULL,\n    FOREIGN KEY(runId) REFERENCES runs(id) ON DELETE CASCADE\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_run_splits_runId ON run_splits(runId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_run_splits_kind ON run_splits(kind)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_run_splits_idx ON run_splits(idx)");
        }
    };
    private static final AppDb$Companion$MIGRATION_7_8$1 MIGRATION_7_8 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_7_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS strava_pbs (\n    distanceKey TEXT NOT NULL PRIMARY KEY,\n    targetDistanceM REAL NOT NULL,\n    bestMovingTimeSec INTEGER NOT NULL,\n    activityId INTEGER NOT NULL,\n    activityName TEXT,\n    startDate TEXT,\n    syncedAtMs INTEGER NOT NULL\n)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_strava_pbs_distanceKey ON strava_pbs(distanceKey)");
        }
    };
    private static final AppDb$Companion$MIGRATION_8_9$1 MIGRATION_8_9 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_8_9$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS recovery_events (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    kind TEXT NOT NULL,\n    sourceId INTEGER NOT NULL,\n    startedAtMs INTEGER NOT NULL,\n    endsAtMs INTEGER NOT NULL,\n    loadScore REAL NOT NULL,\n    notes TEXT\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_recovery_events_startedAtMs ON recovery_events(startedAtMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_recovery_events_endsAtMs ON recovery_events(endsAtMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_recovery_events_kind ON recovery_events(kind)");
        }
    };
    private static final AppDb$Companion$MIGRATION_30_31$1 MIGRATION_30_31 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_30_31$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "gym_sets", "loggedAtMs");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE gym_sets ADD COLUMN loggedAtMs INTEGER");
            }
            db.execSQL("UPDATE gym_sets\nSET loggedAtMs = (\n    SELECT s.startedAtMs FROM gym_sessions s WHERE s.id = gym_sets.sessionId\n)\nWHERE loggedAtMs IS NULL\n  AND weightKg > 0\n  AND COALESCE(reps, 0) > 0");
        }
    };
    private static final AppDb$Companion$MIGRATION_31_32$1 MIGRATION_31_32 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_31_32$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "gym_sessions", "ambientTag");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN ambientTag TEXT");
            }
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "gym_sessions", "ambientTagCustom");
            if (tableHasColumn2) {
                return;
            }
            db.execSQL("ALTER TABLE gym_sessions ADD COLUMN ambientTagCustom TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_32_33$1 MIGRATION_32_33 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_32_33$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "exercise_muscle_tags", "setupNote");
            if (tableHasColumn) {
                return;
            }
            db.execSQL("ALTER TABLE exercise_muscle_tags ADD COLUMN setupNote TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_33_34$1 MIGRATION_33_34 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_33_34$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            boolean tableHasColumn3;
            boolean tableHasColumn4;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "steps");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN steps INTEGER");
            }
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "distanceM");
            if (!tableHasColumn2) {
                db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN distanceM INTEGER");
            }
            tableHasColumn3 = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "calories");
            if (!tableHasColumn3) {
                db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN calories INTEGER");
            }
            tableHasColumn4 = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "hrZonesJson");
            if (tableHasColumn4) {
                return;
            }
            db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN hrZonesJson TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_34_35$1 MIGRATION_34_35 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_34_35$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "spotify_timeline", "artUrl");
            if (tableHasColumn) {
                return;
            }
            db.execSQL("ALTER TABLE spotify_timeline ADD COLUMN artUrl TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_35_36$1 MIGRATION_35_36 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_35_36$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "gym_sets", "rpeBorg");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE gym_sets ADD COLUMN rpeBorg INTEGER");
            }
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "gym_sets", "romNote");
            if (tableHasColumn2) {
                return;
            }
            db.execSQL("ALTER TABLE gym_sets ADD COLUMN romNote TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_37_38$1 MIGRATION_37_38 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_37_38$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "runs", "stravaImportId");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE runs ADD COLUMN stravaImportId INTEGER");
            }
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_runs_stravaImportId ON runs(stravaImportId)");
        }
    };
    private static final AppDb$Companion$MIGRATION_40_41$1 MIGRATION_40_41 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_40_41$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "sleepAnalyticsJson");
            if (tableHasColumn) {
                return;
            }
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN sleepAnalyticsJson TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_41_42$1 MIGRATION_41_42 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_41_42$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            boolean tableHasColumn3;
            boolean tableHasColumn4;
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS gear_items (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    gearType TEXT NOT NULL,\n    name TEXT NOT NULL,\n    brand TEXT,\n    model TEXT,\n    purchaseDateMs INTEGER,\n    startingOdometerKm REAL NOT NULL DEFAULT 0.0,\n    notes TEXT,\n    isRetired INTEGER NOT NULL DEFAULT 0,\n    isDefaultForRun INTEGER NOT NULL DEFAULT 0,\n    isDefaultForRide INTEGER NOT NULL DEFAULT 0,\n    photoUri TEXT,\n    parentGearId INTEGER,\n    createdAtMs INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gear_items_gearType ON gear_items(gearType)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gear_items_isRetired ON gear_items(isRetired)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gear_items_parentGearId ON gear_items(parentGearId)");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "runs", "title");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE runs ADD COLUMN title TEXT");
            }
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "runs", "description");
            if (!tableHasColumn2) {
                db.execSQL("ALTER TABLE runs ADD COLUMN description TEXT");
            }
            tableHasColumn3 = AppDb.INSTANCE.tableHasColumn(db, "runs", "privateNotes");
            if (!tableHasColumn3) {
                db.execSQL("ALTER TABLE runs ADD COLUMN privateNotes TEXT");
            }
            tableHasColumn4 = AppDb.INSTANCE.tableHasColumn(db, "runs", "gearId");
            if (!tableHasColumn4) {
                db.execSQL("ALTER TABLE runs ADD COLUMN gearId INTEGER");
            }
            db.execSQL("CREATE INDEX IF NOT EXISTS index_runs_gearId ON runs(gearId)");
            db.execSQL("UPDATE runs SET title = CASE\n    WHEN activityType = 'BIKE' THEN 'Ride'\n    ELSE 'Run'\nEND\nWHERE title IS NULL");
        }
    };
    private static final AppDb$Companion$MIGRATION_39_40$1 MIGRATION_39_40 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_39_40$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            boolean tableHasColumn3;
            boolean tableHasColumn4;
            boolean tableHasColumn5;
            boolean tableHasColumn6;
            boolean tableHasColumn7;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "stageConfidenceMean");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN stageConfidenceMean REAL");
            }
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "micCoverageRatio");
            if (!tableHasColumn2) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN micCoverageRatio REAL");
            }
            tableHasColumn3 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "fusionSource");
            if (!tableHasColumn3) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN fusionSource TEXT");
            }
            tableHasColumn4 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "breathRateMean");
            if (!tableHasColumn4) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN breathRateMean REAL");
            }
            tableHasColumn5 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "osaRiskHint");
            if (!tableHasColumn5) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN osaRiskHint TEXT");
            }
            tableHasColumn6 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "sleepDebtHours");
            if (!tableHasColumn6) {
                db.execSQL("ALTER TABLE sleep_entries ADD COLUMN sleepDebtHours REAL");
            }
            tableHasColumn7 = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "consistencyScore");
            if (tableHasColumn7) {
                return;
            }
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN consistencyScore INTEGER");
        }
    };
    private static final AppDb$Companion$MIGRATION_38_39$1 MIGRATION_38_39 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_38_39$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS strava_pbs_new (\n    activityKind TEXT NOT NULL DEFAULT 'RUN',\n    distanceKey TEXT NOT NULL,\n    targetDistanceM REAL NOT NULL,\n    bestMovingTimeSec INTEGER NOT NULL,\n    activityId INTEGER NOT NULL,\n    activityName TEXT,\n    startDate TEXT,\n    syncedAtMs INTEGER NOT NULL,\n    PRIMARY KEY (activityKind, distanceKey)\n)");
            db.execSQL("INSERT INTO strava_pbs_new (\n    activityKind, distanceKey, targetDistanceM, bestMovingTimeSec,\n    activityId, activityName, startDate, syncedAtMs\n)\nSELECT 'RUN', distanceKey, targetDistanceM, bestMovingTimeSec,\n    activityId, activityName, startDate, syncedAtMs\nFROM strava_pbs");
            db.execSQL("DROP TABLE strava_pbs");
            db.execSQL("ALTER TABLE strava_pbs_new RENAME TO strava_pbs");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_strava_pbs_activityKind ON strava_pbs(activityKind)");
        }
    };
    private static final AppDb$Companion$MIGRATION_36_37$1 MIGRATION_36_37 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_36_37$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS sleep_sound_events (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    nightStartTimeMs INTEGER NOT NULL,\n    eventTimeMs INTEGER NOT NULL,\n    kind TEXT NOT NULL,\n    intensity REAL NOT NULL,\n    durationMs INTEGER NOT NULL,\n    encryptedFileName TEXT NOT NULL,\n    createdAtMs INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_sleep_sound_events_nightStartTimeMs ON sleep_sound_events(nightStartTimeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_sleep_sound_events_nightStartTimeMs_eventTimeMs ON sleep_sound_events(nightStartTimeMs, eventTimeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_sleep_sound_events_kind ON sleep_sound_events(kind)");
        }
    };
    private static final AppDb$Companion$MIGRATION_29_30$1 MIGRATION_29_30 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_29_30$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS spotify_timeline (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    timeMs INTEGER NOT NULL,\n    runId INTEGER,\n    gymSessionId INTEGER,\n    isPlaying INTEGER NOT NULL,\n    itemType TEXT,\n    itemId TEXT,\n    title TEXT,\n    subtitle TEXT,\n    progressMs INTEGER,\n    FOREIGN KEY(runId) REFERENCES runs(id) ON DELETE CASCADE,\n    FOREIGN KEY(gymSessionId) REFERENCES gym_sessions(id) ON DELETE CASCADE\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_runId ON spotify_timeline(runId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_gymSessionId ON spotify_timeline(gymSessionId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_timeMs ON spotify_timeline(timeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_runId_timeMs ON spotify_timeline(runId, timeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_gymSessionId_timeMs ON spotify_timeline(gymSessionId, timeMs)");
        }
    };
    private static final AppDb$Companion$MIGRATION_9_10$1 MIGRATION_9_10 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_9_10$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE gym_sessions ADD COLUMN freeDay INTEGER NOT NULL DEFAULT 0");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gym_sessions_freeDay ON gym_sessions(freeDay)");
        }
    };
    private static final AppDb$Companion$MIGRATION_10_11$1 MIGRATION_10_11 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_10_11$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS sleep_entries (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    startTimeMs INTEGER NOT NULL,\n    endTimeMs INTEGER NOT NULL,\n    totalSleepMin INTEGER NOT NULL,\n    deepSleepMin INTEGER,\n    lightSleepMin INTEGER,\n    sleepEfficiency INTEGER,\n    sleepQuality INTEGER,\n    source TEXT NOT NULL,\n    notes TEXT\n)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_sleep_entries_startTimeMs ON sleep_entries(startTimeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_sleep_entries_endTimeMs ON sleep_entries(endTimeMs)");
        }
    };
    private static final AppDb$Companion$MIGRATION_11_12$1 MIGRATION_11_12 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_11_12$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("DROP INDEX IF EXISTS index_sleep_entries_startTimeMs");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_sleep_entries_startTimeMs ON sleep_entries(startTimeMs)");
        }
    };
    private static final AppDb$Companion$MIGRATION_12_13$1 MIGRATION_12_13 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_12_13$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS exercise_muscle_tags (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    exerciseNameLower TEXT NOT NULL,\n    displayName TEXT NOT NULL,\n    muscleGroup TEXT NOT NULL\n)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_exercise_muscle_tags_exerciseNameLower ON exercise_muscle_tags(exerciseNameLower)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_exercise_muscle_tags_muscleGroup ON exercise_muscle_tags(muscleGroup)");
        }
    };
    private static final AppDb$Companion$MIGRATION_13_14$1 MIGRATION_13_14 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_13_14$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS soccer_sessions (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    kind TEXT NOT NULL,\n    startTimeMs INTEGER NOT NULL,\n    warmupMin INTEGER NOT NULL,\n    playMin INTEGER NOT NULL,\n    intensity INTEGER NOT NULL,\n    notes TEXT\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_soccer_sessions_startTimeMs ON soccer_sessions(startTimeMs)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_soccer_sessions_kind ON soccer_sessions(kind)");
        }
    };
    private static final AppDb$Companion$MIGRATION_14_15$1 MIGRATION_14_15 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_14_15$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE gym_sessions ADD COLUMN remoteId TEXT");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_gym_sessions_remoteId ON gym_sessions(remoteId)");
        }
    };
    private static final AppDb$Companion$MIGRATION_15_16$1 MIGRATION_15_16 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_15_16$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS training_plan_progress (\n    id INTEGER NOT NULL PRIMARY KEY,\n    planSlug TEXT NOT NULL,\n    title TEXT NOT NULL,\n    startEpochDay INTEGER NOT NULL,\n    nextWorkoutIndex INTEGER NOT NULL,\n    updatedAtMs INTEGER NOT NULL\n)");
        }
    };
    private static final AppDb$Companion$MIGRATION_16_17$1 MIGRATION_16_17 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_16_17$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE exercise_muscle_tags ADD COLUMN secondaryMuscleGroup TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_17_18$1 MIGRATION_17_18 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_17_18$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN watchSessionId INTEGER");
        }
    };
    private static final AppDb$Companion$MIGRATION_18_19$1 MIGRATION_18_19 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_18_19$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_soccer_sessions_watchSessionId ON soccer_sessions(watchSessionId)");
        }
    };
    private static final AppDb$Companion$MIGRATION_19_20$1 MIGRATION_19_20 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_19_20$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN wakeMood INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN snoreEvents INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN awakeSleepMin INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN restlessnessIndex INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN remSleepMin INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN smartAlarmUsed INTEGER NOT NULL DEFAULT 0");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN timeToFallAsleepMin INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN scoreRoutine INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN scoreQualityPillar INTEGER");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN scoreDuration INTEGER");
        }
    };
    private static final AppDb$Companion$MIGRATION_20_21$1 MIGRATION_20_21 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_20_21$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE runs ADD COLUMN activityType TEXT NOT NULL DEFAULT 'RUN'");
            db.execSQL("ALTER TABLE exercise_muscle_tags ADD COLUMN isUnilateral INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final AppDb$Companion$MIGRATION_21_22$1 MIGRATION_21_22 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_21_22$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN hypnogramCompact TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_22_23$1 MIGRATION_22_23 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_22_23$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("ALTER TABLE routes ADD COLUMN remoteId TEXT");
            db.execSQL("ALTER TABLE routes ADD COLUMN dedupeKey TEXT");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_routes_remoteId ON routes(remoteId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_routes_dedupeKey ON routes(dedupeKey)");
        }
    };
    private static final AppDb$Companion$MIGRATION_23_24$1 MIGRATION_23_24 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_23_24$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS run_hr_samples (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    runId INTEGER NOT NULL,\n    timeMs INTEGER NOT NULL,\n    bpm INTEGER NOT NULL,\n    FOREIGN KEY(runId) REFERENCES runs(id) ON DELETE CASCADE\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_run_hr_samples_runId ON run_hr_samples(runId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_run_hr_samples_timeMs ON run_hr_samples(timeMs)");
        }
    };
    private static final AppDb$Companion$MIGRATION_26_27$1 MIGRATION_26_27 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_26_27$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "sleep_entries", "eventMarkersCompact");
            if (tableHasColumn) {
                return;
            }
            db.execSQL("ALTER TABLE sleep_entries ADD COLUMN eventMarkersCompact TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_27_28$1 MIGRATION_27_28 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_27_28$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS gym_carryover (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    splitId INTEGER NOT NULL,\n    templateDayId INTEGER NOT NULL,\n    exerciseName TEXT NOT NULL,\n    owedSetIndices TEXT NOT NULL,\n    fromSessionId INTEGER NOT NULL,\n    createdAtMs INTEGER NOT NULL\n)");
            db.execSQL("DROP INDEX IF EXISTS index_gym_carryover_split_day_ex");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_gym_carryover_splitId_templateDayId_exerciseName ON gym_carryover(splitId, templateDayId, exerciseName)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gym_carryover_templateDayId ON gym_carryover(templateDayId)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_gym_carryover_splitId ON gym_carryover(splitId)");
        }
    };
    private static final AppDb$Companion$MIGRATION_28_29$1 MIGRATION_28_29 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_28_29$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "exercise_muscle_tags", "tertiaryMuscleGroup");
            if (tableHasColumn) {
                return;
            }
            db.execSQL("ALTER TABLE exercise_muscle_tags ADD COLUMN tertiaryMuscleGroup TEXT");
        }
    };
    private static final AppDb$Companion$MIGRATION_25_26$1 MIGRATION_25_26 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_25_26$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            boolean tableHasColumn;
            boolean tableHasColumn2;
            boolean tableHasColumn3;
            Intrinsics.checkNotNullParameter(db, "db");
            tableHasColumn = AppDb.INSTANCE.tableHasColumn(db, "runs", "watchImportId");
            if (!tableHasColumn) {
                db.execSQL("ALTER TABLE runs ADD COLUMN watchImportId INTEGER");
            }
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_runs_watchImportId ON runs(watchImportId)");
            tableHasColumn2 = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "hrAvgBpm");
            if (!tableHasColumn2) {
                db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN hrAvgBpm INTEGER");
            }
            tableHasColumn3 = AppDb.INSTANCE.tableHasColumn(db, "soccer_sessions", "hrMaxBpm");
            if (tableHasColumn3) {
                return;
            }
            db.execSQL("ALTER TABLE soccer_sessions ADD COLUMN hrMaxBpm INTEGER");
        }
    };
    private static final AppDb$Companion$MIGRATION_24_25$1 MIGRATION_24_25 = new Migration() { // from class: com.example.rungps.data.AppDb$Companion$MIGRATION_24_25$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS archived_training_weeks (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    weekStartEpochDay INTEGER NOT NULL,\n    weekEndEpochDay INTEGER NOT NULL,\n    archivedAtMs INTEGER NOT NULL,\n    totalRunKm REAL NOT NULL,\n    totalGymKg REAL NOT NULL,\n    sleepNights INTEGER NOT NULL,\n    snapshotJson TEXT NOT NULL\n)");
            db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_archived_training_weeks_weekStartEpochDay ON archived_training_weeks(weekStartEpochDay)");
        }
    };

    public abstract ArchivedTrainingWeekDao archivedTrainingWeekDao();

    public abstract DailyStepsDao dailyStepsDao();

    public abstract ExerciseMuscleDao exerciseMuscleDao();

    public abstract GearDao gearDao();

    public abstract GymDao gymDao();

    public abstract RecoveryDao recoveryDao();

    public abstract RouteDao routeDao();

    public abstract RunDao runDao();

    public abstract RunHrSampleDao runHrSampleDao();

    public abstract RunSplitDao runSplitDao();

    public abstract SleepDao sleepDao();

    public abstract SleepSoundDao sleepSoundDao();

    public abstract SoccerDao soccerDao();

    public abstract SpotifyTimelineDao spotifyTimelineDao();

    public abstract StravaPbDao stravaPbDao();

    public abstract TrainingPlanDao trainingPlanDao();

    /* compiled from: AppDb.kt */
    @Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*&\u0007\n\r\u0010\u0013\u0016\u0019\u001c\u001f\"%(+.147:=@CFILORUX[^adgqtwz}\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010\u007f\u001a\u00020\u00052\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102R\u0010\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0004\n\u0002\u00105R\u0010\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R\u0010\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0004\n\u0002\u0010>R\u0010\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010AR\u0010\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0004\n\u0002\u0010DR\u0010\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0004\n\u0002\u0010GR\u0010\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0004\n\u0002\u0010JR\u0010\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0004\n\u0002\u0010MR\u0010\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0004\n\u0002\u0010PR\u0010\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0004\n\u0002\u0010SR\u0010\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0004\n\u0002\u0010VR\u0010\u0010W\u001a\u00020XX\u0082\u0004¢\u0006\u0004\n\u0002\u0010YR\u0010\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\\R\u0010\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0004\n\u0002\u0010_R\u0010\u0010`\u001a\u00020aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010bR\u0010\u0010c\u001a\u00020dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010eR\u0010\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0004\n\u0002\u0010hR\u0010\u0010p\u001a\u00020qX\u0082\u0004¢\u0006\u0004\n\u0002\u0010rR\u0010\u0010s\u001a\u00020tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010uR\u0010\u0010v\u001a\u00020wX\u0082\u0004¢\u0006\u0004\n\u0002\u0010xR\u0010\u0010y\u001a\u00020zX\u0082\u0004¢\u0006\u0004\n\u0002\u0010{R\u0010\u0010|\u001a\u00020}X\u0082\u0004¢\u0006\u0004\n\u0002\u0010~¨\u0006\u0082\u0001"}, d2 = {"Lcom/example/rungps/data/AppDb$Companion;", "", "<init>", "()V", "instance", "Lcom/example/rungps/data/AppDb;", "MIGRATION_4_5", "com/example/rungps/data/AppDb$Companion$MIGRATION_4_5$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_4_5$1;", "MIGRATION_5_6", "com/example/rungps/data/AppDb$Companion$MIGRATION_5_6$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_5_6$1;", "MIGRATION_6_7", "com/example/rungps/data/AppDb$Companion$MIGRATION_6_7$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_6_7$1;", "MIGRATION_7_8", "com/example/rungps/data/AppDb$Companion$MIGRATION_7_8$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_7_8$1;", "MIGRATION_8_9", "com/example/rungps/data/AppDb$Companion$MIGRATION_8_9$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_8_9$1;", "MIGRATION_30_31", "com/example/rungps/data/AppDb$Companion$MIGRATION_30_31$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_30_31$1;", "MIGRATION_31_32", "com/example/rungps/data/AppDb$Companion$MIGRATION_31_32$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_31_32$1;", "MIGRATION_32_33", "com/example/rungps/data/AppDb$Companion$MIGRATION_32_33$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_32_33$1;", "MIGRATION_33_34", "com/example/rungps/data/AppDb$Companion$MIGRATION_33_34$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_33_34$1;", "MIGRATION_34_35", "com/example/rungps/data/AppDb$Companion$MIGRATION_34_35$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_34_35$1;", "MIGRATION_35_36", "com/example/rungps/data/AppDb$Companion$MIGRATION_35_36$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_35_36$1;", "MIGRATION_37_38", "com/example/rungps/data/AppDb$Companion$MIGRATION_37_38$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_37_38$1;", "MIGRATION_40_41", "com/example/rungps/data/AppDb$Companion$MIGRATION_40_41$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_40_41$1;", "MIGRATION_41_42", "com/example/rungps/data/AppDb$Companion$MIGRATION_41_42$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_41_42$1;", "MIGRATION_39_40", "com/example/rungps/data/AppDb$Companion$MIGRATION_39_40$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_39_40$1;", "MIGRATION_38_39", "com/example/rungps/data/AppDb$Companion$MIGRATION_38_39$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_38_39$1;", "MIGRATION_36_37", "com/example/rungps/data/AppDb$Companion$MIGRATION_36_37$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_36_37$1;", "MIGRATION_29_30", "com/example/rungps/data/AppDb$Companion$MIGRATION_29_30$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_29_30$1;", "MIGRATION_9_10", "com/example/rungps/data/AppDb$Companion$MIGRATION_9_10$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_9_10$1;", "MIGRATION_10_11", "com/example/rungps/data/AppDb$Companion$MIGRATION_10_11$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_10_11$1;", "MIGRATION_11_12", "com/example/rungps/data/AppDb$Companion$MIGRATION_11_12$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_11_12$1;", "MIGRATION_12_13", "com/example/rungps/data/AppDb$Companion$MIGRATION_12_13$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_12_13$1;", "MIGRATION_13_14", "com/example/rungps/data/AppDb$Companion$MIGRATION_13_14$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_13_14$1;", "MIGRATION_14_15", "com/example/rungps/data/AppDb$Companion$MIGRATION_14_15$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_14_15$1;", "MIGRATION_15_16", "com/example/rungps/data/AppDb$Companion$MIGRATION_15_16$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_15_16$1;", "MIGRATION_16_17", "com/example/rungps/data/AppDb$Companion$MIGRATION_16_17$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_16_17$1;", "MIGRATION_17_18", "com/example/rungps/data/AppDb$Companion$MIGRATION_17_18$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_17_18$1;", "MIGRATION_18_19", "com/example/rungps/data/AppDb$Companion$MIGRATION_18_19$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_18_19$1;", "MIGRATION_19_20", "com/example/rungps/data/AppDb$Companion$MIGRATION_19_20$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_19_20$1;", "MIGRATION_20_21", "com/example/rungps/data/AppDb$Companion$MIGRATION_20_21$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_20_21$1;", "MIGRATION_21_22", "com/example/rungps/data/AppDb$Companion$MIGRATION_21_22$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_21_22$1;", "MIGRATION_22_23", "com/example/rungps/data/AppDb$Companion$MIGRATION_22_23$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_22_23$1;", "MIGRATION_23_24", "com/example/rungps/data/AppDb$Companion$MIGRATION_23_24$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_23_24$1;", "tableHasColumn", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "table", "", "column", "MIGRATION_26_27", "com/example/rungps/data/AppDb$Companion$MIGRATION_26_27$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_26_27$1;", "MIGRATION_27_28", "com/example/rungps/data/AppDb$Companion$MIGRATION_27_28$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_27_28$1;", "MIGRATION_28_29", "com/example/rungps/data/AppDb$Companion$MIGRATION_28_29$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_28_29$1;", "MIGRATION_25_26", "com/example/rungps/data/AppDb$Companion$MIGRATION_25_26$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_25_26$1;", "MIGRATION_24_25", "com/example/rungps/data/AppDb$Companion$MIGRATION_24_25$1", "Lcom/example/rungps/data/AppDb$Companion$MIGRATION_24_25$1;", "get", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tableHasColumn(SupportSQLiteDatabase db, String table, String column) {
            Cursor query = db.query("PRAGMA table_info(`" + table + "`)");
            try {
                Cursor cursor = query;
                int columnIndex = cursor.getColumnIndex(HintConstants.AUTOFILL_HINT_NAME);
                if (columnIndex < 0) {
                    CloseableKt.closeFinally(query, null);
                    return false;
                }
                while (cursor.moveToNext()) {
                    if (Intrinsics.areEqual(cursor.getString(columnIndex), column)) {
                        CloseableKt.closeFinally(query, null);
                        return true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(query, null);
                return false;
            } finally {
            }
        }

        public final AppDb get(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppDb appDb = AppDb.instance;
            if (appDb == null) {
                synchronized (this) {
                    appDb = AppDb.instance;
                    if (appDb == null) {
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        RoomDatabase build = Room.databaseBuilder(applicationContext, AppDb.class, AppBranding.DATABASE_FILE).addCallback(new RoomDatabase.Callback() { // from class: com.example.rungps.data.AppDb$Companion$get$1$1
                            @Override // androidx.room.RoomDatabase.Callback
                            public void onOpen(SupportSQLiteDatabase db) {
                                Intrinsics.checkNotNullParameter(db, "db");
                                super.onOpen(db);
                                db.execSQL("PRAGMA foreign_keys=ON");
                            }
                        }).addMigrations(AppDb.MIGRATION_4_5, AppDb.MIGRATION_5_6, AppDb.MIGRATION_6_7, AppDb.MIGRATION_7_8, AppDb.MIGRATION_8_9, AppDb.MIGRATION_9_10, AppDb.MIGRATION_10_11, AppDb.MIGRATION_11_12, AppDb.MIGRATION_12_13, AppDb.MIGRATION_13_14, AppDb.MIGRATION_14_15, AppDb.MIGRATION_15_16, AppDb.MIGRATION_16_17, AppDb.MIGRATION_17_18, AppDb.MIGRATION_18_19, AppDb.MIGRATION_19_20, AppDb.MIGRATION_20_21, AppDb.MIGRATION_21_22, AppDb.MIGRATION_22_23, AppDb.MIGRATION_23_24, AppDb.MIGRATION_24_25, AppDb.MIGRATION_25_26, AppDb.MIGRATION_26_27, AppDb.MIGRATION_27_28, AppDb.MIGRATION_28_29, AppDb.MIGRATION_29_30, AppDb.MIGRATION_30_31, AppDb.MIGRATION_31_32, AppDb.MIGRATION_32_33, AppDb.MIGRATION_33_34, AppDb.MIGRATION_34_35, AppDb.MIGRATION_35_36, AppDb.MIGRATION_36_37, AppDb.MIGRATION_37_38, AppDb.MIGRATION_38_39, AppDb.MIGRATION_39_40, AppDb.MIGRATION_40_41, AppDb.MIGRATION_41_42).fallbackToDestructiveMigrationFrom(1, 2, 3).build();
                        Companion companion = AppDb.INSTANCE;
                        AppDb.instance = (AppDb) build;
                        appDb = (AppDb) build;
                    }
                }
            }
            return appDb;
        }
    }
}
