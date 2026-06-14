package com.example.rungps.ble;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/ble/BleGattChar;", "", "uuid", "", "properties", "", "<init>", "(Ljava/lang/String;I)V", "getUuid", "()Ljava/lang/String;", "getProperties", "()I", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BleGattChar {
    public static final int $stable = 0;
    private final int properties;
    private final String uuid;

    public static /* synthetic */ BleGattChar copy$default(BleGattChar bleGattChar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleGattChar.uuid;
        }
        if ((i2 & 2) != 0) {
            i = bleGattChar.properties;
        }
        return bleGattChar.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProperties() {
        return this.properties;
    }

    public final BleGattChar copy(String uuid, int properties) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new BleGattChar(uuid, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleGattChar)) {
            return false;
        }
        BleGattChar bleGattChar = (BleGattChar) other;
        return Intrinsics.areEqual(this.uuid, bleGattChar.uuid) && this.properties == bleGattChar.properties;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + Integer.hashCode(this.properties);
    }

    public String toString() {
        return "BleGattChar(uuid=" + this.uuid + ", properties=" + this.properties + ")";
    }

    public BleGattChar(String uuid, int i) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.properties = i;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final int getProperties() {
        return this.properties;
    }
}
