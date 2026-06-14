package org.mapsforge.map.rendertheme;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Curve;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.SymbolOrientation;
import org.mapsforge.core.graphics.TextOrientation;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;

/* loaded from: classes5.dex */
public interface RenderCallback {
    void renderArea(RenderContext renderContext, Paint paint, Paint paint2, int i, PolylineContainer polylineContainer);

    void renderAreaCaption(RenderContext renderContext, Display display, int i, String str, float f, float f2, Paint paint, Paint paint2, Position position, int i2, PolylineContainer polylineContainer);

    void renderAreaSymbol(RenderContext renderContext, Display display, int i, Bitmap bitmap, PolylineContainer polylineContainer);

    void renderPointOfInterestCaption(RenderContext renderContext, Display display, int i, String str, float f, float f2, Paint paint, Paint paint2, Position position, int i2, PointOfInterest pointOfInterest);

    void renderPointOfInterestCircle(RenderContext renderContext, float f, Paint paint, Paint paint2, int i, PointOfInterest pointOfInterest);

    void renderPointOfInterestSymbol(RenderContext renderContext, Display display, int i, Rectangle rectangle, Bitmap bitmap, PointOfInterest pointOfInterest);

    void renderWay(RenderContext renderContext, Paint paint, float f, Curve curve, int i, PolylineContainer polylineContainer);

    void renderWaySymbol(RenderContext renderContext, Display display, int i, Bitmap bitmap, float f, Rectangle rectangle, boolean z, float f2, float f3, SymbolOrientation symbolOrientation, PolylineContainer polylineContainer);

    void renderWayText(RenderContext renderContext, Display display, int i, String str, float f, Paint paint, Paint paint2, boolean z, float f2, float f3, TextOrientation textOrientation, PolylineContainer polylineContainer);
}
