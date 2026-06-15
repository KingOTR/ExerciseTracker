package com.example.rungps.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
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
    ],
    version = 42,
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

        fun get(context: Context): ExerciseTrackerDatabase =
            instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    ExerciseTrackerDatabase::class.java,
                    "exercise_tracker.db",
                ).fallbackToDestructiveMigration()
                    .build().also { instance = it }
            }
    }
}
