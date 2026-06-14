package com.example.rungps.core.domain.gateway;

import androidx.autofill.HintConstants;
import androidx.paging.PagingData;
import com.example.rungps.core.domain.model.GymVolumeHeatmap;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.data.StravaPbEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ExerciseTrackerGateway.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H&J\u000e\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\fJ8\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00190\u0004H¦@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H¦@¢\u0006\u0002\u0010\fJ\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J&\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H¦@¢\u0006\u0002\u0010!J>\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0010H¦@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u0003H&J.\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00040-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H¦@¢\u0006\u0002\u00100J\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002020-2\u0006\u00103\u001a\u00020\u000bH¦@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00103\u001a\u00020\u000bH¦@¢\u0006\u0002\u00104J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u00032\u0006\u00109\u001a\u00020\u000bH&J\u001c\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00040\u00032\u0006\u00109\u001a\u00020\u000bH&J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00040\u0003H&J\u0014\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00040\u0003H&J\u0010\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003H&J\u0018\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u0016\u0010C\u001a\u00020D2\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u0016\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\u0016\u0010G\u001a\u00020D2\u0006\u0010F\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010H\u001a\b\u0012\u0004\u0012\u0002080\u00042\f\u0010I\u001a\b\u0012\u0004\u0012\u0002080\u0004H¦@¢\u0006\u0002\u00100J\b\u0010J\u001a\u00020DH&J\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0004H¦@¢\u0006\u0002\u0010\fJF\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020L0\u0004H¦@¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020;H¦@¢\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020;H¦@¢\u0006\u0002\u0010UJ\u0016\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011¨\u0006Y"}, d2 = {"Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "", "runsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RunEntity;", "runsPagingFlow", "Landroidx/paging/PagingData;", "routesFlow", "Lcom/example/rungps/data/RouteEntity;", "dedupeSavedRoutes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRun", "", "runId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllRuns", "saveRoute", HintConstants.AUTOFILL_HINT_NAME, "", "distanceM", "", "latLon", "Lkotlin/Pair;", "(Ljava/lang/String;DLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allRoutesList", "deleteRoute", "routeId", "trimRun", "startTimeMs", "endTimeMs", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRunMetadata", "title", "description", "privateNotes", "gearId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reclassifyWatchRunToSoccer", "Lcom/example/rungps/core/domain/gateway/ReclassifyWatchResult;", "gymSessionsFlow", "Lcom/example/rungps/data/GymSessionEntity;", "setsForSessionsGrouped", "", "Lcom/example/rungps/data/GymSetEntity;", "sessionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gymVolumeByRegion", "", "days", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gymVolumeHeatmap", "Lcom/example/rungps/core/domain/model/GymVolumeHeatmap;", "recoveryRecentFlow", "Lcom/example/rungps/data/RecoveryEventEntity;", "limit", "sleepRecentFlow", "Lcom/example/rungps/data/SleepEntryEntity;", "soccerSessionsFlow", "Lcom/example/rungps/data/SoccerSessionEntity;", "stravaPbsFlow", "Lcom/example/rungps/data/StravaPbEntity;", "todayStepsFlow", "steps7dTotal", "nowMs", "runExists", "", "gymSessionExists", "sessionId", "soccerSessionExists", "filterValidRecoveryEvents", "events", "isStravaConnected", "stravaTrainingSessions", "Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "weekRunRideKm", "startMs", "endMs", "runs", "strava", "(JJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSleepEntry", "entry", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSleepEntry", "deleteSleepEntry", "id", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ExerciseTrackerGateway {
    Object addSleepEntry(SleepEntryEntity sleepEntryEntity, Continuation<? super Long> continuation);

    Object allRoutesList(Continuation<? super List<RouteEntity>> continuation);

    Object dedupeSavedRoutes(Continuation<? super Integer> continuation);

    Object deleteAllRuns(Continuation<? super Unit> continuation);

    Object deleteRoute(long j, Continuation<? super Unit> continuation);

    Object deleteRun(long j, Continuation<? super Unit> continuation);

    Object deleteSleepEntry(long j, Continuation<? super Unit> continuation);

    Object filterValidRecoveryEvents(List<RecoveryEventEntity> list, Continuation<? super List<RecoveryEventEntity>> continuation);

    Object gymSessionExists(long j, Continuation<? super Boolean> continuation);

    Flow<List<GymSessionEntity>> gymSessionsFlow();

    Object gymVolumeByRegion(int i, Continuation<? super Map<String, Float>> continuation);

    Object gymVolumeHeatmap(int i, Continuation<? super GymVolumeHeatmap> continuation);

    boolean isStravaConnected();

    Object reclassifyWatchRunToSoccer(long j, Continuation<? super ReclassifyWatchResult> continuation);

    Flow<List<RecoveryEventEntity>> recoveryRecentFlow(int limit);

    Flow<List<RouteEntity>> routesFlow();

    Object runExists(long j, Continuation<? super Boolean> continuation);

    Flow<List<RunEntity>> runsFlow();

    Flow<PagingData<RunEntity>> runsPagingFlow();

    Object saveRoute(String str, double d, List<Pair<Double, Double>> list, Continuation<? super Long> continuation);

    Object setsForSessionsGrouped(List<Long> list, Continuation<? super Map<Long, ? extends List<GymSetEntity>>> continuation);

    Flow<List<SleepEntryEntity>> sleepRecentFlow(int limit);

    Object soccerSessionExists(long j, Continuation<? super Boolean> continuation);

    Flow<List<SoccerSessionEntity>> soccerSessionsFlow();

    Object steps7dTotal(long j, Continuation<? super Long> continuation);

    Flow<List<StravaPbEntity>> stravaPbsFlow();

    Object stravaTrainingSessions(Continuation<? super List<StravaTrainingSession>> continuation);

    Flow<Long> todayStepsFlow();

    Object trimRun(long j, long j2, long j3, Continuation<? super Unit> continuation);

    Object updateRunMetadata(long j, String str, String str2, String str3, Long l, Continuation<? super Unit> continuation);

    Object updateSleepEntry(SleepEntryEntity sleepEntryEntity, Continuation<? super Unit> continuation);

    Object weekRunRideKm(long j, long j2, List<RunEntity> list, List<StravaTrainingSession> list2, Continuation<? super Pair<Double, Double>> continuation);

    /* compiled from: ExerciseTrackerGateway.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object steps7dTotal$default(ExerciseTrackerGateway exerciseTrackerGateway, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: steps7dTotal");
            }
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return exerciseTrackerGateway.steps7dTotal(j, continuation);
        }
    }
}
