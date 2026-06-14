package com.exercisetracker.app.domain.muscle

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.File

class ExerciseMuscleResolverTest {
    private lateinit var resolver: ExerciseMuscleResolver

    @Before
    fun setUp() {
        val sharedDir = listOf(File("shared/muscles"), File("../shared/muscles"))
            .first { it.exists() }
        val taxonomy = MuscleJsonParser.parseTaxonomy(File(sharedDir, "muscle-taxonomy.json").readText())
        val exerciseDb = MuscleJsonParser.parseExerciseDatabase(File(sharedDir, "exercise-muscle-map.json").readText())
        resolver = ExerciseMuscleResolver(exerciseDb, taxonomy)
    }

    @Test
    fun resolvesLatPulldown() {
        val result = resolver.resolve("Lat Pulldown")
        assertEquals(MappingSource.DATABASE, result.source)
        assertTrue(result.loads.isNotEmpty())
    }

    @Test
    fun resolvesMachineChestPress() {
        val result = resolver.resolve("Machine Chest Press")
        assertEquals(MappingSource.DATABASE, result.source)
    }

    @Test
    fun userOverrideTakesPrecedence() {
        val override = mapOf(
            normalizeExerciseName("Custom Move") to listOf(
                MuscleLoad("pec-major-mid", 100),
            ),
        )
        val result = resolver.resolve("Custom Move", override)
        assertEquals(MappingSource.USER_OVERRIDE, result.source)
        assertEquals(100, result.loads.single().percent)
    }

    @Test
    fun unknownExerciseReturnsEmpty() {
        val result = resolver.resolve("Totally Unknown Exercise XYZ")
        assertEquals(MappingSource.UNKNOWN, result.source)
        assertTrue(result.loads.isEmpty())
    }
}
