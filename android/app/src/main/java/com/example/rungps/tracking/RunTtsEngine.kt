package com.example.rungps.tracking

import android.speech.tts.TextToSpeech
import java.util.Locale

object RunTtsEngine {
    fun configure(tts: TextToSpeech) {
        tts.language = Locale.US
        tts.setSpeechRate(1.0f)
    }
}
