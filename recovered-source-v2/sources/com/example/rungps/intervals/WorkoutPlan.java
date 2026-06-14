package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkoutPlan.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/intervals/WorkoutPlan;", "", "segments", "", "Lcom/example/rungps/intervals/WorkoutSegment;", "<init>", "(Ljava/util/List;)V", "getSegments", "()Ljava/util/List;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WorkoutPlan {
    public static final int $stable = 8;
    private final List<WorkoutSegment> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutPlan copy$default(WorkoutPlan workoutPlan, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = workoutPlan.segments;
        }
        return workoutPlan.copy(list);
    }

    public final List<WorkoutSegment> component1() {
        return this.segments;
    }

    public final WorkoutPlan copy(List<WorkoutSegment> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new WorkoutPlan(segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WorkoutPlan) && Intrinsics.areEqual(this.segments, ((WorkoutPlan) other).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    public String toString() {
        return "WorkoutPlan(segments=" + this.segments + ")";
    }

    public WorkoutPlan(List<WorkoutSegment> segments) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.segments = segments;
        if (segments.isEmpty()) {
            throw new IllegalArgumentException("WorkoutPlan must have at least one segment.".toString());
        }
    }

    public final List<WorkoutSegment> getSegments() {
        return this.segments;
    }
}
