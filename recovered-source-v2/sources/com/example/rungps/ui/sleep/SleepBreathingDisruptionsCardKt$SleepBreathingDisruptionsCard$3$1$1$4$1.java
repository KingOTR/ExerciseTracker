package com.example.rungps.ui.sleep;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
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

/* compiled from: SleepBreathingDisruptionsCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1", f = "SleepBreathingDisruptionsCard.kt", i = {0}, l = {164, 165}, m = "invokeSuspend", n = {"$this$pointerInput"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $inBedMinutes;
    final /* synthetic */ MutableIntState $selectedMinute$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1(int i, MutableIntState mutableIntState, Continuation<? super SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1> continuation) {
        super(2, continuation);
        this.$inBedMinutes = i;
        this.$selectedMinute$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1 sleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1 = new SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1(this.$inBedMinutes, this.$selectedMinute$delegate, continuation);
        sleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1.L$0 = obj;
        return sleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final PointerInputScope pointerInputScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pointerInputScope = (PointerInputScope) this.L$0;
            final int i2 = this.$inBedMinutes;
            final MutableIntState mutableIntState = this.$selectedMinute$delegate;
            this.L$0 = pointerInputScope;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1.invokeSuspend$lambda$0(PointerInputScope.this, i2, mutableIntState, (Offset) obj2);
                    return invokeSuspend$lambda$0;
                }
            }, this, 7, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            pointerInputScope = (PointerInputScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        final PointerInputScope pointerInputScope2 = pointerInputScope;
        final int i3 = this.$inBedMinutes;
        final MutableIntState mutableIntState2 = this.$selectedMinute$delegate;
        this.L$0 = null;
        this.label = 2;
        if (DragGestureDetectorKt.detectHorizontalDragGestures$default(pointerInputScope2, null, null, null, new Function2() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1.invokeSuspend$lambda$1(PointerInputScope.this, i3, mutableIntState2, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                return invokeSuspend$lambda$1;
            }
        }, this, 7, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private static final void invokeSuspend$selectAt(PointerInputScope pointerInputScope, int i, MutableIntState mutableIntState, float f) {
        int i2 = i - 1;
        mutableIntState.setIntValue(RangesKt.coerceIn((int) (RangesKt.coerceIn(f / IntSize.m6473getWidthimpl(pointerInputScope.getBoundsSize()), 0.0f, 1.0f) * i2), 0, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PointerInputScope pointerInputScope, int i, MutableIntState mutableIntState, Offset offset) {
        invokeSuspend$selectAt(pointerInputScope, i, mutableIntState, Offset.m3602getXimpl(offset.getPackedValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(PointerInputScope pointerInputScope, int i, MutableIntState mutableIntState, PointerInputChange pointerInputChange, float f) {
        pointerInputChange.consume();
        invokeSuspend$selectAt(pointerInputScope, i, mutableIntState, Offset.m3602getXimpl(pointerInputChange.getPosition()));
        return Unit.INSTANCE;
    }
}
