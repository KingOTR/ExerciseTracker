package com.example.rungps.tracking;

import android.location.Location;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: GpsTunnelEstimator.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0011J0\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011J&\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/tracking/GpsTunnelEstimator;", "", "<init>", "()V", "STEP_LENGTH_M", "", "GOOD_ACC_M", "", "POOR_ACC_M", "BAD_ACC_M", "computeDeltaM", "Lcom/example/rungps/tracking/GpsTunnelEstimator$DeltaResult;", "prevLoc", "Landroid/location/Location;", "loc", "accuracyM", "stepDelta", "", "poorGpsStreak", "", "lastSpeedMps", "dtMs", "isTunnelExitJump", "", "lastGoodLoc", "isSpike", "deltaM", "speedMps", "wasInPoorGps", "DeltaResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsTunnelEstimator {
    public static final int $stable = 0;
    private static final float BAD_ACC_M = 50.0f;
    private static final float GOOD_ACC_M = 22.0f;
    public static final GpsTunnelEstimator INSTANCE = new GpsTunnelEstimator();
    private static final float POOR_ACC_M = 28.0f;
    private static final double STEP_LENGTH_M = 0.78d;

    private GpsTunnelEstimator() {
    }

    /* compiled from: GpsTunnelEstimator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/tracking/GpsTunnelEstimator$DeltaResult;", "", "distanceM", "", "useSteps", "", "inPoorGps", "holdPosition", "<init>", "(DZZZ)V", "getDistanceM", "()D", "getUseSteps", "()Z", "getInPoorGps", "getHoldPosition", "component1", "component2", "component3", "component4", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeltaResult {
        public static final int $stable = 0;
        private final double distanceM;
        private final boolean holdPosition;
        private final boolean inPoorGps;
        private final boolean useSteps;

        public static /* synthetic */ DeltaResult copy$default(DeltaResult deltaResult, double d, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = deltaResult.distanceM;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                z = deltaResult.useSteps;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = deltaResult.inPoorGps;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                z3 = deltaResult.holdPosition;
            }
            return deltaResult.copy(d2, z4, z5, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final double getDistanceM() {
            return this.distanceM;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseSteps() {
            return this.useSteps;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInPoorGps() {
            return this.inPoorGps;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHoldPosition() {
            return this.holdPosition;
        }

        public final DeltaResult copy(double distanceM, boolean useSteps, boolean inPoorGps, boolean holdPosition) {
            return new DeltaResult(distanceM, useSteps, inPoorGps, holdPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeltaResult)) {
                return false;
            }
            DeltaResult deltaResult = (DeltaResult) other;
            return Double.compare(this.distanceM, deltaResult.distanceM) == 0 && this.useSteps == deltaResult.useSteps && this.inPoorGps == deltaResult.inPoorGps && this.holdPosition == deltaResult.holdPosition;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.distanceM) * 31) + Boolean.hashCode(this.useSteps)) * 31) + Boolean.hashCode(this.inPoorGps)) * 31) + Boolean.hashCode(this.holdPosition);
        }

        public String toString() {
            return "DeltaResult(distanceM=" + this.distanceM + ", useSteps=" + this.useSteps + ", inPoorGps=" + this.inPoorGps + ", holdPosition=" + this.holdPosition + ")";
        }

        public DeltaResult(double d, boolean z, boolean z2, boolean z3) {
            this.distanceM = d;
            this.useSteps = z;
            this.inPoorGps = z2;
            this.holdPosition = z3;
        }

        public final double getDistanceM() {
            return this.distanceM;
        }

        public final boolean getUseSteps() {
            return this.useSteps;
        }

        public final boolean getInPoorGps() {
            return this.inPoorGps;
        }

        public final boolean getHoldPosition() {
            return this.holdPosition;
        }
    }

    public final DeltaResult computeDeltaM(Location prevLoc, Location loc, float accuracyM, long stepDelta, int poorGpsStreak, double lastSpeedMps, long dtMs) {
        double coerceAtMost;
        Intrinsics.checkNotNullParameter(loc, "loc");
        if (prevLoc == null) {
            return new DeltaResult(0.0d, false, false, false);
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(prevLoc.distanceTo(loc), 0.0d);
        boolean z = accuracyM > POOR_ACC_M;
        boolean z2 = accuracyM > 50.0f;
        if (!z) {
            return new DeltaResult(coerceAtLeast, false, false, false);
        }
        double coerceAtLeast2 = RangesKt.coerceAtLeast(stepDelta, 0L) * STEP_LENGTH_M;
        if (z2 || poorGpsStreak >= 2) {
            double coerceIn = RangesKt.coerceIn(dtMs / 1000.0d, 0.0d, 45.0d);
            double coerceAtMost2 = (coerceAtLeast2 > 0.0d || lastSpeedMps < 0.6d || coerceIn <= 0.0d) ? 0.0d : RangesKt.coerceAtMost(coerceIn * lastSpeedMps, 35.0d);
            if (coerceAtLeast2 <= 0.0d) {
                if (coerceAtMost2 > 0.0d) {
                    coerceAtLeast2 = coerceAtMost2;
                } else {
                    coerceAtLeast2 = coerceAtLeast < 8.0d ? RangesKt.coerceAtMost(coerceAtLeast, 12.0d) : 0.0d;
                }
            }
            return new DeltaResult(RangesKt.coerceAtLeast(coerceAtLeast2, 0.0d), coerceAtLeast2 > 0.0d, true, true);
        }
        if (coerceAtLeast2 > 0.0d) {
            coerceAtMost = (RangesKt.coerceAtMost(coerceAtLeast, 40.0d) * 0.35d) + (coerceAtLeast2 * 0.65d);
        } else {
            coerceAtMost = RangesKt.coerceAtMost(coerceAtLeast, 35.0d);
        }
        return new DeltaResult(coerceAtMost, coerceAtLeast2 > 0.0d, true, false);
    }

    public final boolean isTunnelExitJump(Location lastGoodLoc, Location loc, float accuracyM, int poorGpsStreak, long dtMs) {
        Intrinsics.checkNotNullParameter(loc, "loc");
        if (lastGoodLoc == null || accuracyM > GOOD_ACC_M || poorGpsStreak > 1) {
            return false;
        }
        double d = dtMs / 1000.0d;
        if (d > 45.0d) {
            return false;
        }
        double distanceTo = lastGoodLoc.distanceTo(loc);
        if (distanceTo < 45.0d) {
            return false;
        }
        return distanceTo >= 80.0d && distanceTo / RangesKt.coerceAtLeast(d, 0.5d) >= 6.0d;
    }

    public final boolean isSpike(double deltaM, double speedMps, float accuracyM, boolean wasInPoorGps) {
        if (deltaM <= 0.5d) {
            return false;
        }
        if (deltaM >= 100.0d) {
            return true;
        }
        double d = wasInPoorGps ? 11.0d : 9.5d;
        double d2 = wasInPoorGps ? 50.0d : 38.0d;
        if (speedMps >= d && (accuracyM >= 12.0f || deltaM >= d2)) {
            return true;
        }
        if (speedMps < 7.0d || accuracyM < GOOD_ACC_M || deltaM < 30.0d || wasInPoorGps) {
            return wasInPoorGps && deltaM >= 70.0d && Math.abs(speedMps) >= 7.5d;
        }
        return true;
    }
}
