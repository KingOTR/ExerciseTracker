package com.example.rungps.notify;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestTimerNotifier.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/notify/RestTimerNotifier;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIF_ID", "", "ensureChannel", "", "context", "Landroid/content/Context;", "showRestComplete", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RestTimerNotifier {
    public static final int $stable = 0;
    private static final String CHANNEL_ID = "rest_timer";
    public static final RestTimerNotifier INSTANCE = new RestTimerNotifier();
    public static final int NOTIF_ID = 4401;

    private RestTimerNotifier() {
    }

    public final void ensureChannel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Gym rest timer", 4);
        notificationChannel.setDescription("Alerts when rest between sets is complete");
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final void showRestComplete(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ensureChannel(context);
        String eventKey = AppNotifications.INSTANCE.eventKey(CHANNEL_ID, "complete");
        if (AppNotifications.INSTANCE.shouldPost(context, eventKey)) {
            NotificationCompat.Builder priority = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle("Rest complete").setContentText("Time to start your next set").setPriority(1);
            Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
            AppNotifications.INSTANCE.applyOpenAndDismiss(context, priority, NOTIF_ID, eventKey, NOTIF_ID, (r17 & 32) != 0 ? null : "gym", (r17 & 64) != 0 ? MapsKt.emptyMap() : null);
            try {
                Result.Companion companion = Result.INSTANCE;
                RestTimerNotifier restTimerNotifier = this;
                NotificationManagerCompat.from(context).notify(NOTIF_ID, priority.build());
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
