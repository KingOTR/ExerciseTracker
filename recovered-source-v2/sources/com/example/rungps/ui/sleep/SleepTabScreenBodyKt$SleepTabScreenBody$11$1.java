package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepAlarmScheduler;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.sleep.SleepOvernightStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$11$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $alarmHour$delegate;
    final /* synthetic */ MutableState<Integer> $alarmMinute$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableState<Float> $windowMin$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$11$1(Context context, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<Integer> mutableState3, MutableState<Float> mutableState4, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$11$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$trackingActive$delegate = mutableState;
        this.$alarmHour$delegate = mutableState2;
        this.$alarmMinute$delegate = mutableState3;
        this.$windowMin$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$11$1(this.$ctx, this.$trackingActive$delegate, this.$alarmHour$delegate, this.$alarmMinute$delegate, this.$windowMin$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean SleepTabScreenBody$lambda$49;
        int SleepTabScreenBody$lambda$56;
        int SleepTabScreenBody$lambda$60;
        float SleepTabScreenBody$lambda$64;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SleepTabScreenBody$lambda$49 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$49(this.$trackingActive$delegate);
            if (!SleepTabScreenBody$lambda$49 && !SleepOvernightStore.INSTANCE.isActive(this.$ctx)) {
                SleepListenService.Companion companion = SleepListenService.INSTANCE;
                SleepTabScreenBody$lambda$56 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$56(this.$alarmHour$delegate);
                SleepTabScreenBody$lambda$60 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$60(this.$alarmMinute$delegate);
                long computeAlarmTargetMs$default = SleepListenService.Companion.computeAlarmTargetMs$default(companion, SleepTabScreenBody$lambda$56, SleepTabScreenBody$lambda$60, null, 4, null);
                SleepAlarmScheduler sleepAlarmScheduler = SleepAlarmScheduler.INSTANCE;
                Context context = this.$ctx;
                SleepTabScreenBody$lambda$64 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$64(this.$windowMin$delegate);
                sleepAlarmScheduler.scheduleBackupAlarms(context, computeAlarmTargetMs$default, MathKt.roundToInt(SleepTabScreenBody$lambda$64));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
