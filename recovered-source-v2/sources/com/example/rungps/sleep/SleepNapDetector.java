package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepNapDetector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepNapDetector;", "", "<init>", "()V", "analyze", "Lcom/example/rungps/sleep/SleepNapDetector$NapHint;", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "zone", "Ljava/time/ZoneId;", "isDaytime", "", "t", "Ljava/time/LocalTime;", "NapHint", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepNapDetector {
    public static final int $stable = 0;
    public static final SleepNapDetector INSTANCE = new SleepNapDetector();

    private SleepNapDetector() {
    }

    /* compiled from: SleepNapDetector.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sleep/SleepNapDetector$NapHint;", "", "isLikelyNap", "", "reason", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NapHint {
        public static final int $stable = 0;
        private final boolean isLikelyNap;
        private final String reason;

        public static /* synthetic */ NapHint copy$default(NapHint napHint, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = napHint.isLikelyNap;
            }
            if ((i & 2) != 0) {
                str = napHint.reason;
            }
            return napHint.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLikelyNap() {
            return this.isLikelyNap;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final NapHint copy(boolean isLikelyNap, String reason) {
            return new NapHint(isLikelyNap, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NapHint)) {
                return false;
            }
            NapHint napHint = (NapHint) other;
            return this.isLikelyNap == napHint.isLikelyNap && Intrinsics.areEqual(this.reason, napHint.reason);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isLikelyNap) * 31;
            String str = this.reason;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NapHint(isLikelyNap=" + this.isLikelyNap + ", reason=" + this.reason + ")";
        }

        public NapHint(boolean z, String str) {
            this.isLikelyNap = z;
            this.reason = str;
        }

        public final boolean isLikelyNap() {
            return this.isLikelyNap;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public static /* synthetic */ NapHint analyze$default(SleepNapDetector sleepNapDetector, SleepEntryEntity sleepEntryEntity, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepNapDetector.analyze(sleepEntryEntity, zoneId);
    }

    public final NapHint analyze(SleepEntryEntity entry, ZoneId zone) {
        boolean z;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(zone, "zone");
        int endTimeMs = (int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000);
        if (endTimeMs >= 180) {
            return new NapHint(false, null);
        }
        if (!SleepScoring.INSTANCE.isOvernightSource(entry.getSource())) {
            return new NapHint(false, null);
        }
        LocalTime localTime = Instant.ofEpochMilli(entry.getStartTimeMs()).atZone(zone).toLocalTime();
        LocalTime localTime2 = Instant.ofEpochMilli(entry.getEndTimeMs()).atZone(zone).toLocalTime();
        Intrinsics.checkNotNull(localTime);
        if (isDaytime(localTime)) {
            Intrinsics.checkNotNull(localTime2);
            if (isDaytime(localTime2)) {
                z = true;
                boolean z2 = 15 > endTimeMs && endTimeMs < 180;
                int coerceAtLeast = RangesKt.coerceAtLeast(entry.getTotalSleepMin(), 0);
                if (!z && z2 && coerceAtLeast >= 10) {
                    return new NapHint(true, "Short daytime rest (" + coerceAtLeast + " min asleep)");
                }
                if (!z && endTimeMs < 15) {
                    return new NapHint(false, "Very short session — not counted as nap");
                }
                return new NapHint(false, null);
            }
        }
        z = false;
        if (15 > endTimeMs) {
        }
        int coerceAtLeast2 = RangesKt.coerceAtLeast(entry.getTotalSleepMin(), 0);
        if (!z) {
        }
        if (!z) {
        }
        return new NapHint(false, null);
    }

    private final boolean isDaytime(LocalTime t) {
        int hour = t.getHour();
        return 7 <= hour && hour < 21;
    }
}
