package com.example.rungps.routing;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.routing.OsrmWalkingRouter", f = "OsrmWalkingRouter.kt", i = {}, l = {142}, m = "footRouteGeometry-gIAlu-s", n = {}, s = {})
/* loaded from: classes3.dex */
final class OsrmWalkingRouter$footRouteGeometry$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OsrmWalkingRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OsrmWalkingRouter$footRouteGeometry$1(OsrmWalkingRouter osrmWalkingRouter, Continuation<? super OsrmWalkingRouter$footRouteGeometry$1> continuation) {
        super(continuation);
        this.this$0 = osrmWalkingRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6907footRouteGeometrygIAlus = this.this$0.m6907footRouteGeometrygIAlus(null, this);
        return m6907footRouteGeometrygIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6907footRouteGeometrygIAlus : Result.m7904boximpl(m6907footRouteGeometrygIAlus);
    }
}
