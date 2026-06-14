package com.example.rungps.sleep;

import android.content.Context;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepYamNetClassifier.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ,\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J*\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/example/rungps/sleep/SleepYamNetClassifier;", "", "<init>", "()V", "runner", "Lcom/example/rungps/sleep/SleepTfliteRunner;", "IDX_SNORING", "", "IDX_SPEECH", "IDX_COUGH", "IDX_SILENCE", "ensureLoaded", "", "context", "Landroid/content/Context;", "classifyEvent", "", "pcm16le", "", "sampleRate", "heuristicSample", "Lcom/example/rungps/sleep/SleepTrackSample;", "snoreScore", "", "sample", "mapYamNetScores", "scores", "", "environmentalNoiseTag", "mapEnvironmentalScores", "heuristicEnvTag", "heuristicTag", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepYamNetClassifier {
    private static final int IDX_COUGH = 42;
    private static final int IDX_SILENCE = 494;
    private static final int IDX_SNORING = 38;
    private static final int IDX_SPEECH = 0;
    public static final SleepYamNetClassifier INSTANCE = new SleepYamNetClassifier();
    private static final SleepTfliteRunner runner = new SleepTfliteRunner(SleepTfliteRunner.ASSET_YAMNET);
    public static final int $stable = 8;

    private SleepYamNetClassifier() {
    }

    public final boolean ensureLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return runner.ensureLoaded(context);
    }

    public static /* synthetic */ String classifyEvent$default(SleepYamNetClassifier sleepYamNetClassifier, Context context, byte[] bArr, int i, SleepTrackSample sleepTrackSample, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            sleepTrackSample = null;
        }
        return sleepYamNetClassifier.classifyEvent(context, bArr, i, sleepTrackSample);
    }

    public final String classifyEvent(Context context, byte[] pcm16le, int sampleRate, SleepTrackSample heuristicSample) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        if (!(pcm16le.length == 0)) {
            SleepTfliteRunner sleepTfliteRunner = runner;
            if (sleepTfliteRunner.ensureLoaded(context)) {
                float[] run = sleepTfliteRunner.run(SleepMelFeatureExtractor.INSTANCE.fromPcm16(pcm16le, sampleRate));
                return run == null ? heuristicTag(heuristicSample) : mapYamNetScores(run);
            }
        }
        return heuristicTag(heuristicSample);
    }

    public final float snoreScore(Context context, byte[] pcm16le, int sampleRate, SleepTrackSample sample) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        if (!(pcm16le.length == 0)) {
            SleepTfliteRunner sleepTfliteRunner = runner;
            if (sleepTfliteRunner.ensureLoaded(context)) {
                float[] run = sleepTfliteRunner.run(SleepMelFeatureExtractor.INSTANCE.fromPcm16(pcm16le, sampleRate));
                if (run != null) {
                    return RangesKt.coerceIn(38 < run.length ? run[38] : 0.0f, 0.0f, 1.0f);
                }
                if (sample != null) {
                    return sample.getSnoreLikelihood();
                }
                return 0.0f;
            }
        }
        if (sample != null) {
            return sample.getSnoreLikelihood();
        }
        return 0.0f;
    }

    private final String mapYamNetScores(float[] scores) {
        float f = 38 < scores.length ? scores[38] : 0.0f;
        float f2 = scores.length > 0 ? scores[0] : 0.0f;
        float f3 = 42 < scores.length ? scores[42] : 0.0f;
        float f4 = IDX_SILENCE < scores.length ? scores[IDX_SILENCE] : 0.0f;
        Iterator it = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("snore", Float.valueOf(f)), TuplesKt.to("talk", Float.valueOf(f2)), TuplesKt.to("cough", Float.valueOf(f3)), TuplesKt.to("silence", Float.valueOf(f4))}).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float floatValue = ((Number) ((Pair) next).getSecond()).floatValue();
            do {
                Object next2 = it.next();
                float floatValue2 = ((Number) ((Pair) next2).getSecond()).floatValue();
                if (Float.compare(floatValue, floatValue2) < 0) {
                    next = next2;
                    floatValue = floatValue2;
                }
            } while (it.hasNext());
        }
        Pair pair = (Pair) next;
        if (((Number) pair.getSecond()).floatValue() < 0.15f) {
            return null;
        }
        if (!Intrinsics.areEqual(pair.getFirst(), "silence") || f4 >= 0.4f) {
            return (String) pair.getFirst();
        }
        return null;
    }

    public final String environmentalNoiseTag(Context context, byte[] pcm16le, int sampleRate, SleepTrackSample sample) {
        String mapEnvironmentalScores;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        if (sample == null) {
            return null;
        }
        if (SleepAudioQualityClassifier.INSTANCE.fanLikelihood(CollectionsKt.listOf(Float.valueOf(sample.getAudioLevel() * 50.0f)), 50.0f) >= 0.65f) {
            return "fan";
        }
        if (!(pcm16le.length == 0)) {
            SleepTfliteRunner sleepTfliteRunner = runner;
            if (sleepTfliteRunner.ensureLoaded(context)) {
                float[] run = sleepTfliteRunner.run(SleepMelFeatureExtractor.INSTANCE.fromPcm16(pcm16le, sampleRate));
                return (run == null || (mapEnvironmentalScores = mapEnvironmentalScores(run)) == null) ? heuristicEnvTag(sample) : mapEnvironmentalScores;
            }
        }
        return heuristicEnvTag(sample);
    }

    private final String mapEnvironmentalScores(float[] scores) {
        Object next;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("fan", Float.valueOf(288 < scores.length ? scores[288] : 0.0f));
        pairArr[1] = TuplesKt.to("traffic", Float.valueOf(309 < scores.length ? scores[309] : 0.0f));
        pairArr[2] = TuplesKt.to("pet", Float.valueOf(74 < scores.length ? scores[74] : 0.0f));
        Iterator it = CollectionsKt.listOf((Object[]) pairArr).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Pair) next).getSecond()).floatValue();
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Pair) next2).getSecond()).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        next = next2;
                        floatValue = floatValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null && ((Number) pair.getSecond()).floatValue() >= 0.2f) {
            return (String) pair.getFirst();
        }
        return null;
    }

    private final String heuristicEnvTag(SleepTrackSample sample) {
        if (SleepAudioQualityClassifier.INSTANCE.fanLikelihood(CollectionsKt.listOf(Float.valueOf(sample.getAudioLevel() * 50.0f)), 50.0f) >= 0.65f) {
            return "fan";
        }
        if (sample.getAudioLevel() >= 2.2f && sample.getSnoreLikelihood() < 0.2f && sample.getBreathRegularity() < 0.2f) {
            return "traffic";
        }
        float audioLevel = sample.getAudioLevel();
        if (1.4f > audioLevel || audioLevel > 2.0f || sample.getMovement() >= 0.5f || sample.getQuietFraction() >= 0.4f) {
            return null;
        }
        return "pet";
    }

    private final String heuristicTag(SleepTrackSample sample) {
        if (sample == null) {
            return null;
        }
        if (sample.getSnoreLikelihood() >= 0.35f) {
            return "snore";
        }
        if (sample.getAudioLevel() >= 2.4f && sample.getBreathRegularity() < 0.25f && sample.getSnoreLikelihood() < 0.25f) {
            return "cough";
        }
        if (sample.getAudioLevel() >= 1.85f && sample.getBreathRateBpm() > 0.0f) {
            return "talk";
        }
        if (sample.getAudioLevel() >= 2.2f && sample.getSnoreLikelihood() < 0.2f) {
            return "noise";
        }
        if (sample.getQuietFraction() >= 0.75f) {
            return "silence";
        }
        return null;
    }
}
