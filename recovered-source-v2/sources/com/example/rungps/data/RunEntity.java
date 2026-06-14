package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ¶\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001a¨\u0006A"}, d2 = {"Lcom/example/rungps/data/RunEntity;", "", "id", "", "startedAtMs", "endedAtMs", "totalDistanceM", "", "totalDurationMs", "totalSteps", TrackingService.EXTRA_PLAN_TYPE, "", TrackingService.EXTRA_TIME_SESSION, TrackingService.EXTRA_ACTIVITY_TYPE, "watchImportId", "stravaImportId", "title", "description", "privateNotes", "gearId", "<init>", "(JJLjava/lang/Long;DJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()J", "getStartedAtMs", "getEndedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalDistanceM", "()D", "getTotalDurationMs", "getTotalSteps", "getPlanType", "()Ljava/lang/String;", "getTimeSession", "getActivityType", "getWatchImportId", "getStravaImportId", "getTitle", "getDescription", "getPrivateNotes", "getGearId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(JJLjava/lang/Long;DJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/example/rungps/data/RunEntity;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RunEntity {
    private final String activityType;
    private final String description;
    private final Long endedAtMs;
    private final Long gearId;
    private final long id;
    private final String planType;
    private final String privateNotes;
    private final long startedAtMs;
    private final Long stravaImportId;
    private final String timeSession;
    private final String title;
    private final double totalDistanceM;
    private final long totalDurationMs;
    private final long totalSteps;
    private final Long watchImportId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getWatchImportId() {
        return this.watchImportId;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getStravaImportId() {
        return this.stravaImportId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component14, reason: from getter */
    public final String getPrivateNotes() {
        return this.privateNotes;
    }

    /* renamed from: component15, reason: from getter */
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
    public final double getTotalDistanceM() {
        return this.totalDistanceM;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalDurationMs() {
        return this.totalDurationMs;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTotalSteps() {
        return this.totalSteps;
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

    public final RunEntity copy(long id, long startedAtMs, Long endedAtMs, double totalDistanceM, long totalDurationMs, long totalSteps, String planType, String timeSession, String activityType, Long watchImportId, Long stravaImportId, String title, String description, String privateNotes, Long gearId) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        return new RunEntity(id, startedAtMs, endedAtMs, totalDistanceM, totalDurationMs, totalSteps, planType, timeSession, activityType, watchImportId, stravaImportId, title, description, privateNotes, gearId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunEntity)) {
            return false;
        }
        RunEntity runEntity = (RunEntity) other;
        return this.id == runEntity.id && this.startedAtMs == runEntity.startedAtMs && Intrinsics.areEqual(this.endedAtMs, runEntity.endedAtMs) && Double.compare(this.totalDistanceM, runEntity.totalDistanceM) == 0 && this.totalDurationMs == runEntity.totalDurationMs && this.totalSteps == runEntity.totalSteps && Intrinsics.areEqual(this.planType, runEntity.planType) && Intrinsics.areEqual(this.timeSession, runEntity.timeSession) && Intrinsics.areEqual(this.activityType, runEntity.activityType) && Intrinsics.areEqual(this.watchImportId, runEntity.watchImportId) && Intrinsics.areEqual(this.stravaImportId, runEntity.stravaImportId) && Intrinsics.areEqual(this.title, runEntity.title) && Intrinsics.areEqual(this.description, runEntity.description) && Intrinsics.areEqual(this.privateNotes, runEntity.privateNotes) && Intrinsics.areEqual(this.gearId, runEntity.gearId);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.startedAtMs)) * 31;
        Long l = this.endedAtMs;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Double.hashCode(this.totalDistanceM)) * 31) + Long.hashCode(this.totalDurationMs)) * 31) + Long.hashCode(this.totalSteps)) * 31;
        String str = this.planType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeSession;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.activityType.hashCode()) * 31;
        Long l2 = this.watchImportId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.stravaImportId;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.title;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.privateNotes;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l4 = this.gearId;
        return hashCode9 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        return "RunEntity(id=" + this.id + ", startedAtMs=" + this.startedAtMs + ", endedAtMs=" + this.endedAtMs + ", totalDistanceM=" + this.totalDistanceM + ", totalDurationMs=" + this.totalDurationMs + ", totalSteps=" + this.totalSteps + ", planType=" + this.planType + ", timeSession=" + this.timeSession + ", activityType=" + this.activityType + ", watchImportId=" + this.watchImportId + ", stravaImportId=" + this.stravaImportId + ", title=" + this.title + ", description=" + this.description + ", privateNotes=" + this.privateNotes + ", gearId=" + this.gearId + ")";
    }

    public RunEntity(long j, long j2, Long l, double d, long j3, long j4, String str, String str2, String activityType, Long l2, Long l3, String str3, String str4, String str5, Long l4) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        this.id = j;
        this.startedAtMs = j2;
        this.endedAtMs = l;
        this.totalDistanceM = d;
        this.totalDurationMs = j3;
        this.totalSteps = j4;
        this.planType = str;
        this.timeSession = str2;
        this.activityType = activityType;
        this.watchImportId = l2;
        this.stravaImportId = l3;
        this.title = str3;
        this.description = str4;
        this.privateNotes = str5;
        this.gearId = l4;
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

    public final double getTotalDistanceM() {
        return this.totalDistanceM;
    }

    public final long getTotalDurationMs() {
        return this.totalDurationMs;
    }

    public final long getTotalSteps() {
        return this.totalSteps;
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

    public /* synthetic */ RunEntity(long j, long j2, Long l, double d, long j3, long j4, String str, String str2, String str3, Long l2, Long l3, String str4, String str5, String str6, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? 0L : j4, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? "RUN" : str3, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : l4);
    }

    public final Long getWatchImportId() {
        return this.watchImportId;
    }

    public final Long getStravaImportId() {
        return this.stravaImportId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrivateNotes() {
        return this.privateNotes;
    }

    public final Long getGearId() {
        return this.gearId;
    }
}
