package com.example.rungps.sleep;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepMlFeedbackApply.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u009c\u0001\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ#\u0010\u001c\u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u001fJ\u001e\u0010 \u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\""}, d2 = {"Lcom/example/rungps/sleep/SleepMlFeedbackApply;", "", "<init>", "()V", "applyToEntry", "Lcom/example/rungps/data/SleepEntryEntity;", "context", "Landroid/content/Context;", "entry", "kind", "Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistRebuilt", "labels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "inBedMin", "", "totalSleepMin", "deepMin", "lightMin", "remMin", "awakeMin", "efficiency", "quality", "pillars", "Lcom/example/rungps/health/SleepScoring$SleepScorePillars;", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;Ljava/util/List;ILcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/rungps/health/SleepScoring$SleepScorePillars;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adjustLabelsPublic", "", "", "adjustLabelsPublic$app_sideload", "adjustLabels", "Kind", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMlFeedbackApply {
    public static final int $stable = 0;
    public static final SleepMlFeedbackApply INSTANCE = new SleepMlFeedbackApply();

    /* compiled from: SleepMlFeedbackApply.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.LOOKS_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.TOO_AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.TOO_MUCH_DEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SleepStageLabel.values().length];
            try {
                iArr2[SleepStageLabel.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SleepStageLabel.DEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SleepStageLabel.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private SleepMlFeedbackApply() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepMlFeedbackApply.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "LOOKS_RIGHT", "TOO_AWAKE", "TOO_MUCH_DEEP", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind LOOKS_RIGHT = new Kind("LOOKS_RIGHT", 0);
        public static final Kind TOO_AWAKE = new Kind("TOO_AWAKE", 1);
        public static final Kind TOO_MUCH_DEEP = new Kind("TOO_MUCH_DEEP", 2);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{LOOKS_RIGHT, TOO_AWAKE, TOO_MUCH_DEEP};
        }

        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Kind(String str, int i) {
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0201 A[LOOP:0: B:19:0x01fb->B:21:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0244 A[LOOP:1: B:24:0x023e->B:26:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyToEntry(Context context, SleepEntryEntity sleepEntryEntity, Kind kind, Continuation<? super SleepEntryEntity> continuation) {
        SleepMlFeedbackApply$applyToEntry$1 sleepMlFeedbackApply$applyToEntry$1;
        int i;
        SleepEntryEntity sleepEntryEntity2;
        Kind kind2;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context2;
        int i6;
        List<SleepStageLabel> list;
        int i7;
        int i8;
        SleepMlFeedbackApply sleepMlFeedbackApply;
        Iterator it;
        Iterator it2;
        int resolveQuality;
        if (continuation instanceof SleepMlFeedbackApply$applyToEntry$1) {
            sleepMlFeedbackApply$applyToEntry$1 = (SleepMlFeedbackApply$applyToEntry$1) continuation;
            if ((sleepMlFeedbackApply$applyToEntry$1.label & Integer.MIN_VALUE) != 0) {
                sleepMlFeedbackApply$applyToEntry$1.label -= Integer.MIN_VALUE;
                SleepMlFeedbackApply$applyToEntry$1 sleepMlFeedbackApply$applyToEntry$12 = sleepMlFeedbackApply$applyToEntry$1;
                Object obj = sleepMlFeedbackApply$applyToEntry$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepMlFeedbackApply$applyToEntry$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i9 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
                    if (i9 == 1) {
                        SleepMlFeedback.INSTANCE.recordLooksRight(context);
                    } else if (i9 == 2) {
                        SleepMlFeedback.INSTANCE.recordTooMuchAwake(context);
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SleepMlFeedback.INSTANCE.recordTooMuchDeep(context);
                    }
                    if (kind == Kind.LOOKS_RIGHT && SleepEntryRepair.INSTANCE.needsRepair(sleepEntryEntity)) {
                        SleepEntryRepair sleepEntryRepair = SleepEntryRepair.INSTANCE;
                        sleepMlFeedbackApply$applyToEntry$12.label = 1;
                        obj = sleepEntryRepair.repairIfNeeded(context, sleepEntryEntity, kind, sleepMlFeedbackApply$applyToEntry$12);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    String hypnogramCompact = sleepEntryEntity.getHypnogramCompact();
                    String str = hypnogramCompact;
                    if (str == null || StringsKt.isBlank(str)) {
                        return null;
                    }
                    int coerceAtLeast = RangesKt.coerceAtLeast((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000), 1);
                    List<SleepStageLabel> mutableList = CollectionsKt.toMutableList((Collection) SleepHypnogramEncoder.INSTANCE.decode(hypnogramCompact));
                    if (mutableList.isEmpty()) {
                        return null;
                    }
                    if (mutableList.size() < coerceAtLeast / 4) {
                        List<SleepStageLabel> component1 = SleepOvernightReconciler.INSTANCE.rebuildForFeedback(sleepEntryEntity, kind).component1();
                        sleepMlFeedbackApply$applyToEntry$12.label = 2;
                        obj = persistRebuilt$default(this, context, sleepEntryEntity, component1, coerceAtLeast, kind, null, null, null, null, null, null, null, null, sleepMlFeedbackApply$applyToEntry$12, 8160, null);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    adjustLabels(mutableList, kind);
                    double d = coerceAtLeast;
                    double coerceAtLeast2 = RangesKt.coerceAtLeast(d / mutableList.size(), 1.0d);
                    Iterator<SleepStageLabel> it3 = mutableList.iterator();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (it3.hasNext()) {
                        SleepStageLabel next = it3.next();
                        Iterator<SleepStageLabel> it4 = it3;
                        double d2 = coerceAtLeast2;
                        int coerceAtLeast3 = RangesKt.coerceAtLeast(MathKt.roundToInt(coerceAtLeast2), 1);
                        int i13 = WhenMappings.$EnumSwitchMapping$1[next.ordinal()];
                        if (i13 != 1) {
                            if (i13 == 2) {
                                i11 += coerceAtLeast3;
                            } else if (i13 != 3) {
                                i12 += coerceAtLeast3;
                            } else {
                                i10 += coerceAtLeast3;
                            }
                        }
                        it3 = it4;
                        coerceAtLeast2 = d2;
                    }
                    int coerceIn = RangesKt.coerceIn(i11 + i12 + i10, 0, coerceAtLeast);
                    int coerceAtLeast4 = RangesKt.coerceAtLeast(coerceAtLeast - coerceIn, 0);
                    int i14 = i10;
                    int coerceIn2 = RangesKt.coerceIn((int) ((coerceIn * 100.0d) / d), 1, 100);
                    Repository repository = Repository.INSTANCE.get(context);
                    long startTimeMs = sleepEntryEntity.getStartTimeMs() - 1209600000;
                    sleepMlFeedbackApply$applyToEntry$12.L$0 = this;
                    sleepMlFeedbackApply$applyToEntry$12.L$1 = context;
                    sleepMlFeedbackApply$applyToEntry$12.L$2 = sleepEntryEntity;
                    sleepMlFeedbackApply$applyToEntry$12.L$3 = kind;
                    sleepMlFeedbackApply$applyToEntry$12.L$4 = mutableList;
                    sleepMlFeedbackApply$applyToEntry$12.I$0 = coerceAtLeast;
                    sleepMlFeedbackApply$applyToEntry$12.I$1 = coerceAtLeast4;
                    sleepMlFeedbackApply$applyToEntry$12.I$2 = i11;
                    sleepMlFeedbackApply$applyToEntry$12.I$3 = i12;
                    sleepMlFeedbackApply$applyToEntry$12.I$4 = i14;
                    sleepMlFeedbackApply$applyToEntry$12.I$5 = coerceIn;
                    sleepMlFeedbackApply$applyToEntry$12.I$6 = coerceIn2;
                    sleepMlFeedbackApply$applyToEntry$12.label = 3;
                    Object sleepSince = repository.sleepSince(startTimeMs, sleepMlFeedbackApply$applyToEntry$12);
                    if (sleepSince == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sleepEntryEntity2 = sleepEntryEntity;
                    kind2 = kind;
                    i2 = coerceAtLeast;
                    i3 = i11;
                    i4 = i12;
                    i5 = i14;
                    context2 = context;
                    i6 = coerceIn;
                    list = mutableList;
                    obj = sleepSince;
                    i7 = coerceIn2;
                    i8 = coerceAtLeast4;
                    sleepMlFeedbackApply = this;
                    ZoneId systemDefault = ZoneId.systemDefault();
                    List list2 = (List) obj;
                    Kind kind3 = kind2;
                    List<SleepStageLabel> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList4 = arrayList3;
                    SleepScoring sleepScoring = SleepScoring.INSTANCE;
                    Integer restlessnessIndex = sleepEntryEntity2.getRestlessnessIndex();
                    SleepScoring.SleepScorePillars computeScorePillars = sleepScoring.computeScorePillars(i6, i2, i7, restlessnessIndex == null ? restlessnessIndex.intValue() : 30, arrayList2, arrayList4);
                    resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity2.getSource(), i6, (r18 & 4) != 0 ? null : Boxing.boxInt(i3), (r18 & 8) != 0 ? null : Boxing.boxInt(i4), (r18 & 16) != 0 ? null : Boxing.boxInt(i7), (r18 & 32) != 0 ? null : Boxing.boxInt(i2), (r18 & 64) != 0 ? null : null);
                    Integer boxInt = Boxing.boxInt(i6);
                    Integer boxInt2 = Boxing.boxInt(i3);
                    Integer boxInt3 = Boxing.boxInt(i4);
                    Integer boxInt4 = Boxing.boxInt(i5);
                    Integer boxInt5 = Boxing.boxInt(i8);
                    Integer boxInt6 = Boxing.boxInt(i7);
                    Integer boxInt7 = Boxing.boxInt(resolveQuality);
                    sleepMlFeedbackApply$applyToEntry$12.L$0 = null;
                    sleepMlFeedbackApply$applyToEntry$12.L$1 = null;
                    sleepMlFeedbackApply$applyToEntry$12.L$2 = null;
                    sleepMlFeedbackApply$applyToEntry$12.L$3 = null;
                    sleepMlFeedbackApply$applyToEntry$12.L$4 = null;
                    sleepMlFeedbackApply$applyToEntry$12.label = 4;
                    obj = sleepMlFeedbackApply.persistRebuilt(context2, sleepEntryEntity2, list3, i2, kind3, boxInt, boxInt2, boxInt3, boxInt4, boxInt5, boxInt6, boxInt7, computeScorePillars, sleepMlFeedbackApply$applyToEntry$12);
                    if (obj != coroutine_suspended) {
                    }
                } else {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (i == 3) {
                        i7 = sleepMlFeedbackApply$applyToEntry$12.I$6;
                        i6 = sleepMlFeedbackApply$applyToEntry$12.I$5;
                        i5 = sleepMlFeedbackApply$applyToEntry$12.I$4;
                        i4 = sleepMlFeedbackApply$applyToEntry$12.I$3;
                        i3 = sleepMlFeedbackApply$applyToEntry$12.I$2;
                        int i15 = sleepMlFeedbackApply$applyToEntry$12.I$1;
                        int i16 = sleepMlFeedbackApply$applyToEntry$12.I$0;
                        List<SleepStageLabel> list4 = (List) sleepMlFeedbackApply$applyToEntry$12.L$4;
                        kind2 = (Kind) sleepMlFeedbackApply$applyToEntry$12.L$3;
                        sleepEntryEntity2 = (SleepEntryEntity) sleepMlFeedbackApply$applyToEntry$12.L$2;
                        context2 = (Context) sleepMlFeedbackApply$applyToEntry$12.L$1;
                        sleepMlFeedbackApply = (SleepMlFeedbackApply) sleepMlFeedbackApply$applyToEntry$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i16;
                        i8 = i15;
                        list = list4;
                        ZoneId systemDefault2 = ZoneId.systemDefault();
                        List list22 = (List) obj;
                        Kind kind32 = kind2;
                        List<SleepStageLabel> list32 = list;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                        it = list22.iterator();
                        while (it.hasNext()) {
                            ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(systemDefault2);
                            arrayList5.add(Boxing.boxInt((atZone.getHour() * 60) + atZone.getMinute()));
                        }
                        ArrayList arrayList22 = arrayList5;
                        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                        it2 = list22.iterator();
                        while (it2.hasNext()) {
                            ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(systemDefault2);
                            arrayList32.add(Boxing.boxInt((atZone2.getHour() * 60) + atZone2.getMinute()));
                        }
                        ArrayList arrayList42 = arrayList32;
                        SleepScoring sleepScoring2 = SleepScoring.INSTANCE;
                        Integer restlessnessIndex2 = sleepEntryEntity2.getRestlessnessIndex();
                        SleepScoring.SleepScorePillars computeScorePillars2 = sleepScoring2.computeScorePillars(i6, i2, i7, restlessnessIndex2 == null ? restlessnessIndex2.intValue() : 30, arrayList22, arrayList42);
                        resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity2.getSource(), i6, (r18 & 4) != 0 ? null : Boxing.boxInt(i3), (r18 & 8) != 0 ? null : Boxing.boxInt(i4), (r18 & 16) != 0 ? null : Boxing.boxInt(i7), (r18 & 32) != 0 ? null : Boxing.boxInt(i2), (r18 & 64) != 0 ? null : null);
                        Integer boxInt8 = Boxing.boxInt(i6);
                        Integer boxInt22 = Boxing.boxInt(i3);
                        Integer boxInt32 = Boxing.boxInt(i4);
                        Integer boxInt42 = Boxing.boxInt(i5);
                        Integer boxInt52 = Boxing.boxInt(i8);
                        Integer boxInt62 = Boxing.boxInt(i7);
                        Integer boxInt72 = Boxing.boxInt(resolveQuality);
                        sleepMlFeedbackApply$applyToEntry$12.L$0 = null;
                        sleepMlFeedbackApply$applyToEntry$12.L$1 = null;
                        sleepMlFeedbackApply$applyToEntry$12.L$2 = null;
                        sleepMlFeedbackApply$applyToEntry$12.L$3 = null;
                        sleepMlFeedbackApply$applyToEntry$12.L$4 = null;
                        sleepMlFeedbackApply$applyToEntry$12.label = 4;
                        obj = sleepMlFeedbackApply.persistRebuilt(context2, sleepEntryEntity2, list32, i2, kind32, boxInt8, boxInt22, boxInt32, boxInt42, boxInt52, boxInt62, boxInt72, computeScorePillars2, sleepMlFeedbackApply$applyToEntry$12);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                }
                return obj;
            }
        }
        sleepMlFeedbackApply$applyToEntry$1 = new SleepMlFeedbackApply$applyToEntry$1(this, continuation);
        SleepMlFeedbackApply$applyToEntry$1 sleepMlFeedbackApply$applyToEntry$122 = sleepMlFeedbackApply$applyToEntry$1;
        Object obj2 = sleepMlFeedbackApply$applyToEntry$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepMlFeedbackApply$applyToEntry$122.label;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c A[LOOP:0: B:17:0x0186->B:19:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ce A[LOOP:1: B:22:0x01c8->B:24:0x01ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x035f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistRebuilt(Context context, SleepEntryEntity sleepEntryEntity, List<? extends SleepStageLabel> list, int i, Kind kind, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, SleepScoring.SleepScorePillars sleepScorePillars, Continuation<? super SleepEntryEntity> continuation) {
        SleepMlFeedbackApply$persistRebuilt$1 sleepMlFeedbackApply$persistRebuilt$1;
        int i2;
        SleepEntryEntity sleepEntryEntity2;
        List<? extends SleepStageLabel> list2;
        Kind kind2;
        SleepScoring.SleepScorePillars sleepScorePillars2;
        Object obj;
        int i3;
        int i4;
        int i5;
        Integer num8;
        Integer num9;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num10;
        Repository repository;
        Integer num11;
        Iterator it;
        Iterator it2;
        int resolveQuality;
        Integer boxInt;
        String notes;
        SleepEntryEntity copy;
        if (continuation instanceof SleepMlFeedbackApply$persistRebuilt$1) {
            sleepMlFeedbackApply$persistRebuilt$1 = (SleepMlFeedbackApply$persistRebuilt$1) continuation;
            if ((sleepMlFeedbackApply$persistRebuilt$1.label & Integer.MIN_VALUE) != 0) {
                sleepMlFeedbackApply$persistRebuilt$1.label -= Integer.MIN_VALUE;
                Object obj2 = sleepMlFeedbackApply$persistRebuilt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sleepMlFeedbackApply$persistRebuilt$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    double d = i;
                    double coerceAtLeast = RangesKt.coerceAtLeast(d / RangesKt.coerceAtLeast(list.size(), 1), 1.0d);
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    for (SleepStageLabel sleepStageLabel : list) {
                        int coerceAtLeast2 = RangesKt.coerceAtLeast(MathKt.roundToInt(coerceAtLeast), 1);
                        int i13 = WhenMappings.$EnumSwitchMapping$1[sleepStageLabel.ordinal()];
                        if (i13 != 1) {
                            if (i13 == 2) {
                                i12 += coerceAtLeast2;
                            } else if (i13 != 3) {
                                i11 += coerceAtLeast2;
                            } else {
                                i10 += coerceAtLeast2;
                            }
                        }
                    }
                    int intValue = num != null ? num.intValue() : RangesKt.coerceIn(i12 + i11 + i10, 0, i);
                    int intValue2 = num5 != null ? num5.intValue() : RangesKt.coerceAtLeast(i - intValue, 0);
                    int intValue3 = num6 != null ? num6.intValue() : RangesKt.coerceIn((int) ((intValue * 100.0d) / d), 1, 100);
                    Repository repository2 = Repository.INSTANCE.get(context);
                    long startTimeMs = sleepEntryEntity.getStartTimeMs() - 1209600000;
                    sleepEntryEntity2 = sleepEntryEntity;
                    sleepMlFeedbackApply$persistRebuilt$1.L$0 = sleepEntryEntity2;
                    list2 = list;
                    sleepMlFeedbackApply$persistRebuilt$1.L$1 = list2;
                    kind2 = kind;
                    sleepMlFeedbackApply$persistRebuilt$1.L$2 = kind2;
                    sleepMlFeedbackApply$persistRebuilt$1.L$3 = num2;
                    sleepMlFeedbackApply$persistRebuilt$1.L$4 = num3;
                    sleepMlFeedbackApply$persistRebuilt$1.L$5 = num4;
                    sleepMlFeedbackApply$persistRebuilt$1.L$6 = num7;
                    sleepScorePillars2 = sleepScorePillars;
                    sleepMlFeedbackApply$persistRebuilt$1.L$7 = sleepScorePillars2;
                    sleepMlFeedbackApply$persistRebuilt$1.L$8 = repository2;
                    sleepMlFeedbackApply$persistRebuilt$1.I$0 = i;
                    sleepMlFeedbackApply$persistRebuilt$1.I$1 = i12;
                    sleepMlFeedbackApply$persistRebuilt$1.I$2 = i11;
                    sleepMlFeedbackApply$persistRebuilt$1.I$3 = i10;
                    sleepMlFeedbackApply$persistRebuilt$1.I$4 = intValue;
                    sleepMlFeedbackApply$persistRebuilt$1.I$5 = intValue2;
                    sleepMlFeedbackApply$persistRebuilt$1.I$6 = intValue3;
                    sleepMlFeedbackApply$persistRebuilt$1.label = 1;
                    Object sleepSince = repository2.sleepSince(startTimeMs, sleepMlFeedbackApply$persistRebuilt$1);
                    if (sleepSince == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = sleepSince;
                    i3 = intValue;
                    i4 = intValue2;
                    i5 = i12;
                    num8 = num3;
                    num9 = num4;
                    i6 = intValue3;
                    i7 = i10;
                    i8 = i11;
                    i9 = i;
                    num10 = num7;
                    repository = repository2;
                    num11 = num2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SleepEntryEntity sleepEntryEntity3 = (SleepEntryEntity) sleepMlFeedbackApply$persistRebuilt$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        return sleepEntryEntity3;
                    }
                    int i14 = sleepMlFeedbackApply$persistRebuilt$1.I$6;
                    int i15 = sleepMlFeedbackApply$persistRebuilt$1.I$5;
                    int i16 = sleepMlFeedbackApply$persistRebuilt$1.I$4;
                    int i17 = sleepMlFeedbackApply$persistRebuilt$1.I$3;
                    int i18 = sleepMlFeedbackApply$persistRebuilt$1.I$2;
                    int i19 = sleepMlFeedbackApply$persistRebuilt$1.I$1;
                    i9 = sleepMlFeedbackApply$persistRebuilt$1.I$0;
                    repository = (Repository) sleepMlFeedbackApply$persistRebuilt$1.L$8;
                    SleepScoring.SleepScorePillars sleepScorePillars3 = (SleepScoring.SleepScorePillars) sleepMlFeedbackApply$persistRebuilt$1.L$7;
                    Integer num12 = (Integer) sleepMlFeedbackApply$persistRebuilt$1.L$6;
                    Integer num13 = (Integer) sleepMlFeedbackApply$persistRebuilt$1.L$5;
                    Integer num14 = (Integer) sleepMlFeedbackApply$persistRebuilt$1.L$4;
                    num11 = (Integer) sleepMlFeedbackApply$persistRebuilt$1.L$3;
                    Kind kind3 = (Kind) sleepMlFeedbackApply$persistRebuilt$1.L$2;
                    List<? extends SleepStageLabel> list3 = (List) sleepMlFeedbackApply$persistRebuilt$1.L$1;
                    SleepEntryEntity sleepEntryEntity4 = (SleepEntryEntity) sleepMlFeedbackApply$persistRebuilt$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    i3 = i16;
                    i7 = i17;
                    i5 = i19;
                    sleepScorePillars2 = sleepScorePillars3;
                    i6 = i14;
                    i4 = i15;
                    i8 = i18;
                    num10 = num12;
                    sleepEntryEntity2 = sleepEntryEntity4;
                    obj = obj2;
                    num9 = num13;
                    num8 = num14;
                    kind2 = kind3;
                    list2 = list3;
                }
                int i20 = i8;
                ZoneId systemDefault = ZoneId.systemDefault();
                List list4 = (List) obj;
                Repository repository3 = repository;
                SleepMlFeedbackApply$persistRebuilt$1 sleepMlFeedbackApply$persistRebuilt$12 = sleepMlFeedbackApply$persistRebuilt$1;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(systemDefault);
                    arrayList.add(Boxing.boxInt((atZone.getHour() * 60) + atZone.getMinute()));
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(systemDefault);
                    arrayList3.add(Boxing.boxInt((atZone2.getHour() * 60) + atZone2.getMinute()));
                }
                ArrayList arrayList4 = arrayList3;
                if (sleepScorePillars2 == null) {
                    SleepScoring sleepScoring = SleepScoring.INSTANCE;
                    Integer restlessnessIndex = sleepEntryEntity2.getRestlessnessIndex();
                    sleepScorePillars2 = sleepScoring.computeScorePillars(i3, i9, i6, restlessnessIndex != null ? restlessnessIndex.intValue() : 30, arrayList2, arrayList4);
                }
                if (num10 == null) {
                    resolveQuality = num10.intValue();
                } else {
                    resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity2.getSource(), i3, (r18 & 4) != 0 ? null : Boxing.boxInt(num11 != null ? num11.intValue() : i5), (r18 & 8) != 0 ? null : Boxing.boxInt(num8 != null ? num8.intValue() : i20), (r18 & 16) != 0 ? null : Boxing.boxInt(i6), (r18 & 32) != 0 ? null : Boxing.boxInt(i9), (r18 & 64) != 0 ? null : null);
                }
                if (num11 != null) {
                    i5 = num11.intValue();
                }
                Integer boxInt2 = Boxing.boxInt(i5);
                Integer num15 = boxInt2.intValue() <= 0 ? boxInt2 : null;
                Integer boxInt3 = Boxing.boxInt(num8 == null ? num8.intValue() : i20);
                Integer num16 = boxInt3.intValue() <= 0 ? boxInt3 : null;
                Integer boxInt4 = Boxing.boxInt(num9 == null ? num9.intValue() : i7);
                Integer num17 = boxInt4.intValue() <= 0 ? boxInt4 : null;
                boxInt = Boxing.boxInt(i4);
                if (boxInt.intValue() <= 0) {
                    boxInt = null;
                }
                int routine = sleepScorePillars2.getRoutine();
                int quality = sleepScorePillars2.getQuality();
                int duration = sleepScorePillars2.getDuration();
                String encodeForInBed = SleepHypnogramEncoder.INSTANCE.encodeForInBed(list2, i9);
                notes = sleepEntryEntity2.getNotes();
                if (notes == null) {
                    notes = "";
                }
                String lowerCase = kind2.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                copy = sleepEntryEntity2.copy((r51 & 1) != 0 ? sleepEntryEntity2.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity2.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity2.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity2.totalSleepMin : i3, (r51 & 16) != 0 ? sleepEntryEntity2.deepSleepMin : num15, (r51 & 32) != 0 ? sleepEntryEntity2.lightSleepMin : num16, (r51 & 64) != 0 ? sleepEntryEntity2.sleepEfficiency : Boxing.boxInt(i6), (r51 & 128) != 0 ? sleepEntryEntity2.sleepQuality : Boxing.boxInt(resolveQuality), (r51 & 256) != 0 ? sleepEntryEntity2.source : null, (r51 & 512) != 0 ? sleepEntryEntity2.notes : notes + " · adjusted (" + lowerCase + ")", (r51 & 1024) != 0 ? sleepEntryEntity2.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity2.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity2.awakeSleepMin : boxInt, (r51 & 8192) != 0 ? sleepEntryEntity2.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity2.remSleepMin : num17, (r51 & 32768) != 0 ? sleepEntryEntity2.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity2.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity2.scoreRoutine : Boxing.boxInt(routine), (r51 & 262144) != 0 ? sleepEntryEntity2.scoreQualityPillar : Boxing.boxInt(quality), (r51 & 524288) != 0 ? sleepEntryEntity2.scoreDuration : Boxing.boxInt(duration), (r51 & 1048576) != 0 ? sleepEntryEntity2.hypnogramCompact : encodeForInBed, (r51 & 2097152) != 0 ? sleepEntryEntity2.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity2.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity2.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity2.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity2.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity2.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity2.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity2.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity2.sleepAnalyticsJson : null);
                sleepMlFeedbackApply$persistRebuilt$12.L$0 = copy;
                sleepMlFeedbackApply$persistRebuilt$12.L$1 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$2 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$3 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$4 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$5 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$6 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$7 = null;
                sleepMlFeedbackApply$persistRebuilt$12.L$8 = null;
                sleepMlFeedbackApply$persistRebuilt$12.label = 2;
                return repository3.updateSleepEntry(copy, sleepMlFeedbackApply$persistRebuilt$12) != coroutine_suspended ? coroutine_suspended : copy;
            }
        }
        sleepMlFeedbackApply$persistRebuilt$1 = new SleepMlFeedbackApply$persistRebuilt$1(this, continuation);
        Object obj22 = sleepMlFeedbackApply$persistRebuilt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sleepMlFeedbackApply$persistRebuilt$1.label;
        if (i2 != 0) {
        }
        int i202 = i8;
        ZoneId systemDefault2 = ZoneId.systemDefault();
        List list42 = (List) obj;
        Repository repository32 = repository;
        SleepMlFeedbackApply$persistRebuilt$1 sleepMlFeedbackApply$persistRebuilt$122 = sleepMlFeedbackApply$persistRebuilt$1;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
        it = list42.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = arrayList5;
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
        it2 = list42.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList42 = arrayList32;
        if (sleepScorePillars2 == null) {
        }
        if (num10 == null) {
        }
        if (num11 != null) {
        }
        Integer boxInt22 = Boxing.boxInt(i5);
        if (boxInt22.intValue() <= 0) {
        }
        Integer boxInt32 = Boxing.boxInt(num8 == null ? num8.intValue() : i202);
        if (boxInt32.intValue() <= 0) {
        }
        Integer boxInt42 = Boxing.boxInt(num9 == null ? num9.intValue() : i7);
        if (boxInt42.intValue() <= 0) {
        }
        boxInt = Boxing.boxInt(i4);
        if (boxInt.intValue() <= 0) {
        }
        int routine2 = sleepScorePillars2.getRoutine();
        int quality2 = sleepScorePillars2.getQuality();
        int duration2 = sleepScorePillars2.getDuration();
        String encodeForInBed2 = SleepHypnogramEncoder.INSTANCE.encodeForInBed(list2, i9);
        notes = sleepEntryEntity2.getNotes();
        if (notes == null) {
        }
        String lowerCase2 = kind2.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        copy = sleepEntryEntity2.copy((r51 & 1) != 0 ? sleepEntryEntity2.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity2.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity2.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity2.totalSleepMin : i3, (r51 & 16) != 0 ? sleepEntryEntity2.deepSleepMin : num15, (r51 & 32) != 0 ? sleepEntryEntity2.lightSleepMin : num16, (r51 & 64) != 0 ? sleepEntryEntity2.sleepEfficiency : Boxing.boxInt(i6), (r51 & 128) != 0 ? sleepEntryEntity2.sleepQuality : Boxing.boxInt(resolveQuality), (r51 & 256) != 0 ? sleepEntryEntity2.source : null, (r51 & 512) != 0 ? sleepEntryEntity2.notes : notes + " · adjusted (" + lowerCase2 + ")", (r51 & 1024) != 0 ? sleepEntryEntity2.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity2.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity2.awakeSleepMin : boxInt, (r51 & 8192) != 0 ? sleepEntryEntity2.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity2.remSleepMin : num17, (r51 & 32768) != 0 ? sleepEntryEntity2.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity2.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity2.scoreRoutine : Boxing.boxInt(routine2), (r51 & 262144) != 0 ? sleepEntryEntity2.scoreQualityPillar : Boxing.boxInt(quality2), (r51 & 524288) != 0 ? sleepEntryEntity2.scoreDuration : Boxing.boxInt(duration2), (r51 & 1048576) != 0 ? sleepEntryEntity2.hypnogramCompact : encodeForInBed2, (r51 & 2097152) != 0 ? sleepEntryEntity2.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity2.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity2.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity2.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity2.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity2.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity2.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity2.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity2.sleepAnalyticsJson : null);
        sleepMlFeedbackApply$persistRebuilt$122.L$0 = copy;
        sleepMlFeedbackApply$persistRebuilt$122.L$1 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$2 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$3 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$4 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$5 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$6 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$7 = null;
        sleepMlFeedbackApply$persistRebuilt$122.L$8 = null;
        sleepMlFeedbackApply$persistRebuilt$122.label = 2;
        if (repository32.updateSleepEntry(copy, sleepMlFeedbackApply$persistRebuilt$122) != coroutine_suspended2) {
        }
    }

    static /* synthetic */ Object persistRebuilt$default(SleepMlFeedbackApply sleepMlFeedbackApply, Context context, SleepEntryEntity sleepEntryEntity, List list, int i, Kind kind, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, SleepScoring.SleepScorePillars sleepScorePillars, Continuation continuation, int i2, Object obj) {
        return sleepMlFeedbackApply.persistRebuilt(context, sleepEntryEntity, list, i, kind, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? null : num5, (i2 & 1024) != 0 ? null : num6, (i2 & 2048) != 0 ? null : num7, (i2 & 4096) != 0 ? null : sleepScorePillars, continuation);
    }

    public final void adjustLabelsPublic$app_sideload(List<SleepStageLabel> labels, Kind kind) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(kind, "kind");
        adjustLabels(labels, kind);
    }

    private final void adjustLabels(List<SleepStageLabel> labels, Kind kind) {
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i != 1) {
            int i2 = 0;
            if (i == 2) {
                IntRange indices = CollectionsKt.getIndices(labels);
                ArrayList arrayList = new ArrayList();
                for (Integer num : indices) {
                    if (labels.get(num.intValue()) == SleepStageLabel.AWAKE) {
                        arrayList.add(num);
                    }
                }
                List shuffled = CollectionsKt.shuffled(arrayList);
                List<SleepStageLabel> list = labels;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((SleepStageLabel) it.next()) == SleepStageLabel.AWAKE && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                Iterator it2 = CollectionsKt.take(shuffled, RangesKt.coerceAtLeast((int) (i2 * 0.35d), 1)).iterator();
                while (it2.hasNext()) {
                    labels.set(((Number) it2.next()).intValue(), SleepStageLabel.LIGHT);
                }
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            IntRange indices2 = CollectionsKt.getIndices(labels);
            ArrayList arrayList2 = new ArrayList();
            for (Integer num2 : indices2) {
                if (labels.get(num2.intValue()) == SleepStageLabel.DEEP) {
                    arrayList2.add(num2);
                }
            }
            List shuffled2 = CollectionsKt.shuffled(arrayList2);
            List<SleepStageLabel> list2 = labels;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((SleepStageLabel) it3.next()) == SleepStageLabel.DEEP && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            Iterator it4 = CollectionsKt.take(shuffled2, RangesKt.coerceAtLeast((int) (i2 * 0.3d), 1)).iterator();
            while (it4.hasNext()) {
                labels.set(((Number) it4.next()).intValue(), SleepStageLabel.LIGHT);
            }
        }
    }
}
