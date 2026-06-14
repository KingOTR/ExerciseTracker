package org.mapsforge.map.view;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.GraphicContext;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.MapPosition;

/* loaded from: classes5.dex */
public abstract class FrameBuffer {
    public abstract void adjustMatrix(float f, float f2, float f3, Dimension dimension, float f4, float f5);

    public abstract void destroy();

    public abstract void draw(GraphicContext graphicContext);

    public abstract void frameFinished(MapPosition mapPosition);

    public abstract Dimension getDimension();

    public abstract Bitmap getDrawingBitmap();

    public abstract void setDimension(Dimension dimension);
}
