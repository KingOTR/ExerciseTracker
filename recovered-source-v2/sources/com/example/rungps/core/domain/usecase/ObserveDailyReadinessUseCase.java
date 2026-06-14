package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.common.AppDispatchers;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.DailyReadinessSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveDailyReadinessUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "analytics", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "combinedLoad", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;Lkotlinx/coroutines/flow/Flow;)V", "invoke", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveDailyReadinessUseCase {
    private final HomeAnalyticsPort analytics;
    private final Flow<CombinedLoadSnapshot> combinedLoad;
    private final ExerciseTrackerGateway gateway;

    public ObserveDailyReadinessUseCase(ExerciseTrackerGateway gateway, HomeAnalyticsPort analytics, Flow<CombinedLoadSnapshot> combinedLoad) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(combinedLoad, "combinedLoad");
        this.gateway = gateway;
        this.analytics = analytics;
        this.combinedLoad = combinedLoad;
    }

    public final Flow<DailyReadinessSnapshot> invoke() {
        return FlowKt.flowOn(FlowKt.mapLatest(FlowKt.combine(FlowKt.combine(this.gateway.recoveryRecentFlow(60), this.gateway.gymSessionsFlow(), this.gateway.sleepRecentFlow(14), new ObserveDailyReadinessUseCase$invoke$1(null)), FlowKt.combine(this.gateway.soccerSessionsFlow(), this.gateway.todayStepsFlow(), this.combinedLoad, new ObserveDailyReadinessUseCase$invoke$2(null)), new ObserveDailyReadinessUseCase$invoke$3(null)), new ObserveDailyReadinessUseCase$invoke$4(this, null)), AppDispatchers.INSTANCE.getIo());
    }
}
