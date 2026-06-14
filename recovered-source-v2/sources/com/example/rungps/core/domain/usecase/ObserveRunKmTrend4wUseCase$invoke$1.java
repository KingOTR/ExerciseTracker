package com.example.rungps.core.domain.usecase;

import com.example.rungps.data.RunEntity;
import com.example.rungps.data.StravaPbEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/RunEntity;", "runs", "<unused var>", "Lcom/example/rungps/data/StravaPbEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveRunKmTrend4wUseCase$invoke$1", f = "HomeUseCases.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObserveRunKmTrend4wUseCase$invoke$1 extends SuspendLambda implements Function3<List<? extends RunEntity>, List<? extends StravaPbEntity>, Continuation<? super List<? extends RunEntity>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    ObserveRunKmTrend4wUseCase$invoke$1(Continuation<? super ObserveRunKmTrend4wUseCase$invoke$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RunEntity> list, List<? extends StravaPbEntity> list2, Continuation<? super List<? extends RunEntity>> continuation) {
        return invoke2((List<RunEntity>) list, (List<StravaPbEntity>) list2, (Continuation<? super List<RunEntity>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RunEntity> list, List<StravaPbEntity> list2, Continuation<? super List<RunEntity>> continuation) {
        ObserveRunKmTrend4wUseCase$invoke$1 observeRunKmTrend4wUseCase$invoke$1 = new ObserveRunKmTrend4wUseCase$invoke$1(continuation);
        observeRunKmTrend4wUseCase$invoke$1.L$0 = list;
        return observeRunKmTrend4wUseCase$invoke$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return (List) this.L$0;
    }
}
