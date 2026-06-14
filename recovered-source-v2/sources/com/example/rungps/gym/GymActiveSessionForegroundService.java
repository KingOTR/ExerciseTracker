package com.example.rungps.gym;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.example.rungps.MainActivity;
import com.example.rungps.data.Repository;
import com.google.common.primitives.Ints;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: GymActiveSessionForegroundService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/gym/GymActiveSessionForegroundService;", "Landroid/app/Service;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "mediaJob", "Lkotlinx/coroutines/Job;", "mediaRecorder", "Lcom/example/rungps/gym/GymSessionMediaRecorder;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "onDestroy", "", "startMediaCapture", "sessionId", "", "buildNotification", "Landroid/app/Notification;", "ensureChannel", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymActiveSessionForegroundService extends Service {
    private static final String ACTION_START = "com.example.rungps.gym.ACTIVE_SESSION_START";
    private static final String ACTION_STOP = "com.example.rungps.gym.ACTIVE_SESSION_STOP";
    private static final String CHANNEL_ID = "gym_active_session";
    private static final String EXTRA_SESSION_ID = "session_id";
    private static final int NOTIFICATION_ID = 7201;
    private Job mediaJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
    private final GymSessionMediaRecorder mediaRecorder = new GymSessionMediaRecorder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -689270925 && action.equals(ACTION_STOP)) {
            Job job = this.mediaJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.mediaJob = null;
            this.mediaRecorder.reset();
            stopForeground(1);
            stopSelf();
            return 2;
        }
        long longExtra = intent != null ? intent.getLongExtra(EXTRA_SESSION_ID, 0L) : 0L;
        if (longExtra <= 0) {
            stopSelf();
            return 2;
        }
        startMediaCapture(longExtra);
        startForeground(NOTIFICATION_ID, buildNotification(longExtra), Ints.MAX_POWER_OF_TWO);
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Job job = this.mediaJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        super.onDestroy();
    }

    private final void startMediaCapture(long sessionId) {
        Job launch$default;
        Job job = this.mediaJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.mediaRecorder.reset();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new GymActiveSessionForegroundService$startMediaCapture$1(this, sessionId, Repository.INSTANCE.get(this), null), 3, null);
        this.mediaJob = launch$default;
    }

    private final Notification buildNotification(long sessionId) {
        ensureChannel();
        GymActiveSessionForegroundService gymActiveSessionForegroundService = this;
        Intent intent = new Intent(gymActiveSessionForegroundService, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("open_tab", "gym");
        intent.putExtra("open_gym_session_id", sessionId);
        Unit unit = Unit.INSTANCE;
        Notification build = new NotificationCompat.Builder(gymActiveSessionForegroundService, CHANNEL_ID).setSmallIcon(R.drawable.ic_menu_compass).setContentTitle("Exercise Tracker — gym session").setContentText("Logging in progress — tap to return").setContentIntent(PendingIntent.getActivity(gymActiveSessionForegroundService, 0, intent, 201326592)).setOngoing(true).setCategory(NotificationCompat.CATEGORY_WORKOUT).setSilent(true).setOnlyAlertOnce(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void ensureChannel() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null && notificationManager.getNotificationChannel(CHANNEL_ID) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Gym session", 2);
            notificationChannel.setDescription("Keeps gym logging active while you use other apps");
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* compiled from: GymActiveSessionForegroundService.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/gym/GymActiveSessionForegroundService$Companion;", "", "<init>", "()V", "CHANNEL_ID", "", "NOTIFICATION_ID", "", "EXTRA_SESSION_ID", "ACTION_STOP", "start", "", "context", "Landroid/content/Context;", "sessionId", "", "stop", "ACTION_START", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, long sessionId) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (sessionId <= 0) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) GymActiveSessionForegroundService.class);
            intent.setAction(GymActiveSessionForegroundService.ACTION_START);
            intent.putExtra(GymActiveSessionForegroundService.EXTRA_SESSION_ID, sessionId);
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
            Intent intent = new Intent(context, (Class<?>) GymActiveSessionForegroundService.class);
            intent.setAction(GymActiveSessionForegroundService.ACTION_STOP);
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                Result.m7905constructorimpl(context.startService(intent));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
