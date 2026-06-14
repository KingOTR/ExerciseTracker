package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymCarryoverEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.GymCarryover;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$30$1", f = "GymTabContent.kt", i = {}, l = {1166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$30$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ExerciseTemplateEntity>> $activeDayExercises$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ List<GymCarryoverEntity> $sessionCarryover;
    final /* synthetic */ State<List<GymSetEntity>> $sessionSets$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$20$1$30$1(List<GymCarryoverEntity> list, Repository repository, MutableState<List<ExerciseTemplateEntity>> mutableState, State<? extends List<GymSetEntity>> state, Continuation<? super GymTabContentKt$GymTabContent$20$1$30$1> continuation) {
        super(2, continuation);
        this.$sessionCarryover = list;
        this.$repo = repository;
        this.$activeDayExercises$delegate = mutableState;
        this.$sessionSets$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$30$1(this.$sessionCarryover, this.$repo, this.$activeDayExercises$delegate, this.$sessionSets$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$30$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$sessionCarryover.isEmpty()) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$sessionCarryover, this.$repo, this.$activeDayExercises$delegate, this.$sessionSets$delegate, null), this) == coroutine_suspended) {
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

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$30$1$1", f = "GymTabContent.kt", i = {}, l = {1183}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$30$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<List<ExerciseTemplateEntity>> $activeDayExercises$delegate;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ List<GymCarryoverEntity> $sessionCarryover;
        final /* synthetic */ State<List<GymSetEntity>> $sessionSets$delegate;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<GymCarryoverEntity> list, Repository repository, MutableState<List<ExerciseTemplateEntity>> mutableState, State<? extends List<GymSetEntity>> state, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sessionCarryover = list;
            this.$repo = repository;
            this.$activeDayExercises$delegate = mutableState;
            this.$sessionSets$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sessionCarryover, this.$repo, this.$activeDayExercises$delegate, this.$sessionSets$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x016b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003f A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MutableState<List<ExerciseTemplateEntity>> mutableState;
            Iterator it;
            Repository repository;
            State<List<GymSetEntity>> state;
            List GymTabContent$lambda$132;
            Object obj2;
            List invoke$lambda$264$lambda$92;
            long id;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<GymCarryoverEntity> list = this.$sessionCarryover;
                Repository repository2 = this.$repo;
                mutableState = this.$activeDayExercises$delegate;
                State<List<GymSetEntity>> state2 = this.$sessionSets$delegate;
                it = list.iterator();
                repository = repository2;
                state = state2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$3;
                state = (State) this.L$2;
                mutableState = (MutableState) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                GymCarryoverEntity gymCarryoverEntity = (GymCarryoverEntity) it.next();
                GymTabContent$lambda$132 = GymTabContentKt.GymTabContent$lambda$132(mutableState);
                Iterator it2 = GymTabContent$lambda$132.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (ExerciseNameNormalizer.INSTANCE.matches(gymCarryoverEntity.getExerciseName(), ((ExerciseTemplateEntity) obj2).getName())) {
                        break;
                    }
                }
                ExerciseTemplateEntity exerciseTemplateEntity = (ExerciseTemplateEntity) obj2;
                int coerceIn = exerciseTemplateEntity != null ? RangesKt.coerceIn(exerciseTemplateEntity.getDefaultSets(), 1, 10) : 3;
                List<Integer> decodeIndices = GymCarryover.INSTANCE.decodeIndices(gymCarryoverEntity.getOwedSetIndices(), coerceIn);
                invoke$lambda$264$lambda$92 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(state);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : invoke$lambda$264$lambda$92) {
                    if (ExerciseNameNormalizer.INSTANCE.matches(((GymSetEntity) obj3).getExerciseName(), gymCarryoverEntity.getExerciseName())) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (StringsKt.isBlank(gymCarryoverEntity.getOwedSetIndices())) {
                    ArrayList arrayList3 = arrayList2;
                    int i2 = 0;
                    if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            if (GymCarryover.INSTANCE.isSetFilled((GymSetEntity) it3.next()) && (i2 = i2 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i2 >= coerceIn) {
                        id = gymCarryoverEntity.getId();
                        this.L$0 = repository;
                        this.L$1 = mutableState;
                        this.L$2 = state;
                        this.L$3 = it;
                        this.label = 1;
                        if (repository.deleteGymCarryover(id, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        continue;
                    }
                } else {
                    List<Integer> list2 = decodeIndices;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            int intValue = ((Number) it4.next()).intValue();
                            ArrayList<GymSetEntity> arrayList4 = arrayList2;
                            if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                                for (GymSetEntity gymSetEntity : arrayList4) {
                                    if (gymSetEntity.getSetIndex() != intValue || !GymCarryover.INSTANCE.isSetFilled(gymSetEntity)) {
                                    }
                                }
                            }
                        }
                    }
                    id = gymCarryoverEntity.getId();
                    this.L$0 = repository;
                    this.L$1 = mutableState;
                    this.L$2 = state;
                    this.L$3 = it;
                    this.label = 1;
                    if (repository.deleteGymCarryover(id, this) != coroutine_suspended) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
