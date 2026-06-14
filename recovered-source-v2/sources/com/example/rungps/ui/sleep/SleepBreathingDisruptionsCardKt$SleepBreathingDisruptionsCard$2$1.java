package com.example.rungps.ui.sleep;

import androidx.compose.runtime.MutableIntState;
import com.example.rungps.sleep.SleepMinuteEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepBreathingDisruptionsCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1", f = "SleepBreathingDisruptionsCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SleepMinuteEvent> $disturbanceEvents;
    final /* synthetic */ List<SleepMinuteEvent> $events;
    final /* synthetic */ int $inBedMinutes;
    final /* synthetic */ MutableIntState $selectedMinute$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1(List<SleepMinuteEvent> list, List<SleepMinuteEvent> list2, int i, MutableIntState mutableIntState, Continuation<? super SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1> continuation) {
        super(2, continuation);
        this.$disturbanceEvents = list;
        this.$events = list2;
        this.$inBedMinutes = i;
        this.$selectedMinute$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1(this.$disturbanceEvents, this.$events, this.$inBedMinutes, this.$selectedMinute$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int minuteIndex;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) CollectionsKt.firstOrNull((List) this.$disturbanceEvents);
        if (sleepMinuteEvent != null) {
            minuteIndex = sleepMinuteEvent.getMinuteIndex();
        } else {
            Iterator<T> it = this.$events.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                SleepMinuteEvent sleepMinuteEvent2 = (SleepMinuteEvent) obj2;
                if (sleepMinuteEvent2.getSnore() || sleepMinuteEvent2.getTalk()) {
                    break;
                }
            }
            SleepMinuteEvent sleepMinuteEvent3 = (SleepMinuteEvent) obj2;
            minuteIndex = sleepMinuteEvent3 != null ? sleepMinuteEvent3.getMinuteIndex() : 0;
        }
        this.$selectedMinute$delegate.setIntValue(RangesKt.coerceIn(minuteIndex, 0, this.$inBedMinutes - 1));
        return Unit.INSTANCE;
    }
}
