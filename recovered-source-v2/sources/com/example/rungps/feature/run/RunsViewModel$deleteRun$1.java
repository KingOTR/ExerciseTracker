package com.example.rungps.feature.run;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$deleteRun$1", f = "RunsViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunsViewModel$deleteRun$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $runId;
    int label;
    final /* synthetic */ RunsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunsViewModel$deleteRun$1(RunsViewModel runsViewModel, long j, Continuation<? super RunsViewModel$deleteRun$1> continuation) {
        super(2, continuation);
        this.this$0 = runsViewModel;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunsViewModel$deleteRun$1(this.this$0, this.$runId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunsViewModel$deleteRun$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.useCases.getDeleteRun().invoke(this.$runId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getUiEvents().tryEmit("Deleted run #" + this.$runId);
        } catch (Exception e) {
            MutableSharedFlow<String> uiEvents = this.this$0.getUiEvents();
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            uiEvents.tryEmit("Delete failed: " + message);
        }
        return Unit.INSTANCE;
    }
}
