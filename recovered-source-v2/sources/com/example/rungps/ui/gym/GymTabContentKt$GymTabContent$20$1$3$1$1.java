package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
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

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$1$1", f = "GymTabContent.kt", i = {}, l = {386, 387}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<String>> $currentMuscles$delegate;
    final /* synthetic */ MutableState<Boolean> $currentUni$delegate;
    final /* synthetic */ String $exName;
    final /* synthetic */ Repository $repo;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$3$1$1(Repository repository, String str, MutableState<List<String>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$3$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$exName = str;
        this.$currentMuscles$delegate = mutableState;
        this.$currentUni$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$3$1$1(this.$repo, this.$exName, this.$currentMuscles$delegate, this.$currentUni$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$1$1$1", f = "GymTabContent.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ String $exName;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$exName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$exName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.orderedMuscleGroupsForExercise(this.$exName, this);
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
        MutableState<List<String>> mutableState;
        MutableState<Boolean> mutableState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$currentMuscles$delegate;
            this.L$0 = mutableState;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$exName, null), this);
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
                GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$13$lambda$7(mutableState2, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((List) obj);
        MutableState<Boolean> mutableState3 = this.$currentUni$delegate;
        this.L$0 = mutableState3;
        this.label = 2;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, this.$exName, null), this);
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = withContext;
        mutableState2 = mutableState3;
        GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$13$lambda$7(mutableState2, ((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$1$1$2", f = "GymTabContent.kt", i = {}, l = {387}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$3$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $exName;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$exName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$exName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.isExerciseUnilateral(this.$exName, this);
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
