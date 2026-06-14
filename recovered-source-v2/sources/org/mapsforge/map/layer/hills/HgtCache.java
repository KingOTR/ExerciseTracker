package org.mapsforge.map.layer.hills;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.HillshadingBitmap;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.map.layer.hills.ShadingAlgorithm;

/* loaded from: classes5.dex */
class HgtCache {
    private static final Logger LOGGER = Logger.getLogger(HgtCache.class.getName());
    final ShadingAlgorithm algorithm;
    final DemFolder demFolder;
    private final GraphicFactory graphicsFactory;
    private LazyFuture<Map<TileKey, HgtFileInfo>> hgtFiles;
    final boolean interpolatorOverlap;
    final int mainCacheSize;
    private final Lru mainLru;
    final int neighborCacheSize;
    private List<String> problems = new ArrayList();
    private final Lru secondaryLru;

    protected static final class TileKey {
        final int east;
        final int north;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TileKey tileKey = (TileKey) obj;
            return this.north == tileKey.north && this.east == tileKey.east;
        }

        public int hashCode() {
            return (this.north * 31) + this.east;
        }

        TileKey(int i, int i2) {
            this.east = i2;
            this.north = i;
        }
    }

    private static class Lru {
        private final LinkedHashSet<Future<HillshadingBitmap>> lru;
        private int size;

        public int getSize() {
            return this.size;
        }

        public void setSize(int i) {
            this.size = Math.max(0, i);
            if (i < this.lru.size()) {
                synchronized (this.lru) {
                    Iterator<Future<HillshadingBitmap>> it = this.lru.iterator();
                    while (this.lru.size() > i) {
                        it.remove();
                    }
                }
            }
        }

        Lru(int i) {
            this.size = i;
            this.lru = i > 0 ? new LinkedHashSet<>() : null;
        }

        Future<HillshadingBitmap> markUsed(Future<HillshadingBitmap> future) {
            if (this.size <= 0 || future == null) {
                return future;
            }
            synchronized (this.lru) {
                this.lru.remove(future);
                this.lru.add(future);
                if (this.lru.size() <= this.size) {
                    return null;
                }
                Iterator<Future<HillshadingBitmap>> it = this.lru.iterator();
                Future<HillshadingBitmap> next = it.next();
                it.remove();
                return next;
            }
        }

        void evict(Future<HillshadingBitmap> future) {
            if (this.size > 0) {
                synchronized (this.lru) {
                    this.lru.add(future);
                }
            }
        }
    }

    HgtCache(DemFolder demFolder, boolean z, GraphicFactory graphicFactory, ShadingAlgorithm shadingAlgorithm, int i, int i2) {
        this.demFolder = demFolder;
        this.interpolatorOverlap = z;
        this.graphicsFactory = graphicFactory;
        this.algorithm = shadingAlgorithm;
        this.mainCacheSize = i;
        this.neighborCacheSize = i2;
        this.mainLru = new Lru(i);
        this.secondaryLru = z ? new Lru(i2) : null;
        this.hgtFiles = new LazyFuture<Map<TileKey, HgtFileInfo>>() { // from class: org.mapsforge.map.layer.hills.HgtCache.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // org.mapsforge.map.layer.hills.LatchedLazyFuture
            public Map<TileKey, HgtFileInfo> calculate() {
                HashMap hashMap = new HashMap();
                crawl(HgtCache.this.demFolder, Pattern.compile("([ns])(\\d{1,2})([ew])(\\d{1,3})\\.(?:(hgt)|(zip))", 2).matcher(""), hashMap, HgtCache.this.problems);
                return hashMap;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            void crawl(DemFile demFile, Matcher matcher, Map<TileKey, HgtFileInfo> map, List<String> list) {
                ZipInputStream zipInputStream;
                long j;
                long j2;
                String str;
                ZipEntry nextEntry;
                long j3;
                String name = demFile.getName();
                if (matcher.reset(name).matches()) {
                    int parseInt = Integer.parseInt(matcher.group(2));
                    int parseInt2 = Integer.parseInt(matcher.group(4));
                    if (!"n".equals(matcher.group(1).toLowerCase())) {
                        parseInt = -parseInt;
                    }
                    if (!"e".equals(matcher.group(3).toLowerCase())) {
                        parseInt2 = -parseInt2;
                    }
                    if (matcher.group(6) == null) {
                        j2 = demFile.getSize();
                    } else {
                        ZipInputStream zipInputStream2 = null;
                        try {
                            zipInputStream = new ZipInputStream(demFile.openInputStream());
                        } catch (IOException unused) {
                        }
                        try {
                            str = name.toLowerCase().substring(0, name.length() - 4) + ".hgt";
                        } catch (IOException unused2) {
                            zipInputStream2 = zipInputStream;
                            list.add("could not read zip file " + demFile.getName());
                            zipInputStream = zipInputStream2;
                            j = 0;
                            if (zipInputStream != null) {
                            }
                            j2 = j;
                            j3 = j2 / 2;
                            long sqrt = (long) Math.sqrt(j3);
                            if (j3 != 0) {
                            }
                            if (list == null) {
                            }
                        }
                        do {
                            nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                j = 0;
                                break;
                            }
                        } while (!str.equals(nextEntry.getName().toLowerCase()));
                        j = nextEntry.getSize();
                        if (zipInputStream != null) {
                            try {
                                zipInputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        j2 = j;
                    }
                    j3 = j2 / 2;
                    long sqrt2 = (long) Math.sqrt(j3);
                    if (j3 != 0 || sqrt2 * sqrt2 != j3) {
                        if (list == null) {
                            list.add(demFile + " length in shorts (" + j3 + ") is not a square number");
                        }
                    } else {
                        TileKey tileKey = new TileKey(parseInt, parseInt2);
                        HgtFileInfo hgtFileInfo = map.get(tileKey);
                        if (hgtFileInfo == null || hgtFileInfo.size < j2) {
                            map.put(tileKey, HgtCache.this.new HgtFileInfo(demFile, parseInt - 1, parseInt2, parseInt, parseInt2 + 1, j2));
                        }
                    }
                }
            }

            void crawl(DemFolder demFolder2, Matcher matcher, Map<TileKey, HgtFileInfo> map, List<String> list) {
                Iterator<DemFile> it = demFolder2.files().iterator();
                while (it.hasNext()) {
                    crawl(it.next(), matcher, map, list);
                }
                Iterator<DemFolder> it2 = demFolder2.subs().iterator();
                while (it2.hasNext()) {
                    crawl(it2.next(), matcher, map, list);
                }
            }
        };
    }

    void indexOnThread() {
        this.hgtFiles.withRunningThread();
    }

    class LoadUnmergedFuture extends LazyFuture<HillshadingBitmap> {
        private final HgtFileInfo hgtFileInfo;

        LoadUnmergedFuture(HgtFileInfo hgtFileInfo) {
            this.hgtFileInfo = hgtFileInfo;
        }

        @Override // org.mapsforge.map.layer.hills.LatchedLazyFuture
        public HillshadingBitmap calculate() {
            ShadingAlgorithm.RawShadingResult transformToByteBuffer = HgtCache.this.algorithm.transformToByteBuffer(this.hgtFileInfo, HgtCache.this.interpolatorOverlap ? 1 : 0);
            transformToByteBuffer.fillPadding();
            return HgtCache.this.graphicsFactory.createMonoBitmap(transformToByteBuffer.width, transformToByteBuffer.height, transformToByteBuffer.bytes, transformToByteBuffer.padding, this.hgtFileInfo);
        }
    }

    class MergeOverlapFuture extends LazyFuture<HillshadingBitmap> {
        private HgtFileInfo hgtFileInfo;
        final LoadUnmergedFuture loadFuture;

        MergeOverlapFuture(HgtFileInfo hgtFileInfo, LoadUnmergedFuture loadUnmergedFuture) {
            this.hgtFileInfo = hgtFileInfo;
            this.loadFuture = loadUnmergedFuture;
        }

        MergeOverlapFuture(HgtCache hgtCache, HgtFileInfo hgtFileInfo) {
            this(hgtFileInfo, hgtCache.new LoadUnmergedFuture(hgtFileInfo));
        }

        @Override // org.mapsforge.map.layer.hills.LatchedLazyFuture
        public HillshadingBitmap calculate() throws ExecutionException, InterruptedException {
            HillshadingBitmap hillshadingBitmap = this.loadFuture.get();
            for (HillshadingBitmap.Border border : HillshadingBitmap.Border.values()) {
                mergePaddingOnBitmap(hillshadingBitmap, this.hgtFileInfo.getNeighbor(border), border);
            }
            return hillshadingBitmap;
        }

        private void mergePaddingOnBitmap(HillshadingBitmap hillshadingBitmap, HgtFileInfo hgtFileInfo, HillshadingBitmap.Border border) {
            LoadUnmergedFuture unmergedAsMergePartner;
            int padding = hillshadingBitmap.getPadding();
            if (padding < 1 || hgtFileInfo == null || (unmergedAsMergePartner = hgtFileInfo.getUnmergedAsMergePartner()) == null) {
                return;
            }
            try {
                HgtCache.mergeSameSized(hillshadingBitmap, unmergedAsMergePartner.get(), border, padding, HgtCache.this.graphicsFactory.createCanvas());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    class HgtFileInfo extends BoundingBox implements ShadingAlgorithm.RawHillTileSource {
        final DemFile file;
        final long size;
        WeakReference<Future<HillshadingBitmap>> weakRef;

        HgtFileInfo(DemFile demFile, double d, double d2, double d3, double d4, long j) {
            super(d, d2, d3, d4);
            this.weakRef = null;
            this.file = demFile;
            this.size = j;
        }

        Future<HillshadingBitmap> getBitmapFuture(double d, double d2) {
            if (HgtCache.this.interpolatorOverlap) {
                double axisLenght = HgtCache.this.algorithm.getAxisLenght(this);
                if (d > axisLenght || d2 > axisLenght) {
                    return getForHires();
                }
                return getForLores();
            }
            return getForLores();
        }

        private MergeOverlapFuture getForHires() {
            MergeOverlapFuture mergeOverlapFuture;
            WeakReference<Future<HillshadingBitmap>> weakReference = this.weakRef;
            Future<HillshadingBitmap> future = weakReference == null ? null : weakReference.get();
            if (future instanceof MergeOverlapFuture) {
                mergeOverlapFuture = (MergeOverlapFuture) future;
            } else if (future instanceof LoadUnmergedFuture) {
                LoadUnmergedFuture loadUnmergedFuture = (LoadUnmergedFuture) future;
                MergeOverlapFuture mergeOverlapFuture2 = HgtCache.this.new MergeOverlapFuture(this, loadUnmergedFuture);
                this.weakRef = new WeakReference<>(mergeOverlapFuture2);
                HgtCache.this.secondaryLru.evict(loadUnmergedFuture);
                mergeOverlapFuture = mergeOverlapFuture2;
            } else {
                mergeOverlapFuture = new MergeOverlapFuture(HgtCache.this, this);
                this.weakRef = new WeakReference<>(mergeOverlapFuture);
            }
            HgtCache.this.mainLru.markUsed(mergeOverlapFuture);
            return mergeOverlapFuture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LoadUnmergedFuture getUnmergedAsMergePartner() {
            WeakReference<Future<HillshadingBitmap>> weakReference = this.weakRef;
            Future<HillshadingBitmap> future = weakReference == null ? null : weakReference.get();
            if (future instanceof LoadUnmergedFuture) {
                HgtCache.this.secondaryLru.markUsed(future);
                return (LoadUnmergedFuture) future;
            }
            if (future instanceof MergeOverlapFuture) {
                HgtCache.this.mainLru.markUsed(future);
                return ((MergeOverlapFuture) future).loadFuture;
            }
            LoadUnmergedFuture loadUnmergedFuture = HgtCache.this.new LoadUnmergedFuture(this);
            this.weakRef = new WeakReference<>(loadUnmergedFuture);
            HgtCache.this.secondaryLru.markUsed(loadUnmergedFuture);
            return loadUnmergedFuture;
        }

        private Future<HillshadingBitmap> getForLores() {
            WeakReference<Future<HillshadingBitmap>> weakReference = this.weakRef;
            Future<HillshadingBitmap> future = weakReference == null ? null : weakReference.get();
            if (future == null) {
                future = HgtCache.this.new LoadUnmergedFuture(this);
                this.weakRef = new WeakReference<>(future);
            }
            Future<HillshadingBitmap> markUsed = HgtCache.this.mainLru.markUsed(future);
            if (HgtCache.this.secondaryLru != null) {
                HgtCache.this.secondaryLru.markUsed(markUsed);
            }
            return future;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public HillshadingBitmap getFinishedConverted() {
            Future<HillshadingBitmap> future;
            WeakReference<Future<HillshadingBitmap>> weakReference = this.weakRef;
            if (weakReference == null || (future = weakReference.get()) == null || !future.isDone()) {
                return null;
            }
            try {
                return future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public long getSize() {
            return this.size;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public DemFile getFile() {
            return this.file;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public double northLat() {
            return this.maxLatitude;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public double southLat() {
            return this.minLatitude;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public double westLng() {
            return this.minLongitude;
        }

        @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm.RawHillTileSource
        public double eastLng() {
            return this.maxLongitude;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HgtFileInfo getNeighbor(HillshadingBitmap.Border border) throws ExecutionException, InterruptedException {
            Map map = (Map) HgtCache.this.hgtFiles.get();
            int i = AnonymousClass2.$SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border[border.ordinal()];
            if (i == 1) {
                return (HgtFileInfo) map.get(new TileKey(((int) this.maxLatitude) + 1, (int) this.minLongitude));
            }
            if (i == 2) {
                return (HgtFileInfo) map.get(new TileKey(((int) this.maxLatitude) - 1, (int) this.minLongitude));
            }
            if (i == 3) {
                return (HgtFileInfo) map.get(new TileKey((int) this.maxLatitude, ((int) this.minLongitude) + 1));
            }
            if (i != 4) {
                return null;
            }
            return (HgtFileInfo) map.get(new TileKey((int) this.maxLatitude, ((int) this.minLongitude) - 1));
        }

        @Override // org.mapsforge.core.model.BoundingBox
        public String toString() {
            WeakReference<Future<HillshadingBitmap>> weakReference = this.weakRef;
            Future<HillshadingBitmap> future = weakReference == null ? null : weakReference.get();
            return "[lt:" + this.minLatitude + "-" + this.maxLatitude + " ln:" + this.minLongitude + "-" + this.maxLongitude + (future == null ? "" : future.isDone() ? "done" : "wip") + "]";
        }
    }

    /* renamed from: org.mapsforge.map.layer.hills.HgtCache$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border;

        static {
            int[] iArr = new int[HillshadingBitmap.Border.values().length];
            $SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border = iArr;
            try {
                iArr[HillshadingBitmap.Border.NORTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border[HillshadingBitmap.Border.SOUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border[HillshadingBitmap.Border.EAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$HillshadingBitmap$Border[HillshadingBitmap.Border.WEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    HillshadingBitmap getHillshadingBitmap(int i, int i2, double d, double d2) throws InterruptedException, ExecutionException {
        HgtFileInfo hgtFileInfo = this.hgtFiles.get().get(new TileKey(i, i2));
        if (hgtFileInfo == null) {
            return null;
        }
        return hgtFileInfo.getBitmapFuture(d, d2).get();
    }

    static void mergeSameSized(HillshadingBitmap hillshadingBitmap, HillshadingBitmap hillshadingBitmap2, HillshadingBitmap.Border border, int i, Canvas canvas) {
        if (border == HillshadingBitmap.Border.EAST) {
            canvas.setBitmap(hillshadingBitmap);
            int i2 = i * 2;
            canvas.setClip(hillshadingBitmap.getWidth() - i, i, i, hillshadingBitmap.getHeight() - i2, true);
            canvas.drawBitmap(hillshadingBitmap2, hillshadingBitmap2.getWidth() - i2, 0);
            return;
        }
        if (border == HillshadingBitmap.Border.WEST) {
            canvas.setBitmap(hillshadingBitmap);
            int i3 = i * 2;
            canvas.setClip(0, i, i, hillshadingBitmap.getHeight() - i3, true);
            canvas.drawBitmap(hillshadingBitmap2, i3 - hillshadingBitmap2.getWidth(), 0);
            return;
        }
        if (border == HillshadingBitmap.Border.NORTH) {
            canvas.setBitmap(hillshadingBitmap);
            int i4 = i * 2;
            canvas.setClip(i, 0, hillshadingBitmap.getWidth() - i4, i, true);
            canvas.drawBitmap(hillshadingBitmap2, 0, i4 - hillshadingBitmap2.getHeight());
            return;
        }
        if (border == HillshadingBitmap.Border.SOUTH) {
            canvas.setBitmap(hillshadingBitmap);
            int i5 = i * 2;
            canvas.setClip(i, hillshadingBitmap.getHeight() - i, hillshadingBitmap.getWidth() - i5, i, true);
            canvas.drawBitmap(hillshadingBitmap2, 0, hillshadingBitmap2.getHeight() - i5);
        }
    }
}
