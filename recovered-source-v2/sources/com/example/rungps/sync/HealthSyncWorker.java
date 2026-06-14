package com.example.rungps.sync;

import android.content.Context;
import androidx.health.connect.client.PermissionController;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.health.SleepScoring;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: HealthSyncWorker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sync/HealthSyncWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthSyncWorker extends CoroutineWorker {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSyncWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|127|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03af, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014c A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #0 {all -> 0x00b3, blocks: (B:50:0x008b, B:90:0x00ae, B:91:0x016c, B:103:0x014c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x003c, blocks: (B:12:0x0037, B:13:0x03a1, B:32:0x0381), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0369 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:19:0x0053, B:20:0x035f, B:22:0x0369, B:23:0x036b, B:27:0x02e4), top: B:18:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186 A[Catch: all -> 0x020e, TryCatch #8 {all -> 0x020e, blocks: (B:54:0x0180, B:56:0x0186, B:60:0x01a0), top: B:53:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x035c -> B:20:0x035f). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        HealthSyncWorker$doWork$1 healthSyncWorker$doWork$1;
        ?? r4;
        Context context;
        HealthConnectManager healthConnectManager;
        Set set;
        HealthSyncWorker healthSyncWorker;
        ZoneId zoneId;
        Repository repository;
        Context context2;
        HealthSyncWorker healthSyncWorker2;
        HealthConnectManager healthConnectManager2;
        Repository repository2;
        ZoneId zoneId2;
        Object m7905constructorimpl;
        HealthSyncWorker healthSyncWorker3;
        Repository repository3;
        Iterator it;
        Context context3;
        Ref.BooleanRef booleanRef;
        int resolveQuality;
        Context applicationContext;
        HealthConnectManager healthConnectManager3;
        Throwable th;
        Object m7905constructorimpl2;
        boolean containsAll;
        HealthConnectManager healthConnectManager4;
        ZoneId zoneId3;
        Iterator it2;
        HealthConnectManager healthConnectManager5;
        Context context4;
        HealthSyncWorker healthSyncWorker4;
        Set set2;
        HealthConnectManager healthConnectManager6;
        Repository repository4;
        Object upsertDailySteps;
        HealthSyncWorker healthSyncWorker5 = this;
        if (continuation instanceof HealthSyncWorker$doWork$1) {
            healthSyncWorker$doWork$1 = (HealthSyncWorker$doWork$1) continuation;
            if ((healthSyncWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                healthSyncWorker$doWork$1.label -= Integer.MIN_VALUE;
                Object obj = healthSyncWorker$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r4 = healthSyncWorker$doWork$1.label;
                switch (r4) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        healthConnectManager3 = new HealthConnectManager(applicationContext);
                        if (!healthConnectManager3.isAvailable()) {
                            ListenableWorker.Result success = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                            return success;
                        }
                        PermissionController permissionController = healthConnectManager3.permissionController();
                        if (permissionController == null) {
                            ListenableWorker.Result success2 = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
                            return success2;
                        }
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            HealthSyncWorker healthSyncWorker6 = healthSyncWorker5;
                            healthSyncWorker$doWork$1.L$0 = healthSyncWorker5;
                            healthSyncWorker$doWork$1.L$1 = applicationContext;
                            healthSyncWorker$doWork$1.L$2 = healthConnectManager3;
                            healthSyncWorker$doWork$1.label = 1;
                            obj = permissionController.getGrantedPermissions(healthSyncWorker$doWork$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            m7905constructorimpl2 = Result.m7905constructorimpl((Set) obj);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion2 = Result.INSTANCE;
                            m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            healthSyncWorker2 = healthSyncWorker5;
                            context = applicationContext;
                            HealthConnectManager healthConnectManager7 = healthConnectManager3;
                            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                            }
                            set = (Set) m7905constructorimpl2;
                            repository2 = Repository.INSTANCE.get(context);
                            ZoneId systemDefault = ZoneId.systemDefault();
                            containsAll = set.containsAll(healthConnectManager7.getStepsReadPermissions());
                            zoneId2 = systemDefault;
                            healthConnectManager2 = healthConnectManager7;
                            if (containsAll) {
                            }
                            repository = repository2;
                            healthSyncWorker = healthSyncWorker2;
                            zoneId = zoneId2;
                            healthConnectManager = healthConnectManager2;
                            if (set.containsAll(healthConnectManager.getSleepReadPermissions())) {
                            }
                            ListenableWorker.Result success3 = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success3, "success(...)");
                            return success3;
                        }
                        healthSyncWorker2 = healthSyncWorker5;
                        context = applicationContext;
                        HealthConnectManager healthConnectManager72 = healthConnectManager3;
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                            m7905constructorimpl2 = SetsKt.emptySet();
                        }
                        set = (Set) m7905constructorimpl2;
                        repository2 = Repository.INSTANCE.get(context);
                        ZoneId systemDefault2 = ZoneId.systemDefault();
                        containsAll = set.containsAll(healthConnectManager72.getStepsReadPermissions());
                        zoneId2 = systemDefault2;
                        healthConnectManager2 = healthConnectManager72;
                        if (containsAll) {
                            Result.Companion companion3 = Result.INSTANCE;
                            HealthSyncWorker healthSyncWorker7 = healthSyncWorker2;
                            Intrinsics.checkNotNull(systemDefault2);
                            healthSyncWorker$doWork$1.L$0 = healthSyncWorker2;
                            healthSyncWorker$doWork$1.L$1 = context;
                            healthSyncWorker$doWork$1.L$2 = healthConnectManager72;
                            healthSyncWorker$doWork$1.L$3 = set;
                            healthSyncWorker$doWork$1.L$4 = repository2;
                            healthSyncWorker$doWork$1.L$5 = systemDefault2;
                            healthSyncWorker$doWork$1.label = 2;
                            obj = healthConnectManager72.readDailyStepsBackward(21, systemDefault2, healthSyncWorker$doWork$1);
                            zoneId3 = systemDefault2;
                            healthConnectManager4 = healthConnectManager72;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it2 = ((List) obj).iterator();
                            r4 = zoneId3;
                            healthConnectManager5 = healthConnectManager4;
                            while (true) {
                                Repository repository5 = repository2;
                                Context context5 = context;
                                Set set3 = set;
                                HealthSyncWorker healthSyncWorker8 = healthSyncWorker2;
                                HealthConnectManager healthConnectManager8 = healthConnectManager5;
                                while (true) {
                                    try {
                                        if (!it2.hasNext()) {
                                            context4 = context5;
                                            healthSyncWorker4 = healthSyncWorker8;
                                            set2 = set3;
                                            healthConnectManager6 = healthConnectManager8;
                                            repository4 = repository5;
                                            Result.m7905constructorimpl(Unit.INSTANCE);
                                            context = context4;
                                            healthSyncWorker = healthSyncWorker4;
                                            set = set2;
                                            healthConnectManager = healthConnectManager6;
                                            repository = repository4;
                                            zoneId = r4;
                                        } else {
                                            Pair pair = (Pair) it2.next();
                                            LocalDate localDate = (LocalDate) pair.component1();
                                            long longValue = ((Number) pair.component2()).longValue();
                                            if (longValue >= 0) {
                                                long epochDay = localDate.toEpochDay();
                                                healthSyncWorker$doWork$1.L$0 = healthSyncWorker8;
                                                healthSyncWorker$doWork$1.L$1 = context5;
                                                healthSyncWorker$doWork$1.L$2 = healthConnectManager8;
                                                healthSyncWorker$doWork$1.L$3 = set3;
                                                healthSyncWorker$doWork$1.L$4 = repository5;
                                                healthSyncWorker$doWork$1.L$5 = r4;
                                                healthSyncWorker$doWork$1.L$6 = it2;
                                                healthSyncWorker$doWork$1.label = 3;
                                                context4 = context5;
                                                healthSyncWorker4 = healthSyncWorker8;
                                                set2 = set3;
                                                healthConnectManager6 = healthConnectManager8;
                                                repository4 = repository5;
                                                try {
                                                    upsertDailySteps = repository5.upsertDailySteps(epochDay, longValue, "health_connect", (r20 & 8) != 0 ? System.currentTimeMillis() : 0L, healthSyncWorker$doWork$1);
                                                    if (upsertDailySteps == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    context = context4;
                                                    healthSyncWorker2 = healthSyncWorker4;
                                                    set = set2;
                                                    healthConnectManager5 = healthConnectManager6;
                                                    repository2 = repository4;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                        th = th3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        context4 = context5;
                                        healthSyncWorker4 = healthSyncWorker8;
                                        set2 = set3;
                                        healthConnectManager6 = healthConnectManager8;
                                        repository4 = repository5;
                                    }
                                    context = context4;
                                    healthSyncWorker2 = healthSyncWorker4;
                                    set = set2;
                                    healthConnectManager2 = healthConnectManager6;
                                    repository2 = repository4;
                                    Result.Companion companion4 = Result.INSTANCE;
                                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                                    zoneId2 = r4;
                                }
                            }
                        }
                        repository = repository2;
                        healthSyncWorker = healthSyncWorker2;
                        zoneId = zoneId2;
                        healthConnectManager = healthConnectManager2;
                        if (set.containsAll(healthConnectManager.getSleepReadPermissions())) {
                            try {
                                Result.Companion companion5 = Result.INSTANCE;
                                HealthSyncWorker healthSyncWorker9 = healthSyncWorker;
                                Intrinsics.checkNotNull(zoneId);
                                healthSyncWorker$doWork$1.L$0 = healthSyncWorker;
                                healthSyncWorker$doWork$1.L$1 = context;
                                healthSyncWorker$doWork$1.L$2 = repository;
                                healthSyncWorker$doWork$1.L$3 = null;
                                healthSyncWorker$doWork$1.L$4 = null;
                                healthSyncWorker$doWork$1.L$5 = null;
                                healthSyncWorker$doWork$1.L$6 = null;
                                healthSyncWorker$doWork$1.label = 4;
                                obj = healthConnectManager.readSleepSessions(35, zoneId, healthSyncWorker$doWork$1);
                            } catch (Throwable th5) {
                                th = th5;
                                context2 = context;
                                Result.Companion companion6 = Result.INSTANCE;
                                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                List emptyList = CollectionsKt.emptyList();
                                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                }
                                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                                healthSyncWorker3 = healthSyncWorker;
                                repository3 = repository;
                                it = CollectionsKt.take((List) m7905constructorimpl, 96).iterator();
                                context3 = context2;
                                booleanRef = booleanRef2;
                                if (!it.hasNext()) {
                                }
                            }
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            context2 = context;
                            m7905constructorimpl = Result.m7905constructorimpl((List) obj);
                            List emptyList2 = CollectionsKt.emptyList();
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                m7905constructorimpl = emptyList2;
                            }
                            Ref.BooleanRef booleanRef22 = new Ref.BooleanRef();
                            healthSyncWorker3 = healthSyncWorker;
                            repository3 = repository;
                            it = CollectionsKt.take((List) m7905constructorimpl, 96).iterator();
                            context3 = context2;
                            booleanRef = booleanRef22;
                            if (!it.hasNext()) {
                                HealthConnectManager.SleepWindow sleepWindow = (HealthConnectManager.SleepWindow) it.next();
                                Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(sleepWindow.getEfficiencyPercent(), sleepWindow.getAsleepMin(), sleepWindow.getInBedMin(), sleepWindow.getDeepMin(), sleepWindow.getLightMin());
                                resolveQuality = SleepScoring.INSTANCE.resolveQuality(sleepWindow.getSource(), sleepWindow.getAsleepMin(), (r18 & 4) != 0 ? null : sleepWindow.getDeepMin(), (r18 & 8) != 0 ? null : sleepWindow.getLightMin(), (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Boxing.boxInt(sleepWindow.getInBedMin()), (r18 & 64) != 0 ? null : null);
                                Result.Companion companion7 = Result.INSTANCE;
                                HealthSyncWorker healthSyncWorker10 = healthSyncWorker3;
                                SleepEntryEntity sleepEntryEntity = new SleepEntryEntity(0L, sleepWindow.getStartTime().toEpochMilli(), sleepWindow.getEndTime().toEpochMilli(), sleepWindow.getAsleepMin(), sleepWindow.getDeepMin(), sleepWindow.getLightMin(), resolveEfficiency, Boxing.boxInt(resolveQuality), sleepWindow.getSource(), null, null, null, null, null, sleepWindow.getRemMin(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073724929, null);
                                healthSyncWorker$doWork$1.L$0 = healthSyncWorker3;
                                healthSyncWorker$doWork$1.L$1 = context3;
                                healthSyncWorker$doWork$1.L$2 = repository3;
                                healthSyncWorker$doWork$1.L$3 = booleanRef;
                                healthSyncWorker$doWork$1.L$4 = it;
                                healthSyncWorker$doWork$1.L$5 = null;
                                healthSyncWorker$doWork$1.L$6 = null;
                                healthSyncWorker$doWork$1.label = 5;
                                obj = repository3.addSleepEntry(sleepEntryEntity, healthSyncWorker$doWork$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Number) obj).longValue() > 0) {
                                    booleanRef.element = true;
                                }
                                Result.m7905constructorimpl(Unit.INSTANCE);
                                if (!it.hasNext()) {
                                    if (booleanRef.element) {
                                        Result.Companion companion8 = Result.INSTANCE;
                                        HealthSyncWorker healthSyncWorker11 = healthSyncWorker3;
                                        SleepFirestoreSync sleepFirestoreSync = SleepFirestoreSync.INSTANCE;
                                        healthSyncWorker$doWork$1.L$0 = null;
                                        healthSyncWorker$doWork$1.L$1 = null;
                                        healthSyncWorker$doWork$1.L$2 = null;
                                        healthSyncWorker$doWork$1.L$3 = null;
                                        healthSyncWorker$doWork$1.L$4 = null;
                                        healthSyncWorker$doWork$1.L$5 = null;
                                        healthSyncWorker$doWork$1.L$6 = null;
                                        healthSyncWorker$doWork$1.label = 6;
                                        obj = sleepFirestoreSync.pushRecent(context3, 90, healthSyncWorker$doWork$1);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                                    }
                                }
                            }
                        }
                        ListenableWorker.Result success32 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success32, "success(...)");
                        return success32;
                    case 1:
                        HealthConnectManager healthConnectManager9 = (HealthConnectManager) healthSyncWorker$doWork$1.L$2;
                        applicationContext = (Context) healthSyncWorker$doWork$1.L$1;
                        HealthSyncWorker healthSyncWorker12 = (HealthSyncWorker) healthSyncWorker$doWork$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            healthConnectManager3 = healthConnectManager9;
                            healthSyncWorker5 = healthSyncWorker12;
                            m7905constructorimpl2 = Result.m7905constructorimpl((Set) obj);
                        } catch (Throwable th6) {
                            th = th6;
                            healthConnectManager3 = healthConnectManager9;
                            healthSyncWorker5 = healthSyncWorker12;
                            Result.Companion companion22 = Result.INSTANCE;
                            m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            healthSyncWorker2 = healthSyncWorker5;
                            context = applicationContext;
                            HealthConnectManager healthConnectManager722 = healthConnectManager3;
                            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                            }
                            set = (Set) m7905constructorimpl2;
                            repository2 = Repository.INSTANCE.get(context);
                            ZoneId systemDefault22 = ZoneId.systemDefault();
                            containsAll = set.containsAll(healthConnectManager722.getStepsReadPermissions());
                            zoneId2 = systemDefault22;
                            healthConnectManager2 = healthConnectManager722;
                            if (containsAll) {
                            }
                            repository = repository2;
                            healthSyncWorker = healthSyncWorker2;
                            zoneId = zoneId2;
                            healthConnectManager = healthConnectManager2;
                            if (set.containsAll(healthConnectManager.getSleepReadPermissions())) {
                            }
                            ListenableWorker.Result success322 = ListenableWorker.Result.success();
                            Intrinsics.checkNotNullExpressionValue(success322, "success(...)");
                            return success322;
                        }
                        healthSyncWorker2 = healthSyncWorker5;
                        context = applicationContext;
                        HealthConnectManager healthConnectManager7222 = healthConnectManager3;
                        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                        }
                        set = (Set) m7905constructorimpl2;
                        repository2 = Repository.INSTANCE.get(context);
                        ZoneId systemDefault222 = ZoneId.systemDefault();
                        containsAll = set.containsAll(healthConnectManager7222.getStepsReadPermissions());
                        zoneId2 = systemDefault222;
                        healthConnectManager2 = healthConnectManager7222;
                        if (containsAll) {
                        }
                        repository = repository2;
                        healthSyncWorker = healthSyncWorker2;
                        zoneId = zoneId2;
                        healthConnectManager = healthConnectManager2;
                        if (set.containsAll(healthConnectManager.getSleepReadPermissions())) {
                        }
                        ListenableWorker.Result success3222 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success3222, "success(...)");
                        return success3222;
                    case 2:
                        ZoneId zoneId4 = (ZoneId) healthSyncWorker$doWork$1.L$5;
                        repository2 = (Repository) healthSyncWorker$doWork$1.L$4;
                        set = (Set) healthSyncWorker$doWork$1.L$3;
                        HealthConnectManager healthConnectManager10 = (HealthConnectManager) healthSyncWorker$doWork$1.L$2;
                        context = (Context) healthSyncWorker$doWork$1.L$1;
                        healthSyncWorker2 = (HealthSyncWorker) healthSyncWorker$doWork$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        zoneId3 = zoneId4;
                        healthConnectManager4 = healthConnectManager10;
                        it2 = ((List) obj).iterator();
                        r4 = zoneId3;
                        healthConnectManager5 = healthConnectManager4;
                        while (true) {
                            Repository repository52 = repository2;
                            Context context52 = context;
                            Set set32 = set;
                            HealthSyncWorker healthSyncWorker82 = healthSyncWorker2;
                            HealthConnectManager healthConnectManager82 = healthConnectManager5;
                            while (true) {
                                if (!it2.hasNext()) {
                                }
                                th = th3;
                                context = context4;
                                healthSyncWorker2 = healthSyncWorker4;
                                set = set2;
                                healthConnectManager2 = healthConnectManager6;
                                repository2 = repository4;
                                Result.Companion companion42 = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th));
                                zoneId2 = r4;
                                repository = repository2;
                                healthSyncWorker = healthSyncWorker2;
                                zoneId = zoneId2;
                                healthConnectManager = healthConnectManager2;
                                break;
                            }
                            context = context4;
                            healthSyncWorker2 = healthSyncWorker4;
                            set = set2;
                            healthConnectManager5 = healthConnectManager6;
                            repository2 = repository4;
                        }
                        break;
                    case 3:
                        it2 = (Iterator) healthSyncWorker$doWork$1.L$6;
                        ZoneId zoneId5 = (ZoneId) healthSyncWorker$doWork$1.L$5;
                        repository2 = (Repository) healthSyncWorker$doWork$1.L$4;
                        set = (Set) healthSyncWorker$doWork$1.L$3;
                        HealthConnectManager healthConnectManager11 = (HealthConnectManager) healthSyncWorker$doWork$1.L$2;
                        context = (Context) healthSyncWorker$doWork$1.L$1;
                        healthSyncWorker2 = (HealthSyncWorker) healthSyncWorker$doWork$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r4 = zoneId5;
                        healthConnectManager5 = healthConnectManager11;
                        while (true) {
                            Repository repository522 = repository2;
                            Context context522 = context;
                            Set set322 = set;
                            HealthSyncWorker healthSyncWorker822 = healthSyncWorker2;
                            HealthConnectManager healthConnectManager822 = healthConnectManager5;
                            while (true) {
                                if (!it2.hasNext()) {
                                }
                                th = th3;
                                context = context4;
                                healthSyncWorker2 = healthSyncWorker4;
                                set = set2;
                                healthConnectManager2 = healthConnectManager6;
                                repository2 = repository4;
                                Result.Companion companion422 = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th));
                                zoneId2 = r4;
                                repository = repository2;
                                healthSyncWorker = healthSyncWorker2;
                                zoneId = zoneId2;
                                healthConnectManager = healthConnectManager2;
                                break;
                            }
                            context = context4;
                            healthSyncWorker2 = healthSyncWorker4;
                            set = set2;
                            healthConnectManager5 = healthConnectManager6;
                            repository2 = repository4;
                        }
                        break;
                    case 4:
                        repository = (Repository) healthSyncWorker$doWork$1.L$2;
                        context2 = (Context) healthSyncWorker$doWork$1.L$1;
                        healthSyncWorker = (HealthSyncWorker) healthSyncWorker$doWork$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            m7905constructorimpl = Result.m7905constructorimpl((List) obj);
                        } catch (Throwable th7) {
                            th = th7;
                            Result.Companion companion62 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            List emptyList22 = CollectionsKt.emptyList();
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            Ref.BooleanRef booleanRef222 = new Ref.BooleanRef();
                            healthSyncWorker3 = healthSyncWorker;
                            repository3 = repository;
                            it = CollectionsKt.take((List) m7905constructorimpl, 96).iterator();
                            context3 = context2;
                            booleanRef = booleanRef222;
                            if (!it.hasNext()) {
                            }
                        }
                        List emptyList222 = CollectionsKt.emptyList();
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        Ref.BooleanRef booleanRef2222 = new Ref.BooleanRef();
                        healthSyncWorker3 = healthSyncWorker;
                        repository3 = repository;
                        it = CollectionsKt.take((List) m7905constructorimpl, 96).iterator();
                        context3 = context2;
                        booleanRef = booleanRef2222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        it = (Iterator) healthSyncWorker$doWork$1.L$4;
                        booleanRef = (Ref.BooleanRef) healthSyncWorker$doWork$1.L$3;
                        repository3 = (Repository) healthSyncWorker$doWork$1.L$2;
                        context3 = (Context) healthSyncWorker$doWork$1.L$1;
                        healthSyncWorker3 = (HealthSyncWorker) healthSyncWorker$doWork$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th8) {
                            Result.Companion companion9 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th8));
                        }
                        if (((Number) obj).longValue() > 0) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
                        ListenableWorker.Result success32222 = ListenableWorker.Result.success();
                        Intrinsics.checkNotNullExpressionValue(success32222, "success(...)");
                        return success32222;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        healthSyncWorker$doWork$1 = new HealthSyncWorker$doWork$1(healthSyncWorker5, continuation);
        Object obj2 = healthSyncWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = healthSyncWorker$doWork$1.label;
        switch (r4) {
        }
    }
}
