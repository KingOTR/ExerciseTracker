package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.tracking.TrackingService;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepCalendarManualCommitment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarManualCommitment;", "", "<init>", "()V", "PREFS", "", "KEY_ENABLED", "KEY_TITLE", "KEY_HOUR", "KEY_MINUTE", "KEY_DAY", "KEY_EVENT_DATE", "isEnabled", "", "context", "Landroid/content/Context;", TrackingService.BATTERY_SAVE, "", SleepCalendarManualCommitment.KEY_TITLE, SleepCalendarManualCommitment.KEY_HOUR, "", SleepCalendarManualCommitment.KEY_MINUTE, SleepCalendarManualCommitment.KEY_ENABLED, CervicalMucusRecord.Appearance.CLEAR, "loadForPlanner", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "zone", "Ljava/time/ZoneId;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCalendarManualCommitment {
    public static final int $stable = 0;
    public static final SleepCalendarManualCommitment INSTANCE = new SleepCalendarManualCommitment();
    private static final String KEY_DAY = "day";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_EVENT_DATE = "event_date";
    private static final String KEY_HOUR = "hour";
    private static final String KEY_MINUTE = "minute";
    private static final String KEY_TITLE = "title";
    private static final String PREFS = "sleep_calendar_manual";

    private SleepCalendarManualCommitment() {
    }

    public final boolean isEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_ENABLED, false);
    }

    public static /* synthetic */ void save$default(SleepCalendarManualCommitment sleepCalendarManualCommitment, Context context, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z = true;
        }
        sleepCalendarManualCommitment.save(context, str, i, i2, z);
    }

    public final void save(Context context, String title, int hour, int minute, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        SharedPreferences.Editor putBoolean = context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_ENABLED, enabled);
        String obj = StringsKt.trim((CharSequence) title).toString();
        if (StringsKt.isBlank(obj)) {
            obj = "Morning event";
        }
        putBoolean.putString(KEY_TITLE, obj).putInt(KEY_HOUR, RangesKt.coerceIn(hour, 0, 23)).putInt(KEY_MINUTE, SleepAlarmPreferences.INSTANCE.snapAlarmMinute(minute)).putString(KEY_DAY, LocalDate.now().toString()).putString(KEY_EVENT_DATE, LocalDate.now().plusDays(1L).toString()).apply();
    }

    public final void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_ENABLED, false).apply();
    }

    public static /* synthetic */ SleepCalendarHelper.MorningCommitment loadForPlanner$default(SleepCalendarManualCommitment sleepCalendarManualCommitment, Context context, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarManualCommitment.loadForPlanner(context, zoneId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.time.ZonedDateTime] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SleepCalendarHelper.MorningCommitment loadForPlanner(Context context, ZoneId zone) {
        Object m7905constructorimpl;
        LocalDate localDate;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zone, "zone");
        if (!isEnabled(context)) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        LocalDate plusDays = LocalDate.now(zone).plusDays(1L);
        String string = sharedPreferences.getString(KEY_EVENT_DATE, null);
        if (string != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(LocalDate.parse(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = null;
            }
            localDate = (LocalDate) m7905constructorimpl;
        }
        String string2 = sharedPreferences.getString(KEY_DAY, null);
        if (string2 != null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                obj = Result.m7905constructorimpl(LocalDate.parse(string2).plusDays(1L));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                obj = Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
            boolean m7911isFailureimpl = Result.m7911isFailureimpl(obj);
            Object obj2 = obj;
            if (m7911isFailureimpl) {
                obj2 = null;
            }
            localDate = (LocalDate) obj2;
        } else {
            localDate = null;
        }
        if (localDate == null || localDate.isBefore(plusDays)) {
            return null;
        }
        long epochMilli = plusDays.atTime(sharedPreferences.getInt(KEY_HOUR, 9), sharedPreferences.getInt(KEY_MINUTE, 0)).atZone(zone).toInstant().toEpochMilli();
        String string3 = sharedPreferences.getString(KEY_TITLE, "Morning event");
        return new SleepCalendarHelper.MorningCommitment(string3 != null ? string3 : "Morning event", epochMilli, null, SleepAlarmPreferences.INSTANCE.travelBufferMin(context) / 2, null, null, 48, null);
    }
}
