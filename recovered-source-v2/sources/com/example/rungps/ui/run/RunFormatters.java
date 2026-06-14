package com.example.rungps.ui.run;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RunFormatters.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/ui/run/RunFormatters;", "", "<init>", "()V", "formatElapsed", "", "ms", "", "formatPace", "secondsPerKm", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunFormatters {
    public static final int $stable = 0;
    public static final RunFormatters INSTANCE = new RunFormatters();

    private RunFormatters() {
    }

    public final String formatElapsed(long ms) {
        long coerceAtLeast = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 3600;
        long j2 = 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(coerceAtLeast / j), Long.valueOf((coerceAtLeast % j) / j2), Long.valueOf(coerceAtLeast % j2)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String formatPace(double secondsPerKm) {
        int roundToInt = MathKt.roundToInt(RangesKt.coerceAtLeast(secondsPerKm, 0.0d));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(roundToInt / 60), Integer.valueOf(roundToInt % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
