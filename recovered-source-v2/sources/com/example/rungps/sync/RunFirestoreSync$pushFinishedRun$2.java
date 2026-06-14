package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.tracking.TrackingService;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: RunFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RunFirestoreSync$pushFinishedRun$2", f = "RunFirestoreSync.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, l = {23, 28, 30, 32, 33, 59}, m = "invokeSuspend", n = {"user", "repo", "user", "repo", "run", "avgPaceSecPerKm", "ended", "user", "repo", "run", "avgPaceSecPerKm", "route", "ended", "user", "repo", "run", "avgPaceSecPerKm", "route", "hrSeries", "ended", "user", "run", "avgPaceSecPerKm", "route", "hrSeries", "hrAvg", "hrMax", "ended"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0"})
/* loaded from: classes3.dex */
final class RunFirestoreSync$pushFinishedRun$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $localRunId;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunFirestoreSync$pushFinishedRun$2(Context context, long j, Continuation<? super RunFirestoreSync$pushFinishedRun$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$localRunId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunFirestoreSync$pushFinishedRun$2(this.$context, this.$localRunId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunFirestoreSync$pushFinishedRun$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0438 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d2 A[LOOP:2: B:42:0x01cc->B:44:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153 A[LOOP:3: B:52:0x014d->B:54:0x0153, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FirebaseUser currentUser;
        Repository repository;
        Object runById;
        Repository repository2;
        RunEntity runEntity;
        long longValue;
        Object pointsForRun;
        FirebaseUser firebaseUser;
        RunEntity runEntity2;
        Double d;
        Object hrSamplesForRun;
        RunEntity runEntity3;
        Double d2;
        List list;
        Repository repository3;
        Object hrSummaryForRun;
        FirebaseUser firebaseUser2;
        Double d3;
        List list2;
        Repository repository4;
        RunEntity runEntity4;
        long j;
        Integer num;
        Object splitsForRun;
        long j2;
        List list3;
        List list4;
        Integer num2;
        Iterator it;
        CollectionReference runsCollection;
        Task<Void> task;
        List list5;
        Double d4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 2;
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser == null) {
                    return Unit.INSTANCE;
                }
                repository = Repository.INSTANCE.get(this.$context);
                this.L$0 = currentUser;
                this.L$1 = repository;
                this.label = 1;
                runById = repository.runById(this.$localRunId, this);
                if (runById == coroutine_suspended) {
                    return coroutine_suspended;
                }
                repository2 = repository;
                runEntity = (RunEntity) runById;
                if (runEntity != null) {
                    return Unit.INSTANCE;
                }
                Long endedAtMs = runEntity.getEndedAtMs();
                if (endedAtMs == null) {
                    return Unit.INSTANCE;
                }
                longValue = endedAtMs.longValue();
                long coerceAtLeast = RangesKt.coerceAtLeast(longValue - runEntity.getStartedAtMs(), 1L);
                double totalDistanceM = runEntity.getTotalDistanceM() / 1000.0d;
                Double boxDouble = totalDistanceM > 0.01d ? Boxing.boxDouble((coerceAtLeast / 1000.0d) / totalDistanceM) : null;
                this.L$0 = currentUser;
                this.L$1 = repository2;
                this.L$2 = runEntity;
                this.L$3 = boxDouble;
                this.J$0 = longValue;
                this.label = 2;
                pointsForRun = repository2.pointsForRun(this.$localRunId, this);
                if (pointsForRun == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Double d5 = boxDouble;
                firebaseUser = currentUser;
                runEntity2 = runEntity;
                d = d5;
                RunFirestoreSync runFirestoreSync = RunFirestoreSync.INSTANCE;
                List<PointEntity> list6 = (List) pointsForRun;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                for (PointEntity pointEntity : list6) {
                    arrayList.add(MapsKt.mapOf(TuplesKt.to("lat", Boxing.boxDouble(pointEntity.getLat())), TuplesKt.to("lon", Boxing.boxDouble(pointEntity.getLon()))));
                }
                List decimateRoute$default = RunFirestoreSync.decimateRoute$default(runFirestoreSync, arrayList, 0, 2, null);
                this.L$0 = firebaseUser;
                this.L$1 = repository2;
                this.L$2 = runEntity2;
                this.L$3 = d;
                this.L$4 = decimateRoute$default;
                this.J$0 = longValue;
                this.label = 3;
                hrSamplesForRun = repository2.hrSamplesForRun(this.$localRunId, this);
                if (hrSamplesForRun != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Repository repository5 = repository2;
                runEntity3 = runEntity2;
                d2 = d;
                list = decimateRoute$default;
                repository3 = repository5;
                RunFirestoreSync runFirestoreSync2 = RunFirestoreSync.INSTANCE;
                List<RunHrSampleEntity> list7 = (List) hrSamplesForRun;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                for (RunHrSampleEntity runHrSampleEntity : list7) {
                    Pair[] pairArr = new Pair[i];
                    pairArr[0] = TuplesKt.to("t", Boxing.boxLong(runHrSampleEntity.getTimeMs()));
                    pairArr[1] = TuplesKt.to("bpm", Boxing.boxInt(runHrSampleEntity.getBpm()));
                    arrayList2.add(MapsKt.mapOf(pairArr));
                    i = 2;
                }
                List decimateHr$default = RunFirestoreSync.decimateHr$default(runFirestoreSync2, arrayList2, 0, 2, null);
                this.L$0 = firebaseUser;
                this.L$1 = repository3;
                this.L$2 = runEntity3;
                this.L$3 = d2;
                this.L$4 = list;
                this.L$5 = decimateHr$default;
                this.J$0 = longValue;
                this.label = 4;
                hrSummaryForRun = repository3.hrSummaryForRun(this.$localRunId, this);
                if (hrSummaryForRun != coroutine_suspended) {
                    return coroutine_suspended;
                }
                firebaseUser2 = firebaseUser;
                RunEntity runEntity5 = runEntity3;
                d3 = d2;
                list2 = decimateHr$default;
                long j3 = longValue;
                repository4 = repository3;
                runEntity4 = runEntity5;
                j = j3;
                Pair pair = (Pair) hrSummaryForRun;
                num = (Integer) pair.component1();
                Integer num3 = (Integer) pair.component2();
                this.L$0 = firebaseUser2;
                this.L$1 = runEntity4;
                this.L$2 = d3;
                this.L$3 = list;
                this.L$4 = list2;
                this.L$5 = num;
                this.L$6 = num3;
                this.J$0 = j;
                this.label = 5;
                splitsForRun = repository4.splitsForRun(this.$localRunId, this);
                if (splitsForRun != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = j;
                list3 = list;
                list4 = list2;
                num2 = num3;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (Iterable) splitsForRun) {
                    if (Intrinsics.areEqual(((RunSplitEntity) obj2).getKind(), "KM")) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    RunSplitEntity runSplitEntity = (RunSplitEntity) it.next();
                    Pair[] pairArr2 = new Pair[4];
                    Iterator it2 = it;
                    pairArr2[0] = TuplesKt.to("idx", Boxing.boxInt(runSplitEntity.getIdx()));
                    pairArr2[1] = TuplesKt.to("durationMs", Boxing.boxLong(runSplitEntity.getDurationMs()));
                    pairArr2[2] = TuplesKt.to("distanceM", Boxing.boxDouble(runSplitEntity.getDistanceM()));
                    if (runSplitEntity.getDistanceM() > 0.0d) {
                        list5 = list3;
                        d4 = Boxing.boxDouble((runSplitEntity.getDurationMs() / 1000.0d) / (runSplitEntity.getDistanceM() / 1000.0d));
                    } else {
                        list5 = list3;
                        d4 = null;
                    }
                    pairArr2[3] = TuplesKt.to("paceSecPerKm", d4);
                    arrayList5.add(MapsKt.mapOf(pairArr2));
                    list3 = list5;
                    it = it2;
                }
                HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("startTimeMs", Boxing.boxLong(runEntity4.getStartedAtMs())), TuplesKt.to("endTimeMs", Boxing.boxLong(j2)), TuplesKt.to("distanceM", Boxing.boxDouble(runEntity4.getTotalDistanceM())), TuplesKt.to("avgPaceSecPerKm", d3), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis())), TuplesKt.to("route", list3), TuplesKt.to("kmSplits", arrayList5), TuplesKt.to(TrackingService.EXTRA_ACTIVITY_TYPE, runEntity4.getActivityType()), TuplesKt.to("hrSamples", list4), TuplesKt.to("hrAvgBpm", num), TuplesKt.to("hrMaxBpm", num2), TuplesKt.to("watchSessionId", runEntity4.getWatchImportId()), TuplesKt.to(TrackingService.EXTRA_PLAN_TYPE, runEntity4.getPlanType()), TuplesKt.to(TrackingService.EXTRA_TIME_SESSION, runEntity4.getTimeSession()));
                RunFirestoreSync runFirestoreSync3 = RunFirestoreSync.INSTANCE;
                String uid = firebaseUser2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                runsCollection = runFirestoreSync3.runsCollection(uid);
                task = runsCollection.document("run_" + this.$localRunId).set(hashMapOf, SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 6;
                if (TasksKt.await(task, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                repository = (Repository) this.L$1;
                currentUser = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                runById = obj;
                repository2 = repository;
                runEntity = (RunEntity) runById;
                if (runEntity != null) {
                }
                break;
            case 2:
                long j4 = this.J$0;
                d = (Double) this.L$3;
                RunEntity runEntity6 = (RunEntity) this.L$2;
                repository2 = (Repository) this.L$1;
                FirebaseUser firebaseUser3 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointsForRun = obj;
                firebaseUser = firebaseUser3;
                longValue = j4;
                runEntity2 = runEntity6;
                RunFirestoreSync runFirestoreSync4 = RunFirestoreSync.INSTANCE;
                List<PointEntity> list62 = (List) pointsForRun;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list62, 10));
                while (r9.hasNext()) {
                }
                List decimateRoute$default2 = RunFirestoreSync.decimateRoute$default(runFirestoreSync4, arrayList6, 0, 2, null);
                this.L$0 = firebaseUser;
                this.L$1 = repository2;
                this.L$2 = runEntity2;
                this.L$3 = d;
                this.L$4 = decimateRoute$default2;
                this.J$0 = longValue;
                this.label = 3;
                hrSamplesForRun = repository2.hrSamplesForRun(this.$localRunId, this);
                if (hrSamplesForRun != coroutine_suspended) {
                }
                break;
            case 3:
                long j5 = this.J$0;
                list = (List) this.L$4;
                Double d6 = (Double) this.L$3;
                runEntity3 = (RunEntity) this.L$2;
                Repository repository6 = (Repository) this.L$1;
                FirebaseUser firebaseUser4 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                repository3 = repository6;
                firebaseUser = firebaseUser4;
                longValue = j5;
                d2 = d6;
                hrSamplesForRun = obj;
                RunFirestoreSync runFirestoreSync22 = RunFirestoreSync.INSTANCE;
                List<RunHrSampleEntity> list72 = (List) hrSamplesForRun;
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list72, 10));
                while (r9.hasNext()) {
                }
                List decimateHr$default2 = RunFirestoreSync.decimateHr$default(runFirestoreSync22, arrayList22, 0, 2, null);
                this.L$0 = firebaseUser;
                this.L$1 = repository3;
                this.L$2 = runEntity3;
                this.L$3 = d2;
                this.L$4 = list;
                this.L$5 = decimateHr$default2;
                this.J$0 = longValue;
                this.label = 4;
                hrSummaryForRun = repository3.hrSummaryForRun(this.$localRunId, this);
                if (hrSummaryForRun != coroutine_suspended) {
                }
                break;
            case 4:
                long j6 = this.J$0;
                List list8 = (List) this.L$5;
                List list9 = (List) this.L$4;
                d3 = (Double) this.L$3;
                runEntity4 = (RunEntity) this.L$2;
                repository4 = (Repository) this.L$1;
                firebaseUser2 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                j = j6;
                list2 = list8;
                list = list9;
                hrSummaryForRun = obj;
                Pair pair2 = (Pair) hrSummaryForRun;
                num = (Integer) pair2.component1();
                Integer num32 = (Integer) pair2.component2();
                this.L$0 = firebaseUser2;
                this.L$1 = runEntity4;
                this.L$2 = d3;
                this.L$3 = list;
                this.L$4 = list2;
                this.L$5 = num;
                this.L$6 = num32;
                this.J$0 = j;
                this.label = 5;
                splitsForRun = repository4.splitsForRun(this.$localRunId, this);
                if (splitsForRun != coroutine_suspended) {
                }
                break;
            case 5:
                long j7 = this.J$0;
                Integer num4 = (Integer) this.L$6;
                num = (Integer) this.L$5;
                List list10 = (List) this.L$4;
                List list11 = (List) this.L$3;
                Double d7 = (Double) this.L$2;
                runEntity4 = (RunEntity) this.L$1;
                FirebaseUser firebaseUser5 = (FirebaseUser) this.L$0;
                ResultKt.throwOnFailure(obj);
                list3 = list11;
                j2 = j7;
                list4 = list10;
                firebaseUser2 = firebaseUser5;
                num2 = num4;
                d3 = d7;
                splitsForRun = obj;
                ArrayList arrayList32 = new ArrayList();
                while (r5.hasNext()) {
                }
                ArrayList arrayList42 = arrayList32;
                ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42, 10));
                it = arrayList42.iterator();
                while (it.hasNext()) {
                }
                HashMap hashMapOf2 = MapsKt.hashMapOf(TuplesKt.to("startTimeMs", Boxing.boxLong(runEntity4.getStartedAtMs())), TuplesKt.to("endTimeMs", Boxing.boxLong(j2)), TuplesKt.to("distanceM", Boxing.boxDouble(runEntity4.getTotalDistanceM())), TuplesKt.to("avgPaceSecPerKm", d3), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis())), TuplesKt.to("route", list3), TuplesKt.to("kmSplits", arrayList52), TuplesKt.to(TrackingService.EXTRA_ACTIVITY_TYPE, runEntity4.getActivityType()), TuplesKt.to("hrSamples", list4), TuplesKt.to("hrAvgBpm", num), TuplesKt.to("hrMaxBpm", num2), TuplesKt.to("watchSessionId", runEntity4.getWatchImportId()), TuplesKt.to(TrackingService.EXTRA_PLAN_TYPE, runEntity4.getPlanType()), TuplesKt.to(TrackingService.EXTRA_TIME_SESSION, runEntity4.getTimeSession()));
                RunFirestoreSync runFirestoreSync32 = RunFirestoreSync.INSTANCE;
                String uid2 = firebaseUser2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                runsCollection = runFirestoreSync32.runsCollection(uid2);
                task = runsCollection.document("run_" + this.$localRunId).set(hashMapOf2, SetOptions.merge());
                Intrinsics.checkNotNullExpressionValue(task, "set(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 6;
                if (TasksKt.await(task, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
