package org.mapsforge.map.scalebar;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.gms.common.util.GmsVersion;
import com.google.logging.type.LogSeverity;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import kotlin.time.DurationKt;

/* loaded from: classes5.dex */
public class MetricUnitAdapter implements DistanceUnitAdapter {
    public static final int ONE_KILOMETER = 1000;
    public static final MetricUnitAdapter INSTANCE = new MetricUnitAdapter();
    public static final int[] SCALE_BAR_VALUES = {10000000, GmsVersion.VERSION_LONGHORN, 2000000, DurationKt.NANOS_IN_MILLIS, 500000, 200000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 50000, 20000, 10000, 5000, ErrorCode.ERR_NO_USER_PERMISSION, 1000, LogSeverity.ERROR_VALUE, 200, 100, 50, 20, 10, 5, 2, 1};

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
        if (i < 1000) {
            return i + " m";
        }
        return (i / 1000) + " km";
    }
}
