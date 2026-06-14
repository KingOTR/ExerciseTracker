package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ReadRecordsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: HealthConnectClientAggregationExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1", f = "HealthConnectClientAggregationExtensions.kt", i = {0, 0, 1, 1, 1}, l = {104, 105}, m = "invokeSuspend", n = {"$this$flow", "currentRequest", "$this$flow", "currentRequest", "response"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReadRecordsRequest<T> $request;
    final /* synthetic */ HealthConnectClient $this_readRecordsFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1(ReadRecordsRequest<T> readRecordsRequest, HealthConnectClient healthConnectClient, Continuation<? super HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1> continuation) {
        super(2, continuation);
        this.$request = readRecordsRequest;
        this.$this_readRecordsFlow = healthConnectClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1 healthConnectClientAggregationExtensionsKt$readRecordsFlow$1 = new HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1(this.$request, this.$this_readRecordsFlow, continuation);
        healthConnectClientAggregationExtensionsKt$readRecordsFlow$1.L$0 = obj;
        return healthConnectClientAggregationExtensionsKt$readRecordsFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
        return ((HealthConnectClientAggregationExtensionsKt$readRecordsFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ReadRecordsRequest<T> readRecordsRequest;
        FlowCollector flowCollector2;
        ReadRecordsRequest<T> readRecordsRequest2;
        ReadRecordsResponse readRecordsResponse;
        Object readRecords;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            readRecordsRequest = this.$request;
            this.L$0 = flowCollector;
            this.L$1 = readRecordsRequest;
            this.L$2 = null;
            this.label = 1;
            readRecords = this.$this_readRecordsFlow.readRecords(readRecordsRequest, this);
            if (readRecords != coroutine_suspended) {
            }
        } else if (i == 1) {
            readRecordsRequest = (ReadRecordsRequest) this.L$1;
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector2 = flowCollector3;
            readRecordsRequest2 = readRecordsRequest;
            readRecordsResponse = (ReadRecordsResponse) obj;
            this.L$0 = flowCollector2;
            this.L$1 = readRecordsRequest2;
            this.L$2 = readRecordsResponse;
            this.label = 2;
            if (flowCollector2.emit(readRecordsResponse.getRecords(), this) == coroutine_suspended) {
            }
            flowCollector = flowCollector2;
            readRecordsRequest = readRecordsRequest2.withPageToken$connect_client_release(readRecordsResponse.getPageToken());
            if (readRecordsRequest.getPageToken() == null) {
            }
            this.L$0 = flowCollector;
            this.L$1 = readRecordsRequest;
            this.L$2 = null;
            this.label = 1;
            readRecords = this.$this_readRecordsFlow.readRecords(readRecordsRequest, this);
            if (readRecords != coroutine_suspended) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            readRecordsResponse = (ReadRecordsResponse) this.L$2;
            readRecordsRequest2 = (ReadRecordsRequest) this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            readRecordsRequest = readRecordsRequest2.withPageToken$connect_client_release(readRecordsResponse.getPageToken());
            if (readRecordsRequest.getPageToken() == null) {
                return Unit.INSTANCE;
            }
            this.L$0 = flowCollector;
            this.L$1 = readRecordsRequest;
            this.L$2 = null;
            this.label = 1;
            readRecords = this.$this_readRecordsFlow.readRecords(readRecordsRequest, this);
            if (readRecords != coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            obj = readRecords;
            readRecordsRequest2 = readRecordsRequest;
            readRecordsResponse = (ReadRecordsResponse) obj;
            this.L$0 = flowCollector2;
            this.L$1 = readRecordsRequest2;
            this.L$2 = readRecordsResponse;
            this.label = 2;
            if (flowCollector2.emit(readRecordsResponse.getRecords(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector2;
            readRecordsRequest = readRecordsRequest2.withPageToken$connect_client_release(readRecordsResponse.getPageToken());
            if (readRecordsRequest.getPageToken() == null) {
            }
            this.L$0 = flowCollector;
            this.L$1 = readRecordsRequest;
            this.L$2 = null;
            this.label = 1;
            readRecords = this.$this_readRecordsFlow.readRecords(readRecordsRequest, this);
            if (readRecords != coroutine_suspended) {
            }
        }
    }
}
