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
import androidx.compose.material3.MenuKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.MainActivity;
import com.example.rungps.R;
import com.example.rungps.recovery.TrainReadiness;
import com.example.rungps.widget.RecoveryWidgetProvider;
import com.example.rungps.widget.WidgetRefreshWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: RecoveryWidgetProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/widget/RecoveryWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "onEnabled", "", "context", "Landroid/content/Context;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onAppWidgetOptionsChanged", "appWidgetId", "", "newOptions", "Landroid/os/Bundle;", "Companion", "WidgetState", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryWidgetProvider extends AppWidgetProvider {
    public static final int $stable = 0;
    private static final String KEY_ADVICE = "advice_line";
    private static final String KEY_LAST_GYM = "last_gym_line";
    private static final String KEY_READINESS = "readiness_label";
    private static final String KEY_READINESS_ORD = "readiness_ord";
    private static final String KEY_RECOVERY = "recovery_line";
    private static final String KEY_RECOVERY_ACTIVE = "recovery_active";
    private static final String PREFS = "recovery_widget";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));

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
            RecoveryWidgetProvider recoveryWidgetProvider = this;
            WidgetMinimalBind.INSTANCE.bindRecovery(context, appWidgetManager, appWidgetIds);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            Log.e("RecoveryWidget", "onUpdate failed", m7908exceptionOrNullimpl);
        }
        BuildersKt__Builders_commonKt.launch$default(scope, Dispatchers.getIO(), null, new RecoveryWidgetProvider$onUpdate$3(context, null), 2, null);
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
            RecoveryWidgetProvider recoveryWidgetProvider = this;
            WidgetMinimalBind.INSTANCE.bindRecovery(context, appWidgetManager, new int[]{appWidgetId});
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
            Log.e("RecoveryWidget", "onAppWidgetOptionsChanged failed", m7908exceptionOrNullimpl);
        }
    }

    /* compiled from: RecoveryWidgetProvider.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002JB\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000fH\u0002J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/example/rungps/widget/RecoveryWidgetProvider$Companion;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "PREFS", "", "KEY_ADVICE", "KEY_READINESS", "KEY_READINESS_ORD", "KEY_RECOVERY", "KEY_LAST_GYM", "KEY_RECOVERY_ACTIVE", "readWidgetState", "Lcom/example/rungps/widget/RecoveryWidgetProvider$WidgetState;", "context", "Landroid/content/Context;", "prefs", "Landroid/content/SharedPreferences;", "updateFromApp", "", "adviceLine", "recoveryLine", "readinessLabel", "readiness", "Lcom/example/rungps/recovery/TrainReadiness;", "lastGymLine", "recoveryActive", "", "requestUpdate", "bindWidgets", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "state", "readinessStyle", "Lkotlin/Pair;", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: RecoveryWidgetProvider.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TrainReadiness.values().length];
                try {
                    iArr[TrainReadiness.Ready.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TrainReadiness.Caution.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TrainReadiness.Rest.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final WidgetState readWidgetState(Context context, SharedPreferences prefs) {
            String str;
            String string = prefs.getString(RecoveryWidgetProvider.KEY_ADVICE, null);
            if (string == null) {
                string = context.getString(R.string.recovery_widget_default_advice);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            String str2 = string;
            String string2 = prefs.getString(RecoveryWidgetProvider.KEY_READINESS, null);
            if (string2 == null) {
                string2 = context.getString(R.string.recovery_widget_default_readiness);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            String str3 = string2;
            TrainReadiness trainReadiness = (TrainReadiness) CollectionsKt.getOrNull(TrainReadiness.getEntries(), prefs.getInt(RecoveryWidgetProvider.KEY_READINESS_ORD, 1));
            if (trainReadiness == null) {
                trainReadiness = TrainReadiness.Caution;
            }
            TrainReadiness trainReadiness2 = trainReadiness;
            String string3 = prefs.getString(RecoveryWidgetProvider.KEY_RECOVERY, null);
            if (string3 == null) {
                str = context.getString(R.string.recovery_widget_default_recovery);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            } else {
                str = string3;
            }
            String string4 = prefs.getString(RecoveryWidgetProvider.KEY_LAST_GYM, null);
            if (string4 == null) {
                string4 = "";
            }
            return new WidgetState(str2, str3, trainReadiness2, str, string4, prefs.getBoolean(RecoveryWidgetProvider.KEY_RECOVERY_ACTIVE, false));
        }

        public final void updateFromApp(Context context, String adviceLine, String recoveryLine, String readinessLabel, TrainReadiness readiness, String lastGymLine, boolean recoveryActive) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adviceLine, "adviceLine");
            Intrinsics.checkNotNullParameter(recoveryLine, "recoveryLine");
            Intrinsics.checkNotNullParameter(readinessLabel, "readinessLabel");
            Intrinsics.checkNotNullParameter(readiness, "readiness");
            Intrinsics.checkNotNullParameter(lastGymLine, "lastGymLine");
            context.getSharedPreferences(RecoveryWidgetProvider.PREFS, 0).edit().putString(RecoveryWidgetProvider.KEY_ADVICE, StringsKt.take(adviceLine, MenuKt.InTransitionDuration)).putString(RecoveryWidgetProvider.KEY_READINESS, StringsKt.take(readinessLabel, 24)).putInt(RecoveryWidgetProvider.KEY_READINESS_ORD, readiness.ordinal()).putString(RecoveryWidgetProvider.KEY_RECOVERY, StringsKt.take(recoveryLine, MenuKt.InTransitionDuration)).putString(RecoveryWidgetProvider.KEY_LAST_GYM, StringsKt.take(lastGymLine, 40)).putBoolean(RecoveryWidgetProvider.KEY_RECOVERY_ACTIVE, recoveryActive).apply();
            requestUpdate(context);
        }

        public final void requestUpdate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) RecoveryWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return;
            }
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(RecoveryWidgetProvider.PREFS, 0);
            Intrinsics.checkNotNull(applicationContext);
            Intrinsics.checkNotNull(appWidgetManager);
            Intrinsics.checkNotNull(sharedPreferences);
            bindWidgets(applicationContext, appWidgetManager, appWidgetIds, readWidgetState(applicationContext, sharedPreferences));
        }

        private final void bindWidgets(final Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds, final WidgetState state) {
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("open_tab", "home");
            intent.setFlags(805306368);
            Unit unit = Unit.INSTANCE;
            final PendingIntent activity = PendingIntent.getActivity(context, 20, intent, 201326592);
            final String str = context.getString(R.string.recovery_widget_brand) + " · v0.7.93";
            Pair<Integer, Integer> readinessStyle = readinessStyle(state.getReadiness());
            final int intValue = readinessStyle.component1().intValue();
            final int intValue2 = readinessStyle.component2().intValue();
            for (int i : appWidgetIds) {
                WidgetSafeBinder.INSTANCE.update(context, appWidgetManager, i, R.layout.widget_recovery_host, new Function0() { // from class: com.example.rungps.widget.RecoveryWidgetProvider$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        RemoteViews bindWidgets$lambda$2;
                        bindWidgets$lambda$2 = RecoveryWidgetProvider.Companion.bindWidgets$lambda$2(context, str, state, intValue, intValue2, activity);
                        return bindWidgets$lambda$2;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RemoteViews bindWidgets$lambda$2(Context context, String str, WidgetState widgetState, int i, int i2, PendingIntent pendingIntent) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_recovery_host);
            remoteViews.setTextViewText(R.id.widget_brand, str);
            remoteViews.setTextViewText(R.id.widget_advice_line, widgetState.getAdviceLine());
            remoteViews.setTextViewText(R.id.widget_readiness_badge, widgetState.getReadinessLabel());
            remoteViews.setInt(R.id.widget_readiness_badge, "setBackgroundResource", i);
            remoteViews.setInt(R.id.widget_readiness_badge, "setTextColor", context.getColor(i2));
            remoteViews.setTextViewText(R.id.widget_recovery_line, widgetState.getRecoveryLine());
            if (widgetState.getRecoveryActive()) {
                remoteViews.setInt(R.id.widget_recovery_line, "setTextColor", context.getColor(R.color.widget_readiness_caution));
            } else {
                remoteViews.setInt(R.id.widget_recovery_line, "setTextColor", context.getColor(R.color.widget_text_secondary));
            }
            if (!StringsKt.isBlank(widgetState.getLastGymLine())) {
                remoteViews.setViewVisibility(R.id.widget_last_gym_line, 0);
                remoteViews.setTextViewText(R.id.widget_last_gym_line, widgetState.getLastGymLine());
            } else {
                remoteViews.setViewVisibility(R.id.widget_last_gym_line, 8);
            }
            remoteViews.setOnClickPendingIntent(R.id.widget_root, pendingIntent);
            remoteViews.setTextViewText(R.id.widget_cta, context.getString(R.string.recovery_widget_open));
            return remoteViews;
        }

        private final Pair<Integer, Integer> readinessStyle(TrainReadiness readiness) {
            int i = WhenMappings.$EnumSwitchMapping$0[readiness.ordinal()];
            if (i == 1) {
                return TuplesKt.to(Integer.valueOf(R.drawable.widget_readiness_badge_ready), Integer.valueOf(R.color.widget_readiness_ready));
            }
            if (i == 2) {
                return TuplesKt.to(Integer.valueOf(R.drawable.widget_readiness_badge_caution), Integer.valueOf(R.color.widget_readiness_caution));
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return TuplesKt.to(Integer.valueOf(R.drawable.widget_readiness_badge_rest), Integer.valueOf(R.color.widget_readiness_rest));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RecoveryWidgetProvider.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/example/rungps/widget/RecoveryWidgetProvider$WidgetState;", "", "adviceLine", "", "readinessLabel", "readiness", "Lcom/example/rungps/recovery/TrainReadiness;", "recoveryLine", "lastGymLine", "recoveryActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/rungps/recovery/TrainReadiness;Ljava/lang/String;Ljava/lang/String;Z)V", "getAdviceLine", "()Ljava/lang/String;", "getReadinessLabel", "getReadiness", "()Lcom/example/rungps/recovery/TrainReadiness;", "getRecoveryLine", "getLastGymLine", "getRecoveryActive", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class WidgetState {
        private final String adviceLine;
        private final String lastGymLine;
        private final TrainReadiness readiness;
        private final String readinessLabel;
        private final boolean recoveryActive;
        private final String recoveryLine;

        public static /* synthetic */ WidgetState copy$default(WidgetState widgetState, String str, String str2, TrainReadiness trainReadiness, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetState.adviceLine;
            }
            if ((i & 2) != 0) {
                str2 = widgetState.readinessLabel;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                trainReadiness = widgetState.readiness;
            }
            TrainReadiness trainReadiness2 = trainReadiness;
            if ((i & 8) != 0) {
                str3 = widgetState.recoveryLine;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = widgetState.lastGymLine;
            }
            String str7 = str4;
            if ((i & 32) != 0) {
                z = widgetState.recoveryActive;
            }
            return widgetState.copy(str, str5, trainReadiness2, str6, str7, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdviceLine() {
            return this.adviceLine;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReadinessLabel() {
            return this.readinessLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final TrainReadiness getReadiness() {
            return this.readiness;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRecoveryLine() {
            return this.recoveryLine;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLastGymLine() {
            return this.lastGymLine;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getRecoveryActive() {
            return this.recoveryActive;
        }

        public final WidgetState copy(String adviceLine, String readinessLabel, TrainReadiness readiness, String recoveryLine, String lastGymLine, boolean recoveryActive) {
            Intrinsics.checkNotNullParameter(adviceLine, "adviceLine");
            Intrinsics.checkNotNullParameter(readinessLabel, "readinessLabel");
            Intrinsics.checkNotNullParameter(readiness, "readiness");
            Intrinsics.checkNotNullParameter(recoveryLine, "recoveryLine");
            Intrinsics.checkNotNullParameter(lastGymLine, "lastGymLine");
            return new WidgetState(adviceLine, readinessLabel, readiness, recoveryLine, lastGymLine, recoveryActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetState)) {
                return false;
            }
            WidgetState widgetState = (WidgetState) other;
            return Intrinsics.areEqual(this.adviceLine, widgetState.adviceLine) && Intrinsics.areEqual(this.readinessLabel, widgetState.readinessLabel) && this.readiness == widgetState.readiness && Intrinsics.areEqual(this.recoveryLine, widgetState.recoveryLine) && Intrinsics.areEqual(this.lastGymLine, widgetState.lastGymLine) && this.recoveryActive == widgetState.recoveryActive;
        }

        public int hashCode() {
            return (((((((((this.adviceLine.hashCode() * 31) + this.readinessLabel.hashCode()) * 31) + this.readiness.hashCode()) * 31) + this.recoveryLine.hashCode()) * 31) + this.lastGymLine.hashCode()) * 31) + Boolean.hashCode(this.recoveryActive);
        }

        public String toString() {
            return "WidgetState(adviceLine=" + this.adviceLine + ", readinessLabel=" + this.readinessLabel + ", readiness=" + this.readiness + ", recoveryLine=" + this.recoveryLine + ", lastGymLine=" + this.lastGymLine + ", recoveryActive=" + this.recoveryActive + ")";
        }

        public WidgetState(String adviceLine, String readinessLabel, TrainReadiness readiness, String recoveryLine, String lastGymLine, boolean z) {
            Intrinsics.checkNotNullParameter(adviceLine, "adviceLine");
            Intrinsics.checkNotNullParameter(readinessLabel, "readinessLabel");
            Intrinsics.checkNotNullParameter(readiness, "readiness");
            Intrinsics.checkNotNullParameter(recoveryLine, "recoveryLine");
            Intrinsics.checkNotNullParameter(lastGymLine, "lastGymLine");
            this.adviceLine = adviceLine;
            this.readinessLabel = readinessLabel;
            this.readiness = readiness;
            this.recoveryLine = recoveryLine;
            this.lastGymLine = lastGymLine;
            this.recoveryActive = z;
        }

        public final String getAdviceLine() {
            return this.adviceLine;
        }

        public final String getReadinessLabel() {
            return this.readinessLabel;
        }

        public final TrainReadiness getReadiness() {
            return this.readiness;
        }

        public final String getRecoveryLine() {
            return this.recoveryLine;
        }

        public final String getLastGymLine() {
            return this.lastGymLine;
        }

        public final boolean getRecoveryActive() {
            return this.recoveryActive;
        }
    }
}
