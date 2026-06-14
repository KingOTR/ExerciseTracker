package com.example.rungps.strava;

import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.repo.RunRepository;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.recovery.StravaRecoveryDedup;
import com.example.rungps.recovery.StravaRecoveryEstimator;
import com.example.rungps.tracking.ActivityTypes;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StravaHistoryImporter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007Jt\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016H\u0086@¢\u0006\u0002\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/strava/StravaHistoryImporter;", "", "<init>", "()V", "isImportable", "", "activity", "Lcom/example/rungps/strava/StravaActivityJson;", "importActivity", "Lkotlin/Pair;", "Lcom/example/rungps/strava/StravaHistoryImporter$Outcome;", "runRepo", "Lcom/example/rungps/data/repo/RunRepository;", "linkedIds", "", "", "localRuns", "", "Lcom/example/rungps/data/RunEntity;", "demographics", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", "recordRecovery", "Lkotlin/Function2;", "Lcom/example/rungps/data/RecoveryEventEntity;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/example/rungps/data/repo/RunRepository;Lcom/example/rungps/strava/StravaActivityJson;Ljava/util/Set;Ljava/util/List;Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Outcome", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaHistoryImporter {
    public static final int $stable = 0;
    public static final StravaHistoryImporter INSTANCE = new StravaHistoryImporter();

    private StravaHistoryImporter() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StravaHistoryImporter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/example/rungps/strava/StravaHistoryImporter$Outcome;", "", "<init>", "(Ljava/lang/String;I)V", "IMPORTED", "SKIPPED_LINKED", "SKIPPED_EXISTS", "SKIPPED_DUPLICATE", "REJECTED", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Outcome {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Outcome[] $VALUES;
        public static final Outcome IMPORTED = new Outcome("IMPORTED", 0);
        public static final Outcome SKIPPED_LINKED = new Outcome("SKIPPED_LINKED", 1);
        public static final Outcome SKIPPED_EXISTS = new Outcome("SKIPPED_EXISTS", 2);
        public static final Outcome SKIPPED_DUPLICATE = new Outcome("SKIPPED_DUPLICATE", 3);
        public static final Outcome REJECTED = new Outcome("REJECTED", 4);

        private static final /* synthetic */ Outcome[] $values() {
            return new Outcome[]{IMPORTED, SKIPPED_LINKED, SKIPPED_EXISTS, SKIPPED_DUPLICATE, REJECTED};
        }

        public static EnumEntries<Outcome> getEntries() {
            return $ENTRIES;
        }

        static {
            Outcome[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Outcome(String str, int i) {
        }

        public static Outcome valueOf(String str) {
            return (Outcome) Enum.valueOf(Outcome.class, str);
        }

        public static Outcome[] values() {
            return (Outcome[]) $VALUES.clone();
        }
    }

    public final boolean isImportable(StravaActivityJson activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return StravaRecoveryEstimator.INSTANCE.planFromActivity(activity, null) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object importActivity(RunRepository runRepository, StravaActivityJson stravaActivityJson, Set<Long> set, List<RunEntity> list, RecoveryModel.RecoveryDemographics recoveryDemographics, Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Pair<? extends Outcome, Boolean>> continuation) {
        StravaHistoryImporter$importActivity$1 stravaHistoryImporter$importActivity$1;
        StravaActivityJson stravaActivityJson2;
        Object runByStravaImportId;
        List<RunEntity> list2;
        RecoveryModel.RecoveryDemographics recoveryDemographics2;
        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function22;
        RunRepository runRepository2;
        StravaRecoveryEstimator.StravaRecoveryPlan stravaRecoveryPlan;
        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function23;
        StravaActivityJson stravaActivityJson3;
        long longValue;
        long endMs;
        double distanceM;
        long durationMs;
        String str;
        Object obj;
        StravaActivityJson stravaActivityJson4;
        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function24;
        long j;
        RunRepository runRepository3;
        Object runExists;
        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function25;
        StravaActivityJson stravaActivityJson5;
        RecoveryEventEntity recoveryEventEntity;
        StravaHistoryImporter$importActivity$1 stravaHistoryImporter$importActivity$12;
        RunRepository runRepository4 = runRepository;
        if (continuation instanceof StravaHistoryImporter$importActivity$1) {
            stravaHistoryImporter$importActivity$1 = (StravaHistoryImporter$importActivity$1) continuation;
            if ((stravaHistoryImporter$importActivity$1.label & Integer.MIN_VALUE) != 0) {
                stravaHistoryImporter$importActivity$1.label -= Integer.MIN_VALUE;
                Object obj2 = stravaHistoryImporter$importActivity$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (stravaHistoryImporter$importActivity$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        if (StravaRecoveryDedup.INSTANCE.isLinkedUpload(stravaActivityJson.getId(), set)) {
                            return TuplesKt.to(Outcome.SKIPPED_LINKED, Boxing.boxBoolean(false));
                        }
                        long id = stravaActivityJson.getId();
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository4;
                        stravaActivityJson2 = stravaActivityJson;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson2;
                        stravaHistoryImporter$importActivity$1.L$2 = list;
                        stravaHistoryImporter$importActivity$1.L$3 = recoveryDemographics;
                        stravaHistoryImporter$importActivity$1.L$4 = function2;
                        stravaHistoryImporter$importActivity$1.label = 1;
                        runByStravaImportId = runRepository4.runByStravaImportId(id, stravaHistoryImporter$importActivity$1);
                        if (runByStravaImportId == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        recoveryDemographics2 = recoveryDemographics;
                        function22 = function2;
                        if (runByStravaImportId == null) {
                            return TuplesKt.to(Outcome.SKIPPED_EXISTS, Boxing.boxBoolean(false));
                        }
                        StravaRecoveryEstimator.StravaRecoveryPlan planFromActivity = StravaRecoveryEstimator.INSTANCE.planFromActivity(stravaActivityJson2, recoveryDemographics2);
                        if (planFromActivity == null) {
                            return TuplesKt.to(Outcome.REJECTED, Boxing.boxBoolean(false));
                        }
                        if (StravaRecoveryDedup.matchesLocalRun$default(StravaRecoveryDedup.INSTANCE, planFromActivity.getStartMs(), planFromActivity.getEndMs(), planFromActivity.getDistanceM(), planFromActivity.isBike(), list2, null, 32, null)) {
                            return TuplesKt.to(Outcome.SKIPPED_DUPLICATE, Boxing.boxBoolean(planFromActivity.isBike()));
                        }
                        String str2 = planFromActivity.isBike() ? ActivityTypes.BIKE : "RUN";
                        long startMs = planFromActivity.getStartMs();
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository4;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson2;
                        stravaHistoryImporter$importActivity$1.L$2 = function22;
                        stravaHistoryImporter$importActivity$1.L$3 = planFromActivity;
                        stravaHistoryImporter$importActivity$1.L$4 = null;
                        stravaHistoryImporter$importActivity$1.label = 2;
                        Object startRun$default = RunRepository.startRun$default(runRepository4, startMs, str2, null, null, stravaHistoryImporter$importActivity$1, 12, null);
                        if (startRun$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        runRepository2 = runRepository4;
                        stravaRecoveryPlan = planFromActivity;
                        function23 = function22;
                        stravaActivityJson3 = stravaActivityJson2;
                        obj2 = startRun$default;
                        longValue = ((Number) obj2).longValue();
                        endMs = stravaRecoveryPlan.getEndMs();
                        distanceM = stravaRecoveryPlan.getDistanceM();
                        durationMs = stravaRecoveryPlan.getDurationMs();
                        str = "Strava · " + stravaRecoveryPlan.getTitle();
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository2;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson3;
                        stravaHistoryImporter$importActivity$1.L$2 = function23;
                        stravaHistoryImporter$importActivity$1.L$3 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$1.J$0 = longValue;
                        stravaHistoryImporter$importActivity$1.label = 3;
                        RunRepository runRepository5 = runRepository2;
                        StravaActivityJson stravaActivityJson6 = stravaActivityJson3;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function26 = function23;
                        obj = coroutine_suspended;
                        if (runRepository2.finishRun(longValue, endMs, distanceM, durationMs, 0L, "STRAVA", str, true, stravaHistoryImporter$importActivity$1) != obj) {
                            return obj;
                        }
                        stravaActivityJson4 = stravaActivityJson6;
                        function24 = function26;
                        j = longValue;
                        runRepository3 = runRepository5;
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository3;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson4;
                        stravaHistoryImporter$importActivity$1.L$2 = function24;
                        stravaHistoryImporter$importActivity$1.L$3 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$1.J$0 = j;
                        stravaHistoryImporter$importActivity$1.label = 4;
                        runExists = runRepository3.runExists(j, stravaHistoryImporter$importActivity$1);
                        if (runExists != obj) {
                            return obj;
                        }
                        StravaActivityJson stravaActivityJson7 = stravaActivityJson4;
                        function25 = function24;
                        obj2 = runExists;
                        stravaActivityJson5 = stravaActivityJson7;
                        if (((Boolean) obj2).booleanValue()) {
                            return TuplesKt.to(Outcome.REJECTED, Boxing.boxBoolean(stravaRecoveryPlan.isBike()));
                        }
                        long id2 = stravaActivityJson5.getId();
                        stravaHistoryImporter$importActivity$1.L$0 = function25;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$1.L$2 = null;
                        stravaHistoryImporter$importActivity$1.L$3 = null;
                        stravaHistoryImporter$importActivity$1.label = 5;
                        if (runRepository3.setStravaImportId(j, id2, stravaHistoryImporter$importActivity$1) == obj) {
                            return obj;
                        }
                        stravaHistoryImporter$importActivity$12 = stravaHistoryImporter$importActivity$1;
                        recoveryEventEntity = new RecoveryEventEntity(0L, stravaRecoveryPlan.getRecoveryKind(), stravaRecoveryPlan.getStravaActivityId(), stravaRecoveryPlan.getEndMs(), stravaRecoveryPlan.getEndMs() + ((long) (stravaRecoveryPlan.getEstimate().getHours() * 3600000.0d)), stravaRecoveryPlan.getEstimate().getLoadScore(), stravaRecoveryPlan.getEstimate().getNotes(), 1, null);
                        stravaHistoryImporter$importActivity$12.L$0 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$12.L$1 = null;
                        stravaHistoryImporter$importActivity$12.label = 6;
                        if (function25.invoke(recoveryEventEntity, stravaHistoryImporter$importActivity$12) == obj) {
                            return obj;
                        }
                        return TuplesKt.to(Outcome.IMPORTED, Boxing.boxBoolean(stravaRecoveryPlan.isBike()));
                    case 1:
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function27 = (Function2) stravaHistoryImporter$importActivity$1.L$4;
                        recoveryDemographics2 = (RecoveryModel.RecoveryDemographics) stravaHistoryImporter$importActivity$1.L$3;
                        List<RunEntity> list3 = (List) stravaHistoryImporter$importActivity$1.L$2;
                        StravaActivityJson stravaActivityJson8 = (StravaActivityJson) stravaHistoryImporter$importActivity$1.L$1;
                        RunRepository runRepository6 = (RunRepository) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        function22 = function27;
                        list2 = list3;
                        runRepository4 = runRepository6;
                        runByStravaImportId = obj2;
                        stravaActivityJson2 = stravaActivityJson8;
                        if (runByStravaImportId == null) {
                        }
                        break;
                    case 2:
                        stravaRecoveryPlan = (StravaRecoveryEstimator.StravaRecoveryPlan) stravaHistoryImporter$importActivity$1.L$3;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function28 = (Function2) stravaHistoryImporter$importActivity$1.L$2;
                        StravaActivityJson stravaActivityJson9 = (StravaActivityJson) stravaHistoryImporter$importActivity$1.L$1;
                        RunRepository runRepository7 = (RunRepository) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        function23 = function28;
                        stravaActivityJson3 = stravaActivityJson9;
                        runRepository2 = runRepository7;
                        longValue = ((Number) obj2).longValue();
                        endMs = stravaRecoveryPlan.getEndMs();
                        distanceM = stravaRecoveryPlan.getDistanceM();
                        durationMs = stravaRecoveryPlan.getDurationMs();
                        str = "Strava · " + stravaRecoveryPlan.getTitle();
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository2;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson3;
                        stravaHistoryImporter$importActivity$1.L$2 = function23;
                        stravaHistoryImporter$importActivity$1.L$3 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$1.J$0 = longValue;
                        stravaHistoryImporter$importActivity$1.label = 3;
                        RunRepository runRepository52 = runRepository2;
                        StravaActivityJson stravaActivityJson62 = stravaActivityJson3;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function262 = function23;
                        obj = coroutine_suspended;
                        if (runRepository2.finishRun(longValue, endMs, distanceM, durationMs, 0L, "STRAVA", str, true, stravaHistoryImporter$importActivity$1) != obj) {
                        }
                        break;
                    case 3:
                        long j2 = stravaHistoryImporter$importActivity$1.J$0;
                        stravaRecoveryPlan = (StravaRecoveryEstimator.StravaRecoveryPlan) stravaHistoryImporter$importActivity$1.L$3;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function29 = (Function2) stravaHistoryImporter$importActivity$1.L$2;
                        stravaActivityJson4 = (StravaActivityJson) stravaHistoryImporter$importActivity$1.L$1;
                        runRepository3 = (RunRepository) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        function24 = function29;
                        j = j2;
                        obj = coroutine_suspended;
                        stravaHistoryImporter$importActivity$1.L$0 = runRepository3;
                        stravaHistoryImporter$importActivity$1.L$1 = stravaActivityJson4;
                        stravaHistoryImporter$importActivity$1.L$2 = function24;
                        stravaHistoryImporter$importActivity$1.L$3 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$1.J$0 = j;
                        stravaHistoryImporter$importActivity$1.label = 4;
                        runExists = runRepository3.runExists(j, stravaHistoryImporter$importActivity$1);
                        if (runExists != obj) {
                        }
                        break;
                    case 4:
                        long j3 = stravaHistoryImporter$importActivity$1.J$0;
                        stravaRecoveryPlan = (StravaRecoveryEstimator.StravaRecoveryPlan) stravaHistoryImporter$importActivity$1.L$3;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function210 = (Function2) stravaHistoryImporter$importActivity$1.L$2;
                        StravaActivityJson stravaActivityJson10 = (StravaActivityJson) stravaHistoryImporter$importActivity$1.L$1;
                        runRepository3 = (RunRepository) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        stravaActivityJson5 = stravaActivityJson10;
                        function25 = function210;
                        j = j3;
                        obj = coroutine_suspended;
                        if (((Boolean) obj2).booleanValue()) {
                        }
                        break;
                    case 5:
                        stravaRecoveryPlan = (StravaRecoveryEstimator.StravaRecoveryPlan) stravaHistoryImporter$importActivity$1.L$1;
                        Function2<? super RecoveryEventEntity, ? super Continuation<? super Unit>, ? extends Object> function211 = (Function2) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        function25 = function211;
                        obj = coroutine_suspended;
                        stravaHistoryImporter$importActivity$12 = stravaHistoryImporter$importActivity$1;
                        recoveryEventEntity = new RecoveryEventEntity(0L, stravaRecoveryPlan.getRecoveryKind(), stravaRecoveryPlan.getStravaActivityId(), stravaRecoveryPlan.getEndMs(), stravaRecoveryPlan.getEndMs() + ((long) (stravaRecoveryPlan.getEstimate().getHours() * 3600000.0d)), stravaRecoveryPlan.getEstimate().getLoadScore(), stravaRecoveryPlan.getEstimate().getNotes(), 1, null);
                        stravaHistoryImporter$importActivity$12.L$0 = stravaRecoveryPlan;
                        stravaHistoryImporter$importActivity$12.L$1 = null;
                        stravaHistoryImporter$importActivity$12.label = 6;
                        if (function25.invoke(recoveryEventEntity, stravaHistoryImporter$importActivity$12) == obj) {
                        }
                        return TuplesKt.to(Outcome.IMPORTED, Boxing.boxBoolean(stravaRecoveryPlan.isBike()));
                    case 6:
                        stravaRecoveryPlan = (StravaRecoveryEstimator.StravaRecoveryPlan) stravaHistoryImporter$importActivity$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        return TuplesKt.to(Outcome.IMPORTED, Boxing.boxBoolean(stravaRecoveryPlan.isBike()));
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        stravaHistoryImporter$importActivity$1 = new StravaHistoryImporter$importActivity$1(this, continuation);
        Object obj22 = stravaHistoryImporter$importActivity$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (stravaHistoryImporter$importActivity$1.label) {
        }
    }
}
