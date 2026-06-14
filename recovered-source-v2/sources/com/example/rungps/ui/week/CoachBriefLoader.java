package com.example.rungps.ui.week;

import android.content.Context;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.CombinedLoadScore;
import com.example.rungps.analytics.CombinedLoadSnapshot;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.data.DailyStepsEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.health.HealthReadinessSignals;
import com.example.rungps.health.HealthReadinessSignalsBuilder;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.DeloadPlanner;
import com.example.rungps.recovery.ReadyToTrainAssessment;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.training.RunGymPeriodization;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: CoachBriefLoader.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/ui/week/CoachBriefLoader;", "", "<init>", "()V", "load", "Lcom/example/rungps/ui/week/CoachBriefLoader$Loaded;", "context", "Landroid/content/Context;", "runs", "", "Lcom/example/rungps/data/RunEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "sleepDb", "Lcom/example/rungps/data/SleepEntryEntity;", "zone", "Ljava/time/ZoneId;", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activityContextLine", "", "lastRun", "lastGym", "nowMs", "", "relativeDayLabel", "epochMs", "Loaded", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoachBriefLoader {
    public static final int $stable = 0;
    public static final CoachBriefLoader INSTANCE = new CoachBriefLoader();

    private CoachBriefLoader() {
    }

    /* compiled from: CoachBriefLoader.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/ui/week/CoachBriefLoader$Loaded;", "", "brief", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "week", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "<init>", "(Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;)V", "getBrief", "()Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "getWeek", "()Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded {
        public static final int $stable = 8;
        private final DailyTrainingCoach.DailyCoachBrief brief;
        private final TrainingWeekPlanner.TrainingWeekView week;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, DailyTrainingCoach.DailyCoachBrief dailyCoachBrief, TrainingWeekPlanner.TrainingWeekView trainingWeekView, int i, Object obj) {
            if ((i & 1) != 0) {
                dailyCoachBrief = loaded.brief;
            }
            if ((i & 2) != 0) {
                trainingWeekView = loaded.week;
            }
            return loaded.copy(dailyCoachBrief, trainingWeekView);
        }

        /* renamed from: component1, reason: from getter */
        public final DailyTrainingCoach.DailyCoachBrief getBrief() {
            return this.brief;
        }

        /* renamed from: component2, reason: from getter */
        public final TrainingWeekPlanner.TrainingWeekView getWeek() {
            return this.week;
        }

        public final Loaded copy(DailyTrainingCoach.DailyCoachBrief brief, TrainingWeekPlanner.TrainingWeekView week) {
            Intrinsics.checkNotNullParameter(brief, "brief");
            return new Loaded(brief, week);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.brief, loaded.brief) && Intrinsics.areEqual(this.week, loaded.week);
        }

        public int hashCode() {
            int hashCode = this.brief.hashCode() * 31;
            TrainingWeekPlanner.TrainingWeekView trainingWeekView = this.week;
            return hashCode + (trainingWeekView == null ? 0 : trainingWeekView.hashCode());
        }

        public String toString() {
            return "Loaded(brief=" + this.brief + ", week=" + this.week + ")";
        }

        public Loaded(DailyTrainingCoach.DailyCoachBrief brief, TrainingWeekPlanner.TrainingWeekView trainingWeekView) {
            Intrinsics.checkNotNullParameter(brief, "brief");
            this.brief = brief;
            this.week = trainingWeekView;
        }

        public final DailyTrainingCoach.DailyCoachBrief getBrief() {
            return this.brief;
        }

        public final TrainingWeekPlanner.TrainingWeekView getWeek() {
            return this.week;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x07c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0466 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x030a A[LOOP:16: B:294:0x0304->B:296:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x08c0 A[LOOP:1: B:27:0x08ba->B:29:0x08c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x033f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0658  */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Context context, List<RunEntity> list, List<GymSessionEntity> list2, List<RecoveryEventEntity> list3, List<SleepEntryEntity> list4, ZoneId zoneId, Continuation<? super Loaded> continuation) {
        CoachBriefLoader$load$1 coachBriefLoader$load$1;
        Repository repository;
        HealthConnectManager healthConnectManager;
        List<RunEntity> list5;
        List<GymSessionEntity> list6;
        List<RecoveryEventEntity> list7;
        List<SleepEntryEntity> list8;
        ZoneId zoneId2;
        PermissionController permissionController;
        Set set;
        CoachBriefLoader coachBriefLoader;
        HealthConnectManager healthConnectManager2;
        List<SleepEntryEntity> list9;
        List<RunEntity> list10;
        Repository repository2;
        ZoneId zoneId3;
        List<GymSessionEntity> list11;
        List<RecoveryEventEntity> list12;
        Object m7905constructorimpl;
        Set set2;
        Iterator it;
        Object obj;
        List<RecoveryEventEntity> list13;
        HealthConnectManager healthConnectManager3;
        Set set3;
        Repository repository3;
        long j;
        List<RunEntity> list14;
        CoachBriefLoader coachBriefLoader2;
        ZoneId zoneId4;
        List<SleepEntryEntity> list15;
        List list16;
        List<GymSessionEntity> list17;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        long j2;
        long j3;
        List emptyList;
        double d;
        long j4;
        Iterator it3;
        int i;
        int i2;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView;
        HealthConnectManager healthConnectManager4;
        List<RunEntity> list18;
        Set set4;
        Repository repository4;
        List<RecoveryEventEntity> list19;
        List list20;
        List<GymSessionEntity> list21;
        long j5;
        Object obj3;
        CoachBriefLoader coachBriefLoader3;
        Map map;
        ZoneId zoneId5;
        List<SleepEntryEntity> list22;
        Long l;
        Object build;
        Object obj4;
        List<RunEntity> list23;
        Map map2;
        List<GymSessionEntity> list24;
        Repository repository5;
        List<RecoveryEventEntity> list25;
        ZoneId zoneId6;
        List list26;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView2;
        Object obj5;
        List<GymSessionEntity> list27;
        int i3;
        ArrayList arrayList;
        Iterator it4;
        Iterator it5;
        Long boxLong;
        Iterator it6;
        Object next;
        GymSessionEntity gymSessionEntity;
        GymSessionEntity gymSessionEntity2;
        Iterator it7;
        Object next2;
        ZoneId zoneId7;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView3;
        Object obj6;
        Repository repository6;
        Map map3;
        int i4;
        HealthReadinessSignals healthReadinessSignals;
        DeloadAdvice deloadAdvice;
        RunEntity runEntity;
        long j6;
        List list28;
        ReadyToTrainAssessment readyToTrainAssessment;
        Object next3;
        long j7;
        RunGymPeriodization runGymPeriodization;
        List list29;
        GymSessionEntity gymSessionEntity3;
        GymSessionEntity gymSessionEntity4;
        List<RunEntity> list30;
        DeloadAdvice deloadAdvice2;
        HealthReadinessSignals healthReadinessSignals2;
        TrainingWeekPlanner.TrainingWeekView trainingWeekView4;
        ?? r4;
        int i5;
        ReadyToTrainAssessment readyToTrainAssessment2;
        ZoneId zoneId8;
        RunEntity runEntity2;
        List<RecoveryEventEntity> list31;
        CoachBriefLoader coachBriefLoader4;
        final Map map4;
        Map map5;
        int i6;
        GymSessionEntity gymSessionEntity5;
        List<RunEntity> list32;
        CoachBriefLoader coachBriefLoader5;
        long j8;
        ReadyToTrainAssessment readyToTrainAssessment3;
        GymSessionEntity gymSessionEntity6;
        RunGymPeriodization runGymPeriodization2;
        RunEntity runEntity3;
        Map map6;
        RunGymPeriodization.WorkoutSuggestion suggest;
        Iterator it8;
        Iterator it9;
        CombinedLoadSnapshot fromTotals;
        DailyTrainingCoach.DailyCoachBrief copy;
        CoachBriefLoader coachBriefLoader6 = this;
        if (continuation instanceof CoachBriefLoader$load$1) {
            coachBriefLoader$load$1 = (CoachBriefLoader$load$1) continuation;
            if ((coachBriefLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                coachBriefLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj7 = coachBriefLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (coachBriefLoader$load$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj7);
                        repository = Repository.INSTANCE.get(context);
                        Context applicationContext = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        healthConnectManager = new HealthConnectManager(applicationContext);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            CoachBriefLoader coachBriefLoader7 = coachBriefLoader6;
                            permissionController = healthConnectManager.permissionController();
                        } catch (Throwable th) {
                            th = th;
                            list5 = list;
                        }
                        if (permissionController != null) {
                            coachBriefLoader$load$1.L$0 = coachBriefLoader6;
                            list5 = list;
                            try {
                                coachBriefLoader$load$1.L$1 = list5;
                                list6 = list2;
                                try {
                                    coachBriefLoader$load$1.L$2 = list6;
                                    list7 = list3;
                                    try {
                                        coachBriefLoader$load$1.L$3 = list7;
                                        list8 = list4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        list8 = list4;
                                        zoneId2 = zoneId;
                                        Result.Companion companion2 = Result.INSTANCE;
                                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                        ZoneId zoneId9 = zoneId2;
                                        coachBriefLoader = coachBriefLoader6;
                                        healthConnectManager2 = healthConnectManager;
                                        list9 = list8;
                                        list10 = list5;
                                        repository2 = repository;
                                        zoneId3 = zoneId9;
                                        List<RecoveryEventEntity> list33 = list7;
                                        list11 = list6;
                                        list12 = list33;
                                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                        }
                                        set2 = (Set) m7905constructorimpl;
                                        if (set2 == null) {
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        while (r11.hasNext()) {
                                        }
                                        ArrayList arrayList3 = arrayList2;
                                        long epochMilli = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                                        ArrayList arrayList4 = arrayList3;
                                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                                        it = arrayList4.iterator();
                                        while (it.hasNext()) {
                                        }
                                        coachBriefLoader$load$1.L$0 = coachBriefLoader;
                                        coachBriefLoader$load$1.L$1 = list10;
                                        coachBriefLoader$load$1.L$2 = list11;
                                        coachBriefLoader$load$1.L$3 = list12;
                                        coachBriefLoader$load$1.L$4 = list9;
                                        coachBriefLoader$load$1.L$5 = zoneId3;
                                        coachBriefLoader$load$1.L$6 = repository2;
                                        coachBriefLoader$load$1.L$7 = healthConnectManager2;
                                        coachBriefLoader$load$1.L$8 = set2;
                                        coachBriefLoader$load$1.L$9 = arrayList3;
                                        coachBriefLoader$load$1.J$0 = epochMilli;
                                        coachBriefLoader$load$1.label = 2;
                                        obj = repository2.setsForSessionsGrouped(arrayList5, coachBriefLoader$load$1);
                                        coroutine_suspended = coroutine_suspended;
                                        if (obj == coroutine_suspended) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    list7 = list3;
                                    list8 = list4;
                                    zoneId2 = zoneId;
                                    Result.Companion companion22 = Result.INSTANCE;
                                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                    ZoneId zoneId92 = zoneId2;
                                    coachBriefLoader = coachBriefLoader6;
                                    healthConnectManager2 = healthConnectManager;
                                    list9 = list8;
                                    list10 = list5;
                                    repository2 = repository;
                                    zoneId3 = zoneId92;
                                    List<RecoveryEventEntity> list332 = list7;
                                    list11 = list6;
                                    list12 = list332;
                                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                    }
                                    set2 = (Set) m7905constructorimpl;
                                    if (set2 == null) {
                                    }
                                    ArrayList arrayList22 = new ArrayList();
                                    while (r11.hasNext()) {
                                    }
                                    ArrayList arrayList32 = arrayList22;
                                    long epochMilli2 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                                    ArrayList arrayList42 = arrayList32;
                                    ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42, 10));
                                    it = arrayList42.iterator();
                                    while (it.hasNext()) {
                                    }
                                    coachBriefLoader$load$1.L$0 = coachBriefLoader;
                                    coachBriefLoader$load$1.L$1 = list10;
                                    coachBriefLoader$load$1.L$2 = list11;
                                    coachBriefLoader$load$1.L$3 = list12;
                                    coachBriefLoader$load$1.L$4 = list9;
                                    coachBriefLoader$load$1.L$5 = zoneId3;
                                    coachBriefLoader$load$1.L$6 = repository2;
                                    coachBriefLoader$load$1.L$7 = healthConnectManager2;
                                    coachBriefLoader$load$1.L$8 = set2;
                                    coachBriefLoader$load$1.L$9 = arrayList32;
                                    coachBriefLoader$load$1.J$0 = epochMilli2;
                                    coachBriefLoader$load$1.label = 2;
                                    obj = repository2.setsForSessionsGrouped(arrayList52, coachBriefLoader$load$1);
                                    coroutine_suspended = coroutine_suspended;
                                    if (obj == coroutine_suspended) {
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                list6 = list2;
                                list7 = list3;
                                list8 = list4;
                                zoneId2 = zoneId;
                                Result.Companion companion222 = Result.INSTANCE;
                                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                ZoneId zoneId922 = zoneId2;
                                coachBriefLoader = coachBriefLoader6;
                                healthConnectManager2 = healthConnectManager;
                                list9 = list8;
                                list10 = list5;
                                repository2 = repository;
                                zoneId3 = zoneId922;
                                List<RecoveryEventEntity> list3322 = list7;
                                list11 = list6;
                                list12 = list3322;
                                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                }
                                set2 = (Set) m7905constructorimpl;
                                if (set2 == null) {
                                }
                                ArrayList arrayList222 = new ArrayList();
                                while (r11.hasNext()) {
                                }
                                ArrayList arrayList322 = arrayList222;
                                long epochMilli22 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                                ArrayList arrayList422 = arrayList322;
                                ArrayList arrayList522 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList422, 10));
                                it = arrayList422.iterator();
                                while (it.hasNext()) {
                                }
                                coachBriefLoader$load$1.L$0 = coachBriefLoader;
                                coachBriefLoader$load$1.L$1 = list10;
                                coachBriefLoader$load$1.L$2 = list11;
                                coachBriefLoader$load$1.L$3 = list12;
                                coachBriefLoader$load$1.L$4 = list9;
                                coachBriefLoader$load$1.L$5 = zoneId3;
                                coachBriefLoader$load$1.L$6 = repository2;
                                coachBriefLoader$load$1.L$7 = healthConnectManager2;
                                coachBriefLoader$load$1.L$8 = set2;
                                coachBriefLoader$load$1.L$9 = arrayList322;
                                coachBriefLoader$load$1.J$0 = epochMilli22;
                                coachBriefLoader$load$1.label = 2;
                                obj = repository2.setsForSessionsGrouped(arrayList522, coachBriefLoader$load$1);
                                coroutine_suspended = coroutine_suspended;
                                if (obj == coroutine_suspended) {
                                }
                            }
                            try {
                                coachBriefLoader$load$1.L$4 = list8;
                                zoneId2 = zoneId;
                                try {
                                    coachBriefLoader$load$1.L$5 = zoneId2;
                                    coachBriefLoader$load$1.L$6 = repository;
                                    coachBriefLoader$load$1.L$7 = healthConnectManager;
                                    coachBriefLoader$load$1.label = 1;
                                    obj7 = permissionController.getGrantedPermissions(coachBriefLoader$load$1);
                                } catch (Throwable th5) {
                                    th = th5;
                                    Result.Companion companion2222 = Result.INSTANCE;
                                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                    ZoneId zoneId9222 = zoneId2;
                                    coachBriefLoader = coachBriefLoader6;
                                    healthConnectManager2 = healthConnectManager;
                                    list9 = list8;
                                    list10 = list5;
                                    repository2 = repository;
                                    zoneId3 = zoneId9222;
                                    List<RecoveryEventEntity> list33222 = list7;
                                    list11 = list6;
                                    list12 = list33222;
                                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                    }
                                    set2 = (Set) m7905constructorimpl;
                                    if (set2 == null) {
                                    }
                                    ArrayList arrayList2222 = new ArrayList();
                                    while (r11.hasNext()) {
                                    }
                                    ArrayList arrayList3222 = arrayList2222;
                                    long epochMilli222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                                    ArrayList arrayList4222 = arrayList3222;
                                    ArrayList arrayList5222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4222, 10));
                                    it = arrayList4222.iterator();
                                    while (it.hasNext()) {
                                    }
                                    coachBriefLoader$load$1.L$0 = coachBriefLoader;
                                    coachBriefLoader$load$1.L$1 = list10;
                                    coachBriefLoader$load$1.L$2 = list11;
                                    coachBriefLoader$load$1.L$3 = list12;
                                    coachBriefLoader$load$1.L$4 = list9;
                                    coachBriefLoader$load$1.L$5 = zoneId3;
                                    coachBriefLoader$load$1.L$6 = repository2;
                                    coachBriefLoader$load$1.L$7 = healthConnectManager2;
                                    coachBriefLoader$load$1.L$8 = set2;
                                    coachBriefLoader$load$1.L$9 = arrayList3222;
                                    coachBriefLoader$load$1.J$0 = epochMilli222;
                                    coachBriefLoader$load$1.label = 2;
                                    obj = repository2.setsForSessionsGrouped(arrayList5222, coachBriefLoader$load$1);
                                    coroutine_suspended = coroutine_suspended;
                                    if (obj == coroutine_suspended) {
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                zoneId2 = zoneId;
                                Result.Companion companion22222 = Result.INSTANCE;
                                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                ZoneId zoneId92222 = zoneId2;
                                coachBriefLoader = coachBriefLoader6;
                                healthConnectManager2 = healthConnectManager;
                                list9 = list8;
                                list10 = list5;
                                repository2 = repository;
                                zoneId3 = zoneId92222;
                                List<RecoveryEventEntity> list332222 = list7;
                                list11 = list6;
                                list12 = list332222;
                                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                }
                                set2 = (Set) m7905constructorimpl;
                                if (set2 == null) {
                                }
                                ArrayList arrayList22222 = new ArrayList();
                                while (r11.hasNext()) {
                                }
                                ArrayList arrayList32222 = arrayList22222;
                                long epochMilli2222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                                ArrayList arrayList42222 = arrayList32222;
                                ArrayList arrayList52222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42222, 10));
                                it = arrayList42222.iterator();
                                while (it.hasNext()) {
                                }
                                coachBriefLoader$load$1.L$0 = coachBriefLoader;
                                coachBriefLoader$load$1.L$1 = list10;
                                coachBriefLoader$load$1.L$2 = list11;
                                coachBriefLoader$load$1.L$3 = list12;
                                coachBriefLoader$load$1.L$4 = list9;
                                coachBriefLoader$load$1.L$5 = zoneId3;
                                coachBriefLoader$load$1.L$6 = repository2;
                                coachBriefLoader$load$1.L$7 = healthConnectManager2;
                                coachBriefLoader$load$1.L$8 = set2;
                                coachBriefLoader$load$1.L$9 = arrayList32222;
                                coachBriefLoader$load$1.J$0 = epochMilli2222;
                                coachBriefLoader$load$1.label = 2;
                                obj = repository2.setsForSessionsGrouped(arrayList52222, coachBriefLoader$load$1);
                                coroutine_suspended = coroutine_suspended;
                                if (obj == coroutine_suspended) {
                                }
                            }
                            if (obj7 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coachBriefLoader = coachBriefLoader6;
                            healthConnectManager2 = healthConnectManager;
                            list9 = list8;
                            list10 = list5;
                            repository2 = repository;
                            zoneId3 = zoneId2;
                            list11 = list6;
                            list12 = list7;
                            set = (Set) obj7;
                            m7905constructorimpl = Result.m7905constructorimpl(set);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                m7905constructorimpl = null;
                            }
                            set2 = (Set) m7905constructorimpl;
                            if (set2 == null) {
                                set2 = SetsKt.emptySet();
                            }
                            ArrayList arrayList222222 = new ArrayList();
                            for (Object obj8 : list11) {
                                if (((GymSessionEntity) obj8).getEndedAtMs() != null) {
                                    arrayList222222.add(obj8);
                                }
                            }
                            ArrayList arrayList322222 = arrayList222222;
                            long epochMilli22222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                            ArrayList arrayList422222 = arrayList322222;
                            ArrayList arrayList522222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList422222, 10));
                            it = arrayList422222.iterator();
                            while (it.hasNext()) {
                                arrayList522222.add(Boxing.boxLong(((GymSessionEntity) it.next()).getId()));
                            }
                            coachBriefLoader$load$1.L$0 = coachBriefLoader;
                            coachBriefLoader$load$1.L$1 = list10;
                            coachBriefLoader$load$1.L$2 = list11;
                            coachBriefLoader$load$1.L$3 = list12;
                            coachBriefLoader$load$1.L$4 = list9;
                            coachBriefLoader$load$1.L$5 = zoneId3;
                            coachBriefLoader$load$1.L$6 = repository2;
                            coachBriefLoader$load$1.L$7 = healthConnectManager2;
                            coachBriefLoader$load$1.L$8 = set2;
                            coachBriefLoader$load$1.L$9 = arrayList322222;
                            coachBriefLoader$load$1.J$0 = epochMilli22222;
                            coachBriefLoader$load$1.label = 2;
                            obj = repository2.setsForSessionsGrouped(arrayList522222, coachBriefLoader$load$1);
                            coroutine_suspended = coroutine_suspended;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list13 = list12;
                            healthConnectManager3 = healthConnectManager2;
                            List<SleepEntryEntity> list34 = list9;
                            set3 = set2;
                            obj7 = obj;
                            List<GymSessionEntity> list35 = list11;
                            repository3 = repository2;
                            j = epochMilli22222;
                            list14 = list10;
                            coachBriefLoader2 = coachBriefLoader;
                            zoneId4 = zoneId3;
                            list15 = list34;
                            list16 = arrayList322222;
                            list17 = list35;
                            Map map7 = (Map) obj7;
                            obj2 = coroutine_suspended;
                            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map7.size()));
                            it2 = map7.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Iterator it10 = it2;
                                Object key = entry.getKey();
                                Iterator it11 = ((List) entry.getValue()).iterator();
                                d = 0.0d;
                                while (it11.hasNext()) {
                                    GymSetEntity gymSetEntity = (GymSetEntity) it11.next();
                                    double weightKg = gymSetEntity.getWeightKg();
                                    Integer reps = gymSetEntity.getReps();
                                    if (reps != null) {
                                        j4 = j;
                                        it3 = it11;
                                        i2 = reps.intValue();
                                        i = 1;
                                    } else {
                                        j4 = j;
                                        it3 = it11;
                                        i = 1;
                                        i2 = 1;
                                    }
                                    d += weightKg * RangesKt.coerceAtLeast(i2, i);
                                    it11 = it3;
                                    j = j4;
                                }
                                linkedHashMap.put(key, Boxing.boxDouble(d));
                                it2 = it10;
                                j = j;
                            }
                            j2 = j;
                            if (set3.containsAll(healthConnectManager3.getSleepReadPermissions()) || !healthConnectManager3.isReady()) {
                                j3 = j2;
                                coroutine_suspended = obj2;
                                emptyList = CollectionsKt.emptyList();
                                TrainingWeekPlanner.TrainingWeekView build$default = TrainingWeekPlanner.build$default(TrainingWeekPlanner.INSTANCE, list14, list16, linkedHashMap, emptyList, zoneId4, null, null, 96, null);
                                long j9 = j3;
                                long epochDay = LocalDate.now(zoneId4).toEpochDay();
                                coachBriefLoader$load$1.L$0 = coachBriefLoader2;
                                coachBriefLoader$load$1.L$1 = list14;
                                coachBriefLoader$load$1.L$2 = list17;
                                coachBriefLoader$load$1.L$3 = list13;
                                coachBriefLoader$load$1.L$4 = list15;
                                coachBriefLoader$load$1.L$5 = zoneId4;
                                coachBriefLoader$load$1.L$6 = repository3;
                                coachBriefLoader$load$1.L$7 = healthConnectManager3;
                                coachBriefLoader$load$1.L$8 = set3;
                                coachBriefLoader$load$1.L$9 = list16;
                                coachBriefLoader$load$1.L$10 = linkedHashMap;
                                coachBriefLoader$load$1.L$11 = build$default;
                                Map map8 = linkedHashMap;
                                coachBriefLoader$load$1.J$0 = j9;
                                coachBriefLoader$load$1.label = 4;
                                obj7 = repository3.dailyStepsForDay(epochDay, coachBriefLoader$load$1);
                                if (obj7 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                trainingWeekView = build$default;
                                healthConnectManager4 = healthConnectManager3;
                                list18 = list14;
                                set4 = set3;
                                repository4 = repository3;
                                list19 = list13;
                                list20 = list16;
                                list21 = list17;
                                j5 = j9;
                                obj3 = coroutine_suspended;
                                coachBriefLoader3 = coachBriefLoader2;
                                map = map8;
                                List<SleepEntryEntity> list36 = list15;
                                zoneId5 = zoneId4;
                                list22 = list36;
                                DailyStepsEntity dailyStepsEntity = (DailyStepsEntity) obj7;
                                Long boxLong2 = dailyStepsEntity == null ? Boxing.boxLong(dailyStepsEntity.getSteps()) : null;
                                HealthReadinessSignalsBuilder healthReadinessSignalsBuilder = HealthReadinessSignalsBuilder.INSTANCE;
                                List<SleepEntryEntity> list37 = list22;
                                boolean containsAll = set4.containsAll(healthConnectManager4.getSleepReadPermissions());
                                Long l2 = boxLong2;
                                boolean containsAll2 = set4.containsAll(healthConnectManager4.getStepsReadPermissions());
                                boolean containsAll3 = set4.containsAll(healthConnectManager4.getHeartRateReadPermissions());
                                coachBriefLoader$load$1.L$0 = coachBriefLoader3;
                                coachBriefLoader$load$1.L$1 = list18;
                                coachBriefLoader$load$1.L$2 = list21;
                                coachBriefLoader$load$1.L$3 = list19;
                                coachBriefLoader$load$1.L$4 = zoneId5;
                                coachBriefLoader$load$1.L$5 = repository4;
                                coachBriefLoader$load$1.L$6 = list20;
                                coachBriefLoader$load$1.L$7 = map;
                                coachBriefLoader$load$1.L$8 = trainingWeekView;
                                TrainingWeekPlanner.TrainingWeekView trainingWeekView5 = trainingWeekView;
                                coachBriefLoader$load$1.L$9 = null;
                                coachBriefLoader$load$1.L$10 = null;
                                coachBriefLoader$load$1.L$11 = null;
                                coachBriefLoader$load$1.J$0 = j5;
                                coachBriefLoader$load$1.label = 5;
                                List<RunEntity> list38 = list18;
                                List<GymSessionEntity> list39 = list21;
                                Repository repository7 = repository4;
                                List<RecoveryEventEntity> list40 = list19;
                                ZoneId zoneId10 = zoneId5;
                                List list41 = list20;
                                l = null;
                                build = healthReadinessSignalsBuilder.build(healthConnectManager4, containsAll, containsAll2, containsAll3, l2, list37, zoneId5, coachBriefLoader$load$1);
                                obj4 = obj3;
                                if (build != obj4) {
                                    return obj4;
                                }
                                list23 = list38;
                                map2 = map;
                                list24 = list39;
                                repository5 = repository7;
                                list25 = list40;
                                zoneId6 = zoneId10;
                                list26 = list41;
                                trainingWeekView2 = trainingWeekView5;
                                obj7 = build;
                                HealthReadinessSignals healthReadinessSignals3 = (HealthReadinessSignals) obj7;
                                obj5 = obj4;
                                long currentTimeMillis = System.currentTimeMillis();
                                list27 = list24;
                                TrainingWeekPlanner.TrainingWeekView trainingWeekView6 = trainingWeekView2;
                                int i7 = 0;
                                if ((list27 instanceof Collection) || !list27.isEmpty()) {
                                    int i8 = 0;
                                    for (GymSessionEntity gymSessionEntity7 : list27) {
                                        Long endedAtMs = gymSessionEntity7.getEndedAtMs();
                                        if (currentTimeMillis - (endedAtMs != null ? endedAtMs.longValue() : gymSessionEntity7.getStartedAtMs()) < 172800000 && (i8 = i8 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                    i3 = i8;
                                } else {
                                    i3 = 0;
                                }
                                int i9 = i3;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj9 : list25) {
                                    Map map9 = map2;
                                    if (((RecoveryEventEntity) obj9).getEndsAtMs() > currentTimeMillis) {
                                        arrayList6.add(obj9);
                                    }
                                    map2 = map9;
                                }
                                Map map10 = map2;
                                ArrayList arrayList7 = arrayList6;
                                arrayList = arrayList7;
                                Repository repository8 = repository5;
                                if ((arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                    it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        Iterator it12 = it4;
                                        ZoneId zoneId11 = zoneId6;
                                        if (Intrinsics.areEqual(((RecoveryEventEntity) it4.next()).getKind(), "SOCCER") && (i7 = i7 + 1) < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                        it4 = it12;
                                        zoneId6 = zoneId11;
                                    }
                                }
                                ZoneId zoneId12 = zoneId6;
                                DeloadAdvice advise$default = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, list24, list25, 0L, 4, null);
                                DailyTrainingCoach dailyTrainingCoach = DailyTrainingCoach.INSTANCE;
                                it5 = arrayList.iterator();
                                if (it5.hasNext()) {
                                    boxLong = l;
                                } else {
                                    boxLong = Boxing.boxLong(((RecoveryEventEntity) it5.next()).getEndsAtMs());
                                    while (it5.hasNext()) {
                                        Iterator it13 = it5;
                                        Long boxLong3 = Boxing.boxLong(((RecoveryEventEntity) it5.next()).getEndsAtMs());
                                        if (boxLong.compareTo(boxLong3) < 0) {
                                            boxLong = boxLong3;
                                        }
                                        it5 = it13;
                                    }
                                }
                                Long l3 = boxLong;
                                ReadyToTrainAssessment buildReadyAssessment = dailyTrainingCoach.buildReadyAssessment((l3 == null ? l3.longValue() : currentTimeMillis) - currentTimeMillis, arrayList7.size(), i7, advise$default, healthReadinessSignals3);
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj10 : list27) {
                                    if (((GymSessionEntity) obj10).getStartedAtMs() >= j5 - 172800000) {
                                        arrayList8.add(obj10);
                                    }
                                }
                                it6 = arrayList8.iterator();
                                if (it6.hasNext()) {
                                    next = l;
                                } else {
                                    next = it6.next();
                                    if (it6.hasNext()) {
                                        GymSessionEntity gymSessionEntity8 = (GymSessionEntity) next;
                                        Long endedAtMs2 = gymSessionEntity8.getEndedAtMs();
                                        long longValue = endedAtMs2 != null ? endedAtMs2.longValue() : gymSessionEntity8.getStartedAtMs();
                                        do {
                                            Object next4 = it6.next();
                                            GymSessionEntity gymSessionEntity9 = (GymSessionEntity) next4;
                                            Long endedAtMs3 = gymSessionEntity9.getEndedAtMs();
                                            long longValue2 = endedAtMs3 != null ? endedAtMs3.longValue() : gymSessionEntity9.getStartedAtMs();
                                            if (longValue < longValue2) {
                                                next = next4;
                                                longValue = longValue2;
                                            }
                                        } while (it6.hasNext());
                                    }
                                }
                                gymSessionEntity = (GymSessionEntity) next;
                                if (gymSessionEntity == null) {
                                    Iterator it14 = list26.iterator();
                                    if (it14.hasNext()) {
                                        next3 = it14.next();
                                        if (it14.hasNext()) {
                                            GymSessionEntity gymSessionEntity10 = (GymSessionEntity) next3;
                                            Long endedAtMs4 = gymSessionEntity10.getEndedAtMs();
                                            long longValue3 = endedAtMs4 != null ? endedAtMs4.longValue() : gymSessionEntity10.getStartedAtMs();
                                            do {
                                                Object next5 = it14.next();
                                                GymSessionEntity gymSessionEntity11 = (GymSessionEntity) next5;
                                                Long endedAtMs5 = gymSessionEntity11.getEndedAtMs();
                                                long longValue4 = endedAtMs5 != null ? endedAtMs5.longValue() : gymSessionEntity11.getStartedAtMs();
                                                if (longValue3 < longValue4) {
                                                    next3 = next5;
                                                    longValue3 = longValue4;
                                                }
                                            } while (it14.hasNext());
                                        }
                                    } else {
                                        next3 = l;
                                    }
                                    gymSessionEntity = (GymSessionEntity) next3;
                                }
                                gymSessionEntity2 = gymSessionEntity;
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj11 : list23) {
                                    if (((RunEntity) obj11).getEndedAtMs() != null) {
                                        arrayList9.add(obj11);
                                    }
                                }
                                it7 = arrayList9.iterator();
                                if (it7.hasNext()) {
                                    next2 = l;
                                } else {
                                    next2 = it7.next();
                                    if (it7.hasNext()) {
                                        Long endedAtMs6 = ((RunEntity) next2).getEndedAtMs();
                                        long longValue5 = endedAtMs6 != null ? endedAtMs6.longValue() : 0L;
                                        do {
                                            Object next6 = it7.next();
                                            Long endedAtMs7 = ((RunEntity) next6).getEndedAtMs();
                                            long longValue6 = endedAtMs7 != null ? endedAtMs7.longValue() : 0L;
                                            if (longValue5 < longValue6) {
                                                next2 = next6;
                                                longValue5 = longValue6;
                                            }
                                        } while (it7.hasNext());
                                    }
                                }
                                RunEntity runEntity4 = (RunEntity) next2;
                                coachBriefLoader$load$1.L$0 = coachBriefLoader3;
                                coachBriefLoader$load$1.L$1 = list23;
                                coachBriefLoader$load$1.L$2 = list25;
                                zoneId7 = zoneId12;
                                coachBriefLoader$load$1.L$3 = zoneId7;
                                coachBriefLoader$load$1.L$4 = repository8;
                                coachBriefLoader$load$1.L$5 = list26;
                                coachBriefLoader$load$1.L$6 = map10;
                                trainingWeekView3 = trainingWeekView6;
                                coachBriefLoader$load$1.L$7 = trainingWeekView3;
                                coachBriefLoader$load$1.L$8 = healthReadinessSignals3;
                                coachBriefLoader$load$1.L$9 = advise$default;
                                coachBriefLoader$load$1.L$10 = buildReadyAssessment;
                                coachBriefLoader$load$1.L$11 = gymSessionEntity2;
                                coachBriefLoader$load$1.L$12 = runEntity4;
                                coachBriefLoader$load$1.J$0 = currentTimeMillis;
                                coachBriefLoader$load$1.I$0 = i9;
                                coachBriefLoader$load$1.label = 6;
                                obj7 = repository8.muscleGroupLookup(coachBriefLoader$load$1);
                                if (obj7 != obj5) {
                                    return obj5;
                                }
                                obj6 = obj5;
                                repository6 = repository8;
                                map3 = map10;
                                i4 = i9;
                                healthReadinessSignals = healthReadinessSignals3;
                                deloadAdvice = advise$default;
                                runEntity = runEntity4;
                                j6 = currentTimeMillis;
                                list28 = list26;
                                readyToTrainAssessment = buildReadyAssessment;
                                Map map11 = (Map) obj7;
                                j7 = j6;
                                RunGymPeriodization runGymPeriodization3 = RunGymPeriodization.INSTANCE;
                                if (gymSessionEntity2 != null) {
                                    int i10 = i4;
                                    runGymPeriodization = runGymPeriodization3;
                                    list29 = list28;
                                    gymSessionEntity3 = gymSessionEntity2;
                                    gymSessionEntity4 = gymSessionEntity3;
                                    list30 = list23;
                                    deloadAdvice2 = deloadAdvice;
                                    healthReadinessSignals2 = healthReadinessSignals;
                                    trainingWeekView4 = trainingWeekView3;
                                    r4 = l;
                                    i5 = i10;
                                    readyToTrainAssessment2 = readyToTrainAssessment;
                                    zoneId8 = zoneId7;
                                    runEntity2 = runEntity;
                                    list31 = list25;
                                    coachBriefLoader4 = coachBriefLoader3;
                                    map4 = map11;
                                    if (r4 == 0) {
                                    }
                                    TrainingWeekPlanner.TrainingWeekView trainingWeekView7 = trainingWeekView4;
                                    suggest = runGymPeriodization.suggest(gymSessionEntity3, r4, runEntity2, list31, new Function1() { // from class: com.example.rungps.ui.week.CoachBriefLoader$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj12) {
                                            String load$lambda$15;
                                            load$lambda$15 = CoachBriefLoader.load$lambda$15(map4, (String) obj12);
                                            return load$lambda$15;
                                        }
                                    }, (r23 & 32) != 0 ? System.currentTimeMillis() : 0L, (r23 & 64) != 0 ? ZoneId.systemDefault() : zoneId8, (r23 & 128) != 0 ? 0 : i5);
                                    long j10 = j7 - 604800000;
                                    ArrayList arrayList10 = new ArrayList();
                                    while (r5.hasNext()) {
                                    }
                                    it8 = arrayList10.iterator();
                                    double d2 = 0.0d;
                                    while (it8.hasNext()) {
                                    }
                                    ArrayList arrayList11 = new ArrayList();
                                    while (r5.hasNext()) {
                                    }
                                    it9 = arrayList11.iterator();
                                    double d3 = 0.0d;
                                    while (it9.hasNext()) {
                                    }
                                    fromTotals = CombinedLoadScore.INSTANCE.fromTotals(d2, d3, 0, (r19 & 8) != 0 ? SportTrackingPrefs.DEFAULT_NAME : null, (r19 & 16) != 0 ? 0.0d : 0.0d);
                                    copy = r24.copy((r20 & 1) != 0 ? r24.readiness : null, (r20 & 2) != 0 ? r24.headline : null, (r20 & 4) != 0 ? r24.detail : null, (r20 & 8) != 0 ? r24.summary : null, (r20 & 16) != 0 ? r24.todayRun : null, (r20 & 32) != 0 ? r24.todayGym : null, (r20 & 64) != 0 ? r24.healthLines : null, (r20 & 128) != 0 ? r24.weekLine : null, (r20 & 256) != 0 ? DailyTrainingCoach.INSTANCE.advise(readyToTrainAssessment2, suggest, fromTotals, trainingWeekView7, healthReadinessSignals2, deloadAdvice2).contextLine : coachBriefLoader4.activityContextLine(runEntity2, gymSessionEntity4, zoneId8, j7));
                                    return new Loaded(copy, trainingWeekView7);
                                }
                                long id = gymSessionEntity2.getId();
                                coachBriefLoader$load$1.L$0 = coachBriefLoader3;
                                coachBriefLoader$load$1.L$1 = list23;
                                coachBriefLoader$load$1.L$2 = list25;
                                coachBriefLoader$load$1.L$3 = zoneId7;
                                coachBriefLoader$load$1.L$4 = list28;
                                coachBriefLoader$load$1.L$5 = map3;
                                coachBriefLoader$load$1.L$6 = trainingWeekView3;
                                coachBriefLoader$load$1.L$7 = healthReadinessSignals;
                                coachBriefLoader$load$1.L$8 = deloadAdvice;
                                coachBriefLoader$load$1.L$9 = readyToTrainAssessment;
                                coachBriefLoader$load$1.L$10 = gymSessionEntity2;
                                coachBriefLoader$load$1.L$11 = runEntity;
                                coachBriefLoader$load$1.L$12 = map11;
                                coachBriefLoader$load$1.L$13 = runGymPeriodization3;
                                coachBriefLoader$load$1.L$14 = gymSessionEntity2;
                                map5 = map3;
                                coachBriefLoader$load$1.J$0 = j7;
                                int i11 = i4;
                                coachBriefLoader$load$1.I$0 = i11;
                                coachBriefLoader$load$1.label = 7;
                                Object obj12 = repository6.setsForSession(id, coachBriefLoader$load$1);
                                Object obj13 = obj6;
                                if (obj12 == obj13) {
                                    return obj13;
                                }
                                i6 = i11;
                                obj7 = obj12;
                                list29 = list28;
                                gymSessionEntity5 = gymSessionEntity2;
                                list32 = list23;
                                coachBriefLoader5 = coachBriefLoader3;
                                j8 = j7;
                                readyToTrainAssessment3 = readyToTrainAssessment;
                                gymSessionEntity6 = gymSessionEntity5;
                                runGymPeriodization2 = runGymPeriodization3;
                                runEntity3 = runEntity;
                                map6 = map11;
                                list30 = list32;
                                j7 = j8;
                                gymSessionEntity3 = gymSessionEntity5;
                                readyToTrainAssessment2 = readyToTrainAssessment3;
                                deloadAdvice2 = deloadAdvice;
                                healthReadinessSignals2 = healthReadinessSignals;
                                trainingWeekView4 = trainingWeekView3;
                                map3 = map5;
                                r4 = (List) obj7;
                                coachBriefLoader4 = coachBriefLoader5;
                                runGymPeriodization = runGymPeriodization2;
                                zoneId8 = zoneId7;
                                map4 = map6;
                                list31 = list25;
                                runEntity2 = runEntity3;
                                int i12 = i6;
                                gymSessionEntity4 = gymSessionEntity6;
                                i5 = i12;
                                if (r4 == 0) {
                                    r4 = CollectionsKt.emptyList();
                                }
                                TrainingWeekPlanner.TrainingWeekView trainingWeekView72 = trainingWeekView4;
                                suggest = runGymPeriodization.suggest(gymSessionEntity3, r4, runEntity2, list31, new Function1() { // from class: com.example.rungps.ui.week.CoachBriefLoader$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj122) {
                                        String load$lambda$15;
                                        load$lambda$15 = CoachBriefLoader.load$lambda$15(map4, (String) obj122);
                                        return load$lambda$15;
                                    }
                                }, (r23 & 32) != 0 ? System.currentTimeMillis() : 0L, (r23 & 64) != 0 ? ZoneId.systemDefault() : zoneId8, (r23 & 128) != 0 ? 0 : i5);
                                long j102 = j7 - 604800000;
                                ArrayList arrayList102 = new ArrayList();
                                for (Object obj14 : list30) {
                                    if (((RunEntity) obj14).getStartedAtMs() >= j102) {
                                        arrayList102.add(obj14);
                                    }
                                }
                                it8 = arrayList102.iterator();
                                double d22 = 0.0d;
                                while (it8.hasNext()) {
                                    d22 += ((RunEntity) it8.next()).getTotalDistanceM() / 1000.0d;
                                }
                                ArrayList arrayList112 = new ArrayList();
                                for (Object obj15 : list29) {
                                    Long endedAtMs8 = ((GymSessionEntity) obj15).getEndedAtMs();
                                    if ((endedAtMs8 != null ? endedAtMs8.longValue() : 0L) >= j102) {
                                        arrayList112.add(obj15);
                                    }
                                }
                                it9 = arrayList112.iterator();
                                double d32 = 0.0d;
                                while (it9.hasNext()) {
                                    Double d4 = (Double) map3.get(Boxing.boxLong(((GymSessionEntity) it9.next()).getId()));
                                    d32 += d4 != null ? d4.doubleValue() : 0.0d;
                                }
                                fromTotals = CombinedLoadScore.INSTANCE.fromTotals(d22, d32, 0, (r19 & 8) != 0 ? SportTrackingPrefs.DEFAULT_NAME : null, (r19 & 16) != 0 ? 0.0d : 0.0d);
                                copy = r24.copy((r20 & 1) != 0 ? r24.readiness : null, (r20 & 2) != 0 ? r24.headline : null, (r20 & 4) != 0 ? r24.detail : null, (r20 & 8) != 0 ? r24.summary : null, (r20 & 16) != 0 ? r24.todayRun : null, (r20 & 32) != 0 ? r24.todayGym : null, (r20 & 64) != 0 ? r24.healthLines : null, (r20 & 128) != 0 ? r24.weekLine : null, (r20 & 256) != 0 ? DailyTrainingCoach.INSTANCE.advise(readyToTrainAssessment2, suggest, fromTotals, trainingWeekView72, healthReadinessSignals2, deloadAdvice2).contextLine : coachBriefLoader4.activityContextLine(runEntity2, gymSessionEntity4, zoneId8, j7));
                                return new Loaded(copy, trainingWeekView72);
                            }
                            coachBriefLoader$load$1.L$0 = coachBriefLoader2;
                            coachBriefLoader$load$1.L$1 = list14;
                            coachBriefLoader$load$1.L$2 = list17;
                            coachBriefLoader$load$1.L$3 = list13;
                            coachBriefLoader$load$1.L$4 = list15;
                            coachBriefLoader$load$1.L$5 = zoneId4;
                            coachBriefLoader$load$1.L$6 = repository3;
                            coachBriefLoader$load$1.L$7 = healthConnectManager3;
                            coachBriefLoader$load$1.L$8 = set3;
                            coachBriefLoader$load$1.L$9 = list16;
                            coachBriefLoader$load$1.L$10 = linkedHashMap;
                            j3 = j2;
                            coachBriefLoader$load$1.J$0 = j3;
                            coachBriefLoader$load$1.label = 3;
                            obj7 = healthConnectManager3.readSleepSessions(14, zoneId4, coachBriefLoader$load$1);
                            coroutine_suspended = obj2;
                            if (obj7 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            emptyList = (List) obj7;
                            TrainingWeekPlanner.TrainingWeekView build$default2 = TrainingWeekPlanner.build$default(TrainingWeekPlanner.INSTANCE, list14, list16, linkedHashMap, emptyList, zoneId4, null, null, 96, null);
                            long j92 = j3;
                            long epochDay2 = LocalDate.now(zoneId4).toEpochDay();
                            coachBriefLoader$load$1.L$0 = coachBriefLoader2;
                            coachBriefLoader$load$1.L$1 = list14;
                            coachBriefLoader$load$1.L$2 = list17;
                            coachBriefLoader$load$1.L$3 = list13;
                            coachBriefLoader$load$1.L$4 = list15;
                            coachBriefLoader$load$1.L$5 = zoneId4;
                            coachBriefLoader$load$1.L$6 = repository3;
                            coachBriefLoader$load$1.L$7 = healthConnectManager3;
                            coachBriefLoader$load$1.L$8 = set3;
                            coachBriefLoader$load$1.L$9 = list16;
                            coachBriefLoader$load$1.L$10 = linkedHashMap;
                            coachBriefLoader$load$1.L$11 = build$default2;
                            Map map82 = linkedHashMap;
                            coachBriefLoader$load$1.J$0 = j92;
                            coachBriefLoader$load$1.label = 4;
                            obj7 = repository3.dailyStepsForDay(epochDay2, coachBriefLoader$load$1);
                            if (obj7 != coroutine_suspended) {
                            }
                        } else {
                            set = null;
                            coachBriefLoader = coachBriefLoader6;
                            healthConnectManager2 = healthConnectManager;
                            list9 = list4;
                            list10 = list;
                            repository2 = repository;
                            zoneId3 = zoneId;
                            list11 = list2;
                            list12 = list3;
                            m7905constructorimpl = Result.m7905constructorimpl(set);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            set2 = (Set) m7905constructorimpl;
                            if (set2 == null) {
                            }
                            ArrayList arrayList2222222 = new ArrayList();
                            while (r11.hasNext()) {
                            }
                            ArrayList arrayList3222222 = arrayList2222222;
                            long epochMilli222222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                            ArrayList arrayList4222222 = arrayList3222222;
                            ArrayList arrayList5222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4222222, 10));
                            it = arrayList4222222.iterator();
                            while (it.hasNext()) {
                            }
                            coachBriefLoader$load$1.L$0 = coachBriefLoader;
                            coachBriefLoader$load$1.L$1 = list10;
                            coachBriefLoader$load$1.L$2 = list11;
                            coachBriefLoader$load$1.L$3 = list12;
                            coachBriefLoader$load$1.L$4 = list9;
                            coachBriefLoader$load$1.L$5 = zoneId3;
                            coachBriefLoader$load$1.L$6 = repository2;
                            coachBriefLoader$load$1.L$7 = healthConnectManager2;
                            coachBriefLoader$load$1.L$8 = set2;
                            coachBriefLoader$load$1.L$9 = arrayList3222222;
                            coachBriefLoader$load$1.J$0 = epochMilli222222;
                            coachBriefLoader$load$1.label = 2;
                            obj = repository2.setsForSessionsGrouped(arrayList5222222, coachBriefLoader$load$1);
                            coroutine_suspended = coroutine_suspended;
                            if (obj == coroutine_suspended) {
                            }
                        }
                        break;
                    case 1:
                        healthConnectManager2 = (HealthConnectManager) coachBriefLoader$load$1.L$7;
                        repository2 = (Repository) coachBriefLoader$load$1.L$6;
                        zoneId3 = (ZoneId) coachBriefLoader$load$1.L$5;
                        list9 = (List) coachBriefLoader$load$1.L$4;
                        list12 = (List) coachBriefLoader$load$1.L$3;
                        list11 = (List) coachBriefLoader$load$1.L$2;
                        list10 = (List) coachBriefLoader$load$1.L$1;
                        coachBriefLoader = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj7);
                            set = (Set) obj7;
                            m7905constructorimpl = Result.m7905constructorimpl(set);
                        } catch (Throwable th7) {
                            th = th7;
                            List<SleepEntryEntity> list42 = list9;
                            healthConnectManager = healthConnectManager2;
                            coachBriefLoader6 = coachBriefLoader;
                            zoneId2 = zoneId3;
                            repository = repository2;
                            list5 = list10;
                            list8 = list42;
                            List<GymSessionEntity> list43 = list11;
                            list7 = list12;
                            list6 = list43;
                            Result.Companion companion222222 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            ZoneId zoneId922222 = zoneId2;
                            coachBriefLoader = coachBriefLoader6;
                            healthConnectManager2 = healthConnectManager;
                            list9 = list8;
                            list10 = list5;
                            repository2 = repository;
                            zoneId3 = zoneId922222;
                            List<RecoveryEventEntity> list3322222 = list7;
                            list11 = list6;
                            list12 = list3322222;
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            set2 = (Set) m7905constructorimpl;
                            if (set2 == null) {
                            }
                            ArrayList arrayList22222222 = new ArrayList();
                            while (r11.hasNext()) {
                            }
                            ArrayList arrayList32222222 = arrayList22222222;
                            long epochMilli2222222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                            ArrayList arrayList42222222 = arrayList32222222;
                            ArrayList arrayList52222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList42222222, 10));
                            it = arrayList42222222.iterator();
                            while (it.hasNext()) {
                            }
                            coachBriefLoader$load$1.L$0 = coachBriefLoader;
                            coachBriefLoader$load$1.L$1 = list10;
                            coachBriefLoader$load$1.L$2 = list11;
                            coachBriefLoader$load$1.L$3 = list12;
                            coachBriefLoader$load$1.L$4 = list9;
                            coachBriefLoader$load$1.L$5 = zoneId3;
                            coachBriefLoader$load$1.L$6 = repository2;
                            coachBriefLoader$load$1.L$7 = healthConnectManager2;
                            coachBriefLoader$load$1.L$8 = set2;
                            coachBriefLoader$load$1.L$9 = arrayList32222222;
                            coachBriefLoader$load$1.J$0 = epochMilli2222222;
                            coachBriefLoader$load$1.label = 2;
                            obj = repository2.setsForSessionsGrouped(arrayList52222222, coachBriefLoader$load$1);
                            coroutine_suspended = coroutine_suspended;
                            if (obj == coroutine_suspended) {
                            }
                        }
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        set2 = (Set) m7905constructorimpl;
                        if (set2 == null) {
                        }
                        ArrayList arrayList222222222 = new ArrayList();
                        while (r11.hasNext()) {
                        }
                        ArrayList arrayList322222222 = arrayList222222222;
                        long epochMilli22222222 = LocalDate.now(zoneId3).atStartOfDay(zoneId3).toInstant().toEpochMilli();
                        ArrayList arrayList422222222 = arrayList322222222;
                        ArrayList arrayList522222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList422222222, 10));
                        it = arrayList422222222.iterator();
                        while (it.hasNext()) {
                        }
                        coachBriefLoader$load$1.L$0 = coachBriefLoader;
                        coachBriefLoader$load$1.L$1 = list10;
                        coachBriefLoader$load$1.L$2 = list11;
                        coachBriefLoader$load$1.L$3 = list12;
                        coachBriefLoader$load$1.L$4 = list9;
                        coachBriefLoader$load$1.L$5 = zoneId3;
                        coachBriefLoader$load$1.L$6 = repository2;
                        coachBriefLoader$load$1.L$7 = healthConnectManager2;
                        coachBriefLoader$load$1.L$8 = set2;
                        coachBriefLoader$load$1.L$9 = arrayList322222222;
                        coachBriefLoader$load$1.J$0 = epochMilli22222222;
                        coachBriefLoader$load$1.label = 2;
                        obj = repository2.setsForSessionsGrouped(arrayList522222222, coachBriefLoader$load$1);
                        coroutine_suspended = coroutine_suspended;
                        if (obj == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        long j11 = coachBriefLoader$load$1.J$0;
                        List list44 = (List) coachBriefLoader$load$1.L$9;
                        Set set5 = (Set) coachBriefLoader$load$1.L$8;
                        healthConnectManager3 = (HealthConnectManager) coachBriefLoader$load$1.L$7;
                        repository3 = (Repository) coachBriefLoader$load$1.L$6;
                        zoneId4 = (ZoneId) coachBriefLoader$load$1.L$5;
                        list15 = (List) coachBriefLoader$load$1.L$4;
                        list13 = (List) coachBriefLoader$load$1.L$3;
                        list17 = (List) coachBriefLoader$load$1.L$2;
                        list14 = (List) coachBriefLoader$load$1.L$1;
                        coachBriefLoader2 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        list16 = list44;
                        set3 = set5;
                        j = j11;
                        Map map72 = (Map) obj7;
                        obj2 = coroutine_suspended;
                        linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map72.size()));
                        it2 = map72.entrySet().iterator();
                        while (it2.hasNext()) {
                        }
                        j2 = j;
                        if (set3.containsAll(healthConnectManager3.getSleepReadPermissions())) {
                            break;
                        }
                        j3 = j2;
                        coroutine_suspended = obj2;
                        emptyList = CollectionsKt.emptyList();
                        TrainingWeekPlanner.TrainingWeekView build$default22 = TrainingWeekPlanner.build$default(TrainingWeekPlanner.INSTANCE, list14, list16, linkedHashMap, emptyList, zoneId4, null, null, 96, null);
                        long j922 = j3;
                        long epochDay22 = LocalDate.now(zoneId4).toEpochDay();
                        coachBriefLoader$load$1.L$0 = coachBriefLoader2;
                        coachBriefLoader$load$1.L$1 = list14;
                        coachBriefLoader$load$1.L$2 = list17;
                        coachBriefLoader$load$1.L$3 = list13;
                        coachBriefLoader$load$1.L$4 = list15;
                        coachBriefLoader$load$1.L$5 = zoneId4;
                        coachBriefLoader$load$1.L$6 = repository3;
                        coachBriefLoader$load$1.L$7 = healthConnectManager3;
                        coachBriefLoader$load$1.L$8 = set3;
                        coachBriefLoader$load$1.L$9 = list16;
                        coachBriefLoader$load$1.L$10 = linkedHashMap;
                        coachBriefLoader$load$1.L$11 = build$default22;
                        Map map822 = linkedHashMap;
                        coachBriefLoader$load$1.J$0 = j922;
                        coachBriefLoader$load$1.label = 4;
                        obj7 = repository3.dailyStepsForDay(epochDay22, coachBriefLoader$load$1);
                        if (obj7 != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        j3 = coachBriefLoader$load$1.J$0;
                        linkedHashMap = (Map) coachBriefLoader$load$1.L$10;
                        list16 = (List) coachBriefLoader$load$1.L$9;
                        set3 = (Set) coachBriefLoader$load$1.L$8;
                        healthConnectManager3 = (HealthConnectManager) coachBriefLoader$load$1.L$7;
                        repository3 = (Repository) coachBriefLoader$load$1.L$6;
                        zoneId4 = (ZoneId) coachBriefLoader$load$1.L$5;
                        list15 = (List) coachBriefLoader$load$1.L$4;
                        list13 = (List) coachBriefLoader$load$1.L$3;
                        list17 = (List) coachBriefLoader$load$1.L$2;
                        list14 = (List) coachBriefLoader$load$1.L$1;
                        coachBriefLoader2 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        emptyList = (List) obj7;
                        TrainingWeekPlanner.TrainingWeekView build$default222 = TrainingWeekPlanner.build$default(TrainingWeekPlanner.INSTANCE, list14, list16, linkedHashMap, emptyList, zoneId4, null, null, 96, null);
                        long j9222 = j3;
                        long epochDay222 = LocalDate.now(zoneId4).toEpochDay();
                        coachBriefLoader$load$1.L$0 = coachBriefLoader2;
                        coachBriefLoader$load$1.L$1 = list14;
                        coachBriefLoader$load$1.L$2 = list17;
                        coachBriefLoader$load$1.L$3 = list13;
                        coachBriefLoader$load$1.L$4 = list15;
                        coachBriefLoader$load$1.L$5 = zoneId4;
                        coachBriefLoader$load$1.L$6 = repository3;
                        coachBriefLoader$load$1.L$7 = healthConnectManager3;
                        coachBriefLoader$load$1.L$8 = set3;
                        coachBriefLoader$load$1.L$9 = list16;
                        coachBriefLoader$load$1.L$10 = linkedHashMap;
                        coachBriefLoader$load$1.L$11 = build$default222;
                        Map map8222 = linkedHashMap;
                        coachBriefLoader$load$1.J$0 = j9222;
                        coachBriefLoader$load$1.label = 4;
                        obj7 = repository3.dailyStepsForDay(epochDay222, coachBriefLoader$load$1);
                        if (obj7 != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        long j12 = coachBriefLoader$load$1.J$0;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView8 = (TrainingWeekPlanner.TrainingWeekView) coachBriefLoader$load$1.L$11;
                        Map map12 = (Map) coachBriefLoader$load$1.L$10;
                        List list45 = (List) coachBriefLoader$load$1.L$9;
                        set4 = (Set) coachBriefLoader$load$1.L$8;
                        HealthConnectManager healthConnectManager5 = (HealthConnectManager) coachBriefLoader$load$1.L$7;
                        Repository repository9 = (Repository) coachBriefLoader$load$1.L$6;
                        zoneId5 = (ZoneId) coachBriefLoader$load$1.L$5;
                        List<SleepEntryEntity> list46 = (List) coachBriefLoader$load$1.L$4;
                        List<RecoveryEventEntity> list47 = (List) coachBriefLoader$load$1.L$3;
                        List<GymSessionEntity> list48 = (List) coachBriefLoader$load$1.L$2;
                        List<RunEntity> list49 = (List) coachBriefLoader$load$1.L$1;
                        CoachBriefLoader coachBriefLoader8 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj3 = coroutine_suspended;
                        coachBriefLoader3 = coachBriefLoader8;
                        trainingWeekView = trainingWeekView8;
                        map = map12;
                        list21 = list48;
                        list20 = list45;
                        repository4 = repository9;
                        list22 = list46;
                        healthConnectManager4 = healthConnectManager5;
                        list19 = list47;
                        list18 = list49;
                        j5 = j12;
                        DailyStepsEntity dailyStepsEntity2 = (DailyStepsEntity) obj7;
                        if (dailyStepsEntity2 == null) {
                        }
                        HealthReadinessSignalsBuilder healthReadinessSignalsBuilder2 = HealthReadinessSignalsBuilder.INSTANCE;
                        List<SleepEntryEntity> list372 = list22;
                        boolean containsAll4 = set4.containsAll(healthConnectManager4.getSleepReadPermissions());
                        Long l22 = boxLong2;
                        boolean containsAll22 = set4.containsAll(healthConnectManager4.getStepsReadPermissions());
                        boolean containsAll32 = set4.containsAll(healthConnectManager4.getHeartRateReadPermissions());
                        coachBriefLoader$load$1.L$0 = coachBriefLoader3;
                        coachBriefLoader$load$1.L$1 = list18;
                        coachBriefLoader$load$1.L$2 = list21;
                        coachBriefLoader$load$1.L$3 = list19;
                        coachBriefLoader$load$1.L$4 = zoneId5;
                        coachBriefLoader$load$1.L$5 = repository4;
                        coachBriefLoader$load$1.L$6 = list20;
                        coachBriefLoader$load$1.L$7 = map;
                        coachBriefLoader$load$1.L$8 = trainingWeekView;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView52 = trainingWeekView;
                        coachBriefLoader$load$1.L$9 = null;
                        coachBriefLoader$load$1.L$10 = null;
                        coachBriefLoader$load$1.L$11 = null;
                        coachBriefLoader$load$1.J$0 = j5;
                        coachBriefLoader$load$1.label = 5;
                        List<RunEntity> list382 = list18;
                        List<GymSessionEntity> list392 = list21;
                        Repository repository72 = repository4;
                        List<RecoveryEventEntity> list402 = list19;
                        ZoneId zoneId102 = zoneId5;
                        List list412 = list20;
                        l = null;
                        build = healthReadinessSignalsBuilder2.build(healthConnectManager4, containsAll4, containsAll22, containsAll32, l22, list372, zoneId5, coachBriefLoader$load$1);
                        obj4 = obj3;
                        if (build != obj4) {
                        }
                        break;
                    case 5:
                        long j13 = coachBriefLoader$load$1.J$0;
                        trainingWeekView2 = (TrainingWeekPlanner.TrainingWeekView) coachBriefLoader$load$1.L$8;
                        map2 = (Map) coachBriefLoader$load$1.L$7;
                        list26 = (List) coachBriefLoader$load$1.L$6;
                        Repository repository10 = (Repository) coachBriefLoader$load$1.L$5;
                        zoneId6 = (ZoneId) coachBriefLoader$load$1.L$4;
                        list25 = (List) coachBriefLoader$load$1.L$3;
                        list24 = (List) coachBriefLoader$load$1.L$2;
                        list23 = (List) coachBriefLoader$load$1.L$1;
                        CoachBriefLoader coachBriefLoader9 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        repository5 = repository10;
                        l = null;
                        obj4 = coroutine_suspended;
                        coachBriefLoader3 = coachBriefLoader9;
                        j5 = j13;
                        HealthReadinessSignals healthReadinessSignals32 = (HealthReadinessSignals) obj7;
                        obj5 = obj4;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        list27 = list24;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView62 = trainingWeekView2;
                        int i72 = 0;
                        if (list27 instanceof Collection) {
                            break;
                        }
                        int i82 = 0;
                        while (r1.hasNext()) {
                        }
                        i3 = i82;
                        int i92 = i3;
                        ArrayList arrayList62 = new ArrayList();
                        while (r22.hasNext()) {
                        }
                        Map map102 = map2;
                        ArrayList arrayList72 = arrayList62;
                        arrayList = arrayList72;
                        Repository repository82 = repository5;
                        if (arrayList instanceof Collection) {
                            break;
                        }
                        it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                        }
                        ZoneId zoneId122 = zoneId6;
                        DeloadAdvice advise$default2 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, list24, list25, 0L, 4, null);
                        DailyTrainingCoach dailyTrainingCoach2 = DailyTrainingCoach.INSTANCE;
                        it5 = arrayList.iterator();
                        if (it5.hasNext()) {
                        }
                        Long l32 = boxLong;
                        ReadyToTrainAssessment buildReadyAssessment2 = dailyTrainingCoach2.buildReadyAssessment((l32 == null ? l32.longValue() : currentTimeMillis2) - currentTimeMillis2, arrayList72.size(), i72, advise$default2, healthReadinessSignals32);
                        ArrayList arrayList82 = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        it6 = arrayList82.iterator();
                        if (it6.hasNext()) {
                        }
                        gymSessionEntity = (GymSessionEntity) next;
                        if (gymSessionEntity == null) {
                        }
                        gymSessionEntity2 = gymSessionEntity;
                        ArrayList arrayList92 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        it7 = arrayList92.iterator();
                        if (it7.hasNext()) {
                        }
                        RunEntity runEntity42 = (RunEntity) next2;
                        coachBriefLoader$load$1.L$0 = coachBriefLoader3;
                        coachBriefLoader$load$1.L$1 = list23;
                        coachBriefLoader$load$1.L$2 = list25;
                        zoneId7 = zoneId122;
                        coachBriefLoader$load$1.L$3 = zoneId7;
                        coachBriefLoader$load$1.L$4 = repository82;
                        coachBriefLoader$load$1.L$5 = list26;
                        coachBriefLoader$load$1.L$6 = map102;
                        trainingWeekView3 = trainingWeekView62;
                        coachBriefLoader$load$1.L$7 = trainingWeekView3;
                        coachBriefLoader$load$1.L$8 = healthReadinessSignals32;
                        coachBriefLoader$load$1.L$9 = advise$default2;
                        coachBriefLoader$load$1.L$10 = buildReadyAssessment2;
                        coachBriefLoader$load$1.L$11 = gymSessionEntity2;
                        coachBriefLoader$load$1.L$12 = runEntity42;
                        coachBriefLoader$load$1.J$0 = currentTimeMillis2;
                        coachBriefLoader$load$1.I$0 = i92;
                        coachBriefLoader$load$1.label = 6;
                        obj7 = repository82.muscleGroupLookup(coachBriefLoader$load$1);
                        if (obj7 != obj5) {
                        }
                        break;
                    case 6:
                        int i13 = coachBriefLoader$load$1.I$0;
                        long j14 = coachBriefLoader$load$1.J$0;
                        RunEntity runEntity5 = (RunEntity) coachBriefLoader$load$1.L$12;
                        GymSessionEntity gymSessionEntity12 = (GymSessionEntity) coachBriefLoader$load$1.L$11;
                        ReadyToTrainAssessment readyToTrainAssessment4 = (ReadyToTrainAssessment) coachBriefLoader$load$1.L$10;
                        DeloadAdvice deloadAdvice3 = (DeloadAdvice) coachBriefLoader$load$1.L$9;
                        HealthReadinessSignals healthReadinessSignals4 = (HealthReadinessSignals) coachBriefLoader$load$1.L$8;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView9 = (TrainingWeekPlanner.TrainingWeekView) coachBriefLoader$load$1.L$7;
                        Map map13 = (Map) coachBriefLoader$load$1.L$6;
                        List list50 = (List) coachBriefLoader$load$1.L$5;
                        Repository repository11 = (Repository) coachBriefLoader$load$1.L$4;
                        ZoneId zoneId13 = (ZoneId) coachBriefLoader$load$1.L$3;
                        i4 = i13;
                        List<RecoveryEventEntity> list51 = (List) coachBriefLoader$load$1.L$2;
                        List<RunEntity> list52 = (List) coachBriefLoader$load$1.L$1;
                        CoachBriefLoader coachBriefLoader10 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        obj6 = coroutine_suspended;
                        repository6 = repository11;
                        l = null;
                        coachBriefLoader3 = coachBriefLoader10;
                        trainingWeekView3 = trainingWeekView9;
                        map3 = map13;
                        gymSessionEntity2 = gymSessionEntity12;
                        readyToTrainAssessment = readyToTrainAssessment4;
                        deloadAdvice = deloadAdvice3;
                        zoneId7 = zoneId13;
                        list23 = list52;
                        runEntity = runEntity5;
                        j6 = j14;
                        list28 = list50;
                        healthReadinessSignals = healthReadinessSignals4;
                        list25 = list51;
                        Map map112 = (Map) obj7;
                        j7 = j6;
                        RunGymPeriodization runGymPeriodization32 = RunGymPeriodization.INSTANCE;
                        if (gymSessionEntity2 != null) {
                        }
                        break;
                    case 7:
                        int i14 = coachBriefLoader$load$1.I$0;
                        j8 = coachBriefLoader$load$1.J$0;
                        gymSessionEntity5 = (GymSessionEntity) coachBriefLoader$load$1.L$14;
                        runGymPeriodization2 = (RunGymPeriodization) coachBriefLoader$load$1.L$13;
                        Map map14 = (Map) coachBriefLoader$load$1.L$12;
                        RunEntity runEntity6 = (RunEntity) coachBriefLoader$load$1.L$11;
                        GymSessionEntity gymSessionEntity13 = (GymSessionEntity) coachBriefLoader$load$1.L$10;
                        ReadyToTrainAssessment readyToTrainAssessment5 = (ReadyToTrainAssessment) coachBriefLoader$load$1.L$9;
                        DeloadAdvice deloadAdvice4 = (DeloadAdvice) coachBriefLoader$load$1.L$8;
                        HealthReadinessSignals healthReadinessSignals5 = (HealthReadinessSignals) coachBriefLoader$load$1.L$7;
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView10 = (TrainingWeekPlanner.TrainingWeekView) coachBriefLoader$load$1.L$6;
                        Map map15 = (Map) coachBriefLoader$load$1.L$5;
                        List list53 = (List) coachBriefLoader$load$1.L$4;
                        i6 = i14;
                        ZoneId zoneId14 = (ZoneId) coachBriefLoader$load$1.L$3;
                        List<RecoveryEventEntity> list54 = (List) coachBriefLoader$load$1.L$2;
                        list32 = (List) coachBriefLoader$load$1.L$1;
                        coachBriefLoader5 = (CoachBriefLoader) coachBriefLoader$load$1.L$0;
                        ResultKt.throwOnFailure(obj7);
                        map5 = map15;
                        list29 = list53;
                        healthReadinessSignals = healthReadinessSignals5;
                        trainingWeekView3 = trainingWeekView10;
                        readyToTrainAssessment3 = readyToTrainAssessment5;
                        deloadAdvice = deloadAdvice4;
                        runEntity3 = runEntity6;
                        gymSessionEntity6 = gymSessionEntity13;
                        list25 = list54;
                        map6 = map14;
                        zoneId7 = zoneId14;
                        list30 = list32;
                        j7 = j8;
                        gymSessionEntity3 = gymSessionEntity5;
                        readyToTrainAssessment2 = readyToTrainAssessment3;
                        deloadAdvice2 = deloadAdvice;
                        healthReadinessSignals2 = healthReadinessSignals;
                        trainingWeekView4 = trainingWeekView3;
                        map3 = map5;
                        r4 = (List) obj7;
                        coachBriefLoader4 = coachBriefLoader5;
                        runGymPeriodization = runGymPeriodization2;
                        zoneId8 = zoneId7;
                        map4 = map6;
                        list31 = list25;
                        runEntity2 = runEntity3;
                        int i122 = i6;
                        gymSessionEntity4 = gymSessionEntity6;
                        i5 = i122;
                        if (r4 == 0) {
                        }
                        TrainingWeekPlanner.TrainingWeekView trainingWeekView722 = trainingWeekView4;
                        suggest = runGymPeriodization.suggest(gymSessionEntity3, r4, runEntity2, list31, new Function1() { // from class: com.example.rungps.ui.week.CoachBriefLoader$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj122) {
                                String load$lambda$15;
                                load$lambda$15 = CoachBriefLoader.load$lambda$15(map4, (String) obj122);
                                return load$lambda$15;
                            }
                        }, (r23 & 32) != 0 ? System.currentTimeMillis() : 0L, (r23 & 64) != 0 ? ZoneId.systemDefault() : zoneId8, (r23 & 128) != 0 ? 0 : i5);
                        long j1022 = j7 - 604800000;
                        ArrayList arrayList1022 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        it8 = arrayList1022.iterator();
                        double d222 = 0.0d;
                        while (it8.hasNext()) {
                        }
                        ArrayList arrayList1122 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        it9 = arrayList1122.iterator();
                        double d322 = 0.0d;
                        while (it9.hasNext()) {
                        }
                        fromTotals = CombinedLoadScore.INSTANCE.fromTotals(d222, d322, 0, (r19 & 8) != 0 ? SportTrackingPrefs.DEFAULT_NAME : null, (r19 & 16) != 0 ? 0.0d : 0.0d);
                        copy = r24.copy((r20 & 1) != 0 ? r24.readiness : null, (r20 & 2) != 0 ? r24.headline : null, (r20 & 4) != 0 ? r24.detail : null, (r20 & 8) != 0 ? r24.summary : null, (r20 & 16) != 0 ? r24.todayRun : null, (r20 & 32) != 0 ? r24.todayGym : null, (r20 & 64) != 0 ? r24.healthLines : null, (r20 & 128) != 0 ? r24.weekLine : null, (r20 & 256) != 0 ? DailyTrainingCoach.INSTANCE.advise(readyToTrainAssessment2, suggest, fromTotals, trainingWeekView722, healthReadinessSignals2, deloadAdvice2).contextLine : coachBriefLoader4.activityContextLine(runEntity2, gymSessionEntity4, zoneId8, j7));
                        return new Loaded(copy, trainingWeekView722);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        coachBriefLoader$load$1 = new CoachBriefLoader$load$1(coachBriefLoader6, continuation);
        Object obj72 = coachBriefLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (coachBriefLoader$load$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String load$lambda$15(Map map, String ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        String lowerCase = StringsKt.trim((CharSequence) ex).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return (String) map.get(lowerCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r11 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String activityContextLine(RunEntity lastRun, GymSessionEntity lastGym, ZoneId zone, long nowMs) {
        String str;
        Long endedAtMs;
        ArrayList arrayList = new ArrayList();
        if (lastRun != null && (endedAtMs = lastRun.getEndedAtMs()) != null) {
            long longValue = endedAtMs.longValue();
            double totalDistanceM = lastRun.getTotalDistanceM() / 1000.0d;
            if (totalDistanceM >= 0.3d) {
                String relativeDayLabel = INSTANCE.relativeDayLabel(longValue, zone, nowMs);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%.1f km run %s", Arrays.copyOf(new Object[]{Double.valueOf(totalDistanceM), relativeDayLabel}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                arrayList.add(format);
            }
        }
        if (lastGym != null) {
            Long endedAtMs2 = lastGym.getEndedAtMs();
            String relativeDayLabel2 = INSTANCE.relativeDayLabel(endedAtMs2 != null ? endedAtMs2.longValue() : lastGym.getStartedAtMs(), zone, nowMs);
            String notes = lastGym.getNotes();
            if (notes != null) {
                if (StringsKt.isBlank(notes)) {
                    notes = null;
                }
                if (notes != null) {
                    str = StringsKt.take(notes, 40);
                }
            }
            str = "gym session";
            arrayList.add(str + " " + relativeDayLabel2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return "Based on your " + arrayList.get(0) + ".";
        }
        return "Based on your " + arrayList.get(0) + " and " + arrayList.get(1) + ".";
    }

    private final String relativeDayLabel(long epochMs, ZoneId zone, long nowMs) {
        LocalDate localDate = Instant.ofEpochMilli(epochMs).atZone(zone).toLocalDate();
        long between = ChronoUnit.DAYS.between(localDate, Instant.ofEpochMilli(nowMs).atZone(zone).toLocalDate());
        if (between == 0) {
            return "today";
        }
        if (between == 1) {
            return "yesterday";
        }
        String lowerCase = localDate.getMonth().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(lowerCase.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder append = sb.append((Object) upperCase);
            String substring = lowerCase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            lowerCase = append.append(substring).toString();
        }
        return "on " + lowerCase + " " + localDate.getDayOfMonth();
    }
}
