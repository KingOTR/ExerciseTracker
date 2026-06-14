package com.example.rungps.export;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GpxExporter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/example/rungps/export/TrackPoint;", "", "lat", "", "lon", "timeMs", "", "eleM", "hrBpm", "", "<init>", "(DDJLjava/lang/Double;Ljava/lang/Integer;)V", "getLat", "()D", "getLon", "getTimeMs", "()J", "getEleM", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHrBpm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(DDJLjava/lang/Double;Ljava/lang/Integer;)Lcom/example/rungps/export/TrackPoint;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrackPoint {
    public static final int $stable = 0;
    private final Double eleM;
    private final Integer hrBpm;
    private final double lat;
    private final double lon;
    private final long timeMs;

    /* renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getEleM() {
        return this.eleM;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHrBpm() {
        return this.hrBpm;
    }

    public final TrackPoint copy(double lat, double lon, long timeMs, Double eleM, Integer hrBpm) {
        return new TrackPoint(lat, lon, timeMs, eleM, hrBpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackPoint)) {
            return false;
        }
        TrackPoint trackPoint = (TrackPoint) other;
        return Double.compare(this.lat, trackPoint.lat) == 0 && Double.compare(this.lon, trackPoint.lon) == 0 && this.timeMs == trackPoint.timeMs && Intrinsics.areEqual((Object) this.eleM, (Object) trackPoint.eleM) && Intrinsics.areEqual(this.hrBpm, trackPoint.hrBpm);
    }

    public int hashCode() {
        int hashCode = ((((Double.hashCode(this.lat) * 31) + Double.hashCode(this.lon)) * 31) + Long.hashCode(this.timeMs)) * 31;
        Double d = this.eleM;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.hrBpm;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "TrackPoint(lat=" + this.lat + ", lon=" + this.lon + ", timeMs=" + this.timeMs + ", eleM=" + this.eleM + ", hrBpm=" + this.hrBpm + ")";
    }

    public TrackPoint(double d, double d2, long j, Double d3, Integer num) {
        this.lat = d;
        this.lon = d2;
        this.timeMs = j;
        this.eleM = d3;
        this.hrBpm = num;
    }

    public /* synthetic */ TrackPoint(double d, double d2, long j, Double d3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, j, (i & 8) != 0 ? null : d3, (i & 16) != 0 ? null : num);
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final Double getEleM() {
        return this.eleM;
    }

    public final Integer getHrBpm() {
        return this.hrBpm;
    }
}
