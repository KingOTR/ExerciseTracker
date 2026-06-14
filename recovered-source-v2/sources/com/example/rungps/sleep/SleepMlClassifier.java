package com.example.rungps.sleep;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SleepMlClassifier.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0007J*\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001c2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002J\f\u0010'\u001a\u00020\u0007*\u00020(H\u0002J\r\u0010)\u001a\u00020\u0016H\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/example/rungps/sleep/SleepMlClassifier;", "", "<init>", "()V", "loaded", "", "w1", "", "b1", "w2", "b2", "inputSize", "", "hiddenSize", "usesContextModel", "featuresFor", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "index", "isLoaded", "ensureLoaded", "", "context", "Landroid/content/Context;", "stageProbabilities", "features", "predictStage", "Lcom/example/rungps/sleep/SleepStageLabel;", "asleepProbability", "", "confidence", "blendedStage", "sample", "rule", "relu", "v", "softmax", "logits", "toFloatArray", "Lorg/json/JSONArray;", "loadFallbackForTests", "loadFallbackForTests$app_sideload", "loadFallbackWeights", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMlClassifier {
    private static boolean loaded;
    private static boolean usesContextModel;
    public static final SleepMlClassifier INSTANCE = new SleepMlClassifier();
    private static float[] w1 = new float[0];
    private static float[] b1 = new float[0];
    private static float[] w2 = new float[0];
    private static float[] b2 = new float[0];
    private static int inputSize = 8;
    private static int hiddenSize = 12;
    public static final int $stable = 8;

    private final float relu(float v) {
        if (v > 0.0f) {
            return v;
        }
        return 0.0f;
    }

    private SleepMlClassifier() {
    }

    public final float[] featuresFor(List<SleepTrackSample> samples, int index) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        return usesContextModel ? SleepFeatureEncoder.INSTANCE.encode(samples, index) : SleepFeatureEncoder.INSTANCE.encodeCurrent(samples.get(index));
    }

    public final boolean isLoaded() {
        return loaded;
    }

    public final void ensureLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (loaded) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepMlClassifier sleepMlClassifier = this;
            InputStream open = context.getAssets().open("sleep_ml_weights.json");
            try {
                InputStream inputStream = open;
                Intrinsics.checkNotNull(inputStream);
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                JSONObject jSONObject = new JSONObject(TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192)));
                inputSize = jSONObject.getInt("inputSize");
                hiddenSize = jSONObject.getInt("hiddenSize");
                JSONArray jSONArray = jSONObject.getJSONArray("w1");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                w1 = toFloatArray(jSONArray);
                JSONArray jSONArray2 = jSONObject.getJSONArray("b1");
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
                b1 = toFloatArray(jSONArray2);
                JSONArray jSONArray3 = jSONObject.getJSONArray("w2");
                Intrinsics.checkNotNullExpressionValue(jSONArray3, "getJSONArray(...)");
                w2 = toFloatArray(jSONArray3);
                JSONArray jSONArray4 = jSONObject.getJSONArray("b2");
                Intrinsics.checkNotNullExpressionValue(jSONArray4, "getJSONArray(...)");
                b2 = toFloatArray(jSONArray4);
                usesContextModel = inputSize > 8;
                loaded = true;
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(open, null);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (loaded) {
            return;
        }
        loadFallbackWeights();
        loaded = true;
    }

    public final float[] stageProbabilities(float[] features) {
        Intrinsics.checkNotNullParameter(features, "features");
        if (!loaded) {
            return new float[]{0.25f, 0.25f, 0.25f, 0.25f};
        }
        float[] fArr = new float[hiddenSize];
        int min = Math.min(features.length, inputSize);
        int i = hiddenSize;
        int i2 = 0;
        while (i2 < i) {
            float[] fArr2 = b1;
            float f = (i2 < 0 || i2 >= fArr2.length) ? 0.0f : fArr2[i2];
            for (int i3 = 0; i3 < min; i3++) {
                float f2 = features[i3];
                float[] fArr3 = w1;
                int i4 = (inputSize * i2) + i3;
                f += f2 * ((i4 < 0 || i4 >= fArr3.length) ? 0.0f : fArr3[i4]);
            }
            fArr[i2] = relu(f);
            i2++;
        }
        float[] fArr4 = new float[4];
        int i5 = 0;
        while (i5 < 4) {
            float[] fArr5 = b2;
            float f3 = (i5 < 0 || i5 >= fArr5.length) ? 0.0f : fArr5[i5];
            int i6 = hiddenSize;
            for (int i7 = 0; i7 < i6; i7++) {
                float f4 = fArr[i7];
                float[] fArr6 = w2;
                int i8 = (i7 * 4) + i5;
                f3 += f4 * ((i8 < 0 || i8 >= fArr6.length) ? 0.0f : fArr6[i8]);
            }
            fArr4[i5] = f3;
            i5++;
        }
        return softmax(fArr4);
    }

    public final SleepStageLabel predictStage(float[] features) {
        Intrinsics.checkNotNullParameter(features, "features");
        float[] stageProbabilities = stageProbabilities(features);
        Iterator<Integer> it = ArraysKt.getIndices(stageProbabilities).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        IntIterator intIterator = (IntIterator) it;
        int nextInt = intIterator.nextInt();
        if (it.hasNext()) {
            float f = stageProbabilities[nextInt];
            do {
                int nextInt2 = intIterator.nextInt();
                float f2 = stageProbabilities[nextInt2];
                if (Float.compare(f, f2) < 0) {
                    nextInt = nextInt2;
                    f = f2;
                }
            } while (it.hasNext());
        }
        return SleepStageLabel.INSTANCE.fromIndex(nextInt);
    }

    public final float asleepProbability(float[] features) {
        Intrinsics.checkNotNullParameter(features, "features");
        float[] stageProbabilities = stageProbabilities(features);
        return RangesKt.coerceIn(stageProbabilities[1] + stageProbabilities[2] + stageProbabilities[3], 0.0f, 1.0f);
    }

    public final float confidence(float[] features) {
        Intrinsics.checkNotNullParameter(features, "features");
        Float maxOrNull = ArraysKt.maxOrNull(stageProbabilities(features));
        if (maxOrNull != null) {
            return maxOrNull.floatValue();
        }
        return 0.0f;
    }

    public static /* synthetic */ SleepStageLabel blendedStage$default(SleepMlClassifier sleepMlClassifier, SleepTrackSample sleepTrackSample, float[] fArr, SleepStageLabel sleepStageLabel, Context context, int i, Object obj) {
        if ((i & 8) != 0) {
            context = null;
        }
        return sleepMlClassifier.blendedStage(sleepTrackSample, fArr, sleepStageLabel, context);
    }

    public final SleepStageLabel blendedStage(SleepTrackSample sample, float[] features, SleepStageLabel rule, Context context) {
        Intrinsics.checkNotNullParameter(sample, "sample");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (confidence(features) < (context != null ? SleepMlFeedback.INSTANCE.confidenceThreshold(context) : 0.52f)) {
            return rule;
        }
        float[] stageProbabilities = stageProbabilities(features);
        float[] fArr = {stageProbabilities[0] + (context != null ? SleepMlFeedback.INSTANCE.awakeLogitBias(context) : 0.0f), stageProbabilities[1], stageProbabilities[2] + (context != null ? SleepMlFeedback.INSTANCE.deepLogitBias(context) : 0.0f), stageProbabilities[3]};
        Iterator<Integer> it = ArraysKt.getIndices(fArr).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        IntIterator intIterator = (IntIterator) it;
        int nextInt = intIterator.nextInt();
        if (it.hasNext()) {
            float f = fArr[nextInt];
            do {
                int nextInt2 = intIterator.nextInt();
                float f2 = fArr[nextInt2];
                if (Float.compare(f, f2) < 0) {
                    nextInt = nextInt2;
                    f = f2;
                }
            } while (it.hasNext());
        }
        return SleepStageLabel.INSTANCE.fromIndex(nextInt);
    }

    private final float[] softmax(float[] logits) {
        float maxOrThrow = ArraysKt.maxOrThrow(logits);
        int length = logits.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) Math.exp(logits[i] - maxOrThrow);
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(ArraysKt.sum(fArr), 1.0E-6f);
        int length2 = logits.length;
        float[] fArr2 = new float[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            fArr2[i2] = fArr[i2] / coerceAtLeast;
        }
        return fArr2;
    }

    private final float[] toFloatArray(JSONArray jSONArray) {
        int length = jSONArray.length();
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) jSONArray.getDouble(i);
        }
        return fArr;
    }

    public final void loadFallbackForTests$app_sideload() {
        loadFallbackWeights();
        loaded = true;
    }

    private final void loadFallbackWeights() {
        inputSize = 8;
        hiddenSize = 8;
        w1 = new float[]{0.42f, 0.38f, -0.35f, -0.28f, -0.22f, 0.18f, 0.12f, 0.45f, -0.38f, -0.32f, 0.41f, 0.36f, 0.28f, -0.15f, -0.12f, 0.22f, 0.35f, 0.28f, 0.32f, -0.42f, 0.38f, -0.25f, -0.18f, -0.35f, -0.45f, -0.28f, 0.22f, 0.18f, -0.32f, 0.42f, 0.15f, 0.38f, 0.28f, -0.22f, 0.25f, 0.32f, -0.28f, -0.35f, 0.4f, 0.2f, -0.32f, 0.35f, -0.28f, 0.42f, 0.15f, 0.22f, -0.38f, 0.3f, 0.4f, 0.32f, -0.3f, -0.25f, -0.2f, 0.35f, 0.18f, 0.42f, -0.28f, -0.35f, 0.38f, 0.32f, 0.25f, -0.22f, 0.15f, -0.4f};
        b1 = new float[]{-0.12f, -0.08f, -0.15f, -0.1f, -0.14f, -0.11f, -0.09f, -0.13f};
        w2 = new float[]{0.55f, -0.15f, -0.35f, -0.42f, -0.42f, 0.48f, -0.22f, -0.28f, -0.38f, -0.28f, 0.52f, -0.32f, -0.32f, -0.25f, -0.28f, 0.45f, 0.35f, -0.22f, -0.3f, -0.35f, -0.4f, 0.32f, -0.25f, -0.28f, -0.35f, -0.3f, -0.32f, 0.42f, -0.28f, -0.25f, -0.22f, 0.38f};
        b2 = new float[]{0.85f, 0.05f, -0.45f, -0.35f};
    }
}
