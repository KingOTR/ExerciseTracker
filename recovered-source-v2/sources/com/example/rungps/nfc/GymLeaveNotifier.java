package com.example.rungps.nfc;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.example.rungps.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymLeaveNotifier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/nfc/GymLeaveNotifier;", "", "<init>", "()V", "CHANNEL_ID", "", "PREFS", "KEY_NOTIFIED_SESSION", "NOTIF_ID", "", "maybeNotifyLeftGym", "", "context", "Landroid/content/Context;", "openSessionId", "", "(Landroid/content/Context;Ljava/lang/Long;)V", "markAtGymDuringSession", "ensureChannel", "clearSession", "sessionId", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymLeaveNotifier {
    public static final int $stable = 0;
    private static final String CHANNEL_ID = "gym_leave";
    public static final GymLeaveNotifier INSTANCE = new GymLeaveNotifier();
    private static final String KEY_NOTIFIED_SESSION = "notified_session_id";
    public static final int NOTIF_ID = 7702;
    private static final String PREFS = "gym_leave";

    private GymLeaveNotifier() {
    }

    public final void maybeNotifyLeftGym(Context context, Long openSessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (openSessionId == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("gym_leave", 0);
        if (sharedPreferences.getLong(KEY_NOTIFIED_SESSION, -1L) != openSessionId.longValue() && sharedPreferences.getBoolean("was_at_gym_" + openSessionId, false)) {
            GymNfcGuard gymNfcGuard = GymNfcGuard.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            if (gymNfcGuard.isAtGym(applicationContext)) {
                return;
            }
            sharedPreferences.edit().putLong(KEY_NOTIFIED_SESSION, openSessionId.longValue()).apply();
            Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
            intent.putExtra("open_tab", "gym");
            intent.addFlags(805306368);
            Unit unit = Unit.INSTANCE;
            PendingIntent activity = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
            ensureChannel(applicationContext);
            NotificationCompat.Builder priority = new NotificationCompat.Builder(applicationContext, "gym_leave").setSmallIcon(R.drawable.ic_dialog_info).setContentTitle("Exercise Tracker — left the gym?").setContentText("Tap to finish your workout session").setContentIntent(activity).setAutoCancel(true).setPriority(0);
            Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
            NotificationManagerCompat.from(applicationContext).notify(NOTIF_ID, priority.build());
        }
    }

    public final void markAtGymDuringSession(Context context, long openSessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getApplicationContext().getSharedPreferences("gym_leave", 0).edit().putBoolean("was_at_gym_" + openSessionId, true).apply();
    }

    private final void ensureChannel(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel("gym_leave") != null) {
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel("gym_leave", "Gym location", 3));
    }

    public final void clearSession(Context context, long sessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getApplicationContext().getSharedPreferences("gym_leave", 0).edit().remove("was_at_gym_" + sessionId).remove(KEY_NOTIFIED_SESSION).apply();
    }
}
