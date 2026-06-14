package com.example.rungps.data;

import androidx.paging.PagingSource;
import com.example.rungps.tracking.TrackingService;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import org.maplibre.android.style.layers.Property;

/* compiled from: RunDao.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006JJ\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u0014H'J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u0017H'J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H§@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u001e\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H§@¢\u0006\u0002\u0010\"J>\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010'\u001a\u0004\u0018\u00010\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010)J \u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00152\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u0016\u00101\u001a\u0002022\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H§@¢\u0006\u0002\u00105J\u0018\u00106\u001a\u0004\u0018\u00010.2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u001e\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\"J\u001e\u00109\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\"J\u0016\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010=\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ6\u0010>\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010@J&\u0010A\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H§@¢\u0006\u0002\u0010BJ&\u0010C\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0097@¢\u0006\u0002\u0010BJ\u0016\u0010D\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u000e\u0010E\u001a\u00020\bH§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010F\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u000e\u0010G\u001a\u00020\bH§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010H\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0097@¢\u0006\u0002\u0010\u001cJ\u000e\u0010I\u001a\u00020\bH\u0097@¢\u0006\u0002\u0010\u001a¨\u0006J"}, d2 = {"Lcom/example/rungps/data/RunDao;", "", "insertRun", "", "run", "Lcom/example/rungps/data/RunEntity;", "(Lcom/example/rungps/data/RunEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishRun", "", "runId", "endedAtMs", "totalDistanceM", "", "totalDurationMs", "totalSteps", TrackingService.EXTRA_PLAN_TYPE, "", TrackingService.EXTRA_TIME_SESSION, "(JJDJJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "runsPagingSource", "Landroidx/paging/PagingSource;", "", "allRuns", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runById", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runByWatchImportId", "watchImportId", "runByStravaImportId", "stravaImportId", "setWatchImportId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setStravaImportId", "updateRunMetadata", "title", "description", "privateNotes", "gearId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGearId", "(JLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPoint", Property.SYMBOL_PLACEMENT_POINT, "Lcom/example/rungps/data/PointEntity;", "(Lcom/example/rungps/data/PointEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pointsForRun", "runExists", "", "existingIds", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastPoint", "deletePointsBefore", "startTimeMs", "deletePointsAfter", "endTimeMs", "setPointDistanceZero", "pointId", "sumDistanceM", "updateRunAfterTrim", "startedAtMs", "(JJJDJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteHrSamplesOutside", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trimRun", "deletePointsForRun", "deleteAllPoints", "deleteRunOnly", "deleteAllRunsOnly", "deleteRun", "deleteAllRuns", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RunDao {
    Object allRuns(Continuation<? super List<RunEntity>> continuation);

    Object deleteAllPoints(Continuation<? super Unit> continuation);

    Object deleteAllRuns(Continuation<? super Unit> continuation);

    Object deleteAllRunsOnly(Continuation<? super Unit> continuation);

    Object deleteHrSamplesOutside(long j, long j2, long j3, Continuation<? super Unit> continuation);

    Object deletePointsAfter(long j, long j2, Continuation<? super Unit> continuation);

    Object deletePointsBefore(long j, long j2, Continuation<? super Unit> continuation);

    Object deletePointsForRun(long j, Continuation<? super Unit> continuation);

    Object deleteRun(long j, Continuation<? super Unit> continuation);

    Object deleteRunOnly(long j, Continuation<? super Unit> continuation);

    Object existingIds(List<Long> list, Continuation<? super List<Long>> continuation);

    Object finishRun(long j, long j2, double d, long j3, long j4, String str, String str2, Continuation<? super Unit> continuation);

    Object insertPoint(PointEntity pointEntity, Continuation<? super Long> continuation);

    Object insertRun(RunEntity runEntity, Continuation<? super Long> continuation);

    Object lastPoint(long j, Continuation<? super PointEntity> continuation);

    Object pointsForRun(long j, Continuation<? super List<PointEntity>> continuation);

    Object runById(long j, Continuation<? super RunEntity> continuation);

    Object runByStravaImportId(long j, Continuation<? super RunEntity> continuation);

    Object runByWatchImportId(long j, Continuation<? super RunEntity> continuation);

    Object runExists(long j, Continuation<? super Boolean> continuation);

    Flow<List<RunEntity>> runsFlow();

    PagingSource<Integer, RunEntity> runsPagingSource();

    Object setGearId(long j, Long l, Continuation<? super Unit> continuation);

    Object setPointDistanceZero(long j, Continuation<? super Unit> continuation);

    Object setStravaImportId(long j, long j2, Continuation<? super Unit> continuation);

    Object setWatchImportId(long j, long j2, Continuation<? super Unit> continuation);

    Object sumDistanceM(long j, Continuation<? super Double> continuation);

    Object trimRun(long j, long j2, long j3, Continuation<? super Unit> continuation);

    Object updateRunAfterTrim(long j, long j2, long j3, double d, long j4, Continuation<? super Unit> continuation);

    Object updateRunMetadata(long j, String str, String str2, String str3, Long l, Continuation<? super Unit> continuation);

    /* compiled from: RunDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x017c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x013e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object trimRun(RunDao runDao, long j, long j2, long j3, Continuation<? super Unit> continuation) {
            RunDao$trimRun$1 runDao$trimRun$1;
            RunDao$trimRun$1 runDao$trimRun$12;
            long j4;
            long j5;
            long j6;
            RunDao runDao2;
            RunDao runDao3;
            long j7;
            RunDao runDao4;
            List list;
            List list2;
            RunDao runDao5;
            long j8;
            double doubleValue;
            long timeMs;
            long timeMs2;
            long coerceAtLeast;
            if (continuation instanceof RunDao$trimRun$1) {
                runDao$trimRun$1 = (RunDao$trimRun$1) continuation;
                if ((runDao$trimRun$1.label & Integer.MIN_VALUE) != 0) {
                    runDao$trimRun$1.label -= Integer.MIN_VALUE;
                    runDao$trimRun$12 = runDao$trimRun$1;
                    Object obj = runDao$trimRun$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (runDao$trimRun$12.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            runDao$trimRun$12.L$0 = runDao;
                            runDao$trimRun$12.J$0 = j;
                            j4 = j2;
                            runDao$trimRun$12.J$1 = j4;
                            runDao$trimRun$12.J$2 = j3;
                            runDao$trimRun$12.label = 1;
                            if (runDao.deletePointsBefore(j, j2, runDao$trimRun$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j5 = j3;
                            j6 = j;
                            runDao2 = runDao;
                            runDao$trimRun$12.L$0 = runDao2;
                            runDao$trimRun$12.J$0 = j6;
                            runDao$trimRun$12.J$1 = j4;
                            runDao$trimRun$12.J$2 = j5;
                            runDao$trimRun$12.label = 2;
                            if (runDao2.deletePointsAfter(j6, j5, runDao$trimRun$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            runDao3 = runDao2;
                            runDao$trimRun$12.L$0 = runDao3;
                            runDao$trimRun$12.J$0 = j6;
                            runDao$trimRun$12.label = 3;
                            if (runDao3.deleteHrSamplesOutside(j6, j4, j5, runDao$trimRun$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j7 = j6;
                            runDao$trimRun$12.L$0 = runDao3;
                            runDao$trimRun$12.J$0 = j7;
                            runDao$trimRun$12.label = 4;
                            obj = runDao3.pointsForRun(j7, runDao$trimRun$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            runDao4 = runDao3;
                            list = (List) obj;
                            if (list.size() < 2) {
                                runDao$trimRun$12.L$0 = null;
                                runDao$trimRun$12.label = 5;
                                if (runDao4.deleteRun(j7, runDao$trimRun$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                            long id = ((PointEntity) CollectionsKt.first(list)).getId();
                            runDao$trimRun$12.L$0 = runDao4;
                            runDao$trimRun$12.L$1 = list;
                            runDao$trimRun$12.J$0 = j7;
                            runDao$trimRun$12.label = 6;
                            if (runDao4.setPointDistanceZero(id, runDao$trimRun$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list2 = list;
                            runDao$trimRun$12.L$0 = runDao4;
                            runDao$trimRun$12.L$1 = list2;
                            runDao$trimRun$12.J$0 = j7;
                            runDao$trimRun$12.label = 7;
                            obj = runDao4.sumDistanceM(j7, runDao$trimRun$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            runDao5 = runDao4;
                            List list3 = list2;
                            j8 = j7;
                            Double d = (Double) obj;
                            doubleValue = d != null ? d.doubleValue() : 0.0d;
                            timeMs = ((PointEntity) CollectionsKt.first(list3)).getTimeMs();
                            timeMs2 = ((PointEntity) CollectionsKt.last(list3)).getTimeMs();
                            coerceAtLeast = RangesKt.coerceAtLeast(timeMs2 - timeMs, 0L);
                            runDao$trimRun$12.L$0 = null;
                            runDao$trimRun$12.L$1 = null;
                            runDao$trimRun$12.label = 8;
                            if (runDao5.updateRunAfterTrim(j8, timeMs, timeMs2, doubleValue, coerceAtLeast, runDao$trimRun$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        case 1:
                            j5 = runDao$trimRun$12.J$2;
                            long j9 = runDao$trimRun$12.J$1;
                            j6 = runDao$trimRun$12.J$0;
                            runDao2 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            j4 = j9;
                            runDao$trimRun$12.L$0 = runDao2;
                            runDao$trimRun$12.J$0 = j6;
                            runDao$trimRun$12.J$1 = j4;
                            runDao$trimRun$12.J$2 = j5;
                            runDao$trimRun$12.label = 2;
                            if (runDao2.deletePointsAfter(j6, j5, runDao$trimRun$12) == coroutine_suspended) {
                            }
                            runDao3 = runDao2;
                            runDao$trimRun$12.L$0 = runDao3;
                            runDao$trimRun$12.J$0 = j6;
                            runDao$trimRun$12.label = 3;
                            if (runDao3.deleteHrSamplesOutside(j6, j4, j5, runDao$trimRun$12) == coroutine_suspended) {
                            }
                            break;
                        case 2:
                            j5 = runDao$trimRun$12.J$2;
                            long j10 = runDao$trimRun$12.J$1;
                            j6 = runDao$trimRun$12.J$0;
                            runDao2 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            j4 = j10;
                            runDao3 = runDao2;
                            runDao$trimRun$12.L$0 = runDao3;
                            runDao$trimRun$12.J$0 = j6;
                            runDao$trimRun$12.label = 3;
                            if (runDao3.deleteHrSamplesOutside(j6, j4, j5, runDao$trimRun$12) == coroutine_suspended) {
                            }
                            break;
                        case 3:
                            j7 = runDao$trimRun$12.J$0;
                            runDao3 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            runDao$trimRun$12.L$0 = runDao3;
                            runDao$trimRun$12.J$0 = j7;
                            runDao$trimRun$12.label = 4;
                            obj = runDao3.pointsForRun(j7, runDao$trimRun$12);
                            if (obj == coroutine_suspended) {
                            }
                            runDao4 = runDao3;
                            list = (List) obj;
                            if (list.size() < 2) {
                            }
                            break;
                        case 4:
                            j7 = runDao$trimRun$12.J$0;
                            runDao3 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            runDao4 = runDao3;
                            list = (List) obj;
                            if (list.size() < 2) {
                            }
                            break;
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 6:
                            j7 = runDao$trimRun$12.J$0;
                            list2 = (List) runDao$trimRun$12.L$1;
                            runDao4 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            runDao$trimRun$12.L$0 = runDao4;
                            runDao$trimRun$12.L$1 = list2;
                            runDao$trimRun$12.J$0 = j7;
                            runDao$trimRun$12.label = 7;
                            obj = runDao4.sumDistanceM(j7, runDao$trimRun$12);
                            if (obj == coroutine_suspended) {
                            }
                            runDao5 = runDao4;
                            List list32 = list2;
                            j8 = j7;
                            Double d2 = (Double) obj;
                            doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                            timeMs = ((PointEntity) CollectionsKt.first(list32)).getTimeMs();
                            timeMs2 = ((PointEntity) CollectionsKt.last(list32)).getTimeMs();
                            coerceAtLeast = RangesKt.coerceAtLeast(timeMs2 - timeMs, 0L);
                            runDao$trimRun$12.L$0 = null;
                            runDao$trimRun$12.L$1 = null;
                            runDao$trimRun$12.label = 8;
                            if (runDao5.updateRunAfterTrim(j8, timeMs, timeMs2, doubleValue, coerceAtLeast, runDao$trimRun$12) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        case 7:
                            j7 = runDao$trimRun$12.J$0;
                            list2 = (List) runDao$trimRun$12.L$1;
                            runDao4 = (RunDao) runDao$trimRun$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            runDao5 = runDao4;
                            List list322 = list2;
                            j8 = j7;
                            Double d22 = (Double) obj;
                            doubleValue = d22 != null ? d22.doubleValue() : 0.0d;
                            timeMs = ((PointEntity) CollectionsKt.first(list322)).getTimeMs();
                            timeMs2 = ((PointEntity) CollectionsKt.last(list322)).getTimeMs();
                            coerceAtLeast = RangesKt.coerceAtLeast(timeMs2 - timeMs, 0L);
                            runDao$trimRun$12.L$0 = null;
                            runDao$trimRun$12.L$1 = null;
                            runDao$trimRun$12.label = 8;
                            if (runDao5.updateRunAfterTrim(j8, timeMs, timeMs2, doubleValue, coerceAtLeast, runDao$trimRun$12) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        case 8:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            runDao$trimRun$1 = new RunDao$trimRun$1(continuation);
            runDao$trimRun$12 = runDao$trimRun$1;
            Object obj2 = runDao$trimRun$12.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (runDao$trimRun$12.label) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object deleteRun(RunDao runDao, long j, Continuation<? super Unit> continuation) {
            RunDao$deleteRun$1 runDao$deleteRun$1;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof RunDao$deleteRun$1) {
                runDao$deleteRun$1 = (RunDao$deleteRun$1) continuation;
                if ((runDao$deleteRun$1.label & Integer.MIN_VALUE) != 0) {
                    runDao$deleteRun$1.label -= Integer.MIN_VALUE;
                    Object obj = runDao$deleteRun$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runDao$deleteRun$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        runDao$deleteRun$1.L$0 = runDao;
                        runDao$deleteRun$1.J$0 = j;
                        runDao$deleteRun$1.label = 1;
                        if (runDao.deletePointsForRun(j, runDao$deleteRun$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        j = runDao$deleteRun$1.J$0;
                        runDao = (RunDao) runDao$deleteRun$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    runDao$deleteRun$1.L$0 = null;
                    runDao$deleteRun$1.label = 2;
                    if (runDao.deleteRunOnly(j, runDao$deleteRun$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            runDao$deleteRun$1 = new RunDao$deleteRun$1(continuation);
            Object obj2 = runDao$deleteRun$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = runDao$deleteRun$1.label;
            if (i != 0) {
            }
            runDao$deleteRun$1.L$0 = null;
            runDao$deleteRun$1.label = 2;
            if (runDao.deleteRunOnly(j, runDao$deleteRun$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object deleteAllRuns(RunDao runDao, Continuation<? super Unit> continuation) {
            RunDao$deleteAllRuns$1 runDao$deleteAllRuns$1;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof RunDao$deleteAllRuns$1) {
                runDao$deleteAllRuns$1 = (RunDao$deleteAllRuns$1) continuation;
                if ((runDao$deleteAllRuns$1.label & Integer.MIN_VALUE) != 0) {
                    runDao$deleteAllRuns$1.label -= Integer.MIN_VALUE;
                    Object obj = runDao$deleteAllRuns$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runDao$deleteAllRuns$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        runDao$deleteAllRuns$1.L$0 = runDao;
                        runDao$deleteAllRuns$1.label = 1;
                        if (runDao.deleteAllPoints(runDao$deleteAllRuns$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        runDao = (RunDao) runDao$deleteAllRuns$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    runDao$deleteAllRuns$1.L$0 = null;
                    runDao$deleteAllRuns$1.label = 2;
                    if (runDao.deleteAllRunsOnly(runDao$deleteAllRuns$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            runDao$deleteAllRuns$1 = new RunDao$deleteAllRuns$1(continuation);
            Object obj2 = runDao$deleteAllRuns$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = runDao$deleteAllRuns$1.label;
            if (i != 0) {
            }
            runDao$deleteAllRuns$1.L$0 = null;
            runDao$deleteAllRuns$1.label = 2;
            if (runDao.deleteAllRunsOnly(runDao$deleteAllRuns$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
