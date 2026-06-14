package com.exercisetracker.app.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.exercisetracker.app.data.dao.ExerciseTrackerDao
import com.exercisetracker.app.data.entity.GymSessionEntity
import com.exercisetracker.app.data.entity.GymSetEntity
import com.exercisetracker.app.data.entity.KmSplitEntity
import com.exercisetracker.app.data.entity.RunEntity
import com.exercisetracker.app.data.entity.SleepRecordEntity
import com.exercisetracker.app.data.entity.SoccerSessionEntity
import com.exercisetracker.app.data.entity.UserExerciseOverrideEntity

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
