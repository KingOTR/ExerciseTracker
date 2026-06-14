package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/example/rungps/data/RoutePointEntity;", "", "id", "", "routeId", "idx", "", "lat", "", "lon", "<init>", "(JJIDD)V", "getId", "()J", "getRouteId", "getIdx", "()I", "getLat", "()D", "getLon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoutePointEntity {
    private final long id;
    private final int idx;
    private final double lat;
    private final double lon;
    private final long routeId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRouteId() {
        return this.routeId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIdx() {
        return this.idx;
    }

    /* renamed from: component4, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: component5, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    public final RoutePointEntity copy(long id, long routeId, int idx, double lat, double lon) {
        return new RoutePointEntity(id, routeId, idx, lat, lon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePointEntity)) {
            return false;
        }
        RoutePointEntity routePointEntity = (RoutePointEntity) other;
        return this.id == routePointEntity.id && this.routeId == routePointEntity.routeId && this.idx == routePointEntity.idx && Double.compare(this.lat, routePointEntity.lat) == 0 && Double.compare(this.lon, routePointEntity.lon) == 0;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.routeId)) * 31) + Integer.hashCode(this.idx)) * 31) + Double.hashCode(this.lat)) * 31) + Double.hashCode(this.lon);
    }

    public String toString() {
        return "RoutePointEntity(id=" + this.id + ", routeId=" + this.routeId + ", idx=" + this.idx + ", lat=" + this.lat + ", lon=" + this.lon + ")";
    }

    public RoutePointEntity(long j, long j2, int i, double d, double d2) {
        this.id = j;
        this.routeId = j2;
        this.idx = i;
        this.lat = d;
        this.lon = d2;
    }

    public /* synthetic */ RoutePointEntity(long j, long j2, int i, double d, double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, i, d, d2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getRouteId() {
        return this.routeId;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }
}
