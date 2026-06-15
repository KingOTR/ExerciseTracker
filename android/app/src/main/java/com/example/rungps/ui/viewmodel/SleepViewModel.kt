package com.example.rungps.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.rungps.data.ExerciseTrackerDatabase
import com.example.rungps.data.entity.SleepEntryEntity
import com.example.rungps.data.repo.SleepRepository
import com.example.rungps.sleep.SleepAlarmPreferences
import com.example.rungps.sleep.SleepListenService
import com.example.rungps.sleep.SleepOvernightStore
import com.example.rungps.sleep.SleepSessionFinisher
import com.example.rungps.sleep.SleepTrackSample
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SleepViewModel(app: Application) : AndroidViewModel(app) {
    private val repo = SleepRepository(ExerciseTrackerDatabase.get(app).sleepDao())
    private val context get() = getApplication<Application>()

    val entries: StateFlow<List<SleepEntryEntity>> =
        repo.observeEntries().stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val isTracking: Boolean
        get() = SleepOvernightStore.isActive(context)

    val isServiceRunning: Boolean
        get() = SleepListenService.isRunningInProcess()

    fun liveSamples(): List<SleepTrackSample> =
        SleepOvernightStore.loadRecentSamples(context, 360)

    fun alarmTime(): Pair<Int, Int> = SleepAlarmPreferences.alarmTime(context)

    fun windowMin(): Int = SleepAlarmPreferences.windowMin(context)

    fun smartAlarmEnabled(): Boolean = SleepAlarmPreferences.smartAlarmEnabled(context)

    fun setAlarmTime(hour: Int, minute: Int) {
        SleepAlarmPreferences.setAlarmTime(context, hour, minute)
    }

    fun setWindowMin(min: Int) {
        SleepAlarmPreferences.setWindowMin(context, min)
    }

    fun setSmartAlarm(enabled: Boolean) {
        SleepAlarmPreferences.setSmartAlarmEnabled(context, enabled)
    }

    fun startTracking() {
        val (hour, minute) = SleepAlarmPreferences.alarmTime(context)
        val target = SleepListenService.computeAlarmTargetMs(hour, minute)
        SleepListenService.start(
            context,
            target,
            SleepAlarmPreferences.windowMin(context),
            SleepAlarmPreferences.smartAlarmEnabled(context),
        )
    }

    fun stopTracking() {
        SleepListenService.stop(context)
    }

    fun finishNight(wakeMood: Int? = null, onDone: (SleepEntryEntity?) -> Unit = {}) {
        viewModelScope.launch {
            val entry = SleepSessionFinisher.finishAndSave(
                context,
                wakeMood = wakeMood,
                smartAlarmUsed = SleepOvernightStore.smartAlarm(context),
            )
            onDone(entry)
        }
    }
}
