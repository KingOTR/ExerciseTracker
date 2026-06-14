package androidx.health.connect.client.impl.platform.aggregate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0}, l = {61}, m = "aggregateFallback", n = {"$this$aggregateFallback", "request"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class HealthConnectClientAggregationExtensionsKt$aggregateFallback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    HealthConnectClientAggregationExtensionsKt$aggregateFallback$1(Continuation<? super HealthConnectClientAggregationExtensionsKt$aggregateFallback$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HealthConnectClientAggregationExtensionsKt.aggregateFallback(null, null, this);
    }
}
