package com.example.rungps.analytics;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: SpeedZones.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0012¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/analytics/SpeedZones;", "", "<init>", "()V", "formatSpeed", "", "kmh", "", "formatZone", "z", "Lcom/example/rungps/analytics/SpeedZones$Zone;", "fromRacePb", "", "durationMs", "", "distanceKm", "fromLocalPbs", "pbs", "", "Zone", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeedZones {
    public static final int $stable = 0;
    public static final SpeedZones INSTANCE = new SpeedZones();

    private SpeedZones() {
    }

    /* compiled from: SpeedZones.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/analytics/SpeedZones$Zone;", "", HintConstants.AUTOFILL_HINT_NAME, "", "minKmh", "", "maxKmh", "<init>", "(Ljava/lang/String;DD)V", "getName", "()Ljava/lang/String;", "getMinKmh", "()D", "getMaxKmh", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Zone {
        public static final int $stable = 0;
        private final double maxKmh;
        private final double minKmh;
        private final String name;

        public static /* synthetic */ Zone copy$default(Zone zone, String str, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = zone.name;
            }
            if ((i & 2) != 0) {
                d = zone.minKmh;
            }
            double d3 = d;
            if ((i & 4) != 0) {
                d2 = zone.maxKmh;
            }
            return zone.copy(str, d3, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final double getMinKmh() {
            return this.minKmh;
        }

        /* renamed from: component3, reason: from getter */
        public final double getMaxKmh() {
            return this.maxKmh;
        }

        public final Zone copy(String name, double minKmh, double maxKmh) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Zone(name, minKmh, maxKmh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zone)) {
                return false;
            }
            Zone zone = (Zone) other;
            return Intrinsics.areEqual(this.name, zone.name) && Double.compare(this.minKmh, zone.minKmh) == 0 && Double.compare(this.maxKmh, zone.maxKmh) == 0;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + Double.hashCode(this.minKmh)) * 31) + Double.hashCode(this.maxKmh);
        }

        public String toString() {
            return "Zone(name=" + this.name + ", minKmh=" + this.minKmh + ", maxKmh=" + this.maxKmh + ")";
        }

        public Zone(String name, double d, double d2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.minKmh = d;
            this.maxKmh = d2;
        }

        public final double getMaxKmh() {
            return this.maxKmh;
        }

        public final double getMinKmh() {
            return this.minKmh;
        }

        public final String getName() {
            return this.name;
        }
    }

    public final String formatSpeed(double kmh) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f km/h", Arrays.copyOf(new Object[]{Double.valueOf(RangesKt.coerceAtLeast(kmh, 0.0d))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String formatZone(Zone z) {
        Intrinsics.checkNotNullParameter(z, "z");
        return formatSpeed(z.getMinKmh()) + " – " + formatSpeed(z.getMaxKmh());
    }

    public final List<Zone> fromRacePb(long durationMs, double distanceKm) {
        if (durationMs <= 0 || distanceKm <= 0.0d) {
            return CollectionsKt.emptyList();
        }
        double coerceIn = RangesKt.coerceIn(distanceKm / (durationMs / 3600000.0d), 8.0d, 60.0d);
        return CollectionsKt.listOf((Object[]) new Zone[]{fromRacePb$band(coerceIn, "Z1 Easy", 1.22d, 1.08d), fromRacePb$band(coerceIn, "Z2 Moderate", 1.08d, 1.0d), fromRacePb$band(coerceIn, "Z3 Hard", 1.0d, 0.9d)});
    }

    private static final Zone fromRacePb$band(double d, String str, double d2, double d3) {
        double coerceAtLeast = RangesKt.coerceAtLeast(d / d2, 5.0d);
        double coerceAtMost = RangesKt.coerceAtMost(d / d3, 80.0d);
        return new Zone(str, RangesKt.coerceAtMost(coerceAtLeast, coerceAtMost), RangesKt.coerceAtLeast(coerceAtMost, coerceAtLeast));
    }

    public final List<Zone> fromLocalPbs(Map<String, Long> pbs) {
        Intrinsics.checkNotNullParameter(pbs, "pbs");
        Long l = pbs.get("10 km");
        if (l == null || l.longValue() <= 0) {
            l = null;
        }
        Long l2 = pbs.get("20 km");
        if (l2 == null || l2.longValue() <= 0) {
            l2 = null;
        }
        if (l != null) {
            return fromRacePb(l.longValue(), 10.0d);
        }
        if (l2 != null) {
            return fromRacePb(l2.longValue(), 20.0d);
        }
        return null;
    }
}
