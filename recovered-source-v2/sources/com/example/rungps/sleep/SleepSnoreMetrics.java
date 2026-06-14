package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepSnoreMetrics.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/SleepSnoreMetrics;", "", "<init>", "()V", "BUCKET_SEC", "", "LIGHT", "", "LOUD", "EPIC", "analyze", "Lcom/example/rungps/sleep/SleepSnoreMetrics$NightMetrics;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "trackedMinutes", "intensityFromLikelihood", "likelihood", "intensityFromRmsNorm", "norm", "baseline", "computeSnoreScore", "perHour", "pct", "epic", "loud", "NightMetrics", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSnoreMetrics {
    public static final int $stable = 0;
    private static final int BUCKET_SEC = 10;
    private static final float EPIC = 0.75f;
    public static final SleepSnoreMetrics INSTANCE = new SleepSnoreMetrics();
    private static final float LIGHT = 0.25f;
    private static final float LOUD = 0.5f;

    public final int intensityFromLikelihood(float likelihood) {
        if (likelihood >= 0.75f) {
            return 3;
        }
        if (likelihood >= 0.5f) {
            return 2;
        }
        return likelihood >= 0.25f ? 1 : 0;
    }

    private SleepSnoreMetrics() {
    }

    /* compiled from: SleepSnoreMetrics.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"Lcom/example/rungps/sleep/SleepSnoreMetrics$NightMetrics;", "", "snoresPerHour", "", "percentNightSnoring", "lightMinutes", "", "loudMinutes", "epicMinutes", "snoreScore", "<init>", "(FFIIII)V", "getSnoresPerHour", "()F", "getPercentNightSnoring", "getLightMinutes", "()I", "getLoudMinutes", "getEpicMinutes", "getSnoreScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightMetrics {
        public static final int $stable = 0;
        private final int epicMinutes;
        private final int lightMinutes;
        private final int loudMinutes;
        private final float percentNightSnoring;
        private final int snoreScore;
        private final float snoresPerHour;

        public static /* synthetic */ NightMetrics copy$default(NightMetrics nightMetrics, float f, float f2, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f = nightMetrics.snoresPerHour;
            }
            if ((i5 & 2) != 0) {
                f2 = nightMetrics.percentNightSnoring;
            }
            float f3 = f2;
            if ((i5 & 4) != 0) {
                i = nightMetrics.lightMinutes;
            }
            int i6 = i;
            if ((i5 & 8) != 0) {
                i2 = nightMetrics.loudMinutes;
            }
            int i7 = i2;
            if ((i5 & 16) != 0) {
                i3 = nightMetrics.epicMinutes;
            }
            int i8 = i3;
            if ((i5 & 32) != 0) {
                i4 = nightMetrics.snoreScore;
            }
            return nightMetrics.copy(f, f3, i6, i7, i8, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getSnoresPerHour() {
            return this.snoresPerHour;
        }

        /* renamed from: component2, reason: from getter */
        public final float getPercentNightSnoring() {
            return this.percentNightSnoring;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLightMinutes() {
            return this.lightMinutes;
        }

        /* renamed from: component4, reason: from getter */
        public final int getLoudMinutes() {
            return this.loudMinutes;
        }

        /* renamed from: component5, reason: from getter */
        public final int getEpicMinutes() {
            return this.epicMinutes;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSnoreScore() {
            return this.snoreScore;
        }

        public final NightMetrics copy(float snoresPerHour, float percentNightSnoring, int lightMinutes, int loudMinutes, int epicMinutes, int snoreScore) {
            return new NightMetrics(snoresPerHour, percentNightSnoring, lightMinutes, loudMinutes, epicMinutes, snoreScore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightMetrics)) {
                return false;
            }
            NightMetrics nightMetrics = (NightMetrics) other;
            return Float.compare(this.snoresPerHour, nightMetrics.snoresPerHour) == 0 && Float.compare(this.percentNightSnoring, nightMetrics.percentNightSnoring) == 0 && this.lightMinutes == nightMetrics.lightMinutes && this.loudMinutes == nightMetrics.loudMinutes && this.epicMinutes == nightMetrics.epicMinutes && this.snoreScore == nightMetrics.snoreScore;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.snoresPerHour) * 31) + Float.hashCode(this.percentNightSnoring)) * 31) + Integer.hashCode(this.lightMinutes)) * 31) + Integer.hashCode(this.loudMinutes)) * 31) + Integer.hashCode(this.epicMinutes)) * 31) + Integer.hashCode(this.snoreScore);
        }

        public String toString() {
            return "NightMetrics(snoresPerHour=" + this.snoresPerHour + ", percentNightSnoring=" + this.percentNightSnoring + ", lightMinutes=" + this.lightMinutes + ", loudMinutes=" + this.loudMinutes + ", epicMinutes=" + this.epicMinutes + ", snoreScore=" + this.snoreScore + ")";
        }

        public NightMetrics(float f, float f2, int i, int i2, int i3, int i4) {
            this.snoresPerHour = f;
            this.percentNightSnoring = f2;
            this.lightMinutes = i;
            this.loudMinutes = i2;
            this.epicMinutes = i3;
            this.snoreScore = i4;
        }

        public final float getSnoresPerHour() {
            return this.snoresPerHour;
        }

        public final float getPercentNightSnoring() {
            return this.percentNightSnoring;
        }

        public final int getLightMinutes() {
            return this.lightMinutes;
        }

        public final int getLoudMinutes() {
            return this.loudMinutes;
        }

        public final int getEpicMinutes() {
            return this.epicMinutes;
        }

        public final int getSnoreScore() {
            return this.snoreScore;
        }
    }

    public final NightMetrics analyze(List<SleepTrackSample> samples, int trackedMinutes) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty() || trackedMinutes <= 0) {
            return new NightMetrics(0.0f, 0.0f, 0, 0, 0, 0);
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (SleepTrackSample sleepTrackSample : samples) {
            Integer snoreIntensity = sleepTrackSample.getSnoreIntensity();
            int intValue = snoreIntensity != null ? snoreIntensity.intValue() : intensityFromLikelihood(sleepTrackSample.getSnoreLikelihood());
            if (intValue >= 3 || sleepTrackSample.getSnoreLikelihood() >= 0.75f) {
                i2++;
            } else if (intValue >= 2 || sleepTrackSample.getSnoreLikelihood() >= 0.5f) {
                i3++;
            } else if (intValue >= 1 || sleepTrackSample.getSnoreLikelihood() >= 0.25f) {
                i4++;
            }
            if (sleepTrackSample.getSnoreLikelihood() < 0.25f && !Intrinsics.areEqual(sleepTrackSample.getEventTag(), "snore")) {
                Integer snoreIntensity2 = sleepTrackSample.getSnoreIntensity();
                if ((snoreIntensity2 != null ? snoreIntensity2.intValue() : 0) >= 1) {
                }
            }
            i++;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(trackedMinutes / 60.0d, 0.1d);
        float coerceIn = RangesKt.coerceIn((float) ((MathKt.roundToInt(r10 * 0.16666666666666666d) * 100.0d) / RangesKt.coerceAtLeast(trackedMinutes, 1)), 0.0f, 100.0f);
        float f = (float) (i / coerceAtLeast);
        return new NightMetrics(f, coerceIn, MathKt.roundToInt(i4 * 0.16666666666666666d), MathKt.roundToInt(i3 * 0.16666666666666666d), MathKt.roundToInt(i2 * 0.16666666666666666d), computeSnoreScore(f, coerceIn, i2, i3));
    }

    public final int intensityFromRmsNorm(float norm, float baseline) {
        float coerceAtLeast = norm / RangesKt.coerceAtLeast(baseline, 50.0f);
        if (coerceAtLeast >= 4.5f) {
            return 3;
        }
        if (coerceAtLeast >= 3.2f) {
            return 2;
        }
        return coerceAtLeast >= 2.8f ? 1 : 0;
    }

    private final int computeSnoreScore(float perHour, float pct, int epic, int loud) {
        return MathKt.roundToInt(RangesKt.coerceIn((perHour * 4.0f) + (pct * 0.35f) + (epic * 2.5f) + (loud * 1.2f), 0.0f, 100.0f));
    }
}
