package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepListenService.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepListenService", f = "SleepListenService.kt", i = {0, 0, 1, 1, 2, 2}, l = {331, 345, 375}, m = "audioReadLoop", n = {"this", "buffer", "this", "buffer", "this", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class SleepListenService$audioReadLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepListenService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepListenService$audioReadLoop$1(SleepListenService sleepListenService, Continuation<? super SleepListenService$audioReadLoop$1> continuation) {
        super(continuation);
        this.this$0 = sleepListenService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object audioReadLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        audioReadLoop = this.this$0.audioReadLoop(this);
        return audioReadLoop;
    }
}
