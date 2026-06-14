package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepScoreConfidence.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/example/rungps/sleep/SleepScoreConfidence;", "", "<init>", "()V", "forEntry", "Lcom/example/rungps/sleep/SleepScoreConfidence$Snapshot;", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "Tier", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepScoreConfidence {
    public static final int $stable = 0;
    public static final SleepScoreConfidence INSTANCE = new SleepScoreConfidence();

    /* compiled from: SleepScoreConfidence.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tier.values().length];
            try {
                iArr[Tier.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tier.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tier.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepScoreConfidence() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepScoreConfidence.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/sleep/SleepScoreConfidence$Tier;", "", "<init>", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Tier {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tier[] $VALUES;
        public static final Tier HIGH = new Tier("HIGH", 0);
        public static final Tier MEDIUM = new Tier("MEDIUM", 1);
        public static final Tier LOW = new Tier("LOW", 2);

        private static final /* synthetic */ Tier[] $values() {
            return new Tier[]{HIGH, MEDIUM, LOW};
        }

        public static EnumEntries<Tier> getEntries() {
            return $ENTRIES;
        }

        static {
            Tier[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Tier(String str, int i) {
        }

        public static Tier valueOf(String str) {
            return (Tier) Enum.valueOf(Tier.class, str);
        }

        public static Tier[] values() {
            return (Tier[]) $VALUES.clone();
        }
    }

    /* compiled from: SleepScoreConfidence.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepScoreConfidence$Snapshot;", "", "tier", "Lcom/example/rungps/sleep/SleepScoreConfidence$Tier;", "percent", "", "label", "", "detail", "<init>", "(Lcom/example/rungps/sleep/SleepScoreConfidence$Tier;ILjava/lang/String;Ljava/lang/String;)V", "getTier", "()Lcom/example/rungps/sleep/SleepScoreConfidence$Tier;", "getPercent", "()I", "getLabel", "()Ljava/lang/String;", "getDetail", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final String detail;
        private final String label;
        private final int percent;
        private final Tier tier;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, Tier tier, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                tier = snapshot.tier;
            }
            if ((i2 & 2) != 0) {
                i = snapshot.percent;
            }
            if ((i2 & 4) != 0) {
                str = snapshot.label;
            }
            if ((i2 & 8) != 0) {
                str2 = snapshot.detail;
            }
            return snapshot.copy(tier, i, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Tier getTier() {
            return this.tier;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Snapshot copy(Tier tier, int percent, String label, String detail) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Snapshot(tier, percent, label, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return this.tier == snapshot.tier && this.percent == snapshot.percent && Intrinsics.areEqual(this.label, snapshot.label) && Intrinsics.areEqual(this.detail, snapshot.detail);
        }

        public int hashCode() {
            return (((((this.tier.hashCode() * 31) + Integer.hashCode(this.percent)) * 31) + this.label.hashCode()) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Snapshot(tier=" + this.tier + ", percent=" + this.percent + ", label=" + this.label + ", detail=" + this.detail + ")";
        }

        public Snapshot(Tier tier, int i, String label, String detail) {
            Intrinsics.checkNotNullParameter(tier, "tier");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.tier = tier;
            this.percent = i;
            this.label = label;
            this.detail = detail;
        }

        public final Tier getTier() {
            return this.tier;
        }

        public final int getPercent() {
            return this.percent;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    public final Snapshot forEntry(SleepEntryEntity entry) {
        int i;
        Tier tier;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(entry, "entry");
        ArrayList arrayList = new ArrayList();
        if (SleepScoring.INSTANCE.isOvernightSource(entry.getSource())) {
            arrayList.add("overnight mic");
            i = 75;
        } else if (SleepScoring.INSTANCE.isSleepCycleSource(entry.getSource())) {
            arrayList.add("Sleep Cycle import");
            i = 70;
        } else if (StringsKt.contains((CharSequence) entry.getSource(), (CharSequence) "health_connect", true)) {
            arrayList.add("Health Connect");
            i = 62;
        } else {
            arrayList.add("manual entry");
            i = 50;
        }
        String hypnogramCompact = entry.getHypnogramCompact();
        if (hypnogramCompact != null && !StringsKt.isBlank(hypnogramCompact)) {
            i += 15;
            arrayList.add("stage timeline");
        }
        String eventMarkersCompact = entry.getEventMarkersCompact();
        if (eventMarkersCompact != null && !StringsKt.isBlank(eventMarkersCompact)) {
            i += 8;
            arrayList.add("disturbance markers");
        }
        Float micCoverageRatio = entry.getMicCoverageRatio();
        if (micCoverageRatio != null) {
            float floatValue = micCoverageRatio.floatValue();
            if (floatValue >= 0.85f) {
                i += 10;
            } else if (floatValue >= 0.55f) {
                i += 4;
            } else {
                i -= 12;
                arrayList.add("low mic coverage");
            }
        }
        Float stageConfidenceMean = entry.getStageConfidenceMean();
        if (stageConfidenceMean != null) {
            float floatValue2 = stageConfidenceMean.floatValue();
            if (floatValue2 >= 0.65f) {
                i += 8;
            } else if (floatValue2 >= 0.45f) {
                i += 3;
            } else {
                i -= 6;
                arrayList.add("uncertain stages");
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
        int i2 = coerceAtLeast >= 300 ? i + 8 : i - 15;
        if (coerceAtLeast < 180) {
            i2 -= 20;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Integer[]{entry.getDeepSleepMin(), entry.getRemSleepMin()});
        if (!(listOfNotNull instanceof Collection) || !listOfNotNull.isEmpty()) {
            Iterator it = listOfNotNull.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Number) it.next()).intValue() > 0) {
                    i2 += 5;
                    break;
                }
            }
        }
        Integer restlessnessIndex = entry.getRestlessnessIndex();
        if ((restlessnessIndex != null ? restlessnessIndex.intValue() : 0) > 75) {
            i2 -= 8;
            arrayList.add("high restlessness");
        }
        int coerceIn = RangesKt.coerceIn(i2, 15, 98);
        if (coerceIn >= 78) {
            tier = Tier.HIGH;
        } else if (coerceIn >= 52) {
            tier = Tier.MEDIUM;
        } else {
            tier = Tier.LOW;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[tier.ordinal()];
        if (i3 == 1) {
            str = "High confidence";
        } else if (i3 == 2) {
            str = "Moderate confidence";
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Low confidence";
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[tier.ordinal()];
        if (i4 == 1) {
            str2 = "Rich overnight data — score is well supported.";
        } else if (i4 == 2) {
            str2 = "Usable estimate — " + CollectionsKt.joinToString$default(CollectionsKt.take(arrayList, 3), ", ", null, null, 0, null, null, 62, null) + ".";
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "Sparse data — treat score as a rough guide only.";
        }
        return new Snapshot(tier, coerceIn, str, str2);
    }
}
