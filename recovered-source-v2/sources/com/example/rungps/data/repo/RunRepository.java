package com.example.rungps.data.repo;

import androidx.core.app.NotificationCompat;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.example.rungps.ble.moyoung.MoyoungHrParser;
import com.example.rungps.ble.moyoung.MoyoungSportLabels;
import com.example.rungps.ble.moyoung.MoyoungWorkout;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.RecoveryDao;
import com.example.rungps.data.RunDao;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.RunHrSampleDao;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitDao;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import org.maplibre.android.style.layers.Property;

/* compiled from: RunRepository.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00110\rJ8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0086@¢\u0006\u0002\u0010\u0019J>\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010#J>\u0010$\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+H\u0086@¢\u0006\u0002\u0010,J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u0018\u00100\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u0016\u00101\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/JT\u00102\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00108\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J\u0018\u0010<\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u0018\u0010=\u001a\u0004\u0018\u00010\u000f2\u0006\u0010>\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u0018\u0010?\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u001e\u0010A\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J&\u0010E\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020'H\u0086@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u000e2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u0016\u0010K\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/J\u000e\u0010L\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010MJ&\u0010N\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010QJ\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010MJ*\u0010S\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010T\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0086@¢\u0006\u0002\u0010ZJ\u001e\u0010[\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010X\u001a\u00020YH\u0082@¢\u0006\u0002\u0010\\J&\u0010]\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010'0^2\u0006\u0010\u001c\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010/JR\u0010_\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u00132\u0006\u0010P\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\b\u0010`\u001a\u0004\u0018\u00010'2\b\u0010a\u001a\u0004\u0018\u00010'2\u0006\u0010b\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/example/rungps/data/repo/RunRepository;", "", "dao", "Lcom/example/rungps/data/RunDao;", "runSplitDao", "Lcom/example/rungps/data/RunSplitDao;", "recoveryDao", "Lcom/example/rungps/data/RecoveryDao;", "hrSampleDao", "Lcom/example/rungps/data/RunHrSampleDao;", "<init>", "(Lcom/example/rungps/data/RunDao;Lcom/example/rungps/data/RunSplitDao;Lcom/example/rungps/data/RecoveryDao;Lcom/example/rungps/data/RunHrSampleDao;)V", "runsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RunEntity;", "runsPagingFlow", "Landroidx/paging/PagingData;", "startRun", "", "startedAtMs", TrackingService.EXTRA_ACTIVITY_TYPE, "", "gearId", "title", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRunMetadata", "", "runId", "description", "privateNotes", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPoint", Property.SYMBOL_PLACEMENT_POINT, "Lcom/example/rungps/data/PointEntity;", "(Lcom/example/rungps/data/PointEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRunSplit", "kind", "idx", "", "elapsedEndMs", "durationMs", "distanceM", "", "(JLjava/lang/String;IJJDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splitsForRun", "Lcom/example/rungps/data/RunSplitEntity;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastPoint", "sumDistanceM", "finishRun", "endedAtMs", "totalDistanceM", "totalDurationMs", "totalSteps", TrackingService.EXTRA_PLAN_TYPE, TrackingService.EXTRA_TIME_SESSION, "keepEvenIfJunk", "", "(JJDJJLjava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runById", "runByWatchImportId", "watchImportId", "runByStravaImportId", "stravaImportId", "setStravaImportId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runExists", "pointsForRun", "insertHrSample", "timeMs", "bpm", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hrSamplesForRun", "Lcom/example/rungps/data/RunHrSampleEntity;", "deleteRun", "deleteAllRuns", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trimRun", "startTimeMs", "endTimeMs", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allRuns", "findMatchingFinishedRun", "toleranceMs", "(JDJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importMoyoungCardio", "Lcom/example/rungps/data/repo/RunRepository$WatchCardioImportResult;", NotificationCompat.CATEGORY_WORKOUT, "Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "(Lcom/example/rungps/ble/moyoung/MoyoungWorkout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMoyoungHrSeries", "(JLcom/example/rungps/ble/moyoung/MoyoungWorkout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hrSummaryForRun", "Lkotlin/Pair;", "insertWatchRunFromSoccer", "hrAvgBpm", "hrMaxBpm", "label", "(JJJJDLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WatchCardioImportResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunRepository {
    public static final int $stable = 0;
    private final RunDao dao;
    private final RunHrSampleDao hrSampleDao;
    private final RecoveryDao recoveryDao;
    private final RunSplitDao runSplitDao;

    public RunRepository(RunDao dao, RunSplitDao runSplitDao, RecoveryDao recoveryDao, RunHrSampleDao hrSampleDao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(runSplitDao, "runSplitDao");
        Intrinsics.checkNotNullParameter(recoveryDao, "recoveryDao");
        Intrinsics.checkNotNullParameter(hrSampleDao, "hrSampleDao");
        this.dao = dao;
        this.runSplitDao = runSplitDao;
        this.recoveryDao = recoveryDao;
        this.hrSampleDao = hrSampleDao;
    }

    public final Flow<List<RunEntity>> runsFlow() {
        return this.dao.runsFlow();
    }

    public final Flow<PagingData<RunEntity>> runsPagingFlow() {
        return new Pager(new PagingConfig(25, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: com.example.rungps.data.repo.RunRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagingSource runsPagingFlow$lambda$0;
                runsPagingFlow$lambda$0 = RunRepository.runsPagingFlow$lambda$0(RunRepository.this);
                return runsPagingFlow$lambda$0;
            }
        }, 2, null).getFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource runsPagingFlow$lambda$0(RunRepository runRepository) {
        return runRepository.dao.runsPagingSource();
    }

    public static /* synthetic */ Object startRun$default(RunRepository runRepository, long j, String str, Long l, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "RUN";
        }
        return runRepository.startRun(j, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, continuation);
    }

    public final Object startRun(long j, String str, Long l, String str2, Continuation<? super Long> continuation) {
        return this.dao.insertRun(new RunEntity(0L, j, null, 0.0d, 0L, 0L, null, null, str, null, null, str2, null, null, l, 14077, null), continuation);
    }

    public final Object updateRunMetadata(long j, String str, String str2, String str3, Long l, Continuation<? super Unit> continuation) {
        Object updateRunMetadata = this.dao.updateRunMetadata(j, str, str2, str3, l, continuation);
        return updateRunMetadata == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateRunMetadata : Unit.INSTANCE;
    }

    public final Object insertPoint(PointEntity pointEntity, Continuation<? super Long> continuation) {
        return this.dao.insertPoint(pointEntity, continuation);
    }

    public final Object insertRunSplit(long j, String str, int i, long j2, long j3, double d, Continuation<? super Long> continuation) {
        return this.runSplitDao.insertSplit(new RunSplitEntity(0L, j, str, i, j2, j3, d, 1, null), continuation);
    }

    public final Object splitsForRun(long j, Continuation<? super List<RunSplitEntity>> continuation) {
        return this.runSplitDao.splitsForRun(j, continuation);
    }

    public final Object lastPoint(long j, Continuation<? super PointEntity> continuation) {
        return this.dao.lastPoint(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sumDistanceM(long j, Continuation<? super Double> continuation) {
        RunRepository$sumDistanceM$1 runRepository$sumDistanceM$1;
        int i;
        if (continuation instanceof RunRepository$sumDistanceM$1) {
            runRepository$sumDistanceM$1 = (RunRepository$sumDistanceM$1) continuation;
            if ((runRepository$sumDistanceM$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$sumDistanceM$1.label -= Integer.MIN_VALUE;
                Object obj = runRepository$sumDistanceM$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$sumDistanceM$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RunDao runDao = this.dao;
                    runRepository$sumDistanceM$1.label = 1;
                    obj = runDao.sumDistanceM(j, runRepository$sumDistanceM$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Double d = (Double) obj;
                return Boxing.boxDouble(d == null ? d.doubleValue() : 0.0d);
            }
        }
        runRepository$sumDistanceM$1 = new RunRepository$sumDistanceM$1(this, continuation);
        Object obj2 = runRepository$sumDistanceM$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$sumDistanceM$1.label;
        if (i != 0) {
        }
        Double d2 = (Double) obj2;
        return Boxing.boxDouble(d2 == null ? d2.doubleValue() : 0.0d);
    }

    public static /* synthetic */ Object finishRun$default(RunRepository runRepository, long j, long j2, double d, long j3, long j4, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
        return runRepository.finishRun(j, j2, d, j3, j4, str, str2, (i & 128) != 0 ? false : z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishRun(long j, long j2, double d, long j3, long j4, String str, String str2, boolean z, Continuation<? super Unit> continuation) {
        RunRepository$finishRun$1 runRepository$finishRun$1;
        Object coroutine_suspended;
        int i;
        String str3;
        String str4;
        long j5;
        long j6;
        Object obj;
        RunRepository runRepository;
        boolean z2;
        long j7;
        double d2;
        RunEntity runEntity;
        String str5;
        RunDao runDao;
        Object obj2;
        long j8;
        String str6;
        RecoveryDao recoveryDao;
        long j9 = j;
        if (continuation instanceof RunRepository$finishRun$1) {
            runRepository$finishRun$1 = (RunRepository$finishRun$1) continuation;
            if ((runRepository$finishRun$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$finishRun$1.label -= Integer.MIN_VALUE;
                Object obj3 = runRepository$finishRun$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$finishRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    runRepository$finishRun$1.L$0 = this;
                    str3 = str;
                    runRepository$finishRun$1.L$1 = str3;
                    str4 = str2;
                    runRepository$finishRun$1.L$2 = str4;
                    runRepository$finishRun$1.J$0 = j9;
                    j5 = j2;
                    runRepository$finishRun$1.J$1 = j5;
                    runRepository$finishRun$1.D$0 = d;
                    runRepository$finishRun$1.J$2 = j3;
                    runRepository$finishRun$1.J$3 = j4;
                    runRepository$finishRun$1.Z$0 = z;
                    runRepository$finishRun$1.label = 1;
                    Object runById = runById(j9, runRepository$finishRun$1);
                    if (runById == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j6 = j4;
                    obj = runById;
                    runRepository = this;
                    z2 = z;
                    j7 = j3;
                    d2 = d;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj3);
                                return Unit.INSTANCE;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        j8 = runRepository$finishRun$1.J$0;
                        str6 = (String) runRepository$finishRun$1.L$1;
                        RunRepository runRepository2 = (RunRepository) runRepository$finishRun$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        runRepository = runRepository2;
                        obj2 = null;
                        recoveryDao = runRepository.recoveryDao;
                        runRepository$finishRun$1.L$0 = obj2;
                        runRepository$finishRun$1.L$1 = obj2;
                        runRepository$finishRun$1.label = 3;
                        if (recoveryDao.deleteForSource(str6, j8, runRepository$finishRun$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    z2 = runRepository$finishRun$1.Z$0;
                    long j10 = runRepository$finishRun$1.J$3;
                    j7 = runRepository$finishRun$1.J$2;
                    d2 = runRepository$finishRun$1.D$0;
                    long j11 = runRepository$finishRun$1.J$1;
                    long j12 = runRepository$finishRun$1.J$0;
                    String str7 = (String) runRepository$finishRun$1.L$2;
                    String str8 = (String) runRepository$finishRun$1.L$1;
                    runRepository = (RunRepository) runRepository$finishRun$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    j6 = j10;
                    j9 = j12;
                    str4 = str7;
                    j5 = j11;
                    obj = obj3;
                    str3 = str8;
                }
                runEntity = (RunEntity) obj;
                if (runEntity != null || (r10 = runEntity.getActivityType()) == null) {
                    String str9 = "RUN";
                }
                String recoveryKind = ActivityTypes.INSTANCE.recoveryKind(str9);
                str5 = str4;
                boolean isBike = ActivityTypes.INSTANCE.isBike(str9);
                double d3 = !isBike ? 30.0d : 15.0d;
                long j13 = !isBike ? 45000L : 30000L;
                boolean z3 = d2 >= 10.0d;
                if (z2 && (z3 || (d2 < d3 && j7 < j13))) {
                    RunDao runDao2 = runRepository.dao;
                    runRepository$finishRun$1.L$0 = runRepository;
                    runRepository$finishRun$1.L$1 = recoveryKind;
                    obj2 = null;
                    runRepository$finishRun$1.L$2 = null;
                    runRepository$finishRun$1.J$0 = j9;
                    runRepository$finishRun$1.label = 2;
                    if (runDao2.deleteRun(j9, runRepository$finishRun$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j8 = j9;
                    str6 = recoveryKind;
                    recoveryDao = runRepository.recoveryDao;
                    runRepository$finishRun$1.L$0 = obj2;
                    runRepository$finishRun$1.L$1 = obj2;
                    runRepository$finishRun$1.label = 3;
                    if (recoveryDao.deleteForSource(str6, j8, runRepository$finishRun$1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
                runDao = runRepository.dao;
                runRepository$finishRun$1.L$0 = null;
                runRepository$finishRun$1.L$1 = null;
                runRepository$finishRun$1.L$2 = null;
                runRepository$finishRun$1.label = 4;
                if (runDao.finishRun(j9, j5, d2, j7, j6, str3, str5, runRepository$finishRun$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        runRepository$finishRun$1 = new RunRepository$finishRun$1(this, continuation);
        Object obj32 = runRepository$finishRun$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$finishRun$1.label;
        if (i != 0) {
        }
        runEntity = (RunEntity) obj;
        if (runEntity != null) {
        }
        String str92 = "RUN";
        String recoveryKind2 = ActivityTypes.INSTANCE.recoveryKind(str92);
        str5 = str4;
        boolean isBike2 = ActivityTypes.INSTANCE.isBike(str92);
        if (!isBike2) {
        }
        if (!isBike2) {
        }
        if (d2 >= 10.0d) {
        }
        if (z2) {
        }
        runDao = runRepository.dao;
        runRepository$finishRun$1.L$0 = null;
        runRepository$finishRun$1.L$1 = null;
        runRepository$finishRun$1.L$2 = null;
        runRepository$finishRun$1.label = 4;
        if (runDao.finishRun(j9, j5, d2, j7, j6, str3, str5, runRepository$finishRun$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final Object runById(long j, Continuation<? super RunEntity> continuation) {
        return this.dao.runById(j, continuation);
    }

    public final Object runByWatchImportId(long j, Continuation<? super RunEntity> continuation) {
        return this.dao.runByWatchImportId(j, continuation);
    }

    public final Object runByStravaImportId(long j, Continuation<? super RunEntity> continuation) {
        return this.dao.runByStravaImportId(j, continuation);
    }

    public final Object setStravaImportId(long j, long j2, Continuation<? super Unit> continuation) {
        Object stravaImportId = this.dao.setStravaImportId(j, j2, continuation);
        return stravaImportId == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? stravaImportId : Unit.INSTANCE;
    }

    public final Object runExists(long j, Continuation<? super Boolean> continuation) {
        return this.dao.runExists(j, continuation);
    }

    public final Object pointsForRun(long j, Continuation<? super List<PointEntity>> continuation) {
        return this.dao.pointsForRun(j, continuation);
    }

    public final Object insertHrSample(long j, long j2, int i, Continuation<? super Long> continuation) {
        return this.hrSampleDao.insert(new RunHrSampleEntity(0L, j, j2, i, 1, null), continuation);
    }

    public final Object hrSamplesForRun(long j, Continuation<? super List<RunHrSampleEntity>> continuation) {
        return this.hrSampleDao.samplesForRun(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteRun(long j, Continuation<? super Unit> continuation) {
        RunRepository$deleteRun$1 runRepository$deleteRun$1;
        Object coroutine_suspended;
        int i;
        RunEntity runEntity;
        String str;
        RecoveryDao recoveryDao;
        RunRepository runRepository;
        long j2;
        String activityType;
        RecoveryDao recoveryDao2;
        RunDao runDao;
        if (continuation instanceof RunRepository$deleteRun$1) {
            runRepository$deleteRun$1 = (RunRepository$deleteRun$1) continuation;
            if ((runRepository$deleteRun$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$deleteRun$1.label -= Integer.MIN_VALUE;
                Object obj = runRepository$deleteRun$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$deleteRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    runRepository$deleteRun$1.L$0 = this;
                    runRepository$deleteRun$1.J$0 = j;
                    runRepository$deleteRun$1.label = 1;
                    obj = runById(j, runRepository$deleteRun$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            j2 = runRepository$deleteRun$1.J$0;
                            runRepository = (RunRepository) runRepository$deleteRun$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            runDao = runRepository.dao;
                            runRepository$deleteRun$1.L$0 = null;
                            runRepository$deleteRun$1.label = 4;
                            if (runDao.deleteRun(j2, runRepository$deleteRun$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        j2 = runRepository$deleteRun$1.J$0;
                        runRepository = (RunRepository) runRepository$deleteRun$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        recoveryDao2 = runRepository.recoveryDao;
                        runRepository$deleteRun$1.L$0 = runRepository;
                        runRepository$deleteRun$1.J$0 = j2;
                        runRepository$deleteRun$1.label = 3;
                        if (recoveryDao2.deleteForSource("RUN", j2, runRepository$deleteRun$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        runDao = runRepository.dao;
                        runRepository$deleteRun$1.L$0 = null;
                        runRepository$deleteRun$1.label = 4;
                        if (runDao.deleteRun(j2, runRepository$deleteRun$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                    j = runRepository$deleteRun$1.J$0;
                    this = (RunRepository) runRepository$deleteRun$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                runEntity = (RunEntity) obj;
                if (runEntity != null || (activityType = runEntity.getActivityType()) == null || (str = ActivityTypes.INSTANCE.recoveryKind(activityType)) == null) {
                    str = "RUN";
                }
                recoveryDao = this.recoveryDao;
                runRepository$deleteRun$1.L$0 = this;
                runRepository$deleteRun$1.J$0 = j;
                runRepository$deleteRun$1.label = 2;
                if (recoveryDao.deleteForSource(str, j, runRepository$deleteRun$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                runRepository = this;
                j2 = j;
                recoveryDao2 = runRepository.recoveryDao;
                runRepository$deleteRun$1.L$0 = runRepository;
                runRepository$deleteRun$1.J$0 = j2;
                runRepository$deleteRun$1.label = 3;
                if (recoveryDao2.deleteForSource("RUN", j2, runRepository$deleteRun$1) == coroutine_suspended) {
                }
                runDao = runRepository.dao;
                runRepository$deleteRun$1.L$0 = null;
                runRepository$deleteRun$1.label = 4;
                if (runDao.deleteRun(j2, runRepository$deleteRun$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        runRepository$deleteRun$1 = new RunRepository$deleteRun$1(this, continuation);
        Object obj2 = runRepository$deleteRun$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$deleteRun$1.label;
        if (i != 0) {
        }
        runEntity = (RunEntity) obj2;
        if (runEntity != null) {
        }
        str = "RUN";
        recoveryDao = this.recoveryDao;
        runRepository$deleteRun$1.L$0 = this;
        runRepository$deleteRun$1.J$0 = j;
        runRepository$deleteRun$1.label = 2;
        if (recoveryDao.deleteForSource(str, j, runRepository$deleteRun$1) != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteAllRuns(Continuation<? super Unit> continuation) {
        RunRepository$deleteAllRuns$1 runRepository$deleteAllRuns$1;
        Object coroutine_suspended;
        int i;
        RecoveryDao recoveryDao;
        RunDao runDao;
        if (continuation instanceof RunRepository$deleteAllRuns$1) {
            runRepository$deleteAllRuns$1 = (RunRepository$deleteAllRuns$1) continuation;
            if ((runRepository$deleteAllRuns$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$deleteAllRuns$1.label -= Integer.MIN_VALUE;
                Object obj = runRepository$deleteAllRuns$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$deleteAllRuns$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RecoveryDao recoveryDao2 = this.recoveryDao;
                    runRepository$deleteAllRuns$1.L$0 = this;
                    runRepository$deleteAllRuns$1.label = 1;
                    if (recoveryDao2.deleteForKind("RUN", runRepository$deleteAllRuns$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        this = (RunRepository) runRepository$deleteAllRuns$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        runDao = this.dao;
                        runRepository$deleteAllRuns$1.L$0 = null;
                        runRepository$deleteAllRuns$1.label = 3;
                        if (runDao.deleteAllRuns(runRepository$deleteAllRuns$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    this = (RunRepository) runRepository$deleteAllRuns$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                recoveryDao = this.recoveryDao;
                runRepository$deleteAllRuns$1.L$0 = this;
                runRepository$deleteAllRuns$1.label = 2;
                if (recoveryDao.deleteForKind(ActivityTypes.BIKE, runRepository$deleteAllRuns$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                runDao = this.dao;
                runRepository$deleteAllRuns$1.L$0 = null;
                runRepository$deleteAllRuns$1.label = 3;
                if (runDao.deleteAllRuns(runRepository$deleteAllRuns$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        runRepository$deleteAllRuns$1 = new RunRepository$deleteAllRuns$1(this, continuation);
        Object obj2 = runRepository$deleteAllRuns$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$deleteAllRuns$1.label;
        if (i != 0) {
        }
        recoveryDao = this.recoveryDao;
        runRepository$deleteAllRuns$1.L$0 = this;
        runRepository$deleteAllRuns$1.label = 2;
        if (recoveryDao.deleteForKind(ActivityTypes.BIKE, runRepository$deleteAllRuns$1) == coroutine_suspended) {
        }
        runDao = this.dao;
        runRepository$deleteAllRuns$1.L$0 = null;
        runRepository$deleteAllRuns$1.label = 3;
        if (runDao.deleteAllRuns(runRepository$deleteAllRuns$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final Object trimRun(long j, long j2, long j3, Continuation<? super Unit> continuation) {
        Object trimRun = this.dao.trimRun(j, j2, j3, continuation);
        return trimRun == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? trimRun : Unit.INSTANCE;
    }

    public final Object allRuns(Continuation<? super List<RunEntity>> continuation) {
        return this.dao.allRuns(continuation);
    }

    public static /* synthetic */ Object findMatchingFinishedRun$default(RunRepository runRepository, long j, double d, long j2, Continuation continuation, int i, Object obj) {
        return runRepository.findMatchingFinishedRun(j, d, (i & 4) != 0 ? 120000L : j2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findMatchingFinishedRun(long j, double d, long j2, Continuation<? super RunEntity> continuation) {
        RunRepository$findMatchingFinishedRun$1 runRepository$findMatchingFinishedRun$1;
        int i;
        long j3;
        double d2;
        if (continuation instanceof RunRepository$findMatchingFinishedRun$1) {
            runRepository$findMatchingFinishedRun$1 = (RunRepository$findMatchingFinishedRun$1) continuation;
            if ((runRepository$findMatchingFinishedRun$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$findMatchingFinishedRun$1.label -= Integer.MIN_VALUE;
                Object obj = runRepository$findMatchingFinishedRun$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$findMatchingFinishedRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    double coerceAtLeast = RangesKt.coerceAtLeast(0.08d * d, 50.0d);
                    runRepository$findMatchingFinishedRun$1.J$0 = j;
                    runRepository$findMatchingFinishedRun$1.D$0 = d;
                    runRepository$findMatchingFinishedRun$1.J$1 = j2;
                    runRepository$findMatchingFinishedRun$1.D$1 = coerceAtLeast;
                    runRepository$findMatchingFinishedRun$1.label = 1;
                    obj = allRuns(runRepository$findMatchingFinishedRun$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j3 = j;
                    d2 = coerceAtLeast;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = runRepository$findMatchingFinishedRun$1.D$1;
                    j2 = runRepository$findMatchingFinishedRun$1.J$1;
                    d = runRepository$findMatchingFinishedRun$1.D$0;
                    j3 = runRepository$findMatchingFinishedRun$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                for (Object obj2 : (Iterable) obj) {
                    RunEntity runEntity = (RunEntity) obj2;
                    if (runEntity.getEndedAtMs() != null && Math.abs(runEntity.getStartedAtMs() - j3) <= j2 && Math.abs(runEntity.getTotalDistanceM() - d) <= d2) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        runRepository$findMatchingFinishedRun$1 = new RunRepository$findMatchingFinishedRun$1(this, continuation);
        Object obj3 = runRepository$findMatchingFinishedRun$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$findMatchingFinishedRun$1.label;
        if (i != 0) {
        }
        while (r10.hasNext()) {
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RunRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/data/repo/RunRepository$WatchCardioImportResult;", "", "<init>", "(Ljava/lang/String;I)V", "IMPORTED", "ALREADY_SYNCED", "ON_PHONE_ALREADY", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WatchCardioImportResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WatchCardioImportResult[] $VALUES;
        public static final WatchCardioImportResult IMPORTED = new WatchCardioImportResult("IMPORTED", 0);
        public static final WatchCardioImportResult ALREADY_SYNCED = new WatchCardioImportResult("ALREADY_SYNCED", 1);
        public static final WatchCardioImportResult ON_PHONE_ALREADY = new WatchCardioImportResult("ON_PHONE_ALREADY", 2);

        private static final /* synthetic */ WatchCardioImportResult[] $values() {
            return new WatchCardioImportResult[]{IMPORTED, ALREADY_SYNCED, ON_PHONE_ALREADY};
        }

        public static EnumEntries<WatchCardioImportResult> getEntries() {
            return $ENTRIES;
        }

        static {
            WatchCardioImportResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private WatchCardioImportResult(String str, int i) {
        }

        public static WatchCardioImportResult valueOf(String str) {
            return (WatchCardioImportResult) Enum.valueOf(WatchCardioImportResult.class, str);
        }

        public static WatchCardioImportResult[] values() {
            return (WatchCardioImportResult[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object importMoyoungCardio(MoyoungWorkout moyoungWorkout, Continuation<? super WatchCardioImportResult> continuation) {
        RunRepository$importMoyoungCardio$1 runRepository$importMoyoungCardio$1;
        long j;
        Object obj;
        MoyoungWorkout moyoungWorkout2;
        RunRepository runRepository;
        MoyoungWorkout moyoungWorkout3;
        long j2;
        double d;
        String str;
        long j3;
        long j4;
        RunRepository runRepository2;
        double d2;
        long longValue;
        long coerceAtLeast;
        String str2;
        Object obj2;
        Object obj3;
        MoyoungWorkout moyoungWorkout4;
        long j5;
        RunRepository runRepository3;
        Object runById;
        RunRepository runRepository4 = this;
        if (continuation instanceof RunRepository$importMoyoungCardio$1) {
            runRepository$importMoyoungCardio$1 = (RunRepository$importMoyoungCardio$1) continuation;
            if ((runRepository$importMoyoungCardio$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$importMoyoungCardio$1.label -= Integer.MIN_VALUE;
                Object obj4 = runRepository$importMoyoungCardio$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (runRepository$importMoyoungCardio$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj4);
                        long dedupeId = moyoungWorkout.getDedupeId();
                        RunDao runDao = runRepository4.dao;
                        runRepository$importMoyoungCardio$1.L$0 = runRepository4;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout;
                        runRepository$importMoyoungCardio$1.J$0 = dedupeId;
                        runRepository$importMoyoungCardio$1.label = 1;
                        Object runByWatchImportId = runDao.runByWatchImportId(dedupeId, runRepository$importMoyoungCardio$1);
                        if (runByWatchImportId == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = dedupeId;
                        obj = runByWatchImportId;
                        moyoungWorkout2 = moyoungWorkout;
                        if (obj == null) {
                            return WatchCardioImportResult.ALREADY_SYNCED;
                        }
                        double coerceAtLeast2 = RangesKt.coerceAtLeast(moyoungWorkout2.getDistanceM(), 0.0d);
                        long startTimeMs = moyoungWorkout2.getStartTimeMs();
                        runRepository$importMoyoungCardio$1.L$0 = runRepository4;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout2;
                        runRepository$importMoyoungCardio$1.J$0 = j;
                        runRepository$importMoyoungCardio$1.D$0 = coerceAtLeast2;
                        runRepository$importMoyoungCardio$1.label = 2;
                        long j6 = j;
                        Object findMatchingFinishedRun$default = findMatchingFinishedRun$default(runRepository4, startTimeMs, coerceAtLeast2, 0L, runRepository$importMoyoungCardio$1, 4, null);
                        if (findMatchingFinishedRun$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        runRepository = runRepository4;
                        moyoungWorkout3 = moyoungWorkout2;
                        obj4 = findMatchingFinishedRun$default;
                        j2 = j6;
                        d = coerceAtLeast2;
                        if (obj4 == null) {
                            return WatchCardioImportResult.ON_PHONE_ALREADY;
                        }
                        int sportType = moyoungWorkout3.getSportType();
                        if (sportType == 2 || sportType == 17) {
                            str = ActivityTypes.BIKE;
                        } else {
                            str = "RUN";
                        }
                        String str3 = str;
                        long coerceAtLeast3 = RangesKt.coerceAtLeast(moyoungWorkout3.getActiveSeconds() * 1000, 60000L);
                        Long boxLong = Boxing.boxLong(moyoungWorkout3.getEndTimeMs());
                        if (boxLong.longValue() <= moyoungWorkout3.getStartTimeMs()) {
                            boxLong = null;
                        }
                        long longValue2 = boxLong != null ? boxLong.longValue() : moyoungWorkout3.getStartTimeMs() + coerceAtLeast3;
                        RunDao runDao2 = runRepository.dao;
                        RunEntity runEntity = new RunEntity(0L, moyoungWorkout3.getStartTimeMs(), null, 0.0d, 0L, 0L, null, null, str3, Boxing.boxLong(j2), null, null, null, null, null, 31997, null);
                        runRepository$importMoyoungCardio$1.L$0 = runRepository;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout3;
                        runRepository$importMoyoungCardio$1.D$0 = d;
                        runRepository$importMoyoungCardio$1.J$0 = coerceAtLeast3;
                        runRepository$importMoyoungCardio$1.J$1 = longValue2;
                        runRepository$importMoyoungCardio$1.label = 3;
                        obj4 = runDao2.insertRun(runEntity, runRepository$importMoyoungCardio$1);
                        if (obj4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j3 = coerceAtLeast3;
                        j4 = longValue2;
                        runRepository2 = runRepository;
                        d2 = d;
                        longValue = ((Number) obj4).longValue();
                        String label = MoyoungSportLabels.INSTANCE.label(moyoungWorkout3.getSportType());
                        coerceAtLeast = RangesKt.coerceAtLeast(moyoungWorkout3.getSteps(), 0L);
                        str2 = "Da Fit · " + label;
                        runRepository$importMoyoungCardio$1.L$0 = runRepository2;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout3;
                        runRepository$importMoyoungCardio$1.J$0 = longValue;
                        runRepository$importMoyoungCardio$1.label = 4;
                        obj2 = coroutine_suspended;
                        MoyoungWorkout moyoungWorkout5 = moyoungWorkout3;
                        RunRepository runRepository5 = runRepository2;
                        obj3 = null;
                        if (finishRun$default(runRepository2, longValue, j4, d2, j3, coerceAtLeast, "WATCH", str2, false, runRepository$importMoyoungCardio$1, 128, null) != obj2) {
                            return obj2;
                        }
                        moyoungWorkout4 = moyoungWorkout5;
                        j5 = longValue;
                        runRepository3 = runRepository5;
                        RunDao runDao3 = runRepository3.dao;
                        runRepository$importMoyoungCardio$1.L$0 = runRepository3;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout4;
                        runRepository$importMoyoungCardio$1.J$0 = j5;
                        runRepository$importMoyoungCardio$1.label = 5;
                        runById = runDao3.runById(j5, runRepository$importMoyoungCardio$1);
                        if (runById == obj2) {
                            return obj2;
                        }
                        if (runById == null) {
                            return WatchCardioImportResult.ON_PHONE_ALREADY;
                        }
                        runRepository$importMoyoungCardio$1.L$0 = obj3;
                        runRepository$importMoyoungCardio$1.L$1 = obj3;
                        runRepository$importMoyoungCardio$1.label = 6;
                        if (runRepository3.insertMoyoungHrSeries(j5, moyoungWorkout4, runRepository$importMoyoungCardio$1) == obj2) {
                            return obj2;
                        }
                        return WatchCardioImportResult.IMPORTED;
                    case 1:
                        long j7 = runRepository$importMoyoungCardio$1.J$0;
                        MoyoungWorkout moyoungWorkout6 = (MoyoungWorkout) runRepository$importMoyoungCardio$1.L$1;
                        RunRepository runRepository6 = (RunRepository) runRepository$importMoyoungCardio$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        j = j7;
                        obj = obj4;
                        moyoungWorkout2 = moyoungWorkout6;
                        runRepository4 = runRepository6;
                        if (obj == null) {
                        }
                        break;
                    case 2:
                        d = runRepository$importMoyoungCardio$1.D$0;
                        j2 = runRepository$importMoyoungCardio$1.J$0;
                        moyoungWorkout3 = (MoyoungWorkout) runRepository$importMoyoungCardio$1.L$1;
                        RunRepository runRepository7 = (RunRepository) runRepository$importMoyoungCardio$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        runRepository = runRepository7;
                        if (obj4 == null) {
                        }
                        break;
                    case 3:
                        long j8 = runRepository$importMoyoungCardio$1.J$1;
                        long j9 = runRepository$importMoyoungCardio$1.J$0;
                        double d3 = runRepository$importMoyoungCardio$1.D$0;
                        moyoungWorkout3 = (MoyoungWorkout) runRepository$importMoyoungCardio$1.L$1;
                        RunRepository runRepository8 = (RunRepository) runRepository$importMoyoungCardio$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        j3 = j9;
                        runRepository2 = runRepository8;
                        d2 = d3;
                        j4 = j8;
                        longValue = ((Number) obj4).longValue();
                        String label2 = MoyoungSportLabels.INSTANCE.label(moyoungWorkout3.getSportType());
                        coerceAtLeast = RangesKt.coerceAtLeast(moyoungWorkout3.getSteps(), 0L);
                        str2 = "Da Fit · " + label2;
                        runRepository$importMoyoungCardio$1.L$0 = runRepository2;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout3;
                        runRepository$importMoyoungCardio$1.J$0 = longValue;
                        runRepository$importMoyoungCardio$1.label = 4;
                        obj2 = coroutine_suspended;
                        MoyoungWorkout moyoungWorkout52 = moyoungWorkout3;
                        RunRepository runRepository52 = runRepository2;
                        obj3 = null;
                        if (finishRun$default(runRepository2, longValue, j4, d2, j3, coerceAtLeast, "WATCH", str2, false, runRepository$importMoyoungCardio$1, 128, null) != obj2) {
                        }
                        break;
                    case 4:
                        long j10 = runRepository$importMoyoungCardio$1.J$0;
                        MoyoungWorkout moyoungWorkout7 = (MoyoungWorkout) runRepository$importMoyoungCardio$1.L$1;
                        RunRepository runRepository9 = (RunRepository) runRepository$importMoyoungCardio$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        runRepository3 = runRepository9;
                        obj2 = coroutine_suspended;
                        j5 = j10;
                        moyoungWorkout4 = moyoungWorkout7;
                        obj3 = null;
                        RunDao runDao32 = runRepository3.dao;
                        runRepository$importMoyoungCardio$1.L$0 = runRepository3;
                        runRepository$importMoyoungCardio$1.L$1 = moyoungWorkout4;
                        runRepository$importMoyoungCardio$1.J$0 = j5;
                        runRepository$importMoyoungCardio$1.label = 5;
                        runById = runDao32.runById(j5, runRepository$importMoyoungCardio$1);
                        if (runById == obj2) {
                        }
                        if (runById == null) {
                        }
                        break;
                    case 5:
                        long j11 = runRepository$importMoyoungCardio$1.J$0;
                        MoyoungWorkout moyoungWorkout8 = (MoyoungWorkout) runRepository$importMoyoungCardio$1.L$1;
                        RunRepository runRepository10 = (RunRepository) runRepository$importMoyoungCardio$1.L$0;
                        ResultKt.throwOnFailure(obj4);
                        runById = obj4;
                        runRepository3 = runRepository10;
                        obj2 = coroutine_suspended;
                        j5 = j11;
                        moyoungWorkout4 = moyoungWorkout8;
                        obj3 = null;
                        if (runById == null) {
                        }
                        break;
                    case 6:
                        ResultKt.throwOnFailure(obj4);
                        return WatchCardioImportResult.IMPORTED;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        runRepository$importMoyoungCardio$1 = new RunRepository$importMoyoungCardio$1(runRepository4, continuation);
        Object obj42 = runRepository$importMoyoungCardio$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (runRepository$importMoyoungCardio$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0147 -> B:11:0x014a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object insertMoyoungHrSeries(long j, MoyoungWorkout moyoungWorkout, Continuation<? super Unit> continuation) {
        RunRepository$insertMoyoungHrSeries$1 runRepository$insertMoyoungHrSeries$1;
        RunRepository runRepository;
        int i;
        long startTimeMs;
        long coerceAtLeast;
        long j2;
        int i2;
        RunRepository$insertMoyoungHrSeries$1 runRepository$insertMoyoungHrSeries$12;
        long j3;
        Iterator<MoyoungHrParser.HrPoint> it;
        RunRepository$insertMoyoungHrSeries$1 runRepository$insertMoyoungHrSeries$13;
        long j4;
        long j5;
        long j6;
        if (continuation instanceof RunRepository$insertMoyoungHrSeries$1) {
            runRepository$insertMoyoungHrSeries$1 = (RunRepository$insertMoyoungHrSeries$1) continuation;
            if ((runRepository$insertMoyoungHrSeries$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$insertMoyoungHrSeries$1.label -= Integer.MIN_VALUE;
                runRepository = this;
                Object obj = runRepository$insertMoyoungHrSeries$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$insertMoyoungHrSeries$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    startTimeMs = moyoungWorkout.getStartTimeMs();
                    Long boxLong = Boxing.boxLong(moyoungWorkout.getEndTimeMs());
                    if (boxLong.longValue() <= startTimeMs) {
                        boxLong = null;
                    }
                    long longValue = boxLong != null ? boxLong.longValue() : (moyoungWorkout.getActiveSeconds() * 1000) + startTimeMs;
                    long j7 = longValue;
                    long coerceAtLeast2 = RangesKt.coerceAtLeast(longValue - startTimeMs, 60000L);
                    if (!moyoungWorkout.getHrSeries().isEmpty()) {
                        it = moyoungWorkout.getHrSeries().iterator();
                        runRepository$insertMoyoungHrSeries$13 = runRepository$insertMoyoungHrSeries$1;
                        j4 = startTimeMs;
                        j5 = j7;
                        j6 = j;
                    } else {
                        Integer avgHeartRate = moyoungWorkout.getAvgHeartRate();
                        if (avgHeartRate != null) {
                            int intValue = avgHeartRate.intValue();
                            if (40 > intValue || intValue >= 221) {
                                avgHeartRate = null;
                            }
                            if (avgHeartRate != null) {
                                int intValue2 = avgHeartRate.intValue();
                                coerceAtLeast = RangesKt.coerceAtLeast(coerceAtLeast2 / 4, 60000L);
                                j2 = j7;
                                i2 = intValue2;
                                runRepository$insertMoyoungHrSeries$12 = runRepository$insertMoyoungHrSeries$1;
                                j3 = j;
                                if (startTimeMs <= j2) {
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j8 = runRepository$insertMoyoungHrSeries$1.J$3;
                        long j9 = runRepository$insertMoyoungHrSeries$1.J$2;
                        int i3 = runRepository$insertMoyoungHrSeries$1.I$0;
                        long j10 = runRepository$insertMoyoungHrSeries$1.J$1;
                        long j11 = runRepository$insertMoyoungHrSeries$1.J$0;
                        RunRepository runRepository2 = (RunRepository) runRepository$insertMoyoungHrSeries$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        RunRepository$insertMoyoungHrSeries$1 runRepository$insertMoyoungHrSeries$14 = runRepository$insertMoyoungHrSeries$1;
                        j3 = j11;
                        j2 = j10;
                        coerceAtLeast = j9;
                        int i4 = i3;
                        runRepository = runRepository2;
                        startTimeMs = j8 + coerceAtLeast;
                        runRepository$insertMoyoungHrSeries$12 = runRepository$insertMoyoungHrSeries$14;
                        i2 = i4;
                        if (startTimeMs <= j2) {
                            runRepository$insertMoyoungHrSeries$12.L$0 = runRepository;
                            runRepository$insertMoyoungHrSeries$12.J$0 = j3;
                            runRepository$insertMoyoungHrSeries$12.J$1 = j2;
                            runRepository$insertMoyoungHrSeries$12.I$0 = i2;
                            runRepository$insertMoyoungHrSeries$12.J$2 = coerceAtLeast;
                            runRepository$insertMoyoungHrSeries$12.J$3 = startTimeMs;
                            runRepository$insertMoyoungHrSeries$12.label = 2;
                            if (runRepository.insertHrSample(j3, startTimeMs, i2, runRepository$insertMoyoungHrSeries$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            runRepository$insertMoyoungHrSeries$14 = runRepository$insertMoyoungHrSeries$12;
                            i4 = i2;
                            j8 = startTimeMs;
                            startTimeMs = j8 + coerceAtLeast;
                            runRepository$insertMoyoungHrSeries$12 = runRepository$insertMoyoungHrSeries$14;
                            i2 = i4;
                            if (startTimeMs <= j2) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    j5 = runRepository$insertMoyoungHrSeries$1.J$2;
                    j4 = runRepository$insertMoyoungHrSeries$1.J$1;
                    long j12 = runRepository$insertMoyoungHrSeries$1.J$0;
                    Iterator<MoyoungHrParser.HrPoint> it2 = (Iterator) runRepository$insertMoyoungHrSeries$1.L$1;
                    RunRepository runRepository3 = (RunRepository) runRepository$insertMoyoungHrSeries$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    it = it2;
                    runRepository = runRepository3;
                    runRepository$insertMoyoungHrSeries$13 = runRepository$insertMoyoungHrSeries$1;
                    j6 = j12;
                }
                while (it.hasNext()) {
                    MoyoungHrParser.HrPoint next = it.next();
                    long offsetSec = j4 + (next.getOffsetSec() * 1000);
                    if (j4 <= offsetSec && offsetSec <= j5) {
                        int bpm = next.getBpm();
                        runRepository$insertMoyoungHrSeries$13.L$0 = runRepository;
                        runRepository$insertMoyoungHrSeries$13.L$1 = it;
                        runRepository$insertMoyoungHrSeries$13.J$0 = j6;
                        runRepository$insertMoyoungHrSeries$13.J$1 = j4;
                        runRepository$insertMoyoungHrSeries$13.J$2 = j5;
                        runRepository$insertMoyoungHrSeries$13.label = 1;
                        if (runRepository.insertHrSample(j6, offsetSec, bpm, runRepository$insertMoyoungHrSeries$13) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        runRepository = this;
        runRepository$insertMoyoungHrSeries$1 = new RunRepository$insertMoyoungHrSeries$1(runRepository, continuation);
        Object obj2 = runRepository$insertMoyoungHrSeries$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$insertMoyoungHrSeries$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hrSummaryForRun(long j, Continuation<? super Pair<Integer, Integer>> continuation) {
        RunRepository$hrSummaryForRun$1 runRepository$hrSummaryForRun$1;
        int i;
        List list;
        if (continuation instanceof RunRepository$hrSummaryForRun$1) {
            runRepository$hrSummaryForRun$1 = (RunRepository$hrSummaryForRun$1) continuation;
            if ((runRepository$hrSummaryForRun$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$hrSummaryForRun$1.label -= Integer.MIN_VALUE;
                Object obj = runRepository$hrSummaryForRun$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$hrSummaryForRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    runRepository$hrSummaryForRun$1.label = 1;
                    obj = hrSamplesForRun(j, runRepository$hrSummaryForRun$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return TuplesKt.to(null, null);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.boxInt(((RunHrSampleEntity) it.next()).getBpm()));
                }
                ArrayList arrayList2 = arrayList;
                return TuplesKt.to(Boxing.boxInt(MathKt.roundToInt(CollectionsKt.averageOfInt(arrayList2))), CollectionsKt.maxOrNull((Iterable) arrayList2));
            }
        }
        runRepository$hrSummaryForRun$1 = new RunRepository$hrSummaryForRun$1(this, continuation);
        Object obj2 = runRepository$hrSummaryForRun$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$hrSummaryForRun$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0192 -> B:12:0x0195). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object insertWatchRunFromSoccer(long j, long j2, long j3, long j4, double d, Integer num, Integer num2, String str, Continuation<? super Long> continuation) {
        RunRepository$insertWatchRunFromSoccer$1 runRepository$insertWatchRunFromSoccer$1;
        int i;
        String str2;
        Object obj;
        Integer num3;
        double d2;
        long j5;
        long j6;
        long j7;
        long longValue;
        String str3;
        long j8;
        long j9;
        Object obj2;
        RunRepository runRepository;
        Integer num4;
        long j10;
        long j11;
        long j12;
        int intValue;
        long coerceAtLeast;
        long j13;
        long j14;
        RunRepository runRepository2 = this;
        if (continuation instanceof RunRepository$insertWatchRunFromSoccer$1) {
            runRepository$insertWatchRunFromSoccer$1 = (RunRepository$insertWatchRunFromSoccer$1) continuation;
            if ((runRepository$insertWatchRunFromSoccer$1.label & Integer.MIN_VALUE) != 0) {
                runRepository$insertWatchRunFromSoccer$1.label -= Integer.MIN_VALUE;
                Object obj3 = runRepository$insertWatchRunFromSoccer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = runRepository$insertWatchRunFromSoccer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    RunDao runDao = runRepository2.dao;
                    RunEntity runEntity = new RunEntity(0L, j2, null, 0.0d, 0L, 0L, null, null, "RUN", Boxing.boxLong(j), null, null, null, null, null, 31997, null);
                    runRepository$insertWatchRunFromSoccer$1.L$0 = runRepository2;
                    runRepository$insertWatchRunFromSoccer$1.L$1 = num;
                    runRepository$insertWatchRunFromSoccer$1.L$2 = str;
                    runRepository$insertWatchRunFromSoccer$1.J$0 = j2;
                    runRepository$insertWatchRunFromSoccer$1.J$1 = j3;
                    runRepository$insertWatchRunFromSoccer$1.J$2 = j4;
                    runRepository$insertWatchRunFromSoccer$1.D$0 = d;
                    runRepository$insertWatchRunFromSoccer$1.label = 1;
                    Object insertRun = runDao.insertRun(runEntity, runRepository$insertWatchRunFromSoccer$1);
                    if (insertRun == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    obj = insertRun;
                    num3 = num;
                    d2 = d;
                    j5 = j2;
                    j6 = j4;
                    j7 = j3;
                } else if (i == 1) {
                    double d3 = runRepository$insertWatchRunFromSoccer$1.D$0;
                    long j15 = runRepository$insertWatchRunFromSoccer$1.J$2;
                    long j16 = runRepository$insertWatchRunFromSoccer$1.J$1;
                    long j17 = runRepository$insertWatchRunFromSoccer$1.J$0;
                    String str4 = (String) runRepository$insertWatchRunFromSoccer$1.L$2;
                    Integer num5 = (Integer) runRepository$insertWatchRunFromSoccer$1.L$1;
                    RunRepository runRepository3 = (RunRepository) runRepository$insertWatchRunFromSoccer$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    d2 = d3;
                    j5 = j17;
                    j6 = j15;
                    str2 = str4;
                    obj = obj3;
                    num3 = num5;
                    runRepository2 = runRepository3;
                    j7 = j16;
                } else {
                    if (i == 2) {
                        long j18 = runRepository$insertWatchRunFromSoccer$1.J$3;
                        j10 = runRepository$insertWatchRunFromSoccer$1.J$2;
                        j11 = runRepository$insertWatchRunFromSoccer$1.J$1;
                        j12 = runRepository$insertWatchRunFromSoccer$1.J$0;
                        Integer num6 = (Integer) runRepository$insertWatchRunFromSoccer$1.L$1;
                        runRepository = (RunRepository) runRepository$insertWatchRunFromSoccer$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        num4 = num6;
                        j9 = j18;
                        obj2 = coroutine_suspended;
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            if (40 > intValue2 || intValue2 >= 221) {
                                num4 = null;
                            }
                            if (num4 != null) {
                                intValue = num4.intValue();
                                coerceAtLeast = RangesKt.coerceAtLeast(j10 / 4, 60000L);
                                j13 = j11;
                                j14 = j9;
                                if (j12 <= j13) {
                                }
                            }
                        }
                        return Boxing.boxLong(j9);
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j19 = runRepository$insertWatchRunFromSoccer$1.J$3;
                    coerceAtLeast = runRepository$insertWatchRunFromSoccer$1.J$2;
                    intValue = runRepository$insertWatchRunFromSoccer$1.I$0;
                    j14 = runRepository$insertWatchRunFromSoccer$1.J$1;
                    long j20 = runRepository$insertWatchRunFromSoccer$1.J$0;
                    runRepository = (RunRepository) runRepository$insertWatchRunFromSoccer$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    j13 = j20;
                    j12 = j19;
                    obj2 = coroutine_suspended;
                    j12 += coerceAtLeast;
                    if (j12 <= j13) {
                        runRepository$insertWatchRunFromSoccer$1.L$0 = runRepository;
                        runRepository$insertWatchRunFromSoccer$1.L$1 = null;
                        runRepository$insertWatchRunFromSoccer$1.J$0 = j13;
                        runRepository$insertWatchRunFromSoccer$1.J$1 = j14;
                        runRepository$insertWatchRunFromSoccer$1.I$0 = intValue;
                        runRepository$insertWatchRunFromSoccer$1.J$2 = coerceAtLeast;
                        runRepository$insertWatchRunFromSoccer$1.J$3 = j12;
                        runRepository$insertWatchRunFromSoccer$1.label = 3;
                        if (runRepository.insertHrSample(j14, j12, intValue, runRepository$insertWatchRunFromSoccer$1) == obj2) {
                            return obj2;
                        }
                        j12 += coerceAtLeast;
                        if (j12 <= j13) {
                            j9 = j14;
                            return Boxing.boxLong(j9);
                        }
                    }
                }
                longValue = ((Number) obj).longValue();
                str3 = "Da Fit · " + str2 + " · reclassified from soccer";
                runRepository$insertWatchRunFromSoccer$1.L$0 = runRepository2;
                runRepository$insertWatchRunFromSoccer$1.L$1 = num3;
                runRepository$insertWatchRunFromSoccer$1.L$2 = null;
                runRepository$insertWatchRunFromSoccer$1.J$0 = j5;
                runRepository$insertWatchRunFromSoccer$1.J$1 = j7;
                runRepository$insertWatchRunFromSoccer$1.J$2 = j6;
                runRepository$insertWatchRunFromSoccer$1.J$3 = longValue;
                runRepository$insertWatchRunFromSoccer$1.label = 2;
                j8 = j6;
                j9 = longValue;
                long j21 = j7;
                long j22 = j5;
                obj2 = coroutine_suspended;
                if (finishRun$default(runRepository2, longValue, j7, d2, j8, 0L, "WATCH", str3, false, runRepository$insertWatchRunFromSoccer$1, 128, null) != obj2) {
                    return obj2;
                }
                runRepository = runRepository2;
                num4 = num3;
                j10 = j8;
                j11 = j21;
                j12 = j22;
                if (num4 != null) {
                }
                return Boxing.boxLong(j9);
            }
        }
        runRepository$insertWatchRunFromSoccer$1 = new RunRepository$insertWatchRunFromSoccer$1(runRepository2, continuation);
        Object obj32 = runRepository$insertWatchRunFromSoccer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runRepository$insertWatchRunFromSoccer$1.label;
        if (i != 0) {
        }
        longValue = ((Number) obj).longValue();
        str3 = "Da Fit · " + str2 + " · reclassified from soccer";
        runRepository$insertWatchRunFromSoccer$1.L$0 = runRepository2;
        runRepository$insertWatchRunFromSoccer$1.L$1 = num3;
        runRepository$insertWatchRunFromSoccer$1.L$2 = null;
        runRepository$insertWatchRunFromSoccer$1.J$0 = j5;
        runRepository$insertWatchRunFromSoccer$1.J$1 = j7;
        runRepository$insertWatchRunFromSoccer$1.J$2 = j6;
        runRepository$insertWatchRunFromSoccer$1.J$3 = longValue;
        runRepository$insertWatchRunFromSoccer$1.label = 2;
        j8 = j6;
        j9 = longValue;
        long j212 = j7;
        long j222 = j5;
        obj2 = coroutine_suspended2;
        if (finishRun$default(runRepository2, longValue, j7, d2, j8, 0L, "WATCH", str3, false, runRepository$insertWatchRunFromSoccer$1, 128, null) != obj2) {
        }
    }
}
