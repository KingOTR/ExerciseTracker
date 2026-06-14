package com.example.rungps.ui.shell;

import com.example.rungps.nfc.GymNfcController;
import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u0017H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/ui/shell/AppScreenHost;", "", "themeMode", "", "getThemeMode", "()Ljava/lang/String;", "setThemeMode", "(Ljava/lang/String;)V", TrackingService.EXTRA_PLAN_TYPE, "getPlanType", "gpsActivityType", "getGpsActivityType", "runPreset", "getRunPreset", "gymNfc", "Lcom/example/rungps/nfc/GymNfcController;", "getGymNfc", "()Lcom/example/rungps/nfc/GymNfcController;", "onboardingRuntimeStatusLine", "getOnboardingRuntimeStatusLine", "onboardingHealthStatusLine", "getOnboardingHealthStatusLine", "finish", "", "requestOnboardingRuntimePermissions", "requestOnboardingHealthConnect", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AppScreenHost {
    void finish();

    String getGpsActivityType();

    GymNfcController getGymNfc();

    String getOnboardingHealthStatusLine();

    String getOnboardingRuntimeStatusLine();

    String getPlanType();

    String getRunPreset();

    String getThemeMode();

    void requestOnboardingHealthConnect();

    void requestOnboardingRuntimePermissions();

    void setThemeMode(String str);
}
