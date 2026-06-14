package com.example.rungps.analytics;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: HeartRateZones.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/analytics/HeartRateZones;", "", "<init>", "()V", "maxHrBpm", "", "ageYears", "(Ljava/lang/Integer;)I", "zones", "", "Lcom/example/rungps/analytics/HeartRateZones$Zone;", "(Ljava/lang/Integer;)Ljava/util/List;", "zoneForBpm", "bpm", "(ILjava/lang/Integer;)Lcom/example/rungps/analytics/HeartRateZones$Zone;", "labelForBpm", "", "(ILjava/lang/Integer;)Ljava/lang/String;", "Zone", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartRateZones {
    public static final int $stable = 0;
    public static final HeartRateZones INSTANCE = new HeartRateZones();

    private HeartRateZones() {
    }

    /* compiled from: HeartRateZones.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/analytics/HeartRateZones$Zone;", "", "number", "", HintConstants.AUTOFILL_HINT_NAME, "", "minBpm", "maxBpm", "<init>", "(ILjava/lang/String;II)V", "getNumber", "()I", "getName", "()Ljava/lang/String;", "getMinBpm", "getMaxBpm", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Zone {
        public static final int $stable = 0;
        private final int maxBpm;
        private final int minBpm;
        private final String name;
        private final int number;

        public static /* synthetic */ Zone copy$default(Zone zone, int i, String str, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = zone.number;
            }
            if ((i4 & 2) != 0) {
                str = zone.name;
            }
            if ((i4 & 4) != 0) {
                i2 = zone.minBpm;
            }
            if ((i4 & 8) != 0) {
                i3 = zone.maxBpm;
            }
            return zone.copy(i, str, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumber() {
            return this.number;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinBpm() {
            return this.minBpm;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxBpm() {
            return this.maxBpm;
        }

        public final Zone copy(int number, String name, int minBpm, int maxBpm) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Zone(number, name, minBpm, maxBpm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zone)) {
                return false;
            }
            Zone zone = (Zone) other;
            return this.number == zone.number && Intrinsics.areEqual(this.name, zone.name) && this.minBpm == zone.minBpm && this.maxBpm == zone.maxBpm;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.number) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.minBpm)) * 31) + Integer.hashCode(this.maxBpm);
        }

        public String toString() {
            return "Zone(number=" + this.number + ", name=" + this.name + ", minBpm=" + this.minBpm + ", maxBpm=" + this.maxBpm + ")";
        }

        public Zone(int i, String name, int i2, int i3) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.number = i;
            this.name = name;
            this.minBpm = i2;
            this.maxBpm = i3;
        }

        public final int getNumber() {
            return this.number;
        }

        public final String getName() {
            return this.name;
        }

        public final int getMinBpm() {
            return this.minBpm;
        }

        public final int getMaxBpm() {
            return this.maxBpm;
        }
    }

    public final int maxHrBpm(Integer ageYears) {
        return RangesKt.coerceIn(220 - (ageYears != null ? RangesKt.coerceIn(ageYears.intValue(), 12, 90) : 35), 150, 210);
    }

    public final List<Zone> zones(Integer ageYears) {
        int maxHrBpm = maxHrBpm(ageYears);
        return CollectionsKt.listOf((Object[]) new Zone[]{zones$z(maxHrBpm, 1, "Recovery", 0.5d, 0.6d), zones$z(maxHrBpm, 2, "Aerobic", 0.6d, 0.7d), zones$z(maxHrBpm, 3, "Tempo", 0.7d, 0.8d), zones$z(maxHrBpm, 4, "Threshold", 0.8d, 0.9d), zones$z(maxHrBpm, 5, "Max", 0.9d, 1.0d)});
    }

    private static final Zone zones$z(int i, int i2, String str, double d, double d2) {
        double d3 = i;
        return new Zone(i2, str, MathKt.roundToInt(d * d3), RangesKt.coerceAtMost(MathKt.roundToInt(d3 * d2), i));
    }

    public final Zone zoneForBpm(int bpm, Integer ageYears) {
        Zone zone = null;
        if (bpm <= 0) {
            return null;
        }
        List<Zone> zones = zones(ageYears);
        ListIterator<Zone> listIterator = zones.listIterator(zones.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Zone previous = listIterator.previous();
            if (bpm >= previous.getMinBpm()) {
                zone = previous;
                break;
            }
        }
        Zone zone2 = zone;
        return zone2 == null ? (Zone) CollectionsKt.firstOrNull((List) zones(ageYears)) : zone2;
    }

    public final String labelForBpm(int bpm, Integer ageYears) {
        Zone zoneForBpm = zoneForBpm(bpm, ageYears);
        if (zoneForBpm == null) {
            return bpm + " bpm";
        }
        return "Z" + zoneForBpm.getNumber() + " " + zoneForBpm.getName() + " · " + bpm + " bpm";
    }
}
