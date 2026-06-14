package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.core.domain.model.GymVolumeHeatmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GymUseCases.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeHeatmapUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/rungps/core/domain/model/GymVolumeHeatmap;", "days", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveGymVolumeHeatmapUseCase {
    private final ExerciseTrackerGateway gateway;

    public ObserveGymVolumeHeatmapUseCase(ExerciseTrackerGateway gateway) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.gateway = gateway;
    }

    public static /* synthetic */ Flow invoke$default(ObserveGymVolumeHeatmapUseCase observeGymVolumeHeatmapUseCase, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 90;
        }
        return observeGymVolumeHeatmapUseCase.invoke(i);
    }

    public final Flow<GymVolumeHeatmap> invoke(int days) {
        return FlowKt.mapLatest(this.gateway.gymSessionsFlow(), new ObserveGymVolumeHeatmapUseCase$invoke$1(this, days, null));
    }
}
