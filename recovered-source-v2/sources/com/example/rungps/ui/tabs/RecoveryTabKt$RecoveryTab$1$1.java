package com.example.rungps.ui.tabs;

import android.content.Context;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.recovery.StravaRecoverySyncResult;
import com.google.api.Endpoint;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$1$1", f = "RecoveryTab.kt", i = {0, 1, 2, 3, 4}, l = {77, ExerciseSessionRecord.EXERCISE_TYPE_WALKING, 84, Endpoint.TARGET_FIELD_NUMBER, 104, 106}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u244", "$this$invokeSuspend_u24lambda_u244", "$this$invokeSuspend_u24lambda_u244", "$this$invokeSuspend_u24lambda_u244", "today"}, s = {"L$3", "L$3", "L$2", "L$2", "L$1"})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ HealthConnectManager $hcRecovery;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ boolean $stravaConnected;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$1$1(boolean z, Repository repository, HealthConnectManager healthConnectManager, Context context, Continuation<? super RecoveryTabKt$RecoveryTab$1$1> continuation) {
        super(2, continuation);
        this.$stravaConnected = z;
        this.$repo = repository;
        this.$hcRecovery = healthConnectManager;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecoveryTabKt$RecoveryTab$1$1 recoveryTabKt$RecoveryTab$1$1 = new RecoveryTabKt$RecoveryTab$1$1(this.$stravaConnected, this.$repo, this.$hcRecovery, this.$ctx, continuation);
        recoveryTabKt$RecoveryTab$1$1.L$0 = obj;
        return recoveryTabKt$RecoveryTab$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d5 A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9 A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c5 A[Catch: all -> 0x0204, TryCatch #1 {all -> 0x0204, blocks: (B:7:0x0014, B:8:0x01fe, B:17:0x01ca, B:20:0x01d1, B:22:0x01d5, B:24:0x01df, B:29:0x01c0, B:34:0x0175, B:37:0x0181, B:39:0x018f, B:48:0x017d, B:95:0x016b, B:51:0x0051, B:53:0x0142, B:55:0x0148, B:61:0x0066, B:63:0x00e2, B:66:0x00fe, B:68:0x0106, B:70:0x010c, B:73:0x0113, B:75:0x0119, B:77:0x011f, B:80:0x00e9, B:82:0x0088, B:85:0x00c5, B:91:0x00a0, B:31:0x003b, B:33:0x0164, B:57:0x0150), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Repository repository;
        LocalDate localDate;
        Object readStepsForDay$default;
        Object m7905constructorimpl2;
        Long l;
        CoroutineDispatcher io2;
        RecoveryTabKt$RecoveryTab$1$1$1$3 recoveryTabKt$RecoveryTab$1$1$1$3;
        CoroutineScope coroutineScope;
        boolean z;
        Repository repository2;
        HealthConnectManager healthConnectManager;
        Context context;
        CoroutineScope coroutineScope2;
        Context context2;
        HealthConnectManager healthConnectManager2;
        Repository repository3;
        Object m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default;
        CoroutineScope coroutineScope3;
        StravaRecoverySyncResult stravaRecoverySyncResult;
        MainCoroutineDispatcher main;
        RecoveryTabKt$RecoveryTab$1$1$1$2 recoveryTabKt$RecoveryTab$1$1$1$2;
        PermissionController permissionController;
        Object grantedPermissions;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                z = this.$stravaConnected;
                repository2 = this.$repo;
                healthConnectManager = this.$hcRecovery;
                context = this.$ctx;
                Result.Companion companion3 = Result.INSTANCE;
                CoroutineDispatcher io3 = Dispatchers.getIO();
                RecoveryTabKt$RecoveryTab$1$1$1$1 recoveryTabKt$RecoveryTab$1$1$1$1 = new RecoveryTabKt$RecoveryTab$1$1$1$1(repository2, null);
                this.L$0 = repository2;
                this.L$1 = healthConnectManager;
                this.L$2 = context;
                this.L$3 = coroutineScope;
                this.Z$0 = z;
                this.label = 1;
                if (BuildersKt.withContext(io3, recoveryTabKt$RecoveryTab$1$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                context2 = context;
                HealthConnectManager healthConnectManager3 = healthConnectManager;
                Repository repository4 = repository2;
                if (!z) {
                    this.L$0 = repository4;
                    this.L$1 = healthConnectManager3;
                    this.L$2 = context2;
                    this.L$3 = coroutineScope2;
                    this.label = 2;
                    m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default = Repository.m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default(repository4, 0L, 0, this, 3, null);
                    if (m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope3 = coroutineScope2;
                    healthConnectManager2 = healthConnectManager3;
                    repository3 = repository4;
                    if (Result.m7908exceptionOrNullimpl(m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default) == null) {
                        m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default = new StravaRecoverySyncResult(0, 0, 0, 0, 0, 0, 0, 64, null);
                    }
                    stravaRecoverySyncResult = (StravaRecoverySyncResult) m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default;
                    if ((stravaRecoverySyncResult.getApiTrainingCount() == 0 || stravaRecoverySyncResult.getInWindowCount() != 0 || stravaRecoverySyncResult.getInserted() != 0) && (stravaRecoverySyncResult.getInserted() > 0 || stravaRecoverySyncResult.getApiTrainingCount() > 0)) {
                        main = Dispatchers.getMain();
                        recoveryTabKt$RecoveryTab$1$1$1$2 = new RecoveryTabKt$RecoveryTab$1$1$1$2(stravaRecoverySyncResult, context2, null);
                        this.L$0 = repository3;
                        this.L$1 = healthConnectManager2;
                        this.L$2 = coroutineScope3;
                        this.L$3 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(main, recoveryTabKt$RecoveryTab$1$1$1$2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    coroutineScope2 = coroutineScope3;
                    if (healthConnectManager2.isReady() && (permissionController = healthConnectManager2.permissionController()) != null) {
                        Result.Companion companion4 = Result.INSTANCE;
                        this.L$0 = repository3;
                        this.L$1 = healthConnectManager2;
                        this.L$2 = coroutineScope2;
                        this.L$3 = null;
                        this.label = 4;
                        grantedPermissions = permissionController.getGrantedPermissions(this);
                        if (grantedPermissions == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        m7905constructorimpl = Result.m7905constructorimpl((Set) grantedPermissions);
                        Repository repository5 = repository3;
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                            m7905constructorimpl = SetsKt.emptySet();
                        }
                        if (((Set) m7905constructorimpl).containsAll(healthConnectManager2.getStepsReadPermissions())) {
                            LocalDate now = LocalDate.now(ZoneId.systemDefault());
                            try {
                                Result.Companion companion5 = Result.INSTANCE;
                                Intrinsics.checkNotNull(now);
                                this.L$0 = repository5;
                                this.L$1 = now;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 5;
                                readStepsForDay$default = HealthConnectManager.readStepsForDay$default(healthConnectManager2, now, null, this, 2, null);
                            } catch (Throwable th3) {
                                th = th3;
                                repository = repository5;
                                localDate = now;
                                Result.Companion companion6 = Result.INSTANCE;
                                m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                                }
                                l = (Long) m7905constructorimpl2;
                                if (l != null) {
                                }
                                Result.m7905constructorimpl(Unit.INSTANCE);
                                return Unit.INSTANCE;
                            }
                            if (readStepsForDay$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            repository = repository5;
                            localDate = now;
                            m7905constructorimpl2 = Result.m7905constructorimpl((Long) readStepsForDay$default);
                            if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                                m7905constructorimpl2 = null;
                            }
                            l = (Long) m7905constructorimpl2;
                            if (l != null && l.longValue() >= 0) {
                                io2 = Dispatchers.getIO();
                                recoveryTabKt$RecoveryTab$1$1$1$3 = new RecoveryTabKt$RecoveryTab$1$1$1$3(repository, localDate, l, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 6;
                                if (BuildersKt.withContext(io2, recoveryTabKt$RecoveryTab$1$1$1$3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                healthConnectManager2 = healthConnectManager3;
                repository3 = repository4;
                if (healthConnectManager2.isReady()) {
                    Result.Companion companion42 = Result.INSTANCE;
                    this.L$0 = repository3;
                    this.L$1 = healthConnectManager2;
                    this.L$2 = coroutineScope2;
                    this.L$3 = null;
                    this.label = 4;
                    grantedPermissions = permissionController.getGrantedPermissions(this);
                    if (grantedPermissions == coroutine_suspended) {
                    }
                    m7905constructorimpl = Result.m7905constructorimpl((Set) grantedPermissions);
                    Repository repository52 = repository3;
                    if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                    }
                    if (((Set) m7905constructorimpl).containsAll(healthConnectManager2.getStepsReadPermissions())) {
                    }
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                z = this.Z$0;
                coroutineScope = (CoroutineScope) this.L$3;
                context = (Context) this.L$2;
                healthConnectManager = (HealthConnectManager) this.L$1;
                repository2 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope;
                context2 = context;
                HealthConnectManager healthConnectManager32 = healthConnectManager;
                Repository repository42 = repository2;
                if (!z) {
                }
                break;
            case 2:
                coroutineScope3 = (CoroutineScope) this.L$3;
                Context context3 = (Context) this.L$2;
                HealthConnectManager healthConnectManager4 = (HealthConnectManager) this.L$1;
                Repository repository6 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default = ((Result) obj).getValue();
                context2 = context3;
                healthConnectManager2 = healthConnectManager4;
                repository3 = repository6;
                if (Result.m7908exceptionOrNullimpl(m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default) == null) {
                }
                stravaRecoverySyncResult = (StravaRecoverySyncResult) m6835syncStravaActivitiesForRecoveryIfDue0E7RQCE$default;
                if (stravaRecoverySyncResult.getApiTrainingCount() == 0) {
                    break;
                }
                main = Dispatchers.getMain();
                recoveryTabKt$RecoveryTab$1$1$1$2 = new RecoveryTabKt$RecoveryTab$1$1$1$2(stravaRecoverySyncResult, context2, null);
                this.L$0 = repository3;
                this.L$1 = healthConnectManager2;
                this.L$2 = coroutineScope3;
                this.L$3 = null;
                this.label = 3;
                if (BuildersKt.withContext(main, recoveryTabKt$RecoveryTab$1$1$1$2, this) == coroutine_suspended) {
                }
                coroutineScope2 = coroutineScope3;
                if (healthConnectManager2.isReady()) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                coroutineScope3 = (CoroutineScope) this.L$2;
                healthConnectManager2 = (HealthConnectManager) this.L$1;
                repository3 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope3;
                if (healthConnectManager2.isReady()) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                healthConnectManager2 = (HealthConnectManager) this.L$1;
                repository3 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                grantedPermissions = obj;
                m7905constructorimpl = Result.m7905constructorimpl((Set) grantedPermissions);
                Repository repository522 = repository3;
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                }
                if (((Set) m7905constructorimpl).containsAll(healthConnectManager2.getStepsReadPermissions())) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                localDate = (LocalDate) this.L$1;
                repository = (Repository) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    readStepsForDay$default = obj;
                    m7905constructorimpl2 = Result.m7905constructorimpl((Long) readStepsForDay$default);
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion62 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    }
                    l = (Long) m7905constructorimpl2;
                    if (l != null) {
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                l = (Long) m7905constructorimpl2;
                if (l != null) {
                    io2 = Dispatchers.getIO();
                    recoveryTabKt$RecoveryTab$1$1$1$3 = new RecoveryTabKt$RecoveryTab$1$1$1$3(repository, localDate, l, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 6;
                    if (BuildersKt.withContext(io2, recoveryTabKt$RecoveryTab$1$1$1$3, this) == coroutine_suspended) {
                    }
                    break;
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                Result.m7905constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
