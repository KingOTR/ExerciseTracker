package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;

/* compiled from: BikeStats.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/analytics/BikeRideStats;", "", "avgSpeedKmh", "", "maxSpeedKmh", "elevationGainM", "elevationLossM", "<init>", "(DDDD)V", "getAvgSpeedKmh", "()D", "getMaxSpeedKmh", "getElevationGainM", "getElevationLossM", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BikeRideStats {
    public static final int $stable = 0;
    private final double avgSpeedKmh;
    private final double elevationGainM;
    private final double elevationLossM;
    private final double maxSpeedKmh;

    /* renamed from: component1, reason: from getter */
    public final double getAvgSpeedKmh() {
        return this.avgSpeedKmh;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMaxSpeedKmh() {
        return this.maxSpeedKmh;
    }

    /* renamed from: component3, reason: from getter */
    public final double getElevationGainM() {
        return this.elevationGainM;
    }

    /* renamed from: component4, reason: from getter */
    public final double getElevationLossM() {
        return this.elevationLossM;
    }

    public final BikeRideStats copy(double avgSpeedKmh, double maxSpeedKmh, double elevationGainM, double elevationLossM) {
        return new BikeRideStats(avgSpeedKmh, maxSpeedKmh, elevationGainM, elevationLossM);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BikeRideStats)) {
            return false;
        }
        BikeRideStats bikeRideStats = (BikeRideStats) other;
        return Double.compare(this.avgSpeedKmh, bikeRideStats.avgSpeedKmh) == 0 && Double.compare(this.maxSpeedKmh, bikeRideStats.maxSpeedKmh) == 0 && Double.compare(this.elevationGainM, bikeRideStats.elevationGainM) == 0 && Double.compare(this.elevationLossM, bikeRideStats.elevationLossM) == 0;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.avgSpeedKmh) * 31) + Double.hashCode(this.maxSpeedKmh)) * 31) + Double.hashCode(this.elevationGainM)) * 31) + Double.hashCode(this.elevationLossM);
    }

    public String toString() {
        return "BikeRideStats(avgSpeedKmh=" + this.avgSpeedKmh + ", maxSpeedKmh=" + this.maxSpeedKmh + ", elevationGainM=" + this.elevationGainM + ", elevationLossM=" + this.elevationLossM + ")";
    }

    public BikeRideStats(double d, double d2, double d3, double d4) {
        this.avgSpeedKmh = d;
        this.maxSpeedKmh = d2;
        this.elevationGainM = d3;
        this.elevationLossM = d4;
    }

    public final double getAvgSpeedKmh() {
        return this.avgSpeedKmh;
    }

    public final double getMaxSpeedKmh() {
        return this.maxSpeedKmh;
    }

    public final double getElevationGainM() {
        return this.elevationGainM;
    }

    public final double getElevationLossM() {
        return this.elevationLossM;
    }
}
