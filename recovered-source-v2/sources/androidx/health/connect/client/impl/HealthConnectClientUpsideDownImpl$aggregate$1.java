package androidx.health.connect.client.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {0, 0, 1, 1}, l = {223, 230}, m = "aggregate", n = {"this", "request", "request", "fallbackResponse"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class HealthConnectClientUpsideDownImpl$aggregate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$aggregate$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, Continuation<? super HealthConnectClientUpsideDownImpl$aggregate$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.aggregate(null, this);
    }
}
