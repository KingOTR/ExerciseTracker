package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.RunRepository", f = "RunRepository.kt", i = {}, l = {77}, m = "sumDistanceM", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunRepository$sumDistanceM$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RunRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunRepository$sumDistanceM$1(RunRepository runRepository, Continuation<? super RunRepository$sumDistanceM$1> continuation) {
        super(continuation);
        this.this$0 = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sumDistanceM(0L, this);
    }
}
