package com.example.rungps.ui.main;

import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunDetailsPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/RunEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsPanel$1$1$run$1", f = "RunDetailsPanel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunDetailsPanelKt$RunDetailsPanel$1$1$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RunEntity>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ long $runId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDetailsPanelKt$RunDetailsPanel$1$1$run$1(Repository repository, long j, Continuation<? super RunDetailsPanelKt$RunDetailsPanel$1$1$run$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunDetailsPanelKt$RunDetailsPanel$1$1$run$1(this.$repo, this.$runId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RunEntity> continuation) {
        return ((RunDetailsPanelKt$RunDetailsPanel$1$1$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.runById(this.$runId, this);
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
