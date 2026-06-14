package com.example.rungps.sleep;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: BedtimeReminderPrefs.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/sleep/BedtimeReminderPrefs;", "", "<init>", "()V", "PREFS", "", "KEY_ENABLED", "KEY_HOUR", "KEY_MINUTE", "KEY_WIND_DIM", "KEY_WIND_DND", "KEY_WIND_PAUSE", "isEnabled", "", "context", "Landroid/content/Context;", "setEnabled", "", BedtimeReminderPrefs.KEY_ENABLED, BedtimeReminderPrefs.KEY_HOUR, "", BedtimeReminderPrefs.KEY_MINUTE, "setTime", "windDownDim", "setWindDownDim", "windDownDnd", "setWindDownDnd", "windDownPauseMedia", "setWindDownPauseMedia", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BedtimeReminderPrefs {
    public static final int $stable = 0;
    public static final BedtimeReminderPrefs INSTANCE = new BedtimeReminderPrefs();
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HOUR = "hour";
    private static final String KEY_MINUTE = "minute";
    private static final String KEY_WIND_DIM = "wind_dim";
    private static final String KEY_WIND_DND = "wind_dnd";
    private static final String KEY_WIND_PAUSE = "wind_pause_media";
    private static final String PREFS = "sleep_bedtime_reminder";

    private BedtimeReminderPrefs() {
    }

    public final boolean isEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_ENABLED, false);
    }

    public final void setEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_ENABLED, enabled).apply();
    }

    public final int hour(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getInt(KEY_HOUR, 22);
    }

    public final int minute(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getInt(KEY_MINUTE, 30);
    }

    public final void setTime(Context context, int hour, int minute) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putInt(KEY_HOUR, RangesKt.coerceIn(hour, 0, 23)).putInt(KEY_MINUTE, RangesKt.coerceIn(minute, 0, 59)).apply();
    }

    public final boolean windDownDim(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_WIND_DIM, true);
    }

    public final void setWindDownDim(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_WIND_DIM, enabled).apply();
    }

    public final boolean windDownDnd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_WIND_DND, true);
    }

    public final void setWindDownDnd(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_WIND_DND, enabled).apply();
    }

    public final boolean windDownPauseMedia(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_WIND_PAUSE, true);
    }

    public final void setWindDownPauseMedia(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_WIND_PAUSE, enabled).apply();
    }
}
