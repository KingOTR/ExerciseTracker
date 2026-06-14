package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/example/rungps/data/ExercisePr;", "", "exerciseName", "", "weightKg", "", "reps", "", "e1rm", "lastCompletedAtMs", "", "<init>", "(Ljava/lang/String;DLjava/lang/Integer;DLjava/lang/Long;)V", "getExerciseName", "()Ljava/lang/String;", "getWeightKg", "()D", "getReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getE1rm", "getLastCompletedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;DLjava/lang/Integer;DLjava/lang/Long;)Lcom/example/rungps/data/ExercisePr;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExercisePr {
    public static final int $stable = 0;
    private final double e1rm;
    private final String exerciseName;
    private final Long lastCompletedAtMs;
    private final Integer reps;
    private final double weightKg;

    public static /* synthetic */ ExercisePr copy$default(ExercisePr exercisePr, String str, double d, Integer num, double d2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exercisePr.exerciseName;
        }
        if ((i & 2) != 0) {
            d = exercisePr.weightKg;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            num = exercisePr.reps;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            d2 = exercisePr.e1rm;
        }
        double d4 = d2;
        if ((i & 16) != 0) {
            l = exercisePr.lastCompletedAtMs;
        }
        return exercisePr.copy(str, d3, num2, d4, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
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
    public final double getE1rm() {
        return this.e1rm;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getLastCompletedAtMs() {
        return this.lastCompletedAtMs;
    }

    public final ExercisePr copy(String exerciseName, double weightKg, Integer reps, double e1rm, Long lastCompletedAtMs) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return new ExercisePr(exerciseName, weightKg, reps, e1rm, lastCompletedAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExercisePr)) {
            return false;
        }
        ExercisePr exercisePr = (ExercisePr) other;
        return Intrinsics.areEqual(this.exerciseName, exercisePr.exerciseName) && Double.compare(this.weightKg, exercisePr.weightKg) == 0 && Intrinsics.areEqual(this.reps, exercisePr.reps) && Double.compare(this.e1rm, exercisePr.e1rm) == 0 && Intrinsics.areEqual(this.lastCompletedAtMs, exercisePr.lastCompletedAtMs);
    }

    public int hashCode() {
        int hashCode = ((this.exerciseName.hashCode() * 31) + Double.hashCode(this.weightKg)) * 31;
        Integer num = this.reps;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.e1rm)) * 31;
        Long l = this.lastCompletedAtMs;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "ExercisePr(exerciseName=" + this.exerciseName + ", weightKg=" + this.weightKg + ", reps=" + this.reps + ", e1rm=" + this.e1rm + ", lastCompletedAtMs=" + this.lastCompletedAtMs + ")";
    }

    public ExercisePr(String exerciseName, double d, Integer num, double d2, Long l) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        this.exerciseName = exerciseName;
        this.weightKg = d;
        this.reps = num;
        this.e1rm = d2;
        this.lastCompletedAtMs = l;
    }

    public /* synthetic */ ExercisePr(String str, double d, Integer num, double d2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, num, d2, (i & 16) != 0 ? null : l);
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final double getWeightKg() {
        return this.weightKg;
    }

    public final Integer getReps() {
        return this.reps;
    }

    public final double getE1rm() {
        return this.e1rm;
    }

    public final Long getLastCompletedAtMs() {
        return this.lastCompletedAtMs;
    }
}
