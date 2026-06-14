package com.example.rungps.nfc;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import com.example.rungps.notify.AppNotifications;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GymNfcConfig.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010#J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u001e\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"J\u0016\u0010*\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0014J\u000e\u0010,\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010-\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u00100\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u000e\u00102\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u00103\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u00104\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0005J\u000e\u00105\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u00108\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u00109\u001a\u0004\u0018\u00010\u0005J\"\u0010:\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020.2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005J\u001e\u0010=\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"J\u001c\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010?2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010@\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010A\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010B\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010C\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010D\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020.J\u000e\u0010F\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010G\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/example/rungps/nfc/GymNfcConfig;", "", "<init>", "()V", "PREFS", "", "KEY_GYM_LAT", "KEY_GYM_LON", "KEY_GYM_RADIUS_M", "KEY_TAG_UID", "KEY_REGISTERING", "KEY_REGISTERING_NAME", "KEY_LAST_CARD_NAME", "KEY_LAST_LAT", "KEY_LAST_LON", "KEY_LAST_LOC_MS", "KEY_LAST_TAG_MS", "KEY_AUTO_START_AT_GYM", "KEY_SAVER_POLL_MS", "DEFAULT_RADIUS_M", "", "DEFAULT_SAVER_POLL_MS", "", "MIN_SAVER_POLL_MS", "MAX_SAVER_POLL_MS", "LOCATION_MAX_AGE_MS", "TAG_DEBOUNCE_MS", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "gymLat", "", "(Landroid/content/Context;)Ljava/lang/Double;", "gymLon", "gymRadiusM", "setGymLocation", "", "lat", "lon", "setGymRadiusM", "radiusM", "clearGymLocation", "hasGymLocation", "", "registeredTagUid", "setRegisteredTagUid", "uid", "clearRegisteredTag", "hasRegisteredTag", "matchesRegisteredUid", "isRegistering", "registeringCardName", "lastMatchedCardName", "setLastMatchedCardName", HintConstants.AUTOFILL_HINT_NAME, "setRegistering", "registering", "cardName", "updateLastLocation", "lastLocation", "Lkotlin/Pair;", "wouldAcceptTagScan", "acceptTagScan", "isCheckInReady", "autoStartAtGymOnly", "setAutoStartAtGymOnly", "enabled", "saverPollIntervalMs", "setSaverPollIntervalMs", "ms", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcConfig {
    public static final int $stable = 0;
    public static final float DEFAULT_RADIUS_M = 150.0f;
    public static final long DEFAULT_SAVER_POLL_MS = 120000;
    public static final GymNfcConfig INSTANCE = new GymNfcConfig();
    private static final String KEY_AUTO_START_AT_GYM = "auto_start_at_gym";
    private static final String KEY_GYM_LAT = "gym_lat";
    private static final String KEY_GYM_LON = "gym_lon";
    private static final String KEY_GYM_RADIUS_M = "gym_radius_m";
    private static final String KEY_LAST_CARD_NAME = "last_matched_card_name";
    private static final String KEY_LAST_LAT = "last_lat";
    private static final String KEY_LAST_LOC_MS = "last_loc_ms";
    private static final String KEY_LAST_LON = "last_lon";
    private static final String KEY_LAST_TAG_MS = "last_tag_ms";
    private static final String KEY_REGISTERING = "registering_tag";
    private static final String KEY_REGISTERING_NAME = "registering_card_name";
    private static final String KEY_SAVER_POLL_MS = "saver_poll_ms";
    private static final String KEY_TAG_UID = "registered_tag_uid";
    private static final long LOCATION_MAX_AGE_MS = 1200000;
    public static final long MAX_SAVER_POLL_MS = 300000;
    public static final long MIN_SAVER_POLL_MS = 60000;
    private static final String PREFS = "gym_nfc";
    private static final long TAG_DEBOUNCE_MS = 1500;

    private GymNfcConfig() {
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences("gym_nfc", 0);
    }

    public final Double gymLat(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f = prefs(context).getFloat(KEY_GYM_LAT, Float.NaN);
        if (Float.isNaN(f)) {
            return null;
        }
        return Double.valueOf(f);
    }

    public final Double gymLon(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float f = prefs(context).getFloat(KEY_GYM_LON, Float.NaN);
        if (Float.isNaN(f)) {
            return null;
        }
        return Double.valueOf(f);
    }

    public final float gymRadiusM(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getFloat(KEY_GYM_RADIUS_M, 150.0f), 50.0f, 500.0f);
    }

    public final void setGymLocation(Context context, double lat, double lon) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_GYM_LAT, (float) lat).putFloat(KEY_GYM_LON, (float) lon).apply();
    }

    public final void setGymRadiusM(Context context, float radiusM) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_GYM_RADIUS_M, RangesKt.coerceIn(radiusM, 50.0f, 500.0f)).apply();
    }

    public final void clearGymLocation(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().remove(KEY_GYM_LAT).remove(KEY_GYM_LON).apply();
    }

    public final boolean hasGymLocation(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GymLocationStore.INSTANCE.hasAny(context) || !(gymLat(context) == null || gymLon(context) == null);
    }

    public final String registeredTagUid(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RegisteredGymCard registeredGymCard = (RegisteredGymCard) CollectionsKt.firstOrNull((List) GymCardStore.INSTANCE.all(context));
        if (registeredGymCard != null) {
            return registeredGymCard.getUid();
        }
        return null;
    }

    public final void setRegisteredTagUid(Context context, String uid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        if (GymCardStore.INSTANCE.findByUid(context, uid) == null) {
            GymCardStore.add$default(GymCardStore.INSTANCE, context, uid, "Gym card", null, 8, null);
        }
    }

    public final void clearRegisteredTag(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = GymCardStore.INSTANCE.all(context).iterator();
        while (it.hasNext()) {
            GymCardStore.INSTANCE.remove(context, ((RegisteredGymCard) it.next()).getId());
        }
        prefs(context).edit().remove(KEY_TAG_UID).apply();
    }

    public final boolean hasRegisteredTag(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GymCardStore.INSTANCE.hasAny(context);
    }

    public final boolean matchesRegisteredUid(Context context, String uid) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uid, "uid");
        return GymCardStore.INSTANCE.findByUid(context, uid) != null;
    }

    public final boolean isRegistering(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean(KEY_REGISTERING, false);
    }

    public final String registeringCardName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = prefs(context).getString(KEY_REGISTERING_NAME, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final String lastMatchedCardName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = prefs(context).getString(KEY_LAST_CARD_NAME, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final void setLastMatchedCardName(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor edit = prefs(context).edit();
        String str = name;
        if (str == null || StringsKt.isBlank(str)) {
            edit.remove(KEY_LAST_CARD_NAME);
        } else {
            edit.putString(KEY_LAST_CARD_NAME, StringsKt.take(StringsKt.trim((CharSequence) str).toString(), 40));
        }
        edit.apply();
    }

    public static /* synthetic */ void setRegistering$default(GymNfcConfig gymNfcConfig, Context context, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        gymNfcConfig.setRegistering(context, z, str);
    }

    public final void setRegistering(Context context, boolean registering, String cardName) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor putBoolean = prefs(context).edit().putBoolean(KEY_REGISTERING, registering);
        if (registering && (str = cardName) != null && !StringsKt.isBlank(str)) {
            putBoolean.putString(KEY_REGISTERING_NAME, StringsKt.take(StringsKt.trim((CharSequence) str).toString(), 40));
        } else if (!registering) {
            putBoolean.remove(KEY_REGISTERING_NAME);
        }
        putBoolean.apply();
    }

    public final void updateLastLocation(Context context, double lat, double lon) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putFloat(KEY_LAST_LAT, (float) lat).putFloat(KEY_LAST_LON, (float) lon).putLong(KEY_LAST_LOC_MS, System.currentTimeMillis()).apply();
    }

    public final Pair<Double, Double> lastLocation(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = prefs(context);
        float f = prefs.getFloat(KEY_LAST_LAT, Float.NaN);
        float f2 = prefs.getFloat(KEY_LAST_LON, Float.NaN);
        long j = prefs.getLong(KEY_LAST_LOC_MS, 0L);
        if (Float.isNaN(f) || Float.isNaN(f2) || j == 0 || System.currentTimeMillis() - j > 1200000) {
            return null;
        }
        return TuplesKt.to(Double.valueOf(f), Double.valueOf(f2));
    }

    public final boolean wouldAcceptTagScan(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return System.currentTimeMillis() - prefs(context).getLong(KEY_LAST_TAG_MS, 0L) >= 1500;
    }

    public final boolean acceptTagScan(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!wouldAcceptTagScan(context)) {
            return false;
        }
        prefs(context).edit().putLong(KEY_LAST_TAG_MS, System.currentTimeMillis()).apply();
        AppNotifications.INSTANCE.clearDismissState(context);
        return true;
    }

    public final boolean isCheckInReady(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return hasRegisteredTag(context) && hasGymLocation(context);
    }

    public final boolean autoStartAtGymOnly(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return prefs(context).getBoolean(KEY_AUTO_START_AT_GYM, false);
    }

    public final void setAutoStartAtGymOnly(Context context, boolean enabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putBoolean(KEY_AUTO_START_AT_GYM, enabled).apply();
    }

    public final long saverPollIntervalMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceIn(prefs(context).getLong(KEY_SAVER_POLL_MS, DEFAULT_SAVER_POLL_MS), 60000L, 300000L);
    }

    public final void setSaverPollIntervalMs(Context context, long ms) {
        Intrinsics.checkNotNullParameter(context, "context");
        prefs(context).edit().putLong(KEY_SAVER_POLL_MS, RangesKt.coerceIn(ms, 60000L, 300000L)).apply();
    }
}
