package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepListenService.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepListenService", f = "SleepListenService.kt", i = {0, 0}, l = {412}, m = "bucketLoop", n = {"this", "started"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class SleepListenService$bucketLoop$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepListenService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepListenService$bucketLoop$1(SleepListenService sleepListenService, Continuation<? super SleepListenService$bucketLoop$1> continuation) {
        super(continuation);
        this.this$0 = sleepListenService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bucketLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        bucketLoop = this.this$0.bucketLoop(this);
        return bucketLoop;
    }
}
