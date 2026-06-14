package com.example.rungps.recovery;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecoveryMuscleHeatmap.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.recovery.RecoveryMuscleHeatmap", f = "RecoveryMuscleHeatmap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {84, 85, 87, 108}, m = "accumulateGymRecovery", n = {"e", "repo", "lookup", "secondaryLookup", "tertiaryLookup", "regions", "exercises", "dayHintOut", "remH", "e", "repo", "lookup", "secondaryLookup", "tertiaryLookup", "regions", "exercises", "dayHintOut", "sess", "remH", "repo", "lookup", "secondaryLookup", "tertiaryLookup", "regions", "exercises", "sess", "day", "remH", "lookup", "secondaryLookup", "tertiaryLookup", "regions", "exercises", "day", "remH"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0"})
/* loaded from: classes3.dex */
final class RecoveryMuscleHeatmap$accumulateGymRecovery$1 extends ContinuationImpl {
    float F$0;
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
    final /* synthetic */ RecoveryMuscleHeatmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryMuscleHeatmap$accumulateGymRecovery$1(RecoveryMuscleHeatmap recoveryMuscleHeatmap, Continuation<? super RecoveryMuscleHeatmap$accumulateGymRecovery$1> continuation) {
        super(continuation);
        this.this$0 = recoveryMuscleHeatmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object accumulateGymRecovery;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        accumulateGymRecovery = this.this$0.accumulateGymRecovery(null, 0.0f, null, null, null, null, null, null, null, this);
        return accumulateGymRecovery;
    }
}
