package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepWakeRecap.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ \u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/SleepWakeRecap;", "", "<init>", "()V", "PREFS", "", "KEY_RECAP", "recordSmartWake", "", "context", "Landroid/content/Context;", "wakeAtMs", "", "smart", "", "consume", "build", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepWakeRecap {
    public static final int $stable = 0;
    public static final SleepWakeRecap INSTANCE = new SleepWakeRecap();
    private static final String KEY_RECAP = "wake_recap_line";
    private static final String PREFS = "sleep_overnight";

    private SleepWakeRecap() {
    }

    public final void recordSmartWake(Context context, long wakeAtMs, boolean smart) {
        String build;
        Intrinsics.checkNotNullParameter(context, "context");
        if (SleepOvernightStore.INSTANCE.isActive(context) && (build = build(context, wakeAtMs, smart)) != null) {
            context.getSharedPreferences(PREFS, 0).edit().putString(KEY_RECAP, build).apply();
        }
    }

    public final String consume(Context context) {
        String obj;
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        String str = null;
        String string = sharedPreferences.getString(KEY_RECAP, null);
        if (string != null && (obj = StringsKt.trim((CharSequence) string).toString()) != null && obj.length() > 0) {
            str = obj;
        }
        if (str != null) {
            sharedPreferences.edit().remove(KEY_RECAP).apply();
        }
        return str;
    }

    public final String build(Context context, long wakeAtMs, boolean smart) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!SleepOvernightStore.INSTANCE.isActive(context)) {
            return null;
        }
        long startedAtMs = SleepOvernightStore.INSTANCE.startedAtMs(context);
        long alarmTargetMs = SleepOvernightStore.INSTANCE.alarmTargetMs(context);
        long windowStartMs = SleepOvernightStore.INSTANCE.windowStartMs(context);
        long windowEndMs = SleepOvernightStore.INSTANCE.windowEndMs(context);
        ZoneId systemDefault = ZoneId.systemDefault();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
        String format = Instant.ofEpochMilli(wakeAtMs).atZone(systemDefault).format(ofPattern);
        String format2 = Instant.ofEpochMilli(alarmTargetMs).atZone(systemDefault).format(ofPattern);
        boolean z = false;
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((windowEndMs - windowStartMs) / 60000), 0);
        if (!smart) {
            return "Alarm at " + format + " (fixed time).";
        }
        List<SleepTrackSample> loadSamples = SleepOvernightStore.INSTANCE.loadSamples(context);
        int bestWakeIndex = SleepPhaseAnalyzer.INSTANCE.bestWakeIndex(loadSamples, RangesKt.coerceAtLeast(windowStartMs - startedAtMs, 0L), RangesKt.coerceAtLeast(windowEndMs - startedAtMs, 0L), context);
        if (bestWakeIndex >= 0 && bestWakeIndex < loadSamples.size()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Smart alarm woke you at " + format);
        sb.append(z ? " (lightest sleep in window)" : " (end of window)");
        sb.append(". Target was " + format2 + " · " + coerceAtLeast + " min wake window.");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
