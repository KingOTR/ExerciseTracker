package com.example.rungps.data.repo;

import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {89, 96, 97, 100}, m = "finishRun", n = {"this", TrackingService.EXTRA_PLAN_TYPE, TrackingService.EXTRA_TIME_SESSION, "runId", "endedAtMs", "totalDistanceM", "totalDurationMs", "totalSteps", "keepEvenIfJunk", "this", "recoveryKind", "runId"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "D$0", "J$2", "J$3", "Z$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RunRepository$finishRun$1 extends ContinuationImpl {
    double D$0;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$finishRun$1(RunRepository runRepository, Continuation<? super RunRepository$finishRun$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.finishRun(0L, 0L, 0.0d, 0L, 0L, null, null, false, this);
    }
}
