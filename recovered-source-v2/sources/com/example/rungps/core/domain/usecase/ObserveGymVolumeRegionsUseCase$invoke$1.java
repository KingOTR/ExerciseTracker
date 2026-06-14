package com.example.rungps.core.domain.usecase;

import com.example.rungps.core.domain.gateway.ExerciseTrackerGateway;
import com.example.rungps.data.GymSessionEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: GymUseCases.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "", "", "it", "", "Lcom/example/rungps/data/GymSessionEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.core.domain.usecase.ObserveGymVolumeRegionsUseCase$invoke$1", f = "GymUseCases.kt", i = {}, l = {11}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ObserveGymVolumeRegionsUseCase$invoke$1 extends SuspendLambda implements Function2<List<? extends GymSessionEntity>, Continuation<? super Map<String, ? extends Float>>, Object> {
    final /* synthetic */ int $days;
    int label;
    final /* synthetic */ ObserveGymVolumeRegionsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveGymVolumeRegionsUseCase$invoke$1(ObserveGymVolumeRegionsUseCase observeGymVolumeRegionsUseCase, int i, Continuation<? super ObserveGymVolumeRegionsUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = observeGymVolumeRegionsUseCase;
        this.$days = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ObserveGymVolumeRegionsUseCase$invoke$1(this.this$0, this.$days, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends GymSessionEntity> list, Continuation<? super Map<String, ? extends Float>> continuation) {
        return invoke2((List<GymSessionEntity>) list, (Continuation<? super Map<String, Float>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<GymSessionEntity> list, Continuation<? super Map<String, Float>> continuation) {
        return ((ObserveGymVolumeRegionsUseCase$invoke$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExerciseTrackerGateway exerciseTrackerGateway;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            exerciseTrackerGateway = this.this$0.gateway;
            this.label = 1;
            obj = exerciseTrackerGateway.gymVolumeByRegion(this.$days, this);
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
}
