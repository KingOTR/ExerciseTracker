package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.RecoveryMuscleAdvice;
import com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1", f = "RecoveryTab.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $expandedGymEventId$delegate;
    final /* synthetic */ MutableState<String> $expandedGymWhy$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<List<RecoveryEventEntity>> $visibleEvents$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$2$1(MutableState<Long> mutableState, Repository repository, MutableState<List<RecoveryEventEntity>> mutableState2, MutableState<String> mutableState3, Continuation<? super RecoveryTabKt$RecoveryTab$2$1> continuation) {
        super(2, continuation);
        this.$expandedGymEventId$delegate = mutableState;
        this.$repo = repository;
        this.$visibleEvents$delegate = mutableState2;
        this.$expandedGymWhy$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$2$1(this.$expandedGymEventId$delegate, this.$repo, this.$visibleEvents$delegate, this.$expandedGymWhy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long RecoveryTab$lambda$18;
        MutableState<String> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RecoveryTab$lambda$18 = RecoveryTabKt.RecoveryTab$lambda$18(this.$expandedGymEventId$delegate);
            if (RecoveryTab$lambda$18 == null) {
                return Unit.INSTANCE;
            }
            long longValue = RecoveryTab$lambda$18.longValue();
            MutableState<String> mutableState2 = this.$expandedGymWhy$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$visibleEvents$delegate, longValue, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((String) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: RecoveryTab.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1$1", f = "RecoveryTab.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {131, 132, 133, 134}, m = "invokeSuspend", n = {"e", "e", "lookup", "e", "lookup", "lookup", "day"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ long $id;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ MutableState<List<RecoveryEventEntity>> $visibleEvents$delegate;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, MutableState<List<RecoveryEventEntity>> mutableState, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$visibleEvents$delegate = mutableState;
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$visibleEvents$delegate, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ea A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List RecoveryTab$lambda$4;
            Object obj2;
            RecoveryEventEntity recoveryEventEntity;
            Map map;
            RecoveryEventEntity recoveryEventEntity2;
            GymSessionEntity gymSessionEntity;
            Long templateDayId;
            RecoveryEventEntity recoveryEventEntity3;
            final Map map2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String str2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RecoveryTab$lambda$4 = RecoveryTabKt.RecoveryTab$lambda$4(this.$visibleEvents$delegate);
                long j = this.$id;
                Iterator it = RecoveryTab$lambda$4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    RecoveryEventEntity recoveryEventEntity4 = (RecoveryEventEntity) obj2;
                    if (recoveryEventEntity4.getId() == j && Intrinsics.areEqual(recoveryEventEntity4.getKind(), "GYM")) {
                        break;
                    }
                }
                recoveryEventEntity = (RecoveryEventEntity) obj2;
                if (recoveryEventEntity == null) {
                    return null;
                }
                this.L$0 = recoveryEventEntity;
                this.label = 1;
                obj = this.$repo.muscleGroupLookup(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                recoveryEventEntity = (RecoveryEventEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$1;
                        map2 = (Map) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        return RecoveryMuscleAdvice.INSTANCE.gymRecoveryDetail(str, (List) obj, new Function1() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String invokeSuspend$lambda$2;
                                invokeSuspend$lambda$2 = RecoveryTabKt$RecoveryTab$2$1.AnonymousClass1.invokeSuspend$lambda$2(map2, (String) obj3);
                                return invokeSuspend$lambda$2;
                            }
                        });
                    }
                    map = (Map) this.L$1;
                    recoveryEventEntity3 = (RecoveryEventEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str2 = (String) obj;
                    recoveryEventEntity2 = recoveryEventEntity3;
                    this.L$0 = map;
                    this.L$1 = str2;
                    this.label = 4;
                    obj = this.$repo.setsForSession(recoveryEventEntity2.getSourceId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map2 = map;
                    str = str2;
                    return RecoveryMuscleAdvice.INSTANCE.gymRecoveryDetail(str, (List) obj, new Function1() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            String invokeSuspend$lambda$2;
                            invokeSuspend$lambda$2 = RecoveryTabKt$RecoveryTab$2$1.AnonymousClass1.invokeSuspend$lambda$2(map2, (String) obj3);
                            return invokeSuspend$lambda$2;
                        }
                    });
                }
                map = (Map) this.L$1;
                recoveryEventEntity2 = (RecoveryEventEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
                gymSessionEntity = (GymSessionEntity) obj;
                if (gymSessionEntity != null && (templateDayId = gymSessionEntity.getTemplateDayId()) != null) {
                    Repository repository = this.$repo;
                    long longValue = templateDayId.longValue();
                    this.L$0 = recoveryEventEntity2;
                    this.L$1 = map;
                    this.label = 3;
                    obj = repository.dayNameForTemplate(longValue, this);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    recoveryEventEntity3 = recoveryEventEntity2;
                    str2 = (String) obj;
                    recoveryEventEntity2 = recoveryEventEntity3;
                }
                this.L$0 = map;
                this.L$1 = str2;
                this.label = 4;
                obj = this.$repo.setsForSession(recoveryEventEntity2.getSourceId(), this);
                if (obj == coroutine_suspended) {
                }
            }
            Map map3 = (Map) obj;
            this.L$0 = recoveryEventEntity;
            this.L$1 = map3;
            this.label = 2;
            Object gymSessionById = this.$repo.gymSessionById(recoveryEventEntity.getSourceId(), this);
            if (gymSessionById == coroutine_suspended) {
                return coroutine_suspended;
            }
            RecoveryEventEntity recoveryEventEntity5 = recoveryEventEntity;
            map = map3;
            obj = gymSessionById;
            recoveryEventEntity2 = recoveryEventEntity5;
            gymSessionEntity = (GymSessionEntity) obj;
            if (gymSessionEntity != null) {
                Repository repository2 = this.$repo;
                long longValue2 = templateDayId.longValue();
                this.L$0 = recoveryEventEntity2;
                this.L$1 = map;
                this.label = 3;
                obj = repository2.dayNameForTemplate(longValue2, this);
                if (obj != coroutine_suspended) {
                }
            }
            this.L$0 = map;
            this.L$1 = str2;
            this.label = 4;
            obj = this.$repo.setsForSession(recoveryEventEntity2.getSourceId(), this);
            if (obj == coroutine_suspended) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$2(Map map, String str) {
            String lowerCase = StringsKt.trim((CharSequence) str).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return (String) map.get(lowerCase);
        }
    }
}
