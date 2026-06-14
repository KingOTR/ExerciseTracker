package com.example.rungps.ui.onboarding;

import android.content.Context;
import com.example.rungps.util.SecureSettingsStore;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FriendInstallSanitizer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/ui/onboarding/FriendInstallSanitizer;", "", "<init>", "()V", "prepareFreshInstall", "", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FriendInstallSanitizer {
    public static final int $stable = 0;
    public static final FriendInstallSanitizer INSTANCE = new FriendInstallSanitizer();

    private FriendInstallSanitizer() {
    }

    public final void prepareFreshInstall(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (OnboardingPrefs.INSTANCE.isDone(context)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            FriendInstallSanitizer friendInstallSanitizer = this;
            FirebaseAuth.getInstance().signOut();
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        SecureSettingsStore.INSTANCE.clearStravaTokens(context);
        context.getSharedPreferences("settings", 0).edit().remove("stravaClientId").remove("stravaClientSecret").remove("strava_last_upload_ms").remove("strava_last_upload_status").remove("profileSetupComplete").remove("profileSetupSkipped").remove("profileDisplayName").remove("profileAgeYears").remove("profileHeightCm").remove("profileWeightKg").remove("profileSex").apply();
        context.getSharedPreferences("cloud_sync", 0).edit().clear().apply();
        context.getSharedPreferences("public_share", 0).edit().clear().apply();
        context.getSharedPreferences("gym_nfc", 0).edit().clear().apply();
    }
}
