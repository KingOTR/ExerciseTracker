package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010#\u001a\u00020\u0007HÆ\u0003J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006-"}, d2 = {"Lcom/example/rungps/data/PointEntity;", "", "id", "", "runId", "timeMs", "lat", "", "lon", "accuracyM", "", "eleM", "distanceFromPrevM", "<init>", "(JJJDDFLjava/lang/Double;D)V", "getId", "()J", "getRunId", "getTimeMs", "getLat", "()D", "getLon", "getAccuracyM", "()F", "getEleM", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDistanceFromPrevM", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JJJDDFLjava/lang/Double;D)Lcom/example/rungps/data/PointEntity;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PointEntity {
    private final float accuracyM;
    private final double distanceFromPrevM;
    private final Double eleM;
    private final long id;
    private final double lat;
    private final double lon;
    private final long runId;
    private final long timeMs;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRunId() {
        return this.runId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* renamed from: component6, reason: from getter */
    public final float getAccuracyM() {
        return this.accuracyM;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getEleM() {
        return this.eleM;
    }

    /* renamed from: component8, reason: from getter */
    public final double getDistanceFromPrevM() {
        return this.distanceFromPrevM;
    }

    public final PointEntity copy(long id, long runId, long timeMs, double lat, double lon, float accuracyM, Double eleM, double distanceFromPrevM) {
        return new PointEntity(id, runId, timeMs, lat, lon, accuracyM, eleM, distanceFromPrevM);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointEntity)) {
            return false;
        }
        PointEntity pointEntity = (PointEntity) other;
        return this.id == pointEntity.id && this.runId == pointEntity.runId && this.timeMs == pointEntity.timeMs && Double.compare(this.lat, pointEntity.lat) == 0 && Double.compare(this.lon, pointEntity.lon) == 0 && Float.compare(this.accuracyM, pointEntity.accuracyM) == 0 && Intrinsics.areEqual((Object) this.eleM, (Object) pointEntity.eleM) && Double.compare(this.distanceFromPrevM, pointEntity.distanceFromPrevM) == 0;
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.runId)) * 31) + Long.hashCode(this.timeMs)) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lon)) * 31) + Float.hashCode(this.accuracyM)) * 31;
        Double d = this.eleM;
        return ((hashCode + (d == null ? 0 : d.hashCode())) * 31) + Double.hashCode(this.distanceFromPrevM);
    }

    public String toString() {
        return "PointEntity(id=" + this.id + ", runId=" + this.runId + ", timeMs=" + this.timeMs + ", lat=" + this.lat + ", lon=" + this.lon + ", accuracyM=" + this.accuracyM + ", eleM=" + this.eleM + ", distanceFromPrevM=" + this.distanceFromPrevM + ")";
    }

    public PointEntity(long j, long j2, long j3, double d, double d2, float f, Double d3, double d4) {
        this.id = j;
        this.runId = j2;
        this.timeMs = j3;
        this.lat = d;
        this.lon = d2;
        this.accuracyM = f;
        this.eleM = d3;
        this.distanceFromPrevM = d4;
    }

    public /* synthetic */ PointEntity(long j, long j2, long j3, double d, double d2, float f, Double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, j3, d, d2, f, (i & 64) != 0 ? null : d3, (i & 128) != 0 ? 0.0d : d4);
    }

    public final long getId() {
        return this.id;
    }

    public final long getRunId() {
        return this.runId;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final float getAccuracyM() {
        return this.accuracyM;
    }

    public final Double getEleM() {
        return this.eleM;
    }

    public final double getDistanceFromPrevM() {
        return this.distanceFromPrevM;
    }
}
