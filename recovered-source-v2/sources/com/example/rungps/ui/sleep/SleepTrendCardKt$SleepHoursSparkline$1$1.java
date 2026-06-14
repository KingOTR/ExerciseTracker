package com.example.rungps.ui.sleep;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
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

/* compiled from: SleepTrendCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTrendCardKt$SleepHoursSparkline$1$1", f = "SleepTrendCard.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTrendCardKt$SleepHoursSparkline$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $onTapIndex;
    final /* synthetic */ List<Float> $points;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SleepTrendCardKt$SleepHoursSparkline$1$1(List<Float> list, Function1<? super Integer, Unit> function1, Continuation<? super SleepTrendCardKt$SleepHoursSparkline$1$1> continuation) {
        super(2, continuation);
        this.$points = list;
        this.$onTapIndex = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTrendCardKt$SleepHoursSparkline$1$1 sleepTrendCardKt$SleepHoursSparkline$1$1 = new SleepTrendCardKt$SleepHoursSparkline$1$1(this.$points, this.$onTapIndex, continuation);
        sleepTrendCardKt$SleepHoursSparkline$1$1.L$0 = obj;
        return sleepTrendCardKt$SleepHoursSparkline$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SleepTrendCardKt$SleepHoursSparkline$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final List<Float> list = this.$points;
            final Function1<Integer, Unit> function1 = this.$onTapIndex;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$SleepHoursSparkline$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SleepTrendCardKt$SleepHoursSparkline$1$1.invokeSuspend$lambda$0(list, pointerInputScope, function1, (Offset) obj2);
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
    public static final Unit invokeSuspend$lambda$0(List list, PointerInputScope pointerInputScope, Function1 function1, Offset offset) {
        int coerceAtLeast = RangesKt.coerceAtLeast(list.size(), 1);
        function1.invoke(Integer.valueOf(RangesKt.coerceIn((int) ((Offset.m3602getXimpl(offset.getPackedValue()) / IntSize.m6473getWidthimpl(pointerInputScope.getBoundsSize())) * coerceAtLeast), 0, coerceAtLeast - 1)));
        return Unit.INSTANCE;
    }
}
