package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StravaRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.StravaRepository", f = "StravaRepository.kt", i = {0, 0, 0}, l = {192}, m = "refreshAccessTokenLocked", n = {"this", "$this$withLock_u24default$iv", "force"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
final class StravaRepository$refreshAccessTokenLocked$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StravaRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaRepository$refreshAccessTokenLocked$1(StravaRepository stravaRepository, Continuation<? super StravaRepository$refreshAccessTokenLocked$1> continuation) {
        super(continuation);
        this.this$0 = stravaRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshAccessTokenLocked(false, this);
    }
}
