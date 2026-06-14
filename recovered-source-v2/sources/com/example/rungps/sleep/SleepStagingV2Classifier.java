package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepStagingV2Classifier.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ4\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\rH\u0002J&\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/SleepStagingV2Classifier;", "", "<init>", "()V", "runner", "Lcom/example/rungps/sleep/SleepTfliteRunner;", "ensureLoaded", "", "context", "Landroid/content/Context;", "predictEpoch", "Lcom/example/rungps/sleep/SleepStagingV2Classifier$EpochPrediction;", "melEpoch", "", "movement", "", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "centerIndex", "", "predictBucket", "index", "parseTfliteOutput", "out", "legacyPrediction", "EpochPrediction", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepStagingV2Classifier {
    public static final SleepStagingV2Classifier INSTANCE = new SleepStagingV2Classifier();
    private static final SleepTfliteRunner runner = new SleepTfliteRunner(SleepTfliteRunner.ASSET_STAGING_V2);
    public static final int $stable = 8;

    private SleepStagingV2Classifier() {
    }

    /* compiled from: SleepStagingV2Classifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/example/rungps/sleep/SleepStagingV2Classifier$EpochPrediction;", "", "stageProbs", "", "confidence", "", "lightSleepProb", "asleepProb", "usedTflite", "", "<init>", "([FFFFZ)V", "getStageProbs", "()[F", "getConfidence", "()F", "getLightSleepProb", "getAsleepProb", "getUsedTflite", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EpochPrediction {
        public static final int $stable = 8;
        private final float asleepProb;
        private final float confidence;
        private final float lightSleepProb;
        private final float[] stageProbs;
        private final boolean usedTflite;

        public static /* synthetic */ EpochPrediction copy$default(EpochPrediction epochPrediction, float[] fArr, float f, float f2, float f3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                fArr = epochPrediction.stageProbs;
            }
            if ((i & 2) != 0) {
                f = epochPrediction.confidence;
            }
            float f4 = f;
            if ((i & 4) != 0) {
                f2 = epochPrediction.lightSleepProb;
            }
            float f5 = f2;
            if ((i & 8) != 0) {
                f3 = epochPrediction.asleepProb;
            }
            float f6 = f3;
            if ((i & 16) != 0) {
                z = epochPrediction.usedTflite;
            }
            return epochPrediction.copy(fArr, f4, f5, f6, z);
        }

        /* renamed from: component1, reason: from getter */
        public final float[] getStageProbs() {
            return this.stageProbs;
        }

        /* renamed from: component2, reason: from getter */
        public final float getConfidence() {
            return this.confidence;
        }

        /* renamed from: component3, reason: from getter */
        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        /* renamed from: component4, reason: from getter */
        public final float getAsleepProb() {
            return this.asleepProb;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUsedTflite() {
            return this.usedTflite;
        }

        public final EpochPrediction copy(float[] stageProbs, float confidence, float lightSleepProb, float asleepProb, boolean usedTflite) {
            Intrinsics.checkNotNullParameter(stageProbs, "stageProbs");
            return new EpochPrediction(stageProbs, confidence, lightSleepProb, asleepProb, usedTflite);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EpochPrediction)) {
                return false;
            }
            EpochPrediction epochPrediction = (EpochPrediction) other;
            return Intrinsics.areEqual(this.stageProbs, epochPrediction.stageProbs) && Float.compare(this.confidence, epochPrediction.confidence) == 0 && Float.compare(this.lightSleepProb, epochPrediction.lightSleepProb) == 0 && Float.compare(this.asleepProb, epochPrediction.asleepProb) == 0 && this.usedTflite == epochPrediction.usedTflite;
        }

        public int hashCode() {
            return (((((((Arrays.hashCode(this.stageProbs) * 31) + Float.hashCode(this.confidence)) * 31) + Float.hashCode(this.lightSleepProb)) * 31) + Float.hashCode(this.asleepProb)) * 31) + Boolean.hashCode(this.usedTflite);
        }

        public String toString() {
            return "EpochPrediction(stageProbs=" + Arrays.toString(this.stageProbs) + ", confidence=" + this.confidence + ", lightSleepProb=" + this.lightSleepProb + ", asleepProb=" + this.asleepProb + ", usedTflite=" + this.usedTflite + ")";
        }

        public EpochPrediction(float[] stageProbs, float f, float f2, float f3, boolean z) {
            Intrinsics.checkNotNullParameter(stageProbs, "stageProbs");
            this.stageProbs = stageProbs;
            this.confidence = f;
            this.lightSleepProb = f2;
            this.asleepProb = f3;
            this.usedTflite = z;
        }

        public final float[] getStageProbs() {
            return this.stageProbs;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final float getLightSleepProb() {
            return this.lightSleepProb;
        }

        public final float getAsleepProb() {
            return this.asleepProb;
        }

        public final boolean getUsedTflite() {
            return this.usedTflite;
        }
    }

    public final boolean ensureLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SleepMlClassifier.INSTANCE.ensureLoaded(context);
        return runner.ensureLoaded(context);
    }

    public final EpochPrediction predictEpoch(Context context, float[] melEpoch, float movement, List<SleepTrackSample> samples, int centerIndex) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(melEpoch, "melEpoch");
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (runner.ensureLoaded(context)) {
            int length = melEpoch.length + 1;
            float[] fArr = new float[length];
            int i = 0;
            while (i < length) {
                fArr[i] = i < melEpoch.length ? melEpoch[i] : RangesKt.coerceIn(movement / 2.0f, 0.0f, 1.0f);
                i++;
            }
            float[] run = runner.run(fArr);
            if (run != null) {
                return parseTfliteOutput(run);
            }
        }
        return legacyPrediction(context, samples, centerIndex);
    }

    public final EpochPrediction predictBucket(Context context, List<SleepTrackSample> samples, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(samples, "samples");
        SleepTrackSample sleepTrackSample = (SleepTrackSample) CollectionsKt.getOrNull(samples, index);
        float[] melCompact = sleepTrackSample != null ? sleepTrackSample.getMelCompact() : null;
        if (melCompact != null) {
            if (!(melCompact.length == 0)) {
                EpochPrediction predictEpoch = predictEpoch(context, melCompact, sleepTrackSample.getMovement(), samples, index);
                if (predictEpoch.getUsedTflite() || sleepTrackSample.getAsleepProb() != null) {
                    return predictEpoch;
                }
            }
        }
        return legacyPrediction(context, samples, index);
    }

    private final EpochPrediction parseTfliteOutput(float[] out) {
        float[] fArr;
        int length = out.length;
        if (length == 2) {
            fArr = new float[]{out[0], out[1], 0.0f, 0.0f};
        } else if (length == 3) {
            fArr = new float[]{out[0], out[1], 0.0f, out[2]};
        } else {
            int min = Math.min(4, out.length);
            fArr = new float[4];
            int i = 0;
            while (i < 4) {
                fArr[i] = i < min ? out[i] : 0.0f;
                i++;
            }
        }
        float[] fArr2 = fArr;
        float coerceAtLeast = RangesKt.coerceAtLeast(ArraysKt.sum(fArr2), 1.0E-6f);
        int length2 = fArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            fArr2[i2] = fArr2[i2] / coerceAtLeast;
        }
        Float maxOrNull = ArraysKt.maxOrNull(fArr2);
        return new EpochPrediction(fArr2, maxOrNull != null ? maxOrNull.floatValue() : 0.25f, fArr2[1], RangesKt.coerceIn(fArr2[1] + fArr2[2] + fArr2[3], 0.0f, 1.0f), true);
    }

    private final EpochPrediction legacyPrediction(Context context, List<SleepTrackSample> samples, int index) {
        SleepMlClassifier.INSTANCE.ensureLoaded(context);
        float[] featuresFor = SleepMlClassifier.INSTANCE.featuresFor(samples, index);
        float[] stageProbabilities = SleepMlClassifier.INSTANCE.stageProbabilities(featuresFor);
        return new EpochPrediction(stageProbabilities, SleepMlClassifier.INSTANCE.confidence(featuresFor), stageProbabilities[1], SleepMlClassifier.INSTANCE.asleepProbability(featuresFor), false);
    }
}
