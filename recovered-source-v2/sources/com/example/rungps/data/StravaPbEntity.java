package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006)"}, d2 = {"Lcom/example/rungps/data/StravaPbEntity;", "", "activityKind", "", "distanceKey", "targetDistanceM", "", "bestMovingTimeSec", "", "activityId", "activityName", "startDate", "syncedAtMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;DJJLjava/lang/String;Ljava/lang/String;J)V", "getActivityKind", "()Ljava/lang/String;", "getDistanceKey", "getTargetDistanceM", "()D", "getBestMovingTimeSec", "()J", "getActivityId", "getActivityName", "getStartDate", "getSyncedAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StravaPbEntity {
    private final long activityId;
    private final String activityKind;
    private final String activityName;
    private final long bestMovingTimeSec;
    private final String distanceKey;
    private final String startDate;
    private final long syncedAtMs;
    private final double targetDistanceM;

    /* renamed from: component1, reason: from getter */
    public final String getActivityKind() {
        return this.activityKind;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDistanceKey() {
        return this.distanceKey;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTargetDistanceM() {
        return this.targetDistanceM;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBestMovingTimeSec() {
        return this.bestMovingTimeSec;
    }

    /* renamed from: component5, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component8, reason: from getter */
    public final long getSyncedAtMs() {
        return this.syncedAtMs;
    }

    public final StravaPbEntity copy(String activityKind, String distanceKey, double targetDistanceM, long bestMovingTimeSec, long activityId, String activityName, String startDate, long syncedAtMs) {
        Intrinsics.checkNotNullParameter(activityKind, "activityKind");
        Intrinsics.checkNotNullParameter(distanceKey, "distanceKey");
        return new StravaPbEntity(activityKind, distanceKey, targetDistanceM, bestMovingTimeSec, activityId, activityName, startDate, syncedAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaPbEntity)) {
            return false;
        }
        StravaPbEntity stravaPbEntity = (StravaPbEntity) other;
        return Intrinsics.areEqual(this.activityKind, stravaPbEntity.activityKind) && Intrinsics.areEqual(this.distanceKey, stravaPbEntity.distanceKey) && Double.compare(this.targetDistanceM, stravaPbEntity.targetDistanceM) == 0 && this.bestMovingTimeSec == stravaPbEntity.bestMovingTimeSec && this.activityId == stravaPbEntity.activityId && Intrinsics.areEqual(this.activityName, stravaPbEntity.activityName) && Intrinsics.areEqual(this.startDate, stravaPbEntity.startDate) && this.syncedAtMs == stravaPbEntity.syncedAtMs;
    }

    public int hashCode() {
        int hashCode = ((((((((this.activityKind.hashCode() * 31) + this.distanceKey.hashCode()) * 31) + Double.hashCode(this.targetDistanceM)) * 31) + Long.hashCode(this.bestMovingTimeSec)) * 31) + Long.hashCode(this.activityId)) * 31;
        String str = this.activityName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startDate;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.syncedAtMs);
    }

    public String toString() {
        return "StravaPbEntity(activityKind=" + this.activityKind + ", distanceKey=" + this.distanceKey + ", targetDistanceM=" + this.targetDistanceM + ", bestMovingTimeSec=" + this.bestMovingTimeSec + ", activityId=" + this.activityId + ", activityName=" + this.activityName + ", startDate=" + this.startDate + ", syncedAtMs=" + this.syncedAtMs + ")";
    }

    public StravaPbEntity(String activityKind, String distanceKey, double d, long j, long j2, String str, String str2, long j3) {
        Intrinsics.checkNotNullParameter(activityKind, "activityKind");
        Intrinsics.checkNotNullParameter(distanceKey, "distanceKey");
        this.activityKind = activityKind;
        this.distanceKey = distanceKey;
        this.targetDistanceM = d;
        this.bestMovingTimeSec = j;
        this.activityId = j2;
        this.activityName = str;
        this.startDate = str2;
        this.syncedAtMs = j3;
    }

    public /* synthetic */ StravaPbEntity(String str, String str2, double d, long j, long j2, String str3, String str4, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RUN" : str, str2, d, j, j2, str3, str4, j3);
    }

    public final String getActivityKind() {
        return this.activityKind;
    }

    public final String getDistanceKey() {
        return this.distanceKey;
    }

    public final double getTargetDistanceM() {
        return this.targetDistanceM;
    }

    public final long getBestMovingTimeSec() {
        return this.bestMovingTimeSec;
    }

    public final long getActivityId() {
        return this.activityId;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final long getSyncedAtMs() {
        return this.syncedAtMs;
    }
}
