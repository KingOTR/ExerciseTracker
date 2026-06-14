package com.example.rungps.ui.sleep;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import androidx.compose.ui.layout.LayoutKt;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepMarkerPreviewSound.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/ui/sleep/SleepMarkerPreviewSound;", "", "<init>", "()V", "SAMPLE_RATE", "", "play", "", "context", "Landroid/content/Context;", "snore", "", "talk", "movement", "synthesizeMovement", "", "synthesizeSnore", "synthesizeVoice", "synthesizeQuiet", "playPcm", "samples", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMarkerPreviewSound {
    public static final int $stable = 0;
    public static final SleepMarkerPreviewSound INSTANCE = new SleepMarkerPreviewSound();
    private static final int SAMPLE_RATE = 22050;

    private SleepMarkerPreviewSound() {
    }

    public final void play(Context context, boolean snore, boolean talk, boolean movement) {
        short[] synthesizeQuiet;
        Intrinsics.checkNotNullParameter(context, "context");
        if (snore) {
            synthesizeQuiet = synthesizeSnore();
        } else if (talk) {
            synthesizeQuiet = synthesizeVoice();
        } else if (movement) {
            synthesizeQuiet = synthesizeMovement();
        } else {
            synthesizeQuiet = synthesizeQuiet();
        }
        playPcm(context, synthesizeQuiet);
    }

    private final short[] synthesizeMovement() {
        double d = SAMPLE_RATE;
        double d2 = 0.55d;
        int i = (int) (d * 0.55d);
        short[] sArr = new short[i];
        Random Random = RandomKt.Random(7);
        int i2 = 0;
        while (i2 < i) {
            double d3 = i2 / d;
            double d4 = (d3 - 0.08d) / 0.22d;
            sArr[i2] = (short) RangesKt.coerceIn((int) (((Math.sin(389.55748904513433d * d3) * d2) + (((Random.nextDouble() * 2) - 1) * 0.45d) + (Math.sin(d3 * 1507.9644737231006d) * 0.12d * ((Random.nextDouble() * 0.6d) + 0.4d))) * RangesKt.coerceIn(d3 / 0.04d, 0.0d, 1.0d) * Math.exp(-(d4 * d4)) * 9500), -32768, LayoutKt.LargeDimension);
            i2++;
            d2 = 0.55d;
        }
        return sArr;
    }

    private final short[] synthesizeSnore() {
        double d = SAMPLE_RATE;
        int i = (int) (0.9d * d);
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            double d2 = i2 / d;
            double sin = (Math.sin(8.482300164692441d * d2) + 1) / 2;
            sArr[i2] = (short) RangesKt.coerceIn((int) (((Math.sin(552.9203070318035d * d2) * 0.7d) + (Math.sin(829.3804605477054d * d2) * 0.25d) + (Math.sin(d2 * 119.38052083641213d) * 0.15d)) * sin * sin * Math.exp((-d2) * 0.35d) * 10500), -32768, LayoutKt.LargeDimension);
        }
        return sArr;
    }

    private final short[] synthesizeVoice() {
        double d = SAMPLE_RATE;
        int i = (int) (0.65d * d);
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            double d2 = i2 / d;
            double d3 = (d2 - 0.15d) / 0.28d;
            double exp = Math.exp(-(d3 * d3));
            double sin = (180 + (40 * Math.sin(20.106192982974676d * d2))) * 6.283185307179586d;
            sArr[i2] = (short) RangesKt.coerceIn((int) (((Math.sin(sin * d2) * 0.55d) + (Math.sin(sin * 2.1d * d2) * 0.2d) + (Math.sin(d2 * 3267.2563597333847d) * 0.08d)) * exp * 8500), -32768, LayoutKt.LargeDimension);
        }
        return sArr;
    }

    private final short[] synthesizeQuiet() {
        short[] sArr = new short[5512];
        Random Random = RandomKt.Random(3);
        for (int i = 0; i < 5512; i++) {
            sArr[i] = (short) (((Random.nextDouble() * 2) - 1) * 0.08d * Math.exp((-(i / SAMPLE_RATE)) * 6) * ErrorCode.ERR_NO_USER_PERMISSION);
        }
        return sArr;
    }

    private final void playPcm(Context context, final short[] samples) {
        final AudioManager audioManager;
        if (samples.length == 0 || (audioManager = (AudioManager) context.getSystemService(AudioManager.class)) == null) {
            return;
        }
        final AudioTrack build = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(SAMPLE_RATE).setChannelMask(4).build()).setBufferSizeInBytes(Math.max(AudioTrack.getMinBufferSize(SAMPLE_RATE, 4, 2), samples.length * 2)).setTransferMode(0).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        build.write(samples, 0, samples.length);
        build.setVolume(1.0f);
        if (audioManager.requestAudioFocus(null, 3, 3) != 1 && audioManager.getStreamVolume(3) == 0) {
            return;
        }
        build.play();
        new Thread(new Runnable() { // from class: com.example.rungps.ui.sleep.SleepMarkerPreviewSound$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SleepMarkerPreviewSound.playPcm$lambda$4(samples, audioManager, build);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPcm$lambda$4(short[] sArr, AudioManager audioManager, AudioTrack audioTrack) {
        try {
            Thread.sleep(((sArr.length * 1000) / SAMPLE_RATE) + 80);
        } catch (InterruptedException unused) {
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            audioTrack.stop();
            audioTrack.release();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        audioManager.abandonAudioFocus(null);
    }
}
