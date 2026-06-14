package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepScience;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepNightAnalytics.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/SleepNightAnalytics;", "", "<init>", "()V", "insights", "Lcom/example/rungps/sleep/SleepNightInsights;", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "pct", "", "part", "total", "(II)Ljava/lang/Integer;", "analyzeHypnogram", "Lcom/example/rungps/sleep/SleepNightAnalytics$HypoStats;", "stages", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "HypoStats", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepNightAnalytics {
    public static final int $stable = 0;
    public static final SleepNightAnalytics INSTANCE = new SleepNightAnalytics();

    /* compiled from: SleepNightAnalytics.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepStageLabel.values().length];
            try {
                iArr[SleepStageLabel.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepNightAnalytics() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SleepNightInsights insights(SleepEntryEntity entry) {
        int coerceAtLeast;
        Integer sleepQuality;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int resolveQuality;
        int i6;
        List<SleepStageLabel> decode;
        HypoStats hypoStats;
        int i7;
        Integer num;
        Intrinsics.checkNotNullParameter(entry, "entry");
        int coerceAtLeast2 = RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
        int effectiveAsleepMinutes = SleepScoring.INSTANCE.effectiveAsleepMinutes(entry.getTotalSleepMin(), entry.getStartTimeMs(), entry.getEndTimeMs(), entry.getSource());
        Integer deepSleepMin = entry.getDeepSleepMin();
        int intValue = deepSleepMin != null ? deepSleepMin.intValue() : 0;
        Integer lightSleepMin = entry.getLightSleepMin();
        int intValue2 = lightSleepMin != null ? lightSleepMin.intValue() : 0;
        Integer remSleepMin = entry.getRemSleepMin();
        int intValue3 = remSleepMin != null ? remSleepMin.intValue() : 0;
        int i8 = intValue + intValue2 + intValue3;
        Integer awakeSleepMin = entry.getAwakeSleepMin();
        if (awakeSleepMin != null) {
            if (awakeSleepMin.intValue() <= 0) {
                awakeSleepMin = null;
            }
            if (awakeSleepMin != null) {
                coerceAtLeast = awakeSleepMin.intValue();
                int i9 = coerceAtLeast;
                Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(entry.getSleepEfficiency(), effectiveAsleepMinutes, coerceAtLeast2, entry.getDeepSleepMin(), entry.getLightSleepMin());
                sleepQuality = entry.getSleepQuality();
                if (sleepQuality == null) {
                    i = i8;
                    i3 = intValue2;
                    i4 = intValue;
                    i5 = 0;
                    i6 = sleepQuality.intValue();
                    i2 = intValue3;
                } else {
                    i = i8;
                    i2 = intValue3;
                    i3 = intValue2;
                    i4 = intValue;
                    i5 = 0;
                    resolveQuality = SleepScoring.INSTANCE.resolveQuality(entry.getSource(), effectiveAsleepMinutes, (r18 & 4) != 0 ? null : entry.getDeepSleepMin(), (r18 & 8) != 0 ? null : entry.getLightSleepMin(), (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast2), (r18 & 64) != 0 ? null : null);
                    i6 = resolveQuality;
                }
                int coerceAtLeast3 = RangesKt.coerceAtLeast(i, 1);
                String hypnogramCompact = entry.getHypnogramCompact();
                decode = hypnogramCompact == null ? SleepHypnogramEncoder.INSTANCE.decode(hypnogramCompact) : null;
                if (decode != null) {
                    List<SleepStageLabel> list = !decode.isEmpty() ? decode : null;
                    if (list != null) {
                        hypoStats = INSTANCE.analyzeHypnogram(list);
                        SleepScience.StageArchitecture stageArchitecture = SleepScience.INSTANCE.stageArchitecture(effectiveAsleepMinutes, entry.getDeepSleepMin(), entry.getLightSleepMin(), entry.getRemSleepMin());
                        int estimatedCycles = stageArchitecture != null ? stageArchitecture.getEstimatedCycles() : SleepScience.estimateCycleCount$default(SleepScience.INSTANCE, effectiveAsleepMinutes, i5, 2, null);
                        int i10 = i4;
                        Integer pct = pct(i10, coerceAtLeast3);
                        Integer pct2 = pct(i2, coerceAtLeast3);
                        Integer pct3 = pct(i3, coerceAtLeast3);
                        Integer pct4 = pct(i9, coerceAtLeast2);
                        int i11 = effectiveAsleepMinutes - 480;
                        SleepScience.DurationBand durationBand = SleepScience.INSTANCE.durationBand(effectiveAsleepMinutes);
                        Integer valueOf = hypoStats != null ? Integer.valueOf(hypoStats.getTransitions()) : null;
                        Integer valueOf2 = hypoStats != null ? Integer.valueOf(hypoStats.getWakeEpisodes()) : null;
                        Integer valueOf3 = hypoStats != null ? Integer.valueOf(hypoStats.getLongestDeepMin()) : null;
                        Integer valueOf4 = hypoStats != null ? Integer.valueOf(hypoStats.getWasoMin()) : null;
                        if (decode != null) {
                            i7 = i2;
                            num = Integer.valueOf(decode.size());
                        } else {
                            i7 = i2;
                            num = null;
                        }
                        return new SleepNightInsights(coerceAtLeast2, effectiveAsleepMinutes, i9, resolveEfficiency, i6, i10, i3, i7, pct, pct2, pct3, pct4, i11, durationBand, estimatedCycles, stageArchitecture, valueOf, valueOf2, valueOf3, valueOf4, num);
                    }
                }
                hypoStats = null;
                SleepScience.StageArchitecture stageArchitecture2 = SleepScience.INSTANCE.stageArchitecture(effectiveAsleepMinutes, entry.getDeepSleepMin(), entry.getLightSleepMin(), entry.getRemSleepMin());
                if (stageArchitecture2 != null) {
                }
                int i102 = i4;
                Integer pct5 = pct(i102, coerceAtLeast3);
                Integer pct22 = pct(i2, coerceAtLeast3);
                Integer pct32 = pct(i3, coerceAtLeast3);
                Integer pct42 = pct(i9, coerceAtLeast2);
                int i112 = effectiveAsleepMinutes - 480;
                SleepScience.DurationBand durationBand2 = SleepScience.INSTANCE.durationBand(effectiveAsleepMinutes);
                if (hypoStats != null) {
                }
                if (hypoStats != null) {
                }
                if (hypoStats != null) {
                }
                if (hypoStats != null) {
                }
                if (decode != null) {
                }
                return new SleepNightInsights(coerceAtLeast2, effectiveAsleepMinutes, i9, resolveEfficiency, i6, i102, i3, i7, pct5, pct22, pct32, pct42, i112, durationBand2, estimatedCycles, stageArchitecture2, valueOf, valueOf2, valueOf3, valueOf4, num);
            }
        }
        coerceAtLeast = RangesKt.coerceAtLeast(coerceAtLeast2 - effectiveAsleepMinutes, 0);
        int i92 = coerceAtLeast;
        Integer resolveEfficiency2 = SleepScoring.INSTANCE.resolveEfficiency(entry.getSleepEfficiency(), effectiveAsleepMinutes, coerceAtLeast2, entry.getDeepSleepMin(), entry.getLightSleepMin());
        sleepQuality = entry.getSleepQuality();
        if (sleepQuality == null) {
        }
        int coerceAtLeast32 = RangesKt.coerceAtLeast(i, 1);
        String hypnogramCompact2 = entry.getHypnogramCompact();
        if (hypnogramCompact2 == null) {
        }
        if (decode != null) {
        }
        hypoStats = null;
        SleepScience.StageArchitecture stageArchitecture22 = SleepScience.INSTANCE.stageArchitecture(effectiveAsleepMinutes, entry.getDeepSleepMin(), entry.getLightSleepMin(), entry.getRemSleepMin());
        if (stageArchitecture22 != null) {
        }
        int i1022 = i4;
        Integer pct52 = pct(i1022, coerceAtLeast32);
        Integer pct222 = pct(i2, coerceAtLeast32);
        Integer pct322 = pct(i3, coerceAtLeast32);
        Integer pct422 = pct(i92, coerceAtLeast2);
        int i1122 = effectiveAsleepMinutes - 480;
        SleepScience.DurationBand durationBand22 = SleepScience.INSTANCE.durationBand(effectiveAsleepMinutes);
        if (hypoStats != null) {
        }
        if (hypoStats != null) {
        }
        if (hypoStats != null) {
        }
        if (hypoStats != null) {
        }
        if (decode != null) {
        }
        return new SleepNightInsights(coerceAtLeast2, effectiveAsleepMinutes, i92, resolveEfficiency2, i6, i1022, i3, i7, pct52, pct222, pct322, pct422, i1122, durationBand22, estimatedCycles, stageArchitecture22, valueOf, valueOf2, valueOf3, valueOf4, num);
    }

    private final Integer pct(int part, int total) {
        if (total <= 0 || part <= 0) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceIn(MathKt.roundToInt((part * 100.0d) / total), 0, 100));
    }

    /* compiled from: SleepNightAnalytics.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/sleep/SleepNightAnalytics$HypoStats;", "", "transitions", "", "wakeEpisodes", "longestDeepMin", "wasoMin", "<init>", "(IIII)V", "getTransitions", "()I", "getWakeEpisodes", "getLongestDeepMin", "getWasoMin", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class HypoStats {
        private final int longestDeepMin;
        private final int transitions;
        private final int wakeEpisodes;
        private final int wasoMin;

        public static /* synthetic */ HypoStats copy$default(HypoStats hypoStats, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = hypoStats.transitions;
            }
            if ((i5 & 2) != 0) {
                i2 = hypoStats.wakeEpisodes;
            }
            if ((i5 & 4) != 0) {
                i3 = hypoStats.longestDeepMin;
            }
            if ((i5 & 8) != 0) {
                i4 = hypoStats.wasoMin;
            }
            return hypoStats.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTransitions() {
            return this.transitions;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWakeEpisodes() {
            return this.wakeEpisodes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLongestDeepMin() {
            return this.longestDeepMin;
        }

        /* renamed from: component4, reason: from getter */
        public final int getWasoMin() {
            return this.wasoMin;
        }

        public final HypoStats copy(int transitions, int wakeEpisodes, int longestDeepMin, int wasoMin) {
            return new HypoStats(transitions, wakeEpisodes, longestDeepMin, wasoMin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HypoStats)) {
                return false;
            }
            HypoStats hypoStats = (HypoStats) other;
            return this.transitions == hypoStats.transitions && this.wakeEpisodes == hypoStats.wakeEpisodes && this.longestDeepMin == hypoStats.longestDeepMin && this.wasoMin == hypoStats.wasoMin;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.transitions) * 31) + Integer.hashCode(this.wakeEpisodes)) * 31) + Integer.hashCode(this.longestDeepMin)) * 31) + Integer.hashCode(this.wasoMin);
        }

        public String toString() {
            return "HypoStats(transitions=" + this.transitions + ", wakeEpisodes=" + this.wakeEpisodes + ", longestDeepMin=" + this.longestDeepMin + ", wasoMin=" + this.wasoMin + ")";
        }

        public HypoStats(int i, int i2, int i3, int i4) {
            this.transitions = i;
            this.wakeEpisodes = i2;
            this.longestDeepMin = i3;
            this.wasoMin = i4;
        }

        public final int getTransitions() {
            return this.transitions;
        }

        public final int getWakeEpisodes() {
            return this.wakeEpisodes;
        }

        public final int getLongestDeepMin() {
            return this.longestDeepMin;
        }

        public final int getWasoMin() {
            return this.wasoMin;
        }
    }

    private final HypoStats analyzeHypnogram(List<? extends SleepStageLabel> stages) {
        int size = stages.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        for (Object obj : stages) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SleepStageLabel sleepStageLabel = (SleepStageLabel) obj;
            if (i5 > 0 && stages.get(i5 - 1) != sleepStageLabel) {
                i++;
            }
            int i8 = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
            if (i8 == 1) {
                if (!z) {
                    i2++;
                    z = true;
                }
                if (i5 > 0 && i5 < size - 1) {
                    i4++;
                }
                i6 = 0;
            } else if (i8 != 2) {
                z = false;
                i6 = 0;
            } else {
                i6++;
                z = false;
                if (i6 > i3) {
                    i3 = i6;
                }
            }
            i5 = i7;
        }
        return new HypoStats(i, i2, i3, i4);
    }
}
