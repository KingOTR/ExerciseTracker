package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RegionRecentLoad.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/recovery/RegionRecentLoad;", "", "region", "", "tonnageKg", "", "exercises", "", "Lcom/example/rungps/recovery/RegionRecentLoad$ExerciseTonnageLine;", "<init>", "(Ljava/lang/String;DLjava/util/List;)V", "getRegion", "()Ljava/lang/String;", "getTonnageKg", "()D", "getExercises", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "ExerciseTonnageLine", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegionRecentLoad {
    public static final int $stable = 8;
    private final List<ExerciseTonnageLine> exercises;
    private final String region;
    private final double tonnageKg;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionRecentLoad copy$default(RegionRecentLoad regionRecentLoad, String str, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionRecentLoad.region;
        }
        if ((i & 2) != 0) {
            d = regionRecentLoad.tonnageKg;
        }
        if ((i & 4) != 0) {
            list = regionRecentLoad.exercises;
        }
        return regionRecentLoad.copy(str, d, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTonnageKg() {
        return this.tonnageKg;
    }

    public final List<ExerciseTonnageLine> component3() {
        return this.exercises;
    }

    public final RegionRecentLoad copy(String region, double tonnageKg, List<ExerciseTonnageLine> exercises) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(exercises, "exercises");
        return new RegionRecentLoad(region, tonnageKg, exercises);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionRecentLoad)) {
            return false;
        }
        RegionRecentLoad regionRecentLoad = (RegionRecentLoad) other;
        return Intrinsics.areEqual(this.region, regionRecentLoad.region) && Double.compare(this.tonnageKg, regionRecentLoad.tonnageKg) == 0 && Intrinsics.areEqual(this.exercises, regionRecentLoad.exercises);
    }

    public int hashCode() {
        return (((this.region.hashCode() * 31) + Double.hashCode(this.tonnageKg)) * 31) + this.exercises.hashCode();
    }

    public String toString() {
        return "RegionRecentLoad(region=" + this.region + ", tonnageKg=" + this.tonnageKg + ", exercises=" + this.exercises + ")";
    }

    public RegionRecentLoad(String region, double d, List<ExerciseTonnageLine> exercises) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(exercises, "exercises");
        this.region = region;
        this.tonnageKg = d;
        this.exercises = exercises;
    }

    public final String getRegion() {
        return this.region;
    }

    public final double getTonnageKg() {
        return this.tonnageKg;
    }

    public final List<ExerciseTonnageLine> getExercises() {
        return this.exercises;
    }

    /* compiled from: RegionRecentLoad.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/recovery/RegionRecentLoad$ExerciseTonnageLine;", "", "exerciseName", "", "tonnageKg", "", "why", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "getExerciseName", "()Ljava/lang/String;", "getTonnageKg", "()D", "getWhy", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExerciseTonnageLine {
        public static final int $stable = 0;
        private final String exerciseName;
        private final double tonnageKg;
        private final String why;

        public static /* synthetic */ ExerciseTonnageLine copy$default(ExerciseTonnageLine exerciseTonnageLine, String str, double d, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exerciseTonnageLine.exerciseName;
            }
            if ((i & 2) != 0) {
                d = exerciseTonnageLine.tonnageKg;
            }
            if ((i & 4) != 0) {
                str2 = exerciseTonnageLine.why;
            }
            return exerciseTonnageLine.copy(str, d, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExerciseName() {
            return this.exerciseName;
        }

        /* renamed from: component2, reason: from getter */
        public final double getTonnageKg() {
            return this.tonnageKg;
        }

        /* renamed from: component3, reason: from getter */
        public final String getWhy() {
            return this.why;
        }

        public final ExerciseTonnageLine copy(String exerciseName, double tonnageKg, String why) {
            Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
            Intrinsics.checkNotNullParameter(why, "why");
            return new ExerciseTonnageLine(exerciseName, tonnageKg, why);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExerciseTonnageLine)) {
                return false;
            }
            ExerciseTonnageLine exerciseTonnageLine = (ExerciseTonnageLine) other;
            return Intrinsics.areEqual(this.exerciseName, exerciseTonnageLine.exerciseName) && Double.compare(this.tonnageKg, exerciseTonnageLine.tonnageKg) == 0 && Intrinsics.areEqual(this.why, exerciseTonnageLine.why);
        }

        public int hashCode() {
            return (((this.exerciseName.hashCode() * 31) + Double.hashCode(this.tonnageKg)) * 31) + this.why.hashCode();
        }

        public String toString() {
            return "ExerciseTonnageLine(exerciseName=" + this.exerciseName + ", tonnageKg=" + this.tonnageKg + ", why=" + this.why + ")";
        }

        public ExerciseTonnageLine(String exerciseName, double d, String why) {
            Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
            Intrinsics.checkNotNullParameter(why, "why");
            this.exerciseName = exerciseName;
            this.tonnageKg = d;
            this.why = why;
        }

        public final String getExerciseName() {
            return this.exerciseName;
        }

        public final double getTonnageKg() {
            return this.tonnageKg;
        }

        public /* synthetic */ ExerciseTonnageLine(String str, double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, (i & 4) != 0 ? "" : str2);
        }

        public final String getWhy() {
            return this.why;
        }
    }
}
