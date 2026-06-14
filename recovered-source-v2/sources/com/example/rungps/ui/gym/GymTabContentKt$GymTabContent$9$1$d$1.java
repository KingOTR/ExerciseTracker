package com.example.rungps.ui.gym;

import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/GymDayTemplateEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$d$1", f = "GymTabContent.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$9$1$d$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymDayTemplateEntity>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ GymSessionEntity $wip;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$9$1$d$1(Repository repository, GymSessionEntity gymSessionEntity, Continuation<? super GymTabContentKt$GymTabContent$9$1$d$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$wip = gymSessionEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$9$1$d$1(this.$repo, this.$wip, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymDayTemplateEntity> continuation) {
        return ((GymTabContentKt$GymTabContent$9$1$d$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            Long templateDayId = this.$wip.getTemplateDayId();
            Intrinsics.checkNotNull(templateDayId);
            this.label = 1;
            obj = repository.dayTemplateById(templateDayId.longValue(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
