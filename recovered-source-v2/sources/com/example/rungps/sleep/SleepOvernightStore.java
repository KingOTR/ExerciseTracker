package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.material3.MenuKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SleepOvernightStore.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010&\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u0005J\u0010\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010,\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010.\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010/\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u00100\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00101\u001a\u00020%J&\u00102\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u001bJ\u0018\u00106\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u001bJ\u000e\u00108\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u00105\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u00109\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010;\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010<\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010@\u001a\u00020\u0017J\u001e\u0010A\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020:J\u000e\u0010D\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010E\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010F\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020?J\u000e\u0010H\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010I\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010J\u001a\u00020\"2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010M\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020?H\u0002J\u001e\u0010N\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0010\u0010P\u001a\u00020\"2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010Q\u001a\u00020\"2\u0006\u0010K\u001a\u00020L2\u0006\u0010G\u001a\u00020?H\u0002J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020:H\u0002J\u0019\u0010U\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0002\u0010VJ\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020?H\u0002J\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\\\u001a\u00020?2\u0006\u0010]\u001a\u00020XH\u0002J\u001e\u0010^\u001a\u00020\"2\u0006\u0010K\u001a\u00020L2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0018\u0010_\u001a\u00020\"2\u0006\u0010K\u001a\u00020L2\u0006\u0010`\u001a\u00020\u0005H\u0002J\u0010\u0010a\u001a\u00020L2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001d\u0010b\u001a\n d*\u0004\u0018\u00010c0c2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/example/rungps/sleep/SleepOvernightStore;", "", "<init>", "()V", "PREFS", "", "KEY_ACTIVE", "KEY_STARTED", "KEY_ALARM_TARGET", "KEY_WINDOW_MIN", "KEY_SMART", "KEY_BASELINE_AUDIO", "KEY_BASELINE_MOVE", "KEY_LAST_STOP_REASON", "KEY_LAST_HEALTH_MS", "KEY_LAST_HEALTH_NOTE", "KEY_RECOVERABLE", "KEY_ALARM_FIRED", "KEY_ALARM_FIRED_MS", "KEY_SCHEMA_VERSION", "KEY_GAP_MS", "KEY_GAP_COUNT", "SCHEMA_V2", "", "SAMPLES_FILE", "MAX_SAMPLES", "isActive", "", "context", "Landroid/content/Context;", "isSessionValid", "isRecoverableStale", "clearSessionIfStale", "recordAlarmFired", "", "alarmFired", "alarmFiredAtMs", "", "recordStopReason", "reason", "recordHealth", "note", "lastStopReason", "lastHealthNote", "lastHealthMs", "schemaVersion", "micGapMs", "micGapCount", "recordMicGap", "gapMs", "startSession", "alarmTargetMs", "windowMin", "smartAlarm", "clearSession", "savedSuccessfully", "startedAtMs", "baselineAudioRms", "", "baselineMovement", "sampleCount", "loadRecentSamples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "maxSamples", "setBaselines", "rawAudioRms", "movementIndex", "windowStartMs", "windowEndMs", "appendSample", "sample", "repairSamplesFileIfNeeded", "rebuildSamplesFile", "backupCorruptFile", "file", "Ljava/io/File;", "appendSampleInternal", "migrateToLineFormat", "list", "trimTailLines", "appendSampleLine", "jsonSafeDouble", "", "v", "jsonSafeOptional", "(Ljava/lang/Float;)Ljava/lang/Double;", "sampleToJson", "Lorg/json/JSONObject;", "s", "loadSamples", "loadSamplesLenient", "parseSample", "o", "saveSamplesAtomic", "atomicWrite", "content", "samplesFile", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepOvernightStore {
    public static final int $stable = 0;
    public static final SleepOvernightStore INSTANCE = new SleepOvernightStore();
    private static final String KEY_ACTIVE = "active";
    private static final String KEY_ALARM_FIRED = "alarm_fired";
    private static final String KEY_ALARM_FIRED_MS = "alarm_fired_ms";
    private static final String KEY_ALARM_TARGET = "alarm_target_ms";
    private static final String KEY_BASELINE_AUDIO = "baseline_audio";
    private static final String KEY_BASELINE_MOVE = "baseline_move";
    private static final String KEY_GAP_COUNT = "mic_gap_count";
    private static final String KEY_GAP_MS = "mic_gap_ms";
    private static final String KEY_LAST_HEALTH_MS = "last_health_ms";
    private static final String KEY_LAST_HEALTH_NOTE = "last_health_note";
    private static final String KEY_LAST_STOP_REASON = "last_stop_reason";
    private static final String KEY_RECOVERABLE = "recoverable_stale";
    private static final String KEY_SCHEMA_VERSION = "schema_version";
    private static final String KEY_SMART = "smart_alarm";
    private static final String KEY_STARTED = "started_ms";
    private static final String KEY_WINDOW_MIN = "window_min";
    private static final int MAX_SAMPLES = 5760;
    private static final String PREFS = "sleep_overnight";
    private static final String SAMPLES_FILE = "sleep_samples.json";
    private static final int SCHEMA_V2 = 2;

    private SleepOvernightStore() {
    }

    public final boolean isActive(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean(KEY_ACTIVE, false);
    }

    public final boolean isSessionValid(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isActive(context)) {
            return false;
        }
        long startedAtMs = startedAtMs(context);
        long alarmTargetMs = alarmTargetMs(context);
        long currentTimeMillis = System.currentTimeMillis();
        return startedAtMs > 0 && alarmTargetMs > 0 && alarmTargetMs >= startedAtMs - 60000 && alarmTargetMs <= 172800000 + currentTimeMillis && currentTimeMillis - startedAtMs <= 129600000 && windowEndMs(context) >= currentTimeMillis - 900000;
    }

    public final boolean isRecoverableStale(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isActive(context) && !isSessionValid(context)) {
            return sampleCount(context) > 0 || prefs(context).getBoolean(KEY_RECOVERABLE, false);
        }
        return false;
    }

    public final boolean clearSessionIfStale(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isActive(context) || isSessionValid(context)) {
            return false;
        }
        if (sampleCount(context) > 0) {
            recordStopReason(context, "stale_session_recoverable");
            prefs(context).edit().putBoolean(KEY_RECOVERABLE, true).apply();
            return true;
        }
        recordStopReason(context, "stale_session_cleared");
        clearSession(context, false);
        return true;
    }

    public final void recordAlarmFired(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putBoolean(KEY_ALARM_FIRED, true).putLong(KEY_ALARM_FIRED_MS, System.currentTimeMillis()).apply();
        SleepOvernightBattery.INSTANCE.recordAlarmFire(context);
    }

    public final boolean alarmFired(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean(KEY_ALARM_FIRED, false);
    }

    public final long alarmFiredAtMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_ALARM_FIRED_MS, 0L);
    }

    public final void recordStopReason(Context context, String reason) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reason, "reason");
        prefs(context).edit().putString(KEY_LAST_STOP_REASON, StringsKt.take(reason, 200)).putLong(KEY_LAST_HEALTH_MS, System.currentTimeMillis()).apply();
    }

    public final void recordHealth(Context context, String note) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(note, "note");
        prefs(context).edit().putString(KEY_LAST_HEALTH_NOTE, StringsKt.take(note, MenuKt.InTransitionDuration)).putLong(KEY_LAST_HEALTH_MS, System.currentTimeMillis()).apply();
    }

    public final String lastStopReason(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = prefs(context).getString(KEY_LAST_STOP_REASON, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final String lastHealthNote(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = prefs(context).getString(KEY_LAST_HEALTH_NOTE, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final long lastHealthMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_LAST_HEALTH_MS, 0L);
    }

    public final int schemaVersion(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getInt(KEY_SCHEMA_VERSION, 1);
    }

    public final long micGapMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_GAP_MS, 0L);
    }

    public final int micGapCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getInt(KEY_GAP_COUNT, 0);
    }

    public final void recordMicGap(Context context, long gapMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (gapMs <= 0) {
            return;
        }
        SharedPreferences prefs = prefs(context);
        prefs.edit().putLong(KEY_GAP_MS, prefs.getLong(KEY_GAP_MS, 0L) + gapMs).putInt(KEY_GAP_COUNT, prefs.getInt(KEY_GAP_COUNT, 0) + 1).apply();
    }

    public final void startSession(Context context, long alarmTargetMs, int windowMin, boolean smartAlarm) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putBoolean(KEY_ACTIVE, true).putLong(KEY_STARTED, System.currentTimeMillis()).putLong("alarm_target_ms", alarmTargetMs).putInt("window_min", RangesKt.coerceIn(windowMin, 10, 45)).putBoolean("smart_alarm", smartAlarm).remove(KEY_BASELINE_AUDIO).remove(KEY_BASELINE_MOVE).putInt(KEY_SCHEMA_VERSION, 2).putLong(KEY_GAP_MS, 0L).putInt(KEY_GAP_COUNT, 0).commit();
        atomicWrite(samplesFile(context), "");
        SleepAlarmAudit.INSTANCE.clearForNewNight(context);
        SleepOvernightBattery.INSTANCE.recordSessionStart(context);
    }

    public static /* synthetic */ void clearSession$default(SleepOvernightStore sleepOvernightStore, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sleepOvernightStore.clearSession(context, z);
    }

    public final void clearSession(Context context, boolean savedSuccessfully) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = prefs(context);
        long j = prefs.getLong(KEY_STARTED, 0L);
        if (!savedSuccessfully && j > 0) {
            SleepOrphanCleanup.INSTANCE.deleteForNight(context, j);
        }
        String string = prefs.getString(KEY_LAST_STOP_REASON, null);
        long j2 = prefs.getLong(KEY_LAST_HEALTH_MS, 0L);
        String string2 = prefs.getString(KEY_LAST_HEALTH_NOTE, null);
        if (savedSuccessfully) {
            SleepOvernightBattery.INSTANCE.recordSessionEnd(context);
        }
        prefs.edit().clear().commit();
        if (!savedSuccessfully) {
            SleepAlarmAudit.INSTANCE.clearForNewNight(context);
        }
        SharedPreferences.Editor edit = prefs.edit();
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            edit.putString(KEY_LAST_STOP_REASON, string);
        }
        if (j2 > 0) {
            edit.putLong(KEY_LAST_HEALTH_MS, j2);
        }
        String str2 = string2;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            edit.putString(KEY_LAST_HEALTH_NOTE, string2);
        }
        edit.remove(KEY_RECOVERABLE);
        edit.remove(KEY_ALARM_FIRED);
        edit.remove(KEY_ALARM_FIRED_MS);
        edit.commit();
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            Result.m7905constructorimpl(Boolean.valueOf(samplesFile(context).delete()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final long startedAtMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_STARTED, 0L);
    }

    public final long alarmTargetMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong("alarm_target_ms", 0L);
    }

    public final int windowMin(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getInt("window_min", 30);
    }

    public final boolean smartAlarm(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean("smart_alarm", true);
    }

    public final float baselineAudioRms(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getFloat(KEY_BASELINE_AUDIO, 200.0f);
    }

    public final float baselineMovement(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getFloat(KEY_BASELINE_MOVE, 0.25f);
    }

    public final int sampleCount(Context context) {
        Object m7905constructorimpl;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        File samplesFile = samplesFile(context);
        if (!samplesFile.exists() || samplesFile.length() == 0) {
            return 0;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            BufferedReader fileInputStream = new FileInputStream(samplesFile);
            try {
                boolean z = fileInputStream.read() == 91;
                CloseableKt.closeFinally(fileInputStream, null);
                if (z) {
                    i = loadSamples(context).size();
                } else {
                    Reader inputStreamReader = new InputStreamReader(new FileInputStream(samplesFile), Charsets.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    fileInputStream = bufferedReader instanceof BufferedReader ? bufferedReader : new BufferedReader(bufferedReader, 8192);
                    try {
                        Iterator<String> it = TextStreamsKt.lineSequence(fileInputStream).iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            if (!StringsKt.isBlank(it.next())) {
                                i2++;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                        i = i2;
                    } finally {
                    }
                }
                m7905constructorimpl = Result.m7905constructorimpl(Integer.valueOf(i));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = 0;
        }
        return ((Number) m7905constructorimpl).intValue();
    }

    public static /* synthetic */ List loadRecentSamples$default(SleepOvernightStore sleepOvernightStore, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = SleepScience.TYPICAL_MIN_MIN;
        }
        return sleepOvernightStore.loadRecentSamples(context, i);
    }

    public final List<SleepTrackSample> loadRecentSamples(Context context, int maxSamples) {
        Object m7905constructorimpl;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(context, "context");
        File samplesFile = samplesFile(context);
        if (!samplesFile.exists() || samplesFile.length() == 0) {
            return CollectionsKt.emptyList();
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(maxSamples, 1);
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            BufferedReader fileInputStream = new FileInputStream(samplesFile);
            try {
                boolean z = fileInputStream.read() == 91;
                CloseableKt.closeFinally(fileInputStream, null);
                if (z) {
                    arrayList = CollectionsKt.takeLast(loadSamples(context), coerceAtLeast);
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(coerceAtLeast + 1);
                    Reader inputStreamReader = new InputStreamReader(new FileInputStream(samplesFile), Charsets.UTF_8);
                    BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    fileInputStream = bufferedReader instanceof BufferedReader ? bufferedReader : new BufferedReader(bufferedReader, 8192);
                    try {
                        Iterator<String> it = TextStreamsKt.lineSequence(fileInputStream).iterator();
                        while (it.hasNext()) {
                            String obj = StringsKt.trim((CharSequence) it.next()).toString();
                            if (obj.length() != 0) {
                                if (arrayDeque.size() >= coerceAtLeast) {
                                    arrayDeque.removeFirst();
                                }
                                arrayDeque.addLast(obj);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                        ArrayDeque arrayDeque2 = arrayDeque;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque2, 10));
                        Iterator<E> it2 = arrayDeque2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(parseSample(new JSONObject((String) it2.next())));
                        }
                        arrayList = arrayList2;
                    } finally {
                    }
                }
                m7905constructorimpl = Result.m7905constructorimpl(arrayList);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        List emptyList = CollectionsKt.emptyList();
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = emptyList;
        }
        return (List) m7905constructorimpl;
    }

    public final void setBaselines(Context context, float rawAudioRms, float movementIndex) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_BASELINE_AUDIO, RangesKt.coerceAtLeast(rawAudioRms, 50.0f)).putFloat(KEY_BASELINE_MOVE, RangesKt.coerceAtLeast(movementIndex, 0.05f)).apply();
    }

    public final long windowStartMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceAtLeast(alarmTargetMs(context) - (windowMin(context) * 60000), startedAtMs(context));
    }

    public final long windowEndMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return alarmTargetMs(context) + (windowMin(context) * 60000);
    }

    public final void appendSample(Context context, SleepTrackSample sample) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sample, "sample");
        Throwable th = null;
        for (int i = 0; i < 2; i++) {
            SleepOvernightStore sleepOvernightStore = INSTANCE;
            try {
                Result.Companion companion = Result.INSTANCE;
                sleepOvernightStore.repairSamplesFileIfNeeded(context);
                sleepOvernightStore.appendSampleInternal(context, sample);
                return;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(Result.m7905constructorimpl(ResultKt.createFailure(th2)));
                if (m7908exceptionOrNullimpl != null) {
                    if (i == 0) {
                        SleepOvernightStore sleepOvernightStore2 = INSTANCE;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            sleepOvernightStore2.rebuildSamplesFile(context);
                            Result.m7905constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th3) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th3));
                        }
                    }
                    th = m7908exceptionOrNullimpl;
                }
            }
        }
        if (th != null) {
            INSTANCE.recordHealth(context, "append_failed:" + th.getClass().getSimpleName());
            Log.e("SleepOvernight", "appendSample failed after repair", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean repairSamplesFileIfNeeded(Context context) {
        Object m7905constructorimpl;
        String obj;
        Object m7905constructorimpl2;
        Object m7905constructorimpl3;
        Intrinsics.checkNotNullParameter(context, "context");
        File samplesFile = samplesFile(context);
        if (!samplesFile.exists() || samplesFile.length() == 0) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            obj = StringsKt.trim((CharSequence) FilesKt.readText$default(samplesFile, null, 1, null)).toString();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (obj.length() == 0) {
            return true;
        }
        String str = "";
        if (StringsKt.startsWith$default(obj, "[", false, 2, (Object) null)) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                m7905constructorimpl2 = Result.m7905constructorimpl(new JSONArray(obj));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                backupCorruptFile(samplesFile);
                atomicWrite(samplesFile, "");
                recordHealth(context, "samples_legacy_reset");
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = StringsKt.lineSequence(obj).iterator();
        int i = 0;
        while (it.hasNext()) {
            String obj2 = StringsKt.trim((CharSequence) it.next()).toString();
            if (obj2.length() != 0) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m7905constructorimpl3 = Result.m7905constructorimpl(parseSample(new JSONObject(obj2)));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m7905constructorimpl3 = Result.m7905constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m7912isSuccessimpl(m7905constructorimpl3)) {
                    arrayList.add(obj2);
                }
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl3) != null) {
                    i++;
                }
            }
        }
        if (i > 0) {
            recordHealth(context, "samples_repaired:" + i);
            if (!arrayList.isEmpty()) {
                str = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null) + "\n";
            }
            atomicWrite(samplesFile, str);
        }
        m7905constructorimpl = Result.m7905constructorimpl(true);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = false;
        }
        return ((Boolean) m7905constructorimpl).booleanValue();
        Result.Companion companion22 = Result.INSTANCE;
        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
        }
        return ((Boolean) m7905constructorimpl).booleanValue();
    }

    private final void rebuildSamplesFile(Context context) {
        File samplesFile = samplesFile(context);
        List<SleepTrackSample> loadSamplesLenient = loadSamplesLenient(context);
        backupCorruptFile(samplesFile);
        if (loadSamplesLenient.isEmpty()) {
            atomicWrite(samplesFile, "");
        } else {
            saveSamplesAtomic(samplesFile, loadSamplesLenient);
        }
        recordHealth(context, "samples_rebuilt:" + loadSamplesLenient.size());
    }

    private final void backupCorruptFile(File file) {
        if (!file.exists() || file.length() == 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            Result.m7905constructorimpl(FilesKt.copyTo$default(file, new File(file.getParentFile(), file.getName() + ".corrupt." + System.currentTimeMillis()), true, 0, 4, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void appendSampleInternal(Context context, SleepTrackSample sample) {
        Object m7905constructorimpl;
        File samplesFile = samplesFile(context);
        if (samplesFile.exists() && samplesFile.length() > 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SleepOvernightStore sleepOvernightStore = this;
                FileInputStream fileInputStream = new FileInputStream(samplesFile);
                try {
                    boolean z = fileInputStream.read() == 91;
                    CloseableKt.closeFinally(fileInputStream, null);
                    m7905constructorimpl = Result.m7905constructorimpl(Boolean.valueOf(z));
                } finally {
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = false;
            }
        }
        if (samplesFile.exists() && samplesFile.length() > 0) {
            appendSampleLine(samplesFile, sample);
            trimTailLines(samplesFile);
            return;
        }
        List<SleepTrackSample> mutableList = CollectionsKt.toMutableList((Collection) loadSamplesLenient(context));
        mutableList.add(sample);
        while (mutableList.size() > MAX_SAMPLES) {
            mutableList.remove(0);
        }
        saveSamplesAtomic(samplesFile, mutableList);
        if (mutableList.size() >= 2) {
            migrateToLineFormat(context, mutableList);
        }
    }

    private final void migrateToLineFormat(Context context, List<SleepTrackSample> list) {
        File samplesFile = samplesFile(context);
        File file = new File(samplesFile.getParentFile(), samplesFile.getName() + ".tmp");
        FilesKt.writeText$default(file, "", null, 2, null);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            INSTANCE.appendSampleLine(file, (SleepTrackSample) it.next());
        }
        file.renameTo(samplesFile);
    }

    private final void trimTailLines(File file) {
        List readLines$default = FilesKt.readLines$default(file, null, 1, null);
        if (readLines$default.size() <= MAX_SAMPLES) {
            return;
        }
        atomicWrite(file, CollectionsKt.joinToString$default(CollectionsKt.takeLast(readLines$default, MAX_SAMPLES), "\n", null, null, 0, null, null, 62, null) + "\n");
    }

    private final void appendSampleLine(File file, SleepTrackSample sample) {
        FilesKt.appendText$default(file, sampleToJson(sample) + "\n", null, 2, null);
    }

    private final double jsonSafeDouble(float v) {
        if (Float.isNaN(v) || Float.isInfinite(v)) {
            return 0.0d;
        }
        return v;
    }

    private final Double jsonSafeOptional(Float v) {
        if (v == null || Float.isNaN(v.floatValue()) || Float.isInfinite(v.floatValue())) {
            return null;
        }
        return Double.valueOf(v.floatValue());
    }

    private final JSONObject sampleToJson(SleepTrackSample s) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("e", s.getElapsedMs());
        jSONObject.put("m", jsonSafeDouble(s.getMovement()));
        jSONObject.put("a", jsonSafeDouble(s.getAudioLevel()));
        jSONObject.put("br", jsonSafeDouble(s.getBreathRateBpm()));
        jSONObject.put("breg", jsonSafeDouble(s.getBreathRegularity()));
        jSONObject.put("q", jsonSafeDouble(s.getQuietFraction()));
        jSONObject.put("sn", jsonSafeDouble(s.getSnoreLikelihood()));
        jSONObject.put("mv", jsonSafeDouble(s.getMovementVariance()));
        Double jsonSafeOptional = jsonSafeOptional(s.getAsleepProb());
        if (jsonSafeOptional != null) {
            jSONObject.put("ap", jsonSafeOptional.doubleValue());
        }
        Double jsonSafeOptional2 = jsonSafeOptional(s.getStageConfidence());
        if (jsonSafeOptional2 != null) {
            jSONObject.put("sc", jsonSafeOptional2.doubleValue());
        }
        Double jsonSafeOptional3 = jsonSafeOptional(s.getLightSleepProb());
        if (jsonSafeOptional3 != null) {
            jSONObject.put("lp", jsonSafeOptional3.doubleValue());
        }
        String eventTag = s.getEventTag();
        if (eventTag != null) {
            if (StringsKt.isBlank(eventTag)) {
                eventTag = null;
            }
            if (eventTag != null) {
                jSONObject.put("ev", eventTag);
            }
        }
        Integer snoreIntensity = s.getSnoreIntensity();
        if (snoreIntensity != null) {
            if (snoreIntensity.intValue() <= 0) {
                snoreIntensity = null;
            }
            if (snoreIntensity != null) {
                jSONObject.put("si", snoreIntensity.intValue());
            }
        }
        Boolean audioQualityOk = s.getAudioQualityOk();
        if (audioQualityOk != null) {
            jSONObject.put("aq", audioQualityOk.booleanValue());
        }
        String noiseTag = s.getNoiseTag();
        if (noiseTag != null) {
            if (StringsKt.isBlank(noiseTag)) {
                noiseTag = null;
            }
            if (noiseTag != null) {
                jSONObject.put("nt", noiseTag);
            }
        }
        Boolean breathPause = s.getBreathPause();
        if (breathPause != null) {
            if (!breathPause.booleanValue()) {
                breathPause = null;
            }
            if (breathPause != null) {
                breathPause.booleanValue();
                jSONObject.put("bp", true);
            }
        }
        Double jsonSafeOptional4 = jsonSafeOptional(s.getSonarMotion());
        if (jsonSafeOptional4 != null) {
            jSONObject.put("sm", jsonSafeOptional4.doubleValue());
        }
        float[] melCompact = s.getMelCompact();
        if (melCompact != null) {
            float[] fArr = melCompact.length == 0 ? null : melCompact;
            if (fArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (float f : fArr) {
                    jSONArray.put(INSTANCE.jsonSafeDouble(f));
                }
                jSONObject.put("mel", jSONArray);
            }
        }
        return jSONObject;
    }

    public final List<SleepTrackSample> loadSamples(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        repairSamplesFileIfNeeded(context);
        return loadSamplesLenient(context);
    }

    private final List<SleepTrackSample> loadSamplesLenient(Context context) {
        Object m7905constructorimpl;
        List list;
        File samplesFile = samplesFile(context);
        if (!samplesFile.exists()) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepOvernightStore sleepOvernightStore = this;
            String obj = StringsKt.trim((CharSequence) FilesKt.readText$default(samplesFile, null, 1, null)).toString();
            if (obj.length() == 0) {
                list = CollectionsKt.emptyList();
            } else {
                if (StringsKt.startsWith$default(obj, "[", false, 2, (Object) null)) {
                    JSONArray jSONArray = new JSONArray(obj);
                    List createListBuilder = CollectionsKt.createListBuilder();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                            Result.m7905constructorimpl(Boolean.valueOf(createListBuilder.add(parseSample(jSONObject))));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                        }
                    }
                    list = CollectionsKt.build(createListBuilder);
                } else {
                    list = SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.filter(SequencesKt.map(StringsKt.lineSequence(obj), new Function1() { // from class: com.example.rungps.sleep.SleepOvernightStore$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            String loadSamplesLenient$lambda$50$lambda$46;
                            loadSamplesLenient$lambda$50$lambda$46 = SleepOvernightStore.loadSamplesLenient$lambda$50$lambda$46((String) obj2);
                            return loadSamplesLenient$lambda$50$lambda$46;
                        }
                    }), new Function1() { // from class: com.example.rungps.sleep.SleepOvernightStore$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean loadSamplesLenient$lambda$50$lambda$47;
                            loadSamplesLenient$lambda$50$lambda$47 = SleepOvernightStore.loadSamplesLenient$lambda$50$lambda$47((String) obj2);
                            return Boolean.valueOf(loadSamplesLenient$lambda$50$lambda$47);
                        }
                    }), new Function1() { // from class: com.example.rungps.sleep.SleepOvernightStore$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            SleepTrackSample loadSamplesLenient$lambda$50$lambda$49;
                            loadSamplesLenient$lambda$50$lambda$49 = SleepOvernightStore.loadSamplesLenient$lambda$50$lambda$49(SleepOvernightStore.this, (String) obj2);
                            return loadSamplesLenient$lambda$50$lambda$49;
                        }
                    }));
                }
            }
            m7905constructorimpl = Result.m7905constructorimpl(list);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        List emptyList = CollectionsKt.emptyList();
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = emptyList;
        }
        return (List) m7905constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadSamplesLenient$lambda$50$lambda$46(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.trim((CharSequence) it).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loadSamplesLenient$lambda$50$lambda$47(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTrackSample loadSamplesLenient$lambda$50$lambda$49(SleepOvernightStore sleepOvernightStore, String line) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(line, "line");
        try {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(sleepOvernightStore.parseSample(new JSONObject(line)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        return (SleepTrackSample) m7905constructorimpl;
    }

    private final SleepTrackSample parseSample(JSONObject o) {
        float[] fArr;
        long j = o.getLong("e");
        float f = (float) o.getDouble("m");
        float f2 = (float) o.getDouble("a");
        float optDouble = (float) o.optDouble("br", 0.0d);
        float optDouble2 = (float) o.optDouble("breg", 0.0d);
        float optDouble3 = (float) o.optDouble("q", 0.0d);
        float optDouble4 = (float) o.optDouble("sn", 0.0d);
        float optDouble5 = (float) o.optDouble("mv", 0.0d);
        JSONArray optJSONArray = o.optJSONArray("mel");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            fArr = new float[length];
            int i = 0;
            while (i < length) {
                fArr[i] = (float) optJSONArray.getDouble(i);
                i++;
                length = length;
            }
        } else {
            fArr = null;
        }
        Double valueOf = Double.valueOf(o.optDouble("ap", Double.NaN));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        Float valueOf2 = valueOf != null ? Float.valueOf((float) valueOf.doubleValue()) : null;
        Double valueOf3 = Double.valueOf(o.optDouble("sc", Double.NaN));
        if (Double.isNaN(valueOf3.doubleValue())) {
            valueOf3 = null;
        }
        Float valueOf4 = valueOf3 != null ? Float.valueOf((float) valueOf3.doubleValue()) : null;
        Double valueOf5 = Double.valueOf(o.optDouble("lp", Double.NaN));
        if (Double.isNaN(valueOf5.doubleValue())) {
            valueOf5 = null;
        }
        Float valueOf6 = valueOf5 != null ? Float.valueOf((float) valueOf5.doubleValue()) : null;
        String optString = o.optString("ev", "");
        Intrinsics.checkNotNull(optString);
        String str = !StringsKt.isBlank(optString) ? optString : null;
        Integer valueOf7 = Integer.valueOf(o.optInt("si", -1));
        Integer num = valueOf7.intValue() >= 0 ? valueOf7 : null;
        Boolean valueOf8 = o.has("aq") ? Boolean.valueOf(o.optBoolean("aq")) : null;
        String optString2 = o.optString("nt", "");
        Intrinsics.checkNotNull(optString2);
        String str2 = !StringsKt.isBlank(optString2) ? optString2 : null;
        Boolean valueOf9 = o.has("bp") ? Boolean.valueOf(o.optBoolean("bp")) : null;
        Double valueOf10 = Double.valueOf(o.optDouble("sm", Double.NaN));
        if (Double.isNaN(valueOf10.doubleValue())) {
            valueOf10 = null;
        }
        return new SleepTrackSample(j, f, f2, optDouble, optDouble2, optDouble3, optDouble4, optDouble5, fArr, valueOf2, valueOf4, valueOf6, str, num, valueOf8, str2, valueOf9, valueOf10 != null ? Float.valueOf((float) valueOf10.doubleValue()) : null);
    }

    private final void saveSamplesAtomic(File file, List<SleepTrackSample> list) {
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        FilesKt.writeText$default(file2, "", null, 2, null);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            INSTANCE.appendSampleLine(file2, (SleepTrackSample) it.next());
        }
        if (file.exists()) {
            file.delete();
        }
        file2.renameTo(file);
    }

    private final void atomicWrite(File file, String content) {
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        FilesKt.writeText$default(file2, content, null, 2, null);
        if (file.exists()) {
            file.delete();
        }
        file2.renameTo(file);
    }

    private final File samplesFile(Context context) {
        return new File(context.getFilesDir(), SAMPLES_FILE);
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }
}
