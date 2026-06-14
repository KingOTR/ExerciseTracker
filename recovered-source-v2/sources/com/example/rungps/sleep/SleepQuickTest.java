package com.example.rungps.sleep;

import android.content.Context;
import android.widget.Toast;
import com.example.rungps.gym.GymSessionTiming;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepQuickTest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/SleepQuickTest;", "", "<init>", "()V", "DURATION_MIN", "", "WINDOW_MIN", "start", "", "context", "Landroid/content/Context;", "smartAlarm", "", "successCriteria", "", "", "inBedMin", "asleepMin", "sampleCount", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepQuickTest {
    public static final int $stable = 0;
    public static final int DURATION_MIN = 20;
    public static final SleepQuickTest INSTANCE = new SleepQuickTest();
    private static final int WINDOW_MIN = 10;

    private SleepQuickTest() {
    }

    public final void start(Context context, boolean smartAlarm) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() + GymSessionTiming.IDLE_TRIM_THRESHOLD_MS;
        SleepAlarmPreferences.INSTANCE.setLastAlarmTargetMs(context, currentTimeMillis);
        SleepAlarmScheduler.INSTANCE.scheduleBackupAlarms(context, currentTimeMillis, 10);
        SleepListenService.INSTANCE.start(context, currentTimeMillis, 10, smartAlarm);
        Toast.makeText(context, "Sleep test: 20 min — leave phone plugged in nearby, then Stop & save", 1).show();
    }

    public final List<String> successCriteria(int inBedMin, int asleepMin, int sampleCount) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("In bed ~" + inBedMin + " min (target 20)");
        if (sampleCount >= 60) {
            arrayList2.add("Sensor: ~" + ((sampleCount * 10) / 60) + " min of buckets (" + sampleCount + " samples)");
        } else {
            arrayList2.add("Sensor: only " + sampleCount + " samples — tracking may have stopped early");
        }
        if (asleepMin > 0 && inBedMin < 90) {
            arrayList2.add("Asleep " + asleepMin + " min — pipeline OK for short sessions");
        } else if (inBedMin >= 90 && asleepMin >= inBedMin * 0.15d) {
            arrayList2.add("Asleep " + asleepMin + " min — looks reasonable");
        } else {
            arrayList2.add("Asleep " + asleepMin + " min — check mic permission and battery exemption");
        }
        return arrayList;
    }
}
