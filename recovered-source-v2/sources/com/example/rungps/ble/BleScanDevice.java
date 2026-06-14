package com.example.rungps.ble;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/ble/BleScanDevice;", "", HintConstants.AUTOFILL_HINT_NAME, "", "address", "rssi", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getAddress", "getRssi", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/example/rungps/ble/BleScanDevice;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BleScanDevice {
    public static final int $stable = 0;
    private final String address;
    private final String name;
    private final Integer rssi;

    public static /* synthetic */ BleScanDevice copy$default(BleScanDevice bleScanDevice, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleScanDevice.name;
        }
        if ((i & 2) != 0) {
            str2 = bleScanDevice.address;
        }
        if ((i & 4) != 0) {
            num = bleScanDevice.rssi;
        }
        return bleScanDevice.copy(str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRssi() {
        return this.rssi;
    }

    public final BleScanDevice copy(String name, String address, Integer rssi) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new BleScanDevice(name, address, rssi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleScanDevice)) {
            return false;
        }
        BleScanDevice bleScanDevice = (BleScanDevice) other;
        return Intrinsics.areEqual(this.name, bleScanDevice.name) && Intrinsics.areEqual(this.address, bleScanDevice.address) && Intrinsics.areEqual(this.rssi, bleScanDevice.rssi);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode()) * 31;
        Integer num = this.rssi;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "BleScanDevice(name=" + this.name + ", address=" + this.address + ", rssi=" + this.rssi + ")";
    }

    public BleScanDevice(String str, String address, Integer num) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.name = str;
        this.address = address;
        this.rssi = num;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAddress() {
        return this.address;
    }

    public final Integer getRssi() {
        return this.rssi;
    }
}
