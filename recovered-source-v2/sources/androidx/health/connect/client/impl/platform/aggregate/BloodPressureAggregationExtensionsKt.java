package androidx.health.connect.client.impl.platform.aggregate;

import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.BloodPressureRecord;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.units.Pressure;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: BloodPressureAggregationExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080@¢\u0006\u0002\u0010\t\"\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"BLOOD_PRESSURE_METRICS", "", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "Landroidx/health/connect/client/units/Pressure;", "aggregateBloodPressure", "Landroidx/health/connect/client/aggregate/AggregationResult;", "Landroidx/health/connect/client/HealthConnectClient;", "aggregateRequest", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BloodPressureAggregationExtensionsKt {
    private static final Set<AggregateMetric<Pressure>> BLOOD_PRESSURE_METRICS = SetsKt.setOf((Object[]) new AggregateMetric[]{BloodPressureRecord.DIASTOLIC_AVG, BloodPressureRecord.DIASTOLIC_MAX, BloodPressureRecord.DIASTOLIC_MIN, BloodPressureRecord.SYSTOLIC_AVG, BloodPressureRecord.SYSTOLIC_MAX, BloodPressureRecord.SYSTOLIC_MIN});

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object aggregateBloodPressure(HealthConnectClient healthConnectClient, AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1 bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1;
        int i;
        BloodPressureAggregator bloodPressureAggregator;
        if (continuation instanceof BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1) {
            bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1 = (BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1) continuation;
            if ((bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.label & Integer.MIN_VALUE) != 0) {
                bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.label -= Integer.MIN_VALUE;
                Object obj = bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final BloodPressureAggregator bloodPressureAggregator2 = new BloodPressureAggregator(aggregateRequest.getMetrics$connect_client_release());
                    Flow readRecordsFlow = HealthConnectClientAggregationExtensionsKt.readRecordsFlow(healthConnectClient, new ReadRecordsRequest(Reflection.getOrCreateKotlinClass(BloodPressureRecord.class), aggregateRequest.getTimeRangeFilter(), aggregateRequest.getDataOriginFilter$connect_client_release(), false, 0, null, 56, null));
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.health.connect.client.impl.platform.aggregate.BloodPressureAggregationExtensionsKt$aggregateBloodPressure$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                            return emit((List<BloodPressureRecord>) obj2, (Continuation<? super Unit>) continuation2);
                        }

                        public final Object emit(List<BloodPressureRecord> list, Continuation<? super Unit> continuation2) {
                            BloodPressureAggregator bloodPressureAggregator3 = BloodPressureAggregator.this;
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                bloodPressureAggregator3.plusAssign((BloodPressureRecord) it.next());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.L$0 = bloodPressureAggregator2;
                    bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.label = 1;
                    if (readRecordsFlow.collect(flowCollector, bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bloodPressureAggregator = bloodPressureAggregator2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bloodPressureAggregator = (BloodPressureAggregator) bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return bloodPressureAggregator.getResult();
            }
        }
        bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1 = new BloodPressureAggregationExtensionsKt$aggregateBloodPressure$1(continuation);
        Object obj2 = bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bloodPressureAggregationExtensionsKt$aggregateBloodPressure$1.label;
        if (i != 0) {
        }
        return bloodPressureAggregator.getResult();
    }
}
