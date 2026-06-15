package com.example.rungps.ui.sleep

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.sleep.SleepAnalyticsCompact
import com.example.rungps.sleep.SleepDebtTracker
import com.example.rungps.sleep.SleepNightAnalytics
import com.example.rungps.sleep.SleepScoring
import com.example.rungps.sleep.SleepScience
import com.example.rungps.sleep.SleepEventMarkersEncoder
import com.example.rungps.sleep.SleepHypnogramEncoder
import com.example.rungps.sleep.SleepStageLabel
import com.example.rungps.sleep.SleepTrackSample
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

private val nightFmt = DateTimeFormatter.ofPattern("EEE d MMM · HH:mm")

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SleepNightDetailSheet(
    entry: SleepEntryEntity?,
    allEntries: List<SleepEntryEntity> = emptyList(),
    onDismiss: () -> Unit,
) {
    if (entry == null) return
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    ModalBottomSheet(onDismissRequest = onDismiss, sheetState = sheetState) {
        SleepNightDetailContent(entry, allEntries, onDismiss)
    }
}

@Composable
fun SleepNightDetailContent(
    entry: SleepEntryEntity,
    allEntries: List<SleepEntryEntity> = emptyList(),
    onDismiss: () -> Unit,
) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Night detail", style = MaterialTheme.typography.titleLarge)
        Text(
            Instant.ofEpochMilli(entry.startTimeMs).atZone(ZoneId.systemDefault()).format(nightFmt),
            style = MaterialTheme.typography.bodyMedium,
        )
        SleepNightStatsSection(entry)
        SleepHypnogramChart(entry.hypnogramCompact)
        SleepDisturbanceTimeline(entry.eventMarkersCompact, entry.hypnogramCompact)
        SleepSnoreMetricsCard(entry)
        SleepBreathingDisruptionsCard(entry)
        SleepDebtDetailCard(entry, sleepEntries = allEntries)
        SleepScienceTipCard(entry)
        entry.notes?.takeIf { it.isNotBlank() }?.let {
            Text(it, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun SleepNightStatsSection(entry: SleepEntryEntity, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Sleep stats", style = MaterialTheme.typography.titleMedium)
            StatLine("Time asleep", "${entry.totalSleepMin / 60}h ${entry.totalSleepMin % 60}m")
            StatLine("Efficiency", "${entry.sleepEfficiency ?: "—"}%")
            entry.deepSleepMin?.let { StatLine("Deep", "${it}m") }
            entry.remSleepMin?.let { StatLine("REM", "${it}m") }
            entry.stageConfidenceMean?.let {
                StatLine("Stage confidence", "${(it * 100).toInt()}%")
            }
            entry.micCoverageRatio?.let {
                StatLine("Mic coverage", "${(it * 100).toInt()}%")
            }
            entry.breathRateMean?.takeIf { it > 0f }?.let {
                StatLine("Breath rate", "${"%.0f".format(it)} bpm")
            }
        }
    }
}

@Composable
private fun StatLine(label: String, value: String) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, style = MaterialTheme.typography.bodyMedium)
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun SleepHypnogramChart(compact: String?, modifier: Modifier = Modifier) {
    val stages = SleepHypnogramEncoder.decode(compact)
    if (stages.isEmpty()) return
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("Hypnogram", style = MaterialTheme.typography.titleMedium)
            Canvas(Modifier.fillMaxWidth().height(72.dp).padding(top = 8.dp)) {
                val barW = size.width / stages.size.coerceAtLeast(1)
                stages.forEachIndexed { i, stage ->
                    val y = stageY(stage, size.height)
                    drawRect(
                        color = stageColor(stage),
                        topLeft = Offset(i * barW, y),
                        size = Size(barW.coerceAtLeast(1f), size.height - y),
                    )
                }
            }
        }
    }
}

@Composable
fun SleepDisturbanceTimeline(
    markersCompact: String?,
    hypnogramCompact: String?,
    modifier: Modifier = Modifier,
) {
    val events = SleepEventMarkersEncoder.resolve(markersCompact, hypnogramCompact, null)
    if (events.none { it.hasMarker }) return
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("Disturbances", style = MaterialTheme.typography.titleMedium)
            val summary = buildList {
                val snore = events.count { it.snore }
                val talk = events.count { it.talk }
                val pause = events.count { it.breathPause }
                if (snore > 0) add("$snore snore min")
                if (talk > 0) add("$talk talk min")
                if (pause > 0) add("$pause breath-pause min")
            }.joinToString(" · ")
            Text(summary.ifBlank { "Markers recorded" }, modifier = Modifier.padding(top = 4.dp))
        }
    }
}

@Composable
fun SleepSnoreMetricsCard(entry: SleepEntryEntity, modifier: Modifier = Modifier) {
    val metrics = SleepAnalyticsCompact.parse(entry.sleepAnalyticsJson)?.snore
        ?: entry.snoreEvents?.let {
            com.example.rungps.sleep.SleepSnoreMetrics.NightMetrics(
                snoresPerHour = it.toFloat(),
                percentNightSnoring = 0f,
                lightMinutes = 0,
                loudMinutes = 0,
                epicMinutes = 0,
                snoreScore = it.coerceIn(0, 100),
            )
        } ?: return
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text("Snore metrics", style = MaterialTheme.typography.titleMedium)
            StatLine("Per hour", "${"%.1f".format(metrics.snoresPerHour)}")
            StatLine("Night snoring", "${metrics.percentNightSnoring.toInt()}%")
            StatLine("Score", "${metrics.snoreScore}/100")
        }
    }
}

@Composable
fun SleepBreathingDisruptionsCard(entry: SleepEntryEntity, modifier: Modifier = Modifier) {
    val breathing = SleepAnalyticsCompact.parse(entry.sleepAnalyticsJson)?.breathing ?: return
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text("Breathing disruptions", style = MaterialTheme.typography.titleMedium)
            StatLine("Per hour", "${"%.1f".format(breathing.disruptionsPerHour)}")
            StatLine("Clusters", "${breathing.clusterCount}")
            StatLine("Longest pause", "${breathing.longestPauseSec}s")
            StatLine("Pause minutes", "${breathing.breathPauseMinutes}m")
        }
    }
}

@Composable
fun SleepOvernightLiveChart(
    samples: List<SleepTrackSample>,
    modifier: Modifier = Modifier,
) {
    if (samples.size < 2) return
    val recent = samples.takeLast(60)
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("Live signal", style = MaterialTheme.typography.titleMedium)
            Canvas(Modifier.fillMaxWidth().height(64.dp).padding(top = 8.dp)) {
                val maxMove = recent.maxOf { it.movement }.coerceAtLeast(0.1f)
                val step = size.width / recent.size.coerceAtLeast(1)
                recent.forEachIndexed { i, s ->
                    val h = (s.movement / maxMove) * size.height * 0.45f
                    drawRect(
                        color = Color(0xFF5C6BC0),
                        topLeft = Offset(i * step, size.height - h),
                        size = Size(step.coerceAtLeast(1f), h),
                    )
                    val audioH = s.audioLevel.coerceIn(0f, 3f) / 3f * size.height * 0.35f
                    drawRect(
                        color = Color(0xFF26A69A),
                        topLeft = Offset(i * step, size.height * 0.1f),
                        size = Size(step.coerceAtLeast(1f), audioH),
                    )
                }
            }
        }
    }
}

private fun stageColor(stage: SleepStageLabel): Color = when (stage) {
    SleepStageLabel.AWAKE -> Color(0xFFFFB74D)
    SleepStageLabel.LIGHT -> Color(0xFF64B5F6)
    SleepStageLabel.DEEP -> Color(0xFF3949AB)
    SleepStageLabel.REM -> Color(0xFFBA68C8)
}

private fun stageY(stage: SleepStageLabel, height: Float): Float = when (stage) {
    SleepStageLabel.AWAKE -> 0f
    SleepStageLabel.REM -> height * 0.15f
    SleepStageLabel.LIGHT -> height * 0.35f
    SleepStageLabel.DEEP -> height * 0.55f
}

@Composable
fun SleepDebtDetailCard(
    entry: SleepEntryEntity,
    sleepEntries: List<SleepEntryEntity>,
    modifier: Modifier = Modifier,
) {
    val debt = SleepDebtTracker.analyze(sleepEntries.ifEmpty { listOf(entry) })
    val score = SleepScoring.overallScore(entry)
    val report = SleepNightAnalytics.analyze(entry)
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Text("Sleep score & debt", style = MaterialTheme.typography.titleMedium)
            StatLine("Night score", "$score/100")
            StatLine("7-day debt", "${"%.1f".format(debt.debtHours)}h")
            StatLine("Efficiency", report.efficiencyLabel)
            if (report.flags.isNotEmpty()) {
                Text(report.flags.joinToString(" · "), style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Composable
fun SleepScienceTipCard(entry: SleepEntryEntity, modifier: Modifier = Modifier) {
    val stages = SleepHypnogramEncoder.decode(entry.hypnogramCompact)
    val dominant = stages.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key ?: SleepStageLabel.LIGHT
    Card(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text("Sleep science", style = MaterialTheme.typography.titleMedium)
            Text(SleepScience.tipForStage(dominant), style = MaterialTheme.typography.bodySmall)
        }
    }
}
