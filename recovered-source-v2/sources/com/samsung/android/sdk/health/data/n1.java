package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.response.AsyncCompletableFuture;
import java.util.concurrent.ExecutorService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class n1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AsyncCompletableFuture a;
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ CancellableContinuation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(AsyncCompletableFuture asyncCompletableFuture, ExecutorService executorService, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.a = asyncCompletableFuture;
        this.b = executorService;
        this.c = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n1(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.setCallback(this.b, new l1(this.c), new p1(new m1(this.c)));
        return Unit.INSTANCE;
    }
}
