package androidx.health.connect.client.impl;

import androidx.health.connect.client.records.Record;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {180}, m = "readRecord", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientUpsideDownImpl$readRecord$1<T extends Record> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$readRecord$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, Continuation<? super HealthConnectClientUpsideDownImpl$readRecord$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readRecord(null, null, this);
    }
}
