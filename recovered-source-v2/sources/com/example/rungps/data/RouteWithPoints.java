package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouteDao.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/example/rungps/data/RouteWithPoints;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "createdAtMs", "distanceM", "", "points", "", "Lcom/example/rungps/data/RoutePointEntity;", "<init>", "(JLjava/lang/String;JDLjava/util/List;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getCreatedAtMs", "getDistanceM", "()D", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RouteWithPoints {
    public static final int $stable = 8;
    private final long createdAtMs;
    private final double distanceM;
    private final long id;
    private final String name;
    private final List<RoutePointEntity> points;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    public final List<RoutePointEntity> component5() {
        return this.points;
    }

    public final RouteWithPoints copy(long id, String name, long createdAtMs, double distanceM, List<RoutePointEntity> points) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(points, "points");
        return new RouteWithPoints(id, name, createdAtMs, distanceM, points);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteWithPoints)) {
            return false;
        }
        RouteWithPoints routeWithPoints = (RouteWithPoints) other;
        return this.id == routeWithPoints.id && Intrinsics.areEqual(this.name, routeWithPoints.name) && this.createdAtMs == routeWithPoints.createdAtMs && Double.compare(this.distanceM, routeWithPoints.distanceM) == 0 && Intrinsics.areEqual(this.points, routeWithPoints.points);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createdAtMs)) * 31) + Double.hashCode(this.distanceM)) * 31) + this.points.hashCode();
    }

    public String toString() {
        return "RouteWithPoints(id=" + this.id + ", name=" + this.name + ", createdAtMs=" + this.createdAtMs + ", distanceM=" + this.distanceM + ", points=" + this.points + ")";
    }

    public RouteWithPoints(long j, String name, long j2, double d, List<RoutePointEntity> points) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(points, "points");
        this.id = j;
        this.name = name;
        this.createdAtMs = j2;
        this.distanceM = d;
        this.points = points;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final double getDistanceM() {
        return this.distanceM;
    }

    public final List<RoutePointEntity> getPoints() {
        return this.points;
    }
}
