package com.example.rungps.tracking;

import android.content.Context;
import android.media.ToneGenerator;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunCuePreview.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rJ\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/tracking/RunCuePreview;", "", "<init>", "()V", "preview", "", "context", "Landroid/content/Context;", "voiceEnabled", "", "beepEnabled", "vibrationEnabled", "onSpoken", "Lkotlin/Function0;", "shutdown", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunCuePreview {
    public static final int $stable = 0;
    public static final RunCuePreview INSTANCE = new RunCuePreview();

    private RunCuePreview() {
    }

    public static /* synthetic */ void preview$default(RunCuePreview runCuePreview, Context context, boolean z, boolean z2, boolean z3, Function0 function0, int i, Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        runCuePreview.preview(context, z, z2, z3, function0);
    }

    public final void preview(Context context, boolean voiceEnabled, boolean beepEnabled, boolean vibrationEnabled, Function0<Unit> onSpoken) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (voiceEnabled) {
            RunTtsEngine.INSTANCE.speak(context, RunVoiceAnnouncer.INSTANCE.kilometerSplit(1, 300000L, false), true);
        }
        if (beepEnabled) {
            try {
                Result.Companion companion = Result.INSTANCE;
                RunCuePreview runCuePreview = this;
                Result.m7905constructorimpl(Boolean.valueOf(new ToneGenerator(4, 100).startTone(24, 220)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
        if (vibrationEnabled) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                RunCuePreview runCuePreview2 = this;
                Vibrator vibrator = (Vibrator) ContextCompat.getSystemService(context, Vibrator.class);
                if (vibrator != null && vibrator.hasVibrator()) {
                    vibrator.vibrate(VibrationEffect.createOneShot(180L, -1));
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
        }
        if (onSpoken != null) {
            onSpoken.invoke();
        }
    }

    public final void shutdown() {
        RunTtsEngine.INSTANCE.shutdown();
    }
}
