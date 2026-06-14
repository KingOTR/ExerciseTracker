package org.mapsforge.core.graphics;

import org.mapsforge.core.model.BoundingBox;

/* loaded from: classes5.dex */
public interface HillshadingBitmap extends Bitmap {
    BoundingBox getAreaRect();

    int getPadding();

    public enum Border {
        WEST(true),
        NORTH(false),
        EAST(true),
        SOUTH(false);

        public final boolean vertical;

        Border(boolean z) {
            this.vertical = z;
        }
    }
}
