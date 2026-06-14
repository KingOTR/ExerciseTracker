package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public enum Curve {
    NO,
    CUBIC;

    public static Curve fromString(String str) {
        if ("cubic".equals(str)) {
            return CUBIC;
        }
        return NO;
    }
}
