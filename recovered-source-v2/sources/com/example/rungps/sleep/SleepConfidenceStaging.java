package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepConfidenceStaging.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepConfidenceStaging;", "", "<init>", "()V", "REM_CONFIDENCE", "", "NREM_COLLAPSE_CONFIDENCE", "TWO_STAGE_ALARM_CONFIDENCE", "viewMeta", "Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "mapStage", "Lcom/example/rungps/sleep/SleepConfidenceStaging$DisplayStage;", "label", "Lcom/example/rungps/sleep/SleepStageLabel;", "meta", "mapHypnogram", "", "compact", "", "alarmWakeScore", "sample", "Lcom/example/rungps/sleep/SleepTrackSample;", "DisplayStage", "ViewMeta", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepConfidenceStaging {
    public static final int $stable = 0;
    public static final SleepConfidenceStaging INSTANCE = new SleepConfidenceStaging();
    private static final float NREM_COLLAPSE_CONFIDENCE = 0.55f;
    private static final float REM_CONFIDENCE = 0.62f;
    private static final float TWO_STAGE_ALARM_CONFIDENCE = 0.5f;

    /* compiled from: SleepConfidenceStaging.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepStageLabel.values().length];
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepStageLabel.AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepStageLabel.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepStageLabel.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepConfidenceStaging() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepConfidenceStaging.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/sleep/SleepConfidenceStaging$DisplayStage;", "", "<init>", "(Ljava/lang/String;I)V", "AWAKE", "ASLEEP", "REM", "NREM", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisplayStage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayStage[] $VALUES;
        public static final DisplayStage AWAKE = new DisplayStage("AWAKE", 0);
        public static final DisplayStage ASLEEP = new DisplayStage("ASLEEP", 1);
        public static final DisplayStage REM = new DisplayStage("REM", 2);
        public static final DisplayStage NREM = new DisplayStage("NREM", 3);

        private static final /* synthetic */ DisplayStage[] $values() {
            return new DisplayStage[]{AWAKE, ASLEEP, REM, NREM};
        }

        public static EnumEntries<DisplayStage> getEntries() {
            return $ENTRIES;
        }

        static {
            DisplayStage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private DisplayStage(String str, int i) {
        }

        public static DisplayStage valueOf(String str) {
            return (DisplayStage) Enum.valueOf(DisplayStage.class, str);
        }

        public static DisplayStage[] values() {
            return (DisplayStage[]) $VALUES.clone();
        }
    }

    /* compiled from: SleepConfidenceStaging.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;", "", "showRem", "", "collapseNrem", "useTwoStageAlarm", "confidenceMean", "", "label", "", "<init>", "(ZZZFLjava/lang/String;)V", "getShowRem", "()Z", "getCollapseNrem", "getUseTwoStageAlarm", "getConfidenceMean", "()F", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewMeta {
        public static final int $stable = 0;
        private final boolean collapseNrem;
        private final float confidenceMean;
        private final String label;
        private final boolean showRem;
        private final boolean useTwoStageAlarm;

        public static /* synthetic */ ViewMeta copy$default(ViewMeta viewMeta, boolean z, boolean z2, boolean z3, float f, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewMeta.showRem;
            }
            if ((i & 2) != 0) {
                z2 = viewMeta.collapseNrem;
            }
            boolean z4 = z2;
            if ((i & 4) != 0) {
                z3 = viewMeta.useTwoStageAlarm;
            }
            boolean z5 = z3;
            if ((i & 8) != 0) {
                f = viewMeta.confidenceMean;
            }
            float f2 = f;
            if ((i & 16) != 0) {
                str = viewMeta.label;
            }
            return viewMeta.copy(z, z4, z5, f2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowRem() {
            return this.showRem;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCollapseNrem() {
            return this.collapseNrem;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseTwoStageAlarm() {
            return this.useTwoStageAlarm;
        }

        /* renamed from: component4, reason: from getter */
        public final float getConfidenceMean() {
            return this.confidenceMean;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final ViewMeta copy(boolean showRem, boolean collapseNrem, boolean useTwoStageAlarm, float confidenceMean, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new ViewMeta(showRem, collapseNrem, useTwoStageAlarm, confidenceMean, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewMeta)) {
                return false;
            }
            ViewMeta viewMeta = (ViewMeta) other;
            return this.showRem == viewMeta.showRem && this.collapseNrem == viewMeta.collapseNrem && this.useTwoStageAlarm == viewMeta.useTwoStageAlarm && Float.compare(this.confidenceMean, viewMeta.confidenceMean) == 0 && Intrinsics.areEqual(this.label, viewMeta.label);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.showRem) * 31) + Boolean.hashCode(this.collapseNrem)) * 31) + Boolean.hashCode(this.useTwoStageAlarm)) * 31) + Float.hashCode(this.confidenceMean)) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "ViewMeta(showRem=" + this.showRem + ", collapseNrem=" + this.collapseNrem + ", useTwoStageAlarm=" + this.useTwoStageAlarm + ", confidenceMean=" + this.confidenceMean + ", label=" + this.label + ")";
        }

        public ViewMeta(boolean z, boolean z2, boolean z3, float f, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.showRem = z;
            this.collapseNrem = z2;
            this.useTwoStageAlarm = z3;
            this.confidenceMean = f;
            this.label = label;
        }

        public final boolean getShowRem() {
            return this.showRem;
        }

        public final boolean getCollapseNrem() {
            return this.collapseNrem;
        }

        public final boolean getUseTwoStageAlarm() {
            return this.useTwoStageAlarm;
        }

        public final float getConfidenceMean() {
            return this.confidenceMean;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    public final ViewMeta viewMeta(SleepEntryEntity entry) {
        String str;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Float stageConfidenceMean = entry.getStageConfidenceMean();
        float floatValue = stageConfidenceMean != null ? stageConfidenceMean.floatValue() : 0.45f;
        boolean z = floatValue >= REM_CONFIDENCE;
        boolean z2 = floatValue < NREM_COLLAPSE_CONFIDENCE;
        if (!z && z2) {
            str = "Asleep vs Awake (NREM collapsed — low confidence)";
        } else if (z) {
            str = "Asleep · Awake · REM (high confidence)";
        } else {
            str = "Asleep vs Awake";
        }
        return new ViewMeta(z, z2, floatValue < 0.5f, floatValue, str);
    }

    public final DisplayStage mapStage(SleepStageLabel label, ViewMeta meta) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(meta, "meta");
        int i = WhenMappings.$EnumSwitchMapping$0[label.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return DisplayStage.AWAKE;
            }
            if (i == 3) {
                return meta.getShowRem() ? DisplayStage.REM : DisplayStage.ASLEEP;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (meta.getCollapseNrem()) {
            return DisplayStage.NREM;
        }
        if (WhenMappings.$EnumSwitchMapping$0[label.ordinal()] == 1) {
            return DisplayStage.NREM;
        }
        return DisplayStage.NREM;
    }

    public final List<DisplayStage> mapHypnogram(String compact, ViewMeta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        List<SleepStageLabel> decode = SleepHypnogramEncoder.INSTANCE.decode(compact);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(decode, 10));
        Iterator<T> it = decode.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapStage((SleepStageLabel) it.next(), meta));
        }
        return arrayList;
    }

    public final float alarmWakeScore(SleepTrackSample sample, ViewMeta meta) {
        Intrinsics.checkNotNullParameter(sample, "sample");
        Intrinsics.checkNotNullParameter(meta, "meta");
        Float asleepProb = sample.getAsleepProb();
        float floatValue = asleepProb != null ? asleepProb.floatValue() : 0.5f;
        Float stageConfidence = sample.getStageConfidence();
        float floatValue2 = stageConfidence != null ? stageConfidence.floatValue() : meta.getConfidenceMean();
        if (meta.getUseTwoStageAlarm()) {
            return ((1.0f - floatValue) * 0.7f) + (sample.getMovement() * 0.15f) + (sample.getAudioLevel() * 0.15f);
        }
        Float lightSleepProb = sample.getLightSleepProb();
        return ((lightSleepProb != null ? lightSleepProb.floatValue() : 0.3f) * 0.45f) + ((1.0f - floatValue) * 0.25f) + ((1.0f - floatValue2) * 0.05f) + (sample.getMovement() * 0.12f) + (sample.getAudioLevel() * 0.13f);
    }
}
