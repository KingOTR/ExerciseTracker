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
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymSessionReminderNotifier.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/notify/GymSessionReminderNotifier;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIF_ID", "", "ensureChannel", "", "context", "Landroid/content/Context;", "showIdleReminder", "sessionId", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionReminderNotifier {
    public static final int $stable = 0;
    private static final String CHANNEL_ID = "gym_session";
    public static final GymSessionReminderNotifier INSTANCE = new GymSessionReminderNotifier();
    public static final int NOTIF_ID = 4402;

    private GymSessionReminderNotifier() {
    }

    public final void ensureChannel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Gym session reminders", 3);
        notificationChannel.setDescription("Reminds you to finish an open gym session");
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final void showIdleReminder(Context context, long sessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        ensureChannel(context);
        String eventKey = AppNotifications.INSTANCE.eventKey("gym_idle", "sid=" + sessionId);
        if (AppNotifications.INSTANCE.shouldPost(context, eventKey)) {
            NotificationCompat.Builder priority = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_dialog_info).setContentTitle("Finish your gym session?").setContentText("No sets logged for a while. Tap to continue or finish.").setPriority(0);
            Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
            AppNotifications.INSTANCE.applyOpenAndDismiss(context, priority, 4402, eventKey, 4402, "gym", MapsKt.mapOf(TuplesKt.to("open_gym_session_id", String.valueOf(sessionId))));
            try {
                Result.Companion companion = Result.INSTANCE;
                GymSessionReminderNotifier gymSessionReminderNotifier = this;
                NotificationManagerCompat.from(context).notify(4402, priority.build());
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
