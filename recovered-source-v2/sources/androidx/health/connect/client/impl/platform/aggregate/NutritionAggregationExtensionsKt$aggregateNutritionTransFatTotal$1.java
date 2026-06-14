package androidx.health.connect.client.impl.platform.aggregate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NutritionAggregationExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.NutritionAggregationExtensionsKt", f = "NutritionAggregationExtensions.kt", i = {0}, l = {50}, m = "aggregateNutritionTransFatTotal", n = {"aggregator"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1(Continuation<? super NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NutritionAggregationExtensionsKt.aggregateNutritionTransFatTotal(null, null, this);
    }
}
