package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepUseCases.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/core/domain/usecase/DeleteSleepEntryUseCase;", "", "gateway", "Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;", "<init>", "(Lcom/example/rungps/core/domain/gateway/ExerciseTrackerGateway;)V", "invoke", "", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteSleepEntryUseCase {
    private final ExerciseTrackerGateway gateway;

    public DeleteSleepEntryUseCase(ExerciseTrackerGateway gateway) {
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        this.gateway = gateway;
    }

    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        Object deleteSleepEntry = this.gateway.deleteSleepEntry(j, continuation);
        return deleteSleepEntry == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSleepEntry : Unit.INSTANCE;
    }
}
