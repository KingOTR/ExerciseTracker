package com.exercisetracker.app.domain.muscle

import org.json.JSONArray
import org.json.JSONObject

object MuscleJsonParser {
    fun parseTaxonomy(json: String): MuscleTaxonomy {
        val root = JSONObject(json)
        return MuscleTaxonomy(
            regions = parseRegions(root.getJSONArray("regions")),
            groups = parseGroups(root.getJSONArray("groups")),
            muscles = parseMuscles(root.getJSONArray("muscles")),
            patternTemplates = parseTemplates(root.optJSONArray("patternTemplates") ?: JSONArray()),
        )
    }

    fun parseExerciseDatabase(json: String): ExerciseMuscleDatabase {
        val root = JSONObject(json)
        val exercises = root.getJSONArray("exercises").let { array ->
            List(array.length()) { index ->
                parseExercise(array.getJSONObject(index))
            }
        }
        return ExerciseMuscleDatabase(exercises)
    }

    fun parseCardioDatabase(json: String): CardioMuscleDatabase {
        val root = JSONObject(json)
        val activities = root.getJSONArray("activities").let { array ->
            List(array.length()) { index ->
                parseCardioActivity(array.getJSONObject(index))
            }
        }
        val windowsJson = root.getJSONObject("recoveryWindows")
        return CardioMuscleDatabase(
            activities = activities,
            recoveryWindows = RecoveryWindows(
                gymDays = windowsJson.getInt("gymDays"),
                cardioDays = windowsJson.getInt("cardioDays"),
                stepDays = windowsJson.getInt("stepDays"),
            ),
        )
    }

    fun parseLoads(array: JSONArray): List<MuscleLoad> =
        List(array.length()) { index ->
            val item = array.getJSONObject(index)
            MuscleLoad(
                muscleId = item.getString("muscleId"),
                percent = item.getInt("percent"),
            )
        }

    fun loadsToJson(loads: List<MuscleLoad>): String {
        val array = JSONArray()
        loads.forEach { load ->
            array.put(
                JSONObject()
                    .put("muscleId", load.muscleId)
                    .put("percent", load.percent),
            )
        }
        return array.toString()
    }

    fun parseLoadsJson(json: String): List<MuscleLoad> = parseLoads(JSONArray(json))

    private fun parseRegions(array: JSONArray): List<RegionDefinition> =
        List(array.length()) { index ->
            val item = array.getJSONObject(index)
            RegionDefinition(id = item.getString("id"), label = item.getString("label"))
        }

    private fun parseGroups(array: JSONArray): List<MuscleGroupDefinition> =
        List(array.length()) { index ->
            val item = array.getJSONObject(index)
            MuscleGroupDefinition(
                id = item.getString("id"),
                label = item.getString("label"),
                regionId = item.getString("regionId"),
            )
        }

    private fun parseMuscles(array: JSONArray): List<MuscleDefinition> =
        List(array.length()) { index ->
            val item = array.getJSONObject(index)
            MuscleDefinition(
                id = item.getString("id"),
                label = item.getString("label"),
                groupId = item.getString("groupId"),
                regionId = item.getString("regionId"),
                atlasIds = item.optJSONArray("atlasIds")?.let { atlas ->
                    List(atlas.length()) { atlas.getString(it) }
                } ?: emptyList(),
            )
        }

    private fun parseTemplates(array: JSONArray): List<PatternTemplate> =
        List(array.length()) { index ->
            val item = array.getJSONObject(index)
            PatternTemplate(
                id = item.getString("id"),
                label = item.getString("label"),
                loads = parseLoads(item.getJSONArray("loads")),
            )
        }

    private fun parseExercise(item: JSONObject): ExerciseMapping {
        val name = item.getString("name")
        return ExerciseMapping(
            name = name,
            normalizedName = normalizeExerciseName(name),
            aliases = item.optJSONArray("aliases")?.let { aliases ->
                List(aliases.length()) { aliases.getString(it) }
            } ?: emptyList(),
            loads = parseLoads(item.getJSONArray("loads")),
            sources = item.optJSONArray("sources")?.let { sources ->
                List(sources.length()) { sources.getString(it) }
            } ?: emptyList(),
        )
    }

    private fun parseCardioActivity(item: JSONObject): CardioActivityMapping {
        val unit = when (item.getString("unit")) {
            "per_km" -> CardioUnit.PER_KM
            "per_minute" -> CardioUnit.PER_MINUTE
            "per_1000_steps" -> CardioUnit.PER_1000_STEPS
            else -> error("Unknown cardio unit: ${item.getString("unit")}")
        }
        return CardioActivityMapping(
            id = item.getString("id"),
            label = item.getString("label"),
            aliases = item.optJSONArray("aliases")?.let { aliases ->
                List(aliases.length()) { aliases.getString(it) }
            } ?: emptyList(),
            unit = unit,
            baseLoadPerUnit = item.getDouble("baseLoadPerUnit"),
            intensityScale = item.optBoolean("intensityScale", false),
            loads = parseLoads(item.getJSONArray("loads")),
            sources = item.optJSONArray("sources")?.let { sources ->
                List(sources.length()) { sources.getString(it) }
            } ?: emptyList(),
        )
    }
}
