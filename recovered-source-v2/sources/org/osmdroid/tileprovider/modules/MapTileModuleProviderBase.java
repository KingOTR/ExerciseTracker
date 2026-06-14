package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.MapTileRequestState;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes5.dex */
public abstract class MapTileModuleProviderBase {
    private final ExecutorService mExecutor;
    protected final LinkedHashMap<Long, MapTileRequestState> mPending;
    protected final Object mQueueLockObject = new Object();
    protected final HashMap<Long, MapTileRequestState> mWorking;

    public abstract int getMaximumZoomLevel();

    public abstract int getMinimumZoomLevel();

    protected abstract String getName();

    protected abstract String getThreadGroupName();

    public abstract TileLoader getTileLoader();

    public abstract boolean getUsesDataConnection();

    public abstract void setTileSource(ITileSource iTileSource);

    public boolean isTileReachable(long j) {
        int zoom = MapTileIndex.getZoom(j);
        return zoom >= getMinimumZoomLevel() && zoom <= getMaximumZoomLevel();
    }

    public MapTileModuleProviderBase(int i, final int i2) {
        if (i2 < i) {
            Log.w(IMapView.LOGTAG, "The pending queue size is smaller than the thread pool size. Automatically reducing the thread pool size.");
            i = i2;
        }
        this.mExecutor = Executors.newFixedThreadPool(i, new ConfigurablePriorityThreadFactory(5, getThreadGroupName()));
        this.mWorking = new HashMap<>();
        this.mPending = new LinkedHashMap<Long, MapTileRequestState>(i2 + 2, 0.1f, true) { // from class: org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.1
            private static final long serialVersionUID = 6455337315681858866L;

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Long, MapTileRequestState> entry) {
                MapTileRequestState mapTileRequestState;
                if (size() <= i2) {
                    return false;
                }
                Iterator<Long> it = MapTileModuleProviderBase.this.mPending.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue = it.next().longValue();
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(Long.valueOf(longValue)) && (mapTileRequestState = MapTileModuleProviderBase.this.mPending.get(Long.valueOf(longValue))) != null) {
                        MapTileModuleProviderBase.this.removeTileFromQueues(longValue);
                        mapTileRequestState.getCallback().mapTileRequestFailedExceedsMaxQueueSize(mapTileRequestState);
                        break;
                    }
                }
                return false;
            }
        };
    }

    public void loadMapTileAsync(MapTileRequestState mapTileRequestState) {
        if (this.mExecutor.isShutdown()) {
            return;
        }
        synchronized (this.mQueueLockObject) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() on provider: " + getName() + " for tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
                if (this.mPending.containsKey(Long.valueOf(mapTileRequestState.getMapTile()))) {
                    Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() tile already exists in request queue for modular provider. Moving to front of queue.");
                } else {
                    Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() adding tile to request queue for modular provider.");
                }
            }
            this.mPending.put(Long.valueOf(mapTileRequestState.getMapTile()), mapTileRequestState);
        }
        try {
            this.mExecutor.execute(getTileLoader());
        } catch (RejectedExecutionException e) {
            Log.w(IMapView.LOGTAG, "RejectedExecutionException", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueue() {
        synchronized (this.mQueueLockObject) {
            this.mPending.clear();
            this.mWorking.clear();
        }
    }

    public void detach() {
        clearQueue();
        this.mExecutor.shutdown();
    }

    protected void removeTileFromQueues(long j) {
        synchronized (this.mQueueLockObject) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.removeTileFromQueues() on provider: " + getName() + " for tile: " + MapTileIndex.toString(j));
            }
            this.mPending.remove(Long.valueOf(j));
            this.mWorking.remove(Long.valueOf(j));
        }
    }

    public abstract class TileLoader implements Runnable {
        public abstract Drawable loadTile(long j) throws CantContinueException;

        protected void onTileLoaderInit() {
        }

        protected void onTileLoaderShutdown() {
        }

        public TileLoader() {
        }

        public Drawable loadTileIfReachable(long j) throws CantContinueException {
            if (MapTileModuleProviderBase.this.isTileReachable(j)) {
                return loadTile(j);
            }
            return null;
        }

        @Deprecated
        protected Drawable loadTile(MapTileRequestState mapTileRequestState) throws CantContinueException {
            return loadTileIfReachable(mapTileRequestState.getMapTile());
        }

        protected MapTileRequestState nextTile() {
            MapTileRequestState mapTileRequestState;
            synchronized (MapTileModuleProviderBase.this.mQueueLockObject) {
                Long l = null;
                for (Long l2 : MapTileModuleProviderBase.this.mPending.keySet()) {
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(l2)) {
                        if (Configuration.getInstance().isDebugTileProviders()) {
                            Log.d(IMapView.LOGTAG, "TileLoader.nextTile() on provider: " + MapTileModuleProviderBase.this.getName() + " found tile in working queue: " + MapTileIndex.toString(l2.longValue()));
                        }
                        l = l2;
                    }
                }
                if (l != null) {
                    if (Configuration.getInstance().isDebugTileProviders()) {
                        Log.d(IMapView.LOGTAG, "TileLoader.nextTile() on provider: " + MapTileModuleProviderBase.this.getName() + " adding tile to working queue: " + l);
                    }
                    MapTileModuleProviderBase.this.mWorking.put(l, MapTileModuleProviderBase.this.mPending.get(l));
                }
                mapTileRequestState = l != null ? MapTileModuleProviderBase.this.mPending.get(l) : null;
            }
            return mapTileRequestState;
        }

        protected void tileLoaded(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoaded() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -1);
            mapTileRequestState.getCallback().mapTileRequestCompleted(mapTileRequestState, drawable);
        }

        protected void tileLoadedExpired(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedExpired() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -2);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }

        protected void tileLoadedScaled(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedScaled() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -3);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }

        protected void tileLoadedFailed(MapTileRequestState mapTileRequestState) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedFailed() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            mapTileRequestState.getCallback().mapTileRequestFailed(mapTileRequestState);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00a0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            Drawable drawable;
            onTileLoaderInit();
            while (true) {
                MapTileRequestState nextTile = nextTile();
                if (nextTile != null) {
                    if (Configuration.getInstance().isDebugTileProviders()) {
                        Log.d(IMapView.LOGTAG, "TileLoader.run() processing next tile: " + MapTileIndex.toString(nextTile.getMapTile()) + ", pending:" + MapTileModuleProviderBase.this.mPending.size() + ", working:" + MapTileModuleProviderBase.this.mWorking.size());
                    }
                    try {
                        drawable = loadTileIfReachable(nextTile.getMapTile());
                    } catch (CantContinueException e) {
                        Log.i(IMapView.LOGTAG, "Tile loader can't continue: " + MapTileIndex.toString(nextTile.getMapTile()), e);
                        MapTileModuleProviderBase.this.clearQueue();
                        drawable = null;
                        if (drawable == null) {
                        }
                    } catch (Throwable th) {
                        Log.i(IMapView.LOGTAG, "Error downloading tile: " + MapTileIndex.toString(nextTile.getMapTile()), th);
                        drawable = null;
                        if (drawable == null) {
                        }
                    }
                    if (drawable == null) {
                        tileLoadedFailed(nextTile);
                    } else if (ExpirableBitmapDrawable.getState(drawable) == -2) {
                        tileLoadedExpired(nextTile, drawable);
                    } else if (ExpirableBitmapDrawable.getState(drawable) == -3) {
                        tileLoadedScaled(nextTile, drawable);
                    } else {
                        tileLoaded(nextTile, drawable);
                    }
                } else {
                    onTileLoaderShutdown();
                    return;
                }
            }
        }
    }
}
