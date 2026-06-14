package com.example.rungps.recovery;

import com.example.rungps.data.DailyStepsEntity;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: StepLoadScore.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/recovery/StepLoadScore;", "", "<init>", "()V", "BASELINE_STEPS_7D", "", "STEPS_PER_POINT", "sumSteps7d", "entries", "", "Lcom/example/rungps/data/DailyStepsEntity;", "weekStartMs", "nowMs", "loadPoints", "", "steps7d", "detailLine", "", "readinessPenalty", "", "stepsToday", "(Ljava/lang/Long;)I", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StepLoadScore {
    public static final int $stable = 0;
    public static final long BASELINE_STEPS_7D = 49000;
    public static final StepLoadScore INSTANCE = new StepLoadScore();
    public static final long STEPS_PER_POINT = 3500;

    private StepLoadScore() {
    }

    public final long sumSteps7d(List<DailyStepsEntity> entries, long weekStartMs, long nowMs) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        ZoneId systemDefault = ZoneId.systemDefault();
        long j = 0;
        for (DailyStepsEntity dailyStepsEntity : entries) {
            long epochMilli = LocalDate.ofEpochDay(dailyStepsEntity.getEpochDay()).atStartOfDay(systemDefault).toInstant().toEpochMilli();
            j += (weekStartMs > epochMilli || epochMilli > nowMs) ? 0L : RangesKt.coerceAtLeast(dailyStepsEntity.getSteps(), 0L);
        }
        return j;
    }

    public final double loadPoints(long steps7d) {
        return RangesKt.coerceAtMost(RangesKt.coerceAtLeast(steps7d - BASELINE_STEPS_7D, 0L) / STEPS_PER_POINT, 22.0d);
    }

    public final String detailLine(long steps7d) {
        if (steps7d <= 0) {
            return null;
        }
        double loadPoints = loadPoints(steps7d);
        if (loadPoints < 0.5d) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%,d steps (7d) · +%.0f load", Arrays.copyOf(new Object[]{Long.valueOf(steps7d), Double.valueOf(loadPoints)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final int readinessPenalty(Long stepsToday) {
        if (stepsToday == null || stepsToday.longValue() <= 0) {
            return 0;
        }
        if (stepsToday.longValue() >= 22000) {
            return 8;
        }
        return stepsToday.longValue() >= 16000 ? 4 : 0;
    }
}
