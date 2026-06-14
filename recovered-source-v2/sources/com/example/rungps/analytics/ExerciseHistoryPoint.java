package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseHistory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006&"}, d2 = {"Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "", "sessionStartedAtMs", "", "weightKg", "", "reps", "", "bestReps", "setsDone", "e1rm", "<init>", "(JDLjava/lang/Integer;IID)V", "getSessionStartedAtMs", "()J", "getWeightKg", "()D", "getReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBestReps", "()I", "getSetsDone", "getE1rm", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JDLjava/lang/Integer;IID)Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExerciseHistoryPoint {
    public static final int $stable = 0;
    private final int bestReps;
    private final double e1rm;
    private final Integer reps;
    private final long sessionStartedAtMs;
    private final int setsDone;
    private final double weightKg;

    /* renamed from: component1, reason: from getter */
    public final long getSessionStartedAtMs() {
        return this.sessionStartedAtMs;
    }

    /* renamed from: component2, reason: from getter */
    public final double getWeightKg() {
        return this.weightKg;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getReps() {
        return this.reps;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBestReps() {
        return this.bestReps;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSetsDone() {
        return this.setsDone;
    }

    /* renamed from: component6, reason: from getter */
    public final double getE1rm() {
        return this.e1rm;
    }

    public final ExerciseHistoryPoint copy(long sessionStartedAtMs, double weightKg, Integer reps, int bestReps, int setsDone, double e1rm) {
        return new ExerciseHistoryPoint(sessionStartedAtMs, weightKg, reps, bestReps, setsDone, e1rm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseHistoryPoint)) {
            return false;
        }
        ExerciseHistoryPoint exerciseHistoryPoint = (ExerciseHistoryPoint) other;
        return this.sessionStartedAtMs == exerciseHistoryPoint.sessionStartedAtMs && Double.compare(this.weightKg, exerciseHistoryPoint.weightKg) == 0 && Intrinsics.areEqual(this.reps, exerciseHistoryPoint.reps) && this.bestReps == exerciseHistoryPoint.bestReps && this.setsDone == exerciseHistoryPoint.setsDone && Double.compare(this.e1rm, exerciseHistoryPoint.e1rm) == 0;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.sessionStartedAtMs) * 31) + Double.hashCode(this.weightKg)) * 31;
        Integer num = this.reps;
        return ((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.bestReps)) * 31) + Integer.hashCode(this.setsDone)) * 31) + Double.hashCode(this.e1rm);
    }

    public String toString() {
        return "ExerciseHistoryPoint(sessionStartedAtMs=" + this.sessionStartedAtMs + ", weightKg=" + this.weightKg + ", reps=" + this.reps + ", bestReps=" + this.bestReps + ", setsDone=" + this.setsDone + ", e1rm=" + this.e1rm + ")";
    }

    public ExerciseHistoryPoint(long j, double d, Integer num, int i, int i2, double d2) {
        this.sessionStartedAtMs = j;
        this.weightKg = d;
        this.reps = num;
        this.bestReps = i;
        this.setsDone = i2;
        this.e1rm = d2;
    }

    public final long getSessionStartedAtMs() {
        return this.sessionStartedAtMs;
    }

    public final double getWeightKg() {
        return this.weightKg;
    }

    public final Integer getReps() {
        return this.reps;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExerciseHistoryPoint(long j, double d, Integer num, int i, int i2, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, d, num, r8, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? 0.0d : d2);
        int i4;
        if ((i3 & 8) != 0) {
            i4 = num != null ? num.intValue() : 0;
        } else {
            i4 = i;
        }
    }

    public final int getBestReps() {
        return this.bestReps;
    }

    public final int getSetsDone() {
        return this.setsDone;
    }

    public final double getE1rm() {
        return this.e1rm;
    }
}
