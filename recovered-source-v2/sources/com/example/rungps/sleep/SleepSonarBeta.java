package com.example.rungps.sleep;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepSonarBeta.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/sleep/SleepSonarBeta;", "", "<init>", "()V", "IMPLEMENTED", "", "isActive", "context", "Landroid/content/Context;", "isEnabledButUnsupported", "userFacingStatus", "", "onToggleRequested", "enabled", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSonarBeta {
    public static final int $stable = 0;
    public static final boolean IMPLEMENTED = true;
    public static final SleepSonarBeta INSTANCE = new SleepSonarBeta();

    private SleepSonarBeta() {
    }

    public final boolean isActive(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SleepListenPreferences.INSTANCE.sonarBetaEnabled(context) && SleepSonarProbe.INSTANCE.deviceSupportsUltrasound(context);
    }

    public final boolean isEnabledButUnsupported(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SleepListenPreferences.INSTANCE.sonarBetaEnabled(context) && !SleepSonarProbe.INSTANCE.deviceSupportsUltrasound(context);
    }

    public final String userFacingStatus(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!SleepListenPreferences.INSTANCE.sonarBetaEnabled(context)) {
            return "Off — uses bedside mic + accelerometer";
        }
        if (!SleepSonarProbe.INSTANCE.deviceSupportsUltrasound(context)) {
            return "Requested — device may not support ultrasound playback; mic + accel only";
        }
        return "On (beta) — hybrid mic + 18–22 kHz sonar";
    }

    public final String onToggleRequested(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        SleepListenPreferences.INSTANCE.setSonarBetaEnabled(context, enabled);
        if (enabled && !SleepSonarProbe.INSTANCE.deviceSupportsUltrasound(context)) {
            return "Sonar beta needs 44.1 kHz+ audio output. Tracking will use mic + movement only on this device.";
        }
        if (enabled) {
            return "Sonar beta enabled — experimental ultrasound fused with mic. Not a medical device.";
        }
        return null;
    }
}
