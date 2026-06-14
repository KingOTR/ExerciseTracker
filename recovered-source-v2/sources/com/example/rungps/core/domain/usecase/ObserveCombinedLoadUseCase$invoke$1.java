package com.example.rungps.core.domain.usecase;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lcom/example/rungps/data/GymSessionEntity;", "Lcom/example/rungps/data/RunEntity;", "Lcom/example/rungps/data/SoccerSessionEntity;", "gym", "runs", "soccer"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveCombinedLoadUseCase$invoke$1", f = "HomeUseCases.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObserveCombinedLoadUseCase$invoke$1 extends SuspendLambda implements Function4<List<? extends GymSessionEntity>, List<? extends RunEntity>, List<? extends SoccerSessionEntity>, Continuation<? super Triple<? extends List<? extends GymSessionEntity>, ? extends List<? extends RunEntity>, ? extends List<? extends SoccerSessionEntity>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    ObserveCombinedLoadUseCase$invoke$1(Continuation<? super ObserveCombinedLoadUseCase$invoke$1> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(List<? extends GymSessionEntity> list, List<? extends RunEntity> list2, List<? extends SoccerSessionEntity> list3, Continuation<? super Triple<? extends List<? extends GymSessionEntity>, ? extends List<? extends RunEntity>, ? extends List<? extends SoccerSessionEntity>>> continuation) {
        return invoke2((List<GymSessionEntity>) list, (List<RunEntity>) list2, (List<SoccerSessionEntity>) list3, (Continuation<? super Triple<? extends List<GymSessionEntity>, ? extends List<RunEntity>, ? extends List<SoccerSessionEntity>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<GymSessionEntity> list, List<RunEntity> list2, List<SoccerSessionEntity> list3, Continuation<? super Triple<? extends List<GymSessionEntity>, ? extends List<RunEntity>, ? extends List<SoccerSessionEntity>>> continuation) {
        ObserveCombinedLoadUseCase$invoke$1 observeCombinedLoadUseCase$invoke$1 = new ObserveCombinedLoadUseCase$invoke$1(continuation);
        observeCombinedLoadUseCase$invoke$1.L$0 = list;
        observeCombinedLoadUseCase$invoke$1.L$1 = list2;
        observeCombinedLoadUseCase$invoke$1.L$2 = list3;
        return observeCombinedLoadUseCase$invoke$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Triple((List) this.L$0, (List) this.L$1, (List) this.L$2);
    }
}
