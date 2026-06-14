package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthReadinessSignals.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.HealthReadinessSignalsBuilder", f = "HealthReadinessSignals.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {40, 45}, m = "build", n = {"this", "hc", "stepsToday", "dbSleepRecent", "zone", "lines", "lastSleepH", "lastQuality", "hcGrantedSleep", "hc", "stepsToday", "dbSleepRecent", "lines", "restingHr", "lastSleepH", "lastQuality"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* loaded from: classes3.dex */
final class HealthReadinessSignalsBuilder$build$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthReadinessSignalsBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthReadinessSignalsBuilder$build$1(HealthReadinessSignalsBuilder healthReadinessSignalsBuilder, Continuation<? super HealthReadinessSignalsBuilder$build$1> continuation) {
        super(continuation);
        this.this$0 = healthReadinessSignalsBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.build(null, false, false, false, null, null, null, this);
    }
}
