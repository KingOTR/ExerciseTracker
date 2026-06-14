package com.example.rungps.ui.components;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ScrollSafeAlarmTimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1", f = "ScrollSafeAlarmTimePicker.kt", i = {}, l = {116, 119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $holding$delegate;
    final /* synthetic */ Function0<Unit> $onStep;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1(Function0<Unit> function0, MutableState<Boolean> mutableState, Continuation<? super ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1> continuation) {
        super(2, continuation);
        this.$onStep = function0;
        this.$holding$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1(this.$onStep, this.$holding$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScrollSafeAlarmTimePickerKt$HoldRepeatStepButton$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x003d */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean HoldRepeatStepButton$lambda$17;
        boolean HoldRepeatStepButton$lambda$172;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HoldRepeatStepButton$lambda$17 = ScrollSafeAlarmTimePickerKt.HoldRepeatStepButton$lambda$17(this.$holding$delegate);
            if (!HoldRepeatStepButton$lambda$17) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (DelayKt.delay(350L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        while (HoldRepeatStepButton$lambda$172) {
            this.$onStep.invoke();
            this.label = 2;
            if (DelayKt.delay(75L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
