package com.example.rungps.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TimeWheelPicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.TimeWheelPickerKt$NumberWheel$1$1", f = "TimeWheelPicker.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TimeWheelPickerKt$NumberWheel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $centeredIndex$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ int $resolvedValue;
    final /* synthetic */ List<Integer> $values;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeWheelPickerKt$NumberWheel$1$1(List<Integer> list, int i, LazyListState lazyListState, State<Integer> state, Continuation<? super TimeWheelPickerKt$NumberWheel$1$1> continuation) {
        super(2, continuation);
        this.$values = list;
        this.$resolvedValue = i;
        this.$listState = lazyListState;
        this.$centeredIndex$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeWheelPickerKt$NumberWheel$1$1(this.$values, this.$resolvedValue, this.$listState, this.$centeredIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimeWheelPickerKt$NumberWheel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int NumberWheel$lambda$8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int coerceAtLeast = RangesKt.coerceAtLeast(this.$values.indexOf(Boxing.boxInt(this.$resolvedValue)), 0);
            NumberWheel$lambda$8 = TimeWheelPickerKt.NumberWheel$lambda$8(this.$centeredIndex$delegate);
            if (NumberWheel$lambda$8 != coerceAtLeast) {
                this.label = 1;
                if (LazyListState.scrollToItem$default(this.$listState, coerceAtLeast, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
