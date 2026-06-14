package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.HealthConnectManager", f = "HealthConnectManager.kt", i = {}, l = {187}, m = "backupRunToHealthConnect", n = {}, s = {})
/* loaded from: classes3.dex */
final class HealthConnectManager$backupRunToHealthConnect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectManager$backupRunToHealthConnect$1(HealthConnectManager healthConnectManager, Continuation<? super HealthConnectManager$backupRunToHealthConnect$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.backupRunToHealthConnect(0L, null, null, 0.0d, 0L, null, this);
    }
}
