package com.example.rungps.sleep;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: SleepOvernightBattery.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/SleepOvernightBattery;", "", "<init>", "()V", "PREFS", "", "KEY_BATTERY_START", "KEY_BATTERY_FIRED", "KEY_BATTERY_END", "recordSessionStart", "", "context", "Landroid/content/Context;", "recordAlarmFire", "recordSessionEnd", "startPercent", "", "(Landroid/content/Context;)Ljava/lang/Integer;", "firedPercent", "endPercent", "drainPercent", "summaryLine", "levelPercent", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepOvernightBattery {
    public static final int $stable = 0;
    public static final SleepOvernightBattery INSTANCE = new SleepOvernightBattery();
    private static final String KEY_BATTERY_END = "battery_end_pct";
    private static final String KEY_BATTERY_FIRED = "battery_fired_pct";
    private static final String KEY_BATTERY_START = "battery_start_pct";
    private static final String PREFS = "sleep_overnight";

    private SleepOvernightBattery() {
    }

    public final void recordSessionStart(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer levelPercent = levelPercent(context);
        if (levelPercent != null) {
            INSTANCE.prefs(context).edit().putInt(KEY_BATTERY_START, levelPercent.intValue()).remove(KEY_BATTERY_FIRED).remove(KEY_BATTERY_END).apply();
        }
    }

    public final void recordAlarmFire(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer levelPercent = levelPercent(context);
        if (levelPercent != null) {
            INSTANCE.prefs(context).edit().putInt(KEY_BATTERY_FIRED, levelPercent.intValue()).apply();
        }
    }

    public final void recordSessionEnd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer levelPercent = levelPercent(context);
        if (levelPercent != null) {
            INSTANCE.prefs(context).edit().putInt(KEY_BATTERY_END, levelPercent.intValue()).apply();
        }
    }

    public final Integer startPercent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer valueOf = Integer.valueOf(prefs(context).getInt(KEY_BATTERY_START, -1));
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= 101) {
            return null;
        }
        return valueOf;
    }

    public final Integer firedPercent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer valueOf = Integer.valueOf(prefs(context).getInt(KEY_BATTERY_FIRED, -1));
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= 101) {
            return null;
        }
        return valueOf;
    }

    public final Integer endPercent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer valueOf = Integer.valueOf(prefs(context).getInt(KEY_BATTERY_END, -1));
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= 101) {
            return null;
        }
        return valueOf;
    }

    public final Integer drainPercent(Context context) {
        int intValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer startPercent = startPercent(context);
        if (startPercent != null) {
            int intValue2 = startPercent.intValue();
            Integer endPercent = endPercent(context);
            if (endPercent == null && (endPercent = firedPercent(context)) == null) {
                Integer levelPercent = levelPercent(context);
                if (levelPercent != null) {
                    intValue = levelPercent.intValue();
                }
            } else {
                intValue = endPercent.intValue();
            }
            return Integer.valueOf(RangesKt.coerceAtLeast(intValue2 - intValue, 0));
        }
        return null;
    }

    public final String summaryLine(Context context) {
        int intValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer startPercent = startPercent(context);
        if (startPercent != null) {
            int intValue2 = startPercent.intValue();
            Integer endPercent = endPercent(context);
            if (endPercent == null && (endPercent = firedPercent(context)) == null) {
                Integer levelPercent = levelPercent(context);
                if (levelPercent != null) {
                    intValue = levelPercent.intValue();
                }
            } else {
                intValue = endPercent.intValue();
            }
            return "Battery " + intValue2 + "% → " + intValue + "% (−" + RangesKt.coerceAtLeast(intValue2 - intValue, 0) + "%)";
        }
        return null;
    }

    private final Integer levelPercent(Context context) {
        BatteryManager batteryManager = (BatteryManager) context.getSystemService(BatteryManager.class);
        Integer valueOf = batteryManager != null ? Integer.valueOf(batteryManager.getIntProperty(4)) : null;
        if (valueOf != null && new IntRange(0, 100).contains(valueOf.intValue())) {
            return valueOf;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceIn((int) ((intExtra * 100.0f) / intExtra2), 0, 100));
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }
}
