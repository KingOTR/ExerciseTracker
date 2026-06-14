package com.example.rungps.feature.gym;

import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.core.domain.model.GymVolumeHeatmap;
import com.example.rungps.core.domain.usecase.ObserveGymVolumeHeatmapUseCase;
import com.example.rungps.core.domain.usecase.ObserveGymVolumeRegionsUseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GymViewModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/feature/gym/GymViewModel;", "", "useCases", "Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/example/rungps/core/domain/ExerciseTrackerUseCases;Lkotlinx/coroutines/CoroutineScope;)V", "volumeHeatmap", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/rungps/core/domain/model/GymVolumeHeatmap;", "getVolumeHeatmap", "()Lkotlinx/coroutines/flow/StateFlow;", "volumeByRegion", "", "", "", "getVolumeByRegion", "gym_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymViewModel {
    private final StateFlow<Map<String, Float>> volumeByRegion;
    private final StateFlow<GymVolumeHeatmap> volumeHeatmap;

    public GymViewModel(ExerciseTrackerUseCases useCases, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.volumeHeatmap = FlowKt.stateIn(ObserveGymVolumeHeatmapUseCase.invoke$default(useCases.getObserveGymVolumeHeatmap(), 0, 1, null), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new GymVolumeHeatmap(null, null, 3, null));
        this.volumeByRegion = FlowKt.stateIn(ObserveGymVolumeRegionsUseCase.invoke$default(useCases.getObserveGymVolumeRegions(), 0, 1, null), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), MapsKt.emptyMap());
    }

    public final StateFlow<GymVolumeHeatmap> getVolumeHeatmap() {
        return this.volumeHeatmap;
    }

    public final StateFlow<Map<String, Float>> getVolumeByRegion() {
        return this.volumeByRegion;
    }
}
