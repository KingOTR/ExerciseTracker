package com.example.rungps.ui.run;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunKmSplitsTable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/example/rungps/ui/run/SplitRow;", "", "idx", "", "durationMs", "", "distanceM", "", "paceSec", "<init>", "(IJDLjava/lang/Double;)V", "getIdx", "()I", "getDurationMs", "()J", "getDistanceM", "()D", "getPaceSec", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(IJDLjava/lang/Double;)Lcom/example/rungps/ui/run/SplitRow;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class SplitRow {
    private final double distanceM;
    private final long durationMs;
    private final int idx;
    private final Double paceSec;

    public static /* synthetic */ SplitRow copy$default(SplitRow splitRow, int i, long j, double d, Double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = splitRow.idx;
        }
        if ((i2 & 2) != 0) {
            j = splitRow.durationMs;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            d = splitRow.distanceM;
        }
        double d3 = d;
        if ((i2 & 8) != 0) {
            d2 = splitRow.paceSec;
        }
        return splitRow.copy(i, j2, d3, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIdx() {
        return this.idx;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getPaceSec() {
        return this.paceSec;
    }

    public final SplitRow copy(int idx, long durationMs, double distanceM, Double paceSec) {
        return new SplitRow(idx, durationMs, distanceM, paceSec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitRow)) {
            return false;
        }
        SplitRow splitRow = (SplitRow) other;
        return this.idx == splitRow.idx && this.durationMs == splitRow.durationMs && Double.compare(this.distanceM, splitRow.distanceM) == 0 && Intrinsics.areEqual((Object) this.paceSec, (Object) splitRow.paceSec);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.idx) * 31) + Long.hashCode(this.durationMs)) * 31) + Double.hashCode(this.distanceM)) * 31;
        Double d = this.paceSec;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        return "SplitRow(idx=" + this.idx + ", durationMs=" + this.durationMs + ", distanceM=" + this.distanceM + ", paceSec=" + this.paceSec + ")";
    }

    public SplitRow(int i, long j, double d, Double d2) {
        this.idx = i;
        this.durationMs = j;
        this.distanceM = d;
        this.paceSec = d2;
    }

    public final double getDistanceM() {
        return this.distanceM;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final Double getPaceSec() {
        return this.paceSec;
    }
}
