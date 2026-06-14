package com.example.rungps;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.nfc.GymLeaveNotifier;
import com.example.rungps.nfc.GymLocationHelper;
import com.example.rungps.nfc.GymNfcGuard;
import com.example.rungps.sleep.SleepAlarmScheduler;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.widget.WidgetBootstrap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$onResume$1", f = "MainActivity.kt", i = {0}, l = {547, 550, 551}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class MainActivity$onResume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onResume$1(MainActivity mainActivity, Continuation<? super MainActivity$onResume$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$onResume$1 mainActivity$onResume$1 = new MainActivity$onResume$1(this.this$0, continuation);
        mainActivity$onResume$1.L$0 = obj;
        return mainActivity$onResume$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$onResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:2)|(1:(1:(1:(7:7|8|9|(3:11|(1:13)|14)|15|16|17)(2:20|21))(5:22|23|24|25|(1:27)(6:28|9|(0)|15|16|17)))(2:29|30))(6:43|44|45|46|47|(1:49))|31|32|33|34|35|36|(1:38)|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00dd A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:8:0x0015, B:9:0x00d9, B:11:0x00dd, B:13:0x00e8, B:14:0x00f4, B:15:0x0103, B:23:0x0026, B:25:0x00c2, B:36:0x00b0), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        Object openGymSession;
        MainActivity mainActivity2;
        GymSessionEntity gymSessionEntity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MainActivity mainActivity3 = this.this$0;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                SleepListenService.INSTANCE.resumeIfSessionActive(mainActivity3);
                SleepAlarmScheduler.INSTANCE.ensureScheduled(mainActivity3);
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
            MainActivity mainActivity4 = this.this$0;
            Result.Companion companion5 = Result.INSTANCE;
            Repository repository = Repository.INSTANCE.get(mainActivity4);
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = repository.pruneJunkFinishedRuns(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mainActivity2 = (MainActivity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    gymSessionEntity = (GymSessionEntity) obj;
                    if (gymSessionEntity != null) {
                        if (GymNfcGuard.INSTANCE.isAtGym(mainActivity2)) {
                            GymLeaveNotifier.INSTANCE.markAtGymDuringSession(mainActivity2, gymSessionEntity.getId());
                        }
                        GymLeaveNotifier.INSTANCE.maybeNotifyLeftGym(mainActivity2, Boxing.boxLong(gymSessionEntity.getId()));
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                MainActivity mainActivity5 = (MainActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
                mainActivity = mainActivity5;
                Repository repository2 = Repository.INSTANCE.get(mainActivity);
                this.L$0 = mainActivity;
                this.label = 3;
                openGymSession = repository2.openGymSession(this);
                if (openGymSession != coroutine_suspended) {
                    return coroutine_suspended;
                }
                MainActivity mainActivity6 = mainActivity;
                obj = openGymSession;
                mainActivity2 = mainActivity6;
                gymSessionEntity = (GymSessionEntity) obj;
                if (gymSessionEntity != null) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
        MainActivity mainActivity7 = this.this$0;
        Result.Companion companion6 = Result.INSTANCE;
        WidgetBootstrap.refreshAllAsync$default(WidgetBootstrap.INSTANCE, mainActivity7, false, 2, null);
        Result.m7905constructorimpl(Unit.INSTANCE);
        mainActivity = this.this$0;
        Result.Companion companion7 = Result.INSTANCE;
        this.L$0 = mainActivity;
        this.label = 2;
        if (GymLocationHelper.INSTANCE.refreshStoredLocation(mainActivity, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Repository repository22 = Repository.INSTANCE.get(mainActivity);
        this.L$0 = mainActivity;
        this.label = 3;
        openGymSession = repository22.openGymSession(this);
        if (openGymSession != coroutine_suspended) {
        }
    }
}
