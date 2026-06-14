package com.example.rungps.notify;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppAlerts.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/notify/PrAlert;", "", "exerciseName", "", "weightKg", "", "reps", "", "e1rm", "<init>", "(Ljava/lang/String;DLjava/lang/Integer;D)V", "getExerciseName", "()Ljava/lang/String;", "getWeightKg", "()D", "getReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getE1rm", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;DLjava/lang/Integer;D)Lcom/example/rungps/notify/PrAlert;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrAlert {
    public static final int $stable = 0;
    private final double e1rm;
    private final String exerciseName;
    private final Integer reps;
    private final double weightKg;

    public static /* synthetic */ PrAlert copy$default(PrAlert prAlert, String str, double d, Integer num, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prAlert.exerciseName;
        }
        if ((i & 2) != 0) {
            d = prAlert.weightKg;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            num = prAlert.reps;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            d2 = prAlert.e1rm;
        }
        return prAlert.copy(str, d3, num2, d2);
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

    public final PrAlert copy(String exerciseName, double weightKg, Integer reps, double e1rm) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return new PrAlert(exerciseName, weightKg, reps, e1rm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrAlert)) {
            return false;
        }
        PrAlert prAlert = (PrAlert) other;
        return Intrinsics.areEqual(this.exerciseName, prAlert.exerciseName) && Double.compare(this.weightKg, prAlert.weightKg) == 0 && Intrinsics.areEqual(this.reps, prAlert.reps) && Double.compare(this.e1rm, prAlert.e1rm) == 0;
    }

    public int hashCode() {
        int hashCode = ((this.exerciseName.hashCode() * 31) + Double.hashCode(this.weightKg)) * 31;
        Integer num = this.reps;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.e1rm);
    }

    public String toString() {
        return "PrAlert(exerciseName=" + this.exerciseName + ", weightKg=" + this.weightKg + ", reps=" + this.reps + ", e1rm=" + this.e1rm + ")";
    }

    public PrAlert(String exerciseName, double d, Integer num, double d2) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        this.exerciseName = exerciseName;
        this.weightKg = d;
        this.reps = num;
        this.e1rm = d2;
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
}
