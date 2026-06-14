package com.example.rungps.core.domain.analytics;

import com.example.rungps.core.domain.gateway.StravaTrainingSession;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;

/* compiled from: HomeAnalyticsPort.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\bH¦@¢\u0006\u0002\u0010\u000bJÌ\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u00162L\u0010\u0017\u001aH\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u001eJ\u008c\u0001\u0010\u001f\u001a\u0004\u0018\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\u0010&\u001a\u0004\u0018\u00010\r2\b\u0010'\u001a\u0004\u0018\u00010\t2.\u0010(\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010)H¦@¢\u0006\u0002\u0010*J\u0086\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010,\u001a\u00020-2L\u0010\u0017\u001aH\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H¦@¢\u0006\u0002\u0010.¨\u0006/"}, d2 = {"Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "", "weeklyGymVolumeBars", "", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "sessions", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySession", "", "", "Lcom/example/rungps/data/GymSetEntity;", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "combinedLoad", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "gymSessions", "runs", "Lcom/example/rungps/data/RunEntity;", "soccer", "Lcom/example/rungps/data/SoccerSessionEntity;", "strava", "Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "sportLabel", "", "weekRunRideKm", "Lkotlin/Function5;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Pair;", "", "nowMs", "steps7d", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function5;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dailyReadiness", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "recovery", "Lcom/example/rungps/data/RecoveryEventEntity;", "gym", "sleep", "Lcom/example/rungps/data/SleepEntryEntity;", "load", "stepsToday", "filterValidRecovery", "Lkotlin/Function2;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "weekTrendKm", "isBike", "", "(Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HomeAnalyticsPort {
    Object combinedLoad(List<GymSessionEntity> list, Map<Long, ? extends List<GymSetEntity>> map, List<RunEntity> list2, List<SoccerSessionEntity> list3, List<StravaTrainingSession> list4, String str, Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function5, long j, long j2, Continuation<? super CombinedLoadSnapshot> continuation);

    Object dailyReadiness(List<RecoveryEventEntity> list, List<GymSessionEntity> list2, List<SleepEntryEntity> list3, List<SoccerSessionEntity> list4, CombinedLoadSnapshot combinedLoadSnapshot, Long l, Function2<? super List<RecoveryEventEntity>, ? super Continuation<? super List<RecoveryEventEntity>>, ? extends Object> function2, Continuation<? super DailyReadinessSnapshot> continuation);

    Object weekTrendKm(List<RunEntity> list, List<StravaTrainingSession> list2, boolean z, Function5<? super Long, ? super Long, ? super List<RunEntity>, ? super List<StravaTrainingSession>, ? super Continuation<? super Pair<Double, Double>>, ? extends Object> function5, Continuation<? super List<Double>> continuation);

    Object weeklyGymVolumeBars(List<GymSessionEntity> list, Map<Long, ? extends List<GymSetEntity>> map, Continuation<? super List<WeekVolumeBar>> continuation);

    /* compiled from: HomeAnalyticsPort.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object combinedLoad$default(HomeAnalyticsPort homeAnalyticsPort, List list, Map map, List list2, List list3, List list4, String str, Function5 function5, long j, long j2, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return homeAnalyticsPort.combinedLoad(list, map, list2, list3, list4, str, function5, (i & 128) != 0 ? System.currentTimeMillis() : j, (i & 256) != 0 ? 0L : j2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: combinedLoad");
        }
    }
}
