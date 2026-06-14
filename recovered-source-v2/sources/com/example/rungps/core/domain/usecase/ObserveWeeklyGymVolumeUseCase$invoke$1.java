package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.analytics.HomeAnalyticsPort;
import com.example.rungps.core.domain.analytics.WeekVolumeBar;
import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.data.GymSessionEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeUseCases.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/core/domain/analytics/WeekVolumeBar;", "sessions", "Lcom/example/rungps/data/GymSessionEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveWeeklyGymVolumeUseCase$invoke$1", f = "HomeUseCases.kt", i = {0}, l = {28, 29}, m = "invokeSuspend", n = {"recent"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ObserveWeeklyGymVolumeUseCase$invoke$1 extends SuspendLambda implements Function2<List<? extends GymSessionEntity>, Continuation<? super List<? extends WeekVolumeBar>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObserveWeeklyGymVolumeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveWeeklyGymVolumeUseCase$invoke$1(ObserveWeeklyGymVolumeUseCase observeWeeklyGymVolumeUseCase, Continuation<? super ObserveWeeklyGymVolumeUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = observeWeeklyGymVolumeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveWeeklyGymVolumeUseCase$invoke$1 observeWeeklyGymVolumeUseCase$invoke$1 = new ObserveWeeklyGymVolumeUseCase$invoke$1(this.this$0, continuation);
        observeWeeklyGymVolumeUseCase$invoke$1.L$0 = obj;
        return observeWeeklyGymVolumeUseCase$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends GymSessionEntity> list, Continuation<? super List<? extends WeekVolumeBar>> continuation) {
        return invoke2((List<GymSessionEntity>) list, (Continuation<? super List<WeekVolumeBar>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<GymSessionEntity> list, Continuation<? super List<WeekVolumeBar>> continuation) {
        return ((ObserveWeeklyGymVolumeUseCase$invoke$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ExerciseTrackerGateway exerciseTrackerGateway;
        HomeAnalyticsPort homeAnalyticsPort;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            long currentTimeMillis = System.currentTimeMillis() - 2419200000L;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                GymSessionEntity gymSessionEntity = (GymSessionEntity) obj2;
                Long endedAtMs = gymSessionEntity.getEndedAtMs();
                if ((endedAtMs != null ? endedAtMs.longValue() : gymSessionEntity.getStartedAtMs()) >= currentTimeMillis) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((GymSessionEntity) obj3).getEndedAtMs() != null) {
                    arrayList3.add(obj3);
                }
            }
            exerciseTrackerGateway = this.this$0.gateway;
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
            }
            this.L$0 = arrayList;
            this.label = 1;
            obj = exerciseTrackerGateway.setsForSessionsGrouped(arrayList5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        homeAnalyticsPort = this.this$0.analytics;
        this.L$0 = null;
        this.label = 2;
        obj = homeAnalyticsPort.weeklyGymVolumeBars(arrayList, (Map) obj, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
