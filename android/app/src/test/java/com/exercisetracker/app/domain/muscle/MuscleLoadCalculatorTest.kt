package com.exercisetracker.app.domain.muscle

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File

class MuscleLoadCalculatorTest {
    private lateinit var calculator: MuscleLoadCalculator
    private lateinit var exerciseDb: ExerciseMuscleDatabase

    @Before
    fun setUp() {
        val sharedDir = listOf(File("shared/muscles"), File("../shared/muscles"))
            .first { it.exists() }
        val taxonomyJson = File(sharedDir, "muscle-taxonomy.json").readText()
        val exerciseJson = File(sharedDir, "exercise-muscle-map.json").readText()
        val taxonomy = MuscleJsonParser.parseTaxonomy(taxonomyJson)
        exerciseDb = MuscleJsonParser.parseExerciseDatabase(exerciseJson)
        calculator = MuscleLoadCalculator(taxonomy)
    }

    @Test
    fun benchPressLoadsSumTo100() {
        val bench = exerciseDb.byNormalizedName[normalizeExerciseName("Bench Press")]!!
        assertTrue(calculator.validateLoadsSum(bench.loads))
    }

    @Test
    fun squatLoadsSumTo100() {
        val squat = exerciseDb.byNormalizedName[normalizeExerciseName("Back Squat")]!!
        assertTrue(calculator.validateLoadsSum(squat.loads))
    }

    @Test
    fun benchPressVolumeDistribution() {
        val bench = exerciseDb.byNormalizedName[normalizeExerciseName("Bench Press")]!!
        val entries = calculator.distributeLoad(1000.0, bench.loads)
        val pecMid = entries.first { it.muscleId == "pec-major-mid" }
        assertEquals(350.0, pecMid.volume, 1.0)
    }

    @Test
    fun setVolumeUsesWeightTimesReps() {
        assertEquals(800.0, calculator.setVolume(80.0, 10), 0.01)
    }

    @Test
    fun allExercisesSumNear100() {
        exerciseDb.exercises.forEach { exercise ->
            assertTrue(
                "${exercise.name} loads sum to ${exercise.loads.sumOf { it.percent }}",
                calculator.validateLoadsSum(exercise.loads),
            )
        }
    }
}
