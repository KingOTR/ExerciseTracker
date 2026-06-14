package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes5.dex */
public class MilestonePixelDistanceLister extends MilestoneLister {
    private double mDistance;
    private final double mNbPixelsInit;
    private final double mNbPixelsRecurrence;

    public MilestonePixelDistanceLister(double d, double d2) {
        this.mNbPixelsInit = d;
        this.mNbPixelsRecurrence = d2;
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.mDistance = this.mNbPixelsRecurrence - this.mNbPixelsInit;
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister
    protected void add(long j, long j2, long j3, long j4) {
        double d = j;
        double d2 = j2;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d, d2, j3, j4));
        if (sqrt == 0.0d) {
            return;
        }
        double orientation = getOrientation(j, j2, j3, j4);
        double d3 = d2;
        while (true) {
            double floor = Math.floor(this.mDistance / this.mNbPixelsRecurrence);
            double d4 = this.mNbPixelsRecurrence;
            double d5 = (floor * d4) + d4;
            double d6 = this.mDistance;
            double d7 = d5 - d6;
            if (sqrt < d7) {
                this.mDistance = d6 + sqrt;
                return;
            }
            this.mDistance = d6 + d7;
            double d8 = 0.017453292519943295d * orientation;
            d += Math.cos(d8) * d7;
            d3 += d7 * Math.sin(d8);
            add(new MilestoneStep((long) d, (long) d3, orientation, Double.valueOf(this.mDistance)));
            sqrt -= d7;
        }
    }
}
