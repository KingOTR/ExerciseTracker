package org.mapsforge.core.graphics;

import org.maplibre.android.style.layers.Property;

/* loaded from: classes5.dex */
public enum Cap {
    BUTT,
    ROUND,
    SQUARE;

    public static Cap fromString(String str) {
        if (Property.LINE_CAP_BUTT.equals(str)) {
            return BUTT;
        }
        if ("round".equals(str)) {
            return ROUND;
        }
        if (Property.LINE_CAP_SQUARE.equals(str)) {
            return SQUARE;
        }
        throw new IllegalArgumentException("Invalid value for Align: " + str);
    }
}
