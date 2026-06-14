package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$19$1", f = "GymTabContent.kt", i = {0}, l = {349, 350}, m = "invokeSuspend", n = {"ex"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$19$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $exerciseName$delegate;
    final /* synthetic */ MutableState<GymSetEntity> $lastBest$delegate;
    final /* synthetic */ MutableState<ExercisePr> $pr$delegate;
    final /* synthetic */ Repository $repo;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$19$1(MutableState<String> mutableState, Repository repository, MutableState<ExercisePr> mutableState2, MutableState<GymSetEntity> mutableState3, Continuation<? super GymTabContentKt$GymTabContent$19$1> continuation) {
        super(2, continuation);
        this.$exerciseName$delegate = mutableState;
        this.$repo = repository;
        this.$pr$delegate = mutableState2;
        this.$lastBest$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$19$1(this.$exerciseName$delegate, this.$repo, this.$pr$delegate, this.$lastBest$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$19$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String GymTabContent$lambda$6;
        MutableState<ExercisePr> mutableState;
        String str;
        ExercisePr exercisePr;
        MutableState<GymSetEntity> mutableState2;
        MutableState<GymSetEntity> mutableState3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        GymSetEntity gymSetEntity = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$6 = GymTabContentKt.GymTabContent$lambda$6(this.$exerciseName$delegate);
            String obj2 = StringsKt.trim((CharSequence) GymTabContent$lambda$6).toString();
            mutableState = this.$pr$delegate;
            if (obj2.length() == 0) {
                str = obj2;
                exercisePr = null;
                mutableState.setValue(exercisePr);
                mutableState2 = this.$lastBest$delegate;
                if (str.length() != 0) {
                    this.L$0 = mutableState2;
                    this.L$1 = null;
                    this.label = 2;
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, str, null), this);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = withContext;
                    mutableState3 = mutableState2;
                    gymSetEntity = (GymSetEntity) obj;
                    mutableState2 = mutableState3;
                }
                mutableState2.setValue(gymSetEntity);
                return Unit.INSTANCE;
            }
            this.L$0 = obj2;
            this.L$1 = mutableState;
            this.label = 1;
            Object withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, obj2, null), this);
            if (withContext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = obj2;
            obj = withContext2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState3 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                gymSetEntity = (GymSetEntity) obj;
                mutableState2 = mutableState3;
                mutableState2.setValue(gymSetEntity);
                return Unit.INSTANCE;
            }
            mutableState = (MutableState) this.L$1;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        exercisePr = (ExercisePr) obj;
        mutableState.setValue(exercisePr);
        mutableState2 = this.$lastBest$delegate;
        if (str.length() != 0) {
        }
        mutableState2.setValue(gymSetEntity);
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/ExercisePr;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$19$1$1", f = "GymTabContent.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$19$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExercisePr>, Object> {
        final /* synthetic */ String $ex;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$ex = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$ex, continuation);
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
                obj = this.$repo.prForExercise(this.$ex, this);
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

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/GymSetEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$19$1$2", f = "GymTabContent.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$19$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymSetEntity>, Object> {
        final /* synthetic */ String $ex;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$ex = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$ex, continuation);
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
                obj = this.$repo.lastBestSetForExercise(this.$ex, this);
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
