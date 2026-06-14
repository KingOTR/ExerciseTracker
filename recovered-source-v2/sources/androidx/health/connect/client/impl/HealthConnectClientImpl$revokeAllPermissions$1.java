package androidx.health.connect.client.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {115}, m = "revokeAllPermissions", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientImpl$revokeAllPermissions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientImpl$revokeAllPermissions$1(HealthConnectClientImpl healthConnectClientImpl, Continuation<? super HealthConnectClientImpl$revokeAllPermissions$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.revokeAllPermissions(this);
    }
}
