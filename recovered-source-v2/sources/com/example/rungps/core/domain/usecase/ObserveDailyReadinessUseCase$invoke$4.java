package com.example.rungps.core.domain.usecase;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.DailyReadinessSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "bundle", "Lcom/example/rungps/core/domain/usecase/ReadinessFlowBundle;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveDailyReadinessUseCase$invoke$4", f = "HomeUseCases.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_WALKING}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObserveDailyReadinessUseCase$invoke$4 extends SuspendLambda implements Function2<ReadinessFlowBundle, Continuation<? super DailyReadinessSnapshot>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObserveDailyReadinessUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveDailyReadinessUseCase$invoke$4(ObserveDailyReadinessUseCase observeDailyReadinessUseCase, Continuation<? super ObserveDailyReadinessUseCase$invoke$4> continuation) {
        super(2, continuation);
        this.this$0 = observeDailyReadinessUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveDailyReadinessUseCase$invoke$4 observeDailyReadinessUseCase$invoke$4 = new ObserveDailyReadinessUseCase$invoke$4(this.this$0, continuation);
        observeDailyReadinessUseCase$invoke$4.L$0 = obj;
        return observeDailyReadinessUseCase$invoke$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReadinessFlowBundle readinessFlowBundle, Continuation<? super DailyReadinessSnapshot> continuation) {
        return ((ObserveDailyReadinessUseCase$invoke$4) create(readinessFlowBundle, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeAnalyticsPort homeAnalyticsPort;
        ExerciseTrackerGateway exerciseTrackerGateway;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReadinessFlowBundle readinessFlowBundle = (ReadinessFlowBundle) this.L$0;
            homeAnalyticsPort = this.this$0.analytics;
            List<RecoveryEventEntity> recovery = readinessFlowBundle.getRecovery();
            List<GymSessionEntity> gym = readinessFlowBundle.getGym();
            List<SleepEntryEntity> sleep = readinessFlowBundle.getSleep();
            List<SoccerSessionEntity> soccer = readinessFlowBundle.getSoccer();
            CombinedLoadSnapshot load = readinessFlowBundle.getLoad();
            Long steps = readinessFlowBundle.getSteps();
            exerciseTrackerGateway = this.this$0.gateway;
            this.label = 1;
            obj = homeAnalyticsPort.dailyReadiness(recovery, gym, sleep, soccer, load, steps, new AnonymousClass1(exerciseTrackerGateway), this);
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

    /* compiled from: HomeUseCases.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.core.domain.usecase.ObserveDailyReadinessUseCase$invoke$4$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<List<? extends RecoveryEventEntity>, Continuation<? super List<? extends RecoveryEventEntity>>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(2, obj, ExerciseTrackerGateway.class, "filterValidRecoveryEvents", "filterValidRecoveryEvents(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends RecoveryEventEntity> list, Continuation<? super List<? extends RecoveryEventEntity>> continuation) {
            return invoke2((List<RecoveryEventEntity>) list, (Continuation<? super List<RecoveryEventEntity>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<RecoveryEventEntity> list, Continuation<? super List<RecoveryEventEntity>> continuation) {
            return ((ExerciseTrackerGateway) this.receiver).filterValidRecoveryEvents(list, continuation);
        }
    }
}
