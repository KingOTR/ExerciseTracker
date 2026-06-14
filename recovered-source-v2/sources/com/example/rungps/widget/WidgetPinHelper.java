package com.example.rungps.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.example.rungps.MainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetPinHelper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/widget/WidgetPinHelper;", "", "<init>", "()V", "canPin", "", "context", "Landroid/content/Context;", "requestPinGym", "requestPinRideRun", "requestPinRecovery", "requestPin", "providerClass", "Ljava/lang/Class;", "successMessage", "", "successCallback", "Landroid/app/PendingIntent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetPinHelper {
    public static final int $stable = 0;
    public static final WidgetPinHelper INSTANCE = new WidgetPinHelper();

    private WidgetPinHelper() {
    }

    public final boolean canPin(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
    }

    public final boolean requestPinGym(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return requestPin(context, GymWidgetProvider.class, "Gym widget added to your home screen");
    }

    public final boolean requestPinRideRun(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return requestPin(context, RideRunWidgetProvider.class, "Ride & run widget added to your home screen");
    }

    public final boolean requestPinRecovery(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return requestPin(context, RecoveryWidgetProvider.class, "Recovery widget added to your home screen");
    }

    private final boolean requestPin(Context context, Class<?> providerClass, String successMessage) {
        if (!canPin(context)) {
            Toast.makeText(context, "Long-press home screen → Widgets → Exercise Tracker", 1).show();
            return false;
        }
        boolean requestPinAppWidget = AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, providerClass), null, successCallback(context));
        if (!requestPinAppWidget) {
            Toast.makeText(context, "Could not open widget picker — add from home screen widgets menu", 1).show();
        }
        return requestPinAppWidget;
    }

    private final PendingIntent successCallback(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        return PendingIntent.getActivity(context, 88001, intent, 201326592);
    }
}
