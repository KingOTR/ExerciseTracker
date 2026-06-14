package com.example.rungps.sleep;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepFeatureEncoder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/sleep/SleepFeatureEncoder;", "", "<init>", "()V", "FEATURES_PER_BUCKET", "", "CONTEXT_BUCKETS", "INPUT_SIZE", "getINPUT_SIZE", "()I", "encodeCurrent", "", "s", "Lcom/example/rungps/sleep/SleepTrackSample;", "encode", "samples", "", "index", "calmness", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepFeatureEncoder {
    public static final int $stable = 0;
    public static final int CONTEXT_BUCKETS = 3;
    public static final int FEATURES_PER_BUCKET = 8;
    public static final SleepFeatureEncoder INSTANCE = new SleepFeatureEncoder();
    private static final int INPUT_SIZE = 32;

    private SleepFeatureEncoder() {
    }

    public final int getINPUT_SIZE() {
        return INPUT_SIZE;
    }

    public final float[] encodeCurrent(SleepTrackSample s) {
        float coerceIn;
        Intrinsics.checkNotNullParameter(s, "s");
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    coerceIn = RangesKt.coerceIn(s.getMovement() / 2.0f, 0.0f, 1.0f);
                    break;
                case 1:
                    coerceIn = RangesKt.coerceIn(s.getAudioLevel() / 3.0f, 0.0f, 1.0f);
                    break;
                case 2:
                    coerceIn = RangesKt.coerceIn(s.getBreathRegularity(), 0.0f, 1.0f);
                    break;
                case 3:
                    coerceIn = RangesKt.coerceIn(s.getBreathRateBpm() / 24.0f, 0.0f, 1.0f);
                    break;
                case 4:
                    coerceIn = RangesKt.coerceIn(s.getQuietFraction(), 0.0f, 1.0f);
                    break;
                case 5:
                    coerceIn = RangesKt.coerceIn(s.getSnoreLikelihood(), 0.0f, 1.0f);
                    break;
                case 6:
                    coerceIn = RangesKt.coerceIn(s.getMovementVariance() / 8.0f, 0.0f, 1.0f);
                    break;
                default:
                    coerceIn = INSTANCE.calmness(s);
                    break;
            }
            fArr[i] = coerceIn;
        }
        return fArr;
    }

    public final float[] encode(List<SleepTrackSample> samples, int index) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        float[] fArr = new float[INPUT_SIZE];
        int i = 0;
        int coerceAtLeast = RangesKt.coerceAtLeast(index - 3, 0);
        if (coerceAtLeast <= index) {
            while (true) {
                SleepTrackSample sleepTrackSample = samples.get(coerceAtLeast);
                fArr[i] = RangesKt.coerceIn(sleepTrackSample.getMovement() / 2.0f, 0.0f, 1.0f);
                fArr[i + 1] = RangesKt.coerceIn(sleepTrackSample.getAudioLevel() / 3.0f, 0.0f, 1.0f);
                fArr[i + 2] = RangesKt.coerceIn(sleepTrackSample.getBreathRegularity(), 0.0f, 1.0f);
                fArr[i + 3] = RangesKt.coerceIn(sleepTrackSample.getBreathRateBpm() / 24.0f, 0.0f, 1.0f);
                fArr[i + 4] = RangesKt.coerceIn(sleepTrackSample.getQuietFraction(), 0.0f, 1.0f);
                fArr[i + 5] = RangesKt.coerceIn(sleepTrackSample.getSnoreLikelihood(), 0.0f, 1.0f);
                int i2 = i + 7;
                fArr[i + 6] = RangesKt.coerceIn(sleepTrackSample.getMovementVariance() / 8.0f, 0.0f, 1.0f);
                i += 8;
                fArr[i2] = calmness(sleepTrackSample);
                if (coerceAtLeast == index) {
                    break;
                }
                coerceAtLeast++;
            }
        }
        while (i < INPUT_SIZE) {
            fArr[i] = 0.0f;
            i++;
        }
        return fArr;
    }

    public final float calmness(SleepTrackSample s) {
        Intrinsics.checkNotNullParameter(s, "s");
        float breathRateBpm = s.getBreathRateBpm();
        return RangesKt.coerceIn(((10.0f > breathRateBpm || breathRateBpm > 22.0f) ? s.getBreathRateBpm() > 0.0f ? 0.1f : 0.15f : RangesKt.coerceIn(s.getBreathRegularity(), 0.0f, 1.0f) * 0.35f) + (RangesKt.coerceIn(s.getQuietFraction(), 0.0f, 1.0f) * 0.35f) + ((1.0f - RangesKt.coerceIn(s.getMovement() / 2.0f, 0.0f, 1.0f)) * 0.3f), 0.0f, 1.0f);
    }
}
