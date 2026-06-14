package org.mapsforge.core.graphics;

import org.maplibre.android.style.layers.Property;

/* loaded from: classes5.dex */
public enum TextTransform {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE;

    public static TextTransform fromString(String str) {
        if (Property.TEXT_TRANSFORM_UPPERCASE.equals(str)) {
            return UPPERCASE;
        }
        if (Property.TEXT_TRANSFORM_LOWERCASE.equals(str)) {
            return LOWERCASE;
        }
        if ("capitalize".equals(str)) {
            return CAPITALIZE;
        }
        return NONE;
    }
}
