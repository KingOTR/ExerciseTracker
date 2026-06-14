package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepMlFeedbackApply;
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

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {1682}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;
    final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableIntState $wakeMood$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1(MutableState<SleepMlFeedbackApply.Kind> mutableState, Context context, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, MutableState<SleepEntryEntity> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1> continuation) {
        super(2, continuation);
        this.$hypnoFeedback$delegate = mutableState;
        this.$ctx = context;
        this.$wakeMood$delegate = mutableIntState;
        this.$smartAlarm$delegate = mutableState2;
        this.$repairEntry$delegate = mutableState3;
        this.$showRepairPrompt$delegate = mutableState4;
        this.$trackingActive$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1(this.$hypnoFeedback$delegate, this.$ctx, this.$wakeMood$delegate, this.$smartAlarm$delegate, this.$repairEntry$delegate, this.$showRepairPrompt$delegate, this.$trackingActive$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/SleepEntryEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {1683}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepEntryEntity>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
        final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
        final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;
        final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
        final /* synthetic */ MutableIntState $wakeMood$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<SleepMlFeedbackApply.Kind> mutableState, Context context, MutableIntState mutableIntState, MutableState<Boolean> mutableState2, MutableState<SleepEntryEntity> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hypnoFeedback$delegate = mutableState;
            this.$ctx = context;
            this.$wakeMood$delegate = mutableIntState;
            this.$smartAlarm$delegate = mutableState2;
            this.$repairEntry$delegate = mutableState3;
            this.$showRepairPrompt$delegate = mutableState4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$hypnoFeedback$delegate, this.$ctx, this.$wakeMood$delegate, this.$smartAlarm$delegate, this.$repairEntry$delegate, this.$showRepairPrompt$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepEntryEntity> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.$ctx;
                MutableIntState mutableIntState = this.$wakeMood$delegate;
                MutableState<Boolean> mutableState = this.$smartAlarm$delegate;
                MutableState<SleepEntryEntity> mutableState2 = this.$repairEntry$delegate;
                MutableState<Boolean> mutableState3 = this.$showRepairPrompt$delegate;
                SleepTabScreenBody$lambda$147 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(this.$hypnoFeedback$delegate);
                this.label = 1;
                obj = SleepTabScreenBodyKt.SleepTabScreenBody$persistWakeNight(context, mutableIntState, mutableState, mutableState2, mutableState3, null, SleepTabScreenBody$lambda$147, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$hypnoFeedback$delegate, this.$ctx, this.$wakeMood$delegate, this.$smartAlarm$delegate, this.$repairEntry$delegate, this.$showRepairPrompt$delegate, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, false);
        this.$hypnoFeedback$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
