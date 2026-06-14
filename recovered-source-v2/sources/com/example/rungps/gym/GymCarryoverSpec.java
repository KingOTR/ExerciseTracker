package com.example.rungps.gym;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymCarryover.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/gym/GymCarryoverSpec;", "", "exerciseName", "", "owedSetIndices", "", "", "fromSessionId", "", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "getExerciseName", "()Ljava/lang/String;", "getOwedSetIndices", "()Ljava/util/List;", "getFromSessionId", "()J", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymCarryoverSpec {
    public static final int $stable = 8;
    private final String exerciseName;
    private final long fromSessionId;
    private final List<Integer> owedSetIndices;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GymCarryoverSpec copy$default(GymCarryoverSpec gymCarryoverSpec, String str, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gymCarryoverSpec.exerciseName;
        }
        if ((i & 2) != 0) {
            list = gymCarryoverSpec.owedSetIndices;
        }
        if ((i & 4) != 0) {
            j = gymCarryoverSpec.fromSessionId;
        }
        return gymCarryoverSpec.copy(str, list, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final List<Integer> component2() {
        return this.owedSetIndices;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFromSessionId() {
        return this.fromSessionId;
    }

    public final GymCarryoverSpec copy(String exerciseName, List<Integer> owedSetIndices, long fromSessionId) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(owedSetIndices, "owedSetIndices");
        return new GymCarryoverSpec(exerciseName, owedSetIndices, fromSessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymCarryoverSpec)) {
            return false;
        }
        GymCarryoverSpec gymCarryoverSpec = (GymCarryoverSpec) other;
        return Intrinsics.areEqual(this.exerciseName, gymCarryoverSpec.exerciseName) && Intrinsics.areEqual(this.owedSetIndices, gymCarryoverSpec.owedSetIndices) && this.fromSessionId == gymCarryoverSpec.fromSessionId;
    }

    public int hashCode() {
        return (((this.exerciseName.hashCode() * 31) + this.owedSetIndices.hashCode()) * 31) + Long.hashCode(this.fromSessionId);
    }

    public String toString() {
        return "GymCarryoverSpec(exerciseName=" + this.exerciseName + ", owedSetIndices=" + this.owedSetIndices + ", fromSessionId=" + this.fromSessionId + ")";
    }

    public GymCarryoverSpec(String exerciseName, List<Integer> owedSetIndices, long j) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(owedSetIndices, "owedSetIndices");
        this.exerciseName = exerciseName;
        this.owedSetIndices = owedSetIndices;
        this.fromSessionId = j;
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final List<Integer> getOwedSetIndices() {
        return this.owedSetIndices;
    }

    public final long getFromSessionId() {
        return this.fromSessionId;
    }
}
