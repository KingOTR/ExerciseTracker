package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepAlarmAudit.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b!J\u0017\u0010\"\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\b#J'\u0010$\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0012H\u0000¢\u0006\u0002\b'J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0012H\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0012H\u0002J\u001d\u0010*\u001a\n ,*\u0004\u0018\u00010+0+2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010-R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmAudit;", "", "<init>", "()V", "PREFS", "", "KEY_SCHEDULED_TARGET", "KEY_SCHEDULED_AT", "KEY_WINDOW_MIN", "KEY_SMART", "KEY_FIRED_AT", "KEY_FIRE_PATH", "EXTRA_FIRE_PATH", "recordScheduled", "", "context", "Landroid/content/Context;", "scheduledTargetMs", "", "windowMin", "", "smartEnabled", "", "recordFired", "path", "Lcom/example/rungps/sleep/SleepAlarmAudit$FirePath;", "clearForNewNight", "firedAtMs", "firePath", "smartEnabledAtSchedule", "formatWakeLine", "smartAlarmUnavailableMessage", "pathNote", "pathNote$app_sideload", "pathNoteForPath", "pathNoteForPath$app_sideload", "describeFirePath", "stopReason", "stopHealthMs", "describeFirePath$app_sideload", "backupNote", "trackingStoppedSuffix", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "FirePath", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmAudit {
    public static final int $stable = 0;
    public static final String EXTRA_FIRE_PATH = "fire_path";
    public static final SleepAlarmAudit INSTANCE = new SleepAlarmAudit();
    private static final String KEY_FIRED_AT = "fired_at_ms";
    private static final String KEY_FIRE_PATH = "fire_path";
    private static final String KEY_SCHEDULED_AT = "scheduled_at_ms";
    private static final String KEY_SCHEDULED_TARGET = "scheduled_target_ms";
    private static final String KEY_SMART = "smart_enabled";
    private static final String KEY_WINDOW_MIN = "window_min";
    private static final String PREFS = "sleep_alarm_audit";

    /* compiled from: SleepAlarmAudit.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FirePath.values().length];
            try {
                iArr[FirePath.SERVICE_SMART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirePath.BACKUP_DEADLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FirePath.WINDOW_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepAlarmAudit() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepAlarmAudit.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmAudit$FirePath;", "", "wire", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWire", "()Ljava/lang/String;", "SERVICE_SMART", "BACKUP_DEADLINE", "WINDOW_END", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FirePath {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FirePath[] $VALUES;
        private final String wire;
        public static final FirePath SERVICE_SMART = new FirePath("SERVICE_SMART", 0, "service_smart");
        public static final FirePath BACKUP_DEADLINE = new FirePath("BACKUP_DEADLINE", 1, "backup_deadline");
        public static final FirePath WINDOW_END = new FirePath("WINDOW_END", 2, "window_end");

        private static final /* synthetic */ FirePath[] $values() {
            return new FirePath[]{SERVICE_SMART, BACKUP_DEADLINE, WINDOW_END};
        }

        public static EnumEntries<FirePath> getEntries() {
            return $ENTRIES;
        }

        private FirePath(String str, int i, String str2) {
            this.wire = str2;
        }

        public final String getWire() {
            return this.wire;
        }

        static {
            FirePath[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static FirePath valueOf(String str) {
            return (FirePath) Enum.valueOf(FirePath.class, str);
        }

        public static FirePath[] values() {
            return (FirePath[]) $VALUES.clone();
        }
    }

    public final void recordScheduled(Context context, long scheduledTargetMs, int windowMin, boolean smartEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putLong(KEY_SCHEDULED_TARGET, scheduledTargetMs).putLong(KEY_SCHEDULED_AT, System.currentTimeMillis()).putInt("window_min", RangesKt.coerceIn(windowMin, 10, 45)).putBoolean(KEY_SMART, smartEnabled).apply();
    }

    public final void recordFired(Context context, FirePath path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        SharedPreferences prefs = prefs(context);
        if (prefs.contains(KEY_FIRED_AT) && firePath(context) == FirePath.SERVICE_SMART) {
            return;
        }
        prefs.edit().putLong(KEY_FIRED_AT, System.currentTimeMillis()).putString("fire_path", path.getWire()).apply();
        SleepOvernightBattery.INSTANCE.recordAlarmFire(context);
    }

    public final void clearForNewNight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().clear().apply();
    }

    public final long scheduledTargetMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_SCHEDULED_TARGET, 0L);
    }

    public final long firedAtMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getLong(KEY_FIRED_AT, 0L);
    }

    public final FirePath firePath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = null;
        String string = prefs(context).getString("fire_path", null);
        if (string == null) {
            return null;
        }
        Iterator<E> it = FirePath.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((FirePath) next).getWire(), string)) {
                obj = next;
                break;
            }
        }
        return (FirePath) obj;
    }

    public final boolean smartEnabledAtSchedule(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean(KEY_SMART, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (r5.longValue() > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String formatWakeLine(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long valueOf = Long.valueOf(scheduledTargetMs(context));
        Long l = null;
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            valueOf = Long.valueOf(SleepOvernightStore.INSTANCE.alarmTargetMs(context));
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
        }
        long longValue = valueOf.longValue();
        Long valueOf2 = Long.valueOf(firedAtMs(context));
        if (valueOf2.longValue() <= 0) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            valueOf2 = Long.valueOf(SleepOvernightStore.INSTANCE.alarmFiredAtMs(context));
        }
        l = valueOf2;
        ZoneId systemDefault = ZoneId.systemDefault();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
        String format = Instant.ofEpochMilli(longValue).atZone(systemDefault).format(ofPattern);
        if (l == null) {
            return "Scheduled " + format;
        }
        String format2 = Instant.ofEpochMilli(l.longValue()).atZone(systemDefault).format(ofPattern);
        String pathNote$app_sideload = pathNote$app_sideload(context);
        StringBuilder sb = new StringBuilder();
        sb.append("Scheduled " + format + " · Fired " + format2);
        if (!StringsKt.isBlank(pathNote$app_sideload)) {
            sb.append(" (" + pathNote$app_sideload + ")");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String smartAlarmUnavailableMessage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String lastStopReason = SleepOvernightStore.INSTANCE.lastStopReason(context);
        if (lastStopReason == null) {
            lastStopReason = "";
        }
        if (!StringsKt.contains$default((CharSequence) lastStopReason, (CharSequence) "service_destroyed", false, 2, (Object) null)) {
            return null;
        }
        if ((!SleepOvernightStore.INSTANCE.smartAlarm(context) && !smartEnabledAtSchedule(context)) || firePath(context) == FirePath.SERVICE_SMART) {
            return null;
        }
        Long valueOf = Long.valueOf(SleepOvernightStore.INSTANCE.lastHealthMs(context));
        Long l = valueOf.longValue() > 0 ? valueOf : null;
        if (l == null) {
            return "Smart alarm unavailable — tracking stopped overnight";
        }
        return "Smart alarm unavailable — tracking stopped " + Instant.ofEpochMilli(l.longValue()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("h:mm a"));
    }

    public final String pathNote$app_sideload(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FirePath firePath = firePath(context);
        String lastStopReason = SleepOvernightStore.INSTANCE.lastStopReason(context);
        if (lastStopReason == null) {
            lastStopReason = "";
        }
        return describeFirePath$app_sideload(firePath, lastStopReason, SleepOvernightStore.INSTANCE.lastHealthMs(context));
    }

    public final String pathNoteForPath$app_sideload(FirePath path) {
        return describeFirePath$app_sideload(path, "", 0L);
    }

    public final String describeFirePath$app_sideload(FirePath path, String stopReason, long stopHealthMs) {
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        int i = path == null ? -1 : WhenMappings.$EnumSwitchMapping$0[path.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "smart wake";
        }
        if (i == 2) {
            return backupNote(stopReason, stopHealthMs);
        }
        if (i == 3) {
            return "window end" + trackingStoppedSuffix(stopReason, stopHealthMs);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String backupNote(String stopReason, long stopHealthMs) {
        String trackingStoppedSuffix = trackingStoppedSuffix(stopReason, stopHealthMs);
        return StringsKt.isBlank(trackingStoppedSuffix) ? "backup" : "backup" + trackingStoppedSuffix;
    }

    private final String trackingStoppedSuffix(String stopReason, long stopHealthMs) {
        if (!StringsKt.contains$default((CharSequence) stopReason, (CharSequence) "service_destroyed", false, 2, (Object) null) || stopHealthMs <= 0) {
            return "";
        }
        return " — tracking stopped " + Instant.ofEpochMilli(stopHealthMs).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("h:mm a"));
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }
}
