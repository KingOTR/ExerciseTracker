package com.example.rungps.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.rungps.data.dao.ExerciseTrackerDao
import com.example.rungps.data.dao.GearDao
import com.example.rungps.data.dao.RouteDao
import com.example.rungps.data.dao.SleepDao
import com.example.rungps.data.dao.TrainingPlanDao
import com.example.rungps.data.entity.GearEntity
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RouteEntity
import com.example.rungps.data.entity.RoutePointEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.RunHrSampleEntity
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.entity.SleepRecordEntity
import com.example.rungps.data.entity.SleepSoundEventEntity
import com.example.rungps.data.entity.SoccerSessionEntity
import com.example.rungps.data.entity.SpotifyTimelineEntity
import com.example.rungps.data.entity.TrainingPlanProgressEntity
import com.example.rungps.data.entity.UserExerciseOverrideEntity

@Database(
    entities = [
        GymSessionEntity::class,
        GymSetEntity::class,
        RunEntity::class,
        PointEntity::class,
        RunHrSampleEntity::class,
        KmSplitEntity::class,
        SoccerSessionEntity::class,
        SleepRecordEntity::class,
        SleepEntryEntity::class,
        SleepSoundEventEntity::class,
        UserExerciseOverrideEntity::class,
        RouteEntity::class,
        RoutePointEntity::class,
        GearEntity::class,
        TrainingPlanProgressEntity::class,
        SpotifyTimelineEntity::class,
    ],
    version = 43,
    exportSchema = true,
)
abstract class ExerciseTrackerDatabase : RoomDatabase() {
    abstract fun exerciseTrackerDao(): ExerciseTrackerDao
    abstract fun sleepDao(): SleepDao
    abstract fun routeDao(): RouteDao
    abstract fun gearDao(): GearDao
    abstract fun trainingPlanDao(): TrainingPlanDao

    companion object {
        @Volatile
        private var instance: ExerciseTrackerDatabase? = null

        private val MIGRATION_42_43 = object : Migration(42, 43) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN templateDayId INTEGER")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN notes TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN ambientTag TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN ambientTagCustom TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN remoteId TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN podcastShowName TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN podcastEpisodeTitle TEXT")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN playbackStartedMs INTEGER")
                db.execSQL("ALTER TABLE gym_sessions ADD COLUMN playbackEndMs INTEGER")
                db.execSQL(
                    """
                    CREATE TABLE IF NOT EXISTS spotify_timeline (
                        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                        timeMs INTEGER NOT NULL,
                        runId INTEGER,
                        gymSessionId INTEGER,
                        isPlaying INTEGER NOT NULL DEFAULT 0,
                        itemType TEXT,
                        itemId TEXT,
                        title TEXT,
                        subtitle TEXT,
                        progressMs INTEGER,
                        artUrl TEXT
                    )
                    """.trimIndent(),
                )
                db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_gymSessionId ON spotify_timeline(gymSessionId)")
                db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_runId ON spotify_timeline(runId)")
                db.execSQL("CREATE INDEX IF NOT EXISTS index_spotify_timeline_timeMs ON spotify_timeline(timeMs)")
            }
        }

        fun get(context: Context): ExerciseTrackerDatabase =
            instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    ExerciseTrackerDatabase::class.java,
                    "exercise_tracker.db",
                )
                    .addMigrations(MIGRATION_42_43)
                    .fallbackToDestructiveMigration()
                    .build().also { instance = it }
            }
    }
}
