package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.data.RouteEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RunUseCases.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveRoutesUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RouteEntity;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveRoutesUseCase {
    private final ExerciseTrackerGateway gateway;

    public ObserveRoutesUseCase(ExerciseTrackerGateway gateway) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.gateway = gateway;
    }

    public final Flow<List<RouteEntity>> invoke() {
        return this.gateway.routesFlow();
    }
}
