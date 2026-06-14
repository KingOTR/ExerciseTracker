package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import org.maplibre.android.maps.renderer.egl.EGLLogWrapper;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

/* loaded from: classes5.dex */
public class MapLibreGLSurfaceView extends MapLibreSurfaceView {
    private GLSurfaceView.EGLConfigChooser eglConfigChooser;
    private GLSurfaceView.EGLContextFactory eglContextFactory;
    private GLSurfaceView.EGLWindowSurfaceFactory eglWindowSurfaceFactory;
    private boolean preserveEGLContextOnPause;
    protected final WeakReference<MapLibreGLSurfaceView> viewWeakReference;

    public MapLibreGLSurfaceView(Context context) {
        super(context);
        this.viewWeakReference = new WeakReference<>(this);
    }

    public MapLibreGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewWeakReference = new WeakReference<>(this);
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.preserveEGLContextOnPause = z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.preserveEGLContextOnPause;
    }

    @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView
    public void setRenderer(SurfaceViewMapRenderer surfaceViewMapRenderer) {
        if (this.eglConfigChooser == null) {
            throw new IllegalStateException("No eglConfigChooser provided");
        }
        if (this.eglContextFactory == null) {
            throw new IllegalStateException("No eglContextFactory provided");
        }
        if (this.eglWindowSurfaceFactory == null) {
            throw new IllegalStateException("No eglWindowSurfaceFactory provided");
        }
        super.setRenderer(surfaceViewMapRenderer);
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.eglContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.eglWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.eglConfigChooser = eGLConfigChooser;
    }

    @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView
    protected void createRenderThread() {
        this.renderThread = new GLThread(this.viewWeakReference);
    }

    private static class EglHelper {
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference<MapLibreGLSurfaceView> mGLSurfaceViewWeakRef;

        private EglHelper(WeakReference<MapLibreGLSurfaceView> weakReference) {
            this.mGLSurfaceViewWeakRef = weakReference;
        }

        public void start() {
            EGLDisplay eglGetDisplay;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                this.mEgl = egl10;
                eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.mEglDisplay = eglGetDisplay;
            } catch (Exception e) {
                Log.e("MapLibreSurfaceView", "createContext failed: ", e);
            }
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                Log.e("MapLibreSurfaceView", "eglGetDisplay failed");
                return;
            }
            if (!this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                Log.e("MapLibreSurfaceView", "eglInitialize failed");
                return;
            }
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.mGLSurfaceViewWeakRef.get();
            if (mapLibreGLSurfaceView == null) {
                this.mEglConfig = null;
                this.mEglContext = null;
            } else {
                EGLConfig chooseConfig = mapLibreGLSurfaceView.eglConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                this.mEglConfig = chooseConfig;
                if (chooseConfig == null) {
                    Log.e("MapLibreSurfaceView", "failed to select an EGL configuration");
                    return;
                }
                this.mEglContext = mapLibreGLSurfaceView.eglContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
            }
            EGLContext eGLContext = this.mEglContext;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.mEglContext = null;
                Log.e("MapLibreSurfaceView", "createContext failed");
                return;
            }
            this.mEglSurface = null;
        }

        boolean createSurface() {
            if (this.mEgl == null) {
                Log.e("MapLibreSurfaceView", "egl not initialized");
                return false;
            }
            if (this.mEglDisplay == null) {
                Log.e("MapLibreSurfaceView", "eglDisplay not initialized");
                return false;
            }
            if (this.mEglConfig == null) {
                Log.e("MapLibreSurfaceView", "mEglConfig not initialized");
                return false;
            }
            destroySurfaceImp();
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.mGLSurfaceViewWeakRef.get();
            if (mapLibreGLSurfaceView != null) {
                this.mEglSurface = mapLibreGLSurfaceView.eglWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, mapLibreGLSurfaceView.getHolder());
            } else {
                this.mEglSurface = null;
            }
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.mEgl.eglGetError() == 12299) {
                    Log.e("MapLibreSurfaceView", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            EGL10 egl10 = this.mEgl;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface2 = this.mEglSurface;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                return true;
            }
            logEglErrorAsWarning("MapLibreSurfaceView", "eglMakeCurrent", this.mEgl.eglGetError());
            return false;
        }

        GL createGL() {
            return this.mEglContext.getGL();
        }

        public int swap() {
            if (this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return 12288;
            }
            return this.mEgl.eglGetError();
        }

        void destroySurface() {
            destroySurfaceImp();
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            MapLibreGLSurfaceView mapLibreGLSurfaceView = this.mGLSurfaceViewWeakRef.get();
            if (mapLibreGLSurfaceView != null) {
                mapLibreGLSurfaceView.eglWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }

        public void finish() {
            if (this.mEglContext != null) {
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.mGLSurfaceViewWeakRef.get();
                if (mapLibreGLSurfaceView != null) {
                    mapLibreGLSurfaceView.eglContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        static void logEglErrorAsWarning(String str, String str2, int i) {
            Log.w(str, formatEglError(str2, i));
        }

        static String formatEglError(String str, int i) {
            return str + " failed: " + EGLLogWrapper.getErrorString(i);
        }
    }

    static class GLThread extends MapLibreSurfaceView.RenderThread {
        private EglHelper eglHelper;
        private boolean finishedCreatingEglSurface;
        private boolean haveEglContext;
        private boolean haveEglSurface;
        protected WeakReference<MapLibreGLSurfaceView> mSurfaceViewWeakRef;
        private boolean shouldReleaseEglContext;
        private boolean surfaceIsBad;

        GLThread(WeakReference<MapLibreGLSurfaceView> weakReference) {
            super(weakReference.get().renderThreadManager);
            this.mSurfaceViewWeakRef = weakReference;
        }

        private void stopEglSurfaceLocked() {
            if (this.haveEglSurface) {
                this.haveEglSurface = false;
                this.eglHelper.destroySurface();
            }
        }

        private void stopEglContextLocked() {
            if (this.haveEglContext) {
                this.eglHelper.finish();
                this.haveEglContext = false;
                this.renderThreadManager.notifyAll();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:188:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void guardedRun() throws InterruptedException {
            boolean z;
            Runnable runnable;
            boolean z2;
            boolean z3;
            MapLibreGLSurfaceView mapLibreGLSurfaceView;
            this.eglHelper = new EglHelper(this.mSurfaceViewWeakRef);
            this.haveEglContext = false;
            this.haveEglSurface = false;
            this.wantRenderNotification = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            int i = 0;
            int i2 = 0;
            Runnable runnable2 = null;
            Runnable runnable3 = null;
            while (true) {
                try {
                    synchronized (this.renderThreadManager) {
                        while (!this.shouldExit) {
                            if (this.eventQueue.isEmpty()) {
                                if (this.paused != this.requestPaused) {
                                    z3 = this.requestPaused;
                                    this.paused = this.requestPaused;
                                    this.renderThreadManager.notifyAll();
                                } else {
                                    z3 = false;
                                }
                                if (this.shouldReleaseEglContext) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    this.shouldReleaseEglContext = false;
                                    z6 = true;
                                }
                                if (z4) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    z4 = false;
                                }
                                if (z3 && this.haveEglSurface) {
                                    stopEglSurfaceLocked();
                                }
                                if (z3 && this.haveEglContext && ((mapLibreGLSurfaceView = this.mSurfaceViewWeakRef.get()) == null || !mapLibreGLSurfaceView.preserveEGLContextOnPause)) {
                                    stopEglContextLocked();
                                }
                                if (!this.hasSurface && !this.waitingForSurface) {
                                    if (this.haveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    this.waitingForSurface = true;
                                    this.surfaceIsBad = false;
                                    this.renderThreadManager.notifyAll();
                                }
                                if (this.hasSurface && this.waitingForSurface) {
                                    this.waitingForSurface = false;
                                    this.renderThreadManager.notifyAll();
                                }
                                if (z5) {
                                    this.wantRenderNotification = false;
                                    this.renderComplete = true;
                                    this.renderThreadManager.notifyAll();
                                    z5 = false;
                                }
                                if (this.finishDrawingRunnable != null) {
                                    runnable2 = this.finishDrawingRunnable;
                                    this.finishDrawingRunnable = null;
                                }
                                if (readyToDraw()) {
                                    if (!this.haveEglContext) {
                                        if (z6) {
                                            z6 = false;
                                        } else {
                                            try {
                                                this.eglHelper.start();
                                                this.haveEglContext = true;
                                                this.renderThreadManager.notifyAll();
                                                z7 = true;
                                            } catch (RuntimeException unused) {
                                                this.renderThreadManager.notifyAll();
                                                synchronized (this.renderThreadManager) {
                                                    stopEglSurfaceLocked();
                                                    stopEglContextLocked();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    if (this.haveEglContext && !this.haveEglSurface) {
                                        this.haveEglSurface = true;
                                        z8 = true;
                                        z9 = true;
                                        z10 = true;
                                    }
                                    if (this.haveEglSurface) {
                                        if (this.sizeChanged) {
                                            i = this.width;
                                            i2 = this.height;
                                            this.wantRenderNotification = true;
                                            this.sizeChanged = false;
                                            z = false;
                                            z8 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.requestRender = z;
                                        this.renderThreadManager.notifyAll();
                                        if (this.wantRenderNotification) {
                                            z11 = true;
                                        }
                                    }
                                } else if (runnable2 != null) {
                                    Log.w("MapLibreSurfaceView", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                    runnable2.run();
                                    runnable2 = null;
                                }
                                this.renderThreadManager.wait();
                            } else {
                                runnable3 = this.eventQueue.remove(0);
                                z = false;
                            }
                        }
                        synchronized (this.renderThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                        }
                        return;
                    }
                } catch (Throwable th) {
                    synchronized (this.renderThreadManager) {
                    }
                }
                if (runnable3 != null) {
                    runnable3.run();
                    runnable3 = null;
                } else {
                    if (z8) {
                        if (this.eglHelper.createSurface()) {
                            synchronized (this.renderThreadManager) {
                                this.finishedCreatingEglSurface = true;
                                this.renderThreadManager.notifyAll();
                            }
                            z8 = z;
                        } else {
                            synchronized (this.renderThreadManager) {
                                this.finishedCreatingEglSurface = true;
                                this.surfaceIsBad = true;
                                this.renderThreadManager.notifyAll();
                            }
                        }
                        synchronized (this.renderThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            throw th;
                        }
                    }
                    if (z9) {
                        z9 = z;
                    }
                    if (z7) {
                        MapLibreGLSurfaceView mapLibreGLSurfaceView2 = this.mSurfaceViewWeakRef.get();
                        if (mapLibreGLSurfaceView2 != null) {
                            runnable = null;
                            mapLibreGLSurfaceView2.renderer.onSurfaceCreated(null);
                        } else {
                            runnable = null;
                        }
                        z7 = z;
                    } else {
                        runnable = null;
                    }
                    if (z10) {
                        MapLibreGLSurfaceView mapLibreGLSurfaceView3 = this.mSurfaceViewWeakRef.get();
                        if (mapLibreGLSurfaceView3 != null) {
                            mapLibreGLSurfaceView3.renderer.onSurfaceChanged(i, i2);
                        }
                        z10 = z;
                    }
                    MapLibreGLSurfaceView mapLibreGLSurfaceView4 = this.mSurfaceViewWeakRef.get();
                    if (mapLibreGLSurfaceView4 != null) {
                        mapLibreGLSurfaceView4.renderer.onDrawFrame();
                        if (runnable2 != null) {
                            runnable2.run();
                            runnable2 = runnable;
                        }
                    }
                    int swap = this.eglHelper.swap();
                    if (swap == 12288) {
                        z2 = true;
                    } else if (swap != 12302) {
                        EglHelper.logEglErrorAsWarning("MapLibreSurfaceView", "eglSwapBuffers", swap);
                        synchronized (this.renderThreadManager) {
                            z2 = true;
                            this.surfaceIsBad = true;
                            this.renderThreadManager.notifyAll();
                        }
                    } else {
                        z2 = true;
                        z4 = true;
                    }
                    if (z11) {
                        z5 = z2;
                        z11 = false;
                    }
                }
            }
        }

        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        protected boolean readyToDraw() {
            return super.readyToDraw() && !this.surfaceIsBad;
        }

        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        public boolean ableToDraw() {
            return this.haveEglContext && this.haveEglSurface && readyToDraw();
        }

        @Override // org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.RenderThread
        public void surfaceCreated() {
            synchronized (this.renderThreadManager) {
                this.hasSurface = true;
                this.finishedCreatingEglSurface = false;
                this.renderThreadManager.notifyAll();
                while (this.waitingForSurface && !this.finishedCreatingEglSurface && !this.exited) {
                    try {
                        this.renderThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.shouldReleaseEglContext = true;
            this.renderThreadManager.notifyAll();
        }
    }
}
