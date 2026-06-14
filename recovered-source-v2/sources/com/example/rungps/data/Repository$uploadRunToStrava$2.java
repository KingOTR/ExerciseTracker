package com.example.rungps.data;

import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.example.rungps.data.repo.StravaRepository;
import com.example.rungps.export.GpxExporter;
import com.example.rungps.export.HrSample;
import com.example.rungps.export.TrackPoint;
import com.example.rungps.strava.StravaActivityTypes;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$uploadRunToStrava$2", f = "Repository.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4}, l = {2369, 2381, 2383, 2386, 2398}, m = "invokeSuspend", n = {"prefs", DatabaseFileArchive.COLUMN_KEY, "pendingKey", "prefs", DatabaseFileArchive.COLUMN_KEY, "pendingKey", "run", "sportLabel", HintConstants.AUTOFILL_HINT_NAME, "gpxType", "prefs", DatabaseFileArchive.COLUMN_KEY, "pendingKey", "run", "sportLabel", HintConstants.AUTOFILL_HINT_NAME, "gpxType", "hrSamples", "prefs", DatabaseFileArchive.COLUMN_KEY, "pendingKey", "sportLabel", "pts", "finalId", "usedGpx"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "I$0"})
/* loaded from: classes3.dex */
final class Repository$uploadRunToStrava$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ long $runId;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$uploadRunToStrava$2(Repository repository, long j, Continuation<? super Repository$uploadRunToStrava$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$uploadRunToStrava$2(this.this$0, this.$runId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((Repository$uploadRunToStrava$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x035b A[Catch: Exception -> 0x0441, TryCatch #5 {Exception -> 0x0441, blocks: (B:24:0x0357, B:26:0x035b, B:29:0x0369, B:51:0x02e2, B:52:0x02f5, B:54:0x02fb, B:56:0x0322, B:69:0x028f, B:74:0x02a9), top: B:68:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0425 A[Catch: Exception -> 0x041f, TRY_LEAVE, TryCatch #0 {Exception -> 0x041f, blocks: (B:14:0x03f4, B:34:0x03bc, B:46:0x0425), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fb A[Catch: Exception -> 0x0441, LOOP:0: B:52:0x02f5->B:54:0x02fb, LOOP_END, TryCatch #5 {Exception -> 0x0441, blocks: (B:24:0x0357, B:26:0x035b, B:29:0x0369, B:51:0x02e2, B:52:0x02f5, B:54:0x02fb, B:56:0x0322, B:69:0x028f, B:74:0x02a9), top: B:68:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0356 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0283 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d7  */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v33 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String stravaUploadFailureMessage;
        Object m7905constructorimpl;
        StravaRepository stravaRepository;
        Triple readStravaTokens;
        Object runById;
        String str3;
        SharedPreferences sharedPreferences;
        String str4;
        Object hrSamplesForRun;
        String str5;
        String str6;
        String str7;
        String str8;
        RunEntity runEntity;
        String str9;
        String str10;
        GpxExporter gpxExporter;
        Object pointsForRun;
        String str11;
        String str12;
        RunEntity runEntity2;
        String str13;
        String str14;
        SharedPreferences sharedPreferences2;
        ArrayList arrayList;
        List<TrackPoint> mergeHrIntoPoints;
        Object uploadRunToStravaAttempt;
        Long l;
        int i;
        Object removeStravaRecoveryForActivityIds;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        String str15 = "strava_last_upload_status";
        String str16 = "strava_last_upload_ms";
        ?? r9 = 5;
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            r9 = "strava_last_upload_status";
            str = "strava_last_upload_ms";
            str2 = "strava_pending_run_";
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedPreferences sharedPreferences3 = this.this$0.getAppContext().getSharedPreferences("settings", 0);
            String str17 = "strava_uploaded_run_" + this.$runId;
            String str18 = "strava_pending_run_" + this.$runId;
            if (!sharedPreferences3.getBoolean(str17, false)) {
                stravaRepository = this.this$0.stravaRepo;
                if (stravaRepository.clientId().length() != 0) {
                    readStravaTokens = this.this$0.readStravaTokens();
                    if (((CharSequence) readStravaTokens.getFirst()).length() == 0) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Connect Strava first (needs write access)"))));
                    }
                    this.L$0 = sharedPreferences3;
                    this.L$1 = str17;
                    this.L$2 = str18;
                    this.label = 1;
                    runById = this.this$0.runById(this.$runId, this);
                    if (runById == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str17;
                    sharedPreferences = sharedPreferences3;
                    str4 = str18;
                } else {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Strava Client ID not configured"))));
                }
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl("Already on Strava"));
            }
        } else if (i2 == 1) {
            str4 = (String) this.L$2;
            String str19 = (String) this.L$1;
            SharedPreferences sharedPreferences4 = (SharedPreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
            runById = obj;
            str3 = str19;
            sharedPreferences = sharedPreferences4;
        } else if (i2 == 2) {
            String str20 = (String) this.L$6;
            String str21 = (String) this.L$5;
            str8 = (String) this.L$4;
            runEntity = (RunEntity) this.L$3;
            str6 = (String) this.L$2;
            str3 = (String) this.L$1;
            sharedPreferences = (SharedPreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
            str5 = str21;
            str2 = "strava_pending_run_";
            str7 = str20;
            hrSamplesForRun = obj;
            Iterable<RunHrSampleEntity> iterable = (Iterable) hrSamplesForRun;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (RunHrSampleEntity runHrSampleEntity : iterable) {
                try {
                    str9 = str15;
                    str10 = str16;
                } catch (Exception e3) {
                    e = e3;
                    str9 = str15;
                    str10 = str16;
                    r9 = str9;
                    str = str10;
                    stravaUploadFailureMessage = this.this$0.stravaUploadFailureMessage(e);
                    this.this$0.getAppContext().getSharedPreferences("settings", 0).edit().putLong(str, System.currentTimeMillis()).putString(r9, "Failed: " + stravaUploadFailureMessage).putBoolean(str2 + this.$runId, true).apply();
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(stravaUploadFailureMessage, e)));
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                try {
                    arrayList2.add(new HrSample(runHrSampleEntity.getTimeMs(), runHrSampleEntity.getBpm()));
                    str15 = str9;
                    str16 = str10;
                } catch (Exception e4) {
                    e = e4;
                    r9 = str9;
                    str = str10;
                    stravaUploadFailureMessage = this.this$0.stravaUploadFailureMessage(e);
                    this.this$0.getAppContext().getSharedPreferences("settings", 0).edit().putLong(str, System.currentTimeMillis()).putString(r9, "Failed: " + stravaUploadFailureMessage).putBoolean(str2 + this.$runId, true).apply();
                    Result.Companion companion42 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(stravaUploadFailureMessage, e)));
                    return Result.m7904boximpl(m7905constructorimpl);
                }
            }
            str9 = str15;
            str10 = str16;
            ArrayList arrayList3 = arrayList2;
            gpxExporter = GpxExporter.INSTANCE;
            this.L$0 = sharedPreferences;
            this.L$1 = str3;
            this.L$2 = str6;
            this.L$3 = runEntity;
            this.L$4 = str8;
            this.L$5 = str5;
            this.L$6 = str7;
            this.L$7 = arrayList3;
            this.L$8 = gpxExporter;
            this.label = 3;
            pointsForRun = this.this$0.pointsForRun(this.$runId, this);
            if (pointsForRun != coroutine_suspended) {
                return coroutine_suspended;
            }
            str11 = str7;
            str12 = str8;
            runEntity2 = runEntity;
            str13 = str6;
            str14 = str5;
            sharedPreferences2 = sharedPreferences;
            arrayList = arrayList3;
            Iterable<PointEntity> iterable2 = (Iterable) pointsForRun;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            while (r0.hasNext()) {
            }
            mergeHrIntoPoints = gpxExporter.mergeHrIntoPoints(arrayList4, arrayList);
            this.L$0 = sharedPreferences2;
            this.L$1 = str3;
            this.L$2 = str13;
            this.L$3 = str12;
            this.L$4 = mergeHrIntoPoints;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 4;
            uploadRunToStravaAttempt = this.this$0.uploadRunToStravaAttempt(this.$runId, runEntity2, str14, str11, mergeHrIntoPoints, arrayList, true, this);
            if (uploadRunToStravaAttempt == coroutine_suspended) {
            }
            l = (Long) uploadRunToStravaAttempt;
            if (l == null) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    j = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    String str22 = i == 0 ? "GPX route" : "summary";
                    Result.Companion companion5 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl("Uploaded to Strava (" + str22 + ", id " + j + ")");
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                mergeHrIntoPoints = (List) this.L$4;
                str12 = (String) this.L$3;
                String str23 = (String) this.L$2;
                String str24 = (String) this.L$1;
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.L$0;
                ResultKt.throwOnFailure(obj);
                str9 = "strava_last_upload_status";
                str10 = "strava_last_upload_ms";
                sharedPreferences2 = sharedPreferences5;
                str2 = "strava_pending_run_";
                str3 = str24;
                str13 = str23;
                uploadRunToStravaAttempt = obj;
                l = (Long) uploadRunToStravaAttempt;
                if (l == null) {
                    Result.Companion companion6 = Result.INSTANCE;
                    return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Strava upload failed — tap Retry in History or reconnect Strava"))));
                }
                long longValue = l.longValue();
                i = mergeHrIntoPoints.size() >= 2 ? 1 : 0;
                SharedPreferences.Editor putBoolean = sharedPreferences2.edit().putBoolean(str3, true).putBoolean(str13, false);
                str = str10;
                try {
                    putBoolean.putLong("strava_activity_id_" + this.$runId, longValue).putLong(str, System.currentTimeMillis()).putString(str9, "OK · " + str12 + " #" + this.$runId).apply();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.J$0 = longValue;
                    this.I$0 = i;
                    this.label = 5;
                    removeStravaRecoveryForActivityIds = this.this$0.removeStravaRecoveryForActivityIds(CollectionsKt.listOf(Boxing.boxLong(longValue)), this);
                } catch (Exception e5) {
                    e = e5;
                    r9 = str9;
                    stravaUploadFailureMessage = this.this$0.stravaUploadFailureMessage(e);
                    this.this$0.getAppContext().getSharedPreferences("settings", 0).edit().putLong(str, System.currentTimeMillis()).putString(r9, "Failed: " + stravaUploadFailureMessage).putBoolean(str2 + this.$runId, true).apply();
                    Result.Companion companion422 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(stravaUploadFailureMessage, e)));
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                if (removeStravaRecoveryForActivityIds == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = longValue;
                if (i == 0) {
                }
                Result.Companion companion52 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl("Uploaded to Strava (" + str22 + ", id " + j + ")");
                return Result.m7904boximpl(m7905constructorimpl);
            }
            GpxExporter gpxExporter2 = (GpxExporter) this.L$8;
            ?? r2 = (List) this.L$7;
            String str25 = (String) this.L$6;
            String str26 = (String) this.L$5;
            String str27 = (String) this.L$4;
            RunEntity runEntity3 = (RunEntity) this.L$3;
            str13 = (String) this.L$2;
            String str28 = (String) this.L$1;
            sharedPreferences2 = (SharedPreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
            str11 = str25;
            str9 = "strava_last_upload_status";
            str10 = "strava_last_upload_ms";
            runEntity2 = runEntity3;
            str14 = str26;
            str3 = str28;
            str2 = "strava_pending_run_";
            gpxExporter = gpxExporter2;
            arrayList = r2;
            str12 = str27;
            pointsForRun = obj;
            Iterable<PointEntity> iterable22 = (Iterable) pointsForRun;
            ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable22, 10));
            for (PointEntity pointEntity : iterable22) {
                arrayList42.add(new TrackPoint(pointEntity.getLat(), pointEntity.getLon(), pointEntity.getTimeMs(), pointEntity.getEleM(), null, 16, null));
            }
            mergeHrIntoPoints = gpxExporter.mergeHrIntoPoints(arrayList42, arrayList);
            this.L$0 = sharedPreferences2;
            this.L$1 = str3;
            this.L$2 = str13;
            this.L$3 = str12;
            this.L$4 = mergeHrIntoPoints;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.label = 4;
            uploadRunToStravaAttempt = this.this$0.uploadRunToStravaAttempt(this.$runId, runEntity2, str14, str11, mergeHrIntoPoints, arrayList, true, this);
            if (uploadRunToStravaAttempt == coroutine_suspended) {
                return coroutine_suspended;
            }
            l = (Long) uploadRunToStravaAttempt;
            if (l == null) {
            }
        }
        RunEntity runEntity4 = (RunEntity) runById;
        if (runEntity4 == null) {
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Run not found"))));
        }
        if (runEntity4.getEndedAtMs() == null) {
            Result.Companion companion8 = Result.INSTANCE;
            return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Run not finished"))));
        }
        if (runEntity4.getTotalDistanceM() < 50.0d) {
            Result.Companion companion9 = Result.INSTANCE;
            return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Run too short for Strava"))));
        }
        boolean isBike = ActivityTypes.INSTANCE.isBike(runEntity4.getActivityType());
        String str29 = isBike ? "ride" : "run";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        str2 = "strava_pending_run_";
        try {
            String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Boxing.boxDouble(runEntity4.getTotalDistanceM() / 1000.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String str30 = "Exercise Tracker " + str29 + " " + format + " km";
            String gpxUploadActivityType = StravaActivityTypes.INSTANCE.gpxUploadActivityType(isBike);
            this.L$0 = sharedPreferences;
            this.L$1 = str3;
            this.L$2 = str4;
            this.L$3 = runEntity4;
            this.L$4 = str29;
            this.L$5 = str30;
            this.L$6 = gpxUploadActivityType;
            this.label = 2;
            hrSamplesForRun = this.this$0.hrSamplesForRun(this.$runId, this);
            if (hrSamplesForRun == coroutine_suspended) {
                return coroutine_suspended;
            }
            str5 = str30;
            str6 = str4;
            str7 = gpxUploadActivityType;
            str8 = str29;
            runEntity = runEntity4;
            Iterable<RunHrSampleEntity> iterable3 = (Iterable) hrSamplesForRun;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            while (r0.hasNext()) {
            }
            str9 = str15;
            str10 = str16;
            ArrayList arrayList32 = arrayList22;
            gpxExporter = GpxExporter.INSTANCE;
            this.L$0 = sharedPreferences;
            this.L$1 = str3;
            this.L$2 = str6;
            this.L$3 = runEntity;
            this.L$4 = str8;
            this.L$5 = str5;
            this.L$6 = str7;
            this.L$7 = arrayList32;
            this.L$8 = gpxExporter;
            this.label = 3;
            pointsForRun = this.this$0.pointsForRun(this.$runId, this);
            if (pointsForRun != coroutine_suspended) {
            }
        } catch (Exception e6) {
            e = e6;
            r9 = str15;
            str = str16;
            stravaUploadFailureMessage = this.this$0.stravaUploadFailureMessage(e);
            this.this$0.getAppContext().getSharedPreferences("settings", 0).edit().putLong(str, System.currentTimeMillis()).putString(r9, "Failed: " + stravaUploadFailureMessage).putBoolean(str2 + this.$runId, true).apply();
            Result.Companion companion4222 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(stravaUploadFailureMessage, e)));
            return Result.m7904boximpl(m7905constructorimpl);
        }
    }
}
