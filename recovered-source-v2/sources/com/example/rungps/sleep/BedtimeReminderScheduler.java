package com.example.rungps.sleep;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.example.rungps.MainActivity;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BedtimeReminderScheduler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/BedtimeReminderScheduler;", "", "<init>", "()V", "scheduleNext", "", "context", "Landroid/content/Context;", "deliverAt", "am", "Landroid/app/AlarmManager;", "triggerAtMs", "", "pi", "Landroid/app/PendingIntent;", "cancel", BaseGmsClient.KEY_PENDING_INTENT, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BedtimeReminderScheduler {
    public static final int $stable = 0;
    public static final BedtimeReminderScheduler INSTANCE = new BedtimeReminderScheduler();

    private BedtimeReminderScheduler() {
    }

    public final void scheduleNext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intrinsics.checkNotNull(applicationContext);
        PendingIntent pendingIntent = pendingIntent(applicationContext);
        if (!BedtimeReminderPrefs.INSTANCE.isEnabled(applicationContext)) {
            alarmManager.cancel(pendingIntent);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(11, BedtimeReminderPrefs.INSTANCE.hour(applicationContext));
        calendar.set(12, BedtimeReminderPrefs.INSTANCE.minute(applicationContext));
        if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {
            calendar.add(6, 1);
        }
        deliverAt(applicationContext, alarmManager, calendar.getTimeInMillis(), pendingIntent);
    }

    private final void deliverAt(Context context, AlarmManager am, long triggerAtMs, PendingIntent pi) {
        am.setAlarmClock(new AlarmManager.AlarmClockInfo(triggerAtMs, PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class).putExtra("open_tab", "sleep"), 201326592)), pi);
    }

    public final void cancel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        Intrinsics.checkNotNull(applicationContext);
        ((AlarmManager) systemService).cancel(pendingIntent(applicationContext));
    }

    private final PendingIntent pendingIntent(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 77031, new Intent(context, (Class<?>) BedtimeReminderReceiver.class).setAction(BedtimeReminderReceiver.ACTION), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
