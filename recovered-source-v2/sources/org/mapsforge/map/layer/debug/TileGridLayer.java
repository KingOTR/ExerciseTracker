package org.mapsforge.map.layer.debug;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.model.DisplayModel;

/* loaded from: classes5.dex */
public class TileGridLayer extends Layer {
    private final DisplayModel displayModel;
    private final Paint paintBack;
    private final Paint paintFront;

    private static Paint createPaintFront(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.RED);
        createPaint.setStrokeWidth(displayModel.getScaleFactor() * 2.0f);
        createPaint.setStyle(Style.STROKE);
        return createPaint;
    }

    private static Paint createPaintBack(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.WHITE);
        createPaint.setStrokeWidth(displayModel.getScaleFactor() * 4.0f);
        createPaint.setStyle(Style.STROKE);
        return createPaint;
    }

    public TileGridLayer(GraphicFactory graphicFactory, DisplayModel displayModel) {
        this.displayModel = displayModel;
        this.paintBack = createPaintBack(graphicFactory, displayModel);
        this.paintFront = createPaintFront(graphicFactory, displayModel);
    }

    public TileGridLayer(DisplayModel displayModel, Paint paint, Paint paint2) {
        this.displayModel = displayModel;
        this.paintBack = paint;
        this.paintFront = paint2;
    }

    @Override // org.mapsforge.map.layer.Layer
    public void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        int i;
        int i2;
        long longitudeToTileX = MercatorProjection.longitudeToTileX(boundingBox.minLongitude, b);
        long latitudeToTileY = MercatorProjection.latitudeToTileY(boundingBox.maxLatitude, b);
        long longitudeToTileX2 = MercatorProjection.longitudeToTileX(boundingBox.maxLongitude, b);
        long latitudeToTileY2 = MercatorProjection.latitudeToTileY(boundingBox.minLatitude, b);
        int tileSize = this.displayModel.getTileSize();
        int tileToPixel = (int) (MercatorProjection.tileToPixel(longitudeToTileX, tileSize) - point.x);
        int tileToPixel2 = (int) (MercatorProjection.tileToPixel(latitudeToTileY, tileSize) - point.y);
        double tileToPixel3 = MercatorProjection.tileToPixel(longitudeToTileX2, tileSize) - point.x;
        double d = tileSize;
        int i3 = (int) (tileToPixel3 + d);
        int tileToPixel4 = (int) ((MercatorProjection.tileToPixel(latitudeToTileY2, tileSize) - point.y) + d);
        int i4 = tileToPixel;
        while (true) {
            i = i3 + 1;
            if (i4 > i) {
                break;
            }
            canvas.drawLine(i4, tileToPixel2, i4, tileToPixel4, this.paintBack);
            i4 += tileSize;
        }
        int i5 = tileToPixel2;
        while (true) {
            i2 = tileToPixel4 + 1;
            if (i5 > i2) {
                break;
            }
            canvas.drawLine(tileToPixel, i5, i3, i5, this.paintBack);
            i5 += tileSize;
        }
        for (int i6 = tileToPixel; i6 <= i; i6 += tileSize) {
            canvas.drawLine(i6, tileToPixel2, i6, tileToPixel4, this.paintFront);
        }
        while (tileToPixel2 <= i2) {
            canvas.drawLine(tileToPixel, tileToPixel2, i3, tileToPixel2, this.paintFront);
            tileToPixel2 += tileSize;
        }
    }
}
