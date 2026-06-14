package com.example.rungps.recovery;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReadinessInputs.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.recovery.ReadinessInputs", f = "ReadinessInputs.kt", i = {0, 0}, l = {60}, m = "filterRecoveryForDisplay", n = {"this", "soccerSessions"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ReadinessInputs$filterRecoveryForDisplay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadinessInputs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadinessInputs$filterRecoveryForDisplay$1(ReadinessInputs readinessInputs, Continuation<? super ReadinessInputs$filterRecoveryForDisplay$1> continuation) {
        super(continuation);
        this.this$0 = readinessInputs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.filterRecoveryForDisplay(null, null, null, this);
    }
}
