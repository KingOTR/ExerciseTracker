package com.example.rungps.intervals;

import androidx.core.app.NotificationCompat;
import com.example.rungps.intervals.Cue;
import com.example.rungps.intervals.SegmentTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WorkoutEngine.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bJ(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00162\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/intervals/WorkoutEngine;", "", "plan", "Lcom/example/rungps/intervals/WorkoutPlan;", "<init>", "(Lcom/example/rungps/intervals/WorkoutPlan;)V", "idx", "", "segmentStartElapsedMs", "", "segmentStartDistanceM", "", "done", "", "lastIntervalEndCueSecond", "Ljava/lang/Integer;", "start", "", "Lcom/example/rungps/intervals/Cue;", "totalElapsedMs", "totalDistanceM", "onUpdate", "Lkotlin/Pair;", "Lcom/example/rungps/intervals/WorkoutProgress;", NotificationCompat.CATEGORY_PROGRESS, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkoutEngine {
    public static final int $stable = 8;
    private boolean done;
    private int idx;
    private Integer lastIntervalEndCueSecond;
    private final WorkoutPlan plan;
    private double segmentStartDistanceM;
    private long segmentStartElapsedMs;

    public WorkoutEngine(WorkoutPlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.plan = plan;
    }

    public final List<Cue> start(long totalElapsedMs, double totalDistanceM) {
        this.idx = 0;
        this.done = false;
        this.segmentStartElapsedMs = totalElapsedMs;
        this.segmentStartDistanceM = totalDistanceM;
        this.lastIntervalEndCueSecond = null;
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(new Cue.Speak(this.plan.getSegments().get(this.idx).getLabel())), (Iterable) this.plan.getSegments().get(this.idx).getCues());
    }

    public final Pair<WorkoutProgress, List<Cue>> onUpdate(long totalElapsedMs, double totalDistanceM) {
        Triple triple;
        int longValue;
        Integer num;
        Cue.Beep beep;
        if (this.done) {
            return TuplesKt.to(progress(totalElapsedMs, totalDistanceM), CollectionsKt.emptyList());
        }
        WorkoutSegment workoutSegment = this.plan.getSegments().get(this.idx);
        long max = Math.max(0L, totalElapsedMs - this.segmentStartElapsedMs);
        double max2 = Math.max(0.0d, totalDistanceM - this.segmentStartDistanceM);
        SegmentTarget target = workoutSegment.getTarget();
        if (target instanceof SegmentTarget.TimeMs) {
            long ms = ((SegmentTarget.TimeMs) target).getMs() - max;
            triple = new Triple(Boolean.valueOf(ms <= 0), Long.valueOf(RangesKt.coerceAtLeast(ms, 0L)), null);
        } else {
            if (!(target instanceof SegmentTarget.DistanceM)) {
                throw new NoWhenBranchMatchedException();
            }
            double meters = ((SegmentTarget.DistanceM) target).getMeters() - max2;
            triple = new Triple(Boolean.valueOf(meters <= 0.0d), null, Double.valueOf(RangesKt.coerceAtLeast(meters, 0.0d)));
        }
        boolean booleanValue = ((Boolean) triple.component1()).booleanValue();
        Long l = (Long) triple.component2();
        Double d = (Double) triple.component3();
        ArrayList arrayList = new ArrayList();
        if ((workoutSegment.getTarget() instanceof SegmentTarget.TimeMs) && l != null && 1 <= (longValue = (int) (l.longValue() / 1000)) && longValue < 4 && ((num = this.lastIntervalEndCueSecond) == null || longValue != num.intValue())) {
            this.lastIntervalEndCueSecond = Integer.valueOf(longValue);
            ArrayList arrayList2 = arrayList;
            if (longValue == 2) {
                beep = new Cue.Beep(Cue.Pattern.IntervalEndTwo);
            } else if (longValue == 3) {
                beep = new Cue.Beep(Cue.Pattern.IntervalEndOne);
            } else {
                beep = new Cue.Beep(Cue.Pattern.IntervalEndThree);
            }
            arrayList2.add(beep);
        }
        if (booleanValue) {
            int i = this.idx + 1;
            this.idx = i;
            this.lastIntervalEndCueSecond = null;
            if (i >= this.plan.getSegments().size()) {
                this.done = true;
                arrayList.add(new Cue.Speak("Workout complete"));
            } else {
                if (this.plan.getSegments().get(this.idx).getTarget() instanceof SegmentTarget.TimeMs) {
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(new Cue.Beep(Cue.Pattern.IntervalStartThree));
                    arrayList3.add(new Cue.Beep(Cue.Pattern.IntervalStartTwo));
                    arrayList3.add(new Cue.Beep(Cue.Pattern.IntervalStartOne));
                }
                this.segmentStartElapsedMs = totalElapsedMs;
                this.segmentStartDistanceM = totalDistanceM;
                ArrayList arrayList4 = arrayList;
                arrayList4.add(new Cue.Speak(this.plan.getSegments().get(this.idx).getLabel()));
                CollectionsKt.addAll(arrayList4, this.plan.getSegments().get(this.idx).getCues());
            }
        }
        return TuplesKt.to(new WorkoutProgress(RangesKt.coerceAtMost(this.idx, CollectionsKt.getLastIndex(this.plan.getSegments())), Math.max(0L, totalElapsedMs - this.segmentStartElapsedMs), l, Math.max(0.0d, totalDistanceM - this.segmentStartDistanceM), d, this.done), arrayList);
    }

    private final WorkoutProgress progress(long totalElapsedMs, double totalDistanceM) {
        return new WorkoutProgress(CollectionsKt.getLastIndex(this.plan.getSegments()), Math.max(0L, totalElapsedMs - this.segmentStartElapsedMs), 0L, Math.max(0.0d, totalDistanceM - this.segmentStartDistanceM), Double.valueOf(0.0d), true);
    }
}
