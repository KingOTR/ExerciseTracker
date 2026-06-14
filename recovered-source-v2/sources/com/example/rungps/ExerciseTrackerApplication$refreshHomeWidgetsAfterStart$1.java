package com.example.rungps;

import com.example.rungps.widget.GymWidgetProvider;
import com.example.rungps.widget.GymWidgetUpdater;
import com.example.rungps.widget.RecoveryWidgetProvider;
import com.example.rungps.widget.RecoveryWidgetUpdater;
import com.example.rungps.widget.RideRunWidgetProvider;
import com.example.rungps.widget.RideRunWidgetUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ExerciseTrackerApplication.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1", f = "ExerciseTrackerApplication.kt", i = {0, 1}, l = {55, 56}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ExerciseTrackerApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1(ExerciseTrackerApplication exerciseTrackerApplication, Continuation<? super ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1> continuation) {
        super(2, continuation);
        this.this$0 = exerciseTrackerApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1 exerciseTrackerApplication$refreshHomeWidgetsAfterStart$1 = new ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1(this.this$0, continuation);
        exerciseTrackerApplication$refreshHomeWidgetsAfterStart$1.L$0 = obj;
        return exerciseTrackerApplication$refreshHomeWidgetsAfterStart$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:(1:(12:5|6|7|8|9|10|11|12|13|14|15|16)(2:27|28))(1:29))(2:33|(1:35))|30|(1:32)|6|7|8|9|10|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(900L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ExerciseTrackerApplication exerciseTrackerApplication = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                GymWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication);
                Result.m7905constructorimpl(Unit.INSTANCE);
                ExerciseTrackerApplication exerciseTrackerApplication2 = this.this$0;
                Result.Companion companion2 = Result.INSTANCE;
                RideRunWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication2);
                Result.m7905constructorimpl(Unit.INSTANCE);
                ExerciseTrackerApplication exerciseTrackerApplication3 = this.this$0;
                Result.Companion companion3 = Result.INSTANCE;
                RecoveryWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication3);
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = coroutineScope;
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        ExerciseTrackerApplication exerciseTrackerApplication4 = this.this$0;
        Result.Companion companion4 = Result.INSTANCE;
        GymWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication4);
        Result.m7905constructorimpl(Unit.INSTANCE);
        ExerciseTrackerApplication exerciseTrackerApplication22 = this.this$0;
        Result.Companion companion22 = Result.INSTANCE;
        RideRunWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication22);
        Result.m7905constructorimpl(Unit.INSTANCE);
        ExerciseTrackerApplication exerciseTrackerApplication32 = this.this$0;
        Result.Companion companion32 = Result.INSTANCE;
        RecoveryWidgetProvider.INSTANCE.requestUpdate(exerciseTrackerApplication32);
        Result.m7905constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: ExerciseTrackerApplication.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1$1", f = "ExerciseTrackerApplication.kt", i = {0, 1}, l = {57, 58, 59}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext"}, s = {"L$0", "L$0"})
    /* renamed from: com.example.rungps.ExerciseTrackerApplication$refreshHomeWidgetsAfterStart$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ExerciseTrackerApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExerciseTrackerApplication exerciseTrackerApplication, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = exerciseTrackerApplication;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object m7905constructorimpl;
            ?? r1;
            ExerciseTrackerApplication exerciseTrackerApplication;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                        r1 = i;
                    }
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r12 = (CoroutineScope) this.L$0;
                ExerciseTrackerApplication exerciseTrackerApplication2 = this.this$0;
                Result.Companion companion4 = Result.INSTANCE;
                this.L$0 = r12;
                this.label = 1;
                i = r12;
                if (GymWidgetUpdater.INSTANCE.refresh(exerciseTrackerApplication2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                        return Result.m7904boximpl(m7905constructorimpl);
                    }
                    ResultKt.throwOnFailure(obj);
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    exerciseTrackerApplication = this.this$0;
                    Result.Companion companion5 = Result.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                    if (RecoveryWidgetUpdater.INSTANCE.refresh(exerciseTrackerApplication, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                ?? r13 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r13;
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
            r1 = i;
            ExerciseTrackerApplication exerciseTrackerApplication3 = this.this$0;
            Result.Companion companion6 = Result.INSTANCE;
            this.L$0 = r1;
            this.label = 2;
            if (RideRunWidgetUpdater.INSTANCE.refresh(exerciseTrackerApplication3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
            exerciseTrackerApplication = this.this$0;
            Result.Companion companion52 = Result.INSTANCE;
            this.L$0 = null;
            this.label = 3;
            if (RecoveryWidgetUpdater.INSTANCE.refresh(exerciseTrackerApplication, this) == coroutine_suspended) {
            }
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            return Result.m7904boximpl(m7905constructorimpl);
        }
    }
}
