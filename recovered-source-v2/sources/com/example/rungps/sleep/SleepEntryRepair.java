package com.example.rungps.sleep;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepEntryRepair.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J*\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ<\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/sleep/SleepEntryRepair;", "", "<init>", "()V", "needsRepair", "", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "repairIfNeeded", "context", "Landroid/content/Context;", "kind", "Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persist", "labels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "inBedMin", "", "noteSuffix", "", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;Ljava/util/List;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inBedMinutes", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepEntryRepair {
    public static final int $stable = 0;
    public static final SleepEntryRepair INSTANCE = new SleepEntryRepair();

    /* compiled from: SleepEntryRepair.kt */
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

    private SleepEntryRepair() {
    }

    public final boolean needsRepair(SleepEntryEntity entry) {
        int inBedMinutes;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!SleepScoring.INSTANCE.isOvernightSource(entry.getSource()) || (inBedMinutes = inBedMinutes(entry)) < 120) {
            return false;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(entry.getTotalSleepMin(), 0);
        double d = inBedMinutes * 0.2d;
        if (coerceAtLeast < d || SleepHypnogramEncoder.INSTANCE.decode(entry.getHypnogramCompact()).size() < inBedMinutes / 4) {
            return coerceAtLeast < d || SleepHypnogramEncoder.INSTANCE.decode(entry.getHypnogramCompact()).size() < inBedMinutes / 4;
        }
        return false;
    }

    public static /* synthetic */ Object repairIfNeeded$default(SleepEntryRepair sleepEntryRepair, Context context, SleepEntryEntity sleepEntryEntity, SleepMlFeedbackApply.Kind kind, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            kind = SleepMlFeedbackApply.Kind.LOOKS_RIGHT;
        }
        return sleepEntryRepair.repairIfNeeded(context, sleepEntryEntity, kind, continuation);
    }

    public final Object repairIfNeeded(Context context, SleepEntryEntity sleepEntryEntity, SleepMlFeedbackApply.Kind kind, Continuation<? super SleepEntryEntity> continuation) {
        if (!needsRepair(sleepEntryEntity)) {
            return null;
        }
        return persist(context, sleepEntryEntity, SleepOvernightReconciler.INSTANCE.rebuildForFeedback(sleepEntryEntity, kind).component1(), inBedMinutes(sleepEntryEntity), "auto-repaired sparse tracking", continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0133 A[LOOP:0: B:17:0x012d->B:19:0x0133, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171 A[LOOP:1: B:22:0x016b->B:24:0x0171, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persist(Context context, SleepEntryEntity sleepEntryEntity, List<? extends SleepStageLabel> list, int i, String str, Continuation<? super SleepEntryEntity> continuation) {
        SleepEntryRepair$persist$1 sleepEntryRepair$persist$1;
        int i2;
        Object sleepSince;
        int i3;
        int i4;
        int i5;
        int i6;
        List<? extends SleepStageLabel> list2;
        String str2;
        SleepEntryEntity sleepEntryEntity2;
        int i7;
        int i8;
        Repository repository;
        Iterator it;
        Iterator it2;
        int resolveQuality;
        String notes;
        Integer boxInt;
        SleepEntryEntity copy;
        int i9 = i;
        if (continuation instanceof SleepEntryRepair$persist$1) {
            sleepEntryRepair$persist$1 = (SleepEntryRepair$persist$1) continuation;
            if ((sleepEntryRepair$persist$1.label & Integer.MIN_VALUE) != 0) {
                sleepEntryRepair$persist$1.label -= Integer.MIN_VALUE;
                Object obj = sleepEntryRepair$persist$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sleepEntryRepair$persist$1.label;
                int i10 = 2;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    double d = i9;
                    double coerceAtLeast = RangesKt.coerceAtLeast(d / RangesKt.coerceAtLeast(list.size(), 1), 1.0d);
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    for (SleepStageLabel sleepStageLabel : list) {
                        int coerceAtLeast2 = RangesKt.coerceAtLeast(MathKt.roundToInt(coerceAtLeast), 1);
                        int i14 = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
                        if (i14 != 1) {
                            if (i14 == i10) {
                                i13 += coerceAtLeast2;
                            } else if (i14 != 3) {
                                i12 += coerceAtLeast2;
                            } else {
                                i11 += coerceAtLeast2;
                            }
                            i10 = 2;
                        }
                    }
                    int coerceIn = RangesKt.coerceIn(i13 + i12 + i11, 0, i9);
                    int coerceAtLeast3 = RangesKt.coerceAtLeast(i9 - coerceIn, 0);
                    int coerceIn2 = RangesKt.coerceIn((int) ((coerceIn * 100.0d) / d), 1, 100);
                    Repository repository2 = Repository.INSTANCE.get(context);
                    long startTimeMs = sleepEntryEntity.getStartTimeMs() - 1209600000;
                    sleepEntryRepair$persist$1.L$0 = sleepEntryEntity;
                    sleepEntryRepair$persist$1.L$1 = list;
                    sleepEntryRepair$persist$1.L$2 = str;
                    sleepEntryRepair$persist$1.L$3 = repository2;
                    sleepEntryRepair$persist$1.I$0 = i9;
                    sleepEntryRepair$persist$1.I$1 = i13;
                    sleepEntryRepair$persist$1.I$2 = i12;
                    sleepEntryRepair$persist$1.I$3 = i11;
                    sleepEntryRepair$persist$1.I$4 = coerceAtLeast3;
                    sleepEntryRepair$persist$1.I$5 = coerceIn;
                    sleepEntryRepair$persist$1.I$6 = coerceIn2;
                    sleepEntryRepair$persist$1.label = 1;
                    sleepSince = repository2.sleepSince(startTimeMs, sleepEntryRepair$persist$1);
                    if (sleepSince == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = coerceIn;
                    i4 = coerceIn2;
                    i5 = i12;
                    i6 = i13;
                    list2 = list;
                    str2 = str;
                    sleepEntryEntity2 = sleepEntryEntity;
                    i7 = i11;
                    i8 = coerceAtLeast3;
                    repository = repository2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SleepEntryEntity sleepEntryEntity3 = (SleepEntryEntity) sleepEntryRepair$persist$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return sleepEntryEntity3;
                    }
                    int i15 = sleepEntryRepair$persist$1.I$6;
                    int i16 = sleepEntryRepair$persist$1.I$5;
                    int i17 = sleepEntryRepair$persist$1.I$4;
                    int i18 = sleepEntryRepair$persist$1.I$3;
                    int i19 = sleepEntryRepair$persist$1.I$2;
                    int i20 = sleepEntryRepair$persist$1.I$1;
                    int i21 = sleepEntryRepair$persist$1.I$0;
                    Repository repository3 = (Repository) sleepEntryRepair$persist$1.L$3;
                    str2 = (String) sleepEntryRepair$persist$1.L$2;
                    list2 = (List) sleepEntryRepair$persist$1.L$1;
                    sleepEntryEntity2 = (SleepEntryEntity) sleepEntryRepair$persist$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i16;
                    i7 = i18;
                    i5 = i19;
                    i6 = i20;
                    i4 = i15;
                    i9 = i21;
                    repository = repository3;
                    i8 = i17;
                    sleepSince = obj;
                }
                ZoneId systemDefault = ZoneId.systemDefault();
                List list3 = (List) sleepSince;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(systemDefault);
                    arrayList.add(Boxing.boxInt((atZone.getHour() * 60) + atZone.getMinute()));
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(systemDefault);
                    arrayList3.add(Boxing.boxInt((atZone2.getHour() * 60) + atZone2.getMinute()));
                }
                ArrayList arrayList4 = arrayList3;
                SleepScoring sleepScoring = SleepScoring.INSTANCE;
                Integer restlessnessIndex = sleepEntryEntity2.getRestlessnessIndex();
                Repository repository4 = repository;
                SleepScoring.SleepScorePillars computeScorePillars = sleepScoring.computeScorePillars(i3, i9, i4, restlessnessIndex == null ? restlessnessIndex.intValue() : 30, arrayList2, arrayList4);
                resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity2.getSource(), i3, (r18 & 4) != 0 ? null : Boxing.boxInt(i6), (r18 & 8) != 0 ? null : Boxing.boxInt(i5), (r18 & 16) != 0 ? null : Boxing.boxInt(i4), (r18 & 32) != 0 ? null : Boxing.boxInt(i9), (r18 & 64) != 0 ? null : null);
                StringBuilder sb = new StringBuilder();
                notes = sleepEntryEntity2.getNotes();
                if (notes != null) {
                    if (StringsKt.isBlank(notes)) {
                        notes = null;
                    }
                    if (notes != null) {
                        sb.append(notes);
                        sb.append(" · ");
                    }
                }
                sb.append(str2);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                Integer boxInt2 = Boxing.boxInt(i6);
                Integer num = boxInt2.intValue() <= 0 ? boxInt2 : null;
                Integer boxInt3 = Boxing.boxInt(i5);
                Integer num2 = boxInt3.intValue() <= 0 ? boxInt3 : null;
                Integer boxInt4 = Boxing.boxInt(i7);
                Integer num3 = boxInt4.intValue() <= 0 ? boxInt4 : null;
                boxInt = Boxing.boxInt(i8);
                if (boxInt.intValue() <= 0) {
                    boxInt = null;
                }
                copy = sleepEntryEntity2.copy((r51 & 1) != 0 ? sleepEntryEntity2.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity2.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity2.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity2.totalSleepMin : i3, (r51 & 16) != 0 ? sleepEntryEntity2.deepSleepMin : num, (r51 & 32) != 0 ? sleepEntryEntity2.lightSleepMin : num2, (r51 & 64) != 0 ? sleepEntryEntity2.sleepEfficiency : Boxing.boxInt(i4), (r51 & 128) != 0 ? sleepEntryEntity2.sleepQuality : Boxing.boxInt(resolveQuality), (r51 & 256) != 0 ? sleepEntryEntity2.source : null, (r51 & 512) != 0 ? sleepEntryEntity2.notes : sb2, (r51 & 1024) != 0 ? sleepEntryEntity2.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity2.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity2.awakeSleepMin : boxInt, (r51 & 8192) != 0 ? sleepEntryEntity2.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity2.remSleepMin : num3, (r51 & 32768) != 0 ? sleepEntryEntity2.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity2.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity2.scoreRoutine : Boxing.boxInt(computeScorePillars.getRoutine()), (r51 & 262144) != 0 ? sleepEntryEntity2.scoreQualityPillar : Boxing.boxInt(computeScorePillars.getQuality()), (r51 & 524288) != 0 ? sleepEntryEntity2.scoreDuration : Boxing.boxInt(computeScorePillars.getDuration()), (r51 & 1048576) != 0 ? sleepEntryEntity2.hypnogramCompact : SleepHypnogramEncoder.INSTANCE.encodeForInBed(list2, i9), (r51 & 2097152) != 0 ? sleepEntryEntity2.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity2.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity2.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity2.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity2.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity2.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity2.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity2.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity2.sleepAnalyticsJson : null);
                sleepEntryRepair$persist$1.L$0 = copy;
                sleepEntryRepair$persist$1.L$1 = null;
                sleepEntryRepair$persist$1.L$2 = null;
                sleepEntryRepair$persist$1.L$3 = null;
                sleepEntryRepair$persist$1.label = 2;
                return repository4.updateSleepEntry(copy, sleepEntryRepair$persist$1) != coroutine_suspended ? coroutine_suspended : copy;
            }
        }
        sleepEntryRepair$persist$1 = new SleepEntryRepair$persist$1(this, continuation);
        Object obj2 = sleepEntryRepair$persist$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sleepEntryRepair$persist$1.label;
        int i102 = 2;
        if (i2 != 0) {
        }
        ZoneId systemDefault2 = ZoneId.systemDefault();
        List list32 = (List) sleepSince;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = arrayList5;
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
        it2 = list32.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList42 = arrayList32;
        SleepScoring sleepScoring2 = SleepScoring.INSTANCE;
        Integer restlessnessIndex2 = sleepEntryEntity2.getRestlessnessIndex();
        Repository repository42 = repository;
        SleepScoring.SleepScorePillars computeScorePillars2 = sleepScoring2.computeScorePillars(i3, i9, i4, restlessnessIndex2 == null ? restlessnessIndex2.intValue() : 30, arrayList22, arrayList42);
        resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity2.getSource(), i3, (r18 & 4) != 0 ? null : Boxing.boxInt(i6), (r18 & 8) != 0 ? null : Boxing.boxInt(i5), (r18 & 16) != 0 ? null : Boxing.boxInt(i4), (r18 & 32) != 0 ? null : Boxing.boxInt(i9), (r18 & 64) != 0 ? null : null);
        StringBuilder sb3 = new StringBuilder();
        notes = sleepEntryEntity2.getNotes();
        if (notes != null) {
        }
        sb3.append(str2);
        String sb22 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        Integer boxInt22 = Boxing.boxInt(i6);
        if (boxInt22.intValue() <= 0) {
        }
        Integer boxInt32 = Boxing.boxInt(i5);
        if (boxInt32.intValue() <= 0) {
        }
        Integer boxInt42 = Boxing.boxInt(i7);
        if (boxInt42.intValue() <= 0) {
        }
        boxInt = Boxing.boxInt(i8);
        if (boxInt.intValue() <= 0) {
        }
        copy = sleepEntryEntity2.copy((r51 & 1) != 0 ? sleepEntryEntity2.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity2.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity2.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity2.totalSleepMin : i3, (r51 & 16) != 0 ? sleepEntryEntity2.deepSleepMin : num, (r51 & 32) != 0 ? sleepEntryEntity2.lightSleepMin : num2, (r51 & 64) != 0 ? sleepEntryEntity2.sleepEfficiency : Boxing.boxInt(i4), (r51 & 128) != 0 ? sleepEntryEntity2.sleepQuality : Boxing.boxInt(resolveQuality), (r51 & 256) != 0 ? sleepEntryEntity2.source : null, (r51 & 512) != 0 ? sleepEntryEntity2.notes : sb22, (r51 & 1024) != 0 ? sleepEntryEntity2.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity2.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity2.awakeSleepMin : boxInt, (r51 & 8192) != 0 ? sleepEntryEntity2.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity2.remSleepMin : num3, (r51 & 32768) != 0 ? sleepEntryEntity2.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity2.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity2.scoreRoutine : Boxing.boxInt(computeScorePillars2.getRoutine()), (r51 & 262144) != 0 ? sleepEntryEntity2.scoreQualityPillar : Boxing.boxInt(computeScorePillars2.getQuality()), (r51 & 524288) != 0 ? sleepEntryEntity2.scoreDuration : Boxing.boxInt(computeScorePillars2.getDuration()), (r51 & 1048576) != 0 ? sleepEntryEntity2.hypnogramCompact : SleepHypnogramEncoder.INSTANCE.encodeForInBed(list2, i9), (r51 & 2097152) != 0 ? sleepEntryEntity2.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity2.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity2.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity2.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity2.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity2.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity2.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity2.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity2.sleepAnalyticsJson : null);
        sleepEntryRepair$persist$1.L$0 = copy;
        sleepEntryRepair$persist$1.L$1 = null;
        sleepEntryRepair$persist$1.L$2 = null;
        sleepEntryRepair$persist$1.L$3 = null;
        sleepEntryRepair$persist$1.label = 2;
        if (repository42.updateSleepEntry(copy, sleepEntryRepair$persist$1) != coroutine_suspended2) {
        }
    }

    private final int inBedMinutes(SleepEntryEntity entry) {
        return RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
    }
}
