package org.mapsforge.map.layer.overlay;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.FillRule;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Path;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.LatLongUtils;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.Layer;

/* loaded from: classes5.dex */
public class Polygon extends Layer {
    private BoundingBox boundingBox;
    private final GraphicFactory graphicFactory;
    private List<List<LatLong>> holes;
    private final boolean keepAligned;
    private final List<LatLong> latLongs;
    private Paint paintFill;
    private Paint paintStroke;

    public Polygon(Paint paint, Paint paint2, GraphicFactory graphicFactory) {
        this(paint, paint2, graphicFactory, false);
    }

    public Polygon(Paint paint, Paint paint2, GraphicFactory graphicFactory, boolean z) {
        this.latLongs = new CopyOnWriteArrayList();
        this.keepAligned = z;
        this.paintFill = paint;
        this.paintStroke = paint2;
        this.graphicFactory = graphicFactory;
    }

    public synchronized void addPoint(LatLong latLong) {
        this.latLongs.add(latLong);
        updatePoints();
    }

    public synchronized void addPoints(List<LatLong> list) {
        this.latLongs.addAll(list);
        updatePoints();
    }

    public synchronized void addHole(List<LatLong> list) {
        if (this.holes == null) {
            this.holes = new CopyOnWriteArrayList();
        }
        this.holes.add(new CopyOnWriteArrayList(list));
    }

    public synchronized void clear() {
        this.latLongs.clear();
        List<List<LatLong>> list = this.holes;
        if (list != null) {
            list.clear();
        }
        updatePoints();
    }

    public synchronized boolean contains(LatLong latLong) {
        boolean contains = LatLongUtils.contains(this.latLongs, latLong);
        List<List<LatLong>> list = this.holes;
        if (list != null && contains) {
            Iterator<List<LatLong>> it = list.iterator();
            while (it.hasNext()) {
                if (LatLongUtils.contains(it.next(), latLong)) {
                    return false;
                }
            }
            return true;
        }
        return contains;
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        if (this.latLongs.size() >= 2 && (this.paintStroke != null || this.paintFill != null)) {
            BoundingBox boundingBox2 = this.boundingBox;
            if (boundingBox2 == null || boundingBox2.intersects(boundingBox)) {
                Path createPath = this.graphicFactory.createPath();
                long mapSize = MercatorProjection.getMapSize(b, this.displayModel.getTileSize());
                addToPath(createPath, this.latLongs, mapSize, point);
                List<List<LatLong>> list = this.holes;
                if (list != null && !list.isEmpty()) {
                    createPath.setFillRule(FillRule.EVEN_ODD);
                    Iterator<List<LatLong>> it = this.holes.iterator();
                    while (it.hasNext()) {
                        addToPath(createPath, it.next(), mapSize, point);
                    }
                }
                Paint paint = this.paintStroke;
                if (paint != null) {
                    if (this.keepAligned) {
                        paint.setBitmapShaderShift(point);
                    }
                    canvas.drawPath(createPath, this.paintStroke);
                }
                Paint paint2 = this.paintFill;
                if (paint2 != null) {
                    if (this.keepAligned) {
                        paint2.setBitmapShaderShift(point);
                    }
                    canvas.drawPath(createPath, this.paintFill);
                }
            }
        }
    }

    private static void addToPath(Path path, List<LatLong> list, long j, Point point) {
        Iterator<LatLong> it = list.iterator();
        LatLong next = it.next();
        path.moveTo((float) (MercatorProjection.longitudeToPixelX(next.longitude, j) - point.x), (float) (MercatorProjection.latitudeToPixelY(next.latitude, j) - point.y));
        while (it.hasNext()) {
            LatLong next2 = it.next();
            path.lineTo((float) (MercatorProjection.longitudeToPixelX(next2.longitude, j) - point.x), (float) (MercatorProjection.latitudeToPixelY(next2.latitude, j) - point.y));
        }
        path.close();
    }

    public List<LatLong> getLatLongs() {
        return this.latLongs;
    }

    public synchronized Paint getPaintFill() {
        return this.paintFill;
    }

    public synchronized Paint getPaintStroke() {
        return this.paintStroke;
    }

    public boolean isKeepAligned() {
        return this.keepAligned;
    }

    public synchronized void setPaintFill(Paint paint) {
        this.paintFill = paint;
    }

    public synchronized void setPaintStroke(Paint paint) {
        this.paintStroke = paint;
    }

    public synchronized void setPoints(List<LatLong> list) {
        this.latLongs.clear();
        this.latLongs.addAll(list);
        updatePoints();
    }

    private void updatePoints() {
        this.boundingBox = this.latLongs.isEmpty() ? null : new BoundingBox(this.latLongs);
    }
}
