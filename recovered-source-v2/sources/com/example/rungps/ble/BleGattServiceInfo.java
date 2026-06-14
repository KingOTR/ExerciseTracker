package com.example.rungps.ble;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/ble/BleGattServiceInfo;", "", "uuid", "", "characteristics", "", "Lcom/example/rungps/ble/BleGattChar;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUuid", "()Ljava/lang/String;", "getCharacteristics", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BleGattServiceInfo {
    public static final int $stable = 8;
    private final List<BleGattChar> characteristics;
    private final String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleGattServiceInfo copy$default(BleGattServiceInfo bleGattServiceInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleGattServiceInfo.uuid;
        }
        if ((i & 2) != 0) {
            list = bleGattServiceInfo.characteristics;
        }
        return bleGattServiceInfo.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<BleGattChar> component2() {
        return this.characteristics;
    }

    public final BleGattServiceInfo copy(String uuid, List<BleGattChar> characteristics) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        return new BleGattServiceInfo(uuid, characteristics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleGattServiceInfo)) {
            return false;
        }
        BleGattServiceInfo bleGattServiceInfo = (BleGattServiceInfo) other;
        return Intrinsics.areEqual(this.uuid, bleGattServiceInfo.uuid) && Intrinsics.areEqual(this.characteristics, bleGattServiceInfo.characteristics);
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.characteristics.hashCode();
    }

    public String toString() {
        return "BleGattServiceInfo(uuid=" + this.uuid + ", characteristics=" + this.characteristics + ")";
    }

    public BleGattServiceInfo(String uuid, List<BleGattChar> characteristics) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        this.uuid = uuid;
        this.characteristics = characteristics;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final List<BleGattChar> getCharacteristics() {
        return this.characteristics;
    }
}
