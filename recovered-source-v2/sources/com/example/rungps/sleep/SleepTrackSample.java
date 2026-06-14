package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepTrackSample.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u00108\u001a\u00020\u00162\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010:\u001a\u00020\u0014H\u0016J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)JÖ\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010NJ\t\u0010O\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00104\u001a\u0004\b6\u00103R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b7\u0010)¨\u0006P"}, d2 = {"Lcom/example/rungps/sleep/SleepTrackSample;", "", "elapsedMs", "", "movement", "", "audioLevel", "breathRateBpm", "breathRegularity", "quietFraction", "snoreLikelihood", "movementVariance", "melCompact", "", "asleepProb", "stageConfidence", "lightSleepProb", "eventTag", "", "snoreIntensity", "", "audioQualityOk", "", "noiseTag", "breathPause", "sonarMotion", "<init>", "(JFFFFFFF[FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)V", "getElapsedMs", "()J", "getMovement", "()F", "getAudioLevel", "getBreathRateBpm", "getBreathRegularity", "getQuietFraction", "getSnoreLikelihood", "getMovementVariance", "getMelCompact", "()[F", "getAsleepProb", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStageConfidence", "getLightSleepProb", "getEventTag", "()Ljava/lang/String;", "getSnoreIntensity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAudioQualityOk", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNoiseTag", "getBreathPause", "getSonarMotion", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(JFFFFFFF[FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/example/rungps/sleep/SleepTrackSample;", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepTrackSample {
    public static final int $stable = 8;
    private final Float asleepProb;
    private final float audioLevel;
    private final Boolean audioQualityOk;
    private final Boolean breathPause;
    private final float breathRateBpm;
    private final float breathRegularity;
    private final long elapsedMs;
    private final String eventTag;
    private final Float lightSleepProb;
    private final float[] melCompact;
    private final float movement;
    private final float movementVariance;
    private final String noiseTag;
    private final float quietFraction;
    private final Integer snoreIntensity;
    private final float snoreLikelihood;
    private final Float sonarMotion;
    private final Float stageConfidence;

    /* renamed from: component1, reason: from getter */
    public final long getElapsedMs() {
        return this.elapsedMs;
    }

    /* renamed from: component10, reason: from getter */
    public final Float getAsleepProb() {
        return this.asleepProb;
    }

    /* renamed from: component11, reason: from getter */
    public final Float getStageConfidence() {
        return this.stageConfidence;
    }

    /* renamed from: component12, reason: from getter */
    public final Float getLightSleepProb() {
        return this.lightSleepProb;
    }

    /* renamed from: component13, reason: from getter */
    public final String getEventTag() {
        return this.eventTag;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getSnoreIntensity() {
        return this.snoreIntensity;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getAudioQualityOk() {
        return this.audioQualityOk;
    }

    /* renamed from: component16, reason: from getter */
    public final String getNoiseTag() {
        return this.noiseTag;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getBreathPause() {
        return this.breathPause;
    }

    /* renamed from: component18, reason: from getter */
    public final Float getSonarMotion() {
        return this.sonarMotion;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMovement() {
        return this.movement;
    }

    /* renamed from: component3, reason: from getter */
    public final float getAudioLevel() {
        return this.audioLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBreathRateBpm() {
        return this.breathRateBpm;
    }

    /* renamed from: component5, reason: from getter */
    public final float getBreathRegularity() {
        return this.breathRegularity;
    }

    /* renamed from: component6, reason: from getter */
    public final float getQuietFraction() {
        return this.quietFraction;
    }

    /* renamed from: component7, reason: from getter */
    public final float getSnoreLikelihood() {
        return this.snoreLikelihood;
    }

    /* renamed from: component8, reason: from getter */
    public final float getMovementVariance() {
        return this.movementVariance;
    }

    /* renamed from: component9, reason: from getter */
    public final float[] getMelCompact() {
        return this.melCompact;
    }

    public final SleepTrackSample copy(long elapsedMs, float movement, float audioLevel, float breathRateBpm, float breathRegularity, float quietFraction, float snoreLikelihood, float movementVariance, float[] melCompact, Float asleepProb, Float stageConfidence, Float lightSleepProb, String eventTag, Integer snoreIntensity, Boolean audioQualityOk, String noiseTag, Boolean breathPause, Float sonarMotion) {
        return new SleepTrackSample(elapsedMs, movement, audioLevel, breathRateBpm, breathRegularity, quietFraction, snoreLikelihood, movementVariance, melCompact, asleepProb, stageConfidence, lightSleepProb, eventTag, snoreIntensity, audioQualityOk, noiseTag, breathPause, sonarMotion);
    }

    public String toString() {
        return "SleepTrackSample(elapsedMs=" + this.elapsedMs + ", movement=" + this.movement + ", audioLevel=" + this.audioLevel + ", breathRateBpm=" + this.breathRateBpm + ", breathRegularity=" + this.breathRegularity + ", quietFraction=" + this.quietFraction + ", snoreLikelihood=" + this.snoreLikelihood + ", movementVariance=" + this.movementVariance + ", melCompact=" + Arrays.toString(this.melCompact) + ", asleepProb=" + this.asleepProb + ", stageConfidence=" + this.stageConfidence + ", lightSleepProb=" + this.lightSleepProb + ", eventTag=" + this.eventTag + ", snoreIntensity=" + this.snoreIntensity + ", audioQualityOk=" + this.audioQualityOk + ", noiseTag=" + this.noiseTag + ", breathPause=" + this.breathPause + ", sonarMotion=" + this.sonarMotion + ")";
    }

    public SleepTrackSample(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, Float f8, Float f9, Float f10, String str, Integer num, Boolean bool, String str2, Boolean bool2, Float f11) {
        this.elapsedMs = j;
        this.movement = f;
        this.audioLevel = f2;
        this.breathRateBpm = f3;
        this.breathRegularity = f4;
        this.quietFraction = f5;
        this.snoreLikelihood = f6;
        this.movementVariance = f7;
        this.melCompact = fArr;
        this.asleepProb = f8;
        this.stageConfidence = f9;
        this.lightSleepProb = f10;
        this.eventTag = str;
        this.snoreIntensity = num;
        this.audioQualityOk = bool;
        this.noiseTag = str2;
        this.breathPause = bool2;
        this.sonarMotion = f11;
    }

    public /* synthetic */ SleepTrackSample(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, Float f8, Float f9, Float f10, String str, Integer num, Boolean bool, String str2, Boolean bool2, Float f11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 0.0f : f4, (i & 32) != 0 ? 0.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? null : fArr, (i & 512) != 0 ? null : f8, (i & 1024) != 0 ? null : f9, (i & 2048) != 0 ? null : f10, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? null : str2, (65536 & i) != 0 ? null : bool2, (i & 131072) != 0 ? null : f11);
    }

    public final long getElapsedMs() {
        return this.elapsedMs;
    }

    public final float getMovement() {
        return this.movement;
    }

    public final float getAudioLevel() {
        return this.audioLevel;
    }

    public final float getBreathRateBpm() {
        return this.breathRateBpm;
    }

    public final float getBreathRegularity() {
        return this.breathRegularity;
    }

    public final float getQuietFraction() {
        return this.quietFraction;
    }

    public final float getSnoreLikelihood() {
        return this.snoreLikelihood;
    }

    public final float getMovementVariance() {
        return this.movementVariance;
    }

    public final float[] getMelCompact() {
        return this.melCompact;
    }

    public final Float getAsleepProb() {
        return this.asleepProb;
    }

    public final Float getStageConfidence() {
        return this.stageConfidence;
    }

    public final Float getLightSleepProb() {
        return this.lightSleepProb;
    }

    public final String getEventTag() {
        return this.eventTag;
    }

    public final Integer getSnoreIntensity() {
        return this.snoreIntensity;
    }

    public final Boolean getAudioQualityOk() {
        return this.audioQualityOk;
    }

    public final String getNoiseTag() {
        return this.noiseTag;
    }

    public final Boolean getBreathPause() {
        return this.breathPause;
    }

    public final Float getSonarMotion() {
        return this.sonarMotion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTrackSample)) {
            return false;
        }
        SleepTrackSample sleepTrackSample = (SleepTrackSample) other;
        return this.elapsedMs == sleepTrackSample.elapsedMs && this.movement == sleepTrackSample.movement && this.audioLevel == sleepTrackSample.audioLevel && this.breathRateBpm == sleepTrackSample.breathRateBpm && this.breathRegularity == sleepTrackSample.breathRegularity && this.quietFraction == sleepTrackSample.quietFraction && this.snoreLikelihood == sleepTrackSample.snoreLikelihood && this.movementVariance == sleepTrackSample.movementVariance && Arrays.equals(this.melCompact, sleepTrackSample.melCompact) && Intrinsics.areEqual(this.asleepProb, sleepTrackSample.asleepProb) && Intrinsics.areEqual(this.stageConfidence, sleepTrackSample.stageConfidence) && Intrinsics.areEqual(this.lightSleepProb, sleepTrackSample.lightSleepProb) && Intrinsics.areEqual(this.eventTag, sleepTrackSample.eventTag) && Intrinsics.areEqual(this.snoreIntensity, sleepTrackSample.snoreIntensity) && Intrinsics.areEqual(this.audioQualityOk, sleepTrackSample.audioQualityOk) && Intrinsics.areEqual(this.noiseTag, sleepTrackSample.noiseTag) && Intrinsics.areEqual(this.breathPause, sleepTrackSample.breathPause) && Intrinsics.areEqual(this.sonarMotion, sleepTrackSample.sonarMotion);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.elapsedMs) * 31) + Float.hashCode(this.movement)) * 31) + Float.hashCode(this.audioLevel)) * 31;
        float[] fArr = this.melCompact;
        int hashCode2 = (hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        Float f = this.asleepProb;
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.stageConfidence;
        int hashCode4 = (hashCode3 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.lightSleepProb;
        int hashCode5 = (hashCode4 + (f3 != null ? f3.hashCode() : 0)) * 31;
        String str = this.eventTag;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.snoreIntensity;
        int intValue = (hashCode6 + (num != null ? num.intValue() : 0)) * 31;
        Boolean bool = this.audioQualityOk;
        int hashCode7 = (intValue + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.noiseTag;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool2 = this.breathPause;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Float f4 = this.sonarMotion;
        return hashCode9 + (f4 != null ? f4.hashCode() : 0);
    }
}
