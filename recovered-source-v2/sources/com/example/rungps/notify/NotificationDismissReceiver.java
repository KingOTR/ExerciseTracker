package com.example.rungps.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.rungps.sleep.SleepAlarmDismiss;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationDismissReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/example/rungps/notify/NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, AppNotifications.ACTION_DISMISS) && (stringExtra = intent.getStringExtra(AppNotifications.EXTRA_EVENT_KEY)) != null) {
            if (Intrinsics.areEqual(stringExtra, SleepAlarmDismiss.WAKE_EVENT_KEY)) {
                SleepAlarmDismiss.INSTANCE.dismissAll(context);
                return;
            }
            int intExtra = intent.getIntExtra(AppNotifications.EXTRA_NOTIF_ID, -1);
            if (intExtra >= 0) {
                AppNotifications.INSTANCE.recordDismissed(context, stringExtra, intExtra);
            } else {
                AppNotifications.INSTANCE.recordDismissed(context, stringExtra, 0);
            }
        }
    }
}
