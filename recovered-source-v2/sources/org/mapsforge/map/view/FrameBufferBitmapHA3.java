package org.mapsforge.map.view;

import java.util.logging.Logger;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.model.Dimension;

/* loaded from: classes5.dex */
class FrameBufferBitmapHA3 {
    private static final Logger LOGGER = Logger.getLogger(FrameBufferBitmapHA3.class.getName());
    private Bitmap bitmap = null;
    private BitmapRequest bitmapRequest = null;
    private final Object bitmapRequestSync = new Object();
    private final Lock frameLock = new Lock();

    FrameBufferBitmapHA3() {
    }

    private static class BitmapRequest {
        private final int color;
        private final Dimension dimension;
        private final GraphicFactory factory;
        private final boolean isTransparent;

        BitmapRequest(GraphicFactory graphicFactory, Dimension dimension, int i, boolean z) {
            this.factory = graphicFactory;
            this.dimension = dimension;
            this.color = i;
            this.isTransparent = z;
        }

        Bitmap create() {
            if (this.dimension.width <= 0 || this.dimension.height <= 0) {
                return null;
            }
            Bitmap createBitmap = this.factory.createBitmap(this.dimension.width, this.dimension.height, this.isTransparent);
            createBitmap.setBackgroundColor(this.color);
            return createBitmap;
        }
    }

    static class Lock {
        private static final int HARD_LOCKED = -1;
        private static final int SOFT_LOCKED = 1;
        private static final int UNLOCKED = 0;
        private int state = 0;

        Lock() {
        }

        synchronized void hardLock() {
            this.state = -1;
            notifyAll();
        }

        synchronized boolean isHardLocked() {
            return this.state == -1;
        }

        synchronized boolean isSoftLocked() {
            return this.state == 1;
        }

        synchronized boolean isUnlocked() {
            return this.state == 0;
        }

        synchronized void lock() {
            if (this.state == 0) {
                this.state = 1;
            }
        }

        synchronized void unlock() {
            if (this.state == 1) {
                this.state = 0;
            }
            notifyAll();
        }

        synchronized void waitUntilUnlocked() {
            while (this.state == 1) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    FrameBufferBitmapHA3.LOGGER.fine("Frame buffer interrupted");
                }
            }
        }
    }

    void create(GraphicFactory graphicFactory, Dimension dimension, int i, boolean z) {
        synchronized (this.frameLock) {
            if (!this.frameLock.isHardLocked()) {
                synchronized (this.bitmapRequestSync) {
                    this.bitmapRequest = new BitmapRequest(graphicFactory, dimension, i, z);
                }
            }
        }
    }

    private void createBitmapIfRequested() {
        synchronized (this.bitmapRequestSync) {
            if (this.bitmapRequest != null) {
                destroyBitmap();
                this.bitmap = this.bitmapRequest.create();
                this.bitmapRequest = null;
            }
        }
    }

    void destroy() {
        synchronized (this.frameLock) {
            if (this.bitmap != null) {
                destroyBitmap();
                this.frameLock.hardLock();
            }
        }
    }

    private void destroyBitmap() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.decrementRefCount();
            this.bitmap = null;
        }
    }

    Bitmap lock() {
        Bitmap bitmap;
        synchronized (this.frameLock) {
            if (this.frameLock.isUnlocked()) {
                createBitmapIfRequested();
                if (this.bitmap != null) {
                    this.frameLock.lock();
                }
            }
            bitmap = this.bitmap;
        }
        return bitmap;
    }

    void release() {
        synchronized (this.frameLock) {
            this.frameLock.unlock();
        }
    }

    static void swap(FrameBufferBitmapHA3 frameBufferBitmapHA3, FrameBufferBitmapHA3 frameBufferBitmapHA32) {
        Bitmap bitmap = frameBufferBitmapHA3.bitmap;
        frameBufferBitmapHA3.bitmap = frameBufferBitmapHA32.bitmap;
        frameBufferBitmapHA32.bitmap = bitmap;
        BitmapRequest bitmapRequest = frameBufferBitmapHA3.bitmapRequest;
        frameBufferBitmapHA3.bitmapRequest = frameBufferBitmapHA32.bitmapRequest;
        frameBufferBitmapHA32.bitmapRequest = bitmapRequest;
    }
}
