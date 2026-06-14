package com.example.rungps.health;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepEntryValidator;
import com.example.rungps.sleep.SleepScience;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: SleepScoring.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007JB\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0002\u0010\u001aJ?\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001fJ$\u0010 \u001a\u0004\u0018\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0016J\u0016\u0010$\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0002J\u001e\u0010&\u001a\u00020'2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\u0006\u0010(\u001a\u00020\nH\u0002J%\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010,JW\u0010-\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010/JC\u00100\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u00101¨\u00064"}, d2 = {"Lcom/example/rungps/health/SleepScoring;", "", "<init>", "()V", "isSleepCycleSource", "", Property.SYMBOL_Z_ORDER_SOURCE, "", "isOvernightSource", "effectiveAsleepMinutes", "", "totalSleepMin", "startTimeMs", "", "endTimeMs", "sourcePriority", "computeScorePillars", "Lcom/example/rungps/health/SleepScoring$SleepScorePillars;", "inBedMin", "efficiency", "restlessness", "bedMinsRecent", "", "wakeMinsRecent", "efficiencyPercent", "asleepMin", "(II)Ljava/lang/Integer;", "resolveEfficiency", "stored", "deepMin", "lightMin", "(Ljava/lang/Integer;IILjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "sleepRhythm", "Lcom/example/rungps/health/SleepScoring$SleepRhythm;", "bedMins", "wakeMins", "circularMeanMinutes", "mins", "circularMeanDeviationMinutes", "", "mean", "sleepCycleStyleScore", "totalMin", "eff", "(IILjava/lang/Integer;)I", "resolveQuality", "externalQuality", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)I", "scoreQuality", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)I", "SleepScorePillars", "SleepRhythm", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepScoring {
    public static final int $stable = 0;
    public static final SleepScoring INSTANCE = new SleepScoring();

    private SleepScoring() {
    }

    public final boolean isSleepCycleSource(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String lowerCase = source.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "sleep_cycle", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "sleepcycle", false, 2, (Object) null);
    }

    public final boolean isOvernightSource(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return StringsKt.contains((CharSequence) source, (CharSequence) "rungps_overnight", true);
    }

    public final int effectiveAsleepMinutes(int totalSleepMin, long startTimeMs, long endTimeMs, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return RangesKt.coerceIn(RangesKt.coerceAtLeast(totalSleepMin, 0), 0, RangesKt.coerceAtLeast((int) (RangesKt.coerceAtLeast(endTimeMs - startTimeMs, 0L) / 60000), 1));
    }

    public final int sourcePriority(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (isSleepCycleSource(source)) {
            return 100;
        }
        if (isOvernightSource(source)) {
            return 90;
        }
        String str = source;
        if (StringsKt.contains((CharSequence) str, (CharSequence) "samsung", true)) {
            return 80;
        }
        return StringsKt.contains((CharSequence) str, (CharSequence) "health_connect", true) ? 50 : 10;
    }

    /* compiled from: SleepScoring.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/health/SleepScoring$SleepScorePillars;", "", "routine", "", "quality", "duration", "combined", "<init>", "(IIII)V", "getRoutine", "()I", "getQuality", "getDuration", "getCombined", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepScorePillars {
        public static final int $stable = 0;
        private final int combined;
        private final int duration;
        private final int quality;
        private final int routine;

        public static /* synthetic */ SleepScorePillars copy$default(SleepScorePillars sleepScorePillars, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = sleepScorePillars.routine;
            }
            if ((i5 & 2) != 0) {
                i2 = sleepScorePillars.quality;
            }
            if ((i5 & 4) != 0) {
                i3 = sleepScorePillars.duration;
            }
            if ((i5 & 8) != 0) {
                i4 = sleepScorePillars.combined;
            }
            return sleepScorePillars.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRoutine() {
            return this.routine;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuality() {
            return this.quality;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCombined() {
            return this.combined;
        }

        public final SleepScorePillars copy(int routine, int quality, int duration, int combined) {
            return new SleepScorePillars(routine, quality, duration, combined);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepScorePillars)) {
                return false;
            }
            SleepScorePillars sleepScorePillars = (SleepScorePillars) other;
            return this.routine == sleepScorePillars.routine && this.quality == sleepScorePillars.quality && this.duration == sleepScorePillars.duration && this.combined == sleepScorePillars.combined;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.routine) * 31) + Integer.hashCode(this.quality)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.combined);
        }

        public String toString() {
            return "SleepScorePillars(routine=" + this.routine + ", quality=" + this.quality + ", duration=" + this.duration + ", combined=" + this.combined + ")";
        }

        public SleepScorePillars(int i, int i2, int i3, int i4) {
            this.routine = i;
            this.quality = i2;
            this.duration = i3;
            this.combined = i4;
        }

        public final int getRoutine() {
            return this.routine;
        }

        public final int getQuality() {
            return this.quality;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final int getCombined() {
            return this.combined;
        }
    }

    public final SleepScorePillars computeScorePillars(int totalSleepMin, int inBedMin, int efficiency, int restlessness, List<Integer> bedMinsRecent, List<Integer> wakeMinsRecent) {
        Intrinsics.checkNotNullParameter(bedMinsRecent, "bedMinsRecent");
        Intrinsics.checkNotNullParameter(wakeMinsRecent, "wakeMinsRecent");
        SleepRhythm sleepRhythm = sleepRhythm(bedMinsRecent, wakeMinsRecent);
        int regularityScore = sleepRhythm != null ? sleepRhythm.getRegularityScore() : 70;
        int coerceIn = RangesKt.coerceIn((int) ((efficiency * 0.55d) + ((100 - RangesKt.coerceIn(restlessness, 0, 100)) * 0.45d)), 0, 100);
        int durationScore = SleepScience.INSTANCE.durationScore(totalSleepMin);
        return new SleepScorePillars(regularityScore, coerceIn, durationScore, RangesKt.coerceIn((int) ((regularityScore * 0.3d) + (coerceIn * 0.45d) + (durationScore * 0.25d)), 0, 100));
    }

    public final Integer efficiencyPercent(int asleepMin, int inBedMin) {
        if (inBedMin <= 0 || asleepMin <= 0) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceIn((int) ((asleepMin * 100.0d) / inBedMin), 0, 100));
    }

    public static /* synthetic */ Integer resolveEfficiency$default(SleepScoring sleepScoring, Integer num, int i, int i2, Integer num2, Integer num3, int i3, Object obj) {
        return sleepScoring.resolveEfficiency(num, i, i2, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3);
    }

    public final Integer resolveEfficiency(Integer stored, int asleepMin, int inBedMin, Integer deepMin, Integer lightMin) {
        if (stored != null) {
            return Integer.valueOf(RangesKt.coerceIn(stored.intValue(), 0, 100));
        }
        if (deepMin != null || lightMin != null) {
            return efficiencyPercent(asleepMin, inBedMin);
        }
        if (asleepMin < inBedMin) {
            return efficiencyPercent(asleepMin, inBedMin);
        }
        return null;
    }

    /* compiled from: SleepScoring.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/health/SleepScoring$SleepRhythm;", "", "regularityScore", "", "avgBedMin", "avgWakeMin", "idealBedMin", "<init>", "(IIII)V", "getRegularityScore", "()I", "getAvgBedMin", "getAvgWakeMin", "getIdealBedMin", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythm {
        public static final int $stable = 0;
        private final int avgBedMin;
        private final int avgWakeMin;
        private final int idealBedMin;
        private final int regularityScore;

        public static /* synthetic */ SleepRhythm copy$default(SleepRhythm sleepRhythm, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = sleepRhythm.regularityScore;
            }
            if ((i5 & 2) != 0) {
                i2 = sleepRhythm.avgBedMin;
            }
            if ((i5 & 4) != 0) {
                i3 = sleepRhythm.avgWakeMin;
            }
            if ((i5 & 8) != 0) {
                i4 = sleepRhythm.idealBedMin;
            }
            return sleepRhythm.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRegularityScore() {
            return this.regularityScore;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAvgBedMin() {
            return this.avgBedMin;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAvgWakeMin() {
            return this.avgWakeMin;
        }

        /* renamed from: component4, reason: from getter */
        public final int getIdealBedMin() {
            return this.idealBedMin;
        }

        public final SleepRhythm copy(int regularityScore, int avgBedMin, int avgWakeMin, int idealBedMin) {
            return new SleepRhythm(regularityScore, avgBedMin, avgWakeMin, idealBedMin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythm)) {
                return false;
            }
            SleepRhythm sleepRhythm = (SleepRhythm) other;
            return this.regularityScore == sleepRhythm.regularityScore && this.avgBedMin == sleepRhythm.avgBedMin && this.avgWakeMin == sleepRhythm.avgWakeMin && this.idealBedMin == sleepRhythm.idealBedMin;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.regularityScore) * 31) + Integer.hashCode(this.avgBedMin)) * 31) + Integer.hashCode(this.avgWakeMin)) * 31) + Integer.hashCode(this.idealBedMin);
        }

        public String toString() {
            return "SleepRhythm(regularityScore=" + this.regularityScore + ", avgBedMin=" + this.avgBedMin + ", avgWakeMin=" + this.avgWakeMin + ", idealBedMin=" + this.idealBedMin + ")";
        }

        public SleepRhythm(int i, int i2, int i3, int i4) {
            this.regularityScore = i;
            this.avgBedMin = i2;
            this.avgWakeMin = i3;
            this.idealBedMin = i4;
        }

        public final int getRegularityScore() {
            return this.regularityScore;
        }

        public final int getAvgBedMin() {
            return this.avgBedMin;
        }

        public final int getAvgWakeMin() {
            return this.avgWakeMin;
        }

        public final int getIdealBedMin() {
            return this.idealBedMin;
        }
    }

    public final SleepRhythm sleepRhythm(List<Integer> bedMins, List<Integer> wakeMins) {
        Intrinsics.checkNotNullParameter(bedMins, "bedMins");
        Intrinsics.checkNotNullParameter(wakeMins, "wakeMins");
        if (bedMins.size() < 3 || wakeMins.size() < 3) {
            return null;
        }
        int circularMeanMinutes = circularMeanMinutes(bedMins);
        int circularMeanMinutes2 = circularMeanMinutes(wakeMins);
        return new SleepRhythm((int) RangesKt.coerceIn(100.0d - ((((circularMeanDeviationMinutes(bedMins, circularMeanMinutes) + circularMeanDeviationMinutes(wakeMins, circularMeanMinutes2)) / 2.0d) / 90.0d) * 100.0d), 0.0d, 100.0d), circularMeanMinutes, circularMeanMinutes2, (circularMeanMinutes2 + 960) % SleepEntryValidator.MAX_SLEEP_MIN);
    }

    private final int circularMeanMinutes(List<Integer> mins) {
        if (mins.isEmpty()) {
            return 0;
        }
        Iterator<Integer> it = mins.iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it.hasNext()) {
            double intValue = ((it.next().intValue() * 2.0d) * 3.141592653589793d) / 1440.0d;
            d += Math.sin(intValue);
            d2 += Math.cos(intValue);
        }
        double size = mins.size();
        return ((((int) ((Math.atan2(d / size, d2 / size) * 1440.0d) / 6.283185307179586d)) % SleepEntryValidator.MAX_SLEEP_MIN) + SleepEntryValidator.MAX_SLEEP_MIN) % SleepEntryValidator.MAX_SLEEP_MIN;
    }

    private final double circularMeanDeviationMinutes(List<Integer> mins, int mean) {
        if (mins.isEmpty()) {
            return 0.0d;
        }
        List<Integer> list = mins;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int abs = Math.abs(((Number) it.next()).intValue() - mean);
            arrayList.add(Double.valueOf(Math.min(abs, 1440 - abs)));
        }
        return CollectionsKt.averageOfDouble(arrayList);
    }

    public final int sleepCycleStyleScore(int totalMin, int inBedMin, Integer eff) {
        int intValue;
        if (eff != null) {
            intValue = eff.intValue();
        } else {
            Integer resolveEfficiency$default = resolveEfficiency$default(this, null, totalMin, inBedMin, null, null, 24, null);
            if (resolveEfficiency$default == null) {
                return 70;
            }
            intValue = resolveEfficiency$default.intValue();
        }
        return RangesKt.coerceIn((int) ((intValue * 0.78d) + (SleepScience.INSTANCE.durationScore(totalMin) * 0.22d)), 0, 100);
    }

    public final int resolveQuality(String source, int totalMin, Integer deepMin, Integer lightMin, Integer eff, Integer inBedMin, Integer externalQuality) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (externalQuality != null && isSleepCycleSource(source)) {
            return RangesKt.coerceIn(externalQuality.intValue(), 0, 100);
        }
        if (isSleepCycleSource(source)) {
            return sleepCycleStyleScore(totalMin, inBedMin != null ? inBedMin.intValue() : totalMin, eff);
        }
        if (isOvernightSource(source) && eff != null) {
            return RangesKt.coerceIn((int) ((0.7d * eff.intValue()) + (scoreQuality(totalMin, deepMin, lightMin, eff, inBedMin) * 0.3d)), 0, 100);
        }
        return scoreQuality(totalMin, deepMin, lightMin, eff, inBedMin);
    }

    public final int scoreQuality(int totalMin, Integer deepMin, Integer lightMin, Integer eff, Integer inBedMin) {
        if (eff == null) {
            eff = inBedMin != null ? INSTANCE.resolveEfficiency(null, totalMin, inBedMin.intValue(), deepMin, lightMin) : null;
        }
        int durationScore = (int) (SleepScience.INSTANCE.durationScore(totalMin) * 0.45d);
        Integer valueOf = eff != null ? Integer.valueOf((int) (((RangesKt.coerceIn(eff.intValue(), 45, 100) - 45) / 55.0d) * 35.0d)) : null;
        int coerceIn = deepMin != null ? RangesKt.coerceIn((int) ((RangesKt.coerceIn(deepMin.intValue() / RangesKt.coerceAtLeast(totalMin, 1), 0.0d, 0.35d) / 0.22d) * 20.0d), 0, 20) : 10;
        if (valueOf != null) {
            return RangesKt.coerceIn(durationScore + valueOf.intValue() + coerceIn, 0, 100);
        }
        return RangesKt.coerceIn((int) (((durationScore + coerceIn) * 100.0d) / 65), 0, 100);
    }
}
