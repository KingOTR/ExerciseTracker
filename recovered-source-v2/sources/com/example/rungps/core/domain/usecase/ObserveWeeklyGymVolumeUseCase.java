package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.common.AppDispatchers;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.analytics.WeekVolumeBar;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveWeeklyGymVolumeUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "analytics", "Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;Lcom/example/rungps/core/domain/analytics/HomeAnalyticsPort;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveWeeklyGymVolumeUseCase {
    private final HomeAnalyticsPort analytics;
    private final ExerciseTrackerGateway gateway;

    public ObserveWeeklyGymVolumeUseCase(ExerciseTrackerGateway gateway, HomeAnalyticsPort analytics) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.gateway = gateway;
        this.analytics = analytics;
    }

    public final Flow<List<WeekVolumeBar>> invoke() {
        return FlowKt.flowOn(FlowKt.mapLatest(this.gateway.gymSessionsFlow(), new ObserveWeeklyGymVolumeUseCase$invoke$1(this, null)), AppDispatchers.INSTANCE.getIo());
    }
}
