package com.example.rungps.analytics;

import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.recovery.StepLoadScore;
import com.example.rungps.recovery.TrainReadiness;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DailyReadinessScore.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/analytics/DailyReadinessScore;", "", "<init>", "()V", "compute", "Lcom/example/rungps/analytics/DailyReadinessSnapshot;", "ready", "Lcom/example/rungps/recovery/ReadyToTrainAssessment;", "combinedLoad", "Lcom/example/rungps/analytics/CombinedLoadSnapshot;", "sleepQuality", "", "sleepHoursMin", "stepsToday", "", "(Lcom/example/rungps/recovery/ReadyToTrainAssessment;Lcom/example/rungps/analytics/CombinedLoadSnapshot;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/example/rungps/analytics/DailyReadinessSnapshot;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DailyReadinessScore {
    public static final int $stable = 0;
    public static final DailyReadinessScore INSTANCE = new DailyReadinessScore();

    /* compiled from: DailyReadinessScore.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainReadiness.values().length];
            try {
                iArr[TrainReadiness.Ready.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrainReadiness.Caution.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrainReadiness.Rest.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DailyReadinessScore() {
    }

    public static /* synthetic */ DailyReadinessSnapshot compute$default(DailyReadinessScore dailyReadinessScore, ReadyToTrainAssessment readyToTrainAssessment, CombinedLoadSnapshot combinedLoadSnapshot, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 16) != 0) {
            l = null;
        }
        return dailyReadinessScore.compute(readyToTrainAssessment, combinedLoadSnapshot, num, num2, l);
    }

    public final DailyReadinessSnapshot compute(ReadyToTrainAssessment ready, CombinedLoadSnapshot combinedLoad, Integer sleepQuality, Integer sleepHoursMin, Long stepsToday) {
        int i;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(ready, "ready");
        int i2 = WhenMappings.$EnumSwitchMapping$0[ready.getReadiness().ordinal()];
        if (i2 == 1) {
            i = 88;
        } else if (i2 == 2) {
            i = 62;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 32;
        }
        if (combinedLoad != null) {
            if (combinedLoad.getScore() >= 85) {
                i -= 18;
            } else if (combinedLoad.getScore() >= 70) {
                i -= 10;
            } else if (combinedLoad.getScore() >= 55) {
                i -= 4;
            } else if (combinedLoad.getScore() < 35) {
                i += 4;
            }
        }
        if (sleepQuality != null && sleepQuality.intValue() < 50) {
            i -= 12;
        } else if (sleepQuality != null && sleepQuality.intValue() < 65) {
            i -= 6;
        }
        if (sleepHoursMin != null && sleepHoursMin.intValue() < 330) {
            i -= 10;
        } else if (sleepHoursMin != null && sleepHoursMin.intValue() < 390) {
            i -= 5;
        }
        int coerceIn = RangesKt.coerceIn(i - StepLoadScore.INSTANCE.readinessPenalty(stepsToday), 0, 100);
        if (coerceIn >= 80) {
            str = "High readiness";
        } else if (coerceIn >= 60) {
            str = "Moderate readiness";
        } else if (coerceIn >= 40) {
            str = "Train with care";
        } else {
            str = "Low readiness";
        }
        if (combinedLoad != null) {
            str2 = " · " + combinedLoad.getLabel();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new DailyReadinessSnapshot(coerceIn, str, ready.getHeadline() + str2);
    }
}
