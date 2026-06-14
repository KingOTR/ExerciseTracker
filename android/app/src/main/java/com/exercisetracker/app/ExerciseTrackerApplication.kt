package com.exercisetracker.app

import android.app.Application
import com.exercisetracker.app.data.ExerciseTrackerDatabase
import com.exercisetracker.app.data.repository.MuscleRepository

class ExerciseTrackerApplication : Application() {
    val muscleRepository: MuscleRepository by lazy {
        MuscleRepository(this, ExerciseTrackerDatabase.get(this).exerciseTrackerDao())
    }

    override fun onCreate() {
        super.onCreate()
        ExerciseTrackerDatabase.get(this)
    }
}
