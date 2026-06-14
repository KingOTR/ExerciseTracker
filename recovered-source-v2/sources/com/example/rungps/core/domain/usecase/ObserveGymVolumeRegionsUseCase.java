package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GymUseCases.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveGymVolumeRegionsUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "", "", "days", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveGymVolumeRegionsUseCase {
    private final ExerciseTrackerGateway gateway;

    public ObserveGymVolumeRegionsUseCase(ExerciseTrackerGateway gateway) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.gateway = gateway;
    }

    public static /* synthetic */ Flow invoke$default(ObserveGymVolumeRegionsUseCase observeGymVolumeRegionsUseCase, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 90;
        }
        return observeGymVolumeRegionsUseCase.invoke(i);
    }

    public final Flow<Map<String, Float>> invoke(int days) {
        return FlowKt.mapLatest(this.gateway.gymSessionsFlow(), new ObserveGymVolumeRegionsUseCase$invoke$1(this, days, null));
    }
}
