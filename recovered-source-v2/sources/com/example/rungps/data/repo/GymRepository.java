package com.example.rungps.data.repo;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.example.rungps.data.ExerciseMuscleDao;
import com.example.rungps.data.GymDao;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.GymSplitEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GymRepository.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\rJ\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\rJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ \u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000e0\r2\u0006\u0010\u001c\u001a\u00020\u001dJ.\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000e0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eH\u0086@¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/example/rungps/data/repo/GymRepository;", "", "gymDao", "Lcom/example/rungps/data/GymDao;", "exerciseMuscleDao", "Lcom/example/rungps/data/ExerciseMuscleDao;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/example/rungps/data/GymDao;Lcom/example/rungps/data/ExerciseMuscleDao;Landroid/content/Context;)V", "getExerciseMuscleDao", "()Lcom/example/rungps/data/ExerciseMuscleDao;", "splitsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/GymSplitEntity;", "sessionsFlow", "Lcom/example/rungps/data/GymSessionEntity;", "gymLoadFlow", "Lcom/example/rungps/data/GymLoadStats;", "allSplits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splitByName", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openSession", "sessionById", "sessionId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionExists", "", "finishSession", "", "endedAtMs", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setsForSession", "Lcom/example/rungps/data/GymSetEntity;", "setsForSessionFlow", "setsForSessionsGrouped", "", "sessionIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymRepository {
    public static final int $stable = 8;
    private final Context appContext;
    private final ExerciseMuscleDao exerciseMuscleDao;
    private final GymDao gymDao;

    public GymRepository(GymDao gymDao, ExerciseMuscleDao exerciseMuscleDao, Context appContext) {
        Intrinsics.checkNotNullParameter(gymDao, "gymDao");
        Intrinsics.checkNotNullParameter(exerciseMuscleDao, "exerciseMuscleDao");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.gymDao = gymDao;
        this.exerciseMuscleDao = exerciseMuscleDao;
        this.appContext = appContext;
    }

    public final ExerciseMuscleDao getExerciseMuscleDao() {
        return this.exerciseMuscleDao;
    }

    public final Flow<List<GymSplitEntity>> splitsFlow() {
        return this.gymDao.splitsFlow();
    }

    public final Flow<List<GymSessionEntity>> sessionsFlow() {
        return this.gymDao.sessionsFlow();
    }

    public final Flow<GymLoadStats> gymLoadFlow() {
        return this.gymDao.gymLoadFlow();
    }

    public final Object allSplits(Continuation<? super List<GymSplitEntity>> continuation) {
        return this.gymDao.allSplits(continuation);
    }

    public final Object splitByName(String str, Continuation<? super GymSplitEntity> continuation) {
        return this.gymDao.splitByName(str, continuation);
    }

    public final Object openSession(Continuation<? super GymSessionEntity> continuation) {
        return this.gymDao.openSession(continuation);
    }

    public final Object sessionById(long j, Continuation<? super GymSessionEntity> continuation) {
        return this.gymDao.sessionById(j, continuation);
    }

    public final Object sessionExists(long j, Continuation<? super Boolean> continuation) {
        return this.gymDao.sessionExists(j, continuation);
    }

    public static /* synthetic */ Object finishSession$default(GymRepository gymRepository, long j, long j2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        return gymRepository.finishSession(j, j2, continuation);
    }

    public final Object finishSession(long j, long j2, Continuation<? super Unit> continuation) {
        Object finishSession = this.gymDao.finishSession(j, j2, continuation);
        return finishSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? finishSession : Unit.INSTANCE;
    }

    public final Object setsForSession(long j, Continuation<? super List<GymSetEntity>> continuation) {
        return this.gymDao.setsForSession(j, continuation);
    }

    public final Flow<List<GymSetEntity>> setsForSessionFlow(long sessionId) {
        return this.gymDao.setsForSessionFlow(sessionId);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setsForSessionsGrouped(List<Long> list, Continuation<? super Map<Long, ? extends List<GymSetEntity>>> continuation) {
        GymRepository$setsForSessionsGrouped$1 gymRepository$setsForSessionsGrouped$1;
        int i;
        if (continuation instanceof GymRepository$setsForSessionsGrouped$1) {
            gymRepository$setsForSessionsGrouped$1 = (GymRepository$setsForSessionsGrouped$1) continuation;
            if ((gymRepository$setsForSessionsGrouped$1.label & Integer.MIN_VALUE) != 0) {
                gymRepository$setsForSessionsGrouped$1.label -= Integer.MIN_VALUE;
                Object obj = gymRepository$setsForSessionsGrouped$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymRepository$setsForSessionsGrouped$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        return MapsKt.emptyMap();
                    }
                    GymDao gymDao = this.gymDao;
                    gymRepository$setsForSessionsGrouped$1.label = 1;
                    obj = gymDao.setsForSessions(list, gymRepository$setsForSessionsGrouped$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    Long boxLong = Boxing.boxLong(((GymSetEntity) obj2).getSessionId());
                    Object obj3 = linkedHashMap.get(boxLong);
                    if (obj3 == null) {
                        obj3 = (List) new ArrayList();
                        linkedHashMap.put(boxLong, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                return linkedHashMap;
            }
        }
        gymRepository$setsForSessionsGrouped$1 = new GymRepository$setsForSessionsGrouped$1(this, continuation);
        Object obj4 = gymRepository$setsForSessionsGrouped$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymRepository$setsForSessionsGrouped$1.label;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r5.hasNext()) {
        }
        return linkedHashMap2;
    }
}
