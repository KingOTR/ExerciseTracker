package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.SleepEntryEntity;
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
import kotlin.jvm.functions.Function3;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\"\u0010\u0002\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/core/domain/usecase/ReadinessFlowBundle;", "<destruct>", "Lkotlin/Triple;", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "Lcom/example/rungps/data/GymSessionEntity;", "Lcom/example/rungps/data/SleepEntryEntity;", "Lcom/example/rungps/data/SoccerSessionEntity;", "", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveDailyReadinessUseCase$invoke$3", f = "HomeUseCases.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObserveDailyReadinessUseCase$invoke$3 extends SuspendLambda implements Function3<Triple<? extends List<? extends RecoveryEventEntity>, ? extends List<? extends GymSessionEntity>, ? extends List<? extends SleepEntryEntity>>, Triple<? extends List<? extends SoccerSessionEntity>, ? extends Long, ? extends CombinedLoadSnapshot>, Continuation<? super ReadinessFlowBundle>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    ObserveDailyReadinessUseCase$invoke$3(Continuation<? super ObserveDailyReadinessUseCase$invoke$3> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Triple<? extends List<? extends RecoveryEventEntity>, ? extends List<? extends GymSessionEntity>, ? extends List<? extends SleepEntryEntity>> triple, Triple<? extends List<? extends SoccerSessionEntity>, ? extends Long, ? extends CombinedLoadSnapshot> triple2, Continuation<? super ReadinessFlowBundle> continuation) {
        return invoke2((Triple<? extends List<RecoveryEventEntity>, ? extends List<GymSessionEntity>, ? extends List<SleepEntryEntity>>) triple, (Triple<? extends List<SoccerSessionEntity>, Long, CombinedLoadSnapshot>) triple2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Triple<? extends List<RecoveryEventEntity>, ? extends List<GymSessionEntity>, ? extends List<SleepEntryEntity>> triple, Triple<? extends List<SoccerSessionEntity>, Long, CombinedLoadSnapshot> triple2, Continuation<? super ReadinessFlowBundle> continuation) {
        ObserveDailyReadinessUseCase$invoke$3 observeDailyReadinessUseCase$invoke$3 = new ObserveDailyReadinessUseCase$invoke$3(continuation);
        observeDailyReadinessUseCase$invoke$3.L$0 = triple;
        observeDailyReadinessUseCase$invoke$3.L$1 = triple2;
        return observeDailyReadinessUseCase$invoke$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Triple triple = (Triple) this.L$0;
        Triple triple2 = (Triple) this.L$1;
        return new ReadinessFlowBundle((List) triple.component1(), (List) triple.component2(), (List) triple.component3(), (List) triple2.component1(), (Long) triple2.component2(), (CombinedLoadSnapshot) triple2.component3());
    }
}
