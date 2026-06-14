package com.example.rungps

import android.app.Application
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.repository.MuscleRepository

class ExerciseTrackerApplication : Application() {
    val muscleRepository: MuscleRepository by lazy {
        MuscleRepository(this, ExerciseTrackerDatabase.get(this).exerciseTrackerDao())
    }

    override fun onCreate() {
        super.onCreate()
        ExerciseTrackerDatabase.get(this)
    }
}
