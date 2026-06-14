package org.mapsforge.map.layer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Tile;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.queue.Job;
import org.mapsforge.map.layer.queue.JobQueue;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.model.IMapViewPosition;
import org.mapsforge.map.util.LayerUtil;

/* loaded from: classes5.dex */
public abstract class TileLayer<T extends Job> extends Layer {
    private float alpha;
    protected final boolean hasJobQueue;
    protected final boolean isTransparent;
    protected JobQueue<T> jobQueue;
    private final IMapViewPosition mapViewPosition;
    private final Matrix matrix;
    private Parameters.ParentTilesRendering parentTilesRendering;
    protected final TileCache tileCache;

    protected abstract T createJob(Tile tile);

    protected abstract boolean isTileStale(Tile tile, TileBitmap tileBitmap);

    protected void retrieveLabelsOnly(T t) {
    }

    public TileLayer(TileCache tileCache, IMapViewPosition iMapViewPosition, Matrix matrix, boolean z) {
        this(tileCache, iMapViewPosition, matrix, z, true);
    }

    public TileLayer(TileCache tileCache, IMapViewPosition iMapViewPosition, Matrix matrix, boolean z, boolean z2) {
        this.alpha = 1.0f;
        this.parentTilesRendering = Parameters.PARENT_TILES_RENDERING;
        if (tileCache == null) {
            throw new IllegalArgumentException("tileCache must not be null");
        }
        if (iMapViewPosition == null) {
            throw new IllegalArgumentException("mapViewPosition must not be null");
        }
        this.hasJobQueue = z2;
        this.tileCache = tileCache;
        this.mapViewPosition = iMapViewPosition;
        this.matrix = matrix;
        this.isTransparent = z;
    }

    @Override // org.mapsforge.map.layer.Layer
    public void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        List<TilePosition> tilePositions = LayerUtil.getTilePositions(boundingBox, b, point, this.displayModel.getTileSize());
        canvas.resetClip();
        if (!this.isTransparent) {
            canvas.fillColor(this.displayModel.getBackgroundColor());
        }
        HashSet hashSet = new HashSet();
        Iterator<TilePosition> it = tilePositions.iterator();
        while (it.hasNext()) {
            hashSet.add(createJob(it.next().tile));
        }
        this.tileCache.setWorkingSet(hashSet);
        for (int size = tilePositions.size() - 1; size >= 0; size--) {
            TilePosition tilePosition = tilePositions.get(size);
            Point point2 = tilePosition.point;
            Tile tile = tilePosition.tile;
            T createJob = createJob(tile);
            TileBitmap immediately = this.tileCache.getImmediately(createJob);
            if (immediately == null) {
                if (this.hasJobQueue && !this.tileCache.containsKey(createJob)) {
                    this.jobQueue.add(createJob);
                }
                if (this.parentTilesRendering != Parameters.ParentTilesRendering.OFF) {
                    drawParentTileBitmap(canvas, point2, tile);
                }
            } else {
                if (isTileStale(tile, immediately) && this.hasJobQueue && !this.tileCache.containsKey(createJob)) {
                    this.jobQueue.add(createJob);
                }
                retrieveLabelsOnly(createJob);
                canvas.drawBitmap(immediately, (int) Math.round(point2.x), (int) Math.round(point2.y), this.alpha, this.displayModel.getFilter());
                immediately.decrementRefCount();
            }
        }
        if (this.hasJobQueue) {
            this.jobQueue.notifyWorkers();
        }
    }

    @Override // org.mapsforge.map.layer.Layer
    public synchronized void setDisplayModel(DisplayModel displayModel) {
        super.setDisplayModel(displayModel);
        if (displayModel != null && this.hasJobQueue) {
            this.jobQueue = new JobQueue<>(this.mapViewPosition, this.displayModel);
        } else {
            this.jobQueue = null;
        }
    }

    private void drawParentTileBitmap(Canvas canvas, Point point, Tile tile) {
        TileBitmap immediately;
        Tile cachedParentTile = getCachedParentTile(tile, 4);
        if (cachedParentTile == null || (immediately = this.tileCache.getImmediately(createJob(cachedParentTile))) == null) {
            return;
        }
        int tileSize = this.displayModel.getTileSize();
        long shiftX = tile.getShiftX(cachedParentTile) * tileSize;
        long shiftY = tile.getShiftY(cachedParentTile) * tileSize;
        float pow = (float) Math.pow(2.0d, (byte) (tile.zoomLevel - cachedParentTile.zoomLevel));
        int round = (int) Math.round(point.x);
        int round2 = (int) Math.round(point.y);
        if (this.parentTilesRendering == Parameters.ParentTilesRendering.SPEED) {
            boolean isAntiAlias = canvas.isAntiAlias();
            boolean isFilterBitmap = canvas.isFilterBitmap();
            canvas.setAntiAlias(false);
            canvas.setFilterBitmap(false);
            long j = tileSize;
            canvas.drawBitmap(immediately, (int) (shiftX / pow), (int) (shiftY / pow), (int) ((shiftX + j) / pow), (int) ((shiftY + j) / pow), round, round2, round + tileSize, round2 + tileSize, this.alpha, this.displayModel.getFilter());
            canvas.setAntiAlias(isAntiAlias);
            canvas.setFilterBitmap(isFilterBitmap);
        } else {
            this.matrix.reset();
            this.matrix.translate(round - shiftX, round2 - shiftY);
            this.matrix.scale(pow, pow);
            canvas.setClip(round, round2, this.displayModel.getTileSize(), this.displayModel.getTileSize());
            canvas.drawBitmap(immediately, this.matrix, this.alpha, this.displayModel.getFilter());
            canvas.resetClip();
        }
        immediately.decrementRefCount();
    }

    public float getAlpha() {
        return this.alpha;
    }

    private Tile getCachedParentTile(Tile tile, int i) {
        Tile parent;
        if (i == 0 || (parent = tile.getParent()) == null) {
            return null;
        }
        return this.tileCache.containsKey(createJob(parent)) ? parent : getCachedParentTile(parent, i - 1);
    }

    public TileCache getTileCache() {
        return this.tileCache;
    }

    public void setAlpha(float f) {
        this.alpha = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setParentTilesRendering(Parameters.ParentTilesRendering parentTilesRendering) {
        this.parentTilesRendering = parentTilesRendering;
    }
}
