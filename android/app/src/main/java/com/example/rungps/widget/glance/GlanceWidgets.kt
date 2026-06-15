package com.example.rungps.widget.glance

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.action.actionStartActivity
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.example.rungps.MainActivity
import com.example.rungps.tracking.TrackingState
import com.example.rungps.tracking.TrackingUiState

private val GreenBg = ColorProvider(0xFF1B5E20.toInt())
private val White = ColorProvider(0xFFFFFFFF.toInt())
private val GreenAccent = ColorProvider(0xFFB9F6CA.toInt())
private val GymBg = ColorProvider(0xFF263238.toInt())
private val GymMuted = ColorProvider(0xFFB0BEC5.toInt())
private val GymAccent = ColorProvider(0xFF80CBC4.toInt())
private val RecoveryBg = ColorProvider(0xFF311B92.toInt())
private val RecoveryMuted = ColorProvider(0xFFD1C4E9.toInt())
private val RecoveryAccent = ColorProvider(0xFFB39DDB.toInt())

class RideRunGlanceWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent { GlanceTheme { RideRunWidgetContent(context) } }
    }
}

class RideRunGlanceReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = RideRunGlanceWidget()
}

@Composable
private fun RideRunWidgetContent(context: Context) {
    val live: TrackingUiState = TrackingState.state.value
    val open = actionStartActivity(
        Intent(context, MainActivity::class.java).putExtra("open_tab", "home"),
    )
    Column(
        modifier = GlanceModifier
            .fillMaxSize()
            .background(GreenBg)
            .clickable(open)
            .padding(12.dp),
        verticalAlignment = Alignment.Vertical.CenterVertically,
    ) {
        Text(
            if (live.isRecording) "Recording" else "Ride / Run",
            style = TextStyle(color = White, fontSize = 14.sp, fontWeight = FontWeight.Bold),
        )
        Text(
            formatElapsed(live.elapsedMs),
            style = TextStyle(color = White, fontSize = 22.sp, fontWeight = FontWeight.Bold),
        )
        Text(
            formatDistanceKm(live.distanceM),
            style = TextStyle(color = GreenAccent, fontSize = 13.sp),
        )
    }
}

class GymGlanceWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent { GlanceTheme { GymWidgetContent(context) } }
    }
}

class GymGlanceReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = GymGlanceWidget()
}

@Composable
private fun GymWidgetContent(context: Context) {
    val open = actionStartActivity(
        Intent(context, MainActivity::class.java).putExtra("open_tab", "gym"),
    )
    Column(
        modifier = GlanceModifier
            .fillMaxSize()
            .background(GymBg)
            .clickable(open)
            .padding(12.dp),
    ) {
        Text("Gym", style = TextStyle(color = White, fontSize = 14.sp, fontWeight = FontWeight.Bold))
        Text("Tap to log sets", style = TextStyle(color = GymMuted, fontSize = 12.sp))
        Row(GlanceModifier.fillMaxWidth().padding(top = 8.dp)) {
            Text("Rest 60s", style = TextStyle(color = GymAccent, fontSize = 11.sp))
        }
    }
}

class RecoveryGlanceWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent { GlanceTheme { RecoveryWidgetContent(context) } }
    }
}

class RecoveryGlanceReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = RecoveryGlanceWidget()
}

@Composable
private fun RecoveryWidgetContent(context: Context) {
    val open = actionStartActivity(
        Intent(context, MainActivity::class.java).putExtra("open_tab", "recovery"),
    )
    Column(
        modifier = GlanceModifier
            .fillMaxSize()
            .background(RecoveryBg)
            .clickable(open)
            .padding(12.dp),
    ) {
        Text("Recovery", style = TextStyle(color = White, fontSize = 14.sp, fontWeight = FontWeight.Bold))
        Text("Readiness: Moderate", style = TextStyle(color = RecoveryMuted, fontSize = 12.sp))
        Text("Tap for load & advice", style = TextStyle(color = RecoveryAccent, fontSize = 11.sp))
    }
}

private fun formatElapsed(ms: Long): String {
    val totalSec = (ms / 1000).coerceAtLeast(0)
    val m = totalSec / 60
    val s = totalSec % 60
    return "%02d:%02d".format(m, s)
}

private fun formatDistanceKm(meters: Double): String = "%.2f km".format(meters / 1000.0)
