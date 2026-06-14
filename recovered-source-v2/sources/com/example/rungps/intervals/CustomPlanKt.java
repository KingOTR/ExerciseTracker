package com.example.rungps.intervals;

import com.example.rungps.intervals.CustomTarget;
import com.example.rungps.intervals.SegmentTarget;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomPlan.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toWorkoutPlan", "Lcom/example/rungps/intervals/WorkoutPlan;", "Lcom/example/rungps/intervals/CustomPlan;", "targetSpeedKmh", "", "Lcom/example/rungps/intervals/CustomTarget;", "(Lcom/example/rungps/intervals/CustomTarget;)Ljava/lang/Double;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomPlanKt {
    public static final WorkoutPlan toWorkoutPlan(CustomPlan customPlan) {
        SegmentTarget.TimeMs timeMs;
        Intrinsics.checkNotNullParameter(customPlan, "<this>");
        List<CustomSegment> segments = customPlan.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        for (CustomSegment customSegment : segments) {
            CustomTarget target = customSegment.getTarget();
            if (target instanceof CustomTarget.TimeMs) {
                timeMs = new SegmentTarget.TimeMs(((CustomTarget.TimeMs) target).getMs());
            } else if (target instanceof CustomTarget.DistanceM) {
                timeMs = new SegmentTarget.DistanceM(((CustomTarget.DistanceM) target).getMeters());
            } else {
                if (!(target instanceof CustomTarget.SpeedHold)) {
                    throw new NoWhenBranchMatchedException();
                }
                timeMs = new SegmentTarget.TimeMs(((CustomTarget.SpeedHold) target).getMs());
            }
            arrayList.add(new WorkoutSegment(customSegment.getLabel(), timeMs, null, 4, null));
        }
        return new WorkoutPlan(arrayList);
    }

    public static final Double targetSpeedKmh(CustomTarget customTarget) {
        Intrinsics.checkNotNullParameter(customTarget, "<this>");
        if (!(customTarget instanceof CustomTarget.SpeedHold)) {
            return null;
        }
        Double valueOf = Double.valueOf(((CustomTarget.SpeedHold) customTarget).getKmh());
        if (valueOf.doubleValue() > 0.0d) {
            return valueOf;
        }
        return null;
    }
}
