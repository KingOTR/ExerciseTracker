package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {194, 202}, m = "insertMoyoungHrSeries", n = {"this", "runId", "start", "end", "this", "runId", "end", "avg", "step", "t"}, s = {"L$0", "J$0", "J$1", "J$2", "L$0", "J$0", "J$1", "I$0", "J$2", "J$3"})
/* loaded from: classes3.dex */
final class RunRepository$insertMoyoungHrSeries$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$insertMoyoungHrSeries$1(RunRepository runRepository, Continuation<? super RunRepository$insertMoyoungHrSeries$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object insertMoyoungHrSeries;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        insertMoyoungHrSeries = this.this$0.insertMoyoungHrSeries(0L, null, this);
        return insertMoyoungHrSeries;
    }
}
