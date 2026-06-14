package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepMlFeedback.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/sleep/SleepMlFeedback;", "", "<init>", "()V", "PREFS", "", "KEY_AWAKE_BIAS", "KEY_DEEP_BIAS", "KEY_CONF", "confidenceThreshold", "", "context", "Landroid/content/Context;", "awakeLogitBias", "deepLogitBias", "recordTooMuchAwake", "", "recordTooMuchDeep", "recordLooksRight", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMlFeedback {
    public static final int $stable = 0;
    public static final SleepMlFeedback INSTANCE = new SleepMlFeedback();
    private static final String KEY_AWAKE_BIAS = "awake_bias";
    private static final String KEY_CONF = "conf_threshold";
    private static final String KEY_DEEP_BIAS = "deep_bias";
    private static final String PREFS = "sleep_ml_feedback";

    private SleepMlFeedback() {
    }

    public final float confidenceThreshold(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_CONF, 0.52f), 0.42f, 0.65f);
    }

    public final float awakeLogitBias(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_AWAKE_BIAS, 0.0f), -0.4f, 0.4f);
    }

    public final float deepLogitBias(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_DEEP_BIAS, 0.0f), -0.4f, 0.4f);
    }

    public final void recordTooMuchAwake(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_AWAKE_BIAS, awakeLogitBias(context) + 0.08f).putFloat(KEY_CONF, RangesKt.coerceAtMost(confidenceThreshold(context) + 0.02f, 0.62f)).apply();
    }

    public final void recordTooMuchDeep(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_DEEP_BIAS, deepLogitBias(context) - 0.08f).putFloat(KEY_CONF, RangesKt.coerceAtLeast(confidenceThreshold(context) - 0.02f, 0.44f)).apply();
    }

    public final void recordLooksRight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_CONF, RangesKt.coerceAtLeast(confidenceThreshold(context) - 0.01f, 0.48f)).apply();
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }
}
