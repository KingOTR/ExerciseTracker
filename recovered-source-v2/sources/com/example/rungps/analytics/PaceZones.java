package com.example.rungps.analytics;

import androidx.autofill.HintConstants;
import androidx.compose.material3.MenuKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: PaceZones.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0012¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/analytics/PaceZones;", "", "<init>", "()V", "formatPace", "", "secPerKm", "", "formatZone", "z", "Lcom/example/rungps/analytics/PaceZones$Zone;", "fromRacePb", "", "durationMs", "", "distanceKm", "fromLocalPbs", "pbs", "", "Zone", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaceZones {
    public static final int $stable = 0;
    public static final PaceZones INSTANCE = new PaceZones();

    private PaceZones() {
    }

    /* compiled from: PaceZones.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/analytics/PaceZones$Zone;", "", HintConstants.AUTOFILL_HINT_NAME, "", "minSecPerKm", "", "maxSecPerKm", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getMinSecPerKm", "()I", "getMaxSecPerKm", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Zone {
        public static final int $stable = 0;
        private final int maxSecPerKm;
        private final int minSecPerKm;
        private final String name;

        public static /* synthetic */ Zone copy$default(Zone zone, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = zone.name;
            }
            if ((i3 & 2) != 0) {
                i = zone.minSecPerKm;
            }
            if ((i3 & 4) != 0) {
                i2 = zone.maxSecPerKm;
            }
            return zone.copy(str, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinSecPerKm() {
            return this.minSecPerKm;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxSecPerKm() {
            return this.maxSecPerKm;
        }

        public final Zone copy(String name, int minSecPerKm, int maxSecPerKm) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Zone(name, minSecPerKm, maxSecPerKm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zone)) {
                return false;
            }
            Zone zone = (Zone) other;
            return Intrinsics.areEqual(this.name, zone.name) && this.minSecPerKm == zone.minSecPerKm && this.maxSecPerKm == zone.maxSecPerKm;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + Integer.hashCode(this.minSecPerKm)) * 31) + Integer.hashCode(this.maxSecPerKm);
        }

        public String toString() {
            return "Zone(name=" + this.name + ", minSecPerKm=" + this.minSecPerKm + ", maxSecPerKm=" + this.maxSecPerKm + ")";
        }

        public Zone(String name, int i, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.minSecPerKm = i;
            this.maxSecPerKm = i2;
        }

        public final int getMaxSecPerKm() {
            return this.maxSecPerKm;
        }

        public final int getMinSecPerKm() {
            return this.minSecPerKm;
        }

        public final String getName() {
            return this.name;
        }
    }

    public final String formatPace(int secPerKm) {
        int coerceAtLeast = RangesKt.coerceAtLeast(secPerKm, 0);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(coerceAtLeast / 60), Integer.valueOf(coerceAtLeast % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String formatZone(Zone z) {
        Intrinsics.checkNotNullParameter(z, "z");
        return formatPace(z.getMinSecPerKm()) + " – " + formatPace(z.getMaxSecPerKm());
    }

    public final List<Zone> fromRacePb(long durationMs, int distanceKm) {
        if (durationMs <= 0 || distanceKm <= 0) {
            return CollectionsKt.emptyList();
        }
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt((durationMs / 1000.0d) / distanceKm), 150, 900);
        return CollectionsKt.listOf((Object[]) new Zone[]{fromRacePb$band(coerceIn, "Z1 Easy", 1.22d, 1.08d), fromRacePb$band(coerceIn, "Z2 Moderate", 1.08d, 1.0d), fromRacePb$band(coerceIn, "Z3 Hard", 1.0d, 0.9d)});
    }

    private static final Zone fromRacePb$band(int i, String str, double d, double d2) {
        double d3 = i;
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(d2 * d3), MenuKt.InTransitionDuration);
        return new Zone(str, coerceAtLeast, RangesKt.coerceAtLeast(MathKt.roundToInt(d3 * d), coerceAtLeast));
    }

    public final List<Zone> fromLocalPbs(Map<String, Long> pbs) {
        Intrinsics.checkNotNullParameter(pbs, "pbs");
        Long l = pbs.get("5 km");
        if (l == null || l.longValue() <= 0) {
            l = null;
        }
        Long l2 = pbs.get("10 km");
        if (l2 == null || l2.longValue() <= 0) {
            l2 = null;
        }
        if (l != null) {
            return fromRacePb(l.longValue(), 5);
        }
        if (l2 != null) {
            return fromRacePb(l2.longValue(), 10);
        }
        return null;
    }
}
