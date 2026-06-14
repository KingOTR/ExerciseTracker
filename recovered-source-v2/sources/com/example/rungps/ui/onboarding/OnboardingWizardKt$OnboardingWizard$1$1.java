package com.example.rungps.ui.onboarding;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnboardingWizard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$1$1", f = "OnboardingWizard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OnboardingWizardKt$OnboardingWizard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function0<Unit> $onRequestHealthConnect;
    final /* synthetic */ Function0<Unit> $onRequestRuntimePermissions;
    final /* synthetic */ MutableIntState $step$delegate;
    final /* synthetic */ List<OnboardingStep> $steps;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingWizardKt$OnboardingWizard$1$1(List<OnboardingStep> list, Context context, Function0<Unit> function0, Function0<Unit> function02, MutableIntState mutableIntState, Continuation<? super OnboardingWizardKt$OnboardingWizard$1$1> continuation) {
        super(2, continuation);
        this.$steps = list;
        this.$ctx = context;
        this.$onRequestRuntimePermissions = function0;
        this.$onRequestHealthConnect = function02;
        this.$step$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingWizardKt$OnboardingWizard$1$1(this.$steps, this.$ctx, this.$onRequestRuntimePermissions, this.$onRequestHealthConnect, this.$step$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingWizardKt$OnboardingWizard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int OnboardingWizard$lambda$1;
        int OnboardingWizard$lambda$12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<OnboardingStep> list = this.$steps;
        OnboardingWizard$lambda$1 = OnboardingWizardKt.OnboardingWizard$lambda$1(this.$step$delegate);
        if (list.get(OnboardingWizard$lambda$1).getShowRuntimeGrant() && !OnboardingPermissions.INSTANCE.hasAllRuntimePermissions(this.$ctx)) {
            this.$onRequestRuntimePermissions.invoke();
        } else {
            List<OnboardingStep> list2 = this.$steps;
            OnboardingWizard$lambda$12 = OnboardingWizardKt.OnboardingWizard$lambda$1(this.$step$delegate);
            if (list2.get(OnboardingWizard$lambda$12).getShowHealthGrant()) {
                this.$onRequestHealthConnect.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
