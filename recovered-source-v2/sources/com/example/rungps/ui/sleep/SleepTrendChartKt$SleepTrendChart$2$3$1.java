package com.example.rungps.ui.sleep;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import com.example.rungps.data.SleepEntryEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: SleepTrendChart.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$2$3$1", f = "SleepTrendChart.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTrendChartKt$SleepTrendChart$2$3$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $activeIdx$delegate;
    final /* synthetic */ List<SleepEntryEntity> $data;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTrendChartKt$SleepTrendChart$2$3$1(List<SleepEntryEntity> list, MutableIntState mutableIntState, Continuation<? super SleepTrendChartKt$SleepTrendChart$2$3$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.$activeIdx$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTrendChartKt$SleepTrendChart$2$3$1 sleepTrendChartKt$SleepTrendChart$2$3$1 = new SleepTrendChartKt$SleepTrendChart$2$3$1(this.$data, this.$activeIdx$delegate, continuation);
        sleepTrendChartKt$SleepTrendChart$2$3$1.L$0 = obj;
        return sleepTrendChartKt$SleepTrendChart$2$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SleepTrendChartKt$SleepTrendChart$2$3$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final List<SleepEntryEntity> list = this.$data;
            final MutableIntState mutableIntState = this.$activeIdx$delegate;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.example.rungps.ui.sleep.SleepTrendChartKt$SleepTrendChart$2$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SleepTrendChartKt$SleepTrendChart$2$3$1.invokeSuspend$lambda$0(PointerInputScope.this, list, mutableIntState, (Offset) obj2);
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
    public static final Unit invokeSuspend$lambda$0(PointerInputScope pointerInputScope, List list, MutableIntState mutableIntState, Offset offset) {
        int SleepTrendChart$lambda$7;
        int coerceIn = RangesKt.coerceIn((int) ((Offset.m3602getXimpl(offset.getPackedValue()) / RangesKt.coerceAtLeast(IntSize.m6473getWidthimpl(pointerInputScope.getBoundsSize()), 1.0f)) * list.size()), 0, CollectionsKt.getLastIndex(list));
        SleepTrendChart$lambda$7 = SleepTrendChartKt.SleepTrendChart$lambda$7(mutableIntState);
        if (SleepTrendChart$lambda$7 == coerceIn) {
            coerceIn = -1;
        }
        mutableIntState.setIntValue(coerceIn);
        return Unit.INSTANCE;
    }
}
