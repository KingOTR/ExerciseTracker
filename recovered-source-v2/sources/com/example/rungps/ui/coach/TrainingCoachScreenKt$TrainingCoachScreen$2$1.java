package com.example.rungps.ui.coach;

import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.RaceTrendCalculator;
import com.example.rungps.data.Repository;
import com.google.api.Endpoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$2$1", f = "TrainingCoachScreen.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Map<Double, Long>> $distancePbs$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<RaceTrendCalculator.Snapshot> $snap$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrainingCoachScreenKt$TrainingCoachScreen$2$1(Repository repository, MutableState<RaceTrendCalculator.Snapshot> mutableState, MutableState<Map<Double, Long>> mutableState2, Continuation<? super TrainingCoachScreenKt$TrainingCoachScreen$2$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$snap$delegate = mutableState;
        this.$distancePbs$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingCoachScreenKt$TrainingCoachScreen$2$1(this.$repo, this.$snap$delegate, this.$distancePbs$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrainingCoachScreenKt$TrainingCoachScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TrainingCoachScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$2$1$1", f = "TrainingCoachScreen.kt", i = {}, l = {Endpoint.TARGET_FIELD_NUMBER, 102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Map<Double, Long>> $distancePbs$delegate;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ MutableState<RaceTrendCalculator.Snapshot> $snap$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, MutableState<RaceTrendCalculator.Snapshot> mutableState, MutableState<Map<Double, Long>> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$snap$delegate = mutableState;
            this.$distancePbs$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$snap$delegate, this.$distancePbs$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableState<RaceTrendCalculator.Snapshot> mutableState;
            MutableState<Map<Double, Long>> mutableState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableState = this.$snap$delegate;
                this.L$0 = mutableState;
                this.label = 1;
                obj = RaceTrendCalculator.INSTANCE.buildSnapshot(this.$repo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState2 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState2.setValue((Map) obj);
                    return Unit.INSTANCE;
                }
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableState.setValue((RaceTrendCalculator.Snapshot) obj);
            MutableState<Map<Double, Long>> mutableState3 = this.$distancePbs$delegate;
            this.L$0 = mutableState3;
            this.label = 2;
            Object mergedDistancePbsKm = this.$repo.mergedDistancePbsKm(this);
            if (mergedDistancePbsKm == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = mergedDistancePbsKm;
            mutableState2 = mutableState3;
            mutableState2.setValue((Map) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$snap$delegate, this.$distancePbs$delegate, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
