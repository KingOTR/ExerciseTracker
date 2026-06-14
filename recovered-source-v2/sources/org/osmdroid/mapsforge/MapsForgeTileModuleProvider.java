package org.osmdroid.mapsforge;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes5.dex */
public class MapsForgeTileModuleProvider extends MapTileFileStorageProviderBase {
    protected MapsForgeTileSource tileSource;
    protected IFilesystemCache tilewriter;

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    public MapsForgeTileModuleProvider(IRegisterReceiver iRegisterReceiver, MapsForgeTileSource mapsForgeTileSource, IFilesystemCache iFilesystemCache) {
        super(iRegisterReceiver, Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
        this.tileSource = mapsForgeTileSource;
        this.tilewriter = iFilesystemCache;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "MapsforgeTiles Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "mapsforgetilesprovider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        return this.tileSource.getMinimumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        return this.tileSource.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(ITileSource iTileSource) {
        if (iTileSource instanceof MapsForgeTileSource) {
            this.tileSource = (MapsForgeTileSource) iTileSource;
        }
    }

    private class TileLoader extends MapTileModuleProviderBase.TileLoader {
        private TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) {
            String str;
            ByteArrayInputStream byteArrayInputStream;
            ByteArrayInputStream byteArrayInputStream2 = null;
            if (Configuration.getInstance().isDebugTileProviders()) {
                str = "MapsForgeTileModuleProvider.TileLoader.loadTile(" + MapTileIndex.toString(j) + "): ";
                Log.d(IMapView.LOGTAG, str + "tileSource.renderTile");
            } else {
                str = null;
            }
            Drawable renderTile = MapsForgeTileModuleProvider.this.tileSource.renderTile(j);
            if (renderTile != null && (renderTile instanceof BitmapDrawable)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((BitmapDrawable) renderTile).getBitmap().compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                if (Configuration.getInstance().isDebugTileProviders()) {
                    Log.d(IMapView.LOGTAG, str + "save tile " + byteArray.length + " bytes to " + MapsForgeTileModuleProvider.this.tileSource.getTileRelativeFilenameString(j));
                }
                try {
                    try {
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(byteArray);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException unused2) {
                }
                try {
                    MapsForgeTileModuleProvider.this.tilewriter.saveFile(MapsForgeTileModuleProvider.this.tileSource, j, byteArrayInputStream, null);
                    byteArrayInputStream.close();
                } catch (Exception e2) {
                    e = e2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    Log.w(IMapView.LOGTAG, "forge error storing tile cache", e);
                    if (byteArrayInputStream2 != null) {
                        byteArrayInputStream2.close();
                    }
                    return renderTile;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    if (byteArrayInputStream2 != null) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
            return renderTile;
        }
    }
}
