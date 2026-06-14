package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes5.dex */
public class MapTileFileArchiveProvider extends MapTileFileStorageProviderBase {
    private final boolean ignoreTileSource;
    private final ArrayList<IArchiveFile> mArchiveFiles;
    private final boolean mSpecificArchivesProvided;
    private final AtomicReference<ITileSource> mTileSource;

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, IArchiveFile[] iArchiveFileArr) {
        this(iRegisterReceiver, iTileSource, iArchiveFileArr, false);
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, IArchiveFile[] iArchiveFileArr, boolean z) {
        super(iRegisterReceiver, Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
        this.mArchiveFiles = new ArrayList<>();
        this.mTileSource = new AtomicReference<>();
        this.ignoreTileSource = z;
        setTileSource(iTileSource);
        if (iArchiveFileArr == null) {
            this.mSpecificArchivesProvided = false;
            findArchiveFiles();
            return;
        }
        this.mSpecificArchivesProvided = true;
        for (int length = iArchiveFileArr.length - 1; length >= 0; length--) {
            this.mArchiveFiles.add(iArchiveFileArr[length]);
        }
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource) {
        this(iRegisterReceiver, iTileSource, null);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "File Archive Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "filearchive";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        ITileSource iTileSource = this.mTileSource.get();
        if (iTileSource != null) {
            return iTileSource.getMinimumZoomLevel();
        }
        return 0;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        ITileSource iTileSource = this.mTileSource.get();
        if (iTileSource != null) {
            return iTileSource.getMaximumZoomLevel();
        }
        return TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaMounted() {
        if (this.mSpecificArchivesProvided) {
            return;
        }
        findArchiveFiles();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaUnmounted() {
        if (this.mSpecificArchivesProvided) {
            return;
        }
        findArchiveFiles();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(ITileSource iTileSource) {
        this.mTileSource.set(iTileSource);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase, org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        clearArcives();
        super.detach();
    }

    private void clearArcives() {
        while (!this.mArchiveFiles.isEmpty()) {
            IArchiveFile iArchiveFile = this.mArchiveFiles.get(0);
            if (iArchiveFile != null) {
                iArchiveFile.close();
            }
            this.mArchiveFiles.remove(0);
        }
    }

    private void findArchiveFiles() {
        File[] listFiles;
        clearArcives();
        File osmdroidBasePath = Configuration.getInstance().getOsmdroidBasePath();
        if (osmdroidBasePath == null || (listFiles = osmdroidBasePath.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            IArchiveFile archiveFile = ArchiveFileFactory.getArchiveFile(file);
            if (archiveFile != null) {
                archiveFile.setIgnoreTileSource(this.ignoreTileSource);
                this.mArchiveFiles.add(archiveFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream getInputStream(long j, ITileSource iTileSource) {
        InputStream inputStream;
        Iterator<IArchiveFile> it = this.mArchiveFiles.iterator();
        while (it.hasNext()) {
            IArchiveFile next = it.next();
            if (next != null && (inputStream = next.getInputStream(iTileSource, j)) != null) {
                if (Configuration.getInstance().isDebugMode()) {
                    Log.d(IMapView.LOGTAG, "Found tile " + MapTileIndex.toString(j) + " in " + next);
                }
                return inputStream;
            }
        }
        return null;
    }

    protected class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) {
            InputStream inputStream;
            ITileSource iTileSource = (ITileSource) MapTileFileArchiveProvider.this.mTileSource.get();
            Drawable drawable = null;
            if (iTileSource == null) {
                return null;
            }
            try {
                if (Configuration.getInstance().isDebugMode()) {
                    Log.d(IMapView.LOGTAG, "Archives - Tile doesn't exist: " + MapTileIndex.toString(j));
                }
                InputStream inputStream2 = MapTileFileArchiveProvider.this.getInputStream(j, iTileSource);
                if (inputStream2 != null) {
                    try {
                        if (Configuration.getInstance().isDebugMode()) {
                            Log.d(IMapView.LOGTAG, "Use tile from archive: " + MapTileIndex.toString(j));
                        }
                        drawable = iTileSource.getDrawable(inputStream2);
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
                        try {
                            Log.e(IMapView.LOGTAG, "Error loading tile", th);
                            return drawable;
                        } finally {
                            if (inputStream != null) {
                                StreamUtils.closeStream(inputStream);
                            }
                        }
                    }
                }
                if (inputStream2 != null) {
                    StreamUtils.closeStream(inputStream2);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            return drawable;
        }
    }
}
