package com.example.rungps.sleep;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.example.rungps.MainActivity;
import com.example.rungps.notify.AppNotifications;
import com.example.rungps.sleep.SleepAlarmAudit;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SleepAlarmReceiver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleSamplesWatchdog", "notifyTrackingFailure", "message", "", "fireWakeAlarm", "ensureAlarmChannel", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final String ACTION_DISMISS = "com.example.rungps.sleep.ALARM_DISMISS";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQ_IMMEDIATE = 7103;
    private static final int WATCHDOG_NOTIFICATION_ID = 7103;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1089877543) {
                if (hashCode == -362898457 && action.equals(ACTION_DISMISS)) {
                    SleepAlarmDismiss.INSTANCE.dismissAll(context);
                    return;
                }
                return;
            }
            if (!action.equals(SleepAlarmScheduler.ACTION_FIRE)) {
                return;
            }
        }
        if (intent != null && intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_SILENT_WAKE, false)) {
            if (SleepListenService.INSTANCE.isRunningInProcess()) {
                return;
            }
            SleepListenService.INSTANCE.resumeIfSessionActive(context);
        } else {
            if (intent != null && intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_WATCHDOG, false)) {
                handleSamplesWatchdog(context);
                return;
            }
            SleepListenService.INSTANCE.resumeIfSessionActive(context);
            if (intent == null || !intent.getBooleanExtra(SleepAlarmScheduler.EXTRA_DEADLINE, false)) {
                return;
            }
            fireWakeAlarm(context, intent);
        }
    }

    private final void handleSamplesWatchdog(Context context) {
        boolean isActive = SleepOvernightStore.INSTANCE.isActive(context);
        String lastStopReason = SleepOvernightStore.INSTANCE.lastStopReason(context);
        if (lastStopReason == null) {
            lastStopReason = "";
        }
        boolean z = StringsKt.startsWith$default(lastStopReason, "user_stop", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lastStopReason, (CharSequence) "alarm_fired", false, 2, (Object) null);
        if (!isActive && !z && !StringsKt.isBlank(lastStopReason)) {
            notifyTrackingFailure(context, "Sleep tracking stopped unexpectedly (" + lastStopReason + "). Tap to reopen and save or restart.");
            return;
        }
        if (isActive) {
            long currentTimeMillis = System.currentTimeMillis() - SleepOvernightStore.INSTANCE.startedAtMs(context);
            int sampleCount = SleepOvernightStore.INSTANCE.sampleCount(context);
            boolean isRunningInProcess = SleepListenService.INSTANCE.isRunningInProcess();
            if (currentTimeMillis >= SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS && sampleCount == 0) {
                SleepOvernightStore.INSTANCE.recordHealth(context, "watchdog_no_samples");
                notifyTrackingFailure(context, "Sleep recording isn't collecting data. Tap to fix — tracking may have failed.");
                SleepListenService.INSTANCE.resumeIfSessionActive(context);
                SleepAlarmScheduler.INSTANCE.scheduleSamplesWatchdog(context, 300000L);
                return;
            }
            if (!isRunningInProcess && SleepOvernightStore.INSTANCE.isSessionValid(context)) {
                SleepOvernightStore.INSTANCE.recordHealth(context, "watchdog_service_dead");
                notifyTrackingFailure(context, "Sleep tracking service stopped. Tap to restart overnight recording.");
                SleepListenService.INSTANCE.resumeIfSessionActive(context);
            }
            if (SleepOvernightStore.INSTANCE.isActive(context)) {
                SleepAlarmScheduler.INSTANCE.scheduleSamplesWatchdog(context, SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS);
            }
        }
    }

    private final void notifyTrackingFailure(Context context, String message) {
        ensureAlarmChannel(context);
        String str = message;
        Notification build = new NotificationCompat.Builder(context, SleepAlarmSoundService.CHANNEL_ALARM).setSmallIcon(R.drawable.ic_dialog_alert).setContentTitle("Exercise Tracker — sleep tracking issue").setContentText(str).setStyle(new NotificationCompat.BigTextStyle().bigText(str)).setContentIntent(PendingIntent.getActivity(context, 44, new Intent(context, (Class<?>) MainActivity.class).putExtra("open_tab", "sleep"), 201326592)).setPriority(1).setCategory(NotificationCompat.CATEGORY_ALARM).setAutoCancel(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        NotificationManagerCompat.from(context).notify(7103, build);
    }

    private final void fireWakeAlarm(Context context, Intent intent) {
        String spotifyUri;
        Object obj = null;
        String stringExtra = intent != null ? intent.getStringExtra(SleepAlarmAudit.EXTRA_FIRE_PATH) : null;
        Iterator<E> it = SleepAlarmAudit.FirePath.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((SleepAlarmAudit.FirePath) next).getWire(), stringExtra)) {
                obj = next;
                break;
            }
        }
        SleepAlarmAudit.FirePath firePath = (SleepAlarmAudit.FirePath) obj;
        if (firePath == null) {
            firePath = SleepAlarmAudit.FirePath.BACKUP_DEADLINE;
        }
        SleepAlarmAudit.INSTANCE.recordFired(context, firePath);
        SleepOvernightStore.INSTANCE.recordAlarmFired(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("sleep_alarm_state", 0);
        long j = sharedPreferences.getLong("last_fire_ms", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j >= 90000) {
            sharedPreferences.edit().putLong("last_fire_ms", currentTimeMillis).apply();
            SleepAlarmScheduler.INSTANCE.cancelAll(context);
            SleepAlarmSoundService.INSTANCE.start(context);
            if (Intrinsics.areEqual(SleepAlarmPreferences.INSTANCE.soundMode(context), SleepAlarmPreferences.SOUND_SPOTIFY) && (spotifyUri = SleepAlarmPreferences.INSTANCE.spotifyUri(context)) != null) {
                SleepAlarmSpotify.INSTANCE.launch(context, spotifyUri);
            }
            if (AppNotifications.INSTANCE.shouldPost(context, SleepAlarmDismiss.WAKE_EVENT_KEY)) {
                ensureAlarmChannel(context);
                NotificationCompat.Builder category = new NotificationCompat.Builder(context, SleepAlarmSoundService.CHANNEL_ALARM).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle("Exercise Tracker — time to wake up").setContentText("Dismiss stops sound and vibration").addAction(0, "Dismiss alarm", PendingIntent.getBroadcast(context, 43, new Intent(context, (Class<?>) SleepAlarmReceiver.class).setAction(ACTION_DISMISS), 201326592)).setPriority(2).setCategory(NotificationCompat.CATEGORY_ALARM);
                Intrinsics.checkNotNullExpressionValue(category, "setCategory(...)");
                PendingIntent activity = PendingIntent.getActivity(context, 42, SleepAlarmActivity.INSTANCE.intent(context), 201326592);
                AppNotifications.INSTANCE.applyOpenAndDismiss(context, category, 7103, SleepAlarmDismiss.WAKE_EVENT_KEY, 42, "sleep", MapsKt.mapOf(TuplesKt.to("sleep_wake_prompt", "true")));
                category.setContentIntent(activity).setFullScreenIntent(activity, true);
                SleepAlarmActivity.INSTANCE.launch(context);
                NotificationManagerCompat.from(context).notify(7103, category.build());
                return;
            }
            return;
        }
        SleepAlarmSoundService.INSTANCE.start(context);
    }

    private final void ensureAlarmChannel(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(SleepAlarmSoundService.CHANNEL_ALARM) != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(SleepAlarmSoundService.CHANNEL_ALARM, "Sleep alarm", 4);
        notificationChannel.setDescription("Wake-up alarm");
        notificationChannel.enableVibration(false);
        notificationChannel.setBypassDnd(true);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* compiled from: SleepAlarmReceiver.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmReceiver$Companion;", "", "<init>", "()V", "ACTION_DISMISS", "", "REQ_IMMEDIATE", "", "WATCHDOG_NOTIFICATION_ID", "scheduleImmediate", "", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void scheduleImmediate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SleepAlarmScheduler.INSTANCE.scheduleImmediate(context);
        }
    }
}
