package org.mapsforge.map.scalebar;

import com.google.logging.type.LogSeverity;

/* loaded from: classes5.dex */
public class NauticalImperialUnitAdapter implements DistanceUnitAdapter {
    public static final double METER_FOOT_RATIO = 0.3048d;
    public static final NauticalImperialUnitAdapter INSTANCE = new NauticalImperialUnitAdapter();
    public static final int ONE_MILE = 6076;
    public static final int[] SCALE_BAR_VALUES = {30380000, 12152000, 6076000, 3038000, 1215200, 607600, 303800, 121520, 60760, 30380, 12152, ONE_MILE, 3038, 1000, LogSeverity.ERROR_VALUE, 200, 100, 50, 20, 10, 5, 2, 1};

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public double getMeterRatio() {
        return 0.3048d;
    }

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public int[] getScaleBarValues() {
        return SCALE_BAR_VALUES;
    }

    @Override // org.mapsforge.map.scalebar.DistanceUnitAdapter
    public String getScaleText(int i) {
        if (i < 3038) {
            return i + " ft";
        }
        if (i == 3038) {
            return "0.5 nmi";
        }
        return (i / ONE_MILE) + " nmi";
    }
}
