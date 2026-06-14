package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepAudioAnalyzer;
import com.example.rungps.sleep.SleepAudioQualityClassifier;
import com.example.rungps.sleep.SleepStagingV2Classifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepAudioFeaturePipeline.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0013\u001a\u00020\u000fJ2\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0019\u001a\u00020\u000f¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioFeaturePipeline;", "", "<init>", "()V", "analyzeBucket", "Lcom/example/rungps/sleep/SleepAudioFeaturePipeline$BucketFeatures;", "context", "Landroid/content/Context;", "rmsSeries", "", "", "baselineRms", "pcm16le", "", "sampleRate", "", "movement", "recentSamples", "Lcom/example/rungps/sleep/SleepTrackSample;", "bucketIndex", "buildEpoch", "Lcom/example/rungps/sleep/SleepAudioFeaturePipeline$EpochFeatures;", "partialMels", "", "samples", "epochEndIndex", "BucketFeatures", "EpochFeatures", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAudioFeaturePipeline {
    public static final int $stable = 0;
    public static final SleepAudioFeaturePipeline INSTANCE = new SleepAudioFeaturePipeline();

    private SleepAudioFeaturePipeline() {
    }

    /* compiled from: SleepAudioFeaturePipeline.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\t\u00105\u001a\u00020\tHÆ\u0003J\u008c\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d¨\u0006<"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioFeaturePipeline$BucketFeatures;", "", "window", "Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;", "melPartial", "", "eventTag", "", "asleepProb", "", "stageConfidence", "lightSleepProb", "snoreIntensity", "", "audioQualityOk", "", "noiseTag", "breathPause", "sonarMotion", "stagingWeight", "<init>", "(Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;[FLjava/lang/String;FFFIZLjava/lang/String;ZLjava/lang/Float;F)V", "getWindow", "()Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;", "getMelPartial", "()[F", "getEventTag", "()Ljava/lang/String;", "getAsleepProb", "()F", "getStageConfidence", "getLightSleepProb", "getSnoreIntensity", "()I", "getAudioQualityOk", "()Z", "getNoiseTag", "getBreathPause", "getSonarMotion", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStagingWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/example/rungps/sleep/SleepAudioAnalyzer$WindowFeatures;[FLjava/lang/String;FFFIZLjava/lang/String;ZLjava/lang/Float;F)Lcom/example/rungps/sleep/SleepAudioFeaturePipeline$BucketFeatures;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BucketFeatures {
        public static final int $stable = 8;
        private final float asleepProb;
        private final boolean audioQualityOk;
        private final boolean breathPause;
        private final String eventTag;
        private final float lightSleepProb;
        private final float[] melPartial;
        private final String noiseTag;
        private final int snoreIntensity;
        private final Float sonarMotion;
        private final float stageConfidence;
        private final float stagingWeight;
        private final SleepAudioAnalyzer.WindowFeatures window;

        /* renamed from: component1, reason: from getter */
        public final SleepAudioAnalyzer.WindowFeatures getWindow() {
            return this.window;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getBreathPause() {
            return this.breathPause;
        }

        /* renamed from: component11, reason: from getter */
        public final Float getSonarMotion() {
            return this.sonarMotion;
        }

        /* renamed from: component12, reason: from getter */
        public final float getStagingWeight() {
            return this.stagingWeight;
        }

        /* renamed from: component2, reason: from getter */
        public final float[] getMelPartial() {
            return this.melPartial;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEventTag() {
            return this.eventTag;
        }

        /* renamed from: component4, reason: from getter */
        public final float getAsleepProb() {
            return this.asleepProb;
        }

        /* renamed from: component5, reason: from getter */
        public final float getStageConfidence() {
            return this.stageConfidence;
        }

        /* renamed from: component6, reason: from getter */
        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        /* renamed from: component7, reason: from getter */
        public final int getSnoreIntensity() {
            return this.snoreIntensity;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getAudioQualityOk() {
            return this.audioQualityOk;
        }

        /* renamed from: component9, reason: from getter */
        public final String getNoiseTag() {
            return this.noiseTag;
        }

        public final BucketFeatures copy(SleepAudioAnalyzer.WindowFeatures window, float[] melPartial, String eventTag, float asleepProb, float stageConfidence, float lightSleepProb, int snoreIntensity, boolean audioQualityOk, String noiseTag, boolean breathPause, Float sonarMotion, float stagingWeight) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(melPartial, "melPartial");
            return new BucketFeatures(window, melPartial, eventTag, asleepProb, stageConfidence, lightSleepProb, snoreIntensity, audioQualityOk, noiseTag, breathPause, sonarMotion, stagingWeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BucketFeatures)) {
                return false;
            }
            BucketFeatures bucketFeatures = (BucketFeatures) other;
            return Intrinsics.areEqual(this.window, bucketFeatures.window) && Intrinsics.areEqual(this.melPartial, bucketFeatures.melPartial) && Intrinsics.areEqual(this.eventTag, bucketFeatures.eventTag) && Float.compare(this.asleepProb, bucketFeatures.asleepProb) == 0 && Float.compare(this.stageConfidence, bucketFeatures.stageConfidence) == 0 && Float.compare(this.lightSleepProb, bucketFeatures.lightSleepProb) == 0 && this.snoreIntensity == bucketFeatures.snoreIntensity && this.audioQualityOk == bucketFeatures.audioQualityOk && Intrinsics.areEqual(this.noiseTag, bucketFeatures.noiseTag) && this.breathPause == bucketFeatures.breathPause && Intrinsics.areEqual((Object) this.sonarMotion, (Object) bucketFeatures.sonarMotion) && Float.compare(this.stagingWeight, bucketFeatures.stagingWeight) == 0;
        }

        public int hashCode() {
            int hashCode = ((this.window.hashCode() * 31) + Arrays.hashCode(this.melPartial)) * 31;
            String str = this.eventTag;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.asleepProb)) * 31) + Float.hashCode(this.stageConfidence)) * 31) + Float.hashCode(this.lightSleepProb)) * 31) + Integer.hashCode(this.snoreIntensity)) * 31) + Boolean.hashCode(this.audioQualityOk)) * 31;
            String str2 = this.noiseTag;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.breathPause)) * 31;
            Float f = this.sonarMotion;
            return ((hashCode3 + (f != null ? f.hashCode() : 0)) * 31) + Float.hashCode(this.stagingWeight);
        }

        public String toString() {
            return "BucketFeatures(window=" + this.window + ", melPartial=" + Arrays.toString(this.melPartial) + ", eventTag=" + this.eventTag + ", asleepProb=" + this.asleepProb + ", stageConfidence=" + this.stageConfidence + ", lightSleepProb=" + this.lightSleepProb + ", snoreIntensity=" + this.snoreIntensity + ", audioQualityOk=" + this.audioQualityOk + ", noiseTag=" + this.noiseTag + ", breathPause=" + this.breathPause + ", sonarMotion=" + this.sonarMotion + ", stagingWeight=" + this.stagingWeight + ")";
        }

        public BucketFeatures(SleepAudioAnalyzer.WindowFeatures window, float[] melPartial, String str, float f, float f2, float f3, int i, boolean z, String str2, boolean z2, Float f4, float f5) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(melPartial, "melPartial");
            this.window = window;
            this.melPartial = melPartial;
            this.eventTag = str;
            this.asleepProb = f;
            this.stageConfidence = f2;
            this.lightSleepProb = f3;
            this.snoreIntensity = i;
            this.audioQualityOk = z;
            this.noiseTag = str2;
            this.breathPause = z2;
            this.sonarMotion = f4;
            this.stagingWeight = f5;
        }

        public /* synthetic */ BucketFeatures(SleepAudioAnalyzer.WindowFeatures windowFeatures, float[] fArr, String str, float f, float f2, float f3, int i, boolean z, String str2, boolean z2, Float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(windowFeatures, fArr, str, f, f2, f3, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : f4, (i2 & 2048) != 0 ? 1.0f : f5);
        }

        public final SleepAudioAnalyzer.WindowFeatures getWindow() {
            return this.window;
        }

        public final float[] getMelPartial() {
            return this.melPartial;
        }

        public final String getEventTag() {
            return this.eventTag;
        }

        public final float getAsleepProb() {
            return this.asleepProb;
        }

        public final float getStageConfidence() {
            return this.stageConfidence;
        }

        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        public final int getSnoreIntensity() {
            return this.snoreIntensity;
        }

        public final boolean getAudioQualityOk() {
            return this.audioQualityOk;
        }

        public final String getNoiseTag() {
            return this.noiseTag;
        }

        public final boolean getBreathPause() {
            return this.breathPause;
        }

        public final Float getSonarMotion() {
            return this.sonarMotion;
        }

        public final float getStagingWeight() {
            return this.stagingWeight;
        }
    }

    /* compiled from: SleepAudioFeaturePipeline.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/example/rungps/sleep/SleepAudioFeaturePipeline$EpochFeatures;", "", "melCompact", "", "asleepProb", "", "stageConfidence", "lightSleepProb", "eventTag", "", "<init>", "([FFFFLjava/lang/String;)V", "getMelCompact", "()[F", "getAsleepProb", "()F", "getStageConfidence", "getLightSleepProb", "getEventTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EpochFeatures {
        public static final int $stable = 8;
        private final float asleepProb;
        private final String eventTag;
        private final float lightSleepProb;
        private final float[] melCompact;
        private final float stageConfidence;

        public static /* synthetic */ EpochFeatures copy$default(EpochFeatures epochFeatures, float[] fArr, float f, float f2, float f3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fArr = epochFeatures.melCompact;
            }
            if ((i & 2) != 0) {
                f = epochFeatures.asleepProb;
            }
            float f4 = f;
            if ((i & 4) != 0) {
                f2 = epochFeatures.stageConfidence;
            }
            float f5 = f2;
            if ((i & 8) != 0) {
                f3 = epochFeatures.lightSleepProb;
            }
            float f6 = f3;
            if ((i & 16) != 0) {
                str = epochFeatures.eventTag;
            }
            return epochFeatures.copy(fArr, f4, f5, f6, str);
        }

        /* renamed from: component1, reason: from getter */
        public final float[] getMelCompact() {
            return this.melCompact;
        }

        /* renamed from: component2, reason: from getter */
        public final float getAsleepProb() {
            return this.asleepProb;
        }

        /* renamed from: component3, reason: from getter */
        public final float getStageConfidence() {
            return this.stageConfidence;
        }

        /* renamed from: component4, reason: from getter */
        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEventTag() {
            return this.eventTag;
        }

        public final EpochFeatures copy(float[] melCompact, float asleepProb, float stageConfidence, float lightSleepProb, String eventTag) {
            Intrinsics.checkNotNullParameter(melCompact, "melCompact");
            return new EpochFeatures(melCompact, asleepProb, stageConfidence, lightSleepProb, eventTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EpochFeatures)) {
                return false;
            }
            EpochFeatures epochFeatures = (EpochFeatures) other;
            return Intrinsics.areEqual(this.melCompact, epochFeatures.melCompact) && Float.compare(this.asleepProb, epochFeatures.asleepProb) == 0 && Float.compare(this.stageConfidence, epochFeatures.stageConfidence) == 0 && Float.compare(this.lightSleepProb, epochFeatures.lightSleepProb) == 0 && Intrinsics.areEqual(this.eventTag, epochFeatures.eventTag);
        }

        public int hashCode() {
            int hashCode = ((((((Arrays.hashCode(this.melCompact) * 31) + Float.hashCode(this.asleepProb)) * 31) + Float.hashCode(this.stageConfidence)) * 31) + Float.hashCode(this.lightSleepProb)) * 31;
            String str = this.eventTag;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "EpochFeatures(melCompact=" + Arrays.toString(this.melCompact) + ", asleepProb=" + this.asleepProb + ", stageConfidence=" + this.stageConfidence + ", lightSleepProb=" + this.lightSleepProb + ", eventTag=" + this.eventTag + ")";
        }

        public EpochFeatures(float[] melCompact, float f, float f2, float f3, String str) {
            Intrinsics.checkNotNullParameter(melCompact, "melCompact");
            this.melCompact = melCompact;
            this.asleepProb = f;
            this.stageConfidence = f2;
            this.lightSleepProb = f3;
            this.eventTag = str;
        }

        public final float[] getMelCompact() {
            return this.melCompact;
        }

        public final float getAsleepProb() {
            return this.asleepProb;
        }

        public final float getStageConfidence() {
            return this.stageConfidence;
        }

        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        public final String getEventTag() {
            return this.eventTag;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r7.equals("fan") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
    
        r5 = 0.55f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
    
        if (r7.equals("traffic") != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BucketFeatures analyzeBucket(Context context, List<Float> rmsSeries, float baselineRms, byte[] pcm16le, int sampleRate, float movement, List<SleepTrackSample> recentSamples, int bucketIndex) {
        float[] fArr;
        Float f;
        float f2;
        List<SleepTrackSample> list;
        SleepStagingV2Classifier.EpochPrediction predictBucket;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rmsSeries, "rmsSeries");
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        Intrinsics.checkNotNullParameter(recentSamples, "recentSamples");
        SleepAudioAnalyzer.WindowFeatures analyzeWindow = SleepAudioAnalyzer.INSTANCE.analyzeWindow(rmsSeries, baselineRms);
        if (!(pcm16le.length == 0)) {
            fArr = SleepMelFeatureExtractor.INSTANCE.fromPcm16(pcm16le, sampleRate);
        } else {
            fArr = new float[32];
        }
        float[] fArr2 = fArr;
        SleepTrackSample sleepTrackSample = new SleepTrackSample(bucketIndex * 10000, movement, analyzeWindow.getRms(), analyzeWindow.getBreathRateBpm(), analyzeWindow.getBreathRegularity(), analyzeWindow.getQuietFraction(), analyzeWindow.getSnoreLikelihood(), 0.0f, null, null, null, null, null, null, null, null, null, null, 262016, null);
        String classifyEvent = SleepYamNetClassifier.INSTANCE.classifyEvent(context, pcm16le, sampleRate, sleepTrackSample);
        String environmentalNoiseTag = SleepYamNetClassifier.INSTANCE.environmentalNoiseTag(context, pcm16le, sampleRate, sleepTrackSample);
        SleepAudioQualityClassifier.BucketQuality assessBucket = SleepAudioQualityClassifier.INSTANCE.assessBucket(pcm16le, analyzeWindow.getRms() * baselineRms, baselineRms, classifyEvent, environmentalNoiseTag);
        int intensityFromLikelihood = SleepSnoreMetrics.INSTANCE.intensityFromLikelihood(analyzeWindow.getSnoreLikelihood());
        boolean detectPauseInWindow = SleepBreathingDisruptionAnalyzer.INSTANCE.detectPauseInWindow(rmsSeries, baselineRms);
        if (SleepSonarBeta.INSTANCE.isActive(context)) {
            if (!(pcm16le.length == 0)) {
                f = Float.valueOf(SleepSonarProbe.INSTANCE.reflectionMotion(pcm16le, sampleRate));
                Float f3 = f;
                if (environmentalNoiseTag != null) {
                    int hashCode = environmentalNoiseTag.hashCode();
                    if (hashCode != -1067310595) {
                        if (hashCode != 101139) {
                            if (hashCode == 110879 && environmentalNoiseTag.equals("pet")) {
                                float f4 = 0.7f;
                                f2 = f4;
                            }
                        }
                    }
                    list = recentSamples;
                    if (!list.isEmpty()) {
                        predictBucket = SleepStagingV2Classifier.INSTANCE.predictBucket(context, CollectionsKt.plus((Collection<? extends SleepTrackSample>) list, sleepTrackSample), recentSamples.size());
                    } else {
                        predictBucket = SleepStagingV2Classifier.INSTANCE.predictBucket(context, CollectionsKt.listOf(sleepTrackSample), 0);
                    }
                    float max = Math.max(analyzeWindow.getSnoreLikelihood(), SleepYamNetClassifier.INSTANCE.snoreScore(context, pcm16le, sampleRate, sleepTrackSample));
                    return new BucketFeatures(SleepAudioAnalyzer.WindowFeatures.copy$default(analyzeWindow, 0.0f, 0.0f, 0.0f, 0.0f, max, 15, null), fArr2, classifyEvent, predictBucket.getAsleepProb(), RangesKt.coerceIn(predictBucket.getConfidence() * f2, 0.0f, 1.0f), predictBucket.getLightSleepProb(), RangesKt.coerceAtLeast(SleepSnoreMetrics.INSTANCE.intensityFromLikelihood(max), intensityFromLikelihood), assessBucket.getPassesGate(), environmentalNoiseTag, detectPauseInWindow, f3, f2);
                }
                f2 = 1.0f;
                list = recentSamples;
                if (!list.isEmpty()) {
                }
                float max2 = Math.max(analyzeWindow.getSnoreLikelihood(), SleepYamNetClassifier.INSTANCE.snoreScore(context, pcm16le, sampleRate, sleepTrackSample));
                return new BucketFeatures(SleepAudioAnalyzer.WindowFeatures.copy$default(analyzeWindow, 0.0f, 0.0f, 0.0f, 0.0f, max2, 15, null), fArr2, classifyEvent, predictBucket.getAsleepProb(), RangesKt.coerceIn(predictBucket.getConfidence() * f2, 0.0f, 1.0f), predictBucket.getLightSleepProb(), RangesKt.coerceAtLeast(SleepSnoreMetrics.INSTANCE.intensityFromLikelihood(max2), intensityFromLikelihood), assessBucket.getPassesGate(), environmentalNoiseTag, detectPauseInWindow, f3, f2);
            }
        }
        f = null;
        Float f32 = f;
        if (environmentalNoiseTag != null) {
        }
        f2 = 1.0f;
        list = recentSamples;
        if (!list.isEmpty()) {
        }
        float max22 = Math.max(analyzeWindow.getSnoreLikelihood(), SleepYamNetClassifier.INSTANCE.snoreScore(context, pcm16le, sampleRate, sleepTrackSample));
        return new BucketFeatures(SleepAudioAnalyzer.WindowFeatures.copy$default(analyzeWindow, 0.0f, 0.0f, 0.0f, 0.0f, max22, 15, null), fArr2, classifyEvent, predictBucket.getAsleepProb(), RangesKt.coerceIn(predictBucket.getConfidence() * f2, 0.0f, 1.0f), predictBucket.getLightSleepProb(), RangesKt.coerceAtLeast(SleepSnoreMetrics.INSTANCE.intensityFromLikelihood(max22), intensityFromLikelihood), assessBucket.getPassesGate(), environmentalNoiseTag, detectPauseInWindow, f32, f2);
    }

    public final EpochFeatures buildEpoch(Context context, List<float[]> partialMels, List<SleepTrackSample> samples, int epochEndIndex) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(partialMels, "partialMels");
        Intrinsics.checkNotNullParameter(samples, "samples");
        float[] combineEpoch = SleepMelFeatureExtractor.INSTANCE.combineEpoch(partialMels);
        SleepTrackSample sleepTrackSample = (SleepTrackSample) CollectionsKt.getOrNull(samples, epochEndIndex);
        SleepStagingV2Classifier.EpochPrediction predictEpoch = SleepStagingV2Classifier.INSTANCE.predictEpoch(context, combineEpoch, sleepTrackSample != null ? sleepTrackSample.getMovement() : 0.5f, samples, epochEndIndex);
        List takeLast = CollectionsKt.takeLast(samples, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = takeLast.iterator();
        while (it.hasNext()) {
            String eventTag = ((SleepTrackSample) it.next()).getEventTag();
            if (eventTag != null) {
                arrayList.add(eventTag);
            }
        }
        final ArrayList arrayList2 = arrayList;
        Iterator it2 = GroupingKt.eachCount(new Grouping<String, String>() { // from class: com.example.rungps.sleep.SleepAudioFeaturePipeline$buildEpoch$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<String> sourceIterator() {
                return arrayList2.iterator();
            }

            @Override // kotlin.collections.Grouping
            public String keyOf(String element) {
                return element;
            }
        }).entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        return new EpochFeatures(combineEpoch, predictEpoch.getAsleepProb(), predictEpoch.getConfidence(), predictEpoch.getLightSleepProb(), entry != null ? (String) entry.getKey() : null);
    }
}
