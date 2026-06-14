package com.example.rungps.export;

import androidx.autofill.HintConstants;
import com.example.rungps.BuildConfig;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.tracking.TrackingService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;
import org.maplibre.android.style.layers.Property;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* compiled from: DataExporter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.export.DataExporter$buildExportJson$2", f = "DataExporter.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9}, l = {17, 18, 43, 44, 56, 63, 86, 96, BuildConfig.VERSION_CODE, 125}, m = "invokeSuspend", n = {"root", "gymArr", "root", "gymArr", "sess", "root", "runsArr", "root", "runsArr", "run", "root", "runsArr", "run", "splitsArr", "hrArr", "root", "runsArr", "run", "splitsArr", "hrArr", "root", "gearArr", "root", "gearArr", "g", "root", "soccerArr", "root", "sleepArr"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$4", "L$5", "L$0", "L$1", "L$3", "L$4", "L$5", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class DataExporter$buildExportJson$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Repository $repo;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataExporter$buildExportJson$2(Repository repository, Continuation<? super DataExporter$buildExportJson$2> continuation) {
        super(2, continuation);
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataExporter$buildExportJson$2(this.$repo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DataExporter$buildExportJson$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x064a A[LOOP:0: B:8:0x0644->B:10:0x064a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x05b0 A[LOOP:1: B:16:0x05aa->B:18:0x05b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x063c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030f A[LOOP:2: B:46:0x0309->B:48:0x030f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0379 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0388 A[LOOP:3: B:55:0x0382->B:57:0x0388, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff A[LOOP:4: B:72:0x01f9->B:74:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0298  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0533 -> B:23:0x0537). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x03d7 -> B:36:0x03d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01ec -> B:67:0x01ee). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        Object finishedGymSessions;
        JSONArray jSONArray2;
        Iterator it;
        JSONObject jSONObject2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object allRuns;
        JSONObject jSONObject3;
        JSONArray jSONArray3;
        GymSessionEntity gymSessionEntity;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj2;
        Iterator it2;
        Iterator it3;
        JSONArray jSONArray4;
        JSONObject jSONObject4;
        RunEntity runEntity;
        JSONObject jSONObject5;
        Object obj3;
        String str10;
        String str11;
        String str12;
        RunEntity runEntity2;
        JSONArray jSONArray5;
        Object obj4;
        JSONArray jSONArray6;
        String str13;
        String str14;
        Object hrSummaryForRun;
        RunEntity runEntity3;
        Iterator it4;
        String str15;
        String str16;
        String str17;
        String str18;
        JSONArray jSONArray7;
        Object allGearList;
        Iterator it5;
        JSONObject jSONObject6;
        String str19;
        JSONArray jSONArray8;
        Object allSoccerSessions;
        JSONObject put;
        Object gearTotalKm;
        JSONArray jSONArray9;
        GearEntity gearEntity;
        JSONArray jSONArray10;
        String str20;
        String str21;
        Object sleepSince;
        JSONArray jSONArray11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str22 = "startTimeMs";
        String str23 = "kind";
        String str24 = "hrMaxBpm";
        String str25 = "hrAvgBpm";
        String str26 = "durationMs";
        String str27 = "distanceM";
        String str28 = "endedAtMs";
        String str29 = "startedAtMs";
        String str30 = "notes";
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                jSONObject = new JSONObject();
                jSONObject.put("exportedAtMs", System.currentTimeMillis());
                jSONObject.put("version", 1);
                JSONArray jSONArray12 = new JSONArray();
                this.L$0 = jSONObject;
                this.L$1 = jSONArray12;
                jSONArray = jSONArray12;
                this.label = 1;
                finishedGymSessions = this.$repo.finishedGymSessions(this);
                if (finishedGymSessions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jSONArray2 = jSONArray;
                JSONObject jSONObject7 = jSONObject;
                it = ((List) finishedGymSessions).iterator();
                jSONObject2 = jSONObject7;
                if (!it.hasNext()) {
                    gymSessionEntity = (GymSessionEntity) it.next();
                    str6 = str22;
                    str7 = str24;
                    str8 = str25;
                    str9 = str27;
                    this.L$0 = jSONObject2;
                    this.L$1 = jSONArray2;
                    this.L$2 = it;
                    this.L$3 = gymSessionEntity;
                    Iterator it6 = it;
                    this.label = 2;
                    obj2 = this.$repo.setsForSession(gymSessionEntity.getId(), this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = it6;
                    JSONArray jSONArray13 = new JSONArray();
                    it2 = ((List) obj2).iterator();
                    while (it2.hasNext()) {
                        GymSetEntity gymSetEntity = (GymSetEntity) it2.next();
                        jSONArray13.put(new JSONObject().put("exerciseName", gymSetEntity.getExerciseName()).put("setIndex", gymSetEntity.getSetIndex()).put("reps", gymSetEntity.getReps()).put("weightKg", gymSetEntity.getWeightKg()).put("loggedAtMs", gymSetEntity.getLoggedAtMs()));
                        jSONObject2 = jSONObject2;
                        it2 = it2;
                        str26 = str26;
                    }
                    jSONArray2.put(new JSONObject().put("id", gymSessionEntity.getId()).put("startedAtMs", gymSessionEntity.getStartedAtMs()).put("endedAtMs", gymSessionEntity.getEndedAtMs()).put("freeDay", gymSessionEntity.getFreeDay()).put("notes", gymSessionEntity.getNotes()).put("sets", jSONArray13));
                    jSONObject2 = jSONObject2;
                    str22 = str6;
                    str24 = str7;
                    str25 = str8;
                    str27 = str9;
                    str26 = str26;
                    if (!it.hasNext()) {
                        str = str22;
                        str2 = str24;
                        str3 = str25;
                        str4 = str26;
                        str5 = str27;
                        jSONObject2.put("gymSessions", jSONArray2);
                        JSONArray jSONArray14 = new JSONArray();
                        this.L$0 = jSONObject2;
                        this.L$1 = jSONArray14;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        allRuns = this.$repo.allRuns(this);
                        if (allRuns == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jSONObject3 = jSONObject2;
                        jSONArray3 = jSONArray14;
                        it3 = ((List) allRuns).iterator();
                        jSONArray4 = jSONArray3;
                        jSONObject4 = jSONObject3;
                        if (!it3.hasNext()) {
                            runEntity = (RunEntity) it3.next();
                            this.L$0 = jSONObject4;
                            this.L$1 = jSONArray4;
                            this.L$2 = it3;
                            this.L$3 = runEntity;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.label = 4;
                            obj3 = this.$repo.splitsForRun(runEntity.getId(), this);
                            if (obj3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jSONObject5 = jSONObject4;
                            jSONArray5 = new JSONArray();
                            it4 = ((List) obj3).iterator();
                            while (it4.hasNext()) {
                                RunSplitEntity runSplitEntity = (RunSplitEntity) it4.next();
                                String str31 = str23;
                                String str32 = str5;
                                jSONArray5.put(new JSONObject().put(str23, runSplitEntity.getKind()).put("idx", runSplitEntity.getIdx()).put(str4, runSplitEntity.getDurationMs()).put(str32, runSplitEntity.getDistanceM()));
                                it4 = it4;
                                str23 = str31;
                            }
                            str10 = str23;
                            str11 = str4;
                            jSONArray6 = new JSONArray();
                            str12 = str30;
                            this.L$0 = jSONObject5;
                            this.L$1 = jSONArray4;
                            this.L$2 = it3;
                            this.L$3 = runEntity;
                            this.L$4 = jSONArray5;
                            this.L$5 = jSONArray6;
                            RunEntity runEntity4 = runEntity;
                            this.label = 5;
                            obj4 = this.$repo.hrSamplesForRun(runEntity.getId(), this);
                            if (obj4 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            runEntity2 = runEntity4;
                            for (RunHrSampleEntity runHrSampleEntity : (List) obj4) {
                                jSONArray6.put(new JSONObject().put("timeMs", runHrSampleEntity.getTimeMs()).put("bpm", runHrSampleEntity.getBpm()));
                                str28 = str28;
                                str29 = str29;
                            }
                            str13 = str28;
                            str14 = str29;
                            this.L$0 = jSONObject5;
                            this.L$1 = jSONArray4;
                            this.L$2 = it3;
                            this.L$3 = runEntity2;
                            this.L$4 = jSONArray5;
                            this.L$5 = jSONArray6;
                            this.label = 6;
                            hrSummaryForRun = this.$repo.hrSummaryForRun(runEntity2.getId(), this);
                            if (hrSummaryForRun != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            jSONObject4 = jSONObject5;
                            runEntity3 = runEntity2;
                            Pair pair = (Pair) hrSummaryForRun;
                            Integer num = (Integer) pair.component1();
                            String str33 = str14;
                            Iterator it7 = it3;
                            String str34 = str5;
                            jSONArray4.put(new JSONObject().put("id", runEntity3.getId()).put(str33, runEntity3.getStartedAtMs()).put(str13, runEntity3.getEndedAtMs()).put(str34, runEntity3.getTotalDistanceM()).put(str11, runEntity3.getTotalDurationMs()).put(TrackingService.EXTRA_ACTIVITY_TYPE, runEntity3.getActivityType()).put("watchImportId", runEntity3.getWatchImportId()).put("title", runEntity3.getTitle()).put("description", runEntity3.getDescription()).put("privateNotes", runEntity3.getPrivateNotes()).put("gearId", runEntity3.getGearId()).put(str3, num).put(str2, (Integer) pair.component2()).put("hrSamples", jSONArray6).put("kmSplits", jSONArray5));
                            str29 = str33;
                            str30 = str12;
                            str28 = str13;
                            it3 = it7;
                            str4 = str11;
                            str23 = str10;
                            if (!it3.hasNext()) {
                                str15 = str23;
                                str16 = str30;
                                str17 = str2;
                                str18 = str3;
                                jSONObject4.put("runs", jSONArray4);
                                jSONArray7 = new JSONArray();
                                this.L$0 = jSONObject4;
                                this.L$1 = jSONArray7;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.label = 7;
                                allGearList = this.$repo.allGearList(this);
                                if (allGearList == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it5 = ((List) allGearList).iterator();
                                jSONObject6 = jSONObject4;
                                if (!it5.hasNext()) {
                                    GearEntity gearEntity2 = (GearEntity) it5.next();
                                    put = new JSONObject().put("id", gearEntity2.getId()).put("gearType", gearEntity2.getGearType()).put(HintConstants.AUTOFILL_HINT_NAME, gearEntity2.getName()).put("brand", gearEntity2.getBrand()).put("model", gearEntity2.getModel()).put("purchaseDateMs", gearEntity2.getPurchaseDateMs()).put("startingOdometerKm", gearEntity2.getStartingOdometerKm());
                                    this.L$0 = jSONObject6;
                                    this.L$1 = jSONArray7;
                                    this.L$2 = it5;
                                    this.L$3 = gearEntity2;
                                    this.L$4 = jSONArray7;
                                    this.L$5 = put;
                                    this.L$6 = "totalKm";
                                    this.label = 8;
                                    gearTotalKm = this.$repo.gearTotalKm(gearEntity2.getId(), this);
                                    if (gearTotalKm == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    jSONArray9 = jSONArray7;
                                    gearEntity = gearEntity2;
                                    jSONArray10 = jSONArray9;
                                    str20 = "totalKm";
                                    jSONArray10.put(put.put(str20, ((Number) gearTotalKm).doubleValue()).put(str16, gearEntity.getNotes()).put("isRetired", gearEntity.isRetired()).put("isDefaultForRun", gearEntity.isDefaultForRun()).put("isDefaultForRide", gearEntity.isDefaultForRide()).put("parentGearId", gearEntity.getParentGearId()));
                                    jSONArray7 = jSONArray9;
                                    if (!it5.hasNext()) {
                                        str19 = str16;
                                        jSONObject6.put("gear", jSONArray7);
                                        jSONArray8 = new JSONArray();
                                        this.L$0 = jSONObject6;
                                        this.L$1 = jSONArray8;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.label = 9;
                                        allSoccerSessions = this.$repo.allSoccerSessions(this);
                                        if (allSoccerSessions == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        for (SoccerSessionEntity soccerSessionEntity : (List) allSoccerSessions) {
                                            String str35 = str;
                                            jSONArray8.put(new JSONObject().put("id", soccerSessionEntity.getId()).put(str15, soccerSessionEntity.getKind()).put(str35, soccerSessionEntity.getStartTimeMs()).put("playMin", soccerSessionEntity.getPlayMin()).put("intensity", soccerSessionEntity.getIntensity()).put(str18, soccerSessionEntity.getHrAvgBpm()).put(str17, soccerSessionEntity.getHrMaxBpm()).put(str19, soccerSessionEntity.getNotes()).put("watchSessionId", soccerSessionEntity.getWatchSessionId()));
                                        }
                                        str21 = str;
                                        jSONObject6.put("soccerSessions", jSONArray8);
                                        JSONArray jSONArray15 = new JSONArray();
                                        long currentTimeMillis = System.currentTimeMillis() - OpenStreetMapTileProviderConstants.ONE_YEAR;
                                        this.L$0 = jSONObject6;
                                        this.L$1 = jSONArray15;
                                        this.label = 10;
                                        sleepSince = this.$repo.sleepSince(currentTimeMillis, this);
                                        if (sleepSince != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        jSONArray11 = jSONArray15;
                                        for (SleepEntryEntity sleepEntryEntity : (List) sleepSince) {
                                            jSONArray11.put(new JSONObject().put(str21, sleepEntryEntity.getStartTimeMs()).put("endTimeMs", sleepEntryEntity.getEndTimeMs()).put("totalSleepMin", sleepEntryEntity.getTotalSleepMin()).put("sleepEfficiency", sleepEntryEntity.getSleepEfficiency()).put("sleepQuality", sleepEntryEntity.getSleepQuality()).put(Property.SYMBOL_Z_ORDER_SOURCE, sleepEntryEntity.getSource()).put("osaRiskHint", sleepEntryEntity.getOsaRiskHint()).put("sleepAnalyticsJson", sleepEntryEntity.getSleepAnalyticsJson()));
                                        }
                                        jSONObject6.put("sleep", jSONArray11);
                                        return jSONObject6.toString(2);
                                    }
                                }
                            }
                        }
                    }
                }
            case 1:
                JSONArray jSONArray16 = (JSONArray) this.L$1;
                jSONObject = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                jSONArray = jSONArray16;
                finishedGymSessions = obj;
                jSONArray2 = jSONArray;
                JSONObject jSONObject72 = jSONObject;
                it = ((List) finishedGymSessions).iterator();
                jSONObject2 = jSONObject72;
                if (!it.hasNext()) {
                }
                break;
            case 2:
                GymSessionEntity gymSessionEntity2 = (GymSessionEntity) this.L$3;
                it = (Iterator) this.L$2;
                jSONArray2 = (JSONArray) this.L$1;
                JSONObject jSONObject8 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str6 = "startTimeMs";
                str7 = "hrMaxBpm";
                str8 = "hrAvgBpm";
                str9 = "distanceM";
                obj2 = obj;
                gymSessionEntity = gymSessionEntity2;
                jSONObject2 = jSONObject8;
                JSONArray jSONArray132 = new JSONArray();
                it2 = ((List) obj2).iterator();
                while (it2.hasNext()) {
                }
                jSONArray2.put(new JSONObject().put("id", gymSessionEntity.getId()).put("startedAtMs", gymSessionEntity.getStartedAtMs()).put("endedAtMs", gymSessionEntity.getEndedAtMs()).put("freeDay", gymSessionEntity.getFreeDay()).put("notes", gymSessionEntity.getNotes()).put("sets", jSONArray132));
                jSONObject2 = jSONObject2;
                str22 = str6;
                str24 = str7;
                str25 = str8;
                str27 = str9;
                str26 = str26;
                if (!it.hasNext()) {
                }
                break;
            case 3:
                jSONArray3 = (JSONArray) this.L$1;
                JSONObject jSONObject9 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = "startTimeMs";
                jSONObject3 = jSONObject9;
                str2 = "hrMaxBpm";
                str3 = "hrAvgBpm";
                str4 = "durationMs";
                str5 = "distanceM";
                allRuns = obj;
                it3 = ((List) allRuns).iterator();
                jSONArray4 = jSONArray3;
                jSONObject4 = jSONObject3;
                if (!it3.hasNext()) {
                }
                break;
            case 4:
                runEntity = (RunEntity) this.L$3;
                it3 = (Iterator) this.L$2;
                jSONArray4 = (JSONArray) this.L$1;
                jSONObject5 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = "startTimeMs";
                str2 = "hrMaxBpm";
                str3 = "hrAvgBpm";
                str4 = "durationMs";
                str5 = "distanceM";
                obj3 = obj;
                jSONArray5 = new JSONArray();
                it4 = ((List) obj3).iterator();
                while (it4.hasNext()) {
                }
                str10 = str23;
                str11 = str4;
                jSONArray6 = new JSONArray();
                str12 = str30;
                this.L$0 = jSONObject5;
                this.L$1 = jSONArray4;
                this.L$2 = it3;
                this.L$3 = runEntity;
                this.L$4 = jSONArray5;
                this.L$5 = jSONArray6;
                RunEntity runEntity42 = runEntity;
                this.label = 5;
                obj4 = this.$repo.hrSamplesForRun(runEntity.getId(), this);
                if (obj4 != coroutine_suspended) {
                }
                break;
            case 5:
                JSONArray jSONArray17 = (JSONArray) this.L$5;
                JSONArray jSONArray18 = (JSONArray) this.L$4;
                RunEntity runEntity5 = (RunEntity) this.L$3;
                Iterator it8 = (Iterator) this.L$2;
                JSONArray jSONArray19 = (JSONArray) this.L$1;
                JSONObject jSONObject10 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str10 = "kind";
                str3 = "hrAvgBpm";
                str11 = "durationMs";
                str5 = "distanceM";
                str12 = "notes";
                runEntity2 = runEntity5;
                jSONArray4 = jSONArray19;
                str2 = "hrMaxBpm";
                jSONArray5 = jSONArray18;
                it3 = it8;
                jSONObject5 = jSONObject10;
                obj4 = obj;
                str = "startTimeMs";
                jSONArray6 = jSONArray17;
                while (r2.hasNext()) {
                }
                str13 = str28;
                str14 = str29;
                this.L$0 = jSONObject5;
                this.L$1 = jSONArray4;
                this.L$2 = it3;
                this.L$3 = runEntity2;
                this.L$4 = jSONArray5;
                this.L$5 = jSONArray6;
                this.label = 6;
                hrSummaryForRun = this.$repo.hrSummaryForRun(runEntity2.getId(), this);
                if (hrSummaryForRun != coroutine_suspended) {
                }
                break;
            case 6:
                JSONArray jSONArray20 = (JSONArray) this.L$5;
                JSONArray jSONArray21 = (JSONArray) this.L$4;
                runEntity3 = (RunEntity) this.L$3;
                it3 = (Iterator) this.L$2;
                JSONArray jSONArray22 = (JSONArray) this.L$1;
                JSONObject jSONObject11 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str10 = "kind";
                str3 = "hrAvgBpm";
                str11 = "durationMs";
                str5 = "distanceM";
                str13 = "endedAtMs";
                str14 = "startedAtMs";
                str12 = "notes";
                jSONObject4 = jSONObject11;
                hrSummaryForRun = obj;
                str = "startTimeMs";
                jSONArray6 = jSONArray20;
                str2 = "hrMaxBpm";
                jSONArray5 = jSONArray21;
                jSONArray4 = jSONArray22;
                Pair pair2 = (Pair) hrSummaryForRun;
                Integer num2 = (Integer) pair2.component1();
                String str332 = str14;
                Iterator it72 = it3;
                String str342 = str5;
                jSONArray4.put(new JSONObject().put("id", runEntity3.getId()).put(str332, runEntity3.getStartedAtMs()).put(str13, runEntity3.getEndedAtMs()).put(str342, runEntity3.getTotalDistanceM()).put(str11, runEntity3.getTotalDurationMs()).put(TrackingService.EXTRA_ACTIVITY_TYPE, runEntity3.getActivityType()).put("watchImportId", runEntity3.getWatchImportId()).put("title", runEntity3.getTitle()).put("description", runEntity3.getDescription()).put("privateNotes", runEntity3.getPrivateNotes()).put("gearId", runEntity3.getGearId()).put(str3, num2).put(str2, (Integer) pair2.component2()).put("hrSamples", jSONArray6).put("kmSplits", jSONArray5));
                str29 = str332;
                str30 = str12;
                str28 = str13;
                it3 = it72;
                str4 = str11;
                str23 = str10;
                if (!it3.hasNext()) {
                }
                break;
            case 7:
                jSONArray7 = (JSONArray) this.L$1;
                jSONObject4 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = "startTimeMs";
                str15 = "kind";
                str17 = "hrMaxBpm";
                str18 = "hrAvgBpm";
                str16 = "notes";
                allGearList = obj;
                it5 = ((List) allGearList).iterator();
                jSONObject6 = jSONObject4;
                if (!it5.hasNext()) {
                }
                break;
            case 8:
                str20 = (String) this.L$6;
                put = (JSONObject) this.L$5;
                JSONArray jSONArray23 = (JSONArray) this.L$4;
                GearEntity gearEntity3 = (GearEntity) this.L$3;
                it5 = (Iterator) this.L$2;
                jSONArray9 = (JSONArray) this.L$1;
                jSONObject6 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = "startTimeMs";
                str15 = "kind";
                jSONArray10 = jSONArray23;
                gearEntity = gearEntity3;
                str16 = "notes";
                gearTotalKm = obj;
                str17 = "hrMaxBpm";
                str18 = "hrAvgBpm";
                jSONArray10.put(put.put(str20, ((Number) gearTotalKm).doubleValue()).put(str16, gearEntity.getNotes()).put("isRetired", gearEntity.isRetired()).put("isDefaultForRun", gearEntity.isDefaultForRun()).put("isDefaultForRide", gearEntity.isDefaultForRide()).put("parentGearId", gearEntity.getParentGearId()));
                jSONArray7 = jSONArray9;
                if (!it5.hasNext()) {
                }
                break;
            case 9:
                jSONArray8 = (JSONArray) this.L$1;
                JSONObject jSONObject12 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = "startTimeMs";
                str15 = "kind";
                str17 = "hrMaxBpm";
                str18 = "hrAvgBpm";
                jSONObject6 = jSONObject12;
                str19 = "notes";
                allSoccerSessions = obj;
                while (r3.hasNext()) {
                }
                str21 = str;
                jSONObject6.put("soccerSessions", jSONArray8);
                JSONArray jSONArray152 = new JSONArray();
                long currentTimeMillis2 = System.currentTimeMillis() - OpenStreetMapTileProviderConstants.ONE_YEAR;
                this.L$0 = jSONObject6;
                this.L$1 = jSONArray152;
                this.label = 10;
                sleepSince = this.$repo.sleepSince(currentTimeMillis2, this);
                if (sleepSince != coroutine_suspended) {
                }
                break;
            case 10:
                jSONArray11 = (JSONArray) this.L$1;
                JSONObject jSONObject13 = (JSONObject) this.L$0;
                ResultKt.throwOnFailure(obj);
                jSONObject6 = jSONObject13;
                str21 = "startTimeMs";
                sleepSince = obj;
                while (r0.hasNext()) {
                }
                jSONObject6.put("sleep", jSONArray11);
                return jSONObject6.toString(2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
