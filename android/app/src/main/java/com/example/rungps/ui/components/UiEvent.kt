package com.example.rungps.ui.components

sealed class UiEvent {
    data class Message(
        val text: String,
        val actionLabel: String? = null,
        val onAction: (() -> Unit)? = null,
    ) : UiEvent()
}
