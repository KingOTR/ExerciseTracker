package org.mapsforge.map.android.layers;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.layer.overlay.Circle;
import org.mapsforge.map.layer.overlay.Marker;

/* loaded from: classes5.dex */
public class MyLocationOverlay extends Layer {
    private final Circle circle;
    private final Marker marker;

    public MyLocationOverlay(Marker marker) {
        this(marker, null);
    }

    public MyLocationOverlay(Marker marker, Circle circle) {
        this.marker = marker;
        this.circle = circle;
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        Circle circle = this.circle;
        if (circle != null) {
            circle.draw(boundingBox, b, canvas, point);
        }
        this.marker.draw(boundingBox, b, canvas, point);
    }

    @Override // org.mapsforge.map.layer.Layer
    protected void onAdd() {
        Circle circle = this.circle;
        if (circle != null) {
            circle.setDisplayModel(this.displayModel);
        }
        this.marker.setDisplayModel(this.displayModel);
    }

    @Override // org.mapsforge.map.layer.Layer
    public void onDestroy() {
        this.marker.onDestroy();
    }

    public void setPosition(double d, double d2, float f) {
        synchronized (this) {
            LatLong latLong = new LatLong(d, d2);
            this.marker.setLatLong(latLong);
            Circle circle = this.circle;
            if (circle != null) {
                circle.setLatLong(latLong);
                this.circle.setRadius(f);
            }
            requestRedraw();
        }
    }
}
