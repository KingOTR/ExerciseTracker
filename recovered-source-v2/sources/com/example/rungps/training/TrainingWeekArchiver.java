package com.example.rungps.training;

import android.content.Context;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.data.ArchivedTrainingWeekEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.ui.week.CoachBriefLoader;
import com.google.logging.type.LogSeverity;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TrainingWeekArchiver.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJB\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0002J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/training/TrainingWeekArchiver;", "", "<init>", "()V", "MAX_WEEKS_STORED", "", "MAX_BACKFILL_WEEKS", "ensureArchivesUpToDate", "", "context", "Landroid/content/Context;", "zone", "Ljava/time/ZoneId;", "(Landroid/content/Context;Ljava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "weekHasActivity", "", "weekStart", "Ljava/time/LocalDate;", "runs", "", "Lcom/example/rungps/data/RunEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "sleepDb", "Lcom/example/rungps/data/SleepEntryEntity;", "sleepWindowsForPlanner", "Lcom/example/rungps/health/HealthConnectManager$SleepWindow;", "entries", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainingWeekArchiver {
    public static final int $stable = 0;
    public static final TrainingWeekArchiver INSTANCE = new TrainingWeekArchiver();
    private static final int MAX_BACKFILL_WEEKS = 26;
    private static final int MAX_WEEKS_STORED = 52;

    private TrainingWeekArchiver() {
    }

    public static /* synthetic */ Object ensureArchivesUpToDate$default(TrainingWeekArchiver trainingWeekArchiver, Context context, ZoneId zoneId, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return trainingWeekArchiver.ensureArchivesUpToDate(context, zoneId, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:(1:34)|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|(1:65)(8:66|67|68|69|(1:71)|72|30|(1:32)(2:33|15))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|(1:65)(8:66|67|68|69|(1:71)|72|30|(1:32)(2:33|15))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x04e7, code lost:
    
        r24 = r12;
        r19 = r15;
        r5 = r16;
        r15 = r17;
        r20 = r22;
        r2 = r23;
        r17 = r43;
        r22 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04e3, code lost:
    
        r21 = r42;
        r41 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x04fb, code lost:
    
        r41 = r2;
        r24 = r12;
        r19 = r15;
        r5 = r16;
        r15 = r17;
        r20 = r22;
        r2 = r23;
        r17 = r43;
        r23 = r11;
        r22 = r21;
        r21 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x047a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0489, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x052b, code lost:
    
        r16 = r41;
        r11 = r2;
        r6 = r13;
        r10 = r14;
        r7 = r15;
        r12 = r17;
        r8 = r18;
        r9 = r19;
        r13 = r20;
        r14 = r21;
        r15 = r22;
        r18 = r23;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x047c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x047d, code lost:
    
        r17 = r43;
        r20 = r22;
        r21 = r42;
        r22 = r21;
        r23 = r11;
        r24 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x048d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x048e, code lost:
    
        r20 = r22;
        r21 = r42;
        r22 = r21;
        r23 = r11;
        r24 = r12;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04a8, code lost:
    
        r5 = r16;
        r15 = r17;
        r17 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x049b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x049c, code lost:
    
        r20 = r22;
        r21 = r42;
        r22 = r21;
        r23 = r11;
        r24 = r12;
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04b1, code lost:
    
        r41 = r2;
        r20 = r22;
        r21 = r42;
        r22 = r21;
        r24 = r12;
        r19 = r15;
        r5 = r16;
        r15 = r17;
        r2 = r23;
        r17 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04f7, code lost:
    
        r23 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04c7, code lost:
    
        r41 = r2;
        r20 = r22;
        r21 = r42;
        r22 = r21;
        r24 = r12;
        r19 = r15;
        r5 = r16;
        r15 = r17;
        r2 = r23;
        r17 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04dd, code lost:
    
        r41 = r2;
        r21 = r42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0296 A[LOOP:3: B:156:0x0290->B:158:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0247 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0604 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0605 -> B:15:0x0614). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureArchivesUpToDate(Context context, ZoneId zoneId, Continuation<? super Unit> continuation) {
        TrainingWeekArchiver$ensureArchivesUpToDate$1 trainingWeekArchiver$ensureArchivesUpToDate$1;
        LocalDate now;
        Object first;
        Repository repository;
        LocalDate localDate;
        ZoneId zoneId2;
        Object first2;
        TrainingWeekArchiver trainingWeekArchiver;
        List<RunEntity> list;
        ZoneId zoneId3;
        Repository repository2;
        Context context2;
        LocalDate localDate2;
        Object obj;
        ?? first3;
        Context context3;
        TrainingWeekArchiver trainingWeekArchiver2;
        LocalDate localDate3;
        Repository repository3;
        List<RunEntity> list2;
        List<GymSessionEntity> list3;
        List<SleepEntryEntity> list4;
        ZoneId zoneId4;
        LocalDate localDate4;
        List<SleepEntryEntity> list5;
        ArrayList arrayList;
        Iterator it;
        Object obj2;
        Object obj3;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        List<SleepEntryEntity> list6;
        int i;
        List<HealthConnectManager.SleepWindow> sleepWindowsForPlanner;
        List<GymSessionEntity> list7;
        List<GymSessionEntity> list8;
        Iterator it3;
        int i2;
        TrainingWeekArchiver trainingWeekArchiver3;
        LocalDate localDate5;
        int i3;
        Object obj4;
        Context context4;
        LinkedHashMap linkedHashMap2;
        Repository repository4;
        List<HealthConnectManager.SleepWindow> list9;
        ZoneId zoneId5;
        List<GymSessionEntity> list10;
        LocalDate localDate6;
        List<SleepEntryEntity> list11;
        LocalDate localDate7;
        List<GymSessionEntity> list12;
        List<RunEntity> list13;
        LocalDate localDate8;
        List<HealthConnectManager.SleepWindow> list14;
        ?? r8;
        List<GymSessionEntity> list15;
        List<SleepEntryEntity> list16;
        List<GymSessionEntity> list17;
        List<RunEntity> list18;
        LocalDate localDate9;
        LocalDate localDate10;
        Repository repository5;
        ZoneId zoneId6;
        Context context5;
        TrainingWeekArchiver trainingWeekArchiver4;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView;
        Object obj5;
        Object m7905constructorimpl;
        DailyTrainingCoach.DailyCoachBrief dailyCoachBrief;
        LocalDate localDate11;
        LocalDate localDate12;
        TrainingWeekArchiver trainingWeekArchiver5;
        List<HealthConnectManager.SleepWindow> list19;
        List<SleepEntryEntity> list20;
        List<GymSessionEntity> list21;
        List<RunEntity> list22;
        Context context6;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView2;
        int i4;
        ZoneId zoneId7;
        Repository repository6;
        Object obj6;
        Object insertArchivedWeek;
        Object obj7;
        LocalDate localDate13;
        LocalDate localDate14;
        List<HealthConnectManager.SleepWindow> list23;
        int i5;
        ZoneId zoneId8;
        Repository repository7;
        LinkedHashMap linkedHashMap3;
        List<GymSessionEntity> list24;
        List<SleepEntryEntity> list25;
        Object obj8;
        Object obj9;
        List<HealthConnectManager.SleepWindow> list26;
        int i6;
        ZoneId zoneId9;
        List<GymSessionEntity> list27;
        List<HealthConnectManager.SleepWindow> list28;
        LocalDate localDate15;
        List<RunEntity> list29;
        Repository repository8;
        LocalDate localDate16;
        TrainingWeekArchiver trainingWeekArchiver6;
        ZoneId zoneId10;
        List<GymSessionEntity> list30;
        TrainingWeekArchiver trainingWeekArchiver7 = this;
        Context context7 = context;
        if (continuation instanceof TrainingWeekArchiver$ensureArchivesUpToDate$1) {
            trainingWeekArchiver$ensureArchivesUpToDate$1 = (TrainingWeekArchiver$ensureArchivesUpToDate$1) continuation;
            if ((trainingWeekArchiver$ensureArchivesUpToDate$1.label & Integer.MIN_VALUE) != 0) {
                trainingWeekArchiver$ensureArchivesUpToDate$1.label -= Integer.MIN_VALUE;
                ?? r2 = trainingWeekArchiver$ensureArchivesUpToDate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (trainingWeekArchiver$ensureArchivesUpToDate$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(r2);
                        Repository repository9 = Repository.INSTANCE.get(context7);
                        now = LocalDate.now(zoneId);
                        LocalDate with = now.with((TemporalAdjuster) DayOfWeek.MONDAY);
                        Flow<List<RunEntity>> runsFlow = repository9.runsFlow();
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository9;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = now;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = with;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 1;
                        first = FlowKt.first(runsFlow, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        if (first == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        repository = repository9;
                        localDate = with;
                        zoneId2 = zoneId;
                        List<RunEntity> list31 = (List) first;
                        Flow<List<GymSessionEntity>> gymSessionsFlow = repository.gymSessionsFlow();
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = now;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list31;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 2;
                        first2 = FlowKt.first(gymSessionsFlow, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        if (first2 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        trainingWeekArchiver = trainingWeekArchiver7;
                        list = list31;
                        zoneId3 = zoneId2;
                        repository2 = repository;
                        context2 = context7;
                        localDate2 = localDate;
                        obj = first2;
                        List<GymSessionEntity> list32 = (List) obj;
                        Flow<List<SleepEntryEntity>> sleepRecentFlow = repository2.sleepRecentFlow(LogSeverity.WARNING_VALUE);
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = now;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list32;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 3;
                        first3 = FlowKt.first(sleepRecentFlow, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        if (first3 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        context3 = context2;
                        trainingWeekArchiver2 = trainingWeekArchiver;
                        localDate3 = now;
                        repository3 = repository2;
                        list2 = list;
                        list3 = list32;
                        list4 = first3;
                        zoneId4 = zoneId3;
                        localDate4 = localDate2;
                        list5 = list4;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj10 : list3) {
                            if (((GymSessionEntity) obj10).getEndedAtMs() != null) {
                                arrayList2.add(obj10);
                            }
                        }
                        arrayList = arrayList2;
                        ArrayList arrayList3 = arrayList;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
                        }
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId4;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate4;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list5;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = arrayList;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 4;
                        obj2 = repository3.setsForSessionsGrouped(arrayList4, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        obj3 = obj2;
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Map map = (Map) obj3;
                        linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                        it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            double d = 0.0d;
                            for (GymSetEntity gymSetEntity : (List) entry.getValue()) {
                                double weightKg = gymSetEntity.getWeightKg();
                                Integer reps = gymSetEntity.getReps();
                                if (reps != null) {
                                    list8 = arrayList;
                                    it3 = it2;
                                    i2 = reps.intValue();
                                } else {
                                    list8 = arrayList;
                                    it3 = it2;
                                    i2 = 1;
                                }
                                d += weightKg * RangesKt.coerceAtLeast(i2, 1);
                                arrayList = list8;
                                it2 = it3;
                                trainingWeekArchiver$ensureArchivesUpToDate$1 = trainingWeekArchiver$ensureArchivesUpToDate$1;
                            }
                            linkedHashMap.put(key, Boxing.boxDouble(d));
                            arrayList = arrayList;
                        }
                        list6 = list5;
                        i = 1;
                        sleepWindowsForPlanner = trainingWeekArchiver2.sleepWindowsForPlanner(list5, zoneId4);
                        list7 = arrayList;
                        if (i >= 27) {
                            List<GymSessionEntity> list33 = list7;
                            List<HealthConnectManager.SleepWindow> list34 = sleepWindowsForPlanner;
                            LocalDate minusWeeks = localDate4.minusWeeks(i);
                            i3 = i;
                            long epochDay = minusWeeks.toEpochDay();
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver2;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context3;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId4;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository3;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate3;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate4;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list2;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list3;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list6;
                            List<SleepEntryEntity> list35 = list6;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list33;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list34;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = minusWeeks;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i3;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.label = 5;
                            Object archivedWeekExists = repository3.archivedWeekExists(epochDay, trainingWeekArchiver$ensureArchivesUpToDate$1);
                            if (archivedWeekExists == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list9 = list34;
                            obj4 = coroutine_suspended;
                            context4 = context3;
                            linkedHashMap2 = linkedHashMap;
                            list11 = list35;
                            localDate5 = minusWeeks;
                            obj8 = archivedWeekExists;
                            TrainingWeekArchiver trainingWeekArchiver8 = trainingWeekArchiver2;
                            list10 = list33;
                            trainingWeekArchiver3 = trainingWeekArchiver8;
                            ZoneId zoneId11 = zoneId4;
                            list12 = list3;
                            zoneId5 = zoneId11;
                            Repository repository10 = repository3;
                            list13 = list2;
                            repository4 = repository10;
                            LocalDate localDate17 = localDate3;
                            localDate7 = localDate4;
                            localDate6 = localDate17;
                            if (((Boolean) obj8).booleanValue()) {
                                Intrinsics.checkNotNull(localDate5);
                                ZoneId zoneId12 = zoneId5;
                                Repository repository11 = repository4;
                                LocalDate localDate18 = localDate6;
                                LocalDate localDate19 = localDate7;
                                List<RunEntity> list36 = list13;
                                List<GymSessionEntity> list37 = list12;
                                if (trainingWeekArchiver3.weekHasActivity(localDate5, zoneId12, list13, list10, list11)) {
                                    TrainingWeekPlanner trainingWeekPlanner = TrainingWeekPlanner.INSTANCE;
                                    Intrinsics.checkNotNull(localDate18);
                                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                    List<HealthConnectManager.SleepWindow> list38 = list9;
                                    List<HealthConnectManager.SleepWindow> list39 = list9;
                                    list20 = list11;
                                    LinkedHashMap linkedHashMap5 = linkedHashMap2;
                                    List<GymSessionEntity> list40 = list10;
                                    trainingWeekView2 = trainingWeekPlanner.build(list36, list10, linkedHashMap4, list38, zoneId12, localDate18, localDate5);
                                    if (i3 == 1) {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            trainingWeekView = trainingWeekView2;
                                            list27 = list40;
                                            obj5 = obj4;
                                            list28 = list39;
                                            localDate15 = localDate19;
                                            list29 = list36;
                                            repository8 = repository11;
                                            localDate16 = localDate18;
                                            trainingWeekArchiver6 = trainingWeekArchiver3;
                                            zoneId10 = zoneId12;
                                            list30 = list37;
                                            break;
                                        }
                                        Result.Companion companion = Result.INSTANCE;
                                        TrainingWeekArchiver trainingWeekArchiver9 = trainingWeekArchiver3;
                                        TrainingWeekArchiver trainingWeekArchiver10 = trainingWeekArchiver9;
                                        CoachBriefLoader coachBriefLoader = CoachBriefLoader.INSTANCE;
                                        List<RecoveryEventEntity> emptyList = CollectionsKt.emptyList();
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver9;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context4;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId12;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository11;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate18;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate19;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list36;
                                        zoneId10 = zoneId12;
                                        list30 = list37;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list30;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list40;
                                        list27 = list40;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap5;
                                        linkedHashMap5 = linkedHashMap5;
                                        list28 = list39;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list28;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = localDate5;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = trainingWeekView2;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i3;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 6;
                                        list29 = list36;
                                        localDate15 = localDate19;
                                        localDate16 = localDate18;
                                        repository8 = repository11;
                                        trainingWeekArchiver6 = trainingWeekArchiver9;
                                        trainingWeekView = trainingWeekView2;
                                        Object load = coachBriefLoader.load(context4, list29, list30, emptyList, list20, zoneId10, trainingWeekArchiver$ensureArchivesUpToDate$1);
                                        obj5 = obj4;
                                        if (load == obj5) {
                                            return obj5;
                                        }
                                        zoneId6 = zoneId10;
                                        list17 = list30;
                                        localDate8 = localDate5;
                                        list16 = list20;
                                        list14 = list28;
                                        list18 = list29;
                                        r8 = linkedHashMap5;
                                        list15 = list27;
                                        localDate9 = localDate15;
                                        localDate10 = localDate16;
                                        repository5 = repository8;
                                        trainingWeekArchiver4 = trainingWeekArchiver6;
                                        obj6 = load;
                                        context5 = context4;
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Result.Companion companion2 = Result.INSTANCE;
                                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                            }
                                            dailyCoachBrief = (DailyTrainingCoach.DailyCoachBrief) m7905constructorimpl;
                                            localDate11 = localDate8;
                                            localDate12 = localDate10;
                                            trainingWeekArchiver5 = trainingWeekArchiver4;
                                            list19 = list14;
                                            list20 = list16;
                                            list21 = list17;
                                            list22 = list18;
                                            context6 = context5;
                                            trainingWeekView2 = trainingWeekView;
                                            i4 = i3;
                                            zoneId7 = zoneId6;
                                            obj4 = obj5;
                                            repository6 = repository5;
                                            LinkedHashMap linkedHashMap6 = r8;
                                            List<GymSessionEntity> list41 = list15;
                                            ArchivedTrainingWeekEntity archivedTrainingWeekEntity = new ArchivedTrainingWeekEntity(0L, localDate11.toEpochDay(), localDate11.plusDays(6L).toEpochDay(), System.currentTimeMillis(), trainingWeekView2.getTotalRunKm(), trainingWeekView2.getTotalGymKg(), trainingWeekView2.getSleepNights(), TrainingWeekSnapshotCodec.INSTANCE.encode(TrainingWeekSnapshotCodec.INSTANCE.fromWeek(trainingWeekView2, dailyCoachBrief)), 1, null);
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver5;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context6;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId7;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository6;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate12;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate9;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list22;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list21;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list41;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap6;
                                            List<HealthConnectManager.SleepWindow> list42 = list19;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list42;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = null;
                                            int i7 = i4;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i7;
                                            trainingWeekArchiver$ensureArchivesUpToDate$1.label = 7;
                                            insertArchivedWeek = repository6.insertArchivedWeek(archivedTrainingWeekEntity, trainingWeekArchiver$ensureArchivesUpToDate$1);
                                            obj7 = obj4;
                                            if (insertArchivedWeek == obj7) {
                                            }
                                        }
                                        m7905constructorimpl = Result.m7905constructorimpl(((CoachBriefLoader.Loaded) obj6).getBrief());
                                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                            m7905constructorimpl = null;
                                        }
                                        dailyCoachBrief = (DailyTrainingCoach.DailyCoachBrief) m7905constructorimpl;
                                        localDate11 = localDate8;
                                        localDate12 = localDate10;
                                        trainingWeekArchiver5 = trainingWeekArchiver4;
                                        list19 = list14;
                                        list20 = list16;
                                        list21 = list17;
                                        list22 = list18;
                                        context6 = context5;
                                        trainingWeekView2 = trainingWeekView;
                                        i4 = i3;
                                        zoneId7 = zoneId6;
                                        obj4 = obj5;
                                        repository6 = repository5;
                                        LinkedHashMap linkedHashMap62 = r8;
                                        List<GymSessionEntity> list412 = list15;
                                        ArchivedTrainingWeekEntity archivedTrainingWeekEntity2 = new ArchivedTrainingWeekEntity(0L, localDate11.toEpochDay(), localDate11.plusDays(6L).toEpochDay(), System.currentTimeMillis(), trainingWeekView2.getTotalRunKm(), trainingWeekView2.getTotalGymKg(), trainingWeekView2.getSleepNights(), TrainingWeekSnapshotCodec.INSTANCE.encode(TrainingWeekSnapshotCodec.INSTANCE.fromWeek(trainingWeekView2, dailyCoachBrief)), 1, null);
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver5;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context6;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId7;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository6;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate12;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate9;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list22;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list21;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list412;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap62;
                                        List<HealthConnectManager.SleepWindow> list422 = list19;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list422;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = null;
                                        int i72 = i4;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i72;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 7;
                                        insertArchivedWeek = repository6.insertArchivedWeek(archivedTrainingWeekEntity2, trainingWeekArchiver$ensureArchivesUpToDate$1);
                                        obj7 = obj4;
                                        if (insertArchivedWeek == obj7) {
                                            return obj7;
                                        }
                                        localDate13 = localDate9;
                                        localDate14 = localDate12;
                                        ZoneId zoneId13 = zoneId7;
                                        list23 = list422;
                                        i5 = i72;
                                        zoneId8 = zoneId13;
                                        List<SleepEntryEntity> list43 = list20;
                                        repository7 = repository6;
                                        linkedHashMap3 = linkedHashMap62;
                                        list24 = list412;
                                        list25 = list43;
                                        zoneId9 = zoneId8;
                                        list6 = list25;
                                        repository3 = repository7;
                                        i6 = 1;
                                        List<HealthConnectManager.SleepWindow> list44 = list23;
                                        i3 = i5;
                                        list7 = list24;
                                        localDate3 = localDate14;
                                        linkedHashMap = linkedHashMap3;
                                        obj9 = obj7;
                                        list26 = list44;
                                        LocalDate localDate20 = localDate13;
                                        trainingWeekArchiver2 = trainingWeekArchiver5;
                                        list2 = list22;
                                        context3 = context6;
                                        localDate4 = localDate20;
                                    } else {
                                        list21 = list37;
                                        context6 = context4;
                                        localDate11 = localDate5;
                                        list22 = list36;
                                        r8 = linkedHashMap5;
                                        list15 = list40;
                                        localDate9 = localDate19;
                                        localDate12 = localDate18;
                                        repository6 = repository11;
                                        trainingWeekArchiver5 = trainingWeekArchiver3;
                                        dailyCoachBrief = null;
                                        i4 = i3;
                                        list19 = list39;
                                        zoneId7 = zoneId12;
                                        LinkedHashMap linkedHashMap622 = r8;
                                        List<GymSessionEntity> list4122 = list15;
                                        ArchivedTrainingWeekEntity archivedTrainingWeekEntity22 = new ArchivedTrainingWeekEntity(0L, localDate11.toEpochDay(), localDate11.plusDays(6L).toEpochDay(), System.currentTimeMillis(), trainingWeekView2.getTotalRunKm(), trainingWeekView2.getTotalGymKg(), trainingWeekView2.getSleepNights(), TrainingWeekSnapshotCodec.INSTANCE.encode(TrainingWeekSnapshotCodec.INSTANCE.fromWeek(trainingWeekView2, dailyCoachBrief)), 1, null);
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver5;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context6;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId7;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository6;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate12;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate9;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list22;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list21;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list4122;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap622;
                                        List<HealthConnectManager.SleepWindow> list4222 = list19;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list4222;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = null;
                                        int i722 = i4;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i722;
                                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 7;
                                        insertArchivedWeek = repository6.insertArchivedWeek(archivedTrainingWeekEntity22, trainingWeekArchiver$ensureArchivesUpToDate$1);
                                        obj7 = obj4;
                                        if (insertArchivedWeek == obj7) {
                                        }
                                    }
                                } else {
                                    LinkedHashMap linkedHashMap7 = linkedHashMap2;
                                    obj9 = obj4;
                                    list26 = list9;
                                    List<SleepEntryEntity> list45 = list11;
                                    list21 = list37;
                                    context3 = context4;
                                    list6 = list45;
                                    list2 = list36;
                                    linkedHashMap = linkedHashMap7;
                                    list7 = list10;
                                    localDate4 = localDate19;
                                    localDate3 = localDate18;
                                    repository3 = repository11;
                                    trainingWeekArchiver2 = trainingWeekArchiver3;
                                    i6 = 1;
                                    zoneId9 = zoneId12;
                                }
                            } else {
                                TrainingWeekArchiver trainingWeekArchiver11 = trainingWeekArchiver3;
                                ZoneId zoneId14 = zoneId5;
                                Repository repository12 = repository4;
                                LocalDate localDate21 = localDate6;
                                LinkedHashMap linkedHashMap8 = linkedHashMap2;
                                obj9 = obj4;
                                list26 = list9;
                                List<SleepEntryEntity> list46 = list11;
                                list21 = list12;
                                context3 = context4;
                                list6 = list46;
                                list2 = list13;
                                linkedHashMap = linkedHashMap8;
                                list7 = list10;
                                localDate4 = localDate7;
                                localDate3 = localDate21;
                                repository3 = repository12;
                                trainingWeekArchiver2 = trainingWeekArchiver11;
                                i6 = 1;
                                zoneId9 = zoneId14;
                            }
                            i = i3 + i6;
                            sleepWindowsForPlanner = list26;
                            List<GymSessionEntity> list47 = list21;
                            zoneId4 = zoneId9;
                            coroutine_suspended = obj9;
                            list3 = list47;
                            if (i >= 27) {
                                Object obj11 = coroutine_suspended;
                                long epochDay2 = localDate4.minusWeeks(52L).toEpochDay();
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                                trainingWeekArchiver$ensureArchivesUpToDate$1.label = 8;
                                if (repository3.pruneArchivedWeeksBefore(epochDay2, trainingWeekArchiver$ensureArchivesUpToDate$1) == obj11) {
                                    return obj11;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    case 1:
                        LocalDate localDate22 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        LocalDate localDate23 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        Repository repository13 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        zoneId2 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        Context context8 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        TrainingWeekArchiver trainingWeekArchiver12 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        localDate = localDate22;
                        trainingWeekArchiver7 = trainingWeekArchiver12;
                        repository = repository13;
                        now = localDate23;
                        context7 = context8;
                        first = r2;
                        List<RunEntity> list312 = (List) first;
                        Flow<List<GymSessionEntity>> gymSessionsFlow2 = repository.gymSessionsFlow();
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = now;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list312;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 2;
                        first2 = FlowKt.first(gymSessionsFlow2, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        if (first2 != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        list = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        localDate2 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        now = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        repository2 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        zoneId3 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        context2 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        trainingWeekArchiver = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        obj = r2;
                        List<GymSessionEntity> list322 = (List) obj;
                        Flow<List<SleepEntryEntity>> sleepRecentFlow2 = repository2.sleepRecentFlow(LogSeverity.WARNING_VALUE);
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = now;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list322;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 3;
                        first3 = FlowKt.first(sleepRecentFlow2, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        if (first3 != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        List<GymSessionEntity> list48 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$7;
                        List<RunEntity> list49 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        LocalDate localDate24 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        LocalDate localDate25 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        Repository repository14 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        ZoneId zoneId15 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        Context context9 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        TrainingWeekArchiver trainingWeekArchiver13 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        context3 = context9;
                        trainingWeekArchiver2 = trainingWeekArchiver13;
                        repository3 = repository14;
                        zoneId4 = zoneId15;
                        localDate4 = localDate24;
                        localDate3 = localDate25;
                        list3 = list48;
                        list2 = list49;
                        list4 = r2;
                        list5 = list4;
                        ArrayList arrayList22 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        arrayList = arrayList22;
                        ArrayList arrayList32 = arrayList;
                        ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList32, 10));
                        it = arrayList32.iterator();
                        while (it.hasNext()) {
                        }
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId4;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate4;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list2;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list3;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list5;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = arrayList;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 4;
                        obj2 = repository3.setsForSessionsGrouped(arrayList42, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        obj3 = obj2;
                        if (obj2 == coroutine_suspended) {
                        }
                        Map map2 = (Map) obj3;
                        linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                        it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                        }
                        list6 = list5;
                        i = 1;
                        sleepWindowsForPlanner = trainingWeekArchiver2.sleepWindowsForPlanner(list5, zoneId4);
                        list7 = arrayList;
                        if (i >= 27) {
                        }
                        break;
                    case 4:
                        arrayList = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$9;
                        list5 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$8;
                        list3 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$7;
                        list2 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        localDate4 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        localDate3 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        repository3 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        zoneId4 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        context3 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        trainingWeekArchiver2 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        obj3 = r2;
                        Map map22 = (Map) obj3;
                        linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map22.size()));
                        it2 = map22.entrySet().iterator();
                        while (it2.hasNext()) {
                        }
                        list6 = list5;
                        i = 1;
                        sleepWindowsForPlanner = trainingWeekArchiver2.sleepWindowsForPlanner(list5, zoneId4);
                        list7 = arrayList;
                        if (i >= 27) {
                        }
                        break;
                    case 5:
                        int i8 = trainingWeekArchiver$ensureArchivesUpToDate$1.I$0;
                        LocalDate localDate26 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$12;
                        List<HealthConnectManager.SleepWindow> list50 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$11;
                        ?? r6 = (Map) trainingWeekArchiver$ensureArchivesUpToDate$1.L$10;
                        List<GymSessionEntity> list51 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$9;
                        List<SleepEntryEntity> list52 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$8;
                        List<GymSessionEntity> list53 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$7;
                        List<RunEntity> list54 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        LocalDate localDate27 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        LocalDate localDate28 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        Repository repository15 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        ZoneId zoneId16 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        Context context10 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        TrainingWeekArchiver trainingWeekArchiver14 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        trainingWeekArchiver3 = trainingWeekArchiver14;
                        localDate5 = localDate26;
                        i3 = i8;
                        obj4 = coroutine_suspended;
                        context4 = context10;
                        linkedHashMap2 = r6;
                        repository4 = repository15;
                        list9 = list50;
                        zoneId5 = zoneId16;
                        list10 = list51;
                        localDate6 = localDate28;
                        list11 = list52;
                        localDate7 = localDate27;
                        list12 = list53;
                        list13 = list54;
                        obj8 = r2;
                        if (((Boolean) obj8).booleanValue()) {
                        }
                        i = i3 + i6;
                        sleepWindowsForPlanner = list26;
                        List<GymSessionEntity> list472 = list21;
                        zoneId4 = zoneId9;
                        coroutine_suspended = obj9;
                        list3 = list472;
                        if (i >= 27) {
                        }
                        break;
                    case 6:
                        i3 = trainingWeekArchiver$ensureArchivesUpToDate$1.I$0;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView3 = (TrainingWeekPlanner.TrainingWeekView) trainingWeekArchiver$ensureArchivesUpToDate$1.L$13;
                        localDate8 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$12;
                        list14 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$11;
                        r8 = (Map) trainingWeekArchiver$ensureArchivesUpToDate$1.L$10;
                        list15 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$9;
                        list16 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$8;
                        list17 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$7;
                        list18 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        localDate9 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        localDate10 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        repository5 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        zoneId6 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        context5 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        trainingWeekArchiver4 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        try {
                            ResultKt.throwOnFailure(r2);
                            trainingWeekView = trainingWeekView3;
                            obj5 = coroutine_suspended;
                            obj6 = r2;
                        } catch (Throwable th3) {
                            th = th3;
                            trainingWeekView = trainingWeekView3;
                            obj5 = coroutine_suspended;
                            Result.Companion companion22 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            dailyCoachBrief = (DailyTrainingCoach.DailyCoachBrief) m7905constructorimpl;
                            localDate11 = localDate8;
                            localDate12 = localDate10;
                            trainingWeekArchiver5 = trainingWeekArchiver4;
                            list19 = list14;
                            list20 = list16;
                            list21 = list17;
                            list22 = list18;
                            context6 = context5;
                            trainingWeekView2 = trainingWeekView;
                            i4 = i3;
                            zoneId7 = zoneId6;
                            obj4 = obj5;
                            repository6 = repository5;
                            LinkedHashMap linkedHashMap6222 = r8;
                            List<GymSessionEntity> list41222 = list15;
                            ArchivedTrainingWeekEntity archivedTrainingWeekEntity222 = new ArchivedTrainingWeekEntity(0L, localDate11.toEpochDay(), localDate11.plusDays(6L).toEpochDay(), System.currentTimeMillis(), trainingWeekView2.getTotalRunKm(), trainingWeekView2.getTotalGymKg(), trainingWeekView2.getSleepNights(), TrainingWeekSnapshotCodec.INSTANCE.encode(TrainingWeekSnapshotCodec.INSTANCE.fromWeek(trainingWeekView2, dailyCoachBrief)), 1, null);
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver5;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context6;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId7;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository6;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate12;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate9;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list22;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list21;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list41222;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap6222;
                            List<HealthConnectManager.SleepWindow> list42222 = list19;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list42222;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = null;
                            int i7222 = i4;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i7222;
                            trainingWeekArchiver$ensureArchivesUpToDate$1.label = 7;
                            insertArchivedWeek = repository6.insertArchivedWeek(archivedTrainingWeekEntity222, trainingWeekArchiver$ensureArchivesUpToDate$1);
                            obj7 = obj4;
                            if (insertArchivedWeek == obj7) {
                            }
                        }
                        m7905constructorimpl = Result.m7905constructorimpl(((CoachBriefLoader.Loaded) obj6).getBrief());
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        dailyCoachBrief = (DailyTrainingCoach.DailyCoachBrief) m7905constructorimpl;
                        localDate11 = localDate8;
                        localDate12 = localDate10;
                        trainingWeekArchiver5 = trainingWeekArchiver4;
                        list19 = list14;
                        list20 = list16;
                        list21 = list17;
                        list22 = list18;
                        context6 = context5;
                        trainingWeekView2 = trainingWeekView;
                        i4 = i3;
                        zoneId7 = zoneId6;
                        obj4 = obj5;
                        repository6 = repository5;
                        LinkedHashMap linkedHashMap62222 = r8;
                        List<GymSessionEntity> list412222 = list15;
                        ArchivedTrainingWeekEntity archivedTrainingWeekEntity2222 = new ArchivedTrainingWeekEntity(0L, localDate11.toEpochDay(), localDate11.plusDays(6L).toEpochDay(), System.currentTimeMillis(), trainingWeekView2.getTotalRunKm(), trainingWeekView2.getTotalGymKg(), trainingWeekView2.getSleepNights(), TrainingWeekSnapshotCodec.INSTANCE.encode(TrainingWeekSnapshotCodec.INSTANCE.fromWeek(trainingWeekView2, dailyCoachBrief)), 1, null);
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$0 = trainingWeekArchiver5;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$1 = context6;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$2 = zoneId7;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$3 = repository6;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$4 = localDate12;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$5 = localDate9;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$6 = list22;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$7 = list21;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$8 = list20;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$9 = list412222;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$10 = linkedHashMap62222;
                        List<HealthConnectManager.SleepWindow> list422222 = list19;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$11 = list422222;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$12 = null;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.L$13 = null;
                        int i72222 = i4;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.I$0 = i72222;
                        trainingWeekArchiver$ensureArchivesUpToDate$1.label = 7;
                        insertArchivedWeek = repository6.insertArchivedWeek(archivedTrainingWeekEntity2222, trainingWeekArchiver$ensureArchivesUpToDate$1);
                        obj7 = obj4;
                        if (insertArchivedWeek == obj7) {
                        }
                        break;
                    case 7:
                        i5 = trainingWeekArchiver$ensureArchivesUpToDate$1.I$0;
                        list23 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$11;
                        ?? r5 = (Map) trainingWeekArchiver$ensureArchivesUpToDate$1.L$10;
                        list24 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$9;
                        list25 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$8;
                        list21 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$7;
                        list22 = (List) trainingWeekArchiver$ensureArchivesUpToDate$1.L$6;
                        localDate13 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$5;
                        localDate14 = (LocalDate) trainingWeekArchiver$ensureArchivesUpToDate$1.L$4;
                        repository7 = (Repository) trainingWeekArchiver$ensureArchivesUpToDate$1.L$3;
                        ZoneId zoneId17 = (ZoneId) trainingWeekArchiver$ensureArchivesUpToDate$1.L$2;
                        context6 = (Context) trainingWeekArchiver$ensureArchivesUpToDate$1.L$1;
                        trainingWeekArchiver5 = (TrainingWeekArchiver) trainingWeekArchiver$ensureArchivesUpToDate$1.L$0;
                        ResultKt.throwOnFailure(r2);
                        zoneId8 = zoneId17;
                        obj7 = coroutine_suspended;
                        linkedHashMap3 = r5;
                        zoneId9 = zoneId8;
                        list6 = list25;
                        repository3 = repository7;
                        i6 = 1;
                        List<HealthConnectManager.SleepWindow> list442 = list23;
                        i3 = i5;
                        list7 = list24;
                        localDate3 = localDate14;
                        linkedHashMap = linkedHashMap3;
                        obj9 = obj7;
                        list26 = list442;
                        LocalDate localDate202 = localDate13;
                        trainingWeekArchiver2 = trainingWeekArchiver5;
                        list2 = list22;
                        context3 = context6;
                        localDate4 = localDate202;
                        i = i3 + i6;
                        sleepWindowsForPlanner = list26;
                        List<GymSessionEntity> list4722 = list21;
                        zoneId4 = zoneId9;
                        coroutine_suspended = obj9;
                        list3 = list4722;
                        if (i >= 27) {
                        }
                        break;
                    case 8:
                        ResultKt.throwOnFailure(r2);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        trainingWeekArchiver$ensureArchivesUpToDate$1 = new TrainingWeekArchiver$ensureArchivesUpToDate$1(trainingWeekArchiver7, continuation);
        ?? r22 = trainingWeekArchiver$ensureArchivesUpToDate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (trainingWeekArchiver$ensureArchivesUpToDate$1.label) {
        }
    }

    private final boolean weekHasActivity(LocalDate weekStart, ZoneId zone, List<RunEntity> runs, List<GymSessionEntity> gymSessions, List<SleepEntryEntity> sleepDb) {
        long epochMilli = weekStart.atStartOfDay(zone).toInstant().toEpochMilli();
        long epochMilli2 = weekStart.plusDays(7L).atStartOfDay(zone).toInstant().toEpochMilli();
        List<RunEntity> list = runs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long startedAtMs = ((RunEntity) it.next()).getStartedAtMs();
                if (epochMilli <= startedAtMs && startedAtMs < epochMilli2) {
                    return true;
                }
            }
        }
        List<GymSessionEntity> list2 = gymSessions;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (GymSessionEntity gymSessionEntity : list2) {
                Long endedAtMs = gymSessionEntity.getEndedAtMs();
                long longValue = endedAtMs != null ? endedAtMs.longValue() : gymSessionEntity.getStartedAtMs();
                if (epochMilli <= longValue && longValue < epochMilli2) {
                    return true;
                }
            }
        }
        List<SleepEntryEntity> list3 = sleepDb;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        for (SleepEntryEntity sleepEntryEntity : list3) {
            long endTimeMs = sleepEntryEntity.getEndTimeMs();
            if (epochMilli <= endTimeMs && endTimeMs < epochMilli2 && sleepEntryEntity.getTotalSleepMin() > 0) {
                return true;
            }
        }
        return false;
    }

    private final List<HealthConnectManager.SleepWindow> sleepWindowsForPlanner(List<SleepEntryEntity> entries, ZoneId zone) {
        HealthConnectManager.SleepWindow sleepWindow;
        ArrayList arrayList = new ArrayList();
        for (SleepEntryEntity sleepEntryEntity : entries) {
            if (sleepEntryEntity.getTotalSleepMin() <= 0) {
                sleepWindow = null;
            } else {
                Instant ofEpochMilli = Instant.ofEpochMilli(sleepEntryEntity.getStartTimeMs());
                Instant ofEpochMilli2 = Instant.ofEpochMilli(sleepEntryEntity.getEndTimeMs());
                int coerceAtLeast = RangesKt.coerceAtLeast((int) ((sleepEntryEntity.getEndTimeMs() - sleepEntryEntity.getStartTimeMs()) / 60000), sleepEntryEntity.getTotalSleepMin());
                Intrinsics.checkNotNull(ofEpochMilli);
                Intrinsics.checkNotNull(ofEpochMilli2);
                sleepWindow = new HealthConnectManager.SleepWindow(ofEpochMilli, ofEpochMilli2, coerceAtLeast, sleepEntryEntity.getTotalSleepMin(), sleepEntryEntity.getDeepSleepMin(), sleepEntryEntity.getLightSleepMin(), sleepEntryEntity.getRemSleepMin(), sleepEntryEntity.getSleepEfficiency(), sleepEntryEntity.getSource());
            }
            if (sleepWindow != null) {
                arrayList.add(sleepWindow);
            }
        }
        return arrayList;
    }
}
