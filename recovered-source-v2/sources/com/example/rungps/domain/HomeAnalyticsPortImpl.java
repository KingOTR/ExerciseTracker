package com.example.rungps.domain;

import com.example.rungps.analytics.CombinedLoadScore;
import com.example.rungps.analytics.DailyReadinessScore;
import com.example.rungps.analytics.GymWeeklyVolume;
import com.example.rungps.analytics.WeeklyActivityKm;
import com.example.rungps.core.domain.analytics.CalendarWeekBounds;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.DailyReadinessSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.analytics.WeekVolumeBar;
import com.example.rungps.core.domain.gateway.StravaTrainingSession;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.DeloadPlanner;
import com.example.rungps.recovery.ReadinessInputs;
import com.example.rungps.recovery.ReadyToTrain;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* compiled from: HomeAnalyticsPortImpl.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\nH\u0096@¢\u0006\u0002\u0010\rJÈ\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\u0006\u0010\u0017\u001a\u00020\u00182L\u0010\u0019\u001aH\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010!J\u008c\u0001\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000b2.\u0010+\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0,H\u0096@¢\u0006\u0002\u0010-J\u0086\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\u0006\u0010/\u001a\u0002002L\u0010\u0019\u001aH\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001aH\u0096@¢\u0006\u0002\u00101¨\u00062"}, d2 = {"Lcom/example/rungps/domain/HomeAnalyticsPortImpl;", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "<init>", "()V", "weeklyGymVolumeBars", "", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "sessions", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySession", "", "", "Lcom/example/rungps/data/GymSetEntity;", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combinedLoad", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "gymSessions", "runs", "Lcom/example/rungps/data/RunEntity;", "soccer", "Lcom/example/rungps/data/SoccerSessionEntity;", "strava", "Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "sportLabel", "", "weekRunRideKm", "Lkotlin/Function5;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "", "", "nowMs", "steps7d", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function5;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dailyReadiness", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "recovery", "Lcom/example/rungps/data/RecoveryEventEntity;", "gym", "sleep", "Lcom/example/rungps/data/SleepEntryEntity;", "load", "stepsToday", "filterValidRecovery", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "weekTrendKm", "isBike", "", "(Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeAnalyticsPortImpl implements HomeAnalyticsPort {
    public static final int $stable = 0;

    @Override // com.example.rungps.core.domain.analytics.HomeAnalyticsPort
    public Object weeklyGymVolumeBars(List<GymSessionEntity> list, Map<Long, ? extends List<GymSetEntity>> map, Continuation<? super List<WeekVolumeBar>> continuation) {
        List<com.example.rungps.analytics.WeekVolumeBar> compute$default = GymWeeklyVolume.compute$default(GymWeeklyVolume.INSTANCE, list, map, null, 0, 12, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(compute$default, 10));
        for (com.example.rungps.analytics.WeekVolumeBar weekVolumeBar : compute$default) {
            arrayList.add(new WeekVolumeBar(weekVolumeBar.getWeekLabel(), weekVolumeBar.getTonnage(), weekVolumeBar.getSessionCount()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.example.rungps.core.domain.analytics.HomeAnalyticsPort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object combinedLoad(List<GymSessionEntity> list, Map<Long, ? extends List<GymSetEntity>> map, List<RunEntity> list2, List<SoccerSessionEntity> list3, List<StravaTrainingSession> list4, String str, Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function5, long j, long j2, Continuation<? super CombinedLoadSnapshot> continuation) {
        HomeAnalyticsPortImpl$combinedLoad$1 homeAnalyticsPortImpl$combinedLoad$1;
        int i;
        int soccerEffectiveMinutes7d;
        long j3;
        Object invoke;
        List<GymSessionEntity> list5;
        Map<Long, ? extends List<GymSetEntity>> map2;
        String str2;
        long j4;
        if (continuation instanceof HomeAnalyticsPortImpl$combinedLoad$1) {
            homeAnalyticsPortImpl$combinedLoad$1 = (HomeAnalyticsPortImpl$combinedLoad$1) continuation;
            if ((homeAnalyticsPortImpl$combinedLoad$1.label & Integer.MIN_VALUE) != 0) {
                homeAnalyticsPortImpl$combinedLoad$1.label -= Integer.MIN_VALUE;
                HomeAnalyticsPortImpl$combinedLoad$1 homeAnalyticsPortImpl$combinedLoad$12 = homeAnalyticsPortImpl$combinedLoad$1;
                Object obj = homeAnalyticsPortImpl$combinedLoad$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeAnalyticsPortImpl$combinedLoad$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long weekStartMs$default = CalendarWeekBounds.weekStartMs$default(CalendarWeekBounds.INSTANCE, j, null, 2, null);
                    soccerEffectiveMinutes7d = CombinedLoadScore.INSTANCE.soccerEffectiveMinutes7d(list3, weekStartMs$default, j);
                    Long boxLong = Boxing.boxLong(weekStartMs$default);
                    Long boxLong2 = Boxing.boxLong(j);
                    homeAnalyticsPortImpl$combinedLoad$12.L$0 = list;
                    homeAnalyticsPortImpl$combinedLoad$12.L$1 = map;
                    homeAnalyticsPortImpl$combinedLoad$12.L$2 = str;
                    homeAnalyticsPortImpl$combinedLoad$12.J$0 = j;
                    j3 = j2;
                    homeAnalyticsPortImpl$combinedLoad$12.J$1 = j3;
                    homeAnalyticsPortImpl$combinedLoad$12.I$0 = soccerEffectiveMinutes7d;
                    homeAnalyticsPortImpl$combinedLoad$12.label = 1;
                    invoke = function5.invoke(boxLong, boxLong2, list2, list4, homeAnalyticsPortImpl$combinedLoad$12);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list5 = list;
                    map2 = map;
                    str2 = str;
                    j4 = j;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = homeAnalyticsPortImpl$combinedLoad$12.I$0;
                    long j5 = homeAnalyticsPortImpl$combinedLoad$12.J$1;
                    j4 = homeAnalyticsPortImpl$combinedLoad$12.J$0;
                    str2 = (String) homeAnalyticsPortImpl$combinedLoad$12.L$2;
                    map2 = (Map) homeAnalyticsPortImpl$combinedLoad$12.L$1;
                    list5 = (List) homeAnalyticsPortImpl$combinedLoad$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    j3 = j5;
                    invoke = obj;
                    soccerEffectiveMinutes7d = i2;
                }
                Pair pair = (Pair) invoke;
                com.example.rungps.analytics.CombinedLoadSnapshot computeFromWeeklyKm = CombinedLoadScore.INSTANCE.computeFromWeeklyKm(((Number) pair.component1()).doubleValue(), ((Number) pair.component2()).doubleValue(), list5, map2, soccerEffectiveMinutes7d, str2, j4, j3);
                return new CombinedLoadSnapshot(computeFromWeeklyKm.getScore(), computeFromWeeklyKm.getRunKm7d(), computeFromWeeklyKm.getRideKm7d(), computeFromWeeklyKm.getGymTonnage7d(), computeFromWeeklyKm.getSoccerMin7d(), computeFromWeeklyKm.getLabel(), computeFromWeeklyKm.getDetail(), computeFromWeeklyKm.getRunShare(), computeFromWeeklyKm.getRideShare(), computeFromWeeklyKm.getGymShare(), computeFromWeeklyKm.getSoccerShare());
            }
        }
        homeAnalyticsPortImpl$combinedLoad$1 = new HomeAnalyticsPortImpl$combinedLoad$1(this, continuation);
        HomeAnalyticsPortImpl$combinedLoad$1 homeAnalyticsPortImpl$combinedLoad$122 = homeAnalyticsPortImpl$combinedLoad$1;
        Object obj2 = homeAnalyticsPortImpl$combinedLoad$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeAnalyticsPortImpl$combinedLoad$122.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) invoke;
        com.example.rungps.analytics.CombinedLoadSnapshot computeFromWeeklyKm2 = CombinedLoadScore.INSTANCE.computeFromWeeklyKm(((Number) pair2.component1()).doubleValue(), ((Number) pair2.component2()).doubleValue(), list5, map2, soccerEffectiveMinutes7d, str2, j4, j3);
        return new CombinedLoadSnapshot(computeFromWeeklyKm2.getScore(), computeFromWeeklyKm2.getRunKm7d(), computeFromWeeklyKm2.getRideKm7d(), computeFromWeeklyKm2.getGymTonnage7d(), computeFromWeeklyKm2.getSoccerMin7d(), computeFromWeeklyKm2.getLabel(), computeFromWeeklyKm2.getDetail(), computeFromWeeklyKm2.getRunShare(), computeFromWeeklyKm2.getRideShare(), computeFromWeeklyKm2.getGymShare(), computeFromWeeklyKm2.getSoccerShare());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.example.rungps.core.domain.analytics.HomeAnalyticsPort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dailyReadiness(List<RecoveryEventEntity> list, List<GymSessionEntity> list2, List<SleepEntryEntity> list3, List<SoccerSessionEntity> list4, CombinedLoadSnapshot combinedLoadSnapshot, Long l, Function2<? super List<RecoveryEventEntity>, ? super Continuation<? super List<RecoveryEventEntity>>, ? extends Object> function2, Continuation<? super DailyReadinessSnapshot> continuation) {
        HomeAnalyticsPortImpl$dailyReadiness$1 homeAnalyticsPortImpl$dailyReadiness$1;
        int i;
        Long l2;
        List<GymSessionEntity> list5;
        List<SleepEntryEntity> list6;
        CombinedLoadSnapshot combinedLoadSnapshot2;
        ArrayList arrayList;
        Iterator it;
        Long boxLong;
        Iterator it2;
        if (continuation instanceof HomeAnalyticsPortImpl$dailyReadiness$1) {
            homeAnalyticsPortImpl$dailyReadiness$1 = (HomeAnalyticsPortImpl$dailyReadiness$1) continuation;
            if ((homeAnalyticsPortImpl$dailyReadiness$1.label & Integer.MIN_VALUE) != 0) {
                homeAnalyticsPortImpl$dailyReadiness$1.label -= Integer.MIN_VALUE;
                Object obj = homeAnalyticsPortImpl$dailyReadiness$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeAnalyticsPortImpl$dailyReadiness$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ReadinessInputs readinessInputs = ReadinessInputs.INSTANCE;
                    homeAnalyticsPortImpl$dailyReadiness$1.L$0 = list2;
                    homeAnalyticsPortImpl$dailyReadiness$1.L$1 = list3;
                    homeAnalyticsPortImpl$dailyReadiness$1.L$2 = combinedLoadSnapshot;
                    l2 = l;
                    homeAnalyticsPortImpl$dailyReadiness$1.L$3 = l2;
                    homeAnalyticsPortImpl$dailyReadiness$1.label = 1;
                    obj = readinessInputs.filterRecoveryForDisplay(list, list4, function2, homeAnalyticsPortImpl$dailyReadiness$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list5 = list2;
                    list6 = list3;
                    combinedLoadSnapshot2 = combinedLoadSnapshot;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Long l3 = (Long) homeAnalyticsPortImpl$dailyReadiness$1.L$3;
                    combinedLoadSnapshot2 = (CombinedLoadSnapshot) homeAnalyticsPortImpl$dailyReadiness$1.L$2;
                    list6 = (List) homeAnalyticsPortImpl$dailyReadiness$1.L$1;
                    list5 = (List) homeAnalyticsPortImpl$dailyReadiness$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    l2 = l3;
                }
                List list7 = (List) obj;
                DeloadAdvice advise$default = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, list5, list7, 0L, 4, null);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list7) {
                    if (((RecoveryEventEntity) obj2).getEndsAtMs() > currentTimeMillis) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                arrayList = arrayList3;
                it = arrayList.iterator();
                if (it.hasNext()) {
                    boxLong = null;
                } else {
                    boxLong = Boxing.boxLong(((RecoveryEventEntity) it.next()).getEndsAtMs());
                    while (it.hasNext()) {
                        Long boxLong2 = Boxing.boxLong(((RecoveryEventEntity) it.next()).getEndsAtMs());
                        if (boxLong.compareTo(boxLong2) < 0) {
                            boxLong = boxLong2;
                        }
                    }
                }
                Long l4 = boxLong;
                long longValue = (l4 == null ? l4.longValue() : currentTimeMillis) - currentTimeMillis;
                ReadinessInputs.LastNight lastNightSleep$default = ReadinessInputs.lastNightSleep$default(ReadinessInputs.INSTANCE, list6, null, 2, null);
                int i2 = 0;
                if ((arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((RecoveryEventEntity) it2.next()).getKind(), "SOCCER") && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                com.example.rungps.analytics.DailyReadinessSnapshot compute = DailyReadinessScore.INSTANCE.compute(ReadyToTrain.INSTANCE.assess(longValue, arrayList3.size(), i2, advise$default, lastNightSleep$default.getQuality(), lastNightSleep$default.getTotalSleepMin(), l2), combinedLoadSnapshot2 != null ? new com.example.rungps.analytics.CombinedLoadSnapshot(combinedLoadSnapshot2.getScore(), combinedLoadSnapshot2.getRunKm7d(), combinedLoadSnapshot2.getRideKm7d(), combinedLoadSnapshot2.getGymTonnage7d(), combinedLoadSnapshot2.getSoccerMin7d(), combinedLoadSnapshot2.getLabel(), combinedLoadSnapshot2.getDetail(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 8064, null) : null, lastNightSleep$default.getQuality(), lastNightSleep$default.getTotalSleepMin(), l2);
                return new DailyReadinessSnapshot(compute.getScore(), compute.getHeadline(), compute.getDetail());
            }
        }
        homeAnalyticsPortImpl$dailyReadiness$1 = new HomeAnalyticsPortImpl$dailyReadiness$1(this, continuation);
        Object obj3 = homeAnalyticsPortImpl$dailyReadiness$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeAnalyticsPortImpl$dailyReadiness$1.label;
        if (i != 0) {
        }
        List list72 = (List) obj3;
        DeloadAdvice advise$default2 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, list5, list72, 0L, 4, null);
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList22 = new ArrayList();
        while (r0.hasNext()) {
        }
        ArrayList arrayList32 = arrayList22;
        arrayList = arrayList32;
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
        Long l42 = boxLong;
        long longValue2 = (l42 == null ? l42.longValue() : currentTimeMillis2) - currentTimeMillis2;
        ReadinessInputs.LastNight lastNightSleep$default2 = ReadinessInputs.lastNightSleep$default(ReadinessInputs.INSTANCE, list6, null, 2, null);
        int i22 = 0;
        if (arrayList instanceof Collection) {
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        com.example.rungps.analytics.DailyReadinessSnapshot compute2 = DailyReadinessScore.INSTANCE.compute(ReadyToTrain.INSTANCE.assess(longValue2, arrayList32.size(), i22, advise$default2, lastNightSleep$default2.getQuality(), lastNightSleep$default2.getTotalSleepMin(), l2), combinedLoadSnapshot2 != null ? new com.example.rungps.analytics.CombinedLoadSnapshot(combinedLoadSnapshot2.getScore(), combinedLoadSnapshot2.getRunKm7d(), combinedLoadSnapshot2.getRideKm7d(), combinedLoadSnapshot2.getGymTonnage7d(), combinedLoadSnapshot2.getSoccerMin7d(), combinedLoadSnapshot2.getLabel(), combinedLoadSnapshot2.getDetail(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 8064, null) : null, lastNightSleep$default2.getQuality(), lastNightSleep$default2.getTotalSleepMin(), l2);
        return new DailyReadinessSnapshot(compute2.getScore(), compute2.getHeadline(), compute2.getDetail());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x013b -> B:10:0x013e). Please report as a decompilation issue!!! */
    @Override // com.example.rungps.core.domain.analytics.HomeAnalyticsPort
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object weekTrendKm(List<RunEntity> list, List<StravaTrainingSession> list2, boolean z, Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function5, Continuation<? super List<Double>> continuation) {
        HomeAnalyticsPortImpl$weekTrendKm$1 homeAnalyticsPortImpl$weekTrendKm$1;
        int i;
        Iterator<Integer> it;
        HomeAnalyticsPortImpl$weekTrendKm$1 homeAnalyticsPortImpl$weekTrendKm$12;
        long j;
        ArrayList arrayList;
        List<RunEntity> list3;
        List<StravaTrainingSession> list4;
        boolean z2;
        Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function52;
        if (continuation instanceof HomeAnalyticsPortImpl$weekTrendKm$1) {
            homeAnalyticsPortImpl$weekTrendKm$1 = (HomeAnalyticsPortImpl$weekTrendKm$1) continuation;
            if ((homeAnalyticsPortImpl$weekTrendKm$1.label & Integer.MIN_VALUE) != 0) {
                homeAnalyticsPortImpl$weekTrendKm$1.label -= Integer.MIN_VALUE;
                Object obj = homeAnalyticsPortImpl$weekTrendKm$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = homeAnalyticsPortImpl$weekTrendKm$1.label;
                boolean z3 = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<StravaTrainingSession> list5 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (StravaTrainingSession stravaTrainingSession : list5) {
                        Long stravaId = stravaTrainingSession.getStravaId();
                        arrayList2.add(new WeeklyActivityKm.StravaSession(stravaId != null ? stravaId.longValue() : 0L, stravaTrainingSession.getStartMs(), stravaTrainingSession.getStartMs() + OpenStreetMapTileProviderConstants.ONE_HOUR, stravaTrainingSession.getDistanceM(), StringsKt.equals(stravaTrainingSession.getActivityType(), ActivityTypes.BIKE, z3)));
                        z3 = true;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    IntRange until = RangesKt.until(0, 4);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                    it = until.iterator();
                    homeAnalyticsPortImpl$weekTrendKm$12 = homeAnalyticsPortImpl$weekTrendKm$1;
                    j = currentTimeMillis;
                    arrayList = arrayList3;
                    list3 = list;
                    list4 = list2;
                    z2 = z;
                    function52 = function5;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = homeAnalyticsPortImpl$weekTrendKm$1.J$0;
                    z2 = homeAnalyticsPortImpl$weekTrendKm$1.Z$0;
                    Collection collection = (Collection) homeAnalyticsPortImpl$weekTrendKm$1.L$5;
                    Iterator<Integer> it2 = (Iterator) homeAnalyticsPortImpl$weekTrendKm$1.L$4;
                    ?? r9 = (Collection) homeAnalyticsPortImpl$weekTrendKm$1.L$3;
                    Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function53 = (Function5) homeAnalyticsPortImpl$weekTrendKm$1.L$2;
                    List<StravaTrainingSession> list6 = (List) homeAnalyticsPortImpl$weekTrendKm$1.L$1;
                    List<RunEntity> list7 = (List) homeAnalyticsPortImpl$weekTrendKm$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j = j2;
                    arrayList = r9;
                    homeAnalyticsPortImpl$weekTrendKm$12 = homeAnalyticsPortImpl$weekTrendKm$1;
                    function52 = function53;
                    list4 = list6;
                    Object obj2 = coroutine_suspended;
                    Iterator<Integer> it3 = it2;
                    Pair pair = (Pair) obj;
                    double doubleValue = ((Number) pair.component1()).doubleValue();
                    double doubleValue2 = ((Number) pair.component2()).doubleValue();
                    if (z2) {
                        doubleValue = doubleValue2;
                    }
                    collection.add(Boxing.boxDouble(doubleValue));
                    list3 = list7;
                    it = it3;
                    coroutine_suspended = obj2;
                    if (it.hasNext()) {
                        Object obj3 = coroutine_suspended;
                        it3 = it;
                        Pair weekBoundsForOffset$default = CalendarWeekBounds.weekBoundsForOffset$default(CalendarWeekBounds.INSTANCE, ((IntIterator) it).nextInt(), j, null, 4, null);
                        long longValue = ((Number) weekBoundsForOffset$default.component1()).longValue();
                        long longValue2 = ((Number) weekBoundsForOffset$default.component2()).longValue();
                        Long boxLong = Boxing.boxLong(longValue);
                        Long boxLong2 = Boxing.boxLong(longValue2);
                        homeAnalyticsPortImpl$weekTrendKm$12.L$0 = list3;
                        homeAnalyticsPortImpl$weekTrendKm$12.L$1 = list4;
                        homeAnalyticsPortImpl$weekTrendKm$12.L$2 = function52;
                        homeAnalyticsPortImpl$weekTrendKm$12.L$3 = arrayList;
                        homeAnalyticsPortImpl$weekTrendKm$12.L$4 = it3;
                        homeAnalyticsPortImpl$weekTrendKm$12.L$5 = arrayList;
                        homeAnalyticsPortImpl$weekTrendKm$12.Z$0 = z2;
                        homeAnalyticsPortImpl$weekTrendKm$12.J$0 = j;
                        homeAnalyticsPortImpl$weekTrendKm$12.label = 1;
                        Object invoke = function52.invoke(boxLong, boxLong2, list3, list4, homeAnalyticsPortImpl$weekTrendKm$12);
                        obj2 = obj3;
                        if (invoke == obj2) {
                            return obj2;
                        }
                        list7 = list3;
                        obj = invoke;
                        collection = arrayList;
                        Pair pair2 = (Pair) obj;
                        double doubleValue3 = ((Number) pair2.component1()).doubleValue();
                        double doubleValue22 = ((Number) pair2.component2()).doubleValue();
                        if (z2) {
                        }
                        collection.add(Boxing.boxDouble(doubleValue3));
                        list3 = list7;
                        it = it3;
                        coroutine_suspended = obj2;
                        if (it.hasNext()) {
                            return CollectionsKt.reversed(arrayList);
                        }
                    }
                }
            }
        }
        homeAnalyticsPortImpl$weekTrendKm$1 = new HomeAnalyticsPortImpl$weekTrendKm$1(this, continuation);
        Object obj4 = homeAnalyticsPortImpl$weekTrendKm$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = homeAnalyticsPortImpl$weekTrendKm$1.label;
        boolean z32 = true;
        if (i != 0) {
        }
    }
}
