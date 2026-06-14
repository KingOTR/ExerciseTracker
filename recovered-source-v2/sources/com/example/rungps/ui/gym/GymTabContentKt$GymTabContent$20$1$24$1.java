package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
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
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$24$1", f = "GymTabContent.kt", i = {}, l = {973}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$24$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<ExerciseTemplateEntity>> $activeDayExercises$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<GymSetEntity>> $sessionSets$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $setupNotesByExercise$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$20$1$24$1(MutableState<List<ExerciseTemplateEntity>> mutableState, State<? extends List<GymSetEntity>> state, Repository repository, MutableState<Map<String, String>> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$24$1> continuation) {
        super(2, continuation);
        this.$activeDayExercises$delegate = mutableState;
        this.$sessionSets$delegate = state;
        this.$repo = repository;
        this.$setupNotesByExercise$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$20$1$24$1(this.$activeDayExercises$delegate, this.$sessionSets$delegate, this.$repo, this.$setupNotesByExercise$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$24$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$132;
        List invoke$lambda$264$lambda$92;
        MutableState<Map<String, String>> mutableState;
        MutableState<Map<String, String>> mutableState2;
        Map emptyMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<List<ExerciseTemplateEntity>> mutableState3 = this.$activeDayExercises$delegate;
            State<List<GymSetEntity>> state = this.$sessionSets$delegate;
            Set createSetBuilder = SetsKt.createSetBuilder();
            GymTabContent$lambda$132 = GymTabContentKt.GymTabContent$lambda$132(mutableState3);
            Iterator it = GymTabContent$lambda$132.iterator();
            while (it.hasNext()) {
                createSetBuilder.add(((ExerciseTemplateEntity) it.next()).getName());
            }
            invoke$lambda$264$lambda$92 = GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$92(state);
            Iterator it2 = invoke$lambda$264$lambda$92.iterator();
            while (it2.hasNext()) {
                createSetBuilder.add(((GymSetEntity) it2.next()).getExerciseName());
            }
            Set build = SetsKt.build(createSetBuilder);
            mutableState = this.$setupNotesByExercise$delegate;
            if (build.isEmpty()) {
                emptyMap = MapsKt.emptyMap();
                mutableState.setValue(emptyMap);
                return Unit.INSTANCE;
            }
            this.L$0 = mutableState;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(build, this.$repo, null), this);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$24$1$1", f = "GymTabContent.kt", i = {0}, l = {974}, m = "invokeSuspend", n = {"result$iv"}, s = {"L$1"})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$24$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ Set<String> $names;
        final /* synthetic */ Repository $repo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Set<String> set, Repository repository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$names = set;
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$names, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006e -> B:5:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Repository repository;
            LinkedHashMap linkedHashMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Set<String> set = this.$names;
                Repository repository2 = this.$repo;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
                it = set.iterator();
                repository = repository2;
                linkedHashMap = linkedHashMap2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object next = this.L$4;
                LinkedHashMap linkedHashMap3 = (Map) this.L$3;
                it = (Iterator) this.L$2;
                linkedHashMap = (LinkedHashMap) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                linkedHashMap3.put(next, str);
                if (it.hasNext()) {
                    next = it.next();
                    linkedHashMap3 = linkedHashMap;
                    this.L$0 = repository;
                    this.L$1 = linkedHashMap;
                    this.L$2 = it;
                    this.L$3 = linkedHashMap3;
                    this.L$4 = next;
                    this.label = 1;
                    obj = repository.exerciseSetupNote((String) next, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str2 = (String) obj;
                    if (str2 == null) {
                    }
                    linkedHashMap3.put(next, str2);
                    if (it.hasNext()) {
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (!StringsKt.isBlank((String) entry.getValue())) {
                                linkedHashMap4.put(entry.getKey(), entry.getValue());
                            }
                        }
                        return linkedHashMap4;
                    }
                }
            }
        }
    }
}
