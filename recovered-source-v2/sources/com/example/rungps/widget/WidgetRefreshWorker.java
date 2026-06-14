package com.example.rungps.widget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetRefreshWorker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/example/rungps/widget/WidgetRefreshWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetRefreshWorker extends CoroutineWorker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ONE_SHOT_NAME = "home-widget-refresh-once";
    private static final String PERIODIC_NAME = "home-widget-refresh";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(14:5|6|7|(1:(1:(1:(8:12|13|14|15|16|(1:18)(1:22)|19|20)(2:25|26))(10:27|28|29|(1:31)|14|15|16|(0)(0)|19|20))(2:32|33))(3:37|38|(1:40)(1:41))|34|(1:36)|29|(0)|14|15|16|(0)(0)|19|20))|46|6|7|(0)(0)|34|(0)|29|(0)|14|15|16|(0)(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r7));
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r6 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v23, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.example.rungps.widget.GymWidgetProvider$Companion] */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.example.rungps.widget.RideRunWidgetProvider$Companion] */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.example.rungps.widget.RecoveryWidgetProvider$Companion] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        WidgetRefreshWorker$doWork$1 widgetRefreshWorker$doWork$1;
        Object coroutine_suspended;
        int i;
        Object m7905constructorimpl;
        ListenableWorker.Result retry;
        WidgetRefreshWorker widgetRefreshWorker;
        Context context;
        Object refresh;
        Context context2;
        Object refresh2;
        if (continuation instanceof WidgetRefreshWorker$doWork$1) {
            widgetRefreshWorker$doWork$1 = (WidgetRefreshWorker$doWork$1) continuation;
            if ((widgetRefreshWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                widgetRefreshWorker$doWork$1.label -= Integer.MIN_VALUE;
                Object obj = widgetRefreshWorker$doWork$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = widgetRefreshWorker$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    WidgetRefreshWorker widgetRefreshWorker2 = this;
                    Context applicationContext = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    GymWidgetUpdater gymWidgetUpdater = GymWidgetUpdater.INSTANCE;
                    widgetRefreshWorker$doWork$1.L$0 = this;
                    widgetRefreshWorker$doWork$1.L$1 = applicationContext;
                    widgetRefreshWorker$doWork$1.label = 1;
                    if (gymWidgetUpdater.refresh(applicationContext, widgetRefreshWorker$doWork$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    widgetRefreshWorker = this;
                    context = applicationContext;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r6 = (Context) widgetRefreshWorker$doWork$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            this = r6;
                            Result.m7905constructorimpl(Unit.INSTANCE);
                            ?? r62 = this;
                            GymWidgetProvider.INSTANCE.requestUpdate(r62);
                            RideRunWidgetProvider.INSTANCE.requestUpdate(r62);
                            RecoveryWidgetProvider.INSTANCE.requestUpdate(r62);
                            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                                retry = ListenableWorker.Result.success();
                            } else {
                                retry = ListenableWorker.Result.retry();
                            }
                            Intrinsics.checkNotNullExpressionValue(retry, "fold(...)");
                            return retry;
                        }
                        Context context3 = (Context) widgetRefreshWorker$doWork$1.L$1;
                        ResultKt.throwOnFailure(obj);
                        context2 = context3;
                        Result.Companion companion2 = Result.INSTANCE;
                        RecoveryWidgetUpdater recoveryWidgetUpdater = RecoveryWidgetUpdater.INSTANCE;
                        widgetRefreshWorker$doWork$1.L$0 = context2;
                        widgetRefreshWorker$doWork$1.L$1 = null;
                        widgetRefreshWorker$doWork$1.label = 3;
                        refresh2 = recoveryWidgetUpdater.refresh(context2, widgetRefreshWorker$doWork$1);
                        this = context2;
                        if (refresh2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        ?? r622 = this;
                        GymWidgetProvider.INSTANCE.requestUpdate(r622);
                        RideRunWidgetProvider.INSTANCE.requestUpdate(r622);
                        RecoveryWidgetProvider.INSTANCE.requestUpdate(r622);
                        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                        }
                        Intrinsics.checkNotNullExpressionValue(retry, "fold(...)");
                        return retry;
                    }
                    Context context4 = (Context) widgetRefreshWorker$doWork$1.L$1;
                    widgetRefreshWorker = (WidgetRefreshWorker) widgetRefreshWorker$doWork$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    context = context4;
                }
                RideRunWidgetUpdater rideRunWidgetUpdater = RideRunWidgetUpdater.INSTANCE;
                widgetRefreshWorker$doWork$1.L$0 = widgetRefreshWorker;
                widgetRefreshWorker$doWork$1.L$1 = context;
                widgetRefreshWorker$doWork$1.label = 2;
                refresh = rideRunWidgetUpdater.refresh(context, widgetRefreshWorker$doWork$1);
                context2 = context;
                if (refresh == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Result.Companion companion22 = Result.INSTANCE;
                RecoveryWidgetUpdater recoveryWidgetUpdater2 = RecoveryWidgetUpdater.INSTANCE;
                widgetRefreshWorker$doWork$1.L$0 = context2;
                widgetRefreshWorker$doWork$1.L$1 = null;
                widgetRefreshWorker$doWork$1.label = 3;
                refresh2 = recoveryWidgetUpdater2.refresh(context2, widgetRefreshWorker$doWork$1);
                this = context2;
                if (refresh2 == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                ?? r6222 = this;
                GymWidgetProvider.INSTANCE.requestUpdate(r6222);
                RideRunWidgetProvider.INSTANCE.requestUpdate(r6222);
                RecoveryWidgetProvider.INSTANCE.requestUpdate(r6222);
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                }
                Intrinsics.checkNotNullExpressionValue(retry, "fold(...)");
                return retry;
            }
        }
        widgetRefreshWorker$doWork$1 = new WidgetRefreshWorker$doWork$1(this, continuation);
        Object obj2 = widgetRefreshWorker$doWork$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = widgetRefreshWorker$doWork$1.label;
        if (i != 0) {
        }
        RideRunWidgetUpdater rideRunWidgetUpdater2 = RideRunWidgetUpdater.INSTANCE;
        widgetRefreshWorker$doWork$1.L$0 = widgetRefreshWorker;
        widgetRefreshWorker$doWork$1.L$1 = context;
        widgetRefreshWorker$doWork$1.label = 2;
        refresh = rideRunWidgetUpdater2.refresh(context, widgetRefreshWorker$doWork$1);
        context2 = context;
        if (refresh == coroutine_suspended) {
        }
        Result.Companion companion222 = Result.INSTANCE;
        RecoveryWidgetUpdater recoveryWidgetUpdater22 = RecoveryWidgetUpdater.INSTANCE;
        widgetRefreshWorker$doWork$1.L$0 = context2;
        widgetRefreshWorker$doWork$1.L$1 = null;
        widgetRefreshWorker$doWork$1.label = 3;
        refresh2 = recoveryWidgetUpdater22.refresh(context2, widgetRefreshWorker$doWork$1);
        this = context2;
        if (refresh2 == coroutine_suspended) {
        }
        Result.m7905constructorimpl(Unit.INSTANCE);
        ?? r62222 = this;
        GymWidgetProvider.INSTANCE.requestUpdate(r62222);
        RideRunWidgetProvider.INSTANCE.requestUpdate(r62222);
        RecoveryWidgetProvider.INSTANCE.requestUpdate(r62222);
        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
        }
        Intrinsics.checkNotNullExpressionValue(retry, "fold(...)");
        return retry;
    }

    /* compiled from: WidgetRefreshWorker.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/example/rungps/widget/WidgetRefreshWorker$Companion;", "", "<init>", "()V", "PERIODIC_NAME", "", "ONE_SHOT_NAME", "enqueuePeriodic", "", "context", "Landroid/content/Context;", "enqueueOneShot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void enqueuePeriodic(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PeriodicWorkRequest build = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) WidgetRefreshWorker.class, 15L, TimeUnit.MINUTES).build();
            WorkManager.Companion companion = WorkManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).enqueueUniquePeriodicWork(WidgetRefreshWorker.PERIODIC_NAME, ExistingPeriodicWorkPolicy.KEEP, build);
        }

        public final void enqueueOneShot(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            OneTimeWorkRequest build = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) WidgetRefreshWorker.class).build();
            WorkManager.Companion companion = WorkManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.getInstance(applicationContext).enqueueUniqueWork(WidgetRefreshWorker.ONE_SHOT_NAME, ExistingWorkPolicy.REPLACE, build);
        }
    }
}
