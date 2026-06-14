package com.example.rungps.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.material3.MenuKt;
import com.example.rungps.gym.GymRestTimerStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymWidgetRestReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/example/rungps/widget/GymWidgetRestReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWidgetRestReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != 486422593) {
            if (hashCode != 1262617192) {
                if (hashCode != 1262617285 || !action.equals(GymWidgetProvider.ACTION_REST_90)) {
                    return;
                } else {
                    i = 90;
                }
            } else if (!action.equals(GymWidgetProvider.ACTION_REST_60)) {
                return;
            } else {
                i = 60;
            }
        } else if (!action.equals(GymWidgetProvider.ACTION_REST_120)) {
            return;
        } else {
            i = MenuKt.InTransitionDuration;
        }
        GymRestTimerStore gymRestTimerStore = GymRestTimerStore.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        gymRestTimerStore.startRest(applicationContext, i);
    }
}
