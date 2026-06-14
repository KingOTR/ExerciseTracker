package com.example.rungps.sleep;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BatteryOptimizationNudge.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/BatteryOptimizationNudge;", "", "<init>", "()V", "PREFS", "", "KEY_DISMISSED_AT", "shouldShow", "", "context", "Landroid/content/Context;", "overnightActive", "runRecording", "dismissForWeek", "", "isIgnoringBatteryOptimizations", "openBatterySettings", "requestExemptionIfNeeded", "openManufacturerBattery", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatteryOptimizationNudge {
    public static final int $stable = 0;
    public static final BatteryOptimizationNudge INSTANCE = new BatteryOptimizationNudge();
    private static final String KEY_DISMISSED_AT = "dismissed_at";
    private static final String PREFS = "sleep_battery_nudge";

    private BatteryOptimizationNudge() {
    }

    public static /* synthetic */ boolean shouldShow$default(BatteryOptimizationNudge batteryOptimizationNudge, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return batteryOptimizationNudge.shouldShow(context, z, z2);
    }

    public final boolean shouldShow(Context context, boolean overnightActive, boolean runRecording) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((overnightActive || runRecording || !isIgnoringBatteryOptimizations(context)) && !isIgnoringBatteryOptimizations(context)) {
            return System.currentTimeMillis() - context.getSharedPreferences(PREFS, 0).getLong(KEY_DISMISSED_AT, 0L) > 604800000;
        }
        return false;
    }

    public final void dismissForWeek(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putLong(KEY_DISMISSED_AT, System.currentTimeMillis()).apply();
    }

    public final boolean isIgnoringBatteryOptimizations(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        if (powerManager == null) {
            return true;
        }
        return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public final void openBatterySettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + packageName));
        intent.addFlags(268435456);
        try {
            Result.Companion companion = Result.INSTANCE;
            BatteryOptimizationNudge batteryOptimizationNudge = this;
            context.startActivity(intent);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void requestExemptionIfNeeded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isIgnoringBatteryOptimizations(context)) {
            return;
        }
        openBatterySettings(context);
    }

    public final void openManufacturerBattery(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        Intent intent = null;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "samsung", false, 2, (Object) null)) {
            intent = new Intent().setClassName("com.samsung.android.lool", "com.samsung.android.sm.battery.ui.BatteryActivity");
        } else if (StringsKt.contains$default((CharSequence) str, (CharSequence) "xiaomi", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "redmi", false, 2, (Object) null)) {
            intent = new Intent().setClassName("com.miui.securitycenter", "com.miui.powercenter.PowerSettings");
        }
        if (intent != null) {
            intent.addFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    BatteryOptimizationNudge batteryOptimizationNudge = this;
                    context.startActivity(intent);
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    return;
                }
            }
        }
        openBatterySettings(context);
    }
}
