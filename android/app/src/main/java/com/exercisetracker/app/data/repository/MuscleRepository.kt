package com.exercisetracker.app.data.repository

import android.content.Context
import com.exercisetracker.app.data.dao.ExerciseTrackerDao
import com.exercisetracker.app.data.entity.UserExerciseOverrideEntity
import com.exercisetracker.app.domain.muscle.CardioMuscleDatabase
import com.exercisetracker.app.domain.muscle.ExerciseMuscleDatabase
import com.exercisetracker.app.domain.muscle.ExerciseMuscleResolver
import com.exercisetracker.app.domain.muscle.MuscleJsonParser
import com.exercisetracker.app.domain.muscle.MuscleLoad
import com.exercisetracker.app.domain.muscle.MuscleLoadCalculator
import com.exercisetracker.app.domain.muscle.MuscleTaxonomy
import com.exercisetracker.app.domain.muscle.RecoveryLoadEngine
import com.exercisetracker.app.domain.muscle.normalizeExerciseName
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MuscleRepository(
    context: Context,
    private val dao: ExerciseTrackerDao,
) {
    private val appContext = context.applicationContext

    val taxonomy: MuscleTaxonomy by lazy {
        MuscleJsonParser.parseTaxonomy(readAsset("muscles/muscle-taxonomy.json"))
    }

    val exerciseDatabase: ExerciseMuscleDatabase by lazy {
        MuscleJsonParser.parseExerciseDatabase(readAsset("muscles/exercise-muscle-map.json"))
    }

    val cardioDatabase: CardioMuscleDatabase by lazy {
        MuscleJsonParser.parseCardioDatabase(readAsset("muscles/cardio-muscle-map.json"))
    }

    val calculator: MuscleLoadCalculator by lazy { MuscleLoadCalculator(taxonomy) }

    val resolver: ExerciseMuscleResolver by lazy {
        ExerciseMuscleResolver(exerciseDatabase, taxonomy)
    }

    val recoveryEngine: RecoveryLoadEngine by lazy {
        RecoveryLoadEngine(taxonomy, cardioDatabase, calculator, resolver)
    }

    fun observeUserOverrides(): Flow<Map<String, List<MuscleLoad>>> =
        dao.observeUserExerciseOverrides().map { overrides ->
            overrides.associate { override ->
                override.exerciseNameNormalized to MuscleJsonParser.parseLoadsJson(override.loadsJson)
            }
        }

    suspend fun saveUserOverride(exerciseName: String, loads: List<MuscleLoad>) {
        val normalized = normalizeExerciseName(exerciseName)
        dao.insertUserExerciseOverride(
            UserExerciseOverrideEntity(
                exerciseNameNormalized = normalized,
                displayName = exerciseName.trim(),
                loadsJson = MuscleJsonParser.loadsToJson(calculator.normalizeLoads(loads)),
                createdAtMs = System.currentTimeMillis(),
            ),
        )
    }

    suspend fun getUserOverridesSnapshot(): Map<String, List<MuscleLoad>> {
        return dao.getUserExerciseOverrides().associate { override ->
            override.exerciseNameNormalized to MuscleJsonParser.parseLoadsJson(override.loadsJson)
        }
    }

    private fun readAsset(path: String): String =
        appContext.assets.open(path).bufferedReader().use { it.readText() }
}
