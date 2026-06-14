package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepBreathingDisruptionAnalyzer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u001c\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0017\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer;", "", "<init>", "()V", "PAUSE_QUIET_FRAC", "", "PAUSE_MAX_SNORE", "MIN_PAUSE_BUCKETS", "", "BUCKET_SEC", "analyze", "Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$NightMetrics;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "trackedMinutes", "isPauseBucket", "", "s", "findPauseClusters", "Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$PauseCluster;", "detectPauseInWindow", "rmsSeries", "baselineRms", "NightMetrics", "PauseCluster", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepBreathingDisruptionAnalyzer {
    public static final int $stable = 0;
    private static final int BUCKET_SEC = 10;
    public static final SleepBreathingDisruptionAnalyzer INSTANCE = new SleepBreathingDisruptionAnalyzer();
    private static final int MIN_PAUSE_BUCKETS = 2;
    private static final float PAUSE_MAX_SNORE = 0.12f;
    private static final float PAUSE_QUIET_FRAC = 0.82f;

    private SleepBreathingDisruptionAnalyzer() {
    }

    /* compiled from: SleepBreathingDisruptionAnalyzer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$NightMetrics;", "", "disruptionsPerHour", "", "clusterCount", "", "longestPauseSec", "recoveryBreaths", "breathPauseMinutes", "<init>", "(FIIII)V", "getDisruptionsPerHour", "()F", "getClusterCount", "()I", "getLongestPauseSec", "getRecoveryBreaths", "getBreathPauseMinutes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightMetrics {
        public static final int $stable = 0;
        private final int breathPauseMinutes;
        private final int clusterCount;
        private final float disruptionsPerHour;
        private final int longestPauseSec;
        private final int recoveryBreaths;

        public static /* synthetic */ NightMetrics copy$default(NightMetrics nightMetrics, float f, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f = nightMetrics.disruptionsPerHour;
            }
            if ((i5 & 2) != 0) {
                i = nightMetrics.clusterCount;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                i2 = nightMetrics.longestPauseSec;
            }
            int i7 = i2;
            if ((i5 & 8) != 0) {
                i3 = nightMetrics.recoveryBreaths;
            }
            int i8 = i3;
            if ((i5 & 16) != 0) {
                i4 = nightMetrics.breathPauseMinutes;
            }
            return nightMetrics.copy(f, i6, i7, i8, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getDisruptionsPerHour() {
            return this.disruptionsPerHour;
        }

        /* renamed from: component2, reason: from getter */
        public final int getClusterCount() {
            return this.clusterCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLongestPauseSec() {
            return this.longestPauseSec;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRecoveryBreaths() {
            return this.recoveryBreaths;
        }

        /* renamed from: component5, reason: from getter */
        public final int getBreathPauseMinutes() {
            return this.breathPauseMinutes;
        }

        public final NightMetrics copy(float disruptionsPerHour, int clusterCount, int longestPauseSec, int recoveryBreaths, int breathPauseMinutes) {
            return new NightMetrics(disruptionsPerHour, clusterCount, longestPauseSec, recoveryBreaths, breathPauseMinutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightMetrics)) {
                return false;
            }
            NightMetrics nightMetrics = (NightMetrics) other;
            return Float.compare(this.disruptionsPerHour, nightMetrics.disruptionsPerHour) == 0 && this.clusterCount == nightMetrics.clusterCount && this.longestPauseSec == nightMetrics.longestPauseSec && this.recoveryBreaths == nightMetrics.recoveryBreaths && this.breathPauseMinutes == nightMetrics.breathPauseMinutes;
        }

        public int hashCode() {
            return (((((((Float.hashCode(this.disruptionsPerHour) * 31) + Integer.hashCode(this.clusterCount)) * 31) + Integer.hashCode(this.longestPauseSec)) * 31) + Integer.hashCode(this.recoveryBreaths)) * 31) + Integer.hashCode(this.breathPauseMinutes);
        }

        public String toString() {
            return "NightMetrics(disruptionsPerHour=" + this.disruptionsPerHour + ", clusterCount=" + this.clusterCount + ", longestPauseSec=" + this.longestPauseSec + ", recoveryBreaths=" + this.recoveryBreaths + ", breathPauseMinutes=" + this.breathPauseMinutes + ")";
        }

        public NightMetrics(float f, int i, int i2, int i3, int i4) {
            this.disruptionsPerHour = f;
            this.clusterCount = i;
            this.longestPauseSec = i2;
            this.recoveryBreaths = i3;
            this.breathPauseMinutes = i4;
        }

        public final float getDisruptionsPerHour() {
            return this.disruptionsPerHour;
        }

        public final int getClusterCount() {
            return this.clusterCount;
        }

        public final int getLongestPauseSec() {
            return this.longestPauseSec;
        }

        public final int getRecoveryBreaths() {
            return this.recoveryBreaths;
        }

        public final int getBreathPauseMinutes() {
            return this.breathPauseMinutes;
        }
    }

    public final NightMetrics analyze(List<SleepTrackSample> samples, int trackedMinutes) {
        Integer num;
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty() || trackedMinutes <= 0) {
            return new NightMetrics(0.0f, 0, 0, 0, 0);
        }
        List<PauseCluster> findPauseClusters = findPauseClusters(samples);
        List<PauseCluster> list = findPauseClusters;
        Iterator<T> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((PauseCluster) it.next()).getBucketCount();
        }
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            Integer valueOf = Integer.valueOf(((PauseCluster) it2.next()).getBucketCount());
            while (it2.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((PauseCluster) it2.next()).getBucketCount());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        Integer num2 = num;
        int intValue = num2 != null ? num2.intValue() * 10 : 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (((PauseCluster) it3.next()).getHadRecoveryBreath() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return new NightMetrics((float) (findPauseClusters.size() / RangesKt.coerceAtLeast(trackedMinutes / 60.0d, 0.1d)), findPauseClusters.size(), intValue, i, MathKt.roundToInt((i2 * 10) / 60.0d));
    }

    public final boolean isPauseBucket(SleepTrackSample s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (Intrinsics.areEqual((Object) s.getBreathPause(), (Object) true)) {
            return true;
        }
        return s.getQuietFraction() >= PAUSE_QUIET_FRAC && s.getSnoreLikelihood() < 0.12f && s.getBreathRateBpm() <= 0.0f && !Intrinsics.areEqual(s.getEventTag(), "snore") && !Intrinsics.areEqual(s.getEventTag(), "talk");
    }

    /* compiled from: SleepBreathingDisruptionAnalyzer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/sleep/SleepBreathingDisruptionAnalyzer$PauseCluster;", "", "bucketCount", "", "hadRecoveryBreath", "", "<init>", "(IZ)V", "getBucketCount", "()I", "getHadRecoveryBreath", "()Z", "component1", "component2", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class PauseCluster {
        private final int bucketCount;
        private final boolean hadRecoveryBreath;

        public static /* synthetic */ PauseCluster copy$default(PauseCluster pauseCluster, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pauseCluster.bucketCount;
            }
            if ((i2 & 2) != 0) {
                z = pauseCluster.hadRecoveryBreath;
            }
            return pauseCluster.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getBucketCount() {
            return this.bucketCount;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHadRecoveryBreath() {
            return this.hadRecoveryBreath;
        }

        public final PauseCluster copy(int bucketCount, boolean hadRecoveryBreath) {
            return new PauseCluster(bucketCount, hadRecoveryBreath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PauseCluster)) {
                return false;
            }
            PauseCluster pauseCluster = (PauseCluster) other;
            return this.bucketCount == pauseCluster.bucketCount && this.hadRecoveryBreath == pauseCluster.hadRecoveryBreath;
        }

        public int hashCode() {
            return (Integer.hashCode(this.bucketCount) * 31) + Boolean.hashCode(this.hadRecoveryBreath);
        }

        public String toString() {
            return "PauseCluster(bucketCount=" + this.bucketCount + ", hadRecoveryBreath=" + this.hadRecoveryBreath + ")";
        }

        public PauseCluster(int i, boolean z) {
            this.bucketCount = i;
            this.hadRecoveryBreath = z;
        }

        public final int getBucketCount() {
            return this.bucketCount;
        }

        public final boolean getHadRecoveryBreath() {
            return this.hadRecoveryBreath;
        }
    }

    private final List<PauseCluster> findPauseClusters(List<SleepTrackSample> samples) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < samples.size(); i2++) {
            if (isPauseBucket(samples.get(i2))) {
                i++;
            } else {
                if (i >= 2) {
                    if (i2 < samples.size()) {
                        float breathRateBpm = samples.get(i2).getBreathRateBpm();
                        if (8.0f <= breathRateBpm && breathRateBpm <= 28.0f && samples.get(i2).getBreathRegularity() >= 0.2f) {
                            z = true;
                            arrayList.add(new PauseCluster(i, z));
                        }
                    }
                    z = false;
                    arrayList.add(new PauseCluster(i, z));
                }
                i = 0;
            }
        }
        if (i >= 2) {
            arrayList.add(new PauseCluster(i, false));
        }
        return arrayList;
    }

    public final boolean detectPauseInWindow(List<Float> rmsSeries, float baselineRms) {
        Intrinsics.checkNotNullParameter(rmsSeries, "rmsSeries");
        if (rmsSeries.size() < 4) {
            return false;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(baselineRms, 50.0f) * 1.08f;
        Iterator<Float> it = rmsSeries.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().floatValue() <= coerceAtLeast) {
                i2++;
                i = Math.max(i, i2);
            } else {
                i2 = 0;
            }
        }
        return i >= RangesKt.coerceAtLeast((int) (((float) rmsSeries.size()) * 0.55f), 4);
    }
}
