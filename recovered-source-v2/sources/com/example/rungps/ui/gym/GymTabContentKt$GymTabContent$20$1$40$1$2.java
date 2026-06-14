package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
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
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$40$1$2", f = "GymTabContent.kt", i = {3}, l = {1622, 1624, 1625, 1626, 1627}, m = "invokeSuspend", n = {"refreshed"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$40$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ex;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ Integer $reps;
    final /* synthetic */ long $sid;
    final /* synthetic */ MutableState<List<ExercisePr>> $topPrs$delegate;
    final /* synthetic */ MutableState<List<String>> $untaggedExercises$delegate;
    final /* synthetic */ double $w;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$40$1$2(Repository repository, long j, String str, Integer num, double d, MutableState<List<ExercisePr>> mutableState, MutableState<List<String>> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$40$1$2> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$sid = j;
        this.$ex = str;
        this.$reps = num;
        this.$w = d;
        this.$topPrs$delegate = mutableState;
        this.$untaggedExercises$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$40$1$2(this.$repo, this.$sid, this.$ex, this.$reps, this.$w, this.$topPrs$delegate, this.$untaggedExercises$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$40$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object allPrsHeaviestPerExercise;
        List list;
        Object untaggedExerciseNames;
        List list2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj2 = this.$repo.setsForSession(this.$sid, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 3;
                    allPrsHeaviestPerExercise = this.$repo.allPrsHeaviestPerExercise(this);
                    if (allPrsHeaviestPerExercise == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = (List) allPrsHeaviestPerExercise;
                    this.L$0 = list;
                    this.label = 4;
                    untaggedExerciseNames = this.$repo.untaggedExerciseNames(this);
                    if (untaggedExerciseNames == coroutine_suspended) {
                    }
                    list2 = list;
                    this.L$0 = null;
                    this.label = 5;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list2, (List) untaggedExerciseNames, this.$topPrs$delegate, this.$untaggedExercises$delegate, null), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    allPrsHeaviestPerExercise = obj;
                    list = (List) allPrsHeaviestPerExercise;
                    this.L$0 = list;
                    this.label = 4;
                    untaggedExerciseNames = this.$repo.untaggedExerciseNames(this);
                    if (untaggedExerciseNames == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    this.L$0 = null;
                    this.label = 5;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list2, (List) untaggedExerciseNames, this.$topPrs$delegate, this.$untaggedExercises$delegate, null), this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                untaggedExerciseNames = obj;
                list2 = list;
                this.L$0 = null;
                this.label = 5;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list2, (List) untaggedExerciseNames, this.$topPrs$delegate, this.$untaggedExercises$delegate, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        String str = this.$ex;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (Iterable) obj2) {
            if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj3).getExerciseName(), str)) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        this.label = 2;
        if (this.$repo.addGymSet(this.$sid, this.$ex, size, this.$reps, this.$w, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.label = 3;
        allPrsHeaviestPerExercise = this.$repo.allPrsHeaviestPerExercise(this);
        if (allPrsHeaviestPerExercise == coroutine_suspended) {
        }
        list = (List) allPrsHeaviestPerExercise;
        this.L$0 = list;
        this.label = 4;
        untaggedExerciseNames = this.$repo.untaggedExerciseNames(this);
        if (untaggedExerciseNames == coroutine_suspended) {
        }
        list2 = list;
        this.L$0 = null;
        this.label = 5;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(list2, (List) untaggedExerciseNames, this.$topPrs$delegate, this.$untaggedExercises$delegate, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$40$1$2$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$40$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ExercisePr> $refreshed;
        final /* synthetic */ MutableState<List<ExercisePr>> $topPrs$delegate;
        final /* synthetic */ List<String> $untagged;
        final /* synthetic */ MutableState<List<String>> $untaggedExercises$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<ExercisePr> list, List<String> list2, MutableState<List<ExercisePr>> mutableState, MutableState<List<String>> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$refreshed = list;
            this.$untagged = list2;
            this.$topPrs$delegate = mutableState;
            this.$untaggedExercises$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$refreshed, this.$untagged, this.$topPrs$delegate, this.$untaggedExercises$delegate, continuation);
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
            this.$topPrs$delegate.setValue(this.$refreshed);
            this.$untaggedExercises$delegate.setValue(this.$untagged);
            return Unit.INSTANCE;
        }
    }
}
