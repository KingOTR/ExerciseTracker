package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.impl.platform.TimeExtensionsKt;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.time.TimeRangeFilter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: NutritionAggregationExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"aggregateNutritionTransFatTotal", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/HealthConnectClient;", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sliceFactor", "", "Landroidx/health/connect/client/records/IntervalRecord;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NutritionAggregationExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object aggregateNutritionTransFatTotal(HealthConnectClient healthConnectClient, final AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1 nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1;
        int i;
        TransFatTotalAggregator transFatTotalAggregator;
        if (continuation instanceof NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1) {
            nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1 = (NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1) continuation;
            if ((nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.label & Integer.MIN_VALUE) != 0) {
                nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.label -= Integer.MIN_VALUE;
                Object obj = nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final TransFatTotalAggregator transFatTotalAggregator2 = new TransFatTotalAggregator(aggregateRequest.getTimeRangeFilter());
                    Flow readRecordsFlow = HealthConnectClientAggregationExtensionsKt.readRecordsFlow(healthConnectClient, new ReadRecordsRequest(Reflection.getOrCreateKotlinClass(NutritionRecord.class), HealthConnectClientAggregationExtensionsKt.withBufferedStart(aggregateRequest.getTimeRangeFilter()), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null));
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.health.connect.client.impl.platform.aggregate.NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                            return emit((List<NutritionRecord>) obj2, (Continuation<? super Unit>) continuation2);
                        }

                        public final Object emit(List<NutritionRecord> list, Continuation<? super Unit> continuation2) {
                            AggregateRequest aggregateRequest2 = AggregateRequest.this;
                            ArrayList arrayList = new ArrayList();
                            for (T t : list) {
                                if (HealthConnectClientAggregationExtensionsKt.overlaps((NutritionRecord) t, aggregateRequest2.getTimeRangeFilter())) {
                                    arrayList.add(t);
                                }
                            }
                            TransFatTotalAggregator transFatTotalAggregator3 = transFatTotalAggregator2;
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                transFatTotalAggregator3.plusAssign((NutritionRecord) it.next());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.L$0 = transFatTotalAggregator2;
                    nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.label = 1;
                    if (readRecordsFlow.collect(flowCollector, nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transFatTotalAggregator = transFatTotalAggregator2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transFatTotalAggregator = (TransFatTotalAggregator) nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return transFatTotalAggregator.getResult();
            }
        }
        nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1 = new NutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1(continuation);
        Object obj2 = nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nutritionAggregationExtensionsKt$aggregateNutritionTransFatTotal$1.label;
        if (i != 0) {
        }
        return transFatTotalAggregator.getResult();
    }

    public static final double sliceFactor(IntervalRecord intervalRecord, TimeRangeFilter timeRangeFilter) {
        Instant instant;
        Instant instant2;
        Intrinsics.checkNotNullParameter(intervalRecord, "<this>");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "timeRangeFilter");
        if (TimeExtensionsKt.useLocalTime(timeRangeFilter)) {
            LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
            Instant instantWithDefaultZoneFallback = localStartTime != null ? TimeExtensionsKt.toInstantWithDefaultZoneFallback(localStartTime, intervalRecord.getStartZoneOffset()) : null;
            LocalDateTime localEndTime = timeRangeFilter.getLocalEndTime();
            Instant instantWithDefaultZoneFallback2 = localEndTime != null ? TimeExtensionsKt.toInstantWithDefaultZoneFallback(localEndTime, intervalRecord.getEndZoneOffset()) : null;
            Instant startTime = intervalRecord.getStartTime();
            if (instantWithDefaultZoneFallback == null) {
                instantWithDefaultZoneFallback = intervalRecord.getStartTime();
            }
            instant2 = (Instant) ComparisonsKt.maxOf(startTime, instantWithDefaultZoneFallback);
            Instant endTime = intervalRecord.getEndTime();
            if (instantWithDefaultZoneFallback2 == null) {
                instantWithDefaultZoneFallback2 = intervalRecord.getEndTime();
            }
            instant = (Instant) ComparisonsKt.minOf(endTime, instantWithDefaultZoneFallback2);
        } else {
            Instant startTime2 = intervalRecord.getStartTime();
            Instant startTime3 = timeRangeFilter.getStartTime();
            if (startTime3 == null) {
                startTime3 = intervalRecord.getStartTime();
            }
            Instant instant3 = (Instant) ComparisonsKt.maxOf(startTime2, startTime3);
            Instant endTime2 = intervalRecord.getEndTime();
            Instant endTime3 = timeRangeFilter.getEndTime();
            if (endTime3 == null) {
                endTime3 = intervalRecord.getEndTime();
            }
            instant = (Instant) ComparisonsKt.minOf(endTime2, endTime3);
            instant2 = instant3;
        }
        return Math.max(0.0d, TimeExtensionsKt.div(TimeExtensionsKt.minus(instant, instant2), TimeExtensionsKt.getDuration(intervalRecord)));
    }
}
