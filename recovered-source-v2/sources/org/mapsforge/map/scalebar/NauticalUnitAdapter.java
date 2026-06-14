package org.mapsforge.map.scalebar;

import com.google.logging.type.LogSeverity;

/* loaded from: classes5.dex */
public class NauticalUnitAdapter implements DistanceUnitAdapter {
    public static final NauticalUnitAdapter INSTANCE = new NauticalUnitAdapter();
    public static final int ONE_MILE = 1852;
    public static final int[] SCALE_BAR_VALUES = {9260000, 3704000, 1852000, 926000, 370400, 185200, 92600, 37040, 18520, 9260, 3704, ONE_MILE, 926, LogSeverity.ERROR_VALUE, 200, 100, 50, 20, 10, 5, 2, 1};

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public double getMeterRatio() {
        return 1.0d;
    }

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public int[] getScaleBarValues() {
        return SCALE_BAR_VALUES;
    }

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public String getScaleText(int i) {
        if (i < 926) {
            return i + " m";
        }
        if (i == 926) {
            return "0.5 nmi";
        }
        return (i / ONE_MILE) + " nmi";
    }
}
