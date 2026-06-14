package com.example.rungps.ui.coach;

import android.content.Context;
import android.widget.Toast;
import com.example.rungps.data.Repository;
import com.example.rungps.training.BuiltinTrainingPlans;
import com.example.rungps.training.SavedCoachPlanStore;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1", f = "TrainingCoachScreen.kt", i = {}, l = {386, 391}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ BuiltinTrainingPlans.PlanDefinition $def;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ ZoneId $zone;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1(Context context, BuiltinTrainingPlans.PlanDefinition planDefinition, Repository repository, ZoneId zoneId, Continuation<? super TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$def = planDefinition;
        this.$repo = repository;
        this.$zone = zoneId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1(this.$ctx, this.$def, this.$repo, this.$zone, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SavedCoachPlanStore.INSTANCE.save(this.$ctx, this.$def);
            this.label = 1;
            if (this.$repo.activateTrainingPlan(this.$def.getSlug(), this.$def.getTitle(), Boxing.boxLong(LocalDate.now(this.$zone).toEpochDay()), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$ctx, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: TrainingCoachScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1$1", f = "TrainingCoachScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$ctx, "Plan saved — follow below", 1).show();
            return Unit.INSTANCE;
        }
    }
}
