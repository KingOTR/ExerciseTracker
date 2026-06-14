package com.example.rungps.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.tracking.TrackingService;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UserProfileStore.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/data/UserProfileStore;", "", "<init>", "()V", "PREFS", "", "KEY_SETUP", "KEY_SKIPPED", "KEY_NAME", "KEY_AGE", "KEY_DOB_EPOCH_DAY", "KEY_HEIGHT", "KEY_WEIGHT", "KEY_SEX", "SEX_UNSPECIFIED", "SEX_MALE", "SEX_FEMALE", "SEX_OTHER", "load", "Lcom/example/rungps/data/UserProfile;", "context", "Landroid/content/Context;", TrackingService.BATTERY_SAVE, "", Scopes.PROFILE, "markSkipped", "hasCompletedSetup", "", "wasSkipped", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserProfileStore {
    public static final int $stable = 0;
    public static final UserProfileStore INSTANCE = new UserProfileStore();
    private static final String KEY_AGE = "profileAgeYears";
    private static final String KEY_DOB_EPOCH_DAY = "profileDobEpochDay";
    private static final String KEY_HEIGHT = "profileHeightCm";
    private static final String KEY_NAME = "profileDisplayName";
    private static final String KEY_SETUP = "profileSetupComplete";
    private static final String KEY_SEX = "profileSex";
    private static final String KEY_SKIPPED = "profileSetupSkipped";
    private static final String KEY_WEIGHT = "profileWeightKg";
    private static final String PREFS = "settings";
    public static final String SEX_FEMALE = "FEMALE";
    public static final String SEX_MALE = "MALE";
    public static final String SEX_OTHER = "OTHER";
    public static final String SEX_UNSPECIFIED = "UNSPECIFIED";

    private UserProfileStore() {
    }

    public final UserProfile load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        Integer valueOf = Integer.valueOf(sharedPreferences.getInt(KEY_AGE, -1));
        Integer num = valueOf.intValue() > 0 ? valueOf : null;
        Long valueOf2 = Long.valueOf(sharedPreferences.getLong(KEY_DOB_EPOCH_DAY, Long.MIN_VALUE));
        Long l = valueOf2.longValue() > Long.MIN_VALUE ? valueOf2 : null;
        Integer valueOf3 = Integer.valueOf(sharedPreferences.getInt(KEY_HEIGHT, -1));
        Integer num2 = valueOf3.intValue() > 0 ? valueOf3 : null;
        Double valueOf4 = Double.valueOf(sharedPreferences.getFloat(KEY_WEIGHT, -1.0f));
        Double d = valueOf4.doubleValue() > 0.0d ? valueOf4 : null;
        String string = sharedPreferences.getString(KEY_NAME, "");
        String str = string == null ? "" : string;
        String string2 = sharedPreferences.getString(KEY_SEX, SEX_UNSPECIFIED);
        return new UserProfile(str, num, l, num2, d, string2 == null ? SEX_UNSPECIFIED : string2);
    }

    public final void save(Context context, UserProfile profile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(profile, "profile");
        SharedPreferences.Editor putString = context.getSharedPreferences(PREFS, 0).edit().putString(KEY_NAME, StringsKt.trim((CharSequence) profile.getDisplayName()).toString());
        Integer ageYears = profile.getAgeYears();
        SharedPreferences.Editor putInt = putString.putInt(KEY_AGE, ageYears != null ? ageYears.intValue() : -1);
        Long dobEpochDay = profile.getDobEpochDay();
        SharedPreferences.Editor putLong = putInt.putLong(KEY_DOB_EPOCH_DAY, dobEpochDay != null ? dobEpochDay.longValue() : Long.MIN_VALUE);
        Integer heightCm = profile.getHeightCm();
        SharedPreferences.Editor putInt2 = putLong.putInt(KEY_HEIGHT, heightCm != null ? heightCm.intValue() : -1);
        Double weightKg = profile.getWeightKg();
        putInt2.putFloat(KEY_WEIGHT, weightKg != null ? (float) weightKg.doubleValue() : -1.0f).putString(KEY_SEX, profile.getSex()).putBoolean(KEY_SETUP, profile.getHasCoreStats()).putBoolean(KEY_SKIPPED, false).apply();
    }

    public final void markSkipped(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_SKIPPED, true).apply();
    }

    public final boolean hasCompletedSetup(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SETUP, false) || load(context).getHasCoreStats();
    }

    public final boolean wasSkipped(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_SKIPPED, false);
    }
}
