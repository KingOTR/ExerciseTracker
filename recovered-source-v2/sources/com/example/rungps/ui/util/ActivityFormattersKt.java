package com.example.rungps.ui.util;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: ActivityFormatters.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"formatElapsedMs", "", "ms", "", "formatPaceSecPerKm", "secondsPerKm", "", "formatSpeedKmh", "kmh", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityFormattersKt {
    public static final String formatElapsedMs(long j) {
        long coerceAtLeast = RangesKt.coerceAtLeast(j / 1000, 0L);
        long j2 = 3600;
        long j3 = coerceAtLeast / j2;
        long j4 = 60;
        long j5 = (coerceAtLeast % j2) / j4;
        long j6 = coerceAtLeast % j4;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String formatPaceSecPerKm(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return "—";
        }
        int coerceAtLeast = RangesKt.coerceAtLeast((int) d, 1);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(coerceAtLeast / 60), Integer.valueOf(coerceAtLeast % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String formatSpeedKmh(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return "—";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f km/h", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
