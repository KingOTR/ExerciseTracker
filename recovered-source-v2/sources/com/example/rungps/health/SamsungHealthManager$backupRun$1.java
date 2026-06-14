package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SamsungHealthManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager", f = "SamsungHealthManager.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {243, 244}, m = "backupRun", n = {"this", "startTime", "endTime", "store", "runId", "distanceMeters", "steps"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "D$0", "J$1"})
/* loaded from: classes3.dex */
final class SamsungHealthManager$backupRun$1 extends ContinuationImpl {
    double D$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$backupRun$1(SamsungHealthManager samsungHealthManager, Continuation<? super SamsungHealthManager$backupRun$1> continuation) {
        super(continuation);
        this.this$0 = samsungHealthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.backupRun(0L, null, null, 0.0d, 0L, this);
    }
}
