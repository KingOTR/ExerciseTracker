package com.example.rungps.feature.run;

import com.example.rungps.core.domain.gateway.ReclassifyWatchResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$reclassifyWatchRunToSoccer$2", f = "RunsViewModel.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunsViewModel$reclassifyWatchRunToSoccer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDone;
    final /* synthetic */ long $runId;
    int label;
    final /* synthetic */ RunsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunsViewModel$reclassifyWatchRunToSoccer$2(RunsViewModel runsViewModel, long j, Function0<Unit> function0, Continuation<? super RunsViewModel$reclassifyWatchRunToSoccer$2> continuation) {
        super(2, continuation);
        this.this$0 = runsViewModel;
        this.$runId = j;
        this.$onDone = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunsViewModel$reclassifyWatchRunToSoccer$2(this.this$0, this.$runId, this.$onDone, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunsViewModel$reclassifyWatchRunToSoccer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.useCases.getReclassifyWatchRunToSoccer().invoke(this.$runId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ReclassifyWatchResult reclassifyWatchResult = (ReclassifyWatchResult) obj;
        if (reclassifyWatchResult instanceof ReclassifyWatchResult.Ok) {
            this.this$0.getUiEvents().tryEmit(((ReclassifyWatchResult.Ok) reclassifyWatchResult).getMessage());
            this.$onDone.invoke();
        } else {
            if (!(reclassifyWatchResult instanceof ReclassifyWatchResult.Err)) {
                throw new NoWhenBranchMatchedException();
            }
            Boxing.boxBoolean(this.this$0.getUiEvents().tryEmit(((ReclassifyWatchResult.Err) reclassifyWatchResult).getMessage()));
        }
        return Unit.INSTANCE;
    }
}
