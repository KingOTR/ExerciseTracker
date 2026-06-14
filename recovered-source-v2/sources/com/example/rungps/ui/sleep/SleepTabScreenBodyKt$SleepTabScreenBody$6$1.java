package com.example.rungps.ui.sleep;

import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepAlarmDismiss;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$6$1", f = "SleepTabScreenBody.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $alarmRinging$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$6$1(MutableState<Boolean> mutableState, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$6$1> continuation) {
        super(2, continuation);
        this.$alarmRinging$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$6$1(this.$alarmRinging$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$160(this.$alarmRinging$delegate, SleepAlarmDismiss.INSTANCE.isRinging());
            this.label = 1;
        } while (DelayKt.delay(800L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
