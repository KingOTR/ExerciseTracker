package com.example.rungps.nfc

import android.app.Activity
import android.content.Intent
import android.nfc.NfcAdapter
import android.nfc.Tag
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class GymNfcController(private val activity: ComponentActivity) {
    var pulse by mutableIntStateOf(0)
        private set
    var confirmSeq by mutableIntStateOf(0)
        private set
    var prompt by mutableStateOf<String?>(null)
        private set

    private val nfcAdapter: NfcAdapter? by lazy { NfcAdapter.getDefaultAdapter(activity) }
    private var nfcReaderActive = false
    private var activityResumed = false
    private var pendingTagResult: GymNfcHandler.TagResult? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    private val readerCallback = NfcAdapter.ReaderCallback { tag -> handleTag(tag) }

    fun onCreateHandleIntent(intent: Intent?) {
        if (intent == null) return
        deliverNfcIntentAction(intent)
    }

    fun onResume() {
        activityResumed = true
        updateReaderMode()
    }

    fun onPause() {
        activityResumed = false
        disableReaderMode()
    }

    fun onNewIntent(intent: Intent) {
        deliverNfcIntentAction(intent)
    }

    fun deliverPendingTagResult() {
        val result = pendingTagResult ?: return
        pendingTagResult = null
        when (result) {
            GymNfcHandler.TagResult.REGISTERED -> prompt = "NFC tag registered"
            GymNfcHandler.TagResult.ASK_START -> {
                confirmSeq++
                prompt = "Tap again to start gym session"
            }
            GymNfcHandler.TagResult.ASK_FINISH -> {
                confirmSeq++
                prompt = "Tap again to finish gym session"
            }
        }
        bumpPulse()
    }

    fun bumpPulse() {
        pulse++
    }

    fun clearPrompt() {
        prompt = null
    }

    private fun updateReaderMode() {
        if (!shouldListenForGymNfc()) {
            disableReaderMode()
            return
        }
        enableReaderMode()
    }

    private fun shouldListenForGymNfc(): Boolean =
        activityResumed && nfcAdapter?.isEnabled == true

    private fun enableReaderMode() {
        val adapter = nfcAdapter ?: return
        if (nfcReaderActive) return
        adapter.enableReaderMode(
            activity,
            readerCallback,
            NfcAdapter.FLAG_READER_NFC_A or
                NfcAdapter.FLAG_READER_NFC_B or
                NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
            null,
        )
        nfcReaderActive = true
    }

    private fun disableReaderMode() {
        if (!nfcReaderActive) return
        nfcAdapter?.disableReaderMode(activity)
        nfcReaderActive = false
    }

    private fun handleTag(tag: Tag) {
        activity.lifecycleScope.launch {
            val result = GymNfcHandler.handleTag(activity, tag)
            pendingTagResult = result
            mainHandler.post { deliverPendingTagResult() }
        }
    }

    private fun deliverNfcIntentAction(intent: Intent) {
        if (NfcAdapter.ACTION_TAG_DISCOVERED == intent.action ||
            NfcAdapter.ACTION_NDEF_DISCOVERED == intent.action ||
            NfcAdapter.ACTION_TECH_DISCOVERED == intent.action
        ) {
            val tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG, Tag::class.java)
                ?: @Suppress("DEPRECATION") intent.getParcelableExtra(NfcAdapter.EXTRA_TAG)
            if (tag != null) handleTag(tag)
        }
    }
}

object GymNfcHandler {
    enum class TagResult { REGISTERED, ASK_START, ASK_FINISH }

    suspend fun handleTag(activity: Activity, tag: Tag): TagResult {
        val id = tag.id?.joinToString("") { "%02x".format(it) }.orEmpty()
        if (id.isBlank()) return TagResult.ASK_START
        val prefs = activity.getSharedPreferences("gym_nfc", Activity.MODE_PRIVATE)
        val known = prefs.getStringSet("tags", emptySet()).orEmpty()
        return if (id in known) TagResult.ASK_FINISH else {
            prefs.edit().putStringSet("tags", known + id).apply()
            TagResult.REGISTERED
        }
    }
}
