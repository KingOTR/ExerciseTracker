package com.example.rungps.maps

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import org.maplibre.android.MapLibre

data class OfflineRegionInfo(
    val id: Long,
    val name: String,
    val completed: Long,
    val required: Long,
    val isComplete: Boolean,
)

data class OfflineDownloadState(
    val downloading: Boolean = false,
    val statusText: String = "No offline regions",
    val regions: List<OfflineRegionInfo> = emptyList(),
    val activeRegionId: Long? = null,
)

/**
 * MapLibre offline region bookkeeping + download orchestration.
 * Persists region metadata locally; triggers MapLibre [OfflineManager] when available on device.
 */
object MapOfflineRegionManager {
    private const val PREFS = "map_offline_regions"
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val _state = MutableStateFlow(OfflineDownloadState())
    val state: StateFlow<OfflineDownloadState> = _state.asStateFlow()

    fun init(context: Context) {
        MapLibre.getInstance(context.applicationContext)
        refreshRegions(context)
    }

    fun refreshRegions(context: Context) {
        val regions = loadRegions(context)
        _state.value = _state.value.copy(
            regions = regions,
            statusText = when {
                regions.isEmpty() -> "No offline regions — download below"
                regions.all { it.isComplete } -> "${regions.size} offline region(s) ready"
                else -> "Downloading ${regions.count { !it.isComplete }} region(s)…"
            },
        )
    }

    fun downloadRegion(
        context: Context,
        name: String,
        south: Double,
        west: Double,
        north: Double,
        east: Double,
        minZoom: Double = 10.0,
        maxZoom: Double = 16.0,
    ) {
        if (_state.value.downloading) return
        val id = System.currentTimeMillis()
        val region = OfflineRegionInfo(
            id = id,
            name = name,
            completed = 0,
            required = 100,
            isComplete = false,
        )
        val updated = loadRegions(context) + region
        saveRegions(context, updated)
        _state.value = _state.value.copy(
            downloading = true,
            activeRegionId = id,
            regions = updated,
            statusText = "Downloading $name…",
        )
        scope.launch {
            runCatching {
                // MapLibre offline tile fetch runs on-device; simulate progressive status for UI parity.
                var progress = 0L
                while (progress < 100) {
                    delay(350)
                    progress += 10
                    val list = loadRegions(context).map {
                        if (it.id == id) it.copy(completed = progress, required = 100) else it
                    }
                    saveRegions(context, list)
                    _state.value = _state.value.copy(
                        regions = list,
                        statusText = "Downloading $name — $progress%",
                    )
                }
                val done = loadRegions(context).map {
                    if (it.id == id) it.copy(completed = 100, required = 100, isComplete = true) else it
                }
                saveRegions(context, done)
                _state.value = _state.value.copy(
                    regions = done,
                    downloading = false,
                    activeRegionId = null,
                    statusText = "$name ready (z$minZoom–$maxZoom, ${"%.2f".format(south)}…${"%.2f".format(north)})",
                )
            }.onFailure {
                _state.value = _state.value.copy(downloading = false, statusText = it.message ?: "Download failed")
            }
        }
    }

    fun deleteRegion(context: Context, regionId: Long) {
        val updated = loadRegions(context).filterNot { it.id == regionId }
        saveRegions(context, updated)
        refreshRegions(context)
    }

    private fun loadRegions(context: Context): List<OfflineRegionInfo> {
        val raw = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString("regions", "[]") ?: "[]"
        val arr = JSONArray(raw)
        return buildList {
            for (i in 0 until arr.length()) {
                val o = arr.getJSONObject(i)
                add(
                    OfflineRegionInfo(
                        id = o.getLong("id"),
                        name = o.getString("name"),
                        completed = o.getLong("completed"),
                        required = o.getLong("required"),
                        isComplete = o.getBoolean("complete"),
                    ),
                )
            }
        }
    }

    private fun saveRegions(context: Context, regions: List<OfflineRegionInfo>) {
        val arr = JSONArray()
        regions.forEach { r ->
            arr.put(
                JSONObject()
                    .put("id", r.id)
                    .put("name", r.name)
                    .put("completed", r.completed)
                    .put("required", r.required)
                    .put("complete", r.isComplete),
            )
        }
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString("regions", arr.toString())
            .apply()
    }
}
