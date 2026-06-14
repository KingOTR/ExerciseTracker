package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.analytics.CalendarWeekBounds;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.core.domain.gateway.StravaTrainingSession;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "<destruct>", "Lkotlin/Triple;", "", "Lcom/example/rungps/data/GymSessionEntity;", "Lcom/example/rungps/data/RunEntity;", "Lcom/example/rungps/data/SoccerSessionEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveCombinedLoadUseCase$invoke$2", f = "HomeUseCases.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {50, 51, 52, 53}, m = "invokeSuspend", n = {"runs", "soccer", "recentGym", "now", "runs", "soccer", "recentGym", "sets", "now", "runs", "soccer", "recentGym", "sets", "strava", "now"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: classes3.dex */
final class ObserveCombinedLoadUseCase$invoke$2 extends SuspendLambda implements Function2<Triple<? extends List<? extends GymSessionEntity>, ? extends List<? extends RunEntity>, ? extends List<? extends SoccerSessionEntity>>, Continuation<? super CombinedLoadSnapshot>, Object> {
    long J$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ObserveCombinedLoadUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveCombinedLoadUseCase$invoke$2(ObserveCombinedLoadUseCase observeCombinedLoadUseCase, Continuation<? super ObserveCombinedLoadUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = observeCombinedLoadUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveCombinedLoadUseCase$invoke$2 observeCombinedLoadUseCase$invoke$2 = new ObserveCombinedLoadUseCase$invoke$2(this.this$0, continuation);
        observeCombinedLoadUseCase$invoke$2.L$0 = obj;
        return observeCombinedLoadUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Triple<? extends List<? extends GymSessionEntity>, ? extends List<? extends RunEntity>, ? extends List<? extends SoccerSessionEntity>> triple, Continuation<? super CombinedLoadSnapshot> continuation) {
        return invoke2((Triple<? extends List<GymSessionEntity>, ? extends List<RunEntity>, ? extends List<SoccerSessionEntity>>) triple, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Triple<? extends List<GymSessionEntity>, ? extends List<RunEntity>, ? extends List<SoccerSessionEntity>> triple, Continuation<? super CombinedLoadSnapshot> continuation) {
        return ((ObserveCombinedLoadUseCase$invoke$2) create(triple, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        ExerciseTrackerGateway exerciseTrackerGateway;
        Object obj2;
        List<RunEntity> list;
        List<GymSessionEntity> list2;
        List<SoccerSessionEntity> list3;
        Map<Long, ? extends List<GymSetEntity>> map;
        ExerciseTrackerGateway exerciseTrackerGateway2;
        List<StravaTrainingSession> emptyList;
        ExerciseTrackerGateway exerciseTrackerGateway3;
        Object stravaTrainingSessions;
        Map<Long, ? extends List<GymSetEntity>> map2;
        List<StravaTrainingSession> list4;
        long j2;
        ExerciseTrackerGateway exerciseTrackerGateway4;
        Object steps7dTotal;
        HomeAnalyticsPort homeAnalyticsPort;
        Function0 function0;
        ExerciseTrackerGateway exerciseTrackerGateway5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Triple triple = (Triple) this.L$0;
            List list5 = (List) triple.component1();
            List<RunEntity> list6 = (List) triple.component2();
            List<SoccerSessionEntity> list7 = (List) triple.component3();
            long currentTimeMillis = System.currentTimeMillis();
            j = currentTimeMillis;
            long weekStartMs$default = CalendarWeekBounds.weekStartMs$default(CalendarWeekBounds.INSTANCE, currentTimeMillis, null, 2, null);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list5) {
                GymSessionEntity gymSessionEntity = (GymSessionEntity) obj3;
                Long endedAtMs = gymSessionEntity.getEndedAtMs();
                if ((endedAtMs != null ? endedAtMs.longValue() : gymSessionEntity.getStartedAtMs()) >= weekStartMs$default) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (((GymSessionEntity) obj4).getEndedAtMs() != null) {
                    arrayList3.add(obj4);
                }
            }
            exerciseTrackerGateway = this.this$0.gateway;
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
            }
            this.L$0 = list6;
            this.L$1 = list7;
            this.L$2 = arrayList2;
            this.J$0 = j;
            this.label = 1;
            obj2 = exerciseTrackerGateway.setsForSessionsGrouped(arrayList5, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list6;
            list2 = arrayList2;
            list3 = list7;
        } else if (i == 1) {
            long j3 = this.J$0;
            List<GymSessionEntity> list8 = (List) this.L$2;
            list3 = (List) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            j = j3;
            obj2 = obj;
            list2 = list8;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                j2 = this.J$0;
                list4 = (List) this.L$4;
                map2 = (Map) this.L$3;
                list2 = (List) this.L$2;
                list3 = (List) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                steps7dTotal = obj;
                long j4 = j2;
                List<GymSessionEntity> list9 = list2;
                List<RunEntity> list10 = list;
                List<StravaTrainingSession> list11 = list4;
                long longValue = ((Number) steps7dTotal).longValue();
                homeAnalyticsPort = this.this$0.analytics;
                function0 = this.this$0.sportLabel;
                String str = (String) function0.invoke();
                exerciseTrackerGateway5 = this.this$0.gateway;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                Object combinedLoad = homeAnalyticsPort.combinedLoad(list9, map2, list10, list3, list11, str, new AnonymousClass1(exerciseTrackerGateway5), j4, longValue, this);
                return combinedLoad != coroutine_suspended ? coroutine_suspended : combinedLoad;
            }
            long j5 = this.J$0;
            map = (Map) this.L$3;
            list2 = (List) this.L$2;
            list3 = (List) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            j = j5;
            stravaTrainingSessions = obj;
            emptyList = (List) stravaTrainingSessions;
            map2 = map;
            list4 = emptyList;
            j2 = j;
            exerciseTrackerGateway4 = this.this$0.gateway;
            this.L$0 = list;
            this.L$1 = list3;
            this.L$2 = list2;
            this.L$3 = map2;
            this.L$4 = list4;
            this.J$0 = j2;
            this.label = 3;
            steps7dTotal = exerciseTrackerGateway4.steps7dTotal(j2, this);
            if (steps7dTotal == coroutine_suspended) {
                return coroutine_suspended;
            }
            long j42 = j2;
            List<GymSessionEntity> list92 = list2;
            List<RunEntity> list102 = list;
            List<StravaTrainingSession> list112 = list4;
            long longValue2 = ((Number) steps7dTotal).longValue();
            homeAnalyticsPort = this.this$0.analytics;
            function0 = this.this$0.sportLabel;
            String str2 = (String) function0.invoke();
            exerciseTrackerGateway5 = this.this$0.gateway;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            Object combinedLoad2 = homeAnalyticsPort.combinedLoad(list92, map2, list102, list3, list112, str2, new AnonymousClass1(exerciseTrackerGateway5), j42, longValue2, this);
            if (combinedLoad2 != coroutine_suspended) {
            }
        }
        map = (Map) obj2;
        exerciseTrackerGateway2 = this.this$0.gateway;
        if (exerciseTrackerGateway2.isStravaConnected()) {
            exerciseTrackerGateway3 = this.this$0.gateway;
            this.L$0 = list;
            this.L$1 = list3;
            this.L$2 = list2;
            this.L$3 = map;
            this.J$0 = j;
            this.label = 2;
            stravaTrainingSessions = exerciseTrackerGateway3.stravaTrainingSessions(this);
            if (stravaTrainingSessions == coroutine_suspended) {
                return coroutine_suspended;
            }
            emptyList = (List) stravaTrainingSessions;
            map2 = map;
            list4 = emptyList;
            j2 = j;
            exerciseTrackerGateway4 = this.this$0.gateway;
            this.L$0 = list;
            this.L$1 = list3;
            this.L$2 = list2;
            this.L$3 = map2;
            this.L$4 = list4;
            this.J$0 = j2;
            this.label = 3;
            steps7dTotal = exerciseTrackerGateway4.steps7dTotal(j2, this);
            if (steps7dTotal == coroutine_suspended) {
            }
            long j422 = j2;
            List<GymSessionEntity> list922 = list2;
            List<RunEntity> list1022 = list;
            List<StravaTrainingSession> list1122 = list4;
            long longValue22 = ((Number) steps7dTotal).longValue();
            homeAnalyticsPort = this.this$0.analytics;
            function0 = this.this$0.sportLabel;
            String str22 = (String) function0.invoke();
            exerciseTrackerGateway5 = this.this$0.gateway;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            Object combinedLoad22 = homeAnalyticsPort.combinedLoad(list922, map2, list1022, list3, list1122, str22, new AnonymousClass1(exerciseTrackerGateway5), j422, longValue22, this);
            if (combinedLoad22 != coroutine_suspended) {
            }
        } else {
            emptyList = CollectionsKt.emptyList();
            map2 = map;
            list4 = emptyList;
            j2 = j;
            exerciseTrackerGateway4 = this.this$0.gateway;
            this.L$0 = list;
            this.L$1 = list3;
            this.L$2 = list2;
            this.L$3 = map2;
            this.L$4 = list4;
            this.J$0 = j2;
            this.label = 3;
            steps7dTotal = exerciseTrackerGateway4.steps7dTotal(j2, this);
            if (steps7dTotal == coroutine_suspended) {
            }
            long j4222 = j2;
            List<GymSessionEntity> list9222 = list2;
            List<RunEntity> list10222 = list;
            List<StravaTrainingSession> list11222 = list4;
            long longValue222 = ((Number) steps7dTotal).longValue();
            homeAnalyticsPort = this.this$0.analytics;
            function0 = this.this$0.sportLabel;
            String str222 = (String) function0.invoke();
            exerciseTrackerGateway5 = this.this$0.gateway;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            Object combinedLoad222 = homeAnalyticsPort.combinedLoad(list9222, map2, list10222, list3, list11222, str222, new AnonymousClass1(exerciseTrackerGateway5), j4222, longValue222, this);
            if (combinedLoad222 != coroutine_suspended) {
            }
        }
    }

    /* compiled from: HomeUseCases.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.core.domain.usecase.ObserveCombinedLoadUseCase$invoke$2$1, reason: invalid class name */
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
