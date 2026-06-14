package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.common.AppDispatchers;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveCombinedLoadUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "analytics", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "sportLabel", "Lkotlin/Function0;", "", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;Lkotlin/jvm/functions/Function0;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveCombinedLoadUseCase {
    private final HomeAnalyticsPort analytics;
    private final ExerciseTrackerGateway gateway;
    private final Function0<String> sportLabel;

    public ObserveCombinedLoadUseCase(ExerciseTrackerGateway gateway, HomeAnalyticsPort analytics, Function0<String> sportLabel) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        this.gateway = gateway;
        this.analytics = analytics;
        this.sportLabel = sportLabel;
    }

    public final Flow<CombinedLoadSnapshot> invoke() {
        return FlowKt.flowOn(FlowKt.mapLatest(FlowKt.combine(this.gateway.gymSessionsFlow(), this.gateway.runsFlow(), this.gateway.soccerSessionsFlow(), new ObserveCombinedLoadUseCase$invoke$1(null)), new ObserveCombinedLoadUseCase$invoke$2(this, null)), AppDispatchers.INSTANCE.getIo());
    }
}
