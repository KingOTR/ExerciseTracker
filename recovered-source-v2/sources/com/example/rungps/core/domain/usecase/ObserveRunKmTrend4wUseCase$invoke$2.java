package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.core.domain.gateway.StravaTrainingSession;
import com.example.rungps.data.RunEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "", "runs", "Lcom/example/rungps/data/RunEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveRunKmTrend4wUseCase$invoke$2", f = "HomeUseCases.kt", i = {0}, l = {109, 110}, m = "invokeSuspend", n = {"runs"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ObserveRunKmTrend4wUseCase$invoke$2 extends SuspendLambda implements Function2<List<? extends RunEntity>, Continuation<? super List<? extends Double>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObserveRunKmTrend4wUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveRunKmTrend4wUseCase$invoke$2(ObserveRunKmTrend4wUseCase observeRunKmTrend4wUseCase, Continuation<? super ObserveRunKmTrend4wUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = observeRunKmTrend4wUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveRunKmTrend4wUseCase$invoke$2 observeRunKmTrend4wUseCase$invoke$2 = new ObserveRunKmTrend4wUseCase$invoke$2(this.this$0, continuation);
        observeRunKmTrend4wUseCase$invoke$2.L$0 = obj;
        return observeRunKmTrend4wUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RunEntity> list, Continuation<? super List<? extends Double>> continuation) {
        return invoke2((List<RunEntity>) list, (Continuation<? super List<Double>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RunEntity> list, Continuation<? super List<Double>> continuation) {
        return ((ObserveRunKmTrend4wUseCase$invoke$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007c A[PHI: r10
  0x007c: PHI (r10v17 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:13:0x0079, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<RunEntity> list;
        ExerciseTrackerGateway exerciseTrackerGateway;
        List<StravaTrainingSession> emptyList;
        ExerciseTrackerGateway exerciseTrackerGateway2;
        HomeAnalyticsPort homeAnalyticsPort;
        boolean z;
        ExerciseTrackerGateway exerciseTrackerGateway3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = (List) this.L$0;
            exerciseTrackerGateway = this.this$0.gateway;
            if (exerciseTrackerGateway.isStravaConnected()) {
                exerciseTrackerGateway2 = this.this$0.gateway;
                this.L$0 = list;
                this.label = 1;
                obj = exerciseTrackerGateway2.stravaTrainingSessions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                emptyList = CollectionsKt.emptyList();
                List<RunEntity> list2 = list;
                homeAnalyticsPort = this.this$0.analytics;
                z = this.this$0.isBike;
                exerciseTrackerGateway3 = this.this$0.gateway;
                this.L$0 = null;
                this.label = 2;
                obj = homeAnalyticsPort.weekTrendKm(list2, emptyList, z, new AnonymousClass1(exerciseTrackerGateway3), this);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        emptyList = (List) obj;
        List<RunEntity> list22 = list;
        homeAnalyticsPort = this.this$0.analytics;
        z = this.this$0.isBike;
        exerciseTrackerGateway3 = this.this$0.gateway;
        this.L$0 = null;
        this.label = 2;
        obj = homeAnalyticsPort.weekTrendKm(list22, emptyList, z, new AnonymousClass1(exerciseTrackerGateway3), this);
        if (obj != coroutine_suspended) {
        }
    }

    /* compiled from: HomeUseCases.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.core.domain.usecase.ObserveRunKmTrend4wUseCase$invoke$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function5<Long, Long, List<? extends RunEntity>, List<? extends StravaTrainingSession>, Continuation<? super Pair<? extends Double, ? extends Double>>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(5, obj, ExerciseTrackerGateway.class, "weekRunRideKm", "weekRunRideKm(JJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(long j, long j2, List<RunEntity> list, List<StravaTrainingSession> list2, Continuation<? super Pair<Double, Double>> continuation) {
            return ((ExerciseTrackerGateway) this.receiver).weekRunRideKm(j, j2, list, list2, continuation);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Long l, Long l2, List<? extends RunEntity> list, List<? extends StravaTrainingSession> list2, Continuation<? super Pair<? extends Double, ? extends Double>> continuation) {
            return invoke(l.longValue(), l2.longValue(), (List<RunEntity>) list, (List<StravaTrainingSession>) list2, (Continuation<? super Pair<Double, Double>>) continuation);
        }
    }
}
