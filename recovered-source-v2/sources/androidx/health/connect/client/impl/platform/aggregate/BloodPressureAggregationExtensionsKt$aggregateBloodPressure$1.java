package androidx.health.connect.client.impl.platform.aggregate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BloodPressureAggregationExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.BloodPressureAggregationExtensionsKt", f = "BloodPressureAggregationExtensions.kt", i = {0}, l = {54}, m = "aggregateBloodPressure", n = {"aggregator"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1(Continuation<? super BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BloodPressureAggregationExtensionsKt.aggregateBloodPressure(null, null, this);
    }
}
