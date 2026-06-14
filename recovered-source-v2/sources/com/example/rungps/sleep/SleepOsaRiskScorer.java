package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepBreathingDisruptionAnalyzer;
import com.example.rungps.sleep.SleepSnoreMetrics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepOsaRiskScorer.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/sleep/SleepOsaRiskScorer;", "", "<init>", "()V", "MIN_NIGHTS", "", "MIN_MIC_COVERAGE", "", "scoreRecentNights", "Lcom/example/rungps/sleep/SleepOsaRiskScorer$Result;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "sleptAlone", "", "exportSummary", "", "result", "Tier", "Result", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepOsaRiskScorer {
    public static final int $stable = 0;
    public static final SleepOsaRiskScorer INSTANCE = new SleepOsaRiskScorer();
    private static final float MIN_MIC_COVERAGE = 0.85f;
    private static final int MIN_NIGHTS = 3;

    /* compiled from: SleepOsaRiskScorer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tier.values().length];
            try {
                iArr[Tier.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tier.ELEVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tier.INSUFFICIENT_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepOsaRiskScorer() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepOsaRiskScorer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/sleep/SleepOsaRiskScorer$Tier;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "ELEVATED", "INSUFFICIENT_DATA", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Tier {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tier[] $VALUES;
        public static final Tier LOW = new Tier("LOW", 0);
        public static final Tier ELEVATED = new Tier("ELEVATED", 1);
        public static final Tier INSUFFICIENT_DATA = new Tier("INSUFFICIENT_DATA", 2);

        private static final /* synthetic */ Tier[] $values() {
            return new Tier[]{LOW, ELEVATED, INSUFFICIENT_DATA};
        }

        public static EnumEntries<Tier> getEntries() {
            return $ENTRIES;
        }

        private Tier(String str, int i) {
        }

        static {
            Tier[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Tier valueOf(String str) {
            return (Tier) Enum.valueOf(Tier.class, str);
        }

        public static Tier[] values() {
            return (Tier[]) $VALUES.clone();
        }
    }

    /* compiled from: SleepOsaRiskScorer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/sleep/SleepOsaRiskScorer$Result;", "", "tier", "Lcom/example/rungps/sleep/SleepOsaRiskScorer$Tier;", "nightsUsed", "", "summaryLine", "", "<init>", "(Lcom/example/rungps/sleep/SleepOsaRiskScorer$Tier;ILjava/lang/String;)V", "getTier", "()Lcom/example/rungps/sleep/SleepOsaRiskScorer$Tier;", "getNightsUsed", "()I", "getSummaryLine", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 0;
        private final int nightsUsed;
        private final String summaryLine;
        private final Tier tier;

        public static /* synthetic */ Result copy$default(Result result, Tier tier, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                tier = result.tier;
            }
            if ((i2 & 2) != 0) {
                i = result.nightsUsed;
            }
            if ((i2 & 4) != 0) {
                str = result.summaryLine;
            }
            return result.copy(tier, i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Tier getTier() {
            return this.tier;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSummaryLine() {
            return this.summaryLine;
        }

        public final Result copy(Tier tier, int nightsUsed, String summaryLine) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(summaryLine, "summaryLine");
            return new Result(tier, nightsUsed, summaryLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.tier == result.tier && this.nightsUsed == result.nightsUsed && Intrinsics.areEqual(this.summaryLine, result.summaryLine);
        }

        public int hashCode() {
            return (((this.tier.hashCode() * 31) + Integer.hashCode(this.nightsUsed)) * 31) + this.summaryLine.hashCode();
        }

        public String toString() {
            return "Result(tier=" + this.tier + ", nightsUsed=" + this.nightsUsed + ", summaryLine=" + this.summaryLine + ")";
        }

        public Result(Tier tier, int i, String summaryLine) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(summaryLine, "summaryLine");
            this.tier = tier;
            this.nightsUsed = i;
            this.summaryLine = summaryLine;
        }

        public final Tier getTier() {
            return this.tier;
        }

        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        public final String getSummaryLine() {
            return this.summaryLine;
        }
    }

    public final Result scoreRecentNights(List<SleepEntryEntity> entries, boolean sleptAlone) {
        String str;
        String str2;
        SleepBreathingDisruptionAnalyzer.NightMetrics breathing;
        SleepBreathingDisruptionAnalyzer.NightMetrics breathing2;
        SleepSnoreMetrics.NightMetrics snore;
        String sleepAnalyticsJson;
        Intrinsics.checkNotNullParameter(entries, "entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (SleepScoring.INSTANCE.isOvernightSource(((SleepEntryEntity) obj).getSource())) {
                arrayList.add(obj);
            }
        }
        List take = CollectionsKt.take(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.sleep.SleepOsaRiskScorer$scoreRecentNights$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t2).getEndTimeMs()), Long.valueOf(((SleepEntryEntity) t).getEndTimeMs()));
            }
        }), 14);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = take.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) next;
            Float micCoverageRatio = sleepEntryEntity.getMicCoverageRatio();
            if ((micCoverageRatio != null ? micCoverageRatio.floatValue() : 0.0f) >= 0.85f && (sleepAnalyticsJson = sleepEntryEntity.getSleepAnalyticsJson()) != null && !StringsKt.isBlank(sleepAnalyticsJson)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!sleptAlone || arrayList3.size() < 3) {
            Tier tier = Tier.INSUFFICIENT_DATA;
            int size = arrayList3.size();
            if (!sleptAlone) {
                str = "Need slept-alone nights with strong mic coverage (partner bed not scored).";
            } else if (arrayList3.size() < 3) {
                str = "Need ≥3 nights with ≥85% mic coverage.";
            } else {
                str = "Not enough data.";
            }
            return new Result(tier, size, str);
        }
        List<SleepEntryEntity> take2 = CollectionsKt.take(arrayList3, RangesKt.coerceAtLeast(3, 3));
        int i = 0;
        for (SleepEntryEntity sleepEntryEntity2 : take2) {
            SleepAnalyticsCompact parse = SleepAnalyticsCompact.INSTANCE.parse(sleepEntryEntity2.getSleepAnalyticsJson());
            float snoresPerHour = (parse == null || (snore = parse.getSnore()) == null) ? 0.0f : snore.getSnoresPerHour();
            float disruptionsPerHour = (parse == null || (breathing2 = parse.getBreathing()) == null) ? 0.0f : breathing2.getDisruptionsPerHour();
            int breathPauseMinutes = (parse == null || (breathing = parse.getBreathing()) == null) ? 0 : breathing.getBreathPauseMinutes();
            if (Intrinsics.areEqual(sleepEntryEntity2.getOsaRiskHint(), "elevated") || snoresPerHour >= 8.0f || disruptionsPerHour >= 3.0f || breathPauseMinutes >= 5) {
                i++;
            }
        }
        Tier tier2 = i >= 2 ? Tier.ELEVATED : Tier.LOW;
        int i2 = WhenMappings.$EnumSwitchMapping$0[tier2.ordinal()];
        if (i2 == 1) {
            str2 = "Low breathing-disturbance pattern over " + take2.size() + " nights (wellness hint only).";
        } else if (i2 == 2) {
            str2 = "Elevated breathing-disturbance pattern over " + take2.size() + " nights — consider talking to a clinician.";
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "Insufficient data.";
        }
        return new Result(tier2, take2.size(), str2);
    }

    public final String exportSummary(Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        StringBuilder sb = new StringBuilder();
        sb.append("OSA wellness screening: " + result.getTier().name());
        sb.append(" (" + result.getNightsUsed() + " nights). ");
        sb.append(result.getSummaryLine());
        sb.append(" Not a medical diagnosis or AHI estimate.");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
