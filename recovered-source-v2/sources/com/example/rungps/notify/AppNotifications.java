package com.example.rungps.notify;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.example.rungps.MainActivity;
import com.example.rungps.nfc.GymNfcConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppNotifications.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011J&\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0005J\u001e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010!\u001a\u00020\"\"\u00020\u0015J\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010$\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0015J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/rungps/notify/AppNotifications;", "", "<init>", "()V", "ACTION_DISMISS", "", "EXTRA_EVENT_KEY", "EXTRA_NOTIF_ID", "PREFS", "KEY_SUPPRESS_UNTIL_MS", "KEY_DISMISSED_EVENT", "openMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "openTab", "extras", "", "contentPendingIntent", "Landroid/app/PendingIntent;", "requestCode", "", "dismissPendingIntent", "notificationId", "eventKey", "applyOpenAndDismiss", "", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "shouldPost", "", "recordDismissed", "onAppOpened", "notificationIds", "", "clearDismissState", "cancel", "prefix", "detail", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppNotifications {
    public static final int $stable = 0;
    public static final String ACTION_DISMISS = "com.exercisetracker.app.NOTIFICATION_DISMISS";
    public static final String EXTRA_EVENT_KEY = "notif_event_key";
    public static final String EXTRA_NOTIF_ID = "notif_id";
    public static final AppNotifications INSTANCE = new AppNotifications();
    private static final String KEY_DISMISSED_EVENT = "dismissed_event_key";
    private static final String KEY_SUPPRESS_UNTIL_MS = "suppress_until_ms";
    private static final String PREFS = "app_notifications";

    private AppNotifications() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Intent openMainActivityIntent$default(AppNotifications appNotifications, Context context, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return appNotifications.openMainActivityIntent(context, str, map);
    }

    public final Intent openMainActivityIntent(Context context, String openTab, Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(872415232);
        if (openTab != null) {
            intent.putExtra("open_tab", openTab);
        }
        for (Map.Entry<String, String> entry : extras.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PendingIntent contentPendingIntent$default(AppNotifications appNotifications, Context context, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        return appNotifications.contentPendingIntent(context, i, str, map);
    }

    public final PendingIntent contentPendingIntent(Context context, int requestCode, String openTab, Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        PendingIntent activity = PendingIntent.getActivity(context, requestCode, openMainActivityIntent(context, openTab, extras), 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final PendingIntent dismissPendingIntent(Context context, int requestCode, int notificationId, String eventKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intent intent = new Intent(context, (Class<?>) NotificationDismissReceiver.class);
        intent.setAction(ACTION_DISMISS);
        intent.putExtra(EXTRA_NOTIF_ID, notificationId);
        intent.putExtra(EXTRA_EVENT_KEY, eventKey);
        Unit unit = Unit.INSTANCE;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void applyOpenAndDismiss(Context context, NotificationCompat.Builder builder, int notificationId, String eventKey, int requestCode, String openTab, Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        Intrinsics.checkNotNullParameter(extras, "extras");
        builder.setContentIntent(contentPendingIntent(context, requestCode, openTab, extras)).setDeleteIntent(dismissPendingIntent(context, requestCode + 10000, notificationId, eventKey)).setAutoCancel(true);
    }

    public final boolean shouldPost(Context context, String eventKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        if (System.currentTimeMillis() < context.getSharedPreferences(PREFS, 0).getLong(KEY_SUPPRESS_UNTIL_MS, 0L)) {
            return false;
        }
        return !Intrinsics.areEqual(r5.getString(KEY_DISMISSED_EVENT, null), eventKey);
    }

    public final void recordDismissed(Context context, String eventKey, int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_DISMISSED_EVENT, eventKey).putLong(KEY_SUPPRESS_UNTIL_MS, System.currentTimeMillis() + GymNfcConfig.DEFAULT_SAVER_POLL_MS).apply();
        cancel(context, notificationId);
    }

    public final void clearDismissState(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_DISMISSED_EVENT).remove(KEY_SUPPRESS_UNTIL_MS).apply();
    }

    public final void cancel(Context context, int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            AppNotifications appNotifications = this;
            NotificationManagerCompat.from(context).cancel(notificationId);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final String eventKey(String prefix, String detail) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return prefix + ":" + detail.hashCode() + ":" + (System.currentTimeMillis() / 60000);
    }

    public final void onAppOpened(Context context, int... notificationIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationIds, "notificationIds");
        for (int i : notificationIds) {
            INSTANCE.cancel(context, i);
        }
    }
}
