package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkoutEngine.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010!\u001a\u00020\u000bHÆ\u0003JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/example/rungps/intervals/WorkoutProgress;", "", "segmentIndex", "", "segmentElapsedMs", "", "segmentRemainingMs", "segmentDistanceM", "", "segmentRemainingM", "finished", "", "<init>", "(IJLjava/lang/Long;DLjava/lang/Double;Z)V", "getSegmentIndex", "()I", "getSegmentElapsedMs", "()J", "getSegmentRemainingMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSegmentDistanceM", "()D", "getSegmentRemainingM", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFinished", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IJLjava/lang/Long;DLjava/lang/Double;Z)Lcom/example/rungps/intervals/WorkoutProgress;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WorkoutProgress {
    public static final int $stable = 0;
    private final boolean finished;
    private final double segmentDistanceM;
    private final long segmentElapsedMs;
    private final int segmentIndex;
    private final Double segmentRemainingM;
    private final Long segmentRemainingMs;

    /* renamed from: component1, reason: from getter */
    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSegmentElapsedMs() {
        return this.segmentElapsedMs;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSegmentRemainingMs() {
        return this.segmentRemainingMs;
    }

    /* renamed from: component4, reason: from getter */
    public final double getSegmentDistanceM() {
        return this.segmentDistanceM;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getSegmentRemainingM() {
        return this.segmentRemainingM;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    public final WorkoutProgress copy(int segmentIndex, long segmentElapsedMs, Long segmentRemainingMs, double segmentDistanceM, Double segmentRemainingM, boolean finished) {
        return new WorkoutProgress(segmentIndex, segmentElapsedMs, segmentRemainingMs, segmentDistanceM, segmentRemainingM, finished);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutProgress)) {
            return false;
        }
        WorkoutProgress workoutProgress = (WorkoutProgress) other;
        return this.segmentIndex == workoutProgress.segmentIndex && this.segmentElapsedMs == workoutProgress.segmentElapsedMs && Intrinsics.areEqual(this.segmentRemainingMs, workoutProgress.segmentRemainingMs) && Double.compare(this.segmentDistanceM, workoutProgress.segmentDistanceM) == 0 && Intrinsics.areEqual((Object) this.segmentRemainingM, (Object) workoutProgress.segmentRemainingM) && this.finished == workoutProgress.finished;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.segmentIndex) * 31) + Long.hashCode(this.segmentElapsedMs)) * 31;
        Long l = this.segmentRemainingMs;
        int hashCode2 = (((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Double.hashCode(this.segmentDistanceM)) * 31;
        Double d = this.segmentRemainingM;
        return ((hashCode2 + (d != null ? d.hashCode() : 0)) * 31) + Boolean.hashCode(this.finished);
    }

    public String toString() {
        return "WorkoutProgress(segmentIndex=" + this.segmentIndex + ", segmentElapsedMs=" + this.segmentElapsedMs + ", segmentRemainingMs=" + this.segmentRemainingMs + ", segmentDistanceM=" + this.segmentDistanceM + ", segmentRemainingM=" + this.segmentRemainingM + ", finished=" + this.finished + ")";
    }

    public WorkoutProgress(int i, long j, Long l, double d, Double d2, boolean z) {
        this.segmentIndex = i;
        this.segmentElapsedMs = j;
        this.segmentRemainingMs = l;
        this.segmentDistanceM = d;
        this.segmentRemainingM = d2;
        this.finished = z;
    }

    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    public final long getSegmentElapsedMs() {
        return this.segmentElapsedMs;
    }

    public final Long getSegmentRemainingMs() {
        return this.segmentRemainingMs;
    }

    public final double getSegmentDistanceM() {
        return this.segmentDistanceM;
    }

    public final Double getSegmentRemainingM() {
        return this.segmentRemainingM;
    }

    public final boolean getFinished() {
        return this.finished;
    }
}
