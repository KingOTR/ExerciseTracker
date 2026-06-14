package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.data.SleepEntryEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SleepUseCases.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/example/rungps/core/domain/usecase/ObserveRecentSleepUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/SleepEntryEntity;", "limit", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ObserveRecentSleepUseCase {
    private final ExerciseTrackerGateway gateway;

    public ObserveRecentSleepUseCase(ExerciseTrackerGateway gateway) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.gateway = gateway;
    }

    public static /* synthetic */ Flow invoke$default(ObserveRecentSleepUseCase observeRecentSleepUseCase, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 42;
        }
        return observeRecentSleepUseCase.invoke(i);
    }

    public final Flow<List<SleepEntryEntity>> invoke(int limit) {
        return this.gateway.sleepRecentFlow(limit);
    }
}
