package com.example.rungps.ui.sleep;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.Collection;
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
import org.maplibre.android.style.layers.Property;

/* compiled from: SleepChartGestures.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepChartGesturesKt$sleepChartTouchPriority$1", f = "SleepChartGestures.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepChartGesturesKt$sleepChartTouchPriority$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    SleepChartGesturesKt$sleepChartTouchPriority$1(Continuation<? super SleepChartGesturesKt$sleepChartTouchPriority$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepChartGesturesKt$sleepChartTouchPriority$1 sleepChartGesturesKt$sleepChartTouchPriority$1 = new SleepChartGesturesKt$sleepChartTouchPriority$1(continuation);
        sleepChartGesturesKt$sleepChartTouchPriority$1.L$0 = obj;
        return sleepChartGesturesKt$sleepChartTouchPriority$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((SleepChartGesturesKt$sleepChartTouchPriority$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SleepChartGestures.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepChartGesturesKt$sleepChartTouchPriority$1$1", f = "SleepChartGestures.kt", i = {0, 1, 1, 1, 1}, l = {22, 26}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "axisLocked", Property.TEXT_WRITING_MODE_HORIZONTAL}, s = {"L$0", "L$0", "L$1", "I$0", "I$1"})
    /* renamed from: com.example.rungps.ui.sleep.SleepChartGesturesKt$sleepChartTouchPriority$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[LOOP:1: B:30:0x00f4->B:32:0x00fa, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0060 -> B:6:0x0063). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            PointerInputChange pointerInputChange;
            AwaitPointerEventScope awaitPointerEventScope2;
            int i;
            int i2;
            List<PointerInputChange> changes;
            Iterator<T> it;
            Iterator<T> it2;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, PointerEventPass.Initial, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    i2 = this.I$0;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    if (i2 == 0) {
                        Iterator<T> it3 = pointerEvent.getChanges().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (PointerId.m5032equalsimpl0(((PointerInputChange) obj2).getId(), pointerInputChange.getId())) {
                                break;
                            }
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 == null) {
                            pointerInputChange2 = (PointerInputChange) CollectionsKt.first((List) pointerEvent.getChanges());
                        }
                        long m3606minusMKHz9U = Offset.m3606minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange.getPosition());
                        if (((float) Math.sqrt((Offset.m3602getXimpl(m3606minusMKHz9U) * Offset.m3602getXimpl(m3606minusMKHz9U)) + (Offset.m3603getYimpl(m3606minusMKHz9U) * Offset.m3603getYimpl(m3606minusMKHz9U)))) > awaitPointerEventScope2.getViewConfiguration().getTouchSlop()) {
                            i = Math.abs(Offset.m3602getXimpl(m3606minusMKHz9U)) > Math.abs(Offset.m3603getYimpl(m3606minusMKHz9U)) ? 1 : 0;
                            i2 = 1;
                        }
                    }
                    if (i2 != 0 && i != 0) {
                        it2 = pointerEvent.getChanges().iterator();
                        while (it2.hasNext()) {
                            ((PointerInputChange) it2.next()).consume();
                        }
                    }
                    changes = pointerEvent.getChanges();
                    if ((changes instanceof Collection) || !changes.isEmpty()) {
                        it = changes.iterator();
                        while (it.hasNext()) {
                            if (((PointerInputChange) it.next()).getPressed()) {
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange;
                                this.I$0 = i2;
                                this.I$1 = i;
                                this.label = 2;
                                obj = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Initial, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                PointerEvent pointerEvent2 = (PointerEvent) obj;
                                if (i2 == 0) {
                                }
                                if (i2 != 0) {
                                    it2 = pointerEvent2.getChanges().iterator();
                                    while (it2.hasNext()) {
                                    }
                                }
                                changes = pointerEvent2.getChanges();
                                if (changes instanceof Collection) {
                                }
                                it = changes.iterator();
                                while (it.hasNext()) {
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            pointerInputChange = (PointerInputChange) obj;
            awaitPointerEventScope2 = awaitPointerEventScope;
            i = 0;
            i2 = 0;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            obj = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Initial, this);
            if (obj == coroutine_suspended) {
            }
            PointerEvent pointerEvent22 = (PointerEvent) obj;
            if (i2 == 0) {
            }
            if (i2 != 0) {
            }
            changes = pointerEvent22.getChanges();
            if (changes instanceof Collection) {
            }
            it = changes.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new AnonymousClass1(null), this) == coroutine_suspended) {
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
