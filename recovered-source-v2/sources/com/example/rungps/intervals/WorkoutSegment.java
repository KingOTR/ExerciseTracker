package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkoutPlan.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/intervals/WorkoutSegment;", "", "label", "", "target", "Lcom/example/rungps/intervals/SegmentTarget;", "cues", "", "Lcom/example/rungps/intervals/Cue;", "<init>", "(Ljava/lang/String;Lcom/example/rungps/intervals/SegmentTarget;Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "getTarget", "()Lcom/example/rungps/intervals/SegmentTarget;", "getCues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WorkoutSegment {
    public static final int $stable = 8;
    private final List<Cue> cues;
    private final String label;
    private final SegmentTarget target;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutSegment copy$default(WorkoutSegment workoutSegment, String str, SegmentTarget segmentTarget, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workoutSegment.label;
        }
        if ((i & 2) != 0) {
            segmentTarget = workoutSegment.target;
        }
        if ((i & 4) != 0) {
            list = workoutSegment.cues;
        }
        return workoutSegment.copy(str, segmentTarget, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final SegmentTarget getTarget() {
        return this.target;
    }

    public final List<Cue> component3() {
        return this.cues;
    }

    public final WorkoutSegment copy(String label, SegmentTarget target, List<? extends Cue> cues) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(cues, "cues");
        return new WorkoutSegment(label, target, cues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutSegment)) {
            return false;
        }
        WorkoutSegment workoutSegment = (WorkoutSegment) other;
        return Intrinsics.areEqual(this.label, workoutSegment.label) && Intrinsics.areEqual(this.target, workoutSegment.target) && Intrinsics.areEqual(this.cues, workoutSegment.cues);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.target.hashCode()) * 31) + this.cues.hashCode();
    }

    public String toString() {
        return "WorkoutSegment(label=" + this.label + ", target=" + this.target + ", cues=" + this.cues + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkoutSegment(String label, SegmentTarget target, List<? extends Cue> cues) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(cues, "cues");
        this.label = label;
        this.target = target;
        this.cues = cues;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SegmentTarget getTarget() {
        return this.target;
    }

    public /* synthetic */ WorkoutSegment(String str, SegmentTarget segmentTarget, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, segmentTarget, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Cue> getCues() {
        return this.cues;
    }
}
