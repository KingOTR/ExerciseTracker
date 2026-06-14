package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public enum TextOrientation {
    AUTO,
    AUTO_DOWN,
    RIGHT,
    LEFT;

    public static TextOrientation fromString(String str) {
        str.hashCode();
        switch (str) {
            case "left":
                return LEFT;
            case "right":
                return RIGHT;
            case "auto_down":
                return AUTO_DOWN;
            default:
                return AUTO;
        }
    }
}
