package com.example.rungps.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.rungps.sleep.BedtimeReminderScheduler;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetBootReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/example/rungps/widget/WidgetBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetBootReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 798292259) {
                if (hashCode != 1737074039 || !action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            WidgetBootstrap widgetBootstrap = WidgetBootstrap.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            widgetBootstrap.refreshAllAsync(applicationContext, true);
            WidgetRefreshWorker.INSTANCE.enqueueOneShot(applicationContext);
            try {
                Result.Companion companion = Result.INSTANCE;
                WidgetBootReceiver widgetBootReceiver = this;
                BedtimeReminderScheduler.INSTANCE.scheduleNext(applicationContext);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
