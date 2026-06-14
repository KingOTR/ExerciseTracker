package com.example.rungps.ble;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedBleWatchStore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/ble/SavedBleWatch;", "", "address", "", HintConstants.AUTOFILL_HINT_NAME, "lastConnectedMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAddress", "()Ljava/lang/String;", "getName", "getLastConnectedMs", "()J", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedBleWatch {
    public static final int $stable = 0;
    private final String address;
    private final long lastConnectedMs;
    private final String name;

    public static /* synthetic */ SavedBleWatch copy$default(SavedBleWatch savedBleWatch, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedBleWatch.address;
        }
        if ((i & 2) != 0) {
            str2 = savedBleWatch.name;
        }
        if ((i & 4) != 0) {
            j = savedBleWatch.lastConnectedMs;
        }
        return savedBleWatch.copy(str, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastConnectedMs() {
        return this.lastConnectedMs;
    }

    public final SavedBleWatch copy(String address, String name, long lastConnectedMs) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new SavedBleWatch(address, name, lastConnectedMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedBleWatch)) {
            return false;
        }
        SavedBleWatch savedBleWatch = (SavedBleWatch) other;
        return Intrinsics.areEqual(this.address, savedBleWatch.address) && Intrinsics.areEqual(this.name, savedBleWatch.name) && this.lastConnectedMs == savedBleWatch.lastConnectedMs;
    }

    public int hashCode() {
        int hashCode = this.address.hashCode() * 31;
        String str = this.name;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.lastConnectedMs);
    }

    public String toString() {
        return "SavedBleWatch(address=" + this.address + ", name=" + this.name + ", lastConnectedMs=" + this.lastConnectedMs + ")";
    }

    public SavedBleWatch(String address, String str, long j) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
        this.name = str;
        this.lastConnectedMs = j;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ SavedBleWatch(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getLastConnectedMs() {
        return this.lastConnectedMs;
    }
}
