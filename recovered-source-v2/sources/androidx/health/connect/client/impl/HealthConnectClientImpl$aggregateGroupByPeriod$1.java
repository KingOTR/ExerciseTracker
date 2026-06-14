package androidx.health.connect.client.impl;

import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthConnectClientImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", i = {}, l = {InputDeviceCompat.SOURCE_KEYBOARD}, m = "aggregateGroupByPeriod", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientImpl$aggregateGroupByPeriod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthConnectClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientImpl$aggregateGroupByPeriod$1(HealthConnectClientImpl healthConnectClientImpl, Continuation<? super HealthConnectClientImpl$aggregateGroupByPeriod$1> continuation) {
        super(continuation);
        this.this$0 = healthConnectClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.aggregateGroupByPeriod(null, this);
    }
}
