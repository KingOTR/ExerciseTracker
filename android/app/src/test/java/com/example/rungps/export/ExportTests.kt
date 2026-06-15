package com.example.rungps.export

import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import org.junit.Assert.assertTrue
import org.junit.Test

class GpxExporterTest {
    @Test
    fun export_containsTrackpoints() {
        val run = RunEntity(id = 1, startedAtMs = 1_700_000_000_000, totalDistanceM = 5000.0)
        val points = listOf(
            PointEntity(runId = 1, timeMs = 1_700_000_000_000, lat = -33.8, lon = 151.2, accuracyM = 5f),
            PointEntity(runId = 1, timeMs = 1_700_000_060_000, lat = -33.81, lon = 151.21, accuracyM = 5f),
        )
        val gpx = GpxExporter.export(run, points)
        assertTrue(gpx.contains("<gpx"))
        assertTrue(gpx.contains("trkpt"))
        assertTrue(gpx.contains("-33.8"))
    }
}

class TcxExporterTest {
    @Test
    fun export_containsActivity() {
        val run = RunEntity(id = 2, startedAtMs = 1_700_000_000_000, totalDurationMs = 3600_000, totalDistanceM = 10000.0)
        val tcx = TcxExporter.export(run, emptyList())
        assertTrue(tcx.contains("TrainingCenterDatabase"))
        assertTrue(tcx.contains("Running"))
    }
}
