package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes5.dex */
public class MilestoneMeterDistanceSliceLister extends MilestoneLister {
    private double mDistance;
    private int mIndex;
    private double mNbMetersEnd;
    private double mNbMetersStart;
    private Step mStep;

    private enum Step {
        STEP_INIT,
        STEP_STARTED,
        STEP_ENDED
    }

    public void setMeterDistanceSlice(double d, double d2) {
        this.mNbMetersStart = d;
        this.mNbMetersEnd = d2;
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.mDistance = 0.0d;
        this.mIndex = 0;
        this.mStep = Step.STEP_INIT;
    }

    @Override // org.osmdroid.views.overlay.milestones.MilestoneLister
    protected void add(long j, long j2, long j3, long j4) {
        double d;
        if (this.mStep == Step.STEP_ENDED) {
            return;
        }
        int i = this.mIndex + 1;
        this.mIndex = i;
        double distance = getDistance(i);
        if (distance == 0.0d) {
            return;
        }
        double d2 = j;
        double d3 = j2;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d2, d3, j3, j4)) / distance;
        double orientation = getOrientation(j, j2, j3, j4);
        if (this.mStep == Step.STEP_INIT) {
            double d4 = this.mNbMetersStart;
            double d5 = this.mDistance;
            double d6 = d4 - d5;
            if (d6 > distance) {
                this.mDistance = d5 + distance;
                return;
            }
            this.mStep = Step.STEP_STARTED;
            this.mDistance += d6;
            double d7 = distance - d6;
            double d8 = orientation * 0.017453292519943295d;
            d2 += Math.cos(d8) * d6 * sqrt;
            d = d3 + (d6 * Math.sin(d8) * sqrt);
            add(new MilestoneStep((long) d2, (long) d, orientation, null));
            if (this.mNbMetersStart == this.mNbMetersEnd) {
                this.mStep = Step.STEP_ENDED;
                return;
            }
            distance = d7;
        } else {
            d = d3;
        }
        if (this.mStep == Step.STEP_STARTED) {
            double d9 = this.mNbMetersEnd;
            double d10 = this.mDistance;
            double d11 = d9 - d10;
            if (d11 > distance) {
                this.mDistance = d10 + distance;
                add(new MilestoneStep(j3, j4, orientation, null));
            } else {
                this.mStep = Step.STEP_ENDED;
                double d12 = orientation * 0.017453292519943295d;
                add(new MilestoneStep((long) (d2 + (Math.cos(d12) * d11 * sqrt)), (long) (d + (d11 * Math.sin(d12) * sqrt)), orientation, null));
            }
        }
    }
}
