package org.mapsforge.map.rendertheme;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.mapsforge.core.mapelements.MapElementContainer;
import org.mapsforge.core.model.Tile;
import org.mapsforge.map.layer.renderer.CanvasRasterer;
import org.mapsforge.map.layer.renderer.RendererJob;
import org.mapsforge.map.layer.renderer.ShapePaintContainer;
import org.mapsforge.map.rendertheme.rule.RenderTheme;

/* loaded from: classes5.dex */
public class RenderContext {
    private static final byte LAYERS = 11;
    private static final double STROKE_INCREASE = 1.5d;
    private static final byte STROKE_MIN_ZOOM_LEVEL = 12;
    public final CanvasRasterer canvasRasterer;
    private List<List<ShapePaintContainer>> drawingLayers;
    public final List<MapElementContainer> labels = new LinkedList();
    public final RenderTheme renderTheme;
    public final RendererJob rendererJob;
    public final List<List<List<ShapePaintContainer>>> ways;

    public RenderContext(RendererJob rendererJob, CanvasRasterer canvasRasterer) throws InterruptedException, ExecutionException {
        this.rendererJob = rendererJob;
        this.canvasRasterer = canvasRasterer;
        RenderTheme renderTheme = rendererJob.renderThemeFuture.get();
        this.renderTheme = renderTheme;
        renderTheme.scaleTextSize(rendererJob.textScale, rendererJob.tile.zoomLevel);
        this.ways = createWayLists();
        setScaleStrokeWidth(rendererJob.tile.zoomLevel);
    }

    public void destroy() {
        this.canvasRasterer.destroy();
    }

    public void setDrawingLayers(byte b) {
        if (b < 0) {
            b = 0;
        } else if (b >= 11) {
            b = 10;
        }
        this.drawingLayers = this.ways.get(b);
    }

    public void addToCurrentDrawingLayer(int i, ShapePaintContainer shapePaintContainer) {
        this.drawingLayers.get(i).add(shapePaintContainer);
    }

    public RendererJob otherTile(Tile tile) {
        return new RendererJob(tile, this.rendererJob.mapDataStore, this.rendererJob.renderThemeFuture, this.rendererJob.displayModel, this.rendererJob.textScale, this.rendererJob.hasAlpha, this.rendererJob.labelsOnly);
    }

    private List<List<List<ShapePaintContainer>>> createWayLists() {
        ArrayList arrayList = new ArrayList(11);
        int levels = this.renderTheme.getLevels();
        for (byte b = 10; b >= 0; b = (byte) (b - 1)) {
            ArrayList arrayList2 = new ArrayList(levels);
            for (int i = levels - 1; i >= 0; i--) {
                arrayList2.add(new ArrayList(0));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private void setScaleStrokeWidth(byte b) {
        this.renderTheme.scaleStrokeWidth((float) Math.pow(1.5d, Math.max(b - 12, 0)), this.rendererJob.tile.zoomLevel);
    }
}
