package com.example.rungps.health

import android.app.Activity
import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Reflection bridge to Samsung Health Data SDK when present on device classpath.
 */
class SamsungHealthManager(private val context: Context) {
    private val base = "com.samsung.android.sdk.health.data"

    fun isSdkOnClasspath(): Boolean = runCatching {
        Class.forName("$base.HealthDataService")
    }.isSuccess

    private fun storeOrNull(): Any? {
        val serviceCls = runCatching { Class.forName("$base.HealthDataService") }.getOrNull() ?: return null
        runCatching {
            serviceCls.methods.firstOrNull { it.name == "initialize" && it.parameterCount == 1 }
                ?.invoke(null, context.applicationContext)
        }
        val getStore = serviceCls.methods.firstOrNull { it.name == "getStore" && it.parameterCount == 1 }
            ?: return null
        return runCatching { getStore.invoke(null, context.applicationContext) }.getOrNull()
    }

    fun isSamsungHealthReachable(): Boolean = storeOrNull() != null

    suspend fun hasStepsReadPermission(): Boolean {
        val wanted = permissionSetStepsReadOnly() ?: return false
        return hasSubset(wanted)
    }

    suspend fun hasExerciseWritePermission(): Boolean {
        val wanted = permissionSetExerciseWriteOnly() ?: return false
        return hasSubset(wanted)
    }

    suspend fun hasAllPermissions(): Boolean = hasStepsReadPermission() && hasExerciseWritePermission()

    suspend fun ensureStepsReadPermission(activity: Activity): Boolean {
        val wanted = permissionSetStepsReadOnly() ?: return false
        return ensurePermissionSet(activity, wanted)
    }

    suspend fun ensureExerciseWritePermission(activity: Activity): Boolean {
        val wanted = permissionSetExerciseWriteOnly() ?: return false
        return ensurePermissionSet(activity, wanted)
    }

    suspend fun ensurePermissions(activity: Activity): Boolean {
        val wanted = permissionSetStepsAndExerciseWrite() ?: return false
        return ensurePermissionSet(activity, wanted)
    }

    suspend fun readStepsForDay(date: LocalDate, zoneId: ZoneId = ZoneId.systemDefault()): Long? =
        withContext(Dispatchers.IO) {
            val store = storeOrNull() ?: return@withContext null
            if (!hasStepsReadPermission()) return@withContext null
            val start = date.atStartOfDay()
            val end = if (date == LocalDate.now(zoneId)) LocalDateTime.now(zoneId) else date.plusDays(1).atStartOfDay()
            runCatching {
                val stepsTypeCls = Class.forName("$base.data.DataTypes")
                val totalObj = stepsTypeCls.getField("STEPS").get(null)
                val builder = totalObj.javaClass.methods.firstOrNull { it.name == "getRequestBuilder" && it.parameterCount == 0 }
                    ?.invoke(totalObj) ?: return@runCatching null
                chain(builder, "setLocalTimeFilter", start.atZone(zoneId).toInstant(), end.atZone(zoneId).toInstant())
                val future = builder.javaClass.methods.firstOrNull { it.name == "build" && it.parameterCount == 0 }
                    ?.invoke(builder) ?: return@runCatching null
                val readData = store.javaClass.methods.firstOrNull { it.name == "readData" && it.parameterCount == 1 }
                    ?.invoke(store, future) ?: return@runCatching null
                val result = futureGet(readData)
                val dataList = result?.javaClass?.methods?.firstOrNull { it.name == "getDataList" && it.parameterCount == 0 }
                    ?.invoke(result) as? List<*> ?: emptyList<Any>()
                dataList.sumOf { row ->
                    row?.javaClass?.methods?.firstOrNull { it.name == "getValue" && it.parameterCount == 0 }
                        ?.invoke(row)?.toString()?.toLongOrNull() ?: 0L
                }
            }.getOrNull()
        }

    suspend fun backupRun(
        runId: Long,
        startTime: Instant,
        endTime: Instant,
        distanceMeters: Double,
        steps: Long,
    ): Boolean = withContext(Dispatchers.IO) {
        val store = storeOrNull() ?: return@withContext false
        if (!hasExerciseWritePermission()) return@withContext false
        runCatching {
            val exerciseCls = Class.forName("$base.data.DataTypes")
            val exerciseType = exerciseCls.getField("EXERCISE").get(null)
            val builder = exerciseType.javaClass.methods.firstOrNull { it.name == "getRequestBuilder" && it.parameterCount == 0 }
                ?.invoke(exerciseType) ?: return@runCatching false
            val logCls = Class.forName("$base.data.request.DataType\$ExerciseType\$ExerciseLog")
            val log = logCls.methods.firstOrNull { it.name == "of" && it.parameterCount == 1 }
                ?.invoke(null, startTime) ?: return@runCatching false
            chain(builder, "addExerciseLog", log)
            val future = builder.javaClass.methods.firstOrNull { it.name == "build" && it.parameterCount == 0 }
                ?.invoke(builder) ?: return@runCatching false
            val write = store.javaClass.methods.firstOrNull { it.name == "insertData" && it.parameterCount == 1 }
                ?: store.javaClass.methods.firstOrNull { it.name == "writeData" && it.parameterCount == 1 }
            write?.invoke(store, future)
            true
        }.getOrDefault(false)
    }

    private suspend fun grantedPermissions(store: Any, wanted: Set<Any>): Set<*> = withContext(Dispatchers.IO) {
        val future = store.javaClass.methods.firstOrNull { it.name == "getGrantedPermissions" && it.parameterCount == 1 }
            ?.invoke(store, wanted) ?: return@withContext emptySet<Any>()
        (futureGet(future) as? Set<*>) ?: emptySet<Any>()
    }

    private suspend fun hasSubset(wanted: Set<Any>): Boolean {
        val store = storeOrNull() ?: return false
        return runCatching { grantedPermissions(store, wanted).containsAll(wanted) }.getOrDefault(false)
    }

    private suspend fun ensurePermissionSet(activity: Activity, wanted: Set<Any>): Boolean {
        val store = storeOrNull() ?: return false
        if (hasSubset(wanted)) return true
        return runCatching {
            val future = store.javaClass.methods.firstOrNull { it.name == "requestPermissions" && it.parameterCount == 2 }
                ?.invoke(store, wanted, activity) ?: return@runCatching false
            futureGet(future)
            hasSubset(wanted)
        }.getOrDefault(false)
    }

    private fun permissionSetStepsReadOnly(): Set<Any>? = permissionOf("STEPS", "READ")
    private fun permissionSetExerciseWriteOnly(): Set<Any>? = permissionOf("EXERCISE", "WRITE")
    private fun permissionSetStepsAndExerciseWrite(): Set<Any>? {
        val steps = permissionSetStepsReadOnly() ?: return null
        val exercise = permissionSetExerciseWriteOnly() ?: return null
        return steps + exercise
    }

    private fun permissionOf(dataType: String, access: String): Set<Any>? = runCatching {
        val permissionCls = Class.forName("$base.permission.Permission")
        val dataTypesCls = Class.forName("$base.data.DataTypes")
        val accessCls = Class.forName("$base.permission.AccessType")
        val data = dataTypesCls.getField(dataType).get(null)
        val accessType = accessCls.getField(access).get(null)
        val permission = permissionCls.methods.first { it.name == "of" && it.parameterCount == 2 }
            .invoke(null, data, accessType)
        setOf(permission!!)
    }.getOrNull()

    private fun futureGet(future: Any): Any? =
        future.javaClass.methods.firstOrNull { it.name == "get" && it.parameterCount == 0 }?.invoke(future)

    private fun chain(target: Any, name: String, vararg args: Any?) {
        val method = target.javaClass.methods.firstOrNull { m ->
            m.name == name && m.parameterCount == args.size &&
                args.indices.all { idx -> args[idx] == null || m.parameterTypes[idx].isAssignableFrom(args[idx]!!.javaClass) }
        } ?: target.javaClass.methods.firstOrNull { it.name == name && it.parameterCount == args.size }
        method?.invoke(target, *args)
    }

    fun roughRunKcal(distanceM: Double, duration: Duration): Double {
        val minutes = maxOf(duration.toMinutes(), 1L)
        val km = distanceM / 1000.0
        val paceMinPerKm = if (km > 0.01) duration.toMillis() / 60000.0 / km else 6.0
        val met = when {
            paceMinPerKm < 5.5 -> 12.0
            paceMinPerKm < 7.5 -> 10.0
            else -> 8.0
        }
        return ((met * 3.5 * 70.0) / 200.0) * minutes
    }
}
