package com.example.rungps.ui.main;

import android.location.Location;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.sleep.SleepEntryValidator;
import com.example.rungps.ui.util.ActivityFormattersKt;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.osmdroid.util.GeoPoint;

/* compiled from: MainActivityFormatters.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¨\u0006\u0015"}, d2 = {"formatSyncAgo", "", "ms", "", "formatElapsed", "formatPace", "secondsPerKm", "", "formatStravaDuration", "totalSec", "suggestRecovery", "distanceM", "durationMs", "gymLoad", "Lcom/example/rungps/data/GymLoadStats;", "isBike", "", "plannedDistanceKm", "points", "", "Lorg/osmdroid/util/GeoPoint;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityFormattersKt {
    public static final String formatSyncAgo(long j) {
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

    public static final String formatElapsed(long j) {
        return ActivityFormattersKt.formatElapsedMs(j);
    }

    public static final String formatPace(double d) {
        return ActivityFormattersKt.formatPaceSecPerKm(d);
    }

    public static final String formatStravaDuration(long j) {
        long coerceAtLeast = RangesKt.coerceAtLeast(j, 0L);
        long j2 = 3600;
        long j3 = coerceAtLeast / j2;
        long j4 = 60;
        long j5 = (coerceAtLeast % j2) / j4;
        long j6 = coerceAtLeast % j4;
        if (j3 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static /* synthetic */ String suggestRecovery$default(double d, long j, GymLoadStats gymLoadStats, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return suggestRecovery(d, j, gymLoadStats, z);
    }

    public static final String suggestRecovery(double d, long j, GymLoadStats gymLoadStats, boolean z) {
        RecoveryModel.RecoveryEstimate estimateRun$default;
        StringBuilder append;
        String str;
        if (d <= 0.0d || j <= 0) {
            return "—";
        }
        if (z) {
            estimateRun$default = RecoveryModel.estimateBike$default(RecoveryModel.INSTANCE, d, j, null, 4, null);
        } else {
            estimateRun$default = RecoveryModel.estimateRun$default(RecoveryModel.INSTANCE, d, j, null, 4, null);
        }
        if (estimateRun$default.getHours() <= 0.0d) {
            return "—";
        }
        double hours = estimateRun$default.getHours();
        if (!z) {
            if ((gymLoadStats != null ? gymLoadStats.getLastSessionAtMs() : null) != null && (System.currentTimeMillis() - gymLoadStats.getLastSessionAtMs().longValue()) / 3600000.0d < 48.0d) {
                double coerceIn = RangesKt.coerceIn(((d / 1000.0d) / 10.0d) * ((j / 60000.0d) / 45.0d), 0.0d, 1.0d);
                Double lastTonnage = gymLoadStats.getLastTonnage();
                double doubleValue = lastTonnage != null ? lastTonnage.doubleValue() : 0.0d;
                Double avgTonnage10 = gymLoadStats.getAvgTonnage10();
                double doubleValue2 = avgTonnage10 != null ? avgTonnage10.doubleValue() : doubleValue;
                Double lastMaxWeight = gymLoadStats.getLastMaxWeight();
                double doubleValue3 = lastMaxWeight != null ? lastMaxWeight.doubleValue() : 0.0d;
                Double avgMaxWeight10 = gymLoadStats.getAvgMaxWeight10();
                double doubleValue4 = avgMaxWeight10 != null ? avgMaxWeight10.doubleValue() : doubleValue3;
                hours += RangesKt.coerceIn((RangesKt.coerceAtLeast((doubleValue2 > 0.0d ? RangesKt.coerceIn(doubleValue / doubleValue2, 0.0d, 3.0d) : 1.0d) - 1.0d, 0.0d) * 6.0d) + 4.0d + (RangesKt.coerceAtLeast((doubleValue4 > 0.0d ? RangesKt.coerceIn(doubleValue3 / doubleValue4, 0.0d, 3.0d) : 1.0d) - 1.0d, 0.0d) * 4.0d), 4.0d, 18.0d) * ((coerceIn * 0.85d) + 0.15d);
            }
        }
        double coerceIn2 = RangesKt.coerceIn(hours, 0.5d, 72.0d);
        int i = (int) coerceIn2;
        int roundToInt = MathKt.roundToInt((coerceIn2 - i) * 60.0d);
        if (roundToInt <= 0) {
            append = new StringBuilder().append(i);
            str = "h";
        } else {
            append = new StringBuilder().append(i).append("h ").append(roundToInt);
            str = "m";
        }
        return append.append(str).toString();
    }

    public static final double plannedDistanceKm(List<? extends GeoPoint> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        int size = points.size();
        double d = 0.0d;
        for (int i = 1; i < size; i++) {
            GeoPoint geoPoint = points.get(i - 1);
            GeoPoint geoPoint2 = points.get(i);
            Location location = new Location("a");
            location.setLatitude(geoPoint.getLatitude());
            location.setLongitude(geoPoint.getLongitude());
            Location location2 = new Location("b");
            location2.setLatitude(geoPoint2.getLatitude());
            location2.setLongitude(geoPoint2.getLongitude());
            d += location.distanceTo(location2);
        }
        return d / 1000.0d;
    }
}
