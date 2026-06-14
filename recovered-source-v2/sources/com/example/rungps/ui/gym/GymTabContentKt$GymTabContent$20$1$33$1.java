package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
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
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$33$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$33$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allTemplateSetsFilled;
    final /* synthetic */ MutableState<Boolean> $autoFinishPrompted$delegate;
    final /* synthetic */ MutableState<Boolean> $showAutoFinishConfirm$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$33$1(boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$33$1> continuation) {
        super(2, continuation);
        this.$allTemplateSetsFilled = z;
        this.$autoFinishPrompted$delegate = mutableState;
        this.$showAutoFinishConfirm$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$33$1(this.$allTemplateSetsFilled, this.$autoFinishPrompted$delegate, this.$showAutoFinishConfirm$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$33$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean invoke$lambda$264$lambda$113;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$allTemplateSetsFilled) {
            invoke$lambda$264$lambda$113 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$113(this.$autoFinishPrompted$delegate);
            if (!invoke$lambda$264$lambda$113) {
                GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$114(this.$autoFinishPrompted$delegate, true);
                GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$111(this.$showAutoFinishConfirm$delegate, true);
            }
        }
        return Unit.INSTANCE;
    }
}
