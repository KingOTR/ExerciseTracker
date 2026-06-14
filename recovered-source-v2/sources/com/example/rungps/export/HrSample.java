package com.example.rungps.export;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;

/* compiled from: HrSample.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/export/HrSample;", "", "timeMs", "", "bpm", "", "<init>", "(JI)V", "getTimeMs", "()J", "getBpm", "()I", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HrSample {
    public static final int $stable = 0;
    private final int bpm;
    private final long timeMs;

    public static /* synthetic */ HrSample copy$default(HrSample hrSample, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hrSample.timeMs;
        }
        if ((i2 & 2) != 0) {
            i = hrSample.bpm;
        }
        return hrSample.copy(j, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBpm() {
        return this.bpm;
    }

    public final HrSample copy(long timeMs, int bpm) {
        return new HrSample(timeMs, bpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrSample)) {
            return false;
        }
        HrSample hrSample = (HrSample) other;
        return this.timeMs == hrSample.timeMs && this.bpm == hrSample.bpm;
    }

    public int hashCode() {
        return (Long.hashCode(this.timeMs) * 31) + Integer.hashCode(this.bpm);
    }

    public String toString() {
        return "HrSample(timeMs=" + this.timeMs + ", bpm=" + this.bpm + ")";
    }

    public HrSample(long j, int i) {
        this.timeMs = j;
        this.bpm = i;
    }

    public final int getBpm() {
        return this.bpm;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }
}
