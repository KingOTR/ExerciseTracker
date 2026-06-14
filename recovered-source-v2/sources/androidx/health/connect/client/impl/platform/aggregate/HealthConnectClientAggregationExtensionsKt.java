package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.impl.converters.datatype.RecordsTypeNameMapKt;
import androidx.health.connect.client.impl.platform.TimeExtensionsKt;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.NutritionRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.time.TimeRangeFilter;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\b\u001a\u00020\tH\u0000\u001a2\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u000b*\u00020\u0003*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0010\u001a\u001a\u0010\u0011\u001a\u00020\t*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0080@¢\u0006\u0002\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a.\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u001a0\u0019\"\b\b\u0000\u0010\u000b*\u00020\u0003*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u001b\u001a\f\u0010\u001c\u001a\u00020\u0017*\u00020\u0017H\u0000\"\u001c\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"AGGREGATION_FALLBACK_RECORD_TYPES", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "RECORD_START_TIME_BUFFER", "Ljava/time/Duration;", "getRECORD_START_TIME_BUFFER", "()Ljava/time/Duration;", "emptyAggregationResult", "Landroidx/health/connect/client/aggregate/AggregationResult;", "aggregate", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/HealthConnectClient;", "recordType", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Lkotlin/reflect/KClass;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateFallback", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "overlaps", "", "Landroidx/health/connect/client/records/IntervalRecord;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "readRecordsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "withBufferedStart", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthConnectClientAggregationExtensionsKt {
    private static final Set<KClass<? extends Record>> AGGREGATION_FALLBACK_RECORD_TYPES;
    private static final Duration RECORD_START_TIME_BUFFER;

    static {
        Duration ofDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(ofDays, "ofDays(1)");
        RECORD_START_TIME_BUFFER = ofDays;
        AGGREGATION_FALLBACK_RECORD_TYPES = SetsKt.setOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(BloodPressureRecord.class), Reflection.getOrCreateKotlinClass(CyclingPedalingCadenceRecord.class), Reflection.getOrCreateKotlinClass(NutritionRecord.class), Reflection.getOrCreateKotlinClass(SpeedRecord.class), Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class)});
    }

    public static final Duration getRECORD_START_TIME_BUFFER() {
        return RECORD_START_TIME_BUFFER;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007b -> B:10:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object aggregateFallback(HealthConnectClient healthConnectClient, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        HealthConnectClientAggregationExtensionsKt$aggregateFallback$1 healthConnectClientAggregationExtensionsKt$aggregateFallback$1;
        int i;
        Iterator<KClass<? extends Record>> it;
        HealthConnectClient healthConnectClient2;
        AggregationResult aggregationResult;
        AggregateRequest aggregateRequest2;
        if (continuation instanceof HealthConnectClientAggregationExtensionsKt$aggregateFallback$1) {
            healthConnectClientAggregationExtensionsKt$aggregateFallback$1 = (HealthConnectClientAggregationExtensionsKt$aggregateFallback$1) continuation;
            if ((healthConnectClientAggregationExtensionsKt$aggregateFallback$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientAggregationExtensionsKt$aggregateFallback$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientAggregationExtensionsKt$aggregateFallback$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientAggregationExtensionsKt$aggregateFallback$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AggregationResult emptyAggregationResult = emptyAggregationResult();
                    it = AGGREGATION_FALLBACK_RECORD_TYPES.iterator();
                    healthConnectClient2 = healthConnectClient;
                    aggregationResult = emptyAggregationResult;
                    aggregateRequest2 = aggregateRequest;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aggregationResult = (AggregationResult) healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$3;
                    Iterator<KClass<? extends Record>> it2 = (Iterator) healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$2;
                    AggregateRequest aggregateRequest3 = (AggregateRequest) healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$1;
                    HealthConnectClient healthConnectClient3 = (HealthConnectClient) healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Iterator<KClass<? extends Record>> it3 = it2;
                    healthConnectClient2 = healthConnectClient3;
                    aggregationResult = AggregationExtensionsKt.plus(aggregationResult, (AggregationResult) obj);
                    aggregateRequest2 = aggregateRequest3;
                    it = it3;
                    if (it.hasNext()) {
                        KClass<? extends Record> next = it.next();
                        AggregateRequest withFilteredMetrics = AggregationExtensionsKt.withFilteredMetrics(aggregateRequest2, new Function1<AggregateMetric<?>, Boolean>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregateFallback$2
                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AggregateMetric<?> it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                return Boolean.valueOf(!AggregationExtensionsKt.isPlatformSupportedMetric(it4));
                            }
                        });
                        healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$0 = healthConnectClient2;
                        healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$1 = aggregateRequest2;
                        healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$2 = it;
                        healthConnectClientAggregationExtensionsKt$aggregateFallback$1.L$3 = aggregationResult;
                        healthConnectClientAggregationExtensionsKt$aggregateFallback$1.label = 1;
                        Object aggregate = aggregate(healthConnectClient2, next, withFilteredMetrics, healthConnectClientAggregationExtensionsKt$aggregateFallback$1);
                        if (aggregate == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Iterator<KClass<? extends Record>> it4 = it;
                        aggregateRequest3 = aggregateRequest2;
                        obj = aggregate;
                        it3 = it4;
                        aggregationResult = AggregationExtensionsKt.plus(aggregationResult, (AggregationResult) obj);
                        aggregateRequest2 = aggregateRequest3;
                        it = it3;
                        if (it.hasNext()) {
                            return aggregationResult;
                        }
                    }
                }
            }
        }
        healthConnectClientAggregationExtensionsKt$aggregateFallback$1 = new HealthConnectClientAggregationExtensionsKt$aggregateFallback$1(continuation);
        Object obj2 = healthConnectClientAggregationExtensionsKt$aggregateFallback$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientAggregationExtensionsKt$aggregateFallback$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Record> Object aggregate(HealthConnectClient healthConnectClient, KClass<T> kClass, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        final String str = RecordsTypeNameMapKt.getRECORDS_CLASS_NAME_MAP().get(kClass);
        AggregateRequest withFilteredMetrics = AggregationExtensionsKt.withFilteredMetrics(aggregateRequest, new Function1<AggregateMetric<?>, Boolean>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregate$recordTypeRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AggregateMetric<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.getDataTypeName(), str));
            }
        });
        if (withFilteredMetrics.getMetrics$connect_client_release().isEmpty()) {
            return emptyAggregationResult();
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(BloodPressureRecord.class))) {
            return BloodPressureAggregationExtensionsKt.aggregateBloodPressure(healthConnectClient, withFilteredMetrics, continuation);
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(CyclingPedalingCadenceRecord.class))) {
            return SeriesRecordAggregationExtensionsKt.aggregateSeriesRecord(healthConnectClient, Reflection.getOrCreateKotlinClass(CyclingPedalingCadenceRecord.class), withFilteredMetrics, new Function1<CyclingPedalingCadenceRecord, List<? extends SampleInfo>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregate$2
                @Override // kotlin.jvm.functions.Function1
                public final List<SampleInfo> invoke(CyclingPedalingCadenceRecord aggregateSeriesRecord) {
                    Intrinsics.checkNotNullParameter(aggregateSeriesRecord, "$this$aggregateSeriesRecord");
                    List<CyclingPedalingCadenceRecord.Sample> samples = aggregateSeriesRecord.getSamples();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(samples, 10));
                    for (CyclingPedalingCadenceRecord.Sample sample : samples) {
                        arrayList.add(new SampleInfo(sample.getTime(), sample.getRevolutionsPerMinute()));
                    }
                    return arrayList;
                }
            }, continuation);
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(NutritionRecord.class))) {
            return NutritionAggregationExtensionsKt.aggregateNutritionTransFatTotal(healthConnectClient, withFilteredMetrics, continuation);
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(SpeedRecord.class))) {
            return SeriesRecordAggregationExtensionsKt.aggregateSeriesRecord(healthConnectClient, Reflection.getOrCreateKotlinClass(SpeedRecord.class), withFilteredMetrics, new Function1<SpeedRecord, List<? extends SampleInfo>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregate$3
                @Override // kotlin.jvm.functions.Function1
                public final List<SampleInfo> invoke(SpeedRecord aggregateSeriesRecord) {
                    Intrinsics.checkNotNullParameter(aggregateSeriesRecord, "$this$aggregateSeriesRecord");
                    List<SpeedRecord.Sample> samples = aggregateSeriesRecord.getSamples();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(samples, 10));
                    for (SpeedRecord.Sample sample : samples) {
                        arrayList.add(new SampleInfo(sample.getTime(), sample.getSpeed().getMetersPerSecond()));
                    }
                    return arrayList;
                }
            }, continuation);
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class))) {
            return SeriesRecordAggregationExtensionsKt.aggregateSeriesRecord(healthConnectClient, Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class), withFilteredMetrics, new Function1<StepsCadenceRecord, List<? extends SampleInfo>>() { // from class: androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$aggregate$4
                @Override // kotlin.jvm.functions.Function1
                public final List<SampleInfo> invoke(StepsCadenceRecord aggregateSeriesRecord) {
                    Intrinsics.checkNotNullParameter(aggregateSeriesRecord, "$this$aggregateSeriesRecord");
                    List<StepsCadenceRecord.Sample> samples = aggregateSeriesRecord.getSamples();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(samples, 10));
                    for (StepsCadenceRecord.Sample sample : samples) {
                        arrayList.add(new SampleInfo(sample.getTime(), sample.getRate()));
                    }
                    return arrayList;
                }
            }, continuation);
        }
        throw new IllegalStateException(("Invalid record type for aggregation fallback: " + kClass).toString());
    }

    public static final <T extends Record> Flow<List<T>> readRecordsFlow(HealthConnectClient healthConnectClient, ReadRecordsRequest<T> request) {
        Intrinsics.checkNotNullParameter(healthConnectClient, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flow(new HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1(request, healthConnectClient, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r5.getEndTime().isAfter(androidx.health.connect.client.impl.platform.TimeExtensionsKt.toInstantWithDefaultZoneFallback(r6.getLocalStartTime(), r5.getEndZoneOffset())) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r5.getEndTime().isAfter(r6.getStartTime()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean overlaps(IntervalRecord intervalRecord, TimeRangeFilter timeRangeFilter) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(intervalRecord, "<this>");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "timeRangeFilter");
        if (TimeExtensionsKt.useLocalTime(timeRangeFilter)) {
            z = timeRangeFilter.getLocalEndTime() == null || intervalRecord.getStartTime().isBefore(TimeExtensionsKt.toInstantWithDefaultZoneFallback(timeRangeFilter.getLocalEndTime(), intervalRecord.getStartZoneOffset()));
            if (timeRangeFilter.getLocalStartTime() != null) {
            }
            z2 = true;
        } else {
            z = timeRangeFilter.getEndTime() == null || intervalRecord.getStartTime().isBefore(timeRangeFilter.getEndTime());
            if (timeRangeFilter.getStartTime() != null) {
            }
            z2 = true;
        }
        return z && z2;
    }

    public static final TimeRangeFilter withBufferedStart(TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "<this>");
        Instant startTime = timeRangeFilter.getStartTime();
        Instant minus = startTime != null ? startTime.minus((TemporalAmount) RECORD_START_TIME_BUFFER) : null;
        Instant endTime = timeRangeFilter.getEndTime();
        LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
        return new TimeRangeFilter(minus, endTime, localStartTime != null ? localStartTime.minus((TemporalAmount) RECORD_START_TIME_BUFFER) : null, timeRangeFilter.getLocalEndTime());
    }

    public static final AggregationResult emptyAggregationResult() {
        return new AggregationResult(MapsKt.emptyMap(), MapsKt.emptyMap(), SetsKt.emptySet());
    }
}
