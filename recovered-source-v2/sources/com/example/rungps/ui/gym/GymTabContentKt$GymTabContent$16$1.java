package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.SplitProgrammeMusclePreview;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$16$1", f = "GymTabContent.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$16$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Map<String, Float>> $splitProgrammeRegions$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$16$1(MutableState<Long> mutableState, Repository repository, MutableState<Map<String, Float>> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$16$1> continuation) {
        super(2, continuation);
        this.$activeSplitId$delegate = mutableState;
        this.$repo = repository;
        this.$splitProgrammeRegions$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$16$1(this.$activeSplitId$delegate, this.$repo, this.$splitProgrammeRegions$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$16$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long GymTabContent$lambda$29;
        MutableState<Map<String, Float>> mutableState;
        MutableState<Map<String, Float>> mutableState2;
        Map emptyMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(this.$activeSplitId$delegate);
            mutableState = this.$splitProgrammeRegions$delegate;
            if (GymTabContent$lambda$29 == null) {
                emptyMap = MapsKt.emptyMap();
                mutableState.setValue(emptyMap);
                return Unit.INSTANCE;
            }
            this.L$0 = mutableState;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, GymTabContent$lambda$29, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState2 = mutableState;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState2 = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState = mutableState2;
        emptyMap = (Map) obj;
        mutableState.setValue(emptyMap);
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$16$1$1", f = "GymTabContent.kt", i = {1}, l = {314, 315}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$16$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Float>>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ Long $spId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, Long l, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$spId = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$spId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends Float>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, Float>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, Float>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x008a A[LOOP:0: B:7:0x0084->B:9:0x008a, LOOP_END] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006e -> B:6:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Repository repository;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.dayTemplatesForSplit(this.$spId.longValue(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                arrayList = (Collection) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ExerciseTemplateEntity) it2.next()).getName());
                }
                CollectionsKt.addAll(arrayList, arrayList2);
                if (it.hasNext()) {
                    long id = ((GymDayTemplateEntity) it.next()).getId();
                    this.L$0 = repository;
                    this.L$1 = arrayList;
                    this.L$2 = it;
                    this.label = 2;
                    obj = repository.exercisesForDay(id, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it22 = iterable2.iterator();
                    while (it22.hasNext()) {
                    }
                    CollectionsKt.addAll(arrayList, arrayList22);
                    if (it.hasNext()) {
                        return SplitProgrammeMusclePreview.INSTANCE.regionWeightsForExercises((List) arrayList);
                    }
                }
            }
            Repository repository2 = this.$repo;
            arrayList = new ArrayList();
            repository = repository2;
            it = ((Iterable) obj).iterator();
            if (it.hasNext()) {
            }
        }
    }
}
