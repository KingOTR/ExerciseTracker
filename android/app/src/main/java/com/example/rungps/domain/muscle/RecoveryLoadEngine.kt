package com.example.rungps.domain.muscle

import com.example.rungps.data.entity.GymSetEntity
import com.example.rungps.data.entity.RunEntity
import com.example.rungps.data.entity.SoccerSessionEntity

data class GymSetInput(
    val exerciseName: String,
    val weightKg: Double?,
    val reps: Int?,
    val loggedAtMs: Long?,
)

data class DailyStepsInput(
    val dayStartMs: Long,
    val steps: Int,
)

data class RecoveryLoadInput(
    val gymSets: List<GymSetInput>,
    val runs: List<RunEntity>,
    val soccerSessions: List<SoccerSessionEntity>,
    val dailySteps: List<DailyStepsInput> = emptyList(),
    val userOverrides: Map<String, List<MuscleLoad>> = emptyMap(),
    val nowMs: Long = System.currentTimeMillis(),
)

/**
 * Aggregates gym, cardio, and step load into muscle-specific fatigue scores.
 *
 * Cardio attribution based on shared/muscles/cardio-muscle-map.json research estimates.
 */
class RecoveryLoadEngine(
    private val taxonomy: MuscleTaxonomy,
    private val cardioDatabase: CardioMuscleDatabase,
    private val calculator: MuscleLoadCalculator,
    private val resolver: ExerciseMuscleResolver,
) {
    companion object {
        private const val MS_PER_DAY = 86_400_000L
        private const val FATIGUE_SCALE = 500.0
        private const val MAX_FATIGUE_PERCENT = 100.0
    }

    fun computeRecovery(input: RecoveryLoadInput): List<RecoveryMuscleScore> {
        val gymCutoff = input.nowMs - cardioDatabase.recoveryWindows.gymDays * MS_PER_DAY
        val cardioCutoff = input.nowMs - cardioDatabase.recoveryWindows.cardioDays * MS_PER_DAY
        val stepCutoff = input.nowMs - cardioDatabase.recoveryWindows.stepDays * MS_PER_DAY

        val gymLoads = mutableMapOf<String, Double>()
        val cardioLoads = mutableMapOf<String, Double>()

        input.gymSets
            .filter { set -> (set.loggedAtMs ?: input.nowMs) >= gymCutoff }
            .forEach { set ->
                val resolved = resolver.resolve(set.exerciseName, input.userOverrides)
                if (resolved.loads.isEmpty()) return@forEach
                val volume = calculator.setVolume(set.weightKg, set.reps)
                calculator.distributeLoad(volume, resolved.loads).forEach { entry ->
                    gymLoads[entry.muscleId] = gymLoads.getOrDefault(entry.muscleId, 0.0) + entry.volume
                }
            }

        input.runs
            .filter { run -> run.startedAtMs >= cardioCutoff }
            .forEach { run ->
                val activity = resolveRunActivity(run.activityType)
                addCardioLoad(cardioLoads, activity, unitsForRun(run), intensityFactor = 1.0)
            }

        input.soccerSessions
            .filter { session -> session.startTimeMs >= cardioCutoff }
            .forEach { session ->
                val activity = cardioDatabase.byId["SOCCER"] ?: return@forEach
                val units = session.playMin.toDouble() * (session.intensity.coerceIn(1, 10) / 5.0)
                addCardioLoad(cardioLoads, activity, units, intensityFactor = 1.0)
            }

        input.dailySteps
            .filter { steps -> steps.dayStartMs >= stepCutoff }
            .forEach { steps ->
                val activity = cardioDatabase.byId["STEPS"] ?: return@forEach
                val units = steps.steps / 1000.0
                addCardioLoad(cardioLoads, activity, units, intensityFactor = 1.0)
            }

        return taxonomy.muscles.map { muscle ->
            val gym = gymLoads.getOrDefault(muscle.id, 0.0)
            val cardio = cardioLoads.getOrDefault(muscle.id, 0.0)
            val total = gym + cardio
            RecoveryMuscleScore(
                muscleId = muscle.id,
                label = muscle.label,
                groupId = muscle.groupId,
                regionId = muscle.regionId,
                gymLoad = gym,
                cardioLoad = cardio,
                totalLoad = total,
                fatiguePercent = (total / FATIGUE_SCALE * 100.0).coerceIn(0.0, MAX_FATIGUE_PERCENT),
            )
        }.sortedByDescending { it.totalLoad }
    }

    fun computeSessionMuscleVolumes(
        sets: List<GymSetEntity>,
        userOverrides: Map<String, List<MuscleLoad>> = emptyMap(),
    ): List<MuscleVolumeEntry> {
        val allEntries = mutableListOf<MuscleVolumeEntry>()
        sets.forEach { set ->
            val resolved = resolver.resolve(set.exerciseName, userOverrides)
            if (resolved.loads.isEmpty()) return@forEach
            val volume = calculator.setVolume(set.weightKg, set.reps)
            allEntries += calculator.distributeLoad(volume, resolved.loads)
        }
        return calculator.aggregateVolumes(allEntries).mapNotNull { (muscleId, volume) ->
            val muscle = taxonomy.muscleById[muscleId] ?: return@mapNotNull null
            MuscleVolumeEntry(
                muscleId = muscleId,
                label = muscle.label,
                groupId = muscle.groupId,
                regionId = muscle.regionId,
                volume = volume,
            )
        }.sortedByDescending { it.volume }
    }

    private fun resolveRunActivity(activityType: String): CardioActivityMapping {
        val normalized = activityType.trim().uppercase()
        return when {
            normalized.contains("BIKE") || normalized.contains("CYCLE") ->
                cardioDatabase.byId["BIKE"] ?: cardioDatabase.activities.first()
            else -> cardioDatabase.byId["RUN"] ?: cardioDatabase.activities.first()
        }
    }

    private fun unitsForRun(run: RunEntity): Double = run.distanceM / 1000.0

    private fun addCardioLoad(
        target: MutableMap<String, Double>,
        activity: CardioActivityMapping,
        units: Double,
        intensityFactor: Double,
    ) {
        if (units <= 0.0) return
        val base = units * activity.baseLoadPerUnit * intensityFactor
        activity.loads.forEach { load ->
            target[load.muscleId] = target.getOrDefault(load.muscleId, 0.0) + base * load.percent / 100.0
        }
    }
}
