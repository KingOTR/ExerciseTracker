package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: SleepAudioAnalyzer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0005J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0014\u001a\u00020\tH\u0002¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioAnalyzer;", "", "<init>", "()V", "rmsFromPcm", "", "buffer", "", "read", "", "analyzeWindow", "Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;", "rmsSeries", "", "baselineRms", "estimateBreathing", "Lkotlin/Pair;", "smoothed", "movingAverage", "values", "window", "WindowFeatures", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAudioAnalyzer {
    public static final int $stable = 0;
    public static final SleepAudioAnalyzer INSTANCE = new SleepAudioAnalyzer();

    private SleepAudioAnalyzer() {
    }

    public final float rmsFromPcm(short[] buffer, int read) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (read <= 0) {
            return 0.0f;
        }
        double d = 0.0d;
        for (int i = 0; i < read; i++) {
            double d2 = buffer[i];
            d += d2 * d2;
        }
        return (float) Math.sqrt(d / read);
    }

    /* compiled from: SleepAudioAnalyzer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;", "", "rms", "", "breathRateBpm", "breathRegularity", "quietFraction", "snoreLikelihood", "<init>", "(FFFFF)V", "getRms", "()F", "getBreathRateBpm", "getBreathRegularity", "getQuietFraction", "getSnoreLikelihood", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WindowFeatures {
        public static final int $stable = 0;
        private final float breathRateBpm;
        private final float breathRegularity;
        private final float quietFraction;
        private final float rms;
        private final float snoreLikelihood;

        public static /* synthetic */ WindowFeatures copy$default(WindowFeatures windowFeatures, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = windowFeatures.rms;
            }
            if ((i & 2) != 0) {
                f2 = windowFeatures.breathRateBpm;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = windowFeatures.breathRegularity;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                f4 = windowFeatures.quietFraction;
            }
            float f8 = f4;
            if ((i & 16) != 0) {
                f5 = windowFeatures.snoreLikelihood;
            }
            return windowFeatures.copy(f, f6, f7, f8, f5);
        }

        /* renamed from: component1, reason: from getter */
        public final float getRms() {
            return this.rms;
        }

        /* renamed from: component2, reason: from getter */
        public final float getBreathRateBpm() {
            return this.breathRateBpm;
        }

        /* renamed from: component3, reason: from getter */
        public final float getBreathRegularity() {
            return this.breathRegularity;
        }

        /* renamed from: component4, reason: from getter */
        public final float getQuietFraction() {
            return this.quietFraction;
        }

        /* renamed from: component5, reason: from getter */
        public final float getSnoreLikelihood() {
            return this.snoreLikelihood;
        }

        public final WindowFeatures copy(float rms, float breathRateBpm, float breathRegularity, float quietFraction, float snoreLikelihood) {
            return new WindowFeatures(rms, breathRateBpm, breathRegularity, quietFraction, snoreLikelihood);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WindowFeatures)) {
                return false;
            }
            WindowFeatures windowFeatures = (WindowFeatures) other;
            return Float.compare(this.rms, windowFeatures.rms) == 0 && Float.compare(this.breathRateBpm, windowFeatures.breathRateBpm) == 0 && Float.compare(this.breathRegularity, windowFeatures.breathRegularity) == 0 && Float.compare(this.quietFraction, windowFeatures.quietFraction) == 0 && Float.compare(this.snoreLikelihood, windowFeatures.snoreLikelihood) == 0;
        }

        public int hashCode() {
            return (((((((Float.hashCode(this.rms) * 31) + Float.hashCode(this.breathRateBpm)) * 31) + Float.hashCode(this.breathRegularity)) * 31) + Float.hashCode(this.quietFraction)) * 31) + Float.hashCode(this.snoreLikelihood);
        }

        public String toString() {
            return "WindowFeatures(rms=" + this.rms + ", breathRateBpm=" + this.breathRateBpm + ", breathRegularity=" + this.breathRegularity + ", quietFraction=" + this.quietFraction + ", snoreLikelihood=" + this.snoreLikelihood + ")";
        }

        public WindowFeatures(float f, float f2, float f3, float f4, float f5) {
            this.rms = f;
            this.breathRateBpm = f2;
            this.breathRegularity = f3;
            this.quietFraction = f4;
            this.snoreLikelihood = f5;
        }

        public final float getRms() {
            return this.rms;
        }

        public final float getBreathRateBpm() {
            return this.breathRateBpm;
        }

        public final float getBreathRegularity() {
            return this.breathRegularity;
        }

        public final float getQuietFraction() {
            return this.quietFraction;
        }

        public final float getSnoreLikelihood() {
            return this.snoreLikelihood;
        }
    }

    public final WindowFeatures analyzeWindow(List<Float> rmsSeries, float baselineRms) {
        int i;
        Intrinsics.checkNotNullParameter(rmsSeries, "rmsSeries");
        if (rmsSeries.isEmpty()) {
            return new WindowFeatures(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        }
        List<Float> list = rmsSeries;
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(list);
        float coerceAtLeast = RangesKt.coerceAtLeast(baselineRms, 50.0f);
        float coerceIn = RangesKt.coerceIn(averageOfFloat / coerceAtLeast, 0.0f, 4.0f);
        float f = 1.15f * coerceAtLeast;
        boolean z = list instanceof Collection;
        int i2 = 0;
        if (z && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Number) it.next()).floatValue() <= f && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        float size = i / rmsSeries.size();
        Pair<Float, Float> estimateBreathing = estimateBreathing(movingAverage(rmsSeries, 3));
        float floatValue = estimateBreathing.component1().floatValue();
        float floatValue2 = estimateBreathing.component2().floatValue();
        if (!z || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).floatValue() > 2.8f * coerceAtLeast && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return new WindowFeatures(coerceIn, floatValue, floatValue2, size, RangesKt.coerceIn(i2 / rmsSeries.size(), 0.0f, 1.0f));
    }

    private final Pair<Float, Float> estimateBreathing(List<Float> smoothed) {
        List list;
        int size = smoothed.size();
        Float valueOf = Float.valueOf(0.0f);
        if (size < 8) {
            return TuplesKt.to(valueOf, valueOf);
        }
        float coerceAtLeast = RangesKt.coerceAtLeast((float) CollectionsKt.averageOfFloat(smoothed), 1.0f);
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(smoothed);
        for (int i = 1; i < lastIndex; i++) {
            float floatValue = smoothed.get(i).floatValue();
            if (floatValue > 1.08f * coerceAtLeast && floatValue >= smoothed.get(i - 1).floatValue() && floatValue >= smoothed.get(i + 1).floatValue() && (arrayList.isEmpty() || i - ((Number) CollectionsKt.last((List) arrayList)).intValue() >= 3)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.size() < 3) {
            return TuplesKt.to(valueOf, valueOf);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList2.add(Integer.valueOf(((Number) next2).intValue() - ((Number) next).intValue()));
                next = next2;
            }
            list = arrayList2;
        } else {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(((Number) it2.next()).intValue()));
        }
        ArrayList arrayList4 = arrayList3;
        float coerceAtLeast2 = RangesKt.coerceAtLeast((float) CollectionsKt.averageOfFloat(arrayList4), 0.5f);
        float coerceIn = RangesKt.coerceIn(60.0f / (coerceAtLeast2 / 2.0f), 8.0f, 28.0f);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            float floatValue2 = ((Number) it3.next()).floatValue() - coerceAtLeast2;
            arrayList5.add(Float.valueOf(floatValue2 * floatValue2));
        }
        return TuplesKt.to(Float.valueOf(coerceIn), Float.valueOf(RangesKt.coerceIn(1.0f - RangesKt.coerceIn(((float) Math.sqrt(CollectionsKt.averageOfFloat(arrayList5))) / coerceAtLeast2, 0.0f, 1.0f), 0.0f, 1.0f)));
    }

    private final List<Float> movingAverage(List<Float> values, int window) {
        if (values.size() <= window) {
            return values;
        }
        IntRange indices = CollectionsKt.getIndices(values);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            int i = window / 2;
            arrayList.add(Float.valueOf((float) CollectionsKt.averageOfFloat(values.subList(RangesKt.coerceAtLeast(nextInt - i, 0), RangesKt.coerceAtMost(nextInt + i, CollectionsKt.getLastIndex(values)) + 1))));
        }
        return arrayList;
    }
}
