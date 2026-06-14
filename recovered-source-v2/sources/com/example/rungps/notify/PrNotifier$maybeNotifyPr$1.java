package com.example.rungps.notify;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PrNotifier.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.notify.PrNotifier", f = "PrNotifier.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {51, 59}, m = "maybeNotifyPr", n = {"this", "context", "exerciseName", "reps", "weightKg", "r", "this", "context", "exerciseName", "prior", "weightKg", "r"}, s = {"L$0", "L$1", "L$2", "L$3", "D$0", "I$0", "L$0", "L$1", "L$2", "L$3", "D$0", "I$0"})
/* loaded from: classes3.dex */
final class PrNotifier$maybeNotifyPr$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrNotifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrNotifier$maybeNotifyPr$1(PrNotifier prNotifier, Continuation<? super PrNotifier$maybeNotifyPr$1> continuation) {
        super(continuation);
        this.this$0 = prNotifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.maybeNotifyPr(null, null, 0.0d, null, null, this);
    }
}
