package com.example.rungps.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.MainActivity;
import com.example.rungps.R;
import com.example.rungps.widget.RideRunWidgetProvider;
import com.example.rungps.widget.WidgetRefreshWorker;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RideRunWidgetProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/widget/RideRunWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "onEnabled", "", "context", "Landroid/content/Context;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onAppWidgetOptionsChanged", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "Companion", "WidgetState", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RideRunWidgetProvider extends AppWidgetProvider {
    public static final int $stable = 0;
    public static final String ACTION_START_RUN = "com.example.rungps.WIDGET_START_RUN";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_HEADLINE = "headline";
    private static final String KEY_OPEN_TAB = "open_tab";
    private static final String KEY_RECORDING = "recording";
    private static final String KEY_STATS = "stats_line";
    private static final String KEY_SUB = "sub_line";
    private static final String PREFS = "ride_run_widget";

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetBootstrap.INSTANCE.onWidgetEnabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        try {
            Result.Companion companion = Result.INSTANCE;
            RideRunWidgetProvider rideRunWidgetProvider = this;
            WidgetMinimalBind.INSTANCE.bindRideRun(context, appWidgetManager, appWidgetIds);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.e("RideRunWidget", "onUpdate failed", m7908exceptionOrNullimpl);
        }
        WidgetRefreshWorker.Companion companion3 = WidgetRefreshWorker.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion3.enqueueOneShot(applicationContext);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        try {
            Result.Companion companion = Result.INSTANCE;
            RideRunWidgetProvider rideRunWidgetProvider = this;
            WidgetMinimalBind.INSTANCE.bindRideRun(context, appWidgetManager, new int[]{appWidgetId});
            WidgetRefreshWorker.Companion companion2 = WidgetRefreshWorker.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion2.enqueueOneShot(applicationContext);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.e("RideRunWidget", "onAppWidgetOptionsChanged failed", m7908exceptionOrNullimpl);
        }
    }

    /* compiled from: RideRunWidgetProvider.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/example/rungps/widget/RideRunWidgetProvider$Companion;", "", "<init>", "()V", "ACTION_START_RUN", "", "PREFS", "KEY_HEADLINE", "KEY_STATS", "KEY_SUB", "KEY_RECORDING", "KEY_OPEN_TAB", "readWidgetState", "Lcom/example/rungps/widget/RideRunWidgetProvider$WidgetState;", "context", "Landroid/content/Context;", "prefs", "Landroid/content/SharedPreferences;", "updateFromApp", "", RideRunWidgetProvider.KEY_HEADLINE, "statsLine", "subLine", RideRunWidgetProvider.KEY_RECORDING, "", "openTab", "requestUpdate", "bindWidgets", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "state", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final WidgetState readWidgetState(Context context, SharedPreferences prefs) {
            String str;
            String string = prefs.getString(RideRunWidgetProvider.KEY_HEADLINE, null);
            if (string == null) {
                string = context.getString(R.string.ride_run_widget_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            String str2 = string;
            String string2 = prefs.getString(RideRunWidgetProvider.KEY_STATS, null);
            String string3 = prefs.getString(RideRunWidgetProvider.KEY_SUB, null);
            if (string3 == null) {
                str = context.getString(R.string.ride_run_widget_tap_hint);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            } else {
                str = string3;
            }
            boolean z = prefs.getBoolean(RideRunWidgetProvider.KEY_RECORDING, false);
            String string4 = prefs.getString(RideRunWidgetProvider.KEY_OPEN_TAB, null);
            if (string4 == null) {
                string4 = "run";
            }
            return new WidgetState(str2, string2, str, z, string4);
        }

        public static /* synthetic */ void updateFromApp$default(Companion companion, Context context, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str4 = "run";
            }
            companion.updateFromApp(context, str, str2, str3, z2, str4);
        }

        public final void updateFromApp(Context context, String headline, String statsLine, String subLine, boolean recording, String openTab) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(subLine, "subLine");
            Intrinsics.checkNotNullParameter(openTab, "openTab");
            context.getSharedPreferences(RideRunWidgetProvider.PREFS, 0).edit().putString(RideRunWidgetProvider.KEY_HEADLINE, headline).putString(RideRunWidgetProvider.KEY_STATS, statsLine).putString(RideRunWidgetProvider.KEY_SUB, subLine).putBoolean(RideRunWidgetProvider.KEY_RECORDING, recording).putString(RideRunWidgetProvider.KEY_OPEN_TAB, openTab).apply();
            requestUpdate(context);
        }

        public final void requestUpdate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) RideRunWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return;
            }
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(RideRunWidgetProvider.PREFS, 0);
            Intrinsics.checkNotNull(applicationContext);
            Intrinsics.checkNotNull(appWidgetManager);
            Intrinsics.checkNotNull(sharedPreferences);
            bindWidgets(applicationContext, appWidgetManager, appWidgetIds, readWidgetState(applicationContext, sharedPreferences));
        }

        private final void bindWidgets(final Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds, final WidgetState state) {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra(RideRunWidgetProvider.KEY_OPEN_TAB, state.getOpenTab());
            intent.setFlags(805306368);
            Unit unit = Unit.INSTANCE;
            final PendingIntent activity = PendingIntent.getActivity(context, 30, intent, 201326592);
            Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
            intent2.putExtra(RideRunWidgetProvider.KEY_OPEN_TAB, "run");
            intent2.putExtra("widget_action", RideRunWidgetProvider.ACTION_START_RUN);
            intent2.setFlags(805306368);
            Unit unit2 = Unit.INSTANCE;
            final PendingIntent activity2 = PendingIntent.getActivity(context, 31, intent2, 201326592);
            final String str = context.getString(R.string.ride_run_widget_brand) + " · v0.7.93";
            for (int i : appWidgetIds) {
                WidgetSafeBinder.INSTANCE.update(context, appWidgetManager, i, R.layout.widget_ride_run_host, new Function0() { // from class: com.example.rungps.widget.RideRunWidgetProvider$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        RemoteViews bindWidgets$lambda$3;
                        bindWidgets$lambda$3 = RideRunWidgetProvider.Companion.bindWidgets$lambda$3(context, str, state, activity, activity2);
                        return bindWidgets$lambda$3;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RemoteViews bindWidgets$lambda$3(Context context, String str, WidgetState widgetState, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            String string;
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_ride_run_host);
            remoteViews.setTextViewText(R.id.widget_brand, str);
            remoteViews.setTextViewText(R.id.widget_title, widgetState.getHeadline());
            String statsLine = widgetState.getStatsLine();
            if (statsLine != null && !StringsKt.isBlank(statsLine)) {
                remoteViews.setViewVisibility(R.id.widget_stats, 0);
                remoteViews.setTextViewText(R.id.widget_stats, widgetState.getStatsLine());
            } else {
                remoteViews.setViewVisibility(R.id.widget_stats, 8);
            }
            remoteViews.setTextViewText(R.id.widget_sub, widgetState.getSubLine());
            remoteViews.setViewVisibility(R.id.widget_recording_dot, widgetState.getRecording() ? 0 : 8);
            remoteViews.setViewVisibility(R.id.widget_start_btn, widgetState.getRecording() ? 8 : 0);
            remoteViews.setOnClickPendingIntent(R.id.widget_root, pendingIntent);
            remoteViews.setOnClickPendingIntent(R.id.widget_start_btn, pendingIntent2);
            int i = R.id.widget_cta;
            if (widgetState.getRecording()) {
                string = context.getString(R.string.ride_run_widget_open_recording);
            } else {
                string = context.getString(R.string.ride_run_widget_open);
            }
            remoteViews.setTextViewText(i, string);
            return remoteViews;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RideRunWidgetProvider.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/widget/RideRunWidgetProvider$WidgetState;", "", RideRunWidgetProvider.KEY_HEADLINE, "", "statsLine", "subLine", RideRunWidgetProvider.KEY_RECORDING, "", "openTab", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getHeadline", "()Ljava/lang/String;", "getStatsLine", "getSubLine", "getRecording", "()Z", "getOpenTab", "component1", "component2", "component3", "component4", "component5", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class WidgetState {
        private final String headline;
        private final String openTab;
        private final boolean recording;
        private final String statsLine;
        private final String subLine;

        public static /* synthetic */ WidgetState copy$default(WidgetState widgetState, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetState.headline;
            }
            if ((i & 2) != 0) {
                str2 = widgetState.statsLine;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = widgetState.subLine;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                z = widgetState.recording;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                str4 = widgetState.openTab;
            }
            return widgetState.copy(str, str5, str6, z2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStatsLine() {
            return this.statsLine;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubLine() {
            return this.subLine;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getRecording() {
            return this.recording;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOpenTab() {
            return this.openTab;
        }

        public final WidgetState copy(String headline, String statsLine, String subLine, boolean recording, String openTab) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(subLine, "subLine");
            Intrinsics.checkNotNullParameter(openTab, "openTab");
            return new WidgetState(headline, statsLine, subLine, recording, openTab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetState)) {
                return false;
            }
            WidgetState widgetState = (WidgetState) other;
            return Intrinsics.areEqual(this.headline, widgetState.headline) && Intrinsics.areEqual(this.statsLine, widgetState.statsLine) && Intrinsics.areEqual(this.subLine, widgetState.subLine) && this.recording == widgetState.recording && Intrinsics.areEqual(this.openTab, widgetState.openTab);
        }

        public int hashCode() {
            int hashCode = this.headline.hashCode() * 31;
            String str = this.statsLine;
            return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.subLine.hashCode()) * 31) + Boolean.hashCode(this.recording)) * 31) + this.openTab.hashCode();
        }

        public String toString() {
            return "WidgetState(headline=" + this.headline + ", statsLine=" + this.statsLine + ", subLine=" + this.subLine + ", recording=" + this.recording + ", openTab=" + this.openTab + ")";
        }

        public WidgetState(String headline, String str, String subLine, boolean z, String openTab) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(subLine, "subLine");
            Intrinsics.checkNotNullParameter(openTab, "openTab");
            this.headline = headline;
            this.statsLine = str;
            this.subLine = subLine;
            this.recording = z;
            this.openTab = openTab;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getStatsLine() {
            return this.statsLine;
        }

        public final String getSubLine() {
            return this.subLine;
        }

        public final boolean getRecording() {
            return this.recording;
        }

        public final String getOpenTab() {
            return this.openTab;
        }
    }
}
