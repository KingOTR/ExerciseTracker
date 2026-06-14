package org.mapsforge.map.layer.renderer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.queue.JobQueue;

/* loaded from: classes5.dex */
public class MapWorkerPool implements Runnable {
    private final DatabaseRenderer databaseRenderer;
    private final JobQueue<RendererJob> jobQueue;
    private final Layer layer;
    private ExecutorService self;
    private final TileCache tileCache;
    private ExecutorService workers;
    private static final Logger LOGGER = Logger.getLogger(MapWorkerPool.class.getName());
    public static boolean DEBUG_TIMING = false;
    private final AtomicInteger concurrentJobs = new AtomicInteger();
    private final AtomicLong totalExecutions = new AtomicLong();
    private final AtomicLong totalTime = new AtomicLong();
    private boolean inShutdown = false;
    private boolean isRunning = false;

    public MapWorkerPool(TileCache tileCache, JobQueue<RendererJob> jobQueue, DatabaseRenderer databaseRenderer, Layer layer) {
        this.tileCache = tileCache;
        this.jobQueue = jobQueue;
        this.databaseRenderer = databaseRenderer;
        this.layer = layer;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.inShutdown) {
            try {
                RendererJob rendererJob = this.jobQueue.get(Parameters.NUMBER_OF_THREADS);
                if (rendererJob != null) {
                    if (this.tileCache.containsKey(rendererJob) && !rendererJob.labelsOnly) {
                        this.jobQueue.remove(rendererJob);
                    }
                    this.workers.execute(new MapWorker(rendererJob));
                }
            } catch (InterruptedException e) {
                LOGGER.log(Level.SEVERE, "MapWorkerPool interrupted", (Throwable) e);
                return;
            } catch (RejectedExecutionException e2) {
                LOGGER.log(Level.SEVERE, "MapWorkerPool rejected", (Throwable) e2);
                return;
            }
        }
    }

    public synchronized void start() {
        if (this.isRunning) {
            return;
        }
        this.inShutdown = false;
        this.self = Executors.newSingleThreadExecutor();
        this.workers = Executors.newFixedThreadPool(Parameters.NUMBER_OF_THREADS);
        this.self.execute(this);
        this.isRunning = true;
    }

    public synchronized void stop() {
        if (this.isRunning) {
            this.inShutdown = true;
            this.jobQueue.interrupt();
            this.self.shutdown();
            this.workers.shutdown();
            try {
                if (!this.self.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    this.self.shutdownNow();
                    if (!this.self.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                        LOGGER.fine("Shutdown self executor failed");
                    }
                }
            } catch (InterruptedException e) {
                LOGGER.log(Level.SEVERE, "Shutdown self executor interrupted", (Throwable) e);
            }
            try {
                if (!this.workers.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    this.workers.shutdownNow();
                    if (!this.workers.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                        LOGGER.fine("Shutdown workers executor failed");
                    }
                }
            } catch (InterruptedException e2) {
                LOGGER.log(Level.SEVERE, "Shutdown workers executor interrupted", (Throwable) e2);
            }
            this.isRunning = false;
        }
    }

    class MapWorker implements Runnable {
        private final RendererJob rendererJob;

        MapWorker(RendererJob rendererJob) {
            this.rendererJob = rendererJob;
            rendererJob.renderThemeFuture.incrementRefCount();
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            TileBitmap tileBitmap = null;
            try {
                if (MapWorkerPool.this.inShutdown) {
                    this.rendererJob.renderThemeFuture.decrementRefCount();
                    MapWorkerPool.this.jobQueue.remove(this.rendererJob);
                    return;
                }
                if (MapWorkerPool.DEBUG_TIMING) {
                    j = System.currentTimeMillis();
                    MapWorkerPool.LOGGER.info("ConcurrentJobs " + MapWorkerPool.this.concurrentJobs.incrementAndGet());
                } else {
                    j = 0;
                }
                tileBitmap = MapWorkerPool.this.databaseRenderer.executeJob(this.rendererJob);
                if (MapWorkerPool.this.inShutdown) {
                    if (tileBitmap != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!this.rendererJob.labelsOnly && tileBitmap != null) {
                    MapWorkerPool.this.tileCache.put(this.rendererJob, tileBitmap);
                    MapWorkerPool.this.databaseRenderer.removeTileInProgress(this.rendererJob.tile);
                }
                MapWorkerPool.this.layer.requestRedraw();
                if (MapWorkerPool.DEBUG_TIMING) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long incrementAndGet = MapWorkerPool.this.totalExecutions.incrementAndGet();
                    long addAndGet = MapWorkerPool.this.totalTime.addAndGet(currentTimeMillis - j);
                    if (incrementAndGet % 10 == 0) {
                        MapWorkerPool.LOGGER.info("TIMING " + Long.toString(incrementAndGet) + " " + Double.toString(addAndGet / incrementAndGet));
                    }
                    MapWorkerPool.this.concurrentJobs.decrementAndGet();
                }
                this.rendererJob.renderThemeFuture.decrementRefCount();
                MapWorkerPool.this.jobQueue.remove(this.rendererJob);
                if (tileBitmap != null) {
                    tileBitmap.decrementRefCount();
                }
            } finally {
                this.rendererJob.renderThemeFuture.decrementRefCount();
                MapWorkerPool.this.jobQueue.remove(this.rendererJob);
                if (tileBitmap != null) {
                    tileBitmap.decrementRefCount();
                }
            }
        }
    }
}
