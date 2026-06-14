package org.mapsforge.map.layer.renderer;

import com.google.common.base.Ascii;
import java.util.Collections;
import java.util.Iterator;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Curve;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.SymbolOrientation;
import org.mapsforge.core.graphics.TextOrientation;
import org.mapsforge.core.mapelements.SymbolContainer;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.datastore.MapReadResult;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.datastore.Way;
import org.mapsforge.map.layer.hills.HillsRenderConfig;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;

/* loaded from: classes5.dex */
public class StandardRenderer implements RenderCallback {
    private static final Byte DEFAULT_START_ZOOM_LEVEL = Byte.valueOf(Ascii.FF);
    private static final Tag TAG_NATURAL_WATER = new Tag("natural", "water");
    private static final byte ZOOM_MAX = 22;
    public final GraphicFactory graphicFactory;
    public final HillsRenderConfig hillsRenderConfig;
    public final MapDataStore mapDataStore;
    private final boolean renderLabels;

    public byte getZoomLevelMax() {
        return (byte) 22;
    }

    public StandardRenderer(MapDataStore mapDataStore, GraphicFactory graphicFactory, boolean z) {
        this(mapDataStore, graphicFactory, z, null);
    }

    public StandardRenderer(MapDataStore mapDataStore, GraphicFactory graphicFactory, boolean z, HillsRenderConfig hillsRenderConfig) {
        this.mapDataStore = mapDataStore;
        this.graphicFactory = graphicFactory;
        this.renderLabels = z;
        this.hillsRenderConfig = hillsRenderConfig;
    }

    public LatLong getStartPosition() {
        MapDataStore mapDataStore = this.mapDataStore;
        if (mapDataStore != null) {
            return mapDataStore.startPosition();
        }
        return null;
    }

    public Byte getStartZoomLevel() {
        MapDataStore mapDataStore = this.mapDataStore;
        if (mapDataStore != null && mapDataStore.startZoomLevel() != null) {
            return this.mapDataStore.startZoomLevel();
        }
        return DEFAULT_START_ZOOM_LEVEL;
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderArea(RenderContext renderContext, Paint paint, Paint paint2, int i, PolylineContainer polylineContainer) {
        renderContext.addToCurrentDrawingLayer(i, new ShapePaintContainer(polylineContainer, paint2));
        renderContext.addToCurrentDrawingLayer(i, new ShapePaintContainer(polylineContainer, paint));
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderAreaCaption(RenderContext renderContext, Display display, int i, String str, float f, float f2, Paint paint, Paint paint2, Position position, int i2, PolylineContainer polylineContainer) {
        if (this.renderLabels) {
            renderContext.labels.add(this.graphicFactory.createPointTextContainer(polylineContainer.getCenterAbsolute().offset(f, f2), display, i, str, paint, paint2, null, position, i2));
        }
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderAreaSymbol(RenderContext renderContext, Display display, int i, Bitmap bitmap, PolylineContainer polylineContainer) {
        if (this.renderLabels) {
            renderContext.labels.add(new SymbolContainer(polylineContainer.getCenterAbsolute(), display, i, null, bitmap));
        }
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderPointOfInterestCaption(RenderContext renderContext, Display display, int i, String str, float f, float f2, Paint paint, Paint paint2, Position position, int i2, PointOfInterest pointOfInterest) {
        if (this.renderLabels) {
            renderContext.labels.add(this.graphicFactory.createPointTextContainer(MercatorProjection.getPixelAbsolute(pointOfInterest.position, renderContext.rendererJob.tile.mapSize).offset(f, f2), display, i, str, paint, paint2, null, position, i2));
        }
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderPointOfInterestCircle(RenderContext renderContext, float f, Paint paint, Paint paint2, int i, PointOfInterest pointOfInterest) {
        Point pixelRelativeToTile = MercatorProjection.getPixelRelativeToTile(pointOfInterest.position, renderContext.rendererJob.tile);
        renderContext.addToCurrentDrawingLayer(i, new ShapePaintContainer(new CircleContainer(pixelRelativeToTile, f), paint2));
        renderContext.addToCurrentDrawingLayer(i, new ShapePaintContainer(new CircleContainer(pixelRelativeToTile, f), paint));
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderPointOfInterestSymbol(RenderContext renderContext, Display display, int i, Rectangle rectangle, Bitmap bitmap, PointOfInterest pointOfInterest) {
        if (this.renderLabels) {
            renderContext.labels.add(new SymbolContainer(MercatorProjection.getPixelAbsolute(pointOfInterest.position, renderContext.rendererJob.tile.mapSize), display, i, rectangle, bitmap));
        }
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderWay(RenderContext renderContext, Paint paint, float f, Curve curve, int i, PolylineContainer polylineContainer) {
        renderContext.addToCurrentDrawingLayer(i, new ShapePaintContainer(polylineContainer, paint, f, curve));
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderWaySymbol(RenderContext renderContext, Display display, int i, Bitmap bitmap, float f, Rectangle rectangle, boolean z, float f2, float f3, SymbolOrientation symbolOrientation, PolylineContainer polylineContainer) {
        if (this.renderLabels) {
            WayDecorator.renderSymbol(bitmap, display, i, f, rectangle, z, f2, f3, symbolOrientation, polylineContainer.getCoordinatesAbsolute(), renderContext.labels);
        }
    }

    @Override // org.mapsforge.map.rendertheme.RenderCallback
    public void renderWayText(RenderContext renderContext, Display display, int i, String str, float f, Paint paint, Paint paint2, boolean z, float f2, float f3, TextOrientation textOrientation, PolylineContainer polylineContainer) {
        if (this.renderLabels) {
            WayDecorator.renderText(this.graphicFactory, polylineContainer.getUpperLeft(), polylineContainer.getLowerRight(), str, display, i, f, paint, paint2, z, f2, f3, textOrientation, polylineContainer.getCoordinatesAbsolute(), renderContext.labels);
        }
    }

    boolean renderBitmap(RenderContext renderContext) {
        return !renderContext.renderTheme.hasMapBackgroundOutside() || this.mapDataStore.supportsTile(renderContext.rendererJob.tile);
    }

    protected void renderPointOfInterest(RenderContext renderContext, PointOfInterest pointOfInterest) {
        renderContext.setDrawingLayers(pointOfInterest.layer);
        renderContext.renderTheme.matchNode(this, renderContext, pointOfInterest);
    }

    protected void renderWaterBackground(RenderContext renderContext) {
        renderContext.setDrawingLayers((byte) 0);
        Point[] tilePixelCoordinates = getTilePixelCoordinates(renderContext.rendererJob.tile.tileSize);
        Point origin = renderContext.rendererJob.tile.getOrigin();
        for (int i = 0; i < tilePixelCoordinates.length; i++) {
            tilePixelCoordinates[i] = tilePixelCoordinates[i].offset(origin.x, origin.y);
        }
        renderContext.renderTheme.matchClosedWay(this, renderContext, new PolylineContainer(tilePixelCoordinates, renderContext.rendererJob.tile, renderContext.rendererJob.tile, Collections.singletonList(TAG_NATURAL_WATER)));
    }

    protected void renderWay(RenderContext renderContext, PolylineContainer polylineContainer) {
        renderContext.setDrawingLayers(polylineContainer.getLayer());
        if (polylineContainer.isClosedWay()) {
            renderContext.renderTheme.matchClosedWay(this, renderContext, polylineContainer);
        } else {
            renderContext.renderTheme.matchLinearWay(this, renderContext, polylineContainer);
        }
    }

    protected void processReadMapData(RenderContext renderContext, MapReadResult mapReadResult) {
        if (mapReadResult == null) {
            return;
        }
        Iterator<PointOfInterest> it = mapReadResult.pointOfInterests.iterator();
        while (it.hasNext()) {
            renderPointOfInterest(renderContext, it.next());
        }
        Iterator<Way> it2 = mapReadResult.ways.iterator();
        while (it2.hasNext()) {
            renderWay(renderContext, new PolylineContainer(it2.next(), renderContext.rendererJob.tile, renderContext.rendererJob.tile));
        }
        if (mapReadResult.isWater) {
            renderWaterBackground(renderContext);
        }
    }

    private static Point[] getTilePixelCoordinates(int i) {
        Point[] pointArr = new Point[5];
        pointArr[0] = new Point(0.0d, 0.0d);
        double d = i;
        pointArr[1] = new Point(d, 0.0d);
        pointArr[2] = new Point(d, d);
        pointArr[3] = new Point(0.0d, d);
        pointArr[4] = pointArr[0];
        return pointArr;
    }
}
