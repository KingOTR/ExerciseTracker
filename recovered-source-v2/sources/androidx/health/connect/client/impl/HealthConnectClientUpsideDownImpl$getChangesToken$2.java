package androidx.health.connect.client.impl;

import android.health.connect.changelog.ChangeLogTokenResponse;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.request.ChangesTokenRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroid/health/connect/changelog/ChangeLogTokenResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$getChangesToken$2", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HealthConnectClientUpsideDownImpl$getChangesToken$2 extends SuspendLambda implements Function1<Continuation<? super ChangeLogTokenResponse>, Object> {
    final /* synthetic */ ChangesTokenRequest $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$getChangesToken$2(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, ChangesTokenRequest changesTokenRequest, Continuation<? super HealthConnectClientUpsideDownImpl$getChangesToken$2> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = changesTokenRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$getChangesToken$2(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ChangeLogTokenResponse> continuation) {
        return ((HealthConnectClientUpsideDownImpl$getChangesToken$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
            ChangesTokenRequest changesTokenRequest = this.$request;
            this.L$0 = healthConnectClientUpsideDownImpl;
            this.L$1 = changesTokenRequest;
            this.label = 1;
            HealthConnectClientUpsideDownImpl$getChangesToken$2 healthConnectClientUpsideDownImpl$getChangesToken$2 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(healthConnectClientUpsideDownImpl$getChangesToken$2), 1);
            cancellableContinuationImpl.initCancellability();
            healthConnectClientUpsideDownImpl.healthConnectManager.getChangeLogToken(RequestConvertersKt.toPlatformRequest(changesTokenRequest), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(healthConnectClientUpsideDownImpl$getChangesToken$2);
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
