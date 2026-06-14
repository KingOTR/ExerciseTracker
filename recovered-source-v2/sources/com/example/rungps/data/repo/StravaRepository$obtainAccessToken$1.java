package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StravaRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.StravaRepository", f = "StravaRepository.kt", i = {0, 0}, l = {145}, m = "obtainAccessToken", n = {"prefs", "expAt"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class StravaRepository$obtainAccessToken$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StravaRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaRepository$obtainAccessToken$1(StravaRepository stravaRepository, Continuation<? super StravaRepository$obtainAccessToken$1> continuation) {
        super(continuation);
        this.this$0 = stravaRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.obtainAccessToken(false, this);
    }
}
