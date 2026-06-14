package com.example.rungps.ui.main;

import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.Repository;
import java.util.List;
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

/* compiled from: GymProgressTabBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1", f = "GymProgressTabBody.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, List<ExerciseHistoryPoint>, Unit> $onHistoryExercise;
    final /* synthetic */ ExercisePr $p;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1(Function2<? super String, ? super List<ExerciseHistoryPoint>, Unit> function2, ExercisePr exercisePr, Repository repository, Continuation<? super GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1> continuation) {
        super(2, continuation);
        this.$onHistoryExercise = function2;
        this.$p = exercisePr;
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1(this.$onHistoryExercise, this.$p, this.$repo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1$points$1(this.$repo, this.$p, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$onHistoryExercise.invoke(this.$p.getExerciseName(), (List) obj);
        return Unit.INSTANCE;
    }
}
