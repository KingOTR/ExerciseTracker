package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepAlarmPreferences.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0006\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001e\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010%\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010)\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020(J\u000e\u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010-\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020,J\u000e\u0010/\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u0016\u00100\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00101\u001a\u00020\u0005J\u0010\u00102\u001a\u0004\u0018\u0001032\u0006\u0010\u001f\u001a\u00020 J\u0018\u00104\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000103J\u0010\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u00107\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u0016\u00108\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00109\u001a\u00020\u0005J\u000e\u0010:\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010;\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020(J\u000e\u0010<\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010=\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010>\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010?\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020(J\u0010\u0010@\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010A\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010B\u001a\u00020\u0005J\u000e\u0010C\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010D\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010*\u001a\u00020(J\u0010\u0010E\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010F\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010G\u001a\u00020\u0005J\u0015\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010JJ\u0015\u0010K\u001a\u0004\u0018\u00010I2\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010JJ\u001e\u0010L\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020IJ\u000e\u0010O\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmPreferences;", "", "<init>", "()V", "PREFS", "", "KEY_WINDOW_MIN", "KEY_SMART", "KEY_LAST_ALARM_MS", "KEY_ALARM_HOUR", "KEY_ALARM_MINUTE", "KEY_SOUND_MODE", "KEY_RINGTONE_URI", "KEY_SPOTIFY_URI", "KEY_SPOTIFY_INPUT", "KEY_CALENDAR_SYNC", "KEY_TRAVEL_BUFFER", "KEY_AUTO_SUGGEST", "KEY_LAST_AUTO_APPLY_DAY", "KEY_HOME_ADDRESS", "KEY_HOME_LAT", "KEY_HOME_LON", "KEY_MAPS_TRAVEL", "SOUND_SYSTEM", "SOUND_RINGTONE", "SOUND_SPOTIFY", "snapAlarmMinute", "", "minute", "alarmTime", "Lkotlin/Pair;", "context", "Landroid/content/Context;", "setAlarmTime", "", "hour", "windowMin", "setWindowMin", "min", "smartAlarmEnabled", "", "setSmartAlarmEnabled", "enabled", "lastAlarmTargetMs", "", "setLastAlarmTargetMs", "ms", "soundMode", "setSoundMode", "mode", "customRingtoneUri", "Landroid/net/Uri;", "setCustomRingtoneUri", "uri", "spotifyUri", "spotifyInput", "setSpotifyInput", "input", "calendarSyncEnabled", "setCalendarSyncEnabled", "travelBufferMin", "setTravelBufferMin", "autoWakeSuggestEnabled", "setAutoWakeSuggestEnabled", "lastAutoApplyDay", "setLastAutoApplyDay", "day", "mapsTravelEtaEnabled", "setMapsTravelEtaEnabled", "homeAddress", "setHomeAddress", "address", "homeLat", "", "(Landroid/content/Context;)Ljava/lang/Double;", "homeLon", "setHomeLatLon", "lat", "lon", "clearHomeLatLon", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmPreferences {
    public static final int $stable = 0;
    public static final SleepAlarmPreferences INSTANCE = new SleepAlarmPreferences();
    private static final String KEY_ALARM_HOUR = "alarm_hour";
    private static final String KEY_ALARM_MINUTE = "alarm_minute";
    private static final String KEY_AUTO_SUGGEST = "auto_wake_suggest";
    private static final String KEY_CALENDAR_SYNC = "calendar_sync";
    private static final String KEY_HOME_ADDRESS = "home_address";
    private static final String KEY_HOME_LAT = "home_lat";
    private static final String KEY_HOME_LON = "home_lon";
    private static final String KEY_LAST_ALARM_MS = "last_alarm_target_ms";
    private static final String KEY_LAST_AUTO_APPLY_DAY = "last_auto_apply_day";
    private static final String KEY_MAPS_TRAVEL = "maps_travel_eta";
    private static final String KEY_RINGTONE_URI = "ringtone_uri";
    private static final String KEY_SMART = "smart_enabled";
    private static final String KEY_SOUND_MODE = "sound_mode";
    private static final String KEY_SPOTIFY_INPUT = "spotify_input";
    private static final String KEY_SPOTIFY_URI = "spotify_uri";
    private static final String KEY_TRAVEL_BUFFER = "travel_buffer_min";
    private static final String KEY_WINDOW_MIN = "window_min";
    private static final String PREFS = "sleep_alarm";
    public static final String SOUND_RINGTONE = "ringtone";
    public static final String SOUND_SPOTIFY = "spotify";
    public static final String SOUND_SYSTEM = "system";

    private SleepAlarmPreferences() {
    }

    public final int snapAlarmMinute(int minute) {
        return RangesKt.coerceIn(((minute + 2) / 5) * 5, 0, 55);
    }

    public final Pair<Integer, Integer> alarmTime(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        return TuplesKt.to(Integer.valueOf(RangesKt.coerceIn(sharedPreferences.getInt(KEY_ALARM_HOUR, 7), 0, 23)), Integer.valueOf(snapAlarmMinute(sharedPreferences.getInt(KEY_ALARM_MINUTE, 0))));
    }

    public final void setAlarmTime(Context context, int hour, int minute) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putInt(KEY_ALARM_HOUR, RangesKt.coerceIn(hour, 0, 23)).putInt(KEY_ALARM_MINUTE, snapAlarmMinute(minute)).apply();
    }

    public final int windowMin(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(context.getSharedPreferences(PREFS, 0).getInt("window_min", 30), 10, 45);
    }

    public final void setWindowMin(Context context, int min) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putInt("window_min", RangesKt.coerceIn(min, 10, 45)).apply();
    }

    public final boolean smartAlarmEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SMART, true);
    }

    public final void setSmartAlarmEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_SMART, enabled).apply();
    }

    public final long lastAlarmTargetMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getLong(KEY_LAST_ALARM_MS, 0L);
    }

    public final void setLastAlarmTargetMs(Context context, long ms) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putLong(KEY_LAST_ALARM_MS, ms).apply();
    }

    public final String soundMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_SOUND_MODE, SOUND_SYSTEM);
        return string == null ? SOUND_SYSTEM : string;
    }

    public final void setSoundMode(Context context, String mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_SOUND_MODE, mode).apply();
    }

    public final Uri customRingtoneUri(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_RINGTONE_URI, null);
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepAlarmPreferences sleepAlarmPreferences = this;
            m7905constructorimpl = Result.m7905constructorimpl(Uri.parse(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (Uri) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final void setCustomRingtoneUri(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_RINGTONE_URI, uri != null ? uri.toString() : null).apply();
    }

    public final String spotifyUri(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_SPOTIFY_URI, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final String spotifyInput(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_SPOTIFY_INPUT, "");
        return string == null ? "" : string;
    }

    public final void setSpotifyInput(Context context, String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_SPOTIFY_INPUT, StringsKt.trim((CharSequence) input).toString()).putString(KEY_SPOTIFY_URI, SleepAlarmSpotify.INSTANCE.parseUri(input)).apply();
    }

    public final boolean calendarSyncEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_CALENDAR_SYNC, true);
    }

    public final void setCalendarSyncEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_CALENDAR_SYNC, enabled).apply();
    }

    public final int travelBufferMin(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(context.getSharedPreferences(PREFS, 0).getInt(KEY_TRAVEL_BUFFER, 30), 15, 60);
    }

    public final void setTravelBufferMin(Context context, int min) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putInt(KEY_TRAVEL_BUFFER, RangesKt.coerceIn(min, 15, 60)).apply();
    }

    public final boolean autoWakeSuggestEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_AUTO_SUGGEST, true);
    }

    public final void setAutoWakeSuggestEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_AUTO_SUGGEST, enabled).apply();
    }

    public final String lastAutoApplyDay(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getString(KEY_LAST_AUTO_APPLY_DAY, null);
    }

    public final void setLastAutoApplyDay(Context context, String day) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(day, "day");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_LAST_AUTO_APPLY_DAY, day).apply();
    }

    public final boolean mapsTravelEtaEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_MAPS_TRAVEL, true);
    }

    public final void setMapsTravelEtaEnabled(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_MAPS_TRAVEL, enabled).apply();
    }

    public final String homeAddress(Context context) {
        String obj;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_HOME_ADDRESS, null);
        if (string == null || (obj = StringsKt.trim((CharSequence) string).toString()) == null || obj.length() <= 0) {
            return null;
        }
        return obj;
    }

    public final void setHomeAddress(Context context, String address) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(address, "address");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_HOME_ADDRESS, StringsKt.trim((CharSequence) address).toString()).apply();
    }

    public final Double homeLat(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float valueOf = Float.valueOf(context.getSharedPreferences(PREFS, 0).getFloat(KEY_HOME_LAT, Float.NaN));
        if (Float.isNaN(valueOf.floatValue())) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Double.valueOf(valueOf.floatValue());
        }
        return null;
    }

    public final Double homeLon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float valueOf = Float.valueOf(context.getSharedPreferences(PREFS, 0).getFloat(KEY_HOME_LON, Float.NaN));
        if (Float.isNaN(valueOf.floatValue())) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Double.valueOf(valueOf.floatValue());
        }
        return null;
    }

    public final void setHomeLatLon(Context context, double lat, double lon) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putFloat(KEY_HOME_LAT, (float) lat).putFloat(KEY_HOME_LON, (float) lon).apply();
    }

    public final void clearHomeLatLon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_HOME_LAT).remove(KEY_HOME_LON).apply();
    }
}
