package com.example.rungps.analytics;

import com.example.rungps.sleep.SleepScience;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RaceTrendCalculator.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.analytics.RaceTrendCalculator", f = "RaceTrendCalculator.kt", i = {0, 0, 1, 1}, l = {89, SleepScience.CYCLE_TYPICAL_MIN}, m = "buildSnapshot", n = {"this", "repo", "this", "localPbs"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class RaceTrendCalculator$buildSnapshot$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RaceTrendCalculator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RaceTrendCalculator$buildSnapshot$1(RaceTrendCalculator raceTrendCalculator, Continuation<? super RaceTrendCalculator$buildSnapshot$1> continuation) {
        super(continuation);
        this.this$0 = raceTrendCalculator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildSnapshot(null, this);
    }
}
