package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSplitEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$12$1$1$1", f = "GymTabContent.kt", i = {1, 1}, l = {538, 540, 542}, m = "invokeSuspend", n = {"days", "destination$iv$iv"}, s = {"L$0", "L$2"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$12$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GymSplitEntity $activeSplit;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Boolean> $showSplitEditor$delegate;
    final /* synthetic */ long $spId;
    final /* synthetic */ MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> $splitEditorPayload$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$12$1$1$1(Repository repository, long j, GymSplitEntity gymSplitEntity, MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$12$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$spId = j;
        this.$activeSplit = gymSplitEntity;
        this.$splitEditorPayload$delegate = mutableState;
        this.$showSplitEditor$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$12$1$1$1(this.$repo, this.$spId, this.$activeSplit, this.$splitEditorPayload$delegate, this.$showSplitEditor$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$12$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a6 -> B:13:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        Repository repository;
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.dayTemplatesForSplit(this.$spId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            Long boxLong = (Long) this.L$5;
            Map map = (Map) this.L$4;
            it = (Iterator) this.L$3;
            ?? r6 = (Map) this.L$2;
            repository = (Repository) this.L$1;
            List list2 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            linkedHashMap = r6;
            list = list2;
            Pair pair = TuplesKt.to(boxLong, obj);
            map.put(pair.getFirst(), pair.getSecond());
            if (it.hasNext()) {
                GymDayTemplateEntity gymDayTemplateEntity = (GymDayTemplateEntity) it.next();
                boxLong = Boxing.boxLong(gymDayTemplateEntity.getId());
                long id = gymDayTemplateEntity.getId();
                this.L$0 = list;
                this.L$1 = repository;
                this.L$2 = linkedHashMap;
                this.L$3 = it;
                this.L$4 = linkedHashMap;
                this.L$5 = boxLong;
                this.label = 2;
                obj = repository.exercisesForDay(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = linkedHashMap;
                Pair pair2 = TuplesKt.to(boxLong, obj);
                map.put(pair2.getFirst(), pair2.getSecond());
                if (it.hasNext()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$activeSplit, list, linkedHashMap, this.$splitEditorPayload$delegate, this.$showSplitEditor$delegate, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        List list3 = (List) obj;
        List list4 = list3;
        Repository repository2 = this.$repo;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        list = list3;
        it = list4.iterator();
        repository = repository2;
        linkedHashMap = linkedHashMap2;
        if (it.hasNext()) {
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$12$1$1$1$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$12$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GymSplitEntity $activeSplit;
        final /* synthetic */ List<GymDayTemplateEntity> $days;
        final /* synthetic */ Map<Long, List<ExerciseTemplateEntity>> $exMap;
        final /* synthetic */ MutableState<Boolean> $showSplitEditor$delegate;
        final /* synthetic */ MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> $splitEditorPayload$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(GymSplitEntity gymSplitEntity, List<GymDayTemplateEntity> list, Map<Long, ? extends List<ExerciseTemplateEntity>> map, MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activeSplit = gymSplitEntity;
            this.$days = list;
            this.$exMap = map;
            this.$splitEditorPayload$delegate = mutableState;
            this.$showSplitEditor$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activeSplit, this.$days, this.$exMap, this.$splitEditorPayload$delegate, this.$showSplitEditor$delegate, continuation);
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
            this.$splitEditorPayload$delegate.setValue(new Triple(this.$activeSplit.getName(), this.$days, this.$exMap));
            GymTabContentKt.GymTabContent$lambda$113(this.$showSplitEditor$delegate, true);
            return Unit.INSTANCE;
        }
    }
}
