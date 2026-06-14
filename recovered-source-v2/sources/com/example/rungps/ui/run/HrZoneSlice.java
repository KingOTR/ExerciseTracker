package com.example.rungps.ui.run;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.HeartRateZones;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunHrZoneChart.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/ui/run/HrZoneSlice;", "", "zone", "Lcom/example/rungps/analytics/HeartRateZones$Zone;", "sampleCount", "", "share", "", "<init>", "(Lcom/example/rungps/analytics/HeartRateZones$Zone;IF)V", "getZone", "()Lcom/example/rungps/analytics/HeartRateZones$Zone;", "getSampleCount", "()I", "getShare", "()F", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HrZoneSlice {
    public static final int $stable = 0;
    private final int sampleCount;
    private final float share;
    private final HeartRateZones.Zone zone;

    public static /* synthetic */ HrZoneSlice copy$default(HrZoneSlice hrZoneSlice, HeartRateZones.Zone zone, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zone = hrZoneSlice.zone;
        }
        if ((i2 & 2) != 0) {
            i = hrZoneSlice.sampleCount;
        }
        if ((i2 & 4) != 0) {
            f = hrZoneSlice.share;
        }
        return hrZoneSlice.copy(zone, i, f);
    }

    /* renamed from: component1, reason: from getter */
    public final HeartRateZones.Zone getZone() {
        return this.zone;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* renamed from: component3, reason: from getter */
    public final float getShare() {
        return this.share;
    }

    public final HrZoneSlice copy(HeartRateZones.Zone zone, int sampleCount, float share) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        return new HrZoneSlice(zone, sampleCount, share);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrZoneSlice)) {
            return false;
        }
        HrZoneSlice hrZoneSlice = (HrZoneSlice) other;
        return Intrinsics.areEqual(this.zone, hrZoneSlice.zone) && this.sampleCount == hrZoneSlice.sampleCount && Float.compare(this.share, hrZoneSlice.share) == 0;
    }

    public int hashCode() {
        return (((this.zone.hashCode() * 31) + Integer.hashCode(this.sampleCount)) * 31) + Float.hashCode(this.share);
    }

    public String toString() {
        return "HrZoneSlice(zone=" + this.zone + ", sampleCount=" + this.sampleCount + ", share=" + this.share + ")";
    }

    public HrZoneSlice(HeartRateZones.Zone zone, int i, float f) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        this.zone = zone;
        this.sampleCount = i;
        this.share = f;
    }

    public final HeartRateZones.Zone getZone() {
        return this.zone;
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    public final float getShare() {
        return this.share;
    }
}
