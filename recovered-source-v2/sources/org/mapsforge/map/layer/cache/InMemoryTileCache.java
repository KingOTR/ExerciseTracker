package org.mapsforge.map.layer.cache;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.map.layer.queue.Job;
import org.mapsforge.map.model.common.Observable;
import org.mapsforge.map.model.common.Observer;

/* loaded from: classes5.dex */
public class InMemoryTileCache implements TileCache {
    private static final Logger LOGGER = Logger.getLogger(InMemoryTileCache.class.getName());
    private BitmapLRUCache lruCache;
    private Observable observable = new Observable();

    public InMemoryTileCache(int i) {
        this.lruCache = new BitmapLRUCache(i);
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized boolean containsKey(Job job) {
        return this.lruCache.containsKey(job);
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void destroy() {
        purge();
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized TileBitmap get(Job job) {
        TileBitmap tileBitmap;
        tileBitmap = (TileBitmap) this.lruCache.get(job);
        if (tileBitmap != null) {
            tileBitmap.incrementRefCount();
        }
        return tileBitmap;
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized int getCapacity() {
        return this.lruCache.capacity;
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public int getCapacityFirstLevel() {
        return getCapacity();
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public TileBitmap getImmediately(Job job) {
        return get(job);
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public void purge() {
        Iterator it = this.lruCache.values().iterator();
        while (it.hasNext()) {
            ((TileBitmap) it.next()).decrementRefCount();
        }
        this.lruCache.clear();
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void put(Job job, TileBitmap tileBitmap) {
        if (job == null) {
            throw new IllegalArgumentException("key must not be null");
        }
        if (tileBitmap == null) {
            throw new IllegalArgumentException("bitmap must not be null");
        }
        TileBitmap tileBitmap2 = (TileBitmap) this.lruCache.get(job);
        if (tileBitmap2 != null) {
            tileBitmap2.decrementRefCount();
        }
        if (this.lruCache.put(job, tileBitmap) != null) {
            LOGGER.warning("overwriting cached entry: " + job);
        }
        tileBitmap.incrementRefCount();
        this.observable.notifyObservers();
    }

    public synchronized void setCapacity(int i) {
        BitmapLRUCache bitmapLRUCache = new BitmapLRUCache(i);
        bitmapLRUCache.putAll(this.lruCache);
        this.lruCache = bitmapLRUCache;
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void setWorkingSet(Set<Job> set) {
        this.lruCache.setWorkingSet(set);
    }

    @Override // org.mapsforge.map.model.common.ObservableInterface
    public void addObserver(Observer observer) {
        this.observable.addObserver(observer);
    }

    @Override // org.mapsforge.map.model.common.ObservableInterface
    public void removeObserver(Observer observer) {
        this.observable.removeObserver(observer);
    }
}
