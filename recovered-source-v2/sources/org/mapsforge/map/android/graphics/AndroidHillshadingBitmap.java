package org.mapsforge.map.android.graphics;

import org.mapsforge.core.graphics.HillshadingBitmap;
import org.mapsforge.core.model.BoundingBox;

/* loaded from: classes5.dex */
public class AndroidHillshadingBitmap extends AndroidBitmap implements HillshadingBitmap {
    private final BoundingBox areaRect;
    private final int padding;

    public AndroidHillshadingBitmap(int i, int i2, int i3, BoundingBox boundingBox) {
        super(i, i2, AndroidGraphicFactory.MONO_ALPHA_BITMAP);
        this.padding = i3;
        this.areaRect = boundingBox;
    }

    @Override // org.mapsforge.core.graphics.HillshadingBitmap
    public BoundingBox getAreaRect() {
        return this.areaRect;
    }

    @Override // org.mapsforge.core.graphics.HillshadingBitmap
    public int getPadding() {
        return this.padding;
    }
}
