package com.example.rungps.sleep;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioRecord;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.example.rungps.AppBranding;
import com.example.rungps.MainActivity;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.sleep.SleepAccelWindow;
import com.example.rungps.sleep.SleepAlarmAudit;
import com.example.rungps.sleep.SleepAudioFeaturePipeline;
import com.example.rungps.sleep.SleepTrackingLiveStats;
import com.google.common.primitives.Ints;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: SleepListenService.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001YB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010,H\u0016J\b\u00100\u001a\u00020.H\u0016J\"\u00101\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\fH\u0016J\b\u00104\u001a\u00020\u001aH\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020\u001aH\u0002J\u000e\u0010;\u001a\u00020.H\u0082@¢\u0006\u0002\u0010<J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\u000e\u0010?\u001a\u00020.H\u0082@¢\u0006\u0002\u0010<J\u0018\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020CH\u0002J\u0010\u0010F\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020CH\u0002J\b\u0010G\u001a\u00020.H\u0002J\b\u0010H\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020$H\u0002J\u0018\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020$H\u0002J\u0012\u0010L\u001a\u00020.2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u001a\u0010O\u001a\u00020.2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\fH\u0016J\b\u0010S\u001a\u00020.H\u0002J\b\u0010T\u001a\u00020.H\u0016J\u0010\u0010U\u001a\u00020V2\u0006\u00106\u001a\u000207H\u0002J\u0010\u0010W\u001a\u00020.2\u0006\u00106\u001a\u000207H\u0002J\b\u0010X\u001a\u00020.H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/example/rungps/sleep/SleepListenService;", "Landroid/app/Service;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sampleJob", "Lkotlinx/coroutines/Job;", "audioJob", "healthJob", "emptyReadStreak", "", "sensorManager", "Landroid/hardware/SensorManager;", "audioRecord", "Landroid/media/AudioRecord;", "accelWindow", "Lcom/example/rungps/sleep/SleepAccelWindow;", "rmsBucket", "", "", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "alarmTriggered", "", "wakeWindowAnnounced", "bucketCount", "lastAccelMag", "highMoveStreak", "awayFromBedNotified", "micFailStreak", "pcmRing", "Lcom/example/rungps/sleep/SleepPcmRingBuffer;", "lastClipAtMs", "", "clipsThisNight", "melPartials", "", "lastBucketElapsedMs", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onTaskRemoved", "", "rootIntent", "onCreate", "onStartCommand", "flags", "startId", "hasRecordAudio", "promoteToForeground", "text", "", "startContinuousCapture", "startHealthMonitor", "startAudioRecord", "audioReadLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restartAudioCapture", "renewWakeLockIfNeeded", "bucketLoop", "maybeCaptureSoundClipForSample", "startedAtMs", "sample", "Lcom/example/rungps/sleep/SleepTrackSample;", "isTalkBucket", "s", "isNoiseDisturbanceBucket", "checkAwayFromBed", "checkSmartAlarm", "fireAlarm", "smart", "wakeAtMs", "onSensorChanged", NotificationCompat.CATEGORY_EVENT, "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "stopCapture", "onDestroy", "buildNotification", "Landroid/app/Notification;", "updateNotification", "ensureChannel", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepListenService extends Service implements SensorEventListener {
    public static final String ACTION_START = "com.example.rungps.sleep.START";
    public static final String ACTION_STOP = "com.example.rungps.sleep.STOP";
    private static final long AUDIO_READ_MS = 500;
    private static final long BUCKET_MS = 10000;
    private static final int CALIBRATION_BUCKETS = 6;
    private static final String CHANNEL_ID = "sleep_listen";
    public static final String EXTRA_ALARM_TARGET_MS = "alarm_target_ms";
    public static final String EXTRA_SMART_ALARM = "smart_alarm";
    public static final String EXTRA_WINDOW_MIN = "window_min";
    private static final long HEALTH_INTERVAL_MS = 20000;
    private static final long MIN_TRACK_MS_BEFORE_ALARM = 300000;
    private static final int NOTIFICATION_ID = 7102;
    private static volatile boolean runningFlag;
    private boolean alarmTriggered;
    private Job audioJob;
    private AudioRecord audioRecord;
    private boolean awayFromBedNotified;
    private int bucketCount;
    private int clipsThisNight;
    private int emptyReadStreak;
    private Job healthJob;
    private int highMoveStreak;
    private float lastAccelMag;
    private long lastBucketElapsedMs;
    private long lastClipAtMs;
    private int micFailStreak;
    private Job sampleJob;
    private SensorManager sensorManager;
    private PowerManager.WakeLock wakeLock;
    private boolean wakeWindowAnnounced;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
    private final SleepAccelWindow accelWindow = new SleepAccelWindow(12000);
    private final List<Float> rmsBucket = new ArrayList();
    private SleepPcmRingBuffer pcmRing = new SleepPcmRingBuffer(20, INSTANCE.getSAMPLE_RATE());
    private final List<float[]> melPartials = new ArrayList();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        if (SleepOvernightStore.INSTANCE.isActive(this)) {
            SleepAlarmScheduler sleepAlarmScheduler = SleepAlarmScheduler.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            SleepAlarmScheduler.scheduleImmediateKeepAlive$default(sleepAlarmScheduler, applicationContext, 0L, 2, null);
            Companion companion = INSTANCE;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            companion.resumeIfSessionActive(applicationContext2);
        }
        super.onTaskRemoved(rootIntent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        runningFlag = true;
        SensorManager sensorManager = (SensorManager) getSystemService(SensorManager.class);
        this.sensorManager = sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, sensorManager != null ? sensorManager.getDefaultSensor(1) : null, 1);
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService(PowerManager.class)).newWakeLock(1, AppBranding.WAKE_LOCK_TAG);
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(43200000L);
        this.wakeLock = newWakeLock;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 7437517) {
                if (hashCode == 1939902999 && action.equals(ACTION_STOP)) {
                    SleepListenService sleepListenService = this;
                    SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService, "user_stop");
                    SleepAlarmScheduler.INSTANCE.cancelAll(sleepListenService);
                    stopCapture();
                    stopSelf();
                    return 2;
                }
            } else if (action.equals(ACTION_START)) {
                long longExtra = intent.getLongExtra(EXTRA_ALARM_TARGET_MS, 0L);
                int intExtra = intent.getIntExtra(EXTRA_WINDOW_MIN, 30);
                boolean booleanExtra = intent.getBooleanExtra(EXTRA_SMART_ALARM, true);
                SleepListenService sleepListenService2 = this;
                SleepOvernightStore.INSTANCE.clearSessionIfStale(sleepListenService2);
                if (SleepOvernightStore.INSTANCE.isRecoverableStale(sleepListenService2)) {
                    SleepOvernightStore.INSTANCE.recordHealth(sleepListenService2, "start_blocked_recoverable");
                    stopCapture();
                    stopSelf();
                    return 2;
                }
                if (longExtra > 0) {
                    if (!SleepOvernightStore.INSTANCE.isActive(sleepListenService2) || !SleepOvernightStore.INSTANCE.isSessionValid(sleepListenService2) || Math.abs(SleepOvernightStore.INSTANCE.alarmTargetMs(sleepListenService2) - longExtra) > 60000) {
                        SleepOvernightStore.INSTANCE.repairSamplesFileIfNeeded(sleepListenService2);
                        SleepOvernightStore.INSTANCE.startSession(sleepListenService2, longExtra, intExtra, booleanExtra);
                        SleepOvernightStore.INSTANCE.recordHealth(sleepListenService2, "session_started");
                    } else {
                        SleepOvernightStore.INSTANCE.recordHealth(sleepListenService2, "session_resumed");
                    }
                    SleepAlarmPreferences.INSTANCE.setLastAlarmTargetMs(sleepListenService2, longExtra);
                }
                if (SleepOvernightStore.INSTANCE.isActive(sleepListenService2)) {
                    SleepAlarmScheduler.INSTANCE.ensureScheduled(sleepListenService2);
                }
            }
        }
        SleepListenService sleepListenService3 = this;
        SleepOvernightStore.INSTANCE.clearSessionIfStale(sleepListenService3);
        if (!SleepOvernightStore.INSTANCE.isActive(sleepListenService3)) {
            SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService3, "no_active_session");
            stopCapture();
            stopSelf();
            return 2;
        }
        if (SleepOvernightStore.INSTANCE.isRecoverableStale(sleepListenService3)) {
            SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService3, "recoverable_stale_session");
            stopCapture();
            stopSelf();
            return 2;
        }
        if (!SleepOvernightStore.INSTANCE.isSessionValid(sleepListenService3)) {
            SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService3, "invalid_session");
            stopCapture();
            stopSelf();
            return 2;
        }
        SleepAlarmScheduler.INSTANCE.ensureScheduled(sleepListenService3);
        if (!hasRecordAudio()) {
            SleepOvernightStore.INSTANCE.recordHealth(sleepListenService3, "waiting_for_record_audio");
            updateNotification("Microphone required — grant RECORD_AUDIO for overnight tracking");
            if (!promoteToForeground("Sleep tracking — mic permission needed")) {
                SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService3, "fgs_without_mic_denied");
            }
            return 1;
        }
        if (!promoteToForeground("Listening for sleep…")) {
            SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService3, "fgs_promote_failed");
            SleepOvernightStore.INSTANCE.recordHealth(sleepListenService3, "retrying_fgs");
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$onStartCommand$1(this, null), 3, null);
            return 1;
        }
        startContinuousCapture();
        SleepAlarmScheduler.INSTANCE.scheduleSamplesWatchdog(sleepListenService3, SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasRecordAudio() {
        return ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean promoteToForeground(String text) {
        Notification buildNotification = buildNotification(text);
        try {
            int i = 128;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!hasRecordAudio()) {
                    i = 1073741824;
                }
                startForeground(NOTIFICATION_ID, buildNotification, i);
            } else if (hasRecordAudio()) {
                startForeground(NOTIFICATION_ID, buildNotification, 128);
            } else {
                startForeground(NOTIFICATION_ID, buildNotification);
            }
            return true;
        } catch (SecurityException unused) {
            if (Build.VERSION.SDK_INT >= 34 && !hasRecordAudio()) {
                try {
                    startForeground(NOTIFICATION_ID, buildNotification, Ints.MAX_POWER_OF_TWO);
                    return true;
                } catch (SecurityException unused2) {
                    return false;
                }
            }
            return false;
        }
    }

    private final void startContinuousCapture() {
        Job launch$default;
        Job launch$default2;
        stopCapture();
        this.rmsBucket.clear();
        this.emptyReadStreak = 0;
        SleepPcmRingBuffer sleepPcmRingBuffer = new SleepPcmRingBuffer(20, INSTANCE.getSAMPLE_RATE());
        this.pcmRing = sleepPcmRingBuffer;
        sleepPcmRingBuffer.clear();
        this.lastClipAtMs = 0L;
        this.clipsThisNight = 0;
        this.melPartials.clear();
        this.lastBucketElapsedMs = 0L;
        if (!startAudioRecord()) {
            SleepOvernightStore.INSTANCE.recordHealth(this, "mic_init_failed");
            updateNotification("Mic unavailable — retrying…");
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$startContinuousCapture$1(this, null), 3, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$startContinuousCapture$2(this, null), 3, null);
        this.audioJob = launch$default;
        launch$default2 = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$startContinuousCapture$3(this, null), 3, null);
        this.sampleJob = launch$default2;
        startHealthMonitor();
    }

    private final void startHealthMonitor() {
        Job launch$default;
        Job job = this.healthJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$startHealthMonitor$1(this, null), 3, null);
        this.healthJob = launch$default;
    }

    private final boolean startAudioRecord() {
        int minBufferSize;
        AudioRecord audioRecord;
        if (!hasRecordAudio() || (minBufferSize = AudioRecord.getMinBufferSize(INSTANCE.getSAMPLE_RATE(), 16, 2)) <= 0) {
            return false;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(1);
        createListBuilder.add(9);
        Iterator it = CollectionsKt.build(createListBuilder).iterator();
        while (true) {
            audioRecord = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                audioRecord = new AudioRecord(((Number) it.next()).intValue(), INSTANCE.getSAMPLE_RATE(), 16, 2, minBufferSize * 4);
            } catch (Exception unused) {
            }
            if (audioRecord != null) {
                if (audioRecord.getState() == 1) {
                    break;
                }
                audioRecord.release();
            }
        }
        if (audioRecord == null) {
            return false;
        }
        try {
            audioRecord.startRecording();
            this.audioRecord = audioRecord;
            SleepOvernightStore.INSTANCE.recordHealth(this, "mic_started");
            return true;
        } catch (Exception unused2) {
            audioRecord.release();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object audioReadLoop(Continuation<? super Unit> continuation) {
        SleepListenService$audioReadLoop$1 sleepListenService$audioReadLoop$1;
        int i;
        short[] sArr;
        AudioRecord audioRecord;
        int i2;
        if (continuation instanceof SleepListenService$audioReadLoop$1) {
            sleepListenService$audioReadLoop$1 = (SleepListenService$audioReadLoop$1) continuation;
            if ((sleepListenService$audioReadLoop$1.label & Integer.MIN_VALUE) != 0) {
                sleepListenService$audioReadLoop$1.label -= Integer.MIN_VALUE;
                Object obj = sleepListenService$audioReadLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepListenService$audioReadLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sArr = new short[RangesKt.coerceAtLeast(AudioRecord.getMinBufferSize(INSTANCE.getSAMPLE_RATE(), 16, 2), 1024)];
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    short[] sArr2 = (short[]) sleepListenService$audioReadLoop$1.L$1;
                    SleepListenService sleepListenService = (SleepListenService) sleepListenService$audioReadLoop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sArr = sArr2;
                    this = sleepListenService;
                }
                while (CoroutineScopeKt.isActive(this.scope) && SleepOvernightStore.INSTANCE.isActive(this)) {
                    audioRecord = this.audioRecord;
                    if (audioRecord != null) {
                        sleepListenService$audioReadLoop$1.L$0 = this;
                        sleepListenService$audioReadLoop$1.L$1 = sArr;
                        sleepListenService$audioReadLoop$1.label = 1;
                        if (DelayKt.delay(500L, sleepListenService$audioReadLoop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (audioRecord.getState() != 1 || audioRecord.getRecordingState() != 3) {
                        int i3 = this.micFailStreak + 1;
                        this.micFailStreak = i3;
                        if (i3 >= 2) {
                            this.restartAudioCapture();
                            this.micFailStreak = 0;
                        }
                        sleepListenService$audioReadLoop$1.L$0 = this;
                        sleepListenService$audioReadLoop$1.L$1 = sArr;
                        sleepListenService$audioReadLoop$1.label = 2;
                        if (DelayKt.delay(500L, sleepListenService$audioReadLoop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        try {
                            i2 = audioRecord.read(sArr, 0, sArr.length);
                        } catch (Exception unused) {
                            i2 = -1;
                        }
                        if (i2 > 0) {
                            this.micFailStreak = 0;
                            this.emptyReadStreak = 0;
                            this.rmsBucket.add(Boxing.boxFloat(SleepAudioAnalyzer.INSTANCE.rmsFromPcm(sArr, i2)));
                            this.pcmRing.appendPcm(sArr, i2);
                        } else if (i2 == 0) {
                            int i4 = this.emptyReadStreak + 1;
                            this.emptyReadStreak = i4;
                            if (i4 >= 10) {
                                this.restartAudioCapture();
                                this.emptyReadStreak = 0;
                            }
                        } else {
                            int i5 = this.micFailStreak + 1;
                            this.micFailStreak = i5;
                            if (i5 >= 3) {
                                this.restartAudioCapture();
                                this.micFailStreak = 0;
                            }
                        }
                        sleepListenService$audioReadLoop$1.L$0 = this;
                        sleepListenService$audioReadLoop$1.L$1 = sArr;
                        sleepListenService$audioReadLoop$1.label = 3;
                        if (DelayKt.delay(500L, sleepListenService$audioReadLoop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        sleepListenService$audioReadLoop$1 = new SleepListenService$audioReadLoop$1(this, continuation);
        Object obj2 = sleepListenService$audioReadLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepListenService$audioReadLoop$1.label;
        if (i != 0) {
        }
        while (CoroutineScopeKt.isActive(this.scope)) {
            audioRecord = this.audioRecord;
            if (audioRecord != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartAudioCapture() {
        Job launch$default;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepListenService sleepListenService = this;
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
            }
            AudioRecord audioRecord2 = this.audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.audioRecord = null;
        SleepOvernightStore.INSTANCE.recordHealth(this, "mic_restart");
        if (startAudioRecord()) {
            updateNotification("Mic restarted — still tracking");
            Job job = this.audioJob;
            if (job == null || !job.isActive()) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$restartAudioCapture$2(this, null), 3, null);
                this.audioJob = launch$default;
                return;
            }
            return;
        }
        updateNotification("Mic lost — retrying…");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SleepListenService$restartAudioCapture$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renewWakeLockIfNeeded() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepListenService sleepListenService = this;
            wakeLock.acquire(43200000L);
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0067 -> B:10:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bucketLoop(Continuation<? super Unit> continuation) {
        SleepListenService$bucketLoop$1 sleepListenService$bucketLoop$1;
        int i;
        long startedAtMs;
        float[] fArr;
        long j;
        SleepListenService sleepListenService = this;
        if (continuation instanceof SleepListenService$bucketLoop$1) {
            sleepListenService$bucketLoop$1 = (SleepListenService$bucketLoop$1) continuation;
            if ((sleepListenService$bucketLoop$1.label & Integer.MIN_VALUE) != 0) {
                sleepListenService$bucketLoop$1.label -= Integer.MIN_VALUE;
                Object obj = sleepListenService$bucketLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepListenService$bucketLoop$1.label;
                long j2 = 10000;
                int i2 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    startedAtMs = SleepOvernightStore.INSTANCE.startedAtMs(sleepListenService);
                    if (!CoroutineScopeKt.isActive(sleepListenService.scope)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                startedAtMs = sleepListenService$bucketLoop$1.J$0;
                sleepListenService = (SleepListenService) sleepListenService$bucketLoop$1.L$0;
                ResultKt.throwOnFailure(obj);
                sleepListenService.renewWakeLockIfNeeded();
                long currentTimeMillis = System.currentTimeMillis() - startedAtMs;
                float averageOfFloat = sleepListenService.rmsBucket.isEmpty() ? (float) CollectionsKt.averageOfFloat(sleepListenService.rmsBucket) : 0.0f;
                SleepListenService sleepListenService2 = sleepListenService;
                float coerceAtLeast = RangesKt.coerceAtLeast(SleepOvernightStore.INSTANCE.baselineAudioRms(sleepListenService2), 50.0f);
                float coerceAtLeast2 = RangesKt.coerceAtLeast(SleepOvernightStore.INSTANCE.baselineMovement(sleepListenService2), 0.05f);
                List<SleepTrackSample> loadRecentSamples = SleepOvernightStore.INSTANCE.loadRecentSamples(sleepListenService2, 12);
                byte[] tailPcmBytes = sleepListenService.pcmRing.tailPcmBytes(10000);
                SleepAccelWindow.AccelSnapshot snapshot = sleepListenService.accelWindow.snapshot();
                Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = RangesKt.coerceIn(snapshot.getActivityIndex() / coerceAtLeast2, 0.0f, 2.0f);
                SleepAudioFeaturePipeline.BucketFeatures analyzeBucket = SleepAudioFeaturePipeline.INSTANCE.analyzeBucket(sleepListenService2, CollectionsKt.toList(sleepListenService.rmsBucket), coerceAtLeast, tailPcmBytes, INSTANCE.getSAMPLE_RATE(), floatRef.element, loadRecentSamples, sleepListenService.bucketCount);
                sleepListenService.rmsBucket.clear();
                sleepListenService.melPartials.add(analyzeBucket.getMelPartial());
                float asleepProb = analyzeBucket.getAsleepProb();
                float stageConfidence = analyzeBucket.getStageConfidence();
                float lightSleepProb = analyzeBucket.getLightSleepProb();
                String eventTag = analyzeBucket.getEventTag();
                SleepListenService$bucketLoop$1 sleepListenService$bucketLoop$12 = sleepListenService$bucketLoop$1;
                Object obj2 = coroutine_suspended;
                if (sleepListenService.melPartials.size() < 3) {
                    SleepAudioFeaturePipeline.EpochFeatures buildEpoch = SleepAudioFeaturePipeline.INSTANCE.buildEpoch(sleepListenService2, CollectionsKt.toList(sleepListenService.melPartials), loadRecentSamples, loadRecentSamples.size());
                    float[] melCompact = buildEpoch.getMelCompact();
                    asleepProb = buildEpoch.getAsleepProb();
                    stageConfidence = buildEpoch.getStageConfidence();
                    lightSleepProb = buildEpoch.getLightSleepProb();
                    String eventTag2 = buildEpoch.getEventTag();
                    if (eventTag2 != null) {
                        eventTag = eventTag2;
                    }
                    sleepListenService.melPartials.clear();
                    fArr = melCompact;
                } else {
                    fArr = null;
                }
                long j3 = startedAtMs;
                float f = lightSleepProb;
                String str = eventTag;
                long j4 = sleepListenService.lastBucketElapsedMs;
                if (j4 > 0 || currentTimeMillis - j4 <= 25000) {
                    j = 10000;
                } else {
                    j = 10000;
                    SleepOvernightStore.INSTANCE.recordMicGap(sleepListenService2, (currentTimeMillis - sleepListenService.lastBucketElapsedMs) - 10000);
                }
                sleepListenService.lastBucketElapsedMs = currentTimeMillis;
                Float sonarMotion = analyzeBucket.getSonarMotion();
                if (sonarMotion != null) {
                    floatRef.element = SleepSonarProbe.fuseMotion$default(SleepSonarProbe.INSTANCE, floatRef.element, sonarMotion.floatValue(), 0.0f, 4, null);
                }
                SleepTrackSample sleepTrackSample = new SleepTrackSample(currentTimeMillis, floatRef.element, analyzeBucket.getWindow().getRms(), analyzeBucket.getWindow().getBreathRateBpm(), analyzeBucket.getWindow().getBreathRegularity(), analyzeBucket.getWindow().getQuietFraction(), analyzeBucket.getWindow().getSnoreLikelihood(), snapshot.getVariance(), fArr, Boxing.boxFloat(asleepProb), Boxing.boxFloat(stageConfidence), Boxing.boxFloat(f), str, Boxing.boxInt(analyzeBucket.getSnoreIntensity()), Boxing.boxBoolean(analyzeBucket.getAudioQualityOk()), analyzeBucket.getNoiseTag(), Boxing.boxBoolean(analyzeBucket.getBreathPause()), analyzeBucket.getSonarMotion());
                SleepOvernightStore.INSTANCE.appendSample(sleepListenService2, sleepTrackSample);
                sleepListenService.maybeCaptureSoundClipForSample(j3, sleepTrackSample);
                if (SleepOvernightStore.INSTANCE.sampleCount(sleepListenService2) == 6) {
                    SleepOvernightStore.INSTANCE.setBaselines(sleepListenService2, averageOfFloat, RangesKt.coerceAtLeast(snapshot.getActivityIndex(), 0.05f));
                }
                int i3 = sleepListenService.bucketCount + 1;
                sleepListenService.bucketCount = i3;
                if (i3 % 6 == 0) {
                    SleepTrackingLiveStats.Live fromContextWithCoverage = SleepTrackingLiveStats.INSTANCE.fromContextWithCoverage(sleepListenService2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fromContextWithCoverage.getStageHint());
                    sb.append(" · ");
                    sb.append(fromContextWithCoverage.getTrackedMin());
                    sb.append("m");
                    if (!fromContextWithCoverage.getPhoneStable()) {
                        sb.append(" · keep phone still");
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    sleepListenService.updateNotification(sb2);
                }
                if (sleepListenService.bucketCount % 6 == 0) {
                    SleepAlarmScheduler.INSTANCE.ensureScheduled(sleepListenService2);
                    sleepListenService.renewWakeLockIfNeeded();
                }
                if (sleepListenService.bucketCount % 30 == 0 && sleepListenService.audioRecord == null && sleepListenService.hasRecordAudio()) {
                    sleepListenService.restartAudioCapture();
                }
                sleepListenService.checkAwayFromBed();
                sleepListenService.checkSmartAlarm();
                i2 = 1;
                startedAtMs = j3;
                j2 = j;
                sleepListenService$bucketLoop$1 = sleepListenService$bucketLoop$12;
                coroutine_suspended = obj2;
                if (!CoroutineScopeKt.isActive(sleepListenService.scope) && SleepOvernightStore.INSTANCE.isActive(sleepListenService)) {
                    sleepListenService$bucketLoop$1.L$0 = sleepListenService;
                    sleepListenService$bucketLoop$1.J$0 = startedAtMs;
                    sleepListenService$bucketLoop$1.label = i2;
                    if (DelayKt.delay(j2, sleepListenService$bucketLoop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sleepListenService.renewWakeLockIfNeeded();
                    long currentTimeMillis2 = System.currentTimeMillis() - startedAtMs;
                    if (sleepListenService.rmsBucket.isEmpty()) {
                    }
                    SleepListenService sleepListenService22 = sleepListenService;
                    float coerceAtLeast3 = RangesKt.coerceAtLeast(SleepOvernightStore.INSTANCE.baselineAudioRms(sleepListenService22), 50.0f);
                    float coerceAtLeast22 = RangesKt.coerceAtLeast(SleepOvernightStore.INSTANCE.baselineMovement(sleepListenService22), 0.05f);
                    List<SleepTrackSample> loadRecentSamples2 = SleepOvernightStore.INSTANCE.loadRecentSamples(sleepListenService22, 12);
                    byte[] tailPcmBytes2 = sleepListenService.pcmRing.tailPcmBytes(10000);
                    SleepAccelWindow.AccelSnapshot snapshot2 = sleepListenService.accelWindow.snapshot();
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = RangesKt.coerceIn(snapshot2.getActivityIndex() / coerceAtLeast22, 0.0f, 2.0f);
                    SleepAudioFeaturePipeline.BucketFeatures analyzeBucket2 = SleepAudioFeaturePipeline.INSTANCE.analyzeBucket(sleepListenService22, CollectionsKt.toList(sleepListenService.rmsBucket), coerceAtLeast3, tailPcmBytes2, INSTANCE.getSAMPLE_RATE(), floatRef2.element, loadRecentSamples2, sleepListenService.bucketCount);
                    sleepListenService.rmsBucket.clear();
                    sleepListenService.melPartials.add(analyzeBucket2.getMelPartial());
                    float asleepProb2 = analyzeBucket2.getAsleepProb();
                    float stageConfidence2 = analyzeBucket2.getStageConfidence();
                    float lightSleepProb2 = analyzeBucket2.getLightSleepProb();
                    String eventTag3 = analyzeBucket2.getEventTag();
                    SleepListenService$bucketLoop$1 sleepListenService$bucketLoop$122 = sleepListenService$bucketLoop$1;
                    Object obj22 = coroutine_suspended;
                    if (sleepListenService.melPartials.size() < 3) {
                    }
                    long j32 = startedAtMs;
                    float f2 = lightSleepProb2;
                    String str2 = eventTag3;
                    long j42 = sleepListenService.lastBucketElapsedMs;
                    if (j42 > 0) {
                    }
                    j = 10000;
                    sleepListenService.lastBucketElapsedMs = currentTimeMillis2;
                    Float sonarMotion2 = analyzeBucket2.getSonarMotion();
                    if (sonarMotion2 != null) {
                    }
                    SleepTrackSample sleepTrackSample2 = new SleepTrackSample(currentTimeMillis2, floatRef2.element, analyzeBucket2.getWindow().getRms(), analyzeBucket2.getWindow().getBreathRateBpm(), analyzeBucket2.getWindow().getBreathRegularity(), analyzeBucket2.getWindow().getQuietFraction(), analyzeBucket2.getWindow().getSnoreLikelihood(), snapshot2.getVariance(), fArr, Boxing.boxFloat(asleepProb2), Boxing.boxFloat(stageConfidence2), Boxing.boxFloat(f2), str2, Boxing.boxInt(analyzeBucket2.getSnoreIntensity()), Boxing.boxBoolean(analyzeBucket2.getAudioQualityOk()), analyzeBucket2.getNoiseTag(), Boxing.boxBoolean(analyzeBucket2.getBreathPause()), analyzeBucket2.getSonarMotion());
                    SleepOvernightStore.INSTANCE.appendSample(sleepListenService22, sleepTrackSample2);
                    sleepListenService.maybeCaptureSoundClipForSample(j32, sleepTrackSample2);
                    if (SleepOvernightStore.INSTANCE.sampleCount(sleepListenService22) == 6) {
                    }
                    int i32 = sleepListenService.bucketCount + 1;
                    sleepListenService.bucketCount = i32;
                    if (i32 % 6 == 0) {
                    }
                    if (sleepListenService.bucketCount % 6 == 0) {
                    }
                    if (sleepListenService.bucketCount % 30 == 0) {
                        sleepListenService.restartAudioCapture();
                    }
                    sleepListenService.checkAwayFromBed();
                    sleepListenService.checkSmartAlarm();
                    i2 = 1;
                    startedAtMs = j32;
                    j2 = j;
                    sleepListenService$bucketLoop$1 = sleepListenService$bucketLoop$122;
                    coroutine_suspended = obj22;
                    if (!CoroutineScopeKt.isActive(sleepListenService.scope)) {
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        sleepListenService$bucketLoop$1 = new SleepListenService$bucketLoop$1(sleepListenService, continuation);
        Object obj3 = sleepListenService$bucketLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepListenService$bucketLoop$1.label;
        long j22 = 10000;
        int i22 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r0.equals("snore") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r0 = r22.getEventTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r0.equals("noise") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r0.equals("cough") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r0.equals("talk") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void maybeCaptureSoundClipForSample(long startedAtMs, SleepTrackSample sample) {
        String str;
        SleepListenPreferences sleepListenPreferences = SleepListenPreferences.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!sleepListenPreferences.saveSoundClips(applicationContext) || this.bucketCount < 6) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.clipsThisNight >= 30 || currentTimeMillis - this.lastClipAtMs < GymNfcConfig.DEFAULT_SAVER_POLL_MS) {
            return;
        }
        String eventTag = sample.getEventTag();
        if (eventTag != null) {
            switch (eventTag.hashCode()) {
                case 3552428:
                    break;
                case 94851114:
                    break;
                case 104998682:
                    break;
                case 109592231:
                    break;
            }
            if (str == null) {
                return;
            }
            byte[] tailPcmBytes = this.pcmRing.tailPcmBytes(12000);
            if (tailPcmBytes.length == 0) {
                return;
            }
            String str2 = str;
            BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getIO(), null, new SleepListenService$maybeCaptureSoundClipForSample$1(this, SleepAudioClipStore.INSTANCE.buildFileName(startedAtMs, currentTimeMillis, str2), tailPcmBytes, startedAtMs, currentTimeMillis, str2, sample, 12000, null), 2, null);
            return;
        }
        if (sample.getSnoreLikelihood() >= 0.35f) {
            str = "snore";
            if (str == null) {
            }
        } else {
            if (!isTalkBucket(sample)) {
                if (!isNoiseDisturbanceBucket(sample)) {
                    String str3 = null;
                    str = str3;
                    if (str == null) {
                    }
                }
                str = "noise";
                if (str == null) {
                }
            }
            str = "talk";
            if (str == null) {
            }
        }
    }

    private final boolean isTalkBucket(SleepTrackSample s) {
        return s.getBreathRateBpm() > 0.0f && (s.getAudioLevel() >= 1.85f || (s.getAudioLevel() >= 1.55f && s.getQuietFraction() <= 0.14f));
    }

    private final boolean isNoiseDisturbanceBucket(SleepTrackSample s) {
        return s.getSnoreLikelihood() < 0.2f && s.getAudioLevel() >= 2.2f && s.getQuietFraction() <= 0.2f;
    }

    private final void checkAwayFromBed() {
        if (this.awayFromBedNotified) {
            return;
        }
        SleepListenService sleepListenService = this;
        if (System.currentTimeMillis() >= SleepOvernightStore.INSTANCE.windowStartMs(sleepListenService)) {
            return;
        }
        List<SleepTrackSample> loadSamples = SleepOvernightStore.INSTANCE.loadSamples(sleepListenService);
        if (loadSamples.isEmpty()) {
            return;
        }
        List takeLast = CollectionsKt.takeLast(loadSamples, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(takeLast, 10));
        Iterator it = takeLast.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepTrackSample) it.next()).getMovement()));
        }
        if (((float) CollectionsKt.averageOfFloat(arrayList)) >= 1.35f) {
            this.highMoveStreak++;
        } else {
            this.highMoveStreak = 0;
        }
        if (this.highMoveStreak >= 120) {
            this.awayFromBedNotified = true;
            updateNotification("Still tracking — tap Save night if you're up");
        }
    }

    private final void checkSmartAlarm() {
        String str;
        if (this.alarmTriggered) {
            return;
        }
        SleepListenService sleepListenService = this;
        if (SleepOvernightStore.INSTANCE.isSessionValid(sleepListenService)) {
            long startedAtMs = startedAtMs();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - startedAtMs < 300000) {
                return;
            }
            long alarmTargetMs = SleepOvernightStore.INSTANCE.alarmTargetMs(sleepListenService);
            long windowStartMs = SleepOvernightStore.INSTANCE.windowStartMs(sleepListenService);
            long windowEndMs = SleepOvernightStore.INSTANCE.windowEndMs(sleepListenService);
            boolean smartAlarm = SleepOvernightStore.INSTANCE.smartAlarm(sleepListenService);
            if (alarmTargetMs < startedAtMs || windowEndMs < startedAtMs + 60000) {
                return;
            }
            if (currentTimeMillis >= windowStartMs && !this.wakeWindowAnnounced) {
                this.wakeWindowAnnounced = true;
                if (smartAlarm) {
                    str = "Wake-up window active — finding light sleep";
                } else {
                    str = "Wake-up window active — alarm at set time";
                }
                updateNotification(str);
            }
            if (!smartAlarm) {
                if (currentTimeMillis >= alarmTargetMs || currentTimeMillis >= windowEndMs) {
                    fireAlarm(false, RangesKt.coerceAtLeast(currentTimeMillis, alarmTargetMs));
                    return;
                }
                return;
            }
            if (currentTimeMillis < windowStartMs) {
                return;
            }
            List<SleepTrackSample> loadSamples = SleepOvernightStore.INSTANCE.loadSamples(sleepListenService);
            int bestWakeIndex = SleepPhaseAnalyzer.INSTANCE.bestWakeIndex(loadSamples, RangesKt.coerceAtLeast(windowStartMs - startedAtMs(), 0L), RangesKt.coerceAtLeast(windowEndMs - startedAtMs(), 0L), sleepListenService);
            if (bestWakeIndex >= 0 && bestWakeIndex < loadSamples.size()) {
                alarmTargetMs = startedAtMs() + loadSamples.get(bestWakeIndex).getElapsedMs();
            }
            if (currentTimeMillis >= alarmTargetMs || currentTimeMillis >= windowEndMs) {
                fireAlarm(true, RangesKt.coerceAtLeast(currentTimeMillis, alarmTargetMs));
            }
        }
    }

    private final long startedAtMs() {
        return SleepOvernightStore.INSTANCE.startedAtMs(this);
    }

    private final void fireAlarm(boolean smart, long wakeAtMs) {
        String str;
        if (this.alarmTriggered) {
            return;
        }
        this.alarmTriggered = true;
        SleepListenService sleepListenService = this;
        SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService, smart ? "smart_alarm_fired" : "fixed_alarm_fired");
        SleepAlarmAudit.INSTANCE.recordFired(sleepListenService, SleepAlarmAudit.FirePath.SERVICE_SMART);
        SleepWakeRecap.INSTANCE.recordSmartWake(sleepListenService, wakeAtMs, smart);
        SleepAlarmScheduler.INSTANCE.scheduleImmediate(sleepListenService);
        if (smart) {
            str = "Wake up — smart alarm";
        } else {
            str = "Wake up — alarm";
        }
        updateNotification(str);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (event == null) {
            return;
        }
        float f = event.values[0];
        float f2 = event.values[1];
        float f3 = event.values[2];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
        this.lastAccelMag = sqrt;
        this.accelWindow.add(System.currentTimeMillis(), sqrt);
    }

    private final void stopCapture() {
        Unit unit;
        Job job = this.sampleJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.audioJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job3 = this.healthJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.sampleJob = null;
        this.audioJob = null;
        this.healthJob = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepListenService sleepListenService = this;
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
            }
            AudioRecord audioRecord2 = this.audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.audioRecord = null;
        this.rmsBucket.clear();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Unit unit;
        Object m7905constructorimpl;
        SleepListenService sleepListenService = this;
        if (SleepOvernightStore.INSTANCE.isActive(sleepListenService)) {
            if (SleepOvernightStore.INSTANCE.isRecoverableStale(sleepListenService)) {
                SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService, "service_destroyed_recoverable");
                SleepOvernightStore.INSTANCE.recordHealth(sleepListenService, "service_destroyed_recoverable");
            } else if (SleepOvernightStore.INSTANCE.isSessionValid(sleepListenService)) {
                SleepOvernightStore.INSTANCE.recordMicGap(sleepListenService, 10000L);
                SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService, "service_destroyed");
                SleepOvernightStore.INSTANCE.recordHealth(sleepListenService, "service_destroyed_active");
                SleepAlarmScheduler sleepAlarmScheduler = SleepAlarmScheduler.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                sleepAlarmScheduler.ensureScheduled(applicationContext);
                SleepAlarmScheduler sleepAlarmScheduler2 = SleepAlarmScheduler.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                SleepAlarmScheduler.scheduleImmediateKeepAlive$default(sleepAlarmScheduler2, applicationContext2, 0L, 2, null);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    SleepListenService sleepListenService2 = this;
                    Companion companion2 = INSTANCE;
                    Context applicationContext3 = getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                    companion2.resumeIfSessionActive(applicationContext3);
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                Result.m7904boximpl(m7905constructorimpl);
            } else {
                SleepOvernightStore.INSTANCE.recordStopReason(sleepListenService, "service_destroyed_invalid");
                SleepOvernightStore.INSTANCE.recordHealth(sleepListenService, "service_destroyed_invalid");
            }
        }
        stopCapture();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        try {
            Result.Companion companion4 = Result.INSTANCE;
            SleepListenService sleepListenService3 = this;
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                wakeLock.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        this.wakeLock = null;
        runningFlag = false;
        super.onDestroy();
    }

    private final Notification buildNotification(String text) {
        ensureChannel();
        SleepListenService sleepListenService = this;
        PendingIntent activity = PendingIntent.getActivity(sleepListenService, 0, new Intent(sleepListenService, (Class<?>) MainActivity.class).putExtra("open_tab", "sleep"), 201326592);
        Notification build = new NotificationCompat.Builder(sleepListenService, CHANNEL_ID).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle("Exercise Tracker sleep tracking").setContentText(text).setContentIntent(activity).addAction(0, "Save night", PendingIntent.getActivity(sleepListenService, 1, new Intent(sleepListenService, (Class<?>) MainActivity.class).putExtra("open_tab", "sleep").putExtra("sleep_wake_prompt", true), 201326592)).setOngoing(true).setCategory(NotificationCompat.CATEGORY_ALARM).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void updateNotification(String text) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, buildNotification(text));
        }
    }

    private final void ensureChannel() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Sleep tracking", 2);
        notificationChannel.setDescription("Continuous bedside microphone and movement analysis (plugged in recommended)");
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* compiled from: SleepListenService.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/rungps/sleep/SleepListenService$Companion;", "", "<init>", "()V", "runningFlag", "", "isRunningInProcess", "ACTION_START", "", "ACTION_STOP", "EXTRA_ALARM_TARGET_MS", "EXTRA_WINDOW_MIN", "EXTRA_SMART_ALARM", "CHANNEL_ID", "NOTIFICATION_ID", "", "SAMPLE_RATE", "getSAMPLE_RATE", "()I", "BUCKET_MS", "", "AUDIO_READ_MS", "CALIBRATION_BUCKETS", "HEALTH_INTERVAL_MS", "MIN_TRACK_MS_BEFORE_ALARM", "start", "", "context", "Landroid/content/Context;", "alarmTargetMs", "windowMin", "smartAlarm", "stop", "resumeIfSessionActive", "computeAlarmTargetMs", "hour", "minute", "zone", "Ljava/time/ZoneId;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSAMPLE_RATE() {
            return SleepAudioConstants.SAMPLE_RATE_V2;
        }

        private Companion() {
        }

        public final boolean isRunningInProcess() {
            return SleepListenService.runningFlag;
        }

        public final void start(Context context, long alarmTargetMs, int windowMin, boolean smartAlarm) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SleepListenService.class);
            intent.setAction(SleepListenService.ACTION_START);
            intent.putExtra(SleepListenService.EXTRA_ALARM_TARGET_MS, alarmTargetMs);
            intent.putExtra(SleepListenService.EXTRA_WINDOW_MIN, windowMin);
            intent.putExtra(SleepListenService.EXTRA_SMART_ALARM, smartAlarm);
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                Result.m7905constructorimpl(context.startForegroundService(intent));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }

        public final void stop(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startService(new Intent(context, (Class<?>) SleepListenService.class).setAction(SleepListenService.ACTION_STOP));
        }

        public final void resumeIfSessionActive(Context context) {
            Object m7905constructorimpl;
            Intrinsics.checkNotNullParameter(context, "context");
            SleepOvernightStore.INSTANCE.clearSessionIfStale(context);
            if (SleepOvernightStore.INSTANCE.isActive(context) && !SleepOvernightStore.INSTANCE.isRecoverableStale(context)) {
                if (!SleepOvernightStore.INSTANCE.isSessionValid(context)) {
                    SleepOvernightStore.INSTANCE.recordStopReason(context, "resume_invalid_session");
                    SleepOvernightStore.INSTANCE.clearSession(context, false);
                    return;
                }
                long alarmTargetMs = SleepOvernightStore.INSTANCE.alarmTargetMs(context);
                if (alarmTargetMs <= 0) {
                    SleepOvernightStore.INSTANCE.recordStopReason(context, "resume_no_alarm_target");
                    SleepOvernightStore.INSTANCE.clearSession(context, false);
                    return;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Companion companion2 = this;
                    start(context, alarmTargetMs, SleepOvernightStore.INSTANCE.windowMin(context), SleepOvernightStore.INSTANCE.smartAlarm(context));
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                    SleepOvernightStore.INSTANCE.recordStopReason(context, "resume_start_failed:" + m7908exceptionOrNullimpl.getClass().getSimpleName());
                }
            }
        }

        public static /* synthetic */ long computeAlarmTargetMs$default(Companion companion, int i, int i2, ZoneId zoneId, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                zoneId = ZoneId.systemDefault();
            }
            return companion.computeAlarmTargetMs(i, i2, zoneId);
        }

        public final long computeAlarmTargetMs(int hour, int minute, ZoneId zone) {
            Intrinsics.checkNotNullParameter(zone, "zone");
            ZonedDateTime atZone = Instant.now().atZone(zone);
            ZonedDateTime withNano = atZone.withHour(hour).withMinute(minute).withSecond(0).withNano(0);
            if (!withNano.isAfter(atZone)) {
                withNano = withNano.plusDays(1L);
            }
            return withNano.toInstant().toEpochMilli();
        }
    }
}
