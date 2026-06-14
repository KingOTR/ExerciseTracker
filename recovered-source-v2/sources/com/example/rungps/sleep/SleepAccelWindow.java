package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: SleepAccelWindow.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/SleepAccelWindow;", "", "windowMs", "", "<init>", "(J)V", "readings", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Pair;", "", "add", "", "timeMs", "magnitude", "snapshot", "Lcom/example/rungps/sleep/SleepAccelWindow$AccelSnapshot;", "trim", "nowMs", "AccelSnapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAccelWindow {
    public static final int $stable = 8;
    private final ArrayDeque<Pair<Long, Float>> readings;
    private final long windowMs;

    public SleepAccelWindow() {
        this(0L, 1, null);
    }

    public SleepAccelWindow(long j) {
        this.windowMs = j;
        this.readings = new ArrayDeque<>(128);
    }

    public /* synthetic */ SleepAccelWindow(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 12000L : j);
    }

    public final void add(long timeMs, float magnitude) {
        this.readings.addLast(TuplesKt.to(Long.valueOf(timeMs), Float.valueOf(magnitude)));
        trim(timeMs);
    }

    public final AccelSnapshot snapshot() {
        trim(System.currentTimeMillis());
        if (this.readings.size() < 4) {
            return new AccelSnapshot(0.0f, 0.0f, 0.0f);
        }
        ArrayDeque<Pair<Long, Float>> arrayDeque = this.readings;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
        Iterator<Pair<Long, Float>> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(it.next().getSecond().floatValue()));
        }
        ArrayList arrayList2 = arrayList;
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            float floatValue = ((Number) it2.next()).floatValue() - averageOfFloat;
            arrayList3.add(Float.valueOf(floatValue * floatValue));
        }
        float averageOfFloat2 = (float) CollectionsKt.averageOfFloat(arrayList3);
        return new AccelSnapshot(RangesKt.coerceIn(((float) Math.sqrt(averageOfFloat2)) / 4.0f, 0.0f, 1.0f), averageOfFloat2, averageOfFloat);
    }

    private final void trim(long nowMs) {
        while (!this.readings.isEmpty() && nowMs - this.readings.first().getFirst().longValue() > this.windowMs) {
            this.readings.removeFirst();
        }
    }

    /* compiled from: SleepAccelWindow.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/sleep/SleepAccelWindow$AccelSnapshot;", "", "activityIndex", "", "variance", "mean", "<init>", "(FFF)V", "getActivityIndex", "()F", "getVariance", "getMean", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccelSnapshot {
        public static final int $stable = 0;
        private final float activityIndex;
        private final float mean;
        private final float variance;

        public static /* synthetic */ AccelSnapshot copy$default(AccelSnapshot accelSnapshot, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = accelSnapshot.activityIndex;
            }
            if ((i & 2) != 0) {
                f2 = accelSnapshot.variance;
            }
            if ((i & 4) != 0) {
                f3 = accelSnapshot.mean;
            }
            return accelSnapshot.copy(f, f2, f3);
        }

        /* renamed from: component1, reason: from getter */
        public final float getActivityIndex() {
            return this.activityIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final float getVariance() {
            return this.variance;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMean() {
            return this.mean;
        }

        public final AccelSnapshot copy(float activityIndex, float variance, float mean) {
            return new AccelSnapshot(activityIndex, variance, mean);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccelSnapshot)) {
                return false;
            }
            AccelSnapshot accelSnapshot = (AccelSnapshot) other;
            return Float.compare(this.activityIndex, accelSnapshot.activityIndex) == 0 && Float.compare(this.variance, accelSnapshot.variance) == 0 && Float.compare(this.mean, accelSnapshot.mean) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.activityIndex) * 31) + Float.hashCode(this.variance)) * 31) + Float.hashCode(this.mean);
        }

        public String toString() {
            return "AccelSnapshot(activityIndex=" + this.activityIndex + ", variance=" + this.variance + ", mean=" + this.mean + ")";
        }

        public AccelSnapshot(float f, float f2, float f3) {
            this.activityIndex = f;
            this.variance = f2;
            this.mean = f3;
        }

        public final float getActivityIndex() {
            return this.activityIndex;
        }

        public final float getVariance() {
            return this.variance;
        }

        public final float getMean() {
            return this.mean;
        }
    }
}
