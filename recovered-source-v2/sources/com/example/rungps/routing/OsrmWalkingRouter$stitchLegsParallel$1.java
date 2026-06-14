package com.example.rungps.routing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter", f = "OsrmWalkingRouter.kt", i = {}, l = {174}, m = "stitchLegsParallel-0E7RQCE", n = {}, s = {})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$stitchLegsParallel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OsrmWalkingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsrmWalkingRouter$stitchLegsParallel$1(OsrmWalkingRouter osrmWalkingRouter, Continuation<? super OsrmWalkingRouter$stitchLegsParallel$1> continuation) {
        super(continuation);
        this.this$0 = osrmWalkingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6906stitchLegsParallel0E7RQCE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m6906stitchLegsParallel0E7RQCE = this.this$0.m6906stitchLegsParallel0E7RQCE(null, false, this);
        return m6906stitchLegsParallel0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6906stitchLegsParallel0E7RQCE : Result.m7904boximpl(m6906stitchLegsParallel0E7RQCE);
    }
}
