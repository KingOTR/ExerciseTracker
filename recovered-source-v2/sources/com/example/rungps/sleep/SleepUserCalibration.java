package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepUserCalibration.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rJ\u001d\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00172\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepUserCalibration;", "", "<init>", "()V", "PREFS", "", "KEY_AUDIO", "KEY_MOVE", "KEY_BREATH_REG", "KEY_NIGHTS", "applyToSample", "Lcom/example/rungps/sleep/SleepTrackSample;", "context", "Landroid/content/Context;", "sample", "recordNight", "", "samples", "", "baselineAudio", "", "baselineMovement", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepUserCalibration {
    public static final int $stable = 0;
    public static final SleepUserCalibration INSTANCE = new SleepUserCalibration();
    private static final String KEY_AUDIO = "ema_audio";
    private static final String KEY_BREATH_REG = "ema_breath_reg";
    private static final String KEY_MOVE = "ema_move";
    private static final String KEY_NIGHTS = "nights";
    private static final String PREFS = "sleep_user_calibration";

    private static final float recordNight$ema(float f, float f2, float f3) {
        if (f2 <= 0.0f) {
            return f3;
        }
        return (f3 * f) + (f2 * (1.0f - f));
    }

    private SleepUserCalibration() {
    }

    public final SleepTrackSample applyToSample(Context context, SleepTrackSample sample) {
        SleepTrackSample copy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sample, "sample");
        copy = sample.copy((r37 & 1) != 0 ? sample.elapsedMs : 0L, (r37 & 2) != 0 ? sample.movement : RangesKt.coerceIn(sample.getMovement() / baselineMovement(context), 0.1f, 3.0f), (r37 & 4) != 0 ? sample.audioLevel : 0.0f, (r37 & 8) != 0 ? sample.breathRateBpm : 0.0f, (r37 & 16) != 0 ? sample.breathRegularity : 0.0f, (r37 & 32) != 0 ? sample.quietFraction : 0.0f, (r37 & 64) != 0 ? sample.snoreLikelihood : 0.0f, (r37 & 128) != 0 ? sample.movementVariance : 0.0f, (r37 & 256) != 0 ? sample.melCompact : null, (r37 & 512) != 0 ? sample.asleepProb : null, (r37 & 1024) != 0 ? sample.stageConfidence : null, (r37 & 2048) != 0 ? sample.lightSleepProb : null, (r37 & 4096) != 0 ? sample.eventTag : null, (r37 & 8192) != 0 ? sample.snoreIntensity : null, (r37 & 16384) != 0 ? sample.audioQualityOk : null, (r37 & 32768) != 0 ? sample.noiseTag : null, (r37 & 65536) != 0 ? sample.breathPause : null, (r37 & 131072) != 0 ? sample.sonarMotion : null);
        return copy;
    }

    public final void recordNight(Context context, List<SleepTrackSample> samples) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.size() < 12) {
            return;
        }
        List<SleepTrackSample> list = samples;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepTrackSample) it.next()).getAudioLevel()));
        }
        float coerceAtLeast = RangesKt.coerceAtLeast((float) CollectionsKt.averageOfFloat(arrayList), 0.2f);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((SleepTrackSample) it2.next()).getMovement()));
        }
        float coerceAtLeast2 = RangesKt.coerceAtLeast((float) CollectionsKt.averageOfFloat(arrayList2), 0.1f);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((SleepTrackSample) it3.next()).getBreathRegularity()));
        }
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList3);
        SharedPreferences prefs = prefs(context);
        int coerceAtMost = RangesKt.coerceAtMost(prefs.getInt(KEY_NIGHTS, 0), 30);
        float f = coerceAtMost < 3 ? 0.45f : 0.18f;
        prefs.edit().putFloat(KEY_AUDIO, recordNight$ema(f, prefs.getFloat(KEY_AUDIO, coerceAtLeast), coerceAtLeast)).putFloat(KEY_MOVE, recordNight$ema(f, prefs.getFloat(KEY_MOVE, coerceAtLeast2), coerceAtLeast2)).putFloat(KEY_BREATH_REG, recordNight$ema(f, prefs.getFloat(KEY_BREATH_REG, 0.4f), averageOfFloat)).putInt(KEY_NIGHTS, RangesKt.coerceAtMost(coerceAtMost + 1, 31)).apply();
    }

    public final float baselineAudio(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_AUDIO, SleepOvernightStore.INSTANCE.baselineAudioRms(context) / 200.0f), 0.3f, 2.5f);
    }

    public final float baselineMovement(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_MOVE, 1.0f), 0.2f, 2.5f);
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }
}
