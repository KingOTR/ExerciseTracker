package com.example.rungps.tracking;

import android.content.Context;
import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackingActiveStore.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0005J&\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/tracking/TrackingActiveStore;", "", "<init>", "()V", "PREFS", "", "KEY_ACTIVE", "KEY_RUN_ID", "KEY_STARTED_AT", "KEY_DISTANCE_M", "KEY_ACTIVITY_TYPE", "KEY_PAUSED", "markActive", "", "context", "Landroid/content/Context;", "runId", "", "startedAtMs", TrackingService.EXTRA_ACTIVITY_TYPE, "updateLiveStats", "distanceM", "", TrackingActiveStore.KEY_PAUSED, "", CervicalMucusRecord.Appearance.CLEAR, "isActive", "(Landroid/content/Context;)Ljava/lang/Long;", "liveDistanceM", "liveActivityType", "isPaused", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingActiveStore {
    public static final int $stable = 0;
    public static final TrackingActiveStore INSTANCE = new TrackingActiveStore();
    private static final String KEY_ACTIVE = "active";
    private static final String KEY_ACTIVITY_TYPE = "activity_type";
    private static final String KEY_DISTANCE_M = "distance_m";
    private static final String KEY_PAUSED = "paused";
    private static final String KEY_RUN_ID = "run_id";
    private static final String KEY_STARTED_AT = "started_at_ms";
    private static final String PREFS = "tracking_active";

    private TrackingActiveStore() {
    }

    public static /* synthetic */ void markActive$default(TrackingActiveStore trackingActiveStore, Context context, long j, long j2, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "RUN";
        }
        trackingActiveStore.markActive(context, j, j2, str);
    }

    public final void markActive(Context context, long runId, long startedAtMs, String activityType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_ACTIVE, true).putLong(KEY_RUN_ID, runId).putLong(KEY_STARTED_AT, startedAtMs).putFloat(KEY_DISTANCE_M, 0.0f).putString(KEY_ACTIVITY_TYPE, activityType).putBoolean(KEY_PAUSED, false).commit();
    }

    public final void updateLiveStats(Context context, double distanceM, String activityType, boolean paused) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        if (isActive(context)) {
            context.getSharedPreferences(PREFS, 0).edit().putFloat(KEY_DISTANCE_M, (float) distanceM).putString(KEY_ACTIVITY_TYPE, activityType).putBoolean(KEY_PAUSED, paused).apply();
        }
    }

    public final void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().clear().commit();
    }

    public final boolean isActive(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_ACTIVE, false);
    }

    public final Long runId(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long valueOf = Long.valueOf(context.getSharedPreferences(PREFS, 0).getLong(KEY_RUN_ID, 0L));
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public final long startedAtMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getLong(KEY_STARTED_AT, 0L);
    }

    public final double liveDistanceM(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getFloat(KEY_DISTANCE_M, 0.0f);
    }

    public final String liveActivityType(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_ACTIVITY_TYPE, "RUN");
        return string == null ? "RUN" : string;
    }

    public final boolean isPaused(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_PAUSED, false);
    }
}
