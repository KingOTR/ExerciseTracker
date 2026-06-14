package com.example.rungps.export;

import android.content.Context;
import com.example.rungps.BuildConfig;
import com.example.rungps.CrashLog;
import com.example.rungps.data.Repository;
import com.example.rungps.sleep.BatteryOptimizationNudge;
import com.example.rungps.sleep.SleepListenPreferences;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.sleep.SleepMicCoverage;
import com.example.rungps.sleep.SleepMlPipelineStatus;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.sleep.SleepScience;
import com.example.rungps.sleep.SleepTrackSample;
import com.example.rungps.sync.CloudSyncManager;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: DiagnosticsExporter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.export.DiagnosticsExporter$writeZip$2", f = "DiagnosticsExporter.kt", i = {0}, l = {117}, m = "invokeSuspend", n = {"diagJson"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DiagnosticsExporter$writeZip$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ File $outFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiagnosticsExporter$writeZip$2(Context context, File file, Continuation<? super DiagnosticsExporter$writeZip$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$outFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DiagnosticsExporter$writeZip$2 diagnosticsExporter$writeZip$2 = new DiagnosticsExporter$writeZip$2(this.$context, this.$outFile, continuation);
        diagnosticsExporter$writeZip$2.L$0 = obj;
        return diagnosticsExporter$writeZip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((DiagnosticsExporter$writeZip$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03ac A[Catch: all -> 0x03c1, TryCatch #1 {all -> 0x03c1, blocks: (B:17:0x0397, B:19:0x03ac, B:20:0x03b1), top: B:16:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0388  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        List<SleepTrackSample> emptyList;
        DiagnosticsExporter$writeZip$2 diagnosticsExporter$writeZip$2;
        DataExporter dataExporter;
        Repository repository;
        Object buildExportJson;
        String eventTag;
        Float asleepProb;
        Float stageConfidence;
        Object m7905constructorimpl;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context applicationContext = this.$context.getApplicationContext();
            CrashLog crashLog = CrashLog.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            CrashLog.CrashEntry read = crashLog.read(applicationContext);
            jSONObject = new JSONObject();
            jSONObject.put("exportedAtMs", System.currentTimeMillis());
            jSONObject.put("versionName", BuildConfig.VERSION_NAME);
            jSONObject.put("versionCode", BuildConfig.VERSION_CODE);
            jSONObject.put("package", BuildConfig.APPLICATION_ID);
            jSONObject.put("lastCloudSyncMs", CloudSyncManager.INSTANCE.lastSyncMs(applicationContext));
            jSONObject.put("pendingOpenTab", applicationContext.getSharedPreferences("gym_nfc", 0).getString("open_tab", null));
            Long boxLong = Boxing.boxLong(applicationContext.getSharedPreferences("gym_nfc", 0).getLong("focus_gym_session_id", 0L));
            if (boxLong.longValue() <= 0) {
                boxLong = null;
            }
            jSONObject.put("pendingFocusSessionId", boxLong);
            if (read != null) {
                jSONObject.put("lastCrashAtMs", read.getAtMs());
                jSONObject.put("lastCrashThread", read.getThread());
                jSONObject.put("lastCrashStack", read.getStacktrace());
            }
            String lastBreadcrumb = CrashLog.INSTANCE.lastBreadcrumb(applicationContext);
            if (lastBreadcrumb != null) {
                jSONObject.put("lastBreadcrumb", lastBreadcrumb);
            }
            SleepMlPipelineStatus.Status load = SleepMlPipelineStatus.INSTANCE.load(applicationContext);
            if (SleepOvernightStore.INSTANCE.isActive(applicationContext)) {
                emptyList = SleepOvernightStore.INSTANCE.loadRecentSamples(applicationContext, SleepScience.TYPICAL_MIN_MIN);
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            int coerceAtLeast = SleepOvernightStore.INSTANCE.isActive(applicationContext) ? RangesKt.coerceAtLeast((int) ((System.currentTimeMillis() - SleepOvernightStore.INSTANCE.startedAtMs(applicationContext)) / 60000), 1) : 0;
            SleepMicCoverage.Snapshot fromSamples = (emptyList.isEmpty() || coerceAtLeast <= 0) ? null : SleepMicCoverage.INSTANCE.fromSamples(emptyList, coerceAtLeast, SleepOvernightStore.INSTANCE.micGapMs(applicationContext), SleepOvernightStore.INSTANCE.micGapCount(applicationContext));
            Pair<Long, Integer> detectGaps = SleepMicCoverage.INSTANCE.detectGaps(emptyList);
            long longValue = detectGaps.component1().longValue();
            int intValue = detectGaps.component2().intValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("overnightActive", SleepOvernightStore.INSTANCE.isActive(applicationContext));
            jSONObject2.put("sessionValid", SleepOvernightStore.INSTANCE.isSessionValid(applicationContext));
            jSONObject2.put("startedAtMs", SleepOvernightStore.INSTANCE.startedAtMs(applicationContext));
            jSONObject2.put("alarmTargetMs", SleepOvernightStore.INSTANCE.alarmTargetMs(applicationContext));
            jSONObject2.put("windowStartMs", SleepOvernightStore.INSTANCE.windowStartMs(applicationContext));
            jSONObject2.put("windowEndMs", SleepOvernightStore.INSTANCE.windowEndMs(applicationContext));
            jSONObject2.put("sampleCount", SleepOvernightStore.INSTANCE.sampleCount(applicationContext));
            jSONObject2.put("lastStopReason", SleepOvernightStore.INSTANCE.lastStopReason(applicationContext));
            jSONObject2.put("lastHealthNote", SleepOvernightStore.INSTANCE.lastHealthNote(applicationContext));
            jSONObject2.put("lastHealthMs", SleepOvernightStore.INSTANCE.lastHealthMs(applicationContext));
            jSONObject2.put("recoverableStale", SleepOvernightStore.INSTANCE.isRecoverableStale(applicationContext));
            jSONObject2.put("alarmFired", SleepOvernightStore.INSTANCE.alarmFired(applicationContext));
            jSONObject2.put("alarmFiredAtMs", SleepOvernightStore.INSTANCE.alarmFiredAtMs(applicationContext));
            jSONObject2.put("listenServiceInProcess", SleepListenService.INSTANCE.isRunningInProcess());
            jSONObject2.put("batteryOptimizationIgnored", BatteryOptimizationNudge.INSTANCE.isIgnoringBatteryOptimizations(applicationContext));
            jSONObject2.put("schemaVersion", SleepOvernightStore.INSTANCE.schemaVersion(applicationContext));
            jSONObject2.put("micGapMs", SleepOvernightStore.INSTANCE.micGapMs(applicationContext));
            jSONObject2.put("micGapCount", SleepOvernightStore.INSTANCE.micGapCount(applicationContext));
            jSONObject2.put("detectedGapMs", longValue);
            jSONObject2.put("detectedGapCount", intValue);
            jSONObject2.put("saveSoundClips", SleepListenPreferences.INSTANCE.saveSoundClips(applicationContext));
            jSONObject2.put("sonarBetaRequested", SleepListenPreferences.INSTANCE.sonarBetaEnabled(applicationContext));
            jSONObject2.put("highFidelityAudio", SleepListenPreferences.INSTANCE.highFidelityAudio(applicationContext));
            if (fromSamples != null) {
                jSONObject2.put("micCoverageRatio", fromSamples.getCoverageRatio());
                jSONObject2.put("micCoverageLabel", fromSamples.getLabel());
                jSONObject2.put("trackedMin", fromSamples.getTrackedMin());
            }
            SleepTrackSample sleepTrackSample = (SleepTrackSample) CollectionsKt.lastOrNull((List) emptyList);
            if (sleepTrackSample != null && (stageConfidence = sleepTrackSample.getStageConfidence()) != null) {
                jSONObject2.put("lastStageConfidence", stageConfidence.floatValue());
            }
            if (sleepTrackSample != null && (asleepProb = sleepTrackSample.getAsleepProb()) != null) {
                jSONObject2.put("lastAsleepProb", asleepProb.floatValue());
            }
            if (sleepTrackSample != null && (eventTag = sleepTrackSample.getEventTag()) != null) {
                jSONObject2.put("lastEventTag", eventTag);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("yamnetLoaded", load.getYamnetLoaded());
            jSONObject3.put("stagingV2Loaded", load.getStagingV2Loaded());
            jSONObject3.put("mlpLoaded", load.getMlpLoaded());
            jSONObject3.put("sampleRateHz", load.getSampleRateHz());
            jSONObject3.put("eventMode", load.getEventMode());
            jSONObject3.put("stagingMode", load.getStagingMode());
            Unit unit = Unit.INSTANCE;
            jSONObject2.put("mlPipeline", jSONObject3);
            Unit unit2 = Unit.INSTANCE;
            jSONObject.put("sleepOvernight", jSONObject2);
            String lastStopReason = SleepOvernightStore.INSTANCE.lastStopReason(applicationContext);
            String lastHealthNote = SleepOvernightStore.INSTANCE.lastHealthNote(applicationContext);
            if (lastStopReason != null || lastHealthNote != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("lastStopReason", lastStopReason);
                jSONObject4.put("lastHealthNote", lastHealthNote);
                jSONObject4.put("lastHealthMs", SleepOvernightStore.INSTANCE.lastHealthMs(applicationContext));
                jSONObject4.put("listenServiceInProcess", SleepListenService.INSTANCE.isRunningInProcess());
                jSONObject4.put("overnightActive", SleepOvernightStore.INSTANCE.isActive(applicationContext));
                jSONObject4.put("recoverableStale", SleepOvernightStore.INSTANCE.isRecoverableStale(applicationContext));
                jSONObject4.put("alarmFired", SleepOvernightStore.INSTANCE.alarmFired(applicationContext));
                Unit unit3 = Unit.INSTANCE;
                jSONObject.put("processDeathSignals", jSONObject4);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                dataExporter = DataExporter.INSTANCE;
                repository = Repository.INSTANCE.get(applicationContext);
                diagnosticsExporter$writeZip$2 = this;
            } catch (Throwable th) {
                th = th;
                diagnosticsExporter$writeZip$2 = this;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                str = (String) m7905constructorimpl;
                OutputStream fileOutputStream = new FileOutputStream(diagnosticsExporter$writeZip$2.$outFile);
                ZipOutputStream zipOutputStream = new ZipOutputStream(!(fileOutputStream instanceof BufferedOutputStream) ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192));
                ZipOutputStream zipOutputStream2 = zipOutputStream;
                String jSONObject5 = jSONObject.toString(2);
                Intrinsics.checkNotNullExpressionValue(jSONObject5, "toString(...)");
                invokeSuspend$lambda$12$putText(zipOutputStream2, "diagnostics.json", jSONObject5);
                if (str != null) {
                }
                invokeSuspend$lambda$12$putText(zipOutputStream2, "README.txt", "Exercise Tracker diagnostics bundle\n- diagnostics.json: version, sync, crash, sleep overnight state\n- data/export.json: gym/runs/sleep snapshot (if available)");
                Unit unit4 = Unit.INSTANCE;
                CloseableKt.closeFinally(zipOutputStream, null);
                return diagnosticsExporter$writeZip$2.$outFile;
            }
            try {
                diagnosticsExporter$writeZip$2.L$0 = jSONObject;
                diagnosticsExporter$writeZip$2.label = 1;
                buildExportJson = dataExporter.buildExportJson(repository, diagnosticsExporter$writeZip$2);
                if (buildExportJson == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                str = (String) m7905constructorimpl;
                OutputStream fileOutputStream2 = new FileOutputStream(diagnosticsExporter$writeZip$2.$outFile);
                ZipOutputStream zipOutputStream3 = new ZipOutputStream(!(fileOutputStream2 instanceof BufferedOutputStream) ? (BufferedOutputStream) fileOutputStream2 : new BufferedOutputStream(fileOutputStream2, 8192));
                ZipOutputStream zipOutputStream22 = zipOutputStream3;
                String jSONObject52 = jSONObject.toString(2);
                Intrinsics.checkNotNullExpressionValue(jSONObject52, "toString(...)");
                invokeSuspend$lambda$12$putText(zipOutputStream22, "diagnostics.json", jSONObject52);
                if (str != null) {
                }
                invokeSuspend$lambda$12$putText(zipOutputStream22, "README.txt", "Exercise Tracker diagnostics bundle\n- diagnostics.json: version, sync, crash, sleep overnight state\n- data/export.json: gym/runs/sleep snapshot (if available)");
                Unit unit42 = Unit.INSTANCE;
                CloseableKt.closeFinally(zipOutputStream3, null);
                return diagnosticsExporter$writeZip$2.$outFile;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JSONObject jSONObject6 = (JSONObject) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                buildExportJson = obj;
                jSONObject = jSONObject6;
                diagnosticsExporter$writeZip$2 = this;
            } catch (Throwable th3) {
                th = th3;
                jSONObject = jSONObject6;
                diagnosticsExporter$writeZip$2 = this;
                Result.Companion companion222 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                str = (String) m7905constructorimpl;
                OutputStream fileOutputStream22 = new FileOutputStream(diagnosticsExporter$writeZip$2.$outFile);
                ZipOutputStream zipOutputStream32 = new ZipOutputStream(!(fileOutputStream22 instanceof BufferedOutputStream) ? (BufferedOutputStream) fileOutputStream22 : new BufferedOutputStream(fileOutputStream22, 8192));
                ZipOutputStream zipOutputStream222 = zipOutputStream32;
                String jSONObject522 = jSONObject.toString(2);
                Intrinsics.checkNotNullExpressionValue(jSONObject522, "toString(...)");
                invokeSuspend$lambda$12$putText(zipOutputStream222, "diagnostics.json", jSONObject522);
                if (str != null) {
                }
                invokeSuspend$lambda$12$putText(zipOutputStream222, "README.txt", "Exercise Tracker diagnostics bundle\n- diagnostics.json: version, sync, crash, sleep overnight state\n- data/export.json: gym/runs/sleep snapshot (if available)");
                Unit unit422 = Unit.INSTANCE;
                CloseableKt.closeFinally(zipOutputStream32, null);
                return diagnosticsExporter$writeZip$2.$outFile;
            }
        }
        m7905constructorimpl = Result.m7905constructorimpl((String) buildExportJson);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        str = (String) m7905constructorimpl;
        OutputStream fileOutputStream222 = new FileOutputStream(diagnosticsExporter$writeZip$2.$outFile);
        ZipOutputStream zipOutputStream322 = new ZipOutputStream(!(fileOutputStream222 instanceof BufferedOutputStream) ? (BufferedOutputStream) fileOutputStream222 : new BufferedOutputStream(fileOutputStream222, 8192));
        try {
            ZipOutputStream zipOutputStream2222 = zipOutputStream322;
            String jSONObject5222 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject5222, "toString(...)");
            invokeSuspend$lambda$12$putText(zipOutputStream2222, "diagnostics.json", jSONObject5222);
            if (str != null) {
                invokeSuspend$lambda$12$putText(zipOutputStream2222, "data/export.json", str);
            }
            invokeSuspend$lambda$12$putText(zipOutputStream2222, "README.txt", "Exercise Tracker diagnostics bundle\n- diagnostics.json: version, sync, crash, sleep overnight state\n- data/export.json: gym/runs/sleep snapshot (if available)");
            Unit unit4222 = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream322, null);
            return diagnosticsExporter$writeZip$2.$outFile;
        } finally {
        }
    }

    private static final void invokeSuspend$lambda$12$putText(ZipOutputStream zipOutputStream, String str, String str2) {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        zipOutputStream.write(bytes);
        zipOutputStream.closeEntry();
    }
}
