package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepHealthFusion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepHealthFusion", f = "SleepHealthFusion.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {60}, m = "finishMicNight", n = {"this", "context", "calibrated", "night", "hypno", "eventMarkers", "mic", "startedMs", "endedMs", "inBedMin"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "I$0"})
/* loaded from: classes3.dex */
final class SleepHealthFusion$finishMicNight$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepHealthFusion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepHealthFusion$finishMicNight$1(SleepHealthFusion sleepHealthFusion, Continuation<? super SleepHealthFusion$finishMicNight$1> continuation) {
        super(continuation);
        this.this$0 = sleepHealthFusion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.finishMicNight(null, null, 0L, 0L, false, this);
    }
}
