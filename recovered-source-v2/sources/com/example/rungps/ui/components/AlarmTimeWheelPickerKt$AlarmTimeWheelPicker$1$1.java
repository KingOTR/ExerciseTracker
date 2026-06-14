package com.example.rungps.ui.components;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AlarmTimeWheelPicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1", f = "AlarmTimeWheelPicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $minute;
    final /* synthetic */ Function1<Integer, Unit> $onMinuteChange;
    final /* synthetic */ int $snappedMinute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1(int i, int i2, Function1<? super Integer, Unit> function1, Continuation<? super AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1> continuation) {
        super(2, continuation);
        this.$minute = i;
        this.$snappedMinute = i2;
        this.$onMinuteChange = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1(this.$minute, this.$snappedMinute, this.$onMinuteChange, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlarmTimeWheelPickerKt$AlarmTimeWheelPicker$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.$minute;
        int i2 = this.$snappedMinute;
        if (i != i2) {
            this.$onMinuteChange.invoke(Boxing.boxInt(i2));
        }
        return Unit.INSTANCE;
    }
}
