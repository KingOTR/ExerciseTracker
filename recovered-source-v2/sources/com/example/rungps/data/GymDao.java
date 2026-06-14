package com.example.rungps.data;

import androidx.autofill.HintConstants;
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.tracking.TrackingService;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: GymDao.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\tH§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u0003H'J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0004H§@¢\u0006\u0002\u0010\u0007J\u0010\u0010(\u001a\u0004\u0018\u00010&H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0018\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010-\u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0014H§@¢\u0006\u0002\u00100J\u0016\u00101\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0002\u00105J\u0010\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0003H'J\u0016\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020&H§@¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH§@¢\u0006\u0002\u0010=J&\u0010>\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH§@¢\u0006\u0002\u0010@J*\u0010A\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u00142\b\u0010C\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020GH§@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\u00042\u0006\u0010+\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00042\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@¢\u0006\u0002\u00105J\u0018\u0010L\u001a\u0004\u0018\u00010G2\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0018\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u0018\u0010P\u001a\u0004\u0018\u00010G2\u0006\u0010O\u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u0018\u0010Q\u001a\u0004\u0018\u00010G2\u0006\u0010O\u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020N0\u00042\b\b\u0002\u0010S\u001a\u00020\"H§@¢\u0006\u0002\u0010TJ\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020N0\u00042\b\b\u0002\u0010S\u001a\u00020\"H§@¢\u0006\u0002\u0010TJ\u0016\u0010V\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ2\u0010W\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010\"2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0002\u0010\\J\u001e\u0010]\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000bH§@¢\u0006\u0002\u0010=J*\u0010^\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010\"2\b\u0010`\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0002\u0010aJ\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@¢\u0006\u0002\u0010\u0007J&\u0010c\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u00142\u0006\u0010e\u001a\u00020\u0014H§@¢\u0006\u0002\u0010DJ\u0016\u0010f\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u00042\u0006\u0010O\u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u001c\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00040\u00032\u0006\u0010+\u001a\u00020\u000bH'J\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020G0\u00042\u0006\u0010k\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010l\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ$\u0010m\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u000b2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020G0\u0004H\u0097@¢\u0006\u0002\u0010oJh\u0010p\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\b\u0010q\u001a\u0004\u0018\u00010\u000b2\u0006\u0010r\u001a\u0002022\b\u0010s\u001a\u0004\u0018\u00010\u00142\f\u0010n\u001a\b\u0012\u0004\u0012\u00020t0\u00042\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u0014H\u0097@¢\u0006\u0002\u0010wJ$\u0010x\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00142\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0097@¢\u0006\u0002\u0010zJ:\u0010{\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00142\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010!\u001a\u00020\"H\u0097@¢\u0006\u0002\u0010}J.\u0010~\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00142\r\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00042\u0006\u0010!\u001a\u00020\"H\u0097@¢\u0006\u0003\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u001d\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u0014H§@¢\u0006\u0002\u0010.J\u001e\u0010\u0084\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH'J&\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000bH§@¢\u0006\u0002\u0010=J\u001e\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001a\u0010\u0088\u0001\u001a\u00020\u000b2\b\u0010\u0089\u0001\u001a\u00030\u0085\u0001H§@¢\u0006\u0003\u0010\u008a\u0001J\u0017\u0010\u008b\u0001\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ(\u0010\u008c\u0001\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u0014H§@¢\u0006\u0003\u0010\u008d\u0001J\u000f\u0010\u008e\u0001\u001a\u00020\u001fH§@¢\u0006\u0002\u0010\u0007¨\u0006\u008f\u0001"}, d2 = {"Lcom/example/rungps/data/GymDao;", "", "splitsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/GymSplitEntity;", "allSplits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dayTemplatesForSplit", "Lcom/example/rungps/data/GymDayTemplateEntity;", "splitId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dayTemplateById", "id", "lastSplitProgressDayTemplate", "exercisesForDay", "Lcom/example/rungps/data/ExerciseTemplateEntity;", "dayTemplateId", "distinctTemplateExerciseNames", "", "insertSplit", "split", "(Lcom/example/rungps/data/GymSplitEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDayTemplate", "day", "(Lcom/example/rungps/data/GymDayTemplateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertExerciseTemplate", "ex", "(Lcom/example/rungps/data/ExerciseTemplateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExerciseTemplate", "", HintConstants.AUTOFILL_HINT_NAME, "defaultSets", "", "(JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSplit", "sessionsFlow", "Lcom/example/rungps/data/GymSessionEntity;", "finishedSessions", "openSession", "sessionById", "reopenSession", "sessionId", "sessionByRemoteId", "remoteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionRemoteId", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionExists", "", "existingSessionIds", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gymLoadFlow", "Lcom/example/rungps/data/GymLoadStats;", "insertSession", "session", "(Lcom/example/rungps/data/GymSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishSession", "endedAtMs", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionTimes", "startedAtMs", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAmbientTag", "tag", TrackingService.PLAN_CUSTOM, "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSet", "set", "Lcom/example/rungps/data/GymSetEntity;", "(Lcom/example/rungps/data/GymSetEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setsForSession", "setsForSessions", "sessionIds", "setById", "prForExercise", "Lcom/example/rungps/data/ExercisePr;", "exerciseName", "lastBestSetForExercise", "lastLoggedSetForExercise", "topPrsHeaviestPerExercise", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "topPrs", "deleteSession", "updateSet", "reps", "weightKg", "", "loggedAtMs", "(JLjava/lang/Integer;DLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSetLoggedAt", "updateSetRpeRom", "rpeBorg", "romNote", "(JLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distinctExerciseNames", "renameExerciseInSession", "oldName", "newName", "deleteSet", "historyForExercise", "Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "setsForSessionFlow", "weightedSetsSince", "sinceMs", "deleteSetsForSession", "replaceSetsForSession", "sets", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRemoteFinishedSession", "templateDayId", "freeDay", "notes", "Lcom/example/rungps/data/RemoteGymSetRow;", "ambientTag", "ambientTagCustom", "(Ljava/lang/String;JJLjava/lang/Long;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSplitWithDays", "dayNames", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSplitWithDaysAndExercises", "exerciseNames", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSplitWithPerDayExercises", "days", "Lcom/example/rungps/data/GymDayExerciseSpec;", "(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "splitByName", "splitsWithName", "carryoverFlow", "Lcom/example/rungps/data/GymCarryoverEntity;", "carryoverForDay", "carryoverForSplit", "insertCarryover", "row", "(Lcom/example/rungps/data/GymCarryoverEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCarryover", "deleteCarryoverForExercise", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllCarryover", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GymDao {
    Object allSplits(Continuation<? super List<GymSplitEntity>> continuation);

    Flow<List<GymCarryoverEntity>> carryoverFlow(long splitId);

    Object carryoverForDay(long j, long j2, Continuation<? super List<GymCarryoverEntity>> continuation);

    Object carryoverForSplit(long j, Continuation<? super List<GymCarryoverEntity>> continuation);

    Object createSplitWithDays(String str, List<String> list, Continuation<? super Long> continuation);

    Object createSplitWithDaysAndExercises(String str, List<String> list, List<String> list2, int i, Continuation<? super Long> continuation);

    Object createSplitWithPerDayExercises(String str, List<GymDayExerciseSpec> list, int i, Continuation<? super Long> continuation);

    Object dayTemplateById(long j, Continuation<? super GymDayTemplateEntity> continuation);

    Object dayTemplatesForSplit(long j, Continuation<? super List<GymDayTemplateEntity>> continuation);

    Object deleteAllCarryover(Continuation<? super Unit> continuation);

    Object deleteCarryover(long j, Continuation<? super Unit> continuation);

    Object deleteCarryoverForExercise(long j, long j2, String str, Continuation<? super Unit> continuation);

    Object deleteSession(long j, Continuation<? super Unit> continuation);

    Object deleteSet(long j, Continuation<? super Unit> continuation);

    Object deleteSetsForSession(long j, Continuation<? super Unit> continuation);

    Object deleteSplit(long j, Continuation<? super Unit> continuation);

    Object distinctExerciseNames(Continuation<? super List<String>> continuation);

    Object distinctTemplateExerciseNames(Continuation<? super List<String>> continuation);

    Object exercisesForDay(long j, Continuation<? super List<ExerciseTemplateEntity>> continuation);

    Object existingSessionIds(List<Long> list, Continuation<? super List<Long>> continuation);

    Object finishSession(long j, long j2, Continuation<? super Unit> continuation);

    Object finishedSessions(Continuation<? super List<GymSessionEntity>> continuation);

    Flow<GymLoadStats> gymLoadFlow();

    Object historyForExercise(String str, Continuation<? super List<ExerciseHistoryPoint>> continuation);

    Object insertCarryover(GymCarryoverEntity gymCarryoverEntity, Continuation<? super Long> continuation);

    Object insertDayTemplate(GymDayTemplateEntity gymDayTemplateEntity, Continuation<? super Long> continuation);

    Object insertExerciseTemplate(ExerciseTemplateEntity exerciseTemplateEntity, Continuation<? super Long> continuation);

    Object insertRemoteFinishedSession(String str, long j, long j2, Long l, boolean z, String str2, List<RemoteGymSetRow> list, String str3, String str4, Continuation<? super Long> continuation);

    Object insertSession(GymSessionEntity gymSessionEntity, Continuation<? super Long> continuation);

    Object insertSet(GymSetEntity gymSetEntity, Continuation<? super Long> continuation);

    Object insertSplit(GymSplitEntity gymSplitEntity, Continuation<? super Long> continuation);

    Object lastBestSetForExercise(String str, Continuation<? super GymSetEntity> continuation);

    Object lastLoggedSetForExercise(String str, Continuation<? super GymSetEntity> continuation);

    Object lastSplitProgressDayTemplate(long j, Continuation<? super GymDayTemplateEntity> continuation);

    Object openSession(Continuation<? super GymSessionEntity> continuation);

    Object prForExercise(String str, Continuation<? super ExercisePr> continuation);

    Object renameExerciseInSession(long j, String str, String str2, Continuation<? super Unit> continuation);

    Object reopenSession(long j, Continuation<? super Unit> continuation);

    Object replaceSetsForSession(long j, List<GymSetEntity> list, Continuation<? super Unit> continuation);

    Object sessionById(long j, Continuation<? super GymSessionEntity> continuation);

    Object sessionByRemoteId(String str, Continuation<? super GymSessionEntity> continuation);

    Object sessionExists(long j, Continuation<? super Boolean> continuation);

    Flow<List<GymSessionEntity>> sessionsFlow();

    Object setById(long j, Continuation<? super GymSetEntity> continuation);

    Object setsForSession(long j, Continuation<? super List<GymSetEntity>> continuation);

    Flow<List<GymSetEntity>> setsForSessionFlow(long sessionId);

    Object setsForSessions(List<Long> list, Continuation<? super List<GymSetEntity>> continuation);

    Object splitByName(String str, Continuation<? super GymSplitEntity> continuation);

    Flow<List<GymSplitEntity>> splitsFlow();

    Object splitsWithName(String str, Continuation<? super List<GymSplitEntity>> continuation);

    Object topPrs(int i, Continuation<? super List<ExercisePr>> continuation);

    Object topPrsHeaviestPerExercise(int i, Continuation<? super List<ExercisePr>> continuation);

    Object updateAmbientTag(long j, String str, String str2, Continuation<? super Unit> continuation);

    Object updateExerciseTemplate(long j, String str, int i, Continuation<? super Unit> continuation);

    Object updateSessionRemoteId(long j, String str, Continuation<? super Unit> continuation);

    Object updateSessionTimes(long j, long j2, long j3, Continuation<? super Unit> continuation);

    Object updateSet(long j, Integer num, double d, Long l, Continuation<? super Unit> continuation);

    Object updateSetLoggedAt(long j, long j2, Continuation<? super Unit> continuation);

    Object updateSetRpeRom(long j, Integer num, String str, Continuation<? super Unit> continuation);

    Object weightedSetsSince(long j, Continuation<? super List<GymSetEntity>> continuation);

    /* compiled from: GymDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object topPrsHeaviestPerExercise$default(GymDao gymDao, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: topPrsHeaviestPerExercise");
            }
            if ((i2 & 1) != 0) {
                i = 20;
            }
            return gymDao.topPrsHeaviestPerExercise(i, continuation);
        }

        public static /* synthetic */ Object topPrs$default(GymDao gymDao, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: topPrs");
            }
            if ((i2 & 1) != 0) {
                i = 8;
            }
            return gymDao.topPrs(i, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object replaceSetsForSession(GymDao gymDao, long j, List<GymSetEntity> list, Continuation<? super Unit> continuation) {
            GymDao$replaceSetsForSession$1 gymDao$replaceSetsForSession$1;
            int i;
            GymDao gymDao2;
            Iterator it;
            if (continuation instanceof GymDao$replaceSetsForSession$1) {
                gymDao$replaceSetsForSession$1 = (GymDao$replaceSetsForSession$1) continuation;
                if ((gymDao$replaceSetsForSession$1.label & Integer.MIN_VALUE) != 0) {
                    gymDao$replaceSetsForSession$1.label -= Integer.MIN_VALUE;
                    Object obj = gymDao$replaceSetsForSession$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gymDao$replaceSetsForSession$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        gymDao$replaceSetsForSession$1.L$0 = gymDao;
                        gymDao$replaceSetsForSession$1.L$1 = list;
                        gymDao$replaceSetsForSession$1.label = 1;
                        if (gymDao.deleteSetsForSession(j, gymDao$replaceSetsForSession$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it = (Iterator) gymDao$replaceSetsForSession$1.L$1;
                            gymDao2 = (GymDao) gymDao$replaceSetsForSession$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            while (it.hasNext()) {
                                GymSetEntity gymSetEntity = (GymSetEntity) it.next();
                                gymDao$replaceSetsForSession$1.L$0 = gymDao2;
                                gymDao$replaceSetsForSession$1.L$1 = it;
                                gymDao$replaceSetsForSession$1.label = 2;
                                if (gymDao2.insertSet(gymSetEntity, gymDao$replaceSetsForSession$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        list = (List) gymDao$replaceSetsForSession$1.L$1;
                        gymDao = (GymDao) gymDao$replaceSetsForSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    gymDao2 = gymDao;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
            }
            gymDao$replaceSetsForSession$1 = new GymDao$replaceSetsForSession$1(continuation);
            Object obj2 = gymDao$replaceSetsForSession$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = gymDao$replaceSetsForSession$1.label;
            if (i != 0) {
            }
            gymDao2 = gymDao;
            it = list.iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object insertRemoteFinishedSession(GymDao gymDao, String str, long j, long j2, Long l, boolean z, String str2, List<RemoteGymSetRow> list, String str3, String str4, Continuation<? super Long> continuation) {
            GymDao$insertRemoteFinishedSession$1 gymDao$insertRemoteFinishedSession$1;
            Object obj;
            int i;
            long j3;
            boolean z2;
            String str5;
            String str6;
            String str7;
            String str8;
            GymDao gymDao2;
            List<RemoteGymSetRow> list2;
            Long l2;
            long j4;
            GymDao gymDao3;
            GymDao gymDao4;
            Iterator it;
            long j5;
            if (continuation instanceof GymDao$insertRemoteFinishedSession$1) {
                gymDao$insertRemoteFinishedSession$1 = (GymDao$insertRemoteFinishedSession$1) continuation;
                if ((gymDao$insertRemoteFinishedSession$1.label & Integer.MIN_VALUE) != 0) {
                    gymDao$insertRemoteFinishedSession$1.label -= Integer.MIN_VALUE;
                    obj = gymDao$insertRemoteFinishedSession$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gymDao$insertRemoteFinishedSession$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        gymDao$insertRemoteFinishedSession$1.L$0 = gymDao;
                        gymDao$insertRemoteFinishedSession$1.L$1 = str;
                        gymDao$insertRemoteFinishedSession$1.L$2 = l;
                        gymDao$insertRemoteFinishedSession$1.L$3 = str2;
                        gymDao$insertRemoteFinishedSession$1.L$4 = list;
                        gymDao$insertRemoteFinishedSession$1.L$5 = str3;
                        gymDao$insertRemoteFinishedSession$1.L$6 = str4;
                        j3 = j;
                        gymDao$insertRemoteFinishedSession$1.J$0 = j3;
                        gymDao$insertRemoteFinishedSession$1.J$1 = j2;
                        z2 = z;
                        gymDao$insertRemoteFinishedSession$1.Z$0 = z2;
                        gymDao$insertRemoteFinishedSession$1.label = 1;
                        Object sessionByRemoteId = gymDao.sessionByRemoteId(str, gymDao$insertRemoteFinishedSession$1);
                        if (sessionByRemoteId == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                        gymDao2 = gymDao;
                        list2 = list;
                        l2 = l;
                        obj = sessionByRemoteId;
                        j4 = j2;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                list2 = (List) gymDao$insertRemoteFinishedSession$1.L$1;
                                gymDao3 = (GymDao) gymDao$insertRemoteFinishedSession$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                long longValue = ((Number) obj).longValue();
                                gymDao4 = gymDao3;
                                it = list2.iterator();
                                j5 = longValue;
                                while (it.hasNext()) {
                                }
                                return Boxing.boxLong(j5);
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j5 = gymDao$insertRemoteFinishedSession$1.J$0;
                            it = (Iterator) gymDao$insertRemoteFinishedSession$1.L$1;
                            GymDao gymDao5 = (GymDao) gymDao$insertRemoteFinishedSession$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            gymDao4 = gymDao5;
                            while (it.hasNext()) {
                                RemoteGymSetRow remoteGymSetRow = (RemoteGymSetRow) it.next();
                                GymSetEntity gymSetEntity = new GymSetEntity(0L, j5, remoteGymSetRow.getExerciseName(), remoteGymSetRow.getSetIndex(), remoteGymSetRow.getReps(), remoteGymSetRow.getWeightKg(), null, remoteGymSetRow.getRpeBorg(), null, 321, null);
                                gymDao$insertRemoteFinishedSession$1.L$0 = gymDao4;
                                gymDao$insertRemoteFinishedSession$1.L$1 = it;
                                gymDao$insertRemoteFinishedSession$1.J$0 = j5;
                                gymDao$insertRemoteFinishedSession$1.label = 3;
                                if (gymDao4.insertSet(gymSetEntity, gymDao$insertRemoteFinishedSession$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Boxing.boxLong(j5);
                        }
                        boolean z3 = gymDao$insertRemoteFinishedSession$1.Z$0;
                        j4 = gymDao$insertRemoteFinishedSession$1.J$1;
                        long j6 = gymDao$insertRemoteFinishedSession$1.J$0;
                        String str9 = (String) gymDao$insertRemoteFinishedSession$1.L$6;
                        String str10 = (String) gymDao$insertRemoteFinishedSession$1.L$5;
                        List<RemoteGymSetRow> list3 = (List) gymDao$insertRemoteFinishedSession$1.L$4;
                        String str11 = (String) gymDao$insertRemoteFinishedSession$1.L$3;
                        l2 = (Long) gymDao$insertRemoteFinishedSession$1.L$2;
                        String str12 = (String) gymDao$insertRemoteFinishedSession$1.L$1;
                        gymDao2 = (GymDao) gymDao$insertRemoteFinishedSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str8 = str9;
                        str7 = str10;
                        str6 = str11;
                        str5 = str12;
                        z2 = z3;
                        list2 = list3;
                        j3 = j6;
                    }
                    if (obj == null) {
                        return Boxing.boxLong(-1L);
                    }
                    GymSessionEntity gymSessionEntity = new GymSessionEntity(0L, j3, Boxing.boxLong(j4), l2, z2, str6, str7, str8, str5, 1, null);
                    gymDao$insertRemoteFinishedSession$1.L$0 = gymDao2;
                    gymDao$insertRemoteFinishedSession$1.L$1 = list2;
                    gymDao$insertRemoteFinishedSession$1.L$2 = null;
                    gymDao$insertRemoteFinishedSession$1.L$3 = null;
                    gymDao$insertRemoteFinishedSession$1.L$4 = null;
                    gymDao$insertRemoteFinishedSession$1.L$5 = null;
                    gymDao$insertRemoteFinishedSession$1.L$6 = null;
                    gymDao$insertRemoteFinishedSession$1.label = 2;
                    obj = gymDao2.insertSession(gymSessionEntity, gymDao$insertRemoteFinishedSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gymDao3 = gymDao2;
                    long longValue2 = ((Number) obj).longValue();
                    gymDao4 = gymDao3;
                    it = list2.iterator();
                    j5 = longValue2;
                    while (it.hasNext()) {
                    }
                    return Boxing.boxLong(j5);
                }
            }
            gymDao$insertRemoteFinishedSession$1 = new GymDao$insertRemoteFinishedSession$1(continuation);
            obj = gymDao$insertRemoteFinishedSession$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = gymDao$insertRemoteFinishedSession$1.label;
            if (i != 0) {
            }
            if (obj == null) {
            }
        }

        public static /* synthetic */ Object insertRemoteFinishedSession$default(GymDao gymDao, String str, long j, long j2, Long l, boolean z, String str2, List list, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return gymDao.insertRemoteFinishedSession(str, j, j2, l, z, str2, list, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertRemoteFinishedSession");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ca -> B:11:0x00cb). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object createSplitWithDays(GymDao gymDao, String str, List<String> list, Continuation<? super Long> continuation) {
            GymDao$createSplitWithDays$1 gymDao$createSplitWithDays$1;
            int i;
            List<String> list2;
            GymDao gymDao2;
            int i2;
            Iterator it;
            long j;
            GymDao gymDao3 = gymDao;
            if (continuation instanceof GymDao$createSplitWithDays$1) {
                gymDao$createSplitWithDays$1 = (GymDao$createSplitWithDays$1) continuation;
                if ((gymDao$createSplitWithDays$1.label & Integer.MIN_VALUE) != 0) {
                    gymDao$createSplitWithDays$1.label -= Integer.MIN_VALUE;
                    Object obj = gymDao$createSplitWithDays$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gymDao$createSplitWithDays$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        GymSplitEntity gymSplitEntity = new GymSplitEntity(0L, str, System.currentTimeMillis(), 1, null);
                        gymDao$createSplitWithDays$1.L$0 = gymDao3;
                        list2 = list;
                        gymDao$createSplitWithDays$1.L$1 = list2;
                        gymDao$createSplitWithDays$1.label = 1;
                        obj = gymDao3.insertSplit(gymSplitEntity, gymDao$createSplitWithDays$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i == 1) {
                        List<String> list3 = (List) gymDao$createSplitWithDays$1.L$1;
                        GymDao gymDao4 = (GymDao) gymDao$createSplitWithDays$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        list2 = list3;
                        gymDao3 = gymDao4;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = gymDao$createSplitWithDays$1.I$0;
                        long j2 = gymDao$createSplitWithDays$1.J$0;
                        it = (Iterator) gymDao$createSplitWithDays$1.L$1;
                        GymDao gymDao5 = (GymDao) gymDao$createSplitWithDays$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        j = j2;
                        gymDao2 = gymDao5;
                        char c = 2;
                        if (!it.hasNext()) {
                            Object next = it.next();
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GymDayTemplateEntity gymDayTemplateEntity = new GymDayTemplateEntity(0L, j, (String) next, i2, 1, null);
                            gymDao$createSplitWithDays$1.L$0 = gymDao2;
                            gymDao$createSplitWithDays$1.L$1 = it;
                            gymDao$createSplitWithDays$1.J$0 = j;
                            gymDao$createSplitWithDays$1.I$0 = i4;
                            c = 2;
                            gymDao$createSplitWithDays$1.label = 2;
                            if (gymDao2.insertDayTemplate(gymDayTemplateEntity, gymDao$createSplitWithDays$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = i4;
                            if (!it.hasNext()) {
                                return Boxing.boxLong(j);
                            }
                        }
                    }
                    long longValue = ((Number) obj).longValue();
                    gymDao2 = gymDao3;
                    i2 = 0;
                    it = list2.iterator();
                    j = longValue;
                    if (!it.hasNext()) {
                    }
                }
            }
            gymDao$createSplitWithDays$1 = new GymDao$createSplitWithDays$1(continuation);
            Object obj2 = gymDao$createSplitWithDays$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = gymDao$createSplitWithDays$1.label;
            if (i != 0) {
            }
            long longValue2 = ((Number) obj2).longValue();
            gymDao2 = gymDao3;
            i2 = 0;
            it = list2.iterator();
            j = longValue2;
            if (!it.hasNext()) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object createSplitWithDaysAndExercises(GymDao gymDao, String str, List<String> list, List<String> list2, int i, Continuation<? super Long> continuation) {
            GymDao$createSplitWithDaysAndExercises$1 gymDao$createSplitWithDaysAndExercises$1;
            int i2;
            List<String> list3;
            List<String> list4;
            int i3;
            Iterator it;
            GymDao gymDao2;
            List<String> list5;
            int i4;
            long j;
            int i5;
            char c;
            int i6;
            int i7;
            Iterator it2;
            long j2;
            GymDao gymDao3 = gymDao;
            if (continuation instanceof GymDao$createSplitWithDaysAndExercises$1) {
                gymDao$createSplitWithDaysAndExercises$1 = (GymDao$createSplitWithDaysAndExercises$1) continuation;
                if ((gymDao$createSplitWithDaysAndExercises$1.label & Integer.MIN_VALUE) != 0) {
                    gymDao$createSplitWithDaysAndExercises$1.label -= Integer.MIN_VALUE;
                    Object obj = gymDao$createSplitWithDaysAndExercises$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = gymDao$createSplitWithDaysAndExercises$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        GymSplitEntity gymSplitEntity = new GymSplitEntity(0L, str, System.currentTimeMillis(), 1, null);
                        gymDao$createSplitWithDaysAndExercises$1.L$0 = gymDao3;
                        list3 = list;
                        gymDao$createSplitWithDaysAndExercises$1.L$1 = list3;
                        list4 = list2;
                        gymDao$createSplitWithDaysAndExercises$1.L$2 = list4;
                        i3 = i;
                        gymDao$createSplitWithDaysAndExercises$1.I$0 = i3;
                        gymDao$createSplitWithDaysAndExercises$1.label = 1;
                        obj = gymDao3.insertSplit(gymSplitEntity, gymDao$createSplitWithDaysAndExercises$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            int i8 = gymDao$createSplitWithDaysAndExercises$1.I$1;
                            j = gymDao$createSplitWithDaysAndExercises$1.J$0;
                            int i9 = gymDao$createSplitWithDaysAndExercises$1.I$0;
                            Iterator it3 = (Iterator) gymDao$createSplitWithDaysAndExercises$1.L$2;
                            List<String> list6 = (List) gymDao$createSplitWithDaysAndExercises$1.L$1;
                            GymDao gymDao4 = (GymDao) gymDao$createSplitWithDaysAndExercises$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            c = 2;
                            long longValue = ((Number) obj).longValue();
                            list5 = list6;
                            gymDao2 = gymDao4;
                            i6 = 0;
                            i7 = i8;
                            i4 = i9;
                            it2 = list6.iterator();
                            it = it3;
                            j2 = longValue;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i10 = gymDao$createSplitWithDaysAndExercises$1.I$2;
                            j2 = gymDao$createSplitWithDaysAndExercises$1.J$1;
                            int i11 = gymDao$createSplitWithDaysAndExercises$1.I$1;
                            long j3 = gymDao$createSplitWithDaysAndExercises$1.J$0;
                            int i12 = gymDao$createSplitWithDaysAndExercises$1.I$0;
                            it2 = (Iterator) gymDao$createSplitWithDaysAndExercises$1.L$3;
                            Iterator it4 = (Iterator) gymDao$createSplitWithDaysAndExercises$1.L$2;
                            list5 = (List) gymDao$createSplitWithDaysAndExercises$1.L$1;
                            GymDao gymDao5 = (GymDao) gymDao$createSplitWithDaysAndExercises$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            i6 = i10;
                            i4 = i12;
                            it = it4;
                            gymDao2 = gymDao5;
                            i7 = i11;
                            j = j3;
                            c = 2;
                        }
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i13 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ExerciseTemplateEntity exerciseTemplateEntity = new ExerciseTemplateEntity(0L, j2, (String) next, i6, i4, 1, null);
                            gymDao$createSplitWithDaysAndExercises$1.L$0 = gymDao2;
                            gymDao$createSplitWithDaysAndExercises$1.L$1 = list5;
                            gymDao$createSplitWithDaysAndExercises$1.L$2 = it;
                            gymDao$createSplitWithDaysAndExercises$1.L$3 = it2;
                            gymDao$createSplitWithDaysAndExercises$1.I$0 = i4;
                            gymDao$createSplitWithDaysAndExercises$1.J$0 = j;
                            gymDao$createSplitWithDaysAndExercises$1.I$1 = i7;
                            gymDao$createSplitWithDaysAndExercises$1.J$1 = j2;
                            gymDao$createSplitWithDaysAndExercises$1.I$2 = i13;
                            gymDao$createSplitWithDaysAndExercises$1.label = 3;
                            if (gymDao2.insertExerciseTemplate(exerciseTemplateEntity, gymDao$createSplitWithDaysAndExercises$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i6 = i13;
                        }
                        i5 = i7;
                        if (!it.hasNext()) {
                            Object next2 = it.next();
                            int i14 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GymDao gymDao6 = gymDao2;
                            List<String> list7 = list5;
                            GymDayTemplateEntity gymDayTemplateEntity = new GymDayTemplateEntity(0L, j, (String) next2, i5, 1, null);
                            gymDao$createSplitWithDaysAndExercises$1.L$0 = gymDao6;
                            gymDao$createSplitWithDaysAndExercises$1.L$1 = list7;
                            gymDao$createSplitWithDaysAndExercises$1.L$2 = it;
                            gymDao$createSplitWithDaysAndExercises$1.L$3 = null;
                            gymDao$createSplitWithDaysAndExercises$1.I$0 = i4;
                            gymDao$createSplitWithDaysAndExercises$1.J$0 = j;
                            gymDao$createSplitWithDaysAndExercises$1.I$1 = i14;
                            c = 2;
                            gymDao$createSplitWithDaysAndExercises$1.label = 2;
                            Object insertDayTemplate = gymDao6.insertDayTemplate(gymDayTemplateEntity, gymDao$createSplitWithDaysAndExercises$1);
                            if (insertDayTemplate == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int i15 = i4;
                            Iterator it5 = it;
                            long longValue2 = ((Number) insertDayTemplate).longValue();
                            list5 = list7;
                            gymDao2 = gymDao6;
                            i6 = 0;
                            i7 = i14;
                            i4 = i15;
                            it2 = list7.iterator();
                            it = it5;
                            j2 = longValue2;
                            while (it2.hasNext()) {
                            }
                            i5 = i7;
                            if (!it.hasNext()) {
                                return Boxing.boxLong(j);
                            }
                        }
                    } else {
                        int i16 = gymDao$createSplitWithDaysAndExercises$1.I$0;
                        List<String> list8 = (List) gymDao$createSplitWithDaysAndExercises$1.L$2;
                        List<String> list9 = (List) gymDao$createSplitWithDaysAndExercises$1.L$1;
                        GymDao gymDao7 = (GymDao) gymDao$createSplitWithDaysAndExercises$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i3 = i16;
                        gymDao3 = gymDao7;
                        list4 = list8;
                        list3 = list9;
                    }
                    long longValue3 = ((Number) obj).longValue();
                    it = list3.iterator();
                    gymDao2 = gymDao3;
                    list5 = list4;
                    i4 = i3;
                    j = longValue3;
                    i5 = 0;
                    if (!it.hasNext()) {
                    }
                }
            }
            gymDao$createSplitWithDaysAndExercises$1 = new GymDao$createSplitWithDaysAndExercises$1(continuation);
            Object obj2 = gymDao$createSplitWithDaysAndExercises$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = gymDao$createSplitWithDaysAndExercises$1.label;
            if (i2 != 0) {
            }
            long longValue32 = ((Number) obj2).longValue();
            it = list3.iterator();
            gymDao2 = gymDao3;
            list5 = list4;
            i4 = i3;
            j = longValue32;
            i5 = 0;
            if (!it.hasNext()) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x017d -> B:12:0x017f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object createSplitWithPerDayExercises(GymDao gymDao, String str, List<GymDayExerciseSpec> list, int i, Continuation<? super Long> continuation) {
            GymDao$createSplitWithPerDayExercises$1 gymDao$createSplitWithPerDayExercises$1;
            int i2;
            List<GymDayExerciseSpec> list2;
            int i3;
            Iterator it;
            GymDao gymDao2;
            int i4;
            long j;
            Iterator it2;
            long j2;
            int i5;
            long j3;
            GymDao gymDao3 = gymDao;
            if (continuation instanceof GymDao$createSplitWithPerDayExercises$1) {
                gymDao$createSplitWithPerDayExercises$1 = (GymDao$createSplitWithPerDayExercises$1) continuation;
                if ((gymDao$createSplitWithPerDayExercises$1.label & Integer.MIN_VALUE) != 0) {
                    gymDao$createSplitWithPerDayExercises$1.label -= Integer.MIN_VALUE;
                    Object obj = gymDao$createSplitWithPerDayExercises$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = gymDao$createSplitWithPerDayExercises$1.label;
                    int i6 = 2;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        GymSplitEntity gymSplitEntity = new GymSplitEntity(0L, str, System.currentTimeMillis(), 1, null);
                        gymDao$createSplitWithPerDayExercises$1.L$0 = gymDao3;
                        list2 = list;
                        gymDao$createSplitWithPerDayExercises$1.L$1 = list2;
                        i3 = i;
                        gymDao$createSplitWithPerDayExercises$1.I$0 = i3;
                        gymDao$createSplitWithPerDayExercises$1.label = 1;
                        obj = gymDao3.insertSplit(gymSplitEntity, gymDao$createSplitWithPerDayExercises$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 == 1) {
                        int i7 = gymDao$createSplitWithPerDayExercises$1.I$0;
                        list2 = (List) gymDao$createSplitWithPerDayExercises$1.L$1;
                        GymDao gymDao4 = (GymDao) gymDao$createSplitWithPerDayExercises$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i3 = i7;
                        gymDao3 = gymDao4;
                    } else if (i2 == 2) {
                        long j4 = gymDao$createSplitWithPerDayExercises$1.J$0;
                        i4 = gymDao$createSplitWithPerDayExercises$1.I$0;
                        GymDayExerciseSpec gymDayExerciseSpec = (GymDayExerciseSpec) gymDao$createSplitWithPerDayExercises$1.L$2;
                        Iterator it3 = (Iterator) gymDao$createSplitWithPerDayExercises$1.L$1;
                        GymDao gymDao5 = (GymDao) gymDao$createSplitWithPerDayExercises$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        long longValue = ((Number) obj).longValue();
                        it2 = gymDayExerciseSpec.getExerciseNames().iterator();
                        it = it3;
                        j2 = longValue;
                        i5 = 0;
                        gymDao2 = gymDao5;
                        j3 = j4;
                        if (!it2.hasNext()) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i8 = gymDao$createSplitWithPerDayExercises$1.I$1;
                        long j5 = gymDao$createSplitWithPerDayExercises$1.J$1;
                        long j6 = gymDao$createSplitWithPerDayExercises$1.J$0;
                        int i9 = gymDao$createSplitWithPerDayExercises$1.I$0;
                        Iterator it4 = (Iterator) gymDao$createSplitWithPerDayExercises$1.L$2;
                        Iterator it5 = (Iterator) gymDao$createSplitWithPerDayExercises$1.L$1;
                        GymDao gymDao6 = (GymDao) gymDao$createSplitWithPerDayExercises$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = it5;
                        i5 = i8;
                        i4 = i9;
                        gymDao2 = gymDao6;
                        j2 = j5;
                        long j7 = j6;
                        it2 = it4;
                        j3 = j7;
                        i6 = 2;
                        if (!it2.hasNext()) {
                            Object next = it2.next();
                            int i10 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            long j8 = j2;
                            ExerciseTemplateEntity exerciseTemplateEntity = new ExerciseTemplateEntity(0L, j2, (String) next, i5, RangesKt.coerceIn(i4, 1, 10), 1, null);
                            gymDao$createSplitWithPerDayExercises$1.L$0 = gymDao2;
                            gymDao$createSplitWithPerDayExercises$1.L$1 = it;
                            gymDao$createSplitWithPerDayExercises$1.L$2 = it2;
                            gymDao$createSplitWithPerDayExercises$1.I$0 = i4;
                            j7 = j3;
                            gymDao$createSplitWithPerDayExercises$1.J$0 = j7;
                            gymDao$createSplitWithPerDayExercises$1.J$1 = j8;
                            gymDao$createSplitWithPerDayExercises$1.I$1 = i10;
                            gymDao$createSplitWithPerDayExercises$1.label = 3;
                            if (gymDao2.insertExerciseTemplate(exerciseTemplateEntity, gymDao$createSplitWithPerDayExercises$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j2 = j8;
                            i5 = i10;
                            j3 = j7;
                            i6 = 2;
                            if (!it2.hasNext()) {
                                j = j3;
                                if (it.hasNext()) {
                                    GymDayExerciseSpec gymDayExerciseSpec2 = (GymDayExerciseSpec) it.next();
                                    long j9 = j;
                                    GymDayTemplateEntity gymDayTemplateEntity = new GymDayTemplateEntity(0L, j, gymDayExerciseSpec2.getDayName(), gymDayExerciseSpec2.getOrderIdx(), 1, null);
                                    gymDao$createSplitWithPerDayExercises$1.L$0 = gymDao2;
                                    gymDao$createSplitWithPerDayExercises$1.L$1 = it;
                                    gymDao$createSplitWithPerDayExercises$1.L$2 = gymDayExerciseSpec2;
                                    gymDao$createSplitWithPerDayExercises$1.I$0 = i4;
                                    gymDao$createSplitWithPerDayExercises$1.J$0 = j9;
                                    gymDao$createSplitWithPerDayExercises$1.label = i6;
                                    Object insertDayTemplate = gymDao2.insertDayTemplate(gymDayTemplateEntity, gymDao$createSplitWithPerDayExercises$1);
                                    if (insertDayTemplate == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    GymDao gymDao7 = gymDao2;
                                    Iterator it6 = it;
                                    long longValue2 = ((Number) insertDayTemplate).longValue();
                                    it2 = gymDayExerciseSpec2.getExerciseNames().iterator();
                                    it = it6;
                                    j2 = longValue2;
                                    i5 = 0;
                                    gymDao2 = gymDao7;
                                    j3 = j9;
                                    if (!it2.hasNext()) {
                                    }
                                } else {
                                    return Boxing.boxLong(j);
                                }
                            }
                        }
                    }
                    long longValue3 = ((Number) obj).longValue();
                    it = CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.example.rungps.data.GymDao$DefaultImpls$createSplitWithPerDayExercises$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(((GymDayExerciseSpec) t).getOrderIdx()), Integer.valueOf(((GymDayExerciseSpec) t2).getOrderIdx()));
                        }
                    }).iterator();
                    gymDao2 = gymDao3;
                    i4 = i3;
                    j = longValue3;
                    if (it.hasNext()) {
                    }
                }
            }
            gymDao$createSplitWithPerDayExercises$1 = new GymDao$createSplitWithPerDayExercises$1(continuation);
            Object obj2 = gymDao$createSplitWithPerDayExercises$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i2 = gymDao$createSplitWithPerDayExercises$1.label;
            int i62 = 2;
            if (i2 != 0) {
            }
            long longValue32 = ((Number) obj2).longValue();
            it = CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.example.rungps.data.GymDao$DefaultImpls$createSplitWithPerDayExercises$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((GymDayExerciseSpec) t).getOrderIdx()), Integer.valueOf(((GymDayExerciseSpec) t2).getOrderIdx()));
                }
            }).iterator();
            gymDao2 = gymDao3;
            i4 = i3;
            j = longValue32;
            if (it.hasNext()) {
            }
        }
    }
}
