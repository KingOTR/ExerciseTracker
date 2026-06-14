package com.exercisetracker.app.domain.muscle

data class ResolvedExerciseMapping(
    val exerciseName: String,
    val loads: List<MuscleLoad>,
    val source: MappingSource,
)

enum class MappingSource {
    DATABASE,
    USER_OVERRIDE,
    FUZZY_MATCH,
    UNKNOWN,
}

/**
 * Resolves exercise names to muscle load maps using the built-in database,
 * user overrides, and fuzzy string matching.
 */
class ExerciseMuscleResolver(
    private val exerciseDatabase: ExerciseMuscleDatabase,
    private val taxonomy: MuscleTaxonomy,
) {
    fun resolve(
        exerciseName: String,
        userOverrides: Map<String, List<MuscleLoad>> = emptyMap(),
    ): ResolvedExerciseMapping {
        val normalized = normalizeExerciseName(exerciseName)
        userOverrides[normalized]?.let { loads ->
            return ResolvedExerciseMapping(exerciseName, loads, MappingSource.USER_OVERRIDE)
        }

        exerciseDatabase.byNormalizedName[normalized]?.let { mapping ->
            return ResolvedExerciseMapping(exerciseName, mapping.loads, MappingSource.DATABASE)
        }

        val fuzzy = fuzzyMatch(normalized)
        if (fuzzy != null) {
            return ResolvedExerciseMapping(exerciseName, fuzzy.loads, MappingSource.FUZZY_MATCH)
        }

        return ResolvedExerciseMapping(exerciseName, emptyList(), MappingSource.UNKNOWN)
    }

    fun templateLoads(templateId: String): List<MuscleLoad>? =
        taxonomy.patternTemplates.find { it.id == templateId }?.loads

    fun searchExercises(query: String, limit: Int = 20): List<ExerciseMapping> {
        val normalizedQuery = normalizeExerciseName(query)
        if (normalizedQuery.isEmpty()) {
            return exerciseDatabase.exercises.take(limit)
        }
        return exerciseDatabase.exercises
            .map { exercise ->
                val score = bestMatchScore(normalizedQuery, exercise)
                exercise to score
            }
            .filter { (_, score) -> score > 0 }
            .sortedByDescending { (_, score) -> score }
            .take(limit)
            .map { (exercise, _) -> exercise }
    }

    private fun fuzzyMatch(normalized: String): ExerciseMapping? {
        return exerciseDatabase.exercises
            .map { exercise -> exercise to bestMatchScore(normalized, exercise) }
            .filter { (_, score) -> score >= 80 }
            .maxByOrNull { (_, score) -> score }
            ?.first
    }

    private fun bestMatchScore(query: String, exercise: ExerciseMapping): Int {
        val candidates = listOf(exercise.normalizedName) + exercise.aliases.map(::normalizeExerciseName)
        return candidates.maxOf { candidate ->
            when {
                candidate == query -> 100
                candidate.contains(query) || query.contains(candidate) -> 85
                tokenOverlapScore(query, candidate) >= 0.75 -> 80
                levenshteinSimilarity(query, candidate) >= 0.82 -> 75
                else -> 0
            }
        }
    }

    private fun tokenOverlapScore(a: String, b: String): Double {
        val tokensA = a.split(" ").filter { it.isNotBlank() }.toSet()
        val tokensB = b.split(" ").filter { it.isNotBlank() }.toSet()
        if (tokensA.isEmpty() || tokensB.isEmpty()) return 0.0
        val intersection = tokensA.intersect(tokensB).size
        val union = tokensA.union(tokensB).size
        return intersection.toDouble() / union
    }

    private fun levenshteinSimilarity(a: String, b: String): Double {
        if (a == b) return 1.0
        if (a.isEmpty() || b.isEmpty()) return 0.0
        val distance = levenshteinDistance(a, b)
        val maxLen = maxOf(a.length, b.length)
        return 1.0 - distance.toDouble() / maxLen
    }

    private fun levenshteinDistance(a: String, b: String): Int {
        val costs = IntArray(b.length + 1) { it }
        for (i in 1..a.length) {
            var previous = i - 1
            costs[0] = i
            for (j in 1..b.length) {
                val temp = costs[j]
                val cost = if (a[i - 1] == b[j - 1]) previous else previous + 1
                previous = costs[j]
                costs[j] = minOf(
                    costs[j] + 1,
                    costs[j - 1] + 1,
                    cost,
                )
            }
        }
        return costs[b.length]
    }
}
