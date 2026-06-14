package org.mapsforge.map.layer.overlay;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.Layer;

/* loaded from: classes5.dex */
public class Circle extends Layer {
    private final boolean keepAligned;
    private LatLong latLong;
    private Paint paintFill;
    private Paint paintStroke;
    private float radius;

    public Circle(LatLong latLong, float f, Paint paint, Paint paint2) {
        this(latLong, f, paint, paint2, false);
    }

    public Circle(LatLong latLong, float f, Paint paint, Paint paint2, boolean z) {
        this.keepAligned = z;
        this.latLong = latLong;
        setRadiusInternal(f);
        this.paintFill = paint;
        this.paintStroke = paint2;
    }

    public synchronized boolean contains(Point point, Point point2, double d, byte b) {
        return point.distance(point2) < ((double) Math.max(this.displayModel.getScaleFactor() * 10.0f, (float) getRadiusInPixels(d, b)));
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        LatLong latLong = this.latLong;
        if (latLong != null && (this.paintStroke != null || this.paintFill != null)) {
            double d = latLong.latitude;
            double d2 = this.latLong.longitude;
            long mapSize = MercatorProjection.getMapSize(b, this.displayModel.getTileSize());
            int longitudeToPixelX = (int) (MercatorProjection.longitudeToPixelX(d2, mapSize) - point.x);
            int latitudeToPixelY = (int) (MercatorProjection.latitudeToPixelY(d, mapSize) - point.y);
            int radiusInPixels = getRadiusInPixels(d, b);
            if (new Rectangle(0.0d, 0.0d, canvas.getWidth(), canvas.getHeight()).intersectsCircle(longitudeToPixelX, latitudeToPixelY, radiusInPixels)) {
                Paint paint = this.paintStroke;
                if (paint != null) {
                    if (this.keepAligned) {
                        paint.setBitmapShaderShift(point);
                    }
                    canvas.drawCircle(longitudeToPixelX, latitudeToPixelY, radiusInPixels, this.paintStroke);
                }
                Paint paint2 = this.paintFill;
                if (paint2 != null) {
                    if (this.keepAligned) {
                        paint2.setBitmapShaderShift(point);
                    }
                    canvas.drawCircle(longitudeToPixelX, latitudeToPixelY, radiusInPixels, this.paintFill);
                }
            }
        }
    }

    public synchronized Paint getPaintFill() {
        return this.paintFill;
    }

    public synchronized Paint getPaintStroke() {
        return this.paintStroke;
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized LatLong getPosition() {
        return this.latLong;
    }

    public synchronized float getRadius() {
        return this.radius;
    }

    protected int getRadiusInPixels(double d, byte b) {
        return (int) MercatorProjection.metersToPixels(this.radius, d, MercatorProjection.getMapSize(b, this.displayModel.getTileSize()));
    }

    public boolean isKeepAligned() {
        return this.keepAligned;
    }

    public synchronized void setLatLong(LatLong latLong) {
        this.latLong = latLong;
    }

    public synchronized void setPaintFill(Paint paint) {
        this.paintFill = paint;
    }

    public synchronized void setPaintStroke(Paint paint) {
        this.paintStroke = paint;
    }

    public synchronized void setRadius(float f) {
        setRadiusInternal(f);
    }

    private void setRadiusInternal(float f) {
        if (f < 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
        this.radius = f;
    }
}
