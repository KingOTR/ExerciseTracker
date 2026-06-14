package com.example.rungps.sleep;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.example.rungps.MainActivity;
import com.example.rungps.sleep.SleepAlarmAudit;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepAlarmScheduler.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\tJ\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0015JF\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002J(\u0010-\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H\u0002J8\u00100\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmScheduler;", "", "<init>", "()V", "ACTION_FIRE", "", "EXTRA_DEADLINE", "EXTRA_WATCHDOG", "REQ_WINDOW_END", "", "REQ_ALARM_TARGET", "REQ_WINDOW_START", "REQ_SAMPLES_WATCHDOG", "REQ_KEEPALIVE_1", "REQ_KEEPALIVE_2", "REQ_KEEPALIVE_3", "REQ_KEEPALIVE_4", "REQ_KEEPALIVE_5", "REQ_KEEPALIVE_6", "EXTRA_SILENT_WAKE", "SAMPLES_WATCHDOG_DELAY_MS", "", "ensureScheduled", "", "context", "Landroid/content/Context;", "scheduleBackupAlarms", "alarmTargetMs", "windowMin", "scheduleSamplesWatchdog", "delayMs", "cancelSamplesWatchdog", "cancelAll", "scheduleImmediate", "scheduleImmediateKeepAlive", "scheduleAt", "am", "Landroid/app/AlarmManager;", "triggerAtMs", "requestCode", SleepAlarmScheduler.EXTRA_DEADLINE, "", "silentWake", "firePath", "Lcom/example/rungps/sleep/SleepAlarmAudit$FirePath;", "deliverAt", "pi", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmScheduler {
    public static final int $stable = 0;
    public static final String ACTION_FIRE = "com.example.rungps.sleep.ALARM_FIRE";
    public static final String EXTRA_DEADLINE = "deadline";
    public static final String EXTRA_SILENT_WAKE = "silent_wake";
    public static final String EXTRA_WATCHDOG = "samples_watchdog";
    public static final SleepAlarmScheduler INSTANCE = new SleepAlarmScheduler();
    private static final int REQ_ALARM_TARGET = 7105;
    private static final int REQ_KEEPALIVE_1 = 7107;
    private static final int REQ_KEEPALIVE_2 = 7108;
    private static final int REQ_KEEPALIVE_3 = 7109;
    private static final int REQ_KEEPALIVE_4 = 7110;
    private static final int REQ_KEEPALIVE_5 = 7111;
    private static final int REQ_KEEPALIVE_6 = 7112;
    private static final int REQ_SAMPLES_WATCHDOG = 7113;
    private static final int REQ_WINDOW_END = 7104;
    private static final int REQ_WINDOW_START = 7106;
    public static final long SAMPLES_WATCHDOG_DELAY_MS = 180000;

    private SleepAlarmScheduler() {
    }

    public final void ensureScheduled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (SleepOvernightStore.INSTANCE.isActive(context)) {
            long alarmTargetMs = SleepOvernightStore.INSTANCE.alarmTargetMs(context);
            if (alarmTargetMs <= 0) {
                return;
            }
            scheduleBackupAlarms(context, alarmTargetMs, SleepOvernightStore.INSTANCE.windowMin(context));
        }
    }

    public final void scheduleBackupAlarms(Context context, long alarmTargetMs, int windowMin) {
        boolean smartAlarmEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        if (SleepOvernightStore.INSTANCE.isActive(context)) {
            smartAlarmEnabled = SleepOvernightStore.INSTANCE.smartAlarm(context);
        } else {
            smartAlarmEnabled = SleepAlarmPreferences.INSTANCE.smartAlarmEnabled(context);
        }
        SleepAlarmAudit.INSTANCE.recordScheduled(context, alarmTargetMs, windowMin, smartAlarmEnabled);
        cancelAll(context);
        long j = windowMin * 60000;
        long j2 = alarmTargetMs - j;
        long j3 = alarmTargetMs + j;
        long currentTimeMillis = System.currentTimeMillis();
        List createListBuilder = CollectionsKt.createListBuilder();
        int i = 0;
        createListBuilder.addAll(CollectionsKt.listOf((Object[]) new Long[]{5L, 10L, 15L, 30L, 45L, 60L, 90L, 120L, 180L, 240L}));
        for (long j4 = 300; j4 <= 720; j4 += 60) {
            createListBuilder.add(Long.valueOf(j4));
        }
        for (Object obj : CollectionsKt.build(createListBuilder)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long longValue = currentTimeMillis + (((Number) obj).longValue() * 60000);
            if (longValue > currentTimeMillis && longValue < alarmTargetMs) {
                scheduleAt$default(INSTANCE, context, alarmManager, longValue, i + REQ_KEEPALIVE_1, false, true, null, 64, null);
            }
            i = i2;
        }
        if (j2 > currentTimeMillis) {
            scheduleAt$default(this, context, alarmManager, j2, REQ_WINDOW_START, false, true, null, 64, null);
        }
        if (alarmTargetMs > currentTimeMillis) {
            scheduleAt$default(this, context, alarmManager, alarmTargetMs, 7105, true, false, SleepAlarmAudit.FirePath.BACKUP_DEADLINE, 32, null);
        }
        if (j3 > currentTimeMillis) {
            scheduleAt$default(this, context, alarmManager, j3, REQ_WINDOW_END, true, false, SleepAlarmAudit.FirePath.WINDOW_END, 32, null);
        }
        scheduleSamplesWatchdog(context, SAMPLES_WATCHDOG_DELAY_MS);
        SleepAlarmPreferences.INSTANCE.setLastAlarmTargetMs(context, alarmTargetMs);
    }

    public static /* synthetic */ void scheduleSamplesWatchdog$default(SleepAlarmScheduler sleepAlarmScheduler, Context context, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = SAMPLES_WATCHDOG_DELAY_MS;
        }
        sleepAlarmScheduler.scheduleSamplesWatchdog(context, j);
    }

    public final void scheduleSamplesWatchdog(Context context, long delayMs) {
        AlarmManager alarmManager;
        Intrinsics.checkNotNullParameter(context, "context");
        if (SleepOvernightStore.INSTANCE.isActive(context) && (alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class)) != null) {
            long currentTimeMillis = System.currentTimeMillis() + RangesKt.coerceAtLeast(delayMs, 60000L);
            Intent intent = new Intent(context, (Class<?>) SleepAlarmReceiver.class);
            intent.setAction(ACTION_FIRE);
            intent.putExtra(EXTRA_DEADLINE, false);
            intent.putExtra(EXTRA_SILENT_WAKE, false);
            intent.putExtra(EXTRA_WATCHDOG, true);
            Unit unit = Unit.INSTANCE;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, REQ_SAMPLES_WATCHDOG, intent, 201326592);
            Intrinsics.checkNotNull(broadcast);
            deliverAt(context, alarmManager, currentTimeMillis, broadcast);
        }
    }

    public final void cancelSamplesWatchdog(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SleepAlarmReceiver.class);
        intent.setAction(ACTION_FIRE);
        Unit unit = Unit.INSTANCE;
        alarmManager.cancel(PendingIntent.getBroadcast(context, REQ_SAMPLES_WATCHDOG, intent, 201326592));
    }

    public final void cancelAll(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        alarmManager.cancel(pendingIntent$default(this, context, REQ_WINDOW_END, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, 7105, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_WINDOW_START, false, false, null, 28, null));
        cancelSamplesWatchdog(context);
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_1, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_2, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_3, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_4, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_5, false, false, null, 28, null));
        alarmManager.cancel(pendingIntent$default(this, context, REQ_KEEPALIVE_6, false, false, null, 28, null));
        for (int i = REQ_KEEPALIVE_1; i < 7128; i++) {
            alarmManager.cancel(pendingIntent$default(this, context, i, false, false, null, 28, null));
        }
        alarmManager.cancel(pendingIntent$default(this, context, 7103, false, false, null, 28, null));
    }

    public final void scheduleImmediate(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        long currentTimeMillis = 300 + System.currentTimeMillis();
        Intent intent = new Intent(context, (Class<?>) SleepAlarmReceiver.class);
        intent.setAction(ACTION_FIRE);
        intent.putExtra(EXTRA_DEADLINE, true);
        intent.putExtra(EXTRA_SILENT_WAKE, false);
        Unit unit = Unit.INSTANCE;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 7103, intent, 201326592);
        Intrinsics.checkNotNull(broadcast);
        deliverAt(context, alarmManager, currentTimeMillis, broadcast);
    }

    public static /* synthetic */ void scheduleImmediateKeepAlive$default(SleepAlarmScheduler sleepAlarmScheduler, Context context, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 3000;
        }
        sleepAlarmScheduler.scheduleImmediateKeepAlive(context, j);
    }

    public final void scheduleImmediateKeepAlive(Context context, long delayMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        long coerceAtLeast = RangesKt.coerceAtLeast(System.currentTimeMillis() + delayMs, System.currentTimeMillis() + 500);
        Intent intent = new Intent(context, (Class<?>) SleepAlarmReceiver.class);
        intent.setAction(ACTION_FIRE);
        intent.putExtra(EXTRA_DEADLINE, false);
        intent.putExtra(EXTRA_SILENT_WAKE, true);
        Unit unit = Unit.INSTANCE;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, REQ_KEEPALIVE_6, intent, 201326592);
        Intrinsics.checkNotNull(broadcast);
        deliverAt(context, alarmManager, coerceAtLeast, broadcast);
    }

    static /* synthetic */ void scheduleAt$default(SleepAlarmScheduler sleepAlarmScheduler, Context context, AlarmManager alarmManager, long j, int i, boolean z, boolean z2, SleepAlarmAudit.FirePath firePath, int i2, Object obj) {
        sleepAlarmScheduler.scheduleAt(context, alarmManager, j, i, z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : firePath);
    }

    private final void scheduleAt(Context context, AlarmManager am, long triggerAtMs, int requestCode, boolean deadline, boolean silentWake, SleepAlarmAudit.FirePath firePath) {
        if (triggerAtMs <= System.currentTimeMillis()) {
            return;
        }
        deliverAt(context, am, triggerAtMs, pendingIntent(context, requestCode, deadline, silentWake, firePath));
    }

    private final void deliverAt(Context context, AlarmManager am, long triggerAtMs, PendingIntent pi) {
        am.setAlarmClock(new AlarmManager.AlarmClockInfo(triggerAtMs, PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class).putExtra("open_tab", "sleep"), 201326592)), pi);
    }

    static /* synthetic */ PendingIntent pendingIntent$default(SleepAlarmScheduler sleepAlarmScheduler, Context context, int i, boolean z, boolean z2, SleepAlarmAudit.FirePath firePath, int i2, Object obj) {
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        if ((i2 & 16) != 0) {
            firePath = null;
        }
        return sleepAlarmScheduler.pendingIntent(context, i, z3, z4, firePath);
    }

    private final PendingIntent pendingIntent(Context context, int requestCode, boolean deadline, boolean silentWake, SleepAlarmAudit.FirePath firePath) {
        Intent intent = new Intent(context, (Class<?>) SleepAlarmReceiver.class);
        intent.setAction(ACTION_FIRE);
        intent.putExtra(EXTRA_DEADLINE, deadline);
        intent.putExtra(EXTRA_SILENT_WAKE, silentWake);
        if (firePath != null) {
            intent.putExtra(SleepAlarmAudit.EXTRA_FIRE_PATH, firePath.getWire());
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
