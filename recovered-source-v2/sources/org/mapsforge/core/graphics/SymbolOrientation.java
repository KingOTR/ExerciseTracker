package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public enum SymbolOrientation {
    AUTO,
    AUTO_DOWN,
    RIGHT,
    LEFT,
    UP,
    DOWN;

    public static SymbolOrientation fromString(String str) {
        str.hashCode();
        switch (str) {
            case "up":
                return UP;
            case "down":
                return DOWN;
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
