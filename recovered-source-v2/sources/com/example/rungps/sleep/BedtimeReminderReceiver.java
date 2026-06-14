package com.example.rungps.sleep;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.example.rungps.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BedtimeReminderReceiver.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/example/rungps/sleep/BedtimeReminderReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ensureChannel", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BedtimeReminderReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final String ACTION = "com.example.rungps.sleep.BEDTIME_REMINDER";
    public static final String CHANNEL_ID = "bedtime_reminder";
    public static final int NOTIF_ID = 7703;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (BedtimeReminderPrefs.INSTANCE.isEnabled(context)) {
            Context applicationContext = context.getApplicationContext();
            Intent intent2 = new Intent(applicationContext, (Class<?>) MainActivity.class);
            intent2.putExtra("open_tab", "sleep");
            intent2.addFlags(805306368);
            Unit unit = Unit.INSTANCE;
            PendingIntent activity = PendingIntent.getActivity(applicationContext, 0, intent2, 201326592);
            Intrinsics.checkNotNull(applicationContext);
            ensureChannel(applicationContext);
            WindDownAutomation.INSTANCE.apply(applicationContext);
            NotificationCompat.Builder priority = new NotificationCompat.Builder(applicationContext, CHANNEL_ID).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle("Exercise Tracker — bedtime").setContentText("Wind down for sleep — open Sleep tab to set alarm").setContentIntent(activity).setAutoCancel(true).setPriority(0);
            Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
            NotificationManagerCompat.from(applicationContext).notify(NOTIF_ID, priority.build());
            BedtimeReminderScheduler.INSTANCE.scheduleNext(applicationContext);
        }
    }

    private final void ensureChannel(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "Bedtime reminder", 3));
    }
}
