package com.example.rungps.sleep;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.provider.Settings;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindDownAutomation.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sleep/WindDownAutomation;", "", "<init>", "()V", "apply", "", "context", "Landroid/content/Context;", "pauseMedia", "enablePriorityDnd", "dimScreen", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindDownAutomation {
    public static final int $stable = 0;
    public static final WindDownAutomation INSTANCE = new WindDownAutomation();

    private WindDownAutomation() {
    }

    public final void apply(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        BedtimeReminderPrefs bedtimeReminderPrefs = BedtimeReminderPrefs.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        if (bedtimeReminderPrefs.windDownPauseMedia(applicationContext)) {
            pauseMedia(applicationContext);
        }
        if (BedtimeReminderPrefs.INSTANCE.windDownDnd(applicationContext)) {
            enablePriorityDnd(applicationContext);
        }
        if (BedtimeReminderPrefs.INSTANCE.windDownDim(applicationContext)) {
            dimScreen(applicationContext);
        }
    }

    private final void dimScreen(Context context) {
        if (Settings.System.canWrite(context)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                WindDownAutomation windDownAutomation = this;
                Result.m7905constructorimpl(Boolean.valueOf(Settings.System.putInt(context.getContentResolver(), "screen_brightness", 18)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public final void pauseMedia(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AudioManager audioManager = (AudioManager) ContextCompat.getSystemService(context, AudioManager.class);
        if (audioManager == null) {
            return;
        }
        KeyEvent keyEvent = new KeyEvent(0, 127);
        KeyEvent keyEvent2 = new KeyEvent(1, 127);
        audioManager.dispatchMediaKeyEvent(keyEvent);
        audioManager.dispatchMediaKeyEvent(keyEvent2);
    }

    public final void enablePriorityDnd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManager notificationManager = (NotificationManager) ContextCompat.getSystemService(context, NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        if (!notificationManager.isNotificationPolicyAccessGranted()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                WindDownAutomation windDownAutomation = this;
                context.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS").addFlags(268435456));
                Result.m7905constructorimpl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        notificationManager.setInterruptionFilter(2);
    }
}
