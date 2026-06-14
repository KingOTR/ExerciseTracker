package androidx.health.connect.client.impl;

import android.health.connect.HealthConnectManager;
import android.health.connect.RecordIdFilter;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.records.Record;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientUpsideDownImpl$deleteRecords$2 extends SuspendLambda implements Function1<Continuation<? super Void>, Object> {
    final /* synthetic */ List<String> $clientRecordIdsList;
    final /* synthetic */ List<String> $recordIdsList;
    final /* synthetic */ KClass<? extends Record> $recordType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$deleteRecords$2(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<String> list, List<String> list2, KClass<? extends Record> kClass, Continuation<? super HealthConnectClientUpsideDownImpl$deleteRecords$2> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$recordIdsList = list;
        this.$clientRecordIdsList = list2;
        this.$recordType = kClass;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$deleteRecords$2(this.this$0, this.$recordIdsList, this.$clientRecordIdsList, this.$recordType, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Void> continuation) {
        return ((HealthConnectClientUpsideDownImpl$deleteRecords$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            List<String> list = this.$recordIdsList;
            List<String> list2 = this.$clientRecordIdsList;
            KClass<? extends Record> kClass = this.$recordType;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = list;
            this.L$2 = list2;
            this.L$3 = kClass;
            this.label = 1;
            HealthConnectClientUpsideDownImpl$deleteRecords$2 healthConnectClientUpsideDownImpl$deleteRecords$2 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(healthConnectClientUpsideDownImpl$deleteRecords$2), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
            List createListBuilder = CollectionsKt.createListBuilder();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                createListBuilder.add(RecordIdFilter.fromId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it.next()));
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                createListBuilder.add(RecordIdFilter.fromClientRecordId(RecordConvertersKt.toPlatformRecordClass(kClass), (String) it2.next()));
            }
            healthConnectManager.deleteRecords(CollectionsKt.build(createListBuilder), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl2));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(healthConnectClientUpsideDownImpl$deleteRecords$2);
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
