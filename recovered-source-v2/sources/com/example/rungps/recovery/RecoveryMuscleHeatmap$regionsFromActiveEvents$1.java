package com.example.rungps.recovery;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecoveryMuscleHeatmap.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.recovery.RecoveryMuscleHeatmap", f = "RecoveryMuscleHeatmap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {27}, m = "regionsFromActiveEvents", n = {"repo", "lookup", "secondaryLookup", "tertiaryLookup", "regions", "dayHint", "exercises", "now"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0"})
/* loaded from: classes3.dex */
final class RecoveryMuscleHeatmap$regionsFromActiveEvents$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecoveryMuscleHeatmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryMuscleHeatmap$regionsFromActiveEvents$1(RecoveryMuscleHeatmap recoveryMuscleHeatmap, Continuation<? super RecoveryMuscleHeatmap$regionsFromActiveEvents$1> continuation) {
        super(continuation);
        this.this$0 = recoveryMuscleHeatmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.regionsFromActiveEvents(null, null, null, null, null, this);
    }
}
