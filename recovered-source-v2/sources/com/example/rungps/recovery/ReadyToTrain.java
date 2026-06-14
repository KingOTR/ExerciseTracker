package com.example.rungps.recovery;

import androidx.compose.material3.MenuKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ReadyToTrain.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/recovery/ReadyToTrain;", "", "<init>", "()V", "assess", "Lcom/example/rungps/recovery/ReadyToTrainAssessment;", "recoveryRemainingMs", "", "activeLoadCount", "", "soccerActiveCount", "deload", "Lcom/example/rungps/recovery/DeloadAdvice;", "sleepQuality", "sleepHoursMin", "stepsToday", "(JIILcom/example/rungps/recovery/DeloadAdvice;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/example/rungps/recovery/ReadyToTrainAssessment;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReadyToTrain {
    public static final int $stable = 0;
    public static final ReadyToTrain INSTANCE = new ReadyToTrain();

    private ReadyToTrain() {
    }

    public final ReadyToTrainAssessment assess(long recoveryRemainingMs, int activeLoadCount, int soccerActiveCount, DeloadAdvice deload, Integer sleepQuality, Integer sleepHoursMin, Long stepsToday) {
        String str;
        Intrinsics.checkNotNullParameter(deload, "deload");
        if (deload.getRecommended()) {
            return new ReadyToTrainAssessment(TrainReadiness.Rest, "Rest / deload week", deload.getDetail());
        }
        String str2 = soccerActiveCount > 0 ? " Includes soccer match recovery load." : "";
        if (activeLoadCount > 0 && recoveryRemainingMs > 64800000) {
            return new ReadyToTrainAssessment(TrainReadiness.Rest, "Not ready yet", "Heavy recovery load still clearing (" + RecoveryModel.INSTANCE.formatRemaining(recoveryRemainingMs) + " left). Prefer easy movement or rest." + str2);
        }
        boolean z = false;
        boolean z2 = sleepQuality != null && sleepQuality.intValue() < 55;
        if (sleepHoursMin != null && sleepHoursMin.intValue() < 360) {
            z = true;
        }
        if (z2 || z) {
            if (z2 && z) {
                str = "Sleep was short and low quality — avoid max efforts; prefer technique or easy cardio.";
            } else if (z) {
                str = "You slept under ~6 hours — keep gym and runs sub-maximal today.";
            } else {
                str = "Sleep quality was low — reduce intensity and volume today.";
            }
            if (activeLoadCount == 0 && recoveryRemainingMs < 21600000) {
                return new ReadyToTrainAssessment(TrainReadiness.Caution, "Sleep training gate", str);
            }
        }
        if (activeLoadCount <= 0 || recoveryRemainingMs <= 21600000) {
            if (z2 || z) {
                return new ReadyToTrainAssessment(TrainReadiness.Caution, "Okay with care", "Recovery timers look clear, but sleep was low quality or short — avoid max efforts today.".concat(str2));
            }
            if (stepsToday != null) {
                if (RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(1, 2500), stepsToday.longValue())) {
                    return new ReadyToTrainAssessment(TrainReadiness.Caution, "Okay with care", "Low step count so far today — you may be fatigued or sedentary. Warm up well before hard work.");
                }
            }
            if (stepsToday != null && stepsToday.longValue() >= 18000) {
                return new ReadyToTrainAssessment(TrainReadiness.Caution, "Okay with care", "High step count today — walking load may limit hard training. Prefer technique or easy cardio.");
            }
            return new ReadyToTrainAssessment(TrainReadiness.Ready, "Ready to train", activeLoadCount == 0 ? "No active recovery debt. Good sleep and load balance — fine for planned hard sessions." : "Residual load is minor (" + RecoveryModel.INSTANCE.formatRemaining(recoveryRemainingMs) + "). Proceed with your plan." + str2);
        }
        TrainReadiness trainReadiness = TrainReadiness.Caution;
        StringBuilder sb = new StringBuilder();
        sb.append("Some fatigue remains (" + RecoveryModel.INSTANCE.formatRemaining(recoveryRemainingMs) + "). ");
        if (z2 || z) {
            sb.append("Sleep was below target — keep intensity moderate. ");
        } else {
            sb.append("Stick to technique work, short runs, or light gym. ");
        }
        sb.append(StringsKt.take(deload.getDetail(), MenuKt.InTransitionDuration));
        sb.append(str2);
        Unit unit = Unit.INSTANCE;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new ReadyToTrainAssessment(trainReadiness, "Train easy", sb2);
    }
}
