package com.example.rungps.data;

import com.example.rungps.analytics.WeeklyActivityKm;
import com.example.rungps.recovery.StravaRecoveryDedup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$stravaUnlinkedWeekKm$2", f = "Repository.kt", i = {1, 2, 2}, l = {1259, 1260, 1261}, m = "invokeSuspend", n = {"strava", "strava", "linked"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class Repository$stravaUnlinkedWeekKm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>>, Object> {
    final /* synthetic */ long $weekEndMs;
    final /* synthetic */ long $weekStartMs;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$stravaUnlinkedWeekKm$2(Repository repository, long j, long j2, Continuation<? super Repository$stravaUnlinkedWeekKm$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$weekStartMs = j;
        this.$weekEndMs = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$stravaUnlinkedWeekKm$2(this.this$0, this.$weekStartMs, this.$weekEndMs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Double, ? extends Double>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<Double, Double>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<Double, Double>> continuation) {
        return ((Repository$stravaUnlinkedWeekKm$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object stravaTrainingSessions$default;
        List list;
        Object linkedStravaActivityIds;
        RunDao runDao;
        Object allRuns;
        Set set;
        Iterator it;
        Set set2;
        Iterator it2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        double d = 0.0d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.isStravaConnected()) {
                return TuplesKt.to(Boxing.boxDouble(0.0d), Boxing.boxDouble(0.0d));
            }
            this.label = 1;
            stravaTrainingSessions$default = Repository.stravaTrainingSessions$default(this.this$0, 0, this, 1, null);
            if (stravaTrainingSessions$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    linkedStravaActivityIds = obj;
                    Set set3 = (Set) linkedStravaActivityIds;
                    runDao = this.this$0.dao;
                    this.L$0 = list;
                    this.L$1 = set3;
                    this.label = 3;
                    allRuns = runDao.allRuns(this);
                    if (allRuns != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    set = set3;
                    ArrayList arrayList = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    ArrayList arrayList2 = arrayList;
                    it = list.iterator();
                    double d2 = 0.0d;
                    while (it.hasNext()) {
                    }
                    return TuplesKt.to(Boxing.boxDouble(d), Boxing.boxDouble(d2));
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                allRuns = obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (Iterable) allRuns) {
                    if (((RunEntity) obj2).getEndedAtMs() != null) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList22 = arrayList3;
                it = list.iterator();
                double d22 = 0.0d;
                while (it.hasNext()) {
                    WeeklyActivityKm.StravaSession stravaSession = (WeeklyActivityKm.StravaSession) it.next();
                    if (set.contains(Boxing.boxLong(stravaSession.getId()))) {
                        set2 = set;
                        it2 = it;
                    } else {
                        set2 = set;
                        it2 = it;
                        if (WeeklyActivityKm.INSTANCE.overlapsWeek(stravaSession.getStartMs(), stravaSession.getEndMs(), this.$weekStartMs, this.$weekEndMs) && !StravaRecoveryDedup.matchesLocalRun$default(StravaRecoveryDedup.INSTANCE, stravaSession.getStartMs(), stravaSession.getEndMs(), stravaSession.getDistanceM(), stravaSession.isBike(), arrayList22, null, 32, null)) {
                            double distanceM = stravaSession.getDistanceM() / 1000.0d;
                            if (stravaSession.isBike()) {
                                d22 += distanceM;
                            } else {
                                d += distanceM;
                            }
                        }
                    }
                    it = it2;
                    set = set2;
                }
                return TuplesKt.to(Boxing.boxDouble(d), Boxing.boxDouble(d22));
            }
            ResultKt.throwOnFailure(obj);
            stravaTrainingSessions$default = obj;
        }
        list = (List) stravaTrainingSessions$default;
        this.L$0 = list;
        this.label = 2;
        linkedStravaActivityIds = this.this$0.linkedStravaActivityIds(this);
        if (linkedStravaActivityIds == coroutine_suspended) {
            return coroutine_suspended;
        }
        Set set32 = (Set) linkedStravaActivityIds;
        runDao = this.this$0.dao;
        this.L$0 = list;
        this.L$1 = set32;
        this.label = 3;
        allRuns = runDao.allRuns(this);
        if (allRuns != coroutine_suspended) {
        }
    }
}
