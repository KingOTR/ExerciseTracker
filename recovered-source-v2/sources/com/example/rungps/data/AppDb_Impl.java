package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.example.rungps.tracking.TrackingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.maplibre.android.style.layers.Property;

/* loaded from: classes3.dex */
public final class AppDb_Impl extends AppDb {
    private volatile ArchivedTrainingWeekDao _archivedTrainingWeekDao;
    private volatile DailyStepsDao _dailyStepsDao;
    private volatile ExerciseMuscleDao _exerciseMuscleDao;
    private volatile GearDao _gearDao;
    private volatile GymDao _gymDao;
    private volatile RecoveryDao _recoveryDao;
    private volatile RouteDao _routeDao;
    private volatile RunDao _runDao;
    private volatile RunHrSampleDao _runHrSampleDao;
    private volatile RunSplitDao _runSplitDao;
    private volatile SleepDao _sleepDao;
    private volatile SleepSoundDao _sleepSoundDao;
    private volatile SoccerDao _soccerDao;
    private volatile SpotifyTimelineDao _spotifyTimelineDao;
    private volatile StravaPbDao _stravaPbDao;
    private volatile TrainingPlanDao _trainingPlanDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(42) { // from class: com.example.rungps.data.AppDb_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `runs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `startedAtMs` INTEGER NOT NULL, `endedAtMs` INTEGER, `totalDistanceM` REAL NOT NULL, `totalDurationMs` INTEGER NOT NULL, `totalSteps` INTEGER NOT NULL, `planType` TEXT, `timeSession` TEXT, `activityType` TEXT NOT NULL DEFAULT 'RUN', `watchImportId` INTEGER, `stravaImportId` INTEGER, `title` TEXT, `description` TEXT, `privateNotes` TEXT, `gearId` INTEGER)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_runs_watchImportId` ON `runs` (`watchImportId`)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_runs_stravaImportId` ON `runs` (`stravaImportId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_runs_gearId` ON `runs` (`gearId`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `points` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `runId` INTEGER NOT NULL, `timeMs` INTEGER NOT NULL, `lat` REAL NOT NULL, `lon` REAL NOT NULL, `accuracyM` REAL NOT NULL, `eleM` REAL, `distanceFromPrevM` REAL NOT NULL, FOREIGN KEY(`runId`) REFERENCES `runs`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_points_runId` ON `points` (`runId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_points_timeMs` ON `points` (`timeMs`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `run_hr_samples` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `runId` INTEGER NOT NULL, `timeMs` INTEGER NOT NULL, `bpm` INTEGER NOT NULL, FOREIGN KEY(`runId`) REFERENCES `runs`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_run_hr_samples_runId` ON `run_hr_samples` (`runId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_run_hr_samples_timeMs` ON `run_hr_samples` (`timeMs`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `spotify_timeline` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timeMs` INTEGER NOT NULL, `runId` INTEGER, `gymSessionId` INTEGER, `isPlaying` INTEGER NOT NULL, `itemType` TEXT, `itemId` TEXT, `title` TEXT, `subtitle` TEXT, `progressMs` INTEGER, `artUrl` TEXT, FOREIGN KEY(`runId`) REFERENCES `runs`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`gymSessionId`) REFERENCES `gym_sessions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_spotify_timeline_runId` ON `spotify_timeline` (`runId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_spotify_timeline_gymSessionId` ON `spotify_timeline` (`gymSessionId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_spotify_timeline_timeMs` ON `spotify_timeline` (`timeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_spotify_timeline_runId_timeMs` ON `spotify_timeline` (`runId`, `timeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_spotify_timeline_gymSessionId_timeMs` ON `spotify_timeline` (`gymSessionId`, `timeMs`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `routes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `createdAtMs` INTEGER NOT NULL, `distanceM` REAL NOT NULL, `remoteId` TEXT, `dedupeKey` TEXT)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_routes_remoteId` ON `routes` (`remoteId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_routes_dedupeKey` ON `routes` (`dedupeKey`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `route_points` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `routeId` INTEGER NOT NULL, `idx` INTEGER NOT NULL, `lat` REAL NOT NULL, `lon` REAL NOT NULL, FOREIGN KEY(`routeId`) REFERENCES `routes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_route_points_routeId` ON `route_points` (`routeId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_route_points_idx` ON `route_points` (`idx`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_splits` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `createdAtMs` INTEGER NOT NULL)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_day_templates` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `splitId` INTEGER NOT NULL, `dayName` TEXT NOT NULL, `orderIdx` INTEGER NOT NULL, FOREIGN KEY(`splitId`) REFERENCES `gym_splits`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_day_templates_splitId` ON `gym_day_templates` (`splitId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_day_templates_orderIdx` ON `gym_day_templates` (`orderIdx`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_exercise_templates` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dayTemplateId` INTEGER NOT NULL, `name` TEXT NOT NULL, `orderIdx` INTEGER NOT NULL, `defaultSets` INTEGER NOT NULL, FOREIGN KEY(`dayTemplateId`) REFERENCES `gym_day_templates`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_exercise_templates_dayTemplateId` ON `gym_exercise_templates` (`dayTemplateId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_exercise_templates_orderIdx` ON `gym_exercise_templates` (`orderIdx`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_sessions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `startedAtMs` INTEGER NOT NULL, `endedAtMs` INTEGER, `templateDayId` INTEGER, `freeDay` INTEGER NOT NULL, `notes` TEXT, `ambientTag` TEXT, `ambientTagCustom` TEXT, `remoteId` TEXT)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sessions_startedAtMs` ON `gym_sessions` (`startedAtMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sessions_templateDayId` ON `gym_sessions` (`templateDayId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sessions_freeDay` ON `gym_sessions` (`freeDay`)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_gym_sessions_remoteId` ON `gym_sessions` (`remoteId`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_sets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sessionId` INTEGER NOT NULL, `exerciseName` TEXT NOT NULL, `setIndex` INTEGER NOT NULL, `reps` INTEGER, `weightKg` REAL NOT NULL, `loggedAtMs` INTEGER, `rpeBorg` INTEGER, `romNote` TEXT, FOREIGN KEY(`sessionId`) REFERENCES `gym_sessions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sets_sessionId` ON `gym_sets` (`sessionId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sets_exerciseName` ON `gym_sets` (`exerciseName`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_sets_setIndex` ON `gym_sets` (`setIndex`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `daily_steps` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `epochDay` INTEGER NOT NULL, `steps` INTEGER NOT NULL, `source` TEXT NOT NULL, `syncedAtMs` INTEGER NOT NULL)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_daily_steps_epochDay` ON `daily_steps` (`epochDay`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `run_splits` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `runId` INTEGER NOT NULL, `kind` TEXT NOT NULL, `idx` INTEGER NOT NULL, `elapsedEndMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `distanceM` REAL NOT NULL, FOREIGN KEY(`runId`) REFERENCES `runs`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_run_splits_runId` ON `run_splits` (`runId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_run_splits_kind` ON `run_splits` (`kind`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_run_splits_idx` ON `run_splits` (`idx`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `strava_pbs` (`activityKind` TEXT NOT NULL, `distanceKey` TEXT NOT NULL, `targetDistanceM` REAL NOT NULL, `bestMovingTimeSec` INTEGER NOT NULL, `activityId` INTEGER NOT NULL, `activityName` TEXT, `startDate` TEXT, `syncedAtMs` INTEGER NOT NULL, PRIMARY KEY(`activityKind`, `distanceKey`))");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_strava_pbs_activityKind` ON `strava_pbs` (`activityKind`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `recovery_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `kind` TEXT NOT NULL, `sourceId` INTEGER NOT NULL, `startedAtMs` INTEGER NOT NULL, `endsAtMs` INTEGER NOT NULL, `loadScore` REAL NOT NULL, `notes` TEXT)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_recovery_events_startedAtMs` ON `recovery_events` (`startedAtMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_recovery_events_endsAtMs` ON `recovery_events` (`endsAtMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_recovery_events_kind` ON `recovery_events` (`kind`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_entries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `startTimeMs` INTEGER NOT NULL, `endTimeMs` INTEGER NOT NULL, `totalSleepMin` INTEGER NOT NULL, `deepSleepMin` INTEGER, `lightSleepMin` INTEGER, `sleepEfficiency` INTEGER, `sleepQuality` INTEGER, `source` TEXT NOT NULL, `notes` TEXT, `wakeMood` INTEGER, `snoreEvents` INTEGER, `awakeSleepMin` INTEGER, `restlessnessIndex` INTEGER, `remSleepMin` INTEGER, `smartAlarmUsed` INTEGER NOT NULL, `timeToFallAsleepMin` INTEGER, `scoreRoutine` INTEGER, `scoreQualityPillar` INTEGER, `scoreDuration` INTEGER, `hypnogramCompact` TEXT, `eventMarkersCompact` TEXT, `stageConfidenceMean` REAL, `micCoverageRatio` REAL, `fusionSource` TEXT, `breathRateMean` REAL, `osaRiskHint` TEXT, `sleepDebtHours` REAL, `consistencyScore` INTEGER, `sleepAnalyticsJson` TEXT)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_sleep_entries_startTimeMs` ON `sleep_entries` (`startTimeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_sleep_entries_endTimeMs` ON `sleep_entries` (`endTimeMs`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `sleep_sound_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nightStartTimeMs` INTEGER NOT NULL, `eventTimeMs` INTEGER NOT NULL, `kind` TEXT NOT NULL, `intensity` REAL NOT NULL, `durationMs` INTEGER NOT NULL, `encryptedFileName` TEXT NOT NULL, `createdAtMs` INTEGER NOT NULL)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_sleep_sound_events_nightStartTimeMs` ON `sleep_sound_events` (`nightStartTimeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_sleep_sound_events_nightStartTimeMs_eventTimeMs` ON `sleep_sound_events` (`nightStartTimeMs`, `eventTimeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_sleep_sound_events_kind` ON `sleep_sound_events` (`kind`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `exercise_muscle_tags` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exerciseNameLower` TEXT NOT NULL, `displayName` TEXT NOT NULL, `muscleGroup` TEXT NOT NULL, `secondaryMuscleGroup` TEXT, `tertiaryMuscleGroup` TEXT, `isUnilateral` INTEGER NOT NULL, `setupNote` TEXT)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_exercise_muscle_tags_exerciseNameLower` ON `exercise_muscle_tags` (`exerciseNameLower`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_exercise_muscle_tags_muscleGroup` ON `exercise_muscle_tags` (`muscleGroup`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `soccer_sessions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `kind` TEXT NOT NULL, `startTimeMs` INTEGER NOT NULL, `warmupMin` INTEGER NOT NULL, `playMin` INTEGER NOT NULL, `intensity` INTEGER NOT NULL, `notes` TEXT, `watchSessionId` INTEGER, `hrAvgBpm` INTEGER, `hrMaxBpm` INTEGER, `steps` INTEGER, `distanceM` INTEGER, `calories` INTEGER, `hrZonesJson` TEXT)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_soccer_sessions_startTimeMs` ON `soccer_sessions` (`startTimeMs`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_soccer_sessions_kind` ON `soccer_sessions` (`kind`)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_soccer_sessions_watchSessionId` ON `soccer_sessions` (`watchSessionId`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `training_plan_progress` (`id` INTEGER NOT NULL, `planSlug` TEXT NOT NULL, `title` TEXT NOT NULL, `startEpochDay` INTEGER NOT NULL, `nextWorkoutIndex` INTEGER NOT NULL, `updatedAtMs` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS `archived_training_weeks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `weekStartEpochDay` INTEGER NOT NULL, `weekEndEpochDay` INTEGER NOT NULL, `archivedAtMs` INTEGER NOT NULL, `totalRunKm` REAL NOT NULL, `totalGymKg` REAL NOT NULL, `sleepNights` INTEGER NOT NULL, `snapshotJson` TEXT NOT NULL)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_archived_training_weeks_weekStartEpochDay` ON `archived_training_weeks` (`weekStartEpochDay`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gym_carryover` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `splitId` INTEGER NOT NULL, `templateDayId` INTEGER NOT NULL, `exerciseName` TEXT NOT NULL, `owedSetIndices` TEXT NOT NULL, `fromSessionId` INTEGER NOT NULL, `createdAtMs` INTEGER NOT NULL)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_carryover_splitId` ON `gym_carryover` (`splitId`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gym_carryover_templateDayId` ON `gym_carryover` (`templateDayId`)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_gym_carryover_splitId_templateDayId_exerciseName` ON `gym_carryover` (`splitId`, `templateDayId`, `exerciseName`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `gear_items` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `gearType` TEXT NOT NULL, `name` TEXT NOT NULL, `brand` TEXT, `model` TEXT, `purchaseDateMs` INTEGER, `startingOdometerKm` REAL NOT NULL, `notes` TEXT, `isRetired` INTEGER NOT NULL, `isDefaultForRun` INTEGER NOT NULL, `isDefaultForRide` INTEGER NOT NULL, `photoUri` TEXT, `parentGearId` INTEGER, `createdAtMs` INTEGER NOT NULL)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gear_items_gearType` ON `gear_items` (`gearType`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gear_items_isRetired` ON `gear_items` (`isRetired`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_gear_items_parentGearId` ON `gear_items` (`parentGearId`)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e8ce958998928616ee0205c0a6d6fd30')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `runs`");
                db.execSQL("DROP TABLE IF EXISTS `points`");
                db.execSQL("DROP TABLE IF EXISTS `run_hr_samples`");
                db.execSQL("DROP TABLE IF EXISTS `spotify_timeline`");
                db.execSQL("DROP TABLE IF EXISTS `routes`");
                db.execSQL("DROP TABLE IF EXISTS `route_points`");
                db.execSQL("DROP TABLE IF EXISTS `gym_splits`");
                db.execSQL("DROP TABLE IF EXISTS `gym_day_templates`");
                db.execSQL("DROP TABLE IF EXISTS `gym_exercise_templates`");
                db.execSQL("DROP TABLE IF EXISTS `gym_sessions`");
                db.execSQL("DROP TABLE IF EXISTS `gym_sets`");
                db.execSQL("DROP TABLE IF EXISTS `daily_steps`");
                db.execSQL("DROP TABLE IF EXISTS `run_splits`");
                db.execSQL("DROP TABLE IF EXISTS `strava_pbs`");
                db.execSQL("DROP TABLE IF EXISTS `recovery_events`");
                db.execSQL("DROP TABLE IF EXISTS `sleep_entries`");
                db.execSQL("DROP TABLE IF EXISTS `sleep_sound_events`");
                db.execSQL("DROP TABLE IF EXISTS `exercise_muscle_tags`");
                db.execSQL("DROP TABLE IF EXISTS `soccer_sessions`");
                db.execSQL("DROP TABLE IF EXISTS `training_plan_progress`");
                db.execSQL("DROP TABLE IF EXISTS `archived_training_weeks`");
                db.execSQL("DROP TABLE IF EXISTS `gym_carryover`");
                db.execSQL("DROP TABLE IF EXISTS `gear_items`");
                List list = AppDb_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List list = AppDb_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                AppDb_Impl.this.mDatabase = db;
                db.execSQL("PRAGMA foreign_keys = ON");
                AppDb_Impl.this.internalInitInvalidationTracker(db);
                List list = AppDb_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap hashMap = new HashMap(15);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap.put("startedAtMs", new TableInfo.Column("startedAtMs", "INTEGER", true, 0, null, 1));
                hashMap.put("endedAtMs", new TableInfo.Column("endedAtMs", "INTEGER", false, 0, null, 1));
                hashMap.put("totalDistanceM", new TableInfo.Column("totalDistanceM", "REAL", true, 0, null, 1));
                hashMap.put("totalDurationMs", new TableInfo.Column("totalDurationMs", "INTEGER", true, 0, null, 1));
                hashMap.put("totalSteps", new TableInfo.Column("totalSteps", "INTEGER", true, 0, null, 1));
                hashMap.put(TrackingService.EXTRA_PLAN_TYPE, new TableInfo.Column(TrackingService.EXTRA_PLAN_TYPE, "TEXT", false, 0, null, 1));
                hashMap.put(TrackingService.EXTRA_TIME_SESSION, new TableInfo.Column(TrackingService.EXTRA_TIME_SESSION, "TEXT", false, 0, null, 1));
                hashMap.put(TrackingService.EXTRA_ACTIVITY_TYPE, new TableInfo.Column(TrackingService.EXTRA_ACTIVITY_TYPE, "TEXT", true, 0, "'RUN'", 1));
                hashMap.put("watchImportId", new TableInfo.Column("watchImportId", "INTEGER", false, 0, null, 1));
                hashMap.put("stravaImportId", new TableInfo.Column("stravaImportId", "INTEGER", false, 0, null, 1));
                hashMap.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                hashMap.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
                hashMap.put("privateNotes", new TableInfo.Column("privateNotes", "TEXT", false, 0, null, 1));
                hashMap.put("gearId", new TableInfo.Column("gearId", "INTEGER", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(3);
                hashSet2.add(new TableInfo.Index("index_runs_watchImportId", true, Arrays.asList("watchImportId"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_runs_stravaImportId", true, Arrays.asList("stravaImportId"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_runs_gearId", false, Arrays.asList("gearId"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("runs", hashMap, hashSet, hashSet2);
                TableInfo read = TableInfo.read(db, "runs");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "runs(com.example.rungps.data.RunEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("runId", new TableInfo.Column("runId", "INTEGER", true, 0, null, 1));
                hashMap2.put("timeMs", new TableInfo.Column("timeMs", "INTEGER", true, 0, null, 1));
                hashMap2.put("lat", new TableInfo.Column("lat", "REAL", true, 0, null, 1));
                hashMap2.put("lon", new TableInfo.Column("lon", "REAL", true, 0, null, 1));
                hashMap2.put("accuracyM", new TableInfo.Column("accuracyM", "REAL", true, 0, null, 1));
                hashMap2.put("eleM", new TableInfo.Column("eleM", "REAL", false, 0, null, 1));
                hashMap2.put("distanceFromPrevM", new TableInfo.Column("distanceFromPrevM", "REAL", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new TableInfo.ForeignKey("runs", "CASCADE", "NO ACTION", Arrays.asList("runId"), Arrays.asList("id")));
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new TableInfo.Index("index_points_runId", false, Arrays.asList("runId"), Arrays.asList("ASC")));
                hashSet4.add(new TableInfo.Index("index_points_timeMs", false, Arrays.asList("timeMs"), Arrays.asList("ASC")));
                TableInfo tableInfo2 = new TableInfo("points", hashMap2, hashSet3, hashSet4);
                TableInfo read2 = TableInfo.read(db, "points");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "points(com.example.rungps.data.PointEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("runId", new TableInfo.Column("runId", "INTEGER", true, 0, null, 1));
                hashMap3.put("timeMs", new TableInfo.Column("timeMs", "INTEGER", true, 0, null, 1));
                hashMap3.put("bpm", new TableInfo.Column("bpm", "INTEGER", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("runs", "CASCADE", "NO ACTION", Arrays.asList("runId"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(2);
                hashSet6.add(new TableInfo.Index("index_run_hr_samples_runId", false, Arrays.asList("runId"), Arrays.asList("ASC")));
                hashSet6.add(new TableInfo.Index("index_run_hr_samples_timeMs", false, Arrays.asList("timeMs"), Arrays.asList("ASC")));
                TableInfo tableInfo3 = new TableInfo("run_hr_samples", hashMap3, hashSet5, hashSet6);
                TableInfo read3 = TableInfo.read(db, "run_hr_samples");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "run_hr_samples(com.example.rungps.data.RunHrSampleEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(11);
                hashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap4.put("timeMs", new TableInfo.Column("timeMs", "INTEGER", true, 0, null, 1));
                hashMap4.put("runId", new TableInfo.Column("runId", "INTEGER", false, 0, null, 1));
                hashMap4.put("gymSessionId", new TableInfo.Column("gymSessionId", "INTEGER", false, 0, null, 1));
                hashMap4.put("isPlaying", new TableInfo.Column("isPlaying", "INTEGER", true, 0, null, 1));
                hashMap4.put("itemType", new TableInfo.Column("itemType", "TEXT", false, 0, null, 1));
                hashMap4.put("itemId", new TableInfo.Column("itemId", "TEXT", false, 0, null, 1));
                hashMap4.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                hashMap4.put("subtitle", new TableInfo.Column("subtitle", "TEXT", false, 0, null, 1));
                hashMap4.put("progressMs", new TableInfo.Column("progressMs", "INTEGER", false, 0, null, 1));
                hashMap4.put("artUrl", new TableInfo.Column("artUrl", "TEXT", false, 0, null, 1));
                HashSet hashSet7 = new HashSet(2);
                hashSet7.add(new TableInfo.ForeignKey("runs", "CASCADE", "NO ACTION", Arrays.asList("runId"), Arrays.asList("id")));
                hashSet7.add(new TableInfo.ForeignKey("gym_sessions", "CASCADE", "NO ACTION", Arrays.asList("gymSessionId"), Arrays.asList("id")));
                HashSet hashSet8 = new HashSet(5);
                hashSet8.add(new TableInfo.Index("index_spotify_timeline_runId", false, Arrays.asList("runId"), Arrays.asList("ASC")));
                hashSet8.add(new TableInfo.Index("index_spotify_timeline_gymSessionId", false, Arrays.asList("gymSessionId"), Arrays.asList("ASC")));
                hashSet8.add(new TableInfo.Index("index_spotify_timeline_timeMs", false, Arrays.asList("timeMs"), Arrays.asList("ASC")));
                hashSet8.add(new TableInfo.Index("index_spotify_timeline_runId_timeMs", false, Arrays.asList("runId", "timeMs"), Arrays.asList("ASC", "ASC")));
                hashSet8.add(new TableInfo.Index("index_spotify_timeline_gymSessionId_timeMs", false, Arrays.asList("gymSessionId", "timeMs"), Arrays.asList("ASC", "ASC")));
                TableInfo tableInfo4 = new TableInfo("spotify_timeline", hashMap4, hashSet7, hashSet8);
                TableInfo read4 = TableInfo.read(db, "spotify_timeline");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "spotify_timeline(com.example.rungps.data.SpotifyTimelineEntity).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(6);
                hashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap5.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap5.put("createdAtMs", new TableInfo.Column("createdAtMs", "INTEGER", true, 0, null, 1));
                hashMap5.put("distanceM", new TableInfo.Column("distanceM", "REAL", true, 0, null, 1));
                hashMap5.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, 1));
                hashMap5.put("dedupeKey", new TableInfo.Column("dedupeKey", "TEXT", false, 0, null, 1));
                HashSet hashSet9 = new HashSet(0);
                HashSet hashSet10 = new HashSet(2);
                hashSet10.add(new TableInfo.Index("index_routes_remoteId", true, Arrays.asList("remoteId"), Arrays.asList("ASC")));
                hashSet10.add(new TableInfo.Index("index_routes_dedupeKey", false, Arrays.asList("dedupeKey"), Arrays.asList("ASC")));
                TableInfo tableInfo5 = new TableInfo("routes", hashMap5, hashSet9, hashSet10);
                TableInfo read5 = TableInfo.read(db, "routes");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, "routes(com.example.rungps.data.RouteEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                HashMap hashMap6 = new HashMap(5);
                hashMap6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap6.put("routeId", new TableInfo.Column("routeId", "INTEGER", true, 0, null, 1));
                hashMap6.put("idx", new TableInfo.Column("idx", "INTEGER", true, 0, null, 1));
                hashMap6.put("lat", new TableInfo.Column("lat", "REAL", true, 0, null, 1));
                hashMap6.put("lon", new TableInfo.Column("lon", "REAL", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(1);
                hashSet11.add(new TableInfo.ForeignKey("routes", "CASCADE", "NO ACTION", Arrays.asList("routeId"), Arrays.asList("id")));
                HashSet hashSet12 = new HashSet(2);
                hashSet12.add(new TableInfo.Index("index_route_points_routeId", false, Arrays.asList("routeId"), Arrays.asList("ASC")));
                hashSet12.add(new TableInfo.Index("index_route_points_idx", false, Arrays.asList("idx"), Arrays.asList("ASC")));
                TableInfo tableInfo6 = new TableInfo("route_points", hashMap6, hashSet11, hashSet12);
                TableInfo read6 = TableInfo.read(db, "route_points");
                if (!tableInfo6.equals(read6)) {
                    return new RoomOpenHelper.ValidationResult(false, "route_points(com.example.rungps.data.RoutePointEntity).\n Expected:\n" + tableInfo6 + "\n Found:\n" + read6);
                }
                HashMap hashMap7 = new HashMap(3);
                hashMap7.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap7.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap7.put("createdAtMs", new TableInfo.Column("createdAtMs", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("gym_splits", hashMap7, new HashSet(0), new HashSet(0));
                TableInfo read7 = TableInfo.read(db, "gym_splits");
                if (!tableInfo7.equals(read7)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_splits(com.example.rungps.data.GymSplitEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + read7);
                }
                HashMap hashMap8 = new HashMap(4);
                hashMap8.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap8.put("splitId", new TableInfo.Column("splitId", "INTEGER", true, 0, null, 1));
                hashMap8.put("dayName", new TableInfo.Column("dayName", "TEXT", true, 0, null, 1));
                hashMap8.put("orderIdx", new TableInfo.Column("orderIdx", "INTEGER", true, 0, null, 1));
                HashSet hashSet13 = new HashSet(1);
                hashSet13.add(new TableInfo.ForeignKey("gym_splits", "CASCADE", "NO ACTION", Arrays.asList("splitId"), Arrays.asList("id")));
                HashSet hashSet14 = new HashSet(2);
                hashSet14.add(new TableInfo.Index("index_gym_day_templates_splitId", false, Arrays.asList("splitId"), Arrays.asList("ASC")));
                hashSet14.add(new TableInfo.Index("index_gym_day_templates_orderIdx", false, Arrays.asList("orderIdx"), Arrays.asList("ASC")));
                TableInfo tableInfo8 = new TableInfo("gym_day_templates", hashMap8, hashSet13, hashSet14);
                TableInfo read8 = TableInfo.read(db, "gym_day_templates");
                if (!tableInfo8.equals(read8)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_day_templates(com.example.rungps.data.GymDayTemplateEntity).\n Expected:\n" + tableInfo8 + "\n Found:\n" + read8);
                }
                HashMap hashMap9 = new HashMap(5);
                hashMap9.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap9.put("dayTemplateId", new TableInfo.Column("dayTemplateId", "INTEGER", true, 0, null, 1));
                hashMap9.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap9.put("orderIdx", new TableInfo.Column("orderIdx", "INTEGER", true, 0, null, 1));
                hashMap9.put("defaultSets", new TableInfo.Column("defaultSets", "INTEGER", true, 0, null, 1));
                HashSet hashSet15 = new HashSet(1);
                hashSet15.add(new TableInfo.ForeignKey("gym_day_templates", "CASCADE", "NO ACTION", Arrays.asList("dayTemplateId"), Arrays.asList("id")));
                HashSet hashSet16 = new HashSet(2);
                hashSet16.add(new TableInfo.Index("index_gym_exercise_templates_dayTemplateId", false, Arrays.asList("dayTemplateId"), Arrays.asList("ASC")));
                hashSet16.add(new TableInfo.Index("index_gym_exercise_templates_orderIdx", false, Arrays.asList("orderIdx"), Arrays.asList("ASC")));
                TableInfo tableInfo9 = new TableInfo("gym_exercise_templates", hashMap9, hashSet15, hashSet16);
                TableInfo read9 = TableInfo.read(db, "gym_exercise_templates");
                if (!tableInfo9.equals(read9)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_exercise_templates(com.example.rungps.data.ExerciseTemplateEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + read9);
                }
                HashMap hashMap10 = new HashMap(9);
                hashMap10.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap10.put("startedAtMs", new TableInfo.Column("startedAtMs", "INTEGER", true, 0, null, 1));
                hashMap10.put("endedAtMs", new TableInfo.Column("endedAtMs", "INTEGER", false, 0, null, 1));
                hashMap10.put("templateDayId", new TableInfo.Column("templateDayId", "INTEGER", false, 0, null, 1));
                hashMap10.put("freeDay", new TableInfo.Column("freeDay", "INTEGER", true, 0, null, 1));
                hashMap10.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, 1));
                hashMap10.put("ambientTag", new TableInfo.Column("ambientTag", "TEXT", false, 0, null, 1));
                hashMap10.put("ambientTagCustom", new TableInfo.Column("ambientTagCustom", "TEXT", false, 0, null, 1));
                hashMap10.put("remoteId", new TableInfo.Column("remoteId", "TEXT", false, 0, null, 1));
                HashSet hashSet17 = new HashSet(0);
                HashSet hashSet18 = new HashSet(4);
                hashSet18.add(new TableInfo.Index("index_gym_sessions_startedAtMs", false, Arrays.asList("startedAtMs"), Arrays.asList("ASC")));
                hashSet18.add(new TableInfo.Index("index_gym_sessions_templateDayId", false, Arrays.asList("templateDayId"), Arrays.asList("ASC")));
                hashSet18.add(new TableInfo.Index("index_gym_sessions_freeDay", false, Arrays.asList("freeDay"), Arrays.asList("ASC")));
                hashSet18.add(new TableInfo.Index("index_gym_sessions_remoteId", true, Arrays.asList("remoteId"), Arrays.asList("ASC")));
                TableInfo tableInfo10 = new TableInfo("gym_sessions", hashMap10, hashSet17, hashSet18);
                TableInfo read10 = TableInfo.read(db, "gym_sessions");
                if (!tableInfo10.equals(read10)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_sessions(com.example.rungps.data.GymSessionEntity).\n Expected:\n" + tableInfo10 + "\n Found:\n" + read10);
                }
                HashMap hashMap11 = new HashMap(9);
                hashMap11.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap11.put("sessionId", new TableInfo.Column("sessionId", "INTEGER", true, 0, null, 1));
                hashMap11.put("exerciseName", new TableInfo.Column("exerciseName", "TEXT", true, 0, null, 1));
                hashMap11.put("setIndex", new TableInfo.Column("setIndex", "INTEGER", true, 0, null, 1));
                hashMap11.put("reps", new TableInfo.Column("reps", "INTEGER", false, 0, null, 1));
                hashMap11.put("weightKg", new TableInfo.Column("weightKg", "REAL", true, 0, null, 1));
                hashMap11.put("loggedAtMs", new TableInfo.Column("loggedAtMs", "INTEGER", false, 0, null, 1));
                hashMap11.put("rpeBorg", new TableInfo.Column("rpeBorg", "INTEGER", false, 0, null, 1));
                hashMap11.put("romNote", new TableInfo.Column("romNote", "TEXT", false, 0, null, 1));
                HashSet hashSet19 = new HashSet(1);
                hashSet19.add(new TableInfo.ForeignKey("gym_sessions", "CASCADE", "NO ACTION", Arrays.asList("sessionId"), Arrays.asList("id")));
                HashSet hashSet20 = new HashSet(3);
                hashSet20.add(new TableInfo.Index("index_gym_sets_sessionId", false, Arrays.asList("sessionId"), Arrays.asList("ASC")));
                hashSet20.add(new TableInfo.Index("index_gym_sets_exerciseName", false, Arrays.asList("exerciseName"), Arrays.asList("ASC")));
                hashSet20.add(new TableInfo.Index("index_gym_sets_setIndex", false, Arrays.asList("setIndex"), Arrays.asList("ASC")));
                TableInfo tableInfo11 = new TableInfo("gym_sets", hashMap11, hashSet19, hashSet20);
                TableInfo read11 = TableInfo.read(db, "gym_sets");
                if (!tableInfo11.equals(read11)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_sets(com.example.rungps.data.GymSetEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + read11);
                }
                HashMap hashMap12 = new HashMap(5);
                hashMap12.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap12.put("epochDay", new TableInfo.Column("epochDay", "INTEGER", true, 0, null, 1));
                hashMap12.put("steps", new TableInfo.Column("steps", "INTEGER", true, 0, null, 1));
                hashMap12.put(Property.SYMBOL_Z_ORDER_SOURCE, new TableInfo.Column(Property.SYMBOL_Z_ORDER_SOURCE, "TEXT", true, 0, null, 1));
                hashMap12.put("syncedAtMs", new TableInfo.Column("syncedAtMs", "INTEGER", true, 0, null, 1));
                HashSet hashSet21 = new HashSet(0);
                HashSet hashSet22 = new HashSet(1);
                hashSet22.add(new TableInfo.Index("index_daily_steps_epochDay", true, Arrays.asList("epochDay"), Arrays.asList("ASC")));
                TableInfo tableInfo12 = new TableInfo("daily_steps", hashMap12, hashSet21, hashSet22);
                TableInfo read12 = TableInfo.read(db, "daily_steps");
                if (!tableInfo12.equals(read12)) {
                    return new RoomOpenHelper.ValidationResult(false, "daily_steps(com.example.rungps.data.DailyStepsEntity).\n Expected:\n" + tableInfo12 + "\n Found:\n" + read12);
                }
                HashMap hashMap13 = new HashMap(7);
                hashMap13.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap13.put("runId", new TableInfo.Column("runId", "INTEGER", true, 0, null, 1));
                hashMap13.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, 1));
                hashMap13.put("idx", new TableInfo.Column("idx", "INTEGER", true, 0, null, 1));
                hashMap13.put("elapsedEndMs", new TableInfo.Column("elapsedEndMs", "INTEGER", true, 0, null, 1));
                hashMap13.put("durationMs", new TableInfo.Column("durationMs", "INTEGER", true, 0, null, 1));
                hashMap13.put("distanceM", new TableInfo.Column("distanceM", "REAL", true, 0, null, 1));
                HashSet hashSet23 = new HashSet(1);
                hashSet23.add(new TableInfo.ForeignKey("runs", "CASCADE", "NO ACTION", Arrays.asList("runId"), Arrays.asList("id")));
                HashSet hashSet24 = new HashSet(3);
                hashSet24.add(new TableInfo.Index("index_run_splits_runId", false, Arrays.asList("runId"), Arrays.asList("ASC")));
                hashSet24.add(new TableInfo.Index("index_run_splits_kind", false, Arrays.asList("kind"), Arrays.asList("ASC")));
                hashSet24.add(new TableInfo.Index("index_run_splits_idx", false, Arrays.asList("idx"), Arrays.asList("ASC")));
                TableInfo tableInfo13 = new TableInfo("run_splits", hashMap13, hashSet23, hashSet24);
                TableInfo read13 = TableInfo.read(db, "run_splits");
                if (!tableInfo13.equals(read13)) {
                    return new RoomOpenHelper.ValidationResult(false, "run_splits(com.example.rungps.data.RunSplitEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + read13);
                }
                HashMap hashMap14 = new HashMap(8);
                hashMap14.put("activityKind", new TableInfo.Column("activityKind", "TEXT", true, 1, null, 1));
                hashMap14.put("distanceKey", new TableInfo.Column("distanceKey", "TEXT", true, 2, null, 1));
                hashMap14.put("targetDistanceM", new TableInfo.Column("targetDistanceM", "REAL", true, 0, null, 1));
                hashMap14.put("bestMovingTimeSec", new TableInfo.Column("bestMovingTimeSec", "INTEGER", true, 0, null, 1));
                hashMap14.put("activityId", new TableInfo.Column("activityId", "INTEGER", true, 0, null, 1));
                hashMap14.put("activityName", new TableInfo.Column("activityName", "TEXT", false, 0, null, 1));
                hashMap14.put("startDate", new TableInfo.Column("startDate", "TEXT", false, 0, null, 1));
                hashMap14.put("syncedAtMs", new TableInfo.Column("syncedAtMs", "INTEGER", true, 0, null, 1));
                HashSet hashSet25 = new HashSet(0);
                HashSet hashSet26 = new HashSet(1);
                hashSet26.add(new TableInfo.Index("index_strava_pbs_activityKind", false, Arrays.asList("activityKind"), Arrays.asList("ASC")));
                TableInfo tableInfo14 = new TableInfo("strava_pbs", hashMap14, hashSet25, hashSet26);
                TableInfo read14 = TableInfo.read(db, "strava_pbs");
                if (!tableInfo14.equals(read14)) {
                    return new RoomOpenHelper.ValidationResult(false, "strava_pbs(com.example.rungps.data.StravaPbEntity).\n Expected:\n" + tableInfo14 + "\n Found:\n" + read14);
                }
                HashMap hashMap15 = new HashMap(7);
                hashMap15.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap15.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, 1));
                hashMap15.put("sourceId", new TableInfo.Column("sourceId", "INTEGER", true, 0, null, 1));
                hashMap15.put("startedAtMs", new TableInfo.Column("startedAtMs", "INTEGER", true, 0, null, 1));
                hashMap15.put("endsAtMs", new TableInfo.Column("endsAtMs", "INTEGER", true, 0, null, 1));
                hashMap15.put("loadScore", new TableInfo.Column("loadScore", "REAL", true, 0, null, 1));
                hashMap15.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, 1));
                HashSet hashSet27 = new HashSet(0);
                HashSet hashSet28 = new HashSet(3);
                hashSet28.add(new TableInfo.Index("index_recovery_events_startedAtMs", false, Arrays.asList("startedAtMs"), Arrays.asList("ASC")));
                hashSet28.add(new TableInfo.Index("index_recovery_events_endsAtMs", false, Arrays.asList("endsAtMs"), Arrays.asList("ASC")));
                hashSet28.add(new TableInfo.Index("index_recovery_events_kind", false, Arrays.asList("kind"), Arrays.asList("ASC")));
                TableInfo tableInfo15 = new TableInfo("recovery_events", hashMap15, hashSet27, hashSet28);
                TableInfo read15 = TableInfo.read(db, "recovery_events");
                if (!tableInfo15.equals(read15)) {
                    return new RoomOpenHelper.ValidationResult(false, "recovery_events(com.example.rungps.data.RecoveryEventEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + read15);
                }
                HashMap hashMap16 = new HashMap(30);
                hashMap16.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap16.put("startTimeMs", new TableInfo.Column("startTimeMs", "INTEGER", true, 0, null, 1));
                hashMap16.put("endTimeMs", new TableInfo.Column("endTimeMs", "INTEGER", true, 0, null, 1));
                hashMap16.put("totalSleepMin", new TableInfo.Column("totalSleepMin", "INTEGER", true, 0, null, 1));
                hashMap16.put("deepSleepMin", new TableInfo.Column("deepSleepMin", "INTEGER", false, 0, null, 1));
                hashMap16.put("lightSleepMin", new TableInfo.Column("lightSleepMin", "INTEGER", false, 0, null, 1));
                hashMap16.put("sleepEfficiency", new TableInfo.Column("sleepEfficiency", "INTEGER", false, 0, null, 1));
                hashMap16.put("sleepQuality", new TableInfo.Column("sleepQuality", "INTEGER", false, 0, null, 1));
                hashMap16.put(Property.SYMBOL_Z_ORDER_SOURCE, new TableInfo.Column(Property.SYMBOL_Z_ORDER_SOURCE, "TEXT", true, 0, null, 1));
                hashMap16.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, 1));
                hashMap16.put("wakeMood", new TableInfo.Column("wakeMood", "INTEGER", false, 0, null, 1));
                hashMap16.put("snoreEvents", new TableInfo.Column("snoreEvents", "INTEGER", false, 0, null, 1));
                hashMap16.put("awakeSleepMin", new TableInfo.Column("awakeSleepMin", "INTEGER", false, 0, null, 1));
                hashMap16.put("restlessnessIndex", new TableInfo.Column("restlessnessIndex", "INTEGER", false, 0, null, 1));
                hashMap16.put("remSleepMin", new TableInfo.Column("remSleepMin", "INTEGER", false, 0, null, 1));
                hashMap16.put("smartAlarmUsed", new TableInfo.Column("smartAlarmUsed", "INTEGER", true, 0, null, 1));
                hashMap16.put("timeToFallAsleepMin", new TableInfo.Column("timeToFallAsleepMin", "INTEGER", false, 0, null, 1));
                hashMap16.put("scoreRoutine", new TableInfo.Column("scoreRoutine", "INTEGER", false, 0, null, 1));
                hashMap16.put("scoreQualityPillar", new TableInfo.Column("scoreQualityPillar", "INTEGER", false, 0, null, 1));
                hashMap16.put("scoreDuration", new TableInfo.Column("scoreDuration", "INTEGER", false, 0, null, 1));
                hashMap16.put("hypnogramCompact", new TableInfo.Column("hypnogramCompact", "TEXT", false, 0, null, 1));
                hashMap16.put("eventMarkersCompact", new TableInfo.Column("eventMarkersCompact", "TEXT", false, 0, null, 1));
                hashMap16.put("stageConfidenceMean", new TableInfo.Column("stageConfidenceMean", "REAL", false, 0, null, 1));
                hashMap16.put("micCoverageRatio", new TableInfo.Column("micCoverageRatio", "REAL", false, 0, null, 1));
                hashMap16.put("fusionSource", new TableInfo.Column("fusionSource", "TEXT", false, 0, null, 1));
                hashMap16.put("breathRateMean", new TableInfo.Column("breathRateMean", "REAL", false, 0, null, 1));
                hashMap16.put("osaRiskHint", new TableInfo.Column("osaRiskHint", "TEXT", false, 0, null, 1));
                hashMap16.put("sleepDebtHours", new TableInfo.Column("sleepDebtHours", "REAL", false, 0, null, 1));
                hashMap16.put("consistencyScore", new TableInfo.Column("consistencyScore", "INTEGER", false, 0, null, 1));
                hashMap16.put("sleepAnalyticsJson", new TableInfo.Column("sleepAnalyticsJson", "TEXT", false, 0, null, 1));
                HashSet hashSet29 = new HashSet(0);
                HashSet hashSet30 = new HashSet(2);
                hashSet30.add(new TableInfo.Index("index_sleep_entries_startTimeMs", true, Arrays.asList("startTimeMs"), Arrays.asList("ASC")));
                hashSet30.add(new TableInfo.Index("index_sleep_entries_endTimeMs", false, Arrays.asList("endTimeMs"), Arrays.asList("ASC")));
                TableInfo tableInfo16 = new TableInfo("sleep_entries", hashMap16, hashSet29, hashSet30);
                TableInfo read16 = TableInfo.read(db, "sleep_entries");
                if (!tableInfo16.equals(read16)) {
                    return new RoomOpenHelper.ValidationResult(false, "sleep_entries(com.example.rungps.data.SleepEntryEntity).\n Expected:\n" + tableInfo16 + "\n Found:\n" + read16);
                }
                HashMap hashMap17 = new HashMap(8);
                hashMap17.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap17.put("nightStartTimeMs", new TableInfo.Column("nightStartTimeMs", "INTEGER", true, 0, null, 1));
                hashMap17.put("eventTimeMs", new TableInfo.Column("eventTimeMs", "INTEGER", true, 0, null, 1));
                hashMap17.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, 1));
                hashMap17.put("intensity", new TableInfo.Column("intensity", "REAL", true, 0, null, 1));
                hashMap17.put("durationMs", new TableInfo.Column("durationMs", "INTEGER", true, 0, null, 1));
                hashMap17.put("encryptedFileName", new TableInfo.Column("encryptedFileName", "TEXT", true, 0, null, 1));
                hashMap17.put("createdAtMs", new TableInfo.Column("createdAtMs", "INTEGER", true, 0, null, 1));
                HashSet hashSet31 = new HashSet(0);
                HashSet hashSet32 = new HashSet(3);
                hashSet32.add(new TableInfo.Index("index_sleep_sound_events_nightStartTimeMs", false, Arrays.asList("nightStartTimeMs"), Arrays.asList("ASC")));
                hashSet32.add(new TableInfo.Index("index_sleep_sound_events_nightStartTimeMs_eventTimeMs", false, Arrays.asList("nightStartTimeMs", "eventTimeMs"), Arrays.asList("ASC", "ASC")));
                hashSet32.add(new TableInfo.Index("index_sleep_sound_events_kind", false, Arrays.asList("kind"), Arrays.asList("ASC")));
                TableInfo tableInfo17 = new TableInfo("sleep_sound_events", hashMap17, hashSet31, hashSet32);
                TableInfo read17 = TableInfo.read(db, "sleep_sound_events");
                if (!tableInfo17.equals(read17)) {
                    return new RoomOpenHelper.ValidationResult(false, "sleep_sound_events(com.example.rungps.data.SleepSoundEventEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + read17);
                }
                HashMap hashMap18 = new HashMap(8);
                hashMap18.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap18.put("exerciseNameLower", new TableInfo.Column("exerciseNameLower", "TEXT", true, 0, null, 1));
                hashMap18.put("displayName", new TableInfo.Column("displayName", "TEXT", true, 0, null, 1));
                hashMap18.put("muscleGroup", new TableInfo.Column("muscleGroup", "TEXT", true, 0, null, 1));
                hashMap18.put("secondaryMuscleGroup", new TableInfo.Column("secondaryMuscleGroup", "TEXT", false, 0, null, 1));
                hashMap18.put("tertiaryMuscleGroup", new TableInfo.Column("tertiaryMuscleGroup", "TEXT", false, 0, null, 1));
                hashMap18.put("isUnilateral", new TableInfo.Column("isUnilateral", "INTEGER", true, 0, null, 1));
                hashMap18.put("setupNote", new TableInfo.Column("setupNote", "TEXT", false, 0, null, 1));
                HashSet hashSet33 = new HashSet(0);
                HashSet hashSet34 = new HashSet(2);
                hashSet34.add(new TableInfo.Index("index_exercise_muscle_tags_exerciseNameLower", true, Arrays.asList("exerciseNameLower"), Arrays.asList("ASC")));
                hashSet34.add(new TableInfo.Index("index_exercise_muscle_tags_muscleGroup", false, Arrays.asList("muscleGroup"), Arrays.asList("ASC")));
                TableInfo tableInfo18 = new TableInfo("exercise_muscle_tags", hashMap18, hashSet33, hashSet34);
                TableInfo read18 = TableInfo.read(db, "exercise_muscle_tags");
                if (!tableInfo18.equals(read18)) {
                    return new RoomOpenHelper.ValidationResult(false, "exercise_muscle_tags(com.example.rungps.data.ExerciseMuscleTagEntity).\n Expected:\n" + tableInfo18 + "\n Found:\n" + read18);
                }
                HashMap hashMap19 = new HashMap(14);
                hashMap19.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap19.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, 1));
                hashMap19.put("startTimeMs", new TableInfo.Column("startTimeMs", "INTEGER", true, 0, null, 1));
                hashMap19.put("warmupMin", new TableInfo.Column("warmupMin", "INTEGER", true, 0, null, 1));
                hashMap19.put("playMin", new TableInfo.Column("playMin", "INTEGER", true, 0, null, 1));
                hashMap19.put("intensity", new TableInfo.Column("intensity", "INTEGER", true, 0, null, 1));
                hashMap19.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, 1));
                hashMap19.put("watchSessionId", new TableInfo.Column("watchSessionId", "INTEGER", false, 0, null, 1));
                hashMap19.put("hrAvgBpm", new TableInfo.Column("hrAvgBpm", "INTEGER", false, 0, null, 1));
                hashMap19.put("hrMaxBpm", new TableInfo.Column("hrMaxBpm", "INTEGER", false, 0, null, 1));
                hashMap19.put("steps", new TableInfo.Column("steps", "INTEGER", false, 0, null, 1));
                hashMap19.put("distanceM", new TableInfo.Column("distanceM", "INTEGER", false, 0, null, 1));
                hashMap19.put("calories", new TableInfo.Column("calories", "INTEGER", false, 0, null, 1));
                hashMap19.put("hrZonesJson", new TableInfo.Column("hrZonesJson", "TEXT", false, 0, null, 1));
                HashSet hashSet35 = new HashSet(0);
                HashSet hashSet36 = new HashSet(3);
                hashSet36.add(new TableInfo.Index("index_soccer_sessions_startTimeMs", false, Arrays.asList("startTimeMs"), Arrays.asList("ASC")));
                hashSet36.add(new TableInfo.Index("index_soccer_sessions_kind", false, Arrays.asList("kind"), Arrays.asList("ASC")));
                hashSet36.add(new TableInfo.Index("index_soccer_sessions_watchSessionId", true, Arrays.asList("watchSessionId"), Arrays.asList("ASC")));
                TableInfo tableInfo19 = new TableInfo("soccer_sessions", hashMap19, hashSet35, hashSet36);
                TableInfo read19 = TableInfo.read(db, "soccer_sessions");
                if (!tableInfo19.equals(read19)) {
                    return new RoomOpenHelper.ValidationResult(false, "soccer_sessions(com.example.rungps.data.SoccerSessionEntity).\n Expected:\n" + tableInfo19 + "\n Found:\n" + read19);
                }
                HashMap hashMap20 = new HashMap(6);
                hashMap20.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap20.put("planSlug", new TableInfo.Column("planSlug", "TEXT", true, 0, null, 1));
                hashMap20.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                hashMap20.put("startEpochDay", new TableInfo.Column("startEpochDay", "INTEGER", true, 0, null, 1));
                hashMap20.put("nextWorkoutIndex", new TableInfo.Column("nextWorkoutIndex", "INTEGER", true, 0, null, 1));
                hashMap20.put("updatedAtMs", new TableInfo.Column("updatedAtMs", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo20 = new TableInfo("training_plan_progress", hashMap20, new HashSet(0), new HashSet(0));
                TableInfo read20 = TableInfo.read(db, "training_plan_progress");
                if (!tableInfo20.equals(read20)) {
                    return new RoomOpenHelper.ValidationResult(false, "training_plan_progress(com.example.rungps.data.TrainingPlanProgressEntity).\n Expected:\n" + tableInfo20 + "\n Found:\n" + read20);
                }
                HashMap hashMap21 = new HashMap(8);
                hashMap21.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap21.put("weekStartEpochDay", new TableInfo.Column("weekStartEpochDay", "INTEGER", true, 0, null, 1));
                hashMap21.put("weekEndEpochDay", new TableInfo.Column("weekEndEpochDay", "INTEGER", true, 0, null, 1));
                hashMap21.put("archivedAtMs", new TableInfo.Column("archivedAtMs", "INTEGER", true, 0, null, 1));
                hashMap21.put("totalRunKm", new TableInfo.Column("totalRunKm", "REAL", true, 0, null, 1));
                hashMap21.put("totalGymKg", new TableInfo.Column("totalGymKg", "REAL", true, 0, null, 1));
                hashMap21.put("sleepNights", new TableInfo.Column("sleepNights", "INTEGER", true, 0, null, 1));
                hashMap21.put("snapshotJson", new TableInfo.Column("snapshotJson", "TEXT", true, 0, null, 1));
                HashSet hashSet37 = new HashSet(0);
                HashSet hashSet38 = new HashSet(1);
                hashSet38.add(new TableInfo.Index("index_archived_training_weeks_weekStartEpochDay", true, Arrays.asList("weekStartEpochDay"), Arrays.asList("ASC")));
                TableInfo tableInfo21 = new TableInfo("archived_training_weeks", hashMap21, hashSet37, hashSet38);
                TableInfo read21 = TableInfo.read(db, "archived_training_weeks");
                if (!tableInfo21.equals(read21)) {
                    return new RoomOpenHelper.ValidationResult(false, "archived_training_weeks(com.example.rungps.data.ArchivedTrainingWeekEntity).\n Expected:\n" + tableInfo21 + "\n Found:\n" + read21);
                }
                HashMap hashMap22 = new HashMap(7);
                hashMap22.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap22.put("splitId", new TableInfo.Column("splitId", "INTEGER", true, 0, null, 1));
                hashMap22.put("templateDayId", new TableInfo.Column("templateDayId", "INTEGER", true, 0, null, 1));
                hashMap22.put("exerciseName", new TableInfo.Column("exerciseName", "TEXT", true, 0, null, 1));
                hashMap22.put("owedSetIndices", new TableInfo.Column("owedSetIndices", "TEXT", true, 0, null, 1));
                hashMap22.put("fromSessionId", new TableInfo.Column("fromSessionId", "INTEGER", true, 0, null, 1));
                hashMap22.put("createdAtMs", new TableInfo.Column("createdAtMs", "INTEGER", true, 0, null, 1));
                HashSet hashSet39 = new HashSet(0);
                HashSet hashSet40 = new HashSet(3);
                hashSet40.add(new TableInfo.Index("index_gym_carryover_splitId", false, Arrays.asList("splitId"), Arrays.asList("ASC")));
                hashSet40.add(new TableInfo.Index("index_gym_carryover_templateDayId", false, Arrays.asList("templateDayId"), Arrays.asList("ASC")));
                hashSet40.add(new TableInfo.Index("index_gym_carryover_splitId_templateDayId_exerciseName", true, Arrays.asList("splitId", "templateDayId", "exerciseName"), Arrays.asList("ASC", "ASC", "ASC")));
                TableInfo tableInfo22 = new TableInfo("gym_carryover", hashMap22, hashSet39, hashSet40);
                TableInfo read22 = TableInfo.read(db, "gym_carryover");
                if (!tableInfo22.equals(read22)) {
                    return new RoomOpenHelper.ValidationResult(false, "gym_carryover(com.example.rungps.data.GymCarryoverEntity).\n Expected:\n" + tableInfo22 + "\n Found:\n" + read22);
                }
                HashMap hashMap23 = new HashMap(14);
                hashMap23.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap23.put("gearType", new TableInfo.Column("gearType", "TEXT", true, 0, null, 1));
                hashMap23.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                hashMap23.put("brand", new TableInfo.Column("brand", "TEXT", false, 0, null, 1));
                hashMap23.put("model", new TableInfo.Column("model", "TEXT", false, 0, null, 1));
                hashMap23.put("purchaseDateMs", new TableInfo.Column("purchaseDateMs", "INTEGER", false, 0, null, 1));
                hashMap23.put("startingOdometerKm", new TableInfo.Column("startingOdometerKm", "REAL", true, 0, null, 1));
                hashMap23.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, 1));
                hashMap23.put("isRetired", new TableInfo.Column("isRetired", "INTEGER", true, 0, null, 1));
                hashMap23.put("isDefaultForRun", new TableInfo.Column("isDefaultForRun", "INTEGER", true, 0, null, 1));
                hashMap23.put("isDefaultForRide", new TableInfo.Column("isDefaultForRide", "INTEGER", true, 0, null, 1));
                hashMap23.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, 1));
                hashMap23.put("parentGearId", new TableInfo.Column("parentGearId", "INTEGER", false, 0, null, 1));
                hashMap23.put("createdAtMs", new TableInfo.Column("createdAtMs", "INTEGER", true, 0, null, 1));
                HashSet hashSet41 = new HashSet(0);
                HashSet hashSet42 = new HashSet(3);
                hashSet42.add(new TableInfo.Index("index_gear_items_gearType", false, Arrays.asList("gearType"), Arrays.asList("ASC")));
                hashSet42.add(new TableInfo.Index("index_gear_items_isRetired", false, Arrays.asList("isRetired"), Arrays.asList("ASC")));
                hashSet42.add(new TableInfo.Index("index_gear_items_parentGearId", false, Arrays.asList("parentGearId"), Arrays.asList("ASC")));
                TableInfo tableInfo23 = new TableInfo("gear_items", hashMap23, hashSet41, hashSet42);
                TableInfo read23 = TableInfo.read(db, "gear_items");
                if (!tableInfo23.equals(read23)) {
                    return new RoomOpenHelper.ValidationResult(false, "gear_items(com.example.rungps.data.GearEntity).\n Expected:\n" + tableInfo23 + "\n Found:\n" + read23);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "e8ce958998928616ee0205c0a6d6fd30", "cf669ab9f19805f427aee401da7154be")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "runs", "points", "run_hr_samples", "spotify_timeline", "routes", "route_points", "gym_splits", "gym_day_templates", "gym_exercise_templates", "gym_sessions", "gym_sets", "daily_steps", "run_splits", "strava_pbs", "recovery_events", "sleep_entries", "sleep_sound_events", "exercise_muscle_tags", "soccer_sessions", "training_plan_progress", "archived_training_weeks", "gym_carryover", "gear_items");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `runs`");
            writableDatabase.execSQL("DELETE FROM `points`");
            writableDatabase.execSQL("DELETE FROM `run_hr_samples`");
            writableDatabase.execSQL("DELETE FROM `spotify_timeline`");
            writableDatabase.execSQL("DELETE FROM `routes`");
            writableDatabase.execSQL("DELETE FROM `route_points`");
            writableDatabase.execSQL("DELETE FROM `gym_splits`");
            writableDatabase.execSQL("DELETE FROM `gym_day_templates`");
            writableDatabase.execSQL("DELETE FROM `gym_exercise_templates`");
            writableDatabase.execSQL("DELETE FROM `gym_sessions`");
            writableDatabase.execSQL("DELETE FROM `gym_sets`");
            writableDatabase.execSQL("DELETE FROM `daily_steps`");
            writableDatabase.execSQL("DELETE FROM `run_splits`");
            writableDatabase.execSQL("DELETE FROM `strava_pbs`");
            writableDatabase.execSQL("DELETE FROM `recovery_events`");
            writableDatabase.execSQL("DELETE FROM `sleep_entries`");
            writableDatabase.execSQL("DELETE FROM `sleep_sound_events`");
            writableDatabase.execSQL("DELETE FROM `exercise_muscle_tags`");
            writableDatabase.execSQL("DELETE FROM `soccer_sessions`");
            writableDatabase.execSQL("DELETE FROM `training_plan_progress`");
            writableDatabase.execSQL("DELETE FROM `archived_training_weeks`");
            writableDatabase.execSQL("DELETE FROM `gym_carryover`");
            writableDatabase.execSQL("DELETE FROM `gear_items`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(RunDao.class, RunDao_Impl.getRequiredConverters());
        hashMap.put(GearDao.class, GearDao_Impl.getRequiredConverters());
        hashMap.put(RunHrSampleDao.class, RunHrSampleDao_Impl.getRequiredConverters());
        hashMap.put(SpotifyTimelineDao.class, SpotifyTimelineDao_Impl.getRequiredConverters());
        hashMap.put(RouteDao.class, RouteDao_Impl.getRequiredConverters());
        hashMap.put(GymDao.class, GymDao_Impl.getRequiredConverters());
        hashMap.put(DailyStepsDao.class, DailyStepsDao_Impl.getRequiredConverters());
        hashMap.put(RunSplitDao.class, RunSplitDao_Impl.getRequiredConverters());
        hashMap.put(StravaPbDao.class, StravaPbDao_Impl.getRequiredConverters());
        hashMap.put(RecoveryDao.class, RecoveryDao_Impl.getRequiredConverters());
        hashMap.put(SleepDao.class, SleepDao_Impl.getRequiredConverters());
        hashMap.put(SleepSoundDao.class, SleepSoundDao_Impl.getRequiredConverters());
        hashMap.put(ExerciseMuscleDao.class, ExerciseMuscleDao_Impl.getRequiredConverters());
        hashMap.put(SoccerDao.class, SoccerDao_Impl.getRequiredConverters());
        hashMap.put(TrainingPlanDao.class, TrainingPlanDao_Impl.getRequiredConverters());
        hashMap.put(ArchivedTrainingWeekDao.class, ArchivedTrainingWeekDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // com.example.rungps.data.AppDb
    public RunDao runDao() {
        RunDao runDao;
        if (this._runDao != null) {
            return this._runDao;
        }
        synchronized (this) {
            if (this._runDao == null) {
                this._runDao = new RunDao_Impl(this);
            }
            runDao = this._runDao;
        }
        return runDao;
    }

    @Override // com.example.rungps.data.AppDb
    public GearDao gearDao() {
        GearDao gearDao;
        if (this._gearDao != null) {
            return this._gearDao;
        }
        synchronized (this) {
            if (this._gearDao == null) {
                this._gearDao = new GearDao_Impl(this);
            }
            gearDao = this._gearDao;
        }
        return gearDao;
    }

    @Override // com.example.rungps.data.AppDb
    public RunHrSampleDao runHrSampleDao() {
        RunHrSampleDao runHrSampleDao;
        if (this._runHrSampleDao != null) {
            return this._runHrSampleDao;
        }
        synchronized (this) {
            if (this._runHrSampleDao == null) {
                this._runHrSampleDao = new RunHrSampleDao_Impl(this);
            }
            runHrSampleDao = this._runHrSampleDao;
        }
        return runHrSampleDao;
    }

    @Override // com.example.rungps.data.AppDb
    public SpotifyTimelineDao spotifyTimelineDao() {
        SpotifyTimelineDao spotifyTimelineDao;
        if (this._spotifyTimelineDao != null) {
            return this._spotifyTimelineDao;
        }
        synchronized (this) {
            if (this._spotifyTimelineDao == null) {
                this._spotifyTimelineDao = new SpotifyTimelineDao_Impl(this);
            }
            spotifyTimelineDao = this._spotifyTimelineDao;
        }
        return spotifyTimelineDao;
    }

    @Override // com.example.rungps.data.AppDb
    public RouteDao routeDao() {
        RouteDao routeDao;
        if (this._routeDao != null) {
            return this._routeDao;
        }
        synchronized (this) {
            if (this._routeDao == null) {
                this._routeDao = new RouteDao_Impl(this);
            }
            routeDao = this._routeDao;
        }
        return routeDao;
    }

    @Override // com.example.rungps.data.AppDb
    public GymDao gymDao() {
        GymDao gymDao;
        if (this._gymDao != null) {
            return this._gymDao;
        }
        synchronized (this) {
            if (this._gymDao == null) {
                this._gymDao = new GymDao_Impl(this);
            }
            gymDao = this._gymDao;
        }
        return gymDao;
    }

    @Override // com.example.rungps.data.AppDb
    public DailyStepsDao dailyStepsDao() {
        DailyStepsDao dailyStepsDao;
        if (this._dailyStepsDao != null) {
            return this._dailyStepsDao;
        }
        synchronized (this) {
            if (this._dailyStepsDao == null) {
                this._dailyStepsDao = new DailyStepsDao_Impl(this);
            }
            dailyStepsDao = this._dailyStepsDao;
        }
        return dailyStepsDao;
    }

    @Override // com.example.rungps.data.AppDb
    public RunSplitDao runSplitDao() {
        RunSplitDao runSplitDao;
        if (this._runSplitDao != null) {
            return this._runSplitDao;
        }
        synchronized (this) {
            if (this._runSplitDao == null) {
                this._runSplitDao = new RunSplitDao_Impl(this);
            }
            runSplitDao = this._runSplitDao;
        }
        return runSplitDao;
    }

    @Override // com.example.rungps.data.AppDb
    public StravaPbDao stravaPbDao() {
        StravaPbDao stravaPbDao;
        if (this._stravaPbDao != null) {
            return this._stravaPbDao;
        }
        synchronized (this) {
            if (this._stravaPbDao == null) {
                this._stravaPbDao = new StravaPbDao_Impl(this);
            }
            stravaPbDao = this._stravaPbDao;
        }
        return stravaPbDao;
    }

    @Override // com.example.rungps.data.AppDb
    public RecoveryDao recoveryDao() {
        RecoveryDao recoveryDao;
        if (this._recoveryDao != null) {
            return this._recoveryDao;
        }
        synchronized (this) {
            if (this._recoveryDao == null) {
                this._recoveryDao = new RecoveryDao_Impl(this);
            }
            recoveryDao = this._recoveryDao;
        }
        return recoveryDao;
    }

    @Override // com.example.rungps.data.AppDb
    public SleepDao sleepDao() {
        SleepDao sleepDao;
        if (this._sleepDao != null) {
            return this._sleepDao;
        }
        synchronized (this) {
            if (this._sleepDao == null) {
                this._sleepDao = new SleepDao_Impl(this);
            }
            sleepDao = this._sleepDao;
        }
        return sleepDao;
    }

    @Override // com.example.rungps.data.AppDb
    public SleepSoundDao sleepSoundDao() {
        SleepSoundDao sleepSoundDao;
        if (this._sleepSoundDao != null) {
            return this._sleepSoundDao;
        }
        synchronized (this) {
            if (this._sleepSoundDao == null) {
                this._sleepSoundDao = new SleepSoundDao_Impl(this);
            }
            sleepSoundDao = this._sleepSoundDao;
        }
        return sleepSoundDao;
    }

    @Override // com.example.rungps.data.AppDb
    public ExerciseMuscleDao exerciseMuscleDao() {
        ExerciseMuscleDao exerciseMuscleDao;
        if (this._exerciseMuscleDao != null) {
            return this._exerciseMuscleDao;
        }
        synchronized (this) {
            if (this._exerciseMuscleDao == null) {
                this._exerciseMuscleDao = new ExerciseMuscleDao_Impl(this);
            }
            exerciseMuscleDao = this._exerciseMuscleDao;
        }
        return exerciseMuscleDao;
    }

    @Override // com.example.rungps.data.AppDb
    public SoccerDao soccerDao() {
        SoccerDao soccerDao;
        if (this._soccerDao != null) {
            return this._soccerDao;
        }
        synchronized (this) {
            if (this._soccerDao == null) {
                this._soccerDao = new SoccerDao_Impl(this);
            }
            soccerDao = this._soccerDao;
        }
        return soccerDao;
    }

    @Override // com.example.rungps.data.AppDb
    public TrainingPlanDao trainingPlanDao() {
        TrainingPlanDao trainingPlanDao;
        if (this._trainingPlanDao != null) {
            return this._trainingPlanDao;
        }
        synchronized (this) {
            if (this._trainingPlanDao == null) {
                this._trainingPlanDao = new TrainingPlanDao_Impl(this);
            }
            trainingPlanDao = this._trainingPlanDao;
        }
        return trainingPlanDao;
    }

    @Override // com.example.rungps.data.AppDb
    public ArchivedTrainingWeekDao archivedTrainingWeekDao() {
        ArchivedTrainingWeekDao archivedTrainingWeekDao;
        if (this._archivedTrainingWeekDao != null) {
            return this._archivedTrainingWeekDao;
        }
        synchronized (this) {
            if (this._archivedTrainingWeekDao == null) {
                this._archivedTrainingWeekDao = new ArchivedTrainingWeekDao_Impl(this);
            }
            archivedTrainingWeekDao = this._archivedTrainingWeekDao;
        }
        return archivedTrainingWeekDao;
    }
}
