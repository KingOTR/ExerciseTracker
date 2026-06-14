package com.example.rungps.widget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RideRunWidgetUpdater.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.RideRunWidgetUpdater", f = "RideRunWidgetUpdater.kt", i = {0}, l = {52}, m = "refresh", n = {"app"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RideRunWidgetUpdater$refresh$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RideRunWidgetUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RideRunWidgetUpdater$refresh$1(RideRunWidgetUpdater rideRunWidgetUpdater, Continuation<? super RideRunWidgetUpdater$refresh$1> continuation) {
        super(continuation);
        this.this$0 = rideRunWidgetUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh(null, this);
    }
}
