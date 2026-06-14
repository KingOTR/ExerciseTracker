package com.example.rungps.ui.sleep;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.example.rungps.CrashLog;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.sleep.SleepOvernightStore;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$8$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$8$1(Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$8$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$trackingActive$delegate = mutableState;
        this.$showWakeMood$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTabScreenBodyKt$SleepTabScreenBody$8$1 sleepTabScreenBodyKt$SleepTabScreenBody$8$1 = new SleepTabScreenBodyKt$SleepTabScreenBody$8$1(this.$ctx, this.$trackingActive$delegate, this.$showWakeMood$delegate, continuation);
        sleepTabScreenBodyKt$SleepTabScreenBody$8$1.L$0 = obj;
        return sleepTabScreenBodyKt$SleepTabScreenBody$8$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CrashLog.INSTANCE.note(this.$ctx, "sleep_tab_open");
        SleepOvernightStore.INSTANCE.clearSessionIfStale(this.$ctx);
        if (!SleepOvernightStore.INSTANCE.isActive(this.$ctx)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, false);
            return Unit.INSTANCE;
        }
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, true);
        if (SleepOvernightStore.INSTANCE.isRecoverableStale(this.$ctx) || SleepOvernightStore.INSTANCE.alarmFired(this.$ctx)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(this.$showWakeMood$delegate, true);
        }
        Context context = this.$ctx;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepListenService.INSTANCE.resumeIfSessionActive(context);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Context context2 = this.$ctx;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.w(SleepTabComponentsKt.SLEEP_TAB_LOG, "resume overnight session failed — will retry", m7908exceptionOrNullimpl);
            SleepOvernightStore.INSTANCE.recordStopReason(context2, "resume_failed:" + m7908exceptionOrNullimpl.getClass().getSimpleName());
        }
        return Unit.INSTANCE;
    }
}
