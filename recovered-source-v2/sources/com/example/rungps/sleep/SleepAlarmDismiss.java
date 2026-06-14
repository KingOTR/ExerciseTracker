package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.notify.AppNotifications;
import com.example.rungps.sleep.SleepAlarmSoundService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepAlarmDismiss.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmDismiss;", "", "<init>", "()V", "WAKE_NOTIFICATION_ID", "", "SOUND_NOTIFICATION_ID", "WAKE_EVENT_KEY", "", "dismissAll", "", "context", "Landroid/content/Context;", "isRinging", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmDismiss {
    public static final int $stable = 0;
    public static final SleepAlarmDismiss INSTANCE = new SleepAlarmDismiss();
    public static final int SOUND_NOTIFICATION_ID = 7105;
    public static final String WAKE_EVENT_KEY = "sleep_alarm:wake";
    public static final int WAKE_NOTIFICATION_ID = 7103;

    private SleepAlarmDismiss() {
    }

    public final void dismissAll(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        SleepAlarmActivity.INSTANCE.closeIfShowing();
        SleepAlarmSoundService.Companion companion = SleepAlarmSoundService.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        companion.requestStop(applicationContext);
        SleepAlarmScheduler.INSTANCE.cancelAll(applicationContext);
        AppNotifications.INSTANCE.cancel(applicationContext, 7103);
        AppNotifications.INSTANCE.cancel(applicationContext, SOUND_NOTIFICATION_ID);
        AppNotifications.INSTANCE.recordDismissed(applicationContext, WAKE_EVENT_KEY, 7103);
        applicationContext.getSharedPreferences("sleep_alarm_state", 0).edit().remove("last_fire_ms").apply();
    }

    public final boolean isRinging() {
        return SleepAlarmSoundService.INSTANCE.isRinging();
    }
}
