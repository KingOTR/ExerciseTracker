package com.example.rungps.ui.gym;

import android.content.Context;
import com.example.rungps.MainActivity;
import com.example.rungps.gym.GymActiveSessionForegroundService;
import com.example.rungps.sleep.BatteryOptimizationNudge;
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

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$4$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MainActivity $mainAct;
    final /* synthetic */ Long $openSessionId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$4$1(Long l, Context context, MainActivity mainActivity, Continuation<? super GymTabContentKt$GymTabContent$4$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$ctx = context;
        this.$mainAct = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymTabContentKt$GymTabContent$4$1 gymTabContentKt$GymTabContent$4$1 = new GymTabContentKt$GymTabContent$4$1(this.$openSessionId, this.$ctx, this.$mainAct, continuation);
        gymTabContentKt$GymTabContent$4$1.L$0 = obj;
        return gymTabContentKt$GymTabContent$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$openSessionId != null) {
            BatteryOptimizationNudge.INSTANCE.requestExemptionIfNeeded(this.$ctx);
            Context context = this.$ctx;
            Long l = this.$openSessionId;
            try {
                Result.Companion companion = Result.INSTANCE;
                GymActiveSessionForegroundService.INSTANCE.start(context, l.longValue());
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            MainActivity mainActivity = this.$mainAct;
            if (mainActivity != null) {
                mainActivity.syncRecordingLockScreen$app_sideload();
            }
        }
        return Unit.INSTANCE;
    }
}
