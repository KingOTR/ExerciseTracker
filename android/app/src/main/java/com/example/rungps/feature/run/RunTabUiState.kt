package com.example.rungps.feature.run

data class RunTabUiState(
    val rows: List<RunRow> = emptyList(),
    val isRecording: Boolean = false,
    val message: String? = null,
)
