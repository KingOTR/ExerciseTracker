package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SoccerRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SoccerRepository", f = "SoccerRepository.kt", i = {0, 1}, l = {184, 185}, m = "reconcileRecoveryEvents", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class SoccerRepository$reconcileRecoveryEvents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoccerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerRepository$reconcileRecoveryEvents$1(SoccerRepository soccerRepository, Continuation<? super SoccerRepository$reconcileRecoveryEvents$1> continuation) {
        super(continuation);
        this.this$0 = soccerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reconcileRecoveryEvents(this);
    }
}
