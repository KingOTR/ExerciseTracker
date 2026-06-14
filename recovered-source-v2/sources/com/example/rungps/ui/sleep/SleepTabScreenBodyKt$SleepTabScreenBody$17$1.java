package com.example.rungps.ui.sleep;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;
import com.example.rungps.MainActivity;
import com.example.rungps.sleep.SleepOvernightStore;
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
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$17$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$17$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$17$1(Context context, MutableState<Boolean> mutableState, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$17$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$showWakeMood$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$17$1(this.$ctx, this.$showWakeMood$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$17$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$ctx;
        MainActivity mainActivity = context instanceof MainActivity ? (MainActivity) context : null;
        if (mainActivity != null && (intent = mainActivity.getIntent()) != null && intent.getBooleanExtra("sleep_wake_prompt", false)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(this.$showWakeMood$delegate, true);
            mainActivity.getIntent().removeExtra("sleep_wake_prompt");
        } else if (SleepOvernightStore.INSTANCE.alarmFired(this.$ctx) || SleepOvernightStore.INSTANCE.isRecoverableStale(this.$ctx)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(this.$showWakeMood$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
