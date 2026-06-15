package com.example.rungps.util

import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.runtime.Composable

@Composable
fun rememberHapticClick(): () -> Unit {
    val haptic = LocalHapticFeedback.current
    return { haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove) }
}

object HapticActions {
    const val NFC_SUCCESS = "nfc_success"
    const val LAP_MARKER = "lap_marker"
    const val ALARM_DISMISS = "alarm_dismiss"
}
