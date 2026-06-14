package org.mapsforge.map.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.platform.client.SdkConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.android.input.MapZoomControls;
import org.mapsforge.map.android.input.TouchGestureHandler;
import org.mapsforge.map.controller.FrameBufferController;
import org.mapsforge.map.controller.LayerManagerController;
import org.mapsforge.map.controller.MapViewController;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.layer.LayerManager;
import org.mapsforge.map.layer.TileLayer;
import org.mapsforge.map.layer.labels.LabelStore;
import org.mapsforge.map.layer.renderer.TileRendererLayer;
import org.mapsforge.map.model.Model;
import org.mapsforge.map.model.common.Observer;
import org.mapsforge.map.scalebar.DefaultMapScaleBar;
import org.mapsforge.map.scalebar.MapScaleBar;
import org.mapsforge.map.util.MapPositionUtil;
import org.mapsforge.map.util.MapViewProjection;
import org.mapsforge.map.view.FpsCounter;
import org.mapsforge.map.view.FrameBuffer;
import org.mapsforge.map.view.FrameBufferHA3;
import org.mapsforge.map.view.InputListener;

/* loaded from: classes5.dex */
public class MapView extends ViewGroup implements org.mapsforge.map.view.MapView, Observer {
    private static final GraphicFactory GRAPHIC_FACTORY = AndroidGraphicFactory.INSTANCE;
    private final FpsCounter fpsCounter;
    private final FrameBuffer frameBuffer;
    private final FrameBufferController frameBufferController;
    private final GestureDetector gestureDetector;
    private GestureDetector gestureDetectorExternal;
    private final List<InputListener> inputListeners;
    private final LayerManager layerManager;
    private final Handler layoutHandler;
    private MapScaleBar mapScaleBar;
    private final MapViewProjection mapViewProjection;
    private final MapZoomControls mapZoomControls;
    private final Model model;
    private final ScaleGestureDetector scaleGestureDetector;
    private final TouchGestureHandler touchGestureHandler;

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public Alignment alignment;
        public LatLong latLong;

        public enum Alignment {
            TOP_LEFT,
            TOP_CENTER,
            TOP_RIGHT,
            CENTER_LEFT,
            CENTER,
            CENTER_RIGHT,
            BOTTOM_LEFT,
            BOTTOM_CENTER,
            BOTTOM_RIGHT
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.alignment = Alignment.BOTTOM_CENTER;
        }

        public LayoutParams(int i, int i2, LatLong latLong, Alignment alignment) {
            super(i, i2);
            this.latLong = latLong;
            this.alignment = alignment;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public MapView(Context context) {
        this(context, null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.inputListeners = new CopyOnWriteArrayList();
        this.layoutHandler = new Handler(Looper.myLooper());
        setClickable(true);
        setDescendantFocusability(393216);
        setWillNotDraw(false);
        Model model = new Model();
        this.model = model;
        GraphicFactory graphicFactory = GRAPHIC_FACTORY;
        this.fpsCounter = new FpsCounter(graphicFactory, model.displayModel);
        FrameBufferHA3 frameBufferHA3 = new FrameBufferHA3(model.frameBufferModel, model.displayModel, graphicFactory);
        this.frameBuffer = frameBufferHA3;
        this.frameBufferController = FrameBufferController.create(frameBufferHA3, model);
        LayerManager layerManager = new LayerManager(this, model.mapViewPosition, graphicFactory);
        this.layerManager = layerManager;
        layerManager.start();
        LayerManagerController.create(layerManager, model);
        MapViewController.create(this, model);
        TouchGestureHandler touchGestureHandler = new TouchGestureHandler(this);
        this.touchGestureHandler = touchGestureHandler;
        this.gestureDetector = new GestureDetector(context, touchGestureHandler);
        this.scaleGestureDetector = new ScaleGestureDetector(context, touchGestureHandler);
        MapZoomControls mapZoomControls = new MapZoomControls(context, this);
        this.mapZoomControls = mapZoomControls;
        addView(mapZoomControls, new ViewGroup.LayoutParams(-2, -2));
        this.mapScaleBar = new DefaultMapScaleBar(model.mapViewPosition, model.mapViewDimension, graphicFactory, model.displayModel);
        this.mapViewProjection = new MapViewProjection(this);
        model.mapViewPosition.addObserver(this);
    }

    public void addInputListener(InputListener inputListener) {
        if (inputListener == null) {
            throw new IllegalArgumentException("listener must not be null");
        }
        if (this.inputListeners.contains(inputListener)) {
            throw new IllegalArgumentException("listener is already registered: " + inputListener);
        }
        this.inputListeners.add(inputListener);
    }

    @Override // org.mapsforge.map.view.MapView
    public void addLayer(Layer layer) {
        this.layerManager.getLayers().add(layer);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // org.mapsforge.map.view.MapView
    public void destroy() {
        this.touchGestureHandler.destroy();
        this.layoutHandler.removeCallbacksAndMessages(null);
        this.layerManager.finish();
        this.frameBufferController.destroy();
        this.frameBuffer.destroy();
        MapScaleBar mapScaleBar = this.mapScaleBar;
        if (mapScaleBar != null) {
            mapScaleBar.destroy();
        }
        this.mapZoomControls.destroy();
        getModel().mapViewPosition.destroy();
    }

    @Override // org.mapsforge.map.view.MapView
    public void destroyAll() {
        LabelStore labelStore;
        Iterator<Layer> it = this.layerManager.getLayers().iterator();
        while (it.hasNext()) {
            Layer next = it.next();
            this.layerManager.getLayers().remove(next);
            next.onDestroy();
            if (next instanceof TileLayer) {
                ((TileLayer) next).getTileCache().destroy();
            }
            if ((next instanceof TileRendererLayer) && (labelStore = ((TileRendererLayer) next).getLabelStore()) != null) {
                labelStore.clear();
            }
        }
        destroy();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2, null, LayoutParams.Alignment.BOTTOM_CENTER);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // org.mapsforge.map.view.MapView
    public BoundingBox getBoundingBox() {
        return MapPositionUtil.getBoundingBox(this.model.mapViewPosition.getMapPosition(), getDimension(), this.model.displayModel.getTileSize());
    }

    @Override // org.mapsforge.map.view.MapView
    public Dimension getDimension() {
        return new Dimension(getWidth(), getHeight());
    }

    @Override // org.mapsforge.map.view.MapView
    public FpsCounter getFpsCounter() {
        return this.fpsCounter;
    }

    @Override // org.mapsforge.map.view.MapView
    public FrameBuffer getFrameBuffer() {
        return this.frameBuffer;
    }

    @Override // org.mapsforge.map.view.MapView
    public LayerManager getLayerManager() {
        return this.layerManager;
    }

    @Override // org.mapsforge.map.view.MapView
    public MapScaleBar getMapScaleBar() {
        return this.mapScaleBar;
    }

    @Override // org.mapsforge.map.view.MapView
    public MapViewProjection getMapViewProjection() {
        return this.mapViewProjection;
    }

    public MapZoomControls getMapZoomControls() {
        return this.mapZoomControls;
    }

    @Override // org.mapsforge.map.view.MapView
    public Model getModel() {
        return this.model;
    }

    public TouchGestureHandler getTouchGestureHandler() {
        return this.touchGestureHandler;
    }

    @Override // org.mapsforge.map.model.common.Observer
    public void onChange() {
        try {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!getChildAt(i).equals(this.mapZoomControls)) {
                    this.layoutHandler.post(new Runnable() { // from class: org.mapsforge.map.android.view.MapView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MapView.this.requestLayout();
                        }
                    });
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        org.mapsforge.core.graphics.Canvas createGraphicContext = AndroidGraphicFactory.createGraphicContext(canvas);
        this.frameBuffer.draw(createGraphicContext);
        MapScaleBar mapScaleBar = this.mapScaleBar;
        if (mapScaleBar != null) {
            mapScaleBar.draw(createGraphicContext);
        }
        this.fpsCounter.draw(createGraphicContext);
        createGraphicContext.destroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.mapZoomControls.getVisibility() != 8) {
            int zoomControlsGravity = this.mapZoomControls.getZoomControlsGravity();
            int measuredWidth = this.mapZoomControls.getMeasuredWidth();
            int measuredHeight = this.mapZoomControls.getMeasuredHeight();
            int i6 = zoomControlsGravity & 7;
            if (i6 == 1) {
                i += ((i3 - i) - measuredWidth) / 2;
            } else if (i6 != 3) {
                i = i3 - measuredWidth;
            }
            int i7 = zoomControlsGravity & SdkConfig.SDK_VERSION;
            if (i7 == 16) {
                i2 += ((i4 - i2) - measuredHeight) / 2;
            } else if (i7 != 48) {
                i2 = i4 - measuredHeight;
            }
            this.mapZoomControls.layout(i, i2, measuredWidth + i, measuredHeight + i2);
        }
        try {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!childAt.equals(this.mapZoomControls) && childAt.getVisibility() != 8 && checkLayoutParams(childAt.getLayoutParams())) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    Point pixels = this.mapViewProjection.toPixels(layoutParams.latLong);
                    if (pixels != null) {
                        int paddingLeft = getPaddingLeft() + ((int) Math.round(pixels.x));
                        int paddingTop = getPaddingTop() + ((int) Math.round(pixels.y));
                        switch (layoutParams.alignment) {
                            case TOP_CENTER:
                                paddingLeft -= measuredWidth2 / 2;
                                break;
                            case TOP_RIGHT:
                                paddingLeft -= measuredWidth2;
                                break;
                            case CENTER_LEFT:
                                i5 = measuredHeight2 / 2;
                                paddingTop -= i5;
                                break;
                            case CENTER:
                                paddingLeft -= measuredWidth2 / 2;
                                i5 = measuredHeight2 / 2;
                                paddingTop -= i5;
                                break;
                            case CENTER_RIGHT:
                                paddingLeft -= measuredWidth2;
                                i5 = measuredHeight2 / 2;
                                paddingTop -= i5;
                                break;
                            case BOTTOM_LEFT:
                                paddingTop -= measuredHeight2;
                                break;
                            case BOTTOM_CENTER:
                                paddingLeft -= measuredWidth2 / 2;
                                paddingTop -= measuredHeight2;
                                break;
                            case BOTTOM_RIGHT:
                                paddingLeft -= measuredWidth2;
                                paddingTop -= measuredHeight2;
                                break;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth2 + paddingLeft, measuredHeight2 + paddingTop);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }

    public void onMoveEvent() {
        Iterator<InputListener> it = this.inputListeners.iterator();
        while (it.hasNext()) {
            it.next().onMoveEvent();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.model.mapViewDimension.setDimension(new Dimension(i, i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return false;
        }
        this.mapZoomControls.onMapViewTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.gestureDetectorExternal;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return !this.scaleGestureDetector.isInProgress() ? this.gestureDetector.onTouchEvent(motionEvent) : this.scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onZoomEvent() {
        Iterator<InputListener> it = this.inputListeners.iterator();
        while (it.hasNext()) {
            it.next().onZoomEvent();
        }
    }

    public void removeInputListener(InputListener inputListener) {
        if (inputListener == null) {
            throw new IllegalArgumentException("listener must not be null");
        }
        if (!this.inputListeners.contains(inputListener)) {
            throw new IllegalArgumentException("listener is not registered: " + inputListener);
        }
        this.inputListeners.remove(inputListener);
    }

    @Override // org.mapsforge.map.view.MapView
    public void repaint() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        this.mapZoomControls.setShowMapZoomControls(z);
    }

    @Override // org.mapsforge.map.view.MapView
    public void setCenter(LatLong latLong) {
        this.model.mapViewPosition.setCenter(latLong);
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.gestureDetectorExternal = gestureDetector;
    }

    @Override // org.mapsforge.map.view.MapView
    public void setMapScaleBar(MapScaleBar mapScaleBar) {
        MapScaleBar mapScaleBar2 = this.mapScaleBar;
        if (mapScaleBar2 != null) {
            mapScaleBar2.destroy();
        }
        this.mapScaleBar = mapScaleBar;
    }

    @Override // org.mapsforge.map.view.MapView
    public void setZoomLevel(byte b) {
        this.model.mapViewPosition.setZoomLevel(b);
    }

    @Override // org.mapsforge.map.view.MapView
    public void setZoomLevelMax(byte b) {
        this.model.mapViewPosition.setZoomLevelMax(b);
        this.mapZoomControls.setZoomLevelMax(b);
    }

    @Override // org.mapsforge.map.view.MapView
    public void setZoomLevelMin(byte b) {
        this.model.mapViewPosition.setZoomLevelMin(b);
        this.mapZoomControls.setZoomLevelMin(b);
    }
}
