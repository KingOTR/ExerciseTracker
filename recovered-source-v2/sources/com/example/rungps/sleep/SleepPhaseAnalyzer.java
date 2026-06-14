package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.sleep.SleepConfidenceStaging;
import com.example.rungps.sleep.SleepStageInference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepPhaseAnalyzer.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ0\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sleep/SleepPhaseAnalyzer;", "", "<init>", "()V", "analyze", "Lcom/example/rungps/sleep/OvernightAnalysis;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "inBedMin", "", "context", "Landroid/content/Context;", "bestWakeIndex", "windowStartMs", "", "windowEndMs", "rmsFromPcm", "", "buffer", "", "read", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepPhaseAnalyzer {
    public static final int $stable = 0;
    public static final SleepPhaseAnalyzer INSTANCE = new SleepPhaseAnalyzer();

    private SleepPhaseAnalyzer() {
    }

    public static /* synthetic */ OvernightAnalysis analyze$default(SleepPhaseAnalyzer sleepPhaseAnalyzer, List list, int i, Context context, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            context = null;
        }
        return sleepPhaseAnalyzer.analyze(list, i, context);
    }

    public final OvernightAnalysis analyze(List<SleepTrackSample> samples, int inBedMin, Context context) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        SleepStageInference.StageBreakdown analyze = SleepStageInference.INSTANCE.analyze(samples, inBedMin, context);
        return new OvernightAnalysis(analyze.getTotalSleepMin(), analyze.getDeepSleepMin(), analyze.getLightSleepMin(), analyze.getRemSleepMin(), analyze.getAwakeSleepMin(), analyze.getSnoreEvents(), analyze.getRestlessnessIndex(), analyze.getTimeToFallAsleepMin(), analyze.getEfficiency(), analyze.getSleepCycles(), analyze.getQualityHint());
    }

    public static /* synthetic */ int bestWakeIndex$default(SleepPhaseAnalyzer sleepPhaseAnalyzer, List list, long j, long j2, Context context, int i, Object obj) {
        if ((i & 8) != 0) {
            context = null;
        }
        return sleepPhaseAnalyzer.bestWakeIndex(list, j, j2, context);
    }

    public final int bestWakeIndex(List<SleepTrackSample> samples, long windowStartMs, long windowEndMs, Context context) {
        float movement;
        Intrinsics.checkNotNullParameter(samples, "samples");
        int i = -1;
        if (samples.isEmpty()) {
            return -1;
        }
        Iterator<SleepTrackSample> it = samples.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getElapsedMs() >= windowStartMs) {
                break;
            }
            i2++;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i2, 0);
        ListIterator<SleepTrackSample> listIterator = samples.listIterator(samples.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (listIterator.previous().getElapsedMs() <= windowEndMs) {
                i = listIterator.nextIndex();
                break;
            }
        }
        int coerceAtLeast2 = RangesKt.coerceAtLeast(i, coerceAtLeast);
        if (coerceAtLeast > coerceAtLeast2) {
            return coerceAtLeast2;
        }
        if (context != null) {
            SleepStagingV2Classifier.INSTANCE.ensureLoaded(context);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = samples.iterator();
        while (it2.hasNext()) {
            Float stageConfidence = ((SleepTrackSample) it2.next()).getStageConfidence();
            if (stageConfidence != null) {
                arrayList.add(stageConfidence);
            }
        }
        Double valueOf = Double.valueOf(CollectionsKt.averageOfFloat(arrayList));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        float doubleValue = valueOf != null ? (float) valueOf.doubleValue() : 0.5f;
        SleepConfidenceStaging.ViewMeta viewMeta = new SleepConfidenceStaging.ViewMeta(doubleValue >= 0.62f, doubleValue < 0.55f, doubleValue < 0.5f, doubleValue, "");
        if (coerceAtLeast > coerceAtLeast2) {
            return coerceAtLeast;
        }
        float f = Float.MAX_VALUE;
        int i3 = coerceAtLeast;
        while (true) {
            SleepTrackSample sleepTrackSample = samples.get(coerceAtLeast);
            if (context != null) {
                movement = SleepConfidenceStaging.INSTANCE.alarmWakeScore(sleepTrackSample, viewMeta);
            } else {
                movement = (sleepTrackSample.getMovement() * 0.35f) + (sleepTrackSample.getAudioLevel() * 0.25f) + ((1.0f - sleepTrackSample.getQuietFraction()) * 0.25f) + ((1.0f - sleepTrackSample.getBreathRegularity()) * 0.15f);
            }
            if (movement < f) {
                i3 = coerceAtLeast;
                f = movement;
            }
            if (coerceAtLeast == coerceAtLeast2) {
                return i3;
            }
            coerceAtLeast++;
        }
    }

    public final float rmsFromPcm(short[] buffer, int read) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return SleepAudioAnalyzer.INSTANCE.rmsFromPcm(buffer, read);
    }
}
