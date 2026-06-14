package com.example.rungps.sleep;

import androidx.compose.ui.layout.LayoutKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepMelFeatureExtractor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u0005J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/sleep/SleepMelFeatureExtractor;", "", "<init>", "()V", "MEL_BINS", "", "FRAME_SIZE", "HOP", "melWeights", "", "", "[[I", "fromPcm16", "", "pcm", "", "sampleRate", "fromSamples", "samples", "", "combineEpoch", "partials", "", "frameMel", "", "start", "buildMelWeights", "()[[I", "pcmToShorts", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMelFeatureExtractor {
    public static final int $stable;
    private static final int FRAME_SIZE = 512;
    private static final int HOP = 256;
    public static final SleepMelFeatureExtractor INSTANCE;
    public static final int MEL_BINS = 32;
    private static final int[][] melWeights;

    private SleepMelFeatureExtractor() {
    }

    static {
        SleepMelFeatureExtractor sleepMelFeatureExtractor = new SleepMelFeatureExtractor();
        INSTANCE = sleepMelFeatureExtractor;
        melWeights = sleepMelFeatureExtractor.buildMelWeights();
        $stable = 8;
    }

    public static /* synthetic */ float[] fromPcm16$default(SleepMelFeatureExtractor sleepMelFeatureExtractor, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = SleepAudioConstants.SAMPLE_RATE_V2;
        }
        return sleepMelFeatureExtractor.fromPcm16(bArr, i);
    }

    public final float[] fromPcm16(byte[] pcm, int sampleRate) {
        Intrinsics.checkNotNullParameter(pcm, "pcm");
        return pcm.length < 1024 ? new float[32] : fromSamples(pcmToShorts(pcm), sampleRate);
    }

    public static /* synthetic */ float[] fromSamples$default(SleepMelFeatureExtractor sleepMelFeatureExtractor, short[] sArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = SleepAudioConstants.SAMPLE_RATE_V2;
        }
        return sleepMelFeatureExtractor.fromSamples(sArr, i);
    }

    public final float[] fromSamples(short[] samples, int sampleRate) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.length < 512) {
            return new float[32];
        }
        double[] dArr = new double[32];
        int i = 0;
        for (int i2 = 0; i2 + 512 <= samples.length; i2 += 256) {
            double[] frameMel = frameMel(samples, i2, sampleRate);
            for (int i3 = 0; i3 < 32; i3++) {
                dArr[i3] = dArr[i3] + frameMel[i3];
            }
            i++;
        }
        if (i == 0) {
            return new float[32];
        }
        float[] fArr = new float[32];
        for (int i4 = 0; i4 < 32; i4++) {
            fArr[i4] = RangesKt.coerceIn((float) (Math.log(Math.max(dArr[i4] / i, 1.0E-10d)) + 10.0d), 0.0f, 10.0f) / 10.0f;
        }
        return fArr;
    }

    public final float[] combineEpoch(List<float[]> partials) {
        int i;
        Intrinsics.checkNotNullParameter(partials, "partials");
        if (partials.isEmpty()) {
            return new float[32];
        }
        float[] fArr = new float[32];
        Iterator<float[]> it = partials.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            float[] next = it.next();
            while (i < 32) {
                fArr[i] = fArr[i] + ((i < 0 || i >= next.length) ? 0.0f : next[i]);
                i++;
            }
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(partials.size(), 1.0f);
        while (i < 32) {
            fArr[i] = fArr[i] / coerceAtLeast;
            i++;
        }
        return fArr;
    }

    private final double[] frameMel(short[] samples, int start, int sampleRate) {
        double[] dArr = new double[32];
        int i = 0;
        for (int i2 = 32; i < i2; i2 = 32) {
            int length = melWeights[i].length;
            double d = 0.0d;
            for (int i3 = 0; i3 < length; i3++) {
                double d2 = (r4[i3] * 6.283185307179586d) / sampleRate;
                int i4 = 0;
                double d3 = 0.0d;
                double d4 = 0.0d;
                while (i4 < 512) {
                    double d5 = samples[start + i4] / LayoutKt.LargeDimension;
                    double d6 = i4 * d2;
                    d3 += Math.cos(d6) * d5;
                    d4 += d5 * Math.sin(d6);
                    i4++;
                    dArr = dArr;
                }
                d += (d3 * d3) + (d4 * d4);
            }
            double[] dArr2 = dArr;
            dArr2[i] = d / RangesKt.coerceAtLeast(r4.length, 1);
            i++;
            dArr = dArr2;
        }
        return dArr;
    }

    private final int[][] buildMelWeights() {
        int[][] iArr = new int[32][];
        int i = 0;
        while (i < 32) {
            double d = 32;
            double d2 = i / d;
            int i2 = i + 1;
            double d3 = i2 / d;
            double d4 = 2;
            double d5 = 198;
            int i3 = (int) ((d5 * d2 * d2) + d4);
            int coerceAtLeast = RangesKt.coerceAtLeast((int) (d4 + ((d5 * d3) * d3)), i3 + 1) - i3;
            int[] iArr2 = new int[coerceAtLeast];
            for (int i4 = 0; i4 < coerceAtLeast; i4++) {
                iArr2[i4] = i3 + i4;
            }
            iArr[i] = iArr2;
            i = i2;
        }
        return iArr;
    }

    private final short[] pcmToShorts(byte[] pcm) {
        int length = pcm.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) (((pcm[i2 + 1] & 255) << 8) | (pcm[i2] & 255));
        }
        return sArr;
    }
}
