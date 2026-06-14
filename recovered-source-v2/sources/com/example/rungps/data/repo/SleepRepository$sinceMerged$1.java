package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SleepRepository", f = "SleepRepository.kt", i = {}, l = {123}, m = "sinceMerged", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepRepository$sinceMerged$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepRepository$sinceMerged$1(SleepRepository sleepRepository, Continuation<? super SleepRepository$sinceMerged$1> continuation) {
        super(continuation);
        this.this$0 = sleepRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sinceMerged(0L, this);
    }
}
