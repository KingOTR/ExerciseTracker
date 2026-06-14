package org.mapsforge.map.layer.renderer;

import java.util.ArrayList;
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
import org.mapsforge.map.layer.hills.HillsRenderConfig;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.util.LayerUtil;

/* loaded from: classes5.dex */
public class DirectRenderer extends StandardRenderer {
    private static final Logger LOGGER = Logger.getLogger(DirectRenderer.class.getName());
    private final boolean renderLabels;
    private final TileDependencies tileDependencies;
    private final List<TileRefresher> tileRefreshers;

    public interface TileRefresher {
        void refresh(Tile tile);
    }

    public DirectRenderer(MapDataStore mapDataStore, GraphicFactory graphicFactory, boolean z, HillsRenderConfig hillsRenderConfig) {
        super(mapDataStore, graphicFactory, z, hillsRenderConfig);
        this.renderLabels = z;
        this.tileDependencies = new TileDependencies();
        this.tileRefreshers = new ArrayList();
    }

    public void addTileRefresher(TileRefresher tileRefresher) {
        this.tileRefreshers.add(tileRefresher);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00d6: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
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
                    if (!renderBitmap(renderContext)) {
                        renderContext.destroy();
                        return null;
                    }
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

    private Set<MapElementContainer> processLabels(RenderContext renderContext) {
        HashSet<MapElementContainer> hashSet;
        synchronized (this.tileDependencies) {
            hashSet = new HashSet();
            Set<Tile> neighbours = renderContext.rendererJob.tile.getNeighbours();
            Iterator<Tile> it = neighbours.iterator();
            while (it.hasNext()) {
                hashSet.addAll(this.tileDependencies.getOverlappingElements(it.next(), renderContext.rendererJob.tile));
            }
            List<MapElementContainer> collisionFreeOrdered = LayerUtil.collisionFreeOrdered(renderContext.labels);
            Iterator<MapElementContainer> it2 = collisionFreeOrdered.iterator();
            while (it2.hasNext()) {
                MapElementContainer next = it2.next();
                Iterator it3 = hashSet.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((MapElementContainer) it3.next()).clashesWith(next)) {
                        it2.remove();
                        break;
                    }
                }
            }
            hashSet.addAll(collisionFreeOrdered);
            for (Tile tile : neighbours) {
                Set<MapElementContainer> overlappingElements = this.tileDependencies.getOverlappingElements(renderContext.rendererJob.tile, tile);
                HashSet hashSet2 = new HashSet();
                for (MapElementContainer mapElementContainer : hashSet) {
                    if (mapElementContainer.intersects(tile.getBoundaryAbsolute())) {
                        hashSet2.add(mapElementContainer);
                    }
                }
                if (!overlappingElements.equals(hashSet2)) {
                    this.tileDependencies.removeTileData(renderContext.rendererJob.tile, tile);
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        this.tileDependencies.addOverlappingElement(renderContext.rendererJob.tile, tile, (MapElementContainer) it4.next());
                    }
                    Iterator<TileRefresher> it5 = this.tileRefreshers.iterator();
                    while (it5.hasNext()) {
                        it5.next().refresh(tile);
                    }
                }
            }
        }
        return hashSet;
    }
}
