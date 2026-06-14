package com.example.rungps.analytics;

import com.example.rungps.data.PointEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: BikeStats.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/analytics/BikeStats;", "", "<init>", "()V", "compute", "Lcom/example/rungps/analytics/BikeRideStats;", "run", "Lcom/example/rungps/data/RunEntity;", "points", "", "Lcom/example/rungps/data/PointEntity;", "summaryLine", "", "stats", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BikeStats {
    public static final int $stable = 0;
    public static final BikeStats INSTANCE = new BikeStats();

    private BikeStats() {
    }

    public final BikeRideStats compute(RunEntity run, List<PointEntity> points) {
        long j;
        Intrinsics.checkNotNullParameter(run, "run");
        Intrinsics.checkNotNullParameter(points, "points");
        Double d = null;
        if (!ActivityTypes.INSTANCE.isBike(run.getActivityType())) {
            return null;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(run.getTotalDurationMs() / 1000.0d, 1.0d);
        double totalDistanceM = run.getTotalDistanceM() / 1000.0d;
        double d2 = totalDistanceM > 0.01d ? totalDistanceM / (coerceAtLeast / 3600.0d) : 0.0d;
        PointEntity pointEntity = (PointEntity) CollectionsKt.firstOrNull((List) points);
        if (pointEntity != null) {
            Long.valueOf(pointEntity.getTimeMs());
        }
        int size = points.size();
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        for (int i = 1; i < size; i++) {
            PointEntity pointEntity2 = points.get(i);
            double coerceAtLeast2 = RangesKt.coerceAtLeast(pointEntity2.getTimeMs() - points.get(i - 1).getTimeMs(), 1L) / 1000.0d;
            double distanceFromPrevM = pointEntity2.getDistanceFromPrevM() / 1000.0d;
            if (distanceFromPrevM <= 0.001d || coerceAtLeast2 <= 0.0d) {
                j = 4660134898793709568L;
            } else {
                j = 4660134898793709568L;
                d3 = Math.max(d3, distanceFromPrevM / (coerceAtLeast2 / 3600.0d));
            }
            Double eleM = pointEntity2.getEleM();
            if (eleM != null && d != null) {
                double doubleValue = eleM.doubleValue() - d.doubleValue();
                if (doubleValue > 0.0d) {
                    d4 += doubleValue;
                } else {
                    d5 += -doubleValue;
                }
            }
            if (eleM != null) {
                d = eleM;
            }
            Long.valueOf(pointEntity2.getTimeMs());
        }
        return new BikeRideStats(d2, d3, d4, d5);
    }

    public final String summaryLine(BikeRideStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        StringBuilder sb = new StringBuilder();
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(stats.getAvgSpeedKmh())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append("Avg " + format + " km/h");
        if (stats.getMaxSpeedKmh() > 0.5d) {
            String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(stats.getMaxSpeedKmh())}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(" · max " + format2 + " km/h");
        }
        if (stats.getElevationGainM() >= 1.0d) {
            sb.append(" · ↑" + ((int) stats.getElevationGainM()) + " m");
        }
        if (stats.getElevationLossM() >= 1.0d) {
            sb.append(" · ↓" + ((int) stats.getElevationLossM()) + " m");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
