package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.health.HealthConnectManager;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$6$1", f = "RunTabContent.kt", i = {0}, l = {262, 265}, m = "invokeSuspend", n = {"today"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RunTabContentKt$RunTabContent$7$1$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ HealthConnectManager $hc;
    final /* synthetic */ MutableState<Boolean> $hcHasStepsRead$delegate;
    final /* synthetic */ MutableState<Long> $hcLastSteps$delegate;
    final /* synthetic */ boolean $hcReady;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunTabContentKt$RunTabContent$7$1$6$1(boolean z, MutableState<Boolean> mutableState, HealthConnectManager healthConnectManager, MutableState<Long> mutableState2, Context context, Continuation<? super RunTabContentKt$RunTabContent$7$1$6$1> continuation) {
        super(2, continuation);
        this.$hcReady = z;
        this.$hcHasStepsRead$delegate = mutableState;
        this.$hc = healthConnectManager;
        this.$hcLastSteps$delegate = mutableState2;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunTabContentKt$RunTabContent$7$1$6$1 runTabContentKt$RunTabContent$7$1$6$1 = new RunTabContentKt$RunTabContent$7$1$6$1(this.$hcReady, this.$hcHasStepsRead$delegate, this.$hc, this.$hcLastSteps$delegate, this.$ctx, continuation);
        runTabContentKt$RunTabContent$7$1$6$1.L$0 = obj;
        return runTabContentKt$RunTabContent$7$1$6$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunTabContentKt$RunTabContent$7$1$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        ?? r1;
        boolean invoke$lambda$173$lambda$23;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$hcReady) {
                invoke$lambda$173$lambda$23 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$23(this.$hcHasStepsRead$delegate);
                if (invoke$lambda$173$lambda$23) {
                    ?? now = LocalDate.now(ZoneId.systemDefault());
                    HealthConnectManager healthConnectManager = this.$hc;
                    Result.Companion companion2 = Result.INSTANCE;
                    Intrinsics.checkNotNull(now);
                    this.L$0 = now;
                    this.label = 1;
                    obj = HealthConnectManager.readStepsForDay$default(healthConnectManager, now, null, this, 2, null);
                    i = now;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ?? r12 = (LocalDate) this.L$0;
        ResultKt.throwOnFailure(obj);
        i = r12;
        m7905constructorimpl = Result.m7905constructorimpl((Long) obj);
        r1 = i;
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        Long l = (Long) m7905constructorimpl;
        if (l != null && l.longValue() >= 0) {
            this.$hcLastSteps$delegate.setValue(l);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, r1, l, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RunTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$6$1$1", f = "RunTabContent.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$1$6$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Long $steps;
        final /* synthetic */ LocalDate $today;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, LocalDate localDate, Long l, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$today = localDate;
            this.$steps = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$today, this.$steps, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object upsertDailySteps;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                upsertDailySteps = Repository.INSTANCE.get(this.$ctx).upsertDailySteps(this.$today.toEpochDay(), this.$steps.longValue(), "health_connect", (r20 & 8) != 0 ? System.currentTimeMillis() : 0L, this);
                if (upsertDailySteps == coroutine_suspended) {
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
