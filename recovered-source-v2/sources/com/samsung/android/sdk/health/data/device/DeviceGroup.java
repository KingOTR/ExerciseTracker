package com.samsung.android.sdk.health.data.device;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.example.rungps.data.UserProfileStore;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/device/DeviceGroup;", "", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", UserProfileStore.SEX_OTHER, "MOBILE", "WATCH", DeviceTypes.RING, "BAND", "ACCESSORY", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public enum DeviceGroup implements DeviceType {
    OTHER,
    MOBILE,
    WATCH,
    RING,
    BAND,
    ACCESSORY;

    DeviceGroup() {
    }
}
