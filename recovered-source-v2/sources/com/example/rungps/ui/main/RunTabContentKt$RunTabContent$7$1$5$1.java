package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.health.HealthConnectManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$5$1", f = "RunTabContent.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunTabContentKt$RunTabContent$7$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HealthConnectManager $hc;
    final /* synthetic */ MutableState<Boolean> $hcHasStepsRead$delegate;
    final /* synthetic */ MutableState<Integer> $hcStatus$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunTabContentKt$RunTabContent$7$1$5$1(HealthConnectManager healthConnectManager, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2, Continuation<? super RunTabContentKt$RunTabContent$7$1$5$1> continuation) {
        super(2, continuation);
        this.$hc = healthConnectManager;
        this.$hcStatus$delegate = mutableState;
        this.$hcHasStepsRead$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunTabContentKt$RunTabContent$7$1$5$1 runTabContentKt$RunTabContent$7$1$5$1 = new RunTabContentKt$RunTabContent$7$1$5$1(this.$hc, this.$hcStatus$delegate, this.$hcHasStepsRead$delegate, continuation);
        runTabContentKt$RunTabContent$7$1$5$1.L$0 = obj;
        return runTabContentKt$RunTabContent$7$1$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunTabContentKt$RunTabContent$7$1$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        MutableState<Boolean> mutableState;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$21(this.$hcStatus$delegate, this.$hc.getSdkStatus());
            MutableState<Boolean> mutableState2 = this.$hcHasStepsRead$delegate;
            HealthConnectManager healthConnectManager = this.$hc;
            try {
                Result.Companion companion = Result.INSTANCE;
                this.L$0 = mutableState2;
                this.label = 1;
                Object hasStepsReadPermission = healthConnectManager.hasStepsReadPermission(this);
                if (hasStepsReadPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = hasStepsReadPermission;
                mutableState = mutableState2;
            } catch (Throwable th2) {
                th = th2;
                mutableState = mutableState2;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                Boolean boxBoolean = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$24(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                Boolean boxBoolean2 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$24(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
                return Unit.INSTANCE;
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        Boolean boxBoolean22 = Boxing.boxBoolean(false);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = boxBoolean22;
        }
        RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$24(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
        return Unit.INSTANCE;
    }
}
