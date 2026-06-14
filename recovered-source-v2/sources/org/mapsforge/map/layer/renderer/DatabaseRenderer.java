package org.mapsforge.map.layer.renderer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.mapelements.MapElementContainer;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.model.Tile;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.hills.HillsRenderConfig;
import org.mapsforge.map.layer.labels.TileBasedLabelStore;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.util.LayerUtil;

/* loaded from: classes5.dex */
public class DatabaseRenderer extends StandardRenderer {
    private static final Logger LOGGER = Logger.getLogger(DatabaseRenderer.class.getName());
    private final TileBasedLabelStore labelStore;
    private final boolean renderLabels;
    private final TileCache tileCache;
    private final TileDependencies tileDependencies;

    public DatabaseRenderer(MapDataStore mapDataStore, GraphicFactory graphicFactory, TileCache tileCache, TileBasedLabelStore tileBasedLabelStore, boolean z, boolean z2, HillsRenderConfig hillsRenderConfig) {
        super(mapDataStore, graphicFactory, z || z2, hillsRenderConfig);
        this.tileCache = tileCache;
        this.labelStore = tileBasedLabelStore;
        this.renderLabels = z;
        if (!z) {
            this.tileDependencies = null;
        } else {
            this.tileDependencies = new TileDependencies();
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00e5: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:46:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TileBitmap executeJob(RendererJob rendererJob) {
        RenderContext renderContext;
        RenderContext renderContext2;
        TileBitmap tileBitmap;
        RenderContext renderContext3 = null;
        try {
            try {
                renderContext = new RenderContext(rendererJob, new CanvasRasterer(this.graphicFactory));
                try {
                    if (renderBitmap(renderContext)) {
                        if (this.mapDataStore != null) {
                            processReadMapData(renderContext, this.mapDataStore.readMapData(rendererJob.tile));
                        }
                        if (rendererJob.labelsOnly) {
                            tileBitmap = null;
                        } else {
                            renderContext.renderTheme.matchHillShadings(this, renderContext);
                            tileBitmap = this.graphicFactory.createTileBitmap(rendererJob.tile.tileSize, rendererJob.hasAlpha);
                            tileBitmap.setTimestamp(rendererJob.mapDataStore.getDataTimestamp(rendererJob.tile));
                            renderContext.canvasRasterer.setCanvasBitmap(tileBitmap);
                            if (!rendererJob.hasAlpha && rendererJob.displayModel.getBackgroundColor() != renderContext.renderTheme.getMapBackground()) {
                                renderContext.canvasRasterer.fill(renderContext.renderTheme.getMapBackground());
                            }
                            renderContext.canvasRasterer.drawWays(renderContext);
                        }
                        if (this.renderLabels) {
                            renderContext.canvasRasterer.drawMapElements(processLabels(renderContext), rendererJob.tile);
                        }
                        TileBasedLabelStore tileBasedLabelStore = this.labelStore;
                        if (tileBasedLabelStore != null) {
                            tileBasedLabelStore.storeMapItems(rendererJob.tile, renderContext.labels);
                        }
                        if (!rendererJob.labelsOnly && renderContext.renderTheme.hasMapBackgroundOutside()) {
                            Rectangle positionRelativeToTile = this.mapDataStore.boundingBox().getPositionRelativeToTile(rendererJob.tile);
                            if (!rendererJob.hasAlpha) {
                                renderContext.canvasRasterer.fillOutsideAreas(renderContext.renderTheme.getMapBackgroundOutside(), positionRelativeToTile);
                            } else {
                                renderContext.canvasRasterer.fillOutsideAreas(Color.TRANSPARENT, positionRelativeToTile);
                            }
                        }
                        renderContext.destroy();
                        return tileBitmap;
                    }
                    TileBitmap createBackgroundBitmap = createBackgroundBitmap(renderContext);
                    renderContext.destroy();
                    return createBackgroundBitmap;
                } catch (Exception e) {
                    e = e;
                    LOGGER.warning("Exception: " + e.getMessage());
                    if (renderContext != null) {
                        renderContext.destroy();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                renderContext3 = renderContext2;
                if (renderContext3 != null) {
                    renderContext3.destroy();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            renderContext = null;
        } catch (Throwable th2) {
            th = th2;
            if (renderContext3 != null) {
            }
            throw th;
        }
    }

    public MapDataStore getMapDatabase() {
        return this.mapDataStore;
    }

    void removeTileInProgress(Tile tile) {
        TileDependencies tileDependencies = this.tileDependencies;
        if (tileDependencies != null) {
            tileDependencies.removeTileInProgress(tile);
        }
    }

    private TileBitmap createBackgroundBitmap(RenderContext renderContext) {
        TileBitmap createTileBitmap = this.graphicFactory.createTileBitmap(renderContext.rendererJob.tile.tileSize, renderContext.rendererJob.hasAlpha);
        renderContext.canvasRasterer.setCanvasBitmap(createTileBitmap);
        if (!renderContext.rendererJob.hasAlpha) {
            renderContext.canvasRasterer.fill(renderContext.renderTheme.getMapBackgroundOutside());
        }
        return createTileBitmap;
    }

    private Set<MapElementContainer> processLabels(RenderContext renderContext) {
        HashSet<MapElementContainer> hashSet = new HashSet();
        synchronized (this.tileDependencies) {
            Set<Tile> neighbours = renderContext.rendererJob.tile.getNeighbours();
            Iterator<Tile> it = neighbours.iterator();
            HashSet hashSet2 = new HashSet();
            this.tileDependencies.addTileInProgress(renderContext.rendererJob.tile);
            while (it.hasNext()) {
                Tile next = it.next();
                if (!this.tileDependencies.isTileInProgress(next) && !this.tileCache.containsKey(renderContext.rendererJob.otherTile(next))) {
                    this.tileDependencies.removeTileData(next);
                }
                hashSet.addAll(this.tileDependencies.getOverlappingElements(next, renderContext.rendererJob.tile));
                for (MapElementContainer mapElementContainer : renderContext.labels) {
                    if (mapElementContainer.intersects(next.getBoundaryAbsolute())) {
                        hashSet2.add(mapElementContainer);
                    }
                }
                it.remove();
            }
            renderContext.labels.removeAll(hashSet2);
            List<MapElementContainer> collisionFreeOrdered = LayerUtil.collisionFreeOrdered(renderContext.labels);
            Iterator<MapElementContainer> it2 = collisionFreeOrdered.iterator();
            while (it2.hasNext()) {
                MapElementContainer next2 = it2.next();
                Iterator it3 = hashSet.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((MapElementContainer) it3.next()).clashesWith(next2)) {
                        it2.remove();
                        break;
                    }
                }
            }
            hashSet.addAll(collisionFreeOrdered);
            for (Tile tile : neighbours) {
                this.tileDependencies.removeTileData(renderContext.rendererJob.tile, tile);
                for (MapElementContainer mapElementContainer2 : hashSet) {
                    if (mapElementContainer2.intersects(tile.getBoundaryAbsolute())) {
                        this.tileDependencies.addOverlappingElement(renderContext.rendererJob.tile, tile, mapElementContainer2);
                    }
                }
            }
        }
        return hashSet;
    }
}
