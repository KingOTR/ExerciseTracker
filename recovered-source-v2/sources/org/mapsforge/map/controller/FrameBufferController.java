package org.mapsforge.map.controller;

import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.model.Model;
import org.mapsforge.map.model.common.Observer;
import org.mapsforge.map.view.FrameBuffer;

/* loaded from: classes5.dex */
public final class FrameBufferController implements Observer {
    private final FrameBuffer frameBuffer;
    private Dimension lastMapViewDimension;
    private double lastOverdrawFactor;
    private final Model model;

    public static FrameBufferController create(FrameBuffer frameBuffer, Model model) {
        FrameBufferController frameBufferController = new FrameBufferController(frameBuffer, model);
        model.frameBufferModel.addObserver(frameBufferController);
        model.mapViewDimension.addObserver(frameBufferController);
        model.mapViewPosition.addObserver(frameBufferController);
        model.displayModel.addObserver(frameBufferController);
        return frameBufferController;
    }

    public static Dimension calculateFrameBufferDimension(Dimension dimension, double d) {
        int i = (int) (dimension.width * d);
        int i2 = (int) (dimension.height * d);
        if (Parameters.SQUARE_FRAME_BUFFER) {
            i = Math.max(i, i2);
            i2 = i;
        }
        return new Dimension(i, i2);
    }

    private FrameBufferController(FrameBuffer frameBuffer, Model model) {
        this.frameBuffer = frameBuffer;
        this.model = model;
    }

    public void destroy() {
        this.model.displayModel.removeObserver(this);
        this.model.mapViewPosition.removeObserver(this);
        this.model.mapViewDimension.removeObserver(this);
        this.model.frameBufferModel.removeObserver(this);
    }

    @Override // org.mapsforge.map.model.common.Observer
    public void onChange() {
        Dimension dimension = this.model.mapViewDimension.getDimension();
        if (dimension == null) {
            return;
        }
        double overdrawFactor = this.model.frameBufferModel.getOverdrawFactor();
        if (dimensionChangeNeeded(dimension, overdrawFactor)) {
            Dimension calculateFrameBufferDimension = calculateFrameBufferDimension(dimension, overdrawFactor);
            if (!Parameters.SQUARE_FRAME_BUFFER || this.frameBuffer.getDimension() == null || calculateFrameBufferDimension.width > this.frameBuffer.getDimension().width || calculateFrameBufferDimension.height > this.frameBuffer.getDimension().height) {
                this.frameBuffer.setDimension(calculateFrameBufferDimension);
            }
            this.lastMapViewDimension = dimension;
            this.lastOverdrawFactor = overdrawFactor;
        }
        synchronized (this.model.mapViewPosition) {
            synchronized (this.frameBuffer) {
                MapPosition mapPosition = this.model.frameBufferModel.getMapPosition();
                if (mapPosition != null) {
                    adjustFrameBufferMatrix(mapPosition, dimension, this.model.mapViewPosition.getScaleFactor(), this.model.mapViewPosition.getPivot());
                }
            }
        }
    }

    private void adjustFrameBufferMatrix(MapPosition mapPosition, Dimension dimension, double d, LatLong latLong) {
        double d2;
        double d3;
        MapPosition mapPosition2 = this.model.mapViewPosition.getMapPosition();
        long mapSize = MercatorProjection.getMapSize(mapPosition.zoomLevel, this.model.displayModel.getTileSize());
        Point pixel = MercatorProjection.getPixel(mapPosition.latLong, mapSize);
        Point pixel2 = MercatorProjection.getPixel(mapPosition2.latLong, mapSize);
        double d4 = pixel.x - pixel2.x;
        double d5 = pixel.y - pixel2.y;
        if (latLong != null) {
            Point pixel3 = MercatorProjection.getPixel(latLong, mapSize);
            d2 = pixel3.x - pixel.x;
            d3 = pixel3.y - pixel.y;
        } else {
            d2 = 0.0d;
            d3 = 0.0d;
        }
        this.frameBuffer.adjustMatrix((float) d4, (float) d5, (float) (d / Math.pow(2.0d, mapPosition.zoomLevel)), dimension, (float) d2, (float) d3);
    }

    private boolean dimensionChangeNeeded(Dimension dimension, double d) {
        return (Double.compare(d, this.lastOverdrawFactor) == 0 && dimension.equals(this.lastMapViewDimension)) ? false : true;
    }
}
