package org.mapsforge.map.layer.hills;

import java.util.concurrent.ExecutionException;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.HillshadingBitmap;

/* loaded from: classes5.dex */
public class MemoryCachingHgtReaderTileSource implements ShadeTileSource {
    private ShadingAlgorithm algorithm;
    private boolean configurationChangePending;
    private HgtCache currentCache;
    private DemFolder demFolder;
    private boolean enableInterpolationOverlap;
    private final GraphicFactory graphicsFactory;
    private int mainCacheSize;
    private int neighborCacheSize;

    public MemoryCachingHgtReaderTileSource(DemFolder demFolder, ShadingAlgorithm shadingAlgorithm, GraphicFactory graphicFactory) {
        this(graphicFactory);
        this.demFolder = demFolder;
        this.algorithm = shadingAlgorithm;
    }

    public MemoryCachingHgtReaderTileSource(GraphicFactory graphicFactory) {
        this.mainCacheSize = 4;
        this.neighborCacheSize = 4;
        this.enableInterpolationOverlap = true;
        this.configurationChangePending = true;
        this.graphicsFactory = graphicFactory;
    }

    @Override // org.mapsforge.map.layer.hills.ShadeTileSource
    public void applyConfiguration(boolean z) {
        HgtCache hgtCache = this.currentCache;
        HgtCache latestCache = latestCache();
        if (!z || latestCache == null || latestCache == hgtCache) {
            return;
        }
        latestCache.indexOnThread();
    }

    protected HgtCache latestCache() {
        HgtCache hgtCache = this.currentCache;
        if (hgtCache != null && !this.configurationChangePending) {
            return hgtCache;
        }
        if (this.demFolder == null || this.algorithm == null) {
            this.currentCache = null;
            return null;
        }
        if (hgtCache != null && this.enableInterpolationOverlap == hgtCache.interpolatorOverlap && this.mainCacheSize == this.currentCache.mainCacheSize && this.neighborCacheSize == this.currentCache.neighborCacheSize && this.demFolder.equals(this.currentCache.demFolder) && this.algorithm.equals(this.currentCache.algorithm)) {
            return hgtCache;
        }
        HgtCache hgtCache2 = new HgtCache(this.demFolder, this.enableInterpolationOverlap, this.graphicsFactory, this.algorithm, this.mainCacheSize, this.neighborCacheSize);
        this.currentCache = hgtCache2;
        return hgtCache2;
    }

    @Override // org.mapsforge.map.layer.hills.ShadeTileSource
    public void prepareOnThread() {
        HgtCache hgtCache = this.currentCache;
        if (hgtCache != null) {
            hgtCache.indexOnThread();
        }
    }

    @Override // org.mapsforge.map.layer.hills.ShadeTileSource
    public HillshadingBitmap getHillshadingBitmap(int i, int i2, double d, double d2) throws ExecutionException, InterruptedException {
        if (latestCache() == null) {
            return null;
        }
        return this.currentCache.getHillshadingBitmap(i, i2, d, d2);
    }

    @Override // org.mapsforge.map.layer.hills.ShadeTileSource
    public void setShadingAlgorithm(ShadingAlgorithm shadingAlgorithm) {
        this.algorithm = shadingAlgorithm;
    }

    public void setDemFolder(DemFolder demFolder) {
        this.demFolder = demFolder;
    }

    public void setMainCacheSize(int i) {
        this.mainCacheSize = i;
    }

    public void setNeighborCacheSize(int i) {
        this.neighborCacheSize = i;
    }

    public void setEnableInterpolationOverlap(boolean z) {
        this.enableInterpolationOverlap = z;
    }

    public int getMainCacheSize() {
        return this.mainCacheSize;
    }

    public int getNeighborCacheSize() {
        return this.neighborCacheSize;
    }

    public boolean isEnableInterpolationOverlap() {
        return this.enableInterpolationOverlap;
    }

    public ShadingAlgorithm getAlgorithm() {
        return this.algorithm;
    }
}
