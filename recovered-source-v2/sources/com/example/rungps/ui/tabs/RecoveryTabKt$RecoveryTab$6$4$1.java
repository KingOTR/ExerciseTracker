package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.RecoveryMuscleHeatmap;
import java.util.List;
import java.util.Map;
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

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$4$1", f = "RecoveryTab.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RecoveryEventEntity> $active;
    final /* synthetic */ MutableState<Map<String, Float>> $muscleHeat$delegate;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$6$4$1(List<RecoveryEventEntity> list, Repository repository, MutableState<Map<String, Float>> mutableState, Continuation<? super RecoveryTabKt$RecoveryTab$6$4$1> continuation) {
        super(2, continuation);
        this.$active = list;
        this.$repo = repository;
        this.$muscleHeat$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$6$4$1(this.$active, this.$repo, this.$muscleHeat$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$6$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RecoveryTab.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$4$1$1", f = "RecoveryTab.kt", i = {}, l = {389, 390, 391, 386}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<RecoveryEventEntity> $active;
        final /* synthetic */ MutableState<Map<String, Float>> $muscleHeat$delegate;
        final /* synthetic */ Repository $repo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<RecoveryEventEntity> list, Repository repository, MutableState<Map<String, Float>> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$active = list;
            this.$repo = repository;
            this.$muscleHeat$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$active, this.$repo, this.$muscleHeat$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0103 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RecoveryMuscleHeatmap recoveryMuscleHeatmap;
            List<RecoveryEventEntity> list;
            Object muscleGroupLookup;
            MutableState<Map<String, Float>> mutableState;
            Repository repository;
            Object muscleSecondaryLookup;
            Repository repository2;
            Map<String, String> map;
            Object muscleTertiaryLookup;
            Map<String, String> map2;
            Map<String, String> map3;
            Repository repository3;
            List<RecoveryEventEntity> list2;
            MutableState<Map<String, Float>> mutableState2;
            RecoveryMuscleHeatmap recoveryMuscleHeatmap2;
            Object regionsFromActiveEvents;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState<Map<String, Float>> mutableState3 = this.$muscleHeat$delegate;
                recoveryMuscleHeatmap = RecoveryMuscleHeatmap.INSTANCE;
                list = this.$active;
                Repository repository4 = this.$repo;
                this.L$0 = mutableState3;
                this.L$1 = recoveryMuscleHeatmap;
                this.L$2 = list;
                this.L$3 = repository4;
                this.label = 1;
                muscleGroupLookup = repository4.muscleGroupLookup(this);
                if (muscleGroupLookup == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState3;
                repository = repository4;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            MutableState<Map<String, Float>> mutableState4 = (MutableState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutableState2 = mutableState4;
                            regionsFromActiveEvents = obj;
                            mutableState2.setValue((Map) regionsFromActiveEvents);
                            return Unit.INSTANCE;
                        }
                        Map<String, String> map4 = (Map) this.L$5;
                        Map<String, String> map5 = (Map) this.L$4;
                        Repository repository5 = (Repository) this.L$3;
                        List<RecoveryEventEntity> list3 = (List) this.L$2;
                        RecoveryMuscleHeatmap recoveryMuscleHeatmap3 = (RecoveryMuscleHeatmap) this.L$1;
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        map3 = map4;
                        map2 = map5;
                        repository3 = repository5;
                        list2 = list3;
                        recoveryMuscleHeatmap2 = recoveryMuscleHeatmap3;
                        muscleTertiaryLookup = obj;
                        this.L$0 = mutableState2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        regionsFromActiveEvents = recoveryMuscleHeatmap2.regionsFromActiveEvents(list2, repository3, map2, map3, (Map) muscleTertiaryLookup, this);
                        if (regionsFromActiveEvents == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableState2.setValue((Map) regionsFromActiveEvents);
                        return Unit.INSTANCE;
                    }
                    map = (Map) this.L$4;
                    Repository repository6 = (Repository) this.L$3;
                    List<RecoveryEventEntity> list4 = (List) this.L$2;
                    recoveryMuscleHeatmap = (RecoveryMuscleHeatmap) this.L$1;
                    MutableState<Map<String, Float>> mutableState5 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState = mutableState5;
                    list = list4;
                    repository2 = repository6;
                    muscleSecondaryLookup = obj;
                    Map<String, String> map6 = (Map) muscleSecondaryLookup;
                    this.L$0 = mutableState;
                    this.L$1 = recoveryMuscleHeatmap;
                    this.L$2 = list;
                    this.L$3 = repository2;
                    this.L$4 = map;
                    this.L$5 = map6;
                    this.label = 3;
                    muscleTertiaryLookup = this.$repo.muscleTertiaryLookup(this);
                    if (muscleTertiaryLookup != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map;
                    map3 = map6;
                    repository3 = repository2;
                    list2 = list;
                    mutableState2 = mutableState;
                    recoveryMuscleHeatmap2 = recoveryMuscleHeatmap;
                    this.L$0 = mutableState2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    regionsFromActiveEvents = recoveryMuscleHeatmap2.regionsFromActiveEvents(list2, repository3, map2, map3, (Map) muscleTertiaryLookup, this);
                    if (regionsFromActiveEvents == coroutine_suspended) {
                    }
                    mutableState2.setValue((Map) regionsFromActiveEvents);
                    return Unit.INSTANCE;
                }
                repository = (Repository) this.L$3;
                List<RecoveryEventEntity> list5 = (List) this.L$2;
                recoveryMuscleHeatmap = (RecoveryMuscleHeatmap) this.L$1;
                MutableState<Map<String, Float>> mutableState6 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState = mutableState6;
                list = list5;
                muscleGroupLookup = obj;
            }
            Map<String, String> map7 = (Map) muscleGroupLookup;
            this.L$0 = mutableState;
            this.L$1 = recoveryMuscleHeatmap;
            this.L$2 = list;
            this.L$3 = repository;
            this.L$4 = map7;
            this.label = 2;
            muscleSecondaryLookup = this.$repo.muscleSecondaryLookup(this);
            if (muscleSecondaryLookup == coroutine_suspended) {
                return coroutine_suspended;
            }
            repository2 = repository;
            map = map7;
            Map<String, String> map62 = (Map) muscleSecondaryLookup;
            this.L$0 = mutableState;
            this.L$1 = recoveryMuscleHeatmap;
            this.L$2 = list;
            this.L$3 = repository2;
            this.L$4 = map;
            this.L$5 = map62;
            this.label = 3;
            muscleTertiaryLookup = this.$repo.muscleTertiaryLookup(this);
            if (muscleTertiaryLookup != coroutine_suspended) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$active, this.$repo, this.$muscleHeat$delegate, null), this) == coroutine_suspended) {
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
}
