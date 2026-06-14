package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {0, 0, 0, 0}, l = {141}, m = "findMatchingFinishedRun", n = {"startTimeMs", "distanceM", "toleranceMs", "distTol"}, s = {"J$0", "D$0", "J$1", "D$1"})
/* loaded from: classes3.dex */
final class RunRepository$findMatchingFinishedRun$1 extends ContinuationImpl {
    double D$0;
    double D$1;
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$findMatchingFinishedRun$1(RunRepository runRepository, Continuation<? super RunRepository$findMatchingFinishedRun$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.findMatchingFinishedRun(0L, 0.0d, 0L, this);
    }
}
