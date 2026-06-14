package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymGoalsStore.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/example/rungps/training/GymGoal;", "", "exerciseName", "", "targetWeightKg", "", "targetReps", "", "deadlineMs", "", "<init>", "(Ljava/lang/String;DILjava/lang/Long;)V", "getExerciseName", "()Ljava/lang/String;", "getTargetWeightKg", "()D", "getTargetReps", "()I", "getDeadlineMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;DILjava/lang/Long;)Lcom/example/rungps/training/GymGoal;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymGoal {
    public static final int $stable = 0;
    private final Long deadlineMs;
    private final String exerciseName;
    private final int targetReps;
    private final double targetWeightKg;

    public static /* synthetic */ GymGoal copy$default(GymGoal gymGoal, String str, double d, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gymGoal.exerciseName;
        }
        if ((i2 & 2) != 0) {
            d = gymGoal.targetWeightKg;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            i = gymGoal.targetReps;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            l = gymGoal.deadlineMs;
        }
        return gymGoal.copy(str, d2, i3, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTargetWeightKg() {
        return this.targetWeightKg;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTargetReps() {
        return this.targetReps;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getDeadlineMs() {
        return this.deadlineMs;
    }

    public final GymGoal copy(String exerciseName, double targetWeightKg, int targetReps, Long deadlineMs) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return new GymGoal(exerciseName, targetWeightKg, targetReps, deadlineMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymGoal)) {
            return false;
        }
        GymGoal gymGoal = (GymGoal) other;
        return Intrinsics.areEqual(this.exerciseName, gymGoal.exerciseName) && Double.compare(this.targetWeightKg, gymGoal.targetWeightKg) == 0 && this.targetReps == gymGoal.targetReps && Intrinsics.areEqual(this.deadlineMs, gymGoal.deadlineMs);
    }

    public int hashCode() {
        int hashCode = ((((this.exerciseName.hashCode() * 31) + Double.hashCode(this.targetWeightKg)) * 31) + Integer.hashCode(this.targetReps)) * 31;
        Long l = this.deadlineMs;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "GymGoal(exerciseName=" + this.exerciseName + ", targetWeightKg=" + this.targetWeightKg + ", targetReps=" + this.targetReps + ", deadlineMs=" + this.deadlineMs + ")";
    }

    public GymGoal(String exerciseName, double d, int i, Long l) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        this.exerciseName = exerciseName;
        this.targetWeightKg = d;
        this.targetReps = i;
        this.deadlineMs = l;
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final double getTargetWeightKg() {
        return this.targetWeightKg;
    }

    public final int getTargetReps() {
        return this.targetReps;
    }

    public final Long getDeadlineMs() {
        return this.deadlineMs;
    }
}
