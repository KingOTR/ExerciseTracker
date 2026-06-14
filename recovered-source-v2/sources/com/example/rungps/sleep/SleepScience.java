package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepScience.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001:\u000201B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005J3\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001dJ(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u001e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u001fJ\u0006\u0010*\u001a\u00020\u001fJ\u0006\u0010+\u001a\u00020\u001fJ\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u0005J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/example/rungps/sleep/SleepScience;", "", "<init>", "()V", "TYPICAL_MIN_MIN", "", "TYPICAL_MAX_MIN", "RECOMMENDED_MIN_MIN", "RECOMMENDED_MAX_MIN", "DEFAULT_GOAL_MIN", "CYCLE_MIN_MIN", "CYCLE_TYPICAL_MIN", "CYCLE_MAX_MIN", "DEEP_PCT_TYPICAL_LOW", "", "DEEP_PCT_TYPICAL_HIGH", "REM_PCT_TYPICAL_LOW", "REM_PCT_TYPICAL_HIGH", "durationBand", "Lcom/example/rungps/sleep/SleepScience$DurationBand;", "asleepMin", "durationScore", "estimateCycleCount", "cycleLengthMin", "stageArchitecture", "Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "deepMin", "lightMin", "remMin", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "buildStageSummary", "", "allStages", "", "deepPct", "remPct", "cycles", "recoveryCoachLine", "avgHours", "nightsWithAllStages", "nightsLogged", "lightStageHint", "deepStageHint", "remStageHint", "vsGoalLabel", "goalMin", "formatMin", "min", "DurationBand", "StageArchitecture", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepScience {
    public static final int $stable = 0;
    public static final int CYCLE_MAX_MIN = 100;
    public static final int CYCLE_MIN_MIN = 80;
    public static final int CYCLE_TYPICAL_MIN = 90;
    public static final float DEEP_PCT_TYPICAL_HIGH = 0.23f;
    public static final float DEEP_PCT_TYPICAL_LOW = 0.13f;
    public static final int DEFAULT_GOAL_MIN = 480;
    public static final SleepScience INSTANCE = new SleepScience();
    public static final int RECOMMENDED_MAX_MIN = 600;
    public static final int RECOMMENDED_MIN_MIN = 480;
    public static final float REM_PCT_TYPICAL_HIGH = 0.25f;
    public static final float REM_PCT_TYPICAL_LOW = 0.2f;
    public static final int TYPICAL_MAX_MIN = 600;
    public static final int TYPICAL_MIN_MIN = 360;

    /* compiled from: SleepScience.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationBand.values().length];
            try {
                iArr[DurationBand.WellBelowTypical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationBand.BelowRecommended.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationBand.OptimalForRecovery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationBand.InTypicalRange.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationBand.AboveTypical.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepScience() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepScience.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/example/rungps/sleep/SleepScience$DurationBand;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "WellBelowTypical", "BelowRecommended", "InTypicalRange", "OptimalForRecovery", "AboveTypical", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DurationBand {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DurationBand[] $VALUES;
        private final String label;
        public static final DurationBand WellBelowTypical = new DurationBand("WellBelowTypical", 0, "Well below typical (<6 h)");
        public static final DurationBand BelowRecommended = new DurationBand("BelowRecommended", 1, "Below 8 h target");
        public static final DurationBand InTypicalRange = new DurationBand("InTypicalRange", 2, "Within typical range (6–10 h)");
        public static final DurationBand OptimalForRecovery = new DurationBand("OptimalForRecovery", 3, "In recovery band (8–10 h)");
        public static final DurationBand AboveTypical = new DurationBand("AboveTypical", 4, "Above typical (>10 h)");

        private static final /* synthetic */ DurationBand[] $values() {
            return new DurationBand[]{WellBelowTypical, BelowRecommended, InTypicalRange, OptimalForRecovery, AboveTypical};
        }

        public static EnumEntries<DurationBand> getEntries() {
            return $ENTRIES;
        }

        private DurationBand(String str, int i, String str2) {
            this.label = str2;
        }

        public final String getLabel() {
            return this.label;
        }

        static {
            DurationBand[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static DurationBand valueOf(String str) {
            return (DurationBand) Enum.valueOf(DurationBand.class, str);
        }

        public static DurationBand[] values() {
            return (DurationBand[]) $VALUES.clone();
        }
    }

    /* compiled from: SleepScience.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "", "hasLight", "", "hasDeep", "hasRem", "allStagesPresent", "estimatedCycles", "", "deepPctOfSleep", "", "remPctOfSleep", "lightPctOfSleep", "summary", "", "<init>", "(ZZZZILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getHasLight", "()Z", "getHasDeep", "getHasRem", "getAllStagesPresent", "getEstimatedCycles", "()I", "getDeepPctOfSleep", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRemPctOfSleep", "getLightPctOfSleep", "getSummary", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZZILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StageArchitecture {
        public static final int $stable = 0;
        private final boolean allStagesPresent;
        private final Float deepPctOfSleep;
        private final int estimatedCycles;
        private final boolean hasDeep;
        private final boolean hasLight;
        private final boolean hasRem;
        private final Float lightPctOfSleep;
        private final Float remPctOfSleep;
        private final String summary;

        /* renamed from: component1, reason: from getter */
        public final boolean getHasLight() {
            return this.hasLight;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasDeep() {
            return this.hasDeep;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasRem() {
            return this.hasRem;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAllStagesPresent() {
            return this.allStagesPresent;
        }

        /* renamed from: component5, reason: from getter */
        public final int getEstimatedCycles() {
            return this.estimatedCycles;
        }

        /* renamed from: component6, reason: from getter */
        public final Float getDeepPctOfSleep() {
            return this.deepPctOfSleep;
        }

        /* renamed from: component7, reason: from getter */
        public final Float getRemPctOfSleep() {
            return this.remPctOfSleep;
        }

        /* renamed from: component8, reason: from getter */
        public final Float getLightPctOfSleep() {
            return this.lightPctOfSleep;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final StageArchitecture copy(boolean hasLight, boolean hasDeep, boolean hasRem, boolean allStagesPresent, int estimatedCycles, Float deepPctOfSleep, Float remPctOfSleep, Float lightPctOfSleep, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new StageArchitecture(hasLight, hasDeep, hasRem, allStagesPresent, estimatedCycles, deepPctOfSleep, remPctOfSleep, lightPctOfSleep, summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StageArchitecture)) {
                return false;
            }
            StageArchitecture stageArchitecture = (StageArchitecture) other;
            return this.hasLight == stageArchitecture.hasLight && this.hasDeep == stageArchitecture.hasDeep && this.hasRem == stageArchitecture.hasRem && this.allStagesPresent == stageArchitecture.allStagesPresent && this.estimatedCycles == stageArchitecture.estimatedCycles && Intrinsics.areEqual((Object) this.deepPctOfSleep, (Object) stageArchitecture.deepPctOfSleep) && Intrinsics.areEqual((Object) this.remPctOfSleep, (Object) stageArchitecture.remPctOfSleep) && Intrinsics.areEqual((Object) this.lightPctOfSleep, (Object) stageArchitecture.lightPctOfSleep) && Intrinsics.areEqual(this.summary, stageArchitecture.summary);
        }

        public int hashCode() {
            int hashCode = ((((((((Boolean.hashCode(this.hasLight) * 31) + Boolean.hashCode(this.hasDeep)) * 31) + Boolean.hashCode(this.hasRem)) * 31) + Boolean.hashCode(this.allStagesPresent)) * 31) + Integer.hashCode(this.estimatedCycles)) * 31;
            Float f = this.deepPctOfSleep;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.remPctOfSleep;
            int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.lightPctOfSleep;
            return ((hashCode3 + (f3 != null ? f3.hashCode() : 0)) * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "StageArchitecture(hasLight=" + this.hasLight + ", hasDeep=" + this.hasDeep + ", hasRem=" + this.hasRem + ", allStagesPresent=" + this.allStagesPresent + ", estimatedCycles=" + this.estimatedCycles + ", deepPctOfSleep=" + this.deepPctOfSleep + ", remPctOfSleep=" + this.remPctOfSleep + ", lightPctOfSleep=" + this.lightPctOfSleep + ", summary=" + this.summary + ")";
        }

        public StageArchitecture(boolean z, boolean z2, boolean z3, boolean z4, int i, Float f, Float f2, Float f3, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.hasLight = z;
            this.hasDeep = z2;
            this.hasRem = z3;
            this.allStagesPresent = z4;
            this.estimatedCycles = i;
            this.deepPctOfSleep = f;
            this.remPctOfSleep = f2;
            this.lightPctOfSleep = f3;
            this.summary = summary;
        }

        public final boolean getHasLight() {
            return this.hasLight;
        }

        public final boolean getHasDeep() {
            return this.hasDeep;
        }

        public final boolean getHasRem() {
            return this.hasRem;
        }

        public final boolean getAllStagesPresent() {
            return this.allStagesPresent;
        }

        public final int getEstimatedCycles() {
            return this.estimatedCycles;
        }

        public final Float getDeepPctOfSleep() {
            return this.deepPctOfSleep;
        }

        public final Float getRemPctOfSleep() {
            return this.remPctOfSleep;
        }

        public final Float getLightPctOfSleep() {
            return this.lightPctOfSleep;
        }

        public final String getSummary() {
            return this.summary;
        }
    }

    public final DurationBand durationBand(int asleepMin) {
        if (asleepMin < 360) {
            return DurationBand.WellBelowTypical;
        }
        if (asleepMin < 480) {
            return DurationBand.BelowRecommended;
        }
        if (asleepMin <= 600) {
            return DurationBand.OptimalForRecovery;
        }
        if (asleepMin <= 600) {
            return DurationBand.InTypicalRange;
        }
        return DurationBand.AboveTypical;
    }

    public final int durationScore(int asleepMin) {
        int coerceAtLeast;
        int coerceAtLeast2 = RangesKt.coerceAtLeast(asleepMin, 0);
        if (coerceAtLeast2 < 180) {
            coerceAtLeast = MathKt.roundToInt((coerceAtLeast2 / 180.0f) * 25.0f);
        } else if (coerceAtLeast2 < 360) {
            coerceAtLeast = MathKt.roundToInt(((coerceAtLeast2 - 180) / 180.0f) * 35.0f) + 25;
        } else if (coerceAtLeast2 < 480) {
            coerceAtLeast = MathKt.roundToInt(((coerceAtLeast2 - TYPICAL_MIN_MIN) / 120.0f) * 25.0f) + 60;
        } else if (coerceAtLeast2 <= 600) {
            coerceAtLeast = 100;
        } else if (coerceAtLeast2 <= 600) {
            coerceAtLeast = 100 - MathKt.roundToInt(((coerceAtLeast2 - 600) / 0.0f) * 15.0f);
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(85 - (((coerceAtLeast2 - 600) / 60.0f) * 10.0f)), 50);
        }
        return RangesKt.coerceIn(coerceAtLeast, 0, 100);
    }

    public static /* synthetic */ int estimateCycleCount$default(SleepScience sleepScience, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 90;
        }
        return sleepScience.estimateCycleCount(i, i2);
    }

    public final int estimateCycleCount(int asleepMin, int cycleLengthMin) {
        if (asleepMin < 45) {
            return 0;
        }
        return RangesKt.coerceAtLeast(MathKt.roundToInt(asleepMin / cycleLengthMin), 1);
    }

    public final StageArchitecture stageArchitecture(int asleepMin, Integer deepMin, Integer lightMin, Integer remMin) {
        int intValue = deepMin != null ? deepMin.intValue() : 0;
        int intValue2 = lightMin != null ? lightMin.intValue() : 0;
        int intValue3 = remMin != null ? remMin.intValue() : 0;
        int i = intValue + intValue2 + intValue3;
        if (i <= 0 || asleepMin <= 0) {
            return null;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(i, 1);
        float f = intValue / coerceAtLeast;
        float f2 = intValue3 / coerceAtLeast;
        float f3 = intValue2 / coerceAtLeast;
        boolean z = intValue2 > 0;
        boolean z2 = intValue > 0;
        boolean z3 = intValue3 > 0;
        boolean z4 = z && z2 && z3;
        int estimateCycleCount$default = estimateCycleCount$default(this, asleepMin, 0, 2, null);
        return new StageArchitecture(z, z2, z3, z4, estimateCycleCount$default, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), buildStageSummary(z4, f, f2, estimateCycleCount$default));
    }

    private final String buildStageSummary(boolean allStages, float deepPct, float remPct, int cycles) {
        if (!allStages) {
            return "Stage data incomplete — effective sleep needs light, deep, and REM across ~" + cycles + " cycles.";
        }
        if (deepPct < 0.13f) {
            return "Light on deep sleep — deep NREM supports physical recovery and adaptation.";
        }
        if (deepPct > 0.31f) {
            return "High deep share — can follow heavy training; watch total sleep time.";
        }
        if (remPct < 0.2f) {
            return "Less REM than typical — REM supports learning, mood, and nervous-system reset.";
        }
        if (remPct > 0.32999998f) {
            return "Elevated REM — often follows sleep debt or intense training blocks.";
        }
        return "Balanced architecture across ~" + cycles + " × ~90 min cycles — supports metabolic and immune recovery.";
    }

    public final String recoveryCoachLine(float avgHours, int nightsWithAllStages, int nightsLogged) {
        String str;
        DurationBand durationBand = durationBand(MathKt.roundToInt(avgHours * 60.0f));
        if (nightsLogged > 0 && nightsWithAllStages < nightsLogged / 2) {
            str = " Log light, deep, and REM (watch or overnight tracking) to see cycle quality.";
        } else {
            str = "";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[durationBand.ordinal()];
        if (i == 1) {
            return "Average sleep is under 6 h — training adaptation and ANS recovery are harder to sustain.".concat(str);
        }
        if (i == 2) {
            return "You're often under 8 h — aim for more time in bed; missing early sleep pressure can cut deep sleep.".concat(str);
        }
        if (i == 3) {
            return "Duration sits in the 8–10 h recovery band — good base for returning metabolism and immunity to rest.".concat(str);
        }
        if (i == 4) {
            return "Duration is in the 6–10 h typical window — nudging toward 8–10 h may help hard training weeks.".concat(str);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return "Averaging over 10 h — often catch-up sleep; check consistency if you still feel tired.".concat(str);
    }

    public final String lightStageHint() {
        return "Light sleep (NREM 1–2): drowsiness, lower BP/HR, easy return to wake — gateway to deeper stages.";
    }

    public final String deepStageHint() {
        return "Deep sleep (NREM 3): slow brain waves, physical restoration, growth and immune support.";
    }

    public final String remStageHint() {
        return "REM (paradoxical): vivid dreams, memory consolidation, nervous-system recovery.";
    }

    public static /* synthetic */ String vsGoalLabel$default(SleepScience sleepScience, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 480;
        }
        return sleepScience.vsGoalLabel(i, i2);
    }

    public final String vsGoalLabel(int asleepMin, int goalMin) {
        int i = asleepMin - goalMin;
        if (i >= 30) {
            return formatMin(i) + " above " + formatMin(goalMin) + " goal";
        }
        if (i <= -30) {
            return formatMin(-i) + " below " + formatMin(goalMin) + " goal";
        }
        return "Near " + formatMin(goalMin) + " sleep goal";
    }

    private final String formatMin(int min) {
        StringBuilder append;
        String str;
        int i = min / 60;
        int i2 = min % 60;
        if (i2 == 0) {
            append = new StringBuilder().append(i);
            str = "h";
        } else {
            append = new StringBuilder().append(i).append("h ").append(i2);
            str = "m";
        }
        return append.append(str).toString();
    }
}
