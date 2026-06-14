package com.example.rungps.sleep;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.core.app.NotificationCompat;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepAlarmSoundService.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0016J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmSoundService;", "Landroid/app/Service;", "<init>", "()V", "mediaPlayer", "Landroid/media/MediaPlayer;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "vibrator", "Landroid/os/Vibrator;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "playConfiguredSound", "", "resolveAlarmUri", "Landroid/net/Uri;", "boostAlarmVolume", "startVibration", "stopVibration", "acquireWakeLock", "dismissPendingIntent", "Landroid/app/PendingIntent;", "buildAlarmNotification", "Landroid/app/Notification;", "ensureAlarmChannel", "onDestroy", "stopAlarmPlayback", "stopMediaPlayer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmSoundService extends Service {
    public static final String ACTION_START = "com.example.rungps.sleep.ALARM_SOUND_START";
    public static final String ACTION_STOP = "com.example.rungps.sleep.ALARM_SOUND_STOP";
    public static final String CHANNEL_ALARM = "sleep_alarm_ring";
    private static final int NOTIFICATION_ID = 7105;
    private static volatile boolean isRinging;
    private MediaPlayer mediaPlayer;
    private Vibrator vibrator;
    private PowerManager.WakeLock wakeLock;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3.equals(com.example.rungps.sleep.SleepAlarmSoundService.ACTION_START) == false) goto L20;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1636599115) {
                if (hashCode == 805021679) {
                }
            } else if (action.equals(ACTION_STOP)) {
                stopAlarmPlayback();
                stopForeground(1);
                stopSelf();
                return 2;
            }
            return 2;
        }
        isRinging = true;
        acquireWakeLock();
        ensureAlarmChannel();
        startForeground(7105, buildAlarmNotification());
        playConfiguredSound();
        startVibration();
        SleepAlarmActivity.INSTANCE.launch(this);
        return 2;
    }

    private final void playConfiguredSound() {
        stopMediaPlayer();
        boostAlarmVolume();
        Uri resolveAlarmUri = resolveAlarmUri();
        if (resolveAlarmUri == null) {
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        try {
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(4).setLegacyStreamType(4).build());
            mediaPlayer.setDataSource(this, resolveAlarmUri);
            mediaPlayer.setLooping(true);
            mediaPlayer.setVolume(1.0f, 1.0f);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (Exception unused) {
            stopMediaPlayer();
            try {
                Result.Companion companion = Result.INSTANCE;
                Uri defaultUri = RingtoneManager.getDefaultUri(4);
                if (defaultUri == null) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                }
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(4).setContentType(4).setLegacyStreamType(4).build());
                mediaPlayer2.setDataSource(this, defaultUri);
                mediaPlayer2.setLooping(true);
                mediaPlayer2.prepare();
                mediaPlayer2.start();
                this.mediaPlayer = mediaPlayer2;
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        return android.media.RingtoneManager.getDefaultUri(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r0.equals(com.example.rungps.sleep.SleepAlarmPreferences.SOUND_SPOTIFY) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0.equals(com.example.rungps.sleep.SleepAlarmPreferences.SOUND_SYSTEM) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r4 = android.media.RingtoneManager.getDefaultUri(4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Uri resolveAlarmUri() {
        SleepAlarmSoundService sleepAlarmSoundService = this;
        String soundMode = SleepAlarmPreferences.INSTANCE.soundMode(sleepAlarmSoundService);
        int hashCode = soundMode.hashCode();
        if (hashCode != -1998723398) {
            if (hashCode != -1236583518) {
                if (hashCode == -887328209) {
                }
            } else if (soundMode.equals(SleepAlarmPreferences.SOUND_RINGTONE)) {
                Uri customRingtoneUri = SleepAlarmPreferences.INSTANCE.customRingtoneUri(sleepAlarmSoundService);
                return customRingtoneUri == null ? RingtoneManager.getDefaultUri(4) : customRingtoneUri;
            }
            return RingtoneManager.getDefaultUri(4);
        }
    }

    private final void boostAlarmVolume() {
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) getSystemService(AudioManager.class);
        if (audioManager != null && (streamMaxVolume = audioManager.getStreamMaxVolume(4)) > 0) {
            audioManager.setStreamVolume(4, streamMaxVolume, 0);
        }
    }

    private final void startVibration() {
        Vibrator vibrator;
        stopVibration();
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager vibratorManager = (VibratorManager) getSystemService(VibratorManager.class);
            vibrator = vibratorManager != null ? vibratorManager.getDefaultVibrator() : null;
        } else {
            vibrator = (Vibrator) getSystemService(Vibrator.class);
        }
        if (vibrator == null) {
            return;
        }
        this.vibrator = vibrator;
        vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 600, 400, 600, 400, 800}, 0));
    }

    private final void stopVibration() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepAlarmSoundService sleepAlarmSoundService = this;
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.vibrator = null;
    }

    private final void acquireWakeLock() {
        PowerManager powerManager = (PowerManager) getSystemService(PowerManager.class);
        if (powerManager == null) {
            return;
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExerciseTracker:AlarmSound");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(900000L);
        this.wakeLock = newWakeLock;
    }

    private final PendingIntent dismissPendingIntent() {
        SleepAlarmSoundService sleepAlarmSoundService = this;
        PendingIntent broadcast = PendingIntent.getBroadcast(sleepAlarmSoundService, 47, new Intent(sleepAlarmSoundService, (Class<?>) SleepAlarmReceiver.class).setAction(SleepAlarmReceiver.ACTION_DISMISS), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final Notification buildAlarmNotification() {
        SleepAlarmSoundService sleepAlarmSoundService = this;
        PendingIntent activity = PendingIntent.getActivity(sleepAlarmSoundService, 0, SleepAlarmActivity.INSTANCE.intent(sleepAlarmSoundService), 201326592);
        PendingIntent dismissPendingIntent = dismissPendingIntent();
        Notification build = new NotificationCompat.Builder(sleepAlarmSoundService, CHANNEL_ALARM).setSmallIcon(R.drawable.ic_lock_idle_alarm).setContentTitle("Exercise Tracker — wake up").setContentText(Intrinsics.areEqual(SleepAlarmPreferences.INSTANCE.soundMode(sleepAlarmSoundService), SleepAlarmPreferences.SOUND_SPOTIFY) ? "Spotify + alarm volume backup" : "Alarm ringing — tap Dismiss or swipe away").setContentIntent(activity).addAction(0, "Dismiss alarm", dismissPendingIntent).setDeleteIntent(dismissPendingIntent).setOngoing(true).setPriority(2).setCategory(NotificationCompat.CATEGORY_ALARM).setVisibility(1).setFullScreenIntent(activity, true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void ensureAlarmChannel() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        Uri defaultUri = RingtoneManager.getDefaultUri(4);
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ALARM, "Sleep alarm", 4);
        notificationChannel.setDescription("Wake-up alarm sound and alerts");
        notificationChannel.setSound(defaultUri, new AudioAttributes.Builder().setUsage(4).setLegacyStreamType(4).build());
        notificationChannel.enableVibration(false);
        notificationChannel.setBypassDnd(true);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopAlarmPlayback();
        super.onDestroy();
    }

    private final void stopAlarmPlayback() {
        Unit unit;
        isRinging = false;
        stopMediaPlayer();
        stopVibration();
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepAlarmSoundService sleepAlarmSoundService = this;
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                wakeLock.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.wakeLock = null;
    }

    private final void stopMediaPlayer() {
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepAlarmSoundService sleepAlarmSoundService = this;
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        this.mediaPlayer = null;
    }

    /* compiled from: SleepAlarmSoundService.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmSoundService$Companion;", "", "<init>", "()V", "ACTION_START", "", "ACTION_STOP", "CHANNEL_ALARM", "NOTIFICATION_ID", "", Values.VECTOR_MAP_VECTORS_KEY, "", "isRinging", "()Z", "start", "", "context", "Landroid/content/Context;", "requestStop", "stop", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isRinging() {
            return SleepAlarmSoundService.isRinging;
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SleepAlarmSoundService.class);
            intent.setAction(SleepAlarmSoundService.ACTION_START);
            context.startForegroundService(intent);
        }

        public final void requestStop(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!isRinging()) {
                context.stopService(new Intent(context, (Class<?>) SleepAlarmSoundService.class));
            } else {
                context.startService(new Intent(context, (Class<?>) SleepAlarmSoundService.class).setAction(SleepAlarmSoundService.ACTION_STOP));
            }
        }

        public final void stop(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SleepAlarmDismiss.INSTANCE.dismissAll(context);
        }
    }
}
