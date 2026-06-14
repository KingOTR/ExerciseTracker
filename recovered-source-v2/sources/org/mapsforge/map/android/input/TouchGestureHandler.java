package org.mapsforge.map.android.input;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.Scroller;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.android.view.MapView;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.layer.Layers;
import org.mapsforge.map.model.IMapViewPosition;

/* loaded from: classes5.dex */
public class TouchGestureHandler extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener, Runnable {
    private int flingLastX;
    private int flingLastY;
    private final Scroller flinger;
    private float focusX;
    private float focusY;
    private boolean isInDoubleTap;
    private boolean isInScale;
    private final MapView mapView;
    private LatLong pivot;
    private float scaleFactorCumulative;
    private boolean doubleTapEnabled = true;
    private final Handler handler = new Handler(Looper.myLooper());
    private boolean scaleEnabled = true;

    public TouchGestureHandler(MapView mapView) {
        this.mapView = mapView;
        this.flinger = new Scroller(mapView.getContext());
    }

    public void destroy() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public boolean isDoubleTapEnabled() {
        return this.doubleTapEnabled;
    }

    public boolean isScaleEnabled() {
        return this.scaleEnabled;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (!this.scaleEnabled) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.isInDoubleTap = true;
        } else if (actionMasked == 1 && this.isInDoubleTap) {
            IMapViewPosition iMapViewPosition = this.mapView.getModel().mapViewPosition;
            if (this.doubleTapEnabled && iMapViewPosition.getZoomLevel() < iMapViewPosition.getZoomLevelMax()) {
                Point center = this.mapView.getModel().mapViewDimension.getDimension().getCenter();
                double d = 1;
                double x = (center.x - motionEvent.getX()) / Math.pow(2.0d, d);
                double y = (center.y - motionEvent.getY()) / Math.pow(2.0d, d);
                LatLong fromPixels = this.mapView.getMapViewProjection().fromPixels(motionEvent.getX(), motionEvent.getY());
                if (fromPixels != null) {
                    this.mapView.onMoveEvent();
                    this.mapView.onZoomEvent();
                    iMapViewPosition.setPivot(fromPixels);
                    iMapViewPosition.moveCenterAndZoom(x, y, (byte) 1);
                }
            }
            this.isInDoubleTap = false;
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.isInScale = false;
        this.flinger.forceFinished(true);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.isInScale || motionEvent.getPointerCount() != 1 || motionEvent2.getPointerCount() != 1) {
            return false;
        }
        this.flinger.fling(0, 0, (int) (-f), (int) (-f2), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.flingLastY = 0;
        this.flingLastX = 0;
        this.handler.removeCallbacksAndMessages(null);
        this.handler.post(this);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        if (this.isInScale || this.isInDoubleTap) {
            return;
        }
        Point point = new Point(motionEvent.getX(), motionEvent.getY());
        LatLong fromPixels = this.mapView.getMapViewProjection().fromPixels(point.x, point.y);
        if (fromPixels != null) {
            for (int size = this.mapView.getLayerManager().getLayers().size() - 1; size >= 0; size--) {
                Layer safeGet = safeGet(this.mapView.getLayerManager().getLayers(), size);
                if (safeGet == null || safeGet.onLongPress(fromPixels, this.mapView.getMapViewProjection().toPixels(safeGet.getPosition()), point)) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.scaleFactorCumulative *= scaleGestureDetector.getScaleFactor();
        this.mapView.getModel().mapViewPosition.setPivot(this.pivot);
        this.mapView.getModel().mapViewPosition.setScaleFactorAdjustment(this.scaleFactorCumulative);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.scaleEnabled) {
            return false;
        }
        this.isInScale = true;
        this.scaleFactorCumulative = 1.0f;
        if (this.isInDoubleTap) {
            this.mapView.onZoomEvent();
            this.pivot = null;
        } else {
            this.mapView.onMoveEvent();
            this.mapView.onZoomEvent();
            this.focusX = scaleGestureDetector.getFocusX();
            this.focusY = scaleGestureDetector.getFocusY();
            this.pivot = this.mapView.getMapViewProjection().fromPixels(this.focusX, this.focusY);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        long round;
        double d;
        double log = Math.log(this.scaleFactorCumulative) / Math.log(2.0d);
        double d2 = 0.0d;
        if (Math.abs(log) > 1.0d) {
            round = Math.round(log < 0.0d ? Math.floor(log) : Math.ceil(log));
        } else {
            round = Math.round(log);
        }
        byte b = (byte) round;
        IMapViewPosition iMapViewPosition = this.mapView.getModel().mapViewPosition;
        if (b != 0 && this.pivot != null) {
            Point center = this.mapView.getModel().mapViewDimension.getDimension().getCenter();
            if (b > 0) {
                int i = 1;
                d = 0.0d;
                while (i <= b && iMapViewPosition.getZoomLevel() + i <= iMapViewPosition.getZoomLevelMax()) {
                    double d3 = i;
                    double pow = d2 + ((center.x - this.focusX) / Math.pow(2.0d, d3));
                    d += (center.y - this.focusY) / Math.pow(2.0d, d3);
                    i++;
                    d2 = pow;
                }
            } else {
                int i2 = -1;
                d = 0.0d;
                while (i2 >= b && iMapViewPosition.getZoomLevel() + i2 >= iMapViewPosition.getZoomLevelMin()) {
                    double d4 = i2 + 1;
                    double pow2 = d2 - ((center.x - this.focusX) / Math.pow(2.0d, d4));
                    d -= (center.y - this.focusY) / Math.pow(2.0d, d4);
                    i2--;
                    d2 = pow2;
                }
            }
            iMapViewPosition.setPivot(this.pivot);
            iMapViewPosition.moveCenterAndZoom(d2, d, b);
        } else {
            iMapViewPosition.zoom(b);
        }
        this.isInDoubleTap = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.isInScale || motionEvent.getPointerCount() != 1 || motionEvent2.getPointerCount() != 1) {
            return false;
        }
        if (Parameters.LAYER_SCROLL_EVENT) {
            for (int size = this.mapView.getLayerManager().getLayers().size() - 1; size >= 0; size--) {
                Layer safeGet = safeGet(this.mapView.getLayerManager().getLayers(), size);
                if (safeGet == null) {
                    break;
                }
                if (safeGet.onScroll(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY())) {
                    return true;
                }
            }
        }
        this.mapView.onMoveEvent();
        this.mapView.getModel().mapViewPosition.moveCenter(-f, -f2, false);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Point point = new Point(motionEvent.getX(), motionEvent.getY());
        LatLong fromPixels = this.mapView.getMapViewProjection().fromPixels(point.x, point.y);
        if (fromPixels == null) {
            return false;
        }
        for (int size = this.mapView.getLayerManager().getLayers().size() - 1; size >= 0; size--) {
            Layer safeGet = safeGet(this.mapView.getLayerManager().getLayers(), size);
            if (safeGet == null) {
                return false;
            }
            if (safeGet.onTap(fromPixels, this.mapView.getMapViewProjection().toPixels(safeGet.getPosition()), point)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = !this.flinger.isFinished() && this.flinger.computeScrollOffset();
        this.mapView.getModel().mapViewPosition.moveCenter(this.flingLastX - this.flinger.getCurrX(), this.flingLastY - this.flinger.getCurrY());
        this.flingLastX = this.flinger.getCurrX();
        this.flingLastY = this.flinger.getCurrY();
        if (z) {
            this.handler.post(this);
        }
    }

    private static Layer safeGet(Layers layers, int i) {
        Layer layer;
        synchronized (layers) {
            if (i >= 0) {
                try {
                    layer = i < layers.size() ? layers.get(i) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layer;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.doubleTapEnabled = z;
    }

    public void setScaleEnabled(boolean z) {
        this.scaleEnabled = z;
    }
}
