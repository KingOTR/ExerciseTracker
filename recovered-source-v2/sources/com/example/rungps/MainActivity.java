package com.example.rungps;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.ContextCompat;
import androidx.health.connect.client.PermissionController;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.internal.AssetHelper;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.example.rungps.CrashLog;
import com.example.rungps.gym.GymRestTimerStore;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.intervals.CustomPlan;
import com.example.rungps.intervals.CustomSegment;
import com.example.rungps.intervals.CustomTarget;
import com.example.rungps.nfc.GymNfcController;
import com.example.rungps.nfc.GymNfcHandler;
import com.example.rungps.sleep.BatteryOptimizationNudge;
import com.example.rungps.sleep.SleepAlarmActivity;
import com.example.rungps.sleep.SleepAlarmDismiss;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepSpotifyPicker;
import com.example.rungps.spotify.SpotifyAuthIntent;
import com.example.rungps.spotify.SpotifyPkce;
import com.example.rungps.strava.StravaAuthIntent;
import com.example.rungps.sync.CloudSyncWorker;
import com.example.rungps.sync.HealthSyncWorker;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.RecordingHrBridge;
import com.example.rungps.tracking.TrackingService;
import com.example.rungps.tracking.TrackingState;
import com.example.rungps.ui.onboarding.FriendInstallSanitizer;
import com.example.rungps.ui.onboarding.OnboardingPermissions;
import com.example.rungps.ui.onboarding.OnboardingPrefs;
import com.example.rungps.ui.shell.AppScreenHost;
import com.example.rungps.util.HapticFeedback;
import com.example.rungps.widget.GymWidgetProvider;
import com.example.rungps.widget.RideRunWidgetProvider;
import com.example.rungps.widget.WidgetRefreshWorker;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.osmdroid.config.Configuration;
import org.osmdroid.config.IConfigurationProvider;
import org.osmdroid.mapsforge.MapsForgeTileSource;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\\\u001a\u00020]H\u0002J\b\u0010^\u001a\u00020]H\u0016J\b\u0010_\u001a\u00020]H\u0016J\r\u0010e\u001a\u00020]H\u0000¢\u0006\u0002\bfJ\u0010\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u0006H\u0002J\u0012\u0010i\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010kH\u0002J\u0012\u0010l\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010kH\u0002J\u0012\u0010m\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010kH\u0002J\u0012\u0010n\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010kH\u0002J\b\u0010o\u001a\u00020]H\u0014J\b\u0010p\u001a\u00020]H\u0014J\b\u0010q\u001a\u00020]H\u0014J\u0012\u0010r\u001a\u00020]2\b\u0010s\u001a\u0004\u0018\u00010tH\u0014J\u0010\u0010u\u001a\u00020]2\u0006\u0010j\u001a\u00020kH\u0014J\u0012\u0010v\u001a\u00020]2\b\u0010j\u001a\u0004\u0018\u00010kH\u0002J\b\u0010w\u001a\u00020]H\u0002J\b\u0010x\u001a\u00020]H\u0002J\b\u0010y\u001a\u00020]H\u0002R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R+\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R+\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR+\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR+\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR+\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\r\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR+\u00101\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R+\u00105\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\r\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R+\u00109\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u0010\u0013R+\u0010=\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R+\u0010A\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\r\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R7\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020F0E8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\r\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0O0NX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0O0NX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0S0NX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010T\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\r\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013R+\u0010X\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\r\u001a\u0004\bY\u0010\u0011\"\u0004\bZ\u0010\u0013R\u0014\u0010`\u001a\u00020aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u000e\u0010d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006z²\u0006\f\u0010{\u001a\u0004\u0018\u00010|X\u008a\u008e\u0002"}, d2 = {"Lcom/example/rungps/MainActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/example/rungps/ui/shell/AppScreenHost;", "<init>", "()V", "<set-?>", "", "started", "getStarted", "()Z", "setStarted", "(Z)V", "started$delegate", "Landroidx/compose/runtime/MutableState;", "", "gpsActivityType", "getGpsActivityType", "()Ljava/lang/String;", "setGpsActivityType", "(Ljava/lang/String;)V", "gpsActivityType$delegate", TrackingService.EXTRA_PLAN_TYPE, "getPlanType", "setPlanType", "planType$delegate", TrackingService.EXTRA_TIME_SESSION, "getTimeSession$app_sideload", "setTimeSession$app_sideload", "timeSession$delegate", "customName", "getCustomName$app_sideload", "setCustomName$app_sideload", "customName$delegate", "autoPauseEnabled", "getAutoPauseEnabled$app_sideload", "setAutoPauseEnabled$app_sideload", "autoPauseEnabled$delegate", "vibrationCuesEnabled", "getVibrationCuesEnabled$app_sideload", "setVibrationCuesEnabled$app_sideload", "vibrationCuesEnabled$delegate", "beepCuesEnabled", "getBeepCuesEnabled$app_sideload", "setBeepCuesEnabled$app_sideload", "beepCuesEnabled$delegate", "voiceCuesEnabled", "getVoiceCuesEnabled$app_sideload", "setVoiceCuesEnabled$app_sideload", "voiceCuesEnabled$delegate", "runPreset", "getRunPreset", "setRunPreset", "runPreset$delegate", "racePaceText", "getRacePaceText$app_sideload", "setRacePaceText$app_sideload", "racePaceText$delegate", "goalDistKmText", "getGoalDistKmText$app_sideload", "setGoalDistKmText$app_sideload", "goalDistKmText$delegate", "goalTimeMinText", "getGoalTimeMinText$app_sideload", "setGoalTimeMinText$app_sideload", "goalTimeMinText$delegate", "themeMode", "getThemeMode", "setThemeMode", "themeMode$delegate", "", "Lcom/example/rungps/intervals/CustomSegment;", "customSegments", "getCustomSegments$app_sideload", "()Ljava/util/List;", "setCustomSegments$app_sideload", "(Ljava/util/List;)V", "customSegments$delegate", "requestPerms", "Landroidx/activity/result/ActivityResultLauncher;", "", "pendingStartAfterPerms", "onboardingRuntimeLauncher", "onboardingHealthConnectLauncher", "", "onboardingRuntimeStatusLine", "getOnboardingRuntimeStatusLine", "setOnboardingRuntimeStatusLine", "onboardingRuntimeStatusLine$delegate", "onboardingHealthStatusLine", "getOnboardingHealthStatusLine", "setOnboardingHealthStatusLine", "onboardingHealthStatusLine$delegate", "refreshOnboardingPermissionLines", "", "requestOnboardingRuntimePermissions", "requestOnboardingHealthConnect", "gymNfc", "Lcom/example/rungps/nfc/GymNfcController;", "getGymNfc", "()Lcom/example/rungps/nfc/GymNfcController;", "recordingLockScreenActive", "syncRecordingLockScreen", "syncRecordingLockScreen$app_sideload", "updateRecordingLockScreen", "enabled", "handleSpotifyShareIntent", "intent", "Landroid/content/Intent;", "handleSpotifyOAuthIntent", "handleWidgetAction", "handleWidgetNavigationIntent", "onResume", "onPause", "onDestroy", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "handleStravaOAuthIntent", "ensurePermsAndStart", "startTracking", "stopTracking", "app_sideload", "crashDialog", "Lcom/example/rungps/CrashLog$CrashEntry;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity extends ComponentActivity implements AppScreenHost {
    public static final int $stable = 8;
    private boolean pendingStartAfterPerms;
    private boolean recordingLockScreenActive;

    /* renamed from: started$delegate, reason: from kotlin metadata */
    private final MutableState started = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: gpsActivityType$delegate, reason: from kotlin metadata */
    private final MutableState gpsActivityType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("RUN", null, 2, null);

    /* renamed from: planType$delegate, reason: from kotlin metadata */
    private final MutableState planType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TrackingService.PLAN_TIME_INTERVALS, null, 2, null);

    /* renamed from: timeSession$delegate, reason: from kotlin metadata */
    private final MutableState timeSession = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TrackingService.TIME_SESSION_1, null, 2, null);

    /* renamed from: customName$delegate, reason: from kotlin metadata */
    private final MutableState customName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Custom workout", null, 2, null);

    /* renamed from: autoPauseEnabled$delegate, reason: from kotlin metadata */
    private final MutableState autoPauseEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: vibrationCuesEnabled$delegate, reason: from kotlin metadata */
    private final MutableState vibrationCuesEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: beepCuesEnabled$delegate, reason: from kotlin metadata */
    private final MutableState beepCuesEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: voiceCuesEnabled$delegate, reason: from kotlin metadata */
    private final MutableState voiceCuesEnabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);

    /* renamed from: runPreset$delegate, reason: from kotlin metadata */
    private final MutableState runPreset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TrackingService.BATTERY_NORMAL, null, 2, null);

    /* renamed from: racePaceText$delegate, reason: from kotlin metadata */
    private final MutableState racePaceText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: goalDistKmText$delegate, reason: from kotlin metadata */
    private final MutableState goalDistKmText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: goalTimeMinText$delegate, reason: from kotlin metadata */
    private final MutableState goalTimeMinText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: themeMode$delegate, reason: from kotlin metadata */
    private final MutableState themeMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SleepAlarmPreferences.SOUND_SYSTEM, null, 2, null);

    /* renamed from: customSegments$delegate, reason: from kotlin metadata */
    private final MutableState customSegments = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.listOf((Object[]) new CustomSegment[]{new CustomSegment("Warm up", new CustomTarget.TimeMs(300000)), new CustomSegment("Hard", new CustomTarget.DistanceM(400.0d)), new CustomSegment("Easy", new CustomTarget.DistanceM(200.0d)), new CustomSegment("Cool down", new CustomTarget.TimeMs(300000))}), null, 2, null);
    private final ActivityResultLauncher<String[]> requestPerms = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.example.rungps.MainActivity$$ExternalSyntheticLambda2
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MainActivity.requestPerms$lambda$0(MainActivity.this, (Map) obj);
        }
    });
    private final ActivityResultLauncher<String[]> onboardingRuntimeLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.example.rungps.MainActivity$$ExternalSyntheticLambda3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MainActivity.onboardingRuntimeLauncher$lambda$1(MainActivity.this, (Map) obj);
        }
    });
    private final ActivityResultLauncher<Set<String>> onboardingHealthConnectLauncher = registerForActivityResult(PermissionController.Companion.createRequestPermissionResultContract$default(PermissionController.INSTANCE, null, 1, null), new ActivityResultCallback() { // from class: com.example.rungps.MainActivity$$ExternalSyntheticLambda4
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            MainActivity.onboardingHealthConnectLauncher$lambda$2(MainActivity.this, (Set) obj);
        }
    });

    /* renamed from: onboardingRuntimeStatusLine$delegate, reason: from kotlin metadata */
    private final MutableState onboardingRuntimeStatusLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* renamed from: onboardingHealthStatusLine$delegate, reason: from kotlin metadata */
    private final MutableState onboardingHealthStatusLine = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    private final GymNfcController gymNfc = new GymNfcController(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getStarted() {
        return ((Boolean) this.started.getValue()).booleanValue();
    }

    private final void setStarted(boolean z) {
        this.started.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getGpsActivityType() {
        return (String) this.gpsActivityType.getValue();
    }

    public void setGpsActivityType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gpsActivityType.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getPlanType() {
        return (String) this.planType.getValue();
    }

    public void setPlanType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.planType.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTimeSession$app_sideload() {
        return (String) this.timeSession.getValue();
    }

    public final void setTimeSession$app_sideload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeSession.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCustomName$app_sideload() {
        return (String) this.customName.getValue();
    }

    public final void setCustomName$app_sideload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customName.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoPauseEnabled$app_sideload() {
        return ((Boolean) this.autoPauseEnabled.getValue()).booleanValue();
    }

    public final void setAutoPauseEnabled$app_sideload(boolean z) {
        this.autoPauseEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVibrationCuesEnabled$app_sideload() {
        return ((Boolean) this.vibrationCuesEnabled.getValue()).booleanValue();
    }

    public final void setVibrationCuesEnabled$app_sideload(boolean z) {
        this.vibrationCuesEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getBeepCuesEnabled$app_sideload() {
        return ((Boolean) this.beepCuesEnabled.getValue()).booleanValue();
    }

    public final void setBeepCuesEnabled$app_sideload(boolean z) {
        this.beepCuesEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVoiceCuesEnabled$app_sideload() {
        return ((Boolean) this.voiceCuesEnabled.getValue()).booleanValue();
    }

    public final void setVoiceCuesEnabled$app_sideload(boolean z) {
        this.voiceCuesEnabled.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getRunPreset() {
        return (String) this.runPreset.getValue();
    }

    public void setRunPreset(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.runPreset.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getRacePaceText$app_sideload() {
        return (String) this.racePaceText.getValue();
    }

    public final void setRacePaceText$app_sideload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.racePaceText.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getGoalDistKmText$app_sideload() {
        return (String) this.goalDistKmText.getValue();
    }

    public final void setGoalDistKmText$app_sideload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goalDistKmText.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getGoalTimeMinText$app_sideload() {
        return (String) this.goalTimeMinText.getValue();
    }

    public final void setGoalTimeMinText$app_sideload(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goalTimeMinText.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getThemeMode() {
        return (String) this.themeMode.getValue();
    }

    @Override // com.example.rungps.ui.shell.AppScreenHost
    public void setThemeMode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.themeMode.setValue(str);
    }

    public final List<CustomSegment> getCustomSegments$app_sideload() {
        return (List) this.customSegments.getValue();
    }

    public final void setCustomSegments$app_sideload(List<CustomSegment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.customSegments.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPerms$lambda$0(MainActivity mainActivity, Map granted) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        boolean z = true;
        boolean areEqual = Intrinsics.areEqual(granted.get("android.permission.ACCESS_FINE_LOCATION"), (Object) true);
        if (Build.VERSION.SDK_INT >= 33 && !Intrinsics.areEqual(granted.get("android.permission.POST_NOTIFICATIONS"), (Object) true)) {
            z = false;
        }
        boolean areEqual2 = Intrinsics.areEqual(granted.get("android.permission.ACTIVITY_RECOGNITION"), (Object) true);
        mainActivity.refreshOnboardingPermissionLines();
        if (areEqual && z && areEqual2 && mainActivity.pendingStartAfterPerms) {
            mainActivity.pendingStartAfterPerms = false;
            mainActivity.startTracking();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onboardingRuntimeLauncher$lambda$1(MainActivity mainActivity, Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.refreshOnboardingPermissionLines();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onboardingHealthConnectLauncher$lambda$2(MainActivity mainActivity, Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.refreshOnboardingPermissionLines();
    }

    private void setOnboardingRuntimeStatusLine(String str) {
        this.onboardingRuntimeStatusLine.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getOnboardingRuntimeStatusLine() {
        return (String) this.onboardingRuntimeStatusLine.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingHealthStatusLine(String str) {
        this.onboardingHealthStatusLine.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.example.rungps.ui.shell.AppScreenHost
    public String getOnboardingHealthStatusLine() {
        return (String) this.onboardingHealthStatusLine.getValue();
    }

    private final void refreshOnboardingPermissionLines() {
        setOnboardingRuntimeStatusLine(OnboardingPermissions.INSTANCE.runtimeStatusLine(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$refreshOnboardingPermissionLines$1(this, null), 2, null);
    }

    @Override // com.example.rungps.ui.shell.AppScreenHost
    public void requestOnboardingRuntimePermissions() {
        this.onboardingRuntimeLauncher.launch(OnboardingPermissions.INSTANCE.runtimePermissions());
    }

    @Override // com.example.rungps.ui.shell.AppScreenHost
    public void requestOnboardingHealthConnect() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        HealthConnectManager healthConnectManager = new HealthConnectManager(applicationContext);
        if (!healthConnectManager.isReady()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                MainActivity mainActivity = this;
                startActivity(healthConnectManager.openHealthConnectPlayStore());
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            refreshOnboardingPermissionLines();
            return;
        }
        this.onboardingHealthConnectLauncher.launch(healthConnectManager.getAllRequestedPermissions());
    }

    @Override // com.example.rungps.ui.shell.AppScreenHost
    public GymNfcController getGymNfc() {
        return this.gymNfc;
    }

    public final void syncRecordingLockScreen$app_sideload() {
        updateRecordingLockScreen(TrackingState.INSTANCE.getState().getValue().isRecording());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecordingLockScreen(boolean enabled) {
        if (enabled == this.recordingLockScreenActive) {
            return;
        }
        this.recordingLockScreenActive = enabled;
        if (enabled) {
            setInheritShowWhenLocked(false);
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            getWindow().addFlags(2621569);
            return;
        }
        getWindow().clearFlags(6815873);
        setShowWhenLocked(false);
        setTurnScreenOn(false);
        setInheritShowWhenLocked(false);
    }

    private final void handleSpotifyShareIntent(Intent intent) {
        String stringExtra;
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.SEND") && Intrinsics.areEqual(intent.getType(), AssetHelper.DEFAULT_MIME_TYPE) && (stringExtra = intent.getStringExtra("android.intent.extra.TEXT")) != null) {
            MainActivity mainActivity = this;
            if (SleepSpotifyPicker.INSTANCE.handleShareText(mainActivity, stringExtra)) {
                Toast.makeText(mainActivity, "Sleep alarm sound set from Spotify", 1).show();
                GymNfcHandler.INSTANCE.requestOpenTab(mainActivity, "sleep");
                getGymNfc().bumpPulse();
            }
        }
    }

    private final void handleSpotifyOAuthIntent(Intent intent) {
        Uri data;
        String authCodeFromUri;
        if (intent == null || (data = intent.getData()) == null || (authCodeFromUri = SpotifyAuthIntent.INSTANCE.authCodeFromUri(data)) == null) {
            return;
        }
        String string = getSharedPreferences("settings", 0).getString("spotifyClientId", null);
        String obj = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        String str = obj == null ? "" : obj;
        if (str.length() == 0) {
            Toast.makeText(this, "Save Spotify Client ID first", 1).show();
            return;
        }
        String consumeVerifier = SpotifyPkce.INSTANCE.consumeVerifier(this);
        if (consumeVerifier != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$handleSpotifyOAuthIntent$1(str, authCodeFromUri, consumeVerifier, this, null), 2, null);
        } else {
            Toast.makeText(this, "Spotify login expired — try Connect again", 1).show();
        }
    }

    private final void handleWidgetAction(Intent intent) {
        int i;
        String stringExtra = intent != null ? intent.getStringExtra("widget_action") : null;
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case 486422593:
                    if (!stringExtra.equals(GymWidgetProvider.ACTION_REST_120)) {
                        return;
                    }
                    break;
                case 1262617192:
                    if (!stringExtra.equals(GymWidgetProvider.ACTION_REST_60)) {
                        return;
                    }
                    break;
                case 1262617285:
                    if (!stringExtra.equals(GymWidgetProvider.ACTION_REST_90)) {
                        return;
                    }
                    break;
                case 1897883537:
                    if (stringExtra.equals(RideRunWidgetProvider.ACTION_START_RUN)) {
                        GymNfcHandler.INSTANCE.requestOpenTab(this, "run");
                        ensurePermsAndStart();
                        return;
                    }
                    return;
                default:
                    return;
            }
            String stringExtra2 = intent.getStringExtra("widget_action");
            if (stringExtra2 != null) {
                int hashCode = stringExtra2.hashCode();
                if (hashCode != 486422593) {
                    if (hashCode == 1262617192 && stringExtra2.equals(GymWidgetProvider.ACTION_REST_60)) {
                        i = 60;
                    }
                } else if (stringExtra2.equals(GymWidgetProvider.ACTION_REST_120)) {
                    i = MenuKt.InTransitionDuration;
                }
                MainActivity mainActivity = this;
                GymRestTimerStore.INSTANCE.startRest(mainActivity, i);
                HapticFeedback.INSTANCE.pulse(mainActivity, HapticFeedback.Pattern.RestDone);
                Toast.makeText(mainActivity, "Rest " + i + "s started from widget", 0).show();
                getGymNfc().bumpPulse();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$handleWidgetAction$1(this, null), 2, null);
            }
            i = 90;
            MainActivity mainActivity2 = this;
            GymRestTimerStore.INSTANCE.startRest(mainActivity2, i);
            HapticFeedback.INSTANCE.pulse(mainActivity2, HapticFeedback.Pattern.RestDone);
            Toast.makeText(mainActivity2, "Rest " + i + "s started from widget", 0).show();
            getGymNfc().bumpPulse();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$handleWidgetAction$1(this, null), 2, null);
        }
    }

    private final void handleWidgetNavigationIntent(Intent intent) {
        String stringExtra;
        String stringExtra2;
        if (intent == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("open_tab");
        if ((stringExtra3 == null || StringsKt.isBlank(stringExtra3)) && (((stringExtra = intent.getStringExtra("open_gym_session_id")) == null || StringsKt.isBlank(stringExtra)) && ((stringExtra2 = intent.getStringExtra("widget_action")) == null || StringsKt.isBlank(stringExtra2)))) {
            return;
        }
        getGymNfc().bumpPulse();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        getGymNfc().onResume();
        if (SleepAlarmDismiss.INSTANCE.isRinging() && !SleepAlarmActivity.INSTANCE.isShowing()) {
            SleepAlarmActivity.INSTANCE.launch(this);
        }
        MainActivity mainActivity = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), null, new MainActivity$onResume$1(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), null, new MainActivity$onResume$2(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), null, new MainActivity$onResume$3(this, null), 2, null);
        updateRecordingLockScreen(TrackingState.INSTANCE.getState().getValue().isRecording());
        getGymNfc().updateReaderMode();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, null, new MainActivity$onResume$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), null, new MainActivity$onResume$5(this, null), 2, null);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        getGymNfc().onPause();
        if (TrackingState.INSTANCE.getState().getValue().isRecording()) {
            return;
        }
        updateRecordingLockScreen(false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        updateRecordingLockScreen(false);
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        Job launch$default;
        super.onCreate(savedInstanceState);
        MainActivity mainActivity = this;
        final CrashLog.CrashEntry read = CrashLog.INSTANCE.read(mainActivity);
        if (read != null) {
            TextView textView = new TextView(mainActivity);
            textView.setTextIsSelectable(true);
            textView.setText(StringsKt.trim((CharSequence) read.getStacktrace()).toString());
            textView.setPadding(20, 20, 20, 20);
            Object systemService = getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            final ClipboardManager clipboardManager = (ClipboardManager) systemService;
            new AlertDialog.Builder(mainActivity).setTitle("App crashed last time").setView(textView).setPositiveButton("Copy", new DialogInterface.OnClickListener() { // from class: com.example.rungps.MainActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.onCreate$lambda$8$lambda$6(clipboardManager, read, this, dialogInterface, i);
                }
            }).setNegativeButton("Clear", new DialogInterface.OnClickListener() { // from class: com.example.rungps.MainActivity$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.onCreate$lambda$8$lambda$7(MainActivity.this, this, dialogInterface, i);
                }
            }).setCancelable(false).show();
            return;
        }
        RecordingHrBridge.INSTANCE.init(mainActivity);
        getGymNfc().onCreateHandleIntent(getIntent());
        if (!OnboardingPrefs.INSTANCE.isDone(mainActivity)) {
            FriendInstallSanitizer.INSTANCE.prepareFreshInstall(mainActivity);
        }
        refreshOnboardingPermissionLines();
        SharedPreferences sharedPreferences = getSharedPreferences("settings", 0);
        String str = SleepAlarmPreferences.SOUND_SYSTEM;
        String string = sharedPreferences.getString("themeMode", SleepAlarmPreferences.SOUND_SYSTEM);
        if (string != null) {
            str = string;
        }
        setThemeMode(str);
        String str2 = TrackingService.BATTERY_NORMAL;
        String string2 = sharedPreferences.getString("runPreset", TrackingService.BATTERY_NORMAL);
        if (string2 != null) {
            str2 = string2;
        }
        setRunPreset(str2);
        setVoiceCuesEnabled$app_sideload(sharedPreferences.getBoolean(TrackingService.EXTRA_VOICE_ALERTS, true));
        setBeepCuesEnabled$app_sideload(sharedPreferences.getBoolean(TrackingService.EXTRA_BEEP_CUES, true));
        try {
            Result.Companion companion = Result.INSTANCE;
            MainActivity mainActivity2 = this;
            Duration ofHours = Duration.ofHours(12L);
            Intrinsics.checkNotNullExpressionValue(ofHours, "ofHours(...)");
            WorkManager.INSTANCE.getInstance(this).enqueueUniquePeriodicWork("health-sync", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) HealthSyncWorker.class, ofHours).build());
            WorkManager.INSTANCE.getInstance(this).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) HealthSyncWorker.class).build());
            Duration ofHours2 = Duration.ofHours(6L);
            Intrinsics.checkNotNullExpressionValue(ofHours2, "ofHours(...)");
            WorkManager.INSTANCE.getInstance(this).enqueueUniquePeriodicWork("cloud-sync", ExistingPeriodicWorkPolicy.KEEP, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) CloudSyncWorker.class, ofHours2).build());
            WorkManager.INSTANCE.getInstance(this).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CloudSyncWorker.class).build());
            WidgetRefreshWorker.INSTANCE.enqueuePeriodic(this);
            Result.m7905constructorimpl(WorkManager.INSTANCE.getInstance(this).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) WidgetRefreshWorker.class).build()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            MainActivity mainActivity3 = this;
            IConfigurationProvider configuration = Configuration.getInstance();
            configuration.setUserAgentValue(getPackageName());
            configuration.setOsmdroidBasePath(getCacheDir());
            File file = new File(getCacheDir(), "osmdroid");
            file.mkdirs();
            configuration.setOsmdroidTileCache(file);
            configuration.load(this, PreferenceManager.getDefaultSharedPreferences(this));
            m7905constructorimpl = Result.m7905constructorimpl(configuration);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.w("MainActivity", "osmdroid init skipped: " + m7908exceptionOrNullimpl.getMessage());
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            MainActivity mainActivity4 = this;
            MapsForgeTileSource.createInstance(getApplication());
            m7905constructorimpl2 = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m7908exceptionOrNullimpl2 = Result.m7908exceptionOrNullimpl(m7905constructorimpl2);
        if (m7908exceptionOrNullimpl2 != null) {
            Log.w("MainActivity", "MapsForge init skipped: " + m7908exceptionOrNullimpl2.getMessage());
        }
        try {
            Result.Companion companion7 = Result.INSTANCE;
            MainActivity mainActivity5 = this;
            updateRecordingLockScreen(TrackingState.INSTANCE.getState().getValue().isRecording());
            launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$onCreate$8$1(this, null), 3, null);
            Result.m7905constructorimpl(launch$default);
        } catch (Throwable th4) {
            Result.Companion companion8 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th4));
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1212548178, true, new MainActivity$onCreate$9(this)), 1, null);
        handleSpotifyShareIntent(getIntent());
        handleSpotifyOAuthIntent(getIntent());
        handleStravaOAuthIntent(getIntent());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$onCreate$10(this, null), 2, null);
        handleWidgetAction(getIntent());
        if (GymNfcHandler.INSTANCE.isLauncherMainIntent(getIntent())) {
            GymNfcHandler.INSTANCE.clearStaleDeepLinks(mainActivity);
        }
        GymNfcHandler.INSTANCE.stashOpenTabFromIntent(mainActivity, getIntent());
        handleWidgetNavigationIntent(getIntent());
        getGymNfc().deliverPendingTagResult();
        getGymNfc().afterCreateIntents(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8$lambda$6(ClipboardManager clipboardManager, CrashLog.CrashEntry crashEntry, MainActivity mainActivity, DialogInterface dialogInterface, int i) {
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Crash stacktrace", crashEntry.getStacktrace()));
        Toast.makeText(mainActivity, "Copied crash details", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8$lambda$7(MainActivity mainActivity, MainActivity mainActivity2, DialogInterface dialogInterface, int i) {
        CrashLog.INSTANCE.clear(mainActivity);
        mainActivity2.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleSpotifyShareIntent(intent);
        handleSpotifyOAuthIntent(intent);
        handleStravaOAuthIntent(intent);
        handleWidgetAction(intent);
        GymNfcHandler.INSTANCE.stashOpenTabFromIntent(this, intent);
        handleWidgetNavigationIntent(intent);
        getGymNfc().onNewIntent(intent);
    }

    private final void handleStravaOAuthIntent(Intent intent) {
        Uri data;
        String authCodeFromUri;
        if (intent == null || (data = intent.getData()) == null || (authCodeFromUri = StravaAuthIntent.INSTANCE.authCodeFromUri(data)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new MainActivity$handleStravaOAuthIntent$1(this, authCodeFromUri, StravaAuthIntent.INSTANCE.redirectUriFor(data), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensurePermsAndStart() {
        MainActivity mainActivity = this;
        boolean z = ContextCompat.checkSelfPermission(mainActivity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(mainActivity, "android.permission.POST_NOTIFICATIONS") == 0;
        boolean z3 = ContextCompat.checkSelfPermission(mainActivity, "android.permission.ACTIVITY_RECOGNITION") == 0;
        if (z && z2 && z3) {
            startTracking();
            return;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!z) {
            createListBuilder.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (Build.VERSION.SDK_INT >= 33 && !z2) {
            createListBuilder.add("android.permission.POST_NOTIFICATIONS");
        }
        if (!z3) {
            createListBuilder.add("android.permission.ACTIVITY_RECOGNITION");
        }
        String[] strArr = (String[]) CollectionsKt.build(createListBuilder).toArray(new String[0]);
        if (strArr.length == 0) {
            startTracking();
            return;
        }
        this.pendingStartAfterPerms = true;
        Toast.makeText(mainActivity, "Grant permissions to start tracking.", 0).show();
        this.requestPerms.launch(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void startTracking() {
        Double d;
        Long longOrNull;
        MainActivity mainActivity;
        String runPreset;
        String str;
        setStarted(true);
        Long l = null;
        String encodeToString = Intrinsics.areEqual(getPlanType(), TrackingService.PLAN_CUSTOM) ? Json.INSTANCE.encodeToString(CustomPlan.INSTANCE.serializer(), new CustomPlan(getCustomName$app_sideload(), getCustomSegments$app_sideload())) : null;
        Integer startTracking$parseTargetSecPerKm = startTracking$parseTargetSecPerKm(ActivityTypes.INSTANCE.isBike(getGpsActivityType()), getRacePaceText$app_sideload());
        Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) getGoalDistKmText$app_sideload()).toString());
        try {
            if (doubleOrNull != null) {
                if (doubleOrNull.doubleValue() <= 0.0d) {
                    doubleOrNull = null;
                }
                if (doubleOrNull != null) {
                    d = Double.valueOf(doubleOrNull.doubleValue() * 1000.0d);
                    longOrNull = StringsKt.toLongOrNull(StringsKt.trim((CharSequence) getGoalTimeMinText$app_sideload()).toString());
                    if (longOrNull != null) {
                        if (longOrNull.longValue() <= 0) {
                            longOrNull = null;
                        }
                        if (longOrNull != null) {
                            l = Long.valueOf(longOrNull.longValue() * 60000);
                        }
                    }
                    mainActivity = this;
                    Intent intent = new Intent(mainActivity, (Class<?>) TrackingService.class);
                    intent.setAction(TrackingService.ACTION_START);
                    intent.putExtra(TrackingService.EXTRA_ACTIVITY_TYPE, getGpsActivityType());
                    intent.putExtra(TrackingService.EXTRA_PLAN_TYPE, getPlanType());
                    if (encodeToString != null) {
                        intent.putExtra(TrackingService.EXTRA_PLAN_JSON, encodeToString);
                    }
                    if (Intrinsics.areEqual(getPlanType(), TrackingService.PLAN_TIME_INTERVALS)) {
                        intent.putExtra(TrackingService.EXTRA_TIME_SESSION, getTimeSession$app_sideload());
                    }
                    intent.putExtra(TrackingService.EXTRA_AUTO_PAUSE, getAutoPauseEnabled$app_sideload());
                    intent.putExtra(TrackingService.EXTRA_VIBRATION, getVibrationCuesEnabled$app_sideload());
                    intent.putExtra(TrackingService.EXTRA_VOICE_ALERTS, getVoiceCuesEnabled$app_sideload());
                    intent.putExtra(TrackingService.EXTRA_BEEP_CUES, getBeepCuesEnabled$app_sideload());
                    runPreset = getRunPreset();
                    if (!Intrinsics.areEqual(runPreset, TrackingService.BATTERY_RACE)) {
                        str = TrackingService.BATTERY_RACE;
                    } else {
                        str = Intrinsics.areEqual(runPreset, "saver") ? TrackingService.BATTERY_SAVE : TrackingService.BATTERY_NORMAL;
                    }
                    intent.putExtra(TrackingService.EXTRA_BATTERY_MODE, str);
                    intent.putExtra(TrackingService.EXTRA_SMOOTH_GPS, !Intrinsics.areEqual(getRunPreset(), TrackingService.BATTERY_RACE));
                    if (startTracking$parseTargetSecPerKm != null) {
                        intent.putExtra(TrackingService.EXTRA_TARGET_PACE_SEC_PER_KM, startTracking$parseTargetSecPerKm.intValue());
                    }
                    if (d != null) {
                        intent.putExtra(TrackingService.EXTRA_GOAL_DISTANCE_M, d.doubleValue());
                    }
                    if (l != null) {
                        intent.putExtra(TrackingService.EXTRA_GOAL_TIME_MS, l.longValue());
                    }
                    BatteryOptimizationNudge.INSTANCE.requestExemptionIfNeeded(this);
                    startForegroundService(intent);
                    updateRecordingLockScreen(true);
                    Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
                    intent2.putExtra("open_tab", "run");
                    intent2.addFlags(537001984);
                    startActivity(intent2);
                    return;
                }
            }
            BatteryOptimizationNudge.INSTANCE.requestExemptionIfNeeded(this);
            startForegroundService(intent);
            updateRecordingLockScreen(true);
            Intent intent22 = new Intent(this, (Class<?>) MainActivity.class);
            intent22.putExtra("open_tab", "run");
            intent22.addFlags(537001984);
            startActivity(intent22);
            return;
        } catch (Exception unused) {
            setStarted(false);
            Toast.makeText(mainActivity, "Couldn't start tracking. Check permissions & power settings.", 1).show();
            return;
        }
        d = null;
        longOrNull = StringsKt.toLongOrNull(StringsKt.trim((CharSequence) getGoalTimeMinText$app_sideload()).toString());
        if (longOrNull != null) {
        }
        mainActivity = this;
        Intent intent3 = new Intent(mainActivity, (Class<?>) TrackingService.class);
        intent3.setAction(TrackingService.ACTION_START);
        intent3.putExtra(TrackingService.EXTRA_ACTIVITY_TYPE, getGpsActivityType());
        intent3.putExtra(TrackingService.EXTRA_PLAN_TYPE, getPlanType());
        if (encodeToString != null) {
        }
        if (Intrinsics.areEqual(getPlanType(), TrackingService.PLAN_TIME_INTERVALS)) {
        }
        intent3.putExtra(TrackingService.EXTRA_AUTO_PAUSE, getAutoPauseEnabled$app_sideload());
        intent3.putExtra(TrackingService.EXTRA_VIBRATION, getVibrationCuesEnabled$app_sideload());
        intent3.putExtra(TrackingService.EXTRA_VOICE_ALERTS, getVoiceCuesEnabled$app_sideload());
        intent3.putExtra(TrackingService.EXTRA_BEEP_CUES, getBeepCuesEnabled$app_sideload());
        runPreset = getRunPreset();
        if (!Intrinsics.areEqual(runPreset, TrackingService.BATTERY_RACE)) {
        }
        intent3.putExtra(TrackingService.EXTRA_BATTERY_MODE, str);
        intent3.putExtra(TrackingService.EXTRA_SMOOTH_GPS, !Intrinsics.areEqual(getRunPreset(), TrackingService.BATTERY_RACE));
        if (startTracking$parseTargetSecPerKm != null) {
        }
        if (d != null) {
        }
        if (l != null) {
        }
    }

    private static final Integer startTracking$parsePaceSecPerKm(String str) {
        Integer intOrNull;
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() == 0) {
            return null;
        }
        List split$default = StringsKt.split$default((CharSequence) obj, new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2 && (intOrNull = StringsKt.toIntOrNull((String) split$default.get(0))) != null) {
            int intValue = intOrNull.intValue();
            Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
            if (intOrNull2 != null) {
                int intValue2 = intOrNull2.intValue();
                if (intValue >= 0 && intValue2 >= 0 && intValue2 < 60) {
                    return Integer.valueOf((intValue * 60) + intValue2);
                }
            }
        }
        return null;
    }

    private static final Integer startTracking$parseTargetSecPerKm(boolean z, String str) {
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() == 0) {
            return null;
        }
        if (z) {
            Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.replace$default(obj, AbstractJsonLexerKt.COMMA, '.', false, 4, (Object) null));
            if (doubleOrNull != null) {
                double doubleValue = doubleOrNull.doubleValue();
                if (5.0d > doubleValue || doubleValue > 80.0d) {
                    doubleOrNull = null;
                }
                if (doubleOrNull != null) {
                    return Integer.valueOf(RangesKt.coerceAtLeast((int) (3600.0d / doubleOrNull.doubleValue()), 1));
                }
            }
            return null;
        }
        return startTracking$parsePaceSecPerKm(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTracking() {
        Intent intent = new Intent(this, (Class<?>) TrackingService.class);
        intent.setAction(TrackingService.ACTION_STOP);
        startService(intent);
        setStarted(false);
        updateRecordingLockScreen(false);
    }
}
