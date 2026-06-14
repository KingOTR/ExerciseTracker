package com.example.rungps.gym;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.notify.RestTimerScheduler;
import com.example.rungps.widget.GymWidgetUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymRestTimerStore.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/gym/GymRestTimerStore;", "", "<init>", "()V", "PREFS", "", "KEY_REST_ENDS_AT", "restEndsAtMs", "", "context", "Landroid/content/Context;", "pruneStaleIfExpired", "", "startRest", "durationSec", "", "clearRest", "onRestFinished", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymRestTimerStore {
    public static final int $stable = 0;
    public static final GymRestTimerStore INSTANCE = new GymRestTimerStore();
    private static final String KEY_REST_ENDS_AT = "rest_ends_at";
    private static final String PREFS = "gym_train";

    private GymRestTimerStore() {
    }

    public final long restEndsAtMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        long j = sharedPreferences.getLong(KEY_REST_ENDS_AT, 0L);
        if (j <= 0 || j > System.currentTimeMillis()) {
            return j;
        }
        sharedPreferences.edit().remove(KEY_REST_ENDS_AT).apply();
        return 0L;
    }

    public final void pruneStaleIfExpired(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        long j = sharedPreferences.getLong(KEY_REST_ENDS_AT, 0L);
        if (j <= 0 || j > System.currentTimeMillis()) {
            return;
        }
        sharedPreferences.edit().remove(KEY_REST_ENDS_AT).apply();
        RestTimerScheduler.INSTANCE.cancel(context);
        GymWidgetUpdater.INSTANCE.cancelRestRefresh(context);
    }

    public final void startRest(Context context, int durationSec) {
        Intrinsics.checkNotNullParameter(context, "context");
        long currentTimeMillis = System.currentTimeMillis() + (durationSec * 1000);
        context.getSharedPreferences(PREFS, 0).edit().putLong(KEY_REST_ENDS_AT, currentTimeMillis).apply();
        RestTimerScheduler.INSTANCE.schedule(context, currentTimeMillis);
        GymWidgetUpdater.INSTANCE.refreshAsync(context);
    }

    public final void clearRest(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_REST_ENDS_AT).apply();
        RestTimerScheduler.INSTANCE.cancel(context);
        GymWidgetUpdater.INSTANCE.cancelRestRefresh(context);
        GymWidgetUpdater.INSTANCE.refreshAsync(context);
    }

    public final void onRestFinished(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        clearRest(context);
    }
}
