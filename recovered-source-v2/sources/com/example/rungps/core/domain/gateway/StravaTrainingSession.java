package com.example.rungps.core.domain.gateway;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseTrackerGateway.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "", "startMs", "", "distanceM", "", TrackingService.EXTRA_ACTIVITY_TYPE, "", "stravaId", "<init>", "(JDLjava/lang/String;Ljava/lang/Long;)V", "getStartMs", "()J", "getDistanceM", "()D", "getActivityType", "()Ljava/lang/String;", "getStravaId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(JDLjava/lang/String;Ljava/lang/Long;)Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StravaTrainingSession {
    private final String activityType;
    private final double distanceM;
    private final long startMs;
    private final Long stravaId;

    public static /* synthetic */ StravaTrainingSession copy$default(StravaTrainingSession stravaTrainingSession, long j, double d, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = stravaTrainingSession.startMs;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = stravaTrainingSession.distanceM;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str = stravaTrainingSession.activityType;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            l = stravaTrainingSession.stravaId;
        }
        return stravaTrainingSession.copy(j2, d2, str2, l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartMs() {
        return this.startMs;
    }

    /* renamed from: component2, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getStravaId() {
        return this.stravaId;
    }

    public final StravaTrainingSession copy(long startMs, double distanceM, String activityType, Long stravaId) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        return new StravaTrainingSession(startMs, distanceM, activityType, stravaId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaTrainingSession)) {
            return false;
        }
        StravaTrainingSession stravaTrainingSession = (StravaTrainingSession) other;
        return this.startMs == stravaTrainingSession.startMs && Double.compare(this.distanceM, stravaTrainingSession.distanceM) == 0 && Intrinsics.areEqual(this.activityType, stravaTrainingSession.activityType) && Intrinsics.areEqual(this.stravaId, stravaTrainingSession.stravaId);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.startMs) * 31) + Double.hashCode(this.distanceM)) * 31) + this.activityType.hashCode()) * 31;
        Long l = this.stravaId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "StravaTrainingSession(startMs=" + this.startMs + ", distanceM=" + this.distanceM + ", activityType=" + this.activityType + ", stravaId=" + this.stravaId + ")";
    }

    public StravaTrainingSession(long j, double d, String activityType, Long l) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        this.startMs = j;
        this.distanceM = d;
        this.activityType = activityType;
        this.stravaId = l;
    }

    public /* synthetic */ StravaTrainingSession(long j, double d, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, d, str, (i & 8) != 0 ? null : l);
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public final double getDistanceM() {
        return this.distanceM;
    }

    public final String getActivityType() {
        return this.activityType;
    }

    public final Long getStravaId() {
        return this.stravaId;
    }
}
