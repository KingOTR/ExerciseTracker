package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepTrackingLiveStats.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/SleepTrackingLiveStats;", "", "<init>", "()V", "fromContext", "Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;", "context", "Landroid/content/Context;", "fromSamples", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "micActive", "", "calibrationDone", "fromContextWithCoverage", "Live", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTrackingLiveStats {
    public static final int $stable = 0;
    public static final SleepTrackingLiveStats INSTANCE = new SleepTrackingLiveStats();

    private SleepTrackingLiveStats() {
    }

    /* compiled from: SleepTrackingLiveStats.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00063"}, d2 = {"Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;", "", "trackedMin", "", "restlessness", "quietPercent", "snoreLikelihood", "stageHint", "", "micActive", "", "phoneStable", "calibrationDone", "asleepPercent", "micCoveragePercent", "confidencePercent", "breathBpm", "<init>", "(IIIILjava/lang/String;ZZZIIII)V", "getTrackedMin", "()I", "getRestlessness", "getQuietPercent", "getSnoreLikelihood", "getStageHint", "()Ljava/lang/String;", "getMicActive", "()Z", "getPhoneStable", "getCalibrationDone", "getAsleepPercent", "getMicCoveragePercent", "getConfidencePercent", "getBreathBpm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Live {
        public static final int $stable = 0;
        private final int asleepPercent;
        private final int breathBpm;
        private final boolean calibrationDone;
        private final int confidencePercent;
        private final boolean micActive;
        private final int micCoveragePercent;
        private final boolean phoneStable;
        private final int quietPercent;
        private final int restlessness;
        private final int snoreLikelihood;
        private final String stageHint;
        private final int trackedMin;

        public static /* synthetic */ Live copy$default(Live live, int i, int i2, int i3, int i4, String str, boolean z, boolean z2, boolean z3, int i5, int i6, int i7, int i8, int i9, Object obj) {
            return live.copy((i9 & 1) != 0 ? live.trackedMin : i, (i9 & 2) != 0 ? live.restlessness : i2, (i9 & 4) != 0 ? live.quietPercent : i3, (i9 & 8) != 0 ? live.snoreLikelihood : i4, (i9 & 16) != 0 ? live.stageHint : str, (i9 & 32) != 0 ? live.micActive : z, (i9 & 64) != 0 ? live.phoneStable : z2, (i9 & 128) != 0 ? live.calibrationDone : z3, (i9 & 256) != 0 ? live.asleepPercent : i5, (i9 & 512) != 0 ? live.micCoveragePercent : i6, (i9 & 1024) != 0 ? live.confidencePercent : i7, (i9 & 2048) != 0 ? live.breathBpm : i8);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTrackedMin() {
            return this.trackedMin;
        }

        /* renamed from: component10, reason: from getter */
        public final int getMicCoveragePercent() {
            return this.micCoveragePercent;
        }

        /* renamed from: component11, reason: from getter */
        public final int getConfidencePercent() {
            return this.confidencePercent;
        }

        /* renamed from: component12, reason: from getter */
        public final int getBreathBpm() {
            return this.breathBpm;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRestlessness() {
            return this.restlessness;
        }

        /* renamed from: component3, reason: from getter */
        public final int getQuietPercent() {
            return this.quietPercent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSnoreLikelihood() {
            return this.snoreLikelihood;
        }

        /* renamed from: component5, reason: from getter */
        public final String getStageHint() {
            return this.stageHint;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getMicActive() {
            return this.micActive;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getPhoneStable() {
            return this.phoneStable;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCalibrationDone() {
            return this.calibrationDone;
        }

        /* renamed from: component9, reason: from getter */
        public final int getAsleepPercent() {
            return this.asleepPercent;
        }

        public final Live copy(int trackedMin, int restlessness, int quietPercent, int snoreLikelihood, String stageHint, boolean micActive, boolean phoneStable, boolean calibrationDone, int asleepPercent, int micCoveragePercent, int confidencePercent, int breathBpm) {
            Intrinsics.checkNotNullParameter(stageHint, "stageHint");
            return new Live(trackedMin, restlessness, quietPercent, snoreLikelihood, stageHint, micActive, phoneStable, calibrationDone, asleepPercent, micCoveragePercent, confidencePercent, breathBpm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Live)) {
                return false;
            }
            Live live = (Live) other;
            return this.trackedMin == live.trackedMin && this.restlessness == live.restlessness && this.quietPercent == live.quietPercent && this.snoreLikelihood == live.snoreLikelihood && Intrinsics.areEqual(this.stageHint, live.stageHint) && this.micActive == live.micActive && this.phoneStable == live.phoneStable && this.calibrationDone == live.calibrationDone && this.asleepPercent == live.asleepPercent && this.micCoveragePercent == live.micCoveragePercent && this.confidencePercent == live.confidencePercent && this.breathBpm == live.breathBpm;
        }

        public int hashCode() {
            return (((((((((((((((((((((Integer.hashCode(this.trackedMin) * 31) + Integer.hashCode(this.restlessness)) * 31) + Integer.hashCode(this.quietPercent)) * 31) + Integer.hashCode(this.snoreLikelihood)) * 31) + this.stageHint.hashCode()) * 31) + Boolean.hashCode(this.micActive)) * 31) + Boolean.hashCode(this.phoneStable)) * 31) + Boolean.hashCode(this.calibrationDone)) * 31) + Integer.hashCode(this.asleepPercent)) * 31) + Integer.hashCode(this.micCoveragePercent)) * 31) + Integer.hashCode(this.confidencePercent)) * 31) + Integer.hashCode(this.breathBpm);
        }

        public String toString() {
            return "Live(trackedMin=" + this.trackedMin + ", restlessness=" + this.restlessness + ", quietPercent=" + this.quietPercent + ", snoreLikelihood=" + this.snoreLikelihood + ", stageHint=" + this.stageHint + ", micActive=" + this.micActive + ", phoneStable=" + this.phoneStable + ", calibrationDone=" + this.calibrationDone + ", asleepPercent=" + this.asleepPercent + ", micCoveragePercent=" + this.micCoveragePercent + ", confidencePercent=" + this.confidencePercent + ", breathBpm=" + this.breathBpm + ")";
        }

        public Live(int i, int i2, int i3, int i4, String stageHint, boolean z, boolean z2, boolean z3, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(stageHint, "stageHint");
            this.trackedMin = i;
            this.restlessness = i2;
            this.quietPercent = i3;
            this.snoreLikelihood = i4;
            this.stageHint = stageHint;
            this.micActive = z;
            this.phoneStable = z2;
            this.calibrationDone = z3;
            this.asleepPercent = i5;
            this.micCoveragePercent = i6;
            this.confidencePercent = i7;
            this.breathBpm = i8;
        }

        public /* synthetic */ Live(int i, int i2, int i3, int i4, String str, boolean z, boolean z2, boolean z3, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, i4, str, z, z2, z3, (i9 & 256) != 0 ? 0 : i5, (i9 & 512) != 0 ? 100 : i6, (i9 & 1024) != 0 ? 0 : i7, (i9 & 2048) != 0 ? 0 : i8);
        }

        public final int getTrackedMin() {
            return this.trackedMin;
        }

        public final int getRestlessness() {
            return this.restlessness;
        }

        public final int getQuietPercent() {
            return this.quietPercent;
        }

        public final int getSnoreLikelihood() {
            return this.snoreLikelihood;
        }

        public final String getStageHint() {
            return this.stageHint;
        }

        public final boolean getMicActive() {
            return this.micActive;
        }

        public final boolean getPhoneStable() {
            return this.phoneStable;
        }

        public final boolean getCalibrationDone() {
            return this.calibrationDone;
        }

        public final int getAsleepPercent() {
            return this.asleepPercent;
        }

        public final int getMicCoveragePercent() {
            return this.micCoveragePercent;
        }

        public final int getConfidencePercent() {
            return this.confidencePercent;
        }

        public final int getBreathBpm() {
            return this.breathBpm;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Live fromContext(Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        int sampleCount = SleepOvernightStore.INSTANCE.sampleCount(context);
        List<SleepTrackSample> loadRecentSamples = SleepOvernightStore.INSTANCE.loadRecentSamples(context, 72);
        if (SleepOvernightStore.INSTANCE.baselineAudioRms(context) <= 0.0f) {
            List<SleepTrackSample> list = loadRecentSamples;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SleepTrackSample) it.next()).getAudioLevel() > 0.0f) {
                    }
                }
            }
            z = false;
            return fromSamples(loadRecentSamples, z, sampleCount >= 6);
        }
        z = true;
        return fromSamples(loadRecentSamples, z, sampleCount >= 6);
    }

    public final Live fromSamples(List<SleepTrackSample> samples, boolean micActive, boolean calibrationDone) {
        int i;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty()) {
            return new Live(0, 0, 0, 0, "Listening…", micActive, true, false, 0, 0, 0, 0, 3328, null);
        }
        List takeLast = CollectionsKt.takeLast(samples, 36);
        List<SleepTrackSample> list = takeLast;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepTrackSample) it.next()).getMovement()));
        }
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
        boolean z2 = list instanceof Collection;
        if (z2 && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((SleepTrackSample) it2.next()).getQuietFraction() > 0.55f && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt((i * 100.0f) / takeLast.size()), 0, 100);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((SleepTrackSample) it3.next()).getSnoreLikelihood()));
        }
        float averageOfFloat2 = (float) CollectionsKt.averageOfFloat(arrayList2);
        int coerceIn2 = RangesKt.coerceIn(MathKt.roundToInt(100.0f * averageOfFloat2), 0, 100);
        int coerceIn3 = RangesKt.coerceIn(MathKt.roundToInt((40.0f * averageOfFloat) + ((100 - coerceIn) * 0.35f) + (averageOfFloat2 * 25.0f)), 0, 100);
        List takeLast2 = CollectionsKt.takeLast(takeLast, 6);
        if (!(takeLast2 instanceof Collection) || !takeLast2.isEmpty()) {
            Iterator it4 = takeLast2.iterator();
            while (it4.hasNext()) {
                if (((SleepTrackSample) it4.next()).getMovement() > 1.35f) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z2 && list.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (SleepTrackSample sleepTrackSample : list) {
                if (sleepTrackSample.getMovement() < 0.45f && sleepTrackSample.getQuietFraction() > 0.5f && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        String str = !calibrationDone ? "Warming up…" : !z ? "Phone moving — keep bedside still" : !micActive ? "Movement only (mic off)" : i2 >= takeLast.size() / 2 ? "Mostly still — likely asleep" : averageOfFloat > 0.9f ? "Active — awake or restless" : "Light activity — drifting";
        int coerceAtLeast = RangesKt.coerceAtLeast((int) (((SleepTrackSample) CollectionsKt.last((List) samples)).getElapsedMs() / 60000), 0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            Float asleepProb = ((SleepTrackSample) it5.next()).getAsleepProb();
            if (asleepProb != null) {
                arrayList3.add(asleepProb);
            }
        }
        Double valueOf = Double.valueOf(CollectionsKt.averageOfFloat(arrayList3));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        double d = 100;
        int coerceIn4 = RangesKt.coerceIn(MathKt.roundToInt((valueOf != null ? valueOf.doubleValue() : 0.0d) * d), 0, 100);
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Float stageConfidence = ((SleepTrackSample) it6.next()).getStageConfidence();
            if (stageConfidence != null) {
                arrayList4.add(stageConfidence);
            }
        }
        Double valueOf2 = Double.valueOf(CollectionsKt.averageOfFloat(arrayList4));
        if (Double.isNaN(valueOf2.doubleValue())) {
            valueOf2 = null;
        }
        int coerceIn5 = RangesKt.coerceIn(MathKt.roundToInt((valueOf2 != null ? valueOf2.doubleValue() : 0.0d) * d), 0, 100);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList5.add(Float.valueOf(((SleepTrackSample) it7.next()).getBreathRateBpm()));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList5) {
            if (((Number) obj).floatValue() > 0.0f) {
                arrayList6.add(obj);
            }
        }
        Double valueOf3 = Double.valueOf(CollectionsKt.averageOfFloat(arrayList6));
        Double d2 = Double.isNaN(valueOf3.doubleValue()) ? null : valueOf3;
        return new Live(coerceAtLeast, coerceIn3, coerceIn, coerceIn2, str, micActive, z, calibrationDone, coerceIn4, 100, coerceIn5, d2 != null ? RangesKt.coerceIn(MathKt.roundToInt(d2.doubleValue()), 0, 30) : 0);
    }

    public final Live fromContextWithCoverage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Live.copy$default(fromContext(context), 0, 0, 0, 0, null, false, false, false, 0, RangesKt.coerceIn(MathKt.roundToInt(SleepMicCoverage.INSTANCE.fromSamples(SleepOvernightStore.INSTANCE.loadRecentSamples(context, SleepScience.TYPICAL_MIN_MIN), RangesKt.coerceAtLeast((int) ((System.currentTimeMillis() - SleepOvernightStore.INSTANCE.startedAtMs(context)) / 60000), 1), SleepOvernightStore.INSTANCE.micGapMs(context), SleepOvernightStore.INSTANCE.micGapCount(context)).getCoverageRatio() * 100), 0, 100), 0, 0, 3583, null);
    }
}
