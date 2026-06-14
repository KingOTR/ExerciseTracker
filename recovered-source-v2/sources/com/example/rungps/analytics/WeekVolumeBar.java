package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymWeeklyVolume.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/analytics/WeekVolumeBar;", "", "weekLabel", "", "tonnage", "", "sessionCount", "", "<init>", "(Ljava/lang/String;DI)V", "getWeekLabel", "()Ljava/lang/String;", "getTonnage", "()D", "getSessionCount", "()I", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WeekVolumeBar {
    public static final int $stable = 0;
    private final int sessionCount;
    private final double tonnage;
    private final String weekLabel;

    public static /* synthetic */ WeekVolumeBar copy$default(WeekVolumeBar weekVolumeBar, String str, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = weekVolumeBar.weekLabel;
        }
        if ((i2 & 2) != 0) {
            d = weekVolumeBar.tonnage;
        }
        if ((i2 & 4) != 0) {
            i = weekVolumeBar.sessionCount;
        }
        return weekVolumeBar.copy(str, d, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWeekLabel() {
        return this.weekLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTonnage() {
        return this.tonnage;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final WeekVolumeBar copy(String weekLabel, double tonnage, int sessionCount) {
        Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
        return new WeekVolumeBar(weekLabel, tonnage, sessionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekVolumeBar)) {
            return false;
        }
        WeekVolumeBar weekVolumeBar = (WeekVolumeBar) other;
        return Intrinsics.areEqual(this.weekLabel, weekVolumeBar.weekLabel) && Double.compare(this.tonnage, weekVolumeBar.tonnage) == 0 && this.sessionCount == weekVolumeBar.sessionCount;
    }

    public int hashCode() {
        return (((this.weekLabel.hashCode() * 31) + Double.hashCode(this.tonnage)) * 31) + Integer.hashCode(this.sessionCount);
    }

    public String toString() {
        return "WeekVolumeBar(weekLabel=" + this.weekLabel + ", tonnage=" + this.tonnage + ", sessionCount=" + this.sessionCount + ")";
    }

    public WeekVolumeBar(String weekLabel, double d, int i) {
        Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
        this.weekLabel = weekLabel;
        this.tonnage = d;
        this.sessionCount = i;
    }

    public final String getWeekLabel() {
        return this.weekLabel;
    }

    public final double getTonnage() {
        return this.tonnage;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }
}
