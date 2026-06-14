package com.example.rungps.ui.components;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: LabeledBarChart.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1", f = "LabeledBarChart.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BarChartValue> $bars;
    final /* synthetic */ Function2<Integer, BarChartValue, Unit> $onBarSelected;
    final /* synthetic */ MutableIntState $selectedIdx$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1(List<BarChartValue> list, Function2<? super Integer, ? super BarChartValue, Unit> function2, MutableIntState mutableIntState, Continuation<? super LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1> continuation) {
        super(2, continuation);
        this.$bars = list;
        this.$onBarSelected = function2;
        this.$selectedIdx$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1 labeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1 = new LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1(this.$bars, this.$onBarSelected, this.$selectedIdx$delegate, continuation);
        labeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1.L$0 = obj;
        return labeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final List<BarChartValue> list = this.$bars;
            final Function2<Integer, BarChartValue, Unit> function2 = this.$onBarSelected;
            final MutableIntState mutableIntState = this.$selectedIdx$delegate;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.example.rungps.ui.components.LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = LabeledBarChartKt$LabeledVerticalBarChart$2$1$1$2$1.invokeSuspend$lambda$0(list, pointerInputScope, function2, mutableIntState, (Offset) obj2);
                    return invokeSuspend$lambda$0;
                }
            }, this, 7, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(List list, PointerInputScope pointerInputScope, Function2 function2, MutableIntState mutableIntState, Offset offset) {
        int LabeledVerticalBarChart$lambda$3;
        int coerceIn = RangesKt.coerceIn((int) (Offset.m3602getXimpl(offset.getPackedValue()) / (IntSize.m6473getWidthimpl(pointerInputScope.getBoundsSize()) / r0)), 0, list.size() - 1);
        LabeledVerticalBarChart$lambda$3 = LabeledBarChartKt.LabeledVerticalBarChart$lambda$3(mutableIntState);
        mutableIntState.setIntValue(LabeledVerticalBarChart$lambda$3 == coerceIn ? -1 : coerceIn);
        if (function2 != null) {
            function2.invoke(Integer.valueOf(coerceIn), list.get(coerceIn));
        }
        return Unit.INSTANCE;
    }
}
