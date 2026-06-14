package com.example.rungps.ble;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchSoccerSync.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/ble/WatchSoccerStatus;", "", "state", "", "elapsedSec", "hrBpm", "<init>", "(IILjava/lang/Integer;)V", "getState", "()I", "getElapsedSec", "getHrBpm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/example/rungps/ble/WatchSoccerStatus;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WatchSoccerStatus {
    public static final int $stable = 0;
    private final int elapsedSec;
    private final Integer hrBpm;
    private final int state;

    public static /* synthetic */ WatchSoccerStatus copy$default(WatchSoccerStatus watchSoccerStatus, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = watchSoccerStatus.state;
        }
        if ((i3 & 2) != 0) {
            i2 = watchSoccerStatus.elapsedSec;
        }
        if ((i3 & 4) != 0) {
            num = watchSoccerStatus.hrBpm;
        }
        return watchSoccerStatus.copy(i, i2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final int getElapsedSec() {
        return this.elapsedSec;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getHrBpm() {
        return this.hrBpm;
    }

    public final WatchSoccerStatus copy(int state, int elapsedSec, Integer hrBpm) {
        return new WatchSoccerStatus(state, elapsedSec, hrBpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchSoccerStatus)) {
            return false;
        }
        WatchSoccerStatus watchSoccerStatus = (WatchSoccerStatus) other;
        return this.state == watchSoccerStatus.state && this.elapsedSec == watchSoccerStatus.elapsedSec && Intrinsics.areEqual(this.hrBpm, watchSoccerStatus.hrBpm);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.state) * 31) + Integer.hashCode(this.elapsedSec)) * 31;
        Integer num = this.hrBpm;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "WatchSoccerStatus(state=" + this.state + ", elapsedSec=" + this.elapsedSec + ", hrBpm=" + this.hrBpm + ")";
    }

    public WatchSoccerStatus(int i, int i2, Integer num) {
        this.state = i;
        this.elapsedSec = i2;
        this.hrBpm = num;
    }

    public final int getState() {
        return this.state;
    }

    public final int getElapsedSec() {
        return this.elapsedSec;
    }

    public final Integer getHrBpm() {
        return this.hrBpm;
    }
}
