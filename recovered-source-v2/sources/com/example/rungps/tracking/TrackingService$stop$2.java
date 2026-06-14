package com.example.rungps.tracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.SensorManager;
import android.media.ToneGenerator;
import android.os.PowerManager;
import android.speech.tts.TextToSpeech;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.sleep.SleepAlarmScheduler;
import com.example.rungps.sync.RunFirestoreSync;
import com.example.rungps.widget.RideRunWidgetUpdater;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$stop$2", f = "TrackingService.kt", i = {0, 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7}, l = {634, 636, 646, 647, 650, 673, 689, 693}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch", "$this$launch", "$this$launch", "exists", "$this$launch", "hc", "exists", "$this$launch", "exists"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class TrackingService$stop$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    final /* synthetic */ long $ended;
    final /* synthetic */ Long $id;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$stop$2(Long l, TrackingService trackingService, long j, long j2, Continuation<? super TrackingService$stop$2> continuation) {
        super(2, continuation);
        this.$id = l;
        this.this$0 = trackingService;
        this.$duration = j;
        this.$ended = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$stop$2 trackingService$stop$2 = new TrackingService$stop$2(this.$id, this.this$0, this.$duration, this.$ended, continuation);
        trackingService$stop$2.L$0 = obj;
        return trackingService$stop$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$stop$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:156|157|(17:159|(1:161)|145|(2:148|(1:150)(13:151|152|(1:154)|137|138|139|(1:141)|129|130|131|(1:133)|119|120))|155|152|(0)|137|138|139|(0)|129|130|131|(0)|119|120)|121|(3:123|(1:125)|(28:106|(8:108|109|(1:111)(1:115)|112|(1:114)|88|89|(2:91|(3:93|94|(1:96)(6:97|66|67|(1:69)|70|(4:72|73|74|(1:76)(3:77|11|12))(1:81)))))|13|(1:15)(1:58)|(1:17)(1:57)|18|19|(1:21)|22|(1:24)|25|(1:27)|28|29|30|(1:32)(1:53)|33|34|(1:36)|37|(1:39)|40|41|42|(1:44)(1:49)|45|46|47))|116|(0)|13|(0)(0)|(0)(0)|18|19|(0)|22|(0)|25|(0)|28|29|30|(0)(0)|33|34|(0)|37|(0)|40|41|42|(0)(0)|45|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0422, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03b9, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190 A[Catch: all -> 0x0425, Exception -> 0x0429, TRY_LEAVE, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016f A[Catch: all -> 0x0425, Exception -> 0x0429, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0306 A[Catch: all -> 0x0425, Exception -> 0x0429, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x030f A[Catch: all -> 0x0425, Exception -> 0x0429, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ad A[Catch: all -> 0x03b8, TryCatch #10 {all -> 0x03b8, blocks: (B:30:0x03a5, B:32:0x03ad, B:33:0x03b4), top: B:29:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0416 A[Catch: all -> 0x0422, TryCatch #0 {all -> 0x0422, blocks: (B:42:0x040e, B:44:0x0416, B:45:0x041d), top: B:41:0x040e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029e A[Catch: all -> 0x0425, Exception -> 0x0429, TRY_LEAVE, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0245 A[Catch: all -> 0x0425, Exception -> 0x0429, TRY_LEAVE, TryCatch #2 {Exception -> 0x0429, blocks: (B:13:0x0300, B:15:0x0306, B:17:0x030f, B:18:0x031a, B:61:0x02f4, B:67:0x0289, B:70:0x0296, B:72:0x029e, B:84:0x027f, B:89:0x0234, B:91:0x0245, B:239:0x022b, B:103:0x0055, B:108:0x0190, B:121:0x016b, B:123:0x016f, B:237:0x0161, B:130:0x013f, B:241:0x0136, B:136:0x0082, B:138:0x0116, B:143:0x008c, B:145:0x00b7, B:148:0x00c8, B:152:0x00da, B:157:0x0099, B:159:0x009d), top: B:2:0x000f, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TextToSpeech textToSpeech;
        ToneGenerator toneGenerator;
        SensorManager sensorManager;
        Job job;
        Job job2;
        PowerManager.WakeLock wakeLock;
        Unit unit;
        BroadcastReceiver broadcastReceiver;
        Unit unit2;
        TrackingService$stepListener$1 trackingService$stepListener$1;
        TextToSpeech textToSpeech2;
        ToneGenerator toneGenerator2;
        SensorManager sensorManager2;
        Job job3;
        Job job4;
        PowerManager.WakeLock wakeLock2;
        Unit unit3;
        BroadcastReceiver broadcastReceiver2;
        Unit unit4;
        TrackingService$stepListener$1 trackingService$stepListener$12;
        Repository repo;
        Object m6844uploadRunToStravagIAlus;
        CoroutineScope coroutineScope;
        Long l;
        Repository repo2;
        Object runById;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        int i;
        String str;
        long j;
        Long l2;
        double d;
        RecoveryModel.RecoveryEstimate estimateRun;
        Repository repo3;
        String str2;
        Object recordRecoveryEvent;
        double d2;
        int i2;
        HealthConnectManager healthConnectManager;
        Object hasAllPermissions;
        Object m7905constructorimpl;
        long j2;
        int i3;
        double d3;
        long j3;
        String str3;
        Object backupRunToHealthConnect;
        TextToSpeech textToSpeech3;
        ToneGenerator toneGenerator3;
        SensorManager sensorManager3;
        Job job5;
        Job job6;
        PowerManager.WakeLock wakeLock3;
        Unit unit5;
        BroadcastReceiver broadcastReceiver3;
        Unit unit6;
        TrackingService$stepListener$1 trackingService$stepListener$13;
        Repository repo4;
        Object pointsForRun;
        boolean z;
        Repository repo5;
        long longValue;
        long j4;
        double d4;
        long j5;
        long j6;
        String str4;
        String str5;
        long j7;
        TrackingService trackingService;
        long longValue2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
                try {
                    try {
                        try {
                        } catch (Exception unused) {
                            TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435454, null));
                            textToSpeech = this.this$0.tts;
                            if (textToSpeech != null) {
                                textToSpeech.shutdown();
                                Unit unit7 = Unit.INSTANCE;
                            }
                            this.this$0.tts = null;
                            toneGenerator = this.this$0.tone;
                            if (toneGenerator != null) {
                                toneGenerator.release();
                                Unit unit8 = Unit.INSTANCE;
                            }
                            this.this$0.tone = null;
                            this.this$0.vibrator = null;
                            sensorManager = this.this$0.sensorManager;
                            if (sensorManager != null) {
                                trackingService$stepListener$1 = this.this$0.stepListener;
                                sensorManager.unregisterListener(trackingService$stepListener$1);
                                Unit unit9 = Unit.INSTANCE;
                            }
                            this.this$0.sensorManager = null;
                            this.this$0.stepCounterSensor = null;
                            TrackingService trackingService2 = this.this$0;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                broadcastReceiver = trackingService2.batteryReceiver;
                                if (broadcastReceiver != null) {
                                    trackingService2.unregisterReceiver(broadcastReceiver);
                                    unit2 = Unit.INSTANCE;
                                } else {
                                    unit2 = null;
                                }
                                Result.m7905constructorimpl(unit2);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th));
                            }
                            this.this$0.batteryReceiver = null;
                            job = this.this$0.healthJob;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                Unit unit10 = Unit.INSTANCE;
                            }
                            this.this$0.healthJob = null;
                            job2 = this.this$0.clockJob;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                Unit unit11 = Unit.INSTANCE;
                            }
                            this.this$0.clockJob = null;
                            TrackingActiveStore.INSTANCE.clear(this.this$0);
                            RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                            RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                            this.this$0.stopLocationThread();
                            TrackingService trackingService3 = this.this$0;
                            try {
                                Result.Companion companion3 = Result.INSTANCE;
                                wakeLock = trackingService3.wakeLock;
                                if (wakeLock != null) {
                                    wakeLock.release();
                                    unit = Unit.INSTANCE;
                                } else {
                                    unit = null;
                                }
                                Result.m7905constructorimpl(unit);
                            } catch (Throwable th2) {
                                th = th2;
                                Result.Companion companion4 = Result.INSTANCE;
                                Result.m7905constructorimpl(ResultKt.createFailure(th));
                                this.this$0.wakeLock = null;
                                this.this$0.engine = null;
                                this.this$0.plan = null;
                                this.this$0.currentPlanType = null;
                                this.this$0.currentTimeSession = null;
                                this.this$0.runId = null;
                                RecordingHrBridge.INSTANCE.onRunStopped();
                                this.this$0.stopForeground(1);
                                this.this$0.stopSelf();
                                return Unit.INSTANCE;
                            }
                        }
                    } catch (Throwable th3) {
                        textToSpeech2 = this.this$0.tts;
                        if (textToSpeech2 != null) {
                            textToSpeech2.shutdown();
                            Unit unit12 = Unit.INSTANCE;
                        }
                        this.this$0.tts = null;
                        toneGenerator2 = this.this$0.tone;
                        if (toneGenerator2 != null) {
                            toneGenerator2.release();
                            Unit unit13 = Unit.INSTANCE;
                        }
                        this.this$0.tone = null;
                        this.this$0.vibrator = null;
                        sensorManager2 = this.this$0.sensorManager;
                        if (sensorManager2 != null) {
                            trackingService$stepListener$12 = this.this$0.stepListener;
                            sensorManager2.unregisterListener(trackingService$stepListener$12);
                            Unit unit14 = Unit.INSTANCE;
                        }
                        this.this$0.sensorManager = null;
                        this.this$0.stepCounterSensor = null;
                        TrackingService trackingService4 = this.this$0;
                        try {
                            Result.Companion companion5 = Result.INSTANCE;
                            broadcastReceiver2 = trackingService4.batteryReceiver;
                            if (broadcastReceiver2 != null) {
                                trackingService4.unregisterReceiver(broadcastReceiver2);
                                unit4 = Unit.INSTANCE;
                            } else {
                                unit4 = null;
                            }
                            Result.m7905constructorimpl(unit4);
                        } catch (Throwable th4) {
                            Result.Companion companion6 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th4));
                        }
                        this.this$0.batteryReceiver = null;
                        job3 = this.this$0.healthJob;
                        if (job3 != null) {
                            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                            Unit unit15 = Unit.INSTANCE;
                        }
                        this.this$0.healthJob = null;
                        job4 = this.this$0.clockJob;
                        if (job4 != null) {
                            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
                            Unit unit16 = Unit.INSTANCE;
                        }
                        this.this$0.clockJob = null;
                        TrackingActiveStore.INSTANCE.clear(this.this$0);
                        RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                        RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                        this.this$0.stopLocationThread();
                        TrackingService trackingService5 = this.this$0;
                        try {
                            Result.Companion companion7 = Result.INSTANCE;
                            wakeLock2 = trackingService5.wakeLock;
                            if (wakeLock2 != null) {
                                wakeLock2.release();
                                unit3 = Unit.INSTANCE;
                            } else {
                                unit3 = null;
                            }
                            Result.m7905constructorimpl(unit3);
                        } catch (Throwable th5) {
                            Result.Companion companion8 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th5));
                        }
                        this.this$0.wakeLock = null;
                        this.this$0.engine = null;
                        this.this$0.plan = null;
                        this.this$0.currentPlanType = null;
                        this.this$0.currentTimeSession = null;
                        this.this$0.runId = null;
                        RecordingHrBridge.INSTANCE.onRunStopped();
                        this.this$0.stopForeground(1);
                        this.this$0.stopSelf();
                        throw th3;
                    }
                } catch (Throwable th6) {
                    Result.Companion companion9 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th6));
                }
            } catch (Throwable th7) {
                Result.Companion companion10 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th7));
            }
        } catch (Throwable th8) {
            Result.Companion companion11 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th8));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (this.$id != null) {
                    repo4 = this.this$0.getRepo();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    pointsForRun = repo4.pointsForRun(this.$id.longValue(), this);
                    if (pointsForRun == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    int size = ((List) pointsForRun).size();
                    if (this.$duration < SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS && size < 8) {
                        j7 = this.this$0.totalSteps;
                        if (j7 >= 200) {
                            z = false;
                            repo5 = this.this$0.getRepo();
                            longValue = this.$id.longValue();
                            j4 = this.$ended;
                            d4 = this.this$0.totalDistanceM;
                            j5 = this.$duration;
                            j6 = this.this$0.totalSteps;
                            str4 = this.this$0.currentPlanType;
                            str5 = this.this$0.currentTimeSession;
                            this.L$0 = coroutineScope;
                            this.label = 2;
                            if (repo5.finishRun(longValue, j4, d4, j5, j6, str4, str5, z, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope2 = coroutineScope;
                            trackingService = this.this$0;
                            Long l3 = this.$id;
                            Result.Companion companion12 = Result.INSTANCE;
                            longValue2 = l3.longValue();
                            this.L$0 = coroutineScope2;
                            this.label = 3;
                            if (RunFirestoreSync.INSTANCE.pushFinishedRun(trackingService, longValue2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result.m7905constructorimpl(Unit.INSTANCE);
                            TrackingService trackingService6 = this.this$0;
                            Long l4 = this.$id;
                            Result.Companion companion13 = Result.INSTANCE;
                            repo = trackingService6.getRepo();
                            long longValue3 = l4.longValue();
                            this.L$0 = coroutineScope2;
                            this.label = 4;
                            m6844uploadRunToStravagIAlus = repo.m6844uploadRunToStravagIAlus(longValue3, this);
                            if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                            coroutineScope = coroutineScope2;
                        }
                    }
                    z = true;
                    repo5 = this.this$0.getRepo();
                    longValue = this.$id.longValue();
                    j4 = this.$ended;
                    d4 = this.this$0.totalDistanceM;
                    j5 = this.$duration;
                    j6 = this.this$0.totalSteps;
                    str4 = this.this$0.currentPlanType;
                    str5 = this.this$0.currentTimeSession;
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    if (repo5.finishRun(longValue, j4, d4, j5, j6, str4, str5, z, this) == coroutine_suspended) {
                    }
                    coroutineScope2 = coroutineScope;
                    trackingService = this.this$0;
                    Long l32 = this.$id;
                    Result.Companion companion122 = Result.INSTANCE;
                    longValue2 = l32.longValue();
                    this.L$0 = coroutineScope2;
                    this.label = 3;
                    if (RunFirestoreSync.INSTANCE.pushFinishedRun(trackingService, longValue2, this) == coroutine_suspended) {
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    TrackingService trackingService62 = this.this$0;
                    Long l42 = this.$id;
                    Result.Companion companion132 = Result.INSTANCE;
                    repo = trackingService62.getRepo();
                    long longValue32 = l42.longValue();
                    this.L$0 = coroutineScope2;
                    this.label = 4;
                    m6844uploadRunToStravagIAlus = repo.m6844uploadRunToStravagIAlus(longValue32, this);
                    if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                    }
                    Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                    coroutineScope = coroutineScope2;
                }
                l = this.$id;
                if (l != null) {
                    TrackingService trackingService7 = this.this$0;
                    long longValue4 = l.longValue();
                    repo2 = trackingService7.getRepo();
                    this.L$0 = coroutineScope;
                    this.label = 5;
                    runById = repo2.runById(longValue4, this);
                    if (runById == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (runById != null) {
                        coroutineScope3 = coroutineScope;
                        i = 1;
                        if (i != 0) {
                            TrackingService trackingService8 = this.this$0;
                            long j8 = this.$duration;
                            Long l5 = this.$id;
                            long j9 = this.$ended;
                            Result.Companion companion14 = Result.INSTANCE;
                            RecoveryModel.RecoveryDemographics.Companion companion15 = RecoveryModel.RecoveryDemographics.INSTANCE;
                            UserProfileStore userProfileStore = UserProfileStore.INSTANCE;
                            Context applicationContext = trackingService8.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            RecoveryModel.RecoveryDemographics fromUserProfile = companion15.fromUserProfile(userProfileStore.load(applicationContext));
                            ActivityTypes activityTypes = ActivityTypes.INSTANCE;
                            str = trackingService8.currentActivityType;
                            if (activityTypes.isBike(str)) {
                                RecoveryModel recoveryModel = RecoveryModel.INSTANCE;
                                d2 = trackingService8.totalDistanceM;
                                j = j9;
                                l2 = l5;
                                estimateRun = recoveryModel.estimateBike(d2, j8, fromUserProfile);
                            } else {
                                j = j9;
                                l2 = l5;
                                RecoveryModel recoveryModel2 = RecoveryModel.INSTANCE;
                                d = trackingService8.totalDistanceM;
                                estimateRun = recoveryModel2.estimateRun(d, j8, fromUserProfile);
                            }
                            repo3 = trackingService8.getRepo();
                            ActivityTypes activityTypes2 = ActivityTypes.INSTANCE;
                            str2 = trackingService8.currentActivityType;
                            String recoveryKind = activityTypes2.recoveryKind(str2);
                            Intrinsics.checkNotNull(l2);
                            RecoveryEventEntity recoveryEventEntity = new RecoveryEventEntity(0L, recoveryKind, l2.longValue(), j, j + ((long) (estimateRun.getHours() * 3600000.0d)), estimateRun.getLoadScore(), estimateRun.getNotes(), 1, null);
                            this.L$0 = coroutineScope3;
                            this.I$0 = i;
                            this.label = 6;
                            recordRecoveryEvent = repo3.recordRecoveryEvent(recoveryEventEntity, this);
                            if (recordRecoveryEvent == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result.m7905constructorimpl(Boxing.boxLong(((Number) recordRecoveryEvent).longValue()));
                            if (this.this$0.getSharedPreferences("settings", 0).getBoolean("healthConnectAutoBackup", false)) {
                                Context applicationContext2 = this.this$0.getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                                HealthConnectManager healthConnectManager2 = new HealthConnectManager(applicationContext2);
                                if (healthConnectManager2.isAvailable()) {
                                    try {
                                        Result.Companion companion16 = Result.INSTANCE;
                                        this.L$0 = coroutineScope3;
                                        this.L$1 = healthConnectManager2;
                                        this.I$0 = i;
                                        this.label = 7;
                                        hasAllPermissions = healthConnectManager2.hasAllPermissions(this);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i2 = i;
                                        healthConnectManager = healthConnectManager2;
                                        Result.Companion companion17 = Result.INSTANCE;
                                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                        int i4 = i2;
                                        HealthConnectManager healthConnectManager3 = healthConnectManager;
                                        Boolean boxBoolean = Boxing.boxBoolean(false);
                                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                        }
                                        if (((Boolean) m7905constructorimpl).booleanValue()) {
                                        }
                                    }
                                    if (hasAllPermissions == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    i2 = i;
                                    healthConnectManager = healthConnectManager2;
                                    m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) hasAllPermissions).booleanValue()));
                                    int i42 = i2;
                                    HealthConnectManager healthConnectManager32 = healthConnectManager;
                                    Boolean boxBoolean2 = Boxing.boxBoolean(false);
                                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                        m7905constructorimpl = boxBoolean2;
                                    }
                                    if (((Boolean) m7905constructorimpl).booleanValue()) {
                                        i = i42;
                                    } else {
                                        j2 = this.this$0.startedAtMs;
                                        Instant ofEpochMilli = Instant.ofEpochMilli(j2);
                                        Instant ofEpochMilli2 = Instant.ofEpochMilli(this.$ended);
                                        Long l6 = this.$id;
                                        TrackingService trackingService9 = this.this$0;
                                        try {
                                            Result.Companion companion18 = Result.INSTANCE;
                                            long longValue5 = l6.longValue();
                                            Intrinsics.checkNotNull(ofEpochMilli);
                                            Intrinsics.checkNotNull(ofEpochMilli2);
                                            d3 = trackingService9.totalDistanceM;
                                            j3 = trackingService9.totalSteps;
                                            str3 = trackingService9.currentActivityType;
                                            this.L$0 = coroutineScope3;
                                            this.L$1 = null;
                                            this.I$0 = i42;
                                            this.label = 8;
                                            backupRunToHealthConnect = healthConnectManager32.backupRunToHealthConnect(longValue5, ofEpochMilli, ofEpochMilli2, d3, j3, str3, this);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            i3 = i42;
                                            Result.Companion companion19 = Result.INSTANCE;
                                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                                            i = i3;
                                            TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                                            textToSpeech3 = this.this$0.tts;
                                            if (textToSpeech3 != null) {
                                            }
                                            this.this$0.tts = null;
                                            toneGenerator3 = this.this$0.tone;
                                            if (toneGenerator3 != null) {
                                            }
                                            this.this$0.tone = null;
                                            this.this$0.vibrator = null;
                                            sensorManager3 = this.this$0.sensorManager;
                                            if (sensorManager3 != null) {
                                            }
                                            this.this$0.sensorManager = null;
                                            this.this$0.stepCounterSensor = null;
                                            TrackingService trackingService10 = this.this$0;
                                            Result.Companion companion20 = Result.INSTANCE;
                                            broadcastReceiver3 = trackingService10.batteryReceiver;
                                            if (broadcastReceiver3 != null) {
                                            }
                                            Result.m7905constructorimpl(unit6);
                                            this.this$0.batteryReceiver = null;
                                            job5 = this.this$0.healthJob;
                                            if (job5 != null) {
                                            }
                                            this.this$0.healthJob = null;
                                            job6 = this.this$0.clockJob;
                                            if (job6 != null) {
                                            }
                                            this.this$0.clockJob = null;
                                            TrackingActiveStore.INSTANCE.clear(this.this$0);
                                            RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                                            RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                                            this.this$0.stopLocationThread();
                                            TrackingService trackingService11 = this.this$0;
                                            Result.Companion companion21 = Result.INSTANCE;
                                            wakeLock3 = trackingService11.wakeLock;
                                            if (wakeLock3 != null) {
                                            }
                                            Result.m7905constructorimpl(unit5);
                                            this.this$0.wakeLock = null;
                                            this.this$0.engine = null;
                                            this.this$0.plan = null;
                                            this.this$0.currentPlanType = null;
                                            this.this$0.currentTimeSession = null;
                                            this.this$0.runId = null;
                                            RecordingHrBridge.INSTANCE.onRunStopped();
                                            this.this$0.stopForeground(1);
                                            this.this$0.stopSelf();
                                            return Unit.INSTANCE;
                                        }
                                        if (backupRunToHealthConnect == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        i3 = i42;
                                        Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) backupRunToHealthConnect).booleanValue()));
                                        i = i3;
                                    }
                                }
                            }
                        }
                        TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                        textToSpeech3 = this.this$0.tts;
                        if (textToSpeech3 != null) {
                            textToSpeech3.shutdown();
                            Unit unit17 = Unit.INSTANCE;
                        }
                        this.this$0.tts = null;
                        toneGenerator3 = this.this$0.tone;
                        if (toneGenerator3 != null) {
                            toneGenerator3.release();
                            Unit unit18 = Unit.INSTANCE;
                        }
                        this.this$0.tone = null;
                        this.this$0.vibrator = null;
                        sensorManager3 = this.this$0.sensorManager;
                        if (sensorManager3 != null) {
                            trackingService$stepListener$13 = this.this$0.stepListener;
                            sensorManager3.unregisterListener(trackingService$stepListener$13);
                            Unit unit19 = Unit.INSTANCE;
                        }
                        this.this$0.sensorManager = null;
                        this.this$0.stepCounterSensor = null;
                        TrackingService trackingService102 = this.this$0;
                        Result.Companion companion202 = Result.INSTANCE;
                        broadcastReceiver3 = trackingService102.batteryReceiver;
                        if (broadcastReceiver3 != null) {
                            trackingService102.unregisterReceiver(broadcastReceiver3);
                            unit6 = Unit.INSTANCE;
                        } else {
                            unit6 = null;
                        }
                        Result.m7905constructorimpl(unit6);
                        this.this$0.batteryReceiver = null;
                        job5 = this.this$0.healthJob;
                        if (job5 != null) {
                            Job.DefaultImpls.cancel$default(job5, (CancellationException) null, 1, (Object) null);
                            Unit unit20 = Unit.INSTANCE;
                        }
                        this.this$0.healthJob = null;
                        job6 = this.this$0.clockJob;
                        if (job6 != null) {
                            Job.DefaultImpls.cancel$default(job6, (CancellationException) null, 1, (Object) null);
                            Unit unit21 = Unit.INSTANCE;
                        }
                        this.this$0.clockJob = null;
                        TrackingActiveStore.INSTANCE.clear(this.this$0);
                        RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                        RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                        this.this$0.stopLocationThread();
                        TrackingService trackingService112 = this.this$0;
                        Result.Companion companion212 = Result.INSTANCE;
                        wakeLock3 = trackingService112.wakeLock;
                        if (wakeLock3 != null) {
                            wakeLock3.release();
                            unit5 = Unit.INSTANCE;
                        } else {
                            unit5 = null;
                        }
                        Result.m7905constructorimpl(unit5);
                        this.this$0.wakeLock = null;
                        this.this$0.engine = null;
                        this.this$0.plan = null;
                        this.this$0.currentPlanType = null;
                        this.this$0.currentTimeSession = null;
                        this.this$0.runId = null;
                        RecordingHrBridge.INSTANCE.onRunStopped();
                        this.this$0.stopForeground(1);
                        this.this$0.stopSelf();
                        return Unit.INSTANCE;
                    }
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService1022 = this.this$0;
                Result.Companion companion2022 = Result.INSTANCE;
                broadcastReceiver3 = trackingService1022.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService1122 = this.this$0;
                Result.Companion companion2122 = Result.INSTANCE;
                wakeLock3 = trackingService1122.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointsForRun = obj;
                int size2 = ((List) pointsForRun).size();
                if (this.$duration < SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS) {
                    j7 = this.this$0.totalSteps;
                    if (j7 >= 200) {
                    }
                }
                z = true;
                repo5 = this.this$0.getRepo();
                longValue = this.$id.longValue();
                j4 = this.$ended;
                d4 = this.this$0.totalDistanceM;
                j5 = this.$duration;
                j6 = this.this$0.totalSteps;
                str4 = this.this$0.currentPlanType;
                str5 = this.this$0.currentTimeSession;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (repo5.finishRun(longValue, j4, d4, j5, j6, str4, str5, z, this) == coroutine_suspended) {
                }
                coroutineScope2 = coroutineScope;
                trackingService = this.this$0;
                Long l322 = this.$id;
                Result.Companion companion1222 = Result.INSTANCE;
                longValue2 = l322.longValue();
                this.L$0 = coroutineScope2;
                this.label = 3;
                if (RunFirestoreSync.INSTANCE.pushFinishedRun(trackingService, longValue2, this) == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                TrackingService trackingService622 = this.this$0;
                Long l422 = this.$id;
                Result.Companion companion1322 = Result.INSTANCE;
                repo = trackingService622.getRepo();
                long longValue322 = l422.longValue();
                this.L$0 = coroutineScope2;
                this.label = 4;
                m6844uploadRunToStravagIAlus = repo.m6844uploadRunToStravagIAlus(longValue322, this);
                if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                coroutineScope = coroutineScope2;
                l = this.$id;
                if (l != null) {
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService10222 = this.this$0;
                Result.Companion companion20222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService10222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService11222 = this.this$0;
                Result.Companion companion21222 = Result.INSTANCE;
                wakeLock3 = trackingService11222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 2:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope;
                trackingService = this.this$0;
                Long l3222 = this.$id;
                Result.Companion companion12222 = Result.INSTANCE;
                longValue2 = l3222.longValue();
                this.L$0 = coroutineScope2;
                this.label = 3;
                if (RunFirestoreSync.INSTANCE.pushFinishedRun(trackingService, longValue2, this) == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
                TrackingService trackingService6222 = this.this$0;
                Long l4222 = this.$id;
                Result.Companion companion13222 = Result.INSTANCE;
                repo = trackingService6222.getRepo();
                long longValue3222 = l4222.longValue();
                this.L$0 = coroutineScope2;
                this.label = 4;
                m6844uploadRunToStravagIAlus = repo.m6844uploadRunToStravagIAlus(longValue3222, this);
                if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                coroutineScope = coroutineScope2;
                l = this.$id;
                if (l != null) {
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService102222 = this.this$0;
                Result.Companion companion202222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService102222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService112222 = this.this$0;
                Result.Companion companion212222 = Result.INSTANCE;
                wakeLock3 = trackingService112222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 3:
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Result.m7905constructorimpl(Unit.INSTANCE);
                TrackingService trackingService62222 = this.this$0;
                Long l42222 = this.$id;
                Result.Companion companion132222 = Result.INSTANCE;
                repo = trackingService62222.getRepo();
                long longValue32222 = l42222.longValue();
                this.L$0 = coroutineScope2;
                this.label = 4;
                m6844uploadRunToStravagIAlus = repo.m6844uploadRunToStravagIAlus(longValue32222, this);
                if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                }
                Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                coroutineScope = coroutineScope2;
                l = this.$id;
                if (l != null) {
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService1022222 = this.this$0;
                Result.Companion companion2022222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService1022222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService1122222 = this.this$0;
                Result.Companion companion2122222 = Result.INSTANCE;
                wakeLock3 = trackingService1122222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 4:
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                m6844uploadRunToStravagIAlus = ((Result) obj).getValue();
                Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                coroutineScope = coroutineScope2;
                l = this.$id;
                if (l != null) {
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService10222222 = this.this$0;
                Result.Companion companion20222222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService10222222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService11222222 = this.this$0;
                Result.Companion companion21222222 = Result.INSTANCE;
                wakeLock3 = trackingService11222222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 5:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                runById = obj;
                if (runById != null) {
                }
                coroutineScope3 = coroutineScope;
                i = 0;
                if (i != 0) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService102222222 = this.this$0;
                Result.Companion companion202222222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService102222222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService112222222 = this.this$0;
                Result.Companion companion212222222 = Result.INSTANCE;
                wakeLock3 = trackingService112222222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 6:
                i = this.I$0;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                recordRecoveryEvent = obj;
                Result.m7905constructorimpl(Boxing.boxLong(((Number) recordRecoveryEvent).longValue()));
                if (this.this$0.getSharedPreferences("settings", 0).getBoolean("healthConnectAutoBackup", false)) {
                }
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService1022222222 = this.this$0;
                Result.Companion companion2022222222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService1022222222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService1122222222 = this.this$0;
                Result.Companion companion2122222222 = Result.INSTANCE;
                wakeLock3 = trackingService1122222222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            case 7:
                i2 = this.I$0;
                healthConnectManager = (HealthConnectManager) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    hasAllPermissions = obj;
                    m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) hasAllPermissions).booleanValue()));
                } catch (Throwable th11) {
                    th = th11;
                    Result.Companion companion172 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    int i422 = i2;
                    HealthConnectManager healthConnectManager322 = healthConnectManager;
                    Boolean boxBoolean22 = Boxing.boxBoolean(false);
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    }
                    if (((Boolean) m7905constructorimpl).booleanValue()) {
                    }
                }
                int i4222 = i2;
                HealthConnectManager healthConnectManager3222 = healthConnectManager;
                Boolean boxBoolean222 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                if (((Boolean) m7905constructorimpl).booleanValue()) {
                }
                break;
            case 8:
                i3 = this.I$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    backupRunToHealthConnect = obj;
                    Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) backupRunToHealthConnect).booleanValue()));
                } catch (Throwable th12) {
                    th = th12;
                    Result.Companion companion192 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    i = i3;
                    TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                    textToSpeech3 = this.this$0.tts;
                    if (textToSpeech3 != null) {
                    }
                    this.this$0.tts = null;
                    toneGenerator3 = this.this$0.tone;
                    if (toneGenerator3 != null) {
                    }
                    this.this$0.tone = null;
                    this.this$0.vibrator = null;
                    sensorManager3 = this.this$0.sensorManager;
                    if (sensorManager3 != null) {
                    }
                    this.this$0.sensorManager = null;
                    this.this$0.stepCounterSensor = null;
                    TrackingService trackingService10222222222 = this.this$0;
                    Result.Companion companion20222222222 = Result.INSTANCE;
                    broadcastReceiver3 = trackingService10222222222.batteryReceiver;
                    if (broadcastReceiver3 != null) {
                    }
                    Result.m7905constructorimpl(unit6);
                    this.this$0.batteryReceiver = null;
                    job5 = this.this$0.healthJob;
                    if (job5 != null) {
                    }
                    this.this$0.healthJob = null;
                    job6 = this.this$0.clockJob;
                    if (job6 != null) {
                    }
                    this.this$0.clockJob = null;
                    TrackingActiveStore.INSTANCE.clear(this.this$0);
                    RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                    RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                    this.this$0.stopLocationThread();
                    TrackingService trackingService11222222222 = this.this$0;
                    Result.Companion companion21222222222 = Result.INSTANCE;
                    wakeLock3 = trackingService11222222222.wakeLock;
                    if (wakeLock3 != null) {
                    }
                    Result.m7905constructorimpl(unit5);
                    this.this$0.wakeLock = null;
                    this.this$0.engine = null;
                    this.this$0.plan = null;
                    this.this$0.currentPlanType = null;
                    this.this$0.currentTimeSession = null;
                    this.this$0.runId = null;
                    RecordingHrBridge.INSTANCE.onRunStopped();
                    this.this$0.stopForeground(1);
                    this.this$0.stopSelf();
                    return Unit.INSTANCE;
                }
                i = i3;
                TrackingState.INSTANCE.update(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, i != 0 ? this.$id : null, i != 0 ? Boxing.boxLong(this.$ended) : null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435070, null));
                textToSpeech3 = this.this$0.tts;
                if (textToSpeech3 != null) {
                }
                this.this$0.tts = null;
                toneGenerator3 = this.this$0.tone;
                if (toneGenerator3 != null) {
                }
                this.this$0.tone = null;
                this.this$0.vibrator = null;
                sensorManager3 = this.this$0.sensorManager;
                if (sensorManager3 != null) {
                }
                this.this$0.sensorManager = null;
                this.this$0.stepCounterSensor = null;
                TrackingService trackingService102222222222 = this.this$0;
                Result.Companion companion202222222222 = Result.INSTANCE;
                broadcastReceiver3 = trackingService102222222222.batteryReceiver;
                if (broadcastReceiver3 != null) {
                }
                Result.m7905constructorimpl(unit6);
                this.this$0.batteryReceiver = null;
                job5 = this.this$0.healthJob;
                if (job5 != null) {
                }
                this.this$0.healthJob = null;
                job6 = this.this$0.clockJob;
                if (job6 != null) {
                }
                this.this$0.clockJob = null;
                TrackingActiveStore.INSTANCE.clear(this.this$0);
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(this.this$0);
                RideRunWidgetUpdater.INSTANCE.refreshAsync(this.this$0);
                this.this$0.stopLocationThread();
                TrackingService trackingService112222222222 = this.this$0;
                Result.Companion companion212222222222 = Result.INSTANCE;
                wakeLock3 = trackingService112222222222.wakeLock;
                if (wakeLock3 != null) {
                }
                Result.m7905constructorimpl(unit5);
                this.this$0.wakeLock = null;
                this.this$0.engine = null;
                this.this$0.plan = null;
                this.this$0.currentPlanType = null;
                this.this$0.currentTimeSession = null;
                this.this$0.runId = null;
                RecordingHrBridge.INSTANCE.onRunStopped();
                this.this$0.stopForeground(1);
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
