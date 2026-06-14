package com.example.rungps.sleep;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: SleepCycleLineChart.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1", f = "SleepCycleLineChart.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SleepStageLabel> $displayStages;
    final /* synthetic */ MutableIntState $selectedMinute$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1(List<? extends SleepStageLabel> list, MutableIntState mutableIntState, Continuation<? super SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1> continuation) {
        super(2, continuation);
        this.$displayStages = list;
        this.$selectedMinute$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1 sleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1 = new SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1(this.$displayStages, this.$selectedMinute$delegate, continuation);
        sleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1.L$0 = obj;
        return sleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(pointerInputScope, this.$displayStages, this.$selectedMinute$delegate, null), this) == coroutine_suspended) {
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
    public static final void invokeSuspend$selectAt(PointerInputScope pointerInputScope, List<? extends SleepStageLabel> list, MutableIntState mutableIntState, float f) {
        float m6473getWidthimpl = (IntSize.m6473getWidthimpl(pointerInputScope.getBoundsSize()) - 8.0f) - 8.0f;
        if (m6473getWidthimpl <= 0.0f) {
            return;
        }
        mutableIntState.setIntValue(RangesKt.coerceIn((int) (RangesKt.coerceIn((f - 8.0f) / m6473getWidthimpl, 0.0f, 1.0f) * (list.size() - 1)), 0, CollectionsKt.getLastIndex(list)));
    }

    /* compiled from: SleepCycleLineChart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.sleep.SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1$1", f = "SleepCycleLineChart.kt", i = {0, 1, 1}, l = {187, 191}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.example.rungps.sleep.SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ List<SleepStageLabel> $displayStages;
        final /* synthetic */ MutableIntState $selectedMinute$delegate;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, List<? extends SleepStageLabel> list, MutableIntState mutableIntState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$displayStages = list;
            this.$selectedMinute$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$displayStages, this.$selectedMinute$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:6:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            Iterator<T> it;
            Object obj2;
            PointerInputChange pointerInputChange2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    it = pointerEvent.getChanges().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (PointerId.m5032equalsimpl0(((PointerInputChange) obj2).getId(), pointerInputChange.getId())) {
                            break;
                        }
                    }
                    pointerInputChange2 = (PointerInputChange) obj2;
                    if (pointerInputChange2 == null) {
                        pointerInputChange2 = (PointerInputChange) CollectionsKt.firstOrNull((List) pointerEvent.getChanges());
                    }
                    if (pointerInputChange2 == null && pointerInputChange2.getPressed()) {
                        pointerInputChange2.consume();
                        SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1.invokeSuspend$selectAt(this.$$this$pointerInput, this.$displayStages, this.$selectedMinute$delegate, Offset.m3602getXimpl(pointerInputChange2.getPosition()));
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.label = 2;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        it = pointerEvent2.getChanges().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 == null) {
                        }
                        if (pointerInputChange2 == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
            SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1.invokeSuspend$selectAt(this.$$this$pointerInput, this.$displayStages, this.$selectedMinute$delegate, Offset.m3602getXimpl(pointerInputChange3.getPosition()));
            pointerInputChange3.consume();
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.label = 2;
            obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            PointerEvent pointerEvent22 = (PointerEvent) obj;
            it = pointerEvent22.getChanges().iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            pointerInputChange2 = (PointerInputChange) obj2;
            if (pointerInputChange2 == null) {
            }
            if (pointerInputChange2 == null) {
            }
            return Unit.INSTANCE;
        }
    }
}
