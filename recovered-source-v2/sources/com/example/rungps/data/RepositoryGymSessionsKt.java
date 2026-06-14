package com.example.rungps.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.gym.GymActiveSessionForegroundService;
import com.example.rungps.gym.GymRestTimerStore;
import com.example.rungps.gym.GymSessionTiming;
import com.example.rungps.nfc.GymLeaveNotifier;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.sync.GymFirestoreSync;
import com.example.rungps.sync.GymSyncQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RepositoryGymSessions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080@¢\u0006\u0002\u0010\b\u001al\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"completeGymSessionImpl", "", "Lcom/example/rungps/data/Repository;", "context", "Landroid/content/Context;", "sessionId", "", "endedAtMs", "(Lcom/example/rungps/data/Repository;Landroid/content/Context;JLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importRemoteGymSessionImpl", "remoteId", "", "startedAtMs", "templateDayId", "freeDay", "notes", "sets", "", "Lcom/example/rungps/data/RemoteGymSetRow;", "ambientTag", "ambientTagCustom", "(Lcom/example/rungps/data/Repository;Ljava/lang/String;JJLjava/lang/Long;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepositoryGymSessionsKt {
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|163|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0080, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cd, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ca, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x030b, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
        r6 = r6;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0382 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0338 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ef A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #8 {all -> 0x005a, blocks: (B:28:0x0055, B:29:0x0304, B:45:0x02ef), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245 A[Catch: all -> 0x0287, TryCatch #5 {all -> 0x0287, blocks: (B:71:0x020b, B:72:0x023f, B:74:0x0245, B:77:0x0255, B:82:0x0259, B:84:0x0264, B:85:0x026e, B:87:0x0274, B:89:0x027e, B:90:0x0281), top: B:70:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0264 A[Catch: all -> 0x0287, TryCatch #5 {all -> 0x0287, blocks: (B:71:0x020b, B:72:0x023f, B:74:0x0245, B:77:0x0255, B:82:0x0259, B:84:0x0264, B:85:0x026e, B:87:0x0274, B:89:0x027e, B:90:0x0281), top: B:70:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object completeGymSessionImpl(Repository repository, Context context, long j, Long l, Continuation<? super Boolean> continuation) {
        RepositoryGymSessionsKt$completeGymSessionImpl$1 repositoryGymSessionsKt$completeGymSessionImpl$1;
        ?? r6;
        Object m7905constructorimpl;
        Context context2;
        Repository repository2;
        ArrayList arrayList;
        Repository repository3;
        Context context3;
        Object autoClassifyGymSessionMuscles;
        Object rebuildGymRecoveryForSession;
        Repository repository4;
        Context context4;
        Repository repository5;
        Context context5;
        Context context6;
        Context context7;
        Repository repository6;
        long j2;
        Long l2;
        Object obj;
        GymSessionEntity gymSessionEntity;
        Long l3;
        GymSessionEntity gymSessionEntity2;
        Context context8;
        Repository repository7;
        List<GymSetEntity> list;
        long suggestedEndMs;
        Context context9;
        Repository repository8;
        long j3 = j;
        if (continuation instanceof RepositoryGymSessionsKt$completeGymSessionImpl$1) {
            repositoryGymSessionsKt$completeGymSessionImpl$1 = (RepositoryGymSessionsKt$completeGymSessionImpl$1) continuation;
            if ((repositoryGymSessionsKt$completeGymSessionImpl$1.label & Integer.MIN_VALUE) != 0) {
                repositoryGymSessionsKt$completeGymSessionImpl$1.label -= Integer.MIN_VALUE;
                Object obj2 = repositoryGymSessionsKt$completeGymSessionImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r6 = repositoryGymSessionsKt$completeGymSessionImpl$1.label;
                ?? r7 = 2;
                ?? r72 = 2;
                switch (r6) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository;
                        context7 = context;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context7;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$2 = l;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 1;
                        Object gymSessionById = repository.gymSessionById(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                        if (gymSessionById == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        repository6 = repository;
                        j2 = j3;
                        l2 = l;
                        obj = gymSessionById;
                        gymSessionEntity = (GymSessionEntity) obj;
                        if (gymSessionEntity != null) {
                            return Boxing.boxBoolean(false);
                        }
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository6;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context7;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$2 = l2;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$3 = gymSessionEntity;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j2;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 2;
                        Object obj3 = repository6.setsForSession(j2, repositoryGymSessionsKt$completeGymSessionImpl$1);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        l3 = l2;
                        gymSessionEntity2 = gymSessionEntity;
                        Repository repository9 = repository6;
                        context8 = context7;
                        obj2 = obj3;
                        repository7 = repository9;
                        list = (List) obj2;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            for (GymSetEntity gymSetEntity : list) {
                                Integer reps = gymSetEntity.getReps();
                                if ((reps != null ? reps.intValue() : 0) > 0 && gymSetEntity.getWeightKg() > 0.0d) {
                                    long startedAtMs = gymSessionEntity2.getStartedAtMs();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long gymLastSetEntryMs = repository7.gymLastSetEntryMs(j2);
                                    if (l3 != null) {
                                        suggestedEndMs = RangesKt.coerceAtLeast(l3.longValue(), startedAtMs);
                                    } else {
                                        suggestedEndMs = GymSessionTiming.INSTANCE.suggestedEndMs(startedAtMs, gymLastSetEntryMs, currentTimeMillis);
                                    }
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository7;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context8;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$2 = null;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$3 = null;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j2;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.label = 4;
                                    if (repository7.finishGymSession(j2, suggestedEndMs, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j3 = j2;
                                    context9 = context8;
                                    repository8 = repository7;
                                    Result.Companion companion = Result.INSTANCE;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository8;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context9;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.label = 5;
                                    r6 = context9;
                                    if (repository8.recordSplitDayCompleted(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    Result.m7905constructorimpl(Unit.INSTANCE);
                                    context2 = r6;
                                    repository8.getAppContext().getSharedPreferences("settings", 0).edit().remove("gym_last_set_entry_ms_" + j3).remove("gym_idle_notif_sent_ms_" + j3).apply();
                                    try {
                                        Result.Companion companion2 = Result.INSTANCE;
                                        String str = "gym_override_" + j3 + "_";
                                        SharedPreferences gymOverridePrefs$app_sideload = repository8.gymOverridePrefs$app_sideload();
                                        Set<String> keySet = gymOverridePrefs$app_sideload.getAll().keySet();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj4 : keySet) {
                                            String str2 = (String) obj4;
                                            Intrinsics.checkNotNull(str2);
                                            if (StringsKt.startsWith$default(str2, str, false, 2, (Object) null)) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        arrayList = arrayList2;
                                        if (!arrayList.isEmpty()) {
                                            SharedPreferences.Editor edit = gymOverridePrefs$app_sideload.edit();
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                edit.remove((String) it.next());
                                            }
                                            edit.apply();
                                        }
                                        Result.m7905constructorimpl(Unit.INSTANCE);
                                    } catch (Throwable th) {
                                        Result.Companion companion3 = Result.INSTANCE;
                                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                                    }
                                    try {
                                        Result.Companion companion4 = Result.INSTANCE;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository8;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context2;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 6;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        repository2 = repository8;
                                        Result.Companion companion5 = Result.INSTANCE;
                                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                                        context3 = context2;
                                        repository3 = repository2;
                                        Result.Companion companion6 = Result.INSTANCE;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 7;
                                        autoClassifyGymSessionMuscles = repository3.autoClassifyGymSessionMuscles(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                                        r6 = context3;
                                        r7 = repository3;
                                        if (autoClassifyGymSessionMuscles == coroutine_suspended) {
                                        }
                                        Result.m7905constructorimpl(Unit.INSTANCE);
                                        Context context10 = r6;
                                        Repository repository10 = r7;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository10;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context10;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 8;
                                        rebuildGymRecoveryForSession = repository10.rebuildGymRecoveryForSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                                        context4 = context10;
                                        repository4 = repository10;
                                        if (rebuildGymRecoveryForSession == coroutine_suspended) {
                                        }
                                        if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                                        }
                                    }
                                    if (repository8.recordCarryoverFromSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    repository2 = repository8;
                                    context2 = context2;
                                    Result.m7905constructorimpl(Unit.INSTANCE);
                                    context3 = context2;
                                    repository3 = repository2;
                                    Result.Companion companion62 = Result.INSTANCE;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.label = 7;
                                    autoClassifyGymSessionMuscles = repository3.autoClassifyGymSessionMuscles(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                                    r6 = context3;
                                    r7 = repository3;
                                    if (autoClassifyGymSessionMuscles == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    Result.m7905constructorimpl(Unit.INSTANCE);
                                    Context context102 = r6;
                                    Repository repository102 = r7;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository102;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context102;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.label = 8;
                                    rebuildGymRecoveryForSession = repository102.rebuildGymRecoveryForSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                                    context4 = context102;
                                    repository4 = repository102;
                                    if (rebuildGymRecoveryForSession == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                                        Result.Companion companion7 = Result.INSTANCE;
                                        GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository4;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context4;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 9;
                                        Object pushFinishedSession = gymFirestoreSync.pushFinishedSession(context4, j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                                        r6 = context4;
                                        r72 = repository4;
                                        if (pushFinishedSession == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                                        Context context11 = r6;
                                        Repository repository11 = r72;
                                        context5 = context11;
                                        repository5 = repository11;
                                        if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                                            GymSyncQueue.INSTANCE.enqueue(context11, j3);
                                            context5 = context11;
                                            repository5 = repository11;
                                        }
                                        try {
                                            Result.Companion companion8 = Result.INSTANCE;
                                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository5;
                                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context5;
                                            repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                            repositoryGymSessionsKt$completeGymSessionImpl$1.label = 10;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            context6 = context5;
                                            Result.Companion companion9 = Result.INSTANCE;
                                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                                            GymLeaveNotifier.INSTANCE.clearSession(context6, j3);
                                            GymRestTimerStore.INSTANCE.clearRest(context6);
                                            try {
                                                Result.Companion companion10 = Result.INSTANCE;
                                                GymActiveSessionForegroundService.INSTANCE.stop(context6);
                                                Result.m7905constructorimpl(Unit.INSTANCE);
                                            } catch (Throwable th4) {
                                                Result.Companion companion11 = Result.INSTANCE;
                                                Result.m7905constructorimpl(ResultKt.createFailure(th4));
                                            }
                                            return Boxing.boxBoolean(true);
                                        }
                                        if (repository5.backupGymSessionToHealthConnect(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        context6 = context5;
                                        Result.m7905constructorimpl(Unit.INSTANCE);
                                        GymLeaveNotifier.INSTANCE.clearSession(context6, j3);
                                        GymRestTimerStore.INSTANCE.clearRest(context6);
                                        Result.Companion companion102 = Result.INSTANCE;
                                        GymActiveSessionForegroundService.INSTANCE.stop(context6);
                                        Result.m7905constructorimpl(Unit.INSTANCE);
                                        return Boxing.boxBoolean(true);
                                    }
                                    GymSyncQueue.INSTANCE.enqueue(context4, j3);
                                    context5 = context4;
                                    repository5 = repository4;
                                    Result.Companion companion82 = Result.INSTANCE;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository5;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context5;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                                    repositoryGymSessionsKt$completeGymSessionImpl$1.label = 10;
                                    if (repository5.backupGymSessionToHealthConnect(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                                    }
                                }
                            }
                        }
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$2 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$3 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 3;
                        if (repository7.deleteGymSession(j2, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Boxing.boxBoolean(false);
                    case 1:
                        j2 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        l2 = (Long) repositoryGymSessionsKt$completeGymSessionImpl$1.L$2;
                        Context context12 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        repository6 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        obj = obj2;
                        context7 = context12;
                        gymSessionEntity = (GymSessionEntity) obj;
                        if (gymSessionEntity != null) {
                        }
                        break;
                    case 2:
                        j2 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        gymSessionEntity2 = (GymSessionEntity) repositoryGymSessionsKt$completeGymSessionImpl$1.L$3;
                        l3 = (Long) repositoryGymSessionsKt$completeGymSessionImpl$1.L$2;
                        context8 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        repository7 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        list = (List) obj2;
                        if (list instanceof Collection) {
                            break;
                        }
                        while (r3.hasNext()) {
                        }
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$2 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$3 = null;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 3;
                        if (repository7.deleteGymSession(j2, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(false);
                    case 3:
                        ResultKt.throwOnFailure(obj2);
                        return Boxing.boxBoolean(false);
                    case 4:
                        long j4 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        Context context13 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        Repository repository12 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        repository8 = repository12;
                        context9 = context13;
                        j3 = j4;
                        Result.Companion companion12 = Result.INSTANCE;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository8;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context9;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 5;
                        r6 = context9;
                        if (repository8.recordSplitDayCompleted(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        context2 = r6;
                        repository8.getAppContext().getSharedPreferences("settings", 0).edit().remove("gym_last_set_entry_ms_" + j3).remove("gym_idle_notif_sent_ms_" + j3).apply();
                        Result.Companion companion22 = Result.INSTANCE;
                        String str3 = "gym_override_" + j3 + "_";
                        SharedPreferences gymOverridePrefs$app_sideload2 = repository8.gymOverridePrefs$app_sideload();
                        Set<String> keySet2 = gymOverridePrefs$app_sideload2.getAll().keySet();
                        ArrayList arrayList22 = new ArrayList();
                        while (r12.hasNext()) {
                        }
                        arrayList = arrayList22;
                        if (!arrayList.isEmpty()) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        Result.Companion companion42 = Result.INSTANCE;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository8;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context2;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 6;
                        if (repository8.recordCarryoverFromSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                        }
                        break;
                    case 5:
                        j3 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        Context context14 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        repository8 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        r6 = context14;
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        context2 = r6;
                        repository8.getAppContext().getSharedPreferences("settings", 0).edit().remove("gym_last_set_entry_ms_" + j3).remove("gym_idle_notif_sent_ms_" + j3).apply();
                        Result.Companion companion222 = Result.INSTANCE;
                        String str32 = "gym_override_" + j3 + "_";
                        SharedPreferences gymOverridePrefs$app_sideload22 = repository8.gymOverridePrefs$app_sideload();
                        Set<String> keySet22 = gymOverridePrefs$app_sideload22.getAll().keySet();
                        ArrayList arrayList222 = new ArrayList();
                        while (r12.hasNext()) {
                        }
                        arrayList = arrayList222;
                        if (!arrayList.isEmpty()) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        Result.Companion companion422 = Result.INSTANCE;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository8;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context2;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 6;
                        if (repository8.recordCarryoverFromSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                        }
                        break;
                    case 6:
                        j3 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        context2 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        repository2 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            context2 = context2;
                            repository2 = repository2;
                            Result.m7905constructorimpl(Unit.INSTANCE);
                            context3 = context2;
                            repository3 = repository2;
                        } catch (Throwable th5) {
                            th = th5;
                            Result.Companion companion52 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                            context3 = context2;
                            repository3 = repository2;
                            Result.Companion companion622 = Result.INSTANCE;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository3;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context3;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.label = 7;
                            autoClassifyGymSessionMuscles = repository3.autoClassifyGymSessionMuscles(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                            r6 = context3;
                            r7 = repository3;
                            if (autoClassifyGymSessionMuscles == coroutine_suspended) {
                            }
                            Result.m7905constructorimpl(Unit.INSTANCE);
                            Context context1022 = r6;
                            Repository repository1022 = r7;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository1022;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context1022;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                            repositoryGymSessionsKt$completeGymSessionImpl$1.label = 8;
                            rebuildGymRecoveryForSession = repository1022.rebuildGymRecoveryForSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                            context4 = context1022;
                            repository4 = repository1022;
                            if (rebuildGymRecoveryForSession == coroutine_suspended) {
                            }
                            if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                            }
                        }
                        Result.Companion companion6222 = Result.INSTANCE;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 7;
                        autoClassifyGymSessionMuscles = repository3.autoClassifyGymSessionMuscles(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                        r6 = context3;
                        r7 = repository3;
                        if (autoClassifyGymSessionMuscles == coroutine_suspended) {
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        Context context10222 = r6;
                        Repository repository10222 = r7;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository10222;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context10222;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 8;
                        rebuildGymRecoveryForSession = repository10222.rebuildGymRecoveryForSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                        context4 = context10222;
                        repository4 = repository10222;
                        if (rebuildGymRecoveryForSession == coroutine_suspended) {
                        }
                        if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                        }
                        break;
                    case 7:
                        j3 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        Context context15 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        Repository repository13 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        r6 = context15;
                        r7 = repository13;
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        Context context102222 = r6;
                        Repository repository102222 = r7;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository102222;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context102222;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 8;
                        rebuildGymRecoveryForSession = repository102222.rebuildGymRecoveryForSession(j3, repositoryGymSessionsKt$completeGymSessionImpl$1);
                        context4 = context102222;
                        repository4 = repository102222;
                        if (rebuildGymRecoveryForSession == coroutine_suspended) {
                        }
                        if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                        }
                        break;
                    case 8:
                        long j5 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        Context context16 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        Repository repository14 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        repository4 = repository14;
                        context4 = context16;
                        j3 = j5;
                        if (!GymSyncQueue.INSTANCE.isOnline(context4)) {
                        }
                        break;
                    case 9:
                        j3 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        Context context17 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        Repository repository15 = (Repository) repositoryGymSessionsKt$completeGymSessionImpl$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        r6 = context17;
                        r72 = repository15;
                        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                        Context context112 = r6;
                        Repository repository112 = r72;
                        context5 = context112;
                        repository5 = repository112;
                        if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                        }
                        Result.Companion companion822 = Result.INSTANCE;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$0 = repository5;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.L$1 = context5;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.J$0 = j3;
                        repositoryGymSessionsKt$completeGymSessionImpl$1.label = 10;
                        if (repository5.backupGymSessionToHealthConnect(j3, repositoryGymSessionsKt$completeGymSessionImpl$1) == coroutine_suspended) {
                        }
                        break;
                    case 10:
                        j3 = repositoryGymSessionsKt$completeGymSessionImpl$1.J$0;
                        context6 = (Context) repositoryGymSessionsKt$completeGymSessionImpl$1.L$1;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            Result.m7905constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th6) {
                            th = th6;
                            Result.Companion companion92 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                            GymLeaveNotifier.INSTANCE.clearSession(context6, j3);
                            GymRestTimerStore.INSTANCE.clearRest(context6);
                            Result.Companion companion1022 = Result.INSTANCE;
                            GymActiveSessionForegroundService.INSTANCE.stop(context6);
                            Result.m7905constructorimpl(Unit.INSTANCE);
                            return Boxing.boxBoolean(true);
                        }
                        GymLeaveNotifier.INSTANCE.clearSession(context6, j3);
                        GymRestTimerStore.INSTANCE.clearRest(context6);
                        Result.Companion companion10222 = Result.INSTANCE;
                        GymActiveSessionForegroundService.INSTANCE.stop(context6);
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        return Boxing.boxBoolean(true);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        repositoryGymSessionsKt$completeGymSessionImpl$1 = new RepositoryGymSessionsKt$completeGymSessionImpl$1(continuation);
        Object obj22 = repositoryGymSessionsKt$completeGymSessionImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r6 = repositoryGymSessionsKt$completeGymSessionImpl$1.label;
        ?? r73 = 2;
        ?? r722 = 2;
        switch (r6) {
        }
    }

    public static /* synthetic */ Object completeGymSessionImpl$default(Repository repository, Context context, long j, Long l, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return completeGymSessionImpl(repository, context, j, l, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object importRemoteGymSessionImpl(Repository repository, String str, long j, long j2, Long l, boolean z, String str2, List<RemoteGymSetRow> list, String str3, String str4, Continuation<? super Long> continuation) {
        RepositoryGymSessionsKt$importRemoteGymSessionImpl$1 repositoryGymSessionsKt$importRemoteGymSessionImpl$1;
        int i;
        int i2;
        Object insertRemoteFinishedSession;
        Repository repository2;
        long j3;
        long j4;
        List<RemoteGymSetRow> list2;
        long longValue;
        RepositoryGymSessionsKt$importRemoteGymSessionImpl$1 repositoryGymSessionsKt$importRemoteGymSessionImpl$12;
        double d;
        Double boxDouble;
        RecoveryModel.RecoveryEstimate estimateGym;
        long j5;
        if (continuation instanceof RepositoryGymSessionsKt$importRemoteGymSessionImpl$1) {
            repositoryGymSessionsKt$importRemoteGymSessionImpl$1 = (RepositoryGymSessionsKt$importRemoteGymSessionImpl$1) continuation;
            if ((repositoryGymSessionsKt$importRemoteGymSessionImpl$1.label & Integer.MIN_VALUE) != 0) {
                repositoryGymSessionsKt$importRemoteGymSessionImpl$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GymDao gymDao = repository.getGymDao();
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$1.L$0 = repository;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$1.L$1 = list;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$1.J$0 = j;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$1.J$1 = j2;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$1.label = 1;
                    i2 = 1;
                    insertRemoteFinishedSession = gymDao.insertRemoteFinishedSession(str, j, j2, l, z, str2, list, str3, str4, repositoryGymSessionsKt$importRemoteGymSessionImpl$1);
                    if (insertRemoteFinishedSession == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    repository2 = repository;
                    j3 = j;
                    j4 = j2;
                    list2 = list;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j5 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.J$0;
                        ResultKt.throwOnFailure(obj);
                        longValue = j5;
                        return Boxing.boxLong(longValue);
                    }
                    long j6 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.J$1;
                    j3 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.J$0;
                    list2 = (List) repositoryGymSessionsKt$importRemoteGymSessionImpl$1.L$1;
                    repository2 = (Repository) repositoryGymSessionsKt$importRemoteGymSessionImpl$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j4 = j6;
                    i2 = 1;
                    insertRemoteFinishedSession = obj;
                }
                longValue = ((Number) insertRemoteFinishedSession).longValue();
                if (longValue > 0) {
                    List<RemoteGymSetRow> list3 = list2;
                    double d2 = 0.0d;
                    for (RemoteGymSetRow remoteGymSetRow : list3) {
                        d2 += remoteGymSetRow.getWeightKg() * (remoteGymSetRow.getReps() != null ? r17.intValue() : i2);
                    }
                    Iterator<T> it = list3.iterator();
                    if (it.hasNext()) {
                        repositoryGymSessionsKt$importRemoteGymSessionImpl$12 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1;
                        double weightKg = ((RemoteGymSetRow) it.next()).getWeightKg();
                        while (it.hasNext()) {
                            weightKg = Math.max(weightKg, ((RemoteGymSetRow) it.next()).getWeightKg());
                            d2 = d2;
                        }
                        d = d2;
                        boxDouble = Boxing.boxDouble(weightKg);
                    } else {
                        repositoryGymSessionsKt$importRemoteGymSessionImpl$12 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1;
                        d = d2;
                        boxDouble = null;
                    }
                    double doubleValue = boxDouble != null ? boxDouble.doubleValue() : 0.0d;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        Double boxDouble2 = ((RemoteGymSetRow) it2.next()).getRpeBorg() != null ? Boxing.boxDouble(r12.intValue()) : null;
                        if (boxDouble2 != null) {
                            arrayList.add(boxDouble2);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    estimateGym = RecoveryModel.INSTANCE.estimateGym(d, doubleValue, RangesKt.coerceAtLeast(j4 - j3, 0L), (r24 & 8) != 0 ? null : repository2.demographicsForRecovery$app_sideload(), (r24 & 16) != 0 ? 0.0d : 0.0d, (r24 & 32) != 0 ? null : arrayList2 != null ? Boxing.boxDouble(CollectionsKt.averageOfDouble(arrayList2)) : null);
                    RecoveryEventEntity recoveryEventEntity = new RecoveryEventEntity(0L, "GYM", longValue, j4, j4 + ((long) (estimateGym.getHours() * 3600000.0d)), estimateGym.getLoadScore(), estimateGym.getNotes(), 1, null);
                    RepositoryGymSessionsKt$importRemoteGymSessionImpl$1 repositoryGymSessionsKt$importRemoteGymSessionImpl$13 = repositoryGymSessionsKt$importRemoteGymSessionImpl$12;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$13.L$0 = null;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$13.L$1 = null;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$13.J$0 = longValue;
                    repositoryGymSessionsKt$importRemoteGymSessionImpl$13.label = 2;
                    if (repository2.recordRecoveryEvent(recoveryEventEntity, repositoryGymSessionsKt$importRemoteGymSessionImpl$13) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j5 = longValue;
                    longValue = j5;
                }
                return Boxing.boxLong(longValue);
            }
        }
        repositoryGymSessionsKt$importRemoteGymSessionImpl$1 = new RepositoryGymSessionsKt$importRemoteGymSessionImpl$1(continuation);
        Object obj2 = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryGymSessionsKt$importRemoteGymSessionImpl$1.label;
        if (i != 0) {
        }
        longValue = ((Number) insertRemoteFinishedSession).longValue();
        if (longValue > 0) {
        }
        return Boxing.boxLong(longValue);
    }
}
