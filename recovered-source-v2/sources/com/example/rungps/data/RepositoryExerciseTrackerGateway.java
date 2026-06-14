package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.paging.PagingData;
import com.example.rungps.analytics.MuscleVolumeHeatmap;
import com.example.rungps.analytics.WeeklyActivityKm;
import com.example.rungps.core.domain.analytics.CalendarWeekBounds;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.core.domain.gateway.ReclassifyWatchResult;
import com.example.rungps.core.domain.gateway.StravaTrainingSession;
import com.example.rungps.core.domain.model.GymVolumeHeatmap;
import com.example.rungps.data.WatchActivityReclassifier;
import com.example.rungps.recovery.StepLoadScore;
import com.example.rungps.tracking.ActivityTypes;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* compiled from: RepositoryExerciseTrackerGateway.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007H\u0016J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0010J8\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001d0\bH\u0096@¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J&\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010%J>\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010)\u001a\u0004\u0018\u00010\u00192\b\u0010*\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\b0\u0007H\u0016J.\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\b012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0096@¢\u0006\u0002\u00104J\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000206012\u0006\u00107\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u00108J\u0016\u00109\u001a\u00020:2\u0006\u00107\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u00108J\u001c\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010=\u001a\u00020\u000fH\u0016J\u001c\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\b0\u00072\u0006\u0010=\u001a\u00020\u000fH\u0016J\u0014\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\b0\u0007H\u0016J\u0014\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\b0\u0007H\u0016J\u0010\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0007H\u0016J\u0016\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010G\u001a\u00020H2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u0016\u0010K\u001a\u00020H2\u0006\u0010J\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010L\u001a\b\u0012\u0004\u0012\u00020<0\b2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020<0\bH\u0096@¢\u0006\u0002\u00104J\b\u0010N\u001a\u00020HH\u0016J\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\bH\u0096@¢\u0006\u0002\u0010\u0010JF\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00142\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020P0\bH\u0096@¢\u0006\u0002\u0010VJ\u0016\u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020?H\u0096@¢\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020\u00122\u0006\u0010X\u001a\u00020?H\u0096@¢\u0006\u0002\u0010YJ\u0016\u0010[\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\f\u0010]\u001a\u00020P*\u00020^H\u0002J\f\u0010_\u001a\u00020^*\u00020PH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/example/rungps/data/RepositoryExerciseTrackerGateway;", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "repository", "Lcom/example/rungps/data/Repository;", "<init>", "(Lcom/example/rungps/data/Repository;)V", "runsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RunEntity;", "runsPagingFlow", "Landroidx/paging/PagingData;", "routesFlow", "Lcom/example/rungps/data/RouteEntity;", "dedupeSavedRoutes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRun", "", "runId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllRuns", "saveRoute", HintConstants.AUTOFILL_HINT_NAME, "", "distanceM", "", "latLon", "Lkotlin/Pair;", "(Ljava/lang/String;DLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allRoutesList", "deleteRoute", "routeId", "trimRun", "startTimeMs", "endTimeMs", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRunMetadata", "title", "description", "privateNotes", "gearId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reclassifyWatchRunToSoccer", "Lcom/example/rungps/core/domain/gateway/ReclassifyWatchResult;", "gymSessionsFlow", "Lcom/example/rungps/data/GymSessionEntity;", "setsForSessionsGrouped", "", "Lcom/example/rungps/data/GymSetEntity;", "sessionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gymVolumeByRegion", "", "days", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gymVolumeHeatmap", "Lcom/example/rungps/core/domain/model/GymVolumeHeatmap;", "recoveryRecentFlow", "Lcom/example/rungps/data/RecoveryEventEntity;", "limit", "sleepRecentFlow", "Lcom/example/rungps/data/SleepEntryEntity;", "soccerSessionsFlow", "Lcom/example/rungps/data/SoccerSessionEntity;", "stravaPbsFlow", "Lcom/example/rungps/data/StravaPbEntity;", "todayStepsFlow", "steps7dTotal", "nowMs", "runExists", "", "gymSessionExists", "sessionId", "soccerSessionExists", "filterValidRecoveryEvents", "events", "isStravaConnected", "stravaTrainingSessions", "Lcom/example/rungps/core/domain/gateway/StravaTrainingSession;", "weekRunRideKm", "startMs", "endMs", "runs", "strava", "(JJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSleepEntry", "entry", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSleepEntry", "deleteSleepEntry", "id", "toDomain", "Lcom/example/rungps/analytics/WeeklyActivityKm$StravaSession;", "toAnalytics", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepositoryExerciseTrackerGateway implements ExerciseTrackerGateway {
    public static final int $stable = 8;
    private final Repository repository;

    public RepositoryExerciseTrackerGateway(Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<RunEntity>> runsFlow() {
        return this.repository.runsFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<PagingData<RunEntity>> runsPagingFlow() {
        return this.repository.runsPagingFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<RouteEntity>> routesFlow() {
        return this.repository.routesFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object dedupeSavedRoutes(Continuation<? super Integer> continuation) {
        return this.repository.dedupeSavedRoutes(continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object deleteRun(long j, Continuation<? super Unit> continuation) {
        Object deleteRun = this.repository.deleteRun(j, continuation);
        return deleteRun == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteRun : Unit.INSTANCE;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object deleteAllRuns(Continuation<? super Unit> continuation) {
        Object deleteAllRuns = this.repository.deleteAllRuns(continuation);
        return deleteAllRuns == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAllRuns : Unit.INSTANCE;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object saveRoute(String str, double d, List<Pair<Double, Double>> list, Continuation<? super Long> continuation) {
        return this.repository.saveRoute(str, d, list, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object allRoutesList(Continuation<? super List<RouteEntity>> continuation) {
        return this.repository.allRoutesList(continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object deleteRoute(long j, Continuation<? super Unit> continuation) {
        Object deleteRoute = this.repository.deleteRoute(j, continuation);
        return deleteRoute == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteRoute : Unit.INSTANCE;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object trimRun(long j, long j2, long j3, Continuation<? super Unit> continuation) {
        Object trimRun = this.repository.trimRun(j, j2, j3, continuation);
        return trimRun == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trimRun : Unit.INSTANCE;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object updateRunMetadata(long j, String str, String str2, String str3, Long l, Continuation<? super Unit> continuation) {
        Object updateRunMetadata = this.repository.updateRunMetadata(j, str, str2, str3, l, continuation);
        return updateRunMetadata == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateRunMetadata : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object reclassifyWatchRunToSoccer(long j, Continuation<? super ReclassifyWatchResult> continuation) {
        RepositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1 repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1;
        int i;
        WatchActivityReclassifier.Result result;
        if (continuation instanceof RepositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1) {
            repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1 = (RepositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1) continuation;
            if ((repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.label & Integer.MIN_VALUE) != 0) {
                repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = this.repository;
                    repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.label = 1;
                    obj = repository.reclassifyWatchRunToSoccer(j, repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                result = (WatchActivityReclassifier.Result) obj;
                if (!(result instanceof WatchActivityReclassifier.Result.Ok)) {
                    return new ReclassifyWatchResult.Ok(((WatchActivityReclassifier.Result.Ok) result).getMessage());
                }
                if (result instanceof WatchActivityReclassifier.Result.Err) {
                    return new ReclassifyWatchResult.Err(((WatchActivityReclassifier.Result.Err) result).getMessage());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1 = new RepositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1(this, continuation);
        Object obj2 = repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryExerciseTrackerGateway$reclassifyWatchRunToSoccer$1.label;
        if (i != 0) {
        }
        result = (WatchActivityReclassifier.Result) obj2;
        if (!(result instanceof WatchActivityReclassifier.Result.Ok)) {
        }
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<GymSessionEntity>> gymSessionsFlow() {
        return this.repository.gymSessionsFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object setsForSessionsGrouped(List<Long> list, Continuation<? super Map<Long, ? extends List<GymSetEntity>>> continuation) {
        return this.repository.setsForSessionsGrouped(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object gymVolumeByRegion(int i, Continuation<? super Map<String, Float>> continuation) {
        RepositoryExerciseTrackerGateway$gymVolumeByRegion$1 repositoryExerciseTrackerGateway$gymVolumeByRegion$1;
        int i2;
        if (continuation instanceof RepositoryExerciseTrackerGateway$gymVolumeByRegion$1) {
            repositoryExerciseTrackerGateway$gymVolumeByRegion$1 = (RepositoryExerciseTrackerGateway$gymVolumeByRegion$1) continuation;
            if ((repositoryExerciseTrackerGateway$gymVolumeByRegion$1.label & Integer.MIN_VALUE) != 0) {
                repositoryExerciseTrackerGateway$gymVolumeByRegion$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryExerciseTrackerGateway$gymVolumeByRegion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = repositoryExerciseTrackerGateway$gymVolumeByRegion$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = this.repository;
                    repositoryExerciseTrackerGateway$gymVolumeByRegion$1.label = 1;
                    obj = repository.gymVolumeHeatmap(i, repositoryExerciseTrackerGateway$gymVolumeByRegion$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((MuscleVolumeHeatmap) obj).getByRegion();
            }
        }
        repositoryExerciseTrackerGateway$gymVolumeByRegion$1 = new RepositoryExerciseTrackerGateway$gymVolumeByRegion$1(this, continuation);
        Object obj2 = repositoryExerciseTrackerGateway$gymVolumeByRegion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = repositoryExerciseTrackerGateway$gymVolumeByRegion$1.label;
        if (i2 != 0) {
        }
        return ((MuscleVolumeHeatmap) obj2).getByRegion();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object gymVolumeHeatmap(int i, Continuation<? super GymVolumeHeatmap> continuation) {
        RepositoryExerciseTrackerGateway$gymVolumeHeatmap$1 repositoryExerciseTrackerGateway$gymVolumeHeatmap$1;
        int i2;
        if (continuation instanceof RepositoryExerciseTrackerGateway$gymVolumeHeatmap$1) {
            repositoryExerciseTrackerGateway$gymVolumeHeatmap$1 = (RepositoryExerciseTrackerGateway$gymVolumeHeatmap$1) continuation;
            if ((repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.label & Integer.MIN_VALUE) != 0) {
                repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = this.repository;
                    repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.label = 1;
                    obj = repository.gymVolumeHeatmap(i, repositoryExerciseTrackerGateway$gymVolumeHeatmap$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MuscleVolumeHeatmap muscleVolumeHeatmap = (MuscleVolumeHeatmap) obj;
                return new GymVolumeHeatmap(muscleVolumeHeatmap.getByRegion(), muscleVolumeHeatmap.getByUserTag());
            }
        }
        repositoryExerciseTrackerGateway$gymVolumeHeatmap$1 = new RepositoryExerciseTrackerGateway$gymVolumeHeatmap$1(this, continuation);
        Object obj2 = repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = repositoryExerciseTrackerGateway$gymVolumeHeatmap$1.label;
        if (i2 != 0) {
        }
        MuscleVolumeHeatmap muscleVolumeHeatmap2 = (MuscleVolumeHeatmap) obj2;
        return new GymVolumeHeatmap(muscleVolumeHeatmap2.getByRegion(), muscleVolumeHeatmap2.getByUserTag());
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<RecoveryEventEntity>> recoveryRecentFlow(int limit) {
        return this.repository.recoveryRecentFlow(limit);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<SleepEntryEntity>> sleepRecentFlow(int limit) {
        return this.repository.sleepRecentFlow(limit);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<SoccerSessionEntity>> soccerSessionsFlow() {
        return this.repository.soccerSessionsFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<List<StravaPbEntity>> stravaPbsFlow() {
        return this.repository.stravaPbsFlow();
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Flow<Long> todayStepsFlow() {
        final Flow<DailyStepsEntity> dailyStepsFlow = this.repository.dailyStepsFlow(LocalDate.now(ZoneId.systemDefault()).toEpochDay());
        return new Flow<Long>() { // from class: com.example.rungps.data.RepositoryExerciseTrackerGateway$todayStepsFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.data.RepositoryExerciseTrackerGateway$todayStepsFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.data.RepositoryExerciseTrackerGateway$todayStepsFlow$$inlined$map$1$2", f = "RepositoryExerciseTrackerGateway.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.example.rungps.data.RepositoryExerciseTrackerGateway$todayStepsFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                                DailyStepsEntity dailyStepsEntity = (DailyStepsEntity) obj;
                                Long boxLong = dailyStepsEntity != null ? Boxing.boxLong(dailyStepsEntity.getSteps()) : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boxLong, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object steps7dTotal(long j, Continuation<? super Long> continuation) {
        RepositoryExerciseTrackerGateway$steps7dTotal$1 repositoryExerciseTrackerGateway$steps7dTotal$1;
        int i;
        long j2;
        StepLoadScore stepLoadScore;
        long j3;
        if (continuation instanceof RepositoryExerciseTrackerGateway$steps7dTotal$1) {
            repositoryExerciseTrackerGateway$steps7dTotal$1 = (RepositoryExerciseTrackerGateway$steps7dTotal$1) continuation;
            if ((repositoryExerciseTrackerGateway$steps7dTotal$1.label & Integer.MIN_VALUE) != 0) {
                repositoryExerciseTrackerGateway$steps7dTotal$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryExerciseTrackerGateway$steps7dTotal$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryExerciseTrackerGateway$steps7dTotal$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long weekStartMs$default = CalendarWeekBounds.weekStartMs$default(CalendarWeekBounds.INSTANCE, j, null, 2, null);
                    StepLoadScore stepLoadScore2 = StepLoadScore.INSTANCE;
                    Repository repository = this.repository;
                    repositoryExerciseTrackerGateway$steps7dTotal$1.L$0 = stepLoadScore2;
                    repositoryExerciseTrackerGateway$steps7dTotal$1.J$0 = j;
                    repositoryExerciseTrackerGateway$steps7dTotal$1.J$1 = weekStartMs$default;
                    repositoryExerciseTrackerGateway$steps7dTotal$1.label = 1;
                    Object dailyStepsSince = repository.dailyStepsSince(14, repositoryExerciseTrackerGateway$steps7dTotal$1);
                    if (dailyStepsSince == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = j;
                    stepLoadScore = stepLoadScore2;
                    j3 = weekStartMs$default;
                    obj = dailyStepsSince;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = repositoryExerciseTrackerGateway$steps7dTotal$1.J$1;
                    long j5 = repositoryExerciseTrackerGateway$steps7dTotal$1.J$0;
                    StepLoadScore stepLoadScore3 = (StepLoadScore) repositoryExerciseTrackerGateway$steps7dTotal$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j3 = j4;
                    stepLoadScore = stepLoadScore3;
                    j2 = j5;
                }
                return Boxing.boxLong(stepLoadScore.sumSteps7d((List) obj, j3, j2));
            }
        }
        repositoryExerciseTrackerGateway$steps7dTotal$1 = new RepositoryExerciseTrackerGateway$steps7dTotal$1(this, continuation);
        Object obj2 = repositoryExerciseTrackerGateway$steps7dTotal$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryExerciseTrackerGateway$steps7dTotal$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(stepLoadScore.sumSteps7d((List) obj2, j3, j2));
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object runExists(long j, Continuation<? super Boolean> continuation) {
        return this.repository.runExists(j, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object gymSessionExists(long j, Continuation<? super Boolean> continuation) {
        return this.repository.gymSessionExists(j, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object soccerSessionExists(long j, Continuation<? super Boolean> continuation) {
        return this.repository.soccerSessionExists(j, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object filterValidRecoveryEvents(List<RecoveryEventEntity> list, Continuation<? super List<RecoveryEventEntity>> continuation) {
        return this.repository.filterValidRecoveryEvents(list, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public boolean isStravaConnected() {
        return this.repository.isStravaConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stravaTrainingSessions(Continuation<? super List<StravaTrainingSession>> continuation) {
        RepositoryExerciseTrackerGateway$stravaTrainingSessions$1 repositoryExerciseTrackerGateway$stravaTrainingSessions$1;
        int i;
        Iterator it;
        if (continuation instanceof RepositoryExerciseTrackerGateway$stravaTrainingSessions$1) {
            repositoryExerciseTrackerGateway$stravaTrainingSessions$1 = (RepositoryExerciseTrackerGateway$stravaTrainingSessions$1) continuation;
            if ((repositoryExerciseTrackerGateway$stravaTrainingSessions$1.label & Integer.MIN_VALUE) != 0) {
                repositoryExerciseTrackerGateway$stravaTrainingSessions$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryExerciseTrackerGateway$stravaTrainingSessions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryExerciseTrackerGateway$stravaTrainingSessions$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = this.repository;
                    repositoryExerciseTrackerGateway$stravaTrainingSessions$1.L$0 = this;
                    repositoryExerciseTrackerGateway$stravaTrainingSessions$1.label = 1;
                    obj = Repository.stravaTrainingSessions$default(repository, 0, repositoryExerciseTrackerGateway$stravaTrainingSessions$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (RepositoryExerciseTrackerGateway) repositoryExerciseTrackerGateway$stravaTrainingSessions$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.toDomain((WeeklyActivityKm.StravaSession) it.next()));
                }
                return arrayList;
            }
        }
        repositoryExerciseTrackerGateway$stravaTrainingSessions$1 = new RepositoryExerciseTrackerGateway$stravaTrainingSessions$1(this, continuation);
        Object obj2 = repositoryExerciseTrackerGateway$stravaTrainingSessions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryExerciseTrackerGateway$stravaTrainingSessions$1.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object weekRunRideKm(long j, long j2, List<RunEntity> list, List<StravaTrainingSession> list2, Continuation<? super Pair<Double, Double>> continuation) {
        Repository repository = this.repository;
        List<StravaTrainingSession> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(toAnalytics((StravaTrainingSession) it.next()));
        }
        return repository.weekRunRideKm(j, j2, list, arrayList, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object addSleepEntry(SleepEntryEntity sleepEntryEntity, Continuation<? super Long> continuation) {
        return this.repository.addSleepEntry(sleepEntryEntity, continuation);
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object updateSleepEntry(SleepEntryEntity sleepEntryEntity, Continuation<? super Unit> continuation) {
        Object updateSleepEntry = this.repository.updateSleepEntry(sleepEntryEntity, continuation);
        return updateSleepEntry == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateSleepEntry : Unit.INSTANCE;
    }

    @Override // com.example.rungps.core.domain.gateway.ExerciseTrackerGateway
    public Object deleteSleepEntry(long j, Continuation<? super Unit> continuation) {
        Object deleteSleepEntry = this.repository.deleteSleepEntry(j, continuation);
        return deleteSleepEntry == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSleepEntry : Unit.INSTANCE;
    }

    private final StravaTrainingSession toDomain(WeeklyActivityKm.StravaSession stravaSession) {
        return new StravaTrainingSession(stravaSession.getStartMs(), stravaSession.getDistanceM(), stravaSession.isBike() ? ActivityTypes.BIKE : "RUN", Long.valueOf(stravaSession.getId()));
    }

    private final WeeklyActivityKm.StravaSession toAnalytics(StravaTrainingSession stravaTrainingSession) {
        Long stravaId = stravaTrainingSession.getStravaId();
        return new WeeklyActivityKm.StravaSession(stravaId != null ? stravaId.longValue() : 0L, stravaTrainingSession.getStartMs(), stravaTrainingSession.getStartMs() + OpenStreetMapTileProviderConstants.ONE_HOUR, stravaTrainingSession.getDistanceM(), StringsKt.equals(stravaTrainingSession.getActivityType(), ActivityTypes.BIKE, true));
    }
}
