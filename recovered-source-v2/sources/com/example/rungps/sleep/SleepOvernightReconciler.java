package com.example.rungps.sleep;

import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import com.example.rungps.sleep.SleepStageInference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepOvernightReconciler.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013J(\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u001e\u0010 \u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010!\u001a\u00020\u0013H\u0002J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002JD\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/example/rungps/sleep/SleepOvernightReconciler;", "", "<init>", "()V", "BUCKET_MS", "", "MIN_COVERAGE_RATIO", "", "MIN_ASLEEP_RATIO_OF_IN_BED", "reconcile", "Lkotlin/Pair;", "Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "breakdown", "hypnogramLabels", "samples", "Lcom/example/rungps/sleep/SleepTrackSample;", "inBedMin", "", "rebuildForFeedback", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "kind", "Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;", "buildFullNightLabels", "asleepRatio", "preferGoodNight", "", "cycleStage", "idx", "sleepBuckets", "wallTrackedMinutes", "fallbackTrackedMin", "expandLabelsToInBed", "sparse", "metricsFromLabels", "labels", "prior", "coverage", "trackedMin", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepOvernightReconciler {
    public static final int $stable = 0;
    private static final long BUCKET_MS = 10000;
    public static final SleepOvernightReconciler INSTANCE = new SleepOvernightReconciler();
    private static final double MIN_ASLEEP_RATIO_OF_IN_BED = 0.2d;
    private static final double MIN_COVERAGE_RATIO = 0.35d;

    /* compiled from: SleepOvernightReconciler.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SleepMlFeedbackApply.Kind.values().length];
            try {
                iArr[SleepMlFeedbackApply.Kind.LOOKS_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepMlFeedbackApply.Kind.TOO_AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepMlFeedbackApply.Kind.TOO_MUCH_DEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SleepStageLabel.values().length];
            try {
                iArr2[SleepStageLabel.DEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SleepStageLabel.REM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SleepStageLabel.AWAKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private SleepOvernightReconciler() {
    }

    public final Pair<SleepStageInference.StageBreakdown, List<SleepStageLabel>> reconcile(SleepStageInference.StageBreakdown breakdown, List<? extends SleepStageLabel> hypnogramLabels, List<SleepTrackSample> samples, int inBedMin) {
        double coerceIn;
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(hypnogramLabels, "hypnogramLabels");
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (inBedMin <= 0) {
            return TuplesKt.to(breakdown, hypnogramLabels);
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(breakdown.getTrackedMin(), 0);
        int wallTrackedMinutes = wallTrackedMinutes(samples, coerceAtLeast);
        double d = coerceAtLeast;
        double d2 = inBedMin;
        double d3 = d / d2;
        double d4 = wallTrackedMinutes / d2;
        double totalSleepMin = coerceAtLeast > 0 ? breakdown.getTotalSleepMin() / d : 0.0d;
        boolean z = true;
        if (d3 >= MIN_COVERAGE_RATIO && d4 >= MIN_COVERAGE_RATIO && breakdown.getTotalSleepMin() >= d2 * MIN_ASLEEP_RATIO_OF_IN_BED && ((inBedMin < 60 || breakdown.getTotalSleepMin() != 0) && hypnogramLabels.size() >= RangesKt.coerceAtLeast(inBedMin / 3, 1) && (inBedMin < 60 || wallTrackedMinutes >= inBedMin / 2))) {
            return TuplesKt.to(breakdown, hypnogramLabels);
        }
        List<SleepTrackSample> list = samples;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(SleepFeatureEncoder.INSTANCE.calmness((SleepTrackSample) it.next())));
        }
        Double valueOf = Double.valueOf(CollectionsKt.averageOfFloat(arrayList));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        double doubleValue = valueOf != null ? valueOf.doubleValue() : 0.55d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((SleepTrackSample) it2.next()).getMovement()));
        }
        Double valueOf2 = Double.valueOf(CollectionsKt.averageOfFloat(arrayList2));
        Double d5 = Double.isNaN(valueOf2.doubleValue()) ? null : valueOf2;
        double doubleValue2 = d5 != null ? d5.doubleValue() : 0.5d;
        if (totalSleepMin >= 0.25d && d3 >= 0.12d && d4 >= 0.12d && !samples.isEmpty()) {
            z = false;
        }
        if (z && doubleValue2 < 1.4d) {
            coerceIn = RangesKt.coerceIn((doubleValue * 0.1d) + 0.82d, 0.78d, 0.92d);
        } else if (z) {
            coerceIn = 0.72d;
        } else {
            coerceIn = totalSleepMin > 0.4d ? RangesKt.coerceIn(totalSleepMin, 0.4d, 0.95d) : 0.85d;
        }
        List<SleepStageLabel> buildFullNightLabels = buildFullNightLabels(inBedMin, coerceIn, z);
        return TuplesKt.to(metricsFromLabels(buildFullNightLabels, inBedMin, breakdown, samples, d3, coerceAtLeast), buildFullNightLabels);
    }

    public final Pair<List<SleepStageLabel>, Integer> rebuildForFeedback(SleepEntryEntity entry, SleepMlFeedbackApply.Kind kind) {
        double d;
        List<SleepStageLabel> expandLabelsToInBed;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(kind, "kind");
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
        List<SleepStageLabel> decode = SleepHypnogramEncoder.INSTANCE.decode(entry.getHypnogramCompact());
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 1) {
            d = 0.88d;
        } else if (i == 2) {
            d = 0.82d;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.86d;
        }
        if (decode.size() < coerceAtLeast / 4) {
            expandLabelsToInBed = buildFullNightLabels(coerceAtLeast, d, true);
        } else {
            List<SleepStageLabel> mutableList = CollectionsKt.toMutableList((Collection) decode);
            SleepMlFeedbackApply.INSTANCE.adjustLabelsPublic$app_sideload(mutableList, kind);
            expandLabelsToInBed = expandLabelsToInBed(mutableList, coerceAtLeast);
        }
        return TuplesKt.to(expandLabelsToInBed, Integer.valueOf(coerceAtLeast));
    }

    private final List<SleepStageLabel> buildFullNightLabels(int inBedMin, double asleepRatio, boolean preferGoodNight) {
        SleepStageLabel sleepStageLabel;
        int coerceIn = RangesKt.coerceIn((int) ((inBedMin * 60000) / 10000), 1, 4320);
        int roundToInt = MathKt.roundToInt(coerceIn * (1.0d - asleepRatio));
        int coerceIn2 = RangesKt.coerceIn(roundToInt, 0, coerceIn);
        int i = coerceIn - coerceIn2;
        ArrayList arrayList = new ArrayList(coerceIn);
        for (int i2 = 0; i2 < coerceIn; i2++) {
            if (i2 < RangesKt.coerceAtMost(coerceIn2, 18)) {
                sleepStageLabel = SleepStageLabel.AWAKE;
            } else if (preferGoodNight) {
                sleepStageLabel = INSTANCE.cycleStage(i2 - coerceIn2, i);
            } else {
                sleepStageLabel = SleepStageLabel.LIGHT;
            }
            arrayList.add(sleepStageLabel);
        }
        return arrayList;
    }

    private final SleepStageLabel cycleStage(int idx, int sleepBuckets) {
        if (sleepBuckets <= 0) {
            return SleepStageLabel.AWAKE;
        }
        double d = ((idx / sleepBuckets) * 5.5d) % 1.0d;
        if (d < 0.12d) {
            return SleepStageLabel.REM;
        }
        if (d < 0.28d) {
            return SleepStageLabel.LIGHT;
        }
        if (d < 0.42d) {
            return SleepStageLabel.DEEP;
        }
        if (d < 0.55d) {
            return SleepStageLabel.LIGHT;
        }
        if (d < 0.68d) {
            return SleepStageLabel.REM;
        }
        return SleepStageLabel.LIGHT;
    }

    private final int wallTrackedMinutes(List<SleepTrackSample> samples, int fallbackTrackedMin) {
        return samples.size() < 2 ? fallbackTrackedMin : RangesKt.coerceAtLeast((int) (((((SleepTrackSample) CollectionsKt.last((List) samples)).getElapsedMs() - ((SleepTrackSample) CollectionsKt.first((List) samples)).getElapsedMs()) + 10000) / 60000), fallbackTrackedMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<SleepStageLabel> expandLabelsToInBed(List<? extends SleepStageLabel> sparse, int inBedMin) {
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((inBedMin * 60000) / 10000), sparse.size());
        if (sparse.size() >= coerceAtLeast * 0.85d) {
            return sparse;
        }
        ArrayList arrayList = new ArrayList(coerceAtLeast);
        for (int i = 0; i < coerceAtLeast; i++) {
            arrayList.add((SleepStageLabel) sparse.get(RangesKt.coerceIn((int) ((i * sparse.size()) / RangesKt.coerceAtLeast(coerceAtLeast, 1)), 0, CollectionsKt.getLastIndex(sparse))));
        }
        return arrayList;
    }

    private final SleepStageInference.StageBreakdown metricsFromLabels(List<? extends SleepStageLabel> labels, int inBedMin, SleepStageInference.StageBreakdown prior, List<SleepTrackSample> samples, double coverage, int trackedMin) {
        int restlessnessIndex;
        Iterator<? extends SleepStageLabel> it = labels.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int i5 = WhenMappings.$EnumSwitchMapping$1[it.next().ordinal()];
            if (i5 == 1) {
                i++;
            } else if (i5 == 2) {
                i2++;
            } else if (i5 != 3) {
                i3++;
            } else {
                i4++;
            }
        }
        int roundToInt = MathKt.roundToInt(i * 0.16666666666666666d);
        int roundToInt2 = MathKt.roundToInt(i2 * 0.16666666666666666d);
        int roundToInt3 = MathKt.roundToInt(i3 * 0.16666666666666666d);
        int coerceAtMost = RangesKt.coerceAtMost(MathKt.roundToInt(i4 * 0.16666666666666666d), inBedMin);
        int coerceIn = RangesKt.coerceIn(roundToInt + roundToInt3 + roundToInt2, 0, inBedMin);
        int coerceIn2 = RangesKt.coerceIn(MathKt.roundToInt((coerceIn * 100.0d) / inBedMin), 1, 100);
        StringBuilder sb = new StringBuilder();
        sb.append("Efficiency " + coerceIn2 + "%");
        if (roundToInt > 0) {
            sb.append(" · deep " + roundToInt + "m");
        }
        if (roundToInt2 > 0) {
            sb.append(" · REM " + roundToInt2 + "m");
        }
        if (coverage < MIN_COVERAGE_RATIO) {
            sb.append(" · sensor tracked " + trackedMin + "m of " + inBedMin + "m — estimate from in-bed time");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (!samples.isEmpty()) {
            List<SleepTrackSample> list = samples;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(((SleepTrackSample) it2.next()).getMovement()));
            }
            double averageOfFloat = CollectionsKt.averageOfFloat(arrayList) * 40;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Float.valueOf(1.0f - ((SleepTrackSample) it3.next()).getQuietFraction()));
            }
            restlessnessIndex = RangesKt.coerceIn((int) (averageOfFloat + (CollectionsKt.averageOfFloat(arrayList2) * 60)), 0, 100);
        } else {
            restlessnessIndex = prior.getRestlessnessIndex();
        }
        int i6 = restlessnessIndex;
        int coerceAtLeast = RangesKt.coerceAtLeast(coerceAtMost, inBedMin - coerceIn);
        int snoreEvents = prior.getSnoreEvents();
        Integer valueOf = Integer.valueOf(prior.getTimeToFallAsleepMin());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        return new SleepStageInference.StageBreakdown(coerceIn, roundToInt, roundToInt3, roundToInt2, coerceAtLeast, snoreEvents, i6, valueOf != null ? valueOf.intValue() : 12, coerceIn2, RangesKt.coerceIn(coerceIn / 90, 1, 6), sb2, trackedMin);
    }
}
