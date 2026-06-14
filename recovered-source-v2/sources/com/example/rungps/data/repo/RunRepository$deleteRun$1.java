package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {122, 123, 124, 125}, m = "deleteRun", n = {"this", "runId", "this", "runId", "this", "runId"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes3.dex */
final class RunRepository$deleteRun$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$deleteRun$1(RunRepository runRepository, Continuation<? super RunRepository$deleteRun$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteRun(0L, this);
    }
}
