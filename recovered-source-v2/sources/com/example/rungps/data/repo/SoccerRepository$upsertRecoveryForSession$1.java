package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SoccerRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SoccerRepository", f = "SoccerRepository.kt", i = {0, 0, 0, 0}, l = {195, 223}, m = "upsertRecoveryForSession", n = {"this", "session", "extraNote", "totalMin"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class SoccerRepository$upsertRecoveryForSession$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoccerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerRepository$upsertRecoveryForSession$1(SoccerRepository soccerRepository, Continuation<? super SoccerRepository$upsertRecoveryForSession$1> continuation) {
        super(continuation);
        this.this$0 = soccerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object upsertRecoveryForSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        upsertRecoveryForSession = this.this$0.upsertRecoveryForSession(null, null, this);
        return upsertRecoveryForSession;
    }
}
