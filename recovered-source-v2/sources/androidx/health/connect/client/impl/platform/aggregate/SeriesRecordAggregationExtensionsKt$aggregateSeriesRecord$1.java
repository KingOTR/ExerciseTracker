package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.SeriesRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SeriesRecordAggregationExtensions.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt", f = "SeriesRecordAggregationExtensions.kt", i = {0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_WALKING}, m = "aggregateSeriesRecord", n = {"aggregator"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1<T extends SeriesRecord<?>> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1(Continuation<? super SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SeriesRecordAggregationExtensionsKt.aggregateSeriesRecord(null, null, null, null, this);
    }
}
