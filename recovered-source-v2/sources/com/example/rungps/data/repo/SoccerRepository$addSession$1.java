package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SoccerRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SoccerRepository", f = "SoccerRepository.kt", i = {0, 1, 1, 2}, l = {31, 41, 42}, m = "addSession", n = {"this", "this", "id", "id"}, s = {"L$0", "L$0", "J$0", "J$0"})
/* loaded from: classes3.dex */
final class SoccerRepository$addSession$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SoccerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoccerRepository$addSession$1(SoccerRepository soccerRepository, Continuation<? super SoccerRepository$addSession$1> continuation) {
        super(continuation);
        this.this$0 = soccerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addSession(null, 0L, 0, 0, 0, null, this);
    }
}
