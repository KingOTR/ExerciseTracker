package com.example.rungps.routing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter", f = "OsrmWalkingRouter.kt", i = {}, l = {195}, m = "requestFootGeometry-gIAlu-s", n = {}, s = {})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$requestFootGeometry$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OsrmWalkingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsrmWalkingRouter$requestFootGeometry$1(OsrmWalkingRouter osrmWalkingRouter, Continuation<? super OsrmWalkingRouter$requestFootGeometry$1> continuation) {
        super(continuation);
        this.this$0 = osrmWalkingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6905requestFootGeometrygIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m6905requestFootGeometrygIAlus = this.this$0.m6905requestFootGeometrygIAlus(null, this);
        return m6905requestFootGeometrygIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6905requestFootGeometrygIAlus : Result.m7904boximpl(m6905requestFootGeometrygIAlus);
    }
}
