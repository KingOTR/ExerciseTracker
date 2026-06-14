package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepMlFeedbackApply.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepMlFeedbackApply", f = "SleepMlFeedbackApply.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {118, 156}, m = "persistRebuilt", n = {"entry", "labels", "kind", "deepMin", "lightMin", "remMin", "quality", "pillars", "repo", "inBedMin", "d", "l", "r", "total", "awake", "eff", "updated"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0"})
/* loaded from: classes3.dex */
final class SleepMlFeedbackApply$persistRebuilt$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepMlFeedbackApply this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepMlFeedbackApply$persistRebuilt$1(SleepMlFeedbackApply sleepMlFeedbackApply, Continuation<? super SleepMlFeedbackApply$persistRebuilt$1> continuation) {
        super(continuation);
        this.this$0 = sleepMlFeedbackApply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object persistRebuilt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        persistRebuilt = this.this$0.persistRebuilt(null, null, null, 0, null, null, null, null, null, null, null, null, null, this);
        return persistRebuilt;
    }
}
