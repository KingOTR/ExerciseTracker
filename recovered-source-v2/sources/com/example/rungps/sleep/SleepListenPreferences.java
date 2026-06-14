package com.example.rungps.sleep;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepListenPreferences.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepListenPreferences;", "", "<init>", "()V", "PREFS", "", "KEY_INTEREST", "KEY_SAVE_CLIPS", "KEY_SONAR_BETA", "KEY_HIGH_FIDELITY", "KEY_SLEPT_ALONE", "isInterested", "", "context", "Landroid/content/Context;", "setInterested", "", "interested", "saveSoundClips", "setSaveSoundClips", "enabled", "sleptAlone", "setSleptAlone", "alone", "sonarBetaEnabled", "setSonarBetaEnabled", "highFidelityAudio", "setHighFidelityAudio", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepListenPreferences {
    public static final int $stable = 0;
    public static final SleepListenPreferences INSTANCE = new SleepListenPreferences();
    private static final String KEY_HIGH_FIDELITY = "high_fidelity_audio";
    private static final String KEY_INTEREST = "mic_sleep_interest";
    private static final String KEY_SAVE_CLIPS = "mic_sleep_save_clips";
    private static final String KEY_SLEPT_ALONE = "slept_alone";
    private static final String KEY_SONAR_BETA = "sonar_beta";
    private static final String PREFS = "sleep_listen";

    private SleepListenPreferences() {
    }

    public final boolean isInterested(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_INTEREST, false);
    }

    public final void setInterested(Context context, boolean interested) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_INTEREST, interested).apply();
    }

    public final boolean saveSoundClips(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SAVE_CLIPS, false);
    }

    public final void setSaveSoundClips(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_SAVE_CLIPS, enabled).apply();
    }

    public final boolean sleptAlone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SLEPT_ALONE, true);
    }

    public final void setSleptAlone(Context context, boolean alone) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_SLEPT_ALONE, alone).apply();
    }

    public final boolean sonarBetaEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SONAR_BETA, false);
    }

    public final void setSonarBetaEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_SONAR_BETA, enabled).apply();
    }

    public final boolean highFidelityAudio(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_HIGH_FIDELITY, false);
    }

    public final void setHighFidelityAudio(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_HIGH_FIDELITY, enabled).apply();
    }
}
