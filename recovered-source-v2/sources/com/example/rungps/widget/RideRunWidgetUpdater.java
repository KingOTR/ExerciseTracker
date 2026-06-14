package com.example.rungps.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.example.rungps.R;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingActiveStore;
import com.example.rungps.ui.run.RunFormatters;
import com.example.rungps.widget.RideRunWidgetProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: RideRunWidgetUpdater.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/widget/RideRunWidgetUpdater;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "refreshAsync", "", "context", "Landroid/content/Context;", "refresh", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleRecordingRefresh", "cancelRecordingRefresh", "recordingRefreshPendingIntent", "Landroid/app/PendingIntent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RideRunWidgetUpdater {
    public static final RideRunWidgetUpdater INSTANCE = new RideRunWidgetUpdater();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    public static final int $stable = 8;

    private RideRunWidgetUpdater() {
    }

    public final void refreshAsync(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new RideRunWidgetUpdater$refreshAsync$1(context, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(Context context, Continuation<? super Unit> continuation) {
        RideRunWidgetUpdater$refresh$1 rideRunWidgetUpdater$refresh$1;
        int i;
        Context context2;
        Iterator it;
        Object obj;
        RunEntity runEntity;
        if (continuation instanceof RideRunWidgetUpdater$refresh$1) {
            rideRunWidgetUpdater$refresh$1 = (RideRunWidgetUpdater$refresh$1) continuation;
            if ((rideRunWidgetUpdater$refresh$1.label & Integer.MIN_VALUE) != 0) {
                rideRunWidgetUpdater$refresh$1.label -= Integer.MIN_VALUE;
                Object obj2 = rideRunWidgetUpdater$refresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rideRunWidgetUpdater$refresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Context applicationContext = context.getApplicationContext();
                    TrackingActiveStore trackingActiveStore = TrackingActiveStore.INSTANCE;
                    Intrinsics.checkNotNull(applicationContext);
                    if (trackingActiveStore.isActive(applicationContext)) {
                        long coerceAtLeast = RangesKt.coerceAtLeast(System.currentTimeMillis() - TrackingActiveStore.INSTANCE.startedAtMs(applicationContext), 0L);
                        double liveDistanceM = TrackingActiveStore.INSTANCE.liveDistanceM(applicationContext);
                        String label = ActivityTypes.INSTANCE.label(TrackingActiveStore.INSTANCE.liveActivityType(applicationContext));
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%.2f km · %s", Arrays.copyOf(new Object[]{Boxing.boxDouble(liveDistanceM / 1000.0d), RunFormatters.INSTANCE.formatElapsed(coerceAtLeast)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        RideRunWidgetProvider.INSTANCE.updateFromApp(applicationContext, label + " recording", format, TrackingActiveStore.INSTANCE.isPaused(applicationContext) ? "Paused — tap to open" : "Recording — tap to open", true, "run");
                        scheduleRecordingRefresh(applicationContext);
                        return Unit.INSTANCE;
                    }
                    cancelRecordingRefresh(applicationContext);
                    Repository repository = Repository.INSTANCE.get(applicationContext);
                    rideRunWidgetUpdater$refresh$1.L$0 = applicationContext;
                    rideRunWidgetUpdater$refresh$1.label = 1;
                    Object allRuns = repository.allRuns(rideRunWidgetUpdater$refresh$1);
                    if (allRuns == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context2 = applicationContext;
                    obj2 = allRuns;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Context context3 = (Context) rideRunWidgetUpdater$refresh$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    context2 = context3;
                }
                it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((RunEntity) obj).getEndedAtMs() != null) {
                        break;
                    }
                }
                runEntity = (RunEntity) obj;
                if (runEntity == null) {
                    String label2 = ActivityTypes.INSTANCE.label(runEntity.getActivityType());
                    double totalDistanceM = runEntity.getTotalDistanceM() / 1000.0d;
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.US, "%.2f km · %s", Arrays.copyOf(new Object[]{Boxing.boxDouble(totalDistanceM), RunFormatters.INSTANCE.formatElapsed(runEntity.getTotalDurationMs())}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    RideRunWidgetProvider.Companion companion = RideRunWidgetProvider.INSTANCE;
                    Intrinsics.checkNotNull(context2);
                    companion.updateFromApp(context2, "Last " + label2, format2, "Tap Quick start or open app", false, "history");
                } else {
                    RideRunWidgetProvider.Companion companion2 = RideRunWidgetProvider.INSTANCE;
                    Intrinsics.checkNotNull(context2);
                    String string = context2.getString(R.string.ride_run_widget_label);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = context2.getString(R.string.ride_run_widget_empty);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    companion2.updateFromApp(context2, string, null, string2, false, "run");
                }
                return Unit.INSTANCE;
            }
        }
        rideRunWidgetUpdater$refresh$1 = new RideRunWidgetUpdater$refresh$1(this, continuation);
        Object obj22 = rideRunWidgetUpdater$refresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rideRunWidgetUpdater$refresh$1.label;
        if (i != 0) {
        }
        it = ((List) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        runEntity = (RunEntity) obj;
        if (runEntity == null) {
        }
        return Unit.INSTANCE;
    }

    public final void scheduleRecordingRefresh(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        long currentTimeMillis = System.currentTimeMillis() + 30000;
        Intrinsics.checkNotNull(applicationContext);
        PendingIntent recordingRefreshPendingIntent = recordingRefreshPendingIntent(applicationContext);
        if (Build.VERSION.SDK_INT >= 31 && alarmManager.canScheduleExactAlarms()) {
            alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, recordingRefreshPendingIntent);
        } else {
            alarmManager.setAndAllowWhileIdle(0, currentTimeMillis, recordingRefreshPendingIntent);
        }
    }

    public final void cancelRecordingRefresh(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        Intrinsics.checkNotNull(applicationContext);
        ((AlarmManager) systemService).cancel(recordingRefreshPendingIntent(applicationContext));
    }

    private final PendingIntent recordingRefreshPendingIntent(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 8802, new Intent(context, (Class<?>) RideRunWidgetRefreshReceiver.class), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
