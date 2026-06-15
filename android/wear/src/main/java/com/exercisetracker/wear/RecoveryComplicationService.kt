package com.exercisetracker.wear

import android.graphics.drawable.Icon
import android.support.wearable.complications.ComplicationProviderService
import android.support.wearable.complications.ComplicationData
import android.support.wearable.complications.ComplicationManager

/** Stub complication — data layer sync from phone app in future pass. */
class RecoveryComplicationService : ComplicationProviderService() {
    override fun onComplicationUpdate(complicationId: Int, type: Int, manager: ComplicationManager) {
        manager.updateComplicationData(
            complicationId,
            ComplicationData.Builder(type)
                .setShortText(ComplicationData.plainText("—%"))
                .setTapAction(null)
                .build(),
        )
    }
}
