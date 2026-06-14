package org.mapsforge.core.graphics;

import org.maplibre.android.style.layers.Property;

/* loaded from: classes5.dex */
public enum Join {
    BEVEL,
    MITER,
    ROUND;

    public static Join fromString(String str) {
        if (Property.LINE_JOIN_BEVEL.equals(str)) {
            return BEVEL;
        }
        if ("round".equals(str)) {
            return ROUND;
        }
        if (Property.LINE_JOIN_MITER.equals(str)) {
            return MITER;
        }
        throw new IllegalArgumentException("Invalid value for Join: " + str);
    }
}
