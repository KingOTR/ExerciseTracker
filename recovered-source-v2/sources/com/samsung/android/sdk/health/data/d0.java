package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.device.AccessoryType;
import com.samsung.android.sdk.health.data.device.DeviceGroup;
import com.samsung.android.sdk.health.data.device.DeviceType;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static final Pair a(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return deviceType instanceof DeviceGroup ? new Pair(Integer.valueOf(((DeviceGroup) deviceType).ordinal()), -1) : new Pair(Integer.valueOf(DeviceGroup.ACCESSORY.ordinal()), Integer.valueOf(((AccessoryType) deviceType).ordinal()));
    }

    public static final DeviceType a(int i, int i2) {
        DeviceGroup deviceGroup = DeviceGroup.ACCESSORY;
        Enum r4 = null;
        if (i != deviceGroup.ordinal()) {
            Enum[] enumConstants = (Enum[]) DeviceGroup.class.getEnumConstants();
            if (enumConstants != null) {
                Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                r4 = (i <= 0 || i >= enumConstants.length) ? enumConstants[0] : enumConstants[i];
            }
            DeviceGroup deviceGroup2 = (DeviceGroup) r4;
            return deviceGroup2 == null ? DeviceGroup.OTHER : deviceGroup2;
        }
        if (i2 == -1) {
            return deviceGroup;
        }
        Enum[] enumConstants2 = (Enum[]) AccessoryType.class.getEnumConstants();
        if (enumConstants2 != null) {
            Intrinsics.checkNotNullExpressionValue(enumConstants2, "enumConstants");
            r4 = (i2 <= 0 || i2 >= enumConstants2.length) ? enumConstants2[0] : enumConstants2[i2];
        }
        AccessoryType accessoryType = (AccessoryType) r4;
        return accessoryType == null ? AccessoryType.UNKNOWN : accessoryType;
    }
}
