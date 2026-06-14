package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.common.AppDispatchers;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveRunKmTrend4wUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "analytics", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "isBike", "", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;Z)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveRunKmTrend4wUseCase {
    private final HomeAnalyticsPort analytics;
    private final ExerciseTrackerGateway gateway;
    private final boolean isBike;

    public ObserveRunKmTrend4wUseCase(ExerciseTrackerGateway gateway, HomeAnalyticsPort analytics, boolean z) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.gateway = gateway;
        this.analytics = analytics;
        this.isBike = z;
    }

    public final Flow<List<Double>> invoke() {
        return FlowKt.flowOn(FlowKt.mapLatest(FlowKt.combine(this.gateway.runsFlow(), this.gateway.stravaPbsFlow(), new ObserveRunKmTrend4wUseCase$invoke$1(null)), new ObserveRunKmTrend4wUseCase$invoke$2(this, null)), AppDispatchers.INSTANCE.getIo());
    }
}
