package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013¨\u0006("}, d2 = {"Lcom/example/rungps/data/RemoteGymSetRow;", "", "exerciseName", "", "setIndex", "", "reps", "weightKg", "", "loggedAtMs", "", "rpeBorg", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;DLjava/lang/Long;Ljava/lang/Integer;)V", "getExerciseName", "()Ljava/lang/String;", "getSetIndex", "()I", "getReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeightKg", "()D", "getLoggedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRpeBorg", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/Integer;DLjava/lang/Long;Ljava/lang/Integer;)Lcom/example/rungps/data/RemoteGymSetRow;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RemoteGymSetRow {
    public static final int $stable = 0;
    private final String exerciseName;
    private final Long loggedAtMs;
    private final Integer reps;
    private final Integer rpeBorg;
    private final int setIndex;
    private final double weightKg;

    public static /* synthetic */ RemoteGymSetRow copy$default(RemoteGymSetRow remoteGymSetRow, String str, int i, Integer num, double d, Long l, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = remoteGymSetRow.exerciseName;
        }
        if ((i2 & 2) != 0) {
            i = remoteGymSetRow.setIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = remoteGymSetRow.reps;
        }
        Integer num3 = num;
        if ((i2 & 8) != 0) {
            d = remoteGymSetRow.weightKg;
        }
        double d2 = d;
        if ((i2 & 16) != 0) {
            l = remoteGymSetRow.loggedAtMs;
        }
        Long l2 = l;
        if ((i2 & 32) != 0) {
            num2 = remoteGymSetRow.rpeBorg;
        }
        return remoteGymSetRow.copy(str, i3, num3, d2, l2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSetIndex() {
        return this.setIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getReps() {
        return this.reps;
    }

    /* renamed from: component4, reason: from getter */
    public final double getWeightKg() {
        return this.weightKg;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getLoggedAtMs() {
        return this.loggedAtMs;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getRpeBorg() {
        return this.rpeBorg;
    }

    public final RemoteGymSetRow copy(String exerciseName, int setIndex, Integer reps, double weightKg, Long loggedAtMs, Integer rpeBorg) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return new RemoteGymSetRow(exerciseName, setIndex, reps, weightKg, loggedAtMs, rpeBorg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteGymSetRow)) {
            return false;
        }
        RemoteGymSetRow remoteGymSetRow = (RemoteGymSetRow) other;
        return Intrinsics.areEqual(this.exerciseName, remoteGymSetRow.exerciseName) && this.setIndex == remoteGymSetRow.setIndex && Intrinsics.areEqual(this.reps, remoteGymSetRow.reps) && Double.compare(this.weightKg, remoteGymSetRow.weightKg) == 0 && Intrinsics.areEqual(this.loggedAtMs, remoteGymSetRow.loggedAtMs) && Intrinsics.areEqual(this.rpeBorg, remoteGymSetRow.rpeBorg);
    }

    public int hashCode() {
        int hashCode = ((this.exerciseName.hashCode() * 31) + Integer.hashCode(this.setIndex)) * 31;
        Integer num = this.reps;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.weightKg)) * 31;
        Long l = this.loggedAtMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.rpeBorg;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "RemoteGymSetRow(exerciseName=" + this.exerciseName + ", setIndex=" + this.setIndex + ", reps=" + this.reps + ", weightKg=" + this.weightKg + ", loggedAtMs=" + this.loggedAtMs + ", rpeBorg=" + this.rpeBorg + ")";
    }

    public RemoteGymSetRow(String exerciseName, int i, Integer num, double d, Long l, Integer num2) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        this.exerciseName = exerciseName;
        this.setIndex = i;
        this.reps = num;
        this.weightKg = d;
        this.loggedAtMs = l;
        this.rpeBorg = num2;
    }

    public /* synthetic */ RemoteGymSetRow(String str, int i, Integer num, double d, Long l, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, num, d, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : num2);
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final int getSetIndex() {
        return this.setIndex;
    }

    public final Integer getReps() {
        return this.reps;
    }

    public final double getWeightKg() {
        return this.weightKg;
    }

    public final Long getLoggedAtMs() {
        return this.loggedAtMs;
    }

    public final Integer getRpeBorg() {
        return this.rpeBorg;
    }
}
