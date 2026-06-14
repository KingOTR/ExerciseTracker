package com.example.rungps.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rungps.data.dao.ExerciseTrackerDao
import com.example.rungps.data.entity.GymSessionEntity
import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.KmSplitEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SleepRecordEntity
import com.example.rungps.data.entity.SoccerSessionEntity
import com.example.rungps.data.entity.UserExerciseOverrideEntity

@Database(
    entities = [
        GymSessionEntity::class,
        GymSetEntity::class,
        RunEntity::class,
        KmSplitEntity::class,
        SoccerSessionEntity::class,
        SleepRecordEntity::class,
        UserExerciseOverrideEntity::class,
    ],
    version = 2,
    exportSchema = true,
)
abstract class ExerciseTrackerDatabase : RoomDatabase() {
    abstract fun exerciseTrackerDao(): ExerciseTrackerDao

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
