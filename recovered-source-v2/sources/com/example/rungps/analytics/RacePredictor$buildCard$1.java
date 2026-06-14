package com.example.rungps.analytics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RacePredictor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.analytics.RacePredictor", f = "RacePredictor.kt", i = {0, 0, 0}, l = {33}, m = "buildCard", n = {"this", "recoveryEvents", "nowMs"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RacePredictor$buildCard$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RacePredictor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RacePredictor$buildCard$1(RacePredictor racePredictor, Continuation<? super RacePredictor$buildCard$1> continuation) {
        super(continuation);
        this.this$0 = racePredictor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildCard(null, null, 0L, this);
    }
}
