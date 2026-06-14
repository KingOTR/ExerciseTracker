package com.example.rungps.core.domain;

import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.core.domain.usecase.AddSleepEntryUseCase;
import com.example.rungps.core.domain.usecase.DedupeSavedRoutesUseCase;
import com.example.rungps.core.domain.usecase.DeleteAllRunsUseCase;
import com.example.rungps.core.domain.usecase.DeleteRouteUseCase;
import com.example.rungps.core.domain.usecase.DeleteRunUseCase;
import com.example.rungps.core.domain.usecase.DeleteSleepEntryUseCase;
import com.example.rungps.core.domain.usecase.ListRoutesUseCase;
import com.example.rungps.core.domain.usecase.ObserveCombinedLoadUseCase;
import com.example.rungps.core.domain.usecase.ObserveDailyReadinessUseCase;
import com.example.rungps.core.domain.usecase.ObserveGymSessionsUseCase;
import com.example.rungps.core.domain.usecase.ObserveGymVolumeHeatmapUseCase;
import com.example.rungps.core.domain.usecase.ObserveGymVolumeRegionsUseCase;
import com.example.rungps.core.domain.usecase.ObserveRecentSleepUseCase;
import com.example.rungps.core.domain.usecase.ObserveRoutesUseCase;
import com.example.rungps.core.domain.usecase.ObserveRunKmTrend4wUseCase;
import com.example.rungps.core.domain.usecase.ObserveRunsPagedUseCase;
import com.example.rungps.core.domain.usecase.ObserveRunsUseCase;
import com.example.rungps.core.domain.usecase.ObserveWeeklyGymVolumeUseCase;
import com.example.rungps.core.domain.usecase.ReclassifyWatchRunToSoccerUseCase;
import com.example.rungps.core.domain.usecase.SaveRouteUseCase;
import com.example.rungps.core.domain.usecase.TrimRunUseCase;
import com.example.rungps.core.domain.usecase.UpdateSleepEntryUseCase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ExerciseTrackerUseCases.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020J¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010M\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020R¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020V¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0011\u0010Y\u001a\u00020Z¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0^X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010`\u001a\u00020a¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010d\u001a\u00020e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020e¢\u0006\b\n\u0000\u001a\u0004\bi\u0010g¨\u0006j"}, d2 = {"Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "homeAnalytics", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "sportLabel", "Lkotlin/Function0;", "", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;Lkotlin/jvm/functions/Function0;)V", "getGateway", "()Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "observeRuns", "Lcom/example/rungps/core/domain/usecase/ObserveRunsUseCase;", "getObserveRuns", "()Lcom/example/rungps/core/domain/usecase/ObserveRunsUseCase;", "observeRunsPaged", "Lcom/example/rungps/core/domain/usecase/ObserveRunsPagedUseCase;", "getObserveRunsPaged", "()Lcom/example/rungps/core/domain/usecase/ObserveRunsPagedUseCase;", "observeRoutes", "Lcom/example/rungps/core/domain/usecase/ObserveRoutesUseCase;", "getObserveRoutes", "()Lcom/example/rungps/core/domain/usecase/ObserveRoutesUseCase;", "dedupeSavedRoutes", "Lcom/example/rungps/core/domain/usecase/DedupeSavedRoutesUseCase;", "getDedupeSavedRoutes", "()Lcom/example/rungps/core/domain/usecase/DedupeSavedRoutesUseCase;", "deleteRun", "Lcom/example/rungps/core/domain/usecase/DeleteRunUseCase;", "getDeleteRun", "()Lcom/example/rungps/core/domain/usecase/DeleteRunUseCase;", "deleteAllRuns", "Lcom/example/rungps/core/domain/usecase/DeleteAllRunsUseCase;", "getDeleteAllRuns", "()Lcom/example/rungps/core/domain/usecase/DeleteAllRunsUseCase;", "saveRoute", "Lcom/example/rungps/core/domain/usecase/SaveRouteUseCase;", "getSaveRoute", "()Lcom/example/rungps/core/domain/usecase/SaveRouteUseCase;", "listRoutes", "Lcom/example/rungps/core/domain/usecase/ListRoutesUseCase;", "getListRoutes", "()Lcom/example/rungps/core/domain/usecase/ListRoutesUseCase;", "deleteRoute", "Lcom/example/rungps/core/domain/usecase/DeleteRouteUseCase;", "getDeleteRoute", "()Lcom/example/rungps/core/domain/usecase/DeleteRouteUseCase;", "trimRun", "Lcom/example/rungps/core/domain/usecase/TrimRunUseCase;", "getTrimRun", "()Lcom/example/rungps/core/domain/usecase/TrimRunUseCase;", "reclassifyWatchRunToSoccer", "Lcom/example/rungps/core/domain/usecase/ReclassifyWatchRunToSoccerUseCase;", "getReclassifyWatchRunToSoccer", "()Lcom/example/rungps/core/domain/usecase/ReclassifyWatchRunToSoccerUseCase;", "observeGymVolumeRegions", "Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeRegionsUseCase;", "getObserveGymVolumeRegions", "()Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeRegionsUseCase;", "observeGymVolumeHeatmap", "Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeHeatmapUseCase;", "getObserveGymVolumeHeatmap", "()Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeHeatmapUseCase;", "observeGymSessions", "Lcom/example/rungps/core/domain/usecase/ObserveGymSessionsUseCase;", "getObserveGymSessions", "()Lcom/example/rungps/core/domain/usecase/ObserveGymSessionsUseCase;", "observeRecentSleep", "Lcom/example/rungps/core/domain/usecase/ObserveRecentSleepUseCase;", "getObserveRecentSleep", "()Lcom/example/rungps/core/domain/usecase/ObserveRecentSleepUseCase;", "addSleepEntry", "Lcom/example/rungps/core/domain/usecase/AddSleepEntryUseCase;", "getAddSleepEntry", "()Lcom/example/rungps/core/domain/usecase/AddSleepEntryUseCase;", "updateSleepEntry", "Lcom/example/rungps/core/domain/usecase/UpdateSleepEntryUseCase;", "getUpdateSleepEntry", "()Lcom/example/rungps/core/domain/usecase/UpdateSleepEntryUseCase;", "deleteSleepEntry", "Lcom/example/rungps/core/domain/usecase/DeleteSleepEntryUseCase;", "getDeleteSleepEntry", "()Lcom/example/rungps/core/domain/usecase/DeleteSleepEntryUseCase;", "observeWeeklyGymVolume", "Lcom/example/rungps/core/domain/usecase/ObserveWeeklyGymVolumeUseCase;", "getObserveWeeklyGymVolume", "()Lcom/example/rungps/core/domain/usecase/ObserveWeeklyGymVolumeUseCase;", "observeCombinedLoad", "Lcom/example/rungps/core/domain/usecase/ObserveCombinedLoadUseCase;", "getObserveCombinedLoad", "()Lcom/example/rungps/core/domain/usecase/ObserveCombinedLoadUseCase;", "combinedLoadFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "observeDailyReadiness", "Lcom/example/rungps/core/domain/usecase/ObserveDailyReadinessUseCase;", "getObserveDailyReadiness", "()Lcom/example/rungps/core/domain/usecase/ObserveDailyReadinessUseCase;", "observeRunKmTrend4w", "Lcom/example/rungps/core/domain/usecase/ObserveRunKmTrend4wUseCase;", "getObserveRunKmTrend4w", "()Lcom/example/rungps/core/domain/usecase/ObserveRunKmTrend4wUseCase;", "observeRideKmTrend4w", "getObserveRideKmTrend4w", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerUseCases {
    private final AddSleepEntryUseCase addSleepEntry;
    private final Flow<CombinedLoadSnapshot> combinedLoadFlow;
    private final DedupeSavedRoutesUseCase dedupeSavedRoutes;
    private final DeleteAllRunsUseCase deleteAllRuns;
    private final DeleteRouteUseCase deleteRoute;
    private final DeleteRunUseCase deleteRun;
    private final DeleteSleepEntryUseCase deleteSleepEntry;
    private final ExerciseTrackerGateway gateway;
    private final ListRoutesUseCase listRoutes;
    private final ObserveCombinedLoadUseCase observeCombinedLoad;
    private final ObserveDailyReadinessUseCase observeDailyReadiness;
    private final ObserveGymSessionsUseCase observeGymSessions;
    private final ObserveGymVolumeHeatmapUseCase observeGymVolumeHeatmap;
    private final ObserveGymVolumeRegionsUseCase observeGymVolumeRegions;
    private final ObserveRecentSleepUseCase observeRecentSleep;
    private final ObserveRunKmTrend4wUseCase observeRideKmTrend4w;
    private final ObserveRoutesUseCase observeRoutes;
    private final ObserveRunKmTrend4wUseCase observeRunKmTrend4w;
    private final ObserveRunsUseCase observeRuns;
    private final ObserveRunsPagedUseCase observeRunsPaged;
    private final ObserveWeeklyGymVolumeUseCase observeWeeklyGymVolume;
    private final ReclassifyWatchRunToSoccerUseCase reclassifyWatchRunToSoccer;
    private final SaveRouteUseCase saveRoute;
    private final TrimRunUseCase trimRun;
    private final UpdateSleepEntryUseCase updateSleepEntry;

    public ExerciseTrackerUseCases(ExerciseTrackerGateway gateway, HomeAnalyticsPort homeAnalytics, Function0<String> sportLabel) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(homeAnalytics, "homeAnalytics");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        this.gateway = gateway;
        this.observeRuns = new ObserveRunsUseCase(gateway);
        this.observeRunsPaged = new ObserveRunsPagedUseCase(gateway);
        this.observeRoutes = new ObserveRoutesUseCase(gateway);
        this.dedupeSavedRoutes = new DedupeSavedRoutesUseCase(gateway);
        this.deleteRun = new DeleteRunUseCase(gateway);
        this.deleteAllRuns = new DeleteAllRunsUseCase(gateway);
        this.saveRoute = new SaveRouteUseCase(gateway);
        this.listRoutes = new ListRoutesUseCase(gateway);
        this.deleteRoute = new DeleteRouteUseCase(gateway);
        this.trimRun = new TrimRunUseCase(gateway);
        this.reclassifyWatchRunToSoccer = new ReclassifyWatchRunToSoccerUseCase(gateway);
        this.observeGymVolumeRegions = new ObserveGymVolumeRegionsUseCase(gateway);
        this.observeGymVolumeHeatmap = new ObserveGymVolumeHeatmapUseCase(gateway);
        this.observeGymSessions = new ObserveGymSessionsUseCase(gateway);
        this.observeRecentSleep = new ObserveRecentSleepUseCase(gateway);
        this.addSleepEntry = new AddSleepEntryUseCase(gateway);
        this.updateSleepEntry = new UpdateSleepEntryUseCase(gateway);
        this.deleteSleepEntry = new DeleteSleepEntryUseCase(gateway);
        this.observeWeeklyGymVolume = new ObserveWeeklyGymVolumeUseCase(gateway, homeAnalytics);
        ObserveCombinedLoadUseCase observeCombinedLoadUseCase = new ObserveCombinedLoadUseCase(gateway, homeAnalytics, sportLabel);
        this.observeCombinedLoad = observeCombinedLoadUseCase;
        Flow<CombinedLoadSnapshot> invoke = observeCombinedLoadUseCase.invoke();
        this.combinedLoadFlow = invoke;
        this.observeDailyReadiness = new ObserveDailyReadinessUseCase(gateway, homeAnalytics, invoke);
        this.observeRunKmTrend4w = new ObserveRunKmTrend4wUseCase(gateway, homeAnalytics, false);
        this.observeRideKmTrend4w = new ObserveRunKmTrend4wUseCase(gateway, homeAnalytics, true);
    }

    public final ExerciseTrackerGateway getGateway() {
        return this.gateway;
    }

    public final ObserveRunsUseCase getObserveRuns() {
        return this.observeRuns;
    }

    public final ObserveRunsPagedUseCase getObserveRunsPaged() {
        return this.observeRunsPaged;
    }

    public final ObserveRoutesUseCase getObserveRoutes() {
        return this.observeRoutes;
    }

    public final DedupeSavedRoutesUseCase getDedupeSavedRoutes() {
        return this.dedupeSavedRoutes;
    }

    public final DeleteRunUseCase getDeleteRun() {
        return this.deleteRun;
    }

    public final DeleteAllRunsUseCase getDeleteAllRuns() {
        return this.deleteAllRuns;
    }

    public final SaveRouteUseCase getSaveRoute() {
        return this.saveRoute;
    }

    public final ListRoutesUseCase getListRoutes() {
        return this.listRoutes;
    }

    public final DeleteRouteUseCase getDeleteRoute() {
        return this.deleteRoute;
    }

    public final TrimRunUseCase getTrimRun() {
        return this.trimRun;
    }

    public final ReclassifyWatchRunToSoccerUseCase getReclassifyWatchRunToSoccer() {
        return this.reclassifyWatchRunToSoccer;
    }

    public final ObserveGymVolumeRegionsUseCase getObserveGymVolumeRegions() {
        return this.observeGymVolumeRegions;
    }

    public final ObserveGymVolumeHeatmapUseCase getObserveGymVolumeHeatmap() {
        return this.observeGymVolumeHeatmap;
    }

    public final ObserveGymSessionsUseCase getObserveGymSessions() {
        return this.observeGymSessions;
    }

    public final ObserveRecentSleepUseCase getObserveRecentSleep() {
        return this.observeRecentSleep;
    }

    public final AddSleepEntryUseCase getAddSleepEntry() {
        return this.addSleepEntry;
    }

    public final UpdateSleepEntryUseCase getUpdateSleepEntry() {
        return this.updateSleepEntry;
    }

    public final DeleteSleepEntryUseCase getDeleteSleepEntry() {
        return this.deleteSleepEntry;
    }

    public final ObserveWeeklyGymVolumeUseCase getObserveWeeklyGymVolume() {
        return this.observeWeeklyGymVolume;
    }

    public final ObserveCombinedLoadUseCase getObserveCombinedLoad() {
        return this.observeCombinedLoad;
    }

    public final ObserveDailyReadinessUseCase getObserveDailyReadiness() {
        return this.observeDailyReadiness;
    }

    public final ObserveRunKmTrend4wUseCase getObserveRunKmTrend4w() {
        return this.observeRunKmTrend4w;
    }

    public final ObserveRunKmTrend4wUseCase getObserveRideKmTrend4w() {
        return this.observeRideKmTrend4w;
    }
}
