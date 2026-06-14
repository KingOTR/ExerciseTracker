package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.HealthConnectManager", f = "HealthConnectManager.kt", i = {0, 0, 0, 0, 0, 0}, l = {134}, m = "readDailyStepsBackward", n = {"this", "zoneId", "today", "$this$readDailyStepsBackward_u24lambda_u242", "d", "i"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0"})
/* loaded from: classes3.dex */
final class HealthConnectManager$readDailyStepsBackward$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectManager$readDailyStepsBackward$1(HealthConnectManager healthConnectManager, Continuation<? super HealthConnectManager$readDailyStepsBackward$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readDailyStepsBackward(0, null, this);
    }
}
