package com.samsung.android.sdk.health.data.device;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/samsung/android/sdk/health/data/device/AccessoryType;", "", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", DeviceTypes.UNKNOWN, "BLOOD_GLUCOSE_METER", "BLOOD_PRESSURE_MONITOR", "HEART_RATE_MONITOR", "WEIGHT_SCALE", "BIKE_SPEED_SENSOR", "BIKE_CADENCE_SENSOR", "BIKE_POWER_METER", "TREADMILL", "ELLIPTICAL", "STEP_CLIMBER", "STAIR_CLIMBER", "INDOOR_BIKE", "THERMOMETER", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public enum AccessoryType implements DeviceType {
    UNKNOWN,
    BLOOD_GLUCOSE_METER,
    BLOOD_PRESSURE_MONITOR,
    HEART_RATE_MONITOR,
    WEIGHT_SCALE,
    BIKE_SPEED_SENSOR,
    BIKE_CADENCE_SENSOR,
    BIKE_POWER_METER,
    TREADMILL,
    ELLIPTICAL,
    STEP_CLIMBER,
    STAIR_CLIMBER,
    INDOOR_BIKE,
    THERMOMETER;

    AccessoryType() {
    }
}
