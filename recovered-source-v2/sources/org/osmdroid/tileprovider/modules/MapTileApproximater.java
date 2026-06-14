package org.osmdroid.tileprovider.modules;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.ReusableBitmapDrawable;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes5.dex */
public class MapTileApproximater extends MapTileModuleProviderBase {
    private final List<MapTileModuleProviderBase> mProviders;
    private int minZoomLevel;

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    @Deprecated
    public void setTileSource(ITileSource iTileSource) {
    }

    public MapTileApproximater() {
        this(Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
    }

    public MapTileApproximater(int i, int i2) {
        super(i, i2);
        this.mProviders = new CopyOnWriteArrayList();
    }

    public void addProvider(MapTileModuleProviderBase mapTileModuleProviderBase) {
        this.mProviders.add(mapTileModuleProviderBase);
        computeZoomLevels();
    }

    private void computeZoomLevels() {
        this.minZoomLevel = 0;
        Iterator<MapTileModuleProviderBase> it = this.mProviders.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int minimumZoomLevel = it.next().getMinimumZoomLevel();
            if (z) {
                this.minZoomLevel = minimumZoomLevel;
                z = false;
            } else {
                this.minZoomLevel = Math.min(this.minZoomLevel, minimumZoomLevel);
            }
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "Offline Tile Approximation Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "approximater";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        return this.minZoomLevel;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        return TileSystem.getMaximumZoomLevel();
    }

    protected class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) {
            Bitmap approximateTileFromLowerZoom = MapTileApproximater.this.approximateTileFromLowerZoom(j);
            if (approximateTileFromLowerZoom == null) {
                return null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(approximateTileFromLowerZoom);
            ExpirableBitmapDrawable.setState(bitmapDrawable, -3);
            return bitmapDrawable;
        }
    }

    public Bitmap approximateTileFromLowerZoom(long j) {
        for (int i = 1; MapTileIndex.getZoom(j) - i >= 0; i++) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(j, i);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    public Bitmap approximateTileFromLowerZoom(long j, int i) {
        Iterator<MapTileModuleProviderBase> it = this.mProviders.iterator();
        while (it.hasNext()) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(it.next(), j, i);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    public static Bitmap approximateTileFromLowerZoom(MapTileModuleProviderBase mapTileModuleProviderBase, long j, int i) {
        int zoom;
        if (i <= 0 || (zoom = MapTileIndex.getZoom(j) - i) < mapTileModuleProviderBase.getMinimumZoomLevel() || zoom > mapTileModuleProviderBase.getMaximumZoomLevel()) {
            return null;
        }
        try {
            Drawable loadTileIfReachable = mapTileModuleProviderBase.getTileLoader().loadTileIfReachable(MapTileIndex.getTileIndex(zoom, MapTileIndex.getX(j) >> i, MapTileIndex.getY(j) >> i));
            if (loadTileIfReachable instanceof BitmapDrawable) {
                return approximateTileFromLowerZoom((BitmapDrawable) loadTileIfReachable, j, i);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap approximateTileFromLowerZoom(BitmapDrawable bitmapDrawable, long j, int i) {
        if (i <= 0) {
            return null;
        }
        int width = bitmapDrawable.getBitmap().getWidth();
        Bitmap tileBitmap = getTileBitmap(width);
        Canvas canvas = new Canvas(tileBitmap);
        boolean z = bitmapDrawable instanceof ReusableBitmapDrawable;
        ReusableBitmapDrawable reusableBitmapDrawable = z ? (ReusableBitmapDrawable) bitmapDrawable : null;
        if (z) {
            reusableBitmapDrawable.beginUsingDrawable();
        }
        boolean z2 = false;
        if (z) {
            try {
                if (reusableBitmapDrawable.isBitmapValid()) {
                }
                if (z2) {
                    return null;
                }
                return tileBitmap;
            } finally {
                if (z) {
                    reusableBitmapDrawable.finishUsingDrawable();
                }
            }
        }
        int i2 = width >> i;
        if (i2 != 0) {
            int i3 = 1 << i;
            int x = (MapTileIndex.getX(j) % i3) * i2;
            int y = (MapTileIndex.getY(j) % i3) * i2;
            canvas.drawBitmap(bitmapDrawable.getBitmap(), new Rect(x, y, x + i2, i2 + y), new Rect(0, 0, width, width), (Paint) null);
            z2 = true;
        }
        if (z2) {
        }
    }

    public static Bitmap getTileBitmap(int i) {
        Bitmap obtainSizedBitmapFromPool = BitmapPool.getInstance().obtainSizedBitmapFromPool(i, i);
        if (obtainSizedBitmapFromPool != null) {
            obtainSizedBitmapFromPool.setHasAlpha(true);
            obtainSizedBitmapFromPool.eraseColor(0);
            return obtainSizedBitmapFromPool;
        }
        return Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        super.detach();
        this.mProviders.clear();
    }
}
