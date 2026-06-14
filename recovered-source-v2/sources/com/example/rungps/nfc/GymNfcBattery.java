package com.example.rungps.nfc;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymNfcBattery.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/nfc/GymNfcBattery;", "", "<init>", "()V", "SAVER_LISTEN_WINDOW_MS", "", "isPowerSave", "", "context", "Landroid/content/Context;", "saverPollIntervalMs", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcBattery {
    public static final int $stable = 0;
    public static final GymNfcBattery INSTANCE = new GymNfcBattery();
    public static final long SAVER_LISTEN_WINDOW_MS = 5000;

    private GymNfcBattery() {
    }

    public final boolean isPowerSave(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        return powerManager != null && powerManager.isPowerSaveMode();
    }

    public final long saverPollIntervalMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return GymNfcConfig.INSTANCE.saverPollIntervalMs(context);
    }
}
