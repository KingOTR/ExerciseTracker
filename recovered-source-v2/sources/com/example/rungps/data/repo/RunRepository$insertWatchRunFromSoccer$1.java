package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {226, 233, 246}, m = "insertWatchRunFromSoccer", n = {"this", "hrAvgBpm", "label", "startTimeMs", "endTimeMs", "durationMs", "distanceM", "this", "hrAvgBpm", "startTimeMs", "endTimeMs", "durationMs", "runId", "this", "endTimeMs", "runId", "avg", "step", "t"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "D$0", "L$0", "L$1", "J$0", "J$1", "J$2", "J$3", "L$0", "J$0", "J$1", "I$0", "J$2", "J$3"})
/* loaded from: classes3.dex */
final class RunRepository$insertWatchRunFromSoccer$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$insertWatchRunFromSoccer$1(RunRepository runRepository, Continuation<? super RunRepository$insertWatchRunFromSoccer$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.insertWatchRunFromSoccer(0L, 0L, 0L, 0L, 0.0d, null, null, null, this);
    }
}
