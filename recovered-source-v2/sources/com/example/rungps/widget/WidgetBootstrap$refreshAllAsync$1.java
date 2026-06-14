package com.example.rungps.widget;

import android.content.Context;
import com.example.rungps.widget.GymWidgetProvider;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WidgetBootstrap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.WidgetBootstrap$refreshAllAsync$1", f = "WidgetBootstrap.kt", i = {0, 1, 2}, l = {39, 40, 41}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class WidgetBootstrap$refreshAllAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $app;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetBootstrap$refreshAllAsync$1(Context context, Continuation<? super WidgetBootstrap$refreshAllAsync$1> continuation) {
        super(2, continuation);
        this.$app = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WidgetBootstrap$refreshAllAsync$1 widgetBootstrap$refreshAllAsync$1 = new WidgetBootstrap$refreshAllAsync$1(this.$app, continuation);
        widgetBootstrap$refreshAllAsync$1.L$0 = obj;
        return widgetBootstrap$refreshAllAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WidgetBootstrap$refreshAllAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(1:2)|(1:(1:(1:(10:7|8|9|10|(3:12|13|14)|18|19|20|21|22)(2:28|29))(14:30|31|32|33|34|(1:36)|9|10|(0)|18|19|20|21|22))(2:38|39))(3:46|47|(1:49))|40|41|42|(1:44)|32|33|34|(0)|9|10|(0)|18|19|20|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        ?? r1;
        ?? r12;
        Context context;
        RecoveryWidgetUpdater recoveryWidgetUpdater;
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
            r12 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r13 = (CoroutineScope) this.L$0;
            Context context2 = this.$app;
            Result.Companion companion4 = Result.INSTANCE;
            GymWidgetUpdater gymWidgetUpdater = GymWidgetUpdater.INSTANCE;
            Intrinsics.checkNotNull(context2);
            this.L$0 = r13;
            this.label = 1;
            i = r13;
            if (gymWidgetUpdater.refresh(context2, this) == coroutine_suspended) {
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
                    if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                        Context context3 = this.$app;
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            WidgetBootstrap widgetBootstrap = WidgetBootstrap.INSTANCE;
                            Intrinsics.checkNotNull(context3);
                            widgetBootstrap.refreshRecoveryDefaults(context3);
                            Result.m7905constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th4) {
                            Result.Companion companion6 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th4));
                        }
                    }
                    Context context4 = this.$app;
                    Result.Companion companion7 = Result.INSTANCE;
                    GymWidgetProvider.Companion companion8 = GymWidgetProvider.INSTANCE;
                    Intrinsics.checkNotNull(context4);
                    companion8.requestUpdate(context4);
                    RideRunWidgetProvider.INSTANCE.requestUpdate(context4);
                    RecoveryWidgetProvider.INSTANCE.requestUpdate(context4);
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                ?? r14 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r14;
                Result.m7905constructorimpl(Unit.INSTANCE);
                r12 = i;
                context = this.$app;
                Result.Companion companion9 = Result.INSTANCE;
                recoveryWidgetUpdater = RecoveryWidgetUpdater.INSTANCE;
                Intrinsics.checkNotNull(context);
                this.L$0 = r12;
                this.label = 3;
                if (recoveryWidgetUpdater.refresh(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                }
                Context context42 = this.$app;
                Result.Companion companion72 = Result.INSTANCE;
                GymWidgetProvider.Companion companion82 = GymWidgetProvider.INSTANCE;
                Intrinsics.checkNotNull(context42);
                companion82.requestUpdate(context42);
                RideRunWidgetProvider.INSTANCE.requestUpdate(context42);
                RecoveryWidgetProvider.INSTANCE.requestUpdate(context42);
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            ?? r15 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r15;
        }
        Result.m7905constructorimpl(Unit.INSTANCE);
        r1 = i;
        Context context5 = this.$app;
        Result.Companion companion10 = Result.INSTANCE;
        RideRunWidgetUpdater rideRunWidgetUpdater = RideRunWidgetUpdater.INSTANCE;
        Intrinsics.checkNotNull(context5);
        this.L$0 = r1;
        this.label = 2;
        i = r1;
        if (rideRunWidgetUpdater.refresh(context5, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Result.m7905constructorimpl(Unit.INSTANCE);
        r12 = i;
        context = this.$app;
        Result.Companion companion92 = Result.INSTANCE;
        recoveryWidgetUpdater = RecoveryWidgetUpdater.INSTANCE;
        Intrinsics.checkNotNull(context);
        this.L$0 = r12;
        this.label = 3;
        if (recoveryWidgetUpdater.refresh(context, this) == coroutine_suspended) {
        }
        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
        }
        Context context422 = this.$app;
        Result.Companion companion722 = Result.INSTANCE;
        GymWidgetProvider.Companion companion822 = GymWidgetProvider.INSTANCE;
        Intrinsics.checkNotNull(context422);
        companion822.requestUpdate(context422);
        RideRunWidgetProvider.INSTANCE.requestUpdate(context422);
        RecoveryWidgetProvider.INSTANCE.requestUpdate(context422);
        Result.m7905constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
