package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepMicCoverage.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nJ \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/sleep/SleepMicCoverage;", "", "<init>", "()V", "fromSamples", "Lcom/example/rungps/sleep/SleepMicCoverage$Snapshot;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "inBedMin", "", "gapMs", "", "gapCount", "detectGaps", "Lkotlin/Pair;", "inferBucketMs", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMicCoverage {
    public static final int $stable = 0;
    public static final SleepMicCoverage INSTANCE = new SleepMicCoverage();

    private SleepMicCoverage() {
    }

    /* compiled from: SleepMicCoverage.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/example/rungps/sleep/SleepMicCoverage$Snapshot;", "", "coverageRatio", "", "trackedMin", "", "inBedMin", "gapMs", "", "gapCount", "label", "", "<init>", "(FIIJILjava/lang/String;)V", "getCoverageRatio", "()F", "getTrackedMin", "()I", "getInBedMin", "getGapMs", "()J", "getGapCount", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final float coverageRatio;
        private final int gapCount;
        private final long gapMs;
        private final int inBedMin;
        private final String label;
        private final int trackedMin;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, float f, int i, int i2, long j, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f = snapshot.coverageRatio;
            }
            if ((i4 & 2) != 0) {
                i = snapshot.trackedMin;
            }
            int i5 = i;
            if ((i4 & 4) != 0) {
                i2 = snapshot.inBedMin;
            }
            int i6 = i2;
            if ((i4 & 8) != 0) {
                j = snapshot.gapMs;
            }
            long j2 = j;
            if ((i4 & 16) != 0) {
                i3 = snapshot.gapCount;
            }
            int i7 = i3;
            if ((i4 & 32) != 0) {
                str = snapshot.label;
            }
            return snapshot.copy(f, i5, i6, j2, i7, str);
        }

        /* renamed from: component1, reason: from getter */
        public final float getCoverageRatio() {
            return this.coverageRatio;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTrackedMin() {
            return this.trackedMin;
        }

        /* renamed from: component3, reason: from getter */
        public final int getInBedMin() {
            return this.inBedMin;
        }

        /* renamed from: component4, reason: from getter */
        public final long getGapMs() {
            return this.gapMs;
        }

        /* renamed from: component5, reason: from getter */
        public final int getGapCount() {
            return this.gapCount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Snapshot copy(float coverageRatio, int trackedMin, int inBedMin, long gapMs, int gapCount, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Snapshot(coverageRatio, trackedMin, inBedMin, gapMs, gapCount, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Float.compare(this.coverageRatio, snapshot.coverageRatio) == 0 && this.trackedMin == snapshot.trackedMin && this.inBedMin == snapshot.inBedMin && this.gapMs == snapshot.gapMs && this.gapCount == snapshot.gapCount && Intrinsics.areEqual(this.label, snapshot.label);
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.coverageRatio) * 31) + Integer.hashCode(this.trackedMin)) * 31) + Integer.hashCode(this.inBedMin)) * 31) + Long.hashCode(this.gapMs)) * 31) + Integer.hashCode(this.gapCount)) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Snapshot(coverageRatio=" + this.coverageRatio + ", trackedMin=" + this.trackedMin + ", inBedMin=" + this.inBedMin + ", gapMs=" + this.gapMs + ", gapCount=" + this.gapCount + ", label=" + this.label + ")";
        }

        public Snapshot(float f, int i, int i2, long j, int i3, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.coverageRatio = f;
            this.trackedMin = i;
            this.inBedMin = i2;
            this.gapMs = j;
            this.gapCount = i3;
            this.label = label;
        }

        public final float getCoverageRatio() {
            return this.coverageRatio;
        }

        public final int getTrackedMin() {
            return this.trackedMin;
        }

        public final int getInBedMin() {
            return this.inBedMin;
        }

        public final long getGapMs() {
            return this.gapMs;
        }

        public final int getGapCount() {
            return this.gapCount;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    public static /* synthetic */ Snapshot fromSamples$default(SleepMicCoverage sleepMicCoverage, List list, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return sleepMicCoverage.fromSamples(list, i, j2, i2);
    }

    public final Snapshot fromSamples(List<SleepTrackSample> samples, int inBedMin, long gapMs, int gapCount) {
        String str;
        Intrinsics.checkNotNullParameter(samples, "samples");
        int coerceAtLeast = samples.isEmpty() ? 0 : RangesKt.coerceAtLeast(MathKt.roundToInt((samples.size() * inferBucketMs(samples)) / 60000.0d), 0);
        float f = inBedMin > 0 ? coerceAtLeast / inBedMin : 1.0f;
        if (f < 0.85f || gapCount != 0) {
            str = f >= 0.55f ? "Partial coverage (" + MathKt.roundToInt(100 * f) + "%)" : "Low coverage (" + MathKt.roundToInt(100 * f) + "%) — stages are estimates";
        } else {
            str = "Good mic coverage";
        }
        return new Snapshot(RangesKt.coerceIn(f, 0.0f, 1.2f), coerceAtLeast, inBedMin, gapMs, gapCount, str);
    }

    public final Pair<Long, Integer> detectGaps(List<SleepTrackSample> samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        int i = 0;
        long j = 0;
        if (samples.size() < 2) {
            return TuplesKt.to(0L, 0);
        }
        long inferBucketMs = inferBucketMs(samples);
        int size = samples.size();
        for (int i2 = 1; i2 < size; i2++) {
            long elapsedMs = samples.get(i2).getElapsedMs() - samples.get(i2 - 1).getElapsedMs();
            if (elapsedMs > 15000 + inferBucketMs) {
                j += elapsedMs - inferBucketMs;
                i++;
            }
        }
        return TuplesKt.to(Long.valueOf(j), Integer.valueOf(i));
    }

    private final long inferBucketMs(List<SleepTrackSample> samples) {
        List list;
        if (samples.size() < 2) {
            return 10000L;
        }
        Iterator<T> it = samples.iterator();
        if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList.add(Long.valueOf(((SleepTrackSample) next2).getElapsedMs() - ((SleepTrackSample) next).getElapsedMs()));
                next = next2;
            }
            list = arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            long longValue = ((Number) obj).longValue();
            if (5000 <= longValue && longValue < 20001) {
                arrayList2.add(obj);
            }
        }
        Long valueOf = Long.valueOf((long) CollectionsKt.averageOfLong(arrayList2));
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 10000L;
    }
}
