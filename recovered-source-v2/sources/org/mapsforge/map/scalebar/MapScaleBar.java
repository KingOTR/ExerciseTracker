package org.mapsforge.map.scalebar;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.GraphicContext;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.model.IMapViewPosition;
import org.mapsforge.map.model.MapViewDimension;

/* loaded from: classes5.dex */
public abstract class MapScaleBar {
    private static final ScaleBarPosition DEFAULT_SCALE_BAR_POSITION = ScaleBarPosition.BOTTOM_LEFT;
    private static final double LATITUDE_REDRAW_THRESHOLD = 0.2d;
    protected final DisplayModel displayModel;
    protected DistanceUnitAdapter distanceUnitAdapter;
    protected final GraphicFactory graphicFactory;
    protected final Bitmap mapScaleBitmap;
    protected final Canvas mapScaleCanvas;
    private final MapViewDimension mapViewDimension;
    private final IMapViewPosition mapViewPosition;
    private int marginHorizontal;
    private int marginVertical;
    protected MapPosition prevMapPosition;
    protected boolean redrawNeeded;
    protected final float scale;
    protected ScaleBarPosition scaleBarPosition;
    private boolean visible;

    public enum ScaleBarPosition {
        BOTTOM_CENTER,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP_CENTER,
        TOP_LEFT,
        TOP_RIGHT
    }

    protected abstract void redraw(Canvas canvas);

    protected static class ScaleBarLengthAndValue {
        public int scaleBarLength;
        public int scaleBarValue;

        public ScaleBarLengthAndValue(int i, int i2) {
            this.scaleBarLength = i;
            this.scaleBarValue = i2;
        }
    }

    public MapScaleBar(IMapViewPosition iMapViewPosition, MapViewDimension mapViewDimension, DisplayModel displayModel, GraphicFactory graphicFactory, int i, int i2, float f) {
        this.mapViewPosition = iMapViewPosition;
        this.mapViewDimension = mapViewDimension;
        this.displayModel = displayModel;
        this.graphicFactory = graphicFactory;
        Bitmap createBitmap = graphicFactory.createBitmap(i, i2);
        this.mapScaleBitmap = createBitmap;
        this.scale = f;
        this.scaleBarPosition = DEFAULT_SCALE_BAR_POSITION;
        Canvas createCanvas = graphicFactory.createCanvas();
        this.mapScaleCanvas = createCanvas;
        createCanvas.setBitmap(createBitmap);
        this.distanceUnitAdapter = MetricUnitAdapter.INSTANCE;
        this.visible = true;
        this.redrawNeeded = true;
    }

    public void destroy() {
        this.mapScaleBitmap.decrementRefCount();
        this.mapScaleCanvas.destroy();
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public DistanceUnitAdapter getDistanceUnitAdapter() {
        return this.distanceUnitAdapter;
    }

    public void setDistanceUnitAdapter(DistanceUnitAdapter distanceUnitAdapter) {
        if (distanceUnitAdapter == null) {
            throw new IllegalArgumentException("adapter must not be null");
        }
        this.distanceUnitAdapter = distanceUnitAdapter;
        this.redrawNeeded = true;
    }

    public int getMarginHorizontal() {
        return this.marginHorizontal;
    }

    public void setMarginHorizontal(int i) {
        if (this.marginHorizontal != i) {
            this.marginHorizontal = i;
            this.redrawNeeded = true;
        }
    }

    public int getMarginVertical() {
        return this.marginVertical;
    }

    public void setMarginVertical(int i) {
        if (this.marginVertical != i) {
            this.marginVertical = i;
            this.redrawNeeded = true;
        }
    }

    public ScaleBarPosition getScaleBarPosition() {
        return this.scaleBarPosition;
    }

    public void setScaleBarPosition(ScaleBarPosition scaleBarPosition) {
        if (this.scaleBarPosition != scaleBarPosition) {
            this.scaleBarPosition = scaleBarPosition;
            this.redrawNeeded = true;
        }
    }

    /* renamed from: org.mapsforge.map.scalebar.MapScaleBar$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition;

        static {
            int[] iArr = new int[ScaleBarPosition.values().length];
            $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition = iArr;
            try {
                iArr[ScaleBarPosition.BOTTOM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[ScaleBarPosition.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[ScaleBarPosition.BOTTOM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[ScaleBarPosition.TOP_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[ScaleBarPosition.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[ScaleBarPosition.TOP_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private int calculatePositionLeft(int i, int i2, int i3) {
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[this.scaleBarPosition.ordinal()]) {
            case 1:
            case 2:
                return this.marginHorizontal;
            case 3:
            case 4:
                return ((i2 - i) - i3) / 2;
            case 5:
            case 6:
                return ((i2 - i) - i3) - this.marginHorizontal;
            default:
                throw new IllegalArgumentException("unknown horizontal position: " + this.scaleBarPosition);
        }
    }

    private int calculatePositionTop(int i, int i2, int i3) {
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[this.scaleBarPosition.ordinal()]) {
            case 1:
            case 3:
            case 5:
                return ((i2 - i) - i3) - this.marginVertical;
            case 2:
            case 4:
            case 6:
                return this.marginVertical;
            default:
                throw new IllegalArgumentException("unknown vertical position: " + this.scaleBarPosition);
        }
    }

    protected ScaleBarLengthAndValue calculateScaleBarLengthAndValue(DistanceUnitAdapter distanceUnitAdapter) {
        MapPosition mapPosition = this.mapViewPosition.getMapPosition();
        this.prevMapPosition = mapPosition;
        double calculateGroundResolution = MercatorProjection.calculateGroundResolution(mapPosition.latLong.latitude, MercatorProjection.getMapSize(this.prevMapPosition.zoomLevel, this.displayModel.getTileSize())) / distanceUnitAdapter.getMeterRatio();
        int[] scaleBarValues = distanceUnitAdapter.getScaleBarValues();
        int length = scaleBarValues.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = scaleBarValues[i3];
            i = (int) (i2 / calculateGroundResolution);
            if (i < this.mapScaleBitmap.getWidth() - (this.scale * 10.0f)) {
                break;
            }
        }
        return new ScaleBarLengthAndValue(i, i2);
    }

    protected ScaleBarLengthAndValue calculateScaleBarLengthAndValue() {
        return calculateScaleBarLengthAndValue(this.distanceUnitAdapter);
    }

    public void draw(GraphicContext graphicContext) {
        if (this.visible && this.mapViewDimension.getDimension() != null) {
            if (isRedrawNecessary()) {
                redraw(this.mapScaleCanvas);
                this.redrawNeeded = false;
            }
            graphicContext.drawBitmap(this.mapScaleBitmap, calculatePositionLeft(0, this.mapViewDimension.getDimension().width, this.mapScaleBitmap.getWidth()), calculatePositionTop(0, this.mapViewDimension.getDimension().height, this.mapScaleBitmap.getHeight()));
        }
    }

    public void drawScaleBar() {
        draw(this.mapScaleCanvas);
    }

    public void redrawScaleBar() {
        this.redrawNeeded = true;
    }

    protected boolean isRedrawNecessary() {
        if (this.redrawNeeded || this.prevMapPosition == null) {
            return true;
        }
        MapPosition mapPosition = this.mapViewPosition.getMapPosition();
        return mapPosition.zoomLevel != this.prevMapPosition.zoomLevel || Math.abs(mapPosition.latLong.latitude - this.prevMapPosition.latLong.latitude) > LATITUDE_REDRAW_THRESHOLD;
    }
}
