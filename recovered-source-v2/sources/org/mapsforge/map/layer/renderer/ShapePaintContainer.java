package org.mapsforge.map.layer.renderer;

import org.mapsforge.core.graphics.Curve;
import org.mapsforge.core.graphics.Paint;

/* loaded from: classes5.dex */
public class ShapePaintContainer {
    final Curve curveStyle;
    final float dy;
    final Paint paint;
    final ShapeContainer shapeContainer;

    public ShapePaintContainer(ShapeContainer shapeContainer, Paint paint) {
        this(shapeContainer, paint, 0.0f, Curve.NO);
    }

    public ShapePaintContainer(ShapeContainer shapeContainer, Paint paint, float f, Curve curve) {
        this.shapeContainer = shapeContainer;
        this.paint = paint;
        this.dy = f;
        this.curveStyle = curve;
    }
}
