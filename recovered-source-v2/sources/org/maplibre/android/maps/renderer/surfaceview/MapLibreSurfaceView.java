package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import org.maplibre.android.maps.renderer.MapRenderer;

/* loaded from: classes5.dex */
public abstract class MapLibreSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {
    protected static final String TAG = "MapLibreSurfaceView";
    protected boolean detached;
    protected OnSurfaceViewDetachedListener detachedListener;
    protected RenderThread renderThread;
    protected final RenderThreadManager renderThreadManager;
    protected SurfaceViewMapRenderer renderer;

    public interface OnSurfaceViewDetachedListener {
        void onSurfaceViewDetached();
    }

    protected abstract void createRenderThread();

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public MapLibreSurfaceView(Context context) {
        super(context);
        this.renderThreadManager = new RenderThreadManager();
        init();
    }

    public MapLibreSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.renderThreadManager = new RenderThreadManager();
        init();
    }

    private void init() {
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    protected void finalize() throws Throwable {
        try {
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public void setDetachedListener(OnSurfaceViewDetachedListener onSurfaceViewDetachedListener) {
        if (this.detachedListener != null) {
            throw new IllegalArgumentException("Detached from window listener has been already set.");
        }
        this.detachedListener = onSurfaceViewDetachedListener;
    }

    public void setRenderer(SurfaceViewMapRenderer surfaceViewMapRenderer) {
        checkRenderThreadState();
        this.renderer = surfaceViewMapRenderer;
        createRenderThread();
        this.renderThread.start();
    }

    public void setRenderingRefreshMode(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
        this.renderThread.setRenderingRefreshMode(renderingRefreshMode);
    }

    public MapRenderer.RenderingRefreshMode getRenderingRefreshMode() {
        return this.renderThread.getRenderingRefreshMode();
    }

    public void requestRender() {
        this.renderThread.requestRender();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.renderThread.surfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.renderThread.surfaceDestroyed();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.renderThread.onWindowResize(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        RenderThread renderThread = this.renderThread;
        if (renderThread != null) {
            renderThread.requestRenderAndNotify(runnable);
        }
    }

    public void onPause() {
        this.renderThread.onPause();
    }

    public void onResume() {
        this.renderThread.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.renderThread.queueEvent(runnable);
    }

    public void waitForEmpty() {
        this.renderThread.waitForEmpty();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.detached && this.renderer != null) {
            MapRenderer.RenderingRefreshMode renderingRefreshMode = MapRenderer.RenderingRefreshMode.WHEN_DIRTY;
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderingRefreshMode = renderThread.getRenderingRefreshMode();
            }
            createRenderThread();
            if (renderingRefreshMode != MapRenderer.RenderingRefreshMode.WHEN_DIRTY) {
                this.renderThread.setRenderingRefreshMode(renderingRefreshMode);
            }
            this.renderThread.start();
        }
        this.detached = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        OnSurfaceViewDetachedListener onSurfaceViewDetachedListener = this.detachedListener;
        if (onSurfaceViewDetachedListener != null) {
            onSurfaceViewDetachedListener.onSurfaceViewDetached();
        }
        RenderThread renderThread = this.renderThread;
        if (renderThread != null) {
            renderThread.requestExitAndWait();
        }
        this.detached = true;
        super.onDetachedFromWindow();
    }

    static abstract class RenderThread extends Thread {
        protected boolean exited;
        protected boolean hasSurface;
        protected boolean paused;
        protected boolean renderComplete;
        protected RenderThreadManager renderThreadManager;
        protected boolean requestPaused;
        protected boolean shouldExit;
        protected boolean waitingForSurface;
        protected ArrayList<Runnable> eventQueue = new ArrayList<>();
        protected boolean sizeChanged = true;
        protected Runnable finishDrawingRunnable = null;
        protected int width = 0;
        protected int height = 0;
        protected boolean requestRender = true;
        protected MapRenderer.RenderingRefreshMode renderMode = MapRenderer.RenderingRefreshMode.WHEN_DIRTY;
        protected boolean wantRenderNotification = false;

        protected abstract void guardedRun() throws InterruptedException;

        RenderThread(RenderThreadManager renderThreadManager) {
            this.renderThreadManager = null;
            this.renderThreadManager = renderThreadManager;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("RenderThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.renderThreadManager.threadExiting(this);
                throw th;
            }
            this.renderThreadManager.threadExiting(this);
        }

        protected boolean readyToDraw() {
            return !this.paused && this.hasSurface && this.width > 0 && this.height > 0 && (this.requestRender || this.renderMode == MapRenderer.RenderingRefreshMode.CONTINUOUS);
        }

        public boolean ableToDraw() {
            return readyToDraw();
        }

        public void setRenderingRefreshMode(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
            synchronized (this.renderThreadManager) {
                this.renderMode = renderingRefreshMode;
                this.renderThreadManager.notifyAll();
            }
        }

        public MapRenderer.RenderingRefreshMode getRenderingRefreshMode() {
            MapRenderer.RenderingRefreshMode renderingRefreshMode;
            synchronized (this.renderThreadManager) {
                renderingRefreshMode = this.renderMode;
            }
            return renderingRefreshMode;
        }

        public void requestRender() {
            synchronized (this.renderThreadManager) {
                this.requestRender = true;
                this.renderThreadManager.notifyAll();
            }
        }

        public void requestRenderAndNotify(Runnable runnable) {
            synchronized (this.renderThreadManager) {
                if (Thread.currentThread() == this) {
                    return;
                }
                this.wantRenderNotification = true;
                this.requestRender = true;
                this.renderComplete = false;
                this.finishDrawingRunnable = runnable;
                this.renderThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (this.renderThreadManager) {
                this.hasSurface = true;
                this.renderThreadManager.notifyAll();
                while (!this.exited && this.waitingForSurface) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (this.renderThreadManager) {
                this.hasSurface = false;
                this.renderThreadManager.notifyAll();
                while (!this.exited && !this.waitingForSurface) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onPause() {
            synchronized (this.renderThreadManager) {
                this.requestPaused = true;
                this.renderThreadManager.notifyAll();
                while (!this.exited && !this.paused) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (this.renderThreadManager) {
                this.requestPaused = false;
                this.requestRender = true;
                this.renderComplete = false;
                this.renderThreadManager.notifyAll();
                while (!this.exited && this.paused && !this.renderComplete) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            synchronized (this.renderThreadManager) {
                this.width = i;
                this.height = i2;
                this.sizeChanged = true;
                this.requestRender = true;
                this.renderComplete = false;
                if (Thread.currentThread() == this) {
                    return;
                }
                this.renderThreadManager.notifyAll();
                while (!this.exited && !this.paused && !this.renderComplete && ableToDraw()) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestExitAndWait() {
            synchronized (this.renderThreadManager) {
                this.shouldExit = true;
                this.renderThreadManager.notifyAll();
                while (!this.exited) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void queueEvent(Runnable runnable) {
            synchronized (this.renderThreadManager) {
                this.eventQueue.add(runnable);
                this.renderThreadManager.notifyAll();
            }
        }

        public void waitForEmpty() {
            synchronized (this.renderThreadManager) {
                while (!this.eventQueue.isEmpty()) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    protected void checkRenderThreadState() {
        if (this.renderThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    protected static class RenderThreadManager {
        protected RenderThreadManager() {
        }

        synchronized void threadExiting(RenderThread renderThread) {
            renderThread.exited = true;
            notifyAll();
        }
    }
}
