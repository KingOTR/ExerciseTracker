package androidx.health.connect.client.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {0, 0}, l = {146}, m = "deleteRecords", n = {"recordIdsList", "clientRecordIdsList"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class HealthConnectClientImpl$deleteRecords$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientImpl$deleteRecords$1(HealthConnectClientImpl healthConnectClientImpl, Continuation<? super HealthConnectClientImpl$deleteRecords$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteRecords(null, null, null, this);
    }
}
