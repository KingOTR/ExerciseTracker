package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public enum Position {
    AUTO,
    CENTER,
    BELOW,
    BELOW_LEFT,
    BELOW_RIGHT,
    ABOVE,
    ABOVE_LEFT,
    ABOVE_RIGHT,
    LEFT,
    RIGHT;

    public static Position fromString(String str) {
        if ("auto".equals(str)) {
            return BELOW;
        }
        if ("center".equals(str)) {
            return CENTER;
        }
        if ("below".equals(str)) {
            return BELOW;
        }
        if ("below_left".equals(str)) {
            return BELOW_LEFT;
        }
        if ("below_right".equals(str)) {
            return BELOW_RIGHT;
        }
        if ("above".equals(str)) {
            return ABOVE;
        }
        if ("above_left".equals(str)) {
            return ABOVE_LEFT;
        }
        if ("above_right".equals(str)) {
            return ABOVE_RIGHT;
        }
        if ("left".equals(str)) {
            return LEFT;
        }
        if ("right".equals(str)) {
            return RIGHT;
        }
        throw new IllegalArgumentException("Invalid value for Position: " + str);
    }

    public boolean isOnLeftSide() {
        return this == LEFT || this == ABOVE_LEFT || this == BELOW_LEFT;
    }

    public boolean isOnLowerSide() {
        return this == BELOW || this == BELOW_LEFT || this == BELOW_RIGHT;
    }

    public boolean isOnRightSide() {
        return this == RIGHT || this == ABOVE_RIGHT || this == BELOW_RIGHT;
    }

    public boolean isOnUpperSide() {
        return this == ABOVE || this == ABOVE_LEFT || this == ABOVE_RIGHT;
    }
}
