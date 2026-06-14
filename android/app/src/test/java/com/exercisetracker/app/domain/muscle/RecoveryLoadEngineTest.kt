package com.exercisetracker.app.domain.muscle

import com.exercisetracker.app.data.entity.RunEntity
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File

class RecoveryLoadEngineTest {
    private lateinit var engine: RecoveryLoadEngine

    @Before
    fun setUp() {
        val sharedDir = listOf(File("shared/muscles"), File("../shared/muscles"))
            .first { it.exists() }
        val taxonomy = MuscleJsonParser.parseTaxonomy(File(sharedDir, "muscle-taxonomy.json").readText())
        val exerciseDb = MuscleJsonParser.parseExerciseDatabase(File(sharedDir, "exercise-muscle-map.json").readText())
        val cardioDb = MuscleJsonParser.parseCardioDatabase(File(sharedDir, "cardio-muscle-map.json").readText())
        val calculator = MuscleLoadCalculator(taxonomy)
        val resolver = ExerciseMuscleResolver(exerciseDb, taxonomy)
        engine = RecoveryLoadEngine(taxonomy, cardioDb, calculator, resolver)
    }

    @Test
    fun fiveKmRunLoadsLowerBody() {
        val now = System.currentTimeMillis()
        val input = RecoveryLoadInput(
            gymSets = emptyList(),
            runs = listOf(
                RunEntity(
                    id = 1L,
                    startedAtMs = now - 3_600_000L,
                    endedAtMs = now,
                    distanceM = 5000.0,
                    durationMs = 1_500_000L,
                    activityType = "RUN",
                ),
            ),
            soccerSessions = emptyList(),
            nowMs = now,
        )
        val scores = engine.computeRecovery(input)
        val lower = scores.filter { it.regionId == "lower" && it.cardioLoad > 0 }
        assertTrue(lower.isNotEmpty())
        val quadLoad = scores.first { it.muscleId == "vastus-lateralis" }.cardioLoad
        assertTrue(quadLoad > 0.0)
    }

    @Test
    fun gymAndCardioAggregate() {
        val now = System.currentTimeMillis()
        val input = RecoveryLoadInput(
            gymSets = listOf(
                GymSetInput("Bench Press", 80.0, 10, now),
            ),
            runs = listOf(
                RunEntity(1L, now - 3_600_000L, now, 5000.0, 1_500_000L, "RUN"),
            ),
            soccerSessions = emptyList(),
            nowMs = now,
        )
        val scores = engine.computeRecovery(input)
        val pec = scores.first { it.muscleId == "pec-major-mid" }
        val quad = scores.first { it.muscleId == "vastus-lateralis" }
        assertTrue(pec.gymLoad > 0.0)
        assertTrue(quad.cardioLoad > 0.0)
    }
}
