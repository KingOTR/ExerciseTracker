package com.example.rungps.tracking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TrackingService.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService", f = "TrackingService.kt", i = {0, 0, 1}, l = {581, 593}, m = "recoverRecordingIfPossible", n = {"this", "id", "this"}, s = {"L$0", "J$0", "L$0"})
/* loaded from: classes3.dex */
final class TrackingService$recoverRecordingIfPossible$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$recoverRecordingIfPossible$1(TrackingService trackingService, Continuation<? super TrackingService$recoverRecordingIfPossible$1> continuation) {
        super(continuation);
        this.this$0 = trackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object recoverRecordingIfPossible;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        recoverRecordingIfPossible = this.this$0.recoverRecordingIfPossible(this);
        return recoverRecordingIfPossible;
    }
}
