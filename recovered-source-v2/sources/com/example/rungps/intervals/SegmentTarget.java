package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import org.maplibre.turf.TurfConstants;

/* compiled from: WorkoutPlan.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/example/rungps/intervals/SegmentTarget;", "", "TimeMs", "DistanceM", "Lcom/example/rungps/intervals/SegmentTarget$DistanceM;", "Lcom/example/rungps/intervals/SegmentTarget$TimeMs;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SegmentTarget {

    /* compiled from: WorkoutPlan.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/intervals/SegmentTarget$TimeMs;", "Lcom/example/rungps/intervals/SegmentTarget;", "ms", "", "<init>", "(J)V", "getMs", "()J", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeMs implements SegmentTarget {
        public static final int $stable = 0;
        private final long ms;

        public static /* synthetic */ TimeMs copy$default(TimeMs timeMs, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeMs.ms;
            }
            return timeMs.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getMs() {
            return this.ms;
        }

        public final TimeMs copy(long ms) {
            return new TimeMs(ms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeMs) && this.ms == ((TimeMs) other).ms;
        }

        public int hashCode() {
            return Long.hashCode(this.ms);
        }

        public String toString() {
            return "TimeMs(ms=" + this.ms + ")";
        }

        public TimeMs(long j) {
            this.ms = j;
        }

        public final long getMs() {
            return this.ms;
        }
    }

    /* compiled from: WorkoutPlan.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/intervals/SegmentTarget$DistanceM;", "Lcom/example/rungps/intervals/SegmentTarget;", TurfConstants.UNIT_METERS, "", "<init>", "(D)V", "getMeters", "()D", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DistanceM implements SegmentTarget {
        public static final int $stable = 0;
        private final double meters;

        public static /* synthetic */ DistanceM copy$default(DistanceM distanceM, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = distanceM.meters;
            }
            return distanceM.copy(d);
        }

        /* renamed from: component1, reason: from getter */
        public final double getMeters() {
            return this.meters;
        }

        public final DistanceM copy(double meters) {
            return new DistanceM(meters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DistanceM) && Double.compare(this.meters, ((DistanceM) other).meters) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.meters);
        }

        public String toString() {
            return "DistanceM(meters=" + this.meters + ")";
        }

        public DistanceM(double d) {
            this.meters = d;
        }

        public final double getMeters() {
            return this.meters;
        }
    }
}
