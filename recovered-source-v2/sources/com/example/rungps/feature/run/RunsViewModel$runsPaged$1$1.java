package com.example.rungps.feature.run;

import com.example.rungps.data.RunEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/feature/run/RunRow;", "it", "Lcom/example/rungps/data/RunEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$runsPaged$1$1", f = "RunsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunsViewModel$runsPaged$1$1 extends SuspendLambda implements Function2<RunEntity, Continuation<? super RunRow>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RunsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunsViewModel$runsPaged$1$1(RunsViewModel runsViewModel, Continuation<? super RunsViewModel$runsPaged$1$1> continuation) {
        super(2, continuation);
        this.this$0 = runsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunsViewModel$runsPaged$1$1 runsViewModel$runsPaged$1$1 = new RunsViewModel$runsPaged$1$1(this.this$0, continuation);
        runsViewModel$runsPaged$1$1.L$0 = obj;
        return runsViewModel$runsPaged$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RunEntity runEntity, Continuation<? super RunRow> continuation) {
        return ((RunsViewModel$runsPaged$1$1) create(runEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RunRow row;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        row = this.this$0.toRow((RunEntity) this.L$0);
        return row;
    }
}
