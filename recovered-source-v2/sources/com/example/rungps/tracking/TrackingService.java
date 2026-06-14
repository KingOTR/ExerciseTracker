package com.example.rungps.tracking;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.MainActivity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.intervals.Cue;
import com.example.rungps.intervals.CustomPlan;
import com.example.rungps.intervals.CustomPlanKt;
import com.example.rungps.intervals.SegmentTarget;
import com.example.rungps.intervals.WorkoutEngine;
import com.example.rungps.intervals.WorkoutPlan;
import com.example.rungps.intervals.WorkoutSegment;
import com.example.rungps.widget.RideRunWidgetUpdater;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.samsung.android.sdk.health.data.BuildConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.Json;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n*\u0002ru\b\u0007\u0018\u0000 ¸\u00012\u00020\u0001:\u0002¸\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010w\u001a\u0004\u0018\u00010x2\b\u0010y\u001a\u0004\u0018\u00010zH\u0016J\u0012\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010zH\u0016J#\u0010~\u001a\u0002052\b\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010\u007f\u001a\u0002052\u0007\u0010\u0080\u0001\u001a\u000205H\u0016J\u0011\u0010\u0081\u0001\u001a\u00020|2\u0006\u0010y\u001a\u00020zH\u0002J\t\u0010\u0082\u0001\u001a\u00020fH\u0002J\t\u0010\u0083\u0001\u001a\u00020jH\u0002J\t\u0010\u0084\u0001\u001a\u00020|H\u0002J\t\u0010\u0085\u0001\u001a\u00020|H\u0002J\u0012\u0010\u0086\u0001\u001a\u00020|2\u0007\u0010\u0087\u0001\u001a\u00020&H\u0002J\t\u0010\u0088\u0001\u001a\u00020|H\u0002J\t\u0010\u0089\u0001\u001a\u00020|H\u0002J\t\u0010\u008a\u0001\u001a\u00020|H\u0002J\t\u0010\u008b\u0001\u001a\u00020|H\u0002J\t\u0010\u008c\u0001\u001a\u00020|H\u0002J\u0010\u0010\u008d\u0001\u001a\u00020|H\u0082@¢\u0006\u0003\u0010\u008e\u0001J\t\u0010\u008f\u0001\u001a\u00020|H\u0002J\t\u0010\u0090\u0001\u001a\u00020|H\u0016J\u0011\u0010\u0091\u0001\u001a\u00020|2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0092\u0001\u001a\u00020\u00172\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u0094\u0001\u001a\u00020|2\u0007\u0010\u0095\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0096\u0001\u001a\u00020|H\u0002J\u0012\u0010\u0097\u0001\u001a\u00020|2\u0007\u0010\u0098\u0001\u001a\u00020>H\u0002J\u0012\u0010\u0099\u0001\u001a\u00020|2\u0007\u0010\u0087\u0001\u001a\u00020&H\u0002J\u001b\u0010\u009a\u0001\u001a\u00020|2\u0007\u0010\u009b\u0001\u001a\u0002052\u0007\u0010\u009c\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010\u009d\u0001\u001a\u00020|2\u0007\u0010\u009e\u0001\u001a\u00020\u0017H\u0002J\u001a\u0010\u009f\u0001\u001a\u00020|2\u000f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u0001H\u0002J\t\u0010£\u0001\u001a\u00020|H\u0002J\t\u0010¤\u0001\u001a\u00020|H\u0002J\t\u0010¥\u0001\u001a\u00020|H\u0002J\u0012\u0010¦\u0001\u001a\u00020|2\u0007\u0010§\u0001\u001a\u000205H\u0002J\t\u0010¨\u0001\u001a\u00020|H\u0002J\t\u0010©\u0001\u001a\u00020|H\u0002J\t\u0010ª\u0001\u001a\u00020|H\u0002J\t\u0010«\u0001\u001a\u00020|H\u0002J\t\u0010¬\u0001\u001a\u00020|H\u0002J\t\u0010\u00ad\u0001\u001a\u00020|H\u0002J\u0013\u0010®\u0001\u001a\u00030¯\u00012\u0007\u0010\u0087\u0001\u001a\u00020&H\u0002J&\u0010°\u0001\u001a\u00020|2\u0007\u0010\u009e\u0001\u001a\u00020\u00172\u0007\u0010±\u0001\u001a\u00020\u001d2\t\u0010²\u0001\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010³\u0001\u001a\u00020&2\u0007\u0010´\u0001\u001a\u00020\u0017H\u0002J\u0012\u0010µ\u0001\u001a\u00020&2\u0007\u0010¶\u0001\u001a\u00020\u001dH\u0002J\t\u0010·\u0001\u001a\u00020|H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0004\n\u0002\u00106R\u0012\u00107\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u00108R\u0012\u00109\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010:\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010G\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010H\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010J\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010K\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Q\u001a\u0004\u0018\u00010RX\u0082\u000e¢\u0006\u0004\n\u0002\u0010SR\u000e\u0010T\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\b\u0018\u00010bR\u00020cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u0004\u0018\u00010hX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020oX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010q\u001a\u00020rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010sR\u0010\u0010t\u001a\u00020uX\u0082\u0004¢\u0006\u0004\n\u0002\u0010v¨\u0006¹\u0001"}, d2 = {"Lcom/example/rungps/tracking/TrackingService;", "Landroid/app/Service;", "<init>", "()V", BuildConfig.FLAVOR, "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "client$delegate", "Lkotlin/Lazy;", "repo", "Lcom/example/rungps/data/Repository;", "getRepo", "()Lcom/example/rungps/data/Repository;", "repo$delegate", "nm", "Landroid/app/NotificationManager;", "getNm", "()Landroid/app/NotificationManager;", "nm$delegate", "isRunning", "", "runId", "", "Ljava/lang/Long;", "startedAtMs", "pausedAccumMs", "pauseStartedAtMs", "totalDistanceM", "", "nextKmBeepAtM", "tts", "Landroid/speech/tts/TextToSpeech;", "engine", "Lcom/example/rungps/intervals/WorkoutEngine;", "plan", "Lcom/example/rungps/intervals/WorkoutPlan;", "currentPlanType", "", "currentTimeSession", "currentActivityType", "tone", "Landroid/media/ToneGenerator;", "vibrator", "Landroid/os/Vibrator;", "autoPauseEnabled", "vibrationEnabled", "voiceAlertsEnabled", "beepEnabled", "nextTimeAnnounceAtMs", TrackingService.EXTRA_BATTERY_MODE, TrackingService.EXTRA_SMOOTH_GPS, TrackingService.EXTRA_TARGET_PACE_SEC_PER_KM, "", "Ljava/lang/Integer;", TrackingService.EXTRA_GOAL_DISTANCE_M, "Ljava/lang/Double;", TrackingService.EXTRA_GOAL_TIME_MS, "isAutoPaused", "manualPaused", "lastMoveAtMs", "lastLoc", "Landroid/location/Location;", "lastGoodLoc", "lastSmoothed", "lastPointTimeMs", "lastNotificationAtMs", "lastGpsAtMs", "lastGoodGpsAtMs", "splitCount", "splitStartElapsedMs", "lastSplitMs", "lapCount", "lapStartElapsedMs", "lastLapMs", "lapStartDistanceM", "hazardCount", "sensorManager", "Landroid/hardware/SensorManager;", "stepCounterSensor", "Landroid/hardware/Sensor;", "stepBase", "", "Ljava/lang/Float;", "totalSteps", "stepsAtLastPoint", "poorGpsStreak", "wasInPoorGps", "lastGoodSpeedMps", "kmBeepCount", "lowBatteryAlerted", "batteryReceiver", "Landroid/content/BroadcastReceiver;", "spotifyJob", "Lkotlinx/coroutines/Job;", "lastSpotifyKey", "lastSpotifySavedAtMs", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "healthJob", "lastLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "locationThread", "Landroid/os/HandlerThread;", "locationLooper", "Landroid/os/Looper;", "serviceJob", "scope", "Lkotlinx/coroutines/CoroutineScope;", "locationMutex", "Lkotlinx/coroutines/sync/Mutex;", "clockJob", "stepListener", "com/example/rungps/tracking/TrackingService$stepListener$1", "Lcom/example/rungps/tracking/TrackingService$stepListener$1;", "callback", "com/example/rungps/tracking/TrackingService$callback$1", "Lcom/example/rungps/tracking/TrackingService$callback$1;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onTaskRemoved", "", "rootIntent", "onStartCommand", "flags", "startId", "start", "buildLocationRequest", "ensureLocationLooper", "stopLocationThread", "startLocationUpdates", "promoteToForeground", "text", "renewWakeLock", "ensureLocationUpdatesIfStale", "startRecordingClock", "startRecordingHealth", "reassertRecording", "recoverRecordingIfPossible", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "onDestroy", "startSpotifyTimeline", "activeElapsedMs", "nowMs", "setAutoPaused", "paused", "toggleManualPause", "handleLocation", "location", "speak", "announceKm", "km", "splitDurationMs", "maybeAnnounceElapsed", "elapsedMs", "emitCues", "cues", "", "Lcom/example/rungps/intervals/Cue;", "beepShort", "beepLong", "beepKm", "beepBurst", "count", "beepTripleShort", "ensureAlarmMaxVolume", "vibrateShort", "vibrateLong", "markLap", "markHazard", "buildNotification", "Landroid/app/Notification;", "updateNotification", "distanceM", "segLabel", "formatElapsedLocal", "ms", "formatPaceLocal", "secondsPerKm", "ensureChannel", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingService extends Service {
    public static final String ACTION_LAP = "com.example.rungps.tracking.LAP";
    public static final String ACTION_MARK_HAZARD = "com.example.rungps.tracking.MARK_HAZARD";
    public static final String ACTION_REASSERT = "com.example.rungps.tracking.REASSERT";
    public static final String ACTION_START = "com.example.rungps.tracking.START";
    public static final String ACTION_STOP = "com.example.rungps.tracking.STOP";
    public static final String ACTION_TOGGLE_PAUSE = "com.example.rungps.tracking.TOGGLE_PAUSE";
    public static final String BATTERY_NORMAL = "normal";
    public static final String BATTERY_RACE = "race";
    public static final String BATTERY_SAVE = "save";
    private static final String CHANNEL_ID = "tracking";
    public static final String EXTRA_ACTIVITY_TYPE = "activityType";
    public static final String EXTRA_AUTO_PAUSE = "autoPause";
    public static final String EXTRA_BATTERY_MODE = "batteryMode";
    public static final String EXTRA_BEEP_CUES = "beepCues";
    public static final String EXTRA_GOAL_DISTANCE_M = "goalDistanceM";
    public static final String EXTRA_GOAL_TIME_MS = "goalTimeMs";
    public static final String EXTRA_PLAN_JSON = "planJson";
    public static final String EXTRA_PLAN_TYPE = "planType";
    public static final String EXTRA_SMOOTH_GPS = "smoothGps";
    public static final String EXTRA_TARGET_PACE_SEC_PER_KM = "targetPaceSecPerKm";
    public static final String EXTRA_TIME_SESSION = "timeSession";
    public static final String EXTRA_VIBRATION = "vibration";
    public static final String EXTRA_VOICE_ALERTS = "voiceAlerts";
    private static final long HEALTH_INTERVAL_MS = 60000;
    private static final int NOTIF_ID = 1001;
    public static final String PLAN_CUSTOM = "custom";
    public static final String PLAN_DISTANCE_INTERVALS = "distanceIntervals";
    public static final String PLAN_FREE_RUN = "free";
    public static final String PLAN_TIME_INTERVALS = "timeIntervals";
    public static final String TIME_SESSION_1 = "s1";
    public static final String TIME_SESSION_2 = "s2";
    public static final String TIME_SESSION_3 = "s3";
    private BroadcastReceiver batteryReceiver;
    private final TrackingService$callback$1 callback;
    private Job clockJob;
    private String currentPlanType;
    private String currentTimeSession;
    private WorkoutEngine engine;
    private Double goalDistanceM;
    private Long goalTimeMs;
    private int hazardCount;
    private Job healthJob;
    private boolean isAutoPaused;
    private boolean isRunning;
    private int kmBeepCount;
    private int lapCount;
    private double lapStartDistanceM;
    private long lapStartElapsedMs;
    private long lastGoodGpsAtMs;
    private Location lastGoodLoc;
    private double lastGoodSpeedMps;
    private long lastGpsAtMs;
    private Long lastLapMs;
    private Location lastLoc;
    private LocationRequest lastLocationRequest;
    private long lastMoveAtMs;
    private long lastNotificationAtMs;
    private long lastPointTimeMs;
    private Location lastSmoothed;
    private Long lastSplitMs;
    private String lastSpotifyKey;
    private long lastSpotifySavedAtMs;
    private Looper locationLooper;
    private final Mutex locationMutex;
    private HandlerThread locationThread;
    private boolean lowBatteryAlerted;
    private boolean manualPaused;
    private Long pauseStartedAtMs;
    private long pausedAccumMs;
    private WorkoutPlan plan;
    private int poorGpsStreak;
    private Long runId;
    private final CoroutineScope scope;
    private SensorManager sensorManager;
    private final Job serviceJob;
    private int splitCount;
    private long splitStartElapsedMs;
    private Job spotifyJob;
    private long startedAtMs;
    private Float stepBase;
    private Sensor stepCounterSensor;
    private final TrackingService$stepListener$1 stepListener;
    private long stepsAtLastPoint;
    private Integer targetPaceSecPerKm;
    private ToneGenerator tone;
    private double totalDistanceM;
    private long totalSteps;
    private TextToSpeech tts;
    private Vibrator vibrator;
    private PowerManager.WakeLock wakeLock;
    private boolean wasInPoorGps;
    public static final int $stable = 8;

    /* renamed from: client$delegate, reason: from kotlin metadata */
    private final Lazy client = LazyKt.lazy(new Function0() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            FusedLocationProviderClient client_delegate$lambda$0;
            client_delegate$lambda$0 = TrackingService.client_delegate$lambda$0(TrackingService.this);
            return client_delegate$lambda$0;
        }
    });

    /* renamed from: repo$delegate, reason: from kotlin metadata */
    private final Lazy repo = LazyKt.lazy(new Function0() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Repository repo_delegate$lambda$1;
            repo_delegate$lambda$1 = TrackingService.repo_delegate$lambda$1(TrackingService.this);
            return repo_delegate$lambda$1;
        }
    });

    /* renamed from: nm$delegate, reason: from kotlin metadata */
    private final Lazy nm = LazyKt.lazy(new Function0() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NotificationManager nm_delegate$lambda$2;
            nm_delegate$lambda$2 = TrackingService.nm_delegate$lambda$2(TrackingService.this);
            return nm_delegate$lambda$2;
        }
    });
    private double nextKmBeepAtM = 1000.0d;
    private String currentActivityType = "RUN";
    private boolean autoPauseEnabled = true;
    private boolean vibrationEnabled = true;
    private boolean voiceAlertsEnabled = true;
    private boolean beepEnabled = true;
    private long nextTimeAnnounceAtMs = 600000;
    private String batteryMode = BATTERY_NORMAL;
    private boolean smoothGps = true;

    /* compiled from: TrackingService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Cue.Pattern.values().length];
            try {
                iArr[Cue.Pattern.Short.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cue.Pattern.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Cue.Pattern.IntervalEndOne.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Cue.Pattern.IntervalEndTwo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Cue.Pattern.IntervalEndThree.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Cue.Pattern.IntervalStartThree.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Cue.Pattern.IntervalStartTwo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Cue.Pattern.IntervalStartOne.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.example.rungps.tracking.TrackingService$stepListener$1] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.example.rungps.tracking.TrackingService$callback$1] */
    public TrackingService() {
        CompletableJob SupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.serviceJob = SupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorJob$default));
        this.locationMutex = MutexKt.Mutex$default(false, 1, null);
        this.stepListener = new SensorEventListener() { // from class: com.example.rungps.tracking.TrackingService$stepListener$1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                Float f;
                Intrinsics.checkNotNullParameter(event, "event");
                float[] values = event.values;
                Intrinsics.checkNotNullExpressionValue(values, "values");
                Float firstOrNull = ArraysKt.firstOrNull(values);
                if (firstOrNull != null) {
                    float floatValue = firstOrNull.floatValue();
                    f = TrackingService.this.stepBase;
                    if (f == null) {
                        TrackingService.this.stepBase = Float.valueOf(floatValue);
                        TrackingService.this.totalSteps = 0L;
                    } else {
                        long floatValue2 = (long) (floatValue - f.floatValue());
                        if (floatValue2 >= 0) {
                            TrackingService.this.totalSteps = floatValue2;
                        }
                    }
                }
            }
        };
        this.callback = new LocationCallback() { // from class: com.example.rungps.tracking.TrackingService$callback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                for (Location location : result.getLocations()) {
                    TrackingService trackingService = TrackingService.this;
                    Intrinsics.checkNotNull(location);
                    trackingService.handleLocation(location);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FusedLocationProviderClient client_delegate$lambda$0(TrackingService trackingService) {
        return LocationServices.getFusedLocationProviderClient(trackingService);
    }

    private final FusedLocationProviderClient getClient() {
        return (FusedLocationProviderClient) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Repository getRepo() {
        return (Repository) this.repo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Repository repo_delegate$lambda$1(TrackingService trackingService) {
        return Repository.INSTANCE.get(trackingService);
    }

    private final NotificationManager getNm() {
        return (NotificationManager) this.nm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManager nm_delegate$lambda$2(TrackingService trackingService) {
        Object systemService = trackingService.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        if (this.isRunning || TrackingActiveStore.INSTANCE.isActive(this)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                TrackingService trackingService = this;
                Result.m7905constructorimpl(startForegroundService(new Intent(this, (Class<?>) TrackingService.class).setAction(ACTION_REASSERT)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
        super.onTaskRemoved(rootIntent);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception unused) {
                return 1;
            }
        } else {
            action = null;
        }
        if (action == null) {
            if (this.isRunning || !TrackingActiveStore.INSTANCE.isActive(this)) {
                return 1;
            }
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$onStartCommand$1(this, null), 3, null);
            return 1;
        }
        switch (action.hashCode()) {
            case -1011633806:
                if (!action.equals(ACTION_REASSERT)) {
                    break;
                } else {
                    reassertRecording();
                    break;
                }
            case -287724375:
                if (!action.equals(ACTION_START)) {
                    break;
                } else {
                    start(intent);
                    break;
                }
            case -237177950:
                if (!action.equals(ACTION_LAP)) {
                    break;
                } else {
                    markLap();
                    break;
                }
            case 1237644987:
                if (!action.equals(ACTION_STOP)) {
                    break;
                } else {
                    stop();
                    break;
                }
            case 1551671012:
                if (!action.equals(ACTION_TOGGLE_PAUSE)) {
                    break;
                } else {
                    toggleManualPause();
                    break;
                }
            case 1794683115:
                if (!action.equals(ACTION_MARK_HAZARD)) {
                    break;
                } else {
                    markHazard();
                    break;
                }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void start(Intent intent) {
        TextToSpeech textToSpeech;
        CustomPlan customPlan;
        WorkoutPlan workoutPlan;
        SensorManager sensorManager;
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.startedAtMs = currentTimeMillis;
        this.pausedAccumMs = 0L;
        this.pauseStartedAtMs = null;
        this.totalDistanceM = 0.0d;
        double d = 1000.0d;
        this.nextKmBeepAtM = 1000.0d;
        this.nextTimeAnnounceAtMs = 600000L;
        this.kmBeepCount = 0;
        this.lowBatteryAlerted = false;
        this.totalSteps = 0L;
        this.stepBase = null;
        this.isAutoPaused = false;
        this.manualPaused = false;
        this.lastMoveAtMs = currentTimeMillis;
        this.lastLoc = null;
        this.lastSmoothed = null;
        this.lastPointTimeMs = currentTimeMillis;
        this.stepsAtLastPoint = 0L;
        this.poorGpsStreak = 0;
        this.wasInPoorGps = false;
        this.lastGoodSpeedMps = 0.0d;
        this.lastNotificationAtMs = 0L;
        this.lastGpsAtMs = currentTimeMillis;
        this.lastGoodGpsAtMs = currentTimeMillis;
        this.splitCount = 0;
        this.splitStartElapsedMs = 0L;
        this.lastSplitMs = null;
        this.lapCount = 0;
        this.lapStartElapsedMs = 0L;
        this.lastLapMs = null;
        this.lapStartDistanceM = 0.0d;
        this.hazardCount = 0;
        String stringExtra = intent.getStringExtra(EXTRA_ACTIVITY_TYPE);
        if (stringExtra == null) {
            stringExtra = "RUN";
        }
        this.currentActivityType = stringExtra;
        final boolean isBike = ActivityTypes.INSTANCE.isBike(this.currentActivityType);
        this.autoPauseEnabled = intent.getBooleanExtra(EXTRA_AUTO_PAUSE, true);
        this.vibrationEnabled = intent.getBooleanExtra(EXTRA_VIBRATION, true);
        this.voiceAlertsEnabled = intent.getBooleanExtra(EXTRA_VOICE_ALERTS, true);
        this.beepEnabled = intent.getBooleanExtra(EXTRA_BEEP_CUES, true);
        TrackingService trackingService = this;
        String preferredEnginePackage = RunTtsEngine.INSTANCE.preferredEnginePackage(trackingService);
        if (preferredEnginePackage != null) {
            textToSpeech = new TextToSpeech(trackingService, new TextToSpeech.OnInitListener() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda0
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    TrackingService.start$lambda$5(TrackingService.this, isBike, i);
                }
            }, preferredEnginePackage);
        } else {
            textToSpeech = new TextToSpeech(trackingService, new TextToSpeech.OnInitListener() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda1
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    TrackingService.start$lambda$7(TrackingService.this, isBike, i);
                }
            });
        }
        this.tts = textToSpeech;
        int i = 4;
        this.tone = new ToneGenerator(4, 100);
        this.vibrator = (Vibrator) ContextCompat.getSystemService(trackingService, Vibrator.class);
        Object systemService = getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager2 = (SensorManager) systemService;
        this.sensorManager = sensorManager2;
        if (!isBike) {
            Sensor defaultSensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(19) : null;
            this.stepCounterSensor = defaultSensor;
            if (defaultSensor != null && (sensorManager = this.sensorManager) != null) {
                Boolean.valueOf(sensorManager.registerListener(this.stepListener, defaultSensor, 3));
            }
        } else {
            this.stepCounterSensor = null;
            Unit unit = Unit.INSTANCE;
        }
        this.batteryReceiver = new BroadcastReceiver() { // from class: com.example.rungps.tracking.TrackingService$start$4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent2) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent2, "intent");
                z = TrackingService.this.isRunning;
                if (z) {
                    z2 = TrackingService.this.lowBatteryAlerted;
                    if (z2) {
                        return;
                    }
                    int intExtra = intent2.getIntExtra("level", -1);
                    Integer valueOf = Integer.valueOf(intent2.getIntExtra("scale", -1));
                    if (valueOf.intValue() <= 0) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : 100;
                    if (intExtra >= 0 && (intExtra * 100) / intValue <= 10) {
                        TrackingService.this.lowBatteryAlerted = true;
                        TrackingService.this.beepTripleShort();
                    }
                }
            }
        };
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService2 = this;
            Result.m7905constructorimpl(registerReceiver(this.batteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        String stringExtra2 = intent.getStringExtra(EXTRA_BATTERY_MODE);
        if (stringExtra2 == null) {
            stringExtra2 = BATTERY_NORMAL;
        }
        this.batteryMode = stringExtra2;
        this.smoothGps = intent.getBooleanExtra(EXTRA_SMOOTH_GPS, true);
        Integer valueOf = Integer.valueOf(intent.getIntExtra(EXTRA_TARGET_PACE_SEC_PER_KM, -1));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        this.targetPaceSecPerKm = valueOf;
        Double valueOf2 = Double.valueOf(intent.getDoubleExtra(EXTRA_GOAL_DISTANCE_M, -1.0d));
        if (valueOf2.doubleValue() <= 0.0d) {
            valueOf2 = null;
        }
        this.goalDistanceM = valueOf2;
        Long valueOf3 = Long.valueOf(intent.getLongExtra(EXTRA_GOAL_TIME_MS, -1L));
        if (valueOf3.longValue() <= 0) {
            valueOf3 = null;
        }
        this.goalTimeMs = valueOf3;
        String stringExtra3 = intent.getStringExtra(EXTRA_PLAN_TYPE);
        if (stringExtra3 == null) {
            stringExtra3 = isBike ? PLAN_FREE_RUN : PLAN_TIME_INTERVALS;
        }
        this.currentPlanType = stringExtra3;
        String stringExtra4 = intent.getStringExtra(EXTRA_PLAN_JSON);
        String stringExtra5 = intent.getStringExtra(EXTRA_TIME_SESSION);
        if (stringExtra5 == null) {
            stringExtra5 = TIME_SESSION_1;
        }
        this.currentTimeSession = stringExtra5;
        int hashCode = stringExtra3.hashCode();
        if (hashCode == -1349088399) {
            if (stringExtra3.equals(PLAN_CUSTOM)) {
                if (stringExtra4 != null) {
                    Json.Companion companion3 = Json.INSTANCE;
                    companion3.getSerializersModule();
                    customPlan = (CustomPlan) companion3.decodeFromString(CustomPlan.INSTANCE.serializer(), stringExtra4);
                } else {
                    customPlan = null;
                }
                workoutPlan = customPlan != null ? CustomPlanKt.toWorkoutPlan(customPlan) : null;
            }
            List createListBuilder = CollectionsKt.createListBuilder();
            String str = "/4";
            if (isBike) {
            }
            workoutPlan = new WorkoutPlan(CollectionsKt.build(createListBuilder));
        } else if (hashCode != -166532135) {
            if (hashCode == 3151468 && stringExtra3.equals(PLAN_FREE_RUN)) {
                workoutPlan = null;
            }
            List createListBuilder2 = CollectionsKt.createListBuilder();
            String str2 = "/4";
            if (isBike) {
                if (Intrinsics.areEqual(stringExtra5, TIME_SESSION_1)) {
                    start$lambda$20$warmUp(createListBuilder2);
                    int i2 = 0;
                    while (i2 < i) {
                        i2++;
                        start$lambda$20$tempo(createListBuilder2, 10, "Tempo " + i2 + str2);
                        start$lambda$20$easy$default(isBike, createListBuilder2, 0, "Easy " + i2 + str2, 4, null);
                        str2 = str2;
                        i = i;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else if (Intrinsics.areEqual(stringExtra5, TIME_SESSION_2)) {
                    start$lambda$20$warmUp(createListBuilder2);
                    start$lambda$20$tempo(createListBuilder2, 15, "Tempo 15'");
                    start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                    start$lambda$20$tempo(createListBuilder2, 12, "Tempo 12'");
                    start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                    start$lambda$20$tempo(createListBuilder2, 8, "Tempo 8'");
                    Boolean.valueOf(start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null));
                } else {
                    start$lambda$20$warmUp(createListBuilder2);
                    start$lambda$20$tempo(createListBuilder2, 20, "Tempo 20'");
                    start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                    start$lambda$20$tempo(createListBuilder2, 15, "Tempo 15'");
                    start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                    start$lambda$20$tempo(createListBuilder2, 10, "Tempo 10'");
                    Boolean.valueOf(start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null));
                }
            } else if (Intrinsics.areEqual(stringExtra5, TIME_SESSION_1)) {
                start$lambda$20$warmUp(createListBuilder2);
                int i3 = 0;
                while (i3 < i) {
                    i3++;
                    start$lambda$20$tempo(createListBuilder2, 8, "Tempo " + i3 + str2);
                    start$lambda$20$easy$default(isBike, createListBuilder2, 0, "Easy " + i3 + str2, 4, null);
                    str2 = str2;
                    i = i;
                }
                Unit unit3 = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(stringExtra5, TIME_SESSION_2)) {
                start$lambda$20$warmUp(createListBuilder2);
                start$lambda$20$tempo(createListBuilder2, 10, "Tempo 10'");
                start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                start$lambda$20$tempo(createListBuilder2, 8, "Tempo 8'");
                start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                start$lambda$20$tempo(createListBuilder2, 6, "Tempo 6'");
                Boolean.valueOf(start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null));
            } else {
                start$lambda$20$warmUp(createListBuilder2);
                start$lambda$20$tempo(createListBuilder2, 12, "Tempo 12'");
                start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                start$lambda$20$tempo(createListBuilder2, 10, "Tempo 10'");
                start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null);
                start$lambda$20$tempo(createListBuilder2, 8, "Tempo 8'");
                Boolean.valueOf(start$lambda$20$easy$default(isBike, createListBuilder2, 0, null, 12, null));
            }
            workoutPlan = new WorkoutPlan(CollectionsKt.build(createListBuilder2));
        } else {
            if (stringExtra3.equals(PLAN_DISTANCE_INTERVALS)) {
                if (isBike) {
                    List createListBuilder3 = CollectionsKt.createListBuilder();
                    createListBuilder3.add(new WorkoutSegment("Warm up", new SegmentTarget.DistanceM(5000.0d), null, 4, null));
                    int i4 = 0;
                    while (i4 < 6) {
                        i4++;
                        createListBuilder3.add(new WorkoutSegment("Hard " + i4 + "/6", new SegmentTarget.DistanceM(d), null, 4, null));
                        createListBuilder3.add(new WorkoutSegment("Easy " + i4 + "/6", new SegmentTarget.DistanceM(500.0d), null, 4, null));
                        d = 1000.0d;
                    }
                    createListBuilder3.add(new WorkoutSegment("Cool down", new SegmentTarget.DistanceM(2000.0d), null, 4, null));
                    workoutPlan = new WorkoutPlan(CollectionsKt.build(createListBuilder3));
                } else {
                    List createListBuilder4 = CollectionsKt.createListBuilder();
                    createListBuilder4.add(new WorkoutSegment("Warm up", new SegmentTarget.DistanceM(2000.0d), null, 4, null));
                    int i5 = 0;
                    while (i5 < 6) {
                        i5++;
                        createListBuilder4.add(new WorkoutSegment("Hard " + i5 + "/6", new SegmentTarget.DistanceM(400.0d), null, 4, null));
                        createListBuilder4.add(new WorkoutSegment("Easy " + i5 + "/6", new SegmentTarget.DistanceM(200.0d), null, 4, null));
                    }
                    createListBuilder4.add(new WorkoutSegment("Cool down", new SegmentTarget.DistanceM(1000.0d), null, 4, null));
                    workoutPlan = new WorkoutPlan(CollectionsKt.build(createListBuilder4));
                }
            }
            List createListBuilder22 = CollectionsKt.createListBuilder();
            String str22 = "/4";
            if (isBike) {
            }
            workoutPlan = new WorkoutPlan(CollectionsKt.build(createListBuilder22));
        }
        this.plan = workoutPlan;
        this.engine = workoutPlan != null ? new WorkoutEngine(workoutPlan) : null;
        promoteToForeground(isBike ? "Recording ride…" : "Recording run…");
        renewWakeLock();
        TrackingState.INSTANCE.update(new TrackingUiState(true, Long.valueOf(this.startedAtMs), 0L, 0.0d, 0L, null, null, null, null, stringExtra3, null, null, null, null, null, null, null, null, false, false, 0L, this.targetPaceSecPerKm, this.goalDistanceM, this.goalTimeMs, 0, null, 0, null, 253492704, null));
        this.lastLocationRequest = buildLocationRequest();
        try {
            Result.Companion companion4 = Result.INSTANCE;
            TrackingService trackingService3 = this;
            startLocationUpdates();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion5 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        startRecordingHealth();
        startRecordingClock();
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$start$14(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$5(TrackingService trackingService, boolean z, int i) {
        if (i == 0) {
            TextToSpeech textToSpeech = trackingService.tts;
            if (textToSpeech != null) {
                RunTtsEngine.INSTANCE.configure(textToSpeech);
            }
            if (trackingService.voiceAlertsEnabled) {
                trackingService.speak(RunVoiceAnnouncer.INSTANCE.activityStarted(z));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$7(TrackingService trackingService, boolean z, int i) {
        if (i == 0) {
            TextToSpeech textToSpeech = trackingService.tts;
            if (textToSpeech != null) {
                RunTtsEngine.INSTANCE.configure(textToSpeech);
            }
            if (trackingService.voiceAlertsEnabled) {
                trackingService.speak(RunVoiceAnnouncer.INSTANCE.activityStarted(z));
            }
        }
    }

    private static final boolean start$lambda$20$warmUp(List<WorkoutSegment> list) {
        return list.add(new WorkoutSegment("Warm up", new SegmentTarget.TimeMs(300000L), null, 4, null));
    }

    private static final boolean start$lambda$20$tempo(List<WorkoutSegment> list, int i, String str) {
        return list.add(new WorkoutSegment(str, new SegmentTarget.TimeMs(i * 60000), null, 4, null));
    }

    static /* synthetic */ boolean start$lambda$20$easy$default(boolean z, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = z ? 2 : 1;
        }
        if ((i2 & 8) != 0) {
            str = "Easy";
        }
        return start$lambda$20$easy(z, list, i, str);
    }

    private static final boolean start$lambda$20$easy(boolean z, List<WorkoutSegment> list, int i, String str) {
        return list.add(new WorkoutSegment(str, new SegmentTarget.TimeMs(i * 60000), null, 4, null));
    }

    private final LocationRequest buildLocationRequest() {
        Triple triple;
        String str = this.batteryMode;
        if (Intrinsics.areEqual(str, BATTERY_RACE)) {
            triple = new Triple(100, 750L, Float.valueOf(0.8f));
        } else {
            triple = Intrinsics.areEqual(str, BATTERY_SAVE) ? new Triple(102, 3000L, Float.valueOf(5.0f)) : new Triple(100, 1000L, Float.valueOf(1.0f));
        }
        int intValue = ((Number) triple.component1()).intValue();
        long longValue = ((Number) triple.component2()).longValue();
        LocationRequest build = new LocationRequest.Builder(intValue, longValue).setMinUpdateIntervalMillis(longValue / 2).setMinUpdateDistanceMeters(((Number) triple.component3()).floatValue()).setMaxUpdateDelayMillis(0L).setWaitForAccurateLocation(false).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final Looper ensureLocationLooper() {
        Looper looper = this.locationLooper;
        if (looper != null) {
            return looper;
        }
        HandlerThread handlerThread = new HandlerThread("RunGPS-Location");
        handlerThread.start();
        this.locationThread = handlerThread;
        this.locationLooper = handlerThread.getLooper();
        Looper looper2 = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper2, "getLooper(...)");
        return looper2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocationThread() {
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            Result.m7905constructorimpl(getClient().removeLocationUpdates(this.callback));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        HandlerThread handlerThread = this.locationThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.locationThread = null;
        this.locationLooper = null;
    }

    private final void startLocationUpdates() {
        LocationRequest locationRequest = this.lastLocationRequest;
        if (locationRequest == null) {
            locationRequest = buildLocationRequest();
            this.lastLocationRequest = locationRequest;
        }
        Looper ensureLocationLooper = ensureLocationLooper();
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            Result.m7905constructorimpl(getClient().requestLocationUpdates(locationRequest, this.callback, ensureLocationLooper));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promoteToForeground(String text) {
        ensureChannel();
        Notification buildNotification = buildNotification(text);
        try {
            startForeground(1001, buildNotification, 8);
        } catch (Exception unused) {
            startForeground(1001, buildNotification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renewWakeLock() {
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null || !wakeLock.isHeld()) {
                Object systemService = getSystemService("power");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager powerManager = (PowerManager) systemService;
                if (wakeLock != null) {
                    wakeLock.release();
                }
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "RunGPS:Tracking");
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(43200000L);
                this.wakeLock = newWakeLock;
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureLocationUpdatesIfStale() {
        if (System.currentTimeMillis() - this.lastGpsAtMs < 90000) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            getClient().removeLocationUpdates(this.callback);
            startLocationUpdates();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void startRecordingClock() {
        Job launch$default;
        Job job = this.clockJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$startRecordingClock$1(this, null), 3, null);
        this.clockJob = launch$default;
    }

    private final void startRecordingHealth() {
        Job launch$default;
        Job job = this.healthJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$startRecordingHealth$1(this, null), 3, null);
        this.healthJob = launch$default;
    }

    private final void reassertRecording() {
        if (!this.isRunning && TrackingActiveStore.INSTANCE.isActive(this)) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$reassertRecording$1(this, null), 3, null);
            return;
        }
        if (this.isRunning) {
            promoteToForeground("Recording — screen off OK");
            renewWakeLock();
            try {
                Result.Companion companion = Result.INSTANCE;
                TrackingService trackingService = this;
                getClient().removeLocationUpdates(this.callback);
                startLocationUpdates();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object recoverRecordingIfPossible(Continuation<? super Unit> continuation) {
        TrackingService$recoverRecordingIfPossible$1 trackingService$recoverRecordingIfPossible$1;
        int i;
        long longValue;
        RunEntity runEntity;
        final TrackingService trackingService;
        if (continuation instanceof TrackingService$recoverRecordingIfPossible$1) {
            trackingService$recoverRecordingIfPossible$1 = (TrackingService$recoverRecordingIfPossible$1) continuation;
            if ((trackingService$recoverRecordingIfPossible$1.label & Integer.MIN_VALUE) != 0) {
                trackingService$recoverRecordingIfPossible$1.label -= Integer.MIN_VALUE;
                Object obj = trackingService$recoverRecordingIfPossible$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = trackingService$recoverRecordingIfPossible$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.isRunning) {
                        return Unit.INSTANCE;
                    }
                    Long runId = TrackingActiveStore.INSTANCE.runId(this);
                    if (runId == null) {
                        return Unit.INSTANCE;
                    }
                    longValue = runId.longValue();
                    Repository repo = getRepo();
                    trackingService$recoverRecordingIfPossible$1.L$0 = this;
                    trackingService$recoverRecordingIfPossible$1.J$0 = longValue;
                    trackingService$recoverRecordingIfPossible$1.label = 1;
                    obj = repo.runById(longValue, trackingService$recoverRecordingIfPossible$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this = (TrackingService) trackingService$recoverRecordingIfPossible$1.L$1;
                        trackingService = (TrackingService) trackingService$recoverRecordingIfPossible$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.totalDistanceM = ((Number) obj).doubleValue();
                        trackingService.lastGpsAtMs = System.currentTimeMillis();
                        trackingService.lastLocationRequest = trackingService.buildLocationRequest();
                        trackingService.promoteToForeground("Recording resumed…");
                        trackingService.renewWakeLock();
                        trackingService.startLocationUpdates();
                        trackingService.startRecordingHealth();
                        trackingService.startRecordingClock();
                        TrackingState.INSTANCE.patch(new Function1() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                TrackingUiState recoverRecordingIfPossible$lambda$33;
                                recoverRecordingIfPossible$lambda$33 = TrackingService.recoverRecordingIfPossible$lambda$33(TrackingService.this, (TrackingUiState) obj2);
                                return recoverRecordingIfPossible$lambda$33;
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    longValue = trackingService$recoverRecordingIfPossible$1.J$0;
                    this = (TrackingService) trackingService$recoverRecordingIfPossible$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                runEntity = (RunEntity) obj;
                if (runEntity != null) {
                    TrackingActiveStore.INSTANCE.clear(this);
                    return Unit.INSTANCE;
                }
                if (runEntity.getEndedAtMs() != null) {
                    TrackingActiveStore.INSTANCE.clear(this);
                    return Unit.INSTANCE;
                }
                this.isRunning = true;
                this.runId = Boxing.boxLong(longValue);
                this.startedAtMs = runEntity.getStartedAtMs();
                this.currentActivityType = runEntity.getActivityType();
                Repository repo2 = this.getRepo();
                trackingService$recoverRecordingIfPossible$1.L$0 = this;
                trackingService$recoverRecordingIfPossible$1.L$1 = this;
                trackingService$recoverRecordingIfPossible$1.label = 2;
                obj = repo2.sumDistanceM(longValue, trackingService$recoverRecordingIfPossible$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                trackingService = this;
                this.totalDistanceM = ((Number) obj).doubleValue();
                trackingService.lastGpsAtMs = System.currentTimeMillis();
                trackingService.lastLocationRequest = trackingService.buildLocationRequest();
                trackingService.promoteToForeground("Recording resumed…");
                trackingService.renewWakeLock();
                trackingService.startLocationUpdates();
                trackingService.startRecordingHealth();
                trackingService.startRecordingClock();
                TrackingState.INSTANCE.patch(new Function1() { // from class: com.example.rungps.tracking.TrackingService$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TrackingUiState recoverRecordingIfPossible$lambda$33;
                        recoverRecordingIfPossible$lambda$33 = TrackingService.recoverRecordingIfPossible$lambda$33(TrackingService.this, (TrackingUiState) obj2);
                        return recoverRecordingIfPossible$lambda$33;
                    }
                });
                return Unit.INSTANCE;
            }
        }
        trackingService$recoverRecordingIfPossible$1 = new TrackingService$recoverRecordingIfPossible$1(this, continuation);
        Object obj2 = trackingService$recoverRecordingIfPossible$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = trackingService$recoverRecordingIfPossible$1.label;
        if (i != 0) {
        }
        runEntity = (RunEntity) obj2;
        if (runEntity != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackingUiState recoverRecordingIfPossible$lambda$33(TrackingService trackingService, TrackingUiState current) {
        TrackingUiState copy;
        Intrinsics.checkNotNullParameter(current, "current");
        copy = current.copy((r50 & 1) != 0 ? current.isRecording : true, (r50 & 2) != 0 ? current.startedAtMs : Long.valueOf(trackingService.startedAtMs), (r50 & 4) != 0 ? current.elapsedMs : activeElapsedMs$default(trackingService, 0L, 1, null), (r50 & 8) != 0 ? current.distanceM : trackingService.totalDistanceM, (r50 & 16) != 0 ? current.steps : trackingService.totalSteps, (r50 & 32) != 0 ? current.lastLat : null, (r50 & 64) != 0 ? current.lastLon : null, (r50 & 128) != 0 ? current.lastFinishedRunId : null, (r50 & 256) != 0 ? current.lastFinishedAtMs : null, (r50 & 512) != 0 ? current.planType : null, (r50 & 1024) != 0 ? current.segmentLabel : null, (r50 & 2048) != 0 ? current.segmentIndex : null, (r50 & 4096) != 0 ? current.segmentCount : null, (r50 & 8192) != 0 ? current.segmentElapsedMs : null, (r50 & 16384) != 0 ? current.segmentRemainingMs : null, (r50 & 32768) != 0 ? current.segmentDistanceM : null, (r50 & 65536) != 0 ? current.segmentRemainingM : null, (r50 & 131072) != 0 ? current.workoutFinished : null, (r50 & 262144) != 0 ? current.isAutoPaused : false, (r50 & 524288) != 0 ? current.isPaused : false, (r50 & 1048576) != 0 ? current.currentSplitElapsedMs : 0L, (r50 & 2097152) != 0 ? current.targetPaceSecPerKm : null, (4194304 & r50) != 0 ? current.goalDistanceM : null, (r50 & 8388608) != 0 ? current.goalTimeMs : null, (r50 & 16777216) != 0 ? current.splitCount : 0, (r50 & 33554432) != 0 ? current.lastSplitMs : null, (r50 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? current.lapCount : 0, (r50 & 134217728) != 0 ? current.lastLapMs : null);
        return copy;
    }

    private final void stop() {
        Unit unit;
        if (!this.isRunning) {
            stopSelf();
            return;
        }
        this.isRunning = false;
        if (this.voiceAlertsEnabled) {
            speak(RunVoiceAnnouncer.INSTANCE.activityStopped(ActivityTypes.INSTANCE.isBike(this.currentActivityType)));
        }
        getClient().removeLocationUpdates(this.callback);
        Job job = this.spotifyJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.spotifyJob = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            BroadcastReceiver broadcastReceiver = this.batteryReceiver;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.batteryReceiver = null;
        long currentTimeMillis = System.currentTimeMillis();
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$stop$2(this.runId, this, RangesKt.coerceAtLeast(currentTimeMillis - this.startedAtMs, 0L), currentTimeMillis, null), 3, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Unit unit;
        if (this.isRunning || TrackingActiveStore.INSTANCE.isActive(this)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                TrackingService trackingService = this;
                ContextCompat.startForegroundService(this, new Intent(this, (Class<?>) TrackingService.class).setAction(ACTION_REASSERT));
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
        stopLocationThread();
        Job job = this.healthJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.healthJob = null;
        Job job2 = this.clockJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.clockJob = null;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            TrackingService trackingService2 = this;
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                wakeLock.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        this.wakeLock = null;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSpotifyTimeline(long runId) {
        Job launch$default;
        Job job = this.spotifyJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.lastSpotifyKey = null;
        this.lastSpotifySavedAtMs = 0L;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$startSpotifyTimeline$1(this, runId, null), 3, null);
        this.spotifyJob = launch$default;
    }

    static /* synthetic */ long activeElapsedMs$default(TrackingService trackingService, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return trackingService.activeElapsedMs(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long activeElapsedMs(long nowMs) {
        long coerceAtLeast = RangesKt.coerceAtLeast(nowMs - this.startedAtMs, 0L);
        Long l = this.pauseStartedAtMs;
        return RangesKt.coerceAtLeast(coerceAtLeast - (this.pausedAccumMs + (l != null ? RangesKt.coerceAtLeast(nowMs - l.longValue(), 0L) : 0L)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutoPaused(boolean paused) {
        if (!this.autoPauseEnabled || this.manualPaused || paused == this.isAutoPaused) {
            return;
        }
        this.isAutoPaused = paused;
        long currentTimeMillis = System.currentTimeMillis();
        if (paused) {
            this.pauseStartedAtMs = Long.valueOf(currentTimeMillis);
            if (this.voiceAlertsEnabled) {
                speak(RunVoiceAnnouncer.INSTANCE.paused());
                return;
            } else {
                if (this.vibrationEnabled) {
                    vibrateShort();
                    return;
                }
                return;
            }
        }
        Long l = this.pauseStartedAtMs;
        if (l != null) {
            this.pausedAccumMs += RangesKt.coerceAtLeast(currentTimeMillis - l.longValue(), 0L);
        }
        this.pauseStartedAtMs = null;
        if (this.voiceAlertsEnabled) {
            speak(RunVoiceAnnouncer.INSTANCE.resumed());
        } else if (this.vibrationEnabled) {
            vibrateShort();
        }
    }

    private final void toggleManualPause() {
        long j;
        boolean z;
        if (this.isRunning) {
            this.manualPaused = !this.manualPaused;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.manualPaused) {
                this.pauseStartedAtMs = Long.valueOf(currentTimeMillis);
                this.isAutoPaused = true;
                if (this.voiceAlertsEnabled) {
                    speak(RunVoiceAnnouncer.INSTANCE.paused());
                } else if (this.vibrationEnabled) {
                    vibrateShort();
                }
            } else {
                Long l = this.pauseStartedAtMs;
                if (l != null) {
                    this.pausedAccumMs += RangesKt.coerceAtLeast(currentTimeMillis - l.longValue(), 0L);
                }
                this.pauseStartedAtMs = null;
                this.isAutoPaused = false;
                this.lastMoveAtMs = currentTimeMillis;
                if (this.voiceAlertsEnabled) {
                    speak(RunVoiceAnnouncer.INSTANCE.resumed());
                } else if (this.vibrationEnabled) {
                    vibrateShort();
                }
            }
            long activeElapsedMs = activeElapsedMs(currentTimeMillis);
            TrackingState trackingState = TrackingState.INSTANCE;
            Long valueOf = Long.valueOf(this.startedAtMs);
            double d = this.totalDistanceM;
            long j2 = this.totalSteps;
            Location location = this.lastLoc;
            Double valueOf2 = location != null ? Double.valueOf(location.getLatitude()) : null;
            Location location2 = this.lastLoc;
            Double valueOf3 = location2 != null ? Double.valueOf(location2.getLongitude()) : null;
            String str = this.currentPlanType;
            boolean z2 = this.isAutoPaused;
            if (this.manualPaused || z2) {
                j = j2;
                z = true;
            } else {
                z = false;
                j = j2;
            }
            trackingState.update(new TrackingUiState(true, valueOf, activeElapsedMs, d, j, valueOf2, valueOf3, null, null, str, null, null, null, null, null, null, null, null, z2, z, RangesKt.coerceAtLeast(activeElapsedMs - this.splitStartElapsedMs, 0L), this.targetPaceSecPerKm, this.goalDistanceM, this.goalTimeMs, this.splitCount, this.lastSplitMs, this.lapCount, this.lastLapMs, 261504, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLocation(Location location) {
        Long l = this.runId;
        if (l != null) {
            long longValue = l.longValue();
            this.lastGpsAtMs = System.currentTimeMillis();
            float accuracy = location.getAccuracy();
            if (Float.isInfinite(accuracy) || Float.isNaN(accuracy) || accuracy > 120.0f) {
                return;
            }
            if (accuracy <= 28.0f) {
                this.lastGoodGpsAtMs = System.currentTimeMillis();
            }
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$handleLocation$1(this, location, accuracy, longValue, null), 3, null);
        }
    }

    private final void speak(String text) {
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech == null) {
            return;
        }
        textToSpeech.speak(text, 1, null, "voice-" + SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void announceKm(int km, long splitDurationMs) {
        if (this.voiceAlertsEnabled) {
            speak(RunVoiceAnnouncer.INSTANCE.kilometerSplit(km, splitDurationMs, ActivityTypes.INSTANCE.isBike(this.currentActivityType)));
        } else if (this.beepEnabled) {
            beepKm();
        } else if (this.vibrationEnabled) {
            vibrateLong();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeAnnounceElapsed(long elapsedMs) {
        if (this.voiceAlertsEnabled) {
            while (elapsedMs >= this.nextTimeAnnounceAtMs) {
                speak(RunVoiceAnnouncer.INSTANCE.elapsedTime(this.nextTimeAnnounceAtMs, ActivityTypes.INSTANCE.isBike(this.currentActivityType)));
                this.nextTimeAnnounceAtMs += 600000;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitCues(List<? extends Cue> cues) {
        if (this.tts == null) {
            return;
        }
        for (Cue cue : cues) {
            if (cue instanceof Cue.Speak) {
                if (this.voiceAlertsEnabled) {
                    speak(((Cue.Speak) cue).getText());
                }
            } else {
                if (!(cue instanceof Cue.Beep)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.beepEnabled || this.vibrationEnabled) {
                    switch (WhenMappings.$EnumSwitchMapping$0[((Cue.Beep) cue).getPattern().ordinal()]) {
                        case 1:
                            beepShort();
                            break;
                        case 2:
                            beepLong();
                            break;
                        case 3:
                            beepBurst(1);
                            break;
                        case 4:
                            beepBurst(2);
                            break;
                        case 5:
                            beepBurst(3);
                            break;
                        case 6:
                            beepBurst(3);
                            break;
                        case 7:
                            beepBurst(2);
                            break;
                        case 8:
                            beepBurst(1);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    private final void beepShort() {
        boolean z = this.beepEnabled;
        if (z || this.vibrationEnabled) {
            if (z) {
                ensureAlarmMaxVolume();
                ToneGenerator toneGenerator = this.tone;
                if (toneGenerator != null) {
                    toneGenerator.startTone(24, 180);
                }
            }
            if (this.vibrationEnabled) {
                vibrateShort();
            }
        }
    }

    private final void beepLong() {
        boolean z = this.beepEnabled;
        if (z || this.vibrationEnabled) {
            if (z) {
                ensureAlarmMaxVolume();
                ToneGenerator toneGenerator = this.tone;
                if (toneGenerator != null) {
                    toneGenerator.startTone(28, 260);
                }
            }
            if (this.vibrationEnabled) {
                vibrateLong();
            }
        }
    }

    private final void beepKm() {
        boolean z = this.beepEnabled;
        if (z || this.vibrationEnabled) {
            if (z) {
                ensureAlarmMaxVolume();
                ToneGenerator toneGenerator = this.tone;
                if (toneGenerator != null) {
                    toneGenerator.startTone(28, 450);
                }
            }
            if (this.vibrationEnabled) {
                vibrateLong();
            }
        }
    }

    private final void beepBurst(int count) {
        if (this.beepEnabled || this.vibrationEnabled) {
            ensureAlarmMaxVolume();
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$beepBurst$1(count, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beepTripleShort() {
        ensureAlarmMaxVolume();
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$beepTripleShort$1(this, null), 3, null);
    }

    private final void ensureAlarmMaxVolume() {
        try {
            Result.Companion companion = Result.INSTANCE;
            TrackingService trackingService = this;
            Object systemService = getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamMaxVolume = audioManager.getStreamMaxVolume(4);
            if (streamMaxVolume > 0) {
                audioManager.setStreamVolume(4, streamMaxVolume, 0);
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vibrateShort() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
        }
    }

    private final void vibrateLong() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(VibrationEffect.createOneShot(90L, -1));
        }
    }

    private final void markLap() {
        if (this.isRunning) {
            long activeElapsedMs = activeElapsedMs(System.currentTimeMillis());
            this.lapCount++;
            long j = activeElapsedMs - this.lapStartElapsedMs;
            this.lapStartElapsedMs = activeElapsedMs;
            this.lastLapMs = Long.valueOf(j);
            Long l = this.runId;
            if (l != null) {
                double coerceAtLeast = RangesKt.coerceAtLeast(this.totalDistanceM - this.lapStartDistanceM, 0.0d);
                this.lapStartDistanceM = this.totalDistanceM;
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$markLap$1(this, l, activeElapsedMs, j, coerceAtLeast, null), 3, null);
            }
            if (this.vibrationEnabled) {
                vibrateShort();
            }
        }
    }

    private final void markHazard() {
        if (this.isRunning) {
            long activeElapsedMs = activeElapsedMs(System.currentTimeMillis());
            this.hazardCount++;
            Long l = this.runId;
            if (l != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TrackingService$markHazard$1(this, l, activeElapsedMs, null), 3, null);
            }
            if (this.vibrationEnabled) {
                vibrateLong();
            }
        }
    }

    private final Notification buildNotification(String text) {
        ensureChannel();
        TrackingService trackingService = this;
        Intent intent = new Intent(trackingService, (Class<?>) MainActivity.class);
        intent.putExtra("open_tab", "run");
        intent.addFlags(805437440);
        PendingIntent activity = PendingIntent.getActivity(trackingService, 0, intent, 67108864 | 134217728);
        Intent intent2 = new Intent(trackingService, (Class<?>) TrackingService.class);
        intent2.setAction(ACTION_STOP);
        PendingIntent service = PendingIntent.getService(trackingService, 1, intent2, 67108864 | 134217728);
        Intent intent3 = new Intent(trackingService, (Class<?>) TrackingService.class);
        intent3.setAction(ACTION_LAP);
        PendingIntent service2 = PendingIntent.getService(trackingService, 2, intent3, 67108864 | 134217728);
        Intent intent4 = new Intent(trackingService, (Class<?>) TrackingService.class);
        intent4.setAction(ACTION_TOGGLE_PAUSE);
        PendingIntent service3 = PendingIntent.getService(trackingService, 3, intent4, 67108864 | 134217728);
        Intent intent5 = new Intent(trackingService, (Class<?>) TrackingService.class);
        intent5.setAction(ACTION_MARK_HAZARD);
        String str = text;
        Notification build = new NotificationCompat.Builder(trackingService, CHANNEL_ID).setContentTitle("Run recording").setContentText(str).setSmallIcon(R.drawable.ic_media_play).setOngoing(true).setContentIntent(activity).setFullScreenIntent(activity, true).addAction(0, "Lap", service2).addAction(0, "Pause", service3).addAction(0, "Hazard", PendingIntent.getService(trackingService, 4, intent5, 67108864 | 134217728)).addAction(0, "Stop", service).setOnlyAlertOnce(true).setCategory(NotificationCompat.CATEGORY_WORKOUT).setVisibility(1).setStyle(new NotificationCompat.BigTextStyle().bigText(str)).setSubText("Tap to open live stats on lock screen").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r10 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateNotification(long elapsedMs, double distanceM, String segLabel) {
        String formatPaceLocal;
        String str;
        double d = distanceM / 1000.0d;
        Double valueOf = d >= 0.01d ? Double.valueOf((elapsedMs / 1000.0d) / d) : null;
        boolean z = true;
        String str2 = "—";
        if (ActivityTypes.INSTANCE.isBike(this.currentActivityType)) {
            if (valueOf != null) {
                double doubleValue = valueOf.doubleValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                formatPaceLocal = String.format(Locale.US, "%.1f km/h", Arrays.copyOf(new Object[]{Double.valueOf(3600.0d / RangesKt.coerceAtLeast(doubleValue, 1.0d))}, 1));
                Intrinsics.checkNotNullExpressionValue(formatPaceLocal, "format(...)");
            }
        } else if (valueOf != null) {
            formatPaceLocal = formatPaceLocal(valueOf.doubleValue());
        }
        if (segLabel == null || (str = " • " + segLabel) == null) {
            str = "";
        }
        String str3 = this.isAutoPaused ? " • AUTO-PAUSED" : "";
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f km • %s • %s%s%s", Arrays.copyOf(new Object[]{Double.valueOf(d), formatElapsedLocal(elapsedMs), str2, str, str3}, 5));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        TrackingActiveStore trackingActiveStore = TrackingActiveStore.INSTANCE;
        TrackingService trackingService = this;
        String str4 = this.currentActivityType;
        if (!this.isAutoPaused && !this.manualPaused) {
            z = false;
        }
        trackingActiveStore.updateLiveStats(trackingService, distanceM, str4, z);
        getNm().notify(1001, buildNotification(format));
        RideRunWidgetUpdater.INSTANCE.refreshAsync(trackingService);
    }

    private final String formatElapsedLocal(long ms) {
        long coerceAtLeast = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 3600;
        long j2 = 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(coerceAtLeast / j), Long.valueOf((coerceAtLeast % j) / j2), Long.valueOf(coerceAtLeast % j2)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final String formatPaceLocal(double secondsPerKm) {
        double coerceAtLeast = RangesKt.coerceAtLeast(secondsPerKm, 0.0d);
        int i = (int) (coerceAtLeast / 60.0d);
        int abs = Math.abs((int) (coerceAtLeast - (i * 60.0d)));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(abs)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final void ensureChannel() {
        if (getNm().getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        NotificationManager nm = getNm();
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Run recording", 3);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setDescription("Live distance and pace while recording");
        nm.createNotificationChannel(notificationChannel);
    }
}
