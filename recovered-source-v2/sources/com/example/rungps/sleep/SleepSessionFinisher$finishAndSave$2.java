package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepHealthFusion;
import com.example.rungps.sleep.SleepNapDetector;
import com.example.rungps.sleep.SleepOsaRiskScorer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepSessionFinisher.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/SleepEntryEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepSessionFinisher$finishAndSave$2", f = "SleepSessionFinisher.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2}, l = {32, 35, 135}, m = "invokeSuspend", n = {"samples", "usedSmartAlarm", "started", "ended", "samples", "fused", "analysis", "usedSmartAlarm", "started", "ended", "inBedMin", "entry"}, s = {"L$0", "Z$0", "J$0", "J$1", "L$0", "L$1", "L$2", "Z$0", "J$0", "J$1", "I$0", "L$0"})
/* loaded from: classes3.dex */
final class SleepSessionFinisher$finishAndSave$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepEntryEntity>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Long $endTimeMs;
    final /* synthetic */ Boolean $smartAlarmUsed;
    final /* synthetic */ Integer $wakeMood;
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepSessionFinisher$finishAndSave$2(Context context, Boolean bool, Long l, Integer num, Continuation<? super SleepSessionFinisher$finishAndSave$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$smartAlarmUsed = bool;
        this.$endTimeMs = l;
        this.$wakeMood = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepSessionFinisher$finishAndSave$2(this.$context, this.$smartAlarmUsed, this.$endTimeMs, this.$wakeMood, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepEntryEntity> continuation) {
        return ((SleepSessionFinisher$finishAndSave$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0167 A[LOOP:0: B:14:0x0161->B:16:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a5 A[LOOP:1: B:19:0x019f->B:21:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022f A[LOOP:2: B:24:0x0229->B:26:0x022f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        Object finishMicNight;
        List list;
        long j;
        long j2;
        Object sleepSince;
        boolean z;
        int i;
        OvernightAnalysis overnightAnalysis;
        long j3;
        SleepHealthFusion.FusedNight fusedNight;
        long j4;
        Iterator it;
        Iterator it2;
        int resolveQuality;
        Iterator it3;
        ArrayList arrayList;
        SleepOsaRiskScorer.Result scoreRecentNights;
        SleepAnalyticsCompact parse;
        Integer num;
        int i2;
        Integer num2;
        String buildNotes;
        SleepEntryEntity sleepEntryEntity;
        SleepSessionFinisher$finishAndSave$2 sleepSessionFinisher$finishAndSave$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!SleepOvernightStore.INSTANCE.isActive(this.$context)) {
                return null;
            }
            Boolean bool = this.$smartAlarmUsed;
            booleanValue = bool != null ? bool.booleanValue() : SleepOvernightStore.INSTANCE.smartAlarm(this.$context);
            long startedAtMs = SleepOvernightStore.INSTANCE.startedAtMs(this.$context);
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.$endTimeMs;
            long coerceIn = RangesKt.coerceIn(l != null ? l.longValue() : currentTimeMillis, startedAtMs + 60000, currentTimeMillis);
            if (startedAtMs <= 0 || coerceIn <= startedAtMs) {
                SleepOvernightStore.INSTANCE.clearSession(this.$context, false);
                SleepListenService.INSTANCE.stop(this.$context);
                return null;
            }
            List<SleepTrackSample> loadSamples = SleepOvernightStore.INSTANCE.loadSamples(this.$context);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : loadSamples) {
                if (startedAtMs + ((SleepTrackSample) obj2).getElapsedMs() <= coerceIn) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = arrayList2;
            this.L$0 = arrayList3;
            this.Z$0 = booleanValue;
            this.J$0 = startedAtMs;
            this.J$1 = coerceIn;
            this.label = 1;
            finishMicNight = SleepHealthFusion.INSTANCE.finishMicNight(this.$context, arrayList3, startedAtMs, coerceIn, booleanValue, this);
            if (finishMicNight == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList3;
            j = coerceIn;
            j2 = startedAtMs;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sleepEntryEntity = (SleepEntryEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    sleepSessionFinisher$finishAndSave$2 = this;
                    SleepOvernightStore.INSTANCE.clearSession(sleepSessionFinisher$finishAndSave$2.$context, true);
                    SleepListenService.INSTANCE.stop(sleepSessionFinisher$finishAndSave$2.$context);
                    return sleepEntryEntity;
                }
                i = this.I$0;
                long j5 = this.J$1;
                long j6 = this.J$0;
                boolean z2 = this.Z$0;
                OvernightAnalysis overnightAnalysis2 = (OvernightAnalysis) this.L$2;
                fusedNight = (SleepHealthFusion.FusedNight) this.L$1;
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                j3 = j6;
                z = z2;
                sleepSince = obj;
                overnightAnalysis = overnightAnalysis2;
                j4 = j5;
                List list2 = (List) sleepSince;
                ZoneId systemDefault = ZoneId.systemDefault();
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(systemDefault);
                    arrayList4.add(Boxing.boxInt((atZone.getHour() * 60) + atZone.getMinute()));
                }
                ArrayList arrayList5 = arrayList4;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(systemDefault);
                    arrayList6.add(Boxing.boxInt((atZone2.getHour() * 60) + atZone2.getMinute()));
                }
                SleepScoring.SleepScorePillars computeScorePillars = SleepScoring.INSTANCE.computeScorePillars(overnightAnalysis.getTotalSleepMin(), i, overnightAnalysis.getEfficiency(), overnightAnalysis.getRestlessnessIndex(), arrayList5, arrayList6);
                resolveQuality = SleepScoring.INSTANCE.resolveQuality("rungps_overnight", overnightAnalysis.getTotalSleepMin(), (r18 & 4) != 0 ? null : Boxing.boxInt(overnightAnalysis.getDeepSleepMin()), (r18 & 8) != 0 ? null : Boxing.boxInt(overnightAnalysis.getLightSleepMin()), (r18 & 16) != 0 ? null : Boxing.boxInt(overnightAnalysis.getEfficiency()), (r18 & 32) != 0 ? null : Boxing.boxInt(i), (r18 & 64) != 0 ? null : null);
                List list4 = list;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(Boxing.boxFloat(((SleepTrackSample) it3.next()).getBreathRegularity()));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : arrayList7) {
                    if (((Number) obj3).floatValue() > 0.05f) {
                        arrayList8.add(obj3);
                    }
                }
                arrayList = arrayList8;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                String str = arrayList == null ? "Breath regularity " + RangesKt.coerceIn((int) (((float) CollectionsKt.averageOfFloat(arrayList)) * 100.0f), 0, 100) + "%" : null;
                double debtHours = SleepDebtTracker.analyze$default(SleepDebtTracker.INSTANCE, list2, 0.0d, 0, 0, null, 30, null).getDebtHours();
                int consistencyScore = SleepConsistencyScorer.analyze$default(SleepConsistencyScorer.INSTANCE, list2, 0, null, 6, null).getConsistencyScore();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj4 : list3) {
                    if (Intrinsics.areEqual(((SleepEntryEntity) obj4).getSource(), "rungps_overnight")) {
                        arrayList9.add(obj4);
                    }
                }
                scoreRecentNights = SleepOsaRiskScorer.INSTANCE.scoreRecentNights(CollectionsKt.plus((Collection) arrayList9, (Iterable) CollectionsKt.listOf(new SleepEntryEntity(0L, j3, j4, overnightAnalysis.getTotalSleepMin(), null, null, null, null, "rungps_overnight", null, null, null, null, null, null, false, null, null, null, null, null, null, null, fusedNight.getMicCoverageRatio(), null, null, fusedNight.getOsaRiskHint(), null, null, fusedNight.getSleepAnalyticsJson(), 461373169, null))), SleepListenPreferences.INSTANCE.sleptAlone(this.$context));
                parse = SleepAnalyticsCompact.INSTANCE.parse(fusedNight.getSleepAnalyticsJson());
                if (parse != null || (r9 = SleepAnalyticsCompact.copy$default(parse, null, null, null, scoreRecentNights.getTier().name(), 7, null)) == null) {
                    SleepAnalyticsCompact sleepAnalyticsCompact = new SleepAnalyticsCompact(null, null, null, scoreRecentNights.getTier().name(), 7, null);
                }
                long j7 = j4;
                SleepNapDetector.NapHint analyze$default = SleepNapDetector.analyze$default(SleepNapDetector.INSTANCE, new SleepEntryEntity(0L, j3, j4, overnightAnalysis.getTotalSleepMin(), null, null, null, null, "rungps_overnight", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741553, null), null, 2, null);
                int coerceAtLeast = RangesKt.coerceAtLeast(overnightAnalysis.getTotalSleepMin(), 0);
                int deepSleepMin = overnightAnalysis.getDeepSleepMin();
                int lightSleepMin = overnightAnalysis.getLightSleepMin();
                int remSleepMin = overnightAnalysis.getRemSleepMin();
                int efficiency = overnightAnalysis.getEfficiency();
                num = this.$wakeMood;
                if (num == null) {
                    i2 = consistencyScore;
                    num2 = Boxing.boxInt(RangesKt.coerceIn(num.intValue(), 1, 5));
                } else {
                    i2 = consistencyScore;
                    num2 = null;
                }
                int snoreEvents = overnightAnalysis.getSnoreEvents();
                int awakeSleepMin = overnightAnalysis.getAwakeSleepMin();
                int restlessnessIndex = overnightAnalysis.getRestlessnessIndex();
                int timeToFallAsleepMin = overnightAnalysis.getTimeToFallAsleepMin();
                int routine = computeScorePillars.getRoutine();
                int quality = computeScorePillars.getQuality();
                int duration = computeScorePillars.getDuration();
                String hypnogramCompact = fusedNight.getHypnogramCompact();
                String eventMarkersCompact = fusedNight.getEventMarkersCompact();
                Float stageConfidenceMean = fusedNight.getStageConfidenceMean();
                Float micCoverageRatio = fusedNight.getMicCoverageRatio();
                String fusionSource = fusedNight.getFusionSource();
                Float breathRateMean = fusedNight.getBreathRateMean();
                String osaRiskHint = fusedNight.getOsaRiskHint();
                String json = sleepAnalyticsCompact.toJson();
                buildNotes = SleepSessionFinisher.INSTANCE.buildNotes(overnightAnalysis, z, fusedNight.getFusionNote(), str, fusedNight, analyze$default, scoreRecentNights);
                sleepEntryEntity = new SleepEntryEntity(0L, j3, j7, coerceAtLeast, Boxing.boxInt(deepSleepMin), Boxing.boxInt(lightSleepMin), Boxing.boxInt(efficiency), Boxing.boxInt(resolveQuality), "rungps_overnight", buildNotes, num2, Boxing.boxInt(snoreEvents), Boxing.boxInt(awakeSleepMin), Boxing.boxInt(restlessnessIndex), Boxing.boxInt(remSleepMin), z, Boxing.boxInt(timeToFallAsleepMin), Boxing.boxInt(routine), Boxing.boxInt(quality), Boxing.boxInt(duration), hypnogramCompact, eventMarkersCompact, stageConfidenceMean, micCoverageRatio, fusionSource, breathRateMean, osaRiskHint, Boxing.boxFloat((float) debtHours), Boxing.boxInt(i2), json, 1, null);
                sleepSessionFinisher$finishAndSave$2 = this;
                sleepSessionFinisher$finishAndSave$2.L$0 = sleepEntryEntity;
                sleepSessionFinisher$finishAndSave$2.L$1 = null;
                sleepSessionFinisher$finishAndSave$2.L$2 = null;
                sleepSessionFinisher$finishAndSave$2.label = 3;
                if (Repository.INSTANCE.get(sleepSessionFinisher$finishAndSave$2.$context).addSleepEntry(sleepEntryEntity, sleepSessionFinisher$finishAndSave$2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SleepOvernightStore.INSTANCE.clearSession(sleepSessionFinisher$finishAndSave$2.$context, true);
                SleepListenService.INSTANCE.stop(sleepSessionFinisher$finishAndSave$2.$context);
                return sleepEntryEntity;
            }
            long j8 = this.J$1;
            long j9 = this.J$0;
            booleanValue = this.Z$0;
            List list5 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            list = list5;
            j2 = j9;
            j = j8;
            finishMicNight = obj;
        }
        SleepHealthFusion.FusedNight fusedNight2 = (SleepHealthFusion.FusedNight) finishMicNight;
        OvernightAnalysis analysis = fusedNight2.getAnalysis();
        int coerceAtLeast2 = RangesKt.coerceAtLeast((int) ((j - j2) / 60000), 1);
        this.L$0 = list;
        this.L$1 = fusedNight2;
        this.L$2 = analysis;
        this.Z$0 = booleanValue;
        this.J$0 = j2;
        this.J$1 = j;
        this.I$0 = coerceAtLeast2;
        this.label = 2;
        sleepSince = Repository.INSTANCE.get(this.$context).sleepSince(j2 - 1209600000, this);
        if (sleepSince == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = booleanValue;
        i = coerceAtLeast2;
        overnightAnalysis = analysis;
        j3 = j2;
        fusedNight = fusedNight2;
        j4 = j;
        List list22 = (List) sleepSince;
        ZoneId systemDefault2 = ZoneId.systemDefault();
        List list32 = list22;
        ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList52 = arrayList42;
        ArrayList arrayList62 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
        it2 = list32.iterator();
        while (it2.hasNext()) {
        }
        SleepScoring.SleepScorePillars computeScorePillars2 = SleepScoring.INSTANCE.computeScorePillars(overnightAnalysis.getTotalSleepMin(), i, overnightAnalysis.getEfficiency(), overnightAnalysis.getRestlessnessIndex(), arrayList52, arrayList62);
        resolveQuality = SleepScoring.INSTANCE.resolveQuality("rungps_overnight", overnightAnalysis.getTotalSleepMin(), (r18 & 4) != 0 ? null : Boxing.boxInt(overnightAnalysis.getDeepSleepMin()), (r18 & 8) != 0 ? null : Boxing.boxInt(overnightAnalysis.getLightSleepMin()), (r18 & 16) != 0 ? null : Boxing.boxInt(overnightAnalysis.getEfficiency()), (r18 & 32) != 0 ? null : Boxing.boxInt(i), (r18 & 64) != 0 ? null : null);
        List list42 = list;
        ArrayList arrayList72 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
        it3 = list42.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList82 = new ArrayList();
        while (r6.hasNext()) {
        }
        arrayList = arrayList82;
        if (arrayList.isEmpty()) {
        }
        if (arrayList == null) {
        }
        double debtHours2 = SleepDebtTracker.analyze$default(SleepDebtTracker.INSTANCE, list22, 0.0d, 0, 0, null, 30, null).getDebtHours();
        int consistencyScore2 = SleepConsistencyScorer.analyze$default(SleepConsistencyScorer.INSTANCE, list22, 0, null, 6, null).getConsistencyScore();
        ArrayList arrayList92 = new ArrayList();
        while (r10.hasNext()) {
        }
        scoreRecentNights = SleepOsaRiskScorer.INSTANCE.scoreRecentNights(CollectionsKt.plus((Collection) arrayList92, (Iterable) CollectionsKt.listOf(new SleepEntryEntity(0L, j3, j4, overnightAnalysis.getTotalSleepMin(), null, null, null, null, "rungps_overnight", null, null, null, null, null, null, false, null, null, null, null, null, null, null, fusedNight.getMicCoverageRatio(), null, null, fusedNight.getOsaRiskHint(), null, null, fusedNight.getSleepAnalyticsJson(), 461373169, null))), SleepListenPreferences.INSTANCE.sleptAlone(this.$context));
        parse = SleepAnalyticsCompact.INSTANCE.parse(fusedNight.getSleepAnalyticsJson());
        if (parse != null) {
        }
        SleepAnalyticsCompact sleepAnalyticsCompact2 = new SleepAnalyticsCompact(null, null, null, scoreRecentNights.getTier().name(), 7, null);
        long j72 = j4;
        SleepNapDetector.NapHint analyze$default2 = SleepNapDetector.analyze$default(SleepNapDetector.INSTANCE, new SleepEntryEntity(0L, j3, j4, overnightAnalysis.getTotalSleepMin(), null, null, null, null, "rungps_overnight", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741553, null), null, 2, null);
        int coerceAtLeast3 = RangesKt.coerceAtLeast(overnightAnalysis.getTotalSleepMin(), 0);
        int deepSleepMin2 = overnightAnalysis.getDeepSleepMin();
        int lightSleepMin2 = overnightAnalysis.getLightSleepMin();
        int remSleepMin2 = overnightAnalysis.getRemSleepMin();
        int efficiency2 = overnightAnalysis.getEfficiency();
        num = this.$wakeMood;
        if (num == null) {
        }
        int snoreEvents2 = overnightAnalysis.getSnoreEvents();
        int awakeSleepMin2 = overnightAnalysis.getAwakeSleepMin();
        int restlessnessIndex2 = overnightAnalysis.getRestlessnessIndex();
        int timeToFallAsleepMin2 = overnightAnalysis.getTimeToFallAsleepMin();
        int routine2 = computeScorePillars2.getRoutine();
        int quality2 = computeScorePillars2.getQuality();
        int duration2 = computeScorePillars2.getDuration();
        String hypnogramCompact2 = fusedNight.getHypnogramCompact();
        String eventMarkersCompact2 = fusedNight.getEventMarkersCompact();
        Float stageConfidenceMean2 = fusedNight.getStageConfidenceMean();
        Float micCoverageRatio2 = fusedNight.getMicCoverageRatio();
        String fusionSource2 = fusedNight.getFusionSource();
        Float breathRateMean2 = fusedNight.getBreathRateMean();
        String osaRiskHint2 = fusedNight.getOsaRiskHint();
        String json2 = sleepAnalyticsCompact2.toJson();
        buildNotes = SleepSessionFinisher.INSTANCE.buildNotes(overnightAnalysis, z, fusedNight.getFusionNote(), str, fusedNight, analyze$default2, scoreRecentNights);
        sleepEntryEntity = new SleepEntryEntity(0L, j3, j72, coerceAtLeast3, Boxing.boxInt(deepSleepMin2), Boxing.boxInt(lightSleepMin2), Boxing.boxInt(efficiency2), Boxing.boxInt(resolveQuality), "rungps_overnight", buildNotes, num2, Boxing.boxInt(snoreEvents2), Boxing.boxInt(awakeSleepMin2), Boxing.boxInt(restlessnessIndex2), Boxing.boxInt(remSleepMin2), z, Boxing.boxInt(timeToFallAsleepMin2), Boxing.boxInt(routine2), Boxing.boxInt(quality2), Boxing.boxInt(duration2), hypnogramCompact2, eventMarkersCompact2, stageConfidenceMean2, micCoverageRatio2, fusionSource2, breathRateMean2, osaRiskHint2, Boxing.boxFloat((float) debtHours2), Boxing.boxInt(i2), json2, 1, null);
        sleepSessionFinisher$finishAndSave$2 = this;
        sleepSessionFinisher$finishAndSave$2.L$0 = sleepEntryEntity;
        sleepSessionFinisher$finishAndSave$2.L$1 = null;
        sleepSessionFinisher$finishAndSave$2.L$2 = null;
        sleepSessionFinisher$finishAndSave$2.label = 3;
        if (Repository.INSTANCE.get(sleepSessionFinisher$finishAndSave$2.$context).addSleepEntry(sleepEntryEntity, sleepSessionFinisher$finishAndSave$2) == coroutine_suspended) {
        }
        SleepOvernightStore.INSTANCE.clearSession(sleepSessionFinisher$finishAndSave$2.$context, true);
        SleepListenService.INSTANCE.stop(sleepSessionFinisher$finishAndSave$2.$context);
        return sleepEntryEntity;
    }
}
