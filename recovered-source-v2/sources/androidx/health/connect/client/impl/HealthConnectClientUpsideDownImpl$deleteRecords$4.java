package androidx.health.connect.client.impl;

import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.time.TimeRangeFilter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientUpsideDownImpl$deleteRecords$4 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
    final /* synthetic */ KClass<? extends Record> $recordType;
    final /* synthetic */ TimeRangeFilter $timeRangeFilter;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$deleteRecords$4(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super HealthConnectClientUpsideDownImpl$deleteRecords$4> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$recordType = kClass;
        this.$timeRangeFilter = timeRangeFilter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$deleteRecords$4(this.this$0, this.$recordType, this.$timeRangeFilter, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Void> continuation) {
        return ((HealthConnectClientUpsideDownImpl$deleteRecords$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            KClass<? extends Record> kClass = this.$recordType;
            TimeRangeFilter timeRangeFilter = this.$timeRangeFilter;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = kClass;
            this.L$2 = timeRangeFilter;
            this.label = 1;
            HealthConnectClientUpsideDownImpl$deleteRecords$4 healthConnectClientUpsideDownImpl$deleteRecords$4 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(healthConnectClientUpsideDownImpl$deleteRecords$4), 1);
            cancellableContinuationImpl.initCancellability();
            healthConnectClientUpsideDownImpl.healthConnectManager.deleteRecords(RecordConvertersKt.toPlatformRecordClass(kClass), RequestConvertersKt.toPlatformTimeRangeFilter(timeRangeFilter), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(healthConnectClientUpsideDownImpl$deleteRecords$4);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
