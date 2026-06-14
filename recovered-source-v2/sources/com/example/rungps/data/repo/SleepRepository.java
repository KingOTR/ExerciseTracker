package com.example.rungps.data.repo;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.data.SleepDao;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepEntryValidator;
import com.example.rungps.sync.SleepFirestoreSync;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SleepRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0011J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002J$\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010&\u001a\u0004\u0018\u00010\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/rungps/data/repo/SleepRepository;", "", "sleepDao", "Lcom/example/rungps/data/SleepDao;", "<init>", "(Lcom/example/rungps/data/SleepDao;)V", "recentFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/SleepEntryEntity;", "limit", "", "add", "Lkotlin/Result;", "", "entry", "add-gIAlu-s", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeHealthConnectWithOvernight", "hc", "overnight", "since", "sinceMs", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sinceMerged", "delete", "", "id", "update", "mergeAndPreferBest", "raw", "zone", "Ljava/time/ZoneId;", "nightKey", "Ljava/time/LocalDate;", "e", "mergeSplitSleepsSameSource", "night", "pickPreferredNightEntry", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepRepository {
    public static final int $stable = 8;
    private final SleepDao sleepDao;

    public SleepRepository(SleepDao sleepDao) {
        Intrinsics.checkNotNullParameter(sleepDao, "sleepDao");
        this.sleepDao = sleepDao;
    }

    public static /* synthetic */ Flow recentFlow$default(SleepRepository sleepRepository, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 30;
        }
        return sleepRepository.recentFlow(i);
    }

    public final Flow<List<SleepEntryEntity>> recentFlow(int limit) {
        final Flow<List<SleepEntryEntity>> recentFlow = this.sleepDao.recentFlow(limit);
        return (Flow) new Flow<List<? extends SleepEntryEntity>>() { // from class: com.example.rungps.data.repo.SleepRepository$recentFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.data.repo.SleepRepository$recentFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SleepRepository this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.data.repo.SleepRepository$recentFlow$$inlined$map$1$2", f = "SleepRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.example.rungps.data.repo.SleepRepository$recentFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SleepRepository sleepRepository) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = sleepRepository;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List mergeAndPreferBest$default = SleepRepository.mergeAndPreferBest$default(this.this$0, (List) obj, null, 2, null);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(mergeAndPreferBest$default, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends SleepEntryEntity>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|161|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x032e, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0559, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0401, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x053d A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #1 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x0553, B:21:0x053d), top: B:7:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x050b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0327 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x03b9 -> B:48:0x0402). Please report as a decompilation issue!!! */
    /* renamed from: add-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6896addgIAlus(SleepEntryEntity sleepEntryEntity, Continuation<? super Result<Long>> continuation) {
        SleepRepository$add$1 sleepRepository$add$1;
        long j;
        SleepEntryEntity copy;
        long coerceAtLeast;
        SleepRepository$add$1 sleepRepository$add$12;
        SleepEntryEntity sleepEntryEntity2;
        boolean z;
        Object overlappingSessions;
        Object obj;
        List list;
        SleepEntryEntity sleepEntryEntity3;
        SleepEntryEntity sleepEntryEntity4;
        SleepRepository sleepRepository;
        SleepEntryEntity sleepEntryEntity5;
        Iterator it;
        Object next;
        Object obj2;
        Object obj3;
        SleepRepository sleepRepository2;
        SleepEntryEntity sleepEntryEntity6;
        SleepEntryEntity sleepEntryEntity7;
        SleepFirestoreSync sleepFirestoreSync;
        Object obj4;
        SleepEntryEntity sleepEntryEntity8;
        SleepRepository sleepRepository3;
        SleepEntryEntity sleepEntryEntity9;
        Object obj5;
        SleepRepository$add$1 sleepRepository$add$13;
        SleepRepository$add$1 sleepRepository$add$14;
        SleepEntryEntity sleepEntryEntity10;
        SleepRepository$add$1 sleepRepository$add$15;
        SleepEntryEntity copy2;
        Object upsert;
        Object obj6;
        SleepRepository$add$1 sleepRepository$add$16;
        SleepEntryEntity sleepEntryEntity11;
        SleepRepository sleepRepository4;
        SleepRepository$add$1 sleepRepository$add$17;
        SleepEntryEntity sleepEntryEntity12;
        SleepRepository sleepRepository5 = this;
        if (continuation instanceof SleepRepository$add$1) {
            sleepRepository$add$1 = (SleepRepository$add$1) continuation;
            if ((sleepRepository$add$1.label & Integer.MIN_VALUE) != 0) {
                sleepRepository$add$1.label -= Integer.MIN_VALUE;
                SleepRepository$add$1 sleepRepository$add$18 = sleepRepository$add$1;
                Object obj7 = sleepRepository$add$18.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                j = sleepRepository$add$18.label;
                switch (j) {
                    case 0:
                        ResultKt.throwOnFailure(obj7);
                        String validate = SleepEntryValidator.INSTANCE.validate(sleepEntryEntity);
                        if (validate != null) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException(validate)));
                        }
                        int coerceAtLeast2 = RangesKt.coerceAtLeast((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000), 1);
                        Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(sleepEntryEntity.getSleepEfficiency(), sleepEntryEntity.getTotalSleepMin(), coerceAtLeast2, sleepEntryEntity.getDeepSleepMin(), sleepEntryEntity.getLightSleepMin());
                        Integer sleepQuality = sleepEntryEntity.getSleepQuality();
                        copy = sleepEntryEntity.copy((r51 & 1) != 0 ? sleepEntryEntity.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity.totalSleepMin : 0, (r51 & 16) != 0 ? sleepEntryEntity.deepSleepMin : null, (r51 & 32) != 0 ? sleepEntryEntity.lightSleepMin : null, (r51 & 64) != 0 ? sleepEntryEntity.sleepEfficiency : resolveEfficiency, (r51 & 128) != 0 ? sleepEntryEntity.sleepQuality : Boxing.boxInt(sleepQuality != null ? sleepQuality.intValue() : SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity.getSource(), sleepEntryEntity.getTotalSleepMin(), sleepEntryEntity.getDeepSleepMin(), sleepEntryEntity.getLightSleepMin(), resolveEfficiency, Boxing.boxInt(coerceAtLeast2), null)), (r51 & 256) != 0 ? sleepEntryEntity.source : null, (r51 & 512) != 0 ? sleepEntryEntity.notes : null, (r51 & 1024) != 0 ? sleepEntryEntity.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity.awakeSleepMin : null, (r51 & 8192) != 0 ? sleepEntryEntity.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity.remSleepMin : null, (r51 & 32768) != 0 ? sleepEntryEntity.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity.scoreRoutine : null, (r51 & 262144) != 0 ? sleepEntryEntity.scoreQualityPillar : null, (r51 & 524288) != 0 ? sleepEntryEntity.scoreDuration : null, (r51 & 1048576) != 0 ? sleepEntryEntity.hypnogramCompact : null, (r51 & 2097152) != 0 ? sleepEntryEntity.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity.sleepAnalyticsJson : null);
                        coerceAtLeast = RangesKt.coerceAtLeast(copy.getEndTimeMs() - copy.getStartTimeMs(), 1L);
                        SleepDao sleepDao = sleepRepository5.sleepDao;
                        long startTimeMs = copy.getStartTimeMs();
                        long endTimeMs = copy.getEndTimeMs();
                        sleepRepository$add$12 = sleepRepository$add$18;
                        sleepRepository$add$12.L$0 = sleepRepository5;
                        sleepEntryEntity2 = sleepEntryEntity;
                        sleepRepository$add$12.L$1 = sleepEntryEntity2;
                        sleepRepository$add$12.L$2 = copy;
                        sleepRepository$add$12.J$0 = coerceAtLeast;
                        z = true;
                        sleepRepository$add$12.label = 1;
                        overlappingSessions = sleepDao.overlappingSessions(startTimeMs, endTimeMs, sleepRepository$add$12);
                        obj = coroutine_suspended;
                        if (overlappingSessions == obj) {
                            return obj;
                        }
                        List list2 = (List) overlappingSessions;
                        if (SleepScoring.INSTANCE.isOvernightSource(copy.getSource())) {
                            list = list2;
                            sleepEntryEntity3 = sleepEntryEntity2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj8 : list2) {
                                if (StringsKt.contains(((SleepEntryEntity) obj8).getSource(), "health_connect", z)) {
                                    arrayList.add(obj8);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    SleepEntryEntity sleepEntryEntity13 = (SleepEntryEntity) next;
                                    long max = Math.max(0L, Math.min(copy.getEndTimeMs(), sleepEntryEntity13.getEndTimeMs()) - Math.max(copy.getStartTimeMs(), sleepEntryEntity13.getStartTimeMs()));
                                    Object obj9 = next;
                                    while (true) {
                                        Object next2 = it2.next();
                                        SleepEntryEntity sleepEntryEntity14 = (SleepEntryEntity) next2;
                                        sleepEntryEntity3 = sleepEntryEntity2;
                                        list = list2;
                                        obj2 = obj;
                                        long max2 = Math.max(0L, Math.min(copy.getEndTimeMs(), sleepEntryEntity14.getEndTimeMs()) - Math.max(copy.getStartTimeMs(), sleepEntryEntity14.getStartTimeMs()));
                                        if (max < max2) {
                                            obj9 = next2;
                                            max = max2;
                                        }
                                        if (it2.hasNext()) {
                                            sleepEntryEntity2 = sleepEntryEntity3;
                                            list2 = list;
                                            obj = obj2;
                                        } else {
                                            next = obj9;
                                        }
                                    }
                                } else {
                                    list = list2;
                                    obj2 = obj;
                                    sleepEntryEntity3 = sleepEntryEntity2;
                                }
                            } else {
                                list = list2;
                                obj2 = obj;
                                sleepEntryEntity3 = sleepEntryEntity2;
                                next = null;
                            }
                            SleepEntryEntity sleepEntryEntity15 = (SleepEntryEntity) next;
                            if (sleepEntryEntity15 != null) {
                                long max3 = Math.max(0L, Math.min(copy.getEndTimeMs(), sleepEntryEntity15.getEndTimeMs()) - Math.max(copy.getStartTimeMs(), sleepEntryEntity15.getStartTimeMs()));
                                long j2 = max3 / 60000;
                                double min = Math.min(coerceAtLeast, RangesKt.coerceAtLeast(sleepEntryEntity15.getEndTimeMs() - sleepEntryEntity15.getStartTimeMs(), 1L)) > 0 ? max3 / Math.min(coerceAtLeast, r13) : 0.0d;
                                if (j2 >= 45 && min >= 0.52d) {
                                    SleepEntryEntity mergeHealthConnectWithOvernight = sleepRepository5.mergeHealthConnectWithOvernight(sleepEntryEntity15, copy);
                                    SleepDao sleepDao2 = sleepRepository5.sleepDao;
                                    sleepRepository$add$12.L$0 = sleepRepository5;
                                    sleepRepository$add$12.L$1 = sleepEntryEntity15;
                                    sleepRepository$add$12.L$2 = mergeHealthConnectWithOvernight;
                                    sleepRepository$add$12.label = 2;
                                    obj3 = obj2;
                                    if (sleepDao2.update(mergeHealthConnectWithOvernight, sleepRepository$add$12) == obj3) {
                                        return obj3;
                                    }
                                    sleepRepository2 = sleepRepository5;
                                    sleepEntryEntity6 = mergeHealthConnectWithOvernight;
                                    sleepEntryEntity7 = sleepEntryEntity15;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    SleepRepository sleepRepository6 = sleepRepository2;
                                    sleepFirestoreSync = SleepFirestoreSync.INSTANCE;
                                    sleepRepository$add$12.L$0 = sleepEntryEntity7;
                                    sleepRepository$add$12.L$1 = null;
                                    sleepRepository$add$12.L$2 = null;
                                    sleepRepository$add$12.label = 3;
                                    sleepRepository$add$18 = sleepEntryEntity7;
                                    if (sleepFirestoreSync.pushEntry(sleepEntryEntity6, sleepRepository$add$12) == obj3) {
                                        return obj3;
                                    }
                                    Result.m7905constructorimpl(Unit.INSTANCE);
                                    SleepEntryEntity sleepEntryEntity16 = sleepRepository$add$18;
                                    Result.Companion companion3 = Result.INSTANCE;
                                    return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity16.getId()));
                                }
                            }
                            obj = obj2;
                        }
                        sleepEntryEntity4 = sleepEntryEntity3;
                        sleepRepository = sleepRepository5;
                        sleepEntryEntity5 = copy;
                        sleepRepository$add$18 = sleepRepository$add$12;
                        it = list.iterator();
                        if (it.hasNext()) {
                            SleepEntryEntity sleepEntryEntity17 = (SleepEntryEntity) it.next();
                            SleepEntryEntity sleepEntryEntity18 = sleepEntryEntity4;
                            long max4 = Math.max(0L, Math.min(sleepEntryEntity5.getEndTimeMs(), sleepEntryEntity17.getEndTimeMs()) - Math.max(sleepEntryEntity5.getStartTimeMs(), sleepEntryEntity17.getStartTimeMs()));
                            long j3 = max4 / 60000;
                            Object obj10 = obj;
                            double min2 = Math.min(coerceAtLeast, RangesKt.coerceAtLeast(sleepEntryEntity17.getEndTimeMs() - sleepEntryEntity17.getStartTimeMs(), 1L));
                            if ((min2 > 0.0d ? max4 / min2 : 0.0d) >= 0.52d || j3 >= 45) {
                                int sourcePriority = SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity5.getSource());
                                int sourcePriority2 = SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity17.getSource());
                                if (sourcePriority < sourcePriority2) {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity17.getId()));
                                }
                                if (sourcePriority > sourcePriority2) {
                                    SleepDao sleepDao3 = sleepRepository.sleepDao;
                                    long id = sleepEntryEntity17.getId();
                                    sleepRepository$add$18.L$0 = sleepRepository;
                                    sleepRepository$add$18.L$1 = sleepEntryEntity18;
                                    sleepRepository$add$18.L$2 = sleepEntryEntity5;
                                    sleepRepository$add$18.L$3 = it;
                                    sleepRepository$add$18.J$0 = coerceAtLeast;
                                    sleepRepository$add$18.label = 4;
                                    Object delete = sleepDao3.delete(id, sleepRepository$add$18);
                                    obj5 = obj10;
                                    if (delete == obj5) {
                                        return obj5;
                                    }
                                    sleepEntryEntity4 = sleepEntryEntity18;
                                } else {
                                    obj5 = obj10;
                                    Integer sleepQuality2 = sleepEntryEntity5.getSleepQuality();
                                    int intValue = sleepQuality2 != null ? sleepQuality2.intValue() : 0;
                                    Integer sleepQuality3 = sleepEntryEntity17.getSleepQuality();
                                    int intValue2 = sleepQuality3 != null ? sleepQuality3.intValue() : 0;
                                    if (intValue <= intValue2 && (intValue != intValue2 || sleepEntryEntity5.getTotalSleepMin() <= sleepEntryEntity17.getTotalSleepMin())) {
                                        Result.Companion companion5 = Result.INSTANCE;
                                        return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity17.getId()));
                                    }
                                    SleepDao sleepDao4 = sleepRepository.sleepDao;
                                    long id2 = sleepEntryEntity17.getId();
                                    sleepRepository$add$18.L$0 = sleepRepository;
                                    sleepRepository$add$18.L$1 = sleepEntryEntity18;
                                    sleepRepository$add$18.L$2 = sleepEntryEntity5;
                                    sleepRepository$add$18.L$3 = it;
                                    sleepRepository$add$18.J$0 = coerceAtLeast;
                                    sleepRepository$add$18.label = 5;
                                    if (sleepDao4.delete(id2, sleepRepository$add$18) == obj5) {
                                        return obj5;
                                    }
                                    sleepEntryEntity4 = sleepEntryEntity18;
                                }
                                obj = obj5;
                                sleepRepository$add$13 = sleepRepository$add$18;
                                sleepRepository$add$18 = sleepRepository$add$13;
                                if (it.hasNext()) {
                                    obj4 = obj;
                                    SleepEntryEntity sleepEntryEntity19 = sleepEntryEntity4;
                                    SleepDao sleepDao5 = sleepRepository.sleepDao;
                                    long startTimeMs2 = sleepEntryEntity19.getStartTimeMs();
                                    sleepRepository$add$18.L$0 = sleepRepository;
                                    sleepRepository$add$18.L$1 = sleepEntryEntity19;
                                    sleepRepository$add$18.L$2 = sleepEntryEntity5;
                                    sleepRepository$add$18.L$3 = null;
                                    sleepRepository$add$18.label = 6;
                                    obj7 = sleepDao5.byStartTime(startTimeMs2, sleepRepository$add$18);
                                    if (obj7 == obj4) {
                                        return obj4;
                                    }
                                    sleepEntryEntity8 = sleepEntryEntity5;
                                    sleepRepository3 = sleepRepository;
                                    sleepEntryEntity9 = sleepEntryEntity19;
                                    sleepRepository$add$14 = sleepRepository$add$18;
                                    sleepEntryEntity10 = (SleepEntryEntity) obj7;
                                    sleepRepository$add$15 = sleepRepository$add$14;
                                    if (sleepEntryEntity10 != null) {
                                        if (SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity8.getSource()) < SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity10.getSource())) {
                                            Result.Companion companion6 = Result.INSTANCE;
                                            return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity10.getId()));
                                        }
                                        SleepDao sleepDao6 = sleepRepository3.sleepDao;
                                        long id3 = sleepEntryEntity10.getId();
                                        sleepRepository$add$14.L$0 = sleepRepository3;
                                        sleepRepository$add$14.L$1 = sleepEntryEntity9;
                                        sleepRepository$add$14.L$2 = sleepEntryEntity8;
                                        sleepRepository$add$14.label = 7;
                                        Object delete2 = sleepDao6.delete(id3, sleepRepository$add$14);
                                        sleepRepository$add$15 = sleepRepository$add$14;
                                        if (delete2 == obj4) {
                                            return obj4;
                                        }
                                    }
                                    SleepEntryEntity sleepEntryEntity20 = sleepEntryEntity8;
                                    SleepEntryEntity sleepEntryEntity21 = sleepEntryEntity9;
                                    SleepDao sleepDao7 = sleepRepository3.sleepDao;
                                    copy2 = sleepEntryEntity20.copy((r51 & 1) != 0 ? sleepEntryEntity20.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity20.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity20.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity20.totalSleepMin : 0, (r51 & 16) != 0 ? sleepEntryEntity20.deepSleepMin : null, (r51 & 32) != 0 ? sleepEntryEntity20.lightSleepMin : null, (r51 & 64) != 0 ? sleepEntryEntity20.sleepEfficiency : null, (r51 & 128) != 0 ? sleepEntryEntity20.sleepQuality : null, (r51 & 256) != 0 ? sleepEntryEntity20.source : null, (r51 & 512) != 0 ? sleepEntryEntity20.notes : null, (r51 & 1024) != 0 ? sleepEntryEntity20.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity20.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity20.awakeSleepMin : null, (r51 & 8192) != 0 ? sleepEntryEntity20.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity20.remSleepMin : null, (r51 & 32768) != 0 ? sleepEntryEntity20.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity20.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity20.scoreRoutine : null, (r51 & 262144) != 0 ? sleepEntryEntity20.scoreQualityPillar : null, (r51 & 524288) != 0 ? sleepEntryEntity20.scoreDuration : null, (r51 & 1048576) != 0 ? sleepEntryEntity20.hypnogramCompact : null, (r51 & 2097152) != 0 ? sleepEntryEntity20.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity20.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity20.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity20.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity20.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity20.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity20.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity20.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity20.sleepAnalyticsJson : null);
                                    sleepRepository$add$15.L$0 = sleepRepository3;
                                    sleepRepository$add$15.L$1 = sleepEntryEntity21;
                                    sleepRepository$add$15.L$2 = null;
                                    sleepRepository$add$15.label = 8;
                                    upsert = sleepDao7.upsert(copy2, sleepRepository$add$15);
                                    if (upsert == obj4) {
                                        return obj4;
                                    }
                                    obj6 = upsert;
                                    sleepRepository$add$16 = sleepRepository$add$15;
                                    sleepEntryEntity11 = sleepEntryEntity21;
                                    sleepRepository4 = sleepRepository3;
                                    j = ((Number) obj6).longValue();
                                    if (j > 0) {
                                        SleepDao sleepDao8 = sleepRepository4.sleepDao;
                                        long startTimeMs3 = sleepEntryEntity11.getStartTimeMs();
                                        sleepRepository$add$16.L$0 = sleepRepository4;
                                        sleepRepository$add$16.L$1 = null;
                                        sleepRepository$add$16.J$0 = j;
                                        sleepRepository$add$16.label = 9;
                                        Object byStartTime = sleepDao8.byStartTime(startTimeMs3, sleepRepository$add$16);
                                        if (byStartTime == obj4) {
                                            return obj4;
                                        }
                                        SleepRepository$add$1 sleepRepository$add$19 = sleepRepository$add$16;
                                        obj7 = byStartTime;
                                        sleepRepository$add$17 = sleepRepository$add$19;
                                        sleepEntryEntity12 = (SleepEntryEntity) obj7;
                                        if (sleepEntryEntity12 != null) {
                                            Result.Companion companion7 = Result.INSTANCE;
                                            SleepRepository sleepRepository7 = sleepRepository4;
                                            SleepFirestoreSync sleepFirestoreSync2 = SleepFirestoreSync.INSTANCE;
                                            sleepRepository$add$17.L$0 = null;
                                            sleepRepository$add$17.J$0 = j;
                                            sleepRepository$add$17.label = 10;
                                            if (sleepFirestoreSync2.pushEntry(sleepEntryEntity12, sleepRepository$add$17) == obj4) {
                                                return obj4;
                                            }
                                            Result.m7905constructorimpl(Unit.INSTANCE);
                                        }
                                    }
                                    Result.Companion companion8 = Result.INSTANCE;
                                    return Result.m7905constructorimpl(Boxing.boxLong(j));
                                }
                            } else {
                                sleepEntryEntity4 = sleepEntryEntity18;
                                obj = obj10;
                                sleepRepository$add$13 = sleepRepository$add$18;
                                sleepRepository$add$18 = sleepRepository$add$13;
                                if (it.hasNext()) {
                                }
                            }
                        }
                        break;
                    case 1:
                        long j4 = sleepRepository$add$18.J$0;
                        SleepEntryEntity sleepEntryEntity22 = (SleepEntryEntity) sleepRepository$add$18.L$2;
                        SleepEntryEntity sleepEntryEntity23 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        SleepRepository sleepRepository8 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        coerceAtLeast = j4;
                        obj = coroutine_suspended;
                        overlappingSessions = obj7;
                        sleepRepository$add$12 = sleepRepository$add$18;
                        copy = sleepEntryEntity22;
                        sleepRepository5 = sleepRepository8;
                        sleepEntryEntity2 = sleepEntryEntity23;
                        z = true;
                        List list22 = (List) overlappingSessions;
                        if (SleepScoring.INSTANCE.isOvernightSource(copy.getSource())) {
                        }
                        sleepEntryEntity4 = sleepEntryEntity3;
                        sleepRepository = sleepRepository5;
                        sleepEntryEntity5 = copy;
                        sleepRepository$add$18 = sleepRepository$add$12;
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 2:
                        sleepEntryEntity6 = (SleepEntryEntity) sleepRepository$add$18.L$2;
                        SleepEntryEntity sleepEntryEntity24 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        SleepRepository sleepRepository9 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        sleepRepository$add$12 = sleepRepository$add$18;
                        sleepEntryEntity7 = sleepEntryEntity24;
                        sleepRepository2 = sleepRepository9;
                        obj3 = coroutine_suspended;
                        Result.Companion companion22 = Result.INSTANCE;
                        SleepRepository sleepRepository62 = sleepRepository2;
                        sleepFirestoreSync = SleepFirestoreSync.INSTANCE;
                        sleepRepository$add$12.L$0 = sleepEntryEntity7;
                        sleepRepository$add$12.L$1 = null;
                        sleepRepository$add$12.L$2 = null;
                        sleepRepository$add$12.label = 3;
                        sleepRepository$add$18 = sleepEntryEntity7;
                        if (sleepFirestoreSync.pushEntry(sleepEntryEntity6, sleepRepository$add$12) == obj3) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        SleepEntryEntity sleepEntryEntity162 = sleepRepository$add$18;
                        Result.Companion companion32 = Result.INSTANCE;
                        return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity162.getId()));
                    case 3:
                        SleepEntryEntity sleepEntryEntity25 = (SleepEntryEntity) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        sleepRepository$add$18 = sleepEntryEntity25;
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        SleepEntryEntity sleepEntryEntity1622 = sleepRepository$add$18;
                        Result.Companion companion322 = Result.INSTANCE;
                        return Result.m7905constructorimpl(Boxing.boxLong(sleepEntryEntity1622.getId()));
                    case 4:
                    case 5:
                        long j5 = sleepRepository$add$18.J$0;
                        it = (Iterator) sleepRepository$add$18.L$3;
                        sleepEntryEntity5 = (SleepEntryEntity) sleepRepository$add$18.L$2;
                        sleepEntryEntity4 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        sleepRepository = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        coerceAtLeast = j5;
                        obj5 = coroutine_suspended;
                        obj = obj5;
                        sleepRepository$add$13 = sleepRepository$add$18;
                        sleepRepository$add$18 = sleepRepository$add$13;
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        sleepEntryEntity8 = (SleepEntryEntity) sleepRepository$add$18.L$2;
                        sleepEntryEntity9 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        sleepRepository3 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj4 = coroutine_suspended;
                        sleepRepository$add$14 = sleepRepository$add$18;
                        sleepEntryEntity10 = (SleepEntryEntity) obj7;
                        sleepRepository$add$15 = sleepRepository$add$14;
                        if (sleepEntryEntity10 != null) {
                        }
                        SleepEntryEntity sleepEntryEntity202 = sleepEntryEntity8;
                        SleepEntryEntity sleepEntryEntity212 = sleepEntryEntity9;
                        SleepDao sleepDao72 = sleepRepository3.sleepDao;
                        copy2 = sleepEntryEntity202.copy((r51 & 1) != 0 ? sleepEntryEntity202.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity202.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity202.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity202.totalSleepMin : 0, (r51 & 16) != 0 ? sleepEntryEntity202.deepSleepMin : null, (r51 & 32) != 0 ? sleepEntryEntity202.lightSleepMin : null, (r51 & 64) != 0 ? sleepEntryEntity202.sleepEfficiency : null, (r51 & 128) != 0 ? sleepEntryEntity202.sleepQuality : null, (r51 & 256) != 0 ? sleepEntryEntity202.source : null, (r51 & 512) != 0 ? sleepEntryEntity202.notes : null, (r51 & 1024) != 0 ? sleepEntryEntity202.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity202.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity202.awakeSleepMin : null, (r51 & 8192) != 0 ? sleepEntryEntity202.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity202.remSleepMin : null, (r51 & 32768) != 0 ? sleepEntryEntity202.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity202.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity202.scoreRoutine : null, (r51 & 262144) != 0 ? sleepEntryEntity202.scoreQualityPillar : null, (r51 & 524288) != 0 ? sleepEntryEntity202.scoreDuration : null, (r51 & 1048576) != 0 ? sleepEntryEntity202.hypnogramCompact : null, (r51 & 2097152) != 0 ? sleepEntryEntity202.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity202.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity202.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity202.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity202.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity202.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity202.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity202.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity202.sleepAnalyticsJson : null);
                        sleepRepository$add$15.L$0 = sleepRepository3;
                        sleepRepository$add$15.L$1 = sleepEntryEntity212;
                        sleepRepository$add$15.L$2 = null;
                        sleepRepository$add$15.label = 8;
                        upsert = sleepDao72.upsert(copy2, sleepRepository$add$15);
                        if (upsert == obj4) {
                        }
                        break;
                    case 7:
                        sleepEntryEntity8 = (SleepEntryEntity) sleepRepository$add$18.L$2;
                        sleepEntryEntity9 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        sleepRepository3 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj4 = coroutine_suspended;
                        sleepRepository$add$15 = sleepRepository$add$18;
                        SleepEntryEntity sleepEntryEntity2022 = sleepEntryEntity8;
                        SleepEntryEntity sleepEntryEntity2122 = sleepEntryEntity9;
                        SleepDao sleepDao722 = sleepRepository3.sleepDao;
                        copy2 = sleepEntryEntity2022.copy((r51 & 1) != 0 ? sleepEntryEntity2022.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity2022.startTimeMs : 0L, (r51 & 4) != 0 ? sleepEntryEntity2022.endTimeMs : 0L, (r51 & 8) != 0 ? sleepEntryEntity2022.totalSleepMin : 0, (r51 & 16) != 0 ? sleepEntryEntity2022.deepSleepMin : null, (r51 & 32) != 0 ? sleepEntryEntity2022.lightSleepMin : null, (r51 & 64) != 0 ? sleepEntryEntity2022.sleepEfficiency : null, (r51 & 128) != 0 ? sleepEntryEntity2022.sleepQuality : null, (r51 & 256) != 0 ? sleepEntryEntity2022.source : null, (r51 & 512) != 0 ? sleepEntryEntity2022.notes : null, (r51 & 1024) != 0 ? sleepEntryEntity2022.wakeMood : null, (r51 & 2048) != 0 ? sleepEntryEntity2022.snoreEvents : null, (r51 & 4096) != 0 ? sleepEntryEntity2022.awakeSleepMin : null, (r51 & 8192) != 0 ? sleepEntryEntity2022.restlessnessIndex : null, (r51 & 16384) != 0 ? sleepEntryEntity2022.remSleepMin : null, (r51 & 32768) != 0 ? sleepEntryEntity2022.smartAlarmUsed : false, (r51 & 65536) != 0 ? sleepEntryEntity2022.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? sleepEntryEntity2022.scoreRoutine : null, (r51 & 262144) != 0 ? sleepEntryEntity2022.scoreQualityPillar : null, (r51 & 524288) != 0 ? sleepEntryEntity2022.scoreDuration : null, (r51 & 1048576) != 0 ? sleepEntryEntity2022.hypnogramCompact : null, (r51 & 2097152) != 0 ? sleepEntryEntity2022.eventMarkersCompact : null, (r51 & 4194304) != 0 ? sleepEntryEntity2022.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity2022.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity2022.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity2022.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity2022.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity2022.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity2022.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity2022.sleepAnalyticsJson : null);
                        sleepRepository$add$15.L$0 = sleepRepository3;
                        sleepRepository$add$15.L$1 = sleepEntryEntity2122;
                        sleepRepository$add$15.L$2 = null;
                        sleepRepository$add$15.label = 8;
                        upsert = sleepDao722.upsert(copy2, sleepRepository$add$15);
                        if (upsert == obj4) {
                        }
                        break;
                    case 8:
                        SleepEntryEntity sleepEntryEntity26 = (SleepEntryEntity) sleepRepository$add$18.L$1;
                        SleepRepository sleepRepository10 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj4 = coroutine_suspended;
                        sleepEntryEntity11 = sleepEntryEntity26;
                        sleepRepository4 = sleepRepository10;
                        obj6 = obj7;
                        sleepRepository$add$16 = sleepRepository$add$18;
                        j = ((Number) obj6).longValue();
                        if (j > 0) {
                        }
                        Result.Companion companion82 = Result.INSTANCE;
                        return Result.m7905constructorimpl(Boxing.boxLong(j));
                    case 9:
                        j = sleepRepository$add$18.J$0;
                        sleepRepository4 = (SleepRepository) sleepRepository$add$18.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj4 = coroutine_suspended;
                        sleepRepository$add$17 = sleepRepository$add$18;
                        sleepEntryEntity12 = (SleepEntryEntity) obj7;
                        if (sleepEntryEntity12 != null) {
                        }
                        Result.Companion companion822 = Result.INSTANCE;
                        return Result.m7905constructorimpl(Boxing.boxLong(j));
                    case 10:
                        j = sleepRepository$add$18.J$0;
                        ResultKt.throwOnFailure(obj7);
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        Result.Companion companion8222 = Result.INSTANCE;
                        return Result.m7905constructorimpl(Boxing.boxLong(j));
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        sleepRepository$add$1 = new SleepRepository$add$1(sleepRepository5, continuation);
        SleepRepository$add$1 sleepRepository$add$182 = sleepRepository$add$1;
        Object obj72 = sleepRepository$add$182.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        j = sleepRepository$add$182.label;
        switch (j) {
        }
    }

    private final SleepEntryEntity mergeHealthConnectWithOvernight(SleepEntryEntity hc, SleepEntryEntity overnight) {
        SleepEntryEntity copy;
        long min = Math.min(hc.getStartTimeMs(), overnight.getStartTimeMs());
        long max = Math.max(hc.getEndTimeMs(), overnight.getEndTimeMs());
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{hc.getNotes(), overnight.getNotes()});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList), " · ", null, null, 0, null, null, 62, null);
        if (StringsKt.isBlank(joinToString$default)) {
            joinToString$default = overnight.getNotes();
        }
        copy = overnight.copy((r51 & 1) != 0 ? overnight.id : hc.getId(), (r51 & 2) != 0 ? overnight.startTimeMs : min, (r51 & 4) != 0 ? overnight.endTimeMs : max, (r51 & 8) != 0 ? overnight.totalSleepMin : 0, (r51 & 16) != 0 ? overnight.deepSleepMin : null, (r51 & 32) != 0 ? overnight.lightSleepMin : null, (r51 & 64) != 0 ? overnight.sleepEfficiency : null, (r51 & 128) != 0 ? overnight.sleepQuality : null, (r51 & 256) != 0 ? overnight.source : null, (r51 & 512) != 0 ? overnight.notes : joinToString$default, (r51 & 1024) != 0 ? overnight.wakeMood : null, (r51 & 2048) != 0 ? overnight.snoreEvents : null, (r51 & 4096) != 0 ? overnight.awakeSleepMin : null, (r51 & 8192) != 0 ? overnight.restlessnessIndex : null, (r51 & 16384) != 0 ? overnight.remSleepMin : null, (r51 & 32768) != 0 ? overnight.smartAlarmUsed : false, (r51 & 65536) != 0 ? overnight.timeToFallAsleepMin : null, (r51 & 131072) != 0 ? overnight.scoreRoutine : null, (r51 & 262144) != 0 ? overnight.scoreQualityPillar : null, (r51 & 524288) != 0 ? overnight.scoreDuration : null, (r51 & 1048576) != 0 ? overnight.hypnogramCompact : null, (r51 & 2097152) != 0 ? overnight.eventMarkersCompact : null, (r51 & 4194304) != 0 ? overnight.stageConfidenceMean : null, (r51 & 8388608) != 0 ? overnight.micCoverageRatio : null, (r51 & 16777216) != 0 ? overnight.fusionSource : null, (r51 & 33554432) != 0 ? overnight.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? overnight.osaRiskHint : null, (r51 & 134217728) != 0 ? overnight.sleepDebtHours : null, (r51 & 268435456) != 0 ? overnight.consistencyScore : null, (r51 & 536870912) != 0 ? overnight.sleepAnalyticsJson : null);
        return copy;
    }

    public final Object since(long j, Continuation<? super List<SleepEntryEntity>> continuation) {
        return this.sleepDao.since(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sinceMerged(long j, Continuation<? super List<SleepEntryEntity>> continuation) {
        SleepRepository$sinceMerged$1 sleepRepository$sinceMerged$1;
        int i;
        if (continuation instanceof SleepRepository$sinceMerged$1) {
            sleepRepository$sinceMerged$1 = (SleepRepository$sinceMerged$1) continuation;
            if ((sleepRepository$sinceMerged$1.label & Integer.MIN_VALUE) != 0) {
                sleepRepository$sinceMerged$1.label -= Integer.MIN_VALUE;
                Object obj = sleepRepository$sinceMerged$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepRepository$sinceMerged$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SleepDao sleepDao = this.sleepDao;
                    sleepRepository$sinceMerged$1.L$0 = this;
                    sleepRepository$sinceMerged$1.label = 1;
                    obj = sleepDao.since(j, sleepRepository$sinceMerged$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (SleepRepository) sleepRepository$sinceMerged$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return mergeAndPreferBest$default(this, (List) obj, null, 2, null);
            }
        }
        sleepRepository$sinceMerged$1 = new SleepRepository$sinceMerged$1(this, continuation);
        Object obj2 = sleepRepository$sinceMerged$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepRepository$sinceMerged$1.label;
        if (i != 0) {
        }
        return mergeAndPreferBest$default(this, (List) obj2, null, 2, null);
    }

    public final Object delete(long j, Continuation<? super Unit> continuation) {
        Object delete = this.sleepDao.delete(j, continuation);
        return delete == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delete : Unit.INSTANCE;
    }

    public final Object update(SleepEntryEntity sleepEntryEntity, Continuation<? super Unit> continuation) {
        String validate = SleepEntryValidator.INSTANCE.validate(sleepEntryEntity);
        if (validate != null) {
            throw new IllegalArgumentException(validate);
        }
        Object upsert = this.sleepDao.upsert(sleepEntryEntity, continuation);
        return upsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? upsert : Unit.INSTANCE;
    }

    static /* synthetic */ List mergeAndPreferBest$default(SleepRepository sleepRepository, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepRepository.mergeAndPreferBest(list, zoneId);
    }

    private final List<SleepEntryEntity> mergeAndPreferBest(List<SleepEntryEntity> raw, ZoneId zone) {
        if (raw.size() <= 1) {
            return raw;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : raw) {
            LocalDate nightKey = nightKey((SleepEntryEntity) obj, zone);
            Object obj2 = linkedHashMap.get(nightKey);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(nightKey, obj2);
            }
            ((List) obj2).add(obj);
        }
        Collection values = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            SleepEntryEntity pickPreferredNightEntry = pickPreferredNightEntry(mergeSplitSleepsSameSource((List) it.next(), zone));
            if (pickPreferredNightEntry != null) {
                arrayList.add(pickPreferredNightEntry);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.data.repo.SleepRepository$mergeAndPreferBest$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t2).getStartTimeMs()), Long.valueOf(((SleepEntryEntity) t).getStartTimeMs()));
            }
        });
    }

    private final LocalDate nightKey(SleepEntryEntity e, ZoneId zone) {
        LocalDate localDate = Instant.ofEpochMilli(e.getEndTimeMs()).atZone(zone).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    private final List<SleepEntryEntity> mergeSplitSleepsSameSource(List<SleepEntryEntity> night, ZoneId zone) {
        if (night.size() <= 1) {
            return night;
        }
        List sortedWith = CollectionsKt.sortedWith(night, new Comparator() { // from class: com.example.rungps.data.repo.SleepRepository$mergeSplitSleepsSameSource$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t).getStartTimeMs()), Long.valueOf(((SleepEntryEntity) t2).getStartTimeMs()));
            }
        });
        ArrayList arrayList = new ArrayList();
        r5 = (SleepEntryEntity) CollectionsKt.first(sortedWith);
        while (true) {
            SleepEntryEntity sleepEntryEntity = r5;
            for (SleepEntryEntity sleepEntryEntity2 : CollectionsKt.drop(sortedWith, 1)) {
                int startTimeMs = (int) ((sleepEntryEntity2.getStartTimeMs() - sleepEntryEntity.getEndTimeMs()) / 60000);
                boolean equals = StringsKt.equals(sleepEntryEntity.getSource(), sleepEntryEntity2.getSource(), true);
                boolean areEqual = Intrinsics.areEqual(nightKey(sleepEntryEntity, zone), nightKey(sleepEntryEntity2, zone));
                if (equals && areEqual && startTimeMs >= 0 && startTimeMs < 91) {
                    long min = Math.min(sleepEntryEntity.getStartTimeMs(), sleepEntryEntity2.getStartTimeMs());
                    long max = Math.max(sleepEntryEntity.getEndTimeMs(), sleepEntryEntity2.getEndTimeMs());
                    int coerceAtLeast = RangesKt.coerceAtLeast((int) ((max - min) / 60000), 1);
                    int coerceIn = RangesKt.coerceIn(sleepEntryEntity.getTotalSleepMin() + sleepEntryEntity2.getTotalSleepMin(), 0, coerceAtLeast);
                    Integer deepSleepMin = sleepEntryEntity.getDeepSleepMin();
                    int intValue = deepSleepMin != null ? deepSleepMin.intValue() : 0;
                    Integer deepSleepMin2 = sleepEntryEntity2.getDeepSleepMin();
                    int intValue2 = intValue + (deepSleepMin2 != null ? deepSleepMin2.intValue() : 0);
                    Integer lightSleepMin = sleepEntryEntity.getLightSleepMin();
                    int intValue3 = lightSleepMin != null ? lightSleepMin.intValue() : 0;
                    Integer lightSleepMin2 = sleepEntryEntity2.getLightSleepMin();
                    int intValue4 = intValue3 + (lightSleepMin2 != null ? lightSleepMin2.intValue() : 0);
                    Integer remSleepMin = sleepEntryEntity.getRemSleepMin();
                    int intValue5 = remSleepMin != null ? remSleepMin.intValue() : 0;
                    Integer remSleepMin2 = sleepEntryEntity2.getRemSleepMin();
                    int intValue6 = intValue5 + (remSleepMin2 != null ? remSleepMin2.intValue() : 0);
                    Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(null, coerceIn, coerceAtLeast, (sleepEntryEntity.getDeepSleepMin() == null && sleepEntryEntity2.getDeepSleepMin() == null) ? null : Integer.valueOf(intValue2), (sleepEntryEntity.getLightSleepMin() == null && sleepEntryEntity2.getLightSleepMin() == null) ? null : Integer.valueOf(intValue4));
                    int resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepEntryEntity.getSource(), coerceIn, (sleepEntryEntity.getDeepSleepMin() == null && sleepEntryEntity2.getDeepSleepMin() == null) ? null : Integer.valueOf(intValue2), (sleepEntryEntity.getLightSleepMin() == null && sleepEntryEntity2.getLightSleepMin() == null) ? null : Integer.valueOf(intValue4), resolveEfficiency, Integer.valueOf(coerceAtLeast), null);
                    Integer valueOf = (sleepEntryEntity.getDeepSleepMin() == null && sleepEntryEntity2.getDeepSleepMin() == null) ? null : Integer.valueOf(intValue2);
                    Integer valueOf2 = (sleepEntryEntity.getLightSleepMin() == null && sleepEntryEntity2.getLightSleepMin() == null) ? null : Integer.valueOf(intValue4);
                    Integer valueOf3 = (sleepEntryEntity.getRemSleepMin() == null && sleepEntryEntity2.getRemSleepMin() == null) ? null : Integer.valueOf(intValue6);
                    String hypnogramCompact = sleepEntryEntity.getHypnogramCompact();
                    if (hypnogramCompact == null) {
                        hypnogramCompact = sleepEntryEntity2.getHypnogramCompact();
                    }
                    String str = hypnogramCompact;
                    String eventMarkersCompact = sleepEntryEntity.getEventMarkersCompact();
                    if (eventMarkersCompact == null) {
                        eventMarkersCompact = sleepEntryEntity2.getEventMarkersCompact();
                    }
                    String str2 = eventMarkersCompact;
                    Integer wakeMood = sleepEntryEntity.getWakeMood();
                    if (wakeMood == null) {
                        wakeMood = sleepEntryEntity2.getWakeMood();
                    }
                    Integer num = wakeMood;
                    Integer snoreEvents = sleepEntryEntity.getSnoreEvents();
                    if (snoreEvents == null) {
                        snoreEvents = sleepEntryEntity2.getSnoreEvents();
                    }
                    Integer num2 = snoreEvents;
                    Integer awakeSleepMin = sleepEntryEntity.getAwakeSleepMin();
                    if (awakeSleepMin == null) {
                        awakeSleepMin = sleepEntryEntity2.getAwakeSleepMin();
                    }
                    Integer num3 = awakeSleepMin;
                    Integer restlessnessIndex = sleepEntryEntity.getRestlessnessIndex();
                    if (restlessnessIndex == null) {
                        restlessnessIndex = sleepEntryEntity2.getRestlessnessIndex();
                    }
                    Integer num4 = restlessnessIndex;
                    boolean z = sleepEntryEntity.getSmartAlarmUsed() || sleepEntryEntity2.getSmartAlarmUsed();
                    Integer timeToFallAsleepMin = sleepEntryEntity.getTimeToFallAsleepMin();
                    sleepEntryEntity = sleepEntryEntity.copy((r51 & 1) != 0 ? sleepEntryEntity.id : 0L, (r51 & 2) != 0 ? sleepEntryEntity.startTimeMs : min, (r51 & 4) != 0 ? sleepEntryEntity.endTimeMs : max, (r51 & 8) != 0 ? sleepEntryEntity.totalSleepMin : coerceIn, (r51 & 16) != 0 ? sleepEntryEntity.deepSleepMin : valueOf, (r51 & 32) != 0 ? sleepEntryEntity.lightSleepMin : valueOf2, (r51 & 64) != 0 ? sleepEntryEntity.sleepEfficiency : resolveEfficiency, (r51 & 128) != 0 ? sleepEntryEntity.sleepQuality : Integer.valueOf(resolveQuality), (r51 & 256) != 0 ? sleepEntryEntity.source : null, (r51 & 512) != 0 ? sleepEntryEntity.notes : null, (r51 & 1024) != 0 ? sleepEntryEntity.wakeMood : num, (r51 & 2048) != 0 ? sleepEntryEntity.snoreEvents : num2, (r51 & 4096) != 0 ? sleepEntryEntity.awakeSleepMin : num3, (r51 & 8192) != 0 ? sleepEntryEntity.restlessnessIndex : num4, (r51 & 16384) != 0 ? sleepEntryEntity.remSleepMin : valueOf3, (r51 & 32768) != 0 ? sleepEntryEntity.smartAlarmUsed : z, (r51 & 65536) != 0 ? sleepEntryEntity.timeToFallAsleepMin : timeToFallAsleepMin == null ? sleepEntryEntity2.getTimeToFallAsleepMin() : timeToFallAsleepMin, (r51 & 131072) != 0 ? sleepEntryEntity.scoreRoutine : null, (r51 & 262144) != 0 ? sleepEntryEntity.scoreQualityPillar : null, (r51 & 524288) != 0 ? sleepEntryEntity.scoreDuration : null, (r51 & 1048576) != 0 ? sleepEntryEntity.hypnogramCompact : str, (r51 & 2097152) != 0 ? sleepEntryEntity.eventMarkersCompact : str2, (r51 & 4194304) != 0 ? sleepEntryEntity.stageConfidenceMean : null, (r51 & 8388608) != 0 ? sleepEntryEntity.micCoverageRatio : null, (r51 & 16777216) != 0 ? sleepEntryEntity.fusionSource : null, (r51 & 33554432) != 0 ? sleepEntryEntity.breathRateMean : null, (r51 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? sleepEntryEntity.osaRiskHint : null, (r51 & 134217728) != 0 ? sleepEntryEntity.sleepDebtHours : null, (r51 & 268435456) != 0 ? sleepEntryEntity.consistencyScore : null, (r51 & 536870912) != 0 ? sleepEntryEntity.sleepAnalyticsJson : null);
                } else {
                    arrayList.add(sleepEntryEntity);
                }
            }
            arrayList.add(sleepEntryEntity);
            return arrayList;
        }
    }

    private final SleepEntryEntity pickPreferredNightEntry(List<SleepEntryEntity> night) {
        Object next;
        Object next2;
        Object obj = null;
        if (night.isEmpty()) {
            return null;
        }
        if (night.size() == 1) {
            return (SleepEntryEntity) CollectionsKt.first((List) night);
        }
        List<SleepEntryEntity> list = night;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (SleepScoring.INSTANCE.isSleepCycleSource(((SleepEntryEntity) obj2).getSource())) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int totalSleepMin = ((SleepEntryEntity) next).getTotalSleepMin();
                do {
                    Object next3 = it.next();
                    int totalSleepMin2 = ((SleepEntryEntity) next3).getTotalSleepMin();
                    if (totalSleepMin < totalSleepMin2) {
                        next = next3;
                        totalSleepMin = totalSleepMin2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!SleepScoring.INSTANCE.isSleepCycleSource(((SleepEntryEntity) obj3).getSource())) {
                arrayList2.add(obj3);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) next2;
                int sourcePriority = SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity2.getSource()) * 10000;
                Integer sleepQuality = sleepEntryEntity2.getSleepQuality();
                int intValue = sourcePriority + ((sleepQuality != null ? sleepQuality.intValue() : 0) * 10) + sleepEntryEntity2.getTotalSleepMin();
                do {
                    Object next4 = it2.next();
                    SleepEntryEntity sleepEntryEntity3 = (SleepEntryEntity) next4;
                    int sourcePriority2 = SleepScoring.INSTANCE.sourcePriority(sleepEntryEntity3.getSource()) * 10000;
                    Integer sleepQuality2 = sleepEntryEntity3.getSleepQuality();
                    int intValue2 = sourcePriority2 + ((sleepQuality2 != null ? sleepQuality2.intValue() : 0) * 10) + sleepEntryEntity3.getTotalSleepMin();
                    if (intValue < intValue2) {
                        next2 = next4;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        SleepEntryEntity sleepEntryEntity4 = (SleepEntryEntity) next2;
        if (sleepEntryEntity != null) {
            return (sleepEntryEntity.getTotalSleepMin() >= 90 || sleepEntryEntity4 == null || sleepEntryEntity4.getTotalSleepMin() < 180) ? sleepEntryEntity : sleepEntryEntity4;
        }
        if (sleepEntryEntity4 != null) {
            return sleepEntryEntity4;
        }
        Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                int totalSleepMin3 = ((SleepEntryEntity) obj).getTotalSleepMin();
                do {
                    Object next5 = it3.next();
                    int totalSleepMin4 = ((SleepEntryEntity) next5).getTotalSleepMin();
                    if (totalSleepMin3 < totalSleepMin4) {
                        obj = next5;
                        totalSleepMin3 = totalSleepMin4;
                    }
                } while (it3.hasNext());
            }
        }
        return (SleepEntryEntity) obj;
    }
}
