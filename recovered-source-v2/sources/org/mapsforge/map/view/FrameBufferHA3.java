package org.mapsforge.map.view;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.GraphicContext;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.model.FrameBufferModel;
import org.mapsforge.map.view.FrameBufferBitmapHA3;

/* loaded from: classes5.dex */
public class FrameBufferHA3 extends FrameBuffer {
    private static final boolean IS_TRANSPARENT = false;
    private Dimension dimension;
    private final DisplayModel displayModel;
    private final FrameBufferModel frameBufferModel;
    private final FrameBufferBitmapHA3.Lock framesLock;
    private final GraphicFactory graphicFactory;
    private MapPosition lmMapPosition;
    private final Matrix matrix;
    private final FrameBufferBitmapHA3 lmBitmap = new FrameBufferBitmapHA3();
    private final FrameBufferBitmapHA3 odBitmap = new FrameBufferBitmapHA3();

    public FrameBufferHA3(FrameBufferModel frameBufferModel, DisplayModel displayModel, GraphicFactory graphicFactory) {
        FrameBufferBitmapHA3.Lock lock = new FrameBufferBitmapHA3.Lock();
        this.framesLock = lock;
        this.frameBufferModel = frameBufferModel;
        this.displayModel = displayModel;
        this.graphicFactory = graphicFactory;
        this.matrix = graphicFactory.createMatrix();
        lock.unlock();
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public void adjustMatrix(float f, float f2, float f3, Dimension dimension, float f4, float f5) {
        synchronized (this.matrix) {
            if (this.dimension == null) {
                return;
            }
            this.matrix.reset();
            centerFrameBufferToMapView(dimension);
            if (f4 == 0.0f && f5 == 0.0f) {
                this.matrix.translate(f, f2);
            }
            scale(f3, f4, f5);
        }
    }

    private void centerFrameBufferToMapView(Dimension dimension) {
        this.matrix.translate((this.dimension.width - dimension.width) / (-2.0f), (this.dimension.height - dimension.height) / (-2.0f));
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public synchronized void destroy() {
        synchronized (this.framesLock) {
            this.odBitmap.destroy();
            this.lmBitmap.destroy();
            this.framesLock.hardLock();
        }
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public void draw(GraphicContext graphicContext) {
        graphicContext.fillColor(this.displayModel.getBackgroundColor());
        swapBitmaps();
        synchronized (this.matrix) {
            Bitmap lock = this.odBitmap.lock();
            if (lock != null) {
                graphicContext.drawBitmap(lock, this.matrix);
            }
        }
        this.odBitmap.release();
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public void frameFinished(MapPosition mapPosition) {
        synchronized (this.framesLock) {
            this.lmMapPosition = mapPosition;
            this.lmBitmap.release();
            this.framesLock.lock();
        }
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public synchronized Dimension getDimension() {
        return this.dimension;
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public Bitmap getDrawingBitmap() {
        Bitmap lock;
        synchronized (this.framesLock) {
            this.framesLock.waitUntilUnlocked();
            lock = this.lmBitmap.lock();
            if (lock != null) {
                lock.setBackgroundColor(this.displayModel.getBackgroundColor());
            }
        }
        return lock;
    }

    private void scale(float f, float f2, float f3) {
        if (f != 1.0f) {
            Point center = this.dimension.getCenter();
            this.matrix.scale(f, f, (float) (f2 + center.x), (float) (f3 + center.y));
        }
    }

    @Override // org.mapsforge.map.view.FrameBuffer
    public void setDimension(Dimension dimension) {
        synchronized (this.matrix) {
            Dimension dimension2 = this.dimension;
            if (dimension2 == null || !dimension2.equals(dimension)) {
                this.dimension = dimension;
                synchronized (this.framesLock) {
                    this.odBitmap.create(this.graphicFactory, dimension, this.displayModel.getBackgroundColor(), false);
                    this.lmBitmap.create(this.graphicFactory, dimension, this.displayModel.getBackgroundColor(), false);
                }
            }
        }
    }

    private void swapBitmaps() {
        synchronized (this.framesLock) {
            if (this.framesLock.isSoftLocked()) {
                FrameBufferBitmapHA3.swap(this.odBitmap, this.lmBitmap);
                this.frameBufferModel.setMapPosition(this.lmMapPosition);
                this.framesLock.unlock();
            }
        }
    }
}
