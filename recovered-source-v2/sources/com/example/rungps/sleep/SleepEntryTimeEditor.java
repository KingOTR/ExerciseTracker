package com.example.rungps.sleep;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepEntryTimeEditor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fJ8\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005J(\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/sleep/SleepEntryTimeEditor;", "", "<init>", "()V", "wakeTimeToEpochMs", "", "wakeHour", "", "wakeMinute", "sessionStartMs", "nowMs", "zone", "Ljava/time/ZoneId;", "defaultWakeLocalTime", "Lkotlin/Pair;", "alarmTargetMs", "updateEndTime", "Lkotlin/Result;", "Lcom/example/rungps/data/SleepEntryEntity;", "context", "Landroid/content/Context;", "entry", "newEndMs", "updateEndTime-BWLJW6A", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adjustEndTime", "rebuildFromHypnogram", "newInBed", "hypno", "", "inBedMinutes", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepEntryTimeEditor {
    public static final int $stable = 0;
    public static final SleepEntryTimeEditor INSTANCE = new SleepEntryTimeEditor();

    /* compiled from: SleepEntryTimeEditor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepStageLabel.values().length];
            try {
                iArr[SleepStageLabel.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepStageLabel.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepEntryTimeEditor() {
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.time.ZonedDateTime] */
    public final long wakeTimeToEpochMs(int wakeHour, int wakeMinute, long sessionStartMs, long nowMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        ZonedDateTime withNano = Instant.ofEpochMilli(nowMs).atZone(zone).withHour(wakeHour).withMinute(wakeMinute).withSecond(0).withNano(0);
        long epochMilli = withNano.toInstant().toEpochMilli();
        if (epochMilli > nowMs) {
            epochMilli = withNano.minusDays(1L).toInstant().toEpochMilli();
        }
        if (epochMilli <= sessionStartMs) {
            epochMilli = Instant.ofEpochMilli(sessionStartMs).atZone(zone).toLocalDate().plusDays(1L).atTime(wakeHour, wakeMinute).atZone(zone).toInstant().toEpochMilli();
            if (epochMilli > nowMs) {
                epochMilli = withNano.minusDays(1L).toInstant().toEpochMilli();
            }
        }
        return RangesKt.coerceIn(epochMilli, sessionStartMs + 60000, nowMs);
    }

    public final Pair<Integer, Integer> defaultWakeLocalTime(long sessionStartMs, long nowMs, long alarmTargetMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        if (sessionStartMs + 60000 <= alarmTargetMs && alarmTargetMs <= nowMs) {
            LocalTime localTime = Instant.ofEpochMilli(alarmTargetMs).atZone(zone).toLocalTime();
            return TuplesKt.to(Integer.valueOf(localTime.getHour()), Integer.valueOf(localTime.getMinute()));
        }
        LocalTime localTime2 = Instant.ofEpochMilli(nowMs).atZone(zone).toLocalTime();
        return TuplesKt.to(Integer.valueOf(localTime2.getHour()), Integer.valueOf(localTime2.getMinute()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: updateEndTime-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6923updateEndTimeBWLJW6A(Context context, SleepEntryEntity sleepEntryEntity, long j, Continuation<? super Result<SleepEntryEntity>> continuation) {
        SleepEntryTimeEditor$updateEndTime$1 sleepEntryTimeEditor$updateEndTime$1;
        int i;
        SleepEntryEntity sleepEntryEntity2;
        try {
            if (continuation instanceof SleepEntryTimeEditor$updateEndTime$1) {
                sleepEntryTimeEditor$updateEndTime$1 = (SleepEntryTimeEditor$updateEndTime$1) continuation;
                if ((sleepEntryTimeEditor$updateEndTime$1.label & Integer.MIN_VALUE) != 0) {
                    sleepEntryTimeEditor$updateEndTime$1.label -= Integer.MIN_VALUE;
                    Object obj = sleepEntryTimeEditor$updateEndTime$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sleepEntryTimeEditor$updateEndTime$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (j <= sleepEntryEntity.getStartTimeMs()) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Wake time must be after bed time")));
                        }
                        SleepEntryEntity adjustEndTime = adjustEndTime(sleepEntryEntity, j);
                        String validate = SleepEntryValidator.INSTANCE.validate(adjustEndTime);
                        if (validate != null) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException(validate)));
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        SleepEntryTimeEditor sleepEntryTimeEditor = this;
                        Repository repository = Repository.INSTANCE.get(context);
                        sleepEntryTimeEditor$updateEndTime$1.L$0 = adjustEndTime;
                        sleepEntryTimeEditor$updateEndTime$1.label = 1;
                        if (repository.updateSleepEntry(adjustEndTime, sleepEntryTimeEditor$updateEndTime$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sleepEntryEntity2 = adjustEndTime;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sleepEntryEntity2 = (SleepEntryEntity) sleepEntryTimeEditor$updateEndTime$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m7905constructorimpl(sleepEntryEntity2);
                }
            }
            if (i != 0) {
            }
            return Result.m7905constructorimpl(sleepEntryEntity2);
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        sleepEntryTimeEditor$updateEndTime$1 = new SleepEntryTimeEditor$updateEndTime$1(this, continuation);
        Object obj2 = sleepEntryTimeEditor$updateEndTime$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepEntryTimeEditor$updateEndTime$1.label;
    }

    public final SleepEntryEntity adjustEndTime(SleepEntryEntity entry, long newEndMs) {
        int resolveQuality;
        SleepEntryEntity copy;
        Intrinsics.checkNotNullParameter(entry, "entry");
        int inBedMinutes = inBedMinutes(entry);
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((newEndMs - entry.getStartTimeMs()) / 60000), 1);
        if (newEndMs <= entry.getStartTimeMs()) {
            throw new IllegalArgumentException("Wake time must be after bed time");
        }
        String hypnogramCompact = entry.getHypnogramCompact();
        String str = hypnogramCompact;
        if (str != null && !StringsKt.isBlank(str)) {
            return rebuildFromHypnogram(entry, newEndMs, coerceAtLeast, hypnogramCompact);
        }
        double d = coerceAtLeast;
        double coerceAtLeast2 = d / RangesKt.coerceAtLeast(inBedMinutes, 1);
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(entry.getTotalSleepMin() * coerceAtLeast2), 0, coerceAtLeast);
        int coerceIn2 = RangesKt.coerceIn((int) ((coerceIn * 100.0d) / d), 1, 100);
        SleepScoring sleepScoring = SleepScoring.INSTANCE;
        Integer restlessnessIndex = entry.getRestlessnessIndex();
        SleepScoring.SleepScorePillars computeScorePillars = sleepScoring.computeScorePillars(coerceIn, coerceAtLeast, coerceIn2, restlessnessIndex != null ? restlessnessIndex.intValue() : 30, CollectionsKt.emptyList(), CollectionsKt.emptyList());
        resolveQuality = SleepScoring.INSTANCE.resolveQuality(entry.getSource(), coerceIn, (r18 & 4) != 0 ? null : adjustEndTime$scaleMin(coerceAtLeast2, entry.getDeepSleepMin()), (r18 & 8) != 0 ? null : adjustEndTime$scaleMin(coerceAtLeast2, entry.getLightSleepMin()), (r18 & 16) != 0 ? null : Integer.valueOf(coerceIn2), (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : null);
        StringBuilder sb = new StringBuilder();
        String notes = entry.getNotes();
        if (notes != null) {
            if (StringsKt.isBlank(notes)) {
                notes = null;
            }
            if (notes != null) {
                sb.append(notes);
                sb.append(" · ");
            }
        }
        sb.append("wake time corrected");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Integer adjustEndTime$scaleMin = adjustEndTime$scaleMin(coerceAtLeast2, entry.getDeepSleepMin());
        Integer adjustEndTime$scaleMin2 = adjustEndTime$scaleMin(coerceAtLeast2, entry.getLightSleepMin());
        Integer adjustEndTime$scaleMin3 = adjustEndTime$scaleMin(coerceAtLeast2, entry.getRemSleepMin());
        Integer valueOf = Integer.valueOf(RangesKt.coerceAtLeast(coerceAtLeast - coerceIn, 0));
        copy = entry.copy((r51 & 1) != 0 ? entry.id : 0L, (r51 & 2) != 0 ? entry.startTimeMs : 0L, (r51 & 4) != 0 ? entry.endTimeMs : newEndMs, (r51 & 8) != 0 ? entry.totalSleepMin : coerceIn, (r51 & 16) != 0 ? entry.deepSleepMin : adjustEndTime$scaleMin, (r51 & 32) != 0 ? entry.lightSleepMin : adjustEndTime$scaleMin2, (r51 & 64) != 0 ? entry.sleepEfficiency : Integer.valueOf(coerceIn2), (r51 & 128) != 0 ? entry.sleepQuality : Integer.valueOf(resolveQuality), (r51 & 256) != 0 ? entry.source : null, (r51 & 512) != 0 ? entry.notes : sb2, (r51 & 1024) != 0 ? entry.wakeMood : null, (r51 & 2048) != 0 ? entry.snoreEvents : null, (r51 & 4096) != 0 ? entry.awakeSleepMin : valueOf.intValue() > 0 ? valueOf : null, (r51 & 8192) != 0 ? entry.restlessnessIndex : null, (r51 & 16384) != 0 ? entry.remSleepMin : adjustEndTime$scaleMin3, (r51 & 32768) != 0 ? entry.smartAlarmUsed : false, (r51 & 65536) != 0 ? entry.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? entry.scoreRoutine : Integer.valueOf(computeScorePillars.getRoutine()), (r51 & 262144) != 0 ? entry.scoreQualityPillar : Integer.valueOf(computeScorePillars.getQuality()), (r51 & 524288) != 0 ? entry.scoreDuration : Integer.valueOf(computeScorePillars.getDuration()), (r51 & 1048576) != 0 ? entry.hypnogramCompact : null, (r51 & 2097152) != 0 ? entry.eventMarkersCompact : null, (r51 & 4194304) != 0 ? entry.stageConfidenceMean : null, (r51 & 8388608) != 0 ? entry.micCoverageRatio : null, (r51 & 16777216) != 0 ? entry.fusionSource : null, (r51 & 33554432) != 0 ? entry.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? entry.osaRiskHint : null, (r51 & 134217728) != 0 ? entry.sleepDebtHours : null, (r51 & 268435456) != 0 ? entry.consistencyScore : null, (r51 & 536870912) != 0 ? entry.sleepAnalyticsJson : null);
        return copy;
    }

    private static final Integer adjustEndTime$scaleMin(double d, Integer num) {
        if (num != null) {
            return Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(num.intValue() * d), 0));
        }
        return null;
    }

    private final SleepEntryEntity rebuildFromHypnogram(SleepEntryEntity entry, long newEndMs, int newInBed, String hypno) {
        int resolveQuality;
        SleepEntryEntity copy;
        List<? extends SleepStageLabel> take = CollectionsKt.take(SleepHypnogramEncoder.INSTANCE.decode(hypno), newInBed);
        double d = newInBed;
        double coerceAtLeast = RangesKt.coerceAtLeast(d / RangesKt.coerceAtLeast(take.size(), 1), 1.0d);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (SleepStageLabel sleepStageLabel : take) {
            int coerceAtLeast2 = RangesKt.coerceAtLeast(MathKt.roundToInt(coerceAtLeast), 1);
            int i4 = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i += coerceAtLeast2;
                } else if (i4 != 3) {
                    i2 += coerceAtLeast2;
                } else {
                    i3 += coerceAtLeast2;
                }
            }
        }
        int coerceIn = RangesKt.coerceIn(i + i2 + i3, 0, newInBed);
        int coerceAtLeast3 = RangesKt.coerceAtLeast(newInBed - coerceIn, 0);
        int coerceIn2 = RangesKt.coerceIn((int) ((coerceIn * 100.0d) / d), 1, 100);
        SleepScoring sleepScoring = SleepScoring.INSTANCE;
        Integer restlessnessIndex = entry.getRestlessnessIndex();
        SleepScoring.SleepScorePillars computeScorePillars = sleepScoring.computeScorePillars(coerceIn, newInBed, coerceIn2, restlessnessIndex != null ? restlessnessIndex.intValue() : 30, CollectionsKt.emptyList(), CollectionsKt.emptyList());
        resolveQuality = SleepScoring.INSTANCE.resolveQuality(entry.getSource(), coerceIn, (r18 & 4) != 0 ? null : Integer.valueOf(i), (r18 & 8) != 0 ? null : Integer.valueOf(i2), (r18 & 16) != 0 ? null : Integer.valueOf(coerceIn2), (r18 & 32) != 0 ? null : Integer.valueOf(newInBed), (r18 & 64) != 0 ? null : null);
        StringBuilder sb = new StringBuilder();
        String notes = entry.getNotes();
        if (notes != null) {
            if (StringsKt.isBlank(notes)) {
                notes = null;
            }
            if (notes != null) {
                sb.append(notes);
                sb.append(" · ");
            }
        }
        sb.append("wake time corrected");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Integer valueOf = Integer.valueOf(i);
        Integer num = valueOf.intValue() > 0 ? valueOf : null;
        Integer valueOf2 = Integer.valueOf(i2);
        Integer num2 = valueOf2.intValue() > 0 ? valueOf2 : null;
        Integer valueOf3 = Integer.valueOf(i3);
        Integer num3 = valueOf3.intValue() > 0 ? valueOf3 : null;
        Integer valueOf4 = Integer.valueOf(coerceAtLeast3);
        copy = entry.copy((r51 & 1) != 0 ? entry.id : 0L, (r51 & 2) != 0 ? entry.startTimeMs : 0L, (r51 & 4) != 0 ? entry.endTimeMs : newEndMs, (r51 & 8) != 0 ? entry.totalSleepMin : coerceIn, (r51 & 16) != 0 ? entry.deepSleepMin : num, (r51 & 32) != 0 ? entry.lightSleepMin : num2, (r51 & 64) != 0 ? entry.sleepEfficiency : Integer.valueOf(coerceIn2), (r51 & 128) != 0 ? entry.sleepQuality : Integer.valueOf(resolveQuality), (r51 & 256) != 0 ? entry.source : null, (r51 & 512) != 0 ? entry.notes : sb2, (r51 & 1024) != 0 ? entry.wakeMood : null, (r51 & 2048) != 0 ? entry.snoreEvents : null, (r51 & 4096) != 0 ? entry.awakeSleepMin : valueOf4.intValue() > 0 ? valueOf4 : null, (r51 & 8192) != 0 ? entry.restlessnessIndex : null, (r51 & 16384) != 0 ? entry.remSleepMin : num3, (r51 & 32768) != 0 ? entry.smartAlarmUsed : false, (r51 & 65536) != 0 ? entry.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? entry.scoreRoutine : Integer.valueOf(computeScorePillars.getRoutine()), (r51 & 262144) != 0 ? entry.scoreQualityPillar : Integer.valueOf(computeScorePillars.getQuality()), (r51 & 524288) != 0 ? entry.scoreDuration : Integer.valueOf(computeScorePillars.getDuration()), (r51 & 1048576) != 0 ? entry.hypnogramCompact : SleepHypnogramEncoder.INSTANCE.encodeForInBed(take, newInBed), (r51 & 2097152) != 0 ? entry.eventMarkersCompact : null, (r51 & 4194304) != 0 ? entry.stageConfidenceMean : null, (r51 & 8388608) != 0 ? entry.micCoverageRatio : null, (r51 & 16777216) != 0 ? entry.fusionSource : null, (r51 & 33554432) != 0 ? entry.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? entry.osaRiskHint : null, (r51 & 134217728) != 0 ? entry.sleepDebtHours : null, (r51 & 268435456) != 0 ? entry.consistencyScore : null, (r51 & 536870912) != 0 ? entry.sleepAnalyticsJson : null);
        return copy;
    }

    private final int inBedMinutes(SleepEntryEntity entry) {
        return RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
    }
}
