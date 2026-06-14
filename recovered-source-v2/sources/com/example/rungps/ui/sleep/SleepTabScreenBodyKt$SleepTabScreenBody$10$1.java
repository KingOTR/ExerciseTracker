package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepAlarmPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$10$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $alarmHour$delegate;
    final /* synthetic */ MutableState<Integer> $alarmMinute$delegate;
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$10$1(Context context, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$10$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$alarmHour$delegate = mutableState;
        this.$alarmMinute$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$10$1(this.$ctx, this.$alarmHour$delegate, this.$alarmMinute$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int SleepTabScreenBody$lambda$56;
        int SleepTabScreenBody$lambda$60;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SleepAlarmPreferences sleepAlarmPreferences = SleepAlarmPreferences.INSTANCE;
        Context context = this.$ctx;
        SleepTabScreenBody$lambda$56 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$56(this.$alarmHour$delegate);
        SleepTabScreenBody$lambda$60 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$60(this.$alarmMinute$delegate);
        sleepAlarmPreferences.setAlarmTime(context, SleepTabScreenBody$lambda$56, SleepTabScreenBody$lambda$60);
        return Unit.INSTANCE;
    }
}
