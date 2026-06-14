package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.CyclingPedalingCadenceRecord;
import androidx.health.connect.client.records.SeriesRecord;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: SeriesRecordAggregationExtensions.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0007\u001a\u00020\b\"\f\b\u0000\u0010\t*\u0006\u0012\u0002\b\u00030\u0003*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00022\u0006\u0010\f\u001a\u00020\r2\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f¢\u0006\u0002\b\u0012H\u0080@¢\u0006\u0002\u0010\u0013\"4\u0010\u0000\u001a(\u0012\u0012\u0012\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"RECORDS_TO_AGGREGATE_METRICS_INFO_MAP", "", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/SeriesRecord;", "", "Landroidx/health/connect/client/impl/platform/aggregate/AggregateMetricsInfo;", "", "aggregateSeriesRecord", "Landroidx/health/connect/client/aggregate/AggregationResult;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/HealthConnectClient;", "recordType", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateRequest;", "getSampleInfo", "Lkotlin/Function1;", "", "Landroidx/health/connect/client/impl/platform/aggregate/SampleInfo;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/health/connect/client/HealthConnectClient;Lkotlin/reflect/KClass;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SeriesRecordAggregationExtensionsKt {
    private static final Map<KClass<? extends SeriesRecord<Object>>, AggregateMetricsInfo<? extends Comparable<?>>> RECORDS_TO_AGGREGATE_METRICS_INFO_MAP = MapsKt.mapOf(TuplesKt.to(Reflection.getOrCreateKotlinClass(CyclingPedalingCadenceRecord.class), new AggregateMetricsInfo(CyclingPedalingCadenceRecord.RPM_AVG, CyclingPedalingCadenceRecord.RPM_MIN, CyclingPedalingCadenceRecord.RPM_MAX)), TuplesKt.to(Reflection.getOrCreateKotlinClass(SpeedRecord.class), new AggregateMetricsInfo(SpeedRecord.SPEED_AVG, SpeedRecord.SPEED_MIN, SpeedRecord.SPEED_MAX)), TuplesKt.to(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class), new AggregateMetricsInfo(StepsCadenceRecord.RATE_AVG, StepsCadenceRecord.RATE_MIN, StepsCadenceRecord.RATE_MAX)));

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends SeriesRecord<?>> Object aggregateSeriesRecord(HealthConnectClient healthConnectClient, KClass<T> kClass, final AggregateRequest aggregateRequest, final Function1<? super T, ? extends List<SampleInfo>> function1, Continuation<? super AggregationResult> continuation) {
        SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1 seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1;
        int i;
        SeriesAggregator seriesAggregator;
        if (continuation instanceof SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1) {
            seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1 = (SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1) continuation;
            if ((seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.label & Integer.MIN_VALUE) != 0) {
                seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.label -= Integer.MIN_VALUE;
                Object obj = seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow readRecordsFlow = HealthConnectClientAggregationExtensionsKt.readRecordsFlow(healthConnectClient, new ReadRecordsRequest(kClass, HealthConnectClientAggregationExtensionsKt.withBufferedStart(aggregateRequest.getTimeRangeFilter()), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null));
                    final SeriesAggregator seriesAggregator2 = new SeriesAggregator(kClass, aggregateRequest.getMetrics$connect_client_release());
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                            return emit((List) obj2, (Continuation<? super Unit>) continuation2);
                        }

                        public final Object emit(List<? extends T> list, Continuation<? super Unit> continuation2) {
                            Sequence asSequence = CollectionsKt.asSequence(list);
                            final Function1<T, List<SampleInfo>> function12 = function1;
                            final AggregateRequest aggregateRequest2 = aggregateRequest;
                            Sequence filter = SequencesKt.filter(SequencesKt.map(asSequence, new Function1<T, RecordInfo>() { // from class: androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/health/connect/client/impl/platform/aggregate/RecordInfo; */
                                @Override // kotlin.jvm.functions.Function1
                                public final RecordInfo invoke(SeriesRecord it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    DataOrigin dataOrigin = it.getMetadata().getDataOrigin();
                                    List<SampleInfo> invoke = function12.invoke(it);
                                    AggregateRequest aggregateRequest3 = aggregateRequest2;
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : invoke) {
                                        if (((SampleInfo) t).isWithin(aggregateRequest3.getTimeRangeFilter(), it.getStartZoneOffset())) {
                                            arrayList.add(t);
                                        }
                                    }
                                    return new RecordInfo(dataOrigin, arrayList);
                                }
                            }), new Function1<RecordInfo, Boolean>() { // from class: androidx.health.connect.client.impl.platform.aggregate.SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$2.2
                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(RecordInfo it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Boolean.valueOf(!it.getSamples().isEmpty());
                                }
                            });
                            SeriesAggregator<T> seriesAggregator3 = seriesAggregator2;
                            Iterator<T> it = filter.iterator();
                            while (it.hasNext()) {
                                seriesAggregator3.plusAssign((RecordInfo) it.next());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.L$0 = seriesAggregator2;
                    seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.label = 1;
                    if (readRecordsFlow.collect(flowCollector, seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    seriesAggregator = seriesAggregator2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seriesAggregator = (SeriesAggregator) seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return seriesAggregator.getResult();
            }
        }
        seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1 = new SeriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1(continuation);
        Object obj2 = seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = seriesRecordAggregationExtensionsKt$aggregateSeriesRecord$1.label;
        if (i != 0) {
        }
        return seriesAggregator.getResult();
    }
}
