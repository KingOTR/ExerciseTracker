package com.example.rungps.gym;

import android.content.Context;
import com.example.rungps.data.AppPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymPreferences.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/gym/GymPreferences;", "", "<init>", "()V", "CARRYOVER_MODE_ANY_NEXT", "", "CARRYOVER_MODE_SAME_DAY", "carryoverMode", "ctx", "Landroid/content/Context;", "setCarryoverMode", "", "mode", "volumeHeatmapDays", "", "setVolumeHeatmapDays", "days", "showPulleyChooser", "", "setShowPulleyChooser", "show", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymPreferences {
    public static final int $stable = 0;
    public static final String CARRYOVER_MODE_ANY_NEXT = "any_next";
    public static final String CARRYOVER_MODE_SAME_DAY = "same_day";
    public static final GymPreferences INSTANCE = new GymPreferences();

    private GymPreferences() {
    }

    public final String carryoverMode(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return AppPreferences.INSTANCE.carryoverModeBlocking(ctx);
    }

    public final void setCarryoverMode(Context ctx, String mode) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(mode, "mode");
        AppPreferences.INSTANCE.setCarryoverModeBlocking(ctx, mode);
    }

    public final int volumeHeatmapDays(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return AppPreferences.INSTANCE.volumeHeatmapDaysBlocking(ctx);
    }

    public final void setVolumeHeatmapDays(Context ctx, int days) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        AppPreferences.INSTANCE.setVolumeHeatmapDaysBlocking(ctx, days);
    }

    public final boolean showPulleyChooser(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return AppPreferences.INSTANCE.showPulleyChooserBlocking(ctx);
    }

    public final void setShowPulleyChooser(Context ctx, boolean show) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        AppPreferences.INSTANCE.setShowPulleyChooserBlocking(ctx, show);
    }
}
