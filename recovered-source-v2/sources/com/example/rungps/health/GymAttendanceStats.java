package com.example.rungps.health;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymAttendance.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/health/GymAttendanceStats;", "", "daysHit", "", "windowDays", "pct", "label", "", "<init>", "(IIILjava/lang/String;)V", "getDaysHit", "()I", "getWindowDays", "getPct", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymAttendanceStats {
    public static final int $stable = 0;
    private final int daysHit;
    private final String label;
    private final int pct;
    private final int windowDays;

    public static /* synthetic */ GymAttendanceStats copy$default(GymAttendanceStats gymAttendanceStats, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = gymAttendanceStats.daysHit;
        }
        if ((i4 & 2) != 0) {
            i2 = gymAttendanceStats.windowDays;
        }
        if ((i4 & 4) != 0) {
            i3 = gymAttendanceStats.pct;
        }
        if ((i4 & 8) != 0) {
            str = gymAttendanceStats.label;
        }
        return gymAttendanceStats.copy(i, i2, i3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDaysHit() {
        return this.daysHit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWindowDays() {
        return this.windowDays;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPct() {
        return this.pct;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final GymAttendanceStats copy(int daysHit, int windowDays, int pct, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new GymAttendanceStats(daysHit, windowDays, pct, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymAttendanceStats)) {
            return false;
        }
        GymAttendanceStats gymAttendanceStats = (GymAttendanceStats) other;
        return this.daysHit == gymAttendanceStats.daysHit && this.windowDays == gymAttendanceStats.windowDays && this.pct == gymAttendanceStats.pct && Intrinsics.areEqual(this.label, gymAttendanceStats.label);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.daysHit) * 31) + Integer.hashCode(this.windowDays)) * 31) + Integer.hashCode(this.pct)) * 31) + this.label.hashCode();
    }

    public String toString() {
        return "GymAttendanceStats(daysHit=" + this.daysHit + ", windowDays=" + this.windowDays + ", pct=" + this.pct + ", label=" + this.label + ")";
    }

    public GymAttendanceStats(int i, int i2, int i3, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.daysHit = i;
        this.windowDays = i2;
        this.pct = i3;
        this.label = label;
    }

    public final int getDaysHit() {
        return this.daysHit;
    }

    public final int getWindowDays() {
        return this.windowDays;
    }

    public final int getPct() {
        return this.pct;
    }

    public final String getLabel() {
        return this.label;
    }
}
