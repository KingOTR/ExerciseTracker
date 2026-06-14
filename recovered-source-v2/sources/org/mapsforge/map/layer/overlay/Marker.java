package org.mapsforge.map.layer.overlay;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.Layer;

/* loaded from: classes5.dex */
public class Marker extends Layer {
    private Bitmap bitmap;
    private int horizontalOffset;
    private LatLong latLong;
    private int verticalOffset;

    public Marker(LatLong latLong, Bitmap bitmap, int i, int i2) {
        this.latLong = latLong;
        this.bitmap = bitmap;
        this.horizontalOffset = i;
        this.verticalOffset = i2;
    }

    public synchronized boolean contains(Point point, Point point2) {
        double d;
        double max;
        double max2 = Math.max(this.displayModel.getScaleFactor() * 20.0f, this.bitmap.getWidth());
        d = max2 / 2.0d;
        max = Math.max(this.displayModel.getScaleFactor() * 20.0f, this.bitmap.getHeight()) / 2.0d;
        return new Rectangle(this.horizontalOffset + (point.x - d), (point.y - max) + this.verticalOffset, this.horizontalOffset + point.x + d, this.verticalOffset + point.y + max).contains(point2);
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        Bitmap bitmap;
        if (this.latLong != null && (bitmap = this.bitmap) != null && !bitmap.isDestroyed()) {
            long mapSize = MercatorProjection.getMapSize(b, this.displayModel.getTileSize());
            double longitudeToPixelX = MercatorProjection.longitudeToPixelX(this.latLong.longitude, mapSize);
            double latitudeToPixelY = MercatorProjection.latitudeToPixelY(this.latLong.latitude, mapSize);
            int width = this.bitmap.getWidth() / 2;
            int height = this.bitmap.getHeight() / 2;
            int i = (int) (((longitudeToPixelX - point.x) - width) + this.horizontalOffset);
            int i2 = (int) (((latitudeToPixelY - point.y) - height) + this.verticalOffset);
            if (new Rectangle(0.0d, 0.0d, canvas.getWidth(), canvas.getHeight()).intersects(new Rectangle(i, i2, this.bitmap.getWidth() + i, this.bitmap.getHeight() + i2))) {
                canvas.drawBitmap(this.bitmap, i, i2);
            }
        }
    }

    public synchronized Bitmap getBitmap() {
        return this.bitmap;
    }

    public synchronized int getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public synchronized LatLong getLatLong() {
        return this.latLong;
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized LatLong getPosition() {
        return this.latLong;
    }

    public synchronized int getVerticalOffset() {
        return this.verticalOffset;
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void onDestroy() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.decrementRefCount();
        }
    }

    public synchronized void setBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            Bitmap bitmap3 = this.bitmap;
            if (bitmap3 != null) {
                bitmap3.decrementRefCount();
            }
            this.bitmap = bitmap;
        }
    }

    public synchronized void setHorizontalOffset(int i) {
        this.horizontalOffset = i;
    }

    public synchronized void setLatLong(LatLong latLong) {
        this.latLong = latLong;
    }

    public synchronized void setVerticalOffset(int i) {
        this.verticalOffset = i;
    }
}
