package com.example.rungps.ui.sleep;

import android.content.Context;
import com.example.rungps.sleep.SleepTravelEta;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1", f = "SleepTabScreenBody.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Pair<Double, Double> $pt;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1(Context context, Pair<Double, Double> pair, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$pt = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1(this.$ctx, this.$pt, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1$addr$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = SleepTravelEta.INSTANCE.saveHomeFromGps(this.$ctx, this.$pt.getFirst().doubleValue(), this.$pt.getSecond().doubleValue(), this);
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
