package com.example.rungps.feature.home;

import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.DailyReadinessSnapshot;
import com.example.rungps.core.domain.analytics.WeekVolumeBar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/feature/home/HomeViewModel;", "", "useCases", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;Lkotlinx/coroutines/CoroutineScope;)V", "weeklyVolume", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "getWeeklyVolume", "()Lkotlinx/coroutines/flow/StateFlow;", "combinedLoad", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "getCombinedLoad", "dailyReadiness", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "getDailyReadiness", "runKmTrend4w", "", "getRunKmTrend4w", "rideKmTrend4w", "getRideKmTrend4w", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeViewModel {
    private final StateFlow<CombinedLoadSnapshot> combinedLoad;
    private final StateFlow<DailyReadinessSnapshot> dailyReadiness;
    private final StateFlow<List<Double>> rideKmTrend4w;
    private final StateFlow<List<Double>> runKmTrend4w;
    private final StateFlow<List<WeekVolumeBar>> weeklyVolume;

    public HomeViewModel(ExerciseTrackerUseCases useCases, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.weeklyVolume = FlowKt.stateIn(useCases.getObserveWeeklyGymVolume().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.combinedLoad = FlowKt.stateIn(useCases.getObserveCombinedLoad().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
        this.dailyReadiness = FlowKt.stateIn(useCases.getObserveDailyReadiness().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), null);
        this.runKmTrend4w = FlowKt.stateIn(useCases.getObserveRunKmTrend4w().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
        this.rideKmTrend4w = FlowKt.stateIn(useCases.getObserveRideKmTrend4w().invoke(), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CollectionsKt.emptyList());
    }

    public final StateFlow<List<WeekVolumeBar>> getWeeklyVolume() {
        return this.weeklyVolume;
    }

    public final StateFlow<CombinedLoadSnapshot> getCombinedLoad() {
        return this.combinedLoad;
    }

    public final StateFlow<DailyReadinessSnapshot> getDailyReadiness() {
        return this.dailyReadiness;
    }

    public final StateFlow<List<Double>> getRunKmTrend4w() {
        return this.runKmTrend4w;
    }

    public final StateFlow<List<Double>> getRideKmTrend4w() {
        return this.rideKmTrend4w;
    }
}
