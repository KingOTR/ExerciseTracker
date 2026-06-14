package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepScience;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepNightAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!Jö\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\t\u0010Q\u001a\u00020RHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b'\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b(\u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b1\u0010!R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b2\u0010!R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b3\u0010!R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b4\u0010!R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b5\u0010!¨\u0006S"}, d2 = {"Lcom/example/rungps/sleep/SleepNightInsights;", "", "inBedMin", "", "asleepMin", "awakeMin", "efficiencyPct", "quality", "deepMin", "lightMin", "remMin", "deepPctOfSleep", "remPctOfSleep", "lightPctOfSleep", "awakePctOfInBed", "vsEightHourGoalMin", "durationBand", "Lcom/example/rungps/sleep/SleepScience$DurationBand;", "estimatedCycles", "stageArchitecture", "Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "stageTransitions", "wakeEpisodes", "longestDeepMin", "wasoMin", "hypnogramMinutes", "<init>", "(IIILjava/lang/Integer;IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/example/rungps/sleep/SleepScience$DurationBand;ILcom/example/rungps/sleep/SleepScience$StageArchitecture;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getInBedMin", "()I", "getAsleepMin", "getAwakeMin", "getEfficiencyPct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuality", "getDeepMin", "getLightMin", "getRemMin", "getDeepPctOfSleep", "getRemPctOfSleep", "getLightPctOfSleep", "getAwakePctOfInBed", "getVsEightHourGoalMin", "getDurationBand", "()Lcom/example/rungps/sleep/SleepScience$DurationBand;", "getEstimatedCycles", "getStageArchitecture", "()Lcom/example/rungps/sleep/SleepScience$StageArchitecture;", "getStageTransitions", "getWakeEpisodes", "getLongestDeepMin", "getWasoMin", "getHypnogramMinutes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(IIILjava/lang/Integer;IIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/example/rungps/sleep/SleepScience$DurationBand;ILcom/example/rungps/sleep/SleepScience$StageArchitecture;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/rungps/sleep/SleepNightInsights;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepNightInsights {
    public static final int $stable = 0;
    private final int asleepMin;
    private final int awakeMin;
    private final Integer awakePctOfInBed;
    private final int deepMin;
    private final Integer deepPctOfSleep;
    private final SleepScience.DurationBand durationBand;
    private final Integer efficiencyPct;
    private final int estimatedCycles;
    private final Integer hypnogramMinutes;
    private final int inBedMin;
    private final int lightMin;
    private final Integer lightPctOfSleep;
    private final Integer longestDeepMin;
    private final int quality;
    private final int remMin;
    private final Integer remPctOfSleep;
    private final SleepScience.StageArchitecture stageArchitecture;
    private final Integer stageTransitions;
    private final int vsEightHourGoalMin;
    private final Integer wakeEpisodes;
    private final Integer wasoMin;

    /* renamed from: component1, reason: from getter */
    public final int getInBedMin() {
        return this.inBedMin;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getRemPctOfSleep() {
        return this.remPctOfSleep;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getLightPctOfSleep() {
        return this.lightPctOfSleep;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getAwakePctOfInBed() {
        return this.awakePctOfInBed;
    }

    /* renamed from: component13, reason: from getter */
    public final int getVsEightHourGoalMin() {
        return this.vsEightHourGoalMin;
    }

    /* renamed from: component14, reason: from getter */
    public final SleepScience.DurationBand getDurationBand() {
        return this.durationBand;
    }

    /* renamed from: component15, reason: from getter */
    public final int getEstimatedCycles() {
        return this.estimatedCycles;
    }

    /* renamed from: component16, reason: from getter */
    public final SleepScience.StageArchitecture getStageArchitecture() {
        return this.stageArchitecture;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getStageTransitions() {
        return this.stageTransitions;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getWakeEpisodes() {
        return this.wakeEpisodes;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getLongestDeepMin() {
        return this.longestDeepMin;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAsleepMin() {
        return this.asleepMin;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getWasoMin() {
        return this.wasoMin;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getHypnogramMinutes() {
        return this.hypnogramMinutes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAwakeMin() {
        return this.awakeMin;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getEfficiencyPct() {
        return this.efficiencyPct;
    }

    /* renamed from: component5, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDeepMin() {
        return this.deepMin;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLightMin() {
        return this.lightMin;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRemMin() {
        return this.remMin;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getDeepPctOfSleep() {
        return this.deepPctOfSleep;
    }

    public final SleepNightInsights copy(int inBedMin, int asleepMin, int awakeMin, Integer efficiencyPct, int quality, int deepMin, int lightMin, int remMin, Integer deepPctOfSleep, Integer remPctOfSleep, Integer lightPctOfSleep, Integer awakePctOfInBed, int vsEightHourGoalMin, SleepScience.DurationBand durationBand, int estimatedCycles, SleepScience.StageArchitecture stageArchitecture, Integer stageTransitions, Integer wakeEpisodes, Integer longestDeepMin, Integer wasoMin, Integer hypnogramMinutes) {
        Intrinsics.checkNotNullParameter(durationBand, "durationBand");
        return new SleepNightInsights(inBedMin, asleepMin, awakeMin, efficiencyPct, quality, deepMin, lightMin, remMin, deepPctOfSleep, remPctOfSleep, lightPctOfSleep, awakePctOfInBed, vsEightHourGoalMin, durationBand, estimatedCycles, stageArchitecture, stageTransitions, wakeEpisodes, longestDeepMin, wasoMin, hypnogramMinutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepNightInsights)) {
            return false;
        }
        SleepNightInsights sleepNightInsights = (SleepNightInsights) other;
        return this.inBedMin == sleepNightInsights.inBedMin && this.asleepMin == sleepNightInsights.asleepMin && this.awakeMin == sleepNightInsights.awakeMin && Intrinsics.areEqual(this.efficiencyPct, sleepNightInsights.efficiencyPct) && this.quality == sleepNightInsights.quality && this.deepMin == sleepNightInsights.deepMin && this.lightMin == sleepNightInsights.lightMin && this.remMin == sleepNightInsights.remMin && Intrinsics.areEqual(this.deepPctOfSleep, sleepNightInsights.deepPctOfSleep) && Intrinsics.areEqual(this.remPctOfSleep, sleepNightInsights.remPctOfSleep) && Intrinsics.areEqual(this.lightPctOfSleep, sleepNightInsights.lightPctOfSleep) && Intrinsics.areEqual(this.awakePctOfInBed, sleepNightInsights.awakePctOfInBed) && this.vsEightHourGoalMin == sleepNightInsights.vsEightHourGoalMin && this.durationBand == sleepNightInsights.durationBand && this.estimatedCycles == sleepNightInsights.estimatedCycles && Intrinsics.areEqual(this.stageArchitecture, sleepNightInsights.stageArchitecture) && Intrinsics.areEqual(this.stageTransitions, sleepNightInsights.stageTransitions) && Intrinsics.areEqual(this.wakeEpisodes, sleepNightInsights.wakeEpisodes) && Intrinsics.areEqual(this.longestDeepMin, sleepNightInsights.longestDeepMin) && Intrinsics.areEqual(this.wasoMin, sleepNightInsights.wasoMin) && Intrinsics.areEqual(this.hypnogramMinutes, sleepNightInsights.hypnogramMinutes);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.inBedMin) * 31) + Integer.hashCode(this.asleepMin)) * 31) + Integer.hashCode(this.awakeMin)) * 31;
        Integer num = this.efficiencyPct;
        int hashCode2 = (((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.quality)) * 31) + Integer.hashCode(this.deepMin)) * 31) + Integer.hashCode(this.lightMin)) * 31) + Integer.hashCode(this.remMin)) * 31;
        Integer num2 = this.deepPctOfSleep;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.remPctOfSleep;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.lightPctOfSleep;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.awakePctOfInBed;
        int hashCode6 = (((((((hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31) + Integer.hashCode(this.vsEightHourGoalMin)) * 31) + this.durationBand.hashCode()) * 31) + Integer.hashCode(this.estimatedCycles)) * 31;
        SleepScience.StageArchitecture stageArchitecture = this.stageArchitecture;
        int hashCode7 = (hashCode6 + (stageArchitecture == null ? 0 : stageArchitecture.hashCode())) * 31;
        Integer num6 = this.stageTransitions;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.wakeEpisodes;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.longestDeepMin;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.wasoMin;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.hypnogramMinutes;
        return hashCode11 + (num10 != null ? num10.hashCode() : 0);
    }

    public String toString() {
        return "SleepNightInsights(inBedMin=" + this.inBedMin + ", asleepMin=" + this.asleepMin + ", awakeMin=" + this.awakeMin + ", efficiencyPct=" + this.efficiencyPct + ", quality=" + this.quality + ", deepMin=" + this.deepMin + ", lightMin=" + this.lightMin + ", remMin=" + this.remMin + ", deepPctOfSleep=" + this.deepPctOfSleep + ", remPctOfSleep=" + this.remPctOfSleep + ", lightPctOfSleep=" + this.lightPctOfSleep + ", awakePctOfInBed=" + this.awakePctOfInBed + ", vsEightHourGoalMin=" + this.vsEightHourGoalMin + ", durationBand=" + this.durationBand + ", estimatedCycles=" + this.estimatedCycles + ", stageArchitecture=" + this.stageArchitecture + ", stageTransitions=" + this.stageTransitions + ", wakeEpisodes=" + this.wakeEpisodes + ", longestDeepMin=" + this.longestDeepMin + ", wasoMin=" + this.wasoMin + ", hypnogramMinutes=" + this.hypnogramMinutes + ")";
    }

    public SleepNightInsights(int i, int i2, int i3, Integer num, int i4, int i5, int i6, int i7, Integer num2, Integer num3, Integer num4, Integer num5, int i8, SleepScience.DurationBand durationBand, int i9, SleepScience.StageArchitecture stageArchitecture, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        Intrinsics.checkNotNullParameter(durationBand, "durationBand");
        this.inBedMin = i;
        this.asleepMin = i2;
        this.awakeMin = i3;
        this.efficiencyPct = num;
        this.quality = i4;
        this.deepMin = i5;
        this.lightMin = i6;
        this.remMin = i7;
        this.deepPctOfSleep = num2;
        this.remPctOfSleep = num3;
        this.lightPctOfSleep = num4;
        this.awakePctOfInBed = num5;
        this.vsEightHourGoalMin = i8;
        this.durationBand = durationBand;
        this.estimatedCycles = i9;
        this.stageArchitecture = stageArchitecture;
        this.stageTransitions = num6;
        this.wakeEpisodes = num7;
        this.longestDeepMin = num8;
        this.wasoMin = num9;
        this.hypnogramMinutes = num10;
    }

    public final int getInBedMin() {
        return this.inBedMin;
    }

    public final int getAsleepMin() {
        return this.asleepMin;
    }

    public final int getAwakeMin() {
        return this.awakeMin;
    }

    public final Integer getEfficiencyPct() {
        return this.efficiencyPct;
    }

    public final int getQuality() {
        return this.quality;
    }

    public final int getDeepMin() {
        return this.deepMin;
    }

    public final int getLightMin() {
        return this.lightMin;
    }

    public final int getRemMin() {
        return this.remMin;
    }

    public final Integer getDeepPctOfSleep() {
        return this.deepPctOfSleep;
    }

    public final Integer getRemPctOfSleep() {
        return this.remPctOfSleep;
    }

    public final Integer getLightPctOfSleep() {
        return this.lightPctOfSleep;
    }

    public final Integer getAwakePctOfInBed() {
        return this.awakePctOfInBed;
    }

    public final int getVsEightHourGoalMin() {
        return this.vsEightHourGoalMin;
    }

    public final SleepScience.DurationBand getDurationBand() {
        return this.durationBand;
    }

    public final int getEstimatedCycles() {
        return this.estimatedCycles;
    }

    public final SleepScience.StageArchitecture getStageArchitecture() {
        return this.stageArchitecture;
    }

    public final Integer getStageTransitions() {
        return this.stageTransitions;
    }

    public final Integer getWakeEpisodes() {
        return this.wakeEpisodes;
    }

    public final Integer getLongestDeepMin() {
        return this.longestDeepMin;
    }

    public final Integer getWasoMin() {
        return this.wasoMin;
    }

    public final Integer getHypnogramMinutes() {
        return this.hypnogramMinutes;
    }
}
