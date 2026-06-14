package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.LocalPbWithRun;
import com.example.rungps.data.Repository;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$20$1", f = "RunTabContent.kt", i = {}, l = {508}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunTabContentKt$RunTabContent$7$1$20$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Map<String, Long>> $localRidePbsForZones$delegate;
    final /* synthetic */ MutableState<Map<String, Long>> $localRunPbsForZones$delegate;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunTabContentKt$RunTabContent$7$1$20$1(Repository repository, MutableState<Map<String, Long>> mutableState, MutableState<Map<String, Long>> mutableState2, Continuation<? super RunTabContentKt$RunTabContent$7$1$20$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$localRunPbsForZones$delegate = mutableState;
        this.$localRidePbsForZones$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunTabContentKt$RunTabContent$7$1$20$1(this.$repo, this.$localRunPbsForZones$delegate, this.$localRidePbsForZones$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunTabContentKt$RunTabContent$7$1$20$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RunTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$20$1$1", f = "RunTabContent.kt", i = {}, l = {509, 510}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$20$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Map<String, Long>> $localRidePbsForZones$delegate;
        final /* synthetic */ MutableState<Map<String, Long>> $localRunPbsForZones$delegate;
        final /* synthetic */ Repository $repo;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, MutableState<Map<String, Long>> mutableState, MutableState<Map<String, Long>> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$localRunPbsForZones$delegate = mutableState;
            this.$localRidePbsForZones$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$localRunPbsForZones$delegate, this.$localRidePbsForZones$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[LOOP:0: B:7:0x0070->B:9:0x0076, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MutableState<Map<String, Long>> mutableState;
            MutableState<Map<String, Long>> mutableState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableState = this.$localRunPbsForZones$delegate;
                this.L$0 = mutableState;
                this.label = 1;
                obj = this.$repo.localPbsFromSplits(this);
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
                    Map map = (Map) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), Boxing.boxLong(((LocalPbWithRun) entry.getValue()).getDurationMs()));
                    }
                    mutableState2.setValue(linkedHashMap);
                    return Unit.INSTANCE;
                }
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableState.setValue((Map) obj);
            MutableState<Map<String, Long>> mutableState3 = this.$localRidePbsForZones$delegate;
            this.L$0 = mutableState3;
            this.label = 2;
            Object localRidePbsFromSplitsWithRuns = this.$repo.localRidePbsFromSplitsWithRuns(this);
            if (localRidePbsFromSplitsWithRuns == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = localRidePbsFromSplitsWithRuns;
            mutableState2 = mutableState3;
            Map map2 = (Map) obj;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
            while (r7.hasNext()) {
            }
            mutableState2.setValue(linkedHashMap2);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$localRunPbsForZones$delegate, this.$localRidePbsForZones$delegate, null), this) == coroutine_suspended) {
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
