package com.example.rungps.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import com.example.rungps.MainActivity;
import com.example.rungps.R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WidgetMinimalBind.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/widget/WidgetMinimalBind;", "", "<init>", "()V", "TAG", "", "bindGym", "", "context", "Landroid/content/Context;", "manager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "bindRideRun", "bindRecovery", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetMinimalBind {
    public static final int $stable = 0;
    public static final WidgetMinimalBind INSTANCE = new WidgetMinimalBind();
    private static final String TAG = "WidgetMinimalBind";

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteViews bindGym$lambda$3$lambda$2(RemoteViews remoteViews) {
        return remoteViews;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteViews bindRecovery$lambda$14$lambda$13(RemoteViews remoteViews) {
        return remoteViews;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteViews bindRideRun$lambda$9$lambda$8(RemoteViews remoteViews) {
        return remoteViews;
    }

    private WidgetMinimalBind() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindGym(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        int i;
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        int[] appWidgetIds2 = appWidgetIds;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(appWidgetIds2, "appWidgetIds");
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
        intent.putExtra("open_tab", "gym");
        intent.addFlags(872415232);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
        String str = applicationContext.getString(R.string.gym_widget_brand) + " · v0.7.93";
        String string = applicationContext.getString(R.string.gym_widget_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = applicationContext.getString(R.string.gym_widget_tap_hint);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int length = appWidgetIds2.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = appWidgetIds2[i2];
            try {
                Result.Companion companion = Result.INSTANCE;
                WidgetMinimalBind widgetMinimalBind = this;
                final RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), R.layout.widget_gym_host);
                remoteViews.setTextViewText(R.id.widget_brand, str);
                remoteViews.setTextViewText(R.id.widget_title, string);
                remoteViews.setTextViewText(R.id.widget_sub, string2);
                remoteViews.setTextViewText(R.id.widget_cta, applicationContext.getString(R.string.gym_widget_open));
                remoteViews.setViewVisibility(R.id.widget_status, 8);
                remoteViews.setViewVisibility(R.id.widget_badge, 8);
                remoteViews.setViewVisibility(R.id.widget_exercise, 8);
                remoteViews.setViewVisibility(R.id.widget_attendance_block, 8);
                remoteViews.setViewVisibility(R.id.widget_rest_row, 8);
                remoteViews.setViewVisibility(R.id.widget_rest_60, 8);
                remoteViews.setViewVisibility(R.id.widget_rest_90, 8);
                remoteViews.setViewVisibility(R.id.widget_rest_120, 8);
                remoteViews.setOnClickPendingIntent(R.id.widget_root, activity);
                WidgetSafeBinder widgetSafeBinder = WidgetSafeBinder.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                i = i3;
                try {
                    widgetSafeBinder.update(applicationContext, manager, i3, R.layout.widget_gym_host, new Function0() { // from class: com.example.rungps.widget.WidgetMinimalBind$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RemoteViews bindGym$lambda$3$lambda$2;
                            bindGym$lambda$3$lambda$2 = WidgetMinimalBind.bindGym$lambda$3$lambda$2(remoteViews);
                            return bindGym$lambda$3$lambda$2;
                        }
                    });
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                    if (m7908exceptionOrNullimpl == null) {
                    }
                    i2++;
                    appWidgetIds2 = appWidgetIds;
                }
            } catch (Throwable th2) {
                th = th2;
                i = i3;
            }
            m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
            if (m7908exceptionOrNullimpl == null) {
                Log.e(TAG, "gym minimal bind failed id=" + i, m7908exceptionOrNullimpl);
            }
            i2++;
            appWidgetIds2 = appWidgetIds;
        }
        GymWidgetUpdater gymWidgetUpdater = GymWidgetUpdater.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        gymWidgetUpdater.refreshAsync(applicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindRideRun(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        int i;
        int i2;
        int i3;
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
        intent.putExtra("open_tab", "run");
        intent.setFlags(805306368);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 30, intent, 201326592);
        Intent intent2 = new Intent(applicationContext, (Class<?>) MainActivity.class);
        intent2.putExtra("open_tab", "run");
        intent2.putExtra("widget_action", RideRunWidgetProvider.ACTION_START_RUN);
        intent2.setFlags(805306368);
        Unit unit2 = Unit.INSTANCE;
        PendingIntent activity2 = PendingIntent.getActivity(applicationContext, 31, intent2, 201326592);
        String str = applicationContext.getString(R.string.ride_run_widget_brand) + " · v0.7.93";
        String string = applicationContext.getString(R.string.ride_run_widget_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = applicationContext.getString(R.string.ride_run_widget_tap_hint);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int length = appWidgetIds.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            int i6 = appWidgetIds[i5];
            try {
                Result.Companion companion = Result.INSTANCE;
                WidgetMinimalBind widgetMinimalBind = this;
                final RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), R.layout.widget_ride_run_host);
                remoteViews.setTextViewText(R.id.widget_brand, str);
                remoteViews.setTextViewText(R.id.widget_title, string);
                remoteViews.setViewVisibility(R.id.widget_stats, 8);
                remoteViews.setViewVisibility(R.id.widget_recording_dot, 8);
                remoteViews.setTextViewText(R.id.widget_sub, string2);
                remoteViews.setViewVisibility(R.id.widget_start_btn, i4);
                remoteViews.setOnClickPendingIntent(R.id.widget_root, activity);
                remoteViews.setOnClickPendingIntent(R.id.widget_start_btn, activity2);
                remoteViews.setTextViewText(R.id.widget_cta, applicationContext.getString(R.string.ride_run_widget_open));
                WidgetSafeBinder widgetSafeBinder = WidgetSafeBinder.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                i = i6;
                i2 = i5;
                i3 = i4;
                try {
                    widgetSafeBinder.update(applicationContext, manager, i6, R.layout.widget_ride_run_host, new Function0() { // from class: com.example.rungps.widget.WidgetMinimalBind$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RemoteViews bindRideRun$lambda$9$lambda$8;
                            bindRideRun$lambda$9$lambda$8 = WidgetMinimalBind.bindRideRun$lambda$9$lambda$8(remoteViews);
                            return bindRideRun$lambda$9$lambda$8;
                        }
                    });
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                    if (m7908exceptionOrNullimpl == null) {
                    }
                    i5 = i2 + 1;
                    i4 = i3;
                }
            } catch (Throwable th2) {
                th = th2;
                i = i6;
                i2 = i5;
                i3 = i4;
            }
            m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
            if (m7908exceptionOrNullimpl == null) {
                Log.e(TAG, "ride/run minimal bind failed id=" + i, m7908exceptionOrNullimpl);
            }
            i5 = i2 + 1;
            i4 = i3;
        }
        RideRunWidgetUpdater rideRunWidgetUpdater = RideRunWidgetUpdater.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        rideRunWidgetUpdater.refreshAsync(applicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindRecovery(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        int i;
        int i2;
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
        intent.putExtra("open_tab", "home");
        intent.setFlags(805306368);
        Unit unit = Unit.INSTANCE;
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 20, intent, 201326592);
        String str = applicationContext.getString(R.string.recovery_widget_brand) + " · v0.7.93";
        String string = applicationContext.getString(R.string.recovery_widget_default_advice);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = applicationContext.getString(R.string.recovery_widget_default_recovery);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int length = appWidgetIds.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = appWidgetIds[i3];
            try {
                Result.Companion companion = Result.INSTANCE;
                WidgetMinimalBind widgetMinimalBind = this;
                final RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), R.layout.widget_recovery_host);
                remoteViews.setTextViewText(R.id.widget_brand, str);
                remoteViews.setTextViewText(R.id.widget_advice_line, string);
                remoteViews.setTextViewText(R.id.widget_readiness_badge, applicationContext.getString(R.string.recovery_widget_default_readiness));
                remoteViews.setInt(R.id.widget_readiness_badge, "setBackgroundResource", R.drawable.widget_readiness_badge_caution);
                remoteViews.setInt(R.id.widget_readiness_badge, "setTextColor", applicationContext.getColor(R.color.widget_readiness_caution));
                remoteViews.setTextViewText(R.id.widget_recovery_line, string2);
                remoteViews.setViewVisibility(R.id.widget_last_gym_line, 8);
                remoteViews.setOnClickPendingIntent(R.id.widget_root, activity);
                remoteViews.setTextViewText(R.id.widget_cta, applicationContext.getString(R.string.recovery_widget_open));
                WidgetSafeBinder widgetSafeBinder = WidgetSafeBinder.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                i = i4;
                i2 = i3;
                try {
                    widgetSafeBinder.update(applicationContext, manager, i4, R.layout.widget_recovery_host, new Function0() { // from class: com.example.rungps.widget.WidgetMinimalBind$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RemoteViews bindRecovery$lambda$14$lambda$13;
                            bindRecovery$lambda$14$lambda$13 = WidgetMinimalBind.bindRecovery$lambda$14$lambda$13(remoteViews);
                            return bindRecovery$lambda$14$lambda$13;
                        }
                    });
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                    if (m7908exceptionOrNullimpl == null) {
                    }
                    i3 = i2 + 1;
                }
            } catch (Throwable th2) {
                th = th2;
                i = i4;
                i2 = i3;
            }
            m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
            if (m7908exceptionOrNullimpl == null) {
                Log.e(TAG, "recovery minimal bind failed id=" + i, m7908exceptionOrNullimpl);
            }
            i3 = i2 + 1;
        }
        WidgetBootstrap widgetBootstrap = WidgetBootstrap.INSTANCE;
        Intrinsics.checkNotNull(applicationContext);
        WidgetBootstrap.refreshAllAsync$default(widgetBootstrap, applicationContext, false, 2, null);
    }
}
