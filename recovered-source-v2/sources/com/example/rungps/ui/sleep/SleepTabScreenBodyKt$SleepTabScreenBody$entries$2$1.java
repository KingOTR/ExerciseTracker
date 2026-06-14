package com.example.rungps.ui.sleep;

import android.util.Log;
import androidx.compose.runtime.ProduceStateScope;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.SleepEntryEntity;
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
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Lcom/example/rungps/data/SleepEntryEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1", f = "SleepTabScreenBody.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends SleepEntryEntity>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExerciseTrackerUseCases $useCases;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1(ExerciseTrackerUseCases exerciseTrackerUseCases, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1> continuation) {
        super(2, continuation);
        this.$useCases = exerciseTrackerUseCases;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1 sleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1 = new SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1(this.$useCases, continuation);
        sleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1.L$0 = obj;
        return sleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProduceStateScope<List<SleepEntryEntity>> produceStateScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProduceStateScope<List<? extends SleepEntryEntity>> produceStateScope, Continuation<? super Unit> continuation) {
        return invoke2((ProduceStateScope<List<SleepEntryEntity>>) produceStateScope, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            this.label = 1;
            if (FlowKt.m9445catch(this.$useCases.getObserveRecentSleep().invoke(42), new AnonymousClass1(null)).collect(new FlowCollector() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<SleepEntryEntity>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<SleepEntryEntity> list, Continuation<? super Unit> continuation) {
                    produceStateScope.setValue(list);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/example/rungps/data/SleepEntryEntity;", "e", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends SleepEntryEntity>>, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends SleepEntryEntity>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<SleepEntryEntity>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<SleepEntryEntity>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Log.e(SleepTabComponentsKt.SLEEP_TAB_LOG, "sleepRecentFlow failed", (Throwable) this.L$1);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(CollectionsKt.emptyList(), this) == coroutine_suspended) {
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
}
