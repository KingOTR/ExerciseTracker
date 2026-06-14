package com.example.rungps.ble.moyoung;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.ble.moyoung.MoyoungHrParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MoyoungWorkout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jp\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0006HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u00066"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "", "startTimeMs", "", "endTimeMs", "activeSeconds", "", "sportType", "avgHeartRate", "steps", "distanceM", "calories", "hrSeries", "", "Lcom/example/rungps/ble/moyoung/MoyoungHrParser$HrPoint;", "<init>", "(JJIILjava/lang/Integer;IIILjava/util/List;)V", "getStartTimeMs", "()J", "getEndTimeMs", "getActiveSeconds", "()I", "getSportType", "getAvgHeartRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSteps", "getDistanceM", "getCalories", "getHrSeries", "()Ljava/util/List;", "durationMin", "getDurationMin", "isSoccerLike", "", "()Z", "dedupeId", "getDedupeId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJIILjava/lang/Integer;IIILjava/util/List;)Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoyoungWorkout {
    public static final int $stable = 8;
    private final int activeSeconds;
    private final Integer avgHeartRate;
    private final int calories;
    private final int distanceM;
    private final long endTimeMs;
    private final List<MoyoungHrParser.HrPoint> hrSeries;
    private final int sportType;
    private final long startTimeMs;
    private final int steps;

    /* renamed from: component1, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final int getActiveSeconds() {
        return this.activeSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    public final List<MoyoungHrParser.HrPoint> component9() {
        return this.hrSeries;
    }

    public final MoyoungWorkout copy(long startTimeMs, long endTimeMs, int activeSeconds, int sportType, Integer avgHeartRate, int steps, int distanceM, int calories, List<MoyoungHrParser.HrPoint> hrSeries) {
        Intrinsics.checkNotNullParameter(hrSeries, "hrSeries");
        return new MoyoungWorkout(startTimeMs, endTimeMs, activeSeconds, sportType, avgHeartRate, steps, distanceM, calories, hrSeries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoyoungWorkout)) {
            return false;
        }
        MoyoungWorkout moyoungWorkout = (MoyoungWorkout) other;
        return this.startTimeMs == moyoungWorkout.startTimeMs && this.endTimeMs == moyoungWorkout.endTimeMs && this.activeSeconds == moyoungWorkout.activeSeconds && this.sportType == moyoungWorkout.sportType && Intrinsics.areEqual(this.avgHeartRate, moyoungWorkout.avgHeartRate) && this.steps == moyoungWorkout.steps && this.distanceM == moyoungWorkout.distanceM && this.calories == moyoungWorkout.calories && Intrinsics.areEqual(this.hrSeries, moyoungWorkout.hrSeries);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.startTimeMs) * 31) + Long.hashCode(this.endTimeMs)) * 31) + Integer.hashCode(this.activeSeconds)) * 31) + Integer.hashCode(this.sportType)) * 31;
        Integer num = this.avgHeartRate;
        return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.steps)) * 31) + Integer.hashCode(this.distanceM)) * 31) + Integer.hashCode(this.calories)) * 31) + this.hrSeries.hashCode();
    }

    public String toString() {
        return "MoyoungWorkout(startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + ", activeSeconds=" + this.activeSeconds + ", sportType=" + this.sportType + ", avgHeartRate=" + this.avgHeartRate + ", steps=" + this.steps + ", distanceM=" + this.distanceM + ", calories=" + this.calories + ", hrSeries=" + this.hrSeries + ")";
    }

    public MoyoungWorkout(long j, long j2, int i, int i2, Integer num, int i3, int i4, int i5, List<MoyoungHrParser.HrPoint> hrSeries) {
        Intrinsics.checkNotNullParameter(hrSeries, "hrSeries");
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.activeSeconds = i;
        this.sportType = i2;
        this.avgHeartRate = num;
        this.steps = i3;
        this.distanceM = i4;
        this.calories = i5;
        this.hrSeries = hrSeries;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final int getActiveSeconds() {
        return this.activeSeconds;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final Integer getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getDistanceM() {
        return this.distanceM;
    }

    public final int getCalories() {
        return this.calories;
    }

    public /* synthetic */ MoyoungWorkout(long j, long j2, int i, int i2, Integer num, int i3, int i4, int i5, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, num, i3, i4, i5, (i6 & 256) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<MoyoungHrParser.HrPoint> getHrSeries() {
        return this.hrSeries;
    }

    public final int getDurationMin() {
        return RangesKt.coerceAtLeast(this.activeSeconds / 60, 1);
    }

    public final boolean isSoccerLike() {
        int i = this.sportType;
        return i == 6 || i == 13 || i == 18;
    }

    public final long getDedupeId() {
        return (this.startTimeMs ^ this.endTimeMs) ^ (this.sportType * 1000003);
    }
}
