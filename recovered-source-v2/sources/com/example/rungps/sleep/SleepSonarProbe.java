package com.example.rungps.sleep;

import android.content.Context;
import android.media.AudioManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepSonarProbe.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0017\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\rJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J(\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/sleep/SleepSonarProbe;", "", "<init>", "()V", "CHIRP_MIN_HZ", "", "CHIRP_MAX_HZ", "CHIRP_CENTER_HZ", "deviceSupportsUltrasound", "", "context", "Landroid/content/Context;", "reflectionMotion", "", "pcm16le", "", "sampleRate", "fuseMotion", "micMovement", "sonarMotion", "sonarWeight", "pcm16ToShort", "", "pcm", "totalEnergy", "samples", "highBandEnergy", "minHz", "maxHz", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSonarProbe {
    public static final int $stable = 0;
    public static final int CHIRP_CENTER_HZ = 20000;
    public static final int CHIRP_MAX_HZ = 22000;
    public static final int CHIRP_MIN_HZ = 18000;
    public static final SleepSonarProbe INSTANCE = new SleepSonarProbe();

    private SleepSonarProbe() {
    }

    public final boolean deviceSupportsUltrasound(Context context) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return false;
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return ((property == null || (intOrNull = StringsKt.toIntOrNull(property)) == null) ? 48000 : intOrNull.intValue()) >= 44100;
    }

    public final float reflectionMotion(byte[] pcm16le, int sampleRate) {
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        if (pcm16le.length < 8 || sampleRate < 16000) {
            return 0.0f;
        }
        short[] pcm16ToShort = pcm16ToShort(pcm16le);
        return RangesKt.coerceIn(highBandEnergy(pcm16ToShort, sampleRate, CHIRP_MIN_HZ, CHIRP_MAX_HZ) / RangesKt.coerceAtLeast(totalEnergy(pcm16ToShort), 1.0E-6f), 0.0f, 1.0f);
    }

    public static /* synthetic */ float fuseMotion$default(SleepSonarProbe sleepSonarProbe, float f, float f2, float f3, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.35f;
        }
        return sleepSonarProbe.fuseMotion(f, f2, f3);
    }

    public final float fuseMotion(float micMovement, float sonarMotion, float sonarWeight) {
        float coerceIn = RangesKt.coerceIn(sonarWeight, 0.0f, 0.6f);
        return RangesKt.coerceIn((micMovement * (1.0f - coerceIn)) + (sonarMotion * coerceIn * 2.0f), 0.0f, 2.0f);
    }

    private final short[] pcm16ToShort(byte[] pcm) {
        int length = pcm.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((pcm[i2 + 1] << 8) | (pcm[i2] & 255));
        }
        return sArr;
    }

    private final float totalEnergy(short[] samples) {
        double d = 0.0d;
        for (double d2 : samples) {
            d += d2 * d2;
        }
        return (float) (d / RangesKt.coerceAtLeast(samples.length, 1));
    }

    private final float highBandEnergy(short[] samples, int sampleRate, int minHz, int maxHz) {
        int i = (minHz + maxHz) / 2;
        double d = (i * 6.283185307179586d) / sampleRate;
        double cos = Math.cos(d) * 2.0d;
        int coerceAtLeast = RangesKt.coerceAtLeast(sampleRate / i, 1);
        double d2 = 0.0d;
        int i2 = 0;
        double d3 = 0.0d;
        while (i2 < samples.length) {
            double d4 = (samples[i2] + (cos * d2)) - d3;
            i2 += coerceAtLeast;
            double d5 = d2;
            d2 = d4;
            d3 = d5;
        }
        double cos2 = d2 - (Math.cos(d) * d3);
        double sin = d3 * Math.sin(d);
        return (float) Math.abs((cos2 * cos2) + (sin * sin));
    }
}
