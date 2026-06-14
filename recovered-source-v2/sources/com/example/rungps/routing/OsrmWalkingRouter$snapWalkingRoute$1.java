package com.example.rungps.routing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter", f = "OsrmWalkingRouter.kt", i = {0, 0}, l = {153, 155}, m = "snapWalkingRoute-gIAlu-s", n = {"this", "chain"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$snapWalkingRoute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OsrmWalkingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsrmWalkingRouter$snapWalkingRoute$1(OsrmWalkingRouter osrmWalkingRouter, Continuation<? super OsrmWalkingRouter$snapWalkingRoute$1> continuation) {
        super(continuation);
        this.this$0 = osrmWalkingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6909snapWalkingRoutegIAlus = this.this$0.m6909snapWalkingRoutegIAlus(null, this);
        return m6909snapWalkingRoutegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6909snapWalkingRoutegIAlus : Result.m7904boximpl(m6909snapWalkingRoutegIAlus);
    }
}
