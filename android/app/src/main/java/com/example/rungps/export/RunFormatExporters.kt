package com.example.rungps.export

import com.example.rungps.data.entity.PointEntity
import com.example.rungps.data.entity.RunEntity
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

object GpxExporter {
    private val iso = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC)

    fun export(run: RunEntity, points: List<PointEntity>): String {
        val sb = StringBuilder()
        sb.append("""<?xml version="1.0" encoding="UTF-8"?>""")
        sb.append("\n<gpx version=\"1.1\" creator=\"ExerciseTracker\">")
        sb.append("\n  <trk><name>Run ${run.id}</name><trkseg>")
        points.forEach { p ->
            sb.append("\n    <trkpt lat=\"${p.lat}\" lon=\"${p.lon}\">")
            p.eleM?.let { sb.append("<ele>$it</ele>") }
            sb.append("<time>${iso.format(Instant.ofEpochMilli(p.timeMs))}</time>")
            sb.append("</trkpt>")
        }
        sb.append("\n  </trkseg></trk></gpx>")
        return sb.toString()
    }
}

object TcxExporter {
    fun export(run: RunEntity, points: List<PointEntity>): String {
        val sb = StringBuilder()
        sb.append("""<?xml version="1.0" encoding="UTF-8"?>""")
        sb.append("\n<TrainingCenterDatabase>")
        sb.append("\n  <Activities><Activity Sport=\"Running\">")
        sb.append("\n    <Id>${Instant.ofEpochMilli(run.startedAtMs)}</Id>")
        sb.append("\n    <Lap StartTime=\"${run.startedAtMs}\">")
        sb.append("\n      <TotalTimeSeconds>${(run.totalDurationMs ?: 0) / 1000}</TotalTimeSeconds>")
        sb.append("\n      <DistanceMeters>${run.totalDistanceM ?: 0.0}</DistanceMeters>")
        sb.append("\n      <Track>")
        points.forEach { p ->
            sb.append("\n        <Trackpoint>")
            sb.append("\n          <Time>${Instant.ofEpochMilli(p.timeMs)}</Time>")
            sb.append("\n          <Position><LatitudeDegrees>${p.lat}</LatitudeDegrees>")
            sb.append("<LongitudeDegrees>${p.lon}</LongitudeDegrees></Position>")
            sb.append("\n        </Trackpoint>")
        }
        sb.append("\n      </Track></Lap></Activity></Activities></TrainingCenterDatabase>")
        return sb.toString()
    }
}

object FitExporter {
    fun exportStub(run: RunEntity): ByteArray {
        // Minimal FIT header stub — full encoder is out of scope; GPX/TCX preferred
        val header = "FIT".toByteArray()
        val meta = "run:${run.id},dist:${run.totalDistanceM}".toByteArray()
        return header + meta
    }
}
