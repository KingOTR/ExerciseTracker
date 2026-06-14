package org.mapsforge.map.layer;

import androidx.compose.animation.core.AnimationKt;
import java.util.Iterator;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.model.IMapViewPosition;
import org.mapsforge.map.util.MapPositionUtil;
import org.mapsforge.map.util.PausableThread;
import org.mapsforge.map.view.FrameBuffer;
import org.mapsforge.map.view.MapView;

/* loaded from: classes5.dex */
public class LayerManager extends PausableThread implements Redrawer {
    private static final int MILLISECONDS_PER_FRAME = 30;
    private final Canvas drawingCanvas;
    private final Layers layers;
    private final MapView mapView;
    private final IMapViewPosition mapViewPosition;
    private boolean redrawNeeded;

    public LayerManager(MapView mapView, IMapViewPosition iMapViewPosition, GraphicFactory graphicFactory) {
        this.mapView = mapView;
        this.mapViewPosition = iMapViewPosition;
        this.drawingCanvas = graphicFactory.createCanvas();
        this.layers = new Layers(this, mapView.getModel().displayModel);
        this.waitForWork = true;
    }

    public Layers getLayers() {
        return this.layers;
    }

    @Override // org.mapsforge.map.layer.Redrawer
    public void redrawLayers() {
        this.redrawNeeded = true;
        synchronized (this) {
            notify();
        }
    }

    @Override // org.mapsforge.map.util.PausableThread
    protected void afterRun() {
        synchronized (this.layers) {
            Iterator<Layer> it = this.layers.iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
        }
        this.drawingCanvas.destroy();
    }

    @Override // org.mapsforge.map.util.PausableThread
    protected void doWork() throws InterruptedException {
        long nanoTime = System.nanoTime();
        this.redrawNeeded = false;
        FrameBuffer frameBuffer = this.mapView.getFrameBuffer();
        Bitmap drawingBitmap = frameBuffer.getDrawingBitmap();
        if (drawingBitmap != null) {
            this.drawingCanvas.setBitmap(drawingBitmap);
            MapPosition mapPosition = this.mapViewPosition.getMapPosition();
            Dimension dimension = this.drawingCanvas.getDimension();
            int tileSize = this.mapView.getModel().displayModel.getTileSize();
            BoundingBox boundingBox = MapPositionUtil.getBoundingBox(mapPosition, dimension, tileSize);
            Point topLeftPoint = MapPositionUtil.getTopLeftPoint(mapPosition, dimension, tileSize);
            synchronized (this.layers) {
                Iterator<Layer> it = this.layers.iterator();
                while (it.hasNext()) {
                    Layer next = it.next();
                    if (next.isVisible()) {
                        next.draw(boundingBox, mapPosition.zoomLevel, this.drawingCanvas, topLeftPoint);
                    }
                }
            }
            if (!this.mapViewPosition.animationInProgress()) {
                frameBuffer.frameFinished(mapPosition);
                this.mapView.repaint();
            } else {
                this.redrawNeeded = true;
            }
        }
        long nanoTime2 = 30 - ((System.nanoTime() - nanoTime) / AnimationKt.MillisToNanos);
        if (nanoTime2 <= 1 || isInterrupted()) {
            return;
        }
        sleep(nanoTime2);
    }

    @Override // org.mapsforge.map.util.PausableThread
    protected PausableThread.ThreadPriority getThreadPriority() {
        return PausableThread.ThreadPriority.NORMAL;
    }

    @Override // org.mapsforge.map.util.PausableThread
    protected boolean hasWork() {
        return this.redrawNeeded;
    }
}
