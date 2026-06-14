package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymDao.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/data/GymDayExerciseSpec;", "", "dayName", "", "orderIdx", "", "exerciseNames", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getDayName", "()Ljava/lang/String;", "getOrderIdx", "()I", "getExerciseNames", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymDayExerciseSpec {
    public static final int $stable = 8;
    private final String dayName;
    private final List<String> exerciseNames;
    private final int orderIdx;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GymDayExerciseSpec copy$default(GymDayExerciseSpec gymDayExerciseSpec, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gymDayExerciseSpec.dayName;
        }
        if ((i2 & 2) != 0) {
            i = gymDayExerciseSpec.orderIdx;
        }
        if ((i2 & 4) != 0) {
            list = gymDayExerciseSpec.exerciseNames;
        }
        return gymDayExerciseSpec.copy(str, i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDayName() {
        return this.dayName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrderIdx() {
        return this.orderIdx;
    }

    public final List<String> component3() {
        return this.exerciseNames;
    }

    public final GymDayExerciseSpec copy(String dayName, int orderIdx, List<String> exerciseNames) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        Intrinsics.checkNotNullParameter(exerciseNames, "exerciseNames");
        return new GymDayExerciseSpec(dayName, orderIdx, exerciseNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymDayExerciseSpec)) {
            return false;
        }
        GymDayExerciseSpec gymDayExerciseSpec = (GymDayExerciseSpec) other;
        return Intrinsics.areEqual(this.dayName, gymDayExerciseSpec.dayName) && this.orderIdx == gymDayExerciseSpec.orderIdx && Intrinsics.areEqual(this.exerciseNames, gymDayExerciseSpec.exerciseNames);
    }

    public int hashCode() {
        return (((this.dayName.hashCode() * 31) + Integer.hashCode(this.orderIdx)) * 31) + this.exerciseNames.hashCode();
    }

    public String toString() {
        return "GymDayExerciseSpec(dayName=" + this.dayName + ", orderIdx=" + this.orderIdx + ", exerciseNames=" + this.exerciseNames + ")";
    }

    public GymDayExerciseSpec(String dayName, int i, List<String> exerciseNames) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        Intrinsics.checkNotNullParameter(exerciseNames, "exerciseNames");
        this.dayName = dayName;
        this.orderIdx = i;
        this.exerciseNames = exerciseNames;
    }

    public final String getDayName() {
        return this.dayName;
    }

    public final int getOrderIdx() {
        return this.orderIdx;
    }

    public final List<String> getExerciseNames() {
        return this.exerciseNames;
    }
}
