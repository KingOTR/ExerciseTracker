package org.mapsforge.map.layer.cache;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.CorruptedInputStreamException;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.util.IOUtils;
import org.mapsforge.map.layer.queue.Job;
import org.mapsforge.map.model.common.Observer;

/* loaded from: classes5.dex */
public class TileStore implements TileCache {
    private static final Logger LOGGER = Logger.getLogger(TileStore.class.getName());
    private final GraphicFactory graphicFactory;
    private final File rootDirectory;
    private final String suffix;

    @Override // org.mapsforge.map.model.common.ObservableInterface
    public void addObserver(Observer observer) {
    }

    @Override // org.mapsforge.map.model.common.ObservableInterface
    public void removeObserver(Observer observer) {
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public void setWorkingSet(Set<Job> set) {
    }

    public TileStore(File file, String str, GraphicFactory graphicFactory) {
        this.rootDirectory = file;
        this.graphicFactory = graphicFactory;
        this.suffix = str;
        if (file == null || !file.isDirectory() || !file.canRead()) {
            throw new IllegalArgumentException("Root directory must be readable");
        }
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized boolean containsKey(Job job) {
        return findFile(job) != null;
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void destroy() {
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized TileBitmap get(Job job) {
        FileInputStream fileInputStream;
        File findFile = findFile(job);
        FileInputStream fileInputStream2 = null;
        if (findFile == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(findFile);
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (CorruptedInputStreamException unused2) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            TileBitmap createTileBitmap = this.graphicFactory.createTileBitmap(fileInputStream, job.tile.tileSize, job.hasAlpha);
            if (createTileBitmap.getWidth() != job.tile.tileSize || createTileBitmap.getHeight() != job.tile.tileSize) {
                createTileBitmap.scaleTo(job.tile.tileSize, job.tile.tileSize);
            }
            IOUtils.closeQuietly(fileInputStream);
            return createTileBitmap;
        } catch (IOException unused3) {
            IOUtils.closeQuietly(fileInputStream);
            return null;
        } catch (CorruptedInputStreamException unused4) {
            IOUtils.closeQuietly(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            IOUtils.closeQuietly(fileInputStream2);
            throw th;
        }
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized int getCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized int getCapacityFirstLevel() {
        return getCapacity();
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public TileBitmap getImmediately(Job job) {
        return get(job);
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void purge() {
    }

    @Override // org.mapsforge.map.layer.cache.TileCache
    public synchronized void put(Job job, TileBitmap tileBitmap) {
    }

    protected File findFile(Job job) {
        File file = new File(this.rootDirectory, Byte.toString(job.tile.zoomLevel));
        if (!file.isDirectory() || !file.canRead()) {
            LOGGER.warning("Failed to find directory " + file.getAbsolutePath());
            return null;
        }
        File file2 = new File(file, Long.toString(job.tile.tileX));
        if (!file2.isDirectory() || !file2.canRead()) {
            LOGGER.warning("Failed to find directory " + file2.getAbsolutePath());
            return null;
        }
        File file3 = new File(file2, Long.toString(job.tile.tileY) + this.suffix);
        if (file3.isFile() && file3.canRead()) {
            return file3;
        }
        LOGGER.warning("Failed to find file " + file3.getAbsolutePath());
        return null;
    }
}
