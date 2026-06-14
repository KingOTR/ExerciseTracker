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
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.MainActivity;
import com.example.rungps.R;
import com.example.rungps.widget.GymWidgetProvider;
import com.example.rungps.widget.WidgetRefreshWorker;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GymWidgetProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/widget/GymWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "onEnabled", "", "context", "Landroid/content/Context;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onAppWidgetOptionsChanged", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "WidgetState", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWidgetProvider extends AppWidgetProvider {
    public static final int $stable = 0;
    public static final String ACTION_REST_120 = "com.example.rungps.WIDGET_REST_120";
    public static final String ACTION_REST_60 = "com.example.rungps.WIDGET_REST_60";
    public static final String ACTION_REST_90 = "com.example.rungps.WIDGET_REST_90";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_ATTENDANCE_PCT = "attendance_pct";
    private static final String KEY_DAYS_HIT = "days_hit";
    private static final String KEY_DAYS_LEFT = "days_left_label";
    private static final String KEY_EXERCISE = "exercise";
    private static final String KEY_HEADLINE = "headline";
    private static final String KEY_IN_PROGRESS = "in_progress";
    private static final String KEY_OPEN_SESSION_ID = "open_session_id";
    private static final String KEY_SESSION_NAME = "session_name";
    private static final String KEY_SETS_LEFT = "sets_left";
    private static final String KEY_SHOW_ATTENDANCE = "show_attendance";
    private static final String KEY_SHOW_REST_CHIPS = "show_rest_chips";
    private static final String KEY_STATUS = "status_line";
    private static final String KEY_STREAK = "streak_days";
    private static final String KEY_SUB = "sub";
    private static final String KEY_SUGGESTION = "suggestion";
    private static final String KEY_TREND = "trend_label";
    private static final String KEY_WINDOW_DAYS = "window_days";
    private static final String PREFS = "gym_widget";

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
            GymWidgetProvider gymWidgetProvider = this;
            WidgetMinimalBind.INSTANCE.bindGym(context, appWidgetManager, appWidgetIds);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.e("GymWidget", "onUpdate failed", m7908exceptionOrNullimpl);
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
            GymWidgetProvider gymWidgetProvider = this;
            INSTANCE.requestUpdate(context);
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
            Log.e("GymWidget", "onAppWidgetOptionsChanged failed", m7908exceptionOrNullimpl);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int hashCode;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action != null && ((hashCode = action.hashCode()) == 486422593 ? action.equals(ACTION_REST_120) : !(hashCode == 1262617192 ? !action.equals(ACTION_REST_60) : !(hashCode == 1262617285 && action.equals(ACTION_REST_90))))) {
            new GymWidgetRestReceiver().onReceive(context, intent);
        } else {
            super.onReceive(context, intent);
        }
    }

    /* compiled from: GymWidgetProvider.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÃ\u0001\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\n\b\u0002\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102J\u0018\u00103\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0002J\u000e\u00107\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ(\u00108\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000204H\u0002J\u001c\u0010>\u001a\u00020\u001b*\u00020?2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/example/rungps/widget/GymWidgetProvider$Companion;", "", "<init>", "()V", "PREFS", "", "KEY_HEADLINE", "KEY_SUB", "KEY_SESSION_NAME", "KEY_EXERCISE", "KEY_SETS_LEFT", "KEY_SUGGESTION", "KEY_ATTENDANCE_PCT", "KEY_DAYS_HIT", "KEY_WINDOW_DAYS", "KEY_STREAK", "KEY_DAYS_LEFT", "KEY_TREND", "KEY_SHOW_ATTENDANCE", "KEY_IN_PROGRESS", "KEY_OPEN_SESSION_ID", "KEY_STATUS", "KEY_SHOW_REST_CHIPS", "ACTION_REST_60", "ACTION_REST_90", "ACTION_REST_120", "updateFromApp", "", "context", "Landroid/content/Context;", GymWidgetProvider.KEY_HEADLINE, GymWidgetProvider.KEY_SUB, "sessionName", "exerciseName", "setsLeft", "", "suggestionLine", "statusLine", "attendancePct", "daysHit", "windowDays", "streakDays", "daysLeftLabel", "trendLabel", "showAttendance", "", "inProgress", "showRestChips", "openSessionId", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Long;)V", "readWidgetState", "Lcom/example/rungps/widget/GymWidgetProvider$WidgetState;", "prefs", "Landroid/content/SharedPreferences;", "requestUpdate", "bindWidgets", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "state", "bindChip", "Landroid/widget/RemoteViews;", "viewId", "text", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void updateFromApp(Context context, String headline, String sub, String sessionName, String exerciseName, int setsLeft, String suggestionLine, String statusLine, int attendancePct, int daysHit, int windowDays, int streakDays, String daysLeftLabel, String trendLabel, boolean showAttendance, boolean inProgress, boolean showRestChips, Long openSessionId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(sub, "sub");
            Intrinsics.checkNotNullParameter(daysLeftLabel, "daysLeftLabel");
            Intrinsics.checkNotNullParameter(trendLabel, "trendLabel");
            context.getSharedPreferences(GymWidgetProvider.PREFS, 0).edit().putString(GymWidgetProvider.KEY_HEADLINE, headline).putString(GymWidgetProvider.KEY_SUB, sub).putString(GymWidgetProvider.KEY_SESSION_NAME, sessionName).putString(GymWidgetProvider.KEY_EXERCISE, exerciseName).putInt(GymWidgetProvider.KEY_SETS_LEFT, RangesKt.coerceAtLeast(setsLeft, 0)).putString(GymWidgetProvider.KEY_SUGGESTION, suggestionLine).putString(GymWidgetProvider.KEY_STATUS, statusLine).putInt(GymWidgetProvider.KEY_ATTENDANCE_PCT, RangesKt.coerceIn(attendancePct, 0, 100)).putInt(GymWidgetProvider.KEY_DAYS_HIT, RangesKt.coerceAtLeast(daysHit, 0)).putInt(GymWidgetProvider.KEY_WINDOW_DAYS, RangesKt.coerceAtLeast(windowDays, 0)).putInt(GymWidgetProvider.KEY_STREAK, RangesKt.coerceAtLeast(streakDays, 0)).putString(GymWidgetProvider.KEY_DAYS_LEFT, daysLeftLabel).putString(GymWidgetProvider.KEY_TREND, trendLabel).putBoolean(GymWidgetProvider.KEY_SHOW_ATTENDANCE, showAttendance).putBoolean(GymWidgetProvider.KEY_IN_PROGRESS, inProgress).putBoolean(GymWidgetProvider.KEY_SHOW_REST_CHIPS, showRestChips).putLong(GymWidgetProvider.KEY_OPEN_SESSION_ID, openSessionId != null ? openSessionId.longValue() : 0L).apply();
            requestUpdate(context);
        }

        private final WidgetState readWidgetState(Context context, SharedPreferences prefs) {
            String str;
            String string = prefs.getString(GymWidgetProvider.KEY_HEADLINE, null);
            if (string == null) {
                string = context.getString(R.string.gym_widget_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            String str2 = string;
            String string2 = prefs.getString(GymWidgetProvider.KEY_SUB, null);
            if (string2 == null) {
                String string3 = context.getString(R.string.gym_widget_tap_hint);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                str = string3;
            } else {
                str = string2;
            }
            String string4 = prefs.getString(GymWidgetProvider.KEY_SESSION_NAME, null);
            String string5 = prefs.getString(GymWidgetProvider.KEY_EXERCISE, null);
            int i = prefs.getInt(GymWidgetProvider.KEY_SETS_LEFT, 0);
            String string6 = prefs.getString(GymWidgetProvider.KEY_SUGGESTION, null);
            String string7 = prefs.getString(GymWidgetProvider.KEY_STATUS, null);
            int i2 = prefs.getInt(GymWidgetProvider.KEY_ATTENDANCE_PCT, 0);
            int i3 = prefs.getInt(GymWidgetProvider.KEY_DAYS_HIT, 0);
            int i4 = prefs.getInt(GymWidgetProvider.KEY_WINDOW_DAYS, 0);
            int i5 = prefs.getInt(GymWidgetProvider.KEY_STREAK, 0);
            String string8 = prefs.getString(GymWidgetProvider.KEY_DAYS_LEFT, null);
            String str3 = string8 == null ? "" : string8;
            String string9 = prefs.getString(GymWidgetProvider.KEY_TREND, null);
            String str4 = string9 == null ? "" : string9;
            boolean z = prefs.getBoolean(GymWidgetProvider.KEY_SHOW_ATTENDANCE, false);
            boolean z2 = prefs.getBoolean(GymWidgetProvider.KEY_IN_PROGRESS, false);
            boolean z3 = prefs.getBoolean(GymWidgetProvider.KEY_SHOW_REST_CHIPS, false);
            Long valueOf = Long.valueOf(prefs.getLong(GymWidgetProvider.KEY_OPEN_SESSION_ID, 0L));
            return new WidgetState(str2, str, string4, string5, i, string6, string7, i2, i3, i4, i5, str3, str4, z, z2, z3, valueOf.longValue() > 0 ? valueOf : null);
        }

        public final void requestUpdate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) GymWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return;
            }
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(GymWidgetProvider.PREFS, 0);
            Intrinsics.checkNotNull(applicationContext);
            Intrinsics.checkNotNull(sharedPreferences);
            WidgetState readWidgetState = readWidgetState(applicationContext, sharedPreferences);
            Intrinsics.checkNotNull(appWidgetManager);
            bindWidgets(applicationContext, appWidgetManager, appWidgetIds, readWidgetState);
        }

        private final void bindWidgets(final Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds, final WidgetState state) {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("open_tab", "gym");
            Long openSessionId = state.getOpenSessionId();
            if (openSessionId != null) {
                intent.putExtra("open_gym_session_id", String.valueOf(openSessionId.longValue()));
            }
            intent.addFlags(872415232);
            Unit unit = Unit.INSTANCE;
            final PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            final PendingIntent bindWidgets$restPi = bindWidgets$restPi(context, 1, GymWidgetProvider.ACTION_REST_60);
            final PendingIntent bindWidgets$restPi2 = bindWidgets$restPi(context, 2, GymWidgetProvider.ACTION_REST_90);
            final PendingIntent bindWidgets$restPi3 = bindWidgets$restPi(context, 3, GymWidgetProvider.ACTION_REST_120);
            final String str = context.getString(R.string.gym_widget_brand) + " · v0.7.93";
            for (int i : appWidgetIds) {
                WidgetSafeBinder.INSTANCE.update(context, appWidgetManager, i, R.layout.widget_gym_host, new Function0() { // from class: com.example.rungps.widget.GymWidgetProvider$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        RemoteViews bindWidgets$lambda$6;
                        bindWidgets$lambda$6 = GymWidgetProvider.Companion.bindWidgets$lambda$6(context, str, state, activity, bindWidgets$restPi, bindWidgets$restPi2, bindWidgets$restPi3);
                        return bindWidgets$lambda$6;
                    }
                });
            }
        }

        private static final PendingIntent bindWidgets$restPi(Context context, int i, String str) {
            Intent intent = new Intent(context, (Class<?>) GymWidgetProvider.class);
            intent.setAction(str);
            Unit unit = Unit.INSTANCE;
            return PendingIntent.getBroadcast(context, i, intent, 201326592);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0189, code lost:
        
            if (r6 == null) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final RemoteViews bindWidgets$lambda$6(Context context, String str, WidgetState widgetState, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_gym_host);
            remoteViews.setTextViewText(R.id.widget_brand, str);
            remoteViews.setTextViewText(R.id.widget_title, widgetState.getHeadline());
            remoteViews.setTextViewText(R.id.widget_sub, widgetState.getSub());
            remoteViews.setTextViewText(R.id.widget_cta, context.getString(R.string.gym_widget_open));
            String sessionName = widgetState.getSessionName();
            if (sessionName != null && !StringsKt.isBlank(sessionName) && widgetState.getInProgress()) {
                remoteViews.setViewVisibility(R.id.widget_badge, 0);
                remoteViews.setTextViewText(R.id.widget_badge, widgetState.getSessionName());
            } else if (widgetState.getInProgress()) {
                remoteViews.setViewVisibility(R.id.widget_badge, 0);
                remoteViews.setTextViewText(R.id.widget_badge, context.getString(R.string.gym_widget_badge_active));
            } else {
                remoteViews.setViewVisibility(R.id.widget_badge, 8);
            }
            remoteViews.setViewVisibility(R.id.widget_attendance_block, widgetState.getShowAttendance() ? 0 : 8);
            if (widgetState.getShowAttendance()) {
                remoteViews.setTextViewText(R.id.widget_pct, widgetState.getAttendancePct() + "%");
                remoteViews.setTextViewText(R.id.widget_days_stat, widgetState.getDaysHit() + DomExceptionUtils.SEPARATOR + widgetState.getWindowDays() + " days");
                remoteViews.setProgressBar(R.id.widget_progress, 100, widgetState.getAttendancePct(), false);
                GymWidgetProvider.INSTANCE.bindChip(remoteViews, R.id.widget_streak, widgetState.getStreakDays() > 0 ? widgetState.getStreakDays() + "d streak" : "");
                GymWidgetProvider.INSTANCE.bindChip(remoteViews, R.id.widget_days_left, widgetState.getDaysLeftLabel());
                GymWidgetProvider.INSTANCE.bindChip(remoteViews, R.id.widget_trend, widgetState.getTrendLabel());
            }
            String exerciseName = widgetState.getExerciseName();
            if (exerciseName != null && !StringsKt.isBlank(exerciseName)) {
                remoteViews.setViewVisibility(R.id.widget_exercise, 0);
                remoteViews.setTextViewText(R.id.widget_exercise, widgetState.getExerciseName() + (widgetState.getSetsLeft() > 0 ? " · " + widgetState.getSetsLeft() + " sets left" : ""));
            } else {
                remoteViews.setViewVisibility(R.id.widget_exercise, 8);
            }
            String suggestionLine = widgetState.getSuggestionLine();
            if (suggestionLine != null) {
                if (StringsKt.isBlank(suggestionLine)) {
                    suggestionLine = null;
                }
            }
            suggestionLine = widgetState.getStatusLine();
            String str2 = suggestionLine;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                remoteViews.setViewVisibility(R.id.widget_status, 0);
                remoteViews.setTextViewText(R.id.widget_status, str2);
            } else {
                remoteViews.setViewVisibility(R.id.widget_status, 8);
            }
            int i = widgetState.getShowRestChips() ? 0 : 8;
            remoteViews.setViewVisibility(R.id.widget_rest_row, i);
            remoteViews.setViewVisibility(R.id.widget_rest_60, i);
            remoteViews.setViewVisibility(R.id.widget_rest_90, i);
            remoteViews.setViewVisibility(R.id.widget_rest_120, i);
            remoteViews.setOnClickPendingIntent(R.id.widget_root, pendingIntent);
            remoteViews.setOnClickPendingIntent(R.id.widget_rest_60, pendingIntent2);
            remoteViews.setOnClickPendingIntent(R.id.widget_rest_90, pendingIntent3);
            remoteViews.setOnClickPendingIntent(R.id.widget_rest_120, pendingIntent4);
            return remoteViews;
        }

        private final void bindChip(RemoteViews remoteViews, int i, String str) {
            String str2 = str;
            if (!StringsKt.isBlank(str2)) {
                remoteViews.setViewVisibility(i, 0);
                remoteViews.setTextViewText(i, str2);
            } else {
                remoteViews.setViewVisibility(i, 8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GymWidgetProvider.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b0\b\u0082\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-JÂ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\bHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-¨\u0006F"}, d2 = {"Lcom/example/rungps/widget/GymWidgetProvider$WidgetState;", "", GymWidgetProvider.KEY_HEADLINE, "", GymWidgetProvider.KEY_SUB, "sessionName", "exerciseName", "setsLeft", "", "suggestionLine", "statusLine", "attendancePct", "daysHit", "windowDays", "streakDays", "daysLeftLabel", "trendLabel", "showAttendance", "", "inProgress", "showRestChips", "openSessionId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Long;)V", "getHeadline", "()Ljava/lang/String;", "getSub", "getSessionName", "getExerciseName", "getSetsLeft", "()I", "getSuggestionLine", "getStatusLine", "getAttendancePct", "getDaysHit", "getWindowDays", "getStreakDays", "getDaysLeftLabel", "getTrendLabel", "getShowAttendance", "()Z", "getInProgress", "getShowRestChips", "getOpenSessionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Long;)Lcom/example/rungps/widget/GymWidgetProvider$WidgetState;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class WidgetState {
        private final int attendancePct;
        private final int daysHit;
        private final String daysLeftLabel;
        private final String exerciseName;
        private final String headline;
        private final boolean inProgress;
        private final Long openSessionId;
        private final String sessionName;
        private final int setsLeft;
        private final boolean showAttendance;
        private final boolean showRestChips;
        private final String statusLine;
        private final int streakDays;
        private final String sub;
        private final String suggestionLine;
        private final String trendLabel;
        private final int windowDays;

        /* renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component10, reason: from getter */
        public final int getWindowDays() {
            return this.windowDays;
        }

        /* renamed from: component11, reason: from getter */
        public final int getStreakDays() {
            return this.streakDays;
        }

        /* renamed from: component12, reason: from getter */
        public final String getDaysLeftLabel() {
            return this.daysLeftLabel;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTrendLabel() {
            return this.trendLabel;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShowAttendance() {
            return this.showAttendance;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getInProgress() {
            return this.inProgress;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getShowRestChips() {
            return this.showRestChips;
        }

        /* renamed from: component17, reason: from getter */
        public final Long getOpenSessionId() {
            return this.openSessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSub() {
            return this.sub;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSessionName() {
            return this.sessionName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExerciseName() {
            return this.exerciseName;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSetsLeft() {
            return this.setsLeft;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSuggestionLine() {
            return this.suggestionLine;
        }

        /* renamed from: component7, reason: from getter */
        public final String getStatusLine() {
            return this.statusLine;
        }

        /* renamed from: component8, reason: from getter */
        public final int getAttendancePct() {
            return this.attendancePct;
        }

        /* renamed from: component9, reason: from getter */
        public final int getDaysHit() {
            return this.daysHit;
        }

        public final WidgetState copy(String headline, String sub, String sessionName, String exerciseName, int setsLeft, String suggestionLine, String statusLine, int attendancePct, int daysHit, int windowDays, int streakDays, String daysLeftLabel, String trendLabel, boolean showAttendance, boolean inProgress, boolean showRestChips, Long openSessionId) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(sub, "sub");
            Intrinsics.checkNotNullParameter(daysLeftLabel, "daysLeftLabel");
            Intrinsics.checkNotNullParameter(trendLabel, "trendLabel");
            return new WidgetState(headline, sub, sessionName, exerciseName, setsLeft, suggestionLine, statusLine, attendancePct, daysHit, windowDays, streakDays, daysLeftLabel, trendLabel, showAttendance, inProgress, showRestChips, openSessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetState)) {
                return false;
            }
            WidgetState widgetState = (WidgetState) other;
            return Intrinsics.areEqual(this.headline, widgetState.headline) && Intrinsics.areEqual(this.sub, widgetState.sub) && Intrinsics.areEqual(this.sessionName, widgetState.sessionName) && Intrinsics.areEqual(this.exerciseName, widgetState.exerciseName) && this.setsLeft == widgetState.setsLeft && Intrinsics.areEqual(this.suggestionLine, widgetState.suggestionLine) && Intrinsics.areEqual(this.statusLine, widgetState.statusLine) && this.attendancePct == widgetState.attendancePct && this.daysHit == widgetState.daysHit && this.windowDays == widgetState.windowDays && this.streakDays == widgetState.streakDays && Intrinsics.areEqual(this.daysLeftLabel, widgetState.daysLeftLabel) && Intrinsics.areEqual(this.trendLabel, widgetState.trendLabel) && this.showAttendance == widgetState.showAttendance && this.inProgress == widgetState.inProgress && this.showRestChips == widgetState.showRestChips && Intrinsics.areEqual(this.openSessionId, widgetState.openSessionId);
        }

        public int hashCode() {
            int hashCode = ((this.headline.hashCode() * 31) + this.sub.hashCode()) * 31;
            String str = this.sessionName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.exerciseName;
            int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.setsLeft)) * 31;
            String str3 = this.suggestionLine;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.statusLine;
            int hashCode5 = (((((((((((((((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.attendancePct)) * 31) + Integer.hashCode(this.daysHit)) * 31) + Integer.hashCode(this.windowDays)) * 31) + Integer.hashCode(this.streakDays)) * 31) + this.daysLeftLabel.hashCode()) * 31) + this.trendLabel.hashCode()) * 31) + Boolean.hashCode(this.showAttendance)) * 31) + Boolean.hashCode(this.inProgress)) * 31) + Boolean.hashCode(this.showRestChips)) * 31;
            Long l = this.openSessionId;
            return hashCode5 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            return "WidgetState(headline=" + this.headline + ", sub=" + this.sub + ", sessionName=" + this.sessionName + ", exerciseName=" + this.exerciseName + ", setsLeft=" + this.setsLeft + ", suggestionLine=" + this.suggestionLine + ", statusLine=" + this.statusLine + ", attendancePct=" + this.attendancePct + ", daysHit=" + this.daysHit + ", windowDays=" + this.windowDays + ", streakDays=" + this.streakDays + ", daysLeftLabel=" + this.daysLeftLabel + ", trendLabel=" + this.trendLabel + ", showAttendance=" + this.showAttendance + ", inProgress=" + this.inProgress + ", showRestChips=" + this.showRestChips + ", openSessionId=" + this.openSessionId + ")";
        }

        public WidgetState(String headline, String sub, String str, String str2, int i, String str3, String str4, int i2, int i3, int i4, int i5, String daysLeftLabel, String trendLabel, boolean z, boolean z2, boolean z3, Long l) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(sub, "sub");
            Intrinsics.checkNotNullParameter(daysLeftLabel, "daysLeftLabel");
            Intrinsics.checkNotNullParameter(trendLabel, "trendLabel");
            this.headline = headline;
            this.sub = sub;
            this.sessionName = str;
            this.exerciseName = str2;
            this.setsLeft = i;
            this.suggestionLine = str3;
            this.statusLine = str4;
            this.attendancePct = i2;
            this.daysHit = i3;
            this.windowDays = i4;
            this.streakDays = i5;
            this.daysLeftLabel = daysLeftLabel;
            this.trendLabel = trendLabel;
            this.showAttendance = z;
            this.inProgress = z2;
            this.showRestChips = z3;
            this.openSessionId = l;
        }

        public /* synthetic */ WidgetState(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, int i4, int i5, String str7, String str8, boolean z, boolean z2, boolean z3, Long l, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, i, str5, str6, i2, i3, i4, i5, str7, str8, z, z2, z3, (i6 & 65536) != 0 ? null : l);
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getSub() {
            return this.sub;
        }

        public final String getSessionName() {
            return this.sessionName;
        }

        public final String getExerciseName() {
            return this.exerciseName;
        }

        public final int getSetsLeft() {
            return this.setsLeft;
        }

        public final String getSuggestionLine() {
            return this.suggestionLine;
        }

        public final String getStatusLine() {
            return this.statusLine;
        }

        public final int getAttendancePct() {
            return this.attendancePct;
        }

        public final int getDaysHit() {
            return this.daysHit;
        }

        public final int getWindowDays() {
            return this.windowDays;
        }

        public final int getStreakDays() {
            return this.streakDays;
        }

        public final String getDaysLeftLabel() {
            return this.daysLeftLabel;
        }

        public final String getTrendLabel() {
            return this.trendLabel;
        }

        public final boolean getShowAttendance() {
            return this.showAttendance;
        }

        public final boolean getInProgress() {
            return this.inProgress;
        }

        public final boolean getShowRestChips() {
            return this.showRestChips;
        }

        public final Long getOpenSessionId() {
            return this.openSessionId;
        }
    }
}
