package com.example.rungps;

import com.example.rungps.sleep.SleepEntryValidator;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"formatSyncAgo", "", "ms", "", "formatDurationMinutes", "totalMin", "", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityKt {
    private static final String formatSyncAgo(long j) {
        long coerceAtLeast = RangesKt.coerceAtLeast((System.currentTimeMillis() - j) / 60000, 0L);
        if (coerceAtLeast < 1) {
            return "just now";
        }
        if (coerceAtLeast < 60) {
            return coerceAtLeast + "m ago";
        }
        if (coerceAtLeast < 1440) {
            return (coerceAtLeast / 60) + "h ago";
        }
        return (coerceAtLeast / SleepEntryValidator.MAX_SLEEP_MIN) + "d ago";
    }

    private static final String formatDurationMinutes(int i) {
        if (i <= 0) {
            return "0m";
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 <= 0) {
            return i3 + "m";
        }
        if (i3 != 0) {
            return i2 + "h " + i3 + "m";
        }
        return i2 + "h";
    }
}
