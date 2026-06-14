package com.example.rungps.health;

import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SamsungHealthManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager$ensurePermissionSet$obtained$1", f = "SamsungHealthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SamsungHealthManager$ensurePermissionSet$obtained$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Set<? extends Object>>, Object> {
    final /* synthetic */ Object $future;
    int label;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$ensurePermissionSet$obtained$1(SamsungHealthManager samsungHealthManager, Object obj, Continuation<? super SamsungHealthManager$ensurePermissionSet$obtained$1> continuation) {
        super(2, continuation);
        this.this$0 = samsungHealthManager;
        this.$future = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungHealthManager$ensurePermissionSet$obtained$1(this.this$0, this.$future, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Set<? extends Object>> continuation) {
        return ((SamsungHealthManager$ensurePermissionSet$obtained$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object futureGet;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SamsungHealthManager samsungHealthManager = this.this$0;
        Object obj2 = this.$future;
        Intrinsics.checkNotNull(obj2);
        futureGet = samsungHealthManager.futureGet(obj2);
        Intrinsics.checkNotNull(futureGet, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.Any>");
        return (Set) futureGet;
    }
}
