package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepHistoryPersonalization;
import com.example.rungps.sleep.SleepStagingV2Classifier;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: SleepStageInference.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003456B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ(\u0010\u000f\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ(\u0010\u0012\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ(\u0010\u0014\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0002J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007H\u0002J8\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0005H\u0002J\u001a\u0010,\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020%H\u0002J\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0002J\u0018\u00100\u001a\u00020\n2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/example/rungps/sleep/SleepStageInference;", "", "<init>", "()V", "SNORE_AUDIO", "", "CYCLE_BUCKETS", "", "stageLabels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "samples", "Lcom/example/rungps/sleep/SleepTrackSample;", "context", "Landroid/content/Context;", "analyzeNight", "Lcom/example/rungps/sleep/SleepStageInference$NightStageResult;", "inBedMin", "analyze", "Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;", "inferSmoothedStages", "Lcom/example/rungps/sleep/SleepStageInference$InferredStages;", Scopes.PROFILE, "Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile;", "trackedMinutes", "ruleStage", "s", "calm", "inferBucketMs", "", "boostRemNearCyclePeaks", "", "remFlags", "", "estimateCycles", "asleepMin", "buildQualityHint", "", "efficiency", "deepMin", "remMin", "cycles", "snore", "avgBreath", "emptyBreakdown", "hint", "smooth", "values", "stageFromV2Probs", "probs", "", "fallback", "StageBreakdown", "NightStageResult", "InferredStages", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepStageInference {
    public static final int $stable = 0;
    private static final int CYCLE_BUCKETS = 54;
    public static final SleepStageInference INSTANCE = new SleepStageInference();
    private static final float SNORE_AUDIO = 0.35f;

    private SleepStageInference() {
    }

    /* compiled from: SleepStageInference.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00062"}, d2 = {"Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;", "", "totalSleepMin", "", "deepSleepMin", "lightSleepMin", "remSleepMin", "awakeSleepMin", "snoreEvents", "restlessnessIndex", "timeToFallAsleepMin", "efficiency", "sleepCycles", "qualityHint", "", "trackedMin", "<init>", "(IIIIIIIIIILjava/lang/String;I)V", "getTotalSleepMin", "()I", "getDeepSleepMin", "getLightSleepMin", "getRemSleepMin", "getAwakeSleepMin", "getSnoreEvents", "getRestlessnessIndex", "getTimeToFallAsleepMin", "getEfficiency", "getSleepCycles", "getQualityHint", "()Ljava/lang/String;", "getTrackedMin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StageBreakdown {
        public static final int $stable = 0;
        private final int awakeSleepMin;
        private final int deepSleepMin;
        private final int efficiency;
        private final int lightSleepMin;
        private final String qualityHint;
        private final int remSleepMin;
        private final int restlessnessIndex;
        private final int sleepCycles;
        private final int snoreEvents;
        private final int timeToFallAsleepMin;
        private final int totalSleepMin;
        private final int trackedMin;

        public static /* synthetic */ StageBreakdown copy$default(StageBreakdown stageBreakdown, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, int i11, int i12, Object obj) {
            return stageBreakdown.copy((i12 & 1) != 0 ? stageBreakdown.totalSleepMin : i, (i12 & 2) != 0 ? stageBreakdown.deepSleepMin : i2, (i12 & 4) != 0 ? stageBreakdown.lightSleepMin : i3, (i12 & 8) != 0 ? stageBreakdown.remSleepMin : i4, (i12 & 16) != 0 ? stageBreakdown.awakeSleepMin : i5, (i12 & 32) != 0 ? stageBreakdown.snoreEvents : i6, (i12 & 64) != 0 ? stageBreakdown.restlessnessIndex : i7, (i12 & 128) != 0 ? stageBreakdown.timeToFallAsleepMin : i8, (i12 & 256) != 0 ? stageBreakdown.efficiency : i9, (i12 & 512) != 0 ? stageBreakdown.sleepCycles : i10, (i12 & 1024) != 0 ? stageBreakdown.qualityHint : str, (i12 & 2048) != 0 ? stageBreakdown.trackedMin : i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalSleepMin() {
            return this.totalSleepMin;
        }

        /* renamed from: component10, reason: from getter */
        public final int getSleepCycles() {
            return this.sleepCycles;
        }

        /* renamed from: component11, reason: from getter */
        public final String getQualityHint() {
            return this.qualityHint;
        }

        /* renamed from: component12, reason: from getter */
        public final int getTrackedMin() {
            return this.trackedMin;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDeepSleepMin() {
            return this.deepSleepMin;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLightSleepMin() {
            return this.lightSleepMin;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRemSleepMin() {
            return this.remSleepMin;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAwakeSleepMin() {
            return this.awakeSleepMin;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSnoreEvents() {
            return this.snoreEvents;
        }

        /* renamed from: component7, reason: from getter */
        public final int getRestlessnessIndex() {
            return this.restlessnessIndex;
        }

        /* renamed from: component8, reason: from getter */
        public final int getTimeToFallAsleepMin() {
            return this.timeToFallAsleepMin;
        }

        /* renamed from: component9, reason: from getter */
        public final int getEfficiency() {
            return this.efficiency;
        }

        public final StageBreakdown copy(int totalSleepMin, int deepSleepMin, int lightSleepMin, int remSleepMin, int awakeSleepMin, int snoreEvents, int restlessnessIndex, int timeToFallAsleepMin, int efficiency, int sleepCycles, String qualityHint, int trackedMin) {
            Intrinsics.checkNotNullParameter(qualityHint, "qualityHint");
            return new StageBreakdown(totalSleepMin, deepSleepMin, lightSleepMin, remSleepMin, awakeSleepMin, snoreEvents, restlessnessIndex, timeToFallAsleepMin, efficiency, sleepCycles, qualityHint, trackedMin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StageBreakdown)) {
                return false;
            }
            StageBreakdown stageBreakdown = (StageBreakdown) other;
            return this.totalSleepMin == stageBreakdown.totalSleepMin && this.deepSleepMin == stageBreakdown.deepSleepMin && this.lightSleepMin == stageBreakdown.lightSleepMin && this.remSleepMin == stageBreakdown.remSleepMin && this.awakeSleepMin == stageBreakdown.awakeSleepMin && this.snoreEvents == stageBreakdown.snoreEvents && this.restlessnessIndex == stageBreakdown.restlessnessIndex && this.timeToFallAsleepMin == stageBreakdown.timeToFallAsleepMin && this.efficiency == stageBreakdown.efficiency && this.sleepCycles == stageBreakdown.sleepCycles && Intrinsics.areEqual(this.qualityHint, stageBreakdown.qualityHint) && this.trackedMin == stageBreakdown.trackedMin;
        }

        public int hashCode() {
            return (((((((((((((((((((((Integer.hashCode(this.totalSleepMin) * 31) + Integer.hashCode(this.deepSleepMin)) * 31) + Integer.hashCode(this.lightSleepMin)) * 31) + Integer.hashCode(this.remSleepMin)) * 31) + Integer.hashCode(this.awakeSleepMin)) * 31) + Integer.hashCode(this.snoreEvents)) * 31) + Integer.hashCode(this.restlessnessIndex)) * 31) + Integer.hashCode(this.timeToFallAsleepMin)) * 31) + Integer.hashCode(this.efficiency)) * 31) + Integer.hashCode(this.sleepCycles)) * 31) + this.qualityHint.hashCode()) * 31) + Integer.hashCode(this.trackedMin);
        }

        public String toString() {
            return "StageBreakdown(totalSleepMin=" + this.totalSleepMin + ", deepSleepMin=" + this.deepSleepMin + ", lightSleepMin=" + this.lightSleepMin + ", remSleepMin=" + this.remSleepMin + ", awakeSleepMin=" + this.awakeSleepMin + ", snoreEvents=" + this.snoreEvents + ", restlessnessIndex=" + this.restlessnessIndex + ", timeToFallAsleepMin=" + this.timeToFallAsleepMin + ", efficiency=" + this.efficiency + ", sleepCycles=" + this.sleepCycles + ", qualityHint=" + this.qualityHint + ", trackedMin=" + this.trackedMin + ")";
        }

        public StageBreakdown(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String qualityHint, int i11) {
            Intrinsics.checkNotNullParameter(qualityHint, "qualityHint");
            this.totalSleepMin = i;
            this.deepSleepMin = i2;
            this.lightSleepMin = i3;
            this.remSleepMin = i4;
            this.awakeSleepMin = i5;
            this.snoreEvents = i6;
            this.restlessnessIndex = i7;
            this.timeToFallAsleepMin = i8;
            this.efficiency = i9;
            this.sleepCycles = i10;
            this.qualityHint = qualityHint;
            this.trackedMin = i11;
        }

        public /* synthetic */ StageBreakdown(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, str, (i12 & 2048) != 0 ? 0 : i11);
        }

        public final int getTotalSleepMin() {
            return this.totalSleepMin;
        }

        public final int getDeepSleepMin() {
            return this.deepSleepMin;
        }

        public final int getLightSleepMin() {
            return this.lightSleepMin;
        }

        public final int getRemSleepMin() {
            return this.remSleepMin;
        }

        public final int getAwakeSleepMin() {
            return this.awakeSleepMin;
        }

        public final int getSnoreEvents() {
            return this.snoreEvents;
        }

        public final int getRestlessnessIndex() {
            return this.restlessnessIndex;
        }

        public final int getTimeToFallAsleepMin() {
            return this.timeToFallAsleepMin;
        }

        public final int getEfficiency() {
            return this.efficiency;
        }

        public final int getSleepCycles() {
            return this.sleepCycles;
        }

        public final String getQualityHint() {
            return this.qualityHint;
        }

        public final int getTrackedMin() {
            return this.trackedMin;
        }
    }

    /* compiled from: SleepStageInference.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/sleep/SleepStageInference$NightStageResult;", "", "breakdown", "Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;", "hypnogramLabels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "<init>", "(Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;Ljava/util/List;)V", "getBreakdown", "()Lcom/example/rungps/sleep/SleepStageInference$StageBreakdown;", "getHypnogramLabels", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightStageResult {
        public static final int $stable = 8;
        private final StageBreakdown breakdown;
        private final List<SleepStageLabel> hypnogramLabels;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NightStageResult copy$default(NightStageResult nightStageResult, StageBreakdown stageBreakdown, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                stageBreakdown = nightStageResult.breakdown;
            }
            if ((i & 2) != 0) {
                list = nightStageResult.hypnogramLabels;
            }
            return nightStageResult.copy(stageBreakdown, list);
        }

        /* renamed from: component1, reason: from getter */
        public final StageBreakdown getBreakdown() {
            return this.breakdown;
        }

        public final List<SleepStageLabel> component2() {
            return this.hypnogramLabels;
        }

        public final NightStageResult copy(StageBreakdown breakdown, List<? extends SleepStageLabel> hypnogramLabels) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            Intrinsics.checkNotNullParameter(hypnogramLabels, "hypnogramLabels");
            return new NightStageResult(breakdown, hypnogramLabels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightStageResult)) {
                return false;
            }
            NightStageResult nightStageResult = (NightStageResult) other;
            return Intrinsics.areEqual(this.breakdown, nightStageResult.breakdown) && Intrinsics.areEqual(this.hypnogramLabels, nightStageResult.hypnogramLabels);
        }

        public int hashCode() {
            return (this.breakdown.hashCode() * 31) + this.hypnogramLabels.hashCode();
        }

        public String toString() {
            return "NightStageResult(breakdown=" + this.breakdown + ", hypnogramLabels=" + this.hypnogramLabels + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NightStageResult(StageBreakdown breakdown, List<? extends SleepStageLabel> hypnogramLabels) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            Intrinsics.checkNotNullParameter(hypnogramLabels, "hypnogramLabels");
            this.breakdown = breakdown;
            this.hypnogramLabels = hypnogramLabels;
        }

        public final StageBreakdown getBreakdown() {
            return this.breakdown;
        }

        public final List<SleepStageLabel> getHypnogramLabels() {
            return this.hypnogramLabels;
        }
    }

    public static /* synthetic */ List stageLabels$default(SleepStageInference sleepStageInference, List list, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        return sleepStageInference.stageLabels(list, context);
    }

    public final List<SleepStageLabel> stageLabels(List<SleepTrackSample> samples, Context context) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        return samples.isEmpty() ? CollectionsKt.emptyList() : analyzeNight(samples, trackedMinutes(samples), context).getHypnogramLabels();
    }

    public static /* synthetic */ NightStageResult analyzeNight$default(SleepStageInference sleepStageInference, List list, int i, Context context, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            context = null;
        }
        return sleepStageInference.analyzeNight(list, i, context);
    }

    public final NightStageResult analyzeNight(List<SleepTrackSample> samples, int inBedMin, Context context) {
        SleepHistoryPersonalization.Profile profile;
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (context == null || (profile = SleepHistoryPersonalization.INSTANCE.load(context)) == null) {
            profile = SleepHistoryPersonalization.Profile.INSTANCE.getDEFAULT();
        }
        SleepHistoryPersonalization.Profile profile2 = profile;
        if (samples.isEmpty()) {
            Pair<StageBreakdown, List<SleepStageLabel>> reconcile = SleepOvernightReconciler.INSTANCE.reconcile(emptyBreakdown(inBedMin, "No sensor samples — estimate from in-bed time"), CollectionsKt.emptyList(), samples, inBedMin);
            return new NightStageResult(reconcile.getFirst(), reconcile.getSecond());
        }
        if (context != null) {
            SleepMlClassifier.INSTANCE.ensureLoaded(context);
        }
        InferredStages inferSmoothedStages = inferSmoothedStages(samples, context, profile2);
        double inferBucketMs = inferBucketMs(samples) / 60000.0d;
        int roundToInt = MathKt.roundToInt(inferSmoothedStages.getDeepBuckets() * inferBucketMs);
        int roundToInt2 = MathKt.roundToInt(inferSmoothedStages.getRemBuckets() * inferBucketMs);
        int roundToInt3 = MathKt.roundToInt(inferSmoothedStages.getAwakeBuckets() * inferBucketMs);
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(inferSmoothedStages.getLightBuckets() * inferBucketMs), 0);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(roundToInt + coerceAtLeast + roundToInt2, 0);
        int trackedMinutes = trackedMinutes(samples);
        int coerceIn = inBedMin > 0 ? RangesKt.coerceIn(MathKt.roundToInt((coerceAtLeast2 * 100.0d) / inBedMin), 0, 100) : 0;
        List<SleepTrackSample> list = samples;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepTrackSample) it.next()).getMovement()));
        }
        double averageOfFloat = CollectionsKt.averageOfFloat(arrayList) * 40;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(1.0f - ((SleepTrackSample) it2.next()).getQuietFraction()));
        }
        int coerceIn2 = RangesKt.coerceIn((int) (averageOfFloat + (CollectionsKt.averageOfFloat(arrayList2) * 60)), 0, 100);
        int coerceAtLeast3 = inferSmoothedStages.getFoundSleep() ? RangesKt.coerceAtLeast((int) ((inferSmoothedStages.getFallAsleepIdx() * inferBucketMs(samples)) / 60000), 0) : 0;
        int estimateCycles = estimateCycles(inferSmoothedStages.getRemFlags(), coerceAtLeast2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((SleepTrackSample) it3.next()).getBreathRateBpm()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Number) obj).floatValue() > 0.0f) {
                arrayList4.add(obj);
            }
        }
        Double valueOf = Double.valueOf(CollectionsKt.averageOfFloat(arrayList4));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        Pair<StageBreakdown, List<SleepStageLabel>> reconcile2 = SleepOvernightReconciler.INSTANCE.reconcile(new StageBreakdown(coerceAtLeast2, roundToInt, coerceAtLeast, roundToInt2, RangesKt.coerceAtMost(roundToInt3, inBedMin), inferSmoothedStages.getSnore(), coerceIn2, coerceAtLeast3, coerceIn, estimateCycles, buildQualityHint(coerceIn, roundToInt, roundToInt2, estimateCycles, inferSmoothedStages.getSnore(), (float) (valueOf != null ? valueOf.doubleValue() : 0.0d)) + ((inBedMin > 0 ? trackedMinutes / inBedMin : 1.0d) < 0.85d ? " · tracked " + trackedMinutes + "m of " + inBedMin + "m in bed" : ""), trackedMinutes), inferSmoothedStages.getHypnogramLabels(), samples, inBedMin);
        StageBreakdown first = reconcile2.getFirst();
        List<SleepStageLabel> second = reconcile2.getSecond();
        if (profile2.getNightsUsed() >= 2) {
            first = StageBreakdown.copy$default(first, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, first.getQualityHint() + " · tuned from " + profile2.getNightsUsed() + " recent nights", 0, 3071, null);
        }
        return new NightStageResult(first, second);
    }

    public static /* synthetic */ StageBreakdown analyze$default(SleepStageInference sleepStageInference, List list, int i, Context context, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            context = null;
        }
        return sleepStageInference.analyze(list, i, context);
    }

    public final StageBreakdown analyze(List<SleepTrackSample> samples, int inBedMin, Context context) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        return analyzeNight(samples, inBedMin, context).getBreakdown();
    }

    /* compiled from: SleepStageInference.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jy\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/example/rungps/sleep/SleepStageInference$InferredStages;", "", "labels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "remFlags", "", "hypnogramLabels", "deepBuckets", "", "remBuckets", "awakeBuckets", "lightBuckets", "snore", "fallAsleepIdx", "foundSleep", "", "<init>", "(Ljava/util/List;[ZLjava/util/List;IIIIIIZ)V", "getLabels", "()Ljava/util/List;", "getRemFlags", "()[Z", "getHypnogramLabels", "getDeepBuckets", "()I", "getRemBuckets", "getAwakeBuckets", "getLightBuckets", "getSnore", "getFallAsleepIdx", "getFoundSleep", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class InferredStages {
        private final int awakeBuckets;
        private final int deepBuckets;
        private final int fallAsleepIdx;
        private final boolean foundSleep;
        private final List<SleepStageLabel> hypnogramLabels;
        private final List<SleepStageLabel> labels;
        private final int lightBuckets;
        private final int remBuckets;
        private final boolean[] remFlags;
        private final int snore;

        public final List<SleepStageLabel> component1() {
            return this.labels;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getFoundSleep() {
            return this.foundSleep;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean[] getRemFlags() {
            return this.remFlags;
        }

        public final List<SleepStageLabel> component3() {
            return this.hypnogramLabels;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDeepBuckets() {
            return this.deepBuckets;
        }

        /* renamed from: component5, reason: from getter */
        public final int getRemBuckets() {
            return this.remBuckets;
        }

        /* renamed from: component6, reason: from getter */
        public final int getAwakeBuckets() {
            return this.awakeBuckets;
        }

        /* renamed from: component7, reason: from getter */
        public final int getLightBuckets() {
            return this.lightBuckets;
        }

        /* renamed from: component8, reason: from getter */
        public final int getSnore() {
            return this.snore;
        }

        /* renamed from: component9, reason: from getter */
        public final int getFallAsleepIdx() {
            return this.fallAsleepIdx;
        }

        public final InferredStages copy(List<? extends SleepStageLabel> labels, boolean[] remFlags, List<? extends SleepStageLabel> hypnogramLabels, int deepBuckets, int remBuckets, int awakeBuckets, int lightBuckets, int snore, int fallAsleepIdx, boolean foundSleep) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(remFlags, "remFlags");
            Intrinsics.checkNotNullParameter(hypnogramLabels, "hypnogramLabels");
            return new InferredStages(labels, remFlags, hypnogramLabels, deepBuckets, remBuckets, awakeBuckets, lightBuckets, snore, fallAsleepIdx, foundSleep);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InferredStages)) {
                return false;
            }
            InferredStages inferredStages = (InferredStages) other;
            return Intrinsics.areEqual(this.labels, inferredStages.labels) && Intrinsics.areEqual(this.remFlags, inferredStages.remFlags) && Intrinsics.areEqual(this.hypnogramLabels, inferredStages.hypnogramLabels) && this.deepBuckets == inferredStages.deepBuckets && this.remBuckets == inferredStages.remBuckets && this.awakeBuckets == inferredStages.awakeBuckets && this.lightBuckets == inferredStages.lightBuckets && this.snore == inferredStages.snore && this.fallAsleepIdx == inferredStages.fallAsleepIdx && this.foundSleep == inferredStages.foundSleep;
        }

        public int hashCode() {
            return (((((((((((((((((this.labels.hashCode() * 31) + Arrays.hashCode(this.remFlags)) * 31) + this.hypnogramLabels.hashCode()) * 31) + Integer.hashCode(this.deepBuckets)) * 31) + Integer.hashCode(this.remBuckets)) * 31) + Integer.hashCode(this.awakeBuckets)) * 31) + Integer.hashCode(this.lightBuckets)) * 31) + Integer.hashCode(this.snore)) * 31) + Integer.hashCode(this.fallAsleepIdx)) * 31) + Boolean.hashCode(this.foundSleep);
        }

        public String toString() {
            return "InferredStages(labels=" + this.labels + ", remFlags=" + Arrays.toString(this.remFlags) + ", hypnogramLabels=" + this.hypnogramLabels + ", deepBuckets=" + this.deepBuckets + ", remBuckets=" + this.remBuckets + ", awakeBuckets=" + this.awakeBuckets + ", lightBuckets=" + this.lightBuckets + ", snore=" + this.snore + ", fallAsleepIdx=" + this.fallAsleepIdx + ", foundSleep=" + this.foundSleep + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InferredStages(List<? extends SleepStageLabel> labels, boolean[] remFlags, List<? extends SleepStageLabel> hypnogramLabels, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(remFlags, "remFlags");
            Intrinsics.checkNotNullParameter(hypnogramLabels, "hypnogramLabels");
            this.labels = labels;
            this.remFlags = remFlags;
            this.hypnogramLabels = hypnogramLabels;
            this.deepBuckets = i;
            this.remBuckets = i2;
            this.awakeBuckets = i3;
            this.lightBuckets = i4;
            this.snore = i5;
            this.fallAsleepIdx = i6;
            this.foundSleep = z;
        }

        public final List<SleepStageLabel> getLabels() {
            return this.labels;
        }

        public final boolean[] getRemFlags() {
            return this.remFlags;
        }

        public final List<SleepStageLabel> getHypnogramLabels() {
            return this.hypnogramLabels;
        }

        public final int getDeepBuckets() {
            return this.deepBuckets;
        }

        public final int getRemBuckets() {
            return this.remBuckets;
        }

        public final int getAwakeBuckets() {
            return this.awakeBuckets;
        }

        public final int getLightBuckets() {
            return this.lightBuckets;
        }

        public final int getSnore() {
            return this.snore;
        }

        public final int getFallAsleepIdx() {
            return this.fallAsleepIdx;
        }

        public final boolean getFoundSleep() {
            return this.foundSleep;
        }
    }

    private final InferredStages inferSmoothedStages(List<SleepTrackSample> samples, Context context, SleepHistoryPersonalization.Profile profile) {
        int i;
        int i2;
        SleepStageLabel blendedStage;
        List<SleepTrackSample> list = samples;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(SleepFeatureEncoder.INSTANCE.calmness((SleepTrackSample) it.next())));
        }
        List<Float> smooth = smooth(arrayList);
        int size = samples.size();
        boolean[] zArr = new boolean[size];
        ArrayList arrayList2 = new ArrayList();
        int size2 = samples.size();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        for (int i5 = 0; i5 < size2; i5++) {
            SleepTrackSample sleepTrackSample = samples.get(i5);
            float floatValue = smooth.get(i5).floatValue();
            if (!z) {
                float breathRateBpm = sleepTrackSample.getBreathRateBpm();
                if (10.0f <= breathRateBpm && breathRateBpm <= 24.0f && sleepTrackSample.getBreathRegularity() >= SNORE_AUDIO && sleepTrackSample.getMovement() < 1.4f) {
                    i4 = i5;
                    z = true;
                }
            }
            if (sleepTrackSample.getSnoreLikelihood() >= profile.getSnoreAudioThreshold()) {
                i3++;
            }
            SleepStageLabel ruleStage = ruleStage(sleepTrackSample, floatValue, profile);
            if (context != null) {
                SleepStagingV2Classifier.EpochPrediction predictBucket = SleepStagingV2Classifier.INSTANCE.predictBucket(context, samples, i5);
                boolean contains = CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"fan", "traffic", "pet"}), sleepTrackSample.getNoiseTag());
                if (sleepTrackSample.getStageConfidence() != null && sleepTrackSample.getAsleepProb() != null) {
                    blendedStage = stageFromV2Probs(predictBucket.getStageProbs(), ruleStage);
                } else {
                    blendedStage = SleepMlClassifier.INSTANCE.blendedStage(sleepTrackSample, SleepMlClassifier.INSTANCE.featuresFor(samples, i5), ruleStage, context);
                }
                if (contains) {
                    Float stageConfidence = sleepTrackSample.getStageConfidence();
                    if ((stageConfidence != null ? stageConfidence.floatValue() : 0.0f) < 0.55f) {
                    }
                }
                ruleStage = blendedStage;
            }
            arrayList2.add(ruleStage);
        }
        List<SleepStageLabel> smooth2 = SleepStageSmoother.INSTANCE.smooth(arrayList2);
        List<SleepStageLabel> list2 = smooth2;
        int size3 = list2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            if (smooth2.get(i6) == SleepStageLabel.REM) {
                zArr[i6] = true;
            }
        }
        boostRemNearCyclePeaks(zArr, smooth);
        IntRange indices = CollectionsKt.getIndices(list2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it2 = indices.iterator();
        while (it2.hasNext()) {
            int nextInt = ((IntIterator) it2).nextInt();
            arrayList3.add(zArr[nextInt] ? SleepStageLabel.REM : smooth2.get(nextInt));
        }
        ArrayList arrayList4 = arrayList3;
        List<SleepStageLabel> list3 = smooth2;
        boolean z2 = list3 instanceof Collection;
        if (z2 && list3.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it3 = list3.iterator();
            int i7 = 0;
            while (it3.hasNext()) {
                if (((SleepStageLabel) it3.next()) == SleepStageLabel.DEEP && (i7 = i7 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i = i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            if (zArr[i9]) {
                i8++;
            }
        }
        if (z2 && list3.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<T> it4 = list3.iterator();
            int i10 = 0;
            while (it4.hasNext()) {
                if (((SleepStageLabel) it4.next()) == SleepStageLabel.AWAKE && (i10 = i10 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i2 = i10;
        }
        return new InferredStages(smooth2, zArr, arrayList4, i, i8, i2, RangesKt.coerceAtLeast(((samples.size() - i) - i8) - i2, 0), i3, i4, z);
    }

    private final int trackedMinutes(List<SleepTrackSample> samples) {
        if (samples.isEmpty()) {
            return 0;
        }
        long inferBucketMs = inferBucketMs(samples);
        if (samples.size() >= 2) {
            return RangesKt.coerceAtLeast((int) (((((SleepTrackSample) CollectionsKt.last((List) samples)).getElapsedMs() - ((SleepTrackSample) CollectionsKt.first((List) samples)).getElapsedMs()) + inferBucketMs) / 60000), 1);
        }
        return RangesKt.coerceAtLeast((int) ((samples.size() * inferBucketMs) / 60000), 1);
    }

    private final SleepStageLabel ruleStage(SleepTrackSample s, float calm, SleepHistoryPersonalization.Profile profile) {
        boolean z = true;
        boolean z2 = s.getMovement() >= profile.getMovementAwakeThreshold();
        boolean z3 = s.getBreathRateBpm() > 0.0f || s.getBreathRegularity() >= 0.15f;
        if (!z3 || (s.getAudioLevel() < 1.9f && (s.getAudioLevel() < 1.6f || s.getQuietFraction() > 0.12f))) {
            z = false;
        }
        if (z2 || z) {
            return SleepStageLabel.AWAKE;
        }
        if (!z3 && s.getMovement() < 1.3f) {
            return SleepStageLabel.LIGHT;
        }
        if (calm < 0.22f) {
            return SleepStageLabel.AWAKE;
        }
        if (calm >= profile.getDeepCalmThreshold() && s.getBreathRegularity() >= SNORE_AUDIO && s.getQuietFraction() >= 0.4f) {
            return SleepStageLabel.DEEP;
        }
        if (z3) {
            float breathRateBpm = s.getBreathRateBpm();
            if (11.0f <= breathRateBpm && breathRateBpm <= 22.0f && s.getBreathRegularity() >= 0.25f && calm >= 0.4f) {
                return SleepStageLabel.REM;
            }
        }
        return SleepStageLabel.LIGHT;
    }

    private final long inferBucketMs(List<SleepTrackSample> samples) {
        if (samples.size() < 2) {
            return 10000L;
        }
        IntRange until = RangesKt.until(1, samples.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(Long.valueOf(samples.get(nextInt).getElapsedMs() - samples.get(nextInt - 1).getElapsedMs()));
        }
        ArrayList arrayList2 = arrayList;
        return RangesKt.coerceIn(((Number) CollectionsKt.sorted(arrayList2).get(arrayList2.size() / 2)).longValue(), 5000L, 60000L);
    }

    private final void boostRemNearCyclePeaks(boolean[] remFlags, List<Float> calm) {
        if (remFlags.length < 108) {
            return;
        }
        for (int i = 54; i < remFlags.length; i += 54) {
            int coerceAtLeast = RangesKt.coerceAtLeast(i - 3, 0);
            int coerceAtMost = RangesKt.coerceAtMost(i + 5, remFlags.length - 1);
            int i2 = -1;
            if (coerceAtLeast <= coerceAtMost) {
                float f = Float.MAX_VALUE;
                while (true) {
                    if (calm.get(coerceAtLeast).floatValue() < f) {
                        f = calm.get(coerceAtLeast).floatValue();
                        i2 = coerceAtLeast;
                    }
                    if (coerceAtLeast == coerceAtMost) {
                        break;
                    } else {
                        coerceAtLeast++;
                    }
                }
            }
            if (i2 >= 0 && !remFlags[i2]) {
                remFlags[i2] = true;
            }
        }
    }

    private final int estimateCycles(boolean[] remFlags, int asleepMin) {
        if (asleepMin < 60) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < remFlags.length) {
            int i3 = i + 54;
            Iterable until = RangesKt.until(i, RangesKt.coerceAtMost(i3, remFlags.length));
            if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
                Iterator it = until.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (remFlags[((IntIterator) it).nextInt()]) {
                        i2++;
                        break;
                    }
                }
            }
            i = i3;
        }
        return RangesKt.coerceIn(Math.max(i2 / 2, MathKt.roundToInt(asleepMin / 90.0d)), 0, 6);
    }

    private final String buildQualityHint(int efficiency, int deepMin, int remMin, int cycles, int snore, float avgBreath) {
        StringBuilder sb = new StringBuilder();
        sb.append("Efficiency " + efficiency + "%");
        if (avgBreath > 0.0f) {
            sb.append(" · breath ~" + ((int) avgBreath) + "/min");
        }
        if (deepMin > 0) {
            sb.append(" · deep " + deepMin + "m");
        }
        if (remMin > 0) {
            sb.append(" · REM " + remMin + "m");
        }
        if (cycles > 0) {
            sb.append(" · ~" + cycles + " cycles");
        }
        if (snore > 0) {
            sb.append(" · snore " + snore);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final StageBreakdown emptyBreakdown(int inBedMin, String hint) {
        return new StageBreakdown(0, 0, 0, 0, RangesKt.coerceAtLeast(inBedMin, 0), 0, 0, 0, 0, 0, hint, 0);
    }

    static /* synthetic */ StageBreakdown emptyBreakdown$default(SleepStageInference sleepStageInference, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "No samples";
        }
        return sleepStageInference.emptyBreakdown(i, str);
    }

    private final List<Float> smooth(List<Float> values) {
        List listOf;
        if (values.size() <= 2) {
            return values;
        }
        IntRange indices = CollectionsKt.getIndices(values);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (nextInt == 0) {
                listOf = CollectionsKt.listOf((Object[]) new Float[]{values.get(0), values.get(1)});
            } else {
                listOf = nextInt == CollectionsKt.getLastIndex(values) ? CollectionsKt.listOf((Object[]) new Float[]{values.get(nextInt - 1), values.get(nextInt)}) : CollectionsKt.listOf((Object[]) new Float[]{values.get(nextInt - 1), values.get(nextInt), values.get(nextInt + 1)});
            }
            List sorted = CollectionsKt.sorted(listOf);
            arrayList.add(Float.valueOf(((Number) sorted.get(sorted.size() / 2)).floatValue()));
        }
        return arrayList;
    }

    private final SleepStageLabel stageFromV2Probs(float[] probs, SleepStageLabel fallback) {
        if (probs.length < 4) {
            return fallback;
        }
        float f = probs[0];
        float f2 = probs[1];
        float f3 = probs[2];
        float f4 = probs[3];
        float maxOf = ComparisonsKt.maxOf(f, f2, f3, f4);
        if (maxOf < 0.2f) {
            return fallback;
        }
        if (maxOf == f) {
            return SleepStageLabel.AWAKE;
        }
        if (maxOf == f3) {
            return SleepStageLabel.DEEP;
        }
        if (maxOf == f4) {
            return SleepStageLabel.REM;
        }
        return SleepStageLabel.LIGHT;
    }
}
