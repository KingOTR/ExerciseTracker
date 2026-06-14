package com.example.rungps.notify;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.example.rungps.MainActivity;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestTimerScheduler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/notify/RestTimerScheduler;", "", "<init>", "()V", "ACTION_REST_DONE", "", "REQUEST_CODE", "", "schedule", "", "context", "Landroid/content/Context;", "endsAtMs", "", "cancel", "deliverAt", "am", "Landroid/app/AlarmManager;", "triggerAtMs", "pi", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RestTimerScheduler {
    public static final int $stable = 0;
    public static final String ACTION_REST_DONE = "com.example.rungps.REST_TIMER_DONE";
    public static final RestTimerScheduler INSTANCE = new RestTimerScheduler();
    private static final int REQUEST_CODE = 4401;

    private RestTimerScheduler() {
    }

    public final void schedule(Context context, long endsAtMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        RestTimerNotifier.INSTANCE.ensureChannel(context);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        deliverAt(context, (AlarmManager) systemService, endsAtMs, pendingIntent(context));
    }

    public final void cancel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(pendingIntent(context));
    }

    private final void deliverAt(Context context, AlarmManager am, long triggerAtMs, PendingIntent pi) {
        am.setAlarmClock(new AlarmManager.AlarmClockInfo(triggerAtMs, PendingIntent.getActivity(context, 4401, new Intent(context, (Class<?>) MainActivity.class).putExtra("open_tab", "gym"), 201326592)), pi);
    }

    private final PendingIntent pendingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) RestTimerReceiver.class);
        intent.setAction(ACTION_REST_DONE);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 4401, intent, 67108864 | 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
