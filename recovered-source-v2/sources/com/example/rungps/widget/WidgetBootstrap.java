package com.example.rungps.widget;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.R;
import com.example.rungps.gym.GymRestTimerStore;
import com.example.rungps.recovery.TrainReadiness;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: WidgetBootstrap.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/widget/WidgetBootstrap;", "", "<init>", "()V", "SCHEMA_VERSION", "", "PREFS", "", "KEY_SCHEMA", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onApplicationStart", "", "context", "Landroid/content/Context;", "onWidgetEnabled", "refreshAllAsync", "forceRebind", "", "refreshRecoveryDefaults", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetBootstrap {
    private static final String KEY_SCHEMA = "schema";
    private static final String PREFS = "widget_bootstrap";
    public static final int SCHEMA_VERSION = 15;
    public static final WidgetBootstrap INSTANCE = new WidgetBootstrap();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    public static final int $stable = 8;

    private WidgetBootstrap() {
    }

    public final void onApplicationStart(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(PREFS, 0);
        boolean z = sharedPreferences.getInt(KEY_SCHEMA, 0) < 15;
        if (z) {
            sharedPreferences.edit().putInt(KEY_SCHEMA, 15).apply();
            GymRestTimerStore gymRestTimerStore = GymRestTimerStore.INSTANCE;
            Intrinsics.checkNotNull(applicationContext);
            gymRestTimerStore.pruneStaleIfExpired(applicationContext);
        }
        Intrinsics.checkNotNull(applicationContext);
        refreshAllAsync(applicationContext, z);
    }

    public final void onWidgetEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        refreshAllAsync(applicationContext, true);
    }

    public static /* synthetic */ void refreshAllAsync$default(WidgetBootstrap widgetBootstrap, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        widgetBootstrap.refreshAllAsync(context, z);
    }

    public final void refreshAllAsync(Context context, boolean forceRebind) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(scope, Dispatchers.getIO(), null, new WidgetBootstrap$refreshAllAsync$1(context.getApplicationContext(), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshRecoveryDefaults(Context context) {
        String string = context.getString(R.string.recovery_widget_default_advice);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.recovery_widget_default_readiness);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(R.string.recovery_widget_default_recovery);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        RecoveryWidgetProvider.INSTANCE.updateFromApp(context, string, string3, string2, TrainReadiness.Caution, (r17 & 32) != 0 ? "" : null, (r17 & 64) != 0 ? false : false);
    }
}
