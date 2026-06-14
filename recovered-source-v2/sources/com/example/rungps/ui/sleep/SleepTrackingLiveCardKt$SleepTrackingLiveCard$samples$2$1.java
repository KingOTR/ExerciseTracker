package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.ProduceStateScope;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.sleep.SleepScience;
import com.example.rungps.sleep.SleepTrackSample;
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

/* compiled from: SleepTrackingLiveCard.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Lcom/example/rungps/sleep/SleepTrackSample;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1", f = "SleepTrackingLiveCard.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends SleepTrackSample>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1(Context context, Continuation<? super SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1 sleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1 = new SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1(this.$ctx, continuation);
        sleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1.L$0 = obj;
        return sleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProduceStateScope<List<SleepTrackSample>> produceStateScope, Continuation<? super Unit> continuation) {
        return ((SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProduceStateScope<List<? extends SleepTrackSample>> produceStateScope, Continuation<? super Unit> continuation) {
        return invoke2((ProduceStateScope<List<SleepTrackSample>>) produceStateScope, continuation);
    }

    /* compiled from: SleepTrackingLiveCard.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1$1", f = "SleepTrackingLiveCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTrackingLiveCardKt$SleepTrackingLiveCard$samples$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SleepTrackSample>>, Object> {
        final /* synthetic */ Context $ctx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SleepTrackSample>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SleepTrackSample>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SleepTrackSample>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SleepOvernightStore.INSTANCE.loadRecentSamples(this.$ctx, SleepScience.TYPICAL_MIN_MIN);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
            this.L$0 = produceStateScope2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            produceStateScope = produceStateScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (ProduceStateScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(obj);
        return Unit.INSTANCE;
    }
}
