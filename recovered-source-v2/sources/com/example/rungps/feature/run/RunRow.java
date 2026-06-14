package com.example.rungps.feature.run;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0016¨\u00065"}, d2 = {"Lcom/example/rungps/feature/run/RunRow;", "", "id", "", "startedAtMs", "endedAtMs", "km", "", "durationMs", "steps", TrackingService.EXTRA_PLAN_TYPE, "", TrackingService.EXTRA_TIME_SESSION, TrackingService.EXTRA_ACTIVITY_TYPE, "title", "gearId", "<init>", "(JJLjava/lang/Long;DJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()J", "getStartedAtMs", "getEndedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKm", "()D", "getDurationMs", "getSteps", "getPlanType", "()Ljava/lang/String;", "getTimeSession", "getActivityType", "getTitle", "getGearId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JJLjava/lang/Long;DJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/example/rungps/feature/run/RunRow;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "run_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RunRow {
    private final String activityType;
    private final long durationMs;
    private final Long endedAtMs;
    private final Long gearId;
    private final long id;
    private final double km;
    private final String planType;
    private final long startedAtMs;
    private final long steps;
    private final String timeSession;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getGearId() {
        return this.gearId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getEndedAtMs() {
        return this.endedAtMs;
    }

    /* renamed from: component4, reason: from getter */
    public final double getKm() {
        return this.km;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPlanType() {
        return this.planType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTimeSession() {
        return this.timeSession;
    }

    /* renamed from: component9, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    public final RunRow copy(long id, long startedAtMs, Long endedAtMs, double km, long durationMs, long steps, String planType, String timeSession, String activityType, String title, Long gearId) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        return new RunRow(id, startedAtMs, endedAtMs, km, durationMs, steps, planType, timeSession, activityType, title, gearId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunRow)) {
            return false;
        }
        RunRow runRow = (RunRow) other;
        return this.id == runRow.id && this.startedAtMs == runRow.startedAtMs && Intrinsics.areEqual(this.endedAtMs, runRow.endedAtMs) && Double.compare(this.km, runRow.km) == 0 && this.durationMs == runRow.durationMs && this.steps == runRow.steps && Intrinsics.areEqual(this.planType, runRow.planType) && Intrinsics.areEqual(this.timeSession, runRow.timeSession) && Intrinsics.areEqual(this.activityType, runRow.activityType) && Intrinsics.areEqual(this.title, runRow.title) && Intrinsics.areEqual(this.gearId, runRow.gearId);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.startedAtMs)) * 31;
        Long l = this.endedAtMs;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Double.hashCode(this.km)) * 31) + Long.hashCode(this.durationMs)) * 31) + Long.hashCode(this.steps)) * 31;
        String str = this.planType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeSession;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.activityType.hashCode()) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.gearId;
        return hashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "RunRow(id=" + this.id + ", startedAtMs=" + this.startedAtMs + ", endedAtMs=" + this.endedAtMs + ", km=" + this.km + ", durationMs=" + this.durationMs + ", steps=" + this.steps + ", planType=" + this.planType + ", timeSession=" + this.timeSession + ", activityType=" + this.activityType + ", title=" + this.title + ", gearId=" + this.gearId + ")";
    }

    public RunRow(long j, long j2, Long l, double d, long j3, long j4, String str, String str2, String activityType, String str3, Long l2) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        this.id = j;
        this.startedAtMs = j2;
        this.endedAtMs = l;
        this.km = d;
        this.durationMs = j3;
        this.steps = j4;
        this.planType = str;
        this.timeSession = str2;
        this.activityType = activityType;
        this.title = str3;
        this.gearId = l2;
    }

    public /* synthetic */ RunRow(long j, long j2, Long l, double d, long j3, long j4, String str, String str2, String str3, String str4, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, l, d, j3, j4, str, str2, str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : l2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final Long getEndedAtMs() {
        return this.endedAtMs;
    }

    public final double getKm() {
        return this.km;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final String getPlanType() {
        return this.planType;
    }

    public final String getTimeSession() {
        return this.timeSession;
    }

    public final String getActivityType() {
        return this.activityType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getGearId() {
        return this.gearId;
    }
}
