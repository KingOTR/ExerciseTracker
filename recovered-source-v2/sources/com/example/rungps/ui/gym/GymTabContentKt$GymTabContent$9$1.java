package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1", f = "GymTabContent.kt", i = {0}, l = {235, 242, 246, 251, 255}, m = "invokeSuspend", n = {"spId"}, s = {"J$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ MutableState<List<String>> $nextDayExerciseNames$delegate;
    final /* synthetic */ MutableState<GymDayTemplateEntity> $nextSplitDay$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
    final /* synthetic */ MutableState<String> $splitScheduleHeadline$delegate;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$9$1(MutableState<Long> mutableState, State<? extends List<GymSessionEntity>> state, Repository repository, MutableState<GymDayTemplateEntity> mutableState2, MutableState<String> mutableState3, MutableState<List<String>> mutableState4, Continuation<? super GymTabContentKt$GymTabContent$9$1> continuation) {
        super(2, continuation);
        this.$activeSplitId$delegate = mutableState;
        this.$sessions$delegate = state;
        this.$repo = repository;
        this.$nextSplitDay$delegate = mutableState2;
        this.$splitScheduleHeadline$delegate = mutableState3;
        this.$nextDayExerciseNames$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$9$1(this.$activeSplitId$delegate, this.$sessions$delegate, this.$repo, this.$nextSplitDay$delegate, this.$splitScheduleHeadline$delegate, this.$nextDayExerciseNames$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long GymTabContent$lambda$29;
        Object withContext;
        long j;
        Object withContext2;
        Object withContext3;
        GymDayTemplateEntity gymDayTemplateEntity;
        MutableState<List<String>> mutableState;
        List emptyList;
        Object withContext4;
        GymDayTemplateEntity gymDayTemplateEntity2;
        MutableState<List<String>> mutableState2;
        List emptyList2;
        Object withContext5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(this.$activeSplitId$delegate);
            if (GymTabContent$lambda$29 == null) {
                return Unit.INSTANCE;
            }
            long longValue = GymTabContent$lambda$29.longValue();
            this.J$0 = longValue;
            this.label = 1;
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$9$1$wip$1(this.$sessions$delegate, this.$repo, longValue, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = longValue;
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    withContext3 = obj;
                    gymDayTemplateEntity = (GymDayTemplateEntity) withContext3;
                    this.$nextSplitDay$delegate.setValue(gymDayTemplateEntity);
                    MutableState<String> mutableState3 = this.$splitScheduleHeadline$delegate;
                    if (gymDayTemplateEntity != null || (r4 = gymDayTemplateEntity.getDayName()) == null) {
                        String str = "Split";
                    }
                    mutableState3.setValue("Current session: " + str);
                    mutableState = this.$nextDayExerciseNames$delegate;
                    if (gymDayTemplateEntity != null) {
                        emptyList = CollectionsKt.emptyList();
                        mutableState.setValue(emptyList);
                        return Unit.INSTANCE;
                    }
                    this.L$0 = mutableState;
                    this.label = 3;
                    withContext4 = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, gymDayTemplateEntity, null), this);
                    if (withContext4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    emptyList = (List) withContext4;
                    mutableState.setValue(emptyList);
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    MutableState<List<String>> mutableState4 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState = mutableState4;
                    withContext4 = obj;
                    emptyList = (List) withContext4;
                    mutableState.setValue(emptyList);
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MutableState<List<String>> mutableState5 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState2 = mutableState5;
                    withContext5 = obj;
                    emptyList2 = (List) withContext5;
                    mutableState2.setValue(emptyList2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                withContext2 = obj;
                gymDayTemplateEntity2 = (GymDayTemplateEntity) withContext2;
                this.$nextSplitDay$delegate.setValue(gymDayTemplateEntity2);
                MutableState<String> mutableState6 = this.$splitScheduleHeadline$delegate;
                if (gymDayTemplateEntity2 != null || (r4 = gymDayTemplateEntity2.getDayName()) == null) {
                    String str2 = "—";
                }
                mutableState6.setValue("Next split day: " + str2);
                mutableState2 = this.$nextDayExerciseNames$delegate;
                if (gymDayTemplateEntity2 != null) {
                    emptyList2 = CollectionsKt.emptyList();
                    mutableState2.setValue(emptyList2);
                    return Unit.INSTANCE;
                }
                this.L$0 = mutableState2;
                this.label = 5;
                withContext5 = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$repo, gymDayTemplateEntity2, null), this);
                if (withContext5 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                emptyList2 = (List) withContext5;
                mutableState2.setValue(emptyList2);
                return Unit.INSTANCE;
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            withContext = obj;
        }
        GymSessionEntity gymSessionEntity = (GymSessionEntity) withContext;
        if ((gymSessionEntity != null ? gymSessionEntity.getTemplateDayId() : null) != null) {
            this.label = 2;
            withContext3 = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$9$1$d$1(this.$repo, gymSessionEntity, null), this);
            if (withContext3 == coroutine_suspended) {
                return coroutine_suspended;
            }
            gymDayTemplateEntity = (GymDayTemplateEntity) withContext3;
            this.$nextSplitDay$delegate.setValue(gymDayTemplateEntity);
            MutableState<String> mutableState32 = this.$splitScheduleHeadline$delegate;
            if (gymDayTemplateEntity != null) {
            }
            String str3 = "Split";
            mutableState32.setValue("Current session: " + str3);
            mutableState = this.$nextDayExerciseNames$delegate;
            if (gymDayTemplateEntity != null) {
            }
        } else {
            this.label = 4;
            withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$9$1$next$1(this.$repo, j, null), this);
            if (withContext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            gymDayTemplateEntity2 = (GymDayTemplateEntity) withContext2;
            this.$nextSplitDay$delegate.setValue(gymDayTemplateEntity2);
            MutableState<String> mutableState62 = this.$splitScheduleHeadline$delegate;
            if (gymDayTemplateEntity2 != null) {
            }
            String str22 = "—";
            mutableState62.setValue("Next split day: " + str22);
            mutableState2 = this.$nextDayExerciseNames$delegate;
            if (gymDayTemplateEntity2 != null) {
            }
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$1", f = "GymTabContent.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ GymDayTemplateEntity $d;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, GymDayTemplateEntity gymDayTemplateEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$d = gymDayTemplateEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$d, continuation);
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
                obj = this.$repo.exercisesForDay(this.$d.getId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExerciseTemplateEntity) it.next()).getName());
            }
            return arrayList;
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$2", f = "GymTabContent.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
        final /* synthetic */ GymDayTemplateEntity $next;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, GymDayTemplateEntity gymDayTemplateEntity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$next = gymDayTemplateEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$next, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.exercisesForDay(this.$next.getId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExerciseTemplateEntity) it.next()).getName());
            }
            return arrayList;
        }
    }
}
