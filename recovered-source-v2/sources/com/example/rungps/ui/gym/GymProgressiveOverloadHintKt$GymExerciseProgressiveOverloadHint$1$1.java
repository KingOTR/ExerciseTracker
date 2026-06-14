package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
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

/* compiled from: GymProgressiveOverloadHint.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1", f = "GymProgressiveOverloadHint.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING, ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING_MACHINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $exerciseName;
    final /* synthetic */ MutableState<GymSetEntity> $lastBest$delegate;
    final /* synthetic */ MutableState<ExercisePr> $pr$delegate;
    final /* synthetic */ Repository $repo;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1(Repository repository, String str, MutableState<ExercisePr> mutableState, MutableState<GymSetEntity> mutableState2, Continuation<? super GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$exerciseName = str;
        this.$pr$delegate = mutableState;
        this.$lastBest$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1(this.$repo, this.$exerciseName, this.$pr$delegate, this.$lastBest$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GymProgressiveOverloadHint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/ExercisePr;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1$1", f = "GymProgressiveOverloadHint.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExercisePr>, Object> {
        final /* synthetic */ String $exerciseName;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$exerciseName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$exerciseName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExercisePr> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.prForExercise(this.$exerciseName, this);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<ExercisePr> mutableState;
        MutableState<GymSetEntity> mutableState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$pr$delegate;
            this.L$0 = mutableState;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$exerciseName, null), this);
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
                mutableState2.setValue((GymSetEntity) obj);
                return Unit.INSTANCE;
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((ExercisePr) obj);
        MutableState<GymSetEntity> mutableState3 = this.$lastBest$delegate;
        this.L$0 = mutableState3;
        this.label = 2;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, this.$exerciseName, null), this);
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = withContext;
        mutableState2 = mutableState3;
        mutableState2.setValue((GymSetEntity) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: GymProgressiveOverloadHint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/GymSetEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1$2", f = "GymProgressiveOverloadHint.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING_MACHINE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymSetEntity>, Object> {
        final /* synthetic */ String $exerciseName;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$exerciseName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$exerciseName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymSetEntity> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.lastLoggedSetForExercise(this.$exerciseName, this);
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
}
