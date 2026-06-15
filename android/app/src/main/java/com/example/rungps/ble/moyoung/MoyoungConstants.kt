package com.example.rungps.ble.moyoung

import java.util.UUID

object MoyoungConstants {
    val UUID_SERVICE: UUID = uuid16("feea")
    val UUID_CHARACTERISTIC_DATA_OUT: UUID = uuid16("fee2")
    val UUID_CHARACTERISTIC_DATA_IN: UUID = uuid16("fee3")
    val UUID_CHARACTERISTIC_STEPS: UUID = uuid16("fee1")

    const val CMD_SYNC_TIME: Byte = 49
    const val CMD_QUERY_LAST_DYNAMIC_RATE: Byte = 52
    const val CMD_QUERY_MOVEMENT_HEART_RATE: Byte = 55
    const val CMD_QUERY_V2_WORKOUT: Byte = (-78).toByte()

    const val WORKOUT_LIST_REQUEST: Byte = 0
    const val WORKOUT_LIST_RESPONSE: Byte = 1
    const val WORKOUT_DETAIL_REQUEST: Byte = 2
    const val WORKOUT_DETAIL_RESPONSE: Byte = 3
    const val WORKOUT_HR_REQUEST: Byte = 4
    const val WORKOUT_HR_RESPONSE: Byte = 5

    const val TRAINING_TYPE_FOOTBALL = 6
    const val TRAINING_TYPE_FITNESS = 13
    const val TRAINING_TYPE_FREE_EXERCISE = 18

    private fun uuid16(short: String): UUID =
        UUID.fromString("0000$short-0000-1000-8000-00805f9b34fb")
}
