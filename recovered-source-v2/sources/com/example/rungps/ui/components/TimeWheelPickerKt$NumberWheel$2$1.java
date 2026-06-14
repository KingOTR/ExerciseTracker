package com.example.rungps.ui.components;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TimeWheelPicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.TimeWheelPickerKt$NumberWheel$2$1", f = "TimeWheelPicker.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TimeWheelPickerKt$NumberWheel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $centeredIndex$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onValueChange;
    final /* synthetic */ int $resolvedValue;
    final /* synthetic */ List<Integer> $values;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimeWheelPickerKt$NumberWheel$2$1(State<Integer> state, List<Integer> list, int i, Function1<? super Integer, Unit> function1, Continuation<? super TimeWheelPickerKt$NumberWheel$2$1> continuation) {
        super(2, continuation);
        this.$centeredIndex$delegate = state;
        this.$values = list;
        this.$resolvedValue = i;
        this.$onValueChange = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeWheelPickerKt$NumberWheel$2$1(this.$centeredIndex$delegate, this.$values, this.$resolvedValue, this.$onValueChange, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimeWheelPickerKt$NumberWheel$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final State<Integer> state = this.$centeredIndex$delegate;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$NumberWheel$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int access$NumberWheel$lambda$8;
                    access$NumberWheel$lambda$8 = TimeWheelPickerKt.access$NumberWheel$lambda$8(State.this);
                    return Integer.valueOf(access$NumberWheel$lambda$8);
                }
            }));
            final List<Integer> list = this.$values;
            final int i2 = this.$resolvedValue;
            final Function1<Integer, Unit> function1 = this.$onValueChange;
            this.label = 1;
            if (distinctUntilChanged.collect(new FlowCollector() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$NumberWheel$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i3, Continuation<? super Unit> continuation) {
                    Integer num = (Integer) CollectionsKt.getOrNull(list, i3);
                    if (num == null) {
                        return Unit.INSTANCE;
                    }
                    int intValue = num.intValue();
                    if (intValue != i2) {
                        function1.invoke(Boxing.boxInt(intValue));
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
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
